# -*- coding: utf-8 -*-
"""解包 J2ME《斩妖伏魔录》伪装成 .mid 的 PNG 精灵资源。"""
import struct, zipfile, os, sys, io

def unpack_mid(data):
    """role_N.mid / scene_X_Y.mid: skip(4), key=readInt(), loop{len=readInt(); payload^key}"""
    out = []
    if len(data) < 12: return out
    key = struct.unpack('>i', data[4:8])[0] & 0xff
    off = 8
    while off + 4 <= len(data):
        ln = struct.unpack('>i', data[off:off+4])[0]; off += 4
        if ln <= 0 or off + ln > len(data): break
        raw = bytes(b ^ key for b in data[off:off+ln])
        off += ln
        if raw[:8] == b'\x89PNG\r\n\x1a\n':
            out.append(raw)
    return out

def zheng(data):
    """3.jar 变体? 尝试其他偏移"""
    return unpack_mid(data)

def main():
    base = os.path.dirname(os.path.abspath(__file__))
    jars = {
        '1': 'jars/1_zhanyao_N7370.jar',
        '2': 'jars/2_zhanyao2_N73.jar',
        '3': 'jars/3_zhanyao3_n73.jar',
    }
    outdir = os.path.join(base, 'assets_extracted')
    os.makedirs(outdir, exist_ok=True)
    total = 0; totalpng = 0
    report = []
    for ver, jp in jars.items():
        jfull = os.path.join(base, jp)
        if not os.path.exists(jfull): continue
        with zipfile.ZipFile(jfull) as z:
            names = [n for n in z.namelist() if n.lower().endswith('.mid') and
                     ('/role/' in n or '/scene/' in n)]
            for n in names:
                data = z.read(n)
                pngs = unpack_mid(data)
                if not pngs: continue
                rel = n[len('data/'):] if n.startswith('data/') else n
                for i, png in enumerate(pngs):
                    outname = rel[:-4] + (('_%d' % i) if len(pngs)>1 else '') + '.png'
                    outpath = os.path.join(outdir, outname.replace('/', os.sep))
                    os.makedirs(os.path.dirname(outpath), exist_ok=True)
                    with open(outpath, 'wb') as f: f.write(png)
                    totalpng += 1
                total += 1
        report.append((ver, len(names)))
    print('解包源文件数:', total, ' 导出PNG:', totalpng)
    for v,c in report: print(' 版本',v,'候选.mid',c)

if __name__ == '__main__': main()

import zipfile, struct, os, re, json, sys

jar_dir = 'jars'
out_dir = 'data'
os.makedirs(out_dir, exist_ok=True)

CP_UTF8 = 1
def constants(data):
    if len(data) < 10 or data[:4] != b'\xca\xfe\xba\xbe':
        return []
    pos = 8
    count = struct.unpack_from('>H', data, pos)[0]; pos += 2
    out = []
    i = 1
    while i < count:
        if pos >= len(data): break
        tag = data[pos]; pos += 1
        if tag == CP_UTF8:
            ln = struct.unpack_from('>H', data, pos)[0]; pos += 2
            raw = data[pos:pos+ln]; pos += ln
            try:
                s = raw.decode('utf-8')
            except Exception:
                s = raw.decode('gbk', 'replace')
            out.append(s)
        elif tag in (3, 4): pos += 4
        elif tag in (5, 6):
            pos += 8; i += 1
        elif tag in (7, 8, 16, 19, 20): pos += 2
        elif tag in (9, 10, 11, 12, 17, 18): pos += 4
        elif tag == 15: pos += 3
        else: break
        i += 1
    return out

for jar in sorted(os.listdir(jar_dir)):
    if not jar.endswith('.jar'): continue
    path = os.path.join(jar_dir, jar)
    z = zipfile.ZipFile(path)
    records = []
    for name in z.namelist():
        if not name.endswith('.class'): continue
        ss = constants(z.read(name))
        cn = [s for s in ss if re.search(r'[\u4e00-\u9fff]', s)]
        if cn:
            records.append({'class': name, 'texts': cn})
    namekey = jar.replace('.jar','')
    with open(os.path.join(out_dir, f'{namekey}_text.json'), 'w', encoding='utf-8') as fp:
        json.dump(records, fp, ensure_ascii=False, indent=1)
    total = sum(len(r['texts']) for r in records)
    print(f"{jar}: {len(records)} 个类含中文, 共 {total} 条 -> data/{namekey}_text.json")

import os, re, json, sys

base = sys.argv[1] if len(sys.argv) > 1 else 'src/1_zhanyao_N7370/a'
out = sys.argv[2] if len(sys.argv) > 2 else 'text_dump_zh1.json'

STR_RE = re.compile(r'"((?:[^"\\]|\\.)*)"')
allstr = []
for root, dirs, files in os.walk(base):
    for f in sorted(files):
        if not f.endswith('.java'):
            continue
        path = os.path.join(root, f)
        text = open(path, encoding='utf-8', errors='replace').read()
        for m in STR_RE.finditer(text):
            s = m.group(1)
            try:
                # CFR 输出的是 \uXXXX 转义
                s = s.encode('utf-8').decode('unicode_escape')
            except Exception:
                pass
            if re.search(r'[\u4e00-\u9fff]', s):
                allstr.append({'class': os.path.relpath(path, base), 'text': s})

print(f"导出文案总数: {len(allstr)}")
for tag, pat in [
    ('武器', r'剑|鞭|矛|刀|枪|弓|刃|棒|锤|轮|杖'),
    ('附魔', r'附魔|攻击力|吸血|防御|幸运|经验|魔击'),
    ('关卡', r'章|关卡|场景|地图'),
    ('配方', r'配方'),
]:
    hits = [x for x in allstr if re.search(pat, x['text'])]
    print(f"\n--- {tag} ({len(hits)}) ---")
    for x in hits[:18]:
        print(f"  [{x['class']}] {x['text'][:70]}")

with open(out, 'w', encoding='utf-8') as fp:
    json.dump(allstr, fp, ensure_ascii=False, indent=1)
print(f"\n已保存 {out}")

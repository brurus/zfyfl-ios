/*
 * Decompiled with CFR 0.152.
 */
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class k
extends FullCanvas
implements Runnable {
    public h a;
    public GameMIDlet a;
    public boolean a;
    static Graphics a;
    int[] a;
    private int d;
    int a;
    int b;
    private int e;
    private int f = 0;
    public Font[] a;
    private boolean b;
    private int g = 0;
    private int[] b = false;
    private int[] c;
    private String a = "";
    private int[] d = 2;
    private int[] e = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    public int c = 0;
    private int k = 90;
    private int l = 105;

    public k(GameMIDlet object) {
        this.b = new int[]{1, 2, 3, 4, 5, 7, 8, 6};
        this.c = new int[]{1, 3, 4, 5, 7, 8, 6};
        this.d = new int[]{0, 0};
        this.e = new int[]{0, 0};
        this.a = object;
        this.a = new h(this);
        object = this;
        new Thread((Runnable)object).start();
        this.a = g.a(this.a[0]);
        this.b = this.a[0].getHeight();
    }

    public final void run() {
        while (!this.b) {
            while (!this.a) {
                long l2 = System.currentTimeMillis();
                this.a.a();
                this.repaint();
                this.serviceRepaints();
                long l3 = System.currentTimeMillis();
                if (l3 - l2 >= (long)this.a.a) continue;
                try {
                    Thread.sleep((long)this.a.a - (l3 - l2));
                }
                catch (Exception exception) {}
            }
        }
        this.a.destroyApp(true);
        this.a.notifyDestroyed();
    }

    public final void a() {
        this.b = true;
        this.a = true;
    }

    public final void paint(Graphics graphics) {
        a = graphics;
        if (a != null) {
            a.setClip(0, 0, 240, 320);
            a.setColor(0);
            a.fillRect(0, 0, 240, 320);
            this.a.b();
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        a.setClip(n2, n3, n4 + 1, n5 + 1);
        a.setColor(n6);
        a.drawRect(n2, n3, n4, n5);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        a.setClip(n2, n3, n4 + 1, n5 + 1);
        a.setColor(n6);
        a.fillRect(n2, n3, n4, n5);
    }

    public final void a(p p2, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2, short[][][][] sArray3, int n2, int n3) {
        if (p2.g >= 1 && p2.g < 26 && ((c)p2).a == false) {
            return;
        }
        int n4 = p2.g;
        int n5 = p2.k;
        byte by = p2.c[0];
        if (sArray3[n4][by].length >= 0) {
            short s = sArray3[n4][by][n5][1];
            this.a(imageArray[n4], sArray2[n4][s], p2.m, p2.n, sArray[n4], p2.e, n2, n3, 0, 30, 240, 260);
        }
    }

    public final void a(Image[] imageArray, short[][] sArray, int n2, int n3, short[][] sArray2, byte by, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 0;
        n6 = 0;
        n8 = 0;
        short s = 0;
        int n11 = 0;
        a.setClip(0, n7, 240, n9);
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            n11 = by == 2 ? g.o[sArray[i2][3]] : sArray[i2][3];
            if (n11 == 0 || n11 == 2 || n11 == 4 || n11 == 6) {
                n8 = sArray2[sArray[i2][0]][3];
                s = sArray2[sArray[i2][0]][4];
            } else {
                n8 = sArray2[sArray[i2][0]][4];
                s = sArray2[sArray[i2][0]][3];
            }
            n10 = by == 2 ? n2 - (sArray[i2][1] + n8) - n4 : n2 + sArray[i2][1] - n4;
            n6 = n9 - (n3 - sArray[i2][2] - n5) + n7;
            if (!g.a(n10, n6, n8, s, 0, n7, 240, n9)) continue;
            g.a(a, imageArray[sArray2[sArray[i2][0]][0]], n10, n6, 20, n11, sArray2[sArray[i2][0]][1], sArray2[sArray[i2][0]][2], sArray2[sArray[i2][0]][3], sArray2[sArray[i2][0]][4]);
        }
    }

    public static void a(short[] sArray, Image[] imageArray, int n2, int n3, short[][] sArray2, Graphics object, int n4, int n5, int n6, int n7) {
        if (sArray.length == 0) {
            return;
        }
        object = new int[]{0, 1, 2, 3, 4, 7, 6, 5};
        Graphics graphics = a;
        graphics.setClip(0, 30, 240, 260);
        n5 = 0;
        n6 = 0;
        n7 = 0;
        short s = 0;
        short s2 = 0;
        int n8 = 0;
        for (int i2 = 0; i2 < sArray.length; i2 += 3) {
            if (sArray[i2 + 2] < 0) continue;
            n5 = sArray[i2 + 2] >> 3;
            n8 = sArray[i2 + 2] & 7;
            if (n8 == 0 || n8 == 2 || n8 == 4 || n8 == 6) {
                s = sArray2[n5][3];
                s2 = sArray2[n5][4];
            } else {
                s = sArray2[n5][4];
                s2 = sArray2[n5][3];
            }
            n6 = sArray[i2] * 20 - n2;
            n7 = 260 - (sArray[i2 + 1] * 20 - n3 + s2) + 30;
            if (!g.a(n6, n7, s, s2, 0, 30, 240, 260)) continue;
            g.a(graphics, imageArray[sArray2[n5][0]], n6, n7, 20, (int)object[n8], sArray2[n5][1], sArray2[n5][2], sArray2[n5][3], sArray2[n5][4]);
        }
    }

    public static void a(Image[][] imageArray, int n2, int n3) {
        int n4 = (240 - imageArray[34][0].getWidth()) / 2;
        a.setColor(14172160);
        a.fillRect(n4 + 40, 292, n2 * 107 / n3, 2);
        a.drawImage(imageArray[34][0], n4, 280, 20);
    }

    public final void a(Image[][] object, r object2, short s, byte[][][] byArray, short[][][] sArray, short[][][][] sArray2) {
        a.setClip(0, 0, 240, 320);
        a.setFont(this.a[0]);
        k.b(0, 0, 240, 30, 0);
        k.b(0, 290, 240, 30, 0);
        this.a(57, 2, 119, 7, ((r)object2).a[0], ((r)object2).a[1], 0xA40000, 15349274);
        this.a(54, 12, 112, 7, ((r)object2).d[0], ((r)object2).d[1], 30121, 46591);
        if (((r)object2).a[0] < (((r)object2).a[1] << 1) / 5) {
            int n2 = this.g = ++this.g > 1 ? 0 : this.g;
            if (this.g % 2 == 0) {
                k.b(57, 2, 119 * ((r)object2).a[0] / ((r)object2).a[1], 7, 0xFFFFFF);
            }
        }
        if (this.a.d[6] > 0 && this.a.d[6] % 2 == false) {
            k.b(54, 12, 112 * ((r)object2).d[0] / ((r)object2).d[1], 7, 0xFFFFFF);
        }
        this.a(object[26], sArray2[26][0], 0, 320, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a((Image[][])object, 26, 8, ((r)object2).a[0], 200, 2, 6, 1, sArray, sArray2);
        this.a((Image[][])object, 26, 8, ((r)object2).a[1], 209, 2, 6, 0, sArray, sArray2);
        this.a((Image[][])object, 26, 8, ((r)object2).d[0], 190, 12, 6, 1, sArray, sArray2);
        this.a((Image[][])object, 26, 8, ((r)object2).d[1], 199, 12, 6, 0, sArray, sArray2);
        this.a((Image[][])object, 26, 8, ((r)object2).m[0], 177, 23, 6, 1, sArray, sArray2);
        this.a(object[26], sArray2[26][4], 173 - (g.d(((r)object2).m[0]) - 1) * 6, 299, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a((Image[][])object, 26, 8, ((r)object2).f[0], 82, 23, 6, 0, sArray, sArray2);
        int n3 = this.a.a();
        int n4 = 0;
        switch (n3) {
            case -1: 
            case 12: {
                n4 = 18;
                break;
            }
            case 13: {
                n4 = 19;
                break;
            }
            case 14: {
                n4 = 20;
            }
        }
        this.a(object[26], sArray2[26][n4], 0, 320, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a((Image[][])object, 26, 23, n3 < 0 ? this.a.k[12] : this.a.k[n3], 215, 26, 8, 0, sArray, sArray2);
        n3 = this.a.b();
        switch (n3) {
            case -1: 
            case 15: {
                n4 = 21;
                break;
            }
            case 16: {
                n4 = 22;
            }
        }
        this.a(object[26], sArray2[26][n4], 0, 320, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a((Image[][])object, 26, 23, n3 < 0 ? this.a.k[15] : this.a.k[n3], 215, 44, 8, 0, sArray, sArray2);
        if (this.a.q == 6 || this.a.q == 14 || this.a.q == 19) {
            int[] nArray = this.a((int)this.a.d[51]);
            this.a("\u5012\u8ba1\u65f6:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2", 48, 36, 20, 16646090, this.a[0]);
        }
        if (this.a.d[22] >= 0 && (this.a.a[0].g == 17 || this.a.a[0].g == 18 || this.a.a[0].g == 19 || this.a.a[0].g == 16)) {
            int[] nArray = this.a(this.a.h);
            this.a("\u8ba1\u65f6:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2", 48, 36, 20, 16646090, this.a[0]);
        }
        int[] nArray = new int[]{1, 5, 6, 7, 1, 5, 7, 6};
        if (s >= 0 && this.a.a != null && this.a.a.length > 0) {
            int n5 = byArray[s][1][1] - 12;
            this.a(4, 311, 179, 7, (int)this.a.a[0].a[0], (int)this.a.a[0].a[1], 0xA40000, 15349274);
            this.a(object[26], sArray2[26][nArray[n5]], 0, 320, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
            return;
        }
        this.a(60, 308, 59, 7, ((r)object2).e[0], ((r)object2).e[1], 24084, 5148928);
        if (((r)object2).b >= 4) {
            this.a(121, 308, 59, 7, 1, 1, 13199360, 15443456);
        } else {
            this.a(121, 308, 59, 7, (int)this.a.e[((r)object2).a], this.a.b((int)((r)object2).f, (int)((r)object2).b), 13199360, 15443456);
        }
        this.a(object[26], sArray2[26][2], 0, 320, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
        object = this;
        object2 = "";
        ((k)object).d[1] = 0;
        if (((k)object).a.b[0][3] >= ((k)object).a.b[0][2]) {
            object2 = (String)object2 + "\u6309#\u952e\u67e5\u770b\u653b\u7565\u3002      ";
        }
        if (((k)object).a.k[0] == 1) {
            object2 = (String)object2 + "\u6309*\u952e\u53ef\u4ee5\u8fdb\u5165\u968f\u8eab\u5546\u5e97\u3002";
        }
        ((k)object).d[1] = ((k)object).d[1] + (((k)object).a * ((String)object2).length() + 190);
        ((k)object).d[0] = ((k)object).d[0] + 2;
        if (((k)object).d[0] >= ((k)object).d[1] || ((k)object).d[0] < 0) {
            ((k)object).d[0] = 0;
        }
        super.a(0, 36, 282, 168, 28, 25, (String)object2, 0xFFFFFF);
        if (this.a.d[97] == true) {
            int n6 = this.f = ++this.f > 3 ? 0 : this.f;
            if (this.f > 0) {
                k.a("\u4ece\u4f20\u9001\u95e8\u8fdb\u5165\u6e38\u620f\u5173\u5361", 120, 128 - this.b, 17, a, this.a[0], 16767232, 0);
            }
        }
    }

    private void a(Image[][] imageArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, short[][][] sArray, short[][][][] sArray2) {
        n2 = g.d(n4);
        int n9 = 0;
        n9 = n5;
        switch (n8) {
            case 0: {
                n9 = n5;
                break;
            }
            case 1: {
                n9 = n5 - (n2 - 1) * n7;
                break;
            }
            case 2: {
                n9 = n5 - (n2 - 1) * n7 / 2;
            }
        }
        for (n8 = 0; n8 < n2; ++n8) {
            n5 = n4 % g.e(n2 + 1 - n8) / g.e(n2 - n8);
            this.a(imageArray[26], sArray2[26][n3 + n5], n9 + n8 * n7, 320 - n6, sArray[26], (byte)1, 0, 0, 0, 0, 240, 320);
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        k.b(n2, n3, n4 * n6 / n7, 7, n8);
        k.b(n2, n3 + 1, n4 * n6 / n7, 5, n9);
    }

    public final void a(Image[][] imageArray, p stringArray, byte[] byArray, byte[] byArray2, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][0], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a.a(stringArray.a[15], 0, 0);
        stringArray = new String[]{"\u5730\u56fe", "\u653b\u7565", "\u968f\u8eab\u5546\u5e97", "\u7ee7\u7eed\u6e38\u620f", "\u67e5\u770b\u5e2e\u52a9", "\u6e38\u620f\u8bbe\u7f6e", "\u56de\u4e3b\u83dc\u5355"};
        this.a(imageArray[27], sArray2[27][21], 0, 320 - (64 + 26 * byArray2[0]), sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            k.a(stringArray[i2], 120, 66 + i2 * 26, 17, a, this.a[0], 16646090, 0);
        }
        if (this.a.k[0] == 0) {
            if (byArray[byArray2[0]] == 33) {
                this.a("\u6b64\u529f\u80fd\u672a\u5f00\u542f", 120, 320 - this.b, 17, 0xFFFFFF, this.a[0]);
            }
            k.a(stringArray[2], 120, 118, 17, a, this.a[0], 0x4F4F3F, 0xAFAFAF);
        }
        if (this.a.b[0][3] < this.a.b[0][2]) {
            if (byArray[byArray2[0]] == 31) {
                this.a("\u9700\u8981\u6b63\u7248\u6fc0\u6d3b", 120, 320 - this.b, 17, 0xFFFFFF, this.a[0]);
            }
            k.a(stringArray[1], 120, 92, 17, a, this.a[0], 0x4F4F3F, 0xAFAFAF);
        }
        this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a(imageArray[27], sArray2[27][48], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
    }

    public final void a(String string, int n2, int n3, int n4, int n5, Font font) {
        k.a(n5, font);
        a.drawString(string, n2, n3, n4);
    }

    public static void a(int n2, Font font) {
        a.setColor(n2);
        a.setFont(font);
        a.setClip(0, 0, 240, 320);
    }

    public final void a(Image[][] imageArray, byte by, byte by2, p p2, byte[][] byArray, int[] nArray, byte[] byArray2, byte[][] byArray3, r r2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][2], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        byte by3 = byArray2[byArray3[0][0]];
        byte by4 = byArray[by3][1];
        this.a(imageArray[27], sArray2[27][by4 + 35], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        if (by3 == r2.a) {
            this.a.a(p2.a[8], 0, 0);
        }
        this.a.a(p2.a[1], 0, 0);
        this.a("\u653b:" + (int)(this.a.f[by3] * this.a.b[byArray[by3][2]] / 100), 140, 70, 20, 16646090, this.a[0]);
        this.a("\u7b49\u7ea7:" + byArray[by3][2], 33, 121, 20, 16646090, this.a[0]);
        this.a("\u719f\u7ec3:" + (byArray[by3][2] < 4 ? nArray[by3] + "/" + this.a.b((int)byArray[by3][1], (int)byArray[by3][2]) : "----"), 105, 121, 20, 16646090, this.a[0]);
        k.a(a, "\u57fa\u7840\u653b\u51fb" + (int)this.a.f[by3] + "\uff0c" + stringArray[3][by4], 16646090, 33, 147, 26, 174, this.a[0]);
        for (int i2 = 0; i2 < 3; ++i2) {
            if (byArray[by3][3 + (i2 << 1)] == -1) {
                this.a(imageArray[28], sArray2[28][43], 71, 320 - (195 + i2 * 26), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a("\u672a\u5f00\u542f", 100, 198 + i2 * 26, 20, 16646090, this.a[0]);
                continue;
            }
            if (byArray[by3][3 + (i2 << 1)] == 0) {
                this.a(imageArray[28], sArray2[28][43], 71, 320 - (195 + i2 * 26), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a("\u65e0\u9644\u9b54", 100, 198 + i2 * 26, 20, 16646090, this.a[0]);
                continue;
            }
            this.a(imageArray[28], sArray2[28][this.a.w[byArray[by3][3 + i2 * 2 + 1]]], 71, 320 - (195 + i2 * 26), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(stringArray[0][byArray[by3][3 + (i2 << 1) + 1]], 100, 198 + i2 * 26, 20, 16646090, this.a[0]);
        }
        this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a.a(p2.a[11], 40, -265);
        if (by == 3) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            switch (by2) {
                case 0: {
                    this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    this.a("\u88c5\u5907\u6210\u529f", 120, 142, 17, 16646090, this.a[0]);
                    this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    return;
                }
                case 1: {
                    this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    this.a("\u5df2\u88c5\u5907", 120, 142, 17, 16646090, this.a[0]);
                    this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                }
            }
        }
    }

    public final void a(Image[][] imageArray, byte by, p p2, byte[] byArray, byte[][] byArray2, int[] nArray, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][3], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a.a(p2.a[0], 0, 0);
        this.a(imageArray[27], sArray2[27][21], 0, 320 - (67 + 26 * byArray2[0][1]), sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        for (int i2 = 0; i2 < 3 && i2 < byArray.length; ++i2) {
            this.a(imageArray[28], sArray2[28][this.a.u[byArray[byArray2[0][2] + i2]]], 25, 320 - (67 + i2 * 26), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            if (i2 == byArray2[0][1]) {
                k.a(stringArray[4][byArray[byArray2[0][2] + i2]], 105, 68 + i2 * 26, 17, a, this.a[0], 16646090, 0);
            } else {
                this.a(stringArray[4][byArray[byArray2[0][2] + i2]], 105, 68 + i2 * 26, 17, 16646090, this.a[0]);
            }
            this.a("X" + nArray[byArray[byArray2[0][2] + i2]], 149, 68 + i2 * 26, 20, 16646090, this.a[0]);
        }
        this.a.a(p2.a[10], 25, -(67 + 26 * byArray2[0][1]));
        this.a(imageArray, 200, 49, (int)byArray2[0][0], byArray.length, sArray, sArray2);
        k.a(a, stringArray[5][byArray[byArray2[0][0]]], 16646090, 20, 197, 26, 205, this.a[0]);
        if (byArray[byArray2[0][0]] >= 12 && byArray[byArray2[0][0]] <= 17) {
            this.a(imageArray[27], sArray2[27][15], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
        if (by == 2) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[28], sArray2[28][this.a.u[byArray[byArray2[0][0]]]], 50, 200, sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(stringArray[4][byArray[byArray2[0][0]]], 80, 122, 20, 16646090, this.a[0]);
            this.a("\u786e\u5b9a\u4f7f\u7528?", 120, 152, 17, 16646090, this.a[0]);
            this.a(imageArray[27], sArray2[27][15], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
        if (by == 3) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            if (this.a.f == 0) {
                switch (byArray[byArray2[0][0]]) {
                    case 12: 
                    case 13: 
                    case 14: {
                        this.a("\u751f\u547d\u56de\u590d\u81f3", 120, 122, 17, 16646090, this.a[0]);
                        this.a("" + this.a.a.a[0] + "/" + this.a.a.a[1], 120, 152, 17, 16646090, this.a[0]);
                        break;
                    }
                    case 15: {
                        this.a("\u9b54\u529b\u56de\u590d\u81f3", 120, 122, 17, 16646090, this.a[0]);
                        this.a("" + this.a.a.d[0] + "/" + this.a.a.d[1], 120, 152, 17, 16646090, this.a[0]);
                        break;
                    }
                    case 16: {
                        this.a("30\u79d2\u5185\u9b54\u529b\u65e0\u9650", 120, 144, 17, 16646090, this.a[0]);
                    }
                }
            } else if (this.a.f == 1) {
                switch (byArray[byArray2[0][0]]) {
                    case 12: 
                    case 13: 
                    case 14: {
                        this.a("\u751f\u547d\u503c\u5df2\u6ee1", 120, 144, 17, 16646090, this.a[0]);
                        break;
                    }
                    case 15: {
                        this.a("\u9b54\u529b\u503c\u5df2\u6ee1", 120, 144, 17, 16646090, this.a[0]);
                        break;
                    }
                    case 17: {
                        this.a("\u5f53\u524d\u573a\u666f", 120, 122, 17, 16646090, this.a[0]);
                        this.a("\u65e0\u6cd5\u4f7f\u7528", 120, 152, 17, 16646090, this.a[0]);
                    }
                }
            }
            this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
    }

    public final void a(Image[][] object, p p2, byte[] byArray, byte[][] byArray2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(object[27], sArray2[27][5], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a.a(p2.a[0], 0, 0);
        this.a(object[27], sArray2[27][21], 0, 320 - (67 + 26 * byArray2[0][1]), sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        for (int i2 = 0; i2 < 3; ++i2) {
            if (i2 == byArray2[0][1]) {
                k.a(stringArray[8][byArray[byArray2[0][2] + i2]], 104, 68 + i2 * 26, 17, a, this.a[0], 16646090, 0);
                continue;
            }
            this.a(stringArray[8][byArray[byArray2[0][2] + i2]], 104, 68 + i2 * 26, 17, 16646090, this.a[0]);
        }
        this.a((Image[][])object, 200, 49, (int)byArray2[0][0], byArray.length, sArray, sArray2);
        k.a(16646090, this.a[0]);
        switch (byArray[byArray2[0][0]]) {
            case 0: {
                a.drawString("\u4f60\u7684\u603b\u6e38\u620f\u65f6\u95f4\u4e3a:", 15, 172, 20);
                int[] nArray = this.a(this.a.t[1]);
                a.drawString(k.a(this.a.t[0]) + ":" + k.a(nArray[1]) + ":" + k.a(nArray[2]), 120, 196, 17);
                a.drawString("\u65f6\u95f4\u8fbe\u52303\u5c0f\u65f6\u53ef\u83b7:", 15, 220, 20);
                a.drawString("\u7a76\u7ea7\u7ecf\u9a8c\u9644\u9b54", 70, 244, 20);
                break;
            }
            case 1: {
                this.a(1, 15, 172, 210, 96, 172, "\u6740\u654c\u603b\u91cf:" + this.a.u[0], 16646090);
                this.a(1, 15, 172, 210, 96, 196, "\u6570\u91cf\u8fbe\u52301000\u53ef\u83b7\uff1a", 16646090);
                this.a(1, 70, 172, 210, 96, 220, "\u9ad8\u7ea7\u5438\u8840\u9644\u9b54", 16646090);
                this.a(1, 15, 172, 210, 96, 244, "\u6570\u91cf\u8fbe\u52302000\u53ef\u83b7\uff1a", 16646090);
                this.a(1, 70, 172, 210, 96, 268, "\u7a76\u7ea7\u5438\u8840\u9644\u9b54", 16646090);
                break;
            }
            case 2: {
                a.drawString("\u603b\u89e3\u9501\u5ea6:" + this.a.d() + "%", 15, 172, 20);
                for (int i3 = 0; i3 < 22; ++i3) {
                    if (this.a.i[i3][0] == false) {
                        this.a(1, 15, 196, 210, 72, 196 + (i3 << 1) * 24, stringArray[11][i3], 0xFF0000);
                        this.a(1, 15, 196, 210, 72, 196 + ((i3 << 1) + 1) * 24, stringArray[12][i3], 0xFF0000);
                        continue;
                    }
                    this.a(1, 15, 196, 210, 72, 196 + (i3 << 1) * 24, stringArray[11][i3], 16646090);
                    this.a(1, 15, 196, 210, 72, 196 + ((i3 << 1) + 1) * 24, " \u5df2\u89e3\u9501", 16646090);
                }
                break;
            }
            case 3: {
                a.drawString("\u603b\u63a2\u7d22\u5ea6:" + this.a.e() / 22 + "%", 15, 172, 20);
                for (int i4 = 0; i4 < 22; ++i4) {
                    this.a(1, 15, 196, 210, 72, 196 + i4 * 24, stringArray[11][i4] + " " + this.a.x[i4] + "%", 16646090);
                }
                break;
            }
            case 4: {
                a.drawString("\u603b\u6536\u96c6\u5ea6:" + this.a.c() + "%", 15, 172, 20);
                for (int i5 = 0; i5 < 10; ++i5) {
                    this.a(1, 15, 196, 210, 72, 196 + i5 * 24, stringArray[10][i5], this.a.y[i5] == 0 ? 0xFF0000 : 16646090);
                }
                break;
            }
            case 5: {
                a.drawString("\u603b\u6536\u96c6\u5ea6:" + this.a.f() + "%", 15, 172, 20);
                a.drawString("\u8be6\u7ec6\u6536\u96c6\u60c5\u51b5\u8bf7\u7ffb\u9875", 15, 196, 20);
                a.drawString("\u81f3\u9644\u9b54\u5206\u9875\u67e5\u770b\u3002", 15, 220, 20);
                break;
            }
            case 6: {
                a.drawString("\u8840\u6c60\u86c7\u5996\u51fb\u6740", 15, 172, 20);
                object = this.a((int)this.a.i[5]);
                a.drawString("\u6700\u5feb\u65f6\u95f4: " + k.a((int)object[1]) + ":" + k.a((int)object[2]), 15, 196, 20);
                a.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", 15, 220, 20);
                a.drawString("\u7a76\u7ea7\u5e78\u8fd0\u9644\u9b54", 70, 244, 20);
                break;
            }
            case 7: {
                a.drawString("\u9b54\u754c\u6b7b\u795e\u51fb\u6740", 15, 172, 20);
                object = this.a((int)this.a.i[6]);
                a.drawString("\u6700\u5feb\u65f6\u95f4: " + k.a((int)object[1]) + ":" + k.a((int)object[2]), 15, 196, 20);
                a.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", 15, 220, 20);
                a.drawString("\u7a76\u7ea7\u9632\u5fa1\u9644\u9b54", 70, 244, 20);
                break;
            }
            case 8: {
                a.drawString("\u9b54\u9b3c\u4f2f\u7235\u51fb\u6740", 15, 172, 20);
                object = this.a((int)this.a.i[7]);
                a.drawString("\u6700\u5feb\u65f6\u95f4: " + k.a((int)object[1]) + ":" + k.a((int)object[2]), 15, 196, 20);
                a.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", 15, 220, 20);
                a.drawString("\u7a76\u7ea7\u9b54\u51fb\u9644\u9b54", 70, 244, 20);
                break;
            }
            case 9: {
                a.drawString("\u5730\u72f1\u4f7f\u8005\u51fb\u6740", 15, 172, 20);
                object = this.a((int)this.a.i[8]);
                a.drawString("\u6700\u5feb\u65f6\u95f4: " + k.a((int)object[1]) + ":" + k.a((int)object[2]), 15, 196, 20);
                a.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", 15, 220, 20);
                a.drawString("\u7a76\u7ea7\u653b\u51fb\u9644\u9b54", 70, 244, 20);
            }
        }
        this.e[0] = this.e[0] + 2;
        if (this.e[0] >= this.e[1] + 72) {
            this.e[0] = 0;
        }
    }

    public final void a(Image[][] object, p p2, byte[] byArray, short[][] sArray, byte[][] byArray2, r r2, String[][] stringArray, short[][][] sArray2, short[][][][] sArray3) {
        ((k)object2).a(object[27], sArray3[27][4], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
        ((k)object2).a.a(p2.a[0], 0, 0);
        ((k)object2).a(object[27], sArray3[27][21], 0, 320 - (67 + 26 * byArray2[0][1]), sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
        for (int i2 = 0; i2 < 3; ++i2) {
            ((k)object2).a(object[28], sArray3[28][((k)object2).a.w[byArray[byArray2[0][2] + i2]]], 25, 320 - (67 + i2 * 26), sArray2[28], (byte)1, 0, 0, 0, 0, 240, 320);
            if (i2 == byArray2[0][1]) {
                k.a(stringArray[6][byArray[byArray2[0][2] + i2]], 105, 68 + i2 * 26, 17, a, ((k)object2).a[0], sArray[byArray[byArray2[0][2] + i2]][0] == 1 ? 16646090 : 0xFF0000, 0);
            } else {
                ((k)object2).a(stringArray[6][byArray[byArray2[0][2] + i2]], 105, 68 + i2 * 26, 17, sArray[byArray[byArray2[0][2] + i2]][0] == 1 ? 16646090 : 0xFF0000, ((k)object2).a[0]);
            }
            ((k)object2).a(sArray[byArray[byArray2[0][2] + i2]][0] == 1 ? "\u5df2\u83b7" : "\u9501\u5b9a", 150, 68 + i2 * 26, 20, 16646090, ((k)object2).a[0]);
        }
        ((k)object2).a.a(p2.a[10], 25, -(67 + 26 * byArray2[0][1]));
        ((k)object2).a((Image[][])object, 200, 49, (int)byArray2[0][0], byArray.length, sArray2, sArray3);
        ((k)object2).a(stringArray[0][byArray[byArray2[0][0]]], 120, 172, 17, 16646090, ((k)object2).a[0]);
        String string = "";
        k.a(16646090, ((k)object2).a[0]);
        ((k)object2).a(0, 28, 198, 184, 26, 28, stringArray[7][byArray[byArray2[0][0]]], 16646090);
        ((k)object2).d[0] = ((k)object2).d[0] + 2;
        if (((k)object2).d[0] >= ((k)object2).d[1] + 240 - 56) {
            ((k)object2).d[0] = 0;
        }
        k.a(16646090, ((k)object2).a[0]);
        if (sArray[byArray[byArray2[0][0]]][0] == 1) {
            a.drawString("\u6761\u4ef6:" + stringArray[9][byArray[byArray2[0][0]]], 28, 224, 20);
            a.drawString("\u5df2\u7ecf\u8fbe\u6210\u4f7f\u7528\u6761\u4ef6\u3002", 28, 250, 20);
            return;
        }
        a.setColor(65535);
        a.drawString("\u6761\u4ef6:" + stringArray[9][byArray[byArray2[0][0]]], 28, 224, 20);
        switch (byArray[byArray2[0][0]]) {
            case 1: {
                string = "\u5f53\u524d\u653b\u51fb\u529b:" + r2.b[1];
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 15: {
                string = "\u5c1a\u672a\u51fb\u8d25";
                break;
            }
            case 2: {
                Object object2 = ((k)object2).a((int)((k)object2).a.i[8]);
                string = "\u5f53\u524d\u65f6\u95f4: " + k.a((int)object2[1]) + ":" + k.a((int)object2[2]);
                break;
            }
            case 5: {
                Object object2 = ((k)object2).a((int)((k)object2).a.i[7]);
                string = "\u5f53\u524d\u65f6\u95f4: " + k.a((int)object2[1]) + ":" + k.a((int)object2[2]);
                break;
            }
            case 8: {
                Object object2 = ((k)object2).a((int)((k)object2).a.i[6]);
                string = "\u5f53\u524d\u65f6\u95f4: " + k.a((int)object2[1]) + ":" + k.a((int)object2[2]);
                break;
            }
            case 17: {
                Object object2 = ((k)object2).a((int)((k)object2).a.i[5]);
                string = "\u5f53\u524d\u65f6\u95f4: " + k.a((int)object2[1]) + ":" + k.a((int)object2[2]);
                break;
            }
            case 10: 
            case 11: {
                string = "\u5f53\u524d\u6740\u654c\u6570\u91cf:" + ((k)object2).a.u[0];
                break;
            }
            case 3: {
                string = "\u5f53\u524d\u9b54\u529b\u4e0a\u9650:" + r2.d[1];
                break;
            }
            case 13: {
                string = "\u5f53\u524d\u89d2\u8272\u7b49\u7ea7:" + r2.f[0];
                break;
            }
            case 16: {
                string = "\u5f53\u524d\u91d1\u5e01\u91cf:" + r2.m[0];
                break;
            }
            case 14: {
                object = ((k)object2).a(((k)object2).a.t[1]);
                string = "\u5f53\u524d\u65f6\u95f4: " + k.a(((k)object2).a.t[0]) + ":" + k.a((int)object[1]) + ":" + k.a((int)object[2]);
            }
        }
        a.drawString(string, 28, 250, 20);
    }

    private void a(Image[][] imageArray, int n2, int n3, int n4, int n5, short[][][] sArray, short[][][][] sArray2) {
        n2 = 0;
        this.a(imageArray[27], sArray2[27][14], 200, 271, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        n2 = 49 + n4 * 101 / n5;
        if (n4 == 0) {
            n2 = 49;
        } else if (n4 == n5 - 1) {
            n2 = 150;
        }
        this.a(imageArray[27], sArray2[27][13], 200, 320 - n2, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
    }

    public final void a(Image[][] imageArray, p p2, byte by, int[] nArray, byte[] byArray, byte by2, byte[][] byArray2, r r2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][6], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        if (by2 == 0 || (by2 == 2 || by2 == 3) && (byArray[byArray2[0][0]] < 8 || byArray[byArray2[0][0]] > 17)) {
            this.a.a(p2.a[0], 0, 0);
            this.a("\u4ef7\u683c", 169, 43, 17, 16646090, this.a[0]);
            this.a("\u73b0\u6709:" + nArray[byArray[byArray2[0][0]]], 123, 173, 20, 16646090, this.a[0]);
            this.a(imageArray[27], sArray2[27][21], 0, 320 - (67 + 26 * byArray2[0][1]), sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            for (int i2 = 0; i2 < 3 && i2 < byArray.length; ++i2) {
                this.a(imageArray[28], sArray2[28][this.a.u[byArray[byArray2[0][2] + i2]]], 25, 320 - (67 + i2 * 26), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
                if (i2 == byArray2[0][1]) {
                    k.a(stringArray[4][byArray[byArray2[0][2] + i2]], 105, 68 + i2 * 26, 17, a, this.a[0], byArray[byArray2[0][2] + i2] >= 18 && byArray[byArray2[0][2] + i2] <= 27 ? k.a(byArray[byArray2[0][2] + i2] - 18) : (byArray[byArray2[0][2] + i2] >= 0 && byArray[byArray2[0][2] + i2] <= 2 && nArray[byArray[byArray2[0][2] + i2]] == 1 ? 0x3F3F3F : 16646090), 0);
                } else {
                    this.a(stringArray[4][byArray[byArray2[0][2] + i2]], 105, 68 + i2 * 26, 17, byArray[byArray2[0][2] + i2] >= 18 && byArray[byArray2[0][2] + i2] <= 27 ? k.a(byArray[byArray2[0][2] + i2] - 18) : (byArray[byArray2[0][2] + i2] >= 0 && byArray[byArray2[0][2] + i2] <= 2 && nArray[byArray[byArray2[0][2] + i2]] == 1 ? 0x3F3F3F : 16646090), this.a[0]);
                }
                this.a("" + this.a.a(byArray[byArray2[0][2] + i2], 1), 169, 68 + i2 * 26, 17, 16646090, this.a[0]);
            }
            this.a.a(p2.a[10], 25, -(67 + 26 * byArray2[0][1]));
            this.a(imageArray, 200, 49, (int)byArray2[0][0], byArray.length, sArray, sArray2);
            if (byArray[byArray2[0][0]] < 18) {
                k.a(a, stringArray[5][byArray[byArray2[0][0]]], 16646090, 20, 198, 26, 205, this.a[0]);
            } else {
                k.a(a, "\u57fa\u7840\u653b\u51fb" + (int)this.a.a[byArray[byArray2[0][0]] - 18][0] + "\uff0c" + stringArray[3][byArray[byArray2[0][0]] - 18], 16646090, 20, 198, 26, 205, this.a[0]);
            }
            this.a("" + r2.m[0], 80, 264, 20, 16646090, this.a[0]);
            if (by2 == 0 && by == 1) {
                this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                k.a(a, "\u60f3\u628a\u6240\u6709\u9053\u5177\u7684\u6570#n\u91cf\u4e0a\u9650\u5347\u81f3999\u5417\uff1f", 16646090, 47, 126, 28, 151, this.a[0]);
                this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            } else if (by2 == 0 && by == 2) {
                this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                k.a(a, "\u60a8\u7b49\u7ea7\u5373\u5c06\u8fbe\u5230\u4e0a#n\u9650\uff0c\u63d0\u5347\u4e0a\u9650\u5417\uff1f", 16646090, 47, 126, 28, 151, this.a[0]);
                this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            }
            this.a("0\u952e=\u8d2d\u4e70\u91d1\u5e01", 120, 320 - this.b + 2, 17, 16646090, this.a[0]);
        } else if (by2 == 1 || (by2 == 2 || by2 == 3) && byArray[byArray2[0][0]] >= 8 && byArray[byArray2[0][0]] <= 17) {
            this.a(imageArray[28], sArray2[28][this.a.u[byArray[byArray2[0][0]]]], 28, 260, sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a("" + stringArray[4][byArray[byArray2[0][0]]] + "    " + this.a.a(byArray[byArray2[0][0]], 1), 52, 68, 20, 16646090, this.a[0]);
            this.a("\u8bf7\u9009\u62e9\u8d2d\u4e70\u6570\u91cf:", 33, 94, 20, 16646090, this.a[0]);
            this.a.a(p2.a[7], 0, 0);
            this.a("" + (int)this.a.d[8], 114, 145, 17, 16646090, this.a[0]);
            this.a("\u5171\u603b\u82b1\u8d39:" + this.a.a(byArray[byArray2[0][0]], (int)this.a.d[8]), 33, 199, 20, 16646090, this.a[0]);
            this.a("\u5df2\u7ecf\u6301\u6709:" + nArray[byArray[byArray2[0][0]]], 33, 226, 20, 16646090, this.a[0]);
            this.a("" + r2.m[0], 80, 264, 20, 16646090, this.a[0]);
        }
        if (by2 == 2) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][11], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a("\u60a8\u8d2d\u4e70\u4e86" + (int)this.a.d[8] + "\u4e2a:", 120, 93, 17, 16646090, this.a[0]);
            this.a(imageArray[28], sArray2[28][this.a.u[byArray[byArray2[0][0]]]], 59, 201, sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(stringArray[4][byArray[byArray2[0][0]]], 87, 119, 20, 16646090, this.a[0]);
            this.a("\u603b\u4ef7\u683c:" + r2.m[1], 120, 145, 17, 16646090, this.a[0]);
            this.a("\u786e\u5b9a\u8d2d\u4e70\u5417?", 120, 171, 17, 16646090, this.a[0]);
            this.a(imageArray[27], sArray2[27][45], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
        if (by2 == 3) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            String[][] stringArrayArray = new String[][]{{"\u8d2d\u4e70\u6210\u529f"}, {"\u91d1\u94b1\u4e0d\u8db3"}, {"\u643a\u5e26\u5df2\u8fbe\u4e0a\u9650"}, {"\u8d2d\u4e70\u6210\u529f", "\u5df2\u81ea\u52a8\u4f7f\u7528"}, {"\u529f\u80fd\u5df2\u5f00\u542f"}};
            if (by == 3) {
                this.a(stringArrayArray[by][0], 120, 126, 17, 16646090, this.a[0]);
                this.a(stringArrayArray[by][1], 120, 154, 17, 16646090, this.a[0]);
            } else {
                this.a(stringArrayArray[by][0], 120, 144, 17, 16646090, this.a[0]);
            }
            this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
    }

    public final void a(Image[][] imageArray, p p2, byte by, int[] nArray, byte[] byArray, byte[] byArray2, byte[][] byArray3, byte by2, byte[][] byArray4, r r2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n2;
        this.a(imageArray[27], sArray2[27][7], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        boolean bl = byArray4[0][0] >= byArray.length;
        int n3 = byArray4[0][0] >= byArray.length ? byArray3[byArray2[byArray4[0][0]]][1] + 18 : byArray2[byArray4[0][0]];
        int n4 = n2 = byArray4[0][0] >= byArray.length ? byArray2[byArray4[0][0]] : n3;
        if (by2 == 0 || (by2 == 2 || by2 == 3) && (bl || !bl && (byArray2[byArray4[0][0]] < 8 || byArray2[byArray4[0][0]] > 17))) {
            this.a.a(p2.a[0], 0, 0);
            this.a("\u4ef7\u683c", 169, 43, 17, 16646090, this.a[0]);
            if (bl) {
                this.a("\u73b0\u6709:" + nArray[18 + byArray3[byArray2[byArray4[0][0]]][1]], 123, 173, 20, 16646090, this.a[0]);
            } else {
                this.a("\u73b0\u6709:" + nArray[byArray2[byArray4[0][0]]], 123, 173, 20, 16646090, this.a[0]);
            }
            this.a(imageArray[27], sArray2[27][21], 0, 320 - (67 + 26 * byArray4[0][1]), sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            int n5 = 0;
            int n6 = 0;
            boolean bl2 = false;
            for (int i2 = 0; i2 < 3 && byArray4[0][2] + i2 < byArray2.length; ++i2) {
                bl2 = byArray4[0][2] + i2 >= byArray.length;
                n5 = bl2 ? byArray3[byArray2[byArray4[0][2] + i2]][1] + 18 : byArray2[byArray4[0][2] + i2];
                n6 = bl2 ? byArray2[byArray4[0][2] + i2] : n5;
                this.a(imageArray[28], sArray2[28][this.a.u[n5]], 25, 320 - (67 + i2 * 26), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
                if (i2 == byArray4[0][1]) {
                    k.a(stringArray[4][n5], 105, 68 + i2 * 26, 17, a, this.a[0], bl2 ? k.a(byArray3[n6][1]) : 16646090, 0);
                } else {
                    this.a(stringArray[4][n5], 105, 68 + i2 * 26, 17, bl2 ? k.a(byArray3[n6][1]) : 16646090, this.a[0]);
                }
                this.a("" + this.a.a(bl2 ? 1 : 0, (byte)n6, 1), 169, 68 + i2 * 26, 17, 16646090, this.a[0]);
            }
            this.a.a(p2.a[10], 25, -(67 + 26 * byArray4[0][1]));
            this.a(imageArray, 200, 49, (int)byArray4[0][0], byArray2.length, sArray, sArray2);
            if (bl) {
                k.a(a, "\u57fa\u7840\u653b\u51fb" + (int)this.a.f[n2] + "\uff0c" + stringArray[3][byArray3[n2][1]], 16646090, 20, 198, 26, 205, this.a[0]);
            } else {
                k.a(a, stringArray[5][n3], 16646090, 20, 198, 26, 205, this.a[0]);
            }
            this.a("" + r2.m[0], 80, 264, 20, 16646090, this.a[0]);
        } else if (by2 == 1 || (by2 == 2 || by2 == 3) && n3 >= 8 && n3 <= 17) {
            this.a(imageArray[28], sArray2[28][this.a.u[n3]], 28, 260, sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a("" + stringArray[4][n3] + "    " + this.a.a(0, (byte)n2, 1), 52, 68, 20, 16646090, this.a[0]);
            this.a("\u8bf7\u9009\u62e9\u51fa\u552e\u6570\u91cf:", 33, 94, 20, 16646090, this.a[0]);
            this.a.a(p2.a[7], 0, 0);
            this.a("" + (int)this.a.d[8], 114, 145, 17, 16646090, this.a[0]);
            this.a("\u5171\u603b\u4ef7\u683c:" + this.a.a(0, (byte)n2, (int)this.a.d[8]), 33, 199, 20, 16646090, this.a[0]);
            this.a("\u5f53\u524d\u6301\u6709:" + nArray[byArray2[byArray4[0][0]]], 33, 226, 20, 16646090, this.a[0]);
            this.a("" + r2.m[0], 80, 264, 20, 16646090, this.a[0]);
        }
        if (by2 == 2) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][11], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a("\u60a8\u51fa\u552e\u4e86" + (int)this.a.d[8] + "\u4e2a:", 120, 93, 17, 16646090, this.a[0]);
            this.a(imageArray[28], sArray2[28][this.a.u[n3]], 59, 201, sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(stringArray[4][n3], 87, 119, 20, 16646090, this.a[0]);
            this.a("\u603b\u4ef7\u683c:" + r2.m[1], 120, 145, 17, 16646090, this.a[0]);
            this.a("\u786e\u5b9a\u51fa\u552e\u5417?", 120, 171, 17, 16646090, this.a[0]);
            this.a(imageArray[27], sArray2[27][46], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
        if (by2 == 3) {
            this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            String[][] stringArrayArray = new String[][]{{"\u51fa\u552e\u6210\u529f"}, {"\u88c5\u5907\u4e2d", "\u65e0\u6cd5\u51fa\u552e"}};
            if (by == 1) {
                this.a(stringArrayArray[by][0], 120, 126, 17, 16646090, this.a[0]);
                this.a(stringArrayArray[by][1], 120, 154, 17, 16646090, this.a[0]);
            } else {
                this.a(stringArrayArray[by][0], 120, 144, 17, 16646090, this.a[0]);
            }
            this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
    }

    public final void a(Image[][] imageArray, int n2, p p2, byte[][][] byArray, byte[] byArray2, byte[][] byArray3, byte[] byArray4, byte[] byArray5, int n3, int n4, int n5, int n6, short[][][] sArray, short[][][][] sArray2) {
        int n7;
        this.a(imageArray[27], sArray2[27][18], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        a.setColor(13673568);
        byte by = 0;
        byte by2 = 0;
        by = 0;
        by2 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        a.setClip(21, 33, 202, 206);
        for (n7 = 0; n7 < byArray2.length; n7 += 4) {
            by = byArray5[byArray2[n7] << 1];
            by2 = byArray5[(byArray2[n7] << 1) + 1];
            a.setColor(0xFFFFFF);
            a.fillRect(113 + (byArray2[n7 + 1] - n5 << 4) - 2, 142 - (byArray2[n7 + 2] - n6 + by2 << 4) - 2, (by << 4) + 4, (by2 << 4) + 4);
        }
        for (n7 = 0; n7 < byArray2.length; n7 += 4) {
            by = byArray5[byArray2[n7] << 1];
            by2 = byArray5[(byArray2[n7] << 1) + 1];
            a.setColor(0x3F3F3F);
            if (byArray4[n7 / 4] == 1) {
                a.setColor(40764);
            }
            if (byArray4[n7 / 4] == 1) {
                if (g.a((byte)(n7 / 4), byArray[0][this.a.q]) >= 0) {
                    a.setColor(0xFF0000);
                }
                if (g.a((byte)(n7 / 4), byArray[1][this.a.q]) >= 0) {
                    a.setColor(16758528);
                }
                if (g.a((byte)(n7 / 4), byArray[2][this.a.q]) >= 0) {
                    a.setColor(4044011);
                }
            }
            a.fillRect(113 + (byArray2[n7 + 1] - n5 << 4), 142 - (byArray2[n7 + 2] - n6 + by2 << 4), by << 4, by2 << 4);
            if (byArray4[n7 / 4] != 1) continue;
            a.setColor(0xFFFFFF);
            a.drawRect(113 + (byArray2[n7 + 1] - n5 << 4), 142 - (byArray2[n7 + 2] - n6 + by2 << 4), by << 4, by2 << 4);
        }
        for (n7 = 0; n7 < byArray2.length; n7 += 4) {
            for (int i2 = 0; i2 < byArray3[n7 / 4].length; i2 += 3) {
                if (byArray4[n7 / 4] == 0) continue;
                by = byArray3[n7 / 4][i2];
                by2 = byArray3[n7 / 4][i2 + 1];
                if ((byArray3[n7 / 4][i2 + 2] & 8) == 8) {
                    n10 = n8 = 113 + (byArray2[n7 + 1] + by + 1 - n5 << 4);
                    n9 = 142 - (byArray2[n7 + 2] + by2 + 1 - n6 << 4) + 3;
                    n11 = 142 - (byArray2[n7 + 2] + by2 - n6 << 4) - 3;
                    a.setColor(24710);
                    a.drawLine(n8, n9, n10, n11);
                    a.setColor(0xFFFFFF);
                    a.drawLine(n8 - 1, n9, n8 + 1, n9);
                    a.drawLine(n8 - 1, n11, n8 + 1, n11);
                }
                if ((byArray3[n7 / 4][i2 + 2] & 4) == 4) {
                    n10 = n8 = 113 + (byArray2[n7 + 1] + by - n5 << 4);
                    n9 = 142 - (byArray2[n7 + 2] + by2 + 1 - n6 << 4) + 3;
                    n11 = 142 - (byArray2[n7 + 2] + by2 - n6 << 4) - 3;
                    a.setColor(24710);
                    a.drawLine(n8, n9, n10, n11);
                    a.setColor(0xFFFFFF);
                    a.drawLine(n8 - 1, n9, n8 + 1, n9);
                    a.drawLine(n8 - 1, n11, n8 + 1, n11);
                }
                if ((byArray3[n7 / 4][i2 + 2] & 1) == 1) {
                    n8 = 113 + (byArray2[n7 + 1] + by - n5 << 4) + 3;
                    n10 = 113 + (byArray2[n7 + 1] + by + 1 - n5 << 4) - 3;
                    n11 = n9 = 142 - (byArray2[n7 + 2] + by2 + 1 - n6 << 4);
                    a.setColor(24710);
                    a.drawLine(n8, n9, n10, n11);
                    a.setColor(0xFFFFFF);
                    a.drawLine(n8, n9, n8, n11);
                    a.drawLine(n10, n9, n10, n11);
                }
                if ((byArray3[n7 / 4][i2 + 2] & 2) != 2) continue;
                n8 = 113 + (byArray2[n7 + 1] + by - n5 << 4) + 3;
                n10 = 113 + (byArray2[n7 + 1] + by + 1 - n5 << 4) - 3;
                n11 = n9 = 142 - (byArray2[n7 + 2] + by2 - n6 << 4);
                a.setColor(24710);
                a.drawLine(n8, n9, n10, n11);
                a.setColor(0xFFFFFF);
                a.drawLine(n8, n9, n8, n11);
                a.drawLine(n10, n9, n10, n11);
            }
        }
        a.setColor(0xFF0000);
        a.fillRect(113 + ((n3 << 4) / 240 - (n5 << 4)), 320 - ((n4 << 4) / 320 - (n6 << 4)) - 178, 2, 2);
        g.a(113 + ((n3 << 4) / 240 - (n5 << 4)), 320 - ((n4 << 4) / 320 - (n6 << 4)) - 178, this.d, 0xFFFFFF, a);
        this.d += 2;
        if (this.d > 10) {
            this.d = 2;
        }
        if (n2 == 0) {
            k.b(0, 257, 240, 63, 0);
            a.setColor(0xFF0000);
            a.fillRect(2, 276, 12, 12);
            a.setColor(4044011);
            a.fillRect(62, 276, 12, 12);
            a.setColor(16758528);
            a.fillRect(122, 276, 12, 12);
            a.setColor(13673568);
            a.drawString("BOSS", 17, 276, 20);
            a.drawString("\u5b58\u6863", 77, 276, 20);
            a.drawString("\u4f20\u9001", 137, 276, 20);
            a.drawString("\u5f53\u524d\u63a2\u7d22\u5ea6:" + this.a.x[this.a.q] + "%", 120, 319, 33);
            this.a(imageArray[27], sArray2[27][48], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a.a(p2.a[5], 0, 0);
            return;
        }
        if (n2 == 1) {
            this.a("\u63090\u952e\u53ef\u67e5\u770b\u5c0f\u5730\u56fe", 120, 260, 17, 0xFFFFFF, this.a[0]);
        }
    }

    public final void a(Image[] object, byte[][] object2, int n2, p p2, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.a.a(p2.a[3], 120, -160);
        if (this.a.d[73] == true) {
            this.a.a(p2.a[1], 120, -160);
            if (this.a.d[34] > 0) {
                this.a(imageArray[33], sArray2[33][this.b[object2[0][0]]], 120, 160, sArray[33], (byte)1, 0, 0, 0, 0, 240, 320);
            } else {
                this.a(imageArray[33], sArray2[33][this.c[object2[0][0]]], 120, 160, sArray[33], (byte)1, 0, 0, 0, 0, 240, 320);
            }
            this.j = ++this.j >= 2 ? 0 : this.j;
            a.setClip(0, 0, 240, 320);
            if (this.j == 0) {
                a.drawImage(object[5], 240, 318, 40);
            } else {
                a.drawImage(object[6], 240, 318, 40);
            }
            if (n2 == 1) {
                object = this;
                k.b(0, 244, 240, 76, 0);
                k.a(0, 244, 239, 75, 16646090);
                object2 = new String[]{"\u65b0\u6e38\u620f\u4f1a\u6e05\u9664\u65e7\u5b58\u6863", "\u662f\u5426\u786e\u5b9a?"};
                for (n2 = 0; n2 < ((byte[][])object2).length; ++n2) {
                    ((k)object).a((String)object2[n2], 120, 254 + n2 * 22, 17, 16646090, ((k)object).a[0]);
                }
                ((k)object).a("\u662f", 5, 320 - ((k)object).b, 20, 16646090, ((k)object).a[0]);
                ((k)object).a("\u5426", 240 - ((k)object).a - 5, 320 - ((k)object).b, 20, 16646090, ((k)object).a[0]);
            }
        } else {
            this.a.a(p2.a[0], 120, -160);
        }
        this.a.a(p2.a[2], 120, -160);
    }

    public final void a(Image[][] object, p p2, byte by, int n2, short[][][] sArray, short[][][][] sArray2) {
        this.a(object[27], sArray2[27][12], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a.a(p2.a[4], 0, 0);
        object = new String[][]{{"\u5934\u76ee\u623f\u95f4:\u86c7\u602a", "\u63a8\u8350\u7b49\u7ea7:12", "\u57fa\u7840\u653b\u51fb:48~72"}, {"\u5934\u76ee\u623f\u95f4:\u5b88\u95e8\u4eba", "\u63a8\u8350\u7b49\u7ea7:25", "\u57fa\u7840\u653b\u51fb:96~144"}, {"\u5934\u76ee\u623f\u95f4:\u9b54\u672f\u5e08", "\u63a8\u8350\u7b49\u7ea7:31", "\u57fa\u7840\u653b\u51fb:160~240"}, {"\u5934\u76ee\u623f\u95f4:\u4f2f\u7235", "\u63a8\u8350\u7b49\u7ea7:37", "\u57fa\u7840\u653b\u51fb:192~288"}, {"\u5934\u76ee\u623f\u95f4:\u8840\u6c60\u86c7\u602a", "\u63a8\u8350\u7b49\u7ea7:50", "\u57fa\u7840\u653b\u51fb:240~360"}, {"\u5934\u76ee\u623f\u95f4:\u9b54\u754c\u6b7b\u795e", "\u63a8\u8350\u7b49\u7ea7:57", "\u57fa\u7840\u653b\u51fb:288~432"}, {"\u5934\u76ee\u623f\u95f4:\u9b54\u9b3c\u4f2f\u7235", "\u63a8\u8350\u7b49\u7ea7:65", "\u57fa\u7840\u653b\u51fb:240~360"}, {"\u5934\u76ee\u623f\u95f4:\u5730\u72f1\u4f7f\u8005", "\u63a8\u8350\u7b49\u7ea7:90", ""}};
        k.a(object[by - 12][0], 120, 90, 17, a, this.a[0], 16646090, 0);
        k.a(16646090, this.a[0]);
        a.drawString((String)object[by - 12][1], 120, 114, 17);
        if (by >= 1 && by <= 18) {
            a.drawString("\u5934\u76ee\u6389\u843d:", 40, 138, 20);
            this.a((String)((Object)this.a.a[1][0][1][n2]), 120, 162, 17, k.a(n2), this.a[0]);
            this.a((String)object[by - 12][2], 120, 186, 17, 0xFF0000, this.a[0]);
            this.a("\u9b54\u6cd5\uff1a" + (String)((Object)this.a.a[1][0][2][this.a.h[n2][12]]), 120, 210, 17, 4044011, this.a[0]);
        }
    }

    public final void a(int n2) {
        a.setColor(13673568);
        a.setFont(this.a[0]);
        a.setClip(0, 0, 240, 295);
        String[] stringArray = new String[]{"\u606d\u559c\u60a8\u901a\u5173\uff0c\u5730\u72f1\u4f7f\u8005", "\u4e3a\u4f55\u800c\u6765\uff0c\u827e\u7c73\u5229\u4e9a\u7a76", "\u7adf\u5728\u54ea\uff0c\u8fd9\u4e00\u5207\u7684\u8c1c\u56e2", "\u7ec8\u4f1a\u88ab\u89e3\u5f00\uff0c\u6b32\u77e5\u540e\u4e8b", "\u5982\u4f55\uff0c\u8bf7\u7ee7\u7eed\u5173\u6ce8\u534e\u5a31", "\u65e0\u7ebf\u300a\u65a9\u5996\u4f0f\u9b54\u5f554\u300b\u3002"};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.a(stringArray[i2], 120, 160 - (this.b << 2) + this.b * i2, 17, 13673568, this.a[0]);
        }
        if (n2 == 0) {
            k.b(0, 290, 240, 30, 0);
            this.a("\u63090\u952e\u8df3\u8fc7", 120, 295, 17, 0xFFFFFF, this.a[0]);
        }
    }

    public final void a(Image[][] imageArray, byte by, short[][][] sArray, short[][][][] sArray2) {
        k.b(0, 0, 240, 320, 0);
        this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        String[][] stringArrayArray = new String[][]{{"\u6e38\u620f\u7ed3\u675f", "\u662f\u5426\u7ee7\u7eed?"}, {"\u662f\u5426\u4f7f\u7528", "\u590d\u6d3b\u836f\u5242\uff1f"}};
        for (int i2 = 0; i2 < stringArrayArray.length; ++i2) {
            this.a(stringArrayArray[by][i2], 120, 122 + i2 * 24, 17, 16646090, this.a[0]);
        }
        this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
    }

    public final void a(p p2, p p3, short s, short s2, int n2, byte[][] byArray, String[][][][] stringArray, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        if (n2 > 0) {
            this.a(this.a, -20, -30, 24, 0xFF0000, this.a[0]);
            String string = null;
            if (byArray[n2][1] == 0) {
                this.a.a(p2.a[5], (int)this.a.a.m, this.a.a.n + 80);
                return;
            }
            if (byArray[n2][1] == 8) {
                string = stringArray[0][0][byArray[n2][2]][this.a.d[43]];
                if (s > 0) {
                    this.a(imageArray[27], sArray2[27][49], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    if (s2 == 0) {
                        this.a.a(p3.a[6], 0, 0);
                    }
                    k.a(16646090, this.a[0]);
                    k.a(a, string, 16646090, 10, 172, 21, 225, this.a[0]);
                    return;
                }
            } else if (byArray[n2][1] == 9) {
                if (this.a.p[0] == 7) {
                    this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    if (n2 == 128 || n2 == 129) {
                        this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a(imageArray[27], sArray2[27][10], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        for (int i2 = 0; i2 < stringArray[0][1][byArray[n2][2]].length; ++i2) {
                            this.a(stringArray[0][1][byArray[n2][2]][i2], 120, 126 + i2 * 26, 17, 16646090, this.a[0]);
                        }
                    } else if (n2 == 160) {
                        this.a(imageArray[27], sArray2[27][20], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a(imageArray[27], sArray2[27][12], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a("\u7ec3\u7ea7\u533a\u62e5\u67095\u500d\u7ecf\u9a8c\uff01", 120, 90, 17, 16646090, this.a[0]);
                        if (this.a.s[0] == 6) {
                            this.a("\u9002\u540815~30\u7b49\u7ea7", 120, 114, 17, 16646090, this.a[0]);
                        } else if (this.a.s[0] == 14) {
                            this.a("\u9002\u540845~60\u7b49\u7ea7", 120, 114, 17, 16646090, this.a[0]);
                        } else if (this.a.s[0] == 19) {
                            this.a("\u9002\u540870~90\u7b49\u7ea7", 120, 114, 17, 16646090, this.a[0]);
                        }
                        this.a("\u6bcf\u6b21\u8fdb\u5165\u53ef\u4ee5\u62e5\u6709", 120, 138, 17, 16646090, this.a[0]);
                        this.a("5\u5206\u949f\u7684\u7ec3\u7ea7\u65f6\u95f4", 120, 162, 17, 16646090, this.a[0]);
                        this.a("\u9700\u8981\u82b1\u8d39\uff1a" + this.a.a.m[1], 120, 186, 17, 16646090, this.a[0]);
                        this.a("\u662f\u5426\u9a6c\u4e0a\u8fdb\u5165\uff1f", 120, 210, 17, 16646090, this.a[0]);
                    } else if (n2 >= 116 && n2 <= 125) {
                        this.a(imageArray[27], sArray2[27][12], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        int n3 = n2 - 116;
                        this.a("\u83b7\u5f97\u65b0\u6b66\u5668:", 40, 90, 20, 16646090, this.a[0]);
                        this.a(stringArray[1][0][1][n3], 120, 114, 17, k.a(n3), this.a[0]);
                        k.a(a, "\u57fa\u7840\u653b\u51fb" + (int)this.a.f[this.a.d[12]] + "," + stringArray[1][0][3][n3], 16646090, 40, 138, 24, 160, this.a[0]);
                        this.a("\u6ee1\u7ea7\u653b\u51fb\u529b:" + (int)(this.a.f[this.a.d[12]] * 3), 40, 186, 20, 16646090, this.a[0]);
                        this.a("\u662f\u5426\u9a6c\u4e0a\u88c5\u5907\uff1f", 120, 210, 17, 16646090, this.a[0]);
                    }
                    this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    return;
                }
            } else if (byArray[n2][1] >= 1 && byArray[n2][1] <= 6 || byArray[n2][1] == 16 || byArray[n2][1] == 15) {
                int n4 = 0;
                switch (byArray[n2][1]) {
                    case 1: {
                        n4 = 2;
                        break;
                    }
                    case 15: {
                        n4 = 3;
                        break;
                    }
                    case 2: {
                        n4 = 4;
                        break;
                    }
                    case 3: {
                        n4 = 5;
                        break;
                    }
                    case 4: {
                        n4 = 6;
                        break;
                    }
                    case 5: {
                        n4 = 7;
                        break;
                    }
                    case 6: {
                        n4 = 8;
                    }
                }
                if (s == 0) {
                    this.a.a(p3.a[9], 0, 0);
                    return;
                }
                this.a(imageArray[27], sArray2[27][49], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
                if (s2 == 0) {
                    this.a.a(p3.a[6], 0, 0);
                }
                k.a(16646090, this.a[0]);
                if (byArray[n2][1] == 16 && n2 == 167) {
                    k.a(a, (String)this.a.c[this.a.i[10]][0], 16646090, 10, 172, 21, 225, this.a[0]);
                    return;
                }
                int n5 = Short.parseShort(stringArray[n4][byArray[n2][2]][this.a.d[43]][0]);
                if (n5 >= 0) {
                    this.a(imageArray[31], sArray2[31][n5], 0, 320, sArray[31], (byte)1, 0, 0, 0, 0, 240, 320);
                }
                Font font = this.a[0];
                int n6 = 20;
                n6 = 225;
                n6 = 21;
                n6 = 172;
                n6 = 10;
                n5 = 16646090;
                String[][] stringArray2 = stringArray[n4][byArray[n2][2]];
                k k2 = this;
                k.a(a, stringArray2[k2.a.d[43]][1], n5, 10, 172, 21, 225, font);
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, Graphics graphics) {
        Graphics graphics2 = a;
        int[][] nArrayArray = new int[][]{{0, 240, 240, 0}, {0, 0, 320, 320}};
        DirectGraphics directGraphics = DirectUtils.getDirectGraphics((Graphics)graphics2);
        graphics2.setClip(0, 0, 240, 320);
        if (n2 < 255) {
            directGraphics.fillPolygon(nArrayArray[0], 0, nArrayArray[1], 0, 4, (n2 << 24) + n3);
            return;
        }
        graphics2.setColor(n3);
        graphics2.fillRect(0, 0, 240, 320);
    }

    public final int[] a(int n2) {
        Object object = new int[]{0, 0, 0};
        n2 = n2 * 80 / 1000;
        object[0] = n2 / 3600;
        object[1] = (n2 - object[0] * 3600) / 60;
        object[2] = n2 - object[0] * 3600 - object[1] * 60;
        return object;
    }

    private static String a(int n2) {
        return (n2 < 10 ? "0" : "") + n2;
    }

    public final void a(Image[][] imageArray, q q2, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][0], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        a.setFont(this.a[0]);
        a.setClip(0, 0, 240, 320);
        a.setColor(16646090);
        int n2 = 0;
        n2 = this.a[0].stringWidth("\u80cc\u666f\u97f3\u4e50 : ");
        a.drawString("\u8bbe\u7f6e\u9009\u9879", 120, 40, 17);
        a.drawString("\u80cc\u666f\u97f3\u4e50 : ", 46, 150, 20);
        int n3 = n2 + 46;
        n2 = 4;
        int n4 = q.a((byte)1);
        int n5 = 16646090;
        int n6 = 16646090;
        n2 = 150;
        int n7 = n3;
        k k2 = this;
        a.setColor(n5);
        int n8 = 150 + k2.a[0].getHeight() - 3;
        for (n5 = 0; n5 < 4; ++n5) {
            a.drawRect(n7 + n5 * 5, n8 - (n5 + 1 << 2), 4, n5 + 1 << 2);
        }
        a.setColor(n6);
        for (n5 = 0; n5 < n4; ++n5) {
            a.fillRect(n7 + n5 * 5, n8 - (n5 + 1 << 2), 4, n5 + 1 << 2);
        }
        a.setClip(0, 0, 240, 320);
        this.a(imageArray[27], sArray2[27][48], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
    }

    public final void a(Image[][] imageArray, p p2, int n2, int n3, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][0], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        switch (n2) {
            case 0: {
                a.setFont(this.a[0]);
                a.setClip(0, 0, 240, 320);
                a.setColor(16646090);
                String[] stringArray = new String[]{"4,6 --- \u5de6\u53f3\u8dd1\u52a8", "5 --- \u6b66\u5668\u653b\u51fb", "\u653b\u51fb\u4e2d\u6309\u540e\u9000\u53ef\u95ea\u907f", "2 --- \u5411\u4e0a\u8df3\u8dc3", "1,3 --- \u5de6\u53f3\u659c\u8df3", "\u5728\u7a7a\u4e2d\u53ef\u4ee5\u4e8c\u6b21\u8df3\u8dc3", "9 --- \u4f7f\u7528\u9b54\u6cd5", "8 --- \u4e0b\u8e72", "\u53cc\u51fb8\u952e\u53ef\u4ee5\u4e0b\u8df3", "0 --- \u67e5\u770b\u5730\u56fe"};
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    a.drawString(stringArray[i2], 40, 40 + i2 * (this.b - 1), 20);
                }
                break;
            }
            case 1: {
                a.setFont(this.a[0]);
                a.setClip(0, 0, 240, 320);
                a.setColor(16646090);
                String string = "\u7b3c\u7f69\u57ce\u5821\u7684\u6d53\u96fe\u63a9\u76d6\u4e86\u591a\u5c11\u4e0d\u4e3a\u4eba\u77e5\u7684\u771f\u76f8\u3002\u5f02\u57df\u5c0f\u5c9b\u4e0a\u7a76\u7adf\u53d1\u751f\u4e86\u4ec0\u4e48\u9a87\u4eba\u542c\u95fb\u7684\u6545\u4e8b\u3002\u86c7\u602a\uff0c\u6b7b\u795e\uff0c\u5730\u72f1\u4f7f\u8005\u3002\u8fd9\u4e9b\u4f20\u8bf4\u4e2d\u7684\u5996\u9b54\u9b3c\u602a\u4e3a\u4ec0\u4e48\u4f1a\u51fa\u73b0\u3002\u60f3\u8981\u8ffd\u5bfb\u8fd9\u4e00\u5207\u7684\u771f\u76f8\uff0c\u5c31\u548c\u6211\u4eec\u7684\u4e3b\u4eba\u516c\u8499\u5854\u8bfa\u4e00\u8d77\u62ff\u8d77\u6b66\u5668\u6218\u6597\u5427\u3002";
                k.a(a, string, 13673568, 30, 40, this.b, 185, this.a[0]);
            }
        }
        a.setFont(this.a[0]);
        a.setClip(0, 0, 240, 320);
        a.setColor(16646090);
        a.drawString(n2 + 1 + "/" + n3, 120, 320 - this.b, 17);
        this.e = ++this.e > 3 ? 0 : this.e;
        this.a.a(p2.a[13], 0, -(320 - this.b + 2));
        this.a(imageArray[27], sArray2[27][48], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
    }

    public final void a(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][0], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        String[] stringArray = new String[]{"\u65a9\u5996\u4f0f\u9b54\u5f553", "\u53d1\u884c\u5546\uff1a\u817e\u8baf", "\u5ba2\u670d\u7535\u8bdd\uff1a", "0755-83765566", "\u5ba2\u670dEMAIL:", "service@tencent.com", "\u516c\u53f8\u7f51\u7ad9:", "http://www.qq.com", "\u5185\u5bb9\u63d0\u4f9b\u5546", "\u5317\u4eac\u534e\u5a31\u65e0\u7ebf"};
        a.setClip(0, 0, 240, 320);
        a.setFont(this.a[0]);
        a.setColor(16646090);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            a.drawString(stringArray[i2], 120, 40 + (this.b + 2) * i2, 17);
        }
        this.a(imageArray[27], sArray2[27][48], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
    }

    public final void showNotify() {
        this.a.e();
    }

    public final void hideNotify() {
        this.a.d();
    }

    public static int a(int n2) {
        int n3 = 16646090;
        switch (n2) {
            case 0: {
                n3 = 0xFFFFFF;
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                n3 = 6674541;
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                n3 = 4044011;
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                n3 = 11689977;
            }
        }
        return n3;
    }

    public static void a(String string, int n2, int n3, int n4, Graphics graphics, Font object, int n5, int n6) {
        int n7 = graphics.getColor();
        graphics.setFont(object);
        graphics.setClip(0, 0, 240, 320);
        object = new int[][]{{0, 1}, {1, 0}};
        graphics.setColor(n6);
        for (n6 = 0; n6 < ((Font)object).length; ++n6) {
            graphics.drawString(string, n2 + object[n6][0], n3 + object[n6][1], n4);
        }
        graphics.setColor(n5);
        graphics.drawString(string, n2, n3, n4);
        graphics.setColor(n7);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(Graphics graphics, String object, int n2, int n3, int n4, int n5, int n6, Font font) {
        void var9_12;
        char[] cArray = new char[]{'\uff0c', '\u3002', '\uff01', '\uff1f', '\u2026', '\u2014', ',', '.', '!', '?'};
        boolean c2 = false;
        int n7 = 0;
        boolean bl = false;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int[] nArray = new int[]{n2, 0xFF0000, 5302767};
        n9 = 0;
        int n11 = 0;
        Object object2 = object;
        StringBuffer stringBuffer = new StringBuffer();
        graphics.setColor(n2);
        graphics.setFont(font);
        graphics.setClip(0, 0, 240, 320);
        while ((n9 = ((String)object2).indexOf("#")) != -1) {
            if (((String)object2).charAt(n9 + 1) == 'n') {
                ++n8;
            } else {
                ++var9_12;
            }
            object2 = ((String)object2).substring(0, n9) + ((String)object2).substring(n9 + 2, ((String)object2).length());
        }
        int[][] nArray2 = new int[2][var9_12];
        object2 = new int[n8];
        boolean bl2 = false;
        n8 = 0;
        while ((n9 = ((String)object).indexOf("#")) != -1) {
            if (((String)object).charAt(n9 + 1) == 'n') {
                object2[n8] = n9;
                ++n8;
            } else {
                void var9_14;
                nArray2[0][var9_14] = n9;
                nArray2[1][var9_14] = Integer.parseInt(((String)object).substring(n9 + 1, n9 + 2));
                ++var9_14;
            }
            object = ((String)object).substring(0, n9) + ((String)object).substring(n9 + 2, ((String)object).length());
        }
        object = ((String)object).toCharArray();
        for (n9 = 0; n9 < ((Object)object).length; ++n9) {
            Object object3 = object[n9];
            if (g.a(n9, nArray2[0]) >= 0) {
                if (stringBuffer.length() > 0) {
                    graphics.drawString(stringBuffer.toString(), n3 + n7, n4 + n10 * n5, 24);
                    stringBuffer.delete(0, stringBuffer.length());
                }
                graphics.setColor(nArray[nArray2[1][n11]]);
                ++n11;
            }
            if (g.a(n9, (int[])object2) >= 0 && n7 != 0) {
                if (stringBuffer.length() > 0) {
                    graphics.drawString(stringBuffer.toString(), n3 + n7, n4 + n10 * n5, 24);
                    stringBuffer.delete(0, stringBuffer.length());
                }
                n7 = 0;
                ++n10;
            }
            if (n7 + font.charWidth((char)object3) >= n6) {
                if (n9 != ((Object)object).length - 1 && g.a((char)object[n9], cArray) >= 0) {
                    stringBuffer.append((char)object[n9]);
                    graphics.drawString(stringBuffer.toString(), n3 + (n7 += font.charWidth((char)object3)), n4 + n10 * n5, 24);
                    ++n10;
                    n7 = 0;
                    stringBuffer.delete(0, stringBuffer.length());
                    continue;
                }
                graphics.drawString(stringBuffer.toString(), n3 + n7, n4 + n10 * n5, 24);
                ++n10;
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append((char)object[n9]);
                n7 = 0 + font.charWidth((char)object3);
                continue;
            }
            stringBuffer.append((char)object3);
            n7 += font.charWidth((char)object3);
            if (n9 < ((Object)object).length - 1) continue;
            graphics.drawString(stringBuffer.toString(), n3 + n7, n4 + n10 * n5, 24);
        }
    }

    public final void b() {
        if (this.a.q[0] == 11 && this.a.d[this.a.e] == 24 || this.a.q[0] == 28) {
            this.d[0] = 120;
            this.d[1] = this.a * ((String)((Object)this.a.a[1][0][7][this.a.g[this.a.c[this.a.e][this.a.p[this.a.e]][0]]])).length();
        }
        if (this.a.q[0] == 11 && this.a.d[this.a.e] == 25) {
            int[][] nArrayArray = new int[][]{{4, 4}, {5, 4}, {44, 3}, {22, 3}, {10, 3}, {3, 4}, {4, 4}, {4, 4}, {4, 4}, {4, 4}, {4, 4}};
            int[][] nArrayArray2 = nArrayArray;
            if (nArrayArray[this.a.i[this.a.c[this.a.e][this.a.p[this.a.e]][0]]][0] > nArrayArray2[this.a.i[this.a.c[this.a.e][this.a.p[this.a.e]][0]]][1]) {
                this.e[0] = 30;
                this.e[1] = nArrayArray2[this.a.i[this.a.c[this.a.e][this.a.p[this.a.e]][0]]][0] * 24;
            }
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7, String string, int n8) {
        int n9 = a.getClipX();
        int n10 = a.getClipY();
        int n11 = a.getClipWidth();
        int n12 = a.getClipHeight();
        int n13 = a.getColor();
        a.setClip(n3, n4, n5, n6);
        a.setColor(n8);
        if (n2 == 0) {
            a.drawString(string, n7 + n5 - this.d[0], n4, 20);
        } else if (n2 == 1) {
            a.drawString(string, n3, n7 + n6 - this.e[0], 20);
        }
        a.setClip(n9, n10, n11, n12);
        a.setColor(n13);
    }

    public final void a(Image[][] imageArray, byte[][] object, int[] nArray, byte[] byArray, p p2, short[][] sArray, byte by, byte by2, byte[][] byArray2, r r2, String[][] stringArray, short[][][] sArray2, short[][][][] sArray3) {
        block47: {
            block46: {
                block45: {
                    if (by == 0 || by == 3 && by2 >= 1 && by2 <= 5 || by == 2 && by2 == 1) {
                        this.a(imageArray[27], sArray3[27][8], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a("\u8bf7\u9009\u62e9\u4e00\u4e2a\u9644\u9b54\u4f4d\u7f6e:", 32, 70, 20, 16646090, this.a[0]);
                        this.a(imageArray[28], sArray3[28][this.a.v[r2.f]], 24, 228, sArray2[28], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a(stringArray[1][r2.f], 94, 96, 17, k.a(r2.f), this.a[0]);
                        this.a("\u653b:" + (int)(this.a.f[r2.a] * this.a.b[r2.b] / 100), 158, 96, 20, 16646090, this.a[0]);
                        this.a("\u7b49\u7ea7:" + object[r2.a][2], 32, 122, 20, 16646090, this.a[0]);
                        this.a("\u719f\u7ec3:" + (object[r2.a][2] < 4 ? nArray[r2.a] + "/" + this.a.b((int)object[r2.a][1], (int)object[r2.a][2]) : "----"), 106, 122, 20, 16646090, this.a[0]);
                        this.a(imageArray[27], sArray3[27][21], 0, 320 - (144 + 26 * byArray2[0][1]), sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        for (int i2 = 0; i2 < 3; ++i2) {
                            if (object[r2.a][3 + (i2 << 1)] == -1) {
                                this.a(imageArray[28], sArray3[28][43], 43, 320 - (144 + i2 * 26), sArray2[28], (byte)1, 0, 0, 0, 0, 240, 320);
                                this.a("\u672a\u5f00\u542f", 70, 146 + i2 * 26, 20, 16646090, this.a[0]);
                                continue;
                            }
                            if (object[r2.a][3 + (i2 << 1)] == 0) {
                                this.a(imageArray[28], sArray3[28][43], 43, 320 - (144 + i2 * 26), sArray2[28], (byte)1, 0, 0, 0, 0, 240, 320);
                                this.a("\u65e0\u9644\u9b54", 70, 146 + i2 * 26, 20, 16646090, this.a[0]);
                                continue;
                            }
                            this.a(imageArray[28], sArray3[28][this.a.w[object[r2.a][3 + i2 * 2 + 1]]], 43, 320 - (144 + i2 * 26), sArray2[28], (byte)1, 0, 0, 0, 0, 240, 320);
                            this.a(stringArray[6][object[r2.a][3 + (i2 << 1) + 1]], 70, 146 + i2 * 26, 20, 16646090, this.a[0]);
                        }
                        if (object[r2.a][3 + (byArray2[0][1] << 1)] == 1) {
                            this.a(stringArray[0][object[r2.a][3 + 2 * byArray2[0][1] + 1]], 33, 222, 20, 16646090, this.a[0]);
                            k.a(16646090, this.a[0]);
                            this.a(0, 33, 248, 174, 26, 33, stringArray[7][object[r2.a][3 + 2 * byArray2[0][1] + 1]], 16646090);
                            this.d[0] = this.d[0] + 2;
                            if (this.d[0] >= this.d[1] + 240 - 66) {
                                this.d[0] = 0;
                            }
                        }
                        this.a("\u63090\u952e\u6e05\u7a7a\u9644\u9b54", 120, 276, 17, 16646090, this.a[0]);
                        this.a(imageArray[27], sArray3[27][17], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    } else if (by == 1 || by == 2 || by == 3) {
                        this.a(imageArray[27], sArray3[27][9], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a.a(p2.a[0], 0, 0);
                        this.a(imageArray[27], sArray3[27][21], 0, 320 - (67 + 26 * byArray2[1][1]), sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        for (int i3 = 0; i3 < 3; ++i3) {
                            this.a(imageArray[28], sArray3[28][this.a.w[byArray[byArray2[1][2] + i3]]], 25, 320 - (67 + i3 * 26), sArray2[28], (byte)1, 0, 0, 0, 0, 240, 320);
                            if (i3 == byArray2[1][1]) {
                                k.a(stringArray[6][byArray[byArray2[1][2] + i3]], 103, 69 + i3 * 26, 17, a, this.a[0], sArray[byArray[byArray2[1][2] + i3]][0] == 1 ? 16646090 : 0xFF0000, 0);
                            } else {
                                this.a(stringArray[6][byArray[byArray2[1][2] + i3]], 103, 69 + i3 * 26, 17, sArray[byArray[byArray2[1][2] + i3]][0] == 1 ? 16646090 : 0xFF0000, this.a[0]);
                            }
                            this.a(sArray[byArray[byArray2[1][2] + i3]][0] == 1 ? "\u5df2\u83b7" : "\u9501\u5b9a", 151, 69 + i3 * 26, 20, 16646090, this.a[0]);
                        }
                        this.a(imageArray, 200, 49, (int)byArray2[1][0], byArray.length, sArray2, sArray3);
                        this.a(stringArray[0][byArray[byArray2[1][0]]], 120, 172, 17, 16646090, this.a[0]);
                        String string = "";
                        k.a(16646090, this.a[0]);
                        this.a(0, 33, 198, 174, 26, 33, stringArray[7][byArray[byArray2[1][0]]], 16646090);
                        this.d[0] = this.d[0] + 2;
                        if (this.d[0] >= this.d[1] + 240 - 66) {
                            this.d[0] = 0;
                        }
                        k.a(16646090, this.a[0]);
                        if (sArray[byArray[byArray2[1][0]]][0] == 1) {
                            a.drawString("\u82b1\u8d39\u91d1\u5e01:" + this.a.a((int)this.a.a.b, k.a(this.a.a.f), (int)byArray[byArray2[1][0]]), 33, 224, 20);
                            a.drawString("\u62e5\u6709\u91d1\u5e01:" + this.a.a.m[0], 33, 250, 20);
                        } else {
                            a.setColor(65535);
                            a.drawString("\u6761\u4ef6:" + stringArray[9][byArray[byArray2[1][0]]], 33, 224, 20);
                            switch (byArray[byArray2[1][0]]) {
                                case 1: {
                                    string = "\u5f53\u524d\u653b\u51fb\u529b:" + r2.b[1];
                                    break;
                                }
                                case 4: 
                                case 7: 
                                case 9: 
                                case 15: {
                                    string = "\u5c1a\u672a\u51fb\u8d25";
                                    break;
                                }
                                case 2: {
                                    object = this.a((int)this.a.i[8]);
                                    string = "\u5f53\u524d\u65f6\u95f4:" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2";
                                    break;
                                }
                                case 5: {
                                    object = this.a((int)this.a.i[7]);
                                    string = "\u5f53\u524d\u65f6\u95f4:" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2";
                                    break;
                                }
                                case 8: {
                                    object = this.a((int)this.a.i[6]);
                                    string = "\u5f53\u524d\u65f6\u95f4:" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2";
                                    break;
                                }
                                case 17: {
                                    object = this.a((int)this.a.i[5]);
                                    string = "\u5f53\u524d\u65f6\u95f4:" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2";
                                    break;
                                }
                                case 10: 
                                case 11: {
                                    string = "\u5f53\u524d\u6740\u654c\u6570\u91cf:" + this.a.u[0];
                                    break;
                                }
                                case 3: {
                                    string = "\u5f53\u524d\u9b54\u529b\u4e0a\u9650:" + r2.d[1];
                                    break;
                                }
                                case 13: {
                                    string = "\u5f53\u524d\u89d2\u8272\u7b49\u7ea7:" + r2.f[0];
                                    break;
                                }
                                case 16: {
                                    string = "\u5f53\u524d\u91d1\u5e01\u91cf:" + r2.m[0];
                                    break;
                                }
                                case 14: {
                                    object = this.a(this.a.t[1]);
                                    string = "\u5f53\u524d\u65f6\u95f4:" + this.a.t[0] + "\u65f6" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2";
                                }
                            }
                            a.drawString(string, 33, 250, 20);
                        }
                    }
                    if (by != 1 || by2 != 1) break block45;
                    this.a(imageArray[27], sArray3[27][20], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    this.a(imageArray[27], sArray3[27][10], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    this.a("\u4f60\u53ef\u4ee5\u968f\u65f6\u53bb\u627e\u9884", 120, 126, 17, 16646090, this.a[0]);
                    this.a("\u8a00\u5e08\u6765\u7ed9\u6b66\u5668\u9644\u9b54", 120, 156, 17, 16646090, this.a[0]);
                    break block46;
                }
                if (by == 2) {
                    this.a(imageArray[27], sArray3[27][20], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    if (by2 == 0) {
                        this.a(imageArray[27], sArray3[27][11], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a("\u60a8\u5bf9\u5f53\u524d\u6b66\u5668\u9644\u52a0\u4e86", 120, 95, 17, 16646090, this.a[0]);
                        this.a(stringArray[6][byArray[byArray2[1][0]]], 120, 119, 17, 0xFFFFFF, this.a[0]);
                        this.a(stringArray[0][byArray[byArray2[1][0]]], 120, 143, 17, 0xFFFFFF, this.a[0]);
                        this.a("\u786e\u5b9a\u82b1\u8d39" + this.a.a((int)this.a.a.b, k.a(r2.f), (int)byArray[byArray2[1][0]]) + "\uff1f", 120, 167, 17, 16646090, this.a[0]);
                    } else if (by2 == 1) {
                        this.a(imageArray[27], sArray3[27][10], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        this.a("\u6b66\u5668\u4f1a\u5931\u53bb\u6240\u6709", 120, 126, 17, 16646090, this.a[0]);
                        this.a("\u7684\u9644\u9b54\uff0c\u786e\u5b9a\u5417\uff1f", 120, 156, 17, 16646090, this.a[0]);
                    }
                    this.a(imageArray[27], sArray3[27][16], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    this.a(imageArray[27], sArray3[27][48], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    return;
                }
                if (by != 3) break block47;
                this.a(imageArray[27], sArray3[27][20], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], sArray3[27][10], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                if (by2 == 0) {
                    this.a("\u9644\u9b54\u6210\u529f\uff01", 120, 140, 17, 16646090, this.a[0]);
                } else if (by2 == 1) {
                    this.a("\u91d1\u94b1\u4e0d\u8db3\uff01", 120, 140, 17, 16646090, this.a[0]);
                } else if (by2 == 2) {
                    this.a("\u6e05\u7a7a\u6210\u529f\uff01", 120, 140, 17, 16646090, this.a[0]);
                } else if (by2 == 3) {
                    this.a("\u8be5\u4f4d\u7f6e\u5df2\u6709\u9644\u9b54\uff01", 120, 140, 17, 16646090, this.a[0]);
                } else if (by2 == 4) {
                    this.a("\u6b66\u5668\u7b49\u7ea7\u4e0d\u8db3\uff01", 120, 140, 17, 16646090, this.a[0]);
                } else if (by2 == 5) {
                    this.a("\u9644\u9b54\u672a\u5f00\u542f\uff01", 120, 140, 17, 16646090, this.a[0]);
                }
            }
            this.a(imageArray[27], sArray3[27][16], 0, 320, sArray2[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
    }

    public final void a(Image[][] imageArray, int n2, int n3, int n4, String[][] object, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][0], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        if (n2 >= 5 && n2 <= 6) {
            this.a(imageArray[28], sArray2[28][this.a.v[this.a.d[85]]], 25, 275, sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a((String)((Object)this.a.a[1][0][1][this.a.d[85]]), 55, 48, 20, k.a((int)this.a.d[85]), this.a[0]);
            this.a("\u653b:" + (int)(this.a.a[this.a.d[85]][0] * this.a.b[this.a.q][0][1][6] * this.a.b[4] / 10000), 55 + this.a * 5, 48, 20, 16646090, this.a[0]);
            this.a("\u9644\u9b54:", 25, 70, 20, 16646090, this.a[0]);
            for (int i2 = 0; i2 < 3; ++i2) {
                this.a(imageArray[28], sArray2[28][this.a.w[this.a.b[this.a.q][0][1][i2 + 7]]], 25 + (this.a << 1) + 5, 320 - (70 + i2 * 22 - 3), sArray[28], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a((String)((Object)this.a.a[1][0][0][this.a.b[this.a.q][0][1][i2 + 7]]), 25 + (this.a << 1) + 5 + 30, 70 + i2 * 22, 20, 16646090, this.a[0]);
            }
            k.a(16646090, this.a[0]);
            a.drawString("(\u4f60\u73b0\u5728\u7684\u6b66\u5668\u653b\u51fb:" + (int)(this.a.f[this.a.a.a] * this.a.b[this.a.a[this.a.a.a][2]] / 100), 25, 136, 20);
            a.drawString("\u53ea\u9700" + (int)this.a.b[n2][2] + "\u5143\uff0c\u60a8\u5c31\u53ef\u4ee5\u83b7\u5f97:", 25, 158, 20);
            if (n2 == 10) {
                a.drawString("\u672c\u6e38\u620f\u6700\u5f3a\u7684\u6b66\u5668!", 25, 180, 20);
            } else {
                a.drawString("\u8fd9\u628a\u5f3a\u5927\u7684\u6b66\u5668!", 25, 180, 20);
            }
            a.drawString("\u8d44\u8d39" + (int)this.a.b[n2][1] + "\u5143/\u6761\uff0c\u4e0d\u542b\u901a\u4fe1\u8d39", 25, 202, 20);
            this.a("\u60a8\u8fd8\u9700\u7834\u89e3" + n4 + "\u6761,\u5171" + (int)(this.a.b[n2][2] / this.a.b[n2][1]) + "\u6761", 25, 224, 20, 0xFF0000, this.a[0]);
        } else {
            if (n2 == 1 || n2 == 3) {
                this.a(imageArray[27], sArray2[27][21], 0, 231, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            } else if (n2 == 2 || n2 == 4) {
                this.a(imageArray[27], sArray2[27][21], 0, 209, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            }
            k.a(16646090, this.a[0]);
            for (int i3 = 0; i3 < object[n2].length; ++i3) {
                a.drawString(object[n2][i3], 25, 48 + i3 * 22, 20);
            }
            this.a("\u60a8\u8fd8\u9700\u7834\u89e3" + n4 + "\u6761,\u5171" + (int)(this.a.b[n2][2] / this.a.b[n2][1]) + "\u6761", 25, 48 + object[n2].length * 22, 20, 0xFF0000, this.a[0]);
        }
        this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        int n5 = n3;
        object = sArray2;
        short[][][] sArray3 = sArray;
        n3 = n4;
        n2 = n5;
        switch (n2) {
            case 1: {
                this.a(imageArray[27], (short[][])object[27][20], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], (short[][])object[27][10], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a("\u7834\u89e3\u4e2d...", 120, 132, 17, 16646090, this.a[0]);
                return;
            }
            case 2: {
                this.a(imageArray[27], (short[][])object[27][20], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], (short[][])object[27][10], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a("\u8d2d\u4e70\u6210\u529f", 120, 132, 17, 16646090, this.a[0]);
                this.a(imageArray[27], (short[][])object[27][16], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                return;
            }
            case 3: {
                this.a(imageArray[27], (short[][])object[27][20], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], (short[][])object[27][10], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a("\u8d2d\u4e70\u5931\u8d25", 120, 132, 17, 16646090, this.a[0]);
                this.a(imageArray[27], (short[][])object[27][16], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                return;
            }
            case 4: {
                this.a(imageArray[27], (short[][])object[27][20], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], (short[][])object[27][11], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a("\u8d2d\u4e70\u6210\u529f", 120, 116, 17, 16646090, this.a[0]);
                this.a("\u60a8\u8fd8\u9700\u7834\u89e3" + n3 + "\u6761\u4fe1\u606f", 120, 136, 17, 0xFF0000, this.a[0]);
                this.a("\u662f\u5426\u7834\u89e3\uff1f", 120, 156, 17, 16646090, this.a[0]);
                this.a(imageArray[27], (short[][])object[27][16], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                this.a(imageArray[27], (short[][])object[27][47], 0, 320, sArray3[27], (byte)1, 0, 0, 0, 0, 240, 320);
            }
        }
    }

    public final void a(Image[][] imageArray, p p2, byte by, byte[][] byArray, String[][] stringArray, int n2, int n3, int n4, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][0], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        k.a(16646090, this.a[0]);
        if (by == 0) {
            String[] stringArray2 = new String[]{"\u5934\u76ee\u4e00\uff1a\u86c7\u602a", "\u5934\u76ee\u4e8c\uff1a\u6b7b\u795e", "\u5934\u76ee\u4e09\uff1a\u9b54\u672f\u5e08", "\u5934\u76ee\u56db\uff1a\u4f2f\u7235"};
            a.drawString("\u8bf7\u9009\u62e9\u67e5\u770b\u7684\u5934\u76ee", 120, 37, 17);
            a.drawString("28\u952e\u79fb\u52a8,5\u952e\u67e5\u770b", 120, 37 + (stringArray2.length + 3) * 20, 17);
            this.a(imageArray[27], sArray2[27][21], 0, 320 - (76 + byArray[0][0] * 20), sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            for (int i2 = 0; i2 < stringArray2.length; ++i2) {
                a.drawString(stringArray2[i2], 68, 79 + i2 * 20, 20);
            }
            this.a.a(p2.a[12], 0, 0);
            this.a(imageArray[27], sArray2[27][16], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            this.a(imageArray[27], sArray2[27][47], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
            return;
        }
        if (by == 1) {
            for (by = (byte)(n4 * n2); by < (stringArray[byArray[0][0]].length > n4 * (n2 + 1) ? n4 * (n2 + 1) : stringArray[byArray[0][0]].length); by = (byte)(by + 1)) {
                a.drawString(stringArray[byArray[0][0]][by], 30, 37 + (by - n4 * n2) * 19, 20);
            }
            k.a(0xFFFFFF, this.a[0]);
            a.drawString(n2 + 1 + "/" + n3, 120, 320 - this.b, 17);
            this.a.a(p2.a[13], 0, -(320 - this.b + 2));
            this.a(imageArray[27], sArray2[27][48], 0, 320, sArray[27], (byte)1, 0, 0, 0, 0, 240, 320);
        }
    }

    public final void keyPressed(int n2) {
        this.a.a(n2);
        this.a.a(n2, 1);
    }

    public final void keyReleased(int n2) {
        this.a.c();
        this.a.a(n2, 0);
    }

    public final void a(int n2, int[] object, String stringArray, boolean n3, Font font, Image[][] object2, short[][][] object3, short[][][][] sArray) {
        int n4 = 271;
        n4 = 214;
        n4 = 26;
        n4 = 13;
        short[][] sArray2 = object3[27];
        n4 = 27;
        Image[] imageArray = object2[27];
        short s = sArray2[27][3];
        short s2 = sArray2[27][4];
        a.setClip(13, 26, 215, 272);
        for (int i2 = 0; i2 <= 271 / s2; ++i2) {
            for (int i3 = 0; i3 <= 214 / s; ++i3) {
                g.a(a, imageArray[sArray2[27][0]], 13 + i3 * s, 26 + i2 * s2, 20, 0, sArray2[27][1], sArray2[27][2], sArray2[27][3], sArray2[27][4]);
            }
        }
        this.a(object2[27], sArray[27][0], 0, 320, object3[27], (byte)1, 0, 0, 0, 0, 240, 320);
        a.setClip(0, 0, 240, 320);
        a.setFont(font);
        a.setColor(0xFFFFFF);
        object2 = new byte[]{0, 1};
        switch (n2) {
            case 40: {
                break;
            }
            case 41: {
                stringArray = new String[]{"\u514d\u8d39\u4e0a\u4f20(\u4e0d\u542b\u901a\u4fe1\u8d39)", "QQ\u6e38\u620f\u79ef\u5206\uff0c\u6311\u6218QQ\u624b", "\u6e38PK\u53f0\uff0cPK\u82f1\u96c4\u699c\uff0c", "\u8d62\u53d6\u5927\u5956\uff01"};
                a.setColor(0xFFFFFF);
                a.drawString("QQ\u6e38\u620f\u79ef\u5206", 120, 0, 17);
                a.drawString("\u7d2f\u8ba1\u6700\u9ad8\u5206:" + object[1] + "\u5206", 120, 40, 17);
                a.drawString("QQ\u6e38\u620f\u79ef\u5206:" + object[1] + "\u5206", 120, 60, 17);
                for (int i4 = 0; i4 < stringArray.length; ++i4) {
                    if (i4 == 0) {
                        a.setColor(0xFF0000);
                    } else {
                        a.setColor(0xFFFFFF);
                    }
                    a.drawString(stringArray[i4], 25, 80 + i4 * 20, 20);
                }
                object = new String[]{"\u514d\u8d39\u4e0a\u4f20", "\u8fd4\u56de\u6e38\u620f"};
                a.setColor(0xFFFFFF);
                a.drawString((String)object[object2[0]], 2, 318, 36);
                a.drawString((String)object[object2[1]], 238, 318, 40);
                break;
            }
            case 42: {
                break;
            }
            case 43: {
                object = new String[]{"\u767b\u9646", "\u53d6\u6d88"};
                stringArray = new String[]{"\u53ef\u767b\u9646QQ\u624b\u6e38PK\u53f0", "\u67e5\u770bQQ\u6e38\u620f\u79ef\u5206\u6392\u540d\u3002"};
                for (n3 = 0; n3 < stringArray.length; ++n3) {
                    a.drawString(stringArray[n3], 30, 40 + n3 * 20, 20);
                }
                a.setColor(0xFFFFFF);
                a.drawString("QQ\u624b\u6e38PK\u53f0", 120, 0, 17);
                a.drawString((String)object[object2[0]], 2, 318, 36);
                a.drawString((String)object[object2[1]], 238, 318, 40);
                break;
            }
            case 44: {
                String[] stringArray2 = new String[]{"\u79ef\u5206\u8bf4\u660e\uff1a", "\u5173\u5361\u89e3\u9501\u5ea6\u5f97\u5206\uff1a", "30x\u5173\u5361\u89e3\u9501\u5ea6", "\u6b66\u5668\u6536\u96c6\u5ea6\u5f97\u5206\uff1a", "30x\u6b66\u5668\u6536\u96c6\u5ea6", "\u9644\u9b54\u6536\u96c6\u5ea6\u5f97\u5206\uff1a", "40x\u9644\u9b54\u6536\u96c6\u5ea6", "\u4e0d\u8db3\u4e00\u5206\u65f6\u820d\u6389", "\u603b\u5206100\u5206\u3002\u8d76\u5feb\u884c\u52a8\uff0c", "\u4e0a\u4f20\u79ef\u5206\uff0c\u8d62\u53d6\u5927\u5956\uff01", "\u6e38\u620f\u5206\u6570\u4e0eQQ\u79ef", "\u5206\u5151\u6362\u6bd4\u4f8b\u4e3a1:1"};
                object = new String[]{"", "\u8fd4\u56de"};
                for (int i5 = 0; i5 < stringArray2.length; ++i5) {
                    a.drawString(stringArray2[i5], 32, 30 + i5 * 20 + 5, 20);
                }
                a.setColor(0xFFFFFF);
                a.drawString("\u79ef\u5206\u5151\u6362\u89c4\u5219", 120, 0, 17);
                a.drawString((String)object[object2[1]], 238, 318, 40);
                break;
            }
            case 45: {
                a.drawString("\u4e0a\u4f20\u79ef\u5206", 120, 0, 17);
                a.drawString("\u8bf7\u8f93\u5165\u60a8\u7684QQ\u53f7\u53c2\u4e0eQQ", 25, 48, 20);
                a.drawString("\u6e38\u620f\u79ef\u5206\u699c\u6392\u540d\u3002", 25, 67, 20);
                a.drawString("QQ\u53f7:", 25, 95, 20);
                a.drawString("*\u53f7\u4e3a\u9000\u683c\u952e", 120, 115, 17);
                object3 = new String[]{"\u786e\u5b9a", "\u53d6\u6d88"};
                a.setColor(0xFFFFFF);
                a.drawString((String)object3[object2[0]], 2, 318, 36);
                a.drawString((String)object3[object2[1]], 238, 318, 40);
                a.setColor(0xFFFFFF);
                a.fillRect(70, 87, 125, 20);
                a.setColor(11033387);
                a.drawString((String)stringArray, 75, 89, 20);
                break;
            }
            case 46: {
                object = new String[]{"", "\u8fd4\u56de"};
                if (n3 != 0) {
                    stringArray = new String[]{"\u606d\u559c\u60a8", "\u79ef\u5206\u5df2\u6210\u529f\u4e0a\u4f20!"};
                    for (n3 = 0; n3 < stringArray.length; ++n3) {
                        a.drawString(stringArray[n3], 120, 50 + n3 * 25, 17);
                    }
                } else {
                    a.drawString("\u79ef\u5206\u4e0a\u4f20\u5931\u8d25!", 120, 140, 17);
                    a.drawString("\u8bf7\u6309\u8fd4\u56de\u952e", 120, 165, 17);
                }
                a.setColor(0xFFFFFF);
                a.drawString((String)object[object2[1]], 238, 318, 40);
            }
        }
        if (n2 != 46) {
            ++this.i;
            this.i = this.i < 8 ? this.i : 0;
            object = null;
            object = this.i < 4 ? (Object)"<<                                    >>" : (Object)"<<                                  >>";
            k.a((String)object, 116, 20, 33, a, font, 0xFFFFFF, 0);
        }
    }

    public final void a(String string) {
        try {
            this.a.platformRequest(string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(Image[] imageArray, int n2) {
        if (this.c < this.k) {
            this.c += 2;
        } else if (this.c >= this.k) {
            if (this.a.i < 2) {
                ++this.a.i;
            } else if (this.a.i >= 2) {
                this.a.i = 0;
            }
            this.c = 0;
        }
        a.setColor(0);
        a.setClip(0, 0, 240, 320);
        a.fillRect(0, 0, 240, 320);
        a.setColor(0xFFFFFF);
        a.setFont(this.a[0]);
        a.drawImage(imageArray[n2], 240 - imageArray[n2].getWidth() >> 1, 40, 0);
        switch (n2) {
            case 0: {
                String[] stringArray = new String[]{"\u65a9\u5996\u4f0f\u9b54\u5f552", "\u5dc5\u5cf0\u52a8\u4f5c\u6e38\u620f\uff01", "\u4f53\u9a8c\u65e0\u5c3d\u723d\u5feb\uff01", "\u514d\u8d39\u4e0b\u8f7d(\u4e0d\u542b\u901a\u4fe1\u8d39)"};
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    a.drawString(stringArray[i2], 120, imageArray[0].getHeight() + 3 + 50 + i2 * 20, 17);
                }
                break;
            }
            case 1: {
                String[] stringArray = new String[]{"\u4e03\u795e\u5668-\u7fbf\u795e\u4e4b\u5f13", "\u5168\u65b0\u6e38\u620f\u6a21\u5f0f\uff01", "\u6311\u6218\u6d77\u91cfBOSS\uff01", "\u514d\u8d39\u4e0b\u8f7d(\u4e0d\u542b\u901a\u4fe1\u8d39)"};
                for (int i3 = 0; i3 < stringArray.length; ++i3) {
                    a.drawString(stringArray[i3], 120, imageArray[1].getHeight() + 3 + 50 + i3 * 20, 17);
                }
                break;
            }
            case 2: {
                String[] stringArray = new String[]{"\u4eb2\u624b\u6253\u9020\u60a8\u7684\u5996\u517d", "\u4eb2\u624b\u878d\u70bc\u60a8\u7684\u6b66\u5668", "\u4fee\u4ed9\u70bc\u5996\u4f20\u95ea\u4eae\u767b\u573a", "\u514d\u8d39\u4e0b\u8f7d(\u4e0d\u542b\u901a\u4fe1\u8d39)"};
                for (int i4 = 0; i4 < stringArray.length; ++i4) {
                    a.drawString(stringArray[i4], 120, imageArray[2].getHeight() + 3 + 50 + i4 * 20, 17);
                }
                break;
            }
        }
        a.setColor(14614564);
        a.fillRect(246 - this.a.a.getWidth() >> 1, 260, this.c * this.l / this.k, 7);
        a.drawImage(this.a.a, 240 - this.a.a.getWidth() >> 1, 260, 0);
        for (int i5 = 0; i5 < 3; ++i5) {
            a.drawImage(this.a.a[i5][1], 60 + i5 * 45, 225, 0);
        }
        a.drawImage(this.a.a[n2][0], 60 + n2 * 45, 225, 0);
        a.setFont(this.a[0]);
        a.setClip(0, 0, 240, 320);
        a.setColor(0xFFFFFF);
        a.drawString("\u514d\u8d39\u4e0b\u8f7d", 2, 318, 36);
        a.drawString("\u9000\u51fa", 238, 318, 40);
        a.setFont(this.a[0]);
        a.setClip(0, 0, 240, 320);
        a.setColor(13673568);
        ++this.j;
        if (this.j > 3) {
            this.j = 0;
        }
        if (this.j < 2) {
            a.drawImage(imageArray[3], 40, 245, 40);
            a.drawImage(imageArray[4], 215, 245, 40);
            return;
        }
        a.drawImage(imageArray[3], 35, 245, 40);
        a.drawImage(imageArray[4], 220, 245, 40);
    }
}


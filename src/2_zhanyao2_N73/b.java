/*
 * Decompiled with CFR 0.152.
 */
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import game.a;
import game.c;
import game.h;
import game.i;
import game.j;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class b
extends FullCanvas
implements j,
Runnable {
    public d d;
    public GameMIDlet m;
    public boolean f;
    static Graphics i;
    int[] n = new int[4];
    int b = 2;
    int k = 0;
    int e;
    int c;
    int j = 0;
    int[] a = new int[]{0, 0};
    int[] l = new int[]{0, 0};
    int g = 0;

    public b(GameMIDlet gameMIDlet) {
        this.m = gameMIDlet;
        this.d = new d(this);
        this.d();
        this.e = game.b.a(game.j.as[0]);
        this.c = game.j.as[0].getHeight();
    }

    public void run() {
        try {
            while (!this.f) {
                long l = this.e();
                this.d.C();
                this.repaint();
                this.serviceRepaints();
                long l2 = this.e();
                if (l2 - l >= (long)d.cr) continue;
                Thread.sleep((long)d.cr - (l2 - l));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.m.destroyApp(true);
    }

    public void a() {
        this.f = true;
    }

    public void paint(Graphics graphics) {
        i = graphics;
        if (i != null) {
            i.setClip(0, 0, 240, 320);
            i.setColor(0);
            i.fillRect(0, 0, 240, 320);
            this.d.n();
        }
    }

    public void b(int n, int n2, int n3, int n4, int n5) {
        i.setClip(n, n2, n3 + 1, n4 + 1);
        i.setColor(n5);
        i.drawRect(n, n2, n3, n4);
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        i.setClip(n, n2, n3 + 1, n4 + 1);
        i.setColor(n5);
        i.fillRect(n, n2, n3, n4);
    }

    public void a(Image image, int n, int n2, int n3, int n4, short[][][] sArray) {
        game.b.a(image, sArray[n][n2][1], sArray[n][n2][2], sArray[n][n2][3], sArray[n][n2][4], n3, n4, 4 | 0x10, 0, i);
    }

    public void a(i i2, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2, short[][][][] sArray3, short[][][] sArray4, short[][][] sArray5, int n, int n2) {
        if ((i2.ag & 0xFFFFFF7F) >= 1 && (i2.ag & 0xFFFFFF7F) < 26 && !((c)i2).K) {
            return;
        }
        int n3 = i2.ag;
        int n4 = i2.ag;
        int n5 = i2.ag;
        int n6 = i2.ao;
        int n7 = -1;
        int n8 = i2.I - n;
        int n9 = 260 - (i2.G - n2);
        byte by = i2.af[0];
        short s = sArray3[n5][by][n6][1];
        int[][] nArray = new int[2][3];
        int[][] nArray2 = null;
        int[] nArray3 = new int[2];
        int[] nArray4 = new int[2];
        int n10 = 0;
        for (int k = 0; k < sArray2[n5][s].length; ++k) {
            int n11;
            n7 = sArray2[n5][s][k][0];
            n10 = k;
            nArray3 = this.d.a(sArray[n5][n7], sArray2[n5][s][n10]);
            nArray4 = this.d.a(sArray[n5][n7], sArray2[n5][s][n10], false);
            nArray = this.d.a(sArray2[n5][s][n10]);
            if (i2.U == 2) {
                nArray3[0] = 0 - (nArray3[0] + nArray4[0]);
                nArray2 = this.d.a(game.b.bx[4], nArray);
            }
            if (n3 == 0 && n7 == 186 && this.d.aF[this.d.ay.d][9] >= 0) {
                byte by2 = this.d.aF[this.d.ay.d][9];
                if (by2 < 0) continue;
                this.a(imageArray[n4], this.d.aB[n3][by2], n8 + nArray3[0] + 0, n9 + nArray3[1] + 30, sArray[n3], i2.U, n, n2, nArray);
                continue;
            }
            if (n3 == 0 && (n7 == 141 || n7 == 142 || n7 == 147 || n7 == 180 || n7 == 179 || n7 == 168) && this.d.aF[this.d.ay.d][9] >= 0 && this.d.ay.d == 9) {
                if (n7 == 141) {
                    n7 = 153;
                } else if (n7 == 142) {
                    n7 = 151;
                } else if (n7 == 147) {
                    n7 = 148;
                } else if (n7 == 180) {
                    n7 = 182;
                } else if (n7 == 179) {
                    n7 = 177;
                } else if (n7 == 168) {
                    n7 = 178;
                }
            }
            if ((n11 = this.d.a(nArray2)) == -1) {
                n11 = this.d.a(nArray);
            }
            i.setClip(n8 + nArray3[0] + 0, n9 + nArray3[1] + 30, nArray4[0], nArray4[1]);
            game.b.a(imageArray[n4][sArray[n5][n7][0]], sArray[n5][n7][1], sArray[n5][n7][2], sArray[n5][n7][3], sArray[n5][n7][4], n8 + nArray3[0] + 0, n9 + nArray3[1] + 30, 4 | 0x10, n11, i);
        }
        if (i2.ag < 0 || i2.ag <= 17) {
            // empty if block
        }
    }

    public void a(int[] nArray, int n, int n2, int n3, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2, short[][][][] sArray3, int n4, int n5) {
        if (nArray[8] == 1) {
            int n6;
            int n7;
            int n8 = nArray[0];
            int n9 = nArray[1];
            int n10 = nArray[2];
            short s = sArray3[n8][n9][n10][1];
            if (nArray[11] == 1) {
                n7 = n;
                n6 = n2;
            } else {
                n7 = n + nArray[5];
                n6 = n2 + nArray[6];
            }
            switch (n3) {
                case 0: {
                    this.a(imageArray[n8], sArray2[n8][s], n7 + 0, n6 - 30, 0, sArray[n8], (byte)1, n4, n5, n8);
                    break;
                }
                case 1: {
                    this.a(imageArray[n8], sArray2[n8][s], n7 + 0, n6 - 30, 1, sArray[n8], (byte)nArray[7], n4, n5, n8);
                }
            }
        }
    }

    public void a(Image[] imageArray, short[][] sArray, int n, int n2, int n3, short[][] sArray2, byte by, int n4, int n5, int n6) {
        int[][] nArray = null;
        switch (n3) {
            case 0: {
                for (int k = 0; k < sArray.length; ++k) {
                    game.b.a(imageArray[sArray2[sArray[k][0]][0]], sArray2[sArray[k][0]][1], sArray2[sArray[k][0]][2], sArray2[sArray[k][0]][3], sArray2[sArray[k][0]][4], sArray[k][1] + n + 0, sArray[k][2] + n2 + 30, 4 | 0x10, sArray[k][3], i);
                }
                break;
            }
            case 1: {
                for (int k = 0; k < sArray.length; ++k) {
                    short s = sArray[k][0];
                    int[] nArray2 = this.d.a(sArray2[s], sArray[k]);
                    int[] nArray3 = this.d.a(sArray2[s], sArray[k], false);
                    int[][] nArray4 = this.d.a(sArray[k]);
                    if (by == 2) {
                        nArray2[0] = 0 - (nArray2[0] + nArray3[0]);
                        nArray = this.d.a(game.b.bx[4], nArray4);
                    }
                    int n7 = n - n4;
                    int n8 = 260 - (n2 - n5);
                    int n9 = this.d.a(nArray);
                    if (n9 == -1) {
                        n9 = this.d.a(nArray4);
                    }
                    i.setClip(n7 + nArray2[0], n8 + nArray2[1], nArray3[0], nArray3[1]);
                    game.b.a(imageArray[sArray2[s][0]], sArray2[s][1], sArray2[s][2], sArray2[s][3], sArray2[s][4], n7 + nArray2[0], n8 + nArray2[1], 4 | 0x10, n9, i);
                }
                break;
            }
        }
    }

    public void a(Image[] imageArray, short[][] sArray, int n, int n2, short[][] sArray2, byte by, int n3, int n4, int[][] nArray) {
        int n5 = -1;
        int n6 = n;
        int n7 = n2;
        int[][] nArray2 = nArray;
        int[][] nArray3 = nArray;
        int[] nArray4 = new int[2];
        int[] nArray5 = new int[2];
        int[] nArray6 = new int[2];
        for (int k = 0; k < sArray.length; ++k) {
            n5 = sArray[k][0];
            nArray4 = this.d.a(sArray2[n5], sArray[k]);
            nArray5 = this.d.a(sArray2[n5], sArray[k], false);
            nArray6 = this.d.a(nArray, nArray5, false);
            nArray2 = this.d.a(sArray[k]);
            nArray4[1] = nArray4[1] * -1;
            nArray4 = this.d.a(nArray, nArray4, false);
            nArray4[1] = nArray4[1] * -1;
            if (this.d.a(nArray) == 7) {
                nArray4[0] = nArray4[0] * -1;
                nArray4[1] = nArray4[1] * -1;
            }
            nArray4 = this.d.b(nArray4, this.d.a(nArray), nArray6[0], nArray6[1]);
            nArray5 = this.d.a(nArray, nArray5, true);
            if (by == 2) {
                nArray4[0] = 0 - (nArray4[0] + nArray5[0]);
                nArray3 = this.d.a(game.b.bx[4], nArray);
            }
            int n8 = this.d.a(this.d.a(nArray3, nArray2));
            i.setClip(n6 + nArray4[0], n7 + nArray4[1], nArray5[0], nArray5[1]);
            game.b.a(imageArray[sArray2[n5][0]], sArray2[n5][1], sArray2[n5][2], sArray2[n5][3], sArray2[n5][4], n6 + nArray4[0], n7 + nArray4[1], 4 | 0x10, n8, i);
        }
    }

    public void a(short[] sArray, Image[] imageArray, int n, int n2, short[][] sArray2, Graphics graphics, int n3, int n4) {
        Graphics graphics2 = graphics == null ? i : graphics;
        int n5 = n / 20;
        int n6 = n2 / 20;
        graphics2.setClip(0, 30, n3, n4);
        for (int k = 0; k < sArray.length; k += 3) {
            int n7;
            if (sArray[k + 2] < 0 || sArray[k] + sArray2[n7 = sArray[k + 2] >> 3][3] / 20 < n5 || sArray[k] > n5 + n3 / 20 || sArray[k + 1] + sArray2[n7][4] / 20 < n6 - 1 - 1 || sArray[k + 1] > n6 + n4 / 20 + 1) continue;
            game.b.a(imageArray[sArray2[n7][0]], sArray2[n7][1], sArray2[n7][2], sArray2[n7][3], sArray2[n7][4], sArray[k] * 20 - n + 0, n4 - (sArray[k + 1] * 20 - n2) + 30, 4 | 0x20, sArray[k + 2] & 7, graphics2);
        }
    }

    public void keyPressed(int n) {
        this.d.h(n);
        this.d.c(n, 1);
    }

    public void keyReleased(int n) {
        this.d.t(n);
        this.d.c(n, 0);
    }

    public void a(Image[] imageArray, int n) {
        i.setClip(0, 0, 240, 320);
        if (imageArray[2] == null && imageArray[1] == null) {
            n = 0;
        }
        if (n == 1 && imageArray[1] == null) {
            n = 2;
        }
        if (n == 2 && imageArray[2] == null) {
            n = 1;
        }
        i.setColor(n == 1 ? 0 : 0xFFFFFF);
        i.fillRect(0, 0, 240, 320);
        if (n == 2 || n == 1) {
            i.drawImage(imageArray[n], 120, 160, 1 | 2);
        } else {
            i.setColor(0xFF0000);
            i.drawString("\u6ca1\u6709\u56fe\u7247", 120, 320 >> 1 + this.g, 1 | 0x10);
        }
    }

    public void a(Image[][] imageArray, int n, int n2, int n3, int n4) {
        int n5 = 132;
        int n6 = 15;
        int n7 = 270;
        i.setClip(0, 0, 240, 320);
        i.setColor(0);
        i.fillRect(0, 0, 240, 320);
        i.setColor(4099287);
        i.fillRect(n6 + 39, n7 + 18, n3 * n5 / n4, 1);
        i.setColor(11720703);
        i.fillRect(n6 + 39, n7 + 19, n3 * n5 / n4, 1);
        i.setColor(1652880);
        i.fillRect(n6 + 39, n7 + 20, n3 * n5 / n4, 1);
        i.drawImage(imageArray[34][0], n6, n7, 0x10 | 4);
    }

    public void a(String[][] stringArray, int n) {
        if (stringArray != null) {
            this.a(0xFFFFFF, game.j.as[0]);
            this.a(i, stringArray[n][0], 0xFFFFFF, 120, 140, this.c + 2, 180, 0x10 | 1, game.j.as[0]);
        }
    }

    public void a(int[] nArray) {
        this.n = nArray;
    }

    public void d() {
        new Thread(this).start();
    }

    public void c() {
        this.f = true;
    }

    protected long e() {
        return System.currentTimeMillis();
    }

    public void a(Image[][] imageArray, i i2, h h2, short s, short s2, short s3, byte[][] byArray, int n, byte[][] byArray2, String[][][][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n2;
        i.setClip(0, 0, 240, 320);
        i.setFont(game.j.as[0]);
        this.a(imageArray[26], sArray2[26][130], 0, 260, 1, sArray[26], (byte)1, 0, 0, 26);
        this.a(105, 15, 78, 4, h2.b[0], h2.b[1], 16760563, 12783632, 0x850000);
        this.a(105, 28, 78, 4, h2.v[0], h2.v[1], 7459823, 1640393, 786809);
        if (h2.b[0] < h2.b[1] * 2 / 5) {
            int n3 = this.j = ++this.j > 1 ? 0 : this.j;
            if (this.j % 2 == 0) {
                this.a(105, 15, 78 * h2.b[0] / h2.b[1], 4, 0xFFFFFF);
            }
        }
        if (this.d.bm[6] > 0 && this.d.bm[6] % 2 == 0) {
            this.a(105, 28, 78 * h2.v[0] / h2.v[1], 4, 0xFFFFFF);
        }
        int n4 = game.j.as[0].stringWidth("" + h2.au[0]);
        this.a("" + h2.au[0], 225 - n4, 42, 0x10 | 4, i, game.j.as[0], 2761505, 16646090);
        this.a(imageArray[26], sArray2[26][358], 225 - n4 - 5, 215, 1, sArray[26], (byte)1, 0, 0, 26);
        this.a("" + h2.a[0], 79, 17, 0x10 | 1, i, game.j.as[0], 2761505, 16646090);
        this.b(imageArray, h2.b[0], h2.b[1], 185, 13, sArray, sArray2);
        this.b(imageArray, h2.v[0], h2.v[1], 185, 26, sArray, sArray2);
        int[] nArray = new int[]{5, 1, 2, 5, 4, 1, 2, 5, 4};
        if (s3 >= 0 && this.d.c != null && this.d.c[0].K) {
            n2 = byArray[s3][1] - 11;
            this.a(186, 293, 49, 22, 0);
            this.a(imageArray[26], sArray2[26][131], 0, -60, 1, sArray[26], (byte)1, 0, 0, 26);
            this.a(imageArray[31], sArray2[31][nArray[n2]], 225, -56, 1, sArray[31], (byte)1, 0, 0, 31);
            this.a(21, 301, 137, 4, this.d.c[0].b[0], this.d.c[0].b[1], 16760563, 12783632, 0x850000);
        } else {
            this.a(imageArray[26], sArray2[26][237], 0, -60, 1, sArray[26], (byte)1, 0, 0, 26);
            if (h2.al >= 4) {
                this.a(78, 307, 109, 4, 1, 1, 16774053, 15443456, 13199111);
            } else {
                this.a(78, 307, 109, 4, this.d.x[h2.i], this.d.f(h2.d, h2.al), 16774053, 15443456, 13199111);
            }
            this.a(78, 294, 109, 4, h2.an[0], h2.an[1], 12189542, 5148928, 2970113);
        }
        if (n > 0 && byArray2[n][1] == 1 && s != 0 && (n2 = (int)Short.parseShort(stringArray[2][byArray2[n][2]][this.d.bm[43]][0])) >= 0) {
            if (n2 == 0) {
                this.a(imageArray[31], sArray2[31][n2], 0, 80, 1, sArray[31], (byte)1, 0, 0, 31);
            } else {
                this.a(imageArray[31], sArray2[31][n2], 240, 80, 1, sArray[31], (byte)1, 0, 0, 31);
            }
        }
        this.f();
    }

    private void b(Image[][] imageArray, int n, int n2, int n3, int n4, short[][][] sArray, short[][][][] sArray2) {
        int n5;
        int n6;
        int n7 = game.b.E(n);
        int n8 = 0;
        int n9 = 5;
        int n10 = 0;
        int n11 = 0;
        n8 = 39;
        n11 = n3;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = n % game.b.G(n7 + 1 - n6) / game.b.G(n7 - n6);
            n11 = n10 = n11 + n9;
            this.a(imageArray[27], sArray2[27][n8 + n5], n10, 260 - n4, 1, sArray[27], (byte)1, 0, 0, 27);
        }
        n11 = n10 = n11 + n9;
        this.a(imageArray[27], sArray2[27][79], n10, 260 - n4, 1, sArray[27], (byte)1, 0, 0, 27);
        n7 = game.b.E(n2);
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = n2 % game.b.G(n7 + 1 - n6) / game.b.G(n7 - n6);
            n11 = n10 = n11 + n9;
            this.a(imageArray[27], sArray2[27][n8 + n5], n10, 260 - n4, 1, sArray[27], (byte)1, 0, 0, 27);
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a(n, n2, n3 * n5 / n6, 1, n7);
        this.a(n, n2 + 1, n3 * n5 / n6, 2, n8);
        this.a(n, n2 + 3, n3 * n5 / n6, 1, n9);
    }

    public void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        int n6 = this.d.cy[35][0].getWidth();
        int n7 = this.d.cy[35][0].getHeight();
        graphics.setClip(n2, n3, n4 + 1, n5 + 1);
        for (int k = 0; k < n5 / n7; ++k) {
            for (int i2 = 0; i2 < n4 / n6; ++i2) {
                graphics.drawImage(this.d.cy[35][0], n2 + i2 * n6, n3 + k * n7, 4 | 0x10);
            }
        }
    }

    public void a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5, int n6, Font font) {
        int[] nArray = new int[]{0, 0};
        int n7 = 0;
        int n8 = n5 / game.b.a(font);
        graphics.setColor(n);
        String string2 = "";
        char[] cArray = new char[]{'\uff0c', '\u3002', '\uff01', '\uff1f', '\u2026', '\u2014'};
        while (nArray[1] < string.length()) {
            nArray[1] = nArray[1] + n8 >= string.length() ? string.length() : (game.b.a(string.charAt(nArray[1] + n8), cArray) >= 0 ? nArray[1] + (n8 + 1) : nArray[1] + n8);
            string2 = string.substring(nArray[0], nArray[1]);
            nArray[0] = nArray[1];
            graphics.drawString(string2, n2, n3 + n4 * n7 + this.g, n6);
            ++n7;
        }
    }

    public void a(Image[][] imageArray, byte[] byArray, byte[] byArray2, short[][][] sArray, short[][][][] sArray2) {
        int n;
        i.setClip(0, 0, 240, 320);
        this.a(i, 2761505, 0, 0, 240, 320);
        String[] stringArray = new String[]{"\u5730\u56fe", "\u653b\u7565", "\u968f\u8eab\u5546\u5e97", "\u7ee7\u7eed\u6e38\u620f", "\u67e5\u770b\u5e2e\u52a9", "\u6e38\u620f\u8bbe\u7f6e", "\u56de\u4e3b\u83dc\u5355"};
        int n2 = 22;
        int n3 = 140;
        int n4 = 320 - stringArray.length * n2 - 30;
        int n5 = n3 - 12;
        int n6 = n4;
        int n7 = 53;
        int n8 = 6;
        for (n = byArray.length - 1; n >= 0; --n) {
            if (n == byArray2[0]) continue;
            this.a(imageArray[27], sArray2[27][36], n3, 260 - (n4 + n2 * n), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(stringArray[n], n3 + n7, n4 + n2 * n + n8, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        }
        for (n = 0; n < byArray.length; ++n) {
            if (n != byArray2[0]) continue;
            this.a(imageArray[27], sArray2[27][36], n5, 260 - (n6 + n2 * n), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(stringArray[n], n5 + n7, n6 + n2 * n + n8, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        }
        if (this.d.aM[0][3] < this.d.aM[0][2]) {
            if (byArray2[0] == 1) {
                this.a("\u6b63\u7248\u6fc0\u6d3b\u540e\u53ef\u67e5\u770b", 120, 320 - this.c, 0x10 | 1, 0xFF0000, game.j.as[0]);
                this.a(stringArray[1], n5 + n7, n6 + n2 * 1 + n8, 0x10 | 1, 0x3F3F3F, game.j.as[0]);
            } else {
                this.a(stringArray[1], n3 + n7, n4 + n2 * 1 + n8, 0x10 | 1, 0x3F3F3F, game.j.as[0]);
            }
        }
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(String string, int n, int n2, int n3, int n4, Font font) {
        this.a(n4, font);
        i.drawString(string, n, n2 + this.g, n3);
    }

    public void a(int n, Font font) {
        i.setColor(n);
        i.setFont(font);
        i.setClip(0, 0, 240, 320);
    }

    public void b(Image[][] imageArray, i i2, byte[] byArray, int n, short[][][] sArray, short[][][][] sArray2) {
        this.a(0, 0, 240, 320, 0);
        this.b(5, imageArray, sArray, sArray2);
        this.a(imageArray[27], 27, sArray[27], 4, 25, 230, 106);
        switch (byArray[n]) {
            case 21: {
                this.a(imageArray[27], sArray2[27][0], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 22: {
                this.a(imageArray[27], sArray2[27][1], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 23: {
                this.a(imageArray[27], sArray2[27][2], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 24: {
                this.a(imageArray[27], sArray2[27][3], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 25: {
                this.a(imageArray[27], sArray2[27][4], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
            }
        }
        String[] stringArray = new String[]{"\u5c5e\u6027", "\u6b66\u5668", "\u9053\u5177", "\u9644\u9b54", "\u6536\u96c6"};
        int n2 = 46;
        int n3 = 8;
        int n4 = 38;
        this.d.a(i2.T[0], 17, -143, 27);
        this.d.a(i2.T[1], 192, -143, 27);
        this.a("\u630946\u952e\u5de6\u53f3\u7ffb\u9875", 120, 142, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        this.a(2761505, game.j.as[0]);
        for (int k = 0; k < byArray.length; ++k) {
            if (k == n) {
                i.drawString(stringArray[k], n2 + n4 * k, n3 - 3 + this.g, 0x10 | 1);
                continue;
            }
            i.drawString(stringArray[k], n2 + n4 * k, n3 + this.g, 0x10 | 1);
        }
    }

    public void a(Image[][] imageArray, int[] nArray, byte[][] byArray, int[] nArray2, byte[] byArray2, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(1, imageArray, sArray, sArray2);
        int n = 88;
        int n2 = 31;
        int n3 = 20;
        int n4 = 49;
        int n5 = 111;
        int n6 = 30;
        int n7 = 175;
        int n8 = 37;
        int n9 = 35;
        int n10 = 20;
        int n11 = 24;
        this.a(25, 49, 50, 60, 919571);
        this.a(imageArray[31], sArray2[31][0], 23, 152, 1, sArray[31], (byte)1, 0, 0, 31);
        this.a(imageArray[27], sArray2[27][24], 20, 221, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a(2761505, game.j.as[0]);
        i.drawString("\u751f\u547d: " + h2.b[0] + "/" + h2.b[1], n, n2 + this.g, 0x10 | 4);
        i.drawString("\u9b54\u529b: " + h2.v[0] + "/" + h2.v[1], n, n2 + n3 + this.g, 0x10 | 4);
        i.drawString("\u7ecf\u9a8c: " + h2.an[0] + "/" + h2.an[1], n, n2 + n3 * 2 + this.g, 0x10 | 4);
        i.drawString("\u653b\u51fb: " + h2.N[1], n, n2 + n3 * 3 + this.g, 0x10 | 4);
        i.drawString("\u9632\u5fa1: " + h2.R[1], n, n2 + n3 * 4 + this.g, 0x10 | 4);
        i.drawString(h2.a[0] + "\u7ea7", n4, n5 + this.g, 0x10 | 1);
        i.drawString("\u6b66\u5668:", n6, n7 + this.g, 0x10 | 4);
        i.drawString("\u653b\u51fb:" + this.d.ch[h2.i] * this.d.bP[h2.al] * (100 + this.d.cz[0]) / 10000, n6 + n8 + n9, n7 + this.g, 0x10 | 4);
        i.drawString("\u7b49\u7ea7:" + h2.al, n6, n7 + n10 + this.g, 0x10 | 4);
        if (h2.al < 4) {
            i.drawString("\u719f\u7ec3:" + nArray2[h2.i] + "/" + this.d.f(h2.d, h2.al), n6 + n8 + n9, n7 + n10 + this.g, 0x10 | 4);
        } else {
            i.drawString("\u719f\u7ec3:----", n6 + n8 + n9, n7 + n10 + this.g, 0x10 | 4);
        }
        i.drawString("\u9644\u9b54: ", n6, n7 + n10 * 2 + this.g, 0x10 | 4);
        this.a(imageArray[28], sArray2[28][this.d.cu[h2.d]], n6 + n8, 260 - (n7 - 3 - 1), 1, sArray[28], (byte)1, 0, 0, 28);
        for (int k = 0; k < 3; ++k) {
            if (byArray[h2.i][3 + 2 * k] > 0) {
                this.a(imageArray[28], sArray2[28][this.d.j[byArray[h2.i][3 + 2 * k + 1]]], n6 + n8, 260 - (n7 - 3 + n10 * 2 + k * n11), 1, sArray[28], (byte)1, 0, 0, 28);
                this.a(stringArray[0][byArray[h2.i][3 + 2 * k + 1]], n6 + n8 + n9, n7 + n10 * 2 + k * n11, 0x10 | 4, 2761505, game.j.as[0]);
                continue;
            }
            this.a(imageArray[28], sArray2[28][47], n6 + n8, 260 - (n7 - 3 + n10 * 2 + k * n11), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a("\u65e0\u9644\u9b54", n6 + n8 + n9, n7 + n10 * 2 + k * n11, 0x10 | 4, 2761505, game.j.as[0]);
        }
    }

    public void a(Image[][] imageArray, byte by, byte by2, i i2, byte[][] byArray, int[] nArray, byte[] byArray2, byte[][] byArray3, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n;
        int n2;
        this.a(2, imageArray, sArray, sArray2);
        int n3 = 26;
        int n4 = 45;
        int n5 = 24;
        int n6 = -1;
        int n7 = -1;
        int n8 = 77;
        int n9 = 65;
        int n10 = 132;
        this.d.a(i2.T[2], 33, -116, 27);
        this.d.a(i2.T[3], 33, -26, 27);
        int n11 = 30;
        int n12 = 172;
        int n13 = 80;
        int n14 = 24;
        int n15 = 200;
        int n16 = 41;
        int n17 = 138;
        int n18 = 25;
        int n19 = 79;
        int n20 = 45;
        this.a(imageArray[27], sArray2[27][30], n8, 260 - n9, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a("\u63095\u952e\u8fdb\u884c\u88c5\u5907", 120, 320 - (this.c - 1), 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        for (n2 = 0; n2 < 3; ++n2) {
            n6 = byArray3[0][0] - 1 + n2;
            if (byArray2.length >= 3) {
                if (n6 < 0) {
                    n6 = byArray2.length - 1;
                } else if (n6 >= byArray2.length) {
                    n6 = 0;
                }
            }
            if (n6 < 0 || n6 >= byArray2.length) continue;
            n7 = byArray[byArray2[n6]][1];
            if (byArray[byArray2[n6]][0] > 0) {
                this.a(imageArray[28], sArray2[28][this.d.cu[n7]], n3, 260 - (n4 + n5 * n2), 1, sArray[28], (byte)1, 0, 0, 28);
                if (byArray2[n6] == h2.i) {
                    i.setClip(0, 0, 240, 320);
                    this.a(stringArray[1][n7], n10, n4 + n5 * n2 + 3, 0x10 | 1, i, game.j.as[0], this.a(n7, 0), 0xFFFFFF);
                } else {
                    this.a(stringArray[1][n7], n10, n4 + n5 * n2 + 3, 0x10 | 1, this.a(n7, 0), game.j.as[0]);
                }
            } else {
                this.a(imageArray[28], sArray2[28][47], n3, 260 - (n4 + n5 * n2), 1, sArray[28], (byte)1, 0, 0, 28);
                this.a("\u65e0", n10, n4 + n5 * n2 + 3, 0x10 | 1, 2761505, game.j.as[0]);
            }
            if (byArray2[n6] != h2.i) continue;
            this.d.a(i2.T[4], n3, -(n4 + n2 * n5), 28);
        }
        this.a(imageArray, n15, n16, (int)byArray3[0][0], byArray2.length, sArray, sArray2);
        this.a(2761505, game.j.as[0]);
        n2 = byArray2[byArray3[0][0]];
        int n21 = 0;
        for (n = 0; n < 3; ++n) {
            if (byArray[n2][3 + n * 2] <= 0 || byArray[n2][3 + n * 2 + 1] < 0 || byArray[n2][3 + n * 2 + 1] > 2) continue;
            n21 += this.d.K[byArray[n2][3 + n * 2 + 1]][1];
        }
        i.drawString("\u7b49\u7ea7:" + byArray[n2][2], n11, n12 + this.g, 0x10 | 4);
        if (byArray[n2][2] < 4) {
            i.drawString("\u719f\u7ec3:" + nArray[n2] + "/" + this.d.f(byArray[n2][1], byArray[n2][2]), n11 + n13, n12 + this.g, 0x10 | 4);
        } else {
            i.drawString("\u719f\u7ec3:----", n11 + n13, n12 + this.g, 0x10 | 4);
        }
        i.drawString("\u653b\u51fb:" + this.d.ch[n2] * this.d.bP[byArray[n2][2]] * (100 + n21) / 10000, n11, n12 + n14 + this.g, 0x10 | 4);
        i.drawString("\u57fa\u7840\u503c:" + this.d.ch[n2], n11 + n13, n12 + n14 + this.g, 0x10 | 4);
        i.drawString("\u9b54\u6cd5\uff1a" + stringArray[2][this.d.aF[byArray[n2][1]][11]], n11, n12 + 2 * n14 + this.g, 0x10 | 4);
        i.drawString("\u9644\u9b54: ", n11, n12 + n14 * 3 + this.g, 0x10 | 4);
        i.drawString(stringArray[3][byArray[n2][1]], n11, n12 + n14 * 4 + this.g, 0x10 | 4);
        for (n = 0; n < 3; ++n) {
            if (byArray[n2][3 + n * 2] > 0) {
                this.a(imageArray[28], sArray2[28][this.d.j[byArray[n2][3 + 2 * n + 1]]], n19 + n20 * n, 260 - (n12 + n14 * 3 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
                continue;
            }
            this.a(imageArray[28], sArray2[28][47], n19 + n20 * n, 260 - (n12 + n14 * 3 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
        }
        if (by == 3) {
            this.a(i, 2761505, 0, 0, 240, 320);
            switch (by2) {
                case 0: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u88c5\u5907\u6210\u529f", 120, n17, 0x10 | 1, 2761505, game.j.as[0]);
                    this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n17 + n18, 0x10 | 1, 2761505, game.j.as[0]);
                    this.a(0, imageArray, sArray, sArray2);
                    break;
                }
                case 1: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u5df2\u88c5\u5907", 120, n17, 0x10 | 1, 2761505, game.j.as[0]);
                    this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n17 + n18, 0x10 | 1, 2761505, game.j.as[0]);
                    this.a(0, imageArray, sArray, sArray2);
                }
            }
        }
    }

    public void a(Image[][] imageArray, byte by, i i2, byte[] byArray, byte[][] byArray2, int[] nArray, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        if (byArray[byArray2[0][0]] >= 3 && byArray[byArray2[0][0]] <= 8) {
            this.a("\u63095\u952e\u4f7f\u7528\u9053\u5177", 120, 320 - (this.c - 1), 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a(2, imageArray, sArray, sArray2);
        } else {
            this.a(1, imageArray, sArray, sArray2);
        }
        int n = 26;
        int n2 = 45;
        int n3 = 25;
        int n4 = -1;
        int n5 = -1;
        int n6 = 88;
        int n7 = 65;
        this.d.a(i2.T[2], 33, -116, 27);
        this.d.a(i2.T[3], 33, -26, 27);
        int n8 = 56;
        int n9 = 143;
        int n10 = 200;
        int n11 = 41;
        int n12 = 138;
        int n13 = 25;
        int n14 = 138;
        int n15 = 25;
        int n16 = 30;
        int n17 = 172;
        int n18 = 20;
        this.a(imageArray[27], sArray2[27][30], n6, 260 - n7, 1, sArray[27], (byte)1, 0, 0, 27);
        for (int k = 0; k < 3; ++k) {
            n4 = byArray2[0][0] - 1 + k;
            if (byArray.length >= 3) {
                if (n4 < 0) {
                    n4 = byArray.length - 1;
                } else if (n4 >= byArray.length) {
                    n4 = 0;
                }
            }
            if (n4 < 0 || n4 >= byArray.length) continue;
            this.a(imageArray[28], sArray2[28][this.d.aW[byArray[n4]]], n, 260 - (n2 + n3 * k), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(" X" + this.d.bA[byArray[n4]], n8, n2 + n3 * k + 3, 0x10 | 4, 2761505, game.j.as[0]);
            if (n4 == byArray2[0][0]) {
                i.setClip(0, 0, 240, 320);
                this.a(stringArray[4][byArray[n4]], n9, n2 + n3 * k + 3, 0x10 | 1, i, game.j.as[0], 2761505, 0xFFFFFF);
                continue;
            }
            this.a(stringArray[4][byArray[n4]], n9, n2 + n3 * k + 3, 0x10 | 1, 2761505, game.j.as[0]);
        }
        this.a(imageArray, n10, n11, (int)byArray2[0][0], byArray.length, sArray, sArray2);
        this.a(2761505, game.j.as[0]);
        this.a(i, stringArray[5][byArray[byArray2[0][0]]], 2761505, n16, n17, n18, 240 - n16 * 2, 0x10 | 4, game.j.as[0]);
        if (by == 2) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a("\u786e\u5b9a\u4f7f\u7528", 120, n12, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(stringArray[4][byArray[byArray2[0][0]]] + "?", 120, n12 + n13, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(2, imageArray, sArray, sArray2);
        }
        if (by == 3) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            if (this.d.ba == 0) {
                switch (byArray[byArray2[0][0]]) {
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a("\u751f\u547d\u56de\u590d\u81f3", 120, n14, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("" + this.d.ay.b[0] + "/" + this.d.ay.b[1], 120, n14 + n15, 0x10 | 1, 2761505, game.j.as[0]);
                        break;
                    }
                    case 6: {
                        this.a("\u9b54\u529b\u56de\u590d\u81f3", 120, n14, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("" + this.d.ay.v[0] + "/" + this.d.ay.v[1], 120, n14 + n15, 0x10 | 1, 2761505, game.j.as[0]);
                        break;
                    }
                    case 7: {
                        this.a("30\u79d2\u5185\u9b54\u529b\u65e0\u9650", 120, n14, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n14 + n15, 0x10 | 1, 2761505, game.j.as[0]);
                    }
                }
            } else if (this.d.ba == 1) {
                switch (byArray[byArray2[0][0]]) {
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a("\u751f\u547d\u503c\u5df2\u6ee1", 120, n14, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n14 + n15, 0x10 | 1, 2761505, game.j.as[0]);
                        break;
                    }
                    case 6: {
                        this.a("\u9b54\u529b\u503c\u5df2\u6ee1", 120, n14, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n14 + n15, 0x10 | 1, 2761505, game.j.as[0]);
                        break;
                    }
                    case 8: {
                        this.a("\u5df2\u5728\u68a6\u5883\u4e2d", 120, n14, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("\u65e0\u6cd5\u4f7f\u7528", 120, n14 + n15, 0x10 | 1, 2761505, game.j.as[0]);
                    }
                }
            }
            this.a(0, imageArray, sArray, sArray2);
        }
    }

    public void a(Image[][] imageArray, i i2, byte[] byArray, byte[] byArray2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 26;
        int n2 = 45;
        int n3 = 25;
        int n4 = -1;
        byte by = -1;
        int n5 = 49;
        int n6 = 65;
        this.d.a(i2.T[2], 102, -116, 27);
        this.d.a(i2.T[3], 102, -26, 27);
        int n7 = 110;
        int n8 = 200;
        int n9 = 41;
        int n10 = 30;
        int n11 = 172;
        int n12 = 24;
        int n13 = 120;
        int n14 = 30;
        this.a(1, imageArray, sArray, sArray2);
        this.a(imageArray[27], sArray2[27][26], n5, 260 - n6, 1, sArray[27], (byte)1, 0, 0, 27);
        for (int k = 0; k < 3; ++k) {
            n4 = byArray2[0] - 1 + k;
            if (byArray.length >= 3) {
                if (n4 < 0) {
                    n4 = byArray.length - 1;
                } else if (n4 >= byArray.length) {
                    n4 = 0;
                }
            }
            if (n4 < 0 || n4 >= byArray.length) continue;
            by = byArray[n4];
            if (by == byArray[byArray2[0]]) {
                i.setClip(0, 0, 240, 320);
                this.a(stringArray[10][by], n7, n2 + n3 * k + 3, 0x10 | 1, i, game.j.as[0], 2761505, 0xFFFFFF);
                continue;
            }
            this.a(stringArray[10][by], n7, n2 + n3 * k + 3, 0x10 | 1, 2761505, game.j.as[0]);
        }
        this.a(imageArray, n8, n9, (int)byArray2[0], byArray.length, sArray, sArray2);
        this.a(2761505, game.j.as[0]);
        switch (byArray[byArray2[0]]) {
            case 0: {
                i.drawString("\u4f60\u7684\u603b\u6e38\u620f\u65f6\u95f4\u4e3a:", n10, n11 + this.g, 0x10 | 4);
                int[] nArray = this.a(this.d.I[1]);
                i.drawString(this.d.I[0] + "\u5c0f\u65f6" + nArray[1] + "\u5206\u949f" + nArray[2] + "\u79d2", n13, n11 + n12 + this.g, 0x10 | 1);
                i.drawString("\u65f6\u95f4\u8fbe\u52306\u5c0f\u65f6\u53ef\u83b7:", n10, n11 + 2 * n12 + this.g, 0x10 | 4);
                i.drawString("\u7a76\u7ea7\u7ecf\u9a8c\u9644\u9b54", n10 + n14, n11 + 3 * n12 + this.g, 0x10 | 4);
                break;
            }
            case 1: {
                i.drawString("\u6740\u654c\u603b\u91cf:" + this.d.B[0], n10, n11 + this.g, 0x10 | 4);
                i.drawString("\u6570\u91cf\u8fbe\u52301000\u53ef\u83b7\uff1a", n10, n11 + n12 + this.g, 0x10 | 4);
                i.drawString("\u9ad8\u7ea7\u6124\u6012\u9644\u9b54", n10 + n14, n11 + 2 * n12 + this.g, 0x10 | 4);
                i.drawString("\u6570\u91cf\u8fbe\u52305000\u53ef\u83b7\uff1a", n10, n11 + 3 * n12 + this.g, 0x10 | 4);
                i.drawString("\u7a76\u7ea7\u5438\u7cbe\u9644\u9b54", n10 + n14, n11 + 4 * n12 + this.g, 0x10 | 4);
                break;
            }
            case 2: {
                i.drawString("\u603b\u89e3\u9501\u5ea6:" + this.d.J() + "%", n10, n11 + this.g, 0x10 | 4);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + n12, this.d.z[0][0] == 0 ? "\u68a6\u5883    \u5b8c\u6210\u6559\u5b66\u5173" : "\u68a6\u5883    \u5df2\u89e3\u9501", this.d.z[0][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 2 * n12, this.d.z[1][0] == 0 ? "\u56f0\u60d1    \u8fdb\u5165\u68a6\u5883" : "\u56f0\u60d1    \u5df2\u89e3\u9501", this.d.z[1][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 3 * n12, this.d.z[2][0] == 0 ? "\u75db\u82e6    \u51fb\u8d25\u521d\u7ea7\u6b7b\u795e" : "\u75db\u82e6    \u5df2\u89e3\u9501", this.d.z[2][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 4 * n12, this.d.z[3][0] == 0 ? "\u60b2\u4f24    \u51fb\u8d25\u521d\u7ea7\u6218\u795e" : "\u60b2\u4f24    \u5df2\u89e3\u9501", this.d.z[3][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 5 * n12, this.d.z[4][0] == 0 ? "\u6050\u60e7    \u83b7\u5f97\u95ea\u7535\u5203" : "\u6050\u60e7    \u5df2\u89e3\u9501", this.d.z[4][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 6 * n12, this.d.z[5][0] == 0 ? "\u618e\u6068    \u83b7\u5f97\u70c8\u7130\u4e4b\u97ad" : "\u618e\u6068    \u5df2\u89e3\u9501", this.d.z[5][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 7 * n12, this.d.z[6][0] == 0 ? "\u7edd\u671b    \u7b49\u7ea7\u8fbe\u523045" : "\u7edd\u671b    \u5df2\u89e3\u9501", this.d.z[6][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 8 * n12, this.d.z[7][0] == 0 ? "\u6124\u6012    \u6b66\u5668\u6536\u96c680%" : "\u6124\u6012    \u5df2\u89e3\u9501", this.d.z[7][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 9 * n12, this.d.z[8][0] == 0 ? "\u5e0c\u671b  \u9644\u9b54\u6536\u96c680%" : "\u5e0c\u671b    \u5df2\u89e3\u9501", this.d.z[8][0] == 0 ? 13434913 : 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 10 * n12, "\u89e3\u9501\u5ea6\u8fbe\u5230100%\u53ef\u83b7\uff1a", 2761505);
                this.a(1, n10 + n14, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 11 * n12, "\u7a76\u7ea7\u8d22\u5bcc\u9644\u9b54", 2761505);
                break;
            }
            case 3: {
                i.drawString("\u603b\u63a2\u7d22\u5ea6:" + this.d.c() + "%", n10, n11 + this.g, 0x10 | 4);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + n12, "\u6559\u5b66" + this.d.bO[0] + "%", 2761505);
                this.a(1, n13, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + n12, "\u68a6\u5883" + this.d.bO[1] + "%", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 2 * n12, "\u56f0\u60d1" + this.d.bO[2] + "%", 2761505);
                this.a(1, n13, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 2 * n12, "\u75db\u82e6" + this.d.bO[3] + "%", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 3 * n12, "\u60b2\u4f24" + this.d.bO[4] + "%", 2761505);
                this.a(1, n13, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 3 * n12, "\u6050\u60e7" + this.d.bO[5] + "%", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 4 * n12, "\u618e\u6068" + this.d.bO[6] + "%", 2761505);
                this.a(1, n13, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 4 * n12, "\u7edd\u671b" + this.d.bO[7] + "%", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 5 * n12, "\u6124\u6012" + this.d.bO[8] + "%", 2761505);
                this.a(1, n13, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 5 * n12, "\u5e0c\u671b" + this.d.bO[9] + "%", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 6 * n12, "\u63a2\u7d22\u5ea6\u8fbe\u5230500%\u53ef\u83b7\uff1a", 2761505);
                this.a(1, n10 + n14, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 7 * n12, "\u9ad8\u7ea7\u5e78\u8fd0\u9644\u9b54", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 8 * n12, "\u63a2\u7d22\u5ea6\u8fbe\u5230900%\u53ef\u83b7\uff1a", 2761505);
                this.a(1, n10 + n14, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 9 * n12, "\u7a76\u7ea7\u5e78\u8fd0\u9644\u9b54", 2761505);
                break;
            }
            case 4: {
                i.drawString("\u603b\u6536\u96c6\u5ea6:" + this.d.x() + "%", n10, n11 + this.g, 0x10 | 4);
                for (int k = 0; k < 10; ++k) {
                    this.a(1, n10, n11 + n12, 240, n12 * 4 - 4, n11 + n12 + k * n12, stringArray[11][k], this.d.bH[k] == 0 ? 13434913 : 2761505);
                }
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 11 * n12, "\u6536\u96c6\u5ea6\u8fbe\u523080%\u53ef\u83b7\uff1a", 2761505);
                this.a(1, n10 + n14 / 2, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 12 * n12, "\u89e3\u9501\u300a\u6124\u6012\u300b\u6cb9\u753b", 2761505);
                this.a(1, n10, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 13 * n12, "\u6536\u96c6\u5ea6\u8fbe\u523090%\u53ef\u83b7\uff1a", 2761505);
                this.a(1, n10 + n14, n11 + n12, 240 - n10 * 2, n12 * 4 - 4, n11 + 14 * n12, "\u7a76\u7ea7\u653b\u51fb\u9644\u9b54", 2761505);
                break;
            }
            case 5: {
                i.drawString("\u603b\u6536\u96c6\u5ea6:" + this.d.O() + "%", n10, n11 + this.g, 0x10 | 4);
                i.drawString("\u8be6\u7ec6\u6536\u96c6\u60c5\u51b5\u8bf7\u63094\u952e", n10, n11 + n12 + this.g, 0x10 | 4);
                i.drawString("\u7ffb\u9875\u81f3\u9644\u9b54\u5206\u9875\u67e5\u770b\u3002", n10, n11 + 2 * n12 + this.g, 0x10 | 4);
                i.drawString("\u6536\u96c6\u5ea6\u8fbe\u523080%\u53ef\u83b7\uff1a", n10, n11 + 3 * n12 + this.g, 0x10 | 4);
                i.drawString("\u89e3\u9501\u300a\u5e0c\u671b\u300b\u6cb9\u753b", n10 + n14 / 2, n11 + 4 * n12 + this.g, 0x10 | 4);
                break;
            }
            case 6: {
                i.drawString("\u300a\u618e\u6068\u300b\u6b7b\u795e\u51fb\u6740\u65f6\u95f4", n10, n11 + this.g, 0x10 | 4);
                i.drawString("\u6700\u5feb\u65f6\u95f4\uff1a", n10, n11 + n12 + this.g, 0x10 | 4);
                int[] nArray = this.a(this.d.ax[6]);
                i.drawString(nArray[1] + "\u5206\u949f" + nArray[2] + "\u79d2", n10, n11 + 2 * n12 + this.g, 0x10 | 4);
                i.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", n10, n11 + 3 * n12 + this.g, 0x10 | 4);
                i.drawString("\u7a76\u6781\u7206\u51fb\u9644\u9b54", n10 + n14, n11 + 4 * n12 + this.g, 0x10 | 4);
                break;
            }
            case 7: {
                i.drawString("\u300a\u7edd\u671b\u300b\u6218\u795e\u51fb\u6740\u65f6\u95f4", n10, n11 + this.g, 0x10 | 4);
                i.drawString("\u6700\u5feb\u65f6\u95f4\uff1a", n10, n11 + n12 + this.g, 0x10 | 4);
                int[] nArray = this.a(this.d.ax[7]);
                i.drawString(nArray[1] + "\u5206\u949f" + nArray[2] + "\u79d2", n10, n11 + 2 * n12 + this.g, 0x10 | 4);
                i.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", n10, n11 + 3 * n12 + this.g, 0x10 | 4);
                i.drawString("\u7a76\u6781\u6124\u6012\u9644\u9b54", n10 + n14, n11 + 4 * n12 + this.g, 0x10 | 4);
                break;
            }
            case 8: {
                i.drawString("\u300a\u6124\u6012\u300b\u4f2f\u7235\u51fb\u6740\u65f6\u95f4", n10, n11, 0x10 | 4);
                i.drawString("\u6700\u5feb\u65f6\u95f4\uff1a", n10, n11 + n12, 0x10 | 4);
                int[] nArray = this.a(this.d.ax[8]);
                i.drawString(nArray[1] + "\u5206\u949f" + nArray[2] + "\u79d2", n10, n11 + 2 * n12, 0x10 | 4);
                i.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", n10, n11 + 3 * n12, 0x10 | 4);
                i.drawString("\u7a76\u6781\u9632\u5fa1\u9644\u9b54", n10 + n14, n11 + 4 * n12, 0x10 | 4);
                break;
            }
            case 9: {
                i.drawString("\u300a\u5e0c\u671b\u300b\u9b45\u9b54\u51fb\u6740\u65f6\u95f4", n10, n11 + this.g, 0x10 | 4);
                i.drawString("\u6700\u5feb\u65f6\u95f4\uff1a", n10, n11 + n12 + this.g, 0x10 | 4);
                int[] nArray = this.a(this.d.ax[9]);
                i.drawString(nArray[1] + "\u5206\u949f" + nArray[2] + "\u79d2", n10, n11 + 2 * n12 + this.g, 0x10 | 4);
                i.drawString("\u51fb\u6740\u65f6\u95f4\u8fbe\u523030\u79d2\u53ef\u83b7:", n10, n11 + 3 * n12 + this.g, 0x10 | 4);
                i.drawString("\u7a76\u6781\u9b54\u51fb\u9644\u9b54", n10 + n14, n11 + 4 * n12 + this.g, 0x10 | 4);
                break;
            }
        }
        this.l[0] = this.l[0] + 2;
        if (this.l[0] >= this.l[1] + n12 * 3 - 4) {
            this.l[0] = 0;
        }
    }

    public void a(Image[][] imageArray, i i2, byte[] byArray, short[][] sArray, byte[] byArray2, h h2, String[][] stringArray, short[][][] sArray2, short[][][][] sArray3) {
        this.a(1, imageArray, sArray2, sArray3);
        int n = 26;
        int n2 = 45;
        int n3 = 24;
        int n4 = -1;
        byte by = -1;
        int n5 = 77;
        int n6 = 65;
        int n7 = -1;
        this.d.a(i2.T[2], 33, -116, 27);
        this.d.a(i2.T[3], 33, -26, 27);
        int n8 = 132;
        int n9 = 200;
        int n10 = 41;
        int n11 = 30;
        int n12 = 172;
        int n13 = 24;
        this.a(imageArray[27], sArray3[27][30], n5, 260 - n6, 1, sArray2[27], (byte)1, 0, 0, 27);
        for (int k = 0; k < 3; ++k) {
            n4 = byArray2[0] - 1 + k;
            if (byArray.length >= 3) {
                if (n4 < 0) {
                    n4 = byArray.length - 1;
                } else if (n4 >= byArray.length) {
                    n4 = 0;
                }
            }
            if (n4 < 0 || n4 >= byArray.length) continue;
            by = byArray[n4];
            this.a(imageArray[28], sArray3[28][this.d.j[by]], n, 260 - (n2 + n3 * k), 1, sArray2[28], (byte)1, 0, 0, 28);
            int n14 = n7 = sArray[byArray[n4]][0] == 0 ? 13434913 : 2761505;
            if (by == byArray[byArray2[0]]) {
                i.setClip(0, 0, 240, 320);
                this.a(stringArray[6][by], n8, n2 + n3 * k + 3, 0x10 | 1, i, game.j.as[0], n7, 0xFFFFFF);
                continue;
            }
            this.a(stringArray[6][by], n8, n2 + n3 * k + 3, 0x10 | 1, n7, game.j.as[0]);
        }
        this.a(imageArray, n9, n10, (int)byArray2[0], byArray.length, sArray2, sArray3);
        String string = "";
        this.a(2761505, game.j.as[0]);
        i.drawString(stringArray[0][byArray[byArray2[0]]], n11, n12 + this.g, 0x10 | 4);
        i.drawString(stringArray[0][byArray[byArray2[0]]], n11, n12 + this.g, 0x10 | 4);
        this.a(0, n11, n12 + n13, 240 - n11 * 2, 20, n11, stringArray[7][byArray[byArray2[0]]], 2761505);
        this.a[0] = this.a[0] + 2;
        if (this.a[0] >= this.a[1] + 240 - n11 * 2) {
            this.a[0] = 0;
        }
        this.a(2761505, game.j.as[0]);
        i.drawString("\u4f7f\u7528\u9700\u8981\u8fbe\u6210\u6761\u4ef6:", n11, n12 + 2 * n13 + this.g, 0x10 | 4);
        if (sArray[byArray[byArray2[0]]][0] == 1) {
            i.drawString("\u5df2\u7ecf\u8fbe\u6210\u4f7f\u7528\u6761\u4ef6\u3002", n11, n12 + 4 * n13 + this.g, 0x10 | 4);
            i.drawString(stringArray[9][byArray[byArray2[0]]], n11, n12 + 3 * n13 + this.g, 0x10 | 4);
        } else {
            i.setColor(13434913);
            i.drawString(stringArray[9][byArray[byArray2[0]]], n11, n12 + 3 * n13 + this.g, 0x10 | 4);
            switch (byArray[byArray2[0]]) {
                case 1: {
                    string = "\u5f53\u524d\u653b\u51fb\u529b:" + h2.N[1];
                    break;
                }
                case 2: {
                    string = "\u5f53\u524d\u6b66\u5668\u6536\u96c6\u5ea6:" + this.d.x() + "%";
                    break;
                }
                case 4: 
                case 6: 
                case 12: 
                case 15: {
                    string = "\u5c1a\u672a\u51fb\u8d25";
                    break;
                }
                case 5: {
                    int[] nArray = this.a(this.d.ax[6]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 8: {
                    int[] nArray = this.a(this.d.ax[7]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 11: {
                    int[] nArray = this.a(this.d.ax[8]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 14: {
                    int[] nArray = this.a(this.d.ax[9]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 7: 
                case 17: {
                    string = "\u5f53\u524d\u6740\u654c\u6570\u91cf:" + this.d.B[0];
                    break;
                }
                case 10: {
                    string = "\u5f53\u524d\u9632\u5fa1\u529b:" + h2.R[1];
                    break;
                }
                case 13: {
                    string = "\u5f53\u524d\u9b54\u529b\u4e0a\u9650:" + h2.v[1];
                    break;
                }
                case 16: {
                    string = "\u5f53\u524d\u751f\u547d\u4e0a\u9650:" + h2.b[1];
                    break;
                }
                case 18: 
                case 21: 
                case 22: 
                case 24: {
                    string = "\u5f53\u524d\u89d2\u8272\u7b49\u7ea7:" + h2.a[0];
                    break;
                }
                case 19: {
                    string = "\u5f53\u524d\u91d1\u5e01\u91cf:" + h2.au[0];
                    break;
                }
                case 20: {
                    string = "\u5f53\u524d\u6cb9\u753b\u89e3\u9501\u5ea6:" + this.d.J() + "%";
                    break;
                }
                case 23: {
                    int[] nArray = this.a(this.d.I[1]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + this.d.I[0] + "\u65f6" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 25: 
                case 26: {
                    string = "\u5f53\u524d\u5730\u56fe\u63a2\u7d22\u5ea6:" + this.d.c() + "%";
                }
            }
            i.drawString(string, n11, n12 + 4 * n13 + this.g, 0x10 | 4);
        }
    }

    private void a(Image[][] imageArray, int n, int n2, int n3, int n4, short[][][] sArray, short[][][][] sArray2) {
        int n5 = 8;
        int n6 = 54;
        int n7 = 0;
        this.a(imageArray[27], sArray2[27][25], n, 260 - n2, 1, sArray[27], (byte)1, 0, 0, 27);
        n7 = n2 + n5 + n3 * (n6 - n5) / n4;
        if (n3 == 0) {
            n7 = n2 + n5;
        }
        if (n3 == n4 - 1) {
            n7 = n2 + n6;
        }
        this.a(imageArray[27], sArray2[27][37], n, 260 - n7, 1, sArray[27], (byte)1, 0, 0, 27);
    }

    public void a(Image[][] imageArray, i i2, byte[] byArray, int n, short[][][] sArray, short[][][][] sArray2) {
        this.a(0, 0, 240, 320, 2761505);
        this.a(2, imageArray, sArray, sArray2);
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        int n2 = 35;
        int n3 = 9;
        int n4 = 133;
        int n5 = 4;
        switch (byArray[n]) {
            case 27: {
                this.a(imageArray[27], sArray2[27][31], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 28: {
                this.a(imageArray[27], sArray2[27][32], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
            }
        }
        String[] stringArray = new String[]{"\u8d2d\u4e70", "\u51fa\u552e"};
        this.a(2761505, game.j.as[0]);
        for (int k = 0; k < byArray.length; ++k) {
            if (k == n) {
                i.drawString(stringArray[k], n2 + n4 * k, n3 - n5 + this.g, 0x10 | 4);
                continue;
            }
            i.drawString(stringArray[k], n2 + n4 * k, n3 + this.g, 0x10 | 4);
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, int[] nArray, byte[] byArray, byte by2, byte[][] byArray2, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 26;
        int n2 = 49;
        int n3 = 25;
        int n4 = 20;
        int n5 = 26;
        int n6 = 204;
        int n7 = 22;
        int n8 = 70;
        int n9 = 131;
        int n10 = -1;
        int n11 = -1;
        int n12 = 200;
        int n13 = 46;
        int n14 = 183;
        int n15 = 129;
        int n16 = 25;
        int n17 = 107;
        int n18 = 28;
        int n19 = 113;
        int n20 = 93;
        int n21 = 113;
        int n22 = 125;
        int n23 = 74;
        int n24 = 110;
        int n25 = 136;
        int n26 = 110;
        int n27 = 107;
        int n28 = 110;
        int n29 = 27;
        int n30 = 16;
        int n31 = 54;
        int n32 = 45;
        int n33 = 94;
        int n34 = 77;
        int n35 = 110;
        int n36 = 143;
        int n37 = 0;
        int n38 = 0;
        n38 = this.d.a(byArray[byArray2[0][0]], 1);
        n37 = h2.au[0] >= n38 ? 2761505 : 13434913;
        this.a("" + n38, n5 + this.e * 5, n6 + 3, 0x10 | 4, n37, game.j.as[0]);
        this.a(2761505, game.j.as[0]);
        i.drawString("\u8d2d\u4e70\u5355\u4ef7: ", n5, n6 + 3 + this.g, 0x10 | 4);
        i.drawString("\u6240\u6301\u91d1\u94b1: ", n5, n6 + n7 + 3 + this.g, 0x10 | 4);
        i.drawString("" + h2.au[0], n5 + this.e * 5, n6 + n7 + 3 + this.g, 0x10 | 4);
        if (byArray[byArray2[0][0]] < 9 || byArray[byArray2[0][0]] > 40) {
            i.drawString("\u6301\u6709\u6570\u91cf: ", n5, n2 + n3 * 4 + n4 - 4 + this.g, 0x10 | 4);
            i.drawString("" + nArray[byArray[byArray2[0][0]]], n5 + this.e * 5, n2 + n3 * 4 + n4 - 4 + this.g, 0x10 | 4);
        }
        if (by2 == 0) {
            this.a(2761505, game.j.as[0]);
            this.a(stringArray[5][byArray[byArray2[0][0]]], n5, n2 + n3 * 3 + n4 - 4, 0x10 | 4, 2761505, game.j.as[0]);
            if (byArray[byArray2[0][0]] >= 31 && byArray[byArray2[0][0]] <= 40) {
                this.a("\u9b54\u6cd5:" + stringArray[2][this.d.aF[byArray[byArray2[0][0]] - 31][11]], n5, n2 + n3 * 4 + n4 - 4, 0x10 | 4, 2761505, game.j.as[0]);
            }
            this.a(imageArray[27], sArray2[27][26], n8, 260 - (n2 + n3), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(imageArray, n12, n13, (int)byArray2[0][0], byArray.length, sArray, sArray2);
            for (int k = 0; k < 3; ++k) {
                n10 = byArray2[0][0] - 1 + k;
                if (n10 < 0) {
                    n10 = byArray.length - 1;
                } else if (n10 >= byArray.length) {
                    n10 = 0;
                }
                n11 = this.d.aW[byArray[n10]];
                this.a(imageArray[28], sArray2[28][n11], n, 260 - (n2 + n3 * k), 1, sArray[28], (byte)1, 0, 0, 28);
                n38 = this.d.a(byArray[n10], 1);
                int n39 = h2.au[0] >= n38 ? (byArray[n10] >= 31 ? this.a(byArray[n10] - 31, 0) : 2761505) : (n37 = 13434913);
                if (n10 == byArray2[0][0]) {
                    i.setClip(0, 0, 240, 320);
                    this.a(stringArray[4][byArray[n10]], n9, n2 + n3 * k + 2 + 3, 0x10 | 1, i, game.j.as[0], n37, 0xFFFFFF);
                    continue;
                }
                this.a(stringArray[4][byArray[n10]], n9, n2 + n3 * k + 2 + 3, 0x10 | 1, n37, game.j.as[0]);
            }
            this.a("\u63095\u952e\u8d2d\u4e70", 120, n14, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.d.a(i2.T[2], 33, -120, 27);
            this.d.a(i2.T[3], 33, -30, 27);
            this.d.a(i2.T[0], 28, -300, 27);
            this.d.a(i2.T[1], 181, -300, 27);
            this.a("\u630946\u952e\u5de6\u53f3\u7ffb\u9875", 120, 320 - (this.c - 1), 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a("\u63090\u952e\u8d2d\u4e70\u91d1\u5e01", 120, n6 + n7 * 2 + n7 / 2 + 3, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            if (by == 1) {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u4e70\u4e9b\u8840\u74f6\u5e26\u5728\u8eab\u4e0a\u5427!", 120, n15, 0x10 | 1, 2761505, game.j.as[0]);
                this.a(0, imageArray, sArray, sArray2);
            }
        } else if (by2 == 1) {
            this.d.a(i2.T[2], n21, -n22, 27);
            this.d.a(i2.T[3], n19, -n20, 27);
            this.d.a(i2.T[0], n23, -n24, 27);
            this.d.a(i2.T[1], n25, -n26, 27);
            this.a(n27, n28, n29, n30, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.d.aW[byArray[byArray2[0][0]]]], n31, 260 - n32, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a("\u63095\u952e\u8d2d\u4e70", 120, n14, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a(2761505, game.j.as[0]);
            i.drawString(stringArray[4][byArray[byArray2[0][0]]], n33, n32 + 3 + this.g, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u8d2d\u4e70\u6570\u91cf:", n, n34 + this.g, 0x10 | 4);
            i.drawString("" + this.d.bm[8], 120, n35 + this.g, 0x10 | 1);
            i.drawString("\u6d88\u8017\u91d1\u94b1: ", n5, n36 + this.g, 0x10 | 4);
            int n40 = this.d.a(byArray[byArray2[0][0]], (int)this.d.bm[8]);
            this.a("" + n40, n5 + this.e * 5, n36, 0x10 | 4, h2.au[0] >= n40 ? 2761505 : 13434913, game.j.as[0]);
            if (by == 1) {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(28, imageArray, sArray, sArray2);
                this.a(2761505, game.j.as[0]);
                i.drawString("\u60a8\u8d2d\u4e70\u4e86" + this.d.bm[8] + "\u4e2a", 120, n17 + this.g, 0x10 | 1);
                i.drawString(stringArray[4][byArray[byArray2[0][0]]], 120, n17 + n18 + this.g, 0x10 | 1);
                i.drawString("\u5171\u6d88\u8017\u91d1\u94b1: " + h2.au[1], 120, n17 + n18 * 2 + this.g, 0x10 | 1);
                i.drawString("\u786e\u5b9a\u8d2d\u4e70\u5417?", 120, n17 + n18 * 3 + this.g, 0x10 | 1);
                this.a(2, imageArray, sArray, sArray2);
            }
        } else if (by2 == 3) {
            this.d.a(i2.T[2], n21, -n22, 27);
            this.d.a(i2.T[3], n19, -n20, 27);
            this.d.a(i2.T[0], n23, -n24, 27);
            this.d.a(i2.T[1], n25, -n26, 27);
            this.a(n27, n28, n29, n30, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.d.aW[byArray[byArray2[0][0]]]], n31, 260 - n32, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a("\u63095\u952e\u8d2d\u4e70", 120, n14, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a(2761505, game.j.as[0]);
            i.drawString(stringArray[4][byArray[byArray2[0][0]]], n33, n32 + 3 + this.g, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u8d2d\u4e70\u6570\u91cf:", n, n34 + this.g, 0x10 | 4);
            i.drawString("" + this.d.bm[8], 120, n35 + this.g, 0x10 | 1);
            i.drawString("\u6d88\u8017\u91d1\u94b1: ", n5, n36 + this.g, 0x10 | 4);
            int n41 = this.d.a(byArray[byArray2[0][0]], (int)this.d.bm[8]);
            this.a("" + n41, n5 + this.e * 5, n36, 0x10 | 4, h2.au[0] >= n41 ? 2761505 : 13434913, game.j.as[0]);
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a(0, imageArray, sArray, sArray2);
            String[][] stringArrayArray = new String[][]{{"\u8d2d\u4e70\u6210\u529f", "\u5df2\u81ea\u52a8\u4f7f\u7528"}, {"\u91d1\u94b1\u4e0d\u8db3", "\u6309\u786e\u5b9a\u952e\u8fd4\u56de"}, {"\u643a\u5e26\u5df2\u8fbe\u4e0a\u9650", "\u6309\u786e\u5b9a\u952e\u8fd4\u56de"}, {"\u8d2d\u4e70\u6210\u529f", "\u5df2\u81ea\u52a8\u4f7f\u7528"}};
            this.a(stringArrayArray[by][0], 120, n15, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(stringArrayArray[by][1], 120, n15 + n16, 0x10 | 1, 2761505, game.j.as[0]);
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, int[] nArray, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[][] byArray4, byte[][] byArray5, byte by2, byte[][] byArray6, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 26;
        int n2 = 49;
        int n3 = 25;
        int n4 = 20;
        int n5 = 26;
        int n6 = 204;
        int n7 = 60;
        int n8 = 22;
        int n9 = 70;
        int n10 = 131;
        int n11 = -1;
        int n12 = -1;
        int n13 = 79;
        int n14 = 45;
        int n15 = 200;
        int n16 = 46;
        int n17 = 183;
        int n18 = 107;
        int n19 = 28;
        int n20 = 129;
        int n21 = 25;
        int n22 = 113;
        int n23 = 93;
        int n24 = 113;
        int n25 = 125;
        int n26 = 74;
        int n27 = 110;
        int n28 = 136;
        int n29 = 110;
        int n30 = 107;
        int n31 = 110;
        int n32 = 27;
        int n33 = 16;
        int n34 = 54;
        int n35 = 45;
        int n36 = 94;
        int n37 = 77;
        int n38 = 110;
        int n39 = 143;
        int n40 = 0;
        int n41 = 0;
        int n42 = 0;
        if (byArray3.length > 0) {
            if (byArray6[0][0] < byArray.length) {
                n41 = this.d.a(0, byArray3[byArray6[0][0]], 1);
                this.a("" + n41, n5 + this.e * 5, n6 + 3, 0x10 | 4, 2761505, game.j.as[0]);
                this.a(2761505, game.j.as[0]);
                i.drawString("\u6301\u6709\u6570\u91cf: ", n5, n6 + 2 * n8 + 3 + this.g, 0x10 | 4);
                i.drawString("" + nArray[byArray3[byArray6[0][0]]], n5 + this.e * 5, n6 + 2 * n8 + 3, 0x10 | 4);
            } else {
                n41 = this.d.a(1, byArray3[byArray6[0][0]], 1);
                this.a("" + n41, n5 + this.e * 5, n6 + 3, 0x10 | 4, 2761505, game.j.as[0]);
            }
            this.a(2761505, game.j.as[0]);
            i.drawString("\u51fa\u552e\u5355\u4ef7: ", n5, n6 + 3 + this.g, 0x10 | 4);
            i.drawString("\u6240\u6301\u91d1\u94b1: ", n5, n6 + n8 + 3 + this.g, 0x10 | 4);
            i.drawString("" + h2.au[0], n5 + this.e * 5, n6 + n8 + 3 + this.g, 0x10 | 4);
        }
        if (by2 == 0) {
            int n43;
            this.a(2761505, game.j.as[0]);
            if (byArray6[0][0] < byArray.length) {
                this.a(stringArray[5][byArray3[byArray6[0][0]]], n5, n2 + n3 * 3 + n4 - 4, 0x10 | 4, 2761505, game.j.as[0]);
            } else {
                int n44;
                this.a("\u7b49\u7ea7:" + byArray5[byArray3[byArray6[0][0]]][2], n5, n2 + n3 * 3 + n4 - 4, 0x10 | 4, 2761505, game.j.as[0]);
                n43 = 0;
                for (n44 = 0; n44 < 3; ++n44) {
                    if (byArray5[byArray3[byArray6[0][0]]][3 + n44 * 2] <= 0 || byArray5[byArray3[byArray6[0][0]]][3 + n44 * 2 + 1] < 0 || byArray5[byArray3[byArray6[0][0]]][3 + n44 * 2 + 1] > 2) continue;
                    n43 += this.d.K[byArray5[byArray3[byArray6[0][0]]][3 + n44 * 2 + 1]][1];
                }
                this.a("\u653b\u51fb:" + this.d.ch[byArray3[byArray6[0][0]]] * this.d.bP[byArray5[byArray3[byArray6[0][0]]][2]] * (100 + n43) / 10000, n5 + n7, n2 + n3 * 3 + n4 - 4, 0x10 | 4, 2761505, game.j.as[0]);
                this.a("\u9644\u9b54: ", n5, n2 + n3 * 4 + n4 - 4, 0x10 | 4, 2761505, game.j.as[0]);
                for (n44 = 0; n44 < 3; ++n44) {
                    if (byArray5[byArray3[byArray6[0][0]]][3 + n44 * 2] > 0) {
                        this.a(imageArray[28], sArray2[28][this.d.j[byArray5[byArray3[byArray6[0][0]]][3 + 2 * n44 + 1]]], n13 + n14 * n44, 260 - (n2 + n3 * 4 + n4 - 4 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
                        continue;
                    }
                    this.a(imageArray[28], sArray2[28][47], n13 + n14 * n44, 260 - (n2 + n3 * 4 + n4 - 4 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
                }
            }
            this.a(imageArray[27], sArray2[27][26], n9, 260 - (n2 + n3), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(imageArray, n15, n16, (int)byArray6[0][0], byArray3.length, sArray, sArray2);
            for (n43 = 0; n43 < 3; ++n43) {
                n11 = byArray6[0][0] - 1 + n43;
                if (byArray3.length >= 3) {
                    if (n11 < 0) {
                        n11 = byArray3.length - 1;
                    } else if (n11 >= byArray3.length) {
                        n11 = 0;
                    }
                }
                if (n11 < 0 || n11 >= byArray3.length) continue;
                n42 = n11 < byArray.length ? byArray3[n11] : byArray5[byArray3[n11]][1] + 31;
                n12 = this.d.aW[n42];
                this.a(imageArray[28], sArray2[28][n12], n, 260 - (n2 + n3 * n43), 1, sArray[28], (byte)1, 0, 0, 28);
                int n45 = n40 = n42 >= 31 ? this.a(n42 - 31, 0) : 2761505;
                if (n11 == byArray6[0][0]) {
                    i.setClip(0, 0, 240, 320);
                    this.a(stringArray[4][n42], n10, n2 + n3 * n43 + 2 + 3, 0x10 | 1, i, game.j.as[0], n40, 0xFFFFFF);
                } else {
                    this.a(stringArray[4][n42], n10, n2 + n3 * n43 + 2 + 3, 0x10 | 1, n40, game.j.as[0]);
                }
                if (n11 < byArray.length || byArray3[n11] != h2.i) continue;
                this.d.a(i2.T[4], n, -(n2 + n43 * n3), 28);
            }
            this.a("\u63095\u952e\u51fa\u552e", 120, n17, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.d.a(i2.T[2], 33, -120, 27);
            this.d.a(i2.T[3], 33, -30, 27);
            this.d.a(i2.T[0], 28, -300, 27);
            this.d.a(i2.T[1], 181, -300, 27);
            this.a("\u630946\u952e\u5de6\u53f3\u7ffb\u9875", 120, 320 - (this.c - 1), 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        } else if (by2 == 1) {
            this.d.a(i2.T[2], n24, -n25, 27);
            this.d.a(i2.T[3], n22, -n23, 27);
            this.d.a(i2.T[0], n26, -n27, 27);
            this.d.a(i2.T[1], n28, -n29, 27);
            this.a(n30, n31, n32, n33, 0xFFFFFF);
            n42 = byArray6[0][0] < byArray.length ? byArray3[byArray6[0][0]] : byArray5[byArray3[byArray6[0][0]]][1] + 31;
            this.a(imageArray[28], sArray2[28][this.d.aW[n42]], n34, 260 - n35, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(stringArray[4][n42], n36, n35 + 3, 0x10 | 4, 2761505, game.j.as[0]);
            this.a("\u63095\u952e\u51fa\u552e", 120, n17, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a(2761505, game.j.as[0]);
            i.drawString("\u8bf7\u9009\u62e9\u51fa\u552e\u6570\u91cf:", n, n37 + this.g, 0x10 | 4);
            i.drawString("" + this.d.bm[8], 120, n38 + this.g, 0x10 | 1);
            i.drawString("\u83b7\u5f97\u91d1\u94b1: ", n5, n39 + this.g, 0x10 | 4);
            int n46 = this.d.a(0, byArray3[byArray6[0][0]], (int)this.d.bm[8]);
            this.a("" + n46, n5 + this.e * 5, n39, 0x10 | 4, 2761505, game.j.as[0]);
            if (by == 1) {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(28, imageArray, sArray, sArray2);
                this.a(2761505, game.j.as[0]);
                i.drawString("\u60a8\u51fa\u552e\u4e86" + this.d.bm[8] + "\u4e2a", 120, n18 + this.g, 0x10 | 1);
                i.drawString(stringArray[4][n42], 120, n18 + n19 + this.g, 0x10 | 1);
                i.drawString("\u5171\u83b7\u5f97\u91d1\u94b1: " + h2.au[1], 120, n18 + n19 * 2 + this.g, 0x10 | 1);
                i.drawString("\u786e\u5b9a\u51fa\u552e\u5417?", 120, n18 + n19 * 3 + this.g, 0x10 | 1);
                this.a(2, imageArray, sArray, sArray2);
            }
        } else if (by2 == 3) {
            this.d.a(i2.T[2], n24, -n25, 27);
            this.d.a(i2.T[3], n22, -n23, 27);
            this.d.a(i2.T[0], n26, -n27, 27);
            this.d.a(i2.T[1], n28, -n29, 27);
            this.a(n30, n31, n32, n33, 0xFFFFFF);
            n42 = byArray6[0][0] < byArray.length ? byArray3[byArray6[0][0]] : byArray5[byArray3[byArray6[0][0]]][1] + 31;
            this.a(imageArray[28], sArray2[28][this.d.aW[n42]], n34, 260 - n35, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(stringArray[4][n42], n36, n35 + 3, 0x10 | 4, 2761505, game.j.as[0]);
            this.a("\u63095\u952e\u51fa\u552e", 120, n17, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a(2761505, game.j.as[0]);
            i.drawString("\u8bf7\u9009\u62e9\u51fa\u552e\u6570\u91cf:", n, n37 + this.g, 0x10 | 4);
            i.drawString("" + this.d.bm[8], 120, n38 + this.g, 0x10 | 1);
            i.drawString("\u83b7\u5f97\u91d1\u94b1: ", n5, n39 + this.g, 0x10 | 4);
            int n47 = this.d.a(0, byArray3[byArray6[0][0]], (int)this.d.bm[8]);
            this.a("" + n47, n5 + this.e * 5, n39, 0x10 | 4, 2761505, game.j.as[0]);
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a(0, imageArray, sArray, sArray2);
            String[][] stringArrayArray = new String[][]{{"\u51fa\u552e\u6210\u529f", "\u6309\u786e\u5b9a\u952e\u8fd4\u56de"}, {"\u88c5\u5907\u4e2d", "\u65e0\u6cd5\u51fa\u552e"}};
            this.a(stringArrayArray[by][0], 120, n20, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(stringArrayArray[by][1], 120, n20 + n21, 0x10 | 1, 2761505, game.j.as[0]);
        }
    }

    private void a(int n, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n2 = 36;
        int n3 = 20;
        if (n == 0 || n == 2) {
            this.a(imageArray[27], sArray2[27][6], 1, 260 - (320 - n3), 1, sArray[27], (byte)1, 0, 0, 27);
        }
        if (n == 1 || n == 2) {
            this.a(imageArray[27], sArray2[27][7], 240 - n2, 260 - (320 - n3), 1, sArray[27], (byte)1, 0, 0, 27);
        }
    }

    public void a(Image[] imageArray, int n, short[][] sArray, int n2, int n3, int n4, int n5) {
        short s = sArray[n][3];
        short s2 = sArray[n][4];
        i.setClip(n2, n3, n4 + 1, n5 + 1);
        for (int k = 0; k <= n5 / s2; ++k) {
            for (int i2 = 0; i2 <= n4 / s; ++i2) {
                game.b.a(imageArray[0], sArray[n][1], sArray[n][2], sArray[n][3], sArray[n][4], n2 + i2 * s, n3 + k * s2, 4 | 0x10, 0, i);
            }
        }
    }

    public void a(Image[][] imageArray, int n, i i2, byte[][][] byArray, byte[] byArray2, byte[][] byArray3, byte[] byArray4, byte[] byArray5, int n2, int n3, int n4, int n5, byte[][][] byArray6, byte[][][] byArray7, short[][][] sArray, short[][][][] sArray2) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = 10;
        int n11 = 10;
        int n12 = 220;
        int n13 = 230;
        int n14 = 41;
        boolean bl = false;
        if (this.d.q >= 2 && this.d.bA[this.d.q - 2 + 23] > 0) {
            bl = true;
        }
        if (n == 0) {
            this.a(i, 2761505, 0, 0, 240, 320);
        }
        i.setColor(13673568);
        byte by = 0;
        byte by2 = 0;
        int n15 = 16;
        byte by3 = 0;
        byte by4 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 3;
        int n21 = 4;
        int n22 = 113;
        int n23 = 178;
        i.setClip(n10, n11, n12, n13);
        for (n9 = 0; n9 < byArray2.length; n9 += 3) {
            by = byArray5[byArray2[n9] * 2];
            by2 = byArray5[byArray2[n9] * 2 + 1];
            i.setColor(0xFFFFFF);
            i.fillRect(n22 + (byArray2[n9 + 1] - n4) * n15 - 2, 320 - n23 - (byArray2[n9 + 2] - n5 + by2) * n15 - 2, by * n15 + 4, by2 * n15 + 4);
        }
        for (n9 = 0; n9 < byArray2.length; n9 += 3) {
            by = byArray5[byArray2[n9] * 2];
            by2 = byArray5[byArray2[n9] * 2 + 1];
            if (bl) {
                i.setColor(0);
            } else {
                i.setColor(0x3F3F3F);
            }
            if (byArray4[n9 / 3] == 1) {
                i.setColor(40764);
            }
            if (byArray4[n9 / 3] == 1 && !bl || bl) {
                if (game.b.a((byte)(n9 / 3), byArray[0][this.d.q]) >= 0) {
                    i.setColor(13434913);
                }
                if (game.b.a((byte)(n9 / 3), byArray[1][this.d.q]) >= 0) {
                    i.setColor(16758528);
                }
                if (game.b.a((byte)(n9 / 3), byArray[2][this.d.q]) >= 0) {
                    i.setColor(255);
                }
            }
            i.fillRect(n22 + (byArray2[n9 + 1] - n4) * n15, 320 - n23 - (byArray2[n9 + 2] - n5 + by2) * n15, by * n15, by2 * n15);
            if ((byArray4[n9 / 3] != 1 || bl) && !bl) continue;
            i.setColor(0xFFFFFF);
            i.drawRect(n22 + (byArray2[n9 + 1] - n4) * n15, 320 - n23 - (byArray2[n9 + 2] - n5 + by2) * n15, by * n15, by2 * n15);
        }
        for (n9 = 0; n9 < byArray2.length; n9 += 3) {
            for (n8 = 0; n8 < byArray3[n9 / 3].length; n8 += 3) {
                if (byArray4[n9 / 3] == 0 && !bl) continue;
                by3 = byArray3[n9 / 3][n8 + 0];
                by4 = byArray3[n9 / 3][n8 + 1];
                if ((byArray3[n9 / 3][n8 + 2] & 8) == 8) {
                    n18 = n16 = n22 + (byArray2[n9 + 1] + by3 + 1 - n4) * n15;
                    n17 = 320 - n23 - (byArray2[n9 + 2] + by4 + 1 - n5) * n15 + n20;
                    n19 = 320 - n23 - (byArray2[n9 + 2] + by4 - n5) * n15 - n20;
                    i.setColor(24710);
                    i.drawLine(n16, n17, n18, n19);
                    i.setColor(0xFFFFFF);
                    i.drawLine(n16 - 1, n17, n16 + 1, n17);
                    i.drawLine(n16 - 1, n19, n16 + 1, n19);
                }
                if ((byArray3[n9 / 3][n8 + 2] & 4) == 4) {
                    n18 = n16 = n22 + (byArray2[n9 + 1] + by3 - n4) * n15;
                    n17 = 320 - n23 - (byArray2[n9 + 2] + by4 + 1 - n5) * n15 + n20;
                    n19 = 320 - n23 - (byArray2[n9 + 2] + by4 - n5) * n15 - n20;
                    i.setColor(24710);
                    i.drawLine(n16, n17, n18, n19);
                    i.setColor(0xFFFFFF);
                    i.drawLine(n16 - 1, n17, n16 + 1, n17);
                    i.drawLine(n16 - 1, n19, n16 + 1, n19);
                }
                if ((byArray3[n9 / 3][n8 + 2] & 1) == 1) {
                    n16 = n22 + (byArray2[n9 + 1] + by3 - n4) * n15 + n20;
                    n18 = n22 + (byArray2[n9 + 1] + by3 + 1 - n4) * n15 - n20;
                    n19 = n17 = 320 - n23 - (byArray2[n9 + 2] + by4 + 1 - n5) * n15;
                    i.setColor(24710);
                    i.drawLine(n16, n17, n18, n19);
                    i.setColor(0xFFFFFF);
                    i.drawLine(n16, n17, n16, n19);
                    i.drawLine(n18, n17, n18, n19);
                }
                if ((byArray3[n9 / 3][n8 + 2] & 2) != 2) continue;
                n16 = n22 + (byArray2[n9 + 1] + by3 - n4) * n15 + n20;
                n18 = n22 + (byArray2[n9 + 1] + by3 + 1 - n4) * n15 - n20;
                n19 = n17 = 320 - n23 - (byArray2[n9 + 2] + by4 - n5) * n15;
                i.setColor(24710);
                i.drawLine(n16, n17, n18, n19);
                i.setColor(0xFFFFFF);
                i.drawLine(n16, n17, n16, n19);
                i.drawLine(n18, n17, n18, n19);
            }
        }
        i.setColor(0xFF0000);
        i.fillRect(n22 + (n2 * n15 / 240 - n4 * n15), 320 - (n3 * n15 / 320 - n5 * n15) - n23, 2, 2);
        game.b.a(n22 + (n2 * n15 / 240 - n4 * n15), 320 - (n3 * n15 / 320 - n5 * n15) - n23, this.b, 0xFFFFFF, i);
        this.b += 2;
        if (this.b > 10) {
            this.b = 2;
        }
        n9 = 0;
        n8 = 0;
        if (byArray6 != null) {
            for (n7 = 0; n7 < byArray6.length; ++n7) {
                for (n6 = 1; n6 < byArray6[n7].length; ++n6) {
                    if (byArray6[n7][n6][3] != 0) continue;
                    n9 = (byArray6[n7][n6][0] * 20 - 20 + byArray2[byArray6[n7][0][0] * 3 + 1] * 240) * n15 / 240 - n4 * n15 + n22;
                    n8 = 320 - ((byArray6[n7][n6][1] * 20 + 20 + 20 + byArray2[byArray6[n7][0][0] * 3 + 2] * 320) * n15 / 320 - n5 * n15) - n23;
                    this.a(imageArray[27][0], 27, n14, n9 - 5, n8 - 5, sArray);
                }
            }
        }
        this.a(imageArray[27], sArray2[27][35], 5, 255, 1, sArray[27], (byte)1, 0, 0, 27);
        if (n == 0) {
            this.a(0, 257, 240, 63, 0);
            n7 = 2;
            n6 = n7 + 15;
            int n24 = 276;
            int n25 = 60;
            i.setColor(13434913);
            i.fillRect(n7, n24, 12, 12);
            i.setColor(255);
            i.fillRect(n7 + n25 * 2, n24, 12, 12);
            i.setColor(16758528);
            i.fillRect(n7 + n25 * 3, n24, 12, 12);
            this.a(imageArray[27][0], 27, n14, n7 + n25, n24 + 2, sArray);
            i.setColor(13673568);
            i.drawString("BOSS", n6, n24 + this.g, 4 | 0x10);
            i.drawString("\u5b9d\u7269", n6 + n25, n24 + this.g, 4 | 0x10);
            i.drawString("\u5b58\u6863", n6 + n25 * 2, n24 + this.g, 4 | 0x10);
            i.drawString("\u6cb9\u753b", n6 + n25 * 3, n24 + this.g, 4 | 0x10);
            i.drawString("\u5f53\u524d\u5730\u56fe\u63a2\u7d22\u5ea6:" + this.d.bO[this.d.q] + "%", 120, 319 + this.g, 1 | 0x20);
            byte[][] byArrayArray = new byte[][]{{5, 0, 0, 24}, {0, 0, 0, 3}, {2, 0, 0, 25}, {4, 0, 0, 25}, {8, 0, 0, 19}, {4, 0, 0, 24}, {5, 0, 0, 22}, {9, 0, 0, 16}, {8, 0, 0, 21}, {29, 0, 0, 20}};
            if (n5 < byArrayArray[this.d.q][0]) {
                this.d.a(i2.T[3], 112, 0, 27);
                this.d.a(i2.T[11], 112, 0, 27);
            }
            if (n5 > byArrayArray[this.d.q][1]) {
                this.d.a(i2.T[2], 112, -244, 27);
                this.d.a(i2.T[10], 112, -244, 27);
            }
            if (n4 > byArrayArray[this.d.q][2]) {
                this.d.a(i2.T[0], 0, -125, 27);
                this.d.a(i2.T[8], 0, -125, 27);
            }
            if (n4 < byArrayArray[this.d.q][3]) {
                this.d.a(i2.T[1], 209, -125, 27);
                this.d.a(i2.T[9], 209, -125, 27);
            }
            this.a(1, imageArray, sArray, sArray2);
        } else if (n == 1) {
            this.a("\u63090\u952e\u53ef\u67e5\u770b\u5c0f\u5730\u56fe", 120, 260, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        }
    }

    public void a(byte[] byArray, byte[][] byArray2, int n, i i2, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.d.a(i2.T[0], 120, -160, i2.ag);
        if (this.d.bm[73] == 1) {
            this.d.a(i2.T[1], 120, -160, i2.ag);
        }
        int[] nArray = new int[]{1, 2, 3, 4, 5, 6};
        this.a(imageArray[33], sArray2[33][nArray[byArray2[0][0]]], 120, 100, 1, sArray[33], (byte)1, 0, 0, 33);
        this.d.a(i2.T[2], 120, -160, i2.ag);
        if (n == 1) {
            this.b(imageArray, sArray, sArray2);
        }
    }

    public void a(Image[][] imageArray, i i2, int n, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        if (n == 0) {
            this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
            this.a("\u5b58\u50a8\u4e2d\u2026\u2026", 120, 190, 0x10 | 1, i, game.j.as[0], 2761505, 0xFFFFFF);
            this.a(2761505, game.j.as[0]);
            this.a(i, stringArray[this.d.ax[10]][0], 2761505, 5, 210, 20, 230, 0x10 | 4, game.j.as[0]);
        } else if (n == 1) {
            this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
            this.a("\u5b58\u50a8\u6210\u529f", 120, 210, 0x10 | 1, i, game.j.as[0], 2761505, 0xFFFFFF);
            this.d.a(i2.T[7], 120, -170, 27);
        } else if (n == 2) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a("\u662f\u5426\u82b1\u8d39100\u91d1\u5e01", 120, 127, 0x10 | 1, 2761505, game.j.as[0]);
            this.a("\u50a8\u5b58\u6e38\u620f\u5e76\u56de\u590d\uff1f", 120, 149, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(2, imageArray, sArray, sArray2);
        }
    }

    public void a(Image[][] imageArray, i i2, a a2, short[][][] sArray, short[][][][] sArray2) {
        int n;
        int n2 = 45;
        int n3 = 80;
        int n4 = 26;
        int n5 = 242;
        int n6 = 85;
        int n7 = 118;
        this.b(29, imageArray, sArray, sArray2);
        this.d.a(i2.T[7], 120, -n5, 27);
        this.a("\u89d2\u8272\u7b49\u7ea7\u63d0\u5347\uff01", 120, n3, 1 | 0x10, i, game.j.as[0], 2761505, 0xFFFFFF);
        String[] stringArray = new String[]{"\u7b49\u7ea7", "\u751f\u547d", "\u9b54\u529b", "\u653b\u51fb", "\u9632\u5fa1"};
        String[] stringArray2 = new String[]{"" + a2.a[2], "" + a2.b[2], "" + a2.v[2], "" + a2.N[2], "" + a2.R[2]};
        String[] stringArray3 = new String[]{"" + a2.a[0], "" + a2.b[0], "" + a2.v[0], "" + a2.N[0], "" + a2.R[0]};
        this.a(2761505, game.j.as[0]);
        for (n = 0; n < stringArray.length; ++n) {
            i.drawString(stringArray[n] + ":" + stringArray2[n], n2, n3 + n4 + n4 * n + this.g, 4 | 0x10);
            i.drawString("-->", n2 + this.e * 5, n3 + n4 + n4 * n + this.g, 4 | 0x10);
        }
        this.a(5302767, game.j.as[0]);
        for (n = 0; n < stringArray3.length; ++n) {
            i.drawString(stringArray3[n], n2 + this.e * 7, n3 + n4 + n4 * n + this.g, 4 | 0x10);
        }
    }

    public void a(Image[][] imageArray, i i2, int n, a a2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n2;
        this.b(29, imageArray, sArray, sArray2);
        this.d.a(i2.T[7], 120, -242, 27);
        int n3 = 45;
        int n4 = 80;
        int n5 = 20;
        int n6 = 36;
        this.a("\u6b66\u5668\u7b49\u7ea7\u63d0\u5347\uff01", 120, n4, 1 | 0x10, i, game.j.as[0], 2761505, 0xFFFFFF);
        String[] stringArray2 = new String[]{"\u7b49\u7ea7", "\u653b\u51fb"};
        String[] stringArray3 = new String[]{"" + n, "" + this.d.ch[a2.i] * this.d.bP[n] * (100 + this.d.cz[0]) / 10000};
        String[] stringArray4 = new String[]{"" + a2.al, "" + this.d.ch[a2.i] * this.d.bP[a2.al] * (100 + this.d.cz[0]) / 10000};
        this.a(2761505, game.j.as[0]);
        for (n2 = 0; n2 < stringArray2.length; ++n2) {
            i.drawString(stringArray2[n2] + ":" + stringArray3[n2], n3, n4 + n5 + n5 * n2 + this.g, 4 | 0x10);
            i.drawString("-->", n3 + this.e * 5, n4 + n5 + n5 * n2 + this.g, 4 | 0x10);
        }
        this.a(5302767, game.j.as[0]);
        for (n2 = 0; n2 < stringArray4.length; ++n2) {
            i.drawString(stringArray4[n2], n3 + this.e * 7, n4 + n5 + n5 * n2 + this.g, 4 | 0x10);
        }
        this.a(i, "\u606d\u559c\uff01\u60a8\u83b7\u5f97\u4e00\u6b21\u6b66\u5668\u9644\u9b54\u673a\u4f1a\uff01\u53ea\u6709\u6b66\u5668\u5347\u7ea7\u624d\u53ef\u9644\u9b54\u3002", 2761505, n6, n4 + n5 * 3, n5, 240 - n6 * 2, 0x10 | 4, game.j.as[0]);
    }

    public void a(Image[][] imageArray, i i2, byte by, int n, short[][][] sArray, short[][][][] sArray2) {
        this.b(29, imageArray, sArray, sArray2);
        this.d.a(i2.T[7], 120, -242, 27);
        int n2 = 45;
        int n3 = 80;
        int n4 = 26;
        String[][] stringArrayArray = new String[][]{{"\u5934\u76ee\u623f\u95f4:\u4f2f\u7235", "\u63a8\u8350\u7b49\u7ea7:5", "\u653b\u51fb:32~48"}, {"\u5934\u76ee\u623f\u95f4:\u6b7b\u795e", "\u63a8\u8350\u7b49\u7ea7:12", "\u653b\u51fb:60~90"}, {"\u5934\u76ee\u623f\u95f4:\u6218\u795e", "\u63a8\u8350\u7b49\u7ea7:16", "\u653b\u51fb:96~144"}, {"\u5934\u76ee\u623f\u95f4:\u4f2f\u7235", "\u63a8\u8350\u7b49\u7ea7:24", "\u653b\u51fb:80~120"}, {"\u5934\u76ee\u623f\u95f4:\u9b45\u9b54", "\u63a8\u8350\u7b49\u7ea7:32", "\u653b\u51fb:144~216"}, {"\u5934\u76ee\u623f\u95f4:\u6b7b\u795e", "\u63a8\u8350\u7b49\u7ea7:42", "\u653b\u51fb:224~336"}, {"\u5934\u76ee\u623f\u95f4:\u6218\u795e", "\u63a8\u8350\u7b49\u7ea7:65", "\u653b\u51fb:320~480"}, {"\u5934\u76ee\u623f\u95f4:\u4f2f\u7235", "\u63a8\u8350\u7b49\u7ea7:80", "\u653b\u51fb:176~264"}, {"\u5934\u76ee\u623f\u95f4:\u9b45\u9b54", "\u63a8\u8350\u7b49\u7ea7:99", "\u653b\u51fb:288~432"}};
        this.a(stringArrayArray[by - 11][0], 120, n3, 1 | 0x10, i, game.j.as[0], 2761505, 0xFFFFFF);
        this.a(2761505, game.j.as[0]);
        i.drawString(stringArrayArray[by - 11][1], 120, n3 + n4 + this.g, 1 | 0x10);
        i.drawString("\u5934\u76ee\u6389\u843d:", n2, n3 + 2 * n4 + this.g, 4 | 0x10);
        this.a(this.d.b[1][0][1][n], 120, n3 + n4 * 3, 0x10 | 1, this.a(n, 0), game.j.as[0]);
        this.a(stringArrayArray[by - 11][2], 120, n3 + n4 * 4, 0x10 | 1, 13434913, game.j.as[0]);
        this.a("\u9b54\u6cd5\uff1a" + this.d.b[1][0][2][this.d.aF[n][11]], 120, n3 + n4 * 5, 0x10 | 1, 255, game.j.as[0]);
    }

    public void a(Image[][] imageArray, i i2, int n, int n2, short s, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
        int n3 = 190;
        int n4 = 20;
        int[] nArray = this.a(n2);
        if (s == 0) {
            this.a("\u51fb\u6740\u65f6\u95f4:", 120, n3, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(nArray[0] + "\u65f6" + nArray[1] + "\u5206" + nArray[2] + "\u79d2", 120, n3 + n4, 0x10 | 1, 2761505, game.j.as[0]);
        } else if (s == 1) {
            this.a("\u8bb0\u5f55\u66f4\u65b0!", 120, n3, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(nArray[0] + "\u65f6" + nArray[1] + "\u5206" + nArray[2] + "\u79d2", 120, n3 + n4, 0x10 | 1, 2761505, game.j.as[0]);
        }
    }

    public void a(Image[][] imageArray, String string, short s, short s2, short s3, short s4, short[][][] sArray, short[][][][] sArray2) {
        i.setColor(13673568);
        i.setFont(game.j.as[0]);
        i.setClip(0, 0, 240, 295);
        this.a(i, string, 13673568, 240 - s4 >> 1, (int)s2, (int)s3, (int)s4, 0x10 | 4, game.j.as[0]);
        this.a(0, 290, 240, 30, 0);
        this.a("\u63090\u952e\u8df3\u8fc7", 120, 295, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
    }

    public void b(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 130;
        int n2 = 22;
        this.a(i, 2761505, 0, 0, 240, 320);
        this.b(27, imageArray, sArray, sArray2);
        String[] stringArray = new String[]{"\u65b0\u7684\u6e38\u620f\u4f1a\u6e05", "\u9664\u4ee5\u524d\u5b58\u6863,", "\u662f\u5426\u786e\u5b9a?"};
        for (int k = 0; k < stringArray.length; ++k) {
            this.a(stringArray[k], 120, n + n2 * k, 0x10 | 1, 2761505, game.j.as[0]);
        }
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 130;
        int n2 = 22;
        this.a(0, 0, 240, 320, 0);
        this.b(27, imageArray, sArray, sArray2);
        String[] stringArray = new String[]{"\u6e38\u620f\u7ed3\u675f", "\u662f\u5426\u7ee7\u7eed?"};
        for (int k = 0; k < stringArray.length; ++k) {
            this.a(stringArray[k], 120, n + n2 * k, 0x10 | 1, 2761505, game.j.as[0]);
        }
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(i i2, i i3, int n, int n2, int n3, short s, short s2, int n4, byte[][] byArray, String[][][][] stringArray, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n5 = 10;
        int n6 = 263;
        int n7 = 25;
        int n8 = 271;
        int n9 = 20;
        int n10 = 70;
        int n11 = 180;
        int n12 = 190;
        int n13 = 170;
        int n14 = 45;
        int n15 = 80;
        int n16 = 26;
        int n17 = 138;
        int n18 = 28;
        if (n4 > 0) {
            String string = "";
            switch (byArray[n4][1]) {
                case 0: {
                    this.d.a(i2.T[5], this.d.ay.I, this.d.ay.G + n10, i2.ag);
                    this.a(imageArray[27], sArray2[27][61], 0, 260 - n6, 1, sArray[27], (byte)1, 0, 0, 27);
                    this.a(2761505, game.j.as[0]);
                    this.a(i, stringArray[0][0][byArray[n4][2]][0], 2761505, n7, n8, n9, 240 - n7 * 2, 0x10 | 4, game.j.as[0]);
                    break;
                }
                case 2: {
                    if (this.d.bn[0] != 7) break;
                    this.a(imageArray[27], sArray2[27][61], 0, 260 - n6, 1, sArray[27], (byte)1, 0, 0, 27);
                    this.a(2761505, game.j.as[0]);
                    string = stringArray[0][0][byArray[n4][2]][0];
                    this.a(i, string, 2761505, n7, n8, n9, 240 - n7 * 2, 0x10 | 4, game.j.as[0]);
                    break;
                }
                case 3: {
                    string = stringArray[0][0][byArray[n4][2]][this.d.bm[43]];
                    if (s <= 0) break;
                    this.a(imageArray[27], sArray2[27][60], 0, 260 - n11, 1, sArray[27], (byte)1, 0, 0, 27);
                    if (s2 == 0) {
                        this.d.a(i3.T[7], 120, -n13, 27);
                    }
                    this.a(2761505, game.j.as[0]);
                    this.a(i, string, 2761505, n5, n12, n9, 240 - n5 * 2, 0x10 | 4, game.j.as[0]);
                    break;
                }
                case 4: {
                    if (this.d.bn[0] != 7) break;
                    this.a(i, 2761505, 0, 0, 240, 320);
                    if (n4 == 58 || n4 == 136) {
                        this.b(27, imageArray, sArray, sArray2);
                        for (int k = 0; k < stringArray[0][0][byArray[n4][2]].length; ++k) {
                            this.a(stringArray[0][0][byArray[n4][2]][k], 120, n17 + n18 * k, 0x10 | 1, 2761505, game.j.as[0]);
                        }
                    } else if (n4 >= 80 && n4 <= 89) {
                        this.b(29, imageArray, sArray, sArray2);
                        int n19 = n4 - 80;
                        this.a("\u83b7\u5f97\u65b0\u6b66\u5668:", n14, n15, 0x10 | 4, 2761505, game.j.as[0]);
                        this.a(stringArray[0][0][byArray[n4][2]][0], 120, n15 + n16, 0x10 | 1, this.a(n19, 0), game.j.as[0]);
                        this.a(stringArray[1][0][3][n19], 120, n15 + n16 * 2, 0x10 | 1, 2761505, game.j.as[0]);
                        this.a("\u521d\u59cb\u653b\u51fb\u529b:" + this.d.ch[this.d.bm[12]], n14, n15 + n16 * 3, 0x10 | 4, 2761505, game.j.as[0]);
                        this.a("\u6ee1\u7ea7\u653b\u51fb\u529b:" + this.d.ch[this.d.bm[12]] * 3, n14, n15 + n16 * 4, 0x10 | 4, 2761505, game.j.as[0]);
                        this.a(stringArray[1][0][2][this.d.aF[n19][11]], n14, n15 + n16 * 5, 0x10 | 4, 2761505, game.j.as[0]);
                        this.a("\u662f\u5426\u9a6c\u4e0a\u88c5\u5907\uff1f", 120, n15 + n16 * 6, 0x10 | 1, 2761505, game.j.as[0]);
                    }
                    this.a(2, imageArray, sArray, sArray2);
                    break;
                }
                case 1: {
                    if (s == 0) {
                        this.d.a(i3.T[6], 0, -n11, 27);
                        break;
                    }
                    this.a(imageArray[27], sArray2[27][60], 0, 260 - n11, 1, sArray[27], (byte)1, 0, 0, 27);
                    if (s2 == 0) {
                        this.d.a(i3.T[7], 120, -n13, 27);
                    }
                    this.a(2761505, game.j.as[0]);
                    if (n4 == 133) {
                        this.a(i, this.d.bh[this.d.ax[10]][0], 2761505, n5, n12, n9, 240 - n5 * 2, 0x10 | 4, game.j.as[0]);
                        break;
                    }
                    this.a(i, stringArray[2][byArray[n4][2]][this.d.bm[43]][1], 2761505, n5, n12, n9, 240 - n5 * 2, 0x10 | 4, game.j.as[0]);
                }
            }
        }
    }

    public void d(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.b(34, imageArray, sArray, sArray2);
        this.a("\u662f\u5426\u5f00\u542f\u58f0\u97f3?", 120, 100, 0x10 | 1, 2761505, game.j.as[0]);
        this.a("\u662f", 60, 200, 0x10 | 1, 2761505, game.j.as[0]);
        this.a("\u5426", 180, 200, 0x10 | 1, 2761505, game.j.as[0]);
        this.a("\u5173\u95ed\u58f0\u97f3\u8fd0\u884c\u4f1a\u66f4\u6d41\u7545", 120, 265, 0x10 | 1, 2761505, game.j.as[0]);
        this.b(40, 60, 160, 200, 2761505);
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, Graphics graphics) {
        Graphics graphics2 = graphics == null ? i : graphics;
        int[][] nArrayArray = new int[][]{{n3, n5 + n3, n5 + n3, n3}, {n4, n4, n4 + n6, n4 + n6}};
        DirectGraphics directGraphics = DirectUtils.getDirectGraphics((Graphics)graphics2);
        graphics2.setClip(0, 0, n5, n6);
        if (n < 255) {
            directGraphics.fillPolygon(nArrayArray[0], 0, nArrayArray[1], 0, 4, (n << 24) + n2);
        } else {
            graphics2.setColor(n2);
            graphics2.fillRect(n3, n4, n5, n6);
        }
    }

    public int[] a(int n) {
        int[] nArray = new int[]{0, 0, 0};
        int n2 = n * d.G / 1000;
        nArray[0] = n2 / 3600;
        nArray[1] = (n2 - nArray[0] * 3600) / 60;
        nArray[2] = n2 - nArray[0] * 3600 - nArray[1] * 60;
        return nArray;
    }

    public void a(Image[][] imageArray, game.d d2, short[][][] sArray, short[][][][] sArray2) {
        this.b(34, imageArray, sArray, sArray2);
        i.setFont(game.j.as[0]);
        i.setClip(0, 0, 240, 320);
        i.setColor(2761505);
        int n = 46;
        int n2 = 5;
        n2 = game.j.as[0].stringWidth("\u80cc\u666f\u97f3\u4e50 : ");
        i.drawString("\u8bbe\u7f6e\u9009\u9879", 120, 40 + this.g, 1 | 0x10);
        i.drawString("\u80cc\u666f\u97f3\u4e50 : ", n, 150 + this.g, 4 | 0x10);
        this.a(n + n2, 150, 2761505, 2761505, (int)game.d.a((byte)1), 4);
        i.setClip(0, 0, 240, 320);
        this.a(1, imageArray, sArray, sArray2);
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = 4;
        int n9 = 4;
        i.setColor(n4);
        int n10 = n2 + game.j.as[0].getHeight() - 3;
        for (n7 = 0; n7 < n6; ++n7) {
            i.drawRect(n + n7 * (n8 + 1), n10 - (n7 + 1) * n9, n8, (n7 + 1) * n9);
        }
        i.setColor(n3);
        for (n7 = 0; n7 < n5; ++n7) {
            i.fillRect(n + n7 * (n8 + 1), n10 - (n7 + 1) * n9, n8, (n7 + 1) * n9);
        }
    }

    public void a(Image[][] imageArray, i i2, int n, int n2, short[][][] sArray, short[][][][] sArray2) {
        switch (n) {
            case 0: {
                this.a(imageArray[26], sArray2[26][130], 0, 260, 1, sArray[26], (byte)1, 0, 0, 26);
                this.a(105, 15, 78, 4, 1, 1, 16760563, 12783632, 0x850000);
                this.a(105, 28, 78, 4, 1, 1, 7459823, 1640393, 786809);
                int n3 = game.j.as[0].stringWidth("999999");
                this.a("999999", 225 - n3, 42, 0x10 | 4, i, game.j.as[0], 2761505, 16646090);
                this.a(imageArray[26], sArray2[26][358], 225 - n3 - 5, 215, 1, sArray[26], (byte)1, 0, 0, 26);
                this.a("99", 79, 17, 0x10 | 1, i, game.j.as[0], 2761505, 16646090);
                this.b(imageArray, 9999, 9999, 185, 13, sArray, sArray2);
                this.b(imageArray, 9999, 9999, 185, 26, sArray, sArray2);
                i.setFont(game.j.as[0]);
                i.setClip(0, 0, 240, 320);
                i.setColor(0xFFFFFF);
                i.drawLine(29, 34, 29, 70);
                i.drawLine(79, 30, 79, 120);
                i.drawLine(108, 29, 108, 160);
                i.drawLine(152, 17, 152, 200);
                i.drawLine(196, 50, 196, 120);
                i.setColor(13673568);
                i.drawString("\u5934\u50cf", 29, 75 + this.g, 1 | 0x10);
                i.drawString("\u7b49\u7ea7", 79, 125 + this.g, 1 | 0x10);
                i.drawString("\u9b54\u529b\u503c", 108, 165 + this.g, 1 | 0x10);
                i.drawString("\u751f\u547d\u503c", 152, 205 + this.g, 1 | 0x10);
                i.drawString("\u91d1\u94b1", 196, 125 + this.g, 1 | 0x10);
                break;
            }
            case 1: {
                i.setFont(game.j.as[0]);
                i.setClip(0, 0, 240, 320);
                i.setColor(13673568);
                String[] stringArray = new String[]{"4,6 --- \u5de6\u53f3\u8dd1\u52a8", "5 --- \u6b66\u5668\u653b\u51fb", "\u653b\u51fb\u4e2d\u6309\u540e\u9000\u53ef\u95ea\u907f", "2 --- \u5411\u4e0a\u8df3\u8dc3", "1,3 --- \u5de6\u53f3\u659c\u8df3", "\u5728\u7a7a\u4e2d\u53ef\u4ee5\u4e8c\u6b21\u8df3\u8dc3", "9 --- \u4f7f\u7528\u9b54\u6cd5", "8 --- \u4e0b\u8e72", "\u53cc\u51fb8\u952e\u53ef\u4ee5\u4e0b\u8df3", "0 --- \u67e5\u770b\u5730\u56fe"};
                for (int k = 0; k < stringArray.length; ++k) {
                    i.drawString(stringArray[k], 40, 30 + k * 20 + this.g, 4 | 0x10);
                }
                break;
            }
            case 2: {
                i.setFont(game.j.as[0]);
                i.setClip(0, 0, 240, 320);
                i.setColor(13673568);
                String string = "\u5343\u5203\u65a9\u5996\uff0c\u4e07\u5251\u4f0f\u9b54\uff01\u5b8c\u7f8e\u8d85\u8d8a\u524d\u4ee3\u7684\u534e\u4e3d\u7684\u6218\u6597\u573a\u9762\uff0c\u4e3a\u60a8\u5448\u73b0\u4eab\u53d7\u4e0d\u5c3d\u7684\u89c6\u89c9\u76db\u5bb4\uff01\u66f4\u6dfb\u591a\u7ea7\u591a\u79cd\u4e0d\u540c\u7684\u9644\u52a0\u9b54\u6cd5\uff0c\u8ba9\u60a8\u7684\u6218\u6597\u5386\u9669\u5145\u6ee1\u671f\u5f85\uff01\u8d85\u5927\u7684\u5730\u56fe\u3001\u4f17\u591a\u7684\u6b66\u5668\u3001\u7eda\u4e3d\u7684\u9b54\u6cd5\u3001\u6d77\u91cf\u7684\u654c\u4eba\u3001\u723d\u5feb\u7684\u6218\u6597\uff01";
                this.a(i, string, 13673568, 10, 30, 20, 220, 0x10 | 4, game.j.as[0]);
            }
        }
        i.setFont(game.j.as[0]);
        i.setClip(0, 0, 240, 320);
        i.setColor(13673568);
        i.drawString(n + 1 + "/" + n2, 120, 290 + this.g, 1 | 0x10);
        if (n > 0) {
            this.d.a(i2.T[0], 49, -290, 27);
        }
        if (n < n2 - 1) {
            this.d.a(i2.T[1], 160, -290, 27);
        }
        this.a(1, imageArray, sArray, sArray2);
    }

    public void a(Image[] imageArray) {
        if (this.n[0] < 15) {
            i.setColor(0xFFFFFF);
            i.fillRect(0, 0, 240, 320);
            i.drawImage(imageArray[1], 120, 100, 17);
        }
    }

    public void c(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.b(34, imageArray, sArray, sArray2);
        String[] stringArray = new String[]{"\u65a9\u5996\u4f0f\u9b54\u5f552", "v 1.0.0", "\u5ba2\u670d\u7535\u8bdd\uff1a", "010-88901665", "\u5185\u5bb9\u63d0\u4f9b\uff1a\u534e\u5a31\u65e0\u7ebf"};
        i.setClip(0, 0, 240, 320);
        i.setFont(game.j.as[0]);
        i.setColor(2761505);
        int n = 20;
        for (int k = 0; k < stringArray.length; ++k) {
            i.drawString(stringArray[k], 120, n + (this.c + 2) * k + this.g, 0x10 | 1);
        }
        this.a(1, imageArray, sArray, sArray2);
    }

    public void showNotify() {
        this.d.w();
    }

    public void hideNotify() {
        this.d.f();
    }

    public int a(int n, int n2) {
        int n3 = 2761505;
        if (n2 == 0) {
            switch (n) {
                case 0: {
                    n3 = 0;
                    break;
                }
                case 1: 
                case 2: 
                case 3: {
                    n3 = 65280;
                    break;
                }
                case 4: 
                case 5: 
                case 6: {
                    n3 = 255;
                    break;
                }
                case 7: 
                case 8: 
                case 9: {
                    n3 = 0xFF00FF;
                }
            }
        }
        return n3;
    }

    public void a(String string, int n, int n2, int n3, Graphics graphics, Font font, int n4, int n5) {
        int n6 = graphics.getColor();
        graphics.setFont(font);
        graphics.setClip(0, 0, 240, 320);
        int[][] nArrayArray = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        graphics.setColor(n4);
        for (int k = 0; k < nArrayArray.length; ++k) {
            graphics.drawString(string, n + nArrayArray[k][0], n2 + nArrayArray[k][1] + this.g, n3);
        }
        graphics.setColor(n5);
        graphics.drawString(string, n, n2 + this.g, n3);
        graphics.setColor(n6);
    }

    private void b(int n, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        switch (n) {
            case 27: {
                this.a(imageArray[27], 10, sArray[27], 33, 125, 174, 64);
                this.a(imageArray[27], sArray2[27][27], 20, 151, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 28: {
                this.a(imageArray[27], 10, sArray[27], 33, 97, 174, 124);
                this.a(imageArray[27], sArray2[27][28], 20, 179, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 29: {
                this.a(imageArray[27], 10, sArray[27], 33, 69, 174, 184);
                this.a(imageArray[27], sArray2[27][29], 20, 207, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 34: {
                this.a(imageArray[27], 27, sArray[27], 5, 9, 230, 284);
                this.a(imageArray[27], sArray2[27][34], 0, 256, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 5: {
                this.a(imageArray[27], 27, sArray[27], 6, 166, 229, 126);
                this.a(imageArray[27], sArray2[27][5], 1, 99, 1, sArray[27], (byte)1, 0, 0, 27);
            }
        }
    }

    public void a(Image image, int n, int n2, int n3) {
        i.drawImage(image, n, n2, n3);
    }

    public void a(boolean bl, int n) {
        if (this.d.bm[87] >= 0 && this.d.bm[87] <= 2) {
            this.a(0xFFFFFF, game.j.as[0]);
            int n2 = 15;
            String[] stringArray = new String[]{"\u793c\u62dc\u5802", "\u68a6\u5883\u753b\u5eca", "\u7b2c\u4e00\u7ae0\uff1a\u56f0\u60d1", "\u7b2c\u4e8c\u7ae0\uff1a\u75db\u82e6", "\u7b2c\u4e09\u7ae0\uff1a\u60b2\u4f24", "\u7b2c\u56db\u7ae0\uff1a\u6050\u60e7", "\u7b2c\u4e94\u7ae0\uff1a\u618e\u6068", "\u7b2c\u516d\u7ae0\uff1a\u7edd\u671b", "\u7b2c\u4e03\u7ae0\uff1a\u6124\u6012", "\u6700\u7ec8\u7ae0\uff1a\u5e0c\u671b"};
            int n3 = (stringArray[n].length() + 1) * this.e;
            int n4 = 240 - n3 >> 1;
            int n5 = 106 + this.c + 3;
            int n6 = n4 + this.e / 2;
            int n7 = 106;
            switch (this.d.bm[87]) {
                case 0: {
                    if (this.d.bm[88] > n3) break;
                    i.fillRect(n4, n5, (int)this.d.bm[88], 1);
                    if (bl) {
                        this.d.bm[88] = (short)(this.d.bm[88] + n2);
                    }
                    if (this.d.bm[88] <= n3) break;
                    this.d.bm[87] = 1;
                    this.d.bm[88] = 0;
                    break;
                }
                case 1: {
                    if (n5 - this.d.bm[88] < n7) break;
                    i.fillRect(n4, n5, n3, 1);
                    i.setClip(n4, n5 - (this.d.bm[88] + 1), n3, this.d.bm[88] + 1);
                    i.drawString(stringArray[n], n6, n5 - (this.d.bm[88] + 1) + this.g, 0x10 | 4);
                    i.drawString(stringArray[n], n6 + (this.d.cx.nextInt() & Integer.MAX_VALUE) % 3 - 1, n5 - (this.d.bm[88] + 1) + (this.d.cx.nextInt() & Integer.MAX_VALUE) % 3 - 1 + this.g, 0x10 | 4);
                    if (bl) {
                        this.d.bm[88] = (short)(this.d.bm[88] + 1);
                    }
                    if (n5 - this.d.bm[88] >= n7) break;
                    this.d.bm[87] = 2;
                    this.d.bm[88] = 0;
                    break;
                }
                case 2: {
                    if (this.d.bm[88] > 30) break;
                    i.fillRect(n4, n5, n3, 1);
                    i.setClip(n4, n7, n3, n5 - n7);
                    i.drawString(stringArray[n], n6, n7 + this.g, 0x10 | 4);
                    i.drawString(stringArray[n], n6 + (this.d.cx.nextInt() & Integer.MAX_VALUE) % 2, n7 + (this.d.cx.nextInt() & Integer.MAX_VALUE) % 2 + this.g, 0x10 | 4);
                    if (bl) {
                        this.d.bm[88] = (short)(this.d.bm[88] + 1);
                    }
                    if (this.d.bm[88] < 30) break;
                    this.d.bm[87] = 3;
                    this.d.bm[88] = 0;
                }
            }
        }
    }

    public void b() {
        int[][] nArrayArray;
        if (this.d.u[0] == 11 && this.d.i[this.d.bb] == 24 || this.d.u[0] == 29) {
            this.a[0] = 120;
            this.a[1] = this.e * this.d.b[1][0][7][this.d.ce[this.d.bT[this.d.bb][this.d.bg[this.d.bb]][0]]].length();
        }
        if (this.d.u[0] == 11 && this.d.i[this.d.bb] == 25 && (nArrayArray = new int[][]{{2, 5}, {4, 4}, {11, 4}, {9, 4}, {14, 4}, {5, 5}, {5, 5}, {5, 5}, {5, 5}, {5, 5}, {5, 5}})[this.d.cj[this.d.bT[this.d.bb][this.d.bg[this.d.bb]][0]]][0] > nArrayArray[this.d.cj[this.d.bT[this.d.bb][this.d.bg[this.d.bb]][0]]][1]) {
            this.l[0] = 30;
            this.l[1] = nArrayArray[this.d.cj[this.d.bT[this.d.bb][this.d.bg[this.d.bb]][0]]][0] * 24;
        }
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, String string, int n7) {
        int n8 = i.getClipX();
        int n9 = i.getClipY();
        int n10 = i.getClipWidth();
        int n11 = i.getClipHeight();
        int n12 = i.getColor();
        i.setClip(n2, n3, n4, n5);
        i.setColor(n7);
        if (n == 0) {
            i.drawString(string, n6 + n4 - this.a[0], n3 + this.g, 0x10 | 4);
        } else if (n == 1) {
            i.drawString(string, n2, n6 + n5 - this.l[0] + this.g, 0x10 | 4);
        }
        i.setClip(n8, n9, n10, n11);
        i.setColor(n12);
    }

    public void a(Image[][] imageArray, byte[] byArray, i i2, short[][] sArray, byte by, byte by2, byte[][] byArray2, h h2, String[][] stringArray, short[][][] sArray2, short[][][][] sArray3) {
        this.b(34, imageArray, sArray2, sArray3);
        int n = 28;
        int n2 = 25;
        int n3 = 22;
        int n4 = 20;
        int n5 = 31;
        int n6 = -1;
        int n7 = 5;
        int n8 = 46;
        int n9 = n2 + n3 * 2 + n4;
        int n10 = 78;
        int n11 = 122;
        int n12 = 25;
        int n13 = 0;
        byte by3 = 0;
        int n14 = n;
        int n15 = n9 + n12 * 3 + n4;
        int n16 = n3;
        this.d.a(i2.T[2], 114, -(n9 + n12 * 3), 27);
        this.d.a(i2.T[3], 114, -(n9 - n4), 27);
        this.d.a(i2.T[0], n8 - n5, -(n9 + n12 + 3), 27);
        this.d.a(i2.T[1], n10 + n11, -(n9 + n12 + 3), 27);
        int n17 = 35;
        int n18 = 70;
        int n19 = 20;
        int n20 = 98;
        int n21 = 20;
        int n22 = 138;
        int n23 = 25;
        this.a(2761505, game.j.as[0]);
        i.drawString("\u6b66\u5668\u5347\u7ea7\uff01", n, n2 + this.g, 0x10 | 4);
        i.drawString("\u8bf7\u9009\u62e9\u4e00\u4e2a\u9644\u52a0\u9b54\u6cd5:", n, n2 + n3 + this.g, 0x10 | 4);
        this.a(imageArray[27], sArray3[27][26], n10, 260 - (n9 + n12 - n7), 1, sArray2[27], (byte)1, 0, 0, 27);
        for (int k = 0; k < 3; ++k) {
            n6 = byArray2[0][0] - 1 + k;
            if (byArray.length >= 3) {
                if (n6 < 0) {
                    n6 = byArray.length - 1;
                } else if (n6 >= byArray.length) {
                    n6 = 0;
                }
            }
            this.a(imageArray[28], sArray3[28][this.d.j[byArray[n6]]], n8, 260 - (n9 + n12 * k), 1, sArray2[28], (byte)1, 0, 0, 28);
            by3 = byArray[n6];
            int n24 = n13 = sArray[byArray[n6]][0] == 0 ? 13434913 : 2761505;
            if (by3 == byArray[byArray2[0][0]]) {
                i.setClip(0, 0, 240, 320);
                this.a(stringArray[6][by3], n10 + n11 / 2, n9 + n12 * k + 3, 0x10 | 1, i, game.j.as[0], n13, 0xFFFFFF);
                continue;
            }
            this.a(stringArray[6][by3], n10 + n11 / 2, n9 + n12 * k + 3, 0x10 | 1, n13, game.j.as[0]);
        }
        String string = "";
        this.a(2761505, game.j.as[0]);
        i.drawString(stringArray[0][byArray[byArray2[0][0]]], n14, n15 + this.g, 0x10 | 4);
        i.drawString(stringArray[0][byArray[byArray2[0][0]]], n14, n15 + this.g, 0x10 | 4);
        this.a(0, n14, n15 + n16, 240 - n14 * 2, 20, n14, stringArray[7][byArray[byArray2[0][0]]], 2761505);
        this.a[0] = this.a[0] + 2;
        if (this.a[0] >= this.a[1] + 240 - n14 * 2) {
            this.a[0] = 0;
        }
        this.a(2761505, game.j.as[0]);
        if (sArray[byArray[byArray2[0][0]]][0] == 1) {
            i.drawString("\u62e5\u6709\u91d1\u5e01:", n14, n15 + 3 * n16 + this.g, 0x10 | 4);
            i.drawString("" + this.d.ay.au[0], n14 + this.e * 5, n15 + 3 * n16 + this.g, 0x10 | 4);
            i.drawString("\u82b1\u8d39\u91d1\u5e01:", n14, n15 + 2 * n16 + this.g, 0x10 | 4);
            int n25 = this.d.b(this.d.ay.al, this.a((int)this.d.ay.d, 0), (int)byArray[byArray2[0][0]]);
            this.a("" + n25, n14 + this.e * 5, n15 + 2 * n16, 0x10 | 4, this.d.ay.au[0] < n25 ? 13434913 : 2761505, game.j.as[0]);
        } else {
            i.drawString("\u4f7f\u7528\u9700\u8981\u8fbe\u6210\u6761\u4ef6:", n14, n15 + 2 * n16 + this.g, 0x10 | 4);
            i.setColor(13434913);
            i.drawString(stringArray[9][byArray[byArray2[0][0]]], n14, n15 + 3 * n16 + this.g, 0x10 | 4);
            switch (byArray[byArray2[0][0]]) {
                case 1: {
                    string = "\u5f53\u524d\u653b\u51fb\u529b:" + h2.N[1];
                    break;
                }
                case 2: {
                    string = "\u5f53\u524d\u6b66\u5668\u6536\u96c6\u5ea6:" + this.d.x() + "%";
                    break;
                }
                case 4: 
                case 6: 
                case 12: 
                case 15: {
                    string = "\u5c1a\u672a\u51fb\u8d25";
                    break;
                }
                case 5: {
                    int[] nArray = this.a(this.d.ax[6]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 8: {
                    int[] nArray = this.a(this.d.ax[7]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 11: {
                    int[] nArray = this.a(this.d.ax[8]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 14: {
                    int[] nArray = this.a(this.d.ax[9]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 7: 
                case 17: {
                    string = "\u5f53\u524d\u6740\u654c\u6570\u91cf:" + this.d.B[0];
                    break;
                }
                case 10: {
                    string = "\u5f53\u524d\u9632\u5fa1\u529b:" + h2.R[1];
                    break;
                }
                case 13: {
                    string = "\u5f53\u524d\u9b54\u529b\u4e0a\u9650:" + h2.v[1];
                    break;
                }
                case 16: {
                    string = "\u5f53\u524d\u751f\u547d\u4e0a\u9650:" + h2.b[1];
                    break;
                }
                case 18: 
                case 21: 
                case 22: 
                case 24: {
                    string = "\u5f53\u524d\u89d2\u8272\u7b49\u7ea7:" + h2.a[0];
                    break;
                }
                case 19: {
                    string = "\u5f53\u524d\u91d1\u5e01\u91cf:" + h2.au[0];
                    break;
                }
                case 20: {
                    string = "\u5f53\u524d\u6cb9\u753b\u89e3\u9501\u5ea6:" + this.d.J() + "%";
                    break;
                }
                case 23: {
                    int[] nArray = this.a(this.d.I[1]);
                    string = "\u5f53\u524d\u65f6\u95f4:" + this.d.I[0] + "\u65f6" + nArray[1] + "\u5206" + nArray[2] + "\u79d2";
                    break;
                }
                case 25: 
                case 26: {
                    string = "\u5f53\u524d\u5730\u56fe\u63a2\u7d22\u5ea6:" + this.d.c() + "%";
                }
            }
            i.drawString(string, n14, n15 + 4 * n16 + this.g, 0x10 | 4);
        }
        if (sArray[byArray[byArray2[0][0]]][0] == 1) {
            this.a(2, imageArray, sArray2, sArray3);
        } else {
            this.a(1, imageArray, sArray2, sArray3);
        }
        this.a("\u630946\u952e\u9009\u62e9\u7b49\u7ea7", 120, 320 - (this.c - 1), 0x10 | 1, 0xFFFFFF, game.j.as[0]);
        if (by == 0 && by2 == 1) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(29, imageArray, sArray2, sArray3);
            String[] stringArray2 = new String[]{"\u60a8\u5982\u679c\u53d6\u6d88\u6b64\u6b21\u9644\u9b54", "\u7684\u673a\u4f1a\uff0c\u90a3\u4e48\u672c\u6b21\u7684", "\u9644\u9b54\u4f4d\u7f6e\u5c31\u4f1a\u6c38\u8fdc\u65e0", "\u6cd5\u4ea7\u751f\u9644\u9b54\u6548\u679c\uff01", "", "\u771f\u7684\u51b3\u5b9a\u4e0d\u8fdb\u884c\u6b64\u6b21", "\u9644\u9b54\u4e86\u5417\uff1f"};
            for (int k = 0; k < stringArray2.length; ++k) {
                this.a(stringArray2[k], n17, n18 + n19 * k, 0x10 | 4, 0xFFFFFF, game.j.as[0]);
            }
            this.a(2, imageArray, sArray2, sArray3);
        } else if (by == 2) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(28, imageArray, sArray2, sArray3);
            this.a("\u60a8\u5bf9\u5f53\u524d\u6b66\u5668\u9644\u52a0\u4e86", 120, n20, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(stringArray[6][byArray[byArray2[0][0]]], 120, n20 + n21, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a(stringArray[0][byArray[byArray2[0][0]]], 120, n20 + n21 * 2, 0x10 | 1, 0xFFFFFF, game.j.as[0]);
            this.a("\u6d88\u8017\u91d1\u5e01" + this.d.b(this.d.ay.al, this.a((int)this.d.ay.d, 0), (int)byArray[byArray2[0][0]]), 120, n20 + n21 * 3, 0x10 | 1, 2761505, game.j.as[0]);
            this.a("\u786e\u5b9a\u5417\uff1f", 120, n20 + n21 * 4, 0x10 | 1, 2761505, game.j.as[0]);
            this.a(2, imageArray, sArray2, sArray3);
        } else if (by == 3) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray2, sArray3);
            if (by2 == 0) {
                this.a("\u9644\u9b54\u6210\u529f\uff01", 120, n22, 0x10 | 1, 2761505, game.j.as[0]);
                this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n22 + n23, 0x10 | 1, 2761505, game.j.as[0]);
            } else if (by2 == 1) {
                this.a("\u91d1\u94b1\u4e0d\u8db3\uff01", 120, n22, 0x10 | 1, 2761505, game.j.as[0]);
                this.a("\u6309\u786e\u5b9a\u952e\u8fd4\u56de", 120, n22 + n23, 0x10 | 1, 2761505, game.j.as[0]);
            }
            this.a(0, imageArray, sArray2, sArray3);
        }
    }

    public void f() {
        String string = "";
        this.a[1] = 0;
        if (this.d.aM[0][3] >= this.d.aM[0][2]) {
            string = string + "\u6309#\u952e\u67e5\u770b\u653b\u7565\u3002      ";
        }
        if (this.d.ax[16] == 1) {
            string = string + "\u6309*\u952e\u5f00\u542f\u968f\u8eab\u5546\u5e97\uff0c\u5546\u54c1\u4ef7\u683c\u51cf\u534a\u3002";
        }
        this.a[1] = this.a[1] + (this.e * string.length() + 190);
        this.a[0] = this.a[0] + 2;
        if (this.a[0] >= this.a[1] || this.a[0] < 0) {
            this.a[0] = 0;
        }
        this.a(0, 25, 260, 190, 20, 25, string, 0xFFFFFF);
    }

    public void a(Image[][] imageArray, int n, int n2, int n3, i i2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.b(34, imageArray, sArray, sArray2);
        int n4 = 26;
        int n5 = 45;
        int n6 = 22;
        int n7 = 30;
        if (n >= 7 && n <= 10) {
            int n8;
            this.a(imageArray[28], sArray2[28][this.d.cu[this.d.bm[85]]], n4, 260 - (n5 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(this.d.b[1][0][1][this.d.bm[85]], n4 + n7, n5, 0x10 | 4, this.a((int)this.d.bm[85], 0), game.j.as[0]);
            int n9 = 0;
            for (n8 = 0; n8 < 3; ++n8) {
                if (this.d.bJ[this.d.q][0][1][7 + n8] < 0 || this.d.bJ[this.d.q][0][1][7 + n8] > 2) continue;
                n9 += this.d.K[this.d.bJ[this.d.q][0][1][7 + n8]][1];
            }
            this.a("\u653b\u51fb:" + this.d.aA[this.d.bm[85]][0] * this.d.bJ[this.d.q][0][1][6] * (this.d.bP[4] / 100) * (100 + n9) / 10000, n4 + n7 + this.e * 4, n5, 0x10 | 4, 2761505, game.j.as[0]);
            this.a("\u9644\u9b54:", n4, n5 + n6, 0x10 | 4, 2761505, game.j.as[0]);
            for (n8 = 0; n8 < 3; ++n8) {
                this.a(imageArray[28], sArray2[28][this.d.j[this.d.bJ[this.d.q][0][1][7 + n8]]], n4 + this.e * 2 + 5, 260 - (n5 + n6 + n8 * n6 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
                this.a(this.d.b[1][0][0][this.d.bJ[this.d.q][0][1][7 + n8]], n4 + this.e * 2 + 5 + n7, n5 + n6 + n8 * n6, 0x10 | 4, 2761505, game.j.as[0]);
            }
            this.a(2761505, game.j.as[0]);
            i.drawString("(\u4f60\u73b0\u5728\u7684\u6b66\u5668\u653b\u51fb:" + this.d.ch[this.d.ay.i] * this.d.bP[this.d.ao[this.d.ay.i][2]] * (100 + this.d.cz[0]) / 10000 + ")", n4, n5 + 4 * n6, 0x10 | 4);
            i.drawString("\u53ea\u9700" + this.d.aM[n][2] + "\u5143\uff0c\u60a8\u5c31\u53ef\u4ee5\u83b7\u5f97:", n4, n5 + 5 * n6, 0x10 | 4);
            if (n == 10) {
                i.drawString("\u672c\u6e38\u620f\u6700\u5f3a\u7684\u6b66\u5668!", n4, n5 + 6 * n6, 0x10 | 4);
            } else {
                i.drawString("\u8fd9\u628a\u5f3a\u5927\u7684\u6b66\u5668!", n4, n5 + 6 * n6, 0x10 | 4);
            }
            i.drawString("\u8d44\u8d39" + this.d.aM[n][1] + "\u5143/\u6761\uff0c\u4e0d\u542b\u901a\u4fe1\u8d39", n4, n5 + 7 * n6, 0x10 | 4);
            i.drawString("\u5ba2\u670d\u7535\u8bdd\uff1a010-88901665", n4, n5 + 8 * n6, 0x10 | 4);
            this.a("\u60a8\u8fd8\u9700\u53d1\u9001" + n3 + "\u6761\u4fe1\u606f", n4, n5 + 9 * n6, 0x10 | 4, 13434913, game.j.as[0]);
        } else {
            this.a(2761505, game.j.as[0]);
            for (int k = 0; k < stringArray[n].length; ++k) {
                i.drawString(stringArray[n][k], n4, n5 + k * n6, 0x10 | 4);
            }
            this.a("\u60a8\u8fd8\u9700\u53d1\u9001" + n3 + "\u6761\u4fe1\u606f", n4, n5 + stringArray[n].length * n6, 0x10 | 4, 13434913, game.j.as[0]);
            if (n == 1 || n == 3) {
                this.d.a(i2.T[1], 10, -(n5 + n6), 27);
            } else if (n == 2 || n == 4) {
                this.d.a(i2.T[1], 10, -(n5 + n6 + n6), 27);
            }
        }
        this.a(2, imageArray, sArray, sArray2);
        this.a(imageArray, n2, n3, sArray, sArray2);
    }

    public void a(Image[][] imageArray, int n, int n2, short[][][] sArray, short[][][][] sArray2) {
        int n3 = 127;
        int n4 = 20;
        int n5 = 96;
        int n6 = n4;
        switch (n) {
            case 1: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u53d1\u9001\u4e2d...", 120, n3, 0x10 | 1, 2761505, game.j.as[0]);
                break;
            }
            case 2: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u8d2d\u4e70\u6210\u529f", 120, n3, 0x10 | 1, 2761505, game.j.as[0]);
                this.a(0, imageArray, sArray, sArray2);
                break;
            }
            case 3: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u8d2d\u4e70\u5931\u8d25", 120, n3, 0x10 | 1, 2761505, game.j.as[0]);
                this.a(0, imageArray, sArray, sArray2);
                break;
            }
            case 4: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(28, imageArray, sArray, sArray2);
                this.a("\u8d2d\u4e70\u6210\u529f", 120, n5, 0x10 | 1, 2761505, game.j.as[0]);
                this.a("\u60a8\u8fd8\u9700\u53d1\u9001" + n2 + "\u6761\u4fe1\u606f", 120, n5 + n6, 0x10 | 1, 13434913, game.j.as[0]);
                this.a("\u662f\u5426\u53d1\u9001\uff1f", 120, n5 + n6 * 2, 0x10 | 1, 2761505, game.j.as[0]);
                this.a(2, imageArray, sArray, sArray2);
            }
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, byte[][] byArray, String[][] stringArray, int n, int n2, int n3, short[][][] sArray, short[][][][] sArray2) {
        this.b(34, imageArray, sArray, sArray2);
        int n4 = 40;
        int n5 = 30;
        int n6 = 20;
        int n7 = 25;
        int n8 = 19;
        this.a(2761505, game.j.as[0]);
        if (by == 0) {
            String[] stringArray2 = new String[]{"\u5934\u76ee\u4e00\uff1a\u6b7b\u795e", "\u5934\u76ee\u4e8c\uff1a\u6218\u795e", "\u5934\u76ee\u4e09\uff1a\u4f2f\u7235", "\u5934\u76ee\u56db\uff1a\u9b45\u9b54"};
            i.drawString("\u8bf7\u9009\u62e9\u67e5\u770b\u7684\u5934\u76ee", 120, n5, 0x10 | 1);
            i.drawString("28\u952e\u79fb\u52a8,5\u952e\u67e5\u770b", 120, n5 + (stringArray2.length + 3) * n6, 0x10 | 1);
            for (int k = 0; k < stringArray2.length; ++k) {
                i.drawString(stringArray2[k], n4 + 25, n5 + (k + 2) * n6, 0x10 | 4);
            }
            this.d.a(i2.T[1], 10, -(n5 + (byArray[0][0] + 2) * n6), 27);
            this.a(2, imageArray, sArray, sArray2);
        } else if (by == 1) {
            for (int k = n3 * n; k < (stringArray[byArray[0][0]].length > n3 * (n + 1) ? n3 * (n + 1) : stringArray[byArray[0][0]].length); ++k) {
                i.drawString(stringArray[byArray[0][0]][k], n7, n5 + (k - n3 * n) * n8, 0x10 | 4);
            }
            this.a(0xFFFFFF, game.j.as[0]);
            i.drawString(n + 1 + "/" + n2, 120, 320 - this.c, 1 | 0x10);
            if (n > 0) {
                this.d.a(i2.T[0], 69, -(320 - this.c), 27);
            }
            if (n < n2 - 1) {
                this.d.a(i2.T[1], 140, -(320 - this.c), 27);
            }
            this.a(1, imageArray, sArray, sArray2);
        }
    }
}


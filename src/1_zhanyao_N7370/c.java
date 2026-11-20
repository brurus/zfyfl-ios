/*
 * Decompiled with CFR 0.152.
 */
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import game.a;
import game.b;
import game.d;
import game.h;
import game.i;
import game.j;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class c
extends FullCanvas
implements j,
Runnable {
    public e e;
    public GameMIDlet m;
    public boolean g;
    static Graphics i;
    int[] n = new int[20];
    int b = 2;
    int l = 0;
    int f;
    int d;
    int j = 0;
    int k = 0;
    int[] a = new int[]{0, 0};
    int c = 0;

    public c(GameMIDlet gameMIDlet) {
        this.m = gameMIDlet;
        this.e = new e(this, this.m);
        this.c();
        this.f = game.b.a(game.j.aF[0]);
        this.d = game.j.aF[0].getHeight();
    }

    public void run() {
        try {
            while (!this.g) {
                long l = this.e();
                this.e.v();
                this.repaint();
                this.serviceRepaints();
                long l2 = this.e();
                if (l2 - l >= (long)e.ch) continue;
                Thread.sleep((long)e.ch - (l2 - l));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.m.destroyApp(true);
    }

    public void a() {
        this.g = true;
    }

    public void paint(Graphics graphics) {
        i = graphics;
        if (i != null) {
            if (this.e.bf[0] != 7) {
                i.setClip(0, 0, 240, 320);
                i.setColor(0);
                i.fillRect(0, 0, 240, 320);
            } else {
                i.setClip(0, 0, 240, 320);
                if (this.e.o == 3) {
                    i.setColor(0xFFFFFF);
                } else {
                    i.setColor(0);
                }
                i.fillRect(0, 0, 240, 320);
            }
            this.e.i();
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
        if ((i2.au & 0xFFFFFF7F) >= 1 && (i2.au & 0xFFFFFF7F) < 26 && (((game.c)i2).n[9] || !((game.c)i2).Q)) {
            return;
        }
        int n3 = i2.au;
        int n4 = i2.au;
        int n5 = i2.au;
        int n6 = i2.az;
        int n7 = -1;
        int n8 = i2.P - n;
        int n9 = 260 - (i2.N - n2);
        byte by = i2.ar[0];
        short s = sArray3[n5][by][n6][1];
        int[][] nArray = new int[2][3];
        int[][] nArray2 = null;
        int[] nArray3 = new int[2];
        int[] nArray4 = new int[2];
        int n10 = 0;
        short s2 = 0;
        for (int i3 = 0; i3 < sArray2[n5][s].length; ++i3) {
            int n11;
            n7 = sArray2[n5][s][i3][0];
            n10 = i3;
            s2 = s;
            nArray3 = this.e.a(sArray[n5][n7], sArray2[n5][s][n10]);
            nArray4 = this.e.a(sArray[n5][n7], sArray2[n5][s][n10], false);
            nArray = this.e.a(sArray2[n5][s][n10]);
            if (i2.ag == 2) {
                nArray3[0] = 0 - (nArray3[0] + nArray4[0]);
                nArray2 = this.e.a(game.b.bo[4], nArray);
            }
            if ((n11 = this.e.a(nArray2)) == -1) {
                n11 = this.e.a(nArray);
            }
            i.setClip(n8 + nArray3[0] + 0, n9 + nArray3[1] + 30, nArray4[0], nArray4[1]);
            game.b.a(imageArray[n4][sArray[n5][n7][0]], sArray[n5][n7][1], sArray[n5][n7][2], sArray[n5][n7][3], sArray[n5][n7][4], n8 + nArray3[0] + 0, n9 + nArray3[1] + 30, 4 | 0x10, n11, i);
        }
        if (i2.au < 0 || i2.au <= 25) {
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
        int n7 = 0;
        int n8 = -1;
        switch (n3) {
            case 0: {
                for (int i2 = 0; i2 < sArray.length; ++i2) {
                    game.b.a(imageArray[sArray2[sArray[i2][0]][0]], sArray2[sArray[i2][0]][1], sArray2[sArray[i2][0]][2], sArray2[sArray[i2][0]][3], sArray2[sArray[i2][0]][4], sArray[i2][1] + n + 0, sArray[i2][2] + n2 + 30, 4 | 0x10, sArray[i2][3], i);
                }
                break;
            }
            case 1: {
                for (int i3 = 0; i3 < sArray.length; ++i3) {
                    short s = sArray[i3][0];
                    int[] nArray2 = this.e.a(sArray2[s], sArray[i3]);
                    int[] nArray3 = this.e.a(sArray2[s], sArray[i3], false);
                    int[][] nArray4 = this.e.a(sArray[i3]);
                    if (by == 2) {
                        nArray2[0] = 0 - (nArray2[0] + nArray3[0]);
                        nArray = this.e.a(game.b.bo[4], nArray4);
                    }
                    int n9 = n - n4;
                    int n10 = 260 - (n2 - n5);
                    if (n6 == 0 && s == 198) {
                        int[] nArray5 = new int[]{28, 56, -1, -1, -1, 140, 208, -1, -1, -1, 42, 70, -1, -1, -1, 194, 222, -1, -1, -1, -1, -1};
                        n7 = nArray5[this.e.ar.d];
                        if (n7 <= 0) continue;
                        this.a(imageArray, this.e.au[n6][n7], n9 + nArray2[0], n10 + nArray2[1], sArray2, by, n4, n5, nArray4);
                        continue;
                    }
                    int n11 = this.e.a(nArray);
                    if (n11 == -1) {
                        n11 = this.e.a(nArray4);
                    }
                    i.setClip(n9 + nArray2[0], n10 + nArray2[1], nArray3[0], nArray3[1]);
                    game.b.a(imageArray[sArray2[s][0]], sArray2[s][1], sArray2[s][2], sArray2[s][3], sArray2[s][4], n9 + nArray2[0], n10 + nArray2[1], 4 | 0x10, n11, i);
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
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            n5 = sArray[i2][0];
            nArray4 = this.e.a(sArray2[n5], sArray[i2]);
            nArray5 = this.e.a(sArray2[n5], sArray[i2], false);
            nArray6 = this.e.a(nArray, nArray5, false);
            nArray2 = this.e.a(sArray[i2]);
            nArray4[1] = nArray4[1] * -1;
            nArray4 = this.e.a(nArray, nArray4, false);
            nArray4[1] = nArray4[1] * -1;
            if (this.e.a(nArray) == 7) {
                nArray4[0] = nArray4[0] * -1;
                nArray4[1] = nArray4[1] * -1;
            }
            nArray4 = this.e.b(nArray4, this.e.a(nArray), nArray6[0], nArray6[1]);
            nArray5 = this.e.a(nArray, nArray5, true);
            if (by == 2) {
                nArray4[0] = 0 - (nArray4[0] + nArray5[0]);
                nArray3 = this.e.a(game.b.bo[4], nArray);
            }
            int n8 = this.e.a(this.e.a(nArray3, nArray2));
            i.setClip(n6 + nArray4[0], n7 + nArray4[1], nArray5[0], nArray5[1]);
            game.b.a(imageArray[sArray2[n5][0]], sArray2[n5][1], sArray2[n5][2], sArray2[n5][3], sArray2[n5][4], n6 + nArray4[0], n7 + nArray4[1], 4 | 0x10, n8, i);
        }
    }

    public void a(short[] sArray, Image[] imageArray, int n, int n2, short[][] sArray2, Graphics graphics, int n3, int n4) {
        Graphics graphics2 = graphics == null ? i : graphics;
        int n5 = n / 20;
        int n6 = n2 / 20;
        graphics2.setClip(0, 30, n3, n4);
        for (int i2 = 0; i2 < sArray.length; i2 += 3) {
            int n7;
            if (sArray[i2 + 2] < 0 || sArray[i2] + sArray2[n7 = sArray[i2 + 2] >> 3][3] / 20 < n5 || sArray[i2] > n5 + n3 / 20 || sArray[i2 + 1] + sArray2[n7][4] / 20 < n6 - 1 - 1 || sArray[i2 + 1] > n6 + n4 / 20 + 1) continue;
            game.b.a(imageArray[sArray2[n7][0]], sArray2[n7][1], sArray2[n7][2], sArray2[n7][3], sArray2[n7][4], sArray[i2] * 20 - n + 0, n4 - (sArray[i2 + 1] * 20 - n2) + 30, 4 | 0x20, sArray[i2 + 2] & 7, graphics2);
        }
    }

    public void keyPressed(int n) {
        this.e.D(n);
        this.e.d(n, 1);
    }

    public void keyReleased(int n) {
        this.e.j(n);
        this.e.d(n, 0);
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
            i.drawString("\u6ca1\u6709\u56fe\u7247", 120, 160, 1 | 0x10);
        }
    }

    public void a(Image[][] imageArray, int n, int n2, int n3, int n4) {
        int n5 = 172;
        int n6 = 4;
        int n7 = 11;
        int n8 = 290;
        i.setClip(0, 0, 240, 320);
        i.setColor(0);
        i.fillRect(0, 0, 240, 320);
        i.setColor(13242898);
        i.fillRect(n7 + 23, n8 + 8, n3 * n5 / n4, 4);
        i.setColor(0xFF8282);
        i.fillRect(n7 + 23, n8 + 9, n3 * n5 / n4, 1);
        i.setColor(9703183);
        i.fillRect(n7 + 23, n8 + 11, n3 * n5 / n4, 1);
        i.drawImage(imageArray[34][0], n7, n8, 0x10 | 4);
    }

    public void a(String[][] stringArray, int n) {
        if (stringArray != null) {
            this.a(0xFFFFFF, game.j.aF[0]);
            this.a(i, stringArray[n][0], 0xFFFFFF, 10, 140, 23, 220, 0x10 | 4, game.j.aF[0]);
        }
    }

    public void a(int[] nArray) {
        this.n = nArray;
    }

    public void c() {
        new Thread(this).start();
    }

    public void b() {
        this.g = true;
    }

    protected long e() {
        return System.currentTimeMillis();
    }

    public void a(Image[][] imageArray, i i2, h h2, short s, short s2, short s3, int[][] nArray, int n, byte[][] byArray, String[][][][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n2;
        i.setClip(0, 0, 240, 320);
        i.setFont(game.j.aF[0]);
        this.a(imageArray[26], sArray2[26][154], 0, 260, 1, sArray[26], (byte)1, 0, 0, 26);
        this.a(56, 9, 127, 4, h2.a[0], h2.a[1], 16760563, 12783632, 0x850000);
        this.a(86, 20, 97, 4, h2.C[0], h2.C[1], 7459823, 1640393, 786809);
        if (h2.a[0] < h2.a[1] * 2 / 5) {
            int n3 = this.j = ++this.j > 1 ? 0 : this.j;
            if (this.j % 2 == 0) {
                this.a(56, 9, 127 * h2.a[0] / h2.a[1], 4, 0xFFFFFF);
            }
        }
        if (this.e.be[6] > 0 && this.e.be[6] % 2 == 0) {
            this.a(86, 20, 97 * h2.C[0] / h2.C[1], 4, 0xFFFFFF);
        }
        int n4 = game.j.aF[0].stringWidth("" + h2.t[0]);
        this.a("" + h2.t[0], 216 - n4, 34, 0x10 | 4, i, game.j.aF[0], 2761505, 16646090);
        this.a(imageArray[26], sArray2[26][348], 216 - n4 - 5, 223, 1, sArray[26], (byte)1, 0, 0, 26);
        this.a("" + h2.b[0], 64, 17, 0x10 | 1, i, game.j.aF[0], 2761505, 16646090);
        this.b(imageArray, h2.a[0], h2.a[1], 180, 7, sArray, sArray2);
        this.b(imageArray, h2.C[0], h2.C[1], 180, 18, sArray, sArray2);
        int[] nArray2 = new int[]{33, 34, 35, 36, 37, 38, 33};
        if (s3 >= 0 && this.e.c != null) {
            n2 = nArray[s3][1] - 19;
            this.a(186, 293, 49, 22, 0);
            this.a(imageArray[31], sArray2[31][nArray2[n2]], 186, -33, 1, sArray[31], (byte)1, 0, 0, 31);
            this.a(imageArray[26], sArray2[26][155], 0, -60, 1, sArray[26], (byte)1, 0, 0, 26);
            this.a(10, 310, 167, 4, this.e.c[0].a[0], this.e.c[0].a[1], 16760563, 12783632, 0x850000);
        } else {
            this.f();
            if (n == 0 && this.e.q[0] == 0) {
                this.a(imageArray[26], sArray2[26][346], 0, -60, 1, sArray[26], (byte)1, 0, 0, 26);
                if (h2.ax >= 9) {
                    this.a(75, 308, 117, 4, 1, 1, 12189542, 5148928, 2970113);
                } else {
                    this.a(75, 308, 117, 4, this.e.w[h2.j], this.e.g(h2.d, h2.ax), 12189542, 5148928, 2970113);
                }
                this.a(75, 297, 117, 4, h2.aA[0], h2.aA[1], 16774053, 15443456, 13199111);
            }
        }
        if (n > 0 && byArray[n][1] == 1) {
            if (s == 0) {
                this.e.a(i2.af[6], 0, -180, 27);
            } else {
                n2 = Short.parseShort(stringArray[2][byArray[n][2]][this.e.be[43]][0]);
                if (n2 > 0) {
                    if (n2 == 25) {
                        this.a(imageArray[31], sArray2[31][n2], 0, 80, 1, sArray[31], (byte)1, 0, 0, 31);
                    } else {
                        this.a(imageArray[31], sArray2[31][n2], 240, 80, 1, sArray[31], (byte)1, 0, 0, 31);
                    }
                }
                this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
                if (s2 == 0) {
                    this.e.a(i2.af[7], 91, -175, 27);
                }
                this.a(2761505, game.j.aF[0]);
                this.a(i, stringArray[2][byArray[n][2]][this.e.be[43]][1], 2761505, 10, 190, 20, 220, 0x10 | 4, game.j.aF[0]);
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a(n, n2, n3 * n5 / n6, 1, n7);
        this.a(n, n2 + 1, n3 * n5 / n6, 2, n8);
        this.a(n, n2 + 3, n3 * n5 / n6, 1, n9);
    }

    private void b(Image[][] imageArray, int n, int n2, int n3, int n4, short[][][] sArray, short[][][][] sArray2) {
        int n5;
        int n6;
        int n7 = game.b.R(n);
        int n8 = 0;
        int n9 = 5;
        int n10 = 0;
        int n11 = 0;
        n8 = 39;
        n11 = n3;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = n % game.b.q(n7 + 1 - n6) / game.b.q(n7 - n6);
            n11 = n10 = n11 + n9;
            this.a(imageArray[27], sArray2[27][n8 + n5], n10, 260 - n4, 1, sArray[27], (byte)1, 0, 0, 27);
        }
        n11 = n10 = n11 + n9;
        this.a(imageArray[27], sArray2[27][79], n10, 260 - n4, 1, sArray[27], (byte)1, 0, 0, 27);
        n7 = game.b.R(n2);
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = n2 % game.b.q(n7 + 1 - n6) / game.b.q(n7 - n6);
            n11 = n10 = n11 + n9;
            this.a(imageArray[27], sArray2[27][n8 + n5], n10, 260 - n4, 1, sArray[27], (byte)1, 0, 0, 27);
        }
    }

    public void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        int n6 = this.e.cn[35][0].getWidth();
        int n7 = this.e.cn[35][0].getHeight();
        graphics.setClip(n2, n3, n4 + 1, n5 + 1);
        for (int i2 = 0; i2 < n5 / n7; ++i2) {
            for (int i3 = 0; i3 < n4 / n6; ++i3) {
                graphics.drawImage(this.e.cn[35][0], n2 + i3 * n6, n3 + i2 * n7, 4 | 0x10);
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
            graphics.drawString(string2, n2, n3 + n4 * n7, n6);
            ++n7;
        }
    }

    public void a(Image[][] imageArray, byte[] byArray, byte[] byArray2, short[][][] sArray, short[][][][] sArray2) {
        int n;
        i.setClip(0, 0, 240, 320);
        this.a(i, 2761505, 0, 0, 240, 320);
        String[] stringArray = new String[]{"\u5730\u56fe", "\u653b\u7565", "\u968f\u8eab\u5546\u5e97", "\u7ee7\u7eed\u6e38\u620f", "\u67e5\u770b\u5e2e\u52a9", "\u6e38\u620f\u8bbe\u7f6e", "\u56de\u4e3b\u83dc\u5355"};
        int n2 = 22;
        int n3 = 152;
        int n4 = 320 - stringArray.length * n2 - 30;
        int n5 = n3 - 12;
        int n6 = n4;
        for (n = byArray.length - 1; n >= 0; --n) {
            if (n == byArray2[0]) continue;
            this.a(imageArray[27], sArray2[27][36], n3, 260 - (n4 + n2 * n), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(stringArray[n], n3 + 44, n4 + n2 * n + 6, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
        }
        for (n = 0; n < byArray.length; ++n) {
            if (n != byArray2[0]) continue;
            this.a(imageArray[27], sArray2[27][36], n5, 260 - (n6 + n2 * n), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(stringArray[n], n5 + 44, n6 + n2 * n + 6, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
        }
        if (this.e.aG[0][3] < this.e.aG[0][2]) {
            if (byArray2[0] == 1) {
                this.a("\u6b63\u7248\u6fc0\u6d3b\u540e\u53ef\u67e5\u770b", 120, 320 - this.d, 0x10 | 1, 0xFF0000, game.j.aF[0]);
                this.a(stringArray[1], n5 + 44, n6 + n2 * 1 + 6, 0x10 | 1, 12631218, game.j.aF[0]);
            } else {
                this.a(stringArray[1], n3 + 44, n4 + n2 * 1 + 6, 0x10 | 1, 12631218, game.j.aF[0]);
            }
        }
        if (this.e.aG[0][3] < this.e.aG[0][2]) {
            if (byArray2[0] == 2) {
                this.a("\u6b63\u7248\u6fc0\u6d3b\u540e\u53ef\u67e5\u770b", 120, 320 - this.d, 0x10 | 1, 0xFF0000, game.j.aF[0]);
                this.a(stringArray[2], n5 + 44, n6 + n2 * 2 + 6, 0x10 | 1, 12631218, game.j.aF[0]);
            } else {
                this.a(stringArray[2], n3 + 44, n4 + n2 * 2 + 6, 0x10 | 1, 12631218, game.j.aF[0]);
            }
        }
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(String string, int n, int n2, int n3, int n4, Font font) {
        this.a(n4, font);
        i.drawString(string, n, n2, n3);
    }

    public void a(int n, Font font) {
        i.setColor(n);
        i.setFont(font);
        i.setClip(0, 0, 240, 320);
    }

    public void b(Image[][] imageArray, i i2, byte[] byArray, int n, short[][][] sArray, short[][][][] sArray2) {
        this.a(0, 0, 240, 320, 2761505);
        this.a(imageArray[27], 27, sArray[27], 19, 174, 204, 112);
        this.a(imageArray[27], sArray2[27][5], 1, 99, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 94);
        switch (byArray[n]) {
            case 21: {
                this.a(imageArray[27], sArray2[27][0], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                this.a(1, imageArray, sArray, sArray2);
                break;
            }
            case 22: {
                this.a(imageArray[27], sArray2[27][1], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                this.a(2, imageArray, sArray, sArray2);
                break;
            }
            case 23: {
                this.a(imageArray[27], sArray2[27][2], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                this.a(2, imageArray, sArray, sArray2);
                break;
            }
            case 24: {
                this.a(imageArray[27], sArray2[27][3], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                this.a(1, imageArray, sArray, sArray2);
                break;
            }
            case 25: {
                this.a(imageArray[27], sArray2[27][4], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                this.a(1, imageArray, sArray, sArray2);
            }
        }
        String[] stringArray = new String[]{"\u5c5e\u6027", "\u6b66\u5668", "\u9053\u5177", "\u56fe\u9274", "\u767e\u79d1"};
        int n2 = 46;
        int n3 = 8;
        int n4 = 38;
        this.a(2761505, game.j.aF[0]);
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            if (i3 == n) {
                i.drawString(stringArray[i3], n2 + n4 * i3, n3 - 3, 0x10 | 1);
                continue;
            }
            i.drawString(stringArray[i3], n2 + n4 * i3, n3, 0x10 | 1);
        }
    }

    public void a(Image[][] imageArray, int[] nArray, byte[][] byArray, int[] nArray2, byte[] byArray2, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 88;
        int n2 = 31;
        int n3 = 20;
        this.a(25, 39, 50, 60, 919571);
        this.a(imageArray[31], sArray2[31][0], 25, 162, 1, sArray[31], (byte)1, 0, 0, 31);
        this.a(imageArray[27], sArray2[27][24], 20, 231, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a(2761505, game.j.aF[0]);
        i.drawString("\u751f\u547d: " + h2.a[0] + "/" + h2.a[1], n, n2, 0x10 | 4);
        i.drawString("\u9b54\u529b: " + h2.C[0] + "/" + h2.C[1], n, n2 + n3, 0x10 | 4);
        i.drawString("\u653b\u51fb: " + h2.Z[1], n, n2 + n3 * 2, 0x10 | 4);
        i.drawString("\u9632\u5fa1: " + h2.ac[1], n, n2 + n3 * 3, 0x10 | 4);
        i.drawString("\u7ecf\u9a8c: " + h2.aA[0] + "/" + h2.aA[1], n, n2 + n3 * 4, 0x10 | 4);
        i.drawString("\u83b1\u65af", 49, 102, 0x10 | 1);
        i.drawString("\u7b49\u7ea7: " + h2.b[0], 49, 117, 0x10 | 1);
        int n4 = 28;
        int n5 = 182;
        int n6 = 37;
        int n7 = 35;
        int n8 = 20;
        int n9 = 24;
        i.drawString("\u6b66\u5668: ", n4, n5, 0x10 | 4);
        i.drawString("\u653b\u51fb: ", n4 + n6 + n7, n5, 0x10 | 4);
        i.drawString(" " + this.e.at[byArray[h2.j][1]][0] * (100 + this.e.bE[byArray[h2.j][2]]) * (100 + this.e.co[6]) / 10000, n4 + n6 + n7 + n6, n5, 0x10 | 4);
        i.drawString("\u7b49\u7ea7: " + h2.ax, n4, n5 + n8, 0x10 | 4);
        i.drawString("\u719f\u7ec3: ", n4 + n6 + n7, n5 + n8, 0x10 | 4);
        if (h2.ax < 9) {
            i.drawString(" " + nArray2[h2.j] + "/" + this.e.g(h2.d, h2.ax), n4 + n6 + n7 + n6, n5 + n8, 0x10 | 4);
        } else {
            i.drawString("----", n4 + n6 + n7 + n6, n5 + n8, 0x10 | 4);
        }
        i.drawString("\u9644\u9b54: ", n4, n5 + n8 * 2, 0x10 | 4);
        this.a(imageArray[28], sArray2[28][this.b(h2.d)], n4 + n6, 260 - (n5 - 3 - 1), 1, sArray[28], (byte)1, 0, 0, 28);
        for (int i2 = 0; i2 < 3; ++i2) {
            if (byArray[h2.j][3 + 2 * i2] > 0) {
                this.a(imageArray[28], sArray2[28][22 + byArray[h2.j][3 + 2 * i2 + 1]], n4 + n6, 260 - (n5 - 3 + n8 * 2 + i2 * n9), 1, sArray[28], (byte)1, 0, 0, 28);
                if (byArray[h2.j][3 + 2 * i2 + 1] == 5) {
                    this.a(stringArray[0][byArray[h2.j][3 + 2 * i2 + 1]] + this.e.c(byArray[h2.j][3 + 2 * i2 + 1], 10), n4 + n6 * 2, n5 + n8 * 2 + i2 * n9, 0x10 | 4, 2761505, game.j.aF[0]);
                    continue;
                }
                this.a(stringArray[0][byArray[h2.j][3 + 2 * i2 + 1]] + this.e.c(byArray[h2.j][3 + 2 * i2 + 1], 10) + "%", n4 + n6 * 2, n5 + n8 * 2 + i2 * n9, 0x10 | 4, 2761505, game.j.aF[0]);
                continue;
            }
            this.a(imageArray[28], sArray2[28][48], n4 + n6, 260 - (n5 - 3 + n8 * 2 + i2 * n9), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a("\u65e0\u9644\u9b54", n4 + n6 * 2, n5 + n8 * 2 + i2 * n9, 0x10 | 4, 2761505, game.j.aF[0]);
        }
    }

    public void a(Image[][] imageArray, byte by, byte by2, i i2, byte[][] byArray, int[] nArray, byte[] byArray2, byte[] byArray3, byte[][] byArray4, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = 16;
        int n6 = 45;
        int n7 = 25;
        int n8 = -1;
        int n9 = -1;
        int n10 = 70;
        this.e.a(i2.af[2], 23, -116, 27);
        this.e.a(i2.af[3], 23, -26, 27);
        this.a(imageArray[27], sArray2[27][26], n10, 195, 1, sArray[27], (byte)1, 0, 0, 27);
        for (n4 = 0; n4 < 3; ++n4) {
            n8 = byArray4[0][0] - 1 + n4;
            if (byArray2.length >= 3) {
                if (n8 < 0) {
                    n8 = byArray2.length - 1;
                } else if (n8 >= byArray2.length) {
                    n8 = 0;
                }
            }
            if (n8 < 0 || n8 >= byArray2.length) continue;
            n9 = byArray[byArray2[n8]][1];
            if (byArray[byArray2[n8]][0] > 0) {
                this.a(imageArray[28], sArray2[28][this.b(n9)], n5, 260 - (n6 + n7 * n4), 1, sArray[28], (byte)1, 0, 0, 28);
                if (byArray2[n8] == h2.j) {
                    i.setClip(0, 0, 240, 320);
                    this.a(stringArray[1][n9], n10 + 61, n6 + n7 * n4 + 3, 0x10 | 1, i, game.j.aF[0], this.a(n9, 0), 0xFFFFFF);
                } else {
                    this.a(stringArray[1][n9], n10 + 61, n6 + n7 * n4 + 3, 0x10 | 1, this.a(n9, 0), game.j.aF[0]);
                }
            } else {
                this.a(imageArray[28], sArray2[28][48], n5, 260 - (n6 + n7 * n4), 1, sArray[28], (byte)1, 0, 0, 28);
                this.a("\u65e0", n10 + 61, n6 + n7 * n4 + 3, 0x10 | 1, 2761505, game.j.aF[0]);
            }
            if (byArray2[n8] != h2.j) continue;
            this.e.a(i2.af[4], n5, -(n6 + n4 * n7), 28);
        }
        this.a(imageArray, 208, 41, (int)byArray4[0][0], byArray2.length, sArray, sArray2);
        n4 = 24;
        int n11 = 184;
        int n12 = 87;
        int n13 = 25;
        this.a(2761505, game.j.aF[0]);
        byte by3 = byArray2[byArray4[0][0]];
        int[] nArray2 = new int[9];
        for (n3 = 0; n3 < 3; ++n3) {
            if (byArray[by3][3 + n3 * 2] <= 0) continue;
            n2 = byArray[by3][2] == 9 ? 10 : byArray[by3][2];
            byte by4 = byArray[by3][3 + n3 * 2 + 1];
            nArray2[by4] = nArray2[by4] + this.e.c(byArray[by3][3 + n3 * 2 + 1], 10);
        }
        i.drawString("\u7b49\u7ea7: " + byArray[by3][2], n4, n11, 0x10 | 4);
        i.drawString("\u719f\u7ec3:  ", n4 + n12, n11, 0x10 | 4);
        if (byArray[by3][2] < 9) {
            i.drawString("" + nArray[by3] + "/" + this.e.g(byArray[by3][1], byArray[by3][2]), n4 + n12 + 50, n11, 0x10 | 4);
        } else {
            i.drawString("----", n4 + n12 + 50, n11, 0x10 | 4);
        }
        i.drawString("\u653b\u51fb: " + this.e.at[byArray[by3][1]][0] * (100 + this.e.bE[byArray[by3][2]]) * (100 + nArray2[6]) / 10000, n4, n11 + n13, 0x10 | 4);
        i.drawString("\u9b54\u6cd5: " + stringArray[2][this.e.L(byArray[by3][1] + 44)], n4 + n12, n11 + n13, 0x10 | 4);
        i.drawString("\u9644\u9b54: ", n4, n11 + n13 * 2, 0x10 | 4);
        i.drawString(stringArray[3][byArray[by3][1]], n4, n11 + n13 * 3, 0x10 | 4);
        for (n3 = 0; n3 < 3; ++n3) {
            if (byArray[by3][3 + n3 * 2] > 0) {
                this.a(imageArray[28], sArray2[28][22 + byArray[by3][3 + 2 * n3 + 1]], 79 + 45 * n3, 260 - (n11 + n13 * 2 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
                continue;
            }
            this.a(imageArray[28], sArray2[28][48], 79 + 45 * n3, 260 - (n11 + n13 * 2 - 3), 1, sArray[28], (byte)1, 0, 0, 28);
        }
        if (by == 1) {
            n3 = n5 + 30;
            n2 = 22;
            this.a(imageArray[27], sArray2[27][38], n3, 260 - (n6 + n7), 1, sArray[27], (byte)1, 0, 0, 27);
            String[] stringArray2 = new String[]{"\u88c5\u5907", "\u5206\u89e3", "\u53d6\u6d88"};
            for (n = 0; n < byArray3.length; ++n) {
                this.a(stringArray2[byArray3[n]], n3 + 10, 78 + n * n2, 0x10 | 4, 2761505, game.j.aF[0]);
                if (byArray4[by][0] != n) continue;
                this.e.a(i2.af[0], n3 + 44, -(78 + n * n2), 27);
            }
        }
        n3 = 138;
        n2 = 28;
        int n14 = 127;
        n = 22;
        if (by == 2) {
            this.a(i, 2761505, 0, 0, 240, 320);
            if (byArray3[byArray4[1][0]] == 0) {
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u786e\u5b9a\u88c5\u5907", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(stringArray[1][byArray[byArray2[byArray4[0][0]]][1]] + "?", 120, n3 + n2, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(2, imageArray, sArray, sArray2);
            } else if (byArray3[byArray4[1][0]] == 1) {
                this.b(28, imageArray, sArray, sArray2);
                String[] stringArray3 = new String[]{"\u6b66\u5668\u5206\u89e3\u80fd\u5f97\u5230", "" + h2.t[1] + "\u91d1\u94b1", "\u60a8\u771f\u7684\u51b3\u5b9a\u8981\u5206\u89e3", stringArray[1][byArray[byArray2[byArray4[0][0]]][1]] + "?"};
                for (int i3 = 0; i3 < stringArray3.length; ++i3) {
                    this.a(stringArray3[i3], 120, 107 + n2 * i3, 0x10 | 1, 2761505, game.j.aF[0]);
                }
                this.a(2, imageArray, sArray, sArray2);
            }
        }
        if (by == 3) {
            this.a(i, 2761505, 0, 0, 240, 320);
            switch (by2) {
                case 0: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u5df2\u88c5\u5907", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a(0, imageArray, sArray, sArray2);
                    break;
                }
                case 1: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u5df2\u7ecf\u88c5\u5907", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a(0, imageArray, sArray, sArray2);
                    break;
                }
                case 2: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a(0, imageArray, sArray, sArray2);
                    this.a("\u5206\u89e3\u6210\u529f", 120, n14, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a("\u83b7\u5f97\u91d1\u94b1" + h2.t[1], 120, n14 + n, 0x10 | 1, 2761505, game.j.aF[0]);
                    break;
                }
                case 3: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a(0, imageArray, sArray, sArray2);
                    this.a("\u6b63\u5728\u88c5\u5907\u4e2d", 120, n14, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a("\u65e0\u6cd5\u5206\u89e3", 120, n14 + n, 0x10 | 1, 2761505, game.j.aF[0]);
                }
            }
        }
    }

    public void a(Image[][] imageArray, byte by, i i2, byte[] byArray, byte[][] byArray2, int[] nArray, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n;
        int n2;
        int n3 = 16;
        int n4 = 45;
        int n5 = 25;
        int n6 = -1;
        int n7 = -1;
        int n8 = 88;
        this.e.a(i2.af[2], 23, -116, 27);
        this.e.a(i2.af[3], 23, -26, 27);
        if (byArray[byArray2[0][0]] >= 0 && byArray[byArray2[0][0]] <= 19) {
            this.a(imageArray[27], sArray2[27][26], n8, 195, 1, sArray[27], (byte)1, 0, 0, 27);
        } else {
            this.a(imageArray[27], sArray2[27][30], n8 - 33, 195, 1, sArray[27], (byte)1, 0, 0, 27);
        }
        for (n2 = 0; n2 < 3; ++n2) {
            n6 = byArray2[0][0] - 1 + n2;
            if (byArray.length >= 3) {
                if (n6 < 0) {
                    n6 = byArray.length - 1;
                } else if (n6 >= byArray.length) {
                    n6 = 0;
                }
            }
            if (n6 < 0 || n6 >= byArray.length) continue;
            this.a(imageArray[28], sArray2[28][this.a(byArray[n6])], n3, 260 - (n4 + n5 * n2), 1, sArray[28], (byte)1, 0, 0, 28);
            if (byArray[n6] >= 0 && byArray[n6] <= 19) {
                this.a(" X" + this.e.bq[byArray[n6]], n3 + 30, n4 + n5 * n2 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                this.a(stringArray[4][byArray[n6]], n8 + 61, n4 + n5 * n2 + 3, 0x10 | 1, this.a((int)byArray[n6], 1), game.j.aF[0]);
                continue;
            }
            this.a(stringArray[4][byArray[n6]], n8 + 61 - 16, n4 + n5 * n2 + 3, 0x10 | 1, this.a((int)byArray[n6], 1), game.j.aF[0]);
        }
        this.a(imageArray, 208, 41, (int)byArray2[0][0], byArray.length, sArray, sArray2);
        this.a(2761505, game.j.aF[0]);
        this.a(i, stringArray[5][byArray[byArray2[0][0]]], 2761505, 15, 184, 20, 240, 0x10 | 4, game.j.aF[0]);
        if (by == 2) {
            n2 = 138;
            n = 28;
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a("\u786e\u5b9a\u4f7f\u7528", 120, n2, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(stringArray[4][byArray[byArray2[0][0]]] + "?", 120, n2 + n, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(2, imageArray, sArray, sArray2);
        }
        if (by == 3) {
            n2 = 138;
            n = 25;
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            if (this.e.aT == 0) {
                switch (byArray[byArray2[0][0]]) {
                    case 0: 
                    case 1: 
                    case 2: {
                        this.a("\u751f\u547d\u56de\u590d\u81f3", 120, n2, 0x10 | 1, 2761505, game.j.aF[0]);
                        this.a("" + this.e.ar.a[0] + "/" + this.e.ar.a[1], 120, n2 + n, 0x10 | 1, 2761505, game.j.aF[0]);
                        break;
                    }
                    case 3: {
                        this.a("\u9b54\u529b\u56de\u590d\u81f3", 120, n2, 0x10 | 1, 2761505, game.j.aF[0]);
                        this.a("" + this.e.ar.C[0] + "/" + this.e.ar.C[1], 120, n2 + n, 0x10 | 1, 2761505, game.j.aF[0]);
                        break;
                    }
                    case 4: {
                        this.a("20\u79d2\u5185\u9b54\u529b\u65e0\u9650", 120, n2, 0x10 | 1, 2761505, game.j.aF[0]);
                    }
                }
            } else if (this.e.aT == 1) {
                switch (byArray[byArray2[0][0]]) {
                    case 0: 
                    case 1: 
                    case 2: {
                        this.a("\u751f\u547d\u503c\u5df2\u6ee1", 120, n2, 0x10 | 1, 2761505, game.j.aF[0]);
                        break;
                    }
                    case 3: {
                        this.a("\u9b54\u529b\u503c\u5df2\u6ee1", 120, n2, 0x10 | 1, 2761505, game.j.aF[0]);
                    }
                }
            }
            this.a(0, imageArray, sArray, sArray2);
        }
    }

    public void a(Image[][] imageArray, i i2, byte[] byArray, byte[] byArray2, h h2, byte[] byArray3, byte[][][] byArray4, byte[][][] byArray5, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        Object object;
        int n = 113;
        int n2 = 30;
        int n3 = 20;
        int n4 = 15;
        int n5 = 178;
        int n6 = 20;
        this.a(52, 40, 50, 60, 919571);
        if (byArray.length > 0) {
            this.e.a(i2.af[2], 23, -85, 27);
            this.e.a(i2.af[3], 23, -44, 27);
            object = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 19};
            this.a(imageArray[31], sArray2[31][object[byArray[byArray2[0]]]], 52, 161, 1, sArray[31], (byte)1, 0, 0, 31);
        }
        this.a(imageArray[27], sArray2[27][24], 47, 230, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a(2761505, game.j.aF[0]);
        i.drawString("" + (byArray2[0] + 1), 30, 68, 0x10 | 1);
        i.drawString("\u602a\u7269\u63cf\u8ff0:", n, n2, 0x10 | 4);
        i.drawString("\u6389\u843d\u7269\u54c1:", n4, n5, 0x10 | 4);
        if (byArray.length > 0) {
            object = "";
            i.drawString(stringArray[6][byArray[byArray2[0]]], 77, 109, 0x10 | 1);
            this.a(2761505, game.j.aF[0]);
            this.a(i, stringArray[7][byArray[byArray2[0]]], 2761505, n, n2 + n3, n3, 110, 0x10 | 4, game.j.aF[0]);
            if (byArray[byArray2[0]] >= 1 && byArray[byArray2[0]] <= 18) {
                if (byArray4[byArray[byArray2[0]] - 1][0][0] < 127) {
                    object = this.e.bq[byArray4[byArray[byArray2[0]] - 1][0][0]] > 0 ? "[\u5df2\u83b7\u5f97]" : "[\u672a\u83b7\u5f97]";
                    i.drawString(stringArray[4][byArray4[byArray[byArray2[0]] - 1][0][0]] + "  " + (String)object, n4, n5 + n6, 0x10 | 4);
                }
                if (byArray4[byArray[byArray2[0]] - 1][1][0] < 127) {
                    i.drawString(stringArray[4][byArray4[byArray[byArray2[0]] - 1][1][0]], n4, n5 + n6 * 2, 0x10 | 4);
                }
                if (byArray4[byArray[byArray2[0]] - 1][1][1] < 127) {
                    i.drawString(stringArray[4][byArray4[byArray[byArray2[0]] - 1][1][1]], n4, n5 + n6 * 3, 0x10 | 4);
                }
            } else if (byArray[byArray2[0]] >= 19 && byArray[byArray2[0]] <= 25) {
                byte by = byArray[byArray2[0]];
                if (byArray5[by - 19][0][0] < 127) {
                    object = this.e.bq[byArray5[by - 19][0][0]] > 0 ? "[\u5df2\u83b7\u5f97]" : "[\u672a\u83b7\u5f97]";
                    i.drawString(stringArray[4][byArray5[by - 19][0][0]] + "  " + (String)object, n4, n5 + n6, 0x10 | 4);
                }
                if (byArray5[by - 19][1][0] < 127) {
                    i.drawString(stringArray[4][byArray5[by - 19][1][0]], n4, n5 + n6 * 2, 0x10 | 4);
                }
                if (byArray5[by - 19][1][1] < 127) {
                    if (byArray5[by - 19][1][1] == 1) {
                        i.drawString("1\u7ea7\u5b9d\u77f3", n4, n5 + n6 * 3, 0x10 | 4);
                    } else {
                        i.drawString("1-" + byArray5[by - 19][1][1] + "\u7ea7\u5b9d\u77f3", n4, n5 + n6 * 3, 0x10 | 4);
                    }
                }
                if (this.e.aq[0] == 0) {
                    i.drawString("\u6700\u5feb\u51fb\u6740\u65f6\u95f4:  \u529f\u80fd\u672a\u5f00\u542f!", n4, n5 + n6 * 4, 0x10 | 4);
                } else if (this.e.bL[this.e.aq[0]][by - 20][0] == 0) {
                    i.drawString("\u6700\u5feb\u51fb\u6740\u65f6\u95f4:  \u5c1a\u672a\u51fb\u6740!", n4, n5 + n6 * 4, 0x10 | 4);
                } else if (this.e.aq[1 + by - 19] > 22500) {
                    i.drawString("\u6700\u5feb\u51fb\u6740\u65f6\u95f4:  30\u5206\u949f\u4ee5\u4e0a!", n4, n5 + n6 * 4, 0x10 | 4);
                } else {
                    int[] nArray = this.c(this.e.aq[1 + by - 19]);
                    i.drawString("\u6700\u5feb\u51fb\u6740\u65f6\u95f4:  " + nArray[0] + "\u65f6" + nArray[1] + "\u5206" + nArray[2] + "\u79d2", n4, n5 + n6 * 4, 0x10 | 4);
                }
            }
        }
    }

    public void a(Image[][] imageArray, i i2, byte[] byArray, byte[] byArray2, h h2, byte[] byArray3, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 103;
        int n2 = 45;
        int n3 = 25;
        int n4 = -1;
        this.e.a(i2.af[2], 96, -115, 27);
        this.e.a(i2.af[3], 96, -28, 27);
        this.a(imageArray[27], sArray2[27][26], 42, 195, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a(imageArray, 198, 41, (int)byArray2[0], byArray.length, sArray, sArray2);
        for (int i3 = 0; i3 < 3; ++i3) {
            n4 = byArray2[0] - 1 + i3;
            if (byArray.length >= 3) {
                if (n4 < 0) {
                    n4 = byArray.length - 1;
                } else if (n4 >= byArray.length) {
                    n4 = 0;
                }
            }
            if (n4 < 0 || n4 >= byArray.length) continue;
            this.a(stringArray[8][byArray[n4]], n, n2 + n3 * i3 + 3, 0x10 | 1, 2761505, game.j.aF[0]);
        }
        this.a(2761505, game.j.aF[0]);
        this.a(i, stringArray[9][byArray[byArray2[0]]], 2761505, 15, 170, 20, 210, 0x10 | 4, game.j.aF[0]);
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
        switch (byArray[n]) {
            case 27: {
                this.a(imageArray[27], sArray2[27][31], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 28: {
                this.a(imageArray[27], sArray2[27][32], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
                break;
            }
            case 29: {
                this.a(imageArray[27], sArray2[27][33], 1, 259, 1, sArray[27], (byte)1, 0, 0, 27);
            }
        }
        String[] stringArray = new String[]{"\u5546\u5e97", "\u7cbe\u70bc", "\u953b\u9020"};
        int n2 = 42;
        int n3 = 9;
        int n4 = 62;
        this.a(2761505, game.j.aF[0]);
        for (int i3 = 0; i3 < byArray.length; ++i3) {
            if (i3 == n) {
                i.drawString(stringArray[i3], n2 + n4 * i3, n3 - 4, 0x10 | 4);
                continue;
            }
            i.drawString(stringArray[i3], n2 + n4 * i3, n3, 0x10 | 4);
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, byte[][][] byArray, int[] nArray, int[] nArray2, byte[] byArray2, byte by2, byte[][] byArray3, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 19;
        int n2 = 49;
        int n3 = 25;
        int n4 = 20;
        int n5 = 22;
        int n6 = 204;
        int n7 = 25;
        int n8 = 52;
        int n9 = 25;
        int n10 = -1;
        int n11 = -1;
        int n12 = n + 15;
        int n13 = this.e.a(byArray2[byArray3[0][0]], 1);
        int n14 = h2.t[0] >= n13 ? 2761505 : 0xFF0000;
        this.a(2761505, game.j.aF[0]);
        i.drawString("\u5546\u54c1\u4ef7\u683c: ", n5, n6 + n7 + 3, 0x10 | 4);
        this.a("" + n13, n5 + 70 + 20, n6 + n7 + 3, 0x10 | 4, n14, game.j.aF[0]);
        i.drawString("\u6240\u6301\u91d1\u94b1: ", n5, n6 + n7 * 2 + 3, 0x10 | 4);
        i.drawString("" + h2.t[0], n5 + 70 + 20, n6 + n7 * 2 + 3, 0x10 | 4);
        if (byArray2[byArray3[0][0]] >= 29 && byArray2[byArray3[0][0]] <= 50) {
            this.a("\u4ea7\u7269:", 30, 160, 0x10 | 4, 2761505, game.j.aF[0]);
            this.a(imageArray[28], sArray2[28][this.b(byArray[byArray2[byArray3[0][0]] - 20][1][0])], 75, 103, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a("\u9b54\u6cd5:" + stringArray[11][byArray2[byArray3[0][0]]], 110, 160, 0x10 | 4, 2761505, game.j.aF[0]);
        } else {
            i.drawString("\u6301\u6709\u6570\u91cf: ", n5, n6 + 3, 0x10 | 4);
            i.drawString("" + nArray[byArray2[byArray3[0][0]]], n5 + 70 + 20, n6 + 3, 0x10 | 4);
        }
        if (by2 == 0) {
            this.a(stringArray[5][byArray2[byArray3[0][0]]], n5 + 14, n2 + n3 * 3 + n4 - 4, 0x10 | 4, 2761505, game.j.aF[0]);
            this.a(imageArray[27], sArray2[27][30], n8, 260 - (n2 + n3), 1, sArray[27], (byte)1, 0, 0, 27);
            this.a(imageArray, 208, 46, (int)byArray3[0][0], byArray2.length, sArray, sArray2);
            for (int i3 = 0; i3 < 3; ++i3) {
                n10 = byArray3[0][0] - 1 + i3;
                if (n10 < 0) {
                    n10 = byArray2.length - 1;
                } else if (n10 >= byArray2.length) {
                    n10 = 0;
                }
                n11 = this.a(byArray2[n10]);
                this.a(imageArray[28], sArray2[28][n11], n, 260 - (n2 + n3 * i3), 1, sArray[28], (byte)1, 0, 0, 28);
                n13 = this.e.a(byArray2[n10], 1);
                n14 = h2.t[0] >= n13 ? this.a((int)byArray2[n10], 1) : 0xFF0000;
                this.a(stringArray[4][byArray2[n10]], n8 + 77, n2 + n3 * i3 + 2 + 3, 0x10 | 1, n14, game.j.aF[0]);
            }
            this.e.a(i2.af[2], 26, -120, 27);
            this.e.a(i2.af[3], 26, -30, 27);
            this.e.a(i2.af[0], 28, -300, 27);
            this.e.a(i2.af[1], 181, -300, 27);
            this.a("\u630946\u952e\u5de6\u53f3\u7ffb\u9875", 120, 300, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
            this.a("\u63090\u952e\u8d2d\u4e70\u91d1\u5e01", 120, n6 + n7 * 3 + 3, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
            if (by == 1) {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u4e70\u4e9b\u8840\u74f6\u5e26\u5728\u8eab\u4e0a\u5427!", 120, 94, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(0, imageArray, sArray, sArray2);
            }
        } else if (by2 == 1) {
            this.e.a(i2.af[2], 113, -102, 27);
            this.e.a(i2.af[3], 113, -70, 27);
            this.e.a(i2.af[0], 74, -87, 27);
            this.e.a(i2.af[1], 136, -87, 27);
            this.a(107, 87, 27, 16, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.a(byArray2[byArray3[0][0]])], 54, 228, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(2761505, game.j.aF[0]);
            i.drawString(stringArray[4][byArray2[byArray3[0][0]]], 94, 35, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u8d2d\u4e70\u6570\u91cf:", 26, 54, 0x10 | 4);
            i.drawString("" + this.e.be[8], 120, 87, 0x10 | 1);
            i.drawString("\u6d88\u8017\u7684\u91d1\u94b1: ", n5, 120, 0x10 | 4);
            int n15 = this.e.a(byArray2[byArray3[0][0]], (int)this.e.be[8]);
            this.a("" + n15, n5 + 110, 120, 0x10 | 4, h2.t[0] >= n15 ? 2761505 : 0xFF0000, game.j.aF[0]);
            if (by == 1) {
                int n16 = 107;
                int n17 = 28;
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(28, imageArray, sArray, sArray2);
                this.a(2761505, game.j.aF[0]);
                i.drawString("\u60a8\u8d2d\u4e70\u4e86" + this.e.be[8] + "\u4e2a", 120, n16, 0x10 | 1);
                i.drawString(stringArray[4][byArray2[byArray3[0][0]]], 120, n16 + n17, 0x10 | 1);
                i.drawString("\u5171\u6d88\u8017\u91d1\u94b1: " + this.e.a(byArray2[byArray3[0][0]], (int)this.e.be[8]), 120, n16 + n17 * 2, 0x10 | 1);
                i.drawString("\u786e\u5b9a\u8d2d\u4e70\u5417?", 120, n16 + n17 * 3, 0x10 | 1);
                this.a(2, imageArray, sArray, sArray2);
            }
        } else if (by2 == 3) {
            this.e.a(i2.af[2], 113, -102, 27);
            this.e.a(i2.af[3], 113, -70, 27);
            this.e.a(i2.af[0], 74, -87, 27);
            this.e.a(i2.af[1], 136, -87, 27);
            this.a(107, 87, 27, 16, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.a(byArray2[byArray3[0][0]])], 54, 228, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(2761505, game.j.aF[0]);
            i.drawString(stringArray[4][byArray2[byArray3[0][0]]], 94, 35, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u8d2d\u4e70\u6570\u91cf:", 26, 54, 0x10 | 4);
            i.drawString("" + this.e.be[8], 120, 87, 0x10 | 1);
            i.drawString("\u6d88\u8017\u7684\u91d1\u94b1: ", n5, 120, 0x10 | 4);
            int n18 = this.e.a(byArray2[byArray3[0][0]], (int)this.e.be[8]);
            this.a("" + n18, n5 + 110, 120, 0x10 | 4, h2.t[0] >= n18 ? 2761505 : 0xFF0000, game.j.aF[0]);
            int n19 = 138;
            int n20 = 28;
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a(0, imageArray, sArray, sArray2);
            String[][] stringArrayArray = new String[][]{{"\u8d2d\u4e70\u6210\u529f", ""}, {"\u91d1\u94b1\u4e0d\u8db3", ""}, {"\u643a\u5e26\u5df2\u8fbe\u4e0a\u9650", ""}, {"\u8d2d\u4e70\u6210\u529f", "\u5df2\u81ea\u52a8\u4f7f\u7528"}};
            if (by == 0 && byArray2[byArray3[0][0]] >= 29 && byArray2[byArray3[0][0]] <= 50) {
                this.a(stringArrayArray[by][0], 120, 130, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a("\u5728\u953b\u9020\u680f\u953b\u9020\u6b66\u5668", 120, 152, 0x10 | 1, 2761505, game.j.aF[0]);
            } else {
                this.a(stringArrayArray[by][0], 120, n19, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(stringArrayArray[by][1], 120, n19 + 22, 0x10 | 1, 2761505, game.j.aF[0]);
            }
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, byte[][][] byArray, int[] nArray, byte[] byArray2, byte by2, byte[][] byArray3, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n;
        int n2;
        int n3;
        int n4 = 19;
        int n5 = 49;
        int n6 = 25;
        int n7 = 32;
        int n8 = 60;
        int n9 = 204;
        int n10 = 26;
        int n11 = 32;
        int n12 = 52;
        int n13 = -1;
        int n14 = -1;
        if (byArray2.length > 0) {
            this.a("\u6750\u6599:", n4, n9 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
            n3 = byArray2[byArray3[0][0]] - 20;
            for (n2 = 0; n2 < byArray[n3][0].length / 2; ++n2) {
                n14 = byArray[n3][0][2 * n2] + 26;
                this.a(imageArray[28], sArray2[28][n14], n8, 260 - (n9 + n10 * n2), 1, sArray[28], (byte)1, 0, 0, 28);
                n = byArray[n3][0][2 * n2 + 1] > nArray[byArray[n3][0][2 * n2]] ? 0xFF0000 : 2761505;
                this.a(nArray[byArray[n3][0][2 * n2]] + "/" + byArray[n3][0][2 * n2 + 1] + "  " + stringArray[4][byArray[n3][0][2 * n2]], n8 + 32, n9 + n10 * n2 + 3, 0x10 | 4, n, game.j.aF[0]);
            }
        }
        if (by2 == 0) {
            this.a(imageArray[27], sArray2[27][30], n12, 190, 1, sArray[27], (byte)1, 0, 0, 27);
            this.e.a(i2.af[2], 26, -120, 27);
            this.e.a(i2.af[3], 26, -30, 27);
            this.e.a(i2.af[0], 28, -300, 27);
            this.e.a(i2.af[1], 181, -300, 27);
            this.a("\u630946\u952e\u5de6\u53f3\u7ffb\u9875", 120, 300, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
            if (byArray2.length > 0) {
                for (n3 = 0; n3 < 3; ++n3) {
                    n13 = byArray3[0][0] - 1 + n3;
                    if (byArray2.length >= 3) {
                        if (n13 < 0) {
                            n13 = byArray2.length - 1;
                        } else if (n13 >= byArray2.length) {
                            n13 = 0;
                        }
                    }
                    if (n13 < 0 || n13 >= byArray2.length) continue;
                    n14 = this.a(byArray2[n13]);
                    this.a(imageArray[28], sArray2[28][n14], n4, 260 - (n5 + n6 * n3), 1, sArray[28], (byte)1, 0, 0, 28);
                    this.a(stringArray[4][byArray2[n13]], n12 + 77, n5 + n6 * n3 + 2 + 3, 0x10 | 1, this.a((int)byArray2[n13], 1), game.j.aF[0]);
                }
                this.a(imageArray, 208, 46, (int)byArray3[0][0], byArray2.length, sArray, sArray2);
                this.a(imageArray[28], sArray2[28][byArray[byArray2[byArray3[0][0]] - 20][1][0] + 26], 75, 125, 1, sArray[28], (byte)1, 0, 0, 28);
                this.a("\u4ea7\u7269:", 30, 138, 0x10 | 4, 2761505, game.j.aF[0]);
                this.a(stringArray[5][byArray2[byArray3[0][0]]], 110, 138, 0x10 | 4, 2761505, game.j.aF[0]);
            } else {
                this.a(imageArray, 208, 46, 0, 1, sArray, sArray2);
                this.a("\u4ea7\u7269: ", 30, 138, 0x10 | 4, 2761505, game.j.aF[0]);
            }
        } else if (by2 == 1) {
            this.e.a(i2.af[2], 113, -102, 27);
            this.e.a(i2.af[3], 113, -70, 27);
            this.e.a(i2.af[0], 74, -87, 27);
            this.e.a(i2.af[1], 136, -87, 27);
            this.a(107, 87, 27, 16, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.a(byArray2[byArray3[0][0]])], 54, 228, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(2761505, game.j.aF[0]);
            i.drawString(stringArray[4][byArray2[byArray3[0][0]]], 94, 35, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u7cbe\u70bc\u6570\u91cf:", n4, n11 + n6, 0x10 | 4);
            n3 = byArray2[byArray3[0][0]] - 20;
            for (n2 = 0; n2 < byArray[n3][0].length / 2; ++n2) {
                i.drawString("\u9700\u8981\u6750\u6599:" + stringArray[4][byArray[n3][0][2 * n2]] + " X " + byArray[n3][0][2 * n2 + 1] * this.e.be[8], 120, n11 + n6 + n7 * 4, 0x10 | 1);
            }
            i.drawString("" + this.e.be[8], 120, 87, 0x10 | 1);
            if (by == 1) {
                n2 = -1;
                n = 50;
                int n15 = 97;
                int n16 = 25;
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(28, imageArray, sArray, sArray2);
                this.a("\u9700\u8981\u6d88\u8017\u6750\u6599:", n, n15 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                n2 = byArray2[byArray3[0][0]];
                for (int i3 = 0; i3 < byArray[n2 - 20][0].length / 2; ++i3) {
                    n14 = this.a(byArray[n2 - 20][0][2 * i3]);
                    this.a(imageArray[28], sArray2[28][n14], n, 260 - (n15 + n16 * (i3 + 1)), 1, sArray[28], (byte)1, 0, 0, 28);
                    this.a("X" + byArray[n2 - 20][0][2 * i3 + 1] * this.e.be[8], n + 32, n15 + n16 * (i3 + 1) + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    this.a(stringArray[4][byArray[n2 - 20][0][2 * i3]], n + 70, n15 + n16 * (i3 + 1) + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                }
                this.a("\u786e\u5b9a\u7cbe\u70bc" + this.e.be[8] + "\u4e2a", 120, n15 + n16 * 3 + 3, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(stringArray[4][byArray[n2 - 20][1][0]] + "\u5417?", 120, n15 + n16 * 4 + 3, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(2, imageArray, sArray, sArray2);
            }
        } else if (by2 == 2) {
            this.e.a(i2.af[2], 113, -102, 27);
            this.e.a(i2.af[3], 113, -70, 27);
            this.e.a(i2.af[0], 74, -87, 27);
            this.e.a(i2.af[1], 136, -87, 27);
            this.a(107, 87, 27, 16, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.a(byArray2[byArray3[0][0]])], 54, 228, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(2761505, game.j.aF[0]);
            i.drawString(stringArray[4][byArray2[byArray3[0][0]]], 94, 35, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u7cbe\u70bc\u6570\u91cf:", n4, n11 + n6, 0x10 | 4);
            n3 = byArray2[byArray3[0][0]] - 20;
            for (n2 = 0; n2 < byArray[n3][0].length / 2; ++n2) {
                i.drawString("\u9700\u8981\u6750\u6599:" + stringArray[4][byArray[n3][0][2 * n2]] + " X " + byArray[n3][0][2 * n2 + 1] * this.e.be[8], 120, n11 + n6 + n7 * 4, 0x10 | 1);
            }
            i.drawString("" + this.e.be[8], 120, 87, 0x10 | 1);
            this.a(i, 2761505, 0, 0, 240, 320);
            switch (by) {
                case 6: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u7cbe\u70bc\u4e2d\u2026\u2026", 120, 144, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a(60, 170, (int)this.e.be[10], (int)this.e.be[11], (int)this.e.be[15], (int)this.e.be[16], imageArray, sArray, sArray2);
                }
            }
        } else if (by2 == 3) {
            this.e.a(i2.af[2], 113, -102, 27);
            this.e.a(i2.af[3], 113, -70, 27);
            this.e.a(i2.af[0], 74, -87, 27);
            this.e.a(i2.af[1], 136, -87, 27);
            this.a(107, 87, 27, 16, 0xFFFFFF);
            this.a(imageArray[28], sArray2[28][this.a(byArray2[byArray3[0][0]])], 54, 228, 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(2761505, game.j.aF[0]);
            i.drawString(stringArray[4][byArray2[byArray3[0][0]]], 94, 35, 0x10 | 4);
            i.drawString("\u8bf7\u9009\u62e9\u7cbe\u70bc\u6570\u91cf:", n4, n11 + n6, 0x10 | 4);
            n3 = byArray2[byArray3[0][0]] - 20;
            for (n2 = 0; n2 < byArray[n3][0].length / 2; ++n2) {
                i.drawString("\u9700\u8981\u6750\u6599:" + stringArray[4][byArray[n3][0][2 * n2]] + " X " + byArray[n3][0][2 * n2 + 1] * this.e.be[8], 120, n11 + n6 + n7 * 4, 0x10 | 1);
            }
            i.drawString("" + this.e.be[8], 120, 87, 0x10 | 1);
            String[] stringArray2 = new String[]{"\u7cbe\u70bc\u6210\u529f", "\u6750\u6599\u4e0d\u8db3", "\u91d1\u94b1\u4e0d\u8db3"};
            this.a(i, 2761505, 0, 0, 240, 320);
            this.a(0, imageArray, sArray, sArray2);
            this.b(27, imageArray, sArray, sArray2);
            this.a(stringArray2[by], 120, 144, 0x10 | 1, 2761505, game.j.aF[0]);
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, byte[][][] byArray, int[] nArray, byte[] byArray2, byte[] byArray3, byte by2, byte[][] byArray4, h h2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n;
        int n2;
        int n3;
        int n4 = 19;
        int n5 = 49;
        int n6 = 25;
        int n7 = 60;
        int n8 = 204;
        int n9 = 26;
        int n10 = 52;
        int n11 = -1;
        int n12 = -1;
        this.a(imageArray[27], sArray2[27][30], n10, 190, 1, sArray[27], (byte)1, 0, 0, 27);
        this.e.a(i2.af[2], 26, -120, 27);
        this.e.a(i2.af[3], 26, -30, 27);
        this.e.a(i2.af[0], 28, -300, 27);
        this.e.a(i2.af[1], 181, -300, 27);
        this.a("\u630946\u952e\u5de6\u53f3\u7ffb\u9875", 120, 300, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
        this.a("\u63095\u952e\u8fdb\u884c\u953b\u9020", 120, 183, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
        this.a("\u6750\u6599:", 15, n8 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
        int n13 = 0;
        for (n3 = 0; n3 < 3; ++n3) {
            n11 = byArray4[0][0] - 1 + n3;
            if (byArray2.length >= 3) {
                if (n11 < 0) {
                    n11 = byArray2.length - 1;
                } else if (n11 >= byArray2.length) {
                    n11 = 0;
                }
            }
            if (n11 < 0 || n11 >= byArray2.length) continue;
            n12 = this.a(byArray2[n11]);
            this.a(imageArray[28], sArray2[28][n12], n4, 260 - (n5 + n6 * n3), 1, sArray[28], (byte)1, 0, 0, 28);
            n13 = game.b.a(byArray2[n11], byArray3) >= 0 ? this.a((int)byArray2[n11], 1) : 12631218;
            this.a(stringArray[4][byArray2[n11]], n10 + 77, n5 + n6 * n3 + 3, 0x10 | 1, n13, game.j.aF[0]);
        }
        n3 = byArray2[byArray4[0][0]] - 20;
        for (n2 = 0; n2 < byArray[n3][0].length / 2; ++n2) {
            n12 = byArray[n3][0][2 * n2] + 26;
            this.a(imageArray[28], sArray2[28][n12], n7, 260 - (n8 + n9 * n2), 1, sArray[28], (byte)1, 0, 0, 28);
            int n14 = n = byArray[n3][0][2 * n2 + 1] > nArray[byArray[n3][0][2 * n2]] ? 0xFF0000 : 2761505;
            if (game.b.a(byArray2[byArray4[0][0]], byArray3) >= 0) {
                this.a(nArray[byArray[n3][0][2 * n2]] + "/" + byArray[n3][0][2 * n2 + 1] + "  " + stringArray[4][byArray[n3][0][2 * n2]], n7 + 32, n8 + n9 * n2 + 3, 0x10 | 4, n, game.j.aF[0]);
                continue;
            }
            this.a("--/--", n7 + 32, n8 + n9 * n2 + 3, 0x10 | 4, n, game.j.aF[0]);
        }
        this.a(imageArray, 208, 46, (int)byArray4[0][0], byArray2.length, sArray, sArray2);
        this.a(stringArray[5][byArray2[byArray4[0][0]]], 30, 138, 0x10 | 4, 2761505, game.j.aF[0]);
        this.a("\u4ea7\u7269:", 30, 160, 0x10 | 4, 2761505, game.j.aF[0]);
        this.a(imageArray[28], sArray2[28][this.b(byArray[byArray2[byArray4[0][0]] - 20][1][0])], 75, 103, 1, sArray[28], (byte)1, 0, 0, 28);
        this.a("\u9b54\u6cd5:" + stringArray[11][byArray2[byArray4[0][0]]], 110, 160, 0x10 | 4, 2761505, game.j.aF[0]);
        if (by2 == 2) {
            n2 = -1;
            n = 50;
            int n15 = 97;
            int n16 = 25;
            int n17 = 50;
            int n18 = 97;
            int n19 = 25;
            this.a(i, 2761505, 0, 0, 240, 320);
            switch (by) {
                case 0: {
                    this.b(28, imageArray, sArray, sArray2);
                    this.a("\u9700\u8981\u6d88\u8017\u6750\u6599:", n, n15 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    n2 = byArray2[byArray4[0][0]];
                    for (int i3 = 0; i3 < byArray[n2 - 20][0].length / 2; ++i3) {
                        n12 = this.a(byArray[n2 - 20][0][2 * i3]);
                        this.a(imageArray[28], sArray2[28][n12], n, 260 - (n15 + n16 * (i3 + 1)), 1, sArray[28], (byte)1, 0, 0, 28);
                        this.a("X" + byArray[n2 - 20][0][2 * i3 + 1], n + 32, n15 + n16 * (i3 + 1) + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                        this.a(stringArray[4][byArray[n2 - 20][0][2 * i3]], n + 70, n15 + n16 * (i3 + 1) + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    }
                    this.a("\u953b\u9020" + stringArray[1][byArray[n2 - 20][1][0]] + "\u5417?", n, n15 + n16 * 4 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    this.a(2, imageArray, sArray, sArray2);
                    break;
                }
                case 2: {
                    String[] stringArray2 = new String[]{"\u662f\u5426\u8fdb\u884c", "[\u81ea\u52a8\u8d2d\u4e70]?"};
                    this.b(28, imageArray, sArray, sArray2);
                    this.a(2761505, game.j.aF[0]);
                    i.drawString("\u6750\u6599\u4e0d\u8db3", 120, n15 + 3, 0x10 | 1);
                    for (int i4 = 0; i4 < stringArray2.length; ++i4) {
                        i.drawString(stringArray2[i4], n, n15 + n16 + n16 * i4 + 3, 0x10 | 4);
                    }
                    this.a(2, imageArray, sArray, sArray2);
                    break;
                }
                case 4: {
                    this.b(28, imageArray, sArray, sArray2);
                    this.a("\u9700\u8981\u6d88\u8017\u6750\u6599:", n17, n18 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    n2 = byArray2[byArray4[0][0]];
                    for (int i5 = 0; i5 < byArray[n2 - 20][0].length / 2; ++i5) {
                        n12 = this.a(byArray[n2 - 20][0][2 * i5]);
                        this.a(imageArray[28], sArray2[28][n12], n17, 260 - (n18 + n19 * (i5 + 1)), 1, sArray[28], (byte)1, 0, 0, 28);
                        this.a("X" + byArray[n2 - 20][0][2 * i5 + 1], n17 + 32, n18 + n19 * (i5 + 1) + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                        this.a(stringArray[4][byArray[n2 - 20][0][2 * i5]], n + 70, n18 + n19 * (i5 + 1) + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    }
                    this.a("\u953b\u9020" + stringArray[1][byArray[n2 - 20][1][0]] + "\u5417?", n17, n18 + n19 * 4 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
                    this.a(2, imageArray, sArray, sArray2);
                    break;
                }
                case 6: {
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u953b\u9020\u4e2d\u2026\u2026", 120, 144, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a(60, 170, (int)this.e.be[10], (int)this.e.be[11], (int)this.e.be[15], (int)this.e.be[16], imageArray, sArray, sArray2);
                    break;
                }
                case 7: {
                    int n20 = 138;
                    int n21 = 28;
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u6b66\u5668\u7a7a\u95f4\u5df2\u6ee1", 120, n20, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a("\u9500\u6bc1\u4e00\u628a\u6b66\u5668\u5417?", 120, n20 + n21, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a(2, imageArray, sArray, sArray2);
                    break;
                }
                case 8: {
                    int n22 = 138;
                    int n23 = 28;
                    this.b(27, imageArray, sArray, sArray2);
                    this.a("\u6b66\u5668\u953b\u9020\u6210\u529f", 120, n22, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a("\u73b0\u5728\u88c5\u5907\u5417?", 120, n22 + n23, 0x10 | 1, 2761505, game.j.aF[0]);
                    this.a(2, imageArray, sArray, sArray2);
                }
            }
        } else if (by2 == 3) {
            String[] stringArray3 = new String[]{"\u88c5\u5907\u6210\u529f", "\u6750\u6599\u4e0d\u8db3", "\u91d1\u94b1\u4e0d\u8db3", "\u53ef\u5728\u6b66\u5668\u680f\u88c5\u5907", "\u5546\u5e97\u5c1a\u672a\u51fa\u552e"};
            this.a(i, 2761505, 0, 0, 240, 320);
            this.a(0, imageArray, sArray, sArray2);
            this.b(27, imageArray, sArray, sArray2);
            if (by == 5) {
                String string = stringArray[12 + this.e.aq[0]][byArray2[byArray4[0][0]]];
                this.a("\u914d\u65b9\u672a\u83b7\u5f97", 120, 127, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(string, 120, 153, 0x10 | 1, 2761505, game.j.aF[0]);
            } else {
                this.a(stringArray3[by], 120, 144, 0x10 | 1, 2761505, game.j.aF[0]);
            }
        }
    }

    private int b(int n) {
        byte[] byArray = new byte[]{0, 4, 8, 13, 17, 1, 5, 9, 14, 18, 2, 6, 10, 15, 19, 3, 7, 11, 16, 20, 12, 21};
        return byArray[n];
    }

    private int a(int n) {
        int n2 = -1;
        if (n >= 0 && n <= 19) {
            int[] nArray = new int[]{31, 32, 33, 34, 35, 172, 173, 174, 175, 176, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
            n2 = nArray[n];
        } else if (n >= 20 && n <= 28) {
            n2 = 46;
        } else if (n >= 29 && n <= 50) {
            n2 = 47;
        }
        return n2;
    }

    private void a(int n, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n2 = 18;
        if (n == 0 || n == 2) {
            this.a(imageArray[27], sArray2[27][6], 1, 260 - (320 - n2), 1, sArray[27], (byte)1, 0, 0, 27);
        }
        if (n == 1 || n == 2) {
            this.a(imageArray[27], sArray2[27][7], 240 - n2, 260 - (320 - n2), 1, sArray[27], (byte)1, 0, 0, 27);
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n7 = n + 6;
        int n8 = n2 + 6;
        int n9 = 108;
        this.a(n7, n8, n9, 6, 10325090);
        this.a(n7, n8 + 1, n9, 3, 11970434);
        this.a(n7, n8 + 2, n9, 1, 12957590);
        this.a(n7, n8, n9 * n3 / n4, 6, 5913123);
        this.a(n7, n8 + 1, n9 * n3 / n4, 3, 7885599);
        this.a(n7, n8 + 2, n9 * n3 / n4, 1, 11038494);
        if (n3 == n4 && n5 % 2 == 0) {
            this.a(n7, n8, n9, 6, 7219968);
            this.a(n7, n8 + 1, n9, 3, 11296512);
            this.a(n7, n8 + 2, n9, 1, 0xFF9900);
        }
        this.a(imageArray[27], sArray2[27][59], n, 260 - n2, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a("" + n3 * 100 / n4 + "%", 120, n8, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
    }

    public void a(Image[] imageArray, int n, short[][] sArray, int n2, int n3, int n4, int n5) {
        short s = sArray[n][3];
        short s2 = sArray[n][4];
        i.setClip(n2, n3, n4 + 1, n5 + 1);
        for (int i2 = 0; i2 <= n5 / s2; ++i2) {
            for (int i3 = 0; i3 <= n4 / s; ++i3) {
                game.b.a(imageArray[0], sArray[n][1], sArray[n][2], sArray[n][3], sArray[n][4], n2 + i3 * s, n3 + i2 * s2, 4 | 0x10, 0, i);
            }
        }
    }

    public void a(Image[][] imageArray, int n, i i2, byte[] byArray, byte[][] byArray2, byte[] byArray3, byte[] byArray4, int n2, int n3, int n4, int n5, short[] sArray, short[][][] sArray2, short[][][] sArray3, short[][][] sArray4, short[][][] sArray5, short[][][][] sArray6) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = 10;
        int n12 = 10;
        int n13 = 220;
        int n14 = 230;
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
        int n22 = 88;
        int n23 = 128;
        i.setClip(n11, n12, n13, n14);
        int n24 = 0;
        int n25 = 0;
        for (n10 = 3; n10 < byArray.length; n10 += 3) {
            by = byArray4[byArray[n10] * 2];
            by2 = byArray4[byArray[n10] * 2 + 1];
            i.setColor(0xFFFFFF);
            i.fillRect(n22 + (byArray[n10 + 1] - n4) * n15 - 2, 320 - n23 - (byArray[n10 + 2] - n5 + by2) * n15 - 2, by * n15 + 4, by2 * n15 + 4);
        }
        n10 = 0;
        int n26 = 0;
        for (n9 = 3; n9 < byArray.length; n9 += 3) {
            by = byArray4[byArray[n9] * 2];
            by2 = byArray4[byArray[n9] * 2 + 1];
            i.setColor(0x3F3F3F);
            if (byArray3[n9 / 3] == 1) {
                i.setColor(24758);
                n10 = this.e.b(byArray[n9]);
                int[] nArray = new int[]{13398064, 28830, 5308426, 10697581, 101858};
                if (n10 >= 0) {
                    i.setColor(nArray[n10]);
                }
            }
            if ((n26 = game.b.a(n9 / 3, sArray)) >= 0) {
                i.setColor(0xFF0000);
            }
            i.fillRect(n22 + (byArray[n9 + 1] - n4) * n15, 320 - n23 - (byArray[n9 + 2] - n5 + by2) * n15, by * n15, by2 * n15);
            if (byArray3[n9 / 3] == 1) {
                i.setColor(0xFFFFFF);
                i.drawRect(n22 + (byArray[n9 + 1] - n4) * n15, 320 - n23 - (byArray[n9 + 2] - n5 + by2) * n15, by * n15, by2 * n15);
            }
            n25 += by * by2;
            if (byArray3[n9 / 3] != 1) continue;
            n24 += by * by2;
        }
        for (n9 = 3; n9 < byArray.length; n9 += 3) {
            for (int i3 = 0; i3 < byArray2[n9 / 3].length; i3 += 3) {
                if (byArray3[n9 / 3] == 0) continue;
                by3 = byArray2[n9 / 3][i3 + 0];
                by4 = byArray2[n9 / 3][i3 + 1];
                if ((byArray2[n9 / 3][i3 + 2] & 8) == 8) {
                    n18 = n16 = n22 + (byArray[n9 + 1] + by3 + 1 - n4) * n15;
                    n17 = 320 - n23 - (byArray[n9 + 2] + by4 + 1 - n5) * n15 + n20;
                    n19 = 320 - n23 - (byArray[n9 + 2] + by4 - n5) * n15 - n20;
                    i.setColor(24710);
                    i.drawLine(n16, n17, n18, n19);
                    i.setColor(0xFFFFFF);
                    i.drawLine(n16 - 1, n17, n16 + 1, n17);
                    i.drawLine(n16 - 1, n19, n16 + 1, n19);
                }
                if ((byArray2[n9 / 3][i3 + 2] & 4) == 4) {
                    n18 = n16 = n22 + (byArray[n9 + 1] + by3 - n4) * n15;
                    n17 = 320 - n23 - (byArray[n9 + 2] + by4 + 1 - n5) * n15 + n20;
                    n19 = 320 - n23 - (byArray[n9 + 2] + by4 - n5) * n15 - n20;
                    i.setColor(24710);
                    i.drawLine(n16, n17, n18, n19);
                    i.setColor(0xFFFFFF);
                    i.drawLine(n16 - 1, n17, n16 + 1, n17);
                    i.drawLine(n16 - 1, n19, n16 + 1, n19);
                }
                if ((byArray2[n9 / 3][i3 + 2] & 1) == 1) {
                    n16 = n22 + (byArray[n9 + 1] + by3 - n4) * n15 + n20;
                    n18 = n22 + (byArray[n9 + 1] + by3 + 1 - n4) * n15 - n20;
                    n19 = n17 = 320 - n23 - (byArray[n9 + 2] + by4 + 1 - n5) * n15;
                    i.setColor(24710);
                    i.drawLine(n16, n17, n18, n19);
                    i.setColor(0xFFFFFF);
                    i.drawLine(n16, n17, n16, n19);
                    i.drawLine(n18, n17, n18, n19);
                }
                if ((byArray2[n9 / 3][i3 + 2] & 2) != 2) continue;
                n16 = n22 + (byArray[n9 + 1] + by3 - n4) * n15 + n20;
                n18 = n22 + (byArray[n9 + 1] + by3 + 1 - n4) * n15 - n20;
                n19 = n17 = 320 - n23 - (byArray[n9 + 2] + by4 - n5) * n15;
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
        int n27 = 0;
        if (sArray2 != null) {
            for (n8 = 0; n8 < sArray2.length; ++n8) {
                for (n7 = 1; n7 < sArray2[n8].length; ++n7) {
                    if (sArray2[n8][n7][3] != 0) continue;
                    n9 = (sArray2[n8][n7][0] * 20 - 20 + byArray[sArray2[n8][0][0] * 3 + 1] * 240) * n15 / 240 - n4 * n15 + n22;
                    n27 = 320 - ((sArray2[n8][n7][1] * 20 + 20 + 20 + byArray[sArray2[n8][0][0] * 3 + 2] * 320) * n15 / 320 - n5 * n15) - n23;
                    this.a(imageArray[27][0], 27, 57, n9 - 5, n27 - 5, sArray5);
                }
            }
        }
        if (sArray3 != null) {
            for (n8 = 0; n8 < sArray3.length; ++n8) {
                for (n7 = 1; n7 < sArray3[n8].length; ++n7) {
                    if (sArray3[n8][n7][3] != 0) continue;
                    n9 = (sArray3[n8][n7][0] * 20 - 20 + byArray[sArray3[n8][0][0] * 3 + 1] * 240) * n15 / 240 - n4 * n15 + n22;
                    n27 = 320 - ((sArray3[n8][n7][1] * 20 + 20 + 20 + byArray[sArray3[n8][0][0] * 3 + 2] * 320) * n15 / 320 - n5 * n15) - n23;
                    this.a(imageArray[27][0], 27, 57, n9 - 5, n27 - 5, sArray5);
                }
            }
        }
        if (sArray4 != null) {
            for (n8 = 0; n8 < sArray4.length; ++n8) {
                for (n7 = 1; n7 < sArray4[n8].length; ++n7) {
                    n9 = (sArray4[n8][n7][0] * 20 - 20 + byArray[sArray4[n8][0][0] * 3 + 1] * 240) * n15 / 240 - n4 * n15 + n22;
                    n27 = 320 - ((sArray4[n8][n7][1] * 20 + 20 + 20 + byArray[sArray4[n8][0][0] * 3 + 2] * 320) * n15 / 320 - n5 * n15) - n23;
                    if (sArray4[n8][n7][2] == 29) {
                        this.a(imageArray[27][0], 27, 59, n9 - 5, n27 - 5, sArray5);
                        continue;
                    }
                    this.a(imageArray[27][0], 27, 58, n9 - 5, n27 - 5, sArray5);
                }
            }
        }
        int[][][] nArrayArray = new int[][][]{new int[][]{{48}, {8, 10, 70, 0}}, new int[][]{{74}, {8, 10, 71, 0}}, new int[][]{{100}, {8, 18, 72, 0}}, new int[][]{{137}, {8, 6, 74, 0}}, new int[][]{{157}, {8, 6, 75, 0}}, new int[][]{{118}, {8, 6, 73, 0}}};
        for (n7 = 0; n7 < nArrayArray.length; ++n7) {
            for (n6 = 1; n6 < nArrayArray[n7].length; ++n6) {
                n9 = (nArrayArray[n7][n6][0] * 20 - 20 + byArray[nArrayArray[n7][0][0] * 3 + 1] * 240) * n15 / 240 - n4 * n15 + n22;
                n27 = 320 - ((nArrayArray[n7][n6][1] * 20 + 20 + 20 + byArray[nArrayArray[n7][0][0] * 3 + 2] * 320) * n15 / 320 - n5 * n15) - n23;
                if (n9 - 5 < n11 - n15 || n9 - 5 > n11 + n13 || n27 - 5 < n12 - n15 || n27 - 5 > n12 + n14) continue;
                this.a(imageArray[27][0], 27, nArrayArray[n7][n6][2], n9 - 5, n27 - 5, sArray5);
            }
        }
        this.a(imageArray[27], sArray6[27][35], 5, 255, 1, sArray5[27], (byte)1, 0, 0, 27);
        if (n == 0) {
            this.a(0, 257, 240, 63, 0);
            n7 = 2;
            n6 = n7 + 15;
            int n28 = 276;
            int n29 = 60;
            i.setColor(0xFF0000);
            i.fillRect(n7, n28, 12, 12);
            this.a(imageArray[27][0], 27, 57, n7 + n29, n28 + 2, sArray5);
            this.a(imageArray[27][0], 27, 59, n7 + n29 * 2, n28 + 2, sArray5);
            this.a(imageArray[27][0], 27, 58, n7 + n29 * 3, n28 + 2, sArray5);
            i.setColor(13673568);
            i.drawString("BOSS", n6, n28, 4 | 0x10);
            i.drawString("\u5b9d\u7269", n6 + n29, n28, 4 | 0x10);
            i.drawString("\u5b58\u6863", n6 + n29 * 2, n28, 4 | 0x10);
            i.drawString("\u5546\u4eba", n6 + n29 * 3, n28, 4 | 0x10);
            n24 = n24 * 1000 / n25;
            i.drawString(n24 / 10 + "." + n24 % 100 + "%", 120, 319, 1 | 0x20);
            if (n4 > 0) {
                this.e.a(i2.af[0], 0, -125, 27);
                this.e.a(i2.af[8], 0, -125, 27);
            }
            if (n4 < 66) {
                this.e.a(i2.af[1], 209, -125, 27);
                this.e.a(i2.af[9], 209, -125, 27);
            }
            if (n5 < 23) {
                this.e.a(i2.af[3], 112, 0, 27);
                this.e.a(i2.af[11], 112, 0, 27);
            }
            if (n5 > 0) {
                this.e.a(i2.af[2], 112, -244, 27);
                this.e.a(i2.af[10], 112, -244, 27);
            }
            this.a(1, imageArray, sArray5, sArray6);
        }
    }

    public void a(byte[] byArray, byte[][] byArray2, int n) {
        i.setFont(game.j.aF[0]);
        i.setClip(0, 0, 240, 320);
        i.setColor(320);
        String[] stringArray = new String[]{"\u65b0\u7684\u6e38\u620f", "\u7ee7\u7eed\u6e38\u620f", "\u8bbe\u7f6e", "\u5e2e\u52a9", "\u5173\u4e8e", "\u79bb\u5f00"};
        i.setColor(13673568);
        this.a(stringArray[byArray2[0][0]], 120, 247, 1 | 0x10, i, game.j.aF[0], 6958594, 0xFFFFFF);
    }

    public void a(Image[][] imageArray, i i2, int n, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        if (n == 0) {
            this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
            this.a("\u5b58\u50a8\u4e2d\u2026\u2026", 120, 190, 0x10 | 1, i, game.j.aF[0], 2761505, 0xFFFFFF);
            this.a(2761505, game.j.aF[0]);
            this.a(i, stringArray[this.e.aq[10]][0], 2761505, 5, 210, 20, 230, 0x10 | 4, game.j.aF[0]);
        } else if (n == 1) {
            this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
            this.a("\u5b58\u50a8\u6210\u529f", 120, 210, 0x10 | 1, i, game.j.aF[0], 2761505, 0xFFFFFF);
            this.e.a(i2.af[7], 91, -175, 27);
        } else if (n == 2) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a("\u662f\u5426\u82b1\u8d39" + (this.e.E[5][0] + this.e.E[5][1] * this.e.E[5][2]) + "\u91d1\u5e01", 120, 127, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a("\u50a8\u5b58\u6e38\u620f\u5e76\u56de\u590d\uff1f", 120, 149, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(2, imageArray, sArray, sArray2);
        }
    }

    public void a(Image[][] imageArray, i i2, a a2, short[][][] sArray, short[][][][] sArray2) {
        int n;
        this.b(29, imageArray, sArray, sArray2);
        this.e.a(i2.af[7], 92, -242, 27);
        int n2 = 45;
        int n3 = 80;
        int n4 = 26;
        this.a("\u89d2\u8272\u7b49\u7ea7\u63d0\u5347\uff01", 120, n3, 1 | 0x10, i, game.j.aF[0], 2761505, 0xFFFFFF);
        String[] stringArray = new String[]{"\u7b49\u7ea7", "\u751f\u547d", "\u9b54\u529b", "\u653b\u51fb", "\u9632\u5fa1"};
        String[] stringArray2 = new String[]{"" + a2.b[2], "" + a2.a[2], "" + a2.C[2], "" + a2.Z[2], "" + a2.ac[2]};
        String[] stringArray3 = new String[]{"" + a2.b[0], "" + a2.a[0], "" + a2.C[0], "" + a2.Z[0], "" + a2.ac[0]};
        this.a(2761505, game.j.aF[0]);
        for (n = 0; n < stringArray.length; ++n) {
            i.drawString(stringArray[n] + ":" + stringArray2[n], n2, n3 + n4 + n4 * n, 4 | 0x10);
            i.drawString("-->", n2 + 85, n3 + n4 + n4 * n, 4 | 0x10);
        }
        this.a(5302767, game.j.aF[0]);
        for (n = 0; n < stringArray3.length; ++n) {
            i.drawString(stringArray3[n], n2 + 110, n3 + n4 + n4 * n, 4 | 0x10);
        }
    }

    public void a(Image[][] imageArray, i i2, int n, int n2, a a2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n3;
        this.b(29, imageArray, sArray, sArray2);
        this.e.a(i2.af[7], 92, -242, 27);
        int n4 = 45;
        int n5 = 80;
        int n6 = 26;
        this.a("\u6b66\u5668\u7b49\u7ea7\u63d0\u5347\uff01", 120, n5, 1 | 0x10, i, game.j.aF[0], 2761505, 0xFFFFFF);
        String[] stringArray2 = new String[]{"\u7b49\u7ea7", "\u653b\u51fb"};
        String[] stringArray3 = new String[]{"" + n2, "" + this.e.at[a2.d][0] * (100 + this.e.bE[n2]) * (100 + this.e.co[6]) / 10000};
        String[] stringArray4 = new String[]{"" + a2.ax, "" + this.e.at[a2.d][0] * (100 + this.e.bE[a2.ax]) * (100 + this.e.co[6]) / 10000};
        this.a(2761505, game.j.aF[0]);
        for (n3 = 0; n3 < stringArray2.length; ++n3) {
            i.drawString(stringArray2[n3] + ":" + stringArray3[n3], n4, n5 + n6 + n6 * n3, 4 | 0x10);
            i.drawString("-->", n4 + this.f * 5, n5 + n6 + n6 * n3, 4 | 0x10);
        }
        this.a(5302767, game.j.aF[0]);
        for (n3 = 0; n3 < stringArray4.length; ++n3) {
            i.drawString(stringArray4[n3], n4 + this.f * 7, n5 + n6 + n6 * n3, 4 | 0x10);
        }
        i.setColor(65280);
        i.drawString("\u6b66\u5668\u57283/6/9\u7ea7\u53ef", 120, n5 + n6 * 4, 1 | 0x10);
        i.drawString("\u9644\u9b54\u4e00\u6b21", 120, n5 + n6 * 5, 1 | 0x10);
    }

    public void a(Image[][] imageArray, i i2, int n, short[][][] sArray, short[][][][] sArray2) {
        this.b(29, imageArray, sArray, sArray2);
        this.e.a(i2.af[7], 92, -242, 27);
        int n2 = 45;
        int n3 = 80;
        int n4 = 26;
        this.a("\u8fdb\u5165\u5934\u76ee\u623f\u95f4\uff01", 120, n3, 1 | 0x10, i, game.j.aF[0], 2761505, 0xFFFFFF);
        this.a(2761505, game.j.aF[0]);
        i.drawString("\u6b64\u5934\u76ee\u53ef\u6389\u843d:", n2, n3 + n4, 4 | 0x10);
        String[][][] stringArrayArray = new String[][][]{{{"", ""}, {"\u80fd\u953b\u9020\u51fa\u666e\u901a\u8f7b\u5251", "\u6ee1\u7ea7\u653b\u51fb+45"}, {"\u80fd\u953b\u9020\u51fa\u9ad8\u7ea7\u957f\u67c4", "\u6ee1\u7ea7\u653b\u51fb+180"}, {"\u80fd\u953b\u9020\u51fa\u9ad8\u7ea7\u957f\u97ad", "\u6ee1\u7ea7\u653b\u51fb+180"}, {"\u80fd\u953b\u9020\u51fa\u6781\u54c1\u8f7b\u5251", "\u6ee1\u7ea7\u653b\u51fb+330"}, {"", ""}, {"\u80fd\u953b\u9020\u51fa\u6781\u54c1\u91cd\u5251", "\u6ee1\u7ea7\u653b\u51fb+480"}}, {{"\u80fd\u953b\u9020\u51fa\u7ec8\u6781\u957f\u67aa", "\u6ee1\u7ea7\u653b\u51fb+600"}, {"\u80fd\u953b\u9020\u51fa\u7ec8\u6781\u957f\u67c4", "\u6ee1\u7ea7\u653b\u51fb+1050"}, {"\u80fd\u953b\u9020\u51fa\u7ec8\u6781\u957f\u97ad", "\u6ee1\u7ea7\u653b\u51fb+540"}, {"\u80fd\u953b\u9020\u51fa\u7ec8\u6781\u8f7b\u5251", "\u6ee1\u7ea7\u653b\u51fb+660"}, {"", ""}, {"\u80fd\u953b\u9020\u51fa\u7ec8\u6781\u91cd\u5251", "\u6ee1\u7ea7\u653b\u51fb+1050"}}};
        i.drawString(stringArrayArray[this.e.aq[0]][n][0], n2, n3 + n4 * 3, 4 | 0x10);
        byte by = this.e.J[this.e.aq[0]][this.e.bL[this.e.aq[0]][n][1] - 19][0][0];
        this.a(this.e.b[1][0][4][by], 120, n3 + n4 * 2, 0x10 | 1, this.a((int)by, 1), game.j.aF[0]);
        this.a(stringArrayArray[this.e.aq[0]][n][1], 120, n3 + n4 * 4, 0x10 | 1, 0xFF0000, game.j.aF[0]);
        this.a("\u9b54\u6cd5\uff1a" + this.e.b[1][0][11][by], 120, n3 + n4 * 5, 0x10 | 1, 1179903, game.j.aF[0]);
    }

    public void a(Image[][] imageArray, i i2, int n, int n2, short s, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
        int n3 = 190;
        int n4 = 20;
        int[] nArray = this.c(n2);
        if (this.e.aq[0] == 0) {
            this.a("\u63a5\u89e6\u6c34\u6676\u53cd\u590d\u6311\u6218\u5934\u76ee", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a("\u53ef\u83b7\u5f97\u6b66\u5668\u914d\u65b9\u548c\u5b9d\u77f3", 120, n3 + n4, 0x10 | 1, 2761505, game.j.aF[0]);
        } else {
            if (s == 0) {
                this.a("\u51fb\u6740\u65f6\u95f4:", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
            } else if (s == 1) {
                this.a("\u8bb0\u5f55\u66f4\u65b0!", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
            }
            this.a(nArray[0] + "\u65f6" + nArray[1] + "\u5206" + nArray[2] + "\u79d2", 120, n3 + n4, 0x10 | 1, 2761505, game.j.aF[0]);
        }
        byte by = this.e.J[this.e.aq[0]][this.e.bL[this.e.aq[0]][this.e.be[22]][1] - 19][0][0];
        String string = "";
        if (by < 127) {
            if (this.e.bq[by] > 0) {
                string = "[\u5df2\u83b7\u5f97]";
            } else if (n == 1) {
                string = "[\u5df2\u6389\u843d]";
            } else if (n == 0) {
                string = "[\u672a\u6389\u843d]";
            }
            this.a(this.e.b[1][0][4][by] + "  " + string, 120, n3 + n4 + n4, 0x10 | 1, this.a((int)by, 1), game.j.aF[0]);
        }
    }

    public void a(Image[][] imageArray, String string, short s, short s2, short s3, short s4, short[][][] sArray, short[][][][] sArray2) {
        i.setColor(13673568);
        i.setFont(game.j.aF[0]);
        i.setClip(0, 0, 240, 295);
        this.a(i, string, 13673568, 240 - s4 >> 1, (int)s2, (int)s3, (int)s4, 0x10 | 4, game.j.aF[0]);
        this.a(0, 290, 240, 30, 0);
        this.a("\u63090\u952e\u8df3\u8fc7", 120, 295, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
    }

    public void d() {
        this.a("\u63090\u952e\u8df3\u8fc7", 120, 295, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
    }

    public void c(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 130;
        int n2 = 22;
        this.a(i, 2761505, 0, 0, 240, 320);
        this.b(27, imageArray, sArray, sArray2);
        String[] stringArray = new String[]{"\u65b0\u7684\u6e38\u620f\u4f1a\u6e05", "\u9664\u4ee5\u524d\u5b58\u6863,", "\u662f\u5426\u786e\u5b9a?"};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.a(stringArray[i2], 120, n + n2 * i2, 0x10 | 1, 2761505, game.j.aF[0]);
        }
        this.a(2, imageArray, sArray, sArray2);
    }

    public void b(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n = 0;
        int n2 = 0;
        n2 = 138;
        n = 28;
        this.a(0, 0, 240, 320, 0);
        this.b(27, imageArray, sArray, sArray2);
        String[] stringArray = new String[]{"\u6e38\u620f\u7ed3\u675f", "\u662f\u5426\u7ee7\u7eed?"};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.a(stringArray[i2], 120, n2 + n * i2, 0x10 | 1, 2761505, game.j.aF[0]);
        }
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(i i2, i i3, int n, int n2, int n3, short s, short s2, int n4, byte[][] byArray, String[][][][] stringArray, Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        int n5 = 10;
        int n6 = 280;
        int n7 = 190;
        int n8 = 274;
        if (n4 > 0) {
            switch (byArray[n4][1]) {
                case 0: {
                    this.a(imageArray[27], sArray2[27][61], 0, 260 - n8, 1, sArray[27], (byte)1, 0, 0, 27);
                    this.a(2761505, game.j.aF[0]);
                    if (i2 != null) {
                        if ((n4 == 24 || n4 == 25) && this.e.q[0] != 0) {
                            this.e.a(i2.af[10], this.e.aC[0] + 120, this.e.aC[1] + 160, i2.au);
                        } else {
                            this.e.a(i2.af[10], this.e.ar.P + 30, this.e.ar.N + 50, i2.au);
                        }
                    }
                    this.a(2761505, game.j.aF[0]);
                    this.a(i, stringArray[0][0][byArray[n4][2]][0], 2761505, 20, n6, 18, 200, 0x10 | 4, game.j.aF[0]);
                    break;
                }
                case 2: {
                    if (this.e.bf[0] != 7) break;
                    this.a(imageArray[27], sArray2[27][61], 0, 260 - n8, 1, sArray[27], (byte)1, 0, 0, 27);
                    this.a(2761505, game.j.aF[0]);
                    String string = stringArray[0][3][byArray[n4][2]][0];
                    switch (byArray[n4][2]) {
                        case 7: {
                            string = this.a(string, "" + n3);
                            break;
                        }
                        case 1: 
                        case 9: {
                            string = this.a(string, stringArray[1][0][4][n3]);
                            break;
                        }
                        case 8: {
                            string = this.a(string, stringArray[1][0][8][n3]);
                        }
                    }
                    this.a(i, string, 2761505, 20, n6, 18, 200, 0x10 | 4, game.j.aF[0]);
                    break;
                }
                case 3: {
                    if (n4 >= 33 && n4 <= 40 || n4 >= 42 && n4 <= 52 || n4 >= 59 && n4 <= 63 || n4 >= 74 && n4 <= 75) {
                        if (this.e.bf[0] != 7) break;
                        String string = stringArray[0][1][byArray[n4][2]][this.e.be[43]];
                        switch (byArray[n4][2]) {
                            case 30: 
                            case 31: 
                            case 32: {
                                string = this.a(string, stringArray[1][0][10][n]);
                                break;
                            }
                            case 33: 
                            case 34: {
                                string = this.a(string, stringArray[1][0][4][n]);
                            }
                        }
                        if (s <= 0) break;
                        this.a(imageArray[27], sArray2[27][60], 0, 80, 1, sArray[27], (byte)1, 0, 0, 27);
                        if (s2 == 0) {
                            this.e.a(i3.af[7], 91, -175, 27);
                        }
                        this.a(2761505, game.j.aF[0]);
                        this.a(i, string, 2761505, n5, n7, 20, 220, 0x10 | 4, game.j.aF[0]);
                        break;
                    }
                    if ((n4 < 53 || n4 > 58) && (n4 < 64 || n4 > 66) || this.e.bf[0] != 4) break;
                    this.a(i, 2761505, 0, 0, 240, 320);
                    if (s <= 0) break;
                    this.a(imageArray[27], sArray2[27][60], 0, 140, 1, sArray[27], (byte)1, 0, 0, 27);
                    if (s2 == 0) {
                        this.e.a(i3.af[7], 91, -175, 27);
                    }
                    this.a(2761505, game.j.aF[0]);
                    this.a(i, stringArray[0][1][byArray[n4][2]][this.e.be[43]], 2761505, n5, n7, 20, 220, 0x10 | 4, game.j.aF[0]);
                    break;
                }
                case 5: {
                    if (this.e.bf[0] != 7) break;
                    this.a(i, 2761505, 0, 0, 240, 320);
                    this.b(27, imageArray, sArray, sArray2);
                    String string = "";
                    for (int i4 = 0; i4 < stringArray[0][2][byArray[n4][2]].length; ++i4) {
                        switch (byArray[n4][2]) {
                            case 0: {
                                string = this.a(stringArray[0][2][byArray[n4][2]][i4], stringArray[1][0][1][this.e.aj[n2][1]]);
                                break;
                            }
                            case 1: {
                                string = stringArray[0][2][byArray[n4][2]][i4];
                                break;
                            }
                            case 2: 
                            case 3: {
                                string = this.a(stringArray[0][2][byArray[n4][2]][i4], stringArray[1][0][4][n2]);
                            }
                        }
                        this.a(string, 120, 138 + 28 * i4, 0x10 | 1, 2761505, game.j.aF[0]);
                    }
                    this.a(2, imageArray, sArray, sArray2);
                }
            }
        }
    }

    public String a(String string, String string2) {
        String string3 = string;
        int n = string.indexOf("#1");
        if (n > 0) {
            string3 = string.substring(0, n) + string2 + string.substring(n + 2);
        }
        return string3;
    }

    public void e(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a("\u662f\u5426\u5f00\u542f\u58f0\u97f3?", 120, 100, 0x10 | 1, 2761505, game.j.aF[0]);
        this.a("\u662f", 60, 200, 0x10 | 1, 2761505, game.j.aF[0]);
        this.a("\u5426", 180, 200, 0x10 | 1, 2761505, game.j.aF[0]);
        this.a("\u5173\u95ed\u58f0\u97f3\u8fd0\u884c\u4f1a\u66f4\u6d41\u7545", 120, 265, 0x10 | 1, 2761505, game.j.aF[0]);
        this.b(40, 60, 160, 200, 2761505);
        this.a(2, imageArray, sArray, sArray2);
    }

    public void a(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(0, 0, 240, 320, 0);
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        this.a("\u662f\u5426\u5f00\u542f\u6559\u5b66?", 120, 100, 0x10 | 1, 2761505, game.j.aF[0]);
        this.a("\u662f", 60, 200, 0x10 | 1, 2761505, game.j.aF[0]);
        this.a("\u5426", 180, 200, 0x10 | 1, 2761505, game.j.aF[0]);
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

    public int[] c(int n) {
        int[] nArray = new int[]{0, 0, 0};
        int n2 = n * e.C / 1000;
        nArray[0] = n2 / 3600;
        nArray[1] = (n2 - nArray[0] * 3600) / 60;
        nArray[2] = n2 - nArray[0] * 3600 - nArray[1] * 60;
        return nArray;
    }

    public void a(Image[][] imageArray, d d2, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        i.setFont(game.j.aF[0]);
        i.setClip(0, 0, 240, 320);
        i.setColor(2761505);
        int n = 46;
        int n2 = 5;
        n2 = game.j.aF[0].stringWidth("\u80cc\u666f\u97f3\u4e50 : ");
        i.drawString("\u8bbe\u7f6e\u9009\u9879", 120, 40, 1 | 0x10);
        i.drawString("\u80cc\u666f\u97f3\u4e50 : ", n, 150, 4 | 0x10);
        this.a(n + n2, 150, 2761505, 2761505, (int)game.d.a((byte)1), 4);
        i.setClip(0, 0, 240, 320);
        this.a(1, imageArray, sArray, sArray2);
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = 4;
        int n9 = 4;
        i.setColor(n4);
        int n10 = n2 + game.j.aF[0].getHeight() - 3;
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
                this.a(imageArray[26], sArray2[26][154], 0, 260, 1, sArray[26], (byte)1, 0, 0, 26);
                this.a(56, 9, 127, 4, 1, 1, 16760563, 12783632, 0x850000);
                this.a(86, 20, 97, 4, 1, 1, 7459823, 1640393, 786809);
                int n3 = game.j.aF[0].stringWidth("999999");
                this.a("999999", 216 - n3, 34, 0x10 | 4, i, game.j.aF[0], 2761505, 16646090);
                this.a(imageArray[26], sArray2[26][348], 216 - n3 - 5, 223, 1, sArray[26], (byte)1, 0, 0, 26);
                this.a("99", 64, 17, 0x10 | 1, i, game.j.aF[0], 2761505, 16646090);
                this.b(imageArray, 9999, 9999, 180, 7, sArray, sArray2);
                this.b(imageArray, 9999, 9999, 180, 18, sArray, sArray2);
                i.setFont(game.j.aF[0]);
                i.setClip(0, 0, 240, 320);
                i.setColor(0xFFFFFF);
                i.drawLine(29, 34, 29, 70);
                i.drawLine(64, 30, 64, 120);
                i.drawLine(108, 23, 108, 160);
                i.drawLine(152, 12, 152, 200);
                i.drawLine(196, 45, 196, 120);
                i.setColor(13673568);
                i.drawString("\u5934\u50cf", 29, 75, 1 | 0x10);
                i.drawString("\u7b49\u7ea7", 64, 125, 1 | 0x10);
                i.drawString("\u9b54\u529b\u503c", 108, 165, 1 | 0x10);
                i.drawString("\u751f\u547d\u503c", 152, 205, 1 | 0x10);
                i.drawString("\u91d1\u94b1", 196, 125, 1 | 0x10);
                break;
            }
            case 1: {
                i.setFont(game.j.aF[0]);
                i.setClip(0, 0, 240, 320);
                i.setColor(13673568);
                String[] stringArray = new String[]{"4,6 --- \u5de6\u53f3\u8dd1\u52a8", "5 --- \u6b66\u5668\u653b\u51fb", "2 --- \u5411\u4e0a\u8df3\u8dc3", "1,3 --- \u5de6\u53f3\u659c\u8df3", "\u5728\u7a7a\u4e2d\u53ef\u4ee5\u4e8c\u6b21\u8df3\u8dc3", "9 --- \u4f7f\u7528\u9b54\u6cd5", "8 --- \u4e0b\u8e72", "\u53cc\u51fb8\u952e\u53ef\u4ee5\u4e0b\u8df3", "7 --- \u67e5\u770b\u5730\u56fe", "\u5de6\u8f6f\u952e --- \u6682\u505c\u83dc\u5355", "\u53f3\u8f6f\u952e --- \u7cfb\u7edf\u83dc\u5355"};
                for (int i3 = 0; i3 < stringArray.length; ++i3) {
                    i.drawString(stringArray[i3], 40, 30 + i3 * 20, 4 | 0x10);
                }
                break;
            }
            case 2: {
                i.setFont(game.j.aF[0]);
                i.setClip(0, 0, 240, 320);
                i.setColor(13673568);
                String string = "\u65a9\u5996\u4eba\uff0c\u4ee5\u5343\u5203\u65a9\u6740\u5996\u9b54\uff1b\u4f0f\u9b54\u8005\uff0c\u51ed\u4e07\u5251\u964d\u4f0f\u9b3c\u602a\u3002\u2014\u2014\u534e\u5a31\u4e3a\u60a8\u503e\u529b\u6253\u9020\uff01\u4e8e\u6fc0\u70c8\u7684\u6218\u6597\u4e2d\u65a9\u5c3d\u55bd\u5570\u5c0f\u5996\u3001\u51fb\u6740\u5934\u76ee\u5927\u9b3c\uff0c\u4eb2\u624b\u6253\u9020\u795e\u5175\u5229\u5668\uff01\u51b2\u7834\u547d\u8fd0\u7684\u67b7\u9501\uff0c\u89c1\u8bc1\u7231\u60c5\u4e0e\u4eb2\u60c5\u7684\u529b\u91cf\uff01\u4f17\u591a\u7684\u6b66\u5668\u3001\u8d85\u5927\u7684\u5730\u56fe\u3001\u6d77\u91cf\u7684\u654c\u4eba\u3001\u723d\u5feb\u7684\u6218\u6597\u2014\u2014\u300a\u65a9\u5996\u4f0f\u9b54\u5f55\u300b\u4e3a\u60a8\u5f00\u521b\u52a8\u4f5c\u89d2\u8272\u6e38\u620f\u7684\u65b0\u7bc7\u7ae0\uff01";
                this.a(i, string, 13673568, 10, 30, 20, 220, 0x10 | 4, game.j.aF[0]);
            }
        }
        i.setFont(game.j.aF[0]);
        i.setClip(0, 0, 240, 320);
        i.setColor(13673568);
        i.drawString(n + 1 + "/" + n2, 120, 290, 1 | 0x10);
        if (n > 0) {
            this.e.a(i2.af[0], 49, -290, 27);
        }
        if (n < n2 - 1) {
            this.e.a(i2.af[1], 160, -290, 27);
        }
        this.a(1, imageArray, sArray, sArray2);
    }

    public void d(Image[][] imageArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        String[] stringArray = new String[]{"\u65a9\u5996\u4f0f\u9b54\u5f55", "v 1.0.0", "\u5ba2\u670d\u7535\u8bdd\uff1a", "010-88901665", "\u5185\u5bb9\u63d0\u4f9b:\u534e\u5a31\u65e0\u7ebf"};
        i.setClip(0, 0, 240, 320);
        i.setFont(game.j.aF[0]);
        i.setColor(2761505);
        int n = 20;
        int n2 = 80;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            i.drawString(stringArray[i2], 120, n2 + 20 * i2, 0x10 | 1);
        }
        this.a(1, imageArray, sArray, sArray2);
    }

    public void a(int n, int n2, int n3) {
        String string = "";
        if (n3 == 0) {
            string = "\u4e0e\u6c34\u6676\u5bf9\u8bdd\u53ef\u4ee5\u53cd\u590d\u6311\u6218\u5934\u76ee";
        } else if (n3 == 1) {
            string = "\u4f7f\u7528\u76fe\u9b54\u6cd5\u53ef\u4ee5\u901a\u8fc7\u5c16\u523a";
        }
        i.setFont(game.j.aF[0]);
        i.setClip(0, 0, 240, 320);
        ++this.k;
        if (this.k >= 2) {
            this.k = 0;
        }
        int n4 = this.k == 0 ? 0xFF2A2A : 16761600;
        i.setColor(n4);
        i.drawString(string, n, n2, 0x10 | 1);
    }

    public void showNotify() {
        this.e.t();
    }

    public void hideNotify() {
        this.e.d();
    }

    public int a(int n, int n2) {
        int n3 = 2761505;
        if (n2 == 0) {
            switch (n) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    n3 = 0;
                    break;
                }
                case 5: 
                case 7: 
                case 8: 
                case 9: 
                case 12: 
                case 19: {
                    n3 = 48128;
                    break;
                }
                case 6: 
                case 10: 
                case 11: 
                case 13: 
                case 14: 
                case 20: {
                    n3 = 1179903;
                    break;
                }
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 21: {
                    n3 = 12517596;
                }
            }
        } else if (n2 == 1) {
            switch (n) {
                case 12: 
                case 21: {
                    n3 = 65280;
                    break;
                }
                case 13: 
                case 22: {
                    n3 = 65535;
                    break;
                }
                case 14: 
                case 23: {
                    n3 = 16732120;
                    break;
                }
                case 15: 
                case 24: {
                    n3 = 26367;
                    break;
                }
                case 16: 
                case 25: {
                    n3 = 0xFF9000;
                    break;
                }
                case 17: 
                case 26: {
                    n3 = 16711699;
                    break;
                }
                case 18: 
                case 27: {
                    n3 = 0xFFFF00;
                    break;
                }
                case 19: 
                case 28: {
                    n3 = 0x8877FF;
                    break;
                }
                case 29: 
                case 33: 
                case 37: 
                case 42: 
                case 46: {
                    n3 = 0;
                    break;
                }
                case 31: 
                case 38: 
                case 39: 
                case 43: 
                case 47: 
                case 49: {
                    n3 = 48128;
                    break;
                }
                case 30: 
                case 34: 
                case 35: 
                case 40: 
                case 44: 
                case 48: {
                    n3 = 1179903;
                    break;
                }
                case 32: 
                case 36: 
                case 41: 
                case 45: 
                case 50: {
                    n3 = 12517596;
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
        for (int i2 = 0; i2 < nArrayArray.length; ++i2) {
            graphics.drawString(string, n + nArrayArray[i2][0], n2 + nArrayArray[i2][1], n3);
        }
        graphics.setColor(n5);
        graphics.drawString(string, n, n2, n3);
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
            }
        }
    }

    public void a(Image image, int n, int n2, int n3) {
        i.drawImage(image, n, n2, n3);
    }

    public void a(boolean bl, int n) {
        if (this.e.be[87] >= 0 && this.e.be[87] <= 2) {
            this.a(0xFFFFFF, game.j.aF[0]);
            int n2 = 2;
            String[] stringArray = new String[]{"\u6751\u5e84", "\u4e0b\u6c34\u9053", "\u6b66\u6597\u5385", "\u97f3\u4e50\u5385", "\u793c\u62dc\u5802"};
            int n3 = (stringArray[n].length() + 1) * this.f;
            int n4 = 240 - n3 >> 1;
            int n5 = 106 + this.d + 3;
            int n6 = n4 + this.f / 2;
            int n7 = 106;
            switch (this.e.be[87]) {
                case 0: {
                    if (this.e.be[88] > n3) break;
                    i.fillRect(n4, n5, (int)this.e.be[88], 1);
                    if (bl) {
                        this.e.be[88] = (short)(this.e.be[88] + n2);
                    }
                    if (this.e.be[88] <= n3) break;
                    this.e.be[87] = 1;
                    this.e.be[88] = 0;
                    break;
                }
                case 1: {
                    if (n5 - this.e.be[88] < n7) break;
                    i.fillRect(n4, n5, n3, 1);
                    i.setClip(n4, n5 - (this.e.be[88] + 1), n3, this.e.be[88] + 1);
                    i.drawString(stringArray[n], n6, n5 - (this.e.be[88] + 1), 0x10 | 4);
                    i.drawString(stringArray[n], n6 + (this.e.cm.nextInt() & Integer.MAX_VALUE) % 3 - 1, n5 - (this.e.be[88] + 1) + (this.e.cm.nextInt() & Integer.MAX_VALUE) % 3 - 1, 0x10 | 4);
                    if (bl) {
                        this.e.be[88] = (short)(this.e.be[88] + 1);
                    }
                    if (n5 - this.e.be[88] >= n7) break;
                    this.e.be[87] = 2;
                    this.e.be[88] = 0;
                    break;
                }
                case 2: {
                    if (this.e.be[88] > 30) break;
                    i.fillRect(n4, n5, n3, 1);
                    i.setClip(n4, n7, n3, n5 - n7);
                    i.drawString(stringArray[n], n6, n7, 0x10 | 4);
                    i.drawString(stringArray[n], n6 + (this.e.cm.nextInt() & Integer.MAX_VALUE) % 2, n7 + (this.e.cm.nextInt() & Integer.MAX_VALUE) % 2, 0x10 | 4);
                    if (bl) {
                        this.e.be[88] = (short)(this.e.be[88] + 1);
                    }
                    if (this.e.be[88] < 30) break;
                    this.e.be[87] = 3;
                    this.e.be[88] = 0;
                }
            }
        }
    }

    public void a(Image[][] imageArray, int n, int n2, int n3, i i2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        i.setClip(0, 0, 240, 320);
        i.setFont(game.j.aF[0]);
        i.setColor(2761505);
        int n4 = 20;
        int n5 = 30;
        int n6 = 22;
        int n7 = 22;
        if (n == 6) {
            i.drawString("\u4f60\u9700\u8981\u66f4\u5f3a\u7684\u6b66\u5668\u5417?", n4, n5, 0x10 | 4);
            i.drawString("\u653b\u51fb: " + this.e.at[this.e.be[85]][0] * (100 + this.e.bE[9]) * (100 + 2 * this.e.c(6, 10)) / 10000, n4 + 25 + this.f * 4 + 5, n5 + n6 + 3, 0x10 | 4);
            i.drawString("\u9644\u9b54:", n4, n5 + n6 + n7, 0x10 | 4);
            i.drawString("(\u4f60\u73b0\u5728\u7684\u6b66\u5668\u653b\u51fb:" + this.e.at[this.e.aj[this.e.ar.j][1]][0] * (100 + this.e.bE[this.e.aj[this.e.ar.j][2]]) * (100 + this.e.co[6]) / 10000 + ")", n4, n5 + n6 + 4 * n7, 0x10 | 4);
            i.drawString("\u53ea\u97002\u5143\uff0c\u60a8\u5c31\u53ef\u4ee5\u83b7\u5f97", n4, n5 + 2 * n6 + 4 * n7, 0x10 | 4);
            i.drawString("\u8fd9\u628a\u5f3a\u5927\u7684\u6b66\u5668!", n4, n5 + 3 * n6 + 4 * n7, 0x10 | 4);
            i.drawString("\u8d44\u8d392\u5143/\u6761\uff0c\u4e0d\u542b\u901a\u4fe1\u8d39", n4, n5 + 4 * n6 + 4 * n7, 0x10 | 4);
            this.a(this.e.b[1][0][0][1] + this.e.c(1, 10) + "%", n4 + this.f * 3 + 25, n5 + n6 + n7 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
            this.a(this.e.b[1][0][0][6] + this.e.c(6, 10) + "%", n4 + this.f * 3 + 25, n5 + n6 + 2 * n7 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
            this.a(this.e.b[1][0][0][6] + this.e.c(6, 10) + "%", n4 + this.f * 3 + 25, n5 + n6 + 3 * n7 + 3, 0x10 | 4, 2761505, game.j.aF[0]);
            this.a(imageArray[28], sArray2[28][this.b(this.e.be[85])], n4, 260 - (n5 + n6), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(this.e.b[1][0][1][this.e.be[85]], n4 + 25 + 5, n5 + n6 + 3, 0x10 | 4, this.a((int)this.e.be[85], 0), game.j.aF[0]);
            this.a(imageArray[28], sArray2[28][23], n4 + this.f * 3, 260 - (n5 + n6 + n7), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(imageArray[28], sArray2[28][28], n4 + this.f * 3, 260 - (n5 + n6 + 2 * n7), 1, sArray[28], (byte)1, 0, 0, 28);
            this.a(imageArray[28], sArray2[28][28], n4 + this.f * 3, 260 - (n5 + n6 + 3 * n7), 1, sArray[28], (byte)1, 0, 0, 28);
        } else if (n == 7) {
            String[][] stringArrayArray = new String[][]{{"\u7ec8\u6781\u957f\u67aa\u914d\u65b9:", "[\u96f7\u795e\u56e0\u9640\u7f57]\u914d\u65b9!", "\u6ee1\u7ea7\u653b\u51fb:600", "\u9b54\u6cd5:\u96f7\u7535\u76fe"}, {"\u7ec8\u6781\u957f\u67c4\u914d\u65b9:", "[\u6cf0\u5766\u795e\u4e4b\u77db]\u914d\u65b9!", "\u6ee1\u7ea7\u653b\u51fb:1050", "\u9b54\u6cd5:\u5de8\u4eba"}, {"\u7ec8\u6781\u957f\u97ad\u914d\u65b9:", "[\u8d1d\u8499\u7279\u5723\u97ad]\u914d\u65b9!", "\u6ee1\u7ea7\u653b\u51fb:540", "\u9b54\u6cd5:\u8d85\u91cd\u51fb"}, {"\u7ec8\u6781\u8f7b\u5251\u914d\u65b9:", "[\u7687\u540e\u73ab\u7470\u5251]\u914d\u65b9!", "\u6ee1\u7ea7\u653b\u51fb:660", "\u9b54\u6cd5:\u82b1\u5251\u8f6e"}, {"", "", ""}, {"\u7ec8\u6781\u91cd\u5251\u914d\u65b9:", "\u672b\u65e5\u4e4b\u5203", "\u6ee1\u7ea7\u653b\u51fb:1050", "\u9b54\u6cd5:\u5730\u72f1\u9a6c"}};
            i.drawString("\u6446\u5728\u60a8\u9762\u524d\u7684\u662f\uff1a", n4, n5, 0x10 | 4);
            i.drawString(stringArrayArray[this.e.be[22]][0], n4 + 10, n5 + n6, 0x10 | 4);
            i.setColor(12517596);
            i.drawString(stringArrayArray[this.e.be[22]][1], n4 + 10, n5 + n6 * 2, 0x10 | 4);
            i.setColor(2761505);
            i.drawString(stringArrayArray[this.e.be[22]][2], n4 + 10, n5 + n6 * 3, 0x10 | 4);
            i.drawString(stringArrayArray[this.e.be[22]][3], n4 + 10, n5 + n6 * 4, 0x10 | 4);
            i.drawString("\u53ea\u97002\u5143\u60a8\u5c31\u53ef\u4ee5\u62e5\u6709\u5b83\uff01", n4, n5 + n6 * 5, 0x10 | 4);
            i.drawString("\u8d44\u8d392\u5143/\u6761\uff0c\u4e0d\u542b\u901a\u4fe1\u8d39", n4, n5 + n6 * 6, 0x10 | 4);
            i.drawString("\u5171\u9700\u53d1\u90011\u6761\u77ed\u4fe1\uff0c", n4, n5 + n6 * 7, 0x10 | 4);
            i.drawString("\u611f\u8c22\u652f\u6301\uff0c\u795d\u6e38\u620f\u6109\u5feb\uff01", n4, n5 + n6 * 8, 0x10 | 4);
        } else {
            for (int i3 = 0; i3 < stringArray[n].length; ++i3) {
                i.drawString(stringArray[n][i3], n4, n5 + i3 * n6, 0x10 | 4);
            }
            if (n3 > 0) {
                this.a("\u60a8\u8fd8\u9700\u53d1\u9001" + n3 + "\u6761\u4fe1\u606f", n4, n5 + stringArray[n].length * n6, 0x10 | 4, 0xFF0000, game.j.aF[0]);
            }
            if (n == 1 || n == 3) {
                this.e.a(i2.af[1], 10, -(n5 + n6), 27);
            } else if (n == 2 || n == 4) {
                this.e.a(i2.af[1], 10, -(n5 + n6 + n6), 27);
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
                break;
            }
            case 2: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u8d2d\u4e70\u6210\u529f", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(0, imageArray, sArray, sArray2);
                break;
            }
            case 3: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(27, imageArray, sArray, sArray2);
                this.a("\u8d2d\u4e70\u5931\u8d25", 120, n3, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(0, imageArray, sArray, sArray2);
                break;
            }
            case 4: {
                this.a(i, 2761505, 0, 0, 240, 320);
                this.b(28, imageArray, sArray, sArray2);
                this.a("\u8d2d\u4e70\u6210\u529f", 120, n5, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a("\u60a8\u8fd8\u9700\u53d1\u9001" + n2 + "\u6761\u4fe1\u606f", 120, n5 + n6, 0x10 | 1, 0xFF0000, game.j.aF[0]);
                this.a("\u662f\u5426\u53d1\u9001\uff1f", 120, n5 + n6 * 2, 0x10 | 1, 2761505, game.j.aF[0]);
                this.a(2, imageArray, sArray, sArray2);
            }
        }
    }

    public void a(int n, int n2, int n3, int n4, String string, int n5) {
        i.setClip(n, n2, n3, n4);
        i.setColor(n5);
        i.drawString(string, n + n3 - this.a[0], n2, 0x10 | 4);
        this.a[0] = this.a[0] + 2;
        if (this.a[0] >= this.a[1] + n3) {
            this.a[0] = 0;
        }
    }

    public void f() {
        String string = "";
        this.a[1] = 0;
        if (this.e.aG[0][3] >= this.e.aG[0][2]) {
            string = string + "\u6309*\u952e\u67e5\u770b\u6e38\u620f\u653b\u7565\u3002     ";
            this.a[1] = this.a[1] + this.f * string.length();
        }
        if (this.e.aq[8] == 1) {
            string = string + "\u63090\u952e\u5f00\u542f\u534a\u4ef7\u968f\u8eab\u5546\u5e97\u3002     ";
            this.a[1] = this.a[1] + this.f * string.length();
        }
        this.a(25, 320 - 3 * this.d, 190, 20, string, 0xFF2A2A);
    }

    public void a(Image[][] imageArray, byte[] byArray, i i2, byte by, byte by2, byte[][] byArray2, String[][] stringArray, short[][][] sArray, short[][][][] sArray2) {
        int n;
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        int n2 = 20;
        int n3 = 38;
        int n4 = 20;
        int n5 = 16;
        int n6 = n3 + n4 * 2 + 20;
        int n7 = 22;
        int n8 = 40;
        int n9 = n6 + 60 + 43;
        int n10 = -1;
        int n11 = -1;
        this.a(2761505, game.j.aF[0]);
        i.drawString("\u8bf7\u9009\u62e9\u4f60\u60f3\u7ed9\u5f53\u524d\u6b66\u5668", 120, n3, 0x10 | 1);
        i.drawString("\u9644\u52a0\u7684\u9b54\u6cd5", 120, n3 + n4, 0x10 | 1);
        this.a(imageArray[27], sArray2[27][30], n5 + 25, 260 - (n6 + n7 - 5), 1, sArray[27], (byte)1, 0, 0, 27);
        this.a(imageArray, 207, n6, (int)byArray2[0][0], byArray.length, sArray, sArray2);
        this.e.a(i2.af[2], n5 + 8 - 3, -(n6 + 66), 27);
        this.e.a(i2.af[3], n5 + 8 - 3, -(n6 - 20), 27);
        String string = "";
        for (n = 0; n < 3; ++n) {
            n10 = byArray2[0][0] - 1 + n;
            if (n10 < 0) {
                n10 = byArray.length - 1;
            } else if (n10 >= byArray.length) {
                n10 = 0;
            }
            this.a(imageArray[28], sArray2[28][22 + byArray[n10]], n5, 260 - (n6 + n7 * n), 1, sArray[28], (byte)1, 0, 0, 28);
            string = byArray[n10] == 5 ? stringArray[0][byArray[n10]] + this.e.c(byArray[n10], 10) : stringArray[0][byArray[n10]] + this.e.c(byArray[n10], 10) + "%";
            this.a(string, n5 + 91, n6 + n7 * n + 2 - 3, 0x10 | 1, 2761505, game.j.aF[0]);
        }
        n = this.e.b(this.e.ar.ax, this.a((int)this.e.ar.d, 0), (int)byArray[byArray2[0][0]]);
        this.a("\u9700\u8981\u6d88\u8017\u91d1\u5e01:" + n, n8, n9, 0x10 | 4, this.e.ar.t[0] >= n ? 2761505 : 0xFF0000, game.j.aF[0]);
        this.a("\u6301\u6709\u91d1\u5e01:" + this.e.ar.t[0], n8, n9 + n4, 0x10 | 4, 2761505, game.j.aF[0]);
        this.a("\u63090\u952e\u8d2d\u4e70\u91d1\u5e01", 120, n9 + n4 * 2, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
        this.a("\u63095\u952e\u8fdb\u884c\u9644\u9b54", 120, 320 - this.d, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
        this.a(2, imageArray, sArray, sArray2);
        if (by == 0 && by2 == 1) {
            int n12 = 35;
            int n13 = 70;
            int n14 = 20;
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(29, imageArray, sArray, sArray2);
            String[] stringArray2 = new String[]{"\u60a8\u5982\u679c\u53d6\u6d88\u6b64\u6b21\u9644\u9b54", "\u7684\u673a\u4f1a\uff0c\u90a3\u4e48\u672c\u6b21\u7684", "\u9644\u9b54\u4f4d\u7f6e\u5c31\u4f1a\u6c38\u8fdc\u65e0", "\u6cd5\u4ea7\u751f\u9644\u9b54\u6548\u679c\uff01", "", "\u771f\u7684\u51b3\u5b9a\u4e0d\u8fdb\u884c\u6b64\u6b21", "\u9644\u9b54\u4e86\u5417\uff1f"};
            for (int i3 = 0; i3 < stringArray2.length; ++i3) {
                this.a(stringArray2[i3], n12, n13 + n14 * i3, 0x10 | 4, 0xFFFFFF, game.j.aF[0]);
            }
            this.a(2, imageArray, sArray, sArray2);
        } else if (by == 2) {
            int n15 = 35;
            int n16 = 98;
            int n17 = 20;
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(28, imageArray, sArray, sArray2);
            this.a("\u60a8\u5bf9\u5f53\u524d\u6b66\u5668\u9644\u52a0\u4e86", 120, n16, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(stringArray[10][byArray[byArray2[0][0]]], 120, n16 + n17, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
            String string2 = "";
            string2 = byArray[byArray2[0][0]] == 5 ? stringArray[0][byArray[byArray2[0][0]]] + this.e.c(byArray[byArray2[0][0]], 10) : stringArray[0][byArray[byArray2[0][0]]] + this.e.c(byArray[byArray2[0][0]], 10) + "%";
            this.a(string2, 120, n16 + n17 * 2, 0x10 | 1, 0xFFFFFF, game.j.aF[0]);
            this.a("\u6d88\u8017\u91d1\u5e01" + this.e.b(this.e.ar.ax, this.a((int)this.e.ar.d, 0), (int)byArray[byArray2[0][0]]), 120, n16 + n17 * 3, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a("\u786e\u5b9a\u5417\uff1f", 120, n16 + n17 * 4, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(2, imageArray, sArray, sArray2);
        } else if (by == 3) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a("\u9644\u9b54\u6210\u529f\uff01", 120, 152, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(0, imageArray, sArray, sArray2);
        } else if (by == 4) {
            this.a(i, 2761505, 0, 0, 240, 320);
            this.b(27, imageArray, sArray, sArray2);
            this.a("\u6b66\u5668\u8fbe\u52303,6,9\u7ea7", 120, 137, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a("\u90fd\u53ef\u4ee5\u8fdb\u884c\u9644\u9b54\uff01", 120, 160, 0x10 | 1, 2761505, game.j.aF[0]);
            this.a(0, imageArray, sArray, sArray2);
        }
    }

    public void a(Image[][] imageArray, i i2, byte by, byte[][] byArray, String[][] stringArray, int n, int n2, int n3, short[][][] sArray, short[][][][] sArray2) {
        this.a(imageArray[27], 27, sArray[27], 13, 33, 214, 251);
        this.a(imageArray[27], sArray2[27][34], 0, 240, 1, sArray[27], (byte)1, 0, 0, 27);
        int n4 = 40;
        int n5 = 30;
        int n6 = 20;
        int n7 = 25;
        int n8 = 19;
        this.a(2761505, game.j.aF[0]);
        if (by == 0) {
            String[] stringArray2 = new String[]{"\u5934\u76ee\u4e00\uff1a\u6697\u5f71\u4f2f\u7235", "\u5934\u76ee\u4e8c\uff1a\u8d1d\u5965\u6b66\u592b", "\u5934\u76ee\u4e09\uff1a\u97f3\u4e50\u5bb6", "\u5934\u76ee\u56db\uff1a\u6b7b\u795e", "\u5934\u76ee\u4e94\uff1a\u9b45\u9b54", "\u5934\u76ee\u516d\uff1a\u4f2f\u7235"};
            i.drawString("\u8bf7\u9009\u62e9\u67e5\u770b\u7684\u5934\u76ee", 120, n5, 0x10 | 1);
            i.drawString("28\u952e\u79fb\u52a8,5\u952e\u67e5\u770b", 120, n5 + (stringArray2.length + 3) * n6, 0x10 | 1);
            for (int i3 = 0; i3 < stringArray2.length; ++i3) {
                i.drawString(stringArray2[i3], n4 + 25, n5 + (i3 + 2) * n6, 0x10 | 4);
            }
            this.e.a(i2.af[1], 10, -(n5 + (byArray[0][0] + 2) * n6), 27);
            this.a(2, imageArray, sArray, sArray2);
        } else if (by == 1) {
            for (int i4 = n3 * n; i4 < (stringArray[byArray[0][0]].length > n3 * (n + 1) ? n3 * (n + 1) : stringArray[byArray[0][0]].length); ++i4) {
                i.drawString(stringArray[byArray[0][0]][i4], n7, n5 + (i4 - n3 * n) * n8, 0x10 | 4);
            }
            this.a(0xFFFFFF, game.j.aF[0]);
            i.drawString(n + 1 + "/" + n2, 120, 320 - this.d, 1 | 0x10);
            if (n > 0) {
                this.e.a(i2.af[0], 69, -(320 - this.d), 27);
            }
            if (n < n2 - 1) {
                this.e.a(i2.af[1], 140, -(320 - this.d), 27);
            }
            this.a(1, imageArray, sArray, sArray2);
        }
    }
}


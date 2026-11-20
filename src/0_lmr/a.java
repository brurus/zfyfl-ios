/*
 * Decompiled with CFR 0.152.
 */
import com.cwa.gamelib.b;
import com.cwa.gamelib.c;
import com.cwa.gamelib.d;
import com.cwa.gamelib.f;
import com.cwa.gamelib.g;
import com.cwa.gamelib.i;
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class a
extends FullCanvas
implements b,
com.cwa.gamelib.a,
Runnable {
    public int c = com.cwa.gamelib.b.aC[0].getHeight();
    public int m = 13673568;
    public c d;
    public GameMIDlet y;
    public boolean j;
    public static Graphics k;
    public int[] o = new int[20];
    protected Image[] A = new Image[3];
    int u = 0;
    byte z = 0;
    byte v = 0;
    byte w = 0;
    byte[] e = new byte[]{0, 1};
    int f = 0;
    int t = 2;
    int s = 2;
    int i = 1383467;
    int b = 470893;
    int a = 8872232;
    int r = 0;
    int l = 0;

    public a(GameMIDlet gameMIDlet) {
        this.y = gameMIDlet;
        this.d = new c(this);
        this.c();
    }

    private void a(int n, Image image, int n2, int n3, int n4, short[][] sArray) {
        int n5 = n;
        int n6 = 0;
        int n7 = 6;
        int n8 = 0;
        while (n5 > 0) {
            n5 /= 10;
            ++n8;
        }
        n5 = n;
        for (int j = 0; j < n8; ++j) {
            n6 = n5 % 10;
            gameutils.a.a(image, sArray[n6][1], sArray[n6][2], sArray[n6][3], sArray[n6][4], n2 + n8 * n7 - j * n7, n3, n4, 0, k);
            n5 /= 10;
        }
    }

    public void run() {
        try {
            while (!this.j) {
                long l = this.e();
                if (!this.d.l && ++this.u >= 4) {
                    this.u = 0;
                }
                if (this.d.aV == 0 && !this.d.l) {
                    this.e[0] = (byte)(this.e[0] + 1);
                    if (this.e[0] > this.e[1]) {
                        this.e[0] = 0;
                    }
                } else {
                    this.e[0] = 0;
                }
                this.d.b();
                this.repaint();
                this.serviceRepaints();
                long l2 = this.e();
                if (l2 - l >= 80L) continue;
                Thread.sleep(80L - (l2 - l));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.y.destroyApp(true);
    }

    public void a() {
        this.j = true;
    }

    public void a(Image[][][][] imageArray, short[][][] sArray, int n, int n2, int n3) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 16, 0}, {6, 40, 16, 0}, {6, 60, 16, 0}, {6, 80, 16, 0}, {6, 100, 16, 0}, {6, 120, 16, 0}, {6, 140, 16, 0}, {6, 160, 16, 0}, {6, 180, 16, 0}, {19, 200, 16, 4}, {15, 217, 54, 0}, {15, 217, 74, 0}, {15, 217, 94, 0}, {15, 217, 114, 0}, {15, 217, 134, 0}, {15, 217, 154, 0}, {15, 217, 174, 0}, {19, 200, 276, 2}, {15, 217, 256, 0}, {15, 217, 236, 0}, {15, 217, 194, 0}, {15, 217, 214, 0}, {15, 217, 227, 0}, {19, 20, 276, 6}, {7, 180, 293, 0}, {7, 160, 293, 0}, {7, 140, 293, 0}, {7, 120, 293, 0}, {7, 60, 293, 0}, {7, 100, 293, 0}, {7, 80, 293, 0}, {7, 40, 293, 0}, {16, 20, 256, 0}, {16, 20, 236, 0}, {16, 20, 216, 0}, {16, 20, 196, 0}, {16, 20, 176, 0}, {16, 20, 156, 0}, {16, 20, 136, 0}, {16, 20, 116, 0}, {16, 20, 96, 0}, {16, 20, 76, 0}, {16, 20, 56, 0}, {16, 20, 36, 0}, {15, 217, 35, 0}}, new int[][]{{23, 53, 75, 0}, {4, 58, 79, 0}, {23, 81, 76, 0}, {6, 86, 80, 0}, {23, 53, 107, 0}, {2, 58, 111, 0}, {23, 53, 137, 0}, {8, 58, 140, 0}, {23, 53, 166, 0}, {1, 60, 169, 0}, {23, 81, 166, 0}, {3, 86, 169, 0}, {23, 53, 196, 0}, {5, 58, 199, 0}, {23, 53, 226, 0}, {0, 58, 229, 0}}, new int[][]{{41, 1, 1, 0}, {80, 143, 1, 0}}};
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        k.setColor(this.m);
        int n4 = 0;
        switch (n) {
            case 1: {
                String[] stringArray = new String[]{"\u7edd\u4e0d\u5bb9\u9519\u8fc7\u7684\u534e\u5a31\u89d2", "\u8272\u626e\u6f14\u52a8\u4f5c\u6781\u54c1\uff01\u4e94", "\u5341\u5c0f\u65f6\u7684\u6e38\u620f\u957f\u5ea6\uff0c", "\u626e\u6f14\u5438\u8840\u9b3c\u730e\u4eba\uff0c\u548c", "\u4e0a\u5343\u9b54\u602a\u8fdb\u884c\u8840\u8165\u6218", "\u6597\uff0c\u7528\u6389\u843d\u5b9d\u77f3\u6253\u9020", "\u6781\u54c1\u88c5\u5907\u548c\u6b66\u5668\uff0c\u83b7", "\u5f97\u53d8\u8eab\u7b49\u5404\u79cd\u80fd\u529b\uff0c", "\u5b8c\u5168\u5f00\u653e\u7684\u5347\u7ea7\u4e0a\u9650\uff0c", "\u70ed\u8840\u6218\u6597\u6b63\u5728\u547c\u5524\u4f60!"};
                k.setClip(0, 0, 240, 320);
                k.setColor(this.m);
                k.setFont(com.cwa.gamelib.b.aC[0]);
                int n5 = 40;
                k.drawString("\u5e2e  \u52a9", 120, 20, 1 | 0x10);
                for (int j = 0; j < stringArray.length; ++j) {
                    k.drawString(stringArray[j], 120, n5 + 18 * j, 0x10 | 1);
                }
                break;
            }
            case 2: {
                this.a(imageArray[19], nArrayArray[2], 0, 0, sArray[19]);
                gameutils.a.a(imageArray[26][sArray[26][n4][0]][0][0], sArray[26][n4][1], sArray[26][n4][2], sArray[26][n4][3], sArray[26][n4][4], 160, 18, 4 | 0x10, 0, k);
                k.setColor(0xFF0000);
                k.fillRect(58, 10, 77, 3);
                k.setColor(this.m);
                k.fillRect(58, 18, 77, 3);
                k.setColor(this.m);
                k.drawLine(13, 37, 13, 237);
                k.drawLine(60, 20, 60, 170);
                k.drawLine(116, 10, 116, 160);
                k.drawLine(185, 37, 185, 237);
                k.drawString("\u5934\u50cf", 13, 237, 4 | 0x10);
                k.drawString("\u7ecf\u9a8c\u503c", 60, 170, 1 | 0x10);
                k.drawString("\u751f\u547d\u503c", 116, 160, 1 | 0x10);
                k.drawString("\u573a\u666f\u540d\u79f0", 185, 237, 1 | 0x10);
                break;
            }
            case 3: {
                k.drawString("\u5e2e  \u52a9", 120, 20, 1 | 0x10);
                this.a(imageArray[20], nArrayArray[1], 0, 0, sArray[20]);
                k.setClip(0, 0, 240, 320);
                k.setColor(this.m);
                k.drawString("\u5de6\u53f3\u79fb\u52a8", 110, 76, 4 | 0x10);
                k.drawString("/", 72, 76, 4 | 0x10);
                k.drawString("\u8df3\u8dc3", 110, 108, 4 | 0x10);
                k.drawString("\u4e0b\u8e72", 110, 137, 4 | 0x10);
                k.drawString("\u67e5\u770b\u5730\u56fe", 110, 167, 4 | 0x10);
                k.drawString("/", 72, 167, 4 | 0x10);
                k.drawString("\u653b\u51fb", 110, 197, 4 | 0x10);
                k.drawString("\u8d2d\u4e70\u83dc\u5355", 110, 227, 4 | 0x10);
            }
        }
        k.setClip(0, 0, 240, 320);
        k.drawString(n + "/" + n2, 120, 320, 1 | 0x20);
        if (n > 1) {
            gameutils.a.a(imageArray[24][sArray[24][10][0]][0][0], sArray[24][10][1], sArray[24][10][2], sArray[24][10][3], sArray[24][10][4], 1, 160, 4 | 2, 3, k);
        }
        if (n < n2) {
            gameutils.a.a(imageArray[24][sArray[24][10][0]][0][0], sArray[24][10][1], sArray[24][10][2], sArray[24][10][3], sArray[24][10][4], 239, 160, 8 | 2, 1, k);
        }
        this.a(imageArray[24], 2, sArray[24]);
    }

    public void a(Image[][][] imageArray, byte[] byArray, g g2, int n, short[][] sArray) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 16, 0}, {6, 40, 16, 0}, {6, 60, 16, 0}, {6, 80, 16, 0}, {6, 100, 16, 0}, {6, 120, 16, 0}, {6, 140, 16, 0}, {6, 160, 16, 0}, {6, 180, 16, 0}, {19, 200, 16, 4}, {15, 217, 54, 0}, {15, 217, 74, 0}, {15, 217, 94, 0}, {15, 217, 114, 0}, {15, 217, 134, 0}, {15, 217, 154, 0}, {15, 217, 174, 0}, {19, 200, 276, 2}, {15, 217, 256, 0}, {15, 217, 236, 0}, {15, 217, 194, 0}, {15, 217, 214, 0}, {15, 217, 227, 0}, {19, 20, 276, 6}, {7, 180, 293, 0}, {7, 160, 293, 0}, {7, 140, 293, 0}, {7, 120, 293, 0}, {7, 60, 293, 0}, {7, 100, 293, 0}, {7, 80, 293, 0}, {7, 40, 293, 0}, {16, 20, 256, 0}, {16, 20, 236, 0}, {16, 20, 216, 0}, {16, 20, 196, 0}, {16, 20, 176, 0}, {16, 20, 156, 0}, {16, 20, 136, 0}, {16, 20, 116, 0}, {16, 20, 96, 0}, {16, 20, 76, 0}, {16, 20, 56, 0}, {16, 20, 36, 0}, {15, 217, 35, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 0, 0, sArray);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        k.setColor(this.m);
        int n2 = 46;
        int n3 = 5;
        n3 = com.cwa.gamelib.b.aC[0].stringWidth("\u80cc\u666f\u97f3\u4e50 : ");
        k.drawString("\u8bbe\u7f6e\u9009\u9879", 120, 20, 1 | 0x10);
        k.drawString("\u80cc\u666f\u97f3\u4e50 : ", n2, 150, 4 | 0x10);
        this.a(n2 + n3, 150, this.m, this.m, (int)g.a((byte)1), 5);
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, 2, sArray);
    }

    public void a(String string, int n, int n2, int n3, Graphics graphics, Font font, int n4, int n5) {
        graphics.setFont(font);
        int[][] nArrayArray = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int n6 = graphics.getColor();
        graphics.setColor(n4);
        for (int j = 0; j < nArrayArray.length; ++j) {
            graphics.drawString(string, n + nArrayArray[j][0], n2 + nArrayArray[j][1], n3);
        }
        graphics.setColor(n5);
        graphics.drawString(string, n, n2, n3);
        graphics.setColor(n6);
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = 4;
        int n9 = 2;
        k.setColor(n4);
        for (n7 = 0; n7 < n6; ++n7) {
            k.drawRect(n + n7 * (n8 + 1), n2 + (n6 - n7) * n9, n8, n7 * n9 + n9);
        }
        k.setColor(n3);
        for (n7 = 0; n7 <= n5; ++n7) {
            k.fillRect(n + n7 * (n8 + 1), n2 + (n6 - n7) * n9, n8, n7 * n9 + n9);
        }
    }

    public void e(Image[][][] imageArray, short[][] sArray) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 16, 0}, {6, 40, 16, 0}, {6, 60, 16, 0}, {6, 80, 16, 0}, {6, 100, 16, 0}, {6, 120, 16, 0}, {6, 140, 16, 0}, {6, 160, 16, 0}, {6, 180, 16, 0}, {19, 200, 16, 4}, {15, 217, 54, 0}, {15, 217, 74, 0}, {15, 217, 94, 0}, {15, 217, 114, 0}, {15, 217, 134, 0}, {15, 217, 154, 0}, {15, 217, 174, 0}, {19, 200, 276, 2}, {15, 217, 256, 0}, {15, 217, 236, 0}, {15, 217, 194, 0}, {15, 217, 214, 0}, {15, 217, 227, 0}, {19, 20, 276, 6}, {7, 180, 293, 0}, {7, 160, 293, 0}, {7, 140, 293, 0}, {7, 120, 293, 0}, {7, 60, 293, 0}, {7, 100, 293, 0}, {7, 80, 293, 0}, {7, 40, 293, 0}, {16, 20, 256, 0}, {16, 20, 236, 0}, {16, 20, 216, 0}, {16, 20, 196, 0}, {16, 20, 176, 0}, {16, 20, 156, 0}, {16, 20, 136, 0}, {16, 20, 116, 0}, {16, 20, 96, 0}, {16, 20, 76, 0}, {16, 20, 56, 0}, {16, 20, 36, 0}, {15, 217, 35, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 0, 0, sArray);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setColor(this.m);
        k.drawString("\u662f\u5426\u5f00\u542f\u58f0\u97f3?", 120, 160, 1 | 0x10);
        k.drawString("\u662f", 35, 285, 4 | 0x20);
        k.drawString("\u5426", 205, 285, 8 | 0x20);
    }

    public void paint(Graphics graphics) {
        if (graphics != null) {
            k = graphics;
        }
        if (k != null) {
            k.setColor(0);
            k.fillRect(0, 0, 240, 320);
            this.d.p();
        }
    }

    public void a(Image[][][] imageArray, int n, short[][] sArray) {
        k.setClip(0, 0, 240, 320);
        if (n == 0 || n == 1) {
            gameutils.a.a(imageArray[sArray[21][0]][0][0], sArray[21][1], sArray[21][2], sArray[21][3], sArray[21][4], 0, 319, 4 | 0x20, 0, k);
        }
        if (n == 0 || n == 2) {
            gameutils.a.a(imageArray[sArray[20][0]][0][0], sArray[20][1], sArray[20][2], sArray[20][3], sArray[20][4], 240 - sArray[20][3], 319, 4 | 0x20, 0, k);
        }
    }

    public void a(Image[][][] imageArray, byte[][] byArray, byte[] byArray2, byte[] byArray3, int n, int n2, byte by, short[] sArray, short[][] sArray2) {
        int n3;
        int n4;
        int n5;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 99, 0}, {6, 40, 99, 0}, {6, 84, 101, 0}, {14, 60, 99, 0}, {6, 136, 101, 0}, {6, 171, 101, 0}, {13, 104, 101, 0}, {6, 64, 101, 0}, {6, 107, 101, 0}, {13, 147, 101, 0}, {6, 127, 101, 0}, {6, 151, 101, 0}, {19, 200, 118, 4}, {13, 191, 101, 0}, {16, 20, 116, 0}, {16, 20, 136, 0}, {16, 20, 156, 0}, {16, 20, 176, 0}, {19, 20, 184, 6}, {7, 40, 201, 0}, {7, 60, 201, 0}, {7, 80, 201, 0}, {7, 100, 201, 0}, {7, 120, 201, 0}, {7, 140, 201, 0}, {7, 160, 201, 0}, {7, 180, 201, 0}, {19, 200, 184, 2}, {15, 217, 138, 0}, {15, 217, 158, 0}, {15, 217, 172, 0}, {6, 184, 118, 0}, {6, 164, 118, 0}, {6, 144, 118, 0}, {6, 124, 118, 0}, {6, 104, 118, 0}, {6, 84, 118, 0}, {6, 71, 118, 0}, {7, 71, 118, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 1, 1, sArray2);
        k.setColor(this.m);
        this.a(30, 135, imageArray, byArray, byArray2, byArray3, n, n2, by, sArray, sArray2);
        k.setColor(this.m);
        int n6 = 225;
        if (sArray[byArray2[byArray3[2]] * 2] > 0) {
            n5 = 0;
            n4 = 0;
            int n7 = 1;
            for (n3 = 0; n3 < 2; ++n3) {
                if ((byArray[byArray2[byArray3[2]]][n3 * 2] - 10) % 5 >= 2) {
                    int n8 = com.cwa.gamelib.b.h[1][3][byArray[byArray2[byArray3[2]]][n3 * 2]].length - 1;
                    k.drawString(com.cwa.gamelib.b.h[1][3][byArray[byArray2[byArray3[2]]][n3 * 2]][n8], 25, n6 + n7 * this.c, 4 | 0x10);
                    ++n7;
                    continue;
                }
                if ((byArray[byArray2[byArray3[2]]][n3 * 2] - 10) % 5 == 0) {
                    n5 = 0;
                    n5 = com.cwa.gamelib.b.aM[byArray[byArray2[byArray3[2]]][n3 * 2] - 10][0];
                }
                if ((byArray[byArray2[byArray3[2]]][n3 * 2] - 10) % 5 != 1) continue;
                n4 = 0;
                n4 = com.cwa.gamelib.b.aM[byArray[byArray2[byArray3[2]]][n3 * 2] - 10][0];
            }
            k.drawString("\u653b\u51fb" + com.cwa.gamelib.b.bC[byArray2[byArray3[2]]] + "[" + n5 + "]", 25, n6, 4 | 0x10);
            k.drawString("\u9632\u5fa1" + com.cwa.gamelib.b.bk[byArray2[byArray3[2]]] + "[" + n4 + "]", 120, n6, 4 | 0x10);
        } else {
            k.drawString("\u672a\u83b7\u5f97\u8be5\u7269\u54c1", 25, n6, 4 | 0x10);
        }
        n5 = byArray2.length - 1;
        n4 = 190;
        n3 = 129;
        this.a(imageArray, sArray2, n4, n3, (int)byArray3[2], 65, n5);
        this.a(imageArray, 0, sArray2);
    }

    private void a(int n, int n2, Image[][][] imageArray, byte[][] byArray, byte[] byArray2, byte[] byArray3, int n3, int n4, byte by, short[] sArray, short[][] sArray2) {
        int[] nArray = new int[]{40, 39, 38, 37, 36, 35, 34, 33, 37};
        int[] nArray2 = new int[]{42, 52};
        byte by2 = -1;
        for (int j = 0; j < n4; ++j) {
            by2 = Math.abs((j - n3 + byArray3[2] + byArray2.length) % byArray2.length);
            if (by == byArray2[by2]) {
                k.setColor(0xFFFFFF);
            } else {
                k.setColor(this.m);
            }
            if (sArray[byArray2[by2] * 2] > 0) {
                k.drawString(com.cwa.gamelib.b.S[byArray2[by2]], n + 40 - 10, n2 + 1 + j * 18, 4 | 0x10);
                gameutils.a.a(imageArray[sArray2[nArray[byArray2[by2]]][0]][0][0], sArray2[nArray[byArray2[by2]]][1], sArray2[nArray[byArray2[by2]]][2], sArray2[nArray[byArray2[by2]]][3], sArray2[nArray[byArray2[by2]]][4], n + 12 - 10, n2 + j * 18, 4 | 0x10, 0, k);
                for (int k = 0; k < 2; ++k) {
                    this.a(n + 96 + k * 20, n2 + j * 18, imageArray, (int)byArray[byArray2[by2]][k * 2], this.u, sArray2);
                }
            } else {
                k.drawString("\u672a\u77e5", n + 40 - 10, n2 + j * 18, 4 | 0x10);
                gameutils.a.a(imageArray[sArray2[52][0]][0][0], sArray2[52][1], sArray2[52][2], sArray2[52][3], sArray2[52][4], n + 12 - 10, n2 + j * 18, 4 | 0x10, 0, k);
            }
            if (by2 != byArray3[2]) continue;
            gameutils.a.a(imageArray[sArray2[nArray2[this.o[4] / 2]][0]][0][0], sArray2[nArray2[this.o[4] / 2]][1], sArray2[nArray2[this.o[4] / 2]][2], sArray2[nArray2[this.o[4] / 2]][3], sArray2[nArray2[this.o[4] / 2]][4], n + 12 - 10, n2 + j * 18, 4 | 0x10, 0, k);
        }
    }

    private void a(Image[][][] imageArray, short[][] sArray, int n, int n2, int n3, int n4, int n5) {
        int n6 = n4 - sArray[10][4] * 2;
        int n7 = n6 / sArray[9][4];
        int n8 = 0;
        gameutils.a.a(imageArray[sArray[10][0]][0][0], sArray[10][1], sArray[10][2], sArray[10][3], sArray[10][4], n + 4, n2, 4 | 0x10, 0, k);
        for (int j = 0; j < n7 + 1; ++j) {
            n8 = n2 + sArray[10][4] + j * sArray[9][4];
            if (j == n7 && (n7 + 1) * sArray[9][4] > n6) {
                n8 -= (n7 + 1) * sArray[9][4] - n6;
            }
            gameutils.a.a(imageArray[sArray[9][0]][0][0], sArray[9][1], sArray[9][2], sArray[9][3], sArray[9][4], n + 9, n8, 4 | 0x10, 0, k);
        }
        gameutils.a.a(imageArray[sArray[10][0]][0][0], sArray[10][1], sArray[10][2], sArray[10][3], sArray[10][4], n + 4, n2 + n4 - sArray[10][4], 4 | 0x10, 2, k);
        gameutils.a.a(imageArray[sArray[8][0]][0][0], sArray[8][1], sArray[8][2], sArray[8][3], sArray[8][4], n, n2 + 5 + n3 * n6 / n5, 4 | 0x10, 0, k);
    }

    public void a(Image[][][] imageArray, int n, int n2, int n3, int n4, short[][] sArray) {
        int[] nArray = new int[]{-1, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 2, 3, 4, 5};
        int[] nArray2 = new int[]{0, 0, 4};
        k.setClip(0, 0, 240, 320);
        if (nArray[n] >= 0 && nArray[n] >= 0) {
            gameutils.a.a(imageArray[sArray[nArray[n]][0]][0][0], sArray[nArray[n]][1], sArray[nArray[n]][2], sArray[nArray[n]][3], sArray[nArray[n]][4], n3 + 0, n4 + 43, 4 | 0x10, nArray2[n2], k);
        }
    }

    public void a(Image image, int n, short[][] sArray, int n2, int n3, int n4, int n5) {
        short s = sArray[n][3];
        short s2 = sArray[n][4];
        k.setClip(n2, n3, n4, n5);
        for (int j = 0; j <= n5 / s2; ++j) {
            for (int k = 0; k <= n4 / s; ++k) {
                gameutils.a.a(image, sArray[n][1], sArray[n][2], sArray[n][3], sArray[n][4], n2 + k * s, n3 + j * s2, 4 | 0x10, 0, a.k);
            }
        }
    }

    public void b(int n, int n2, Image[][][] imageArray, byte[][] byArray, byte[] byArray2, byte[] byArray3, int n3, int n4, byte by, short[] sArray, short[][] sArray2) {
        int[] nArray = new int[]{40, 39, 38, 37, 36, 35, 34, 33};
        int[] nArray2 = new int[]{31, 30, 29, 28, 27, 31, 30, 29, 28, 27, 31, 30, 29, 28, 27, 32, 32};
        int[] nArray3 = new int[]{42, 52};
        byte by2 = -1;
        int n5 = -1;
        for (int j = 0; j < n4; ++j) {
            by2 = Math.abs((j - n3 + byArray3[2] + byArray2.length) % byArray2.length);
            if (by == byArray2[by2]) {
                k.setColor(0xFFFFFF);
            } else {
                k.setColor(this.m);
            }
            if (sArray[byArray2[by2]] > 0) {
                k.drawString(com.cwa.gamelib.b.ch[byArray2[by2]], n + 28, n2 + 1 + j * this.c, 4 | 0x10);
                this.a(n, n2 + j * this.c, imageArray, (int)byArray2[by2], this.u, sArray2);
            } else {
                k.drawString("\u672a\u77e5", n + 28, n2 + j * this.c, 4 | 0x10);
                gameutils.a.a(imageArray[sArray2[52][0]][0][0], sArray2[52][1], sArray2[52][2], sArray2[52][3], sArray2[52][4], n, n2 + j * this.c, 4 | 0x10, 0, k);
            }
            if (by2 != byArray3[2]) continue;
            n5 = nArray3[this.o[4] / 2];
            gameutils.a.a(imageArray[sArray2[n5][0]][0][0], sArray2[n5][1], sArray2[n5][2], sArray2[n5][3], sArray2[n5][4], n, n2 + j * this.c, 4 | 0x10, 0, k);
        }
    }

    public void a(Image[][][] imageArray, i i2, short[][] sArray) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        gameutils.a.a(imageArray[sArray[41][0]][0][0], sArray[41][1], sArray[41][2], sArray[41][3], sArray[41][4], 0, 0, 4 | 0x10, 0, k);
        gameutils.a.a(imageArray[sArray[80][0]][0][0], sArray[80][1], sArray[80][2], sArray[80][3], sArray[80][4], 142, 0, 4 | 0x10, 0, k);
        k.setColor(0xFF0000);
        k.fillRect(57, 9, 78 * i2.af[0] / i2.af[1], 3);
        k.setColor(this.m);
        k.fillRect(57, 16, 78 * i2.cd[0] / i2.cd[1], 3);
        if (this.d.i.length > 0 && this.d.i[0].aR >= 14 && this.d.i[0].aR <= 18 && this.d.bh[69] > 0) {
            k.setColor(4849736);
            k.fillRect(57, 308, this.d.i[0].af[0] * 126 / this.d.i[0].af[1], 4);
            k.setColor(10354781);
            k.drawLine(57, 310, 57 + this.d.i[0].af[0] * 126 / this.d.i[0].af[1], 310);
            k.setColor(0xFF00FF);
            k.fillRect(57, 309, this.d.i[0].af[0] * 126 / this.d.i[0].af[1], 2);
        } else if (this.d.ah[23] != 3 && this.d.ah[99] != 1) {
            this.a(this.d.aU);
        }
        gameutils.a.a(imageArray[sArray[79][0]][0][0], sArray[79][1], sArray[79][2], sArray[79][3], sArray[79][4], 0, 301, 4 | 0x10, 0, k);
        gameutils.a.a(imageArray[sArray[79][0]][0][0], sArray[79][1], sArray[79][2], sArray[79][3], sArray[79][4], 120, 301, 4 | 0x10, 4, k);
    }

    public void a(Image[][][] imageArray, Image[][][] imageArray2, byte[][] byArray, byte[] byArray2, byte[][] byArray3, int n, int n2, int n3, byte by, short[] sArray, short[][] sArray2) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        this.a(imageArray[0][0][0], 3, sArray2, 0, 0, 240, 320);
        this.a(imageArray, sArray2);
        String[] stringArray = new String[]{"\u9644 \u9b54", "\u7cbe \u70bc", "\u5236 \u9020"};
        int[] nArray = new int[]{26, 85, 149};
        k.setColor(this.m);
        k.setClip(0, 0, 240, 320);
        for (int j = 0; j < stringArray.length; ++j) {
            k.drawString(stringArray[j], nArray[j], 19, 4 | 0x10);
        }
        this.a(imageArray, 0, sArray2);
    }

    public void a(Image[][][] imageArray, Image[][][] imageArray2, byte[][] byArray, byte[] byArray2, byte[] byArray3, byte[][] byArray4, int n, int n2, int n3, byte by, short[] sArray, short[] sArray2, short[] sArray3, short[][] sArray4) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 15, 0}, {6, 40, 15, 0}, {6, 60, 15, 0}, {14, 80, 15, 0}, {6, 99, 34, 0}, {6, 84, 17, 0}, {6, 104, 17, 0}, {6, 124, 17, 0}, {6, 80, 34, 0}, {6, 151, 34, 0}, {13, 144, 17, 0}, {6, 171, 34, 0}, {6, 191, 34, 0}, {19, 200, 34, 4}, {15, 217, 54, 0}, {15, 217, 74, 0}, {15, 217, 94, 0}, {15, 217, 114, 0}, {15, 217, 134, 0}, {15, 217, 154, 0}, {15, 217, 174, 0}, {19, 200, 276, 2}, {15, 217, 256, 0}, {15, 217, 236, 0}, {15, 217, 194, 0}, {15, 217, 214, 0}, {15, 217, 227, 0}, {19, 20, 276, 6}, {7, 180, 293, 0}, {7, 160, 293, 0}, {7, 140, 293, 0}, {7, 120, 293, 0}, {7, 60, 293, 0}, {7, 100, 293, 0}, {7, 80, 293, 0}, {7, 40, 293, 0}, {16, 20, 256, 0}, {16, 20, 236, 0}, {16, 20, 216, 0}, {16, 20, 196, 0}, {16, 20, 176, 0}, {16, 20, 156, 0}, {16, 20, 136, 0}, {16, 20, 116, 0}, {16, 20, 96, 0}, {16, 20, 76, 0}, {16, 20, 56, 0}, {16, 20, 36, 0}, {6, 119, 34, 0}, {6, 147, 17, 0}, {6, 167, 17, 0}, {6, 187, 17, 0}, {13, 207, 17, 0}, {6, 136, 34, 0}, {16, 20, 29, 0}}};
        int[] nArray = new int[]{48, 50, 49, 46, 47, 45, 44, 43};
        int[] nArray2 = new int[]{42, 52};
        this.a(imageArray, nArrayArray[0], 0, 0, sArray4);
        int n4 = 178;
        int n5 = 53;
        int n6 = byArray2.length - 1;
        int n7 = -1;
        switch (n3) {
            case 0: {
                n5 = 65;
                k.drawString("\u9009\u62e9\u6b66\u5668:", 30, 42, 4 | 0x10);
                this.a(35, 68, imageArray, byArray, byArray2, byArray4[0], n, n2, byArray4[0][0], sArray, sArray4);
                this.a(imageArray, sArray4, n4, n5, (int)byArray4[0][2], 60, n6);
                k.setColor(this.m);
                int n8 = 175;
                int n9 = 0;
                int n10 = 0;
                k.drawString("\u8bf4\u660e:", 30, 159, 4 | 0x10);
                int n11 = 1;
                for (int j = 0; j < 2; ++j) {
                    if ((byArray[byArray2[byArray4[0][2]]][j * 2] - 10) % 5 >= 2) {
                        int n12 = com.cwa.gamelib.b.h[1][3][byArray[byArray2[byArray4[0][2]]][j * 2]].length - 1;
                        k.drawString(com.cwa.gamelib.b.h[1][3][byArray[byArray2[byArray4[0][2]]][j * 2]][n12], 30, n8 + 2 + n11 * this.c, 4 | 0x10);
                        ++n11;
                        continue;
                    }
                    if ((byArray[byArray2[byArray4[0][2]]][j * 2] - 10) % 5 == 0) {
                        n9 = 0;
                        n9 = com.cwa.gamelib.b.aM[byArray[byArray2[byArray4[0][2]]][j * 2] - 10][0];
                    }
                    if ((byArray[byArray2[byArray4[0][2]]][j * 2] - 10) % 5 != 1) continue;
                    n10 = 0;
                    n10 = com.cwa.gamelib.b.aM[byArray[byArray2[byArray4[0][2]]][j * 2] - 10][0];
                }
                if (sArray[byArray2[byArray4[0][2]] * 2] > 0) {
                    k.drawString("\u653b\u51fb" + com.cwa.gamelib.b.bC[byArray2[byArray4[0][2]]] + "[" + n9 + "]", 30, n8 + 5, 4 | 0x10);
                    k.drawString("\u9632\u5fa1[" + n10 + "]", 123, n8 + 5, 4 | 0x10);
                    break;
                }
                k.drawString("\u672a\u83b7\u5f97\u8be5\u7269\u54c1", 30, n8 + 5, 4 | 0x10);
                break;
            }
            case 1: {
                int n13;
                k.drawString("\u9009\u62e9\u4f4d\u7f6e:", 30, 42, 4 | 0x10);
                this.a(35, 68, imageArray, byArray, byArray2, byArray4[0], 0, 1, byArray4[0][0], sArray, sArray4);
                k.setColor(this.m);
                for (n13 = 0; n13 < 2; ++n13) {
                    this.a(40, 75 + n13 * this.c + 14, imageArray, (int)byArray[byArray4[0][0]][n13 * 2], this.u, sArray4);
                    if (byArray[byArray4[0][0]][n13 * 2] >= 0) {
                        k.drawString(com.cwa.gamelib.b.ch[byArray[byArray4[0][0]][n13 * 2]], 75, 75 + n13 * this.c + 14, 4 | 0x10);
                        continue;
                    }
                    k.drawString("\u65e0\u9b54\u6cd5", 75, 75 + n13 * this.c + 14, 4 | 0x10);
                }
                n7 = nArray2[this.o[4] / 2];
                gameutils.a.a(imageArray[sArray4[n7][0]][0][0], sArray4[n7][1], sArray4[n7][2], sArray4[n7][3], sArray4[n7][4], 40, 75 + (byArray4[1][0] >> 1) * this.c + 14, 4 | 0x10, 0, k);
                k.drawString("\u6548\u679c:", 30, 160, 4 | 0x10);
                if (byArray[byArray4[0][0]][byArray4[1][2] * 2] >= 0) {
                    for (n13 = 1; n13 < com.cwa.gamelib.b.h[1][3][byArray[byArray4[0][0]][byArray4[1][2] * 2]].length; ++n13) {
                        k.drawString(com.cwa.gamelib.b.h[1][3][byArray[byArray4[0][0]][byArray4[1][2] * 2]][n13], 30, 170 + n13 * this.c, 4 | 0x10);
                    }
                    break;
                }
                k.drawString("\u672a\u77e5", 40, 170 + this.c, 4 | 0x10);
                break;
            }
            case 2: {
                this.a(30, 42, imageArray, byArray, byArray3, byArray4[0], 0, 1, byArray4[0][0], sArray, sArray4);
                this.a(80, 70, imageArray, (int)byArray[byArray4[0][0]][byArray4[1][0]], this.u, sArray4);
                k.setColor(this.m);
                if (byArray[byArray4[0][0]][byArray4[1][0]] > -1) {
                    k.drawString(com.cwa.gamelib.b.ch[byArray[byArray4[0][0]][byArray4[1][0]]], 110, 59, 4 | 0x10);
                } else {
                    k.drawString("\u65e0\u9b54\u6cd5", 115, 70, 4 | 0x10);
                }
                k.drawString("\u9009\u62e9\u914d\u65b9:", 30, 99, 4 | 0x10);
                this.b(35, 119, imageArray, byArray, byArray2, byArray4[2], n, n2, byArray4[2][0], sArray2, sArray4);
                n4 = 178;
                n5 = 114;
                this.a(imageArray, sArray4, n4, n5, (int)byArray4[2][2], 70, n6);
                k.setColor(this.m);
                int n14 = 189;
                k.drawString("\u6240\u9700\u6750\u6599:", 30, n14, 4 | 0x10);
                if (sArray2[byArray4[2][0]] <= 0) {
                    k.drawString("\u672a\u77e5", 82, n14 + this.c, 4 | 0x10);
                }
                if (sArray2[byArray4[2][0]] <= 0) break;
                int n15 = 0;
                int n16 = 0;
                while (n15 < com.cwa.gamelib.b.aj[byArray4[2][0] - 10][0].length) {
                    n7 = nArray[com.cwa.gamelib.b.aj[byArray4[2][0] - 10][0][n15] - 2];
                    gameutils.a.a(imageArray[sArray4[n7][0]][0][0], sArray4[n7][1], sArray4[n7][2], sArray4[n7][3], sArray4[n7][4], 35 + n16 % 2 * 90, n14 + this.c + n16 / 2 * this.c, 4 | 0x10, 0, k);
                    if (com.cwa.gamelib.b.aj[byArray4[2][0] - 10][0][n15 + 1] > sArray3[com.cwa.gamelib.b.aj[byArray4[2][0] - 10][0][n15]]) {
                        k.setColor(0xFF0000);
                    } else {
                        k.setColor(this.m);
                    }
                    k.drawString(com.cwa.gamelib.b.aj[byArray4[2][0] - 10][0][n15 + 1] + "/" + sArray3[com.cwa.gamelib.b.aj[byArray4[2][0] - 10][0][n15]], 65 + n16 % 2 * 90, n14 + this.c + n16 / 2 * this.c, 4 | 0x10);
                    n15 += 2;
                    ++n16;
                }
                break;
            }
        }
        if (by >= 0) {
            this.a(imageArray, 52, 100, sArray4);
        }
        String[] stringArray = new String[]{"\u6ca1\u6709\u8be5\u914d\u65b9!", "\u9644\u9b54\u6210\u529f!", "\u6750\u6599\u4e0d\u8db3!", "\u5df2\u6709\u8be5\u9b54\u6cd5!", "\u5df2\u6709\u5251\u8f6e\u9b54\u6cd5!", "\u5df2\u6709\u7fbd\u5203\u9b54\u6cd5!", "\u66ff\u6362\u9b54\u6cd5\u6210\u529f!", "\u8981\u66ff\u6362\u5417?", "\u6b64\u5251\u4e0d\u80fd\u9644\u5438\u8840"};
        int[] nArray3 = new int[]{0xFF0000, 0xFFFFFF, 0xFF0000, 0xFF0000, 0xFF0000, 0xFF0000, 0xFFFFFF, 0xFF0000, 0xFF0000};
        if (by >= 0) {
            k.setColor(nArray3[by]);
            k.drawString(stringArray[by], 122, 118, 1 | 0x10);
        }
    }

    private void a(int n, int n2, Image[][][] imageArray, int n3, int n4, short[][] sArray) {
        int n5;
        int[] nArray = new int[]{30, 31, 27, 29, 28, 30, 31, 27, 29, 28, 30, 31, 27, 29, 28, 32, 32};
        int n6 = 0;
        int[] nArray2 = new int[]{25, 24, 23, 25};
        n6 = n3 >= 10 && n3 <= 14 ? 0 : (n3 >= 15 && n3 <= 19 ? 1 : (n3 >= 20 && n3 <= 24 ? 3 : 0));
        int n7 = n5 = n4 > n6 ? n6 : n4;
        if (n3 == -1) {
            gameutils.a.a(imageArray[sArray[26][0]][0][0], sArray[26][1], sArray[26][2], sArray[26][3], sArray[26][4], n, n2, 4 | 0x10, 0, k);
        } else {
            gameutils.a.a(imageArray[sArray[nArray[n3 - 10]][0]][0][0], sArray[nArray[n3 - 10]][1], sArray[nArray[n3 - 10]][2], sArray[nArray[n3 - 10]][3], sArray[nArray[n3 - 10]][4], n, n2, 4 | 0x10, 0, k);
            gameutils.a.a(imageArray[sArray[nArray2[n5]][0]][0][0], sArray[nArray2[n5]][1], sArray[nArray2[n5]][2], sArray[nArray2[n5]][3], sArray[nArray2[n5]][4], n + 2, n2, 4 | 0x10, 0, k);
        }
    }

    public void b(Image[][][] imageArray, Image[][][] imageArray2, byte[][] byArray, byte[] byArray2, byte[][] byArray3, int n, int n2, int n3, byte by, short[] sArray, short[] sArray2, short[][] sArray3) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 17, 0}, {6, 40, 17, 0}, {6, 60, 17, 0}, {6, 84, 15, 0}, {6, 104, 15, 0}, {6, 124, 15, 0}, {6, 151, 34, 0}, {6, 171, 34, 0}, {6, 191, 34, 0}, {19, 200, 34, 4}, {15, 217, 54, 0}, {15, 217, 74, 0}, {15, 217, 94, 0}, {15, 217, 114, 0}, {15, 217, 134, 0}, {15, 217, 154, 0}, {15, 217, 174, 0}, {19, 200, 276, 2}, {15, 217, 256, 0}, {15, 217, 236, 0}, {15, 217, 194, 0}, {15, 217, 214, 0}, {15, 217, 227, 0}, {19, 20, 276, 6}, {7, 180, 293, 0}, {7, 160, 293, 0}, {7, 140, 293, 0}, {7, 120, 293, 0}, {7, 60, 293, 0}, {7, 100, 293, 0}, {7, 80, 293, 0}, {7, 40, 293, 0}, {16, 20, 256, 0}, {16, 20, 236, 0}, {16, 20, 216, 0}, {16, 20, 196, 0}, {16, 20, 176, 0}, {16, 20, 156, 0}, {16, 20, 136, 0}, {16, 20, 116, 0}, {16, 20, 96, 0}, {16, 20, 76, 0}, {16, 20, 56, 0}, {16, 20, 36, 0}, {6, 147, 17, 0}, {6, 167, 17, 0}, {6, 187, 17, 0}, {13, 207, 17, 0}, {14, 144, 15, 0}, {19, 80, 15, 0}, {6, 23, 34, 0}, {6, 63, 34, 0}, {6, 43, 34, 0}, {6, 144, 34, 0}}, new int[][]{{5, 0, 0, 0}, {5, 120, 0, 4}, {2, 20, 0, 0}, {2, 40, 0, 0}, {2, 60, 0, 0}, {2, 80, 0, 0}, {2, 100, 0, 0}, {1, 20, 39, 0}, {0, 0, 38, 0}, {1, 40, 39, 0}, {1, 60, 39, 0}, {1, 80, 39, 0}, {1, 100, 39, 0}, {0, 120, 38, 4}, {4, 0, 20, 0}, {4, 120, 20, 4}, {3, 20, 20, 0}, {3, 40, 20, 0}, {3, 60, 20, 0}, {3, 80, 20, 0}, {3, 100, 20, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 0, 0, sArray3);
        k.setColor(this.m);
        k.drawString("\u9009\u62e9\u914d\u65b9:", 35, 42, 4 | 0x10);
        int[] nArray = new int[]{48, 50, 49, 46, 47, 45, 44, 43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36, 37, 33, 37, 41, 41, 41, 41, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 39, 38, 37, 36, 35, 34, 33, 37, 0, 0, 0, 0, 0, 0, 0, 0, 41, 41, 41, 41};
        int n4 = 183;
        int n5 = 65;
        int n6 = byArray2.length - 1;
        this.a(n4 - 143, n5, imageArray, byArray, byArray2, byArray3[0], n, n2, byArray3[0][0], sArray, sArray2, sArray3);
        this.a(imageArray, sArray3, n4, n5, (int)byArray3[0][2], 60, n6);
        k.setColor(this.m);
        int n7 = 35;
        int n8 = 132;
        int n9 = 35;
        int n10 = 188;
        int n11 = -1;
        k.drawString("\u6240\u9700\u6750\u6599:", 35, n10, 4 | 0x10);
        if (com.cwa.gamelib.b.aj[byArray3[0][0] - 10].length != 3) {
            if (sArray[byArray3[0][0]] > 0) {
                k.drawString("\u7cbe\u70bc\u540e\u4ea7\u7269:  " + com.cwa.gamelib.b.ch[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0]], n7, n8, 4 | 0x10);
                n11 = nArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0] - 2];
                gameutils.a.a(imageArray[sArray3[n11][0]][0][0], sArray3[n11][1], sArray3[n11][2], sArray3[n11][3], sArray3[n11][4], n7 + 5, n8 + this.c, 4 | 0x10, 0, k);
                k.drawString(com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][1] + "/\u5df2\u6709[" + sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0]] + "]", n7 + 5 + 29, n8 + this.c, 4 | 0x10);
            } else {
                k.drawString("\u7cbe\u70bc\u540e\u4ea7\u7269:  \u672a\u77e5", n7, n8 + 2, 4 | 0x10);
            }
            int n12 = 0;
            int n13 = 0;
            while (n12 < com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0].length) {
                n11 = nArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n12] - 2];
                if (sArray[byArray3[0][0]] > 0) {
                    gameutils.a.a(imageArray[sArray3[n11][0]][0][0], sArray3[n11][1], sArray3[n11][2], sArray3[n11][3], sArray3[n11][4], n7 + 5 + n13 % 2 * 90, n10 + this.c + n13 / 2 * this.c, 4 | 0x10, 0, k);
                    if (com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n12 + 1] > sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n12]]) {
                        k.setColor(0xFF0000);
                    } else {
                        k.setColor(this.m);
                    }
                    k.drawString(com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n12 + 1] + "/[" + sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n12]] + "]", n7 + 5 + 29 + n13 % 2 * 90, n10 + this.c + n13 / 2 * this.c + 2, 4 | 0x10);
                } else {
                    k.drawString("\u672a\u77e5", n7 + 5 + n13 % 2 * 90, n10 + this.c + n13 / 2 * this.c, 4 | 0x10);
                }
                n12 += 2;
                ++n13;
            }
        }
        if (by >= 0) {
            this.a(imageArray, 52, 100, sArray3);
        }
        String[] stringArray = new String[]{"\u6ca1\u6709\u8be5\u914d\u65b9!", "", "\u6750\u6599\u4e0d\u8db3!", "\u5df2\u6709\u8be5\u9b54\u6cd5!", "\u64cd\u4f5c\u6210\u529f!", "\u5df2\u8fbe\u4e0a\u9650!", "\u66ff\u6362\u9b54\u6cd5\u6210\u529f!", "\u8981\u66ff\u6362\u5417?"};
        int[] nArray2 = new int[]{0xFF0000, 0xFFFFFF, 0xFF0000, 0xFF0000, 0xFFFFFF, 0xFF0000, 0xFFFFFF, 0xFF0000};
        if (by >= 0) {
            k.setColor(nArray2[by]);
            k.drawString(stringArray[by], 122, 118, 1 | 0x10);
        }
        this.a(imageArray, 0, sArray3);
    }

    public void a(Image[][][] imageArray, Image[][][] imageArray2, byte[][] byArray, byte[] byArray2, byte[][] byArray3, int n, int n2, int n3, byte by, short[] sArray, short[] sArray2, short[][] sArray3) {
        int n4;
        int n5;
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 17, 0}, {6, 40, 17, 0}, {6, 60, 17, 0}, {6, 83, 34, 0}, {6, 83, 17, 0}, {6, 103, 17, 0}, {6, 123, 17, 0}, {6, 103, 34, 0}, {6, 23, 34, 0}, {6, 43, 34, 0}, {6, 63, 34, 0}, {15, 217, 54, 0}, {15, 217, 74, 0}, {15, 217, 94, 0}, {15, 217, 114, 0}, {15, 217, 134, 0}, {15, 217, 154, 0}, {15, 217, 174, 0}, {19, 200, 276, 2}, {15, 217, 256, 0}, {15, 217, 236, 0}, {15, 217, 194, 0}, {15, 217, 214, 0}, {15, 217, 227, 0}, {19, 20, 276, 6}, {7, 180, 293, 0}, {7, 160, 293, 0}, {7, 140, 293, 0}, {7, 120, 293, 0}, {7, 60, 293, 0}, {7, 100, 293, 0}, {7, 80, 293, 0}, {7, 40, 293, 0}, {16, 20, 256, 0}, {16, 20, 236, 0}, {16, 20, 216, 0}, {16, 20, 196, 0}, {16, 20, 176, 0}, {16, 20, 156, 0}, {16, 20, 136, 0}, {16, 20, 116, 0}, {16, 20, 96, 0}, {16, 20, 76, 0}, {16, 20, 56, 0}, {16, 20, 36, 0}, {6, 123, 34, 0}, {6, 163, 15, 0}, {6, 183, 15, 0}, {6, 124, 34, 0}, {12, 210, 34, 6}, {6, 126, 34, 0}, {19, 143, 15, 0}, {14, 203, 15, 0}, {6, 217, 35, 1}, {13, 80, 17, 0}}, new int[][]{{5, 0, 0, 0}, {5, 120, 0, 4}, {2, 20, 0, 0}, {2, 40, 0, 0}, {2, 60, 0, 0}, {2, 80, 0, 0}, {2, 100, 0, 0}, {1, 20, 39, 0}, {0, 0, 38, 0}, {1, 40, 39, 0}, {1, 60, 39, 0}, {1, 80, 39, 0}, {1, 100, 39, 0}, {0, 120, 38, 4}, {4, 0, 20, 0}, {4, 120, 20, 4}, {3, 20, 20, 0}, {3, 40, 20, 0}, {3, 60, 20, 0}, {3, 80, 20, 0}, {3, 100, 20, 0}}};
        int[] nArray = new int[]{48, 50, 49, 46, 47, 45, 44, 43, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36, 37, 33, 37, 41, 41, 41, 41, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 39, 38, 37, 36, 35, 34, 33, 37, 0, 0, 0, 0, 0, 0, 0, 0, 41, 41, 41, 41};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 0, 0, sArray3);
        int n6 = 183;
        int n7 = 65;
        int n8 = byArray2.length - 1;
        this.a(n6 - 143, n7, imageArray, byArray, byArray2, byArray3[0], n, n2, byArray3[0][0], sArray, sArray2, sArray3);
        this.a(imageArray, sArray3, n6, n7, (int)byArray3[0][2], 60, n8);
        k.setColor(this.m);
        k.drawString("\u9009\u62e9\u914d\u65b9:", 35, 42, 4 | 0x10);
        int n9 = 35;
        int n10 = 132;
        int n11 = 35;
        int n12 = 188;
        int n13 = -1;
        k.drawString("\u6240\u9700\u6750\u6599:", 35, n12, 4 | 0x10);
        if (com.cwa.gamelib.b.aj[byArray3[0][0] - 10].length == 3) {
            if (com.cwa.gamelib.b.aj[byArray3[0][0] - 10][2][0] >= 25 && com.cwa.gamelib.b.aj[byArray3[0][0] - 10][2][0] <= 28) {
                n5 = 0;
                n4 = 0;
                while (n5 < com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0].length) {
                    n13 = nArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5] - 2];
                    if (sArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][2][0]] > 0) {
                        gameutils.a.a(imageArray[sArray3[n13][0]][0][0], sArray3[n13][1], sArray3[n13][2], sArray3[n13][3], sArray3[n13][4], n9 + 5 + n4 % 2 * 90, n12 + this.c + n4 / 2 * this.c, 4 | 0x10, 0, k);
                        if (com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5 + 1] > sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5]]) {
                            k.setColor(0xFF0000);
                        } else {
                            k.setColor(this.m);
                        }
                        k.drawString(com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5 + 1] + "/[" + sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5]] + "]", n9 + 5 + 29 + n4 % 2 * 90, n12 + this.c + n4 / 2 * this.c, 4 | 0x10);
                    } else {
                        k.setColor(this.m);
                        k.drawString("\u672a\u77e5", n9 + 5 + n4 % 2 * 90, n12 + this.c + n4 / 2 * this.c, 4 | 0x10);
                    }
                    n5 += 2;
                    ++n4;
                }
                if (sArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][2][0]] > 0) {
                    k.setColor(this.m);
                    k.drawString("\u7cbe\u70bc\u540e\u4ea7\u7269:  " + com.cwa.gamelib.b.ch[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0]], 35, n10 + 2, 4 | 0x10);
                    n13 = nArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0] - 2];
                    gameutils.a.a(imageArray[sArray3[n13][0]][0][0], sArray3[n13][1], sArray3[n13][2], sArray3[n13][3], sArray3[n13][4], n9 + 5, n10 + this.c, 4 | 0x10, 0, k);
                    k.drawString(com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][1] + "/\u5df2\u6709[" + sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0]] + "]", n9 + 5 + 29, n10 + 2 + this.c, 4 | 0x10);
                } else {
                    k.drawString("\u7cbe\u70bc\u540e\u4ea7\u7269:  \u672a\u77e5", n9, n10 + 2, 4 | 0x10);
                }
            }
        } else {
            if (sArray[byArray3[0][0]] > 0) {
                k.drawString("\u7cbe\u70bc\u540e\u4ea7\u7269:  " + com.cwa.gamelib.b.ch[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0]], n9, n10, 4 | 0x10);
                n13 = nArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0] - 2];
                gameutils.a.a(imageArray[sArray3[n13][0]][0][0], sArray3[n13][1], sArray3[n13][2], sArray3[n13][3], sArray3[n13][4], n9 + 5, n10 + this.c, 4 | 0x10, 0, k);
                k.drawString(com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][1] + "/\u5df2\u6709[" + sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][1][0]] + "]", n9 + 5 + 29, n10 + this.c, 4 | 0x10);
            } else {
                k.drawString("\u7cbe\u70bc\u540e\u4ea7\u7269:  \u672a\u77e5", n9, n10 + 2, 4 | 0x10);
            }
            n5 = 0;
            n4 = 0;
            while (n5 < com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0].length) {
                n13 = nArray[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5] - 2];
                if (sArray[byArray3[0][0]] > 0) {
                    gameutils.a.a(imageArray[sArray3[n13][0]][0][0], sArray3[n13][1], sArray3[n13][2], sArray3[n13][3], sArray3[n13][4], n9 + 5 + n4 % 2 * 90, n12 + this.c + n4 / 2 * this.c, 4 | 0x10, 0, k);
                    if (com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5 + 1] > sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5]]) {
                        k.setColor(0xFF0000);
                    } else {
                        k.setColor(this.m);
                    }
                    k.drawString(com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5 + 1] + "/[" + sArray2[com.cwa.gamelib.b.aj[byArray3[0][0] - 10][0][n5]] + "]", n9 + 5 + 29 + n4 % 2 * 90, n12 + this.c + n4 / 2 * this.c + 2, 4 | 0x10);
                } else {
                    k.drawString("\u672a\u77e5", n9 + 5 + n4 % 2 * 90, n12 + this.c + n4 / 2 * this.c, 4 | 0x10);
                }
                n5 += 2;
                ++n4;
            }
        }
        if (by >= 0) {
            this.a(imageArray, 52, 100, sArray3);
        }
        String[] stringArray = new String[]{"\u6ca1\u6709\u8be5\u914d\u65b9!", "", "\u6750\u6599\u4e0d\u8db3!", "\u5df2\u6709\u8be5\u9b54\u6cd5!", "\u64cd\u4f5c\u6210\u529f!", "\u5df2\u8fbe\u4e0a\u9650!", "\u66ff\u6362\u9b54\u6cd5\u6210\u529f!", "\u8981\u66ff\u6362\u5417?"};
        int[] nArray2 = new int[]{0xFF0000, 0xFFFFFF, 0xFF0000, 0xFF0000, 0xFFFFFF, 0xFF0000, 0xFFFFFF, 0xFF0000};
        if (by >= 0) {
            k.setColor(nArray2[by]);
            k.drawString(stringArray[by], 122, 118, 1 | 0x10);
        }
    }

    private void a(Image[][][] imageArray, int n, int n2, short[][] sArray) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{5, 0, 0, 0}, {5, 120, 0, 4}, {2, 20, 0, 0}, {2, 40, 0, 0}, {2, 60, 0, 0}, {2, 80, 0, 0}, {2, 100, 0, 0}, {1, 20, 39, 0}, {0, 0, 38, 0}, {1, 40, 39, 0}, {1, 60, 39, 0}, {1, 80, 39, 0}, {1, 100, 39, 0}, {0, 120, 38, 4}, {4, 0, 20, 0}, {4, 120, 20, 4}, {3, 20, 20, 0}, {3, 40, 20, 0}, {3, 60, 20, 0}, {3, 80, 20, 0}, {3, 100, 20, 0}}};
        this.a(imageArray, nArrayArray[0], n, n2, sArray);
    }

    private void a(int n, int n2, Image[][][] imageArray, byte[][] byArray, byte[] byArray2, byte[] byArray3, int n3, int n4, byte by, short[] sArray, short[] sArray2, short[][] sArray3) {
        byte by2 = -1;
        int[] nArray = new int[]{42, 52};
        for (int j = 0; j < n4; ++j) {
            by2 = Math.abs((j - n3 + byArray3[2] + byArray2.length) % byArray2.length);
            k.setColor(this.m);
            if (sArray[byArray2[by2]] > 0) {
                k.drawString(com.cwa.gamelib.b.ch[byArray2[by2]], n + 3 + 25, n2 + j * this.c, 4 | 0x10);
                gameutils.a.a(imageArray[sArray3[23][0]][0][0], sArray3[23][1], sArray3[23][2], sArray3[23][3], sArray3[23][4], n + 3, n2 + j * this.c, 4 | 0x10, 0, k);
            } else {
                k.drawString("\u672a\u77e5", n + 3 + 25, n2 + 3 + j * this.c, 4 | 0x10);
                k.drawRect(n + 3, n2 + j * this.c, 23, 15);
            }
            if (by2 != byArray3[2]) continue;
            gameutils.a.a(imageArray[sArray3[nArray[this.o[4] / 2]][0]][0][0], sArray3[nArray[this.o[4] / 2]][1], sArray3[nArray[this.o[4] / 2]][2], sArray3[nArray[this.o[4] / 2]][3], sArray3[nArray[this.o[4] / 2]][4], n + 3, n2 + j * this.c, 4 | 0x10, 0, k);
        }
    }

    public void a(Image[][][] imageArray, byte[][] byArray, byte[] byArray2, byte[] byArray3, d d2, short[][] sArray) {
        int n;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int[][][] nArrayArray = new int[][][]{new int[][]{{2, 40, 0, 0}, {18, 0, 0, 0}, {18, 220, 0, 4}, {2, 20, 0, 0}, {2, 60, 0, 0}, {2, 80, 0, 0}, {2, 100, 0, 0}, {2, 120, 0, 0}, {2, 140, 0, 0}, {2, 160, 0, 0}, {2, 180, 0, 0}, {2, 200, 0, 0}, {19, 84, 12, 0}, {4, 0, 20, 0}, {4, 0, 40, 0}, {4, 0, 60, 0}, {4, 0, 80, 0}, {22, 22, 12, 0}, {4, 0, 100, 0}, {4, 0, 120, 0}, {4, 0, 140, 0}, {4, 0, 160, 0}, {4, 0, 180, 0}, {4, 0, 200, 0}, {4, 0, 220, 0}, {4, 220, 20, 4}, {4, 220, 40, 4}, {4, 220, 60, 4}, {4, 220, 80, 4}, {19, 200, 12, 4}, {4, 220, 100, 4}, {4, 220, 120, 4}, {4, 220, 140, 4}, {4, 220, 160, 4}, {4, 220, 180, 4}, {4, 220, 200, 4}, {4, 220, 220, 4}, {4, 0, 240, 0}, {1, 40, 300, 0}, {19, 20, 220, 0}, {19, 200, 220, 4}, {19, 84, 72, 6}, {19, 20, 280, 6}, {11, 22, 72, 0}, {19, 200, 280, 2}, {7, 40, 297, 0}, {7, 60, 297, 0}, {7, 172, 297, 0}, {7, 152, 297, 0}, {6, 180, 220, 0}, {6, 160, 220, 0}, {19, 200, 72, 2}, {16, 20, 240, 0}, {15, 217, 240, 0}, {7, 80, 297, 0}, {7, 100, 297, 0}, {7, 120, 297, 0}, {7, 138, 297, 0}, {16, 20, 260, 0}, {15, 217, 260, 0}, {0, 0, 299, 0}, {1, 20, 300, 0}, {4, 0, 260, 0}, {4, 0, 280, 0}, {1, 60, 300, 0}, {1, 80, 300, 0}, {1, 100, 300, 0}, {1, 120, 300, 0}, {1, 140, 300, 0}, {1, 160, 300, 0}, {1, 180, 300, 0}, {0, 220, 299, 4}, {1, 200, 300, 0}, {4, 220, 260, 4}, {4, 220, 280, 4}, {4, 220, 240, 4}, {6, 140, 220, 0}, {6, 120, 220, 0}, {7, 186, 297, 0}, {6, 40, 220, 0}, {6, 60, 220, 0}, {6, 80, 220, 0}, {6, 100, 220, 0}, {15, 217, 32, 0}, {16, 84, 32, 0}, {16, 84, 52, 0}, {15, 217, 52, 0}, {7, 104, 89, 0}, {7, 124, 89, 0}, {7, 144, 89, 0}, {7, 164, 89, 0}, {7, 181, 89, 0}, {6, 180, 12, 0}, {6, 160, 12, 0}, {6, 140, 12, 0}, {6, 120, 12, 0}, {6, 103, 12, 0}}};
        k.setColor(0);
        k.fillRect(0, 0, 240, 320);
        String[] stringArray = new String[]{"\u88c5\u5907", "\u7269\u54c1", "\u56fe\u9274", "\u767e\u79d1"};
        int[] nArray = new int[]{24, 68, 108, 150};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray[0][0][0], 3, sArray, 0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 0, 0, sArray);
        k.setColor(this.m);
        for (n = 0; n < stringArray.length; ++n) {
            k.drawString(stringArray[n], nArray[n], 104, 4 | 0x10);
        }
        k.setColor(0xFF0000);
        k.fillRect(91, 20, d2.af[0] * 80 / d2.af[1], 3);
        k.setColor(this.m);
        k.fillRect(91, 25, d2.cd[0] * 80 / d2.cd[1], 3);
        k.setColor(this.m);
        k.drawRect(91, 20, 80, 3);
        k.drawRect(91, 25, 80, 3);
        n = 40;
        int n2 = 91;
        k.drawString("\u7b49\u7ea7:" + d2.ag[0], n2, n, 4 | 0x10);
        k.drawString("\u547d:" + d2.af[0], n2 + 60, n, 4 | 0x10);
        int n3 = 0;
        byte by = 0;
        for (int j = 0; j < 2; ++j) {
            if ((byArray[d2.ah][j * 2] - 10) % 5 == 0) {
                n3 = 0;
                n3 = com.cwa.gamelib.b.aM[byArray[d2.ah][j * 2] - 10][0];
            }
            if ((byArray[d2.ah][j * 2] - 10) % 5 != 1) continue;
            by = 0;
            by = com.cwa.gamelib.b.aM[byArray[d2.ah][j * 2] - 10][0];
        }
        k.drawString("\u653b:" + (com.cwa.gamelib.b.bC[d2.ah] + com.cwa.gamelib.b.x[0][1] + n3), n2, n + this.c, 4 | 0x10);
        k.drawString("\u9632:" + (com.cwa.gamelib.b.bB[0][1] + by), n2 + 60, n + this.c, 4 | 0x10);
        this.a(imageArray, 0, sArray);
    }

    public void a(Image[][][] imageArray, int[][] nArray, int n, int n2, short[][] sArray) {
        for (int j = 0; j < nArray.length; ++j) {
            gameutils.a.a(imageArray[sArray[nArray[j][0]][0]][0][0], sArray[nArray[j][0]][1], sArray[nArray[j][0]][2], sArray[nArray[j][0]][3], sArray[nArray[j][0]][4], nArray[j][1] + n, nArray[j][2] + n2, 4 | 0x10, nArray[j][3], k);
        }
    }

    private void a(Image[][][] imageArray, short[][] sArray) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{2, 40, 0, 0}, {18, 0, 0, 0}, {18, 220, 0, 4}, {2, 20, 0, 0}, {2, 60, 0, 0}, {2, 80, 0, 0}, {2, 100, 0, 0}, {2, 140, 0, 0}, {2, 160, 0, 0}, {2, 180, 0, 0}, {2, 200, 0, 0}, {4, 0, 20, 0}, {4, 0, 40, 0}, {4, 0, 60, 0}, {4, 0, 80, 0}, {4, 0, 100, 0}, {4, 0, 120, 0}, {4, 0, 140, 0}, {4, 0, 160, 0}, {4, 0, 180, 0}, {4, 0, 200, 0}, {4, 0, 220, 0}, {4, 220, 20, 4}, {4, 220, 40, 4}, {4, 220, 60, 4}, {4, 220, 80, 4}, {4, 220, 100, 4}, {4, 220, 120, 4}, {4, 220, 140, 4}, {4, 220, 160, 4}, {4, 220, 180, 4}, {4, 220, 200, 4}, {4, 220, 220, 4}, {4, 0, 240, 0}, {1, 40, 300, 0}, {0, 0, 299, 0}, {1, 20, 300, 0}, {4, 0, 260, 0}, {4, 0, 280, 0}, {1, 60, 300, 0}, {1, 100, 300, 0}, {1, 120, 300, 0}, {1, 140, 300, 0}, {1, 160, 300, 0}, {1, 180, 300, 0}, {0, 220, 299, 4}, {1, 200, 300, 0}, {4, 220, 260, 4}, {4, 220, 280, 4}, {4, 220, 240, 4}, {1, 80, 300, 0}, {2, 120, 0, 0}}};
        this.a(imageArray, nArrayArray[0], 0, 0, sArray);
    }

    private void c(Image[][][] imageArray, short[][] sArray) {
        int n;
        int[][][] nArrayArray = new int[1][][];
        int[][] nArrayArray2 = new int[1][];
        int[] nArray = new int[16];
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 4 | 0x10;
        nArray[3] = 0;
        nArray[4] = 240;
        nArray[5] = 0;
        nArray[6] = 8 | 0x10;
        nArray[7] = 4;
        nArray[8] = 0;
        nArray[9] = 319;
        nArray[10] = 4 | 0x20;
        nArray[11] = 6;
        nArray[12] = 240;
        nArray[13] = 319;
        nArray[14] = 8 | 0x20;
        nArray[15] = 2;
        nArrayArray2[0] = nArray;
        nArrayArray[0] = nArrayArray2;
        int[][][] nArrayArray3 = nArrayArray;
        for (n = 0; n < 14; ++n) {
            gameutils.a.a(imageArray[sArray[7][0]][0][0], sArray[7][1], sArray[7][2], sArray[7][3], sArray[7][4], 16 + n * 16, 0, 4 | 0x10, 0, k);
            gameutils.a.a(imageArray[sArray[7][0]][0][0], sArray[7][1], sArray[7][2], sArray[7][3], sArray[7][4], 16 + n * 16, 319, 4 | 0x20, 6, k);
        }
        for (n = 0; n < 19; ++n) {
            gameutils.a.a(imageArray[sArray[16][0]][0][0], sArray[16][1], sArray[16][2], sArray[16][3], sArray[16][4], 0, 8 + n * 16, 4 | 0x10, 0, k);
            gameutils.a.a(imageArray[sArray[16][0]][0][0], sArray[16][1], sArray[16][2], sArray[16][3], sArray[16][4], 240, 8 + n * 16, 8 | 0x10, 4, k);
        }
        for (n = 0; n < nArrayArray3[0][0].length; n += 4) {
            gameutils.a.a(imageArray[sArray[36][0]][0][0], sArray[36][1], sArray[36][2], sArray[36][3], sArray[36][4], nArrayArray3[0][0][n], nArrayArray3[0][0][n + 1], nArrayArray3[0][0][n + 2], nArrayArray3[0][0][n + 3], k);
        }
    }

    public void b(Image[][][] imageArray, Image[][][] imageArray2, byte[] byArray, byte[] byArray2, int n, int n2, byte by, short[] sArray, short[] sArray2, short[][] sArray3) {
        int n3;
        int n4;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 101, 0}, {6, 83, 101, 0}, {6, 171, 99, 0}, {6, 126, 101, 0}, {6, 151, 99, 0}, {19, 200, 118, 4}, {16, 20, 116, 0}, {16, 20, 136, 0}, {16, 20, 156, 0}, {16, 20, 176, 0}, {19, 20, 184, 6}, {7, 40, 201, 0}, {7, 60, 201, 0}, {7, 80, 201, 0}, {7, 100, 201, 0}, {7, 120, 201, 0}, {7, 140, 201, 0}, {7, 160, 201, 0}, {7, 180, 201, 0}, {19, 200, 184, 2}, {15, 217, 137, 0}, {15, 217, 157, 0}, {15, 217, 172, 0}, {6, 129, 118, 0}, {6, 40, 101, 0}, {13, 60, 101, 0}, {6, 124, 118, 0}, {13, 103, 101, 0}, {6, 104, 118, 0}, {6, 84, 118, 0}, {6, 71, 118, 0}, {6, 23, 118, 0}, {6, 43, 118, 0}, {6, 59, 118, 0}, {19, 146, 99, 0}, {6, 63, 101, 0}, {6, 106, 101, 0}, {14, 191, 99, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 1, 1, sArray3);
        int[] nArray = new int[]{51, -1, 41, -1, 48, -1, 50, -1, 49, -1, 46, -1, 47, -1, 45, -1, 44, -1, 43, -1, 30, 25, 31, 25, 27, 25, 29, 25, 28, 25, 30, 24, 31, 24, 27, 24, 29, 24, 28, 24, 30, 23, 31, 23, 27, 23, 29, 23, 28, 23, 32, 23, 32, 23, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, -1, -1, -1, -1, 40, -1, 39, -1, 38, -1, 37, -1, 36, -1, 35, -1, 34, -1, 33, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1, 23, -1};
        byte by2 = -1;
        int n5 = 95;
        for (n4 = 0; n4 < n2; ++n4) {
            by2 = Math.abs((n4 - n + byArray2[2] + byArray.length) % byArray.length);
            if (by2 != byArray2[2]) {
                k.setColor(this.m);
            } else {
                k.setColor(0xFFFFFF);
            }
            if (sArray[byArray[by2]] > 0) {
                k.drawString(com.cwa.gamelib.b.ch[byArray[by2]], 100, n5 + n4 * this.c + 35, 1 | 0x10);
            } else {
                k.drawString("\u672a\u77e5", 100, n5 + n4 * this.c + 35, 1 | 0x10);
            }
            k.setColor(this.m);
            if (by2 != byArray2[2]) continue;
            if (sArray[byArray[by2]] > 0) {
                for (n3 = 1; n3 < com.cwa.gamelib.b.h[1][3][byArray[by2]].length; ++n3) {
                    k.drawString(com.cwa.gamelib.b.h[1][3][byArray[by2]][n3], 25, 225 + (n3 - 1) * this.c, 4 | 0x10);
                }
                continue;
            }
            k.drawString("\u672a\u83b7\u5f97\u8be5\u7269\u54c1", 25, 225, 4 | 0x10);
        }
        n4 = byArray.length - 1;
        n3 = 190;
        int n6 = 129;
        this.a(imageArray, sArray3, n3, n6, (int)byArray2[2], 65, n4);
        this.a(imageArray, 0, sArray3);
    }

    public void a(Image[][][] imageArray, byte[] byArray, byte[] byArray2, short[][] sArray, int n, int[][] nArray) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int[][][] nArrayArray = new int[][][]{new int[][]{{5, 41, 80, 0}, {0, 41, 138, 0}, {5, 160, 80, 4}, {0, 160, 138, 4}, {4, 41, 100, 0}, {4, 41, 120, 0}, {4, 160, 120, 4}, {4, 160, 100, 4}, {2, 61, 80, 0}, {2, 81, 80, 0}, {2, 121, 80, 0}, {2, 141, 80, 0}, {2, 101, 80, 0}, {1, 61, 139, 0}, {1, 80, 139, 0}, {1, 100, 139, 0}, {1, 120, 139, 0}, {1, 140, 139, 0}, {3, 61, 100, 0}, {3, 61, 120, 0}, {3, 81, 100, 0}, {3, 81, 120, 0}, {3, 101, 100, 0}, {3, 101, 120, 0}, {3, 121, 100, 0}, {3, 121, 120, 0}, {3, 141, 100, 0}, {3, 140, 120, 0}}, new int[][]{{6, 44, 48, 0}, {6, 164, 48, 0}, {6, 64, 48, 0}, {6, 84, 48, 0}, {6, 144, 48, 0}, {6, 124, 48, 0}, {6, 104, 48, 0}, {19, 24, 108, 6}, {7, 60, 317, 0}, {7, 80, 317, 0}, {7, 100, 317, 0}, {7, 120, 317, 0}, {7, 140, 317, 0}, {7, 160, 317, 0}, {7, 180, 317, 0}, {7, 200, 317, 0}, {15, 237, 40, 0}, {15, 213, 68, 0}, {15, 237, 140, 0}, {15, 237, 160, 0}, {15, 237, 180, 0}, {15, 237, 200, 0}, {15, 237, 220, 0}, {15, 237, 20, 0}, {18, 0, 0, 0}, {18, 220, 0, 4}, {7, 182, 125, 0}, {7, 167, 125, 0}, {7, 155, 125, 0}, {7, 135, 125, 0}, {7, 116, 125, 0}, {7, 104, 125, 0}, {16, 0, 20, 0}, {16, 0, 40, 0}, {16, 0, 60, 0}, {16, 0, 80, 0}, {16, 0, 100, 0}, {16, 0, 120, 0}, {16, 0, 140, 0}, {16, 0, 160, 0}, {16, 0, 180, 0}, {16, 0, 200, 0}, {16, 0, 218, 0}, {15, 237, 60, 0}, {15, 237, 80, 0}, {15, 237, 100, 0}, {15, 237, 120, 0}, {7, 20, 0, 0}, {7, 40, 0, 0}, {7, 60, 0, 0}, {7, 80, 0, 0}, {7, 100, 0, 0}, {7, 120, 0, 0}, {7, 140, 0, 0}, {7, 160, 0, 0}, {7, 180, 0, 0}, {19, 24, 160, 0}, {19, 196, 220, 2}, {6, 44, 160, 0}, {7, 44, 237, 0}, {7, 64, 237, 0}, {7, 84, 237, 0}, {7, 104, 237, 0}, {7, 124, 237, 0}, {7, 142, 237, 0}, {7, 156, 237, 0}, {6, 61, 160, 0}, {6, 81, 160, 0}, {6, 101, 160, 0}, {6, 121, 160, 0}, {6, 141, 160, 0}, {6, 156, 160, 0}, {15, 213, 180, 0}, {15, 213, 200, 0}, {7, 60, 22, 0}, {7, 80, 22, 0}, {7, 120, 22, 0}, {7, 100, 22, 0}, {19, 0, 300, 6}, {19, 220, 300, 2}, {15, 213, 88, 0}, {19, 24, 48, 0}, {19, 196, 108, 2}, {19, 196, 160, 4}, {17, 180, 5, 2}, {19, 24, 220, 6}, {6, 117, 295, 0}, {6, 136, 295, 0}, {6, 156, 295, 0}, {6, 97, 295, 0}, {17, 40, 5, 6}, {16, 24, 180, 0}, {16, 24, 200, 0}, {16, 24, 68, 0}, {16, 24, 88, 0}, {6, 176, 295, 0}, {7, 200, 0, 0}, {19, 196, 48, 4}, {7, 140, 22, 0}, {7, 160, 22, 0}, {16, 0, 238, 0}, {16, 0, 254, 0}, {16, 0, 280, 0}, {16, 0, 274, 0}, {7, 20, 317, 0}, {7, 40, 317, 0}, {15, 237, 240, 0}, {15, 237, 260, 0}, {15, 237, 275, 0}, {15, 237, 292, 0}, {6, 184, 48, 0}, {7, -146, 36, 0}, {7, 176, 237, 0}, {6, 176, 160, 0}, {12, 209, 310, 0}, {12, 24, 309, 4}, {17, 196, 295, 4}, {17, 24, 295, 0}, {6, 77, 295, 0}, {6, 57, 295, 0}, {6, 43, 295, 0}, {12, 193, 1, 6}, {12, 40, 1, 2}, {7, 44, 125, 0}, {7, 64, 125, 0}, {7, 84, 125, 0}}};
        this.a(imageArray[0][0][0], 3, sArray, 0, 0, 240, 320);
        k.setColor(this.m);
        k.drawString("\u5b58\u6863", 120, 4, 1 | 0x10);
        int n2 = 48;
        String[] stringArray = new String[]{"\u5b58\u6863\u4e00", "\u5b58\u6863\u4e8c"};
        String[] stringArray2 = new String[]{"\u65e0", "\u4e0b\u6c34\u9053", "\u57ce\u5821\u4e2d\u5ead", "\u90aa\u6076\u56fe\u4e66\u9986", "\u7ea2\u8272\u793c\u62dc\u5802", "", ""};
        for (int j = 0; j < byArray.length; ++j) {
            if (this.d.ah[112 + j] > 0) {
                this.a(stringArray[j] + " \u730e\u624b\u6a21\u5f0f", 46, n2 + j * 112 + 8, 4 | 0x10, k, com.cwa.gamelib.b.aC[0], 0xFF0000, 0);
            } else {
                k.drawString(stringArray[j], 46, n2 + j * 112 + 8, 4 | 0x10);
            }
            if (nArray[j][0] == -1) {
                k.drawString("\u73a9\u5bb6\u7b49\u7ea7:\u65e0", 46, n2 + j * 112 + 8 + this.c, 4 | 0x10);
            } else {
                k.drawString("\u73a9\u5bb6\u7b49\u7ea7:" + nArray[j][0], 46, n2 + j * 112 + 8 + this.c, 4 | 0x10);
            }
            k.drawString("\u5730\u70b9:" + stringArray2[nArray[j][1] + 1], 46, n2 + j * 112 + 8 + this.c * 2, 4 | 0x10);
            if (byArray2[2] != j) continue;
            gameutils.a.a(imageArray[sArray[8][0]][0][0], sArray[8][1], sArray[8][2], sArray[8][3], sArray[8][4], 30, n2 + j * 117 + 20, 4 | 0x10, 3, k);
        }
        k.drawString("\u63090\u952e\u5220\u9664\u5b58\u6863", 120, 300, 1 | 0x10);
        this.a(imageArray, nArrayArray[1], 0, 0, sArray);
        if (n == 0) {
            this.a(imageArray, nArrayArray[0], 8, 16, sArray);
            k.setColor(0xFF0000);
            k.drawString("\u662f\u5426\u5220\u9664\u6863\u6848\uff1f", 120, 126, 1 | 0x10);
            k.setColor(this.m);
        }
        this.a(imageArray, 0, sArray);
    }

    public void a(Image[][][] imageArray, Image[][][] imageArray2, byte[] byArray, byte[] byArray2, int n, int n2, byte by, short[] sArray, short[] sArray2, short[][] sArray3) {
        int n3;
        int n4;
        int n5;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 101, 0}, {6, 40, 101, 0}, {6, 84, 99, 0}, {6, 136, 101, 0}, {6, 171, 101, 0}, {6, 70, 99, 0}, {6, 107, 101, 0}, {13, 147, 101, 0}, {6, 127, 101, 0}, {14, 104, 99, 0}, {6, 151, 101, 0}, {19, 200, 118, 4}, {13, 191, 101, 0}, {16, 20, 116, 0}, {16, 20, 136, 0}, {16, 20, 156, 0}, {16, 20, 176, 0}, {19, 20, 184, 6}, {7, 40, 201, 0}, {7, 60, 201, 0}, {7, 80, 201, 0}, {7, 100, 201, 0}, {7, 120, 201, 0}, {7, 140, 201, 0}, {7, 160, 201, 0}, {7, 180, 201, 0}, {19, 200, 184, 2}, {15, 217, 138, 0}, {15, 217, 158, 0}, {15, 217, 172, 0}, {6, 184, 118, 0}, {6, 164, 118, 0}, {6, 144, 118, 0}, {6, 46, 101, 0}, {6, 124, 118, 0}, {6, 116, 118, 0}, {19, 63, 99, 0}, {6, 23, 118, 0}, {6, 43, 118, 0}, {6, 46, 118, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 1, 1, sArray3);
        k.setColor(this.m);
        int[] nArray = new int[]{51, -1, 41, -1, 48, -1, 50, -1, 49, -1, 46, -1, 47, -1, 45, -1, 44, -1, 43, -1, 30, 25, 31, 25, 27, 25, 29, 25, 28, 25, 30, 24, 31, 24, 27, 24, 29, 24, 28, 24, 30, 23, 31, 23, 27, 23, 29, 23, 28, 23, 32, 23, 32, 23, 32, 23, 32, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 41, -1, 41, -1, 41, -1, 41, -1, 0, 0, 0, 0};
        byte by2 = -1;
        int n6 = 30;
        int n7 = 135;
        boolean bl = false;
        int[] nArray2 = new int[]{42, 52};
        for (n5 = 0; n5 < n2; ++n5) {
            by2 = Math.abs((n5 - n + byArray2[2] + byArray.length) % byArray.length);
            for (n4 = 0; n4 < 2; n4 += 2) {
                if (sArray[byArray[by2]] > 0) {
                    gameutils.a.a(imageArray[sArray3[nArray[byArray[by2] * 2]][0]][0][0], sArray3[nArray[byArray[by2] * 2]][1], sArray3[nArray[byArray[by2] * 2]][2], sArray3[nArray[byArray[by2] * 2]][3], sArray3[nArray[byArray[by2] * 2]][4], n6 + 2, n7 + n5 * this.c, 4 | 0x10, 0, k);
                    if (nArray[byArray[by2] * 2 + 1] < 0) continue;
                    gameutils.a.a(imageArray[sArray3[nArray[byArray[by2] * 2 + 1]][0]][0][0], sArray3[nArray[byArray[by2] * 2 + 1]][1], sArray3[nArray[byArray[by2] * 2 + 1]][2], sArray3[nArray[byArray[by2] * 2 + 1]][3], sArray3[nArray[byArray[by2] * 2 + 1]][4], n6 + 2, n7 + n5 * this.c, 4 | 0x10, 0, k);
                    continue;
                }
                gameutils.a.a(imageArray[sArray3[52][0]][0][0], sArray3[52][1], sArray3[52][2], sArray3[52][3], sArray3[52][4], n6 + 2, n7 + n5 * this.c, 4 | 0x10, 0, k);
            }
            k.drawString("x" + sArray2[byArray[by2]], n6 + 39, n7 + n5 * this.c, 4 | 0x10);
            if (sArray[byArray[by2]] > 0) {
                k.drawString(com.cwa.gamelib.b.ch[byArray[by2]], n6 + 80 - 15, n7 + n5 * this.c, 4 | 0x10);
            } else {
                k.drawString("\u672a\u77e5", n6 + 80 - 15, n7 + n5 * this.c, 4 | 0x10);
            }
            n4 = 20;
            n3 = 150;
            if (by2 != byArray2[2]) continue;
            gameutils.a.a(imageArray[sArray3[nArray2[this.o[4] / 2]][0]][0][0], sArray3[nArray2[this.o[4] / 2]][1], sArray3[nArray2[this.o[4] / 2]][2], sArray3[nArray2[this.o[4] / 2]][3], sArray3[nArray2[this.o[4] / 2]][4], n6 + 2, n7 + n5 * this.c, 4 | 0x10, 0, k);
            if (sArray[byArray[by2]] > 0) {
                for (int j = 1; j < com.cwa.gamelib.b.h[1][3][byArray[by2]].length; ++j) {
                    k.drawString(com.cwa.gamelib.b.h[1][3][byArray[by2]][j], n4 + 10, n3 + 75 + (j - 1) * this.c, 4 | 0x10);
                }
                continue;
            }
            k.drawString("\u672a\u83b7\u5f97\u8be5\u7269\u54c1", n4 + 6, n3 + 75, 4 | 0x10);
        }
        n5 = byArray.length - 1;
        n4 = 190;
        n3 = 129;
        this.a(imageArray, sArray3, n4, n3, (int)byArray2[2], 65, n5);
        this.a(imageArray, 0, sArray3);
    }

    public void a(Image[][][][] imageArray, byte[] byArray, byte[] byArray2, int n, short[][][] sArray) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{21, 0, 0, 4}, {20, 11, 2, 0}, {20, 27, 2, 0}, {20, 43, 2, 0}, {20, 59, 2, 0}, {20, 75, 2, 0}, {20, 91, 2, 0}, {21, 107, 0, 0}}};
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        k.setColor(320);
        this.a(imageArray[n][sArray[n][15][0]][0][0], 18, sArray[n], 0, 0, 240, 320);
        String[] stringArray = new String[]{"\u5f00\u59cb", "\u8bbe\u7f6e", "\u5e2e\u52a9", "\u5173\u4e8e", "\u79bb\u5f00"};
        int n2 = 130;
        int n3 = 170;
        for (int j = 0; j < byArray.length; ++j) {
            if (j == byArray2[2]) continue;
            this.a(imageArray[n], nArrayArray[0], n2 + 10, n3 + j * 22, sArray[n]);
            k.setColor(this.m);
            k.drawString(stringArray[j], n2 + 48 + 23, n3 + j * 22 + 3, 1 | 0x10);
        }
        this.a(imageArray[n], nArrayArray[0], n2 + 10 - 16, n3 + byArray2[2] * 22 + 2, sArray[n]);
        k.setColor(this.m);
        k.drawString(stringArray[byArray2[2]], n2 - 16 + 48 + 23, n3 + byArray2[2] * 22 + 5, 1 | 0x10);
        this.a(imageArray[24], 1, sArray[24]);
    }

    public void a(int n, int n2) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setColor(this.m);
        k.drawString("\u8bf7\u6309\u6570\u5b570\u952e", n, n2, 1 | 0x10);
    }

    public void b(Image[][][] imageArray, byte[] byArray, byte[] byArray2, short[][] sArray) {
        int n;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        int[][][] nArrayArray = new int[][][]{new int[][]{{5, 83, 0, 4}, {2, 20, 0, 0}, {2, 40, 0, 0}, {2, 60, 0, 0}, {1, 20, 19, 0}, {0, 0, 18, 0}, {1, 40, 19, 0}, {1, 60, 19, 0}, {1, 74, 19, 0}, {5, 0, 0, 0}, {0, 83, 18, 4}, {2, 80, 0, 0}}};
        for (n = 0; n < 25; ++n) {
            if (this.d.u < 4) {
                gameutils.a.a(imageArray[sArray[this.d.u + 54][0]][0][0], sArray[this.d.u + 54][1], sArray[this.d.u + 54][2], sArray[this.d.u + 54][3], sArray[this.d.u + 54][4], 0, n * 16, 4 | 0x10, 0, k);
                gameutils.a.a(imageArray[sArray[this.d.u + 54][0]][0][0], sArray[this.d.u + 54][1], sArray[this.d.u + 54][2], sArray[this.d.u + 54][3], sArray[this.d.u + 54][4], 120, n * 16, 4 | 0x10, 0, k);
                continue;
            }
            gameutils.a.a(imageArray[sArray[54][0]][0][0], sArray[54][1], sArray[54][2], sArray[54][3], sArray[54][4], 0, n * 16, 4 | 0x10, 0, k);
            gameutils.a.a(imageArray[sArray[54][0]][0][0], sArray[54][1], sArray[54][2], sArray[54][3], sArray[54][4], 120, n * 16, 4 | 0x10, 0, k);
        }
        n = 140;
        int n2 = 150;
        String[] stringArray = new String[]{"\u8fd4\u56de\u6e38\u620f", "\u6e38\u620f\u8bbe\u7f6e", "\u67e5\u770b\u5e2e\u52a9", "\u56de\u4e3b\u83dc\u5355"};
        for (int j = 0; j < byArray.length; ++j) {
            if (j == byArray2[2]) continue;
            this.a(imageArray, nArrayArray[0], n, n2 - 10 + j * 38, sArray);
            k.setColor(this.m);
            k.drawString(stringArray[j], n + 52, n2 - 10 + 8 + j * 38, 1 | 0x10);
        }
        this.a(imageArray, nArrayArray[0], n - 16, n2 - 10 + 4 + byArray2[2] * 38, sArray);
        k.setColor(this.m);
        k.drawString(stringArray[byArray2[2]], n - 16 + 52, n2 - 10 + 12 + byArray2[2] * 38, 1 | 0x10);
        this.a(imageArray, 0, sArray);
    }

    public void a(Image[][][] imageArray, byte[] byArray, byte[] byArray2, int n, int n2, byte[] byArray3, Image[][][][] imageArray2, short[][][] sArray, short[][][][] sArray2, short[][][][] sArray3, short[][][] sArray4, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 20, 101, 0}, {6, 40, 101, 0}, {6, 84, 101, 0}, {6, 171, 102, 0}, {6, 107, 99, 0}, {6, 127, 99, 0}, {6, 151, 102, 0}, {19, 200, 118, 4}, {13, 191, 102, 0}, {16, 20, 116, 0}, {16, 20, 136, 0}, {16, 20, 156, 0}, {16, 20, 176, 0}, {19, 20, 184, 6}, {7, 40, 201, 0}, {7, 60, 201, 0}, {7, 80, 201, 0}, {7, 100, 201, 0}, {7, 120, 201, 0}, {7, 140, 201, 0}, {7, 160, 201, 0}, {7, 180, 201, 0}, {19, 200, 184, 2}, {15, 217, 138, 0}, {15, 217, 158, 0}, {15, 217, 172, 0}, {6, 184, 118, 0}, {6, 164, 118, 0}, {6, 147, 118, 0}, {6, 87, 118, 0}, {6, 71, 118, 0}, {6, 23, 118, 0}, {13, 61, 101, 0}, {6, 43, 118, 0}, {6, 59, 118, 0}, {19, 104, 99, 0}, {14, 147, 99, 0}, {6, 64, 101, 0}, {6, 41, 101, 0}}};
        k.setClip(0, 0, 240, 320);
        this.a(imageArray, nArrayArray[0], 1, 1, sArray[24]);
        k.setClip(0, 0, 240, 320);
        byte[] byArray4 = new byte[]{0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 4, 0, 0};
        if (this.v != byArray2[0]) {
            this.v = byArray2[0];
            this.z = 0;
            this.w = 0;
        }
        if ((this.w = (byte)(this.w + 1)) > sArray3[this.v][byArray4[this.v - 5]][this.z][1]) {
            this.w = 0;
        }
        if (this.w == 0 && (this.z = (byte)(this.z + 1)) > sArray3[this.v][byArray4[this.v - 5]].length - 2) {
            this.z = 0;
        }
        String[] stringArray = new String[]{"\u4e27\u5c38", "\u8759\u8760", "\u98de\u7334", "\u9b54\u6cd5\u4e66", "\u5e7d\u9aa8\u6218\u58eb", "\u5c0f\u9c7c\u4eba", "\u7ad6\u7434", "\u76d4\u7532\u5175", "\u5deb\u5973", "\u6b7b\u795e", "\u98de\u7334\u9996\u9886", "\u9b45\u9b54", "\u9c7c\u4eba", "\u4f2f\u7235"};
        int[] nArray = new int[]{-16, -16, -16, -16, -16, -16, -16, -31, -16, -8, -16, -16, -28, -28};
        k.setColor(this.m);
        k.setClip(22, 103, 33, 43);
        int n8 = 80;
        int n9 = 131;
        if (this.d.bp[byArray2[0] - 5] > 0) {
            this.a(byArray2[0], byArray4[byArray2[0] - 5], this.z, 1, 53, 137 + nArray[byArray2[0] - 5], imageArray2[byArray2[0]], sArray, sArray2, sArray3, sArray4, 0, 0);
            k.setClip(0, 0, 240, 320);
            k.drawString(stringArray[byArray2[0] - 5], n8, n9, 4 | 0x10);
            if (byArray2[0] < 14) {
                k.drawString("\u7ecf\u9a8c\u503c:" + com.cwa.gamelib.b.cd[byArray2[0]], n8, n9 + this.c, 4 | 0x10);
            } else {
                k.drawString("\u7ecf\u9a8c\u503c\u5f88\u9ad8", n8, n9 + this.c, 4 | 0x10);
            }
            k.drawString(com.cwa.gamelib.b.h[1][4][byArray2[0] - 5][0], n8, n9 + this.c * 2, 4 | 0x10);
            n7 = 0;
            n6 = 0;
            for (n5 = 0; n5 < com.cwa.gamelib.b.aq[byArray2[0]].length; n5 += 2) {
                k.drawString(com.cwa.gamelib.b.ch[com.cwa.gamelib.b.aq[byArray2[0]][n5]], 25 + 100 * n7, 225 + n6 * this.c, 4 | 0x10);
                if (++n7 <= 1) continue;
                n7 = 0;
                ++n6;
            }
            if (byArray2[0] >= 14) {
                int n10 = this.d.ah[107 + byArray2[0] - 14] * 80 / 1000;
                n5 = n10 / 3600;
                n7 = (n10 - n5 * 3600) / 60;
                n6 = n10 - n5 * 3600 - n7 * 60;
                if (this.d.ah[106] > 0) {
                    k.drawString("\u6700\u5feb\u6218\u6597\u65f6\u95f4:", 25, 225 + this.c, 4 | 0x10);
                    if (n5 == 0 && n7 == 0 && n6 == 0) {
                        k.drawString("\u8fd8\u6ca1\u6709\u8bb0\u5f55!", 30, 225 + this.c * 2, 4 | 0x10);
                    } else {
                        k.drawString(n5 + "\u65f6" + n7 + "\u5206" + n6 + "\u79d2", 30, 225 + this.c * 2, 4 | 0x10);
                    }
                }
            }
        } else {
            k.setClip(0, 0, 240, 320);
            k.drawString("\u540d\u79f0:\u672a\u77e5", n8, n9, 4 | 0x10);
            k.drawString("\u7ecf\u9a8c\u503c:\u672a\u77e5", n8, n9 + this.c, 4 | 0x10);
            k.drawString("\u8fd8\u672a\u83b7\u5f97\u8be5\u602a\u7269\u4fe1\u606f", 25, 225, 4 | 0x10);
        }
        k.setClip(0, 0, 240, 320);
        n5 = byArray.length - 1;
        n7 = 190;
        n6 = 129;
        this.a(imageArray, sArray[24], n7, n6, (int)byArray2[2], 65, n5);
        this.a(imageArray, 0, sArray[24]);
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, Image[][][] imageArray, short[][][] sArray, short[][][][] sArray2, short[][][][] sArray3, short[][][] sArray4, int n7, int n8) {
        int n9 = n;
        int n10 = n3;
        int n11 = -1;
        int n12 = n5 - n7;
        int n13 = 260 - (n6 - n8);
        int n14 = n2;
        short s = sArray3[n9][n14][n10][1];
        int[][] nArray = new int[2][3];
        int[] nArray2 = new int[2];
        int[] nArray3 = new int[2];
        for (int j = 0; j < sArray2[n9][s].length; ++j) {
            n11 = sArray2[n9][s][j][0];
            nArray2 = this.d.b(sArray, sArray2, n9, s, j);
            nArray3 = this.d.a(sArray, sArray2, n9, (int)s, j);
            nArray = this.d.a(sArray2, n9, (int)s, j);
            int n15 = this.d.a(nArray);
            if (n4 == 2) {
                nArray2[0] = 0 - (nArray2[0] + nArray3[0]);
            }
            k.setClip(0, 43, 240, 260);
            k.clipRect(n12 + nArray2[0] + 0, n13 + nArray2[1] + 43, nArray3[0], nArray3[1]);
            gameutils.a.a(imageArray[sArray[n9][n11][0]][0], n12 + nArray2[0] + 0, n13 + nArray2[1] + 43, sArray[n9][n11][1], sArray[n9][n11][2], sArray[n9][n11][3], sArray[n9][n11][4], n4, 4 | 0x10, k, n15);
        }
    }

    public void a(short[] sArray, Image[] imageArray, Image[] imageArray2, boolean bl, int n, short[][] sArray2) {
        k.setClip(0, 0, 240, 320);
        switch (n) {
            case 1: {
                break;
            }
            case 3: {
                k.fillRect(0, 320 + sArray2[0][1] + 43, 240, (int)(-sArray2[0][1]));
            }
        }
    }

    public void a(i i2, Image[][][][] imageArray, short[][][] sArray, short[][][][] sArray2, short[][][][] sArray3, short[][][] sArray4, short[][][] sArray5, int n, int n2, int n3, int n4, int n5, int n6) {
        if (!((i2.aR & 0xFFFFFF7F) < 5 || (i2.aR & 0xFFFFFF7F) >= 19 || ((f)i2).an[2] && ((f)i2).aA)) {
            return;
        }
        int[] nArray = null;
        short[] sArray6 = null;
        int n7 = i2.aR & 0xFFFFFF7F;
        int n8 = i2.aV;
        int n9 = -1;
        int n10 = i2.C - n;
        int n11 = 260 - (i2.A - n2);
        if (n7 <= 4) {
            nArray = ((d)i2).aI;
            sArray6 = ((d)i2).aB;
        } else if (n7 < 19) {
            nArray = ((f)i2).ad;
            sArray6 = ((f)i2).V;
        }
        byte by = i2.T[0];
        short s = sArray3[n7][by][n8][1];
        int[][] nArray2 = new int[2][3];
        int[] nArray3 = new int[2];
        int[] nArray4 = new int[2];
        for (int j = 0; j < sArray2[n7][s].length; ++j) {
            n9 = sArray2[n7][s][j][0];
            nArray3 = this.d.b(sArray, sArray2, n7, s, j);
            nArray4 = this.d.a(sArray, sArray2, n7, (int)s, j);
            nArray2 = this.d.a(sArray2, n7, (int)s, j);
            if (i2.K == 2) {
                nArray3[0] = 0 - (nArray3[0] + nArray4[0]);
            }
            int n12 = this.d.a(nArray2);
            k.setClip(0 + n3, 0 + n4, n5, n6);
            k.clipRect(n10 + nArray3[0] + 0, n11 + nArray3[1] + 43, nArray4[0], nArray4[1]);
            gameutils.a.a(imageArray[n7][sArray[n7][n9][0]][0], n10 + nArray3[0] + 0, n11 + nArray3[1] + 43, sArray[n7][n9][1], sArray[n7][n9][2], sArray[n7][n9][3], sArray[n7][n9][4], i2.K, 4 | 0x10, k, n12);
        }
        k.setClip(0, 0, 240, 320);
        k.setColor(0xFF0000);
        if (sArray6 != null && i2.am[1] < i2.am[0]) {
            this.a(nArray[3], imageArray[25][0][0][0], i2.am[2] - 8 - n + 0, 260 - (i2.am[3] + i2.am[1] * 2 - n2) + 43, 4 | 0x10, sArray[25]);
        }
    }

    public void a(short[][] sArray, Image[] imageArray, int n, int n2, short[][] sArray2, Graphics graphics, int n3, int n4) {
        Graphics graphics2 = graphics == null ? k : graphics;
        graphics2.setClip(0, 43, n3, n4);
        int n5 = n / 20;
        int n6 = n2 / 20;
        int n7 = n3 / 20 + (n3 % 20 == 0 ? 0 : 1);
        int n8 = n4 / 20 + (n4 % 20 == 0 ? 0 : 1);
        if (sArray.length >= 1 && sArray[0].length > 0) {
            int n9 = -1;
            for (int j = n5 > 0 ? n5 - 1 : n5; j < n5 + n7 + (n % 20 == 0 ? 0 : 1); ++j) {
                for (int k = n6; k < n6 + n8 + (n2 % 20 == 0 ? 0 : 1); ++k) {
                    if (j < 0 || j >= sArray.length || k < 0 || k >= sArray[0].length || (n9 = sArray[j][k] >> 3) < 0 || n9 >= sArray2.length) continue;
                    gameutils.a.a(imageArray[sArray2[n9][0]], sArray2[n9][1], sArray2[n9][2], sArray2[n9][3], sArray2[n9][4], j * 20 - n + 0, n4 - (k * 20 - n2) + 43, 4 | 0x20, sArray[j][k] & 7, graphics2);
                }
            }
        }
    }

    public void a(short[] sArray, Image[] imageArray, int n, int n2, short[][] sArray2, Graphics graphics, int n3, int n4) {
        Graphics graphics2 = graphics == null ? k : graphics;
        int n5 = n / 20;
        int n6 = n2 / 20;
        graphics2.setClip(0, 43, n3, n4);
        for (int j = 0; j < sArray.length; j += 3) {
            if (sArray[j + 2] < 0) continue;
            int n7 = sArray[j + 2] >> 3;
            if (this.e[0] == this.e[1]) {
                if (n7 == 56) {
                    sArray[j + 2] = (short)(sArray[j + 2] & 7 | ++n7 << 3);
                } else if (n7 == 57) {
                    sArray[j + 2] = (short)(sArray[j + 2] & 7 | --n7 << 3);
                }
            }
            if (sArray[j] + sArray2[n7][3] / 20 < n5 || sArray[j] > n5 + n3 / 20 || sArray[j + 1] + sArray2[n7][4] / 20 < n6 - 1 || sArray[j + 1] > n6 + n4 / 20 + 1) continue;
            gameutils.a.a(imageArray[sArray2[n7][0]], sArray2[n7][1], sArray2[n7][2], sArray2[n7][3], sArray2[n7][4], sArray[j] * 20 - n + 0, n4 - (sArray[j + 1] * 20 - n2) + 43, 4 | 0x20, sArray[j + 2] & 7, graphics2);
        }
    }

    public void a(int[][] nArray, Image[] imageArray, int n, int n2, int n3, short[][] sArray) {
        byte[][][] byArrayArray = new byte[][][]{new byte[][]{{77, 0, 0, 78, -1, -1}, {101, 0, 1, 103, 0, 0}}, new byte[][]{{29, 0, 0, 31, 0, 0}, {29, 0, 0, 31, 0, 0}}, new byte[][]{new byte[0], {77, 0, 0, 49, 0, 0}}, new byte[][]{{68, 0, 0, 69, 0, 0}}, new byte[0][]};
        byte[][][][] byArrayArray2 = new byte[][][][]{new byte[][][]{new byte[][]{{78, -1, -1}}, new byte[][]{{103, 0, 0}}}, new byte[][][]{new byte[][]{{32, 0, -4}}, new byte[][]{{33, 0, -1}}}, new byte[][][]{new byte[][]{{54, 0, 0}}, new byte[0][]}, new byte[][][]{new byte[0][]}};
        k.setClip(0, 0, 240, 320);
        if (--this.t <= 0) {
            this.t = 2;
            if (++this.f >= 2) {
                this.f = 0;
            }
        }
        for (int j = 0; j < nArray.length; ++j) {
            if (nArray[j][3] != 1) continue;
            for (int k = 0; k < byArrayArray2[n][nArray[j][2]].length; ++k) {
                gameutils.a.a(imageArray[sArray[byArrayArray2[n][nArray[j][2]][k][0]][0]], sArray[byArrayArray2[n][nArray[j][2]][k][0]][1], sArray[byArrayArray2[n][nArray[j][2]][k][0]][2], sArray[byArrayArray2[n][nArray[j][2]][k][0]][3], sArray[byArrayArray2[n][nArray[j][2]][k][0]][4], nArray[j][0] + byArrayArray2[n][nArray[j][2]][k][1] * 20 - n2 + 0, 260 - (nArray[j][1] + byArrayArray2[n][nArray[j][2]][k][2] * 20 - n3) + 43, 4 | 0x20, 0, a.k);
            }
            if (byArrayArray[n][nArray[j][2]].length <= 0) continue;
            gameutils.a.a(imageArray[sArray[byArrayArray[n][nArray[j][2]][this.f * 3]][0]], sArray[byArrayArray[n][nArray[j][2]][this.f * 3]][1], sArray[byArrayArray[n][nArray[j][2]][this.f * 3]][2], sArray[byArrayArray[n][nArray[j][2]][this.f * 3]][3], sArray[byArrayArray[n][nArray[j][2]][this.f * 3]][4], nArray[j][0] + byArrayArray[n][nArray[j][2]][this.f * 3 + 1] * 20 - n2 + 0, 260 - (nArray[j][1] + byArrayArray[n][nArray[j][2]][this.f * 3 + 2] * 20 - n3) + 43, 4 | 0x20, 0, k);
        }
    }

    public void a(Image[][][] imageArray, int n, int n2, int n3, short[][] sArray) {
        gameutils.a.a(imageArray[sArray[n][0]][0][0], sArray[n][1], sArray[n][2], sArray[n][3], sArray[n][4], n2, n3, 4 | 0x10, 0, k);
    }

    public void a(Image[][][] imageArray, String[] stringArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, short[][] sArray) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int n17 = 0;
        int n18 = 0;
        int n19 = n11;
        int n20 = n12;
        int n21 = 0;
        int n22 = 0;
        n19 = n11;
        switch (n6) {
            case 0: {
                n17 = n9;
                n18 = n10;
                n20 = n8 * n7;
                break;
            }
            case 1: {
                n17 = n9;
                n18 = n10 - (n8 * n7 >> 1);
                n20 = n8 * n7;
                break;
            }
        }
        n21 = n17 + 4;
        n22 = n18 + 4;
        if ((n16 & 1) == 1) {
            n21 = n17 + (n11 >> 1);
        }
        if ((n16 & 2) == 2) {
            n22 = n18 + (n12 >> 1);
        }
        k.setClip(n17 + 0, n18 + 43, n19, n20);
        k.setColor(n3);
        k.fillRect(n17 + 0, n18 + 43, n19, n20 - 1);
        k.setColor(this.m);
        k.drawLine(n17 + 0, n18 + 43, n17 + n19 + 0, n18 + 43);
        k.drawLine(n17 + 0, n18 + n20 - 1 + 43, n17 + n19 + 0, n18 + n20 - 1 + 43);
        if (n13 == 1) {
            k.setColor(n5);
            int n23 = n;
            for (int j = 0; n23 < stringArray.length && j < n2; ++n23, ++j) {
                k.drawString(stringArray[n23], n21 + 0, n22 + j * 16 + 43, n16);
            }
        }
    }

    public void a(int n, int n2, int n3, int n4) {
        k.setClip(n, n2, n3, n4);
    }

    public void a(String string, int n, int n2, int n3, Font font, int n4, int n5, int n6, int n7, int n8) {
        k.setFont(font);
        k.setClip(n5, n6, n7, n8);
        k.setColor(n4);
        k.drawString(string, n, n2, n3);
    }

    public void a(String[] stringArray, int n, int n2) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.clipRect(0, 0, 240, 320);
        k.setColor(this.m);
        for (int j = 0; j < stringArray.length; ++j) {
            if (n + j * n2 <= 0) continue;
            k.drawString(stringArray[j], 120, n + j * n2, 1 | 0x10);
        }
    }

    public void keyPressed(int n) {
        this.d.g(n);
    }

    public void a(Image[][][] imageArray, int n, int n2, short[][] sArray, short s) {
        int[][][] nArrayArray = new int[][][]{new int[][]{{19, 12, 17, 0}, {14, 133, 15, 0}, {6, 28, 17, 0}, {6, 142, 31, 0}, {6, 44, 17, 0}, {6, 53, 17, 0}, {6, 44, 31, 0}, {6, 51, 31, 0}, {6, 28, 31, 0}, {19, 149, 31, 4}, {6, 117, 15, 0}, {6, 101, 15, 0}, {6, 85, 15, 0}, {16, 12, 47, 0}, {16, 12, 63, 0}, {16, 12, 79, 0}, {16, 12, 95, 0}, {16, 12, 111, 0}, {16, 12, 127, 0}, {16, 12, 143, 0}, {16, 12, 159, 0}, {19, 12, 174, 6}, {19, 149, 174, 2}, {7, 28, 187, 0}, {7, 44, 187, 0}, {7, 60, 187, 0}, {7, 76, 187, 0}, {7, 92, 187, 0}, {7, 108, 187, 0}, {7, 124, 187, 0}, {7, 139, 187, 0}, {15, 162, 47, 0}, {15, 162, 63, 0}, {15, 162, 79, 0}, {15, 162, 95, 0}, {15, 162, 111, 0}, {15, 162, 127, 0}, {15, 162, 143, 0}, {15, 162, 159, 0}, {19, 12, 31, 0}, {12, 67, 25, 0}, {19, 69, 15, 0}}, new int[][]{{5, 0, 0, 0}, {5, 96, 0, 4}, {2, 16, 0, 0}, {2, 32, 0, 0}, {2, 48, 0, 0}, {2, 64, 0, 0}, {2, 80, 0, 0}, {1, 16, 32, 0}, {0, 0, 32, 0}, {1, 32, 32, 0}, {1, 48, 32, 0}, {1, 64, 32, 0}, {1, 80, 32, 0}, {0, 96, 32, 4}, {4, 0, 16, 0}, {4, 96, 16, 4}, {3, 16, 16, 0}, {3, 32, 16, 0}, {3, 48, 16, 0}, {3, 64, 16, 0}, {3, 80, 16, 0}}};
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        int n3 = n * 80 / 1000;
        int n4 = n3 / 3600;
        int n5 = (n3 - n4 * 3600) / 60;
        int n6 = n3 - n4 * 3600 - n5 * 60;
        this.a(imageArray, nArrayArray[1], 56, 95, sArray);
        if (s == 1) {
            k.drawString("\u8bb0\u5f55\u66f4\u65b0!", 72, 100, 4 | 0x10);
        } else if (s == 3) {
            k.drawString("\u6218\u6597\u65f6\u95f4:", 72, 100, 4 | 0x10);
        }
        k.drawString(n4 + "\u65f6" + n5 + "\u5206" + n6 + "\u79d2", 72, 116, 4 | 0x10);
    }

    public void showNotify() {
        this.d.A();
    }

    public void hideNotify() {
        this.d.i();
    }

    public void keyReleased(int n) {
        this.d.t(n);
    }

    public void a(Image[] imageArray, int n) {
        k.setClip(0, 0, 240, 320);
        if (imageArray[2] == null && imageArray[1] == null) {
            n = 0;
        }
        if (n == 1 && imageArray[1] == null) {
            n = 2;
        }
        if (n == 2 && imageArray[2] == null) {
            n = 1;
        }
        k.setColor(n == 1 ? 0 : 0xFFFFFF);
        k.fillRect(0, 0, 240, 320);
        if (n == 2 || n == 1) {
            k.drawImage(imageArray[n], 120, 160, 1 | 2);
        } else {
            k.setColor(0xFF0000);
            k.drawString("\u6ca1\u6709\u56fe\u7247", 120, 160, 1 | 0x10);
        }
    }

    public void a(Image[][][] imageArray, short[] sArray, short[][] sArray2, byte[] byArray, byte[] byArray2, int n, int n2, int n3, int n4, short[][] sArray3) {
        int n5;
        int n6;
        int n7;
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        for (n7 = 0; n7 < 25; ++n7) {
            if (this.d.u < 4) {
                gameutils.a.a(imageArray[sArray3[this.d.u + 54][0]][0][0], sArray3[this.d.u + 54][1], sArray3[this.d.u + 54][2], sArray3[this.d.u + 54][3], sArray3[this.d.u + 54][4], 0, n7 * 16, 4 | 0x10, 0, k);
                gameutils.a.a(imageArray[sArray3[this.d.u + 54][0]][0][0], sArray3[this.d.u + 54][1], sArray3[this.d.u + 54][2], sArray3[this.d.u + 54][3], sArray3[this.d.u + 54][4], 120, n7 * 16, 4 | 0x10, 0, k);
                continue;
            }
            gameutils.a.a(imageArray[sArray3[54][0]][0][0], sArray3[54][1], sArray3[54][2], sArray3[54][3], sArray3[54][4], 0, n7 * 16, 4 | 0x10, 0, k);
            gameutils.a.a(imageArray[sArray3[54][0]][0][0], sArray3[54][1], sArray3[54][2], sArray3[54][3], sArray3[54][4], 120, n7 * 16, 4 | 0x10, 0, k);
        }
        k.setColor(this.m);
        n7 = 0;
        byte by = 0;
        int n8 = 12;
        short s = 0;
        short s2 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 3;
        int n14 = 4;
        int n15 = 88;
        int n16 = 128;
        if (n3 > 0) {
            gameutils.a.a(imageArray[sArray3[10][0]][0][0], sArray3[10][1], sArray3[10][2], sArray3[10][3], sArray3[10][4], 1, 160, 4 | 2, 3, k);
        }
        if (n3 < 32) {
            gameutils.a.a(imageArray[sArray3[10][0]][0][0], sArray3[10][1], sArray3[10][2], sArray3[10][3], sArray3[10][4], 239, 160, 8 | 2, 1, k);
        }
        if (n4 < 21) {
            gameutils.a.a(imageArray[sArray3[10][0]][0][0], sArray3[10][1], sArray3[10][2], sArray3[10][3], sArray3[10][4], 120, 1, 1 | 0x10, 0, k);
        }
        if (n4 > 0) {
            gameutils.a.a(imageArray[sArray3[10][0]][0][0], sArray3[10][1], sArray3[10][2], sArray3[10][3], sArray3[10][4], 120, 272, 1 | 0x20, 2, k);
        }
        k.drawRect(7, 7, 225, 257);
        k.setClip(8, 8, 224, 256);
        int n17 = 0;
        int n18 = 0;
        for (n6 = 0; n6 < sArray.length; n6 += 3) {
            n7 = byArray2[sArray[n6] * 2];
            by = byArray2[sArray[n6] * 2 + 1];
            k.setColor(0xFFFFFF);
            k.fillRect(n15 + (sArray[n6 + 1] - n3) * n8 - 2, 320 - n16 - (sArray[n6 + 2] - n4 + by) * n8 - 2, n7 * n8 + 4, by * n8 + 4);
        }
        n6 = 0;
        int[][] nArrayArray = new int[][]{{10, 11, 9}, {23, 25, 24}, {59, 28, 60}, {65, 66, 64}, {50, 49, 51}, {74, 75, 73}, {90, 91, 88}};
        for (n5 = 0; n5 < sArray.length; n5 += 3) {
            n7 = byArray2[sArray[n5] * 2];
            by = byArray2[sArray[n5] * 2 + 1];
            k.setColor(0x3F3F3F);
            if (byArray[n5 / 3] == 1) {
                k.setColor(24758);
                n6 = this.d.a((byte)sArray[n5]);
                int[] nArray = new int[]{248, 248, 248, 248, 0xF8F800, 0xFF0000, 16362502};
                for (int j = 0; j < nArrayArray.length; ++j) {
                    if (this.d.J != nArrayArray[j][0]) continue;
                    k.setColor(16362502);
                    k.fillRect(n15 + (sArray[nArrayArray[j][1] * 3 + 1] - n3) * n8, 320 - n16 - (sArray[nArrayArray[j][1] * 3 + 2] - n4 + byArray2[sArray[nArrayArray[j][1] * 3] * 2 + 1]) * n8, byArray2[sArray[nArrayArray[j][1] * 3] * 2] * n8, byArray2[sArray[nArrayArray[j][1] * 3] * 2 + 1] * n8);
                    k.setColor(0xFF0000);
                    k.fillRect(n15 + (sArray[nArrayArray[j][2] * 3 + 1] - n3) * n8, 320 - n16 - (sArray[nArrayArray[j][2] * 3 + 2] - n4 + byArray2[sArray[nArrayArray[j][2] * 3] * 2 + 1]) * n8, byArray2[sArray[nArrayArray[j][2] * 3] * 2] * n8, byArray2[sArray[nArrayArray[j][2] * 3] * 2 + 1] * n8);
                }
                if (n6 >= 0) {
                    k.setColor(nArray[n6]);
                }
            }
            k.fillRect(n15 + (sArray[n5 + 1] - n3) * n8, 320 - n16 - (sArray[n5 + 2] - n4 + by) * n8, n7 * n8, by * n8);
            if (byArray[n5 / 3] == 1) {
                k.setColor(0xFFFFFF);
                k.drawRect(n15 + (sArray[n5 + 1] - n3) * n8, 320 - n16 - (sArray[n5 + 2] - n4 + by) * n8, n7 * n8, by * n8);
            }
            n18 += n7 * by;
            if (byArray[n5 / 3] != 1) continue;
            n17 += n7 * by;
        }
        for (n5 = 0; n5 < sArray.length; n5 += 3) {
            for (int j = 0; j < sArray2[n5 / 3].length; j += 3) {
                if (byArray[n5 / 3] == 0) continue;
                s = sArray2[n5 / 3][j + 0];
                s2 = sArray2[n5 / 3][j + 1];
                if ((sArray2[n5 / 3][j + 2] & 8) == 8) {
                    n11 = n9 = n15 + (sArray[n5 + 1] + s + 1 - n3) * n8;
                    n10 = 320 - n16 - (sArray[n5 + 2] + s2 + 1 - n4) * n8 + n13;
                    n12 = 320 - n16 - (sArray[n5 + 2] + s2 - n4) * n8 - n13;
                    k.setColor(24710);
                    k.drawLine(n9, n10, n11, n12);
                    k.setColor(0xFFFFFF);
                    k.drawLine(n9 - 1, n10, n9 + 1, n10);
                    k.drawLine(n9 - 1, n12, n9 + 1, n12);
                }
                if ((sArray2[n5 / 3][j + 2] & 4) == 4) {
                    n11 = n9 = n15 + (sArray[n5 + 1] + s - n3) * n8;
                    n10 = 320 - n16 - (sArray[n5 + 2] + s2 + 1 - n4) * n8 + n13;
                    n12 = 320 - n16 - (sArray[n5 + 2] + s2 - n4) * n8 - n13;
                    k.setColor(24710);
                    k.drawLine(n9, n10, n11, n12);
                    k.setColor(0xFFFFFF);
                    k.drawLine(n9 - 1, n10, n9 + 1, n10);
                    k.drawLine(n9 - 1, n12, n9 + 1, n12);
                }
                if ((sArray2[n5 / 3][j + 2] & 1) == 1) {
                    n9 = n15 + (sArray[n5 + 1] + s - n3) * n8 + n13;
                    n11 = n15 + (sArray[n5 + 1] + s + 1 - n3) * n8 - n13;
                    n12 = n10 = 320 - n16 - (sArray[n5 + 2] + s2 + 1 - n4) * n8;
                    k.setColor(24710);
                    k.drawLine(n9, n10, n11, n12);
                    k.setColor(0xFFFFFF);
                    k.drawLine(n9, n10, n9, n12);
                    k.drawLine(n11, n10, n11, n12);
                }
                if ((sArray2[n5 / 3][j + 2] & 2) != 2) continue;
                n9 = n15 + (sArray[n5 + 1] + s - n3) * n8 + n13;
                n11 = n15 + (sArray[n5 + 1] + s + 1 - n3) * n8 - n13;
                n12 = n10 = 320 - n16 - (sArray[n5 + 2] + s2 - n4) * n8;
                k.setColor(24710);
                k.drawLine(n9, n10, n11, n12);
                k.setColor(0xFFFFFF);
                k.drawLine(n9, n10, n9, n12);
                k.drawLine(n11, n10, n11, n12);
            }
        }
        k.setColor(0xFF0000);
        k.fillRect(n15 + (n * n8 / 240 - n3 * n8), 320 - (n2 * n8 / 320 - n4 * n8) - n16, 2, 2);
        gameutils.a.a(n15 + (n * n8 / 240 - n3 * n8), 320 - (n2 * n8 / 320 - n4 * n8) - n16, this.s, 0xFFFFFF, k);
        this.s += 2;
        if (this.s > 10) {
            this.s = 2;
        }
        k.setClip(0, 0, 240, 320);
        n5 = 20;
        int n19 = 278;
        k.setColor(0xFF0000);
        k.fillRect(n5, n19, 12, 12);
        k.setColor(0xFFFF00);
        k.fillRect(n5 + 120, n19, 12, 12);
        k.setColor(this.m);
        k.drawString("\u5b58\u6863\u623f\u95f4", n5 + 15, n19, 4 | 0x10);
        k.drawString("\u5408\u6210\u623f\u95f4", n5 + 120 + 15, n19, 4 | 0x10);
        n17 = n17 * 1000 / n18;
        k.drawString(n17 / 10 + "." + n17 % 100 + "%", 120, 319, 1 | 0x20);
        this.a(imageArray, 2, sArray3);
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, Graphics graphics) {
        Graphics graphics2 = graphics == null ? k : graphics;
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

    public void b(Image[][][] imageArray, short[][] sArray) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setClip(0, 0, 240, 320);
        this.c(imageArray, sArray);
        String[] stringArray = new String[]{"\u8fbe\u5230\u66f4\u9ad8\u7b49", "\u7ea7\u3001\u5236\u9020\u66f4", "\u5f3a\u5927\u7684\u6b66\u5668", "\u518d\u6765\u7ee7\u7eed\u6311", "\u6218\u5427!"};
        k.setColor(this.m);
        this.a("\u6e38\u620f\u7ed3\u675f", 120, 30, 1 | 0x10, k, com.cwa.gamelib.b.aC[0], 0xFF0000, 0);
        for (int j = 0; j < stringArray.length; ++j) {
            k.drawString(stringArray[j], 120, 45 + (j * 2 + 1) * (this.c + 2), 1 | 0x10);
        }
        k.drawString("\u6309\u6570\u5b570\u952e\u8bfb\u6863", 120, 315, 1 | 0x20);
    }

    public void b(int n, int n2, int n3, int n4) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        int n5 = 150;
        int n6 = 3;
        int n7 = 240 - n5 >> 1;
        int n8 = 295;
        k.setClip(0, 0, 240, 320);
        k.setColor(0);
        k.fillRect(0, 0, 240, 320);
        k.setColor(n);
        k.fillRect(n7, n8, n5, n6);
        k.setColor(n2);
        k.fillRect(n7, n8, n3 * n5 / n4, n6);
        k.drawString("\u52a0\u8f7d\u6570\u636e..." + n3 * 100 / n4 + "%", 120, n8 - 5, 1 | 0x20);
    }

    public void d() {
        k.setClip(0, 0, 240, 320);
        k.setColor(0);
        k.fillRect(0, 0, 240, 43);
        k.fillRect(0, 303, 240, 17);
    }

    public void a(int[] nArray) {
        this.o = nArray;
    }

    public void c() {
        new Thread(this).start();
    }

    public void b() {
        this.j = true;
    }

    protected long e() {
        return System.currentTimeMillis();
    }

    public void b(Image[][][] imageArray, byte[] byArray, g g2, int n, short[][] sArray) {
        String[] stringArray = new String[]{"\u730e\u9b54\u4eba v 1.0.0", "\u5ba2\u670d\u7535\u8bdd\uff1a", "4006729806", "010-88901665", "\u5185\u5bb9\u63d0\u4f9b:\u534e\u5a31\u65e0\u7ebf"};
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setColor(this.m);
        int n2 = 20;
        int n3 = 100;
        for (int j = 0; j < stringArray.length; ++j) {
            k.drawString(stringArray[j], 120, n3 + 20 * j, 0x10 | 1);
        }
        this.a(imageArray, 2, sArray);
    }

    public void a(Image[] imageArray, int[] nArray) {
        if (nArray[0] < 45) {
            k.setColor(0xFFFFFF);
            k.fillRect(0, 0, 240, 320);
            k.drawImage(imageArray[5], 120, 160 - imageArray[5].getHeight() / 2, 17);
            nArray[0] = nArray[0] + 1;
        } else {
            nArray[0] = 0;
        }
    }

    public void a(Image[][][] imageArray, byte[] byArray, byte[] byArray2, short[][] sArray) {
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        this.a(k, 0, 0, 240, 320, 1, 0, this.i, this.b, this.a);
        gameutils.a.a(imageArray[sArray[18][0]][0][0], sArray[18][1], sArray[18][2], sArray[18][3], sArray[18][4], 0, 0, 4 | 0x10, 0, k);
        gameutils.a.a(imageArray[sArray[18][0]][0][0], sArray[18][1], sArray[18][2], sArray[18][3], sArray[18][4], 240, 0, 8 | 0x10, 1, k);
        boolean bl = false;
        int n = 160;
        int n2 = 25;
        int n3 = (240 - n) / 2;
        int n4 = 40;
        int n5 = 5;
        String[] stringArray = new String[]{"\u5b98\u65b9\u6e38\u620f\u653b\u7565", "\u89d2\u8272\u7b49\u7ea7\u4e0a\u9650", "\u63d0\u5347\u89d2\u8272\u5c5e\u6027", "\u5404\u79cd\u989c\u8272\u5b9d\u77f3"};
        for (int j = 0; j < byArray.length; ++j) {
            boolean bl2 = bl = byArray2[2] == j;
            if (!bl) {
                this.a(imageArray, sArray, n3, n4 + j * (n2 + n5), n, n2, this.b, this.a, bl);
                k.setColor(this.m);
                k.drawString(stringArray[j], n3 + n / 2, n4 + j * (n2 + n5) + 4, 1 | 0x10);
            }
            if (!bl) continue;
            this.a(imageArray, sArray, n3 - 5, n4 + j * (n2 + n5), n, n2, this.b, this.a, bl);
            k.setColor(0xFFFFFF);
            k.drawString(stringArray[j], n3 + n / 2 - 5, n4 + j * (n2 + n5) + 4, 1 | 0x10);
        }
        k.setColor(0xFFFFFF);
        String string = "\u63095\u952e\u67e5\u770b\u8be6\u60c5";
        k.drawString(string, 120, 305, 1 | 0x20);
        this.a(imageArray, 0, sArray);
    }

    public void a(Image[][][] imageArray, short[][] sArray, String[] stringArray, byte by, byte by2) {
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        this.a(k, 0, 0, 240, 320, 1, 0, this.i, this.b, this.a);
        k.setColor(this.m);
        int n = 10;
        int n2 = 50;
        int n3 = 20;
        for (int j = 0; j < stringArray.length; ++j) {
            k.drawString(stringArray[j], n, n2 + j * n3, 0x10 | 4);
        }
        k.setColor(0xFF0000);
        k.drawString("(\u60a8\u8fd8\u9700\u53d1\u9001" + by2 + "\u6761)", n, n2 + stringArray.length * n3, 0x10 | 4);
        if (by == 2) {
            this.a(k, 60, 135, 120, 50, 1, 0, this.i, this.b, this.a);
            k.setColor(this.m);
            k.drawString("\u77ed\u4fe1\u53d1\u9001\u4e2d\u2026\u2026", 120, 150, 1 | 0x10);
        }
        this.a(imageArray, 0, sArray);
    }

    public void a(Image[][][] imageArray, short[][] sArray, String[] stringArray, int n, int n2, int n3) {
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        this.a(k, 0, 0, 240, 320, 1, 0, this.i, this.b, this.a);
        k.setColor(this.m);
        int n4 = 10;
        int n5 = 50;
        int n6 = 20;
        for (int j = 0; j < (stringArray.length + n3 - 1) / n3 && (n - 1) * n3 + j < stringArray.length; ++j) {
            k.drawString(stringArray[(n - 1) * n3 + j], n4, n5 + j * n6, 0x10 | 4);
        }
        k.drawString(n + "/" + n2, 120, 320, 1 | 0x20);
        if (n > 1) {
            gameutils.a.a(imageArray[sArray[24][0]][0][0], sArray[10][1], sArray[10][2], sArray[10][3], sArray[10][4], 90, 320, 1 | 0x20, 3, k);
        }
        if (n < n2) {
            gameutils.a.a(imageArray[sArray[24][0]][0][0], sArray[10][1], sArray[10][2], sArray[10][3], sArray[10][4], 150, 320, 1 | 0x20, 1, k);
        }
        this.a(imageArray, 2, sArray);
    }

    public void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        for (int j = n2; j < n2 + n4; ++j) {
            if (j / n5 % 2 == 0) {
                graphics.setColor(n6);
            } else {
                graphics.setColor(n7);
            }
            graphics.fillRect(n, j, n3, n5);
        }
        graphics.setColor(n8);
        graphics.drawRect(n, n2, n3 - 1, n4 - 1);
        graphics.setColor(n9);
        graphics.drawRect(n + 1, n2 + 1, n3 - 3, n4 - 3);
    }

    public void a(Image[][][] imageArray, short[][] sArray, int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        gameutils.a.a(imageArray[sArray[18][0]][0][0], sArray[18][1], sArray[18][2], sArray[18][3], sArray[18][4], n, n2, 4 | 0x10, 0, k);
        gameutils.a.a(imageArray[sArray[18][0]][0][0], sArray[18][1], sArray[18][2], sArray[18][3], sArray[18][4], n + n3, n2 + n4, 8 | 0x20, 2, k);
        if (bl) {
            k.setColor(0x1B1BB6);
        } else {
            k.setColor(n5);
        }
        k.drawRect(n, n2, n3, n4);
        if (bl) {
            k.setColor(this.m);
        } else {
            k.setColor(n6);
        }
        k.drawRect(n + 1, n2 + 1, n3 - 2, n4 - 2);
    }

    public void f() {
        try {
            this.y.platformRequest("http://3g.qq.com/forward.jsp?from=kjavagame&bid=4");
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            // empty catch block
        }
    }

    public void a(boolean bl) {
        k.setFont(com.cwa.gamelib.b.aC[0]);
        k.setColor(this.m);
        k.drawString("0\u952e=\u8d2d\u4e70\u83dc\u5355", 120, 298, 1 | 0x20);
        this.a("\u88c5\u5907", 240, 298, 8 | 0x20, k, com.cwa.gamelib.b.aC[0], this.m, 0);
        if (bl) {
            this.r += 3;
            if (this.r >= 2000) {
                this.r = 0;
            }
            k.drawString("\u89d2\u8272\u7b49\u7ea7\u5df2\u8fbe\u4e0a\u9650\uff0c\u5982\u679c\u60a8\u9700\u8981\uff0c\u53ef\u4ee5\u53d1\u9001\u77ed\u4fe1\u89e3\u9501\u7b49\u7ea7\u4e0a\u9650", 240 - this.r, 283, 4 | 0x20);
        }
    }

    public void d(Image[][][] imageArray, short[][] sArray) {
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        this.a(k, 0, 0, 240, 320, 1, 0, this.i, this.b, this.a);
        k.setColor(this.m);
        int n = 40;
        int n2 = 30;
        int n3 = 20;
        String[] stringArray = new String[]{"\u60a8\u7684\u89d2\u8272\u5df2\u7ecf\u8fbe\u5230", "\u7b49\u7ea7\u4e0a\u9650\uff0c\u7ee7\u7eed\u6740", "\u602a\u65e0\u6cd5\u83b7\u5f97\u7ecf\u9a8c\u3002", "\u5efa\u8bae\u60a8\u53d1\u9001\u77ed\u4fe1\u89e3", "\u9501\u7b49\u7ea7\u4e0a\u9650\uff0c\u518d\u7ee7", "\u7eed\u63d0\u5347\u7b49\u7ea7\uff01", "", "\u63095\u952e\u8fdb\u5165\u77ed\u4fe1\u83dc\u5355"};
        for (int j = 0; j < stringArray.length; ++j) {
            k.drawString(stringArray[j], n, n2 + j * n3, 0x10 | 4);
        }
        this.a(imageArray, 0, sArray);
    }

    public void a(int n, int n2, int n3) {
        int n4;
        int[][] nArrayArray = new int[][]{{3, 1, 9, 0, 0}, {6, 19, 9, 1, 1}, {7, 1, 9, 0, 1}, {8, 7, 9, 1, 0}, {10, 1, 9, 0, 0}, {56, 1, 9, 0, 1}, {59, 1, 35, 0, 0}, {14, 7, 9, 1, 1}, {19, 1, 9, 0, 1}, {23, 7, 9, 1, 0}, {65, 1, 35, 0, 0}, {69, 19, 8, 1, 1}, {52, 2, 9, 0, 0}, {50, 7, 9, 1, 0}, {45, 1, 22, 0, 1}, {74, 7, 22, 1, 0}, {77, 31, 9, 1, 1}, {84, 1, 9, 0, 0}, {90, 1, 9, 0, 1}, {90, 7, 22, 1, 0}};
        int[][] nArrayArray2 = new int[][]{{13, 5, 9, 0}, {54, 5, 9, 2}, {16, 5, 9, 2}, {20, 13, 7, 4}, {26, 6, 7, 4}, {72, 16, 7, 4}, {79, 16, 7, 4}, {69, 16, 9, 6}, {39, 5, 9, 6}, {39, 7, 23, 6}, {39, 5, 41, 6}, {41, 5, 23, 8}};
        ++this.l;
        int[] nArray = new int[]{65535, 0xFFFF00};
        if (this.l >= nArray.length) {
            this.l = 0;
        }
        String[] stringArray = new String[]{"\u2190", "\u2192", "\u2191", "\u2193"};
        String[] stringArray2 = new String[]{"\u5b58\u6863", "\u5408\u6210"};
        String[] stringArray3 = new String[]{"\u83b7\u5f97\u6ed1\u94f2\u80fd\u529b\u540e", "\u63098\u8e72,\u5411\u53f3\u6ed1\u94f2", "\u83b7\u4e8c\u6bb5\u8df3\u80fd\u529b\u540e", "\u5728\u7a7a\u4e2d\u8fde\u7eed\u8df3\u8dc3", "\u83b7\u5f97\u53d8\u96fe\u80fd\u529b\u540e", "\u63097\u53d8\u96fe\u53ef\u4ee5\u901a\u8fc7", "\u83b7\u5f97\u9ad8\u8df3\u80fd\u529b\u540e", "\u8fde\u630982,\u53ef\u4ee5\u901a\u8fc7", "\u83b7\u5f97\u8759\u8760\u80fd\u529b\u540e", "\u63099\u53d8\u8759\u8760\u5411\u4e0a\u98de"};
        k.setFont(com.cwa.gamelib.b.aC[0]);
        for (n4 = 0; n4 < nArrayArray.length; ++n4) {
            if (nArrayArray[n4][0] != n) continue;
            k.setColor(nArray[this.l]);
            if (nArrayArray[n4][3] == 0) {
                k.drawString(stringArray[nArrayArray[n4][3]] + stringArray2[nArrayArray[n4][4]], nArrayArray[n4][1] * 20 - n2, 260 - (nArrayArray[n4][2] * 20 - n3), 0);
                continue;
            }
            if (nArrayArray[n4][3] != 1) continue;
            k.drawString(stringArray2[nArrayArray[n4][4]] + stringArray[nArrayArray[n4][3]], nArrayArray[n4][1] * 20 - n2, 260 - (nArrayArray[n4][2] * 20 - n3), 0);
        }
        for (n4 = 0; n4 < nArrayArray2.length; ++n4) {
            if (nArrayArray2[n4][0] != n) continue;
            k.setColor(nArray[this.l]);
            k.drawString(stringArray3[nArrayArray2[n4][3]], nArrayArray2[n4][1] * 20 - n2, 260 - ((nArrayArray2[n4][2] + 1) * 20 - n3), 1 | 0x10);
            k.drawString(stringArray3[nArrayArray2[n4][3] + 1], nArrayArray2[n4][1] * 20 - n2, 260 - (nArrayArray2[n4][2] * 20 - n3), 1 | 0x10);
        }
    }

    public void a(Image[][][] imageArray, short[][] sArray, boolean bl, byte by) {
        k.setClip(0, 0, 240, 320);
        k.setFont(com.cwa.gamelib.b.aC[0]);
        this.a(k, 0, 0, 240, 320, 1, 0, this.i, this.b, this.a);
        k.setColor(this.m);
        if (bl) {
            if (by == 0) {
                k.drawString("\u8d2d\u4e70\u6210\u529f", 120, 140, 1 | 0x10);
                k.drawString("\u8bf7\u6309\u786e\u5b9a\u952e", 120, 170, 1 | 0x10);
                this.a(imageArray, 1, sArray);
            } else {
                k.drawString("\u53d1\u9001\u6210\u529f", 120, 140, 1 | 0x10);
                k.drawString("\u7ee7\u7eed\u53d1\u9001\uff1f", 120, 200, 1 | 0x10);
                k.setColor(0xFF0000);
                k.drawString("(\u60a8\u8fd8\u9700\u53d1\u9001" + by + "\u6761)", 120, 170, 1 | 0x10);
                if (this.d.cg == 2) {
                    this.a(k, 45, 135, 150, 50, 1, 0, this.i, this.b, this.a);
                    k.setColor(this.m);
                    k.drawString("\u77ed\u4fe1\u53d1\u9001\u4e2d\u2026\u2026", 120, 150, 1 | 0x10);
                }
                this.a(imageArray, 0, sArray);
            }
        } else {
            k.drawString("\u8d2d\u4e70\u5931\u8d25", 120, 140, 1 | 0x10);
            k.drawString("\u8bf7\u6309\u786e\u5b9a\u952e", 120, 170, 1 | 0x10);
            this.a(imageArray, 1, sArray);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h
extends j {
    public Random a;
    private k a;
    private Image[] a;
    public int h;
    private int[] v;
    private boolean b;
    public byte[] p;
    public byte e;
    public byte f;
    public byte[][][] c;
    private int[] w;
    public r a;
    c[] a;
    private p[] a;
    private p[] b;
    private p a;
    private p[] c;
    private p[] d;
    private p[] e;
    private p b;
    private p c;
    private i[] a;
    private i[] b;
    private p d;
    private i[] c;
    private p e;
    private short[][][] g;
    private short[][] e;
    private short[][] f = 0;
    private short[][] g;
    private int[][] d;
    private short[][] h = 0;
    private int[] x;
    private static int[] y = new int[2];
    private static int[] z = new int[4];
    private Image[][] b;
    private Image[][] c;
    private int y = 0;
    private q a;
    private Object[] a;
    private int[] A;
    private int z;
    int[] p;
    private int A = 0;
    public byte[] q;
    private int[] B;
    private int[] C;
    private boolean c = false;
    private int B = 80;
    private int[] D;
    private int[][] e;
    private int C = -1;
    private int D;
    private int[] E;
    private String d;
    private byte g;
    private byte[] z = 0;
    private boolean d;
    private boolean e = null;
    private b a;
    private int[] F;
    private int E;
    public int i;
    private int F;
    private Image[] b = false;
    public Image a;
    public Image[][] a = new Image[10];

    public h(k k2) {
        this.v = new int[]{0, 0, 0, 0, 0, 0};
        this.p = new byte[5];
        this.c = new byte[5][5][3];
        this.w = new int[4];
        this.a = new c[0];
        this.a = new p[0];
        this.b = new p[0];
        this.a = new p();
        this.c = new p[0];
        this.d = new p[0];
        this.e = new p[0];
        this.c = new p();
        this.a = new i[0];
        this.b = new i[0];
        this.d = new p();
        this.c = new i[0];
        this.x = new int[2];
        this.b = new Image[10][];
        this.c = new Image[60][];
        this.a = new q();
        this.a = new Object[10];
        this.A = new int[4];
        this.p = new int[]{40, 33};
        this.q = new byte[2];
        this.B = new int[2];
        this.C = new int[4];
        this.D = new int[21];
        this.e = new int[2][3];
        this.E = new int[34];
        int[] nArray = new int[]{1200000, 1200000, 1200000, 1200000, 1200000};
        this.d = "";
        this.g = 0;
        this.z = new byte[]{41, 45, 43, 44};
        this.d = false;
        this.e = true;
        this.F = new int[3];
        this.E = -1;
        this.i = 0;
        this.F = 3;
        this.b = new Image[10];
        this.a = null;
        this.a = new Image[3][2];
        this.a = k2;
        this.a.a = new int[16][12];
        this.c.a = new int[12][12];
        this.d.a = new int[30][12];
        if (this.a == null) {
            this.a = new b(this.a.a);
        }
        if (b.a() == 0) {
            this.b = g.a("/data/data/smsData_qq.mid");
            this.a = g.a("/data/data/smsString_qq.mid");
            return;
        }
        if (b.a() == 1) {
            this.b = g.a("/data/data/smsData_mdo.mid");
            this.a = g.a("/data/data/smsString_mdo.mid");
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        block213: {
            block214: {
                block212: {
                    if (this.p[0] != 29) break block212;
                    var1_1 = this;
                    if (var1_1.h(-7) == 1) {
                        var1_1.a(-7, 0);
                        var1_1.p[0] = var1_1.A;
                        if (var1_1.C >= 0) {
                            var1_1.c(var1_1.C, -1);
                        }
                    }
                    break block213;
                }
                var1_2 = this;
                if (var1_2.a != false) break block213;
                if (var1_2.d[44] <= 0) break block214;
                if (var1_2.d[47] > 0 && var1_2.d[68] == false) {
                    var1_2.I();
                }
                break block213;
            }
            block0 : switch (var1_2.p[0]) {
                case 27: {
                    if (var1_2.b.g != 49 || var1_2.d[74] != false || var1_2.h(48) != 1) break;
                    var1_2.a(48, 0);
                    var1_2.A();
                    var1_2.q[0] = 0;
                    break;
                }
                case 33: {
                    break;
                }
                case 41: {
                    break;
                }
                case 32: {
                    break;
                }
                case 42: {
                    if (var1_2.h(-6) == 1 || var1_2.h(-5) == 1 || var1_2.h(53) == 1) {
                        var1_2.r();
                        q.b(1);
                        q.a();
                        var1_2.w[0] = var1_2.w[1];
                        var1_2.n(27);
                        var1_2.o(27);
                        var1_2.c(5, -1);
                        h.a(var1_2.p, 27);
                        h.a(var1_2.q, 0);
                        var1_2.b = false;
                        var1_2.d[74] = var1_2.d[34] < 0 ? (Object)1000 : (p)25;
                    }
                    if (var1_2.h(-7) != 1) break;
                    var1_2.r();
                    q.a(1);
                    q.a();
                    var1_2.w[0] = var1_2.w[1];
                    var1_2.n(27);
                    var1_2.o(27);
                    var1_2.c(5, -1);
                    h.a(var1_2.p, 27);
                    h.a(var1_2.q, 0);
                    var1_2.b = false;
                    if (var1_2.d[34] < 0) {
                        var1_2.d[74] = (p)1000;
                        break;
                    }
                    var1_2.d[74] = (p)25;
                    break;
                }
                case 7: {
                    switch (var1_2.q[0]) {
                        case 2: {
                            var1_2.z();
                            if (var1_2.h(-6) == 1 || var1_2.h(-5) == 1 || var1_2.h(53) == 1) {
                                switch (var1_2.c[var1_2.c[var1_2.e][var1_2.p[var1_2.e]][0]]) {
                                    case 26: {
                                        h.a(var1_2.q, 0);
                                        var1_2.c(var1_2.e[0][0], -1);
                                        var1_2.b = false;
                                        break;
                                    }
                                    case 20: {
                                        var1_2.A();
                                        break;
                                    }
                                    case 6: {
                                        var1_2.N();
                                        h.a(var1_2.p, 4);
                                        h.a(var1_2.q, 3);
                                        break;
                                    }
                                    case 2: {
                                        var1_2.N();
                                        var1_2.d[66] = (p)false;
                                        var1_2.d[67] = (p)2;
                                        var1_2.Q();
                                        h.a(var1_2.p, 4);
                                        h.a(var1_2.q, 4);
                                        break;
                                    }
                                    case 30: {
                                        var1_2.c(var1_2.e[0][0], -1);
                                        var1_2.b = true;
                                        h.a(var1_2.p, 7);
                                        h.a(var1_2.q, 13);
                                        var1_2.Q();
                                        var1_2.d[17] = (p)((short)(var1_2.x[0] / 240 + var1_2.d[var1_2.q][(var1_2.p << 2) + true]));
                                        var1_2.d[18] = (p)((short)(var1_2.x[1] / 320 + var1_2.d[var1_2.q][(var1_2.p << 2) + 2]));
                                        break;
                                    }
                                    case 33: {
                                        if (var1_2.k[0] != 1) break;
                                        var1_2.J();
                                        break;
                                    }
                                    case 31: {
                                        if (var1_2.b[0][3] < var1_2.b[0][2]) break;
                                        var1_2.q(0);
                                    }
                                }
                                var1_2.r();
                            }
                            if (var1_2.h(-7) != 1 && var1_2.h(-11) != 1) break block0;
                            h.a(var1_2.q, 0);
                            var1_2.c(var1_2.e[0][0], -1);
                            var1_2.b = false;
                            var1_2.r();
                            break;
                        }
                        case 13: {
                            var1_2.B();
                            break;
                        }
                        case 24: {
                            if (var1_2.h(53) != 1 && var1_2.h(-5) != 1 && var1_2.h(-6) != 1 && var1_2.h(-7) != 1) break block0;
                            var1_2.r();
                            var1_2.x();
                            var1_2.Q();
                            var1_2.a.b();
                            var1_2.p[var1_2.e] = 1;
                            var1_2.f = 0;
                            if (var1_2.a.b == 2) {
                                var1_2.a[var1_2.a.a][3] = (Random)false;
                                var1_2.c[0][0][0] = 0;
                                var1_2.c[0][0][1] = 0;
                                var1_2.c[0][0][2] = 0;
                            } else if (var1_2.a.b == 3) {
                                var1_2.a[var1_2.a.a][5] = (Random)false;
                                var1_2.c[0][0][0] = 1;
                                var1_2.c[0][0][1] = 1;
                                var1_2.c[0][0][2] = 0;
                            } else if (var1_2.a.b == 4) {
                                var1_2.a[var1_2.a.a][7] = (Random)false;
                                var1_2.c[0][0][0] = 2;
                                var1_2.c[0][0][1] = 2;
                                var1_2.c[0][0][2] = 0;
                            }
                            var1_2.d[32] = (p)false;
                            var1_2.N();
                            var1_2.b = true;
                            h.a(var1_2.p, 4);
                            h.a(var1_2.q, 28);
                            break;
                        }
                        case 23: {
                            if (var1_2.h(53) != 1 && var1_2.h(-5) != 1 && var1_2.h(-6) != 1 && var1_2.h(-7) != 1) break block0;
                            var1_2.r();
                            var1_2.b = false;
                            h.a(var1_2.p, 7);
                            h.a(var1_2.q, 0);
                            var1_2.q[0] = 0;
                            break;
                        }
                        case 25: {
                            if (var1_2.h(53) != 1 && var1_2.h(-5) != 1 && var1_2.h(-6) != 1 && var1_2.h(-7) != 1) break block0;
                            var1_2.r();
                            var1_2.b = false;
                            h.a(var1_2.p, 7);
                            h.a(var1_2.q, 0);
                            var1_2.q[0] = 0;
                            if (var1_2.a == null || !(var1_2.a[0].g == 14 && var1_2.i[8][1] == false || var1_2.a[0].g == 15 && var1_2.i[10][1] == false) && (var1_2.a[0].g != 16 || var1_2.i[15][1] != false)) break block0;
                            var1_2.k(127);
                            break;
                        }
                        case 19: {
                            if (var1_2.f == 0) {
                                if (var1_2.h(-6) == 1 || var1_2.h(-5) == 1 || var1_2.h(53) == 1) {
                                    var1_2.r();
                                    var1_2.b = false;
                                    h.a(var1_2.p, 32);
                                    var1_2.w[2] = 0;
                                    var1_2.N();
                                }
                                if (var1_2.h(-7) != 1) break block0;
                                var1_2.r();
                                var1_2.A();
                                break;
                            }
                            if (var1_2.f != 1) break block0;
                            if (var1_2.h(-6) == 1 || var1_2.h(-5) == 1 || var1_2.h(53) == 1) {
                                var1_2.r();
                                var1_2.k[8] = var1_2.k[8] - 1;
                                var1_2.a.a[0] = var1_2.a.a[1];
                                var1_2.a.d[0] = var1_2.a.d[1];
                                var1_2.a.a[1] = false;
                                var1_2.a.h = true;
                                h.a(var1_2.a, 0, 0);
                                var1_2.l[0] = 10;
                                var1_2.a(var1_2.a, 19, var1_2.d[90] == true ? 81 : 80, 0, 0, var1_2.a.e, 26, 1, 1, -1, 1, 0);
                                var1_2.a.a[0] = 2;
                                var1_2.b = false;
                                h.a(var1_2.p, 7);
                                h.a(var1_2.q, 0);
                                var1_2.c(var1_2.e[1][0], -1);
                            }
                            if (var1_2.h(-7) != 1) break block0;
                            var1_2.f = 0;
                            var1_2.a(-7, 0);
                            if (var1_2.b[0][3] < var1_2.b[0][2]) break block0;
                            var1_2.q(3);
                            break;
                        }
                        case 0: {
                            if (var1_2.d[58] != false) break block213;
                            if (var1_2.h(-6) == 1) {
                                var1_2.a(-6, 0);
                                var1_2.K();
                                var1_2.b = true;
                                h.a(var1_2.q, 2);
                                var1_2.Q();
                                var1_2.x();
                                var1_2.N();
                                var1_2.c[0][0][0] = 4;
                            }
                            if (var1_2.h(48) == 1) {
                                var1_2.a(48, 0);
                                var1_2.Q();
                                var1_2.d[17] = (p)((short)(var1_2.x[0] / 240 + var1_2.d[var1_2.q][(var1_2.p << 2) + true]));
                                var1_2.d[18] = (p)((short)(var1_2.x[1] / 320 + var1_2.d[var1_2.q][(var1_2.p << 2) + 2]));
                                var1_2.K();
                                var1_2.b = true;
                                h.a(var1_2.p, 7);
                                h.a(var1_2.q, 13);
                            }
                            if (var1_2.h(-7) == 1) {
                                var1_2.a(-7, 0);
                                var1_2.K();
                                var1_2.N();
                                var1_2.x();
                                var1_2.Q();
                                var1_2.b = true;
                                h.a(var1_2.p, 4);
                                h.a(var1_2.q, 11);
                                var2_3 = var1_2;
                                var2_3.v[0] = 0;
                            }
                            if (var1_2.k[0] == 1 && var1_2.h(42) == 1) {
                                var1_2.a(42, 0);
                                var1_2.J();
                            }
                            if (var1_2.h(35) == 1) {
                                var1_2.a(35, 0);
                                if (var1_2.b[0][3] >= var1_2.b[0][2]) {
                                    var1_2.q(0);
                                }
                            }
                            if (var1_2.b || var1_2.a.a[9]) break block213;
                            if (!(var1_2.h(57) != 1 && var1_2.h(55) != 1 || var1_2.a.e[0] != 1 && var1_2.a.e[0] != 0 && var1_2.a.e[0] != 2 && var1_2.a.e[0] != 3 && var1_2.a.e[0] != 7 && var1_2.a.e[0] != 17 && var1_2.a.e[0] != 10 && var1_2.a.e[0] != 12 && var1_2.a.e[0] != 19 || var1_2.d[6] <= 0 && (var1_2.d[6] != false || var1_2.a.d[0] < h.l((int)var1_2.h[var1_2.a.f][12])))) {
                                if (var1_2.d[6] == false && var1_2.q != false) {
                                    var1_2.a.d[0] = var1_2.a.d[0] - h.l((int)var1_2.h[var1_2.a.f][12]);
                                }
                                switch (var1_2.h[var1_2.a.f][4]) {
                                    case 0: {
                                        h.a(var1_2.a, 13, 0);
                                        break;
                                    }
                                    case 1: {
                                        var1_2.a(55, 0);
                                        var1_2.a(57, 0);
                                        h.a(var1_2.a, 22, 0);
                                        break;
                                    }
                                    case 2: {
                                        h.a(var1_2.a, 23, 0);
                                    }
                                }
                            }
                            if (var1_2.a.e[0] == 12 || var1_2.a.e[0] == 19) {
                                var1_2.d[56] = var1_2.h(53) == 1 || var1_2.h(-5) == 1 ? (Object)true : (p)false;
                            }
                            var1_2.d[57] = var1_2.h(53) == 1 || var1_2.h(-5) == 1 ? (Object)true : (p)false;
                            if (var1_2.d[37] == true) {
                                if (var1_2.h(53) == 1 || var1_2.h(-5) == 1) {
                                    var1_2.a(53, 0);
                                    var1_2.a(-5, 0);
                                    var1_2.k(27);
                                }
                            } else if (var1_2.d[28] == true) {
                                if (var1_2.h(53) == 1 || var1_2.h(-5) == 1) {
                                    var1_2.a(53, 0);
                                    var1_2.a(-5, 0);
                                    var1_2.k(29);
                                }
                            } else if (var1_2.d[49] == true) {
                                if (var1_2.h(53) == 1 || var1_2.h(-5) == 1) {
                                    var1_2.a(53, 0);
                                    var1_2.a(-5, 0);
                                    if (var1_2.q == true && var1_2.b[0][2] > var1_2.b[0][3]) {
                                        var1_2.q(0);
                                    } else if (var1_2.i[var1_2.s[0]][0] == false) {
                                        if (var1_2.i[var1_2.s[0]][1] == false) {
                                            var1_2.k(48 + var1_2.s[0]);
                                        } else {
                                            var1_2.k(31);
                                        }
                                    } else {
                                        if (var1_2.s[0] == 2 && var1_2.d[97] == true) {
                                            var1_2.d[97] = (p)false;
                                        }
                                        if (var1_2.s[0] == 1) {
                                            v0 = new int[]{-1, -1, 3, -1, 5, 7, -1, -1, 9, -1, 11, -1, 13, -1, -1, 16, -1, 18, -1, -1, 21, -1};
                                            var2_3 = v0;
                                            if (v0[var1_2.q] >= 0 && var1_2.i[var2_3[var1_2.q]][1] == false && var1_2.p == var1_2.a[1][var1_2.q][((Random)var1_2.a[1][var1_2.q]).length - 1]) {
                                                var1_2.k(94 + var2_3[var1_2.q]);
                                            }
                                            var1_2.k(128);
                                        } else if (var1_2.s[0] == 6 || var1_2.s[0] == 14 || var1_2.s[0] == 19) {
                                            if (var1_2.s[0] == 6) {
                                                var1_2.a.m[1] = 1000;
                                            } else if (var1_2.s[0] == 14) {
                                                var1_2.a.m[1] = 10000;
                                            } else if (var1_2.s[0] == 19) {
                                                var1_2.a.m[1] = 30000;
                                            }
                                            var1_2.k(160);
                                        } else {
                                            var1_2.k(129);
                                        }
                                    }
                                }
                            } else if ((var1_2.h(53) == 1 || var1_2.h(-5) == 1) && var1_2.d[57] == true) {
                                if (var1_2.a.e[0] == 1 || var1_2.a.e[0] == 0 || var1_2.a.e[0] == 2 || var1_2.a.e[0] == 3 || var1_2.a.e[0] == 7 || var1_2.a.e[0] == 17 || var1_2.a.e[0] == 8 || var1_2.a.e[0] == 14 || var1_2.a.e[0] == 9 || var1_2.a.e[0] == 10) {
                                    if (var1_2.a.a[5]) {
                                        h.a(var1_2.a, 11, 0);
                                    } else {
                                        h.a(var1_2.a, 16, 0);
                                    }
                                    var1_2.a.h = true;
                                } else if (var1_2.a.e[0] == 12) {
                                    if (var1_2.a.a[5]) {
                                        h.a(var1_2.a, 18, 0);
                                    }
                                } else if (var1_2.a.e[0] == 19 && var1_2.a.a[5]) {
                                    h.a(var1_2.a, 20, 0);
                                }
                            }
                            if (var1_2.h(50) == 1 || var1_2.h(-1) == 1) {
                                var1_2.a(50, 0);
                                var1_2.a(-1, 0);
                                if (var1_2.a.a[4] && (!var1_2.a.a[6] && var1_2.u != 2 || var1_2.u == 2)) {
                                    if (var1_2.a.e[0] == 8 || var1_2.a.e[0] == 9 || var1_2.a.e[0] == 14) {
                                        if (var1_2.a.a[14]) {
                                            var1_2.a.a[14] = false;
                                        }
                                        var1_2.a.a[6] = true;
                                        var1_2.a.a((byte[][][])var1_2.b, (int)var1_2.d[90], 0, 0);
                                        var1_2.a.b = (short)(var1_2.a.b | 1);
                                        var1_2.a.h = true;
                                        var1_2.a((p)var1_2.a, 14, 0);
                                        h.a(var1_2.a, 14, 0);
                                    }
                                } else if (!(!var1_2.a.a[5] || var1_2.a.a[9] || var1_2.a.a[4] || var1_2.a.e[0] != 0 && var1_2.a.e[0] != 1 && var1_2.a.e[0] != 3 && var1_2.a.e[0] != 10 && var1_2.a.e[0] != 12 && var1_2.a.e[0] != 19 && var1_2.a.e[0] != 15 && var1_2.a.e[0] != 7 && var1_2.a.e[0] != 17 && var1_2.a.e[0] != 2 && var1_2.a.e[0] != 11 && var1_2.a.e[0] != 18 && var1_2.a.e[0] != 13)) {
                                    var1_2.a.b = (short)(var1_2.a.b | 1);
                                    var1_2.a.a[4] = true;
                                    var1_2.a.a[5] = false;
                                    var1_2.a.a((byte[][][])var1_2.b, (int)var1_2.d[90], 0, 0);
                                    var1_2.a.h = true;
                                    h.a(var1_2.a, 8, 0);
                                    var1_2.a((p)var1_2.a, 9, 1);
                                }
                            }
                            if (var1_2.h(49) == 1 || var1_2.h(51) == 1) {
                                if (var1_2.a.a[4] && (!var1_2.a.a[6] && var1_2.u != 2 || var1_2.u == 2) && (var1_2.a.e[0] == 8 || var1_2.a.e[0] == 9)) {
                                    var1_2.a.a[14] = true;
                                    var1_2.a.a[6] = true;
                                    var1_2.a.a((byte[][][])var1_2.b, (int)var1_2.d[90], 0, 0);
                                    h.a(var1_2.a, 14, 0);
                                    var1_2.a((p)var1_2.a, 14, 0);
                                    var1_2.a.h = true;
                                }
                                if (!(!var1_2.a.a[5] || var1_2.a.a[9] || var1_2.a.a[4] || var1_2.a.e[0] != 0 && var1_2.a.e[0] != 1 && var1_2.a.e[0] != 3 && var1_2.a.e[0] != 17 && var1_2.a.e[0] != 10 && var1_2.a.e[0] != 15 && var1_2.a.e[0] != 2)) {
                                    var1_2.a.b = (short)(var1_2.a.b | 1);
                                    var1_2.a.a[4] = true;
                                    var1_2.a.a[5] = false;
                                    var1_2.a.a[14] = true;
                                    var1_2.a.a((byte[][][])var1_2.b, (int)var1_2.d[90], 0, 0);
                                    h.a(var1_2.a, 8, 0);
                                    var1_2.a((p)var1_2.a, 9, 1);
                                    var1_2.a.h = true;
                                }
                                if (var1_2.h(49) == 1) {
                                    var1_2.a.c = (short)(var1_2.a.c & 3);
                                    var1_2.a.c = (short)(var1_2.a.c | 4);
                                }
                                if (var1_2.h(51) == 1) {
                                    var1_2.a.c = (short)(var1_2.a.c & 3);
                                    var1_2.a.c = (short)(var1_2.a.c | 8);
                                }
                                var1_2.a(49, 0);
                                var1_2.a(51, 0);
                            }
                            if (var1_2.h(-2) == 1 || var1_2.h(56) == 1) {
                                var1_2.a.a[16] = true;
                                var1_2.a(-2, 0);
                                var1_2.a(56, 0);
                            }
                            if (var1_2.a.e[0] == 15 && (var1_2.a.e[0] != 15 || var1_2.a.a[5])) break block213;
                            if (var1_2.h(52) != 1 && var1_2.h(-3) != 1) ** GOTO lbl371
                            var1_2.a.b = (short)(var1_2.a.b & 3);
                            var1_2.a.b = (short)(var1_2.a.b | 4);
                            if (var1_2.a.a[14]) {
                                var1_2.a.a[14] = false;
                                break;
                            }
                            break block213;
lbl371:
                            // 1 sources

                            if (var1_2.h(54) == 1 || var1_2.h(-4) == 1) {
                                var1_2.a.b = (short)(var1_2.a.b & 3);
                                var1_2.a.b = (short)(var1_2.a.b | 8);
                                if (var1_2.a.a[14]) {
                                    var1_2.a.a[14] = false;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    var1_2.z();
                    switch (var1_2.q[0]) {
                        case 1: {
                            if (var1_2.d[73] == true) {
                                if (var1_2.d[34] > 0) {
                                    var1_2.a((byte[])var1_2.a);
                                    break block0;
                                }
                                var1_2.a((byte[])var1_2.b);
                                break block0;
                            }
                            break block213;
                        }
                        case 11: {
                            if (var1_2.d[var1_2.e] == 22 && var1_2.p[var1_2.e] == 0 && var1_2.c[var1_2.e][0][0] != var1_2.d[46]) {
                                var1_2.d[46] = (p)((short)var1_2.c[var1_2.e][0][0]);
                                for (var2_4 = 0; var2_4 < ((byte)var1_2.e).length; ++var2_4) {
                                    var1_2.c[24][var1_2.e[var2_4]] = var1_2.c[24][var1_2.c[var1_2.a[var1_2.e[var1_2.d[46]]][1]][var2_4]];
                                }
                                var1_2.a(var1_2.a, 11, 52, (int)var1_2.d[13], (int)var1_2.d[14], 1, 24, 1, 1, -1, 2, 0);
                            }
                            if (var1_2.h(-6) != 1 && var1_2.h(-5) != 1 && var1_2.h(53) != 1) ** GOTO lbl471
                            var1_2.r();
                            block48 : switch (var1_2.d[var1_2.e]) {
                                case 22: {
                                    switch (var1_2.p[var1_2.e]) {
                                        case 0: {
                                            if (var1_2.a[var1_2.e[var1_2.c[var1_2.e][0][0]]][0] <= 0) break;
                                            if (var1_2.a.a != var1_2.e[var1_2.c[var1_2.e][0][0]]) {
                                                var1_2.m((int)var1_2.e[var1_2.c[var1_2.e][0][0]]);
                                                var1_2.p[var1_2.e] = 3;
                                                var1_2.f = 0;
                                                break;
                                            }
                                            var1_2.p[var1_2.e] = 3;
                                            var1_2.f = 1;
                                            break;
                                        }
                                        case 3: {
                                            var1_2.p[var1_2.e] = 0;
                                            var1_2.f = 0;
                                        }
                                    }
                                    break;
                                }
                                case 23: {
                                    switch (var1_2.p[var1_2.e]) {
                                        case 0: {
                                            if (var1_2.f[var1_2.c[var1_2.e][0][0]] >= 12 && var1_2.f[var1_2.c[var1_2.e][0][0]] <= 17 && var1_2.k[var1_2.f[var1_2.c[var1_2.e][0][0]]] > 0) {
                                                if (var1_2.f[var1_2.c[var1_2.e][0][0]] >= 12 && var1_2.f[var1_2.c[var1_2.e][0][0]] <= 14) {
                                                    if (var1_2.a.a[0] < var1_2.a.a[1]) {
                                                        var1_2.p[var1_2.e] = 2;
                                                        break block48;
                                                    }
                                                    var1_2.p[var1_2.e] = 3;
                                                    var1_2.f = 1;
                                                    break block48;
                                                }
                                                if (var1_2.f[var1_2.c[var1_2.e][0][0]] == 15) {
                                                    if (var1_2.a.d[0] < var1_2.a.d[1]) {
                                                        var1_2.p[var1_2.e] = 2;
                                                        break block48;
                                                    }
                                                    var1_2.p[var1_2.e] = 3;
                                                    var1_2.f = 1;
                                                    break block48;
                                                }
                                                if (var1_2.f[var1_2.c[var1_2.e][0][0]] == 16) {
                                                    var1_2.p[var1_2.e] = 2;
                                                    break block48;
                                                }
                                                if (var1_2.f[var1_2.c[var1_2.e][0][0]] == 17) {
                                                    if (var1_2.q == false || var1_2.t == 1) {
                                                        var1_2.p[var1_2.e] = 3;
                                                        var1_2.f = 1;
                                                        break block48;
                                                    }
                                                    var1_2.p[var1_2.e] = 2;
                                                    break block48;
                                                }
                                            }
                                            ** GOTO lbl471
                                        }
                                        case 2: {
                                            var1_2.j((int)var1_2.f[var1_2.c[var1_2.e][0][0]]);
                                            if (var1_2.f[var1_2.c[var1_2.e][0][0]] == 17) {
                                                var1_2.p[var1_2.e] = 0;
                                                var1_2.f = 0;
                                                h.a(var1_2.p, 7);
                                                h.a(var1_2.q, 0);
                                                var1_2.b = false;
                                                var1_2.a = (Random)true;
                                                if (var1_2.d[90] == true) {
                                                    var1_2.b[0] = var1_2.b[24];
                                                    var1_2.b[0] = var1_2.b[24];
                                                    var1_2.c[0] = var1_2.c[24];
                                                    var1_2.a[0] = var1_2.a[24];
                                                    var1_2.d[0] = var1_2.d[24];
                                                    var1_2.a.n -= h.f(50);
                                                    var1_2.d[90] = (p)false;
                                                    var1_2.a.a[19][1] = 80;
                                                }
                                                var1_2.a(2, 16, 2);
                                                var1_2.s = 1;
                                                break block48;
                                            }
                                            var1_2.p[var1_2.e] = 3;
                                            var1_2.f = 0;
                                            break block48;
                                        }
                                        case 3: {
                                            var1_2.p[var1_2.e] = 0;
                                            var1_2.f = 0;
                                        }
                                    }
                                }
                            }
lbl471:
                            // 15 sources

                            if (var1_2.h(-7) != 1 && var1_2.h(-11) != 1) break block213;
                            var1_2.a(-7, 0);
                            var1_2.a(-11, 0);
                            switch (var1_2.p[var1_2.e]) {
                                case 0: {
                                    h.a(var1_2.p, 7);
                                    h.a(var1_2.q, 0);
                                    var1_2.c(var1_2.e[0][0], -1);
                                    var1_2.b = false;
                                    for (var2_4 = 0; var2_4 < ((byte)var1_2.e).length; ++var2_4) {
                                        var1_2.c[0][var1_2.e[var2_4]] = var1_2.c[0][var1_2.c[var1_2.a.f][var2_4]];
                                    }
                                    break block213;
                                }
                                case 1: {
                                    var1_2.p[var1_2.e] = 0;
                                    ** break;
                                }
                                case 2: {
                                    if (var1_2.d[var1_2.e] == 22) {
                                        var1_2.p[var1_2.e] = 1;
                                    }
                                    if (var1_2.d[var1_2.e] == 23) {
                                        var1_2.p[var1_2.e] = 0;
                                    }
                                }
                                default: {
                                    ** break;
                                }
                            }
lbl495:
                            // 2 sources

                            break block213;
                        }
                        case 12: {
                            var1_2.C();
                            break block0;
                        }
                        case 13: {
                            var1_2.B();
                            break block0;
                        }
                        case 3: {
                            if (var1_2.h(-3) == 1 || var1_2.h(52) == 1) {
                                q.a((byte)1, false);
                                q.a();
                                var1_2.r();
                            } else if (var1_2.h(-4) == 1 || var1_2.h(54) == 1) {
                                q.a((byte)1, true);
                                q.a();
                                var1_2.r();
                            }
                            if (var1_2.h(-7) == 1 || var1_2.h(-11) == 1) {
                                var1_2.r();
                                h.a(var1_2.p, var1_2.p[1]);
                                h.a(var1_2.q, (int)var1_2.q[1]);
                                if (var1_2.q[0] == 1) {
                                    var1_2.c(var1_2.e[0][0], -1);
                                    break block0;
                                }
                            }
                            break block213;
                        }
                        case 4: {
                            if (var1_2.h(52) == 1 || var1_2.h(-3) == 1) {
                                var1_2.r();
                                var1_2.d[66] = (p)((short)(var1_2.d[66] - true));
                                if (var1_2.d[66] < 0) {
                                    var1_2.d[66] = (p)((short)(var1_2.d[67] - true));
                                }
                            } else if (var1_2.h(-4) == 1 || var1_2.h(54) == 1) {
                                var1_2.r();
                                var1_2.d[66] = (p)((short)(var1_2.d[66] + true));
                                if (var1_2.d[66] > var1_2.d[67] - true) {
                                    var1_2.d[66] = (p)false;
                                }
                            }
                            if (var1_2.h(-7) == 1 || var1_2.h(-11) == 1) {
                                var1_2.r();
                                h.a(var1_2.p, var1_2.p[1]);
                                h.a(var1_2.q, (int)var1_2.q[1]);
                                if (var1_2.q[0] == 1) {
                                    var1_2.c(var1_2.e[0][0], -1);
                                    break block0;
                                }
                            }
                            break block213;
                        }
                        case 5: {
                            var2_5 = var1_2.y;
                            switch (var2_5) {
                                case -7: {
                                    var1_2.r();
                                    h.a(var1_2.p, var1_2.p[1]);
                                    h.a(var1_2.q, (int)var1_2.q[1]);
                                    if (var1_2.q[0] != 1) break;
                                    var1_2.c(var1_2.e[0][0], -1);
                                }
                            }
                            break block0;
                        }
                        case 21: {
                            if (var1_2.h(48) == 1) {
                                var1_2.a(48, 0);
                                h.a(var1_2.p, 4);
                                h.a(var1_2.q, 30);
                                var1_2.d[39] = (p)40;
                                break block0;
                            }
                            break block213;
                        }
                        case 30: {
                            if (var1_2.d[39] == false && var1_2.h(48) == 1) {
                                var1_2.a(48, 0);
                                var1_2.b = false;
                                h.a(var1_2.p, 7);
                                h.a(var1_2.q, 0);
                                var1_2.M();
                                break block0;
                            }
                            break block213;
                        }
                        case 28: {
                            var1_2.H();
                            break block0;
                        }
                        case 31: {
                            var1_2.R();
                            break block0;
                        }
                        case 32: {
                            if (var1_2.p[var1_2.e] == 1) {
                                if (var1_2.h(52) == 1 || var1_2.h(-3) == 1) {
                                    var1_2.r();
                                    var1_2.d[66] = (p)((short)(var1_2.d[66] - true));
                                    if (var1_2.d[66] < 0) {
                                        var1_2.d[66] = (p)((short)(var1_2.d[67] - true));
                                    }
                                } else if (var1_2.h(-4) == 1 || var1_2.h(54) == 1) {
                                    var1_2.r();
                                    var1_2.d[66] = (p)((short)(var1_2.d[66] + true));
                                    if (var1_2.d[66] > var1_2.d[67] - true) {
                                        var1_2.d[66] = (p)false;
                                    }
                                }
                            }
                            if (var1_2.h(-6) == 1 || var1_2.h(-5) == 1 || var1_2.h(53) == 1) {
                                var1_2.r();
                                if (var1_2.p[var1_2.e] == 0) {
                                    var1_2.p[var1_2.e] = 1;
                                    var1_2.d[66] = (p)false;
                                    var1_2.d[67] = (p)((short)((((void)var1_2.b[var1_2.n[var1_2.c[var1_2.e][0][0]]]).length + var1_2.f - 1) / var1_2.f));
                                    break block0;
                                }
                            } else if (var1_2.h(-7) == 1 || var1_2.h(-11) == 1) {
                                var1_2.r();
                                if (var1_2.p[var1_2.e] == 0) {
                                    h.a(var1_2.p, 7);
                                    h.a(var1_2.q, 0);
                                    var1_2.c(var1_2.e[0][0], -1);
                                    var1_2.b = false;
                                    var1_2.b = null;
                                    break block0;
                                }
                                if (var1_2.p[var1_2.e] == 1) {
                                    var1_2.p[var1_2.e] = 0;
                                    break block0;
                                }
                            }
                            break block213;
                        }
                        case 35: {
                            var2_6 = var1_2.y;
                            if (var1_2.h(52) == 1 || var1_2.h(-3) == 1 || var1_2.h(-1) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.c = 0;
                                var1_2.i = var1_2.i > 0 ? --var1_2.i : 2;
                            } else if (var1_2.h(-4) == 1 || var1_2.h(54) == 1 || var1_2.h(-2) == 1 || var1_2.h(55) == 1 || var1_2.h(56) == 1 || var1_2.h(57) == 1 || var1_2.h(48) == 1 || var1_2.h(35) == 1 || var1_2.h(42) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.c = 0;
                                var1_2.i = var1_2.i < 2 ? ++var1_2.i : 0;
                            } else if (var1_2.h(49) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.c = 0;
                                var1_2.i = 0;
                            } else if (var1_2.h(50) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.c = 0;
                                var1_2.i = 1;
                            } else if (var1_2.h(51) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.c = 0;
                                var1_2.i = 2;
                            }
                            var3_7 = "";
                            if (var1_2.i == 0) {
                                var3_7 = GameMIDlet.Tj1Url;
                            } else if (var1_2.i == 1) {
                                var3_7 = GameMIDlet.Tj2Url;
                            } else if (var1_2.i == 2) {
                                var3_7 = GameMIDlet.Tj3Url;
                            }
                            if (var1_2.h(-6) == 1 || var1_2.h(-5) == 1 || var1_2.h(53) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.a(var3_7);
                                System.out.println("url = " + var3_7);
                                var1_2.N();
                                var1_2.a.a();
                                break block0;
                            }
                            if (var1_2.h(-7) == 1) {
                                var1_2.a(var2_6, 0);
                                var1_2.a.c = 0;
                                var1_2.i = 0;
                                h.a(var1_2.p, var1_2.p[1]);
                                h.a(var1_2.q, (int)var1_2.q[1]);
                                var1_2.N();
                                if (var1_2.q[0] == 1) {
                                    var1_2.M();
                                    break block0;
                                }
                            }
                            break block213;
                        }
                        case 33: 
                        case 34: {
                            var1_2.b(var1_2.z, var1_2.y);
                            switch (var1_2.F[0]) {
                                case 40: 
                                case 41: 
                                case 42: 
                                case 43: 
                                case 44: 
                                case 45: 
                                case 46: {
                                    var1_2.a(var1_2.y, var1_2.g, var1_2.F[0]);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.d[3] > 0) {
            this.d[3] = (p)((short)(this.d[3] - true));
        } else {
            this.k();
        }
        this.d[29] = (p)((short)(this.d[29] - true));
        if (this.d[29] <= 0) {
            this.a = (Random)80;
        }
        if (this.t[0] < this.t[2]) {
            this.t[1] = this.t[1] + 1;
            if (this.t[1] >= 45000) {
                this.t[0] = this.t[0] + 1;
                this.t[1] = 0;
                if (this.t[0] >= 3) {
                    this.k(84);
                }
            }
        }
    }

    public final void b() {
        block0 : switch (this.p[0]) {
            case 29: {
                boolean bl = this.b;
                boolean bl2 = this.b;
                Image[][] imageArray = this.c;
                k k2 = this.a;
                if (imageArray[27] != null && imageArray[27].length > 0 && imageArray[27][0] != null) {
                    k2.a(imageArray[27], (short[][])bl[27][0], 0, 320, (short[][])bl2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    k.a.setClip(0, 0, 240, 320);
                    k.a.setFont(k2.a[0]);
                    k.a.setColor(16646090);
                    k.a.drawString("\u6682\u505c", 120, 140, 17);
                    k2.a(imageArray[27], (short[][])bl[27][48], 0, 320, (short[][])bl2[27], (byte)1, 0, 0, 0, 0, 240, 320);
                    break;
                }
                k.a.setClip(0, 0, 240, 320);
                k.a.setFont(k2.a[0]);
                k.a.setColor(16646090);
                k.a.drawString("\u6682\u505c", 120, 140, 17);
                k.a.drawString("\u8fd4\u56de", 240 - (k2.a << 1) - 2, 320 - k2.b, 20);
                break;
            }
            case 4: {
                switch (this.q[0]) {
                    case 11: {
                        switch (this.d[this.e]) {
                            case 21: {
                                boolean bl = this.b;
                                boolean bl3 = this.b;
                                r r2 = this.a;
                                int[] nArray = this.s;
                                Image[][] imageArray = this.c;
                                k k3 = this.a;
                                k3.a(imageArray[27], (short[][])bl[27][1], 0, 320, (short[][])bl3[27], (byte)1, 0, 0, 0, 0, 240, 320);
                                k3.a(imageArray[31], (short[][])bl[31][12], 0, 320, (short[][])bl3[31], (byte)1, 0, 0, 0, 0, 240, 320);
                                k.a(16646090, k3.a[0]);
                                k.a.drawString("\u7b49\u7ea7:" + r2.f[0] + "\u7ea7", 98, 69, 20);
                                k.a.drawString("\u751f\u547d:" + r2.a[0] + "/" + r2.a[1], 98, 96, 20);
                                k.a.drawString("\u9b54\u529b:" + r2.d[0] + "/" + r2.d[1], 98, 123, 20);
                                k.a.drawString("\u653b\u51fb\u529b:" + r2.b[0] + "+" + (int)(k3.a.f[r2.a] * k3.a.b[r2.b] / 100), 43, 150, 20);
                                k.a.drawString("\u9632\u5fa1\u529b:" + r2.c[0] + "+" + r2.c[0] * nArray[2] / 100, 43, 177, 20);
                                k.a.drawString("\u7ecf\u9a8c\u503c:" + r2.e[0] + "/" + r2.e[1], 43, 204, 20);
                                k.a.drawString("5\u952e\u6b66\u5668\u4f24\u5bb3:" + (nArray[0] + 100) + "%", 43, 231, 20);
                                k.a.drawString("9\u952e\u9b54\u6cd5\u4f24\u5bb3:" + (nArray[1] + 100) + "%", 43, 258, 20);
                                break;
                            }
                            case 22: {
                                this.a.a(this.c, this.p[this.e], this.f, this.a, (byte[][])this.a, (int[])this.e, (byte[])this.e, this.c[this.e], this.a, (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                                break;
                            }
                            case 23: {
                                this.a.a(this.c, this.p[this.e], this.a, (byte[])this.f, this.c[this.e], this.k, (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                                break;
                            }
                            case 24: {
                                this.a.a(this.c, this.a, (byte[])this.g, (short[][])this.d, this.c[this.e], this.a, (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                                break;
                            }
                            case 25: {
                                this.a.a(this.c, this.a, (byte[])this.i, this.c[this.e], (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                            }
                        }
                        break;
                    }
                    case 12: {
                        switch (this.j[this.e]) {
                            case 27: {
                                this.a.a(this.c, this.a, this.f, this.k, this.k, this.p[this.e], this.c[this.e], this.a, (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                                break;
                            }
                            case 28: {
                                this.a.a(this.c, this.a, this.f, this.k, this.l, this.m, (byte[][])this.a, this.p[this.e], this.c[this.e], this.a, (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                            }
                        }
                        break;
                    }
                    case 1: {
                        if (this.b[5] == null) {
                            this.b[5] = g.a("/s60/1.png");
                        }
                        if (this.b[6] == null) {
                            this.b[6] = g.a("/s60/2.png");
                        }
                        if (this.d[34] > 0) {
                            this.a.a(this.b, this.c[this.e], (int)this.f, this.e, this.c, (short[][][])this.b, (short[][][][])this.b);
                            break;
                        }
                        this.a.a(this.b, this.c[this.e], (int)this.f, this.e, this.c, (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 21: {
                        p p2 = this.d[65];
                        p p3 = this.d[43];
                        p p4 = this.d[42];
                        Random random = this.a;
                        k k4 = this.a;
                        k.a.setColor(13673568);
                        k.a.setFont(k4.a[0]);
                        k.a.setClip(0, 0, 240, 295);
                        k.a(k.a, (String)((Object)random), 13673568, 240 - p2 >> 1, (int)p4, (int)p3, (int)p2, k4.a[0]);
                        k.b(0, 290, 240, 30, 0);
                        k4.a("\u63090\u952e\u8df3\u8fc7", 120, 295, 17, 0xFFFFFF, k4.a[0]);
                        break;
                    }
                    case 30: {
                        this.a.a((int)this.d[39]);
                        break;
                    }
                    case 3: {
                        this.a.a(this.c, this.a, (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 4: {
                        this.a.a(this.c, this.a, (int)this.d[66], (int)this.d[67], (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 5: {
                        this.a.a(this.c, (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 28: {
                        this.a.a(this.c, (byte[][])this.a, (int[])this.e, (byte[])this.g, this.a, (short[][])this.d, this.p[this.e], this.f, this.c[this.e], this.a, (String[][])this.a[1][0], (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 31: {
                        this.a.a(this.c, this.b ? 1 : 0, (int)this.c, (int)this.d, (String[][])this.a, (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 32: {
                        this.a.a(this.c, this.a, this.p[this.e], this.c[this.e], (String[][])this.b, (int)this.d[66], (int)this.d[67], (int)this.f, (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 35: {
                        if (this.b[3] == null) {
                            this.b[3] = g.a("/s60/left.png");
                        }
                        if (this.b[4] == null) {
                            this.b[4] = g.a("/s60/right.png");
                        }
                        if (this.b[0] == null) {
                            this.b[0] = g.a("/s60/ads.png");
                        }
                        if (this.b[1] == null) {
                            this.b[1] = g.a("/s60/ads1.png");
                        }
                        if (this.b[2] == null) {
                            this.b[2] = g.a("/s60/ads2.png");
                        }
                        if (this.a[0][0] == null) {
                            this.a[0][0] = g.a("/s60/12.png");
                        }
                        if (this.a[0][1] == null) {
                            this.a[0][1] = g.a("/s60/11.png");
                        }
                        if (this.a[1][0] == null) {
                            this.a[1][0] = g.a("/s60/22.png");
                        }
                        if (this.a[1][1] == null) {
                            this.a[1][1] = g.a("/s60/21.png");
                        }
                        if (this.a[2][0] == null) {
                            this.a[2][0] = g.a("/s60/32.png");
                        }
                        if (this.a[2][1] == null) {
                            this.a[2][1] = g.a("/s60/31.png");
                        }
                        if (this.a == null) {
                            this.a = g.a("/s60/loading.png");
                        }
                        this.a.a(this.b, this.i);
                        break;
                    }
                    case 33: 
                    case 34: {
                        switch (this.F[0]) {
                            case 40: 
                            case 41: 
                            case 42: 
                            case 43: 
                            case 44: 
                            case 45: 
                            case 46: {
                                this.a.a(this.F[0], this.E, this.d, this.d, (Font)a[0], this.c, (short[][][])this.b, (short[][][][])this.b);
                            }
                        }
                    }
                }
                break;
            }
            case 42: {
                boolean bl = this.b;
                boolean bl4 = this.b;
                Image[][] imageArray = this.c;
                k k5 = this.a;
                k5.a(imageArray[49], (short[][])bl[49][3], 0, 320, (short[][])bl4[49], (byte)1, 0, 0, 0, 0, 240, 320);
                k5.a("\u662f\u5426\u5f00\u542f\u58f0\u97f3?", 120, 150, 17, 16646090, k5.a[0]);
                k5.a("\u662f", 5, 320 - k5.b, 20, 16646090, k5.a[0]);
                k5.a("\u5426", 240 - k5.a - 5, 320 - k5.b, 20, 16646090, k5.a[0]);
                k5.a("\u5173\u95ed\u58f0\u97f3\u8fd0\u884c\u4f1a\u66f4\u6d41\u7545", 120, 265, 17, 16646090, k5.a[0]);
                k.a(40, 60, 160, 200, 16646090);
                break;
            }
            case 7: {
                this.g();
                switch (this.q[0]) {
                    case 2: {
                        this.a.a(this.c, this.a, (byte[])this.c, this.c[this.e][this.p[this.e]], (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 13: {
                        this.a.a(this.c, 0, this.a, (byte[][][])this.a, (byte[])this.d[this.q], (byte[][])this.f[this.q], (byte[])this.e[this.q], this.r, (int)(this.a.m + this.d[this.q][(this.p << 2) + true] * 240), this.a.n + this.d[this.q][(this.p << 2) + 2] * 320, (int)this.d[17], (int)this.d[18], (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 14: {
                        boolean bl = this.b;
                        boolean bl5 = this.b;
                        byte by = this.f;
                        Image[][] imageArray = this.c;
                        k k6 = this.a;
                        if (by == 0) {
                            k6.a(imageArray[27], (short[][])bl[27][20], 0, 320, (short[][])bl5[27], (byte)1, 0, 0, 0, 0, 240, 320);
                            k6.a(imageArray[27], (short[][])bl[27][10], 0, 320, (short[][])bl5[27], (byte)1, 0, 0, 0, 0, 240, 320);
                            k.a("\u5b58\u50a8\u4e2d\u2026\u2026", 120, 144, 17, k.a, k6.a[0], 16646090, 0);
                            break;
                        }
                        if (by != 1) break block0;
                        k6.a(imageArray[27], (short[][])bl[27][20], 0, 320, (short[][])bl5[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        k6.a(imageArray[27], (short[][])bl[27][10], 0, 320, (short[][])bl5[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        k.a("\u5b58\u50a8\u6210\u529f", 120, 144 - (k6.b + 4) / 2, 17, k.a, k6.a[0], 16646090, 0);
                        k.a("\u751f\u547d\u9b54\u529b\u5168\u6ee1", 120, 144 + (k6.b + 4) / 2, 17, k.a, k6.a[0], 16646090, 0);
                        break;
                    }
                    case 23: {
                        boolean bl = this.b;
                        boolean bl6 = this.b;
                        r r3 = this.a;
                        p p5 = this.a;
                        Object object = this.c;
                        k k7 = this.a;
                        k7.a(object[27], (short[][])bl[27][12], 0, 320, (short[][])bl6[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        k7.a.a(p5.a[4], 0, 0);
                        k.a("\u89d2\u8272\u7b49\u7ea7\u63d0\u5347\uff01", 120, 90, 17, k.a, k7.a[0], 16646090, 0);
                        object = "\u7b49\u7ea7:" + r3.f[2] + "-->#2" + r3.f[0] + "#n#0\u751f\u547d:" + r3.a[2] + "-->#2" + r3.a[0] + "#n#0\u9b54\u529b:" + r3.d[2] + "-->#2" + r3.d[0] + "#n#0\u653b\u51fb:" + r3.b[2] + "-->#2" + r3.b[0] + "#n#0\u9632\u5fa1:" + r3.c[2] + "-->#2" + r3.c[0];
                        k.a(k.a, (String)object, 16646090, 50, 114, 24, 340, k7.a[0]);
                        break;
                    }
                    case 24: {
                        boolean bl = this.b;
                        boolean bl7 = this.b;
                        r r4 = this.a;
                        p p6 = this.d[23];
                        p p7 = this.a;
                        Object object = this.c;
                        k k8 = this.a;
                        k8.a(object[27], (short[][])bl[27][12], 0, 320, (short[][])bl7[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        k8.a.a(p7.a[4], 0, 0);
                        k.a("\u6b66\u5668\u7b49\u7ea7\u63d0\u5347\uff01", 120, 90, 17, k.a, k8.a[0], 16646090, 0);
                        object = "\u7b49\u7ea7:" + (int)p6 + "-->#2" + r4.b + (r4.b >= 4 ? "#1(\u6ee1\u7ea7)" : "") + "#n#0\u653b\u51fb:" + (int)(k8.a.f[r4.a] * k8.a.b[p6] / 100) + "-->#2" + (int)(k8.a.f[r4.a] * k8.a.b[r4.b] / 100);
                        k.a(k.a, (String)object, 16646090, 50, 114, 24, 340, k8.a[0]);
                        k.a(k.a, "\u606d\u559c\uff01\u60a8\u83b7\u5f97\u4e00\u6b21\u6b66\u5668\u9644\u9b54\u673a\u4f1a\uff01\u53ea\u6709\u6b66\u5668\u5347\u7ea7\u624d\u53ef\u9644\u9b54\u3002", 16646090, 40, 162, 24, 165, k8.a[0]);
                        break;
                    }
                    case 22: {
                        boolean bl = this.b;
                        boolean bl8 = this.b;
                        p p8 = this.d[63];
                        int n2 = this.h;
                        Object object = this.c;
                        k k9 = this.a;
                        k9.a(object[27], (short[][])bl[27][49], 0, 320, (short[][])bl8[27], (byte)1, 0, 0, 0, 0, 240, 320);
                        object = k9.a(n2);
                        if (p8 == false) {
                            k9.a("\u51fb\u6740\u65f6\u95f4:", 120, 180, 17, 16646090, k9.a[0]);
                            k9.a((int)object[0] + "\u65f6" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2", 120, 204, 17, 16646090, k9.a[0]);
                            break;
                        }
                        if (p8 != true) break block0;
                        k9.a("\u8bb0\u5f55\u66f4\u65b0!", 120, 180, 17, 16646090, k9.a[0]);
                        k9.a((int)object[0] + "\u65f6" + (int)object[1] + "\u5206" + (int)object[2] + "\u79d2", 120, 204, 17, 16646090, k9.a[0]);
                        break;
                    }
                    case 19: {
                        this.a.a(this.c, this.f, (short[][][])this.b, (short[][][][])this.b);
                        break;
                    }
                    case 25: {
                        this.a.a(this.c, this.a, (byte)this.a[this.q][this.d[22]][1][1], (int)(this.e[this.a[this.q][this.d[22]][1][1]][0][0] - 18), (short[][][])this.b, (short[][][][])this.b);
                    }
                }
                break;
            }
            case 40: {
                this.a[1] = g.a("/s60/logo_mobile.png");
                Image[] imageArray = this.a;
                k k10 = this.a;
                if (k10.a[0] >= 20) break;
                k.a.setColor(255, 144, 0);
                k.a.fillRect(0, 0, 240, 320);
                k.a.drawImage(imageArray[1], 120, 40, 17);
                break;
            }
            case 41: {
                this.f();
                break;
            }
            case 32: 
            case 33: 
            case 36: 
            case 37: 
            case 38: {
                k.b(0, 0, 240, 320, 0);
                k.a(this.c, this.w[2], this.w[3]);
                void var3_17 = this.i[10];
                byte[][][] byArray = this.c;
                k k11 = this.a;
                if (byArray == null) break;
                k.a(0xFFFFFF, k11.a[0]);
                k.a(k.a, (String)byArray[var3_17][0], 0xFFFFFF, 16, 140, k11.b + 2, 210, k11.a[0]);
                break;
            }
            case 34: {
                this.a.a(this.c, 1, this.a, (byte[][][])this.a, (byte[])this.d[this.q], (byte[][])this.f[this.q], (byte[])this.e[this.q], this.r, (int)(this.a.m + this.d[this.q][(this.p << 2) + true] * 240), this.a.n + this.d[this.q][(this.p << 2) + 2] * 320, (int)this.d[17], (int)this.d[18], (short[][][])this.b, (short[][][][])this.b);
                k.a(this.c, this.w[2], this.w[3]);
                break;
            }
            case 35: {
                k.b(0, 0, 240, 320, 0xFFFFFF);
                break;
            }
            case -1: {
                break;
            }
            case 27: {
                if (this.b != null) {
                    k.b(0, 0, 240, 320, (int)this.a[this.b.g - 44][this.d[99]][0]);
                    this.a(this.b.a[1], 120, -160);
                    this.a(this.b.a[0], 120, -160);
                    for (int i2 = 2; i2 < this.b.a.length; ++i2) {
                        if (this.b.a[i2][11] != 0) continue;
                        this.a(this.b.a[i2], 0, 0);
                    }
                }
                if (this.d[1] == true) {
                    k.b(0, 0, 240, 320, 0xFFFFFF);
                    this.d[1] = (p)false;
                }
                if (this.d[10] < this.d[11]) {
                    this.d[10] = (p)((short)(this.d[10] + 2));
                    if (this.d[10] > this.d[11]) {
                        this.d[10] = this.d[11];
                    }
                }
                this.a.a(this.c, this.a, (short)this.d[47], (short)this.d[68], (int)this.q[0], (byte[][])this.g, (String[][][][])this.a, this.c, (short[][][])this.b, (short[][][][])this.b);
                if (this.a[this.b.g - 44][this.d[99]][1] == true) {
                    k.a(128, 13479530, 0, 0, 240, 320, null);
                }
                this.i();
                k.b(0, 0, 240, (int)this.d[10], 0);
                k.b(0, 320 - this.d[10], 240, (int)this.d[10], 0);
                if (this.b.g != 49 || this.d[74] != false) break;
                k k12 = this.a;
                k12.a("\u63090\u952e\u8df3\u8fc7", 120, 320 - k12.b, 17, 0xFFFFFF, k12.a[0]);
            }
        }
        if (this.p[0] != 29) {
            if (this.p[0] != 27 && this.p[0] != 14) {
                this.a.a(this.c, this.a, (short)this.d[47], (short)this.d[68], (int)this.q[0], (byte[][])this.g, (String[][][][])this.a, this.c, (short[][][])this.b, (short[][][][])this.b);
            }
            if (this.p[0] != 27) {
                this.i();
            }
        }
    }

    private void f() {
        int n2;
        if (imageArray.a[0] == null) {
            for (n2 = 1; n2 <= 2; ++n2) {
                imageArray.a[n2] = h.a("/s60/0" + n2 + ".png");
            }
        }
        n2 = 1;
        Image[] imageArray = imageArray.a;
        k.a.setClip(0, 0, 240, 320);
        if (imageArray[2] == null && imageArray[1] == null) {
            n2 = 0;
        }
        if (n2 == 1 && imageArray[1] == null) {
            n2 = 2;
        }
        if (n2 == 2 && imageArray[2] == null) {
            n2 = 1;
        }
        k.a.setColor(n2 == 1 ? 0 : 0xFFFFFF);
        k.a.fillRect(0, 0, 240, 320);
        if (n2 == 2 || n2 == 1) {
            k.a.drawImage(imageArray[n2], 120, 160, 3);
            return;
        }
        k.a.setColor(0xFF0000);
        k.a.drawString("\u6ca1\u6709\u56fe\u7247", 120, 160, 17);
    }

    private p a(int n2, int n3, int n4, int n5, int n6, int n7) {
        p p2 = null;
        p2 = new p();
        if (n7 > 0) {
            p2.a = new int[n7][12];
        }
        p2.g = n2;
        p2.e = true;
        p2.m = n3;
        p2.n = n4;
        p2.h = p2.g;
        this.a(p2, n5, n6);
        return p2;
    }

    private void a(c c2, int n2, int n3, int n4) {
        switch (n2) {
            case 1: {
                c2.a = (c[])true;
                c.a(c2.h, -190, 100, 380, 250);
                this.C = this.a((int)this.p);
                c.a(c2.j, this.C[0], this.C[1] - 40, this.C[2], this.C[3] - 80);
                this.C[0] = n3 - 40;
                this.C[1] = n4 + 40;
                this.C[2] = 80;
                this.C[3] = 80;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 10, this.B[1] + 23);
                return;
            }
            case 2: {
                c2.a = (c[])true;
                c.a(c2.h, -80, 40, 160, 130);
                this.C[0] = n3 - 100;
                this.C[1] = n4;
                this.C[2] = 200;
                this.C[3] = 0;
                c.a(c2.j, this.C[0], this.C[1], this.C[2], this.C[3]);
                this.C[0] = n3 - 80;
                this.C[1] = n4;
                this.C[2] = 160;
                this.C[3] = 0;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 17, this.B[1]);
                return;
            }
            case 3: {
                c2.a = (c[])true;
                c.a(c2.h, -100, 100, 200, 250);
                this.C = this.a((int)this.p);
                c.a(c2.j, this.C[0], this.C[1] - 40, this.C[2], this.C[3] - 80);
                this.C[0] = n3 - 40;
                this.C[1] = n4 + 40;
                this.C[2] = 80;
                this.C[3] = 80;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 14, this.B[1] + 9);
                return;
            }
            case 4: {
                c2.a = (c[])true;
                c.a(c2.h, -50, 150, 100, 350);
                this.C = this.a((int)this.p);
                c.a(c2.j, this.C[0], this.C[1] - 40, this.C[2], this.C[3] - 80);
                this.C[0] = n3 - 40;
                this.C[1] = n4 + 40;
                this.C[2] = 80;
                this.C[3] = 80;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 11, this.B[1] + 28);
                return;
            }
            case 5: {
                c2.g = n2;
                c2.k = 0;
                c2.b = 0;
                c2.a = (c[])-1;
                c2.a = (c[])true;
                c.a(c2.h, -100, 40, 200, 130);
                this.C[0] = n3 - 100;
                this.C[1] = n4;
                this.C[2] = 200;
                this.C[3] = 0;
                c.a(c2.j, this.C[0], this.C[1], this.C[2], this.C[3]);
                this.C[0] = n3 - 80;
                this.C[1] = n4;
                this.C[2] = 160;
                this.C[3] = 0;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 26, this.B[1]);
                return;
            }
            case 6: {
                c2.a = (c[])true;
                c.a(c2.h, -75, 40, 150, 130);
                this.C[0] = n3 - 100;
                this.C[1] = n4;
                this.C[2] = 200;
                this.C[3] = 0;
                c.a(c2.j, this.C[0], this.C[1], this.C[2], this.C[3]);
                this.C[0] = n3 - 60;
                this.C[1] = n4;
                this.C[2] = 120;
                this.C[3] = 0;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 10, this.B[1]);
                return;
            }
            case 7: {
                c2.a = (c[])true;
                c.a(c2.h, -115, 40, 230, 130);
                this.C[0] = n3 - 100;
                this.C[1] = n4;
                this.C[2] = 200;
                this.C[3] = 0;
                c.a(c2.j, this.C[0], this.C[1], this.C[2], this.C[3]);
                this.C[0] = n3 - 60;
                this.C[1] = n4;
                this.C[2] = 120;
                this.C[3] = 0;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 10, this.B[1]);
                return;
            }
            case 8: {
                c2.a = (c[])true;
                c.a(c2.h, -40, 40, 80, 130);
                this.C[0] = n3 - 100;
                this.C[1] = n4;
                this.C[2] = 200;
                this.C[3] = 0;
                c.a(c2.j, this.C[0], this.C[1], this.C[2], this.C[3]);
                this.C[0] = n3 - 60;
                this.C[1] = n4;
                this.C[2] = 120;
                this.C[3] = 0;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 12, this.B[1]);
                return;
            }
            case 9: {
                c2.a = (c[])true;
                c.a(c2.h, -95, 40, 190, 130);
                this.C[0] = n3 - 100;
                this.C[1] = n4;
                this.C[2] = 200;
                this.C[3] = 0;
                c.a(c2.j, this.C[0], this.C[1], this.C[2], this.C[3]);
                this.C[0] = n3 - 40;
                this.C[1] = n4;
                this.C[2] = 80;
                this.C[3] = 0;
                this.B = h.a(this.C);
                i.a(c2, this.B[0] + 20, this.B[1]);
                return;
            }
            case 10: {
                c2.a = (c[])true;
                c.a(c2.h, -100, 65, 200, 180);
                i.a(c2, n3 + 20, n4);
                c.a(c2.j, n3 + 20, n4, 0, 0);
                return;
            }
            case 11: {
                c2.a = (c[])true;
                c.a(c2.h, -100, 65, 200, 180);
                i.a(c2, n3 + 20, n4);
                c.a(c2.j, n3 + 20, n4, 0, 0);
            }
        }
    }

    private i a(int n2, byte by, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        i i2 = null;
        i i3 = null;
        i3 = null;
        switch (n2) {
            case 0: {
                i3 = new r();
                new r().a = new int[30][12];
                ((r)i3).h = ((r)i3).g = 0;
                r.b(i3, (byte)0);
                ((r)i3).e = by;
                ((r)i3).k = 0;
                ((r)i3).b = 0;
                ((r)i3).c = 0;
                ((r)i3).d[1] = 0;
                ((r)i3).a[6] = false;
                ((r)i3).a[5] = false;
                ((r)i3).a[4] = false;
                ((r)i3).a[5] = true;
                ((r)i3).a[10] = false;
                if (i.b[((r)i3).h].length > 0) {
                    ((r)i3).a = new short[10][][];
                    for (n7 = 0; n7 < ((r)i3).a.length; ++n7) {
                        ((r)i3).a[n7] = new short[i.b[((r)i3).h][this.h[n7][1]][6]][16];
                    }
                }
                ((r)i3).b = new byte[10];
                ((r)i3).a[1] = 6;
                ((r)i3).d = true;
                ((r)i3).a[11] = true;
                i2 = i3;
                i.a(i2, n3, n4);
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                i3 = new c();
                this.a((c)i3, n2, n3, n4);
                if (n2 == 11) {
                    c.a(i3, (byte)2);
                } else {
                    c.a(i3, (byte)0);
                }
                i2 = i3;
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: {
                i3 = new c();
                new c().a = (c[])true;
                c.a(i3.h, -2000, 2000, 4000, 4000);
                c.a(i3, (byte)0);
                i2 = i3;
                this.C = this.a((int)this.p);
                c.a(i2.j, this.C[0] + 20, this.C[1] - 100, this.C[2] - 40, this.C[3] - 140);
                i.a(i2, n3 + 20, n4);
            }
        }
        if (n2 >= 1 && n2 <= 21) {
            i2.g = (int[])n2;
            i2.c = true;
            i2.k = 0;
            ((i)i2).b = false;
            ((i)i2).a = (short)-1;
            i2.h = (int[])this.c[i2.g];
            if (i.b[i2.h].length > 0) {
                ((i)i2).a = new short[i.b[i2.h].length][][];
                for (n7 = 0; n7 < ((i)i2).a.length; ++n7) {
                    ((i)i2).a[n7] = new short[i.b[i2.h][n7][6]][16];
                }
            }
            ((i)i2).b = new byte[i.b[i2.h].length];
            i2.f = (int[])false;
            if (n2 >= 12 && n2 <= 21) {
                i2.f[0] = (int)this.a[this.q][this.d[22]][1][15];
                ((i)i2).b[0] = h.a((int)this.b[this.a[i2.g][0]][3], (int)this.b[this.a[i2.g][0]][4], (int)this.b[this.a[i2.g][0]][5], i2.f[0]);
                ((i)i2).b[1] = ((i)i2).b[0];
                i2.c[1] = h.a((int)this.b[this.a[i2.g][0]][6], (int)this.b[this.a[i2.g][0]][7], (int)this.b[this.a[i2.g][0]][8], i2.f[0]);
                ((i)i2).a[1] = (int)this.d[i2.g - 12];
                ((i)i2).a[0] = ((i)i2).a[1];
                i2.e[1] = 10 + i2.f[0] * 10 + i2.f[0] * i2.f[0] * 10;
                ((i)i2).a = (byte[])new int[4][12];
                ((i)i2).a = new i[10][];
            } else {
                int[] nArray = new int[]{3, 5, 10, 13, 17, 23, 30, 32, 35, 37, 40, 42, 45, 50, 60, 60, 62, 65, 70, 90, 90, 100};
                i2.f[0] = nArray[this.q];
                ((i)i2).a[1] = h.a((int)this.b[this.a[i2.g][0]][0], (int)this.b[this.a[i2.g][0]][1], (int)this.b[this.a[i2.g][0]][2], i2.f[0]);
                ((i)i2).a[0] = ((i)i2).a[1];
                ((i)i2).b[0] = h.a((int)this.b[this.a[i2.g][0]][3], (int)this.b[this.a[i2.g][0]][4], (int)this.b[this.a[i2.g][0]][5], i2.f[0]);
                ((i)i2).b[1] = ((i)i2).b[0];
                i2.c[1] = h.a((int)this.b[this.a[i2.g][0]][6], (int)this.b[this.a[i2.g][0]][7], (int)this.b[this.a[i2.g][0]][8], i2.f[0]);
                i2.e[1] = h.a((int)this.b[this.a[i2.g][0]][9], (int)this.b[this.a[i2.g][0]][10], (int)this.b[this.a[i2.g][0]][11], i2.f[0]);
                ((i)i2).a = (byte[])new int[1][12];
                ((i)i2).a = new i[1][];
                if (n2 == 1) {
                    ((i)i2).a[1] = 1;
                    ((i)i2).a[0] = ((i)i2).a[1];
                }
            }
        }
        i2.e = (int[])by;
        if (i2.g >= true && i2.g <= 11) {
            c.a(((c)i2).i, -200, 200, 400, 450);
        } else if (i2.h == 12) {
            c.a(((c)i2).i, h.f(-200), h.f(200), h.f(400), h.f(300));
        } else if (i2.g >= 12 && i2.g <= 21) {
            c.a(i2.i, h.f(-100), h.f(100), h.f(200), h.f(200));
        }
        return i2;
    }

    private static int a(int n2, int n3, int n4, int n5) {
        return n2 + n5 * n3 + n5 * n5 / n4;
    }

    private void g() {
        Object object;
        Object object2;
        int n2;
        if (this.d[1] == true) {
            k.b(0, 30, 240, 260, 0xFFFFFF);
        } else {
            k.b(0, 0, 240, 320, this.r[this.t]);
            n2 = 0;
            object2 = 0;
            block9: for (object = 0; object < 2; ++object) {
                if (this.g[object] == null) continue;
                switch (this.u) {
                    case 0: {
                        if (object != 0 && object != 1) continue block9;
                        n2 = this.d[object][0] / 240;
                        object2 = this.d[object][1] / 260;
                        k.a(this.g[object], this.b[this.t], this.d[object][0] - n2 * 240 + this.d[19], this.d[object][1] - object2 * 260 + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
                        k.a(this.g[object], this.b[this.t], this.d[object][0] - (n2 + 1) * 240 + this.d[19], this.d[object][1] - object2 * 260 + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
                        k.a(this.g[object], this.b[this.t], this.d[object][0] - n2 * 240 + this.d[19], this.d[object][1] - (object2 + 1) * 260 + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
                        k.a(this.g[object], this.b[this.t], this.d[object][0] - (n2 + 1) * 240 + this.d[19], this.d[object][1] - (object2 + 1) * 260 + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
                        continue block9;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        if (object != 0 && object != 1) continue block9;
                        n2 = this.d[object][0] / 240;
                        k.a(this.g[object], this.b[this.t], this.d[object][0] - n2 * 240 + this.d[19], this.d[object][1] - object2 * 260 + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
                        k.a(this.g[object], this.b[this.t], this.d[object][0] - (n2 + 1) * 240 + this.d[19], this.d[object][1] - object2 * 260 + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
                    }
                }
            }
            for (object = 0; object < this.f.length; ++object) {
                k.a(this.f[object], this.b[this.t], this.x[0] + this.d[19], this.x[1] + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
            }
            if (this.c != null) {
                for (object = 0; object < 5; ++object) {
                    if (this.c.a[object][11] != 0) continue;
                    this.a(this.c.a[object], 0, 0);
                }
            }
            if (this.a != null) {
                for (object = 0; object < this.a.length; ++object) {
                    if (this.a[object] == null || this.a[object].b == 0 || this.a[object].g < 1 || this.a[object].g > 11) continue;
                    if (this.a[object].a != false) {
                        this.a.a(this.a[object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                    }
                    this.c(this.a[object]);
                    if (this.a[object].a == null) continue;
                    for (n2 = 0; n2 < this.a[object].a.length; ++n2) {
                        if (this.a[object].a[n2] == null) continue;
                        for (object2 = 0; object2 < ((c)this.a[object].a[n2]).length; ++object2) {
                            if (this.a[object].a[n2][object2] == null) continue;
                            this.a((int[])((i)this.a[object].a[n2][object2]).a[0], this.a[object].a[n2][object2].m, this.a[object].a[n2][object2].n);
                            this.a.a(this.a[object].a[n2][object2], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                        }
                    }
                }
            }
            if (this.a != null) {
                for (object = 0; object < this.a.length; ++object) {
                    if (this.a[object] == null) continue;
                    this.a((int[])this.a[object].a[0], this.a[object].m, this.a[object].n);
                    this.a.a(this.a[object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                }
            }
            if (this.b != null) {
                for (object = 0; object < this.b.length; ++object) {
                    if (this.b[object] == null) continue;
                    this.a((int[])this.b[object].a[0], this.b[object].m, this.b[object].n);
                    this.a.a(this.b[object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                }
            }
            if (this.c != null) {
                for (object = 0; object < this.c.length; ++object) {
                    if (this.c[object] == null) continue;
                    this.a((int[])this.c[object].a[0], this.c[object].m, this.c[object].n);
                    this.a.a(this.c[object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                }
            }
            if (this.c != null) {
                for (object = 0; object < this.c.length; ++object) {
                    if (this.c[object] == null || !this.c[object].e) continue;
                    this.a.a(this.c[object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                    for (n2 = 0; n2 < this.c[object].a.length; ++n2) {
                        if (this.c[object].a[n2][11] == 0) {
                            this.a(this.c[object].a[n2], 0, 0);
                            continue;
                        }
                        if (n2 == 0) {
                            if (this.b) continue;
                            this.a(this.c[object].a[n2], (int)this.a.m, this.a.n + this.B);
                            continue;
                        }
                        this.a(this.c[object].a[n2], this.c[object].a[n2][5], this.c[object].a[n2][6]);
                    }
                }
            }
            if (this.a != null) {
                for (object = 0; object < this.a.length; ++object) {
                    if (this.a[object] == null) continue;
                    this.a.a(this.a[object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                    for (n2 = 0; n2 < this.a[object].a.length; ++n2) {
                        if (this.a[object].a[n2][11] == 0) {
                            this.a(this.a[object].a[n2], 0, 0);
                            continue;
                        }
                        if (n2 == 0) {
                            if (this.b) continue;
                            this.a(this.a[object].a[n2], (int)this.a.m, this.a.n + this.B);
                            continue;
                        }
                        this.a(this.a[object].a[n2], this.a[object].a[n2][5], this.a[object].a[n2][6]);
                    }
                }
            }
        }
        if (this.d[1] == false && this.a != null) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                if (this.a[n2] == null || this.a[n2].b == 0 || this.a[n2].g < 12 || this.a[n2].g > 21) continue;
                if (this.a[n2].a != false) {
                    this.a.a(this.a[n2], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                    if (this.a[n2].a != null) {
                        for (object2 = 0; object2 < this.a[n2].a.length; ++object2) {
                            if (this.a[n2].a[object2].a == false) continue;
                            this.a.a(this.a[n2].a[object2], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                        }
                    }
                }
                this.c(this.a[n2]);
                if (this.a[n2].a == null) continue;
                for (object2 = 0; object2 < this.a[n2].a.length; ++object2) {
                    if (this.a[n2].a[object2] == null) continue;
                    for (object = 0; object < ((c)this.a[n2].a[object2]).length; ++object) {
                        if (this.a[n2].a[object2][object] == null) continue;
                        this.a((int[])((i)this.a[n2].a[object2][object]).a[0], this.a[n2].a[object2][object].m, this.a[n2].a[object2][object].n);
                        this.a.a(this.a[n2].a[object2][object], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                    }
                }
            }
        }
        if (this.a != null && this.c[this.a.g] != null) {
            if (this.a.b) {
                this.a.a(this.a, this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
            }
            this.c(this.a);
        }
        if (this.x[0] + this.d[19] < 20) {
            this.a(this.c.a[10], 0, 0);
        }
        if (this.x[0] + this.d[19] + 240 > this.n * this.r[2 * this.w] - 20) {
            this.a(this.c.a[11], 0, 0);
        }
        if (this.a != null && this.c[this.a.g] != null) {
            for (n2 = 0; n2 < this.a.a.length; ++n2) {
                if (this.a.a[n2][11] == 0) {
                    this.a(this.a.a[n2], 0, 0);
                    continue;
                }
                this.a(this.a.a[n2], (int)this.a.m, this.a.n);
            }
        }
        if (this.d[1] == false) {
            int n3;
            int n4;
            int n5;
            k.a(this.e[0], this.b[this.t], this.x[0] + this.d[19], this.x[1] + this.d[20], (short[][])this.e[this.u], null, 0, 30, 240, 260);
            if (this.a != null) {
                for (n2 = 0; n2 < this.a.length; ++n2) {
                    if (this.a[n2] == null) continue;
                    if (this.a[n2].a != null) {
                        for (object2 = 0; object2 < this.a[n2].a.length; ++object2) {
                            if (this.a[n2].a[object2][11] == false) {
                                this.a((int[])this.a[n2].a[object2], 0, 0);
                                continue;
                            }
                            this.a((int[])this.a[n2].a[object2], (int)this.a[n2].a[object2][5], (int)this.a[n2].a[object2][6]);
                        }
                    }
                    if (this.a[n2].a == null) continue;
                    for (object2 = 0; object2 < this.a[n2].a.length; ++object2) {
                        if (this.a[n2].a[object2].a == false || this.a[n2].a[object2].a == null) continue;
                        this.a((int[])this.a[n2].a[object2].a[0], 0, 0);
                    }
                }
            }
            if (this.d != null) {
                for (n2 = 0; n2 < this.d.a.length; ++n2) {
                    if (this.d.a[n2][11] != 0) continue;
                    this.a(this.d.a[n2], 0, 0);
                }
            }
            if (this.e != null && this.e.length > 0) {
                for (n2 = 0; n2 < this.e.length; ++n2) {
                    if (this.e[n2] == null || this.e[n2].f) continue;
                    this.a.a(this.e[n2], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                }
            }
            if (this.d != null && this.d.length > 0) {
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    if (this.d[n2] == null || this.d[n2].f) continue;
                    this.a.a(this.d[n2], this.c, (short[][][])this.b, (short[][][][])this.b, (short[][][][])this.a, this.x[0] + this.d[19], this.x[1] + this.d[20]);
                }
            }
            if (this.q[0] == 0) {
                Random random = this.a[1][0];
                object = this.q;
                object2 = 1;
                k k2 = this.a;
                if (k2.a.d[87] >= 0 && k2.a.d[87] <= 2) {
                    k.a(0xFFFFFF, k2.a[0]);
                    n5 = (((String)((Object)random[11][object])).length() + 1) * k2.a;
                    object2 = 240 - n5 >> 1;
                    n4 = object2 + k2.a / 2;
                    n3 = 128 + k2.b + 3;
                    switch (k2.a.d[87]) {
                        case 0: {
                            if (k2.a.d[88] > n5) break;
                            k.a.fillRect(object2, n3, (int)k2.a.d[88], 1);
                            k2.a.d[88] = (p)((short)(k2.a.d[88] + 15));
                            if (k2.a.d[88] <= n5) break;
                            k2.a.d[87] = (p)true;
                            k2.a.d[88] = (p)false;
                            break;
                        }
                        case 1: {
                            if (n3 - k2.a.d[88] < 128) break;
                            k.a.fillRect(object2, n3, n5, 1);
                            k.a.setClip(object2, n3 - (k2.a.d[88] + true), n5, (int)(k2.a.d[88] + true));
                            k.a.drawString((String)((Object)random[11][object]), n4, n3 - (k2.a.d[88] + true), 20);
                            k.a.drawString((String)((Object)random[11][object]), n4 + (k2.a.a.nextInt() & Integer.MAX_VALUE) % 3 - 1, n3 - (k2.a.d[88] + true) + (k2.a.a.nextInt() & Integer.MAX_VALUE) % 3 - 1, 20);
                            k2.a.d[88] = (p)((short)(k2.a.d[88] + true));
                            if (n3 - k2.a.d[88] >= 128) break;
                            k2.a.d[87] = (p)2;
                            k2.a.d[88] = (p)false;
                            break;
                        }
                        case 2: {
                            if (k2.a.d[88] > 30) break;
                            k.a.fillRect(object2, n3, n5, 1);
                            k.a.setClip(object2, 128, n5, n3 - 128);
                            k.a.drawString((String)((Object)random[11][object]), n4, 128, 20);
                            k.a.drawString((String)((Object)random[11][object]), n4 + (k2.a.a.nextInt() & Integer.MAX_VALUE) % 2, 128 + (k2.a.a.nextInt() & Integer.MAX_VALUE) % 2, 20);
                            k2.a.d[88] = (p)((short)(k2.a.d[88] + true));
                            if (k2.a.d[88] < 30) break;
                            k2.a.d[87] = (p)3;
                            k2.a.d[88] = (p)false;
                        }
                    }
                }
            }
            if (this.d[33] > 0) {
                Random random = this.a[1][0];
                object2 = this.d[33];
                k k3 = this.a;
                k.a(0xFFFFFF, k3.a[0]);
                int n6 = (((String)((Object)random[11][object2])).length() + 1) * k3.a;
                n3 = 240 - n6 >> 1;
                n5 = n3 + k3.a / 2;
                n4 = 128 + k3.b + 3;
                k.a.fillRect(n3, n4, n6, 1);
                k.a((String)((Object)random[11][object2]), n5, 128, 20, k.a, k3.a[0], 16646090, 0);
            }
        }
        this.a.a(this.c, this.a, (short)this.d[22], (byte[][][])this.a[this.q], (short[][][])this.b, (short[][][][])this.b);
        if (this.d[1] == false && this.c != null) {
            this.a(this.c.a[6], this.x[0] + 28 + this.d[19], 320 - (this.x[1] + 72 + this.d[20]));
            this.a(this.c.a[7], this.x[0] + 28 + this.d[19], 320 - (this.x[1] + 72 + this.d[20]));
            this.a(this.c.a[8], this.x[0] + 28 + this.d[19], 320 - (this.x[1] + 72 + this.d[20]));
            if (this.c[39] != null && this.c[39][0] != null && ((Random)this.a[39]).length > 0) {
                this.a(this.c.a[9], 120, -160);
            }
        }
        if (this.d[1] == true) {
            this.d[1] = (p)false;
        }
    }

    private void a(int n2, int n3, int n4) {
        if (n3 > 0) {
            this.v[0] = (short)(n3 + 1);
            switch (n2) {
                case 0: {
                    this.v[1] = 0;
                    this.v[2] = 255;
                    this.v[3] = 0;
                    break;
                }
                case 1: {
                    this.v[1] = 255;
                    this.v[2] = 0;
                    this.v[3] = 0;
                    break;
                }
                case 2: {
                    this.v[1] = 0;
                    this.v[2] = 255;
                    this.v[3] = 0xFFFFFF;
                    break;
                }
                case 3: {
                    this.v[1] = 255;
                    this.v[2] = 0;
                    this.v[3] = 0xFFFFFF;
                    break;
                }
                case 4: {
                    this.v[1] = 255;
                    this.v[2] = 255;
                    this.v[3] = 0;
                }
            }
            this.v[4] = (short)((this.v[2] - this.v[1]) / this.v[0]);
            this.v[5] = (short)n4;
        }
    }

    private void h() {
        this.v[0] = 0;
    }

    private boolean a() {
        if (this.v[0] > 0) {
            this.v[1] = this.v[1] + this.v[4];
            this.v[0] = this.v[0] - 1;
        }
        return this.v[0] <= 0;
    }

    private void i() {
        if (this.v[0] > 0) {
            k.a(this.v[1], this.v[3], 0, 0, 240, 320, null);
        }
    }

    private static byte a(i i2, c c2, int[] nArray, int n2) {
        n2 = 0;
        if (i2.m < c2.m + nArray[0] + nArray[2] && i2.m > c2.m + nArray[0] && i2.n > c2.n + nArray[1] - nArray[3] && i2.n < c2.n + nArray[1]) {
            n2 = 1;
        }
        return (byte)n2;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    private void a(byte[] object) {
        if (this.h(-6) == 1 || this.h(-5) == 1 || this.h(53) == 1) {
            int n2 = Integer.MIN_VALUE;
            block10: do {
                switch (n2 == Integer.MIN_VALUE ? object[this.c[this.e][this.p[this.e]][0]] : n2) {
                    case 0: {
                        if (this.f == 0) {
                            if (this.d[34] > 0) {
                                this.f = 1;
                                break;
                            }
                            this.i[10] = (short)h.c(6);
                            this.d[16] = (p)44;
                            h.a(this.p, 37);
                            this.w[2] = 0;
                            break;
                        }
                        if (this.f != 1 || this.h(-6) != 1) break;
                        object = new n((String)this.b);
                        byte[] byArray = ((n)object).a(1);
                        byte[] byArray2 = new byte[byArray.length];
                        byArray = byArray2;
                        byArray2[0] = -1;
                        ((n)object).a(1, byArray, 0, byArray.length);
                        ((n)object).a();
                        this.d[34] = (p)((short)byArray[0]);
                        this.i[10] = (short)h.c(6);
                        this.e = null;
                        this.w[2] = 0;
                        if (this.d[34] < 0) {
                            this.d[16] = (p)44;
                            h.a(this.p, 37);
                            break;
                        }
                        h.a(this.p, 32);
                        break;
                    }
                    case 1: {
                        if (this.d[34] > 0) {
                            this.i[10] = (short)h.c(6);
                            this.e = null;
                            h.a(this.p, 32);
                            this.w[2] = 0;
                            break;
                        }
                        this.i[10] = (short)h.c(6);
                        this.d[16] = (p)44;
                        h.a(this.p, 37);
                        this.w[2] = 0;
                        break;
                    }
                    case 6: {
                        this.N();
                        h.a(this.p, 4);
                        h.a(this.q, 3);
                        break;
                    }
                    case 2: {
                        this.N();
                        this.d[66] = (p)false;
                        this.d[67] = (p)2;
                        this.Q();
                        h.a(this.p, 4);
                        h.a(this.q, 4);
                        break;
                    }
                    case 3: {
                        this.N();
                        h.a(this.p, 4);
                        h.a(this.q, 5);
                        break;
                    }
                    case 38: {
                        this.a.a(GameMIDlet.QQGameUrl);
                        n2 = 7;
                        continue block10;
                    }
                    case 39: {
                        this.g = 0;
                        this.N();
                        h.a(this.p, 4);
                        h.a(this.q, 34);
                        this.F[0] = 41;
                        this.F[2] = 0;
                        if (this.d() <= 4 && this.c() <= 10 && this.f() <= 16) break;
                        this.a(this.E);
                        break;
                    }
                    case 7: {
                        this.a.a();
                        break;
                    }
                }
                break;
            } while (true);
            this.N();
            this.a(-6, 0);
            this.a(-5, 0);
            this.a(53, 0);
            return;
        }
        if (this.h(-7) == 1 || this.h(-11) == 1) {
            this.r();
            if (this.f == 1) {
                this.f = 0;
                this.c(5, -1);
                return;
            }
            h.a(this.p, 4);
            h.a(this.q, 35);
        }
    }

    public final void a(int n2) {
        this.y = n2;
        this.z = 0;
    }

    public final void c() {
        this.y = 0;
    }

    private int g() {
        void var0_1 = this.h[this.a.f][13];
        return (int)var0_1;
    }

    private boolean a(i object, int n2, int n3) {
        boolean bl = false;
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        if (this.d[96] == false) {
            if (object != null) {
                n4 = ((i)object).n - 80;
                switch (((i)object).e) {
                    case 1: {
                        n5 = ((i)object).m - 96;
                        break;
                    }
                    case 2: {
                        n5 = ((i)object).m - 144;
                    }
                }
            } else {
                n4 = n3;
                n5 = n2;
            }
        } else {
            n4 = n3;
            n5 = n2;
        }
        n2 = this.g() * 3 / 2;
        n3 = 0;
        if (object != null) {
            int n6 = n3 = ((i)object).c > 0 ? 13 : 40;
        }
        if (this.x[1] > n4) {
            n3 = 40;
        } else if (this.x[1] < n4) {
            n3 = 10;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (n5 < z[0]) {
            n5 = z[0];
        } else if (n5 > z[1] - 240) {
            n5 = z[1] - 240;
        }
        if (this.x[0] < n5) {
            if (this.x[0] < z[1] - 240) {
                this.x[0] = this.x[0] + n2;
                bl = true;
                if (this.x[0] >= n5) {
                    this.x[0] = n5;
                }
                object = this;
                ((h)object).j();
            }
        } else if (this.x[0] > n5 && this.x[0] > z[0]) {
            this.x[0] = this.x[0] - n2;
            bl = true;
            if (this.x[0] <= n5) {
                this.x[0] = n5;
            }
            object = this;
            ((h)object).j();
        }
        if (this.x[0] <= z[0]) {
            if (z[0] - this.x[0] < n2) {
                this.x[0] = z[0];
            }
            if (this.x[0] == z[0]) {
                bl = false;
            }
        } else if (this.x[0] >= z[1] - 240) {
            if (this.x[0] - (z[1] - 240) < n2) {
                this.x[0] = z[1] - 240;
            }
            if (this.x[0] == z[1] - 240) {
                bl = false;
            }
        }
        if (this.x[1] > n4) {
            if (this.x[1] > z[3]) {
                this.x[1] = this.x[1] - n3;
                bl2 = true;
                if (this.x[1] <= n4) {
                    this.x[1] = n4;
                }
                object = this;
                ((h)object).j();
            }
        } else if (this.x[1] < n4 && this.x[1] < z[2] - 260) {
            this.x[1] = this.x[1] + n3;
            bl2 = true;
            if (this.x[1] >= n4) {
                this.x[1] = n4;
            }
            object = this;
            ((h)object).j();
        }
        if (this.x[1] >= z[2] - 260) {
            if (this.x[1] + 260 - z[2] < n3) {
                this.x[1] = z[2] - 260;
            }
            if (this.x[1] == z[2] - 260) {
                bl2 = false;
            }
        } else if (this.x[1] <= z[3]) {
            if (z[3] - this.x[1] < n3) {
                this.x[1] = z[3];
            }
            if (this.x[1] == z[3]) {
                bl2 = false;
            }
        }
        return bl | bl2;
    }

    private void a(boolean bl, int n2, int n3, int n4, int n5) {
        this.d[94] = (p)((short)n2);
        this.d[95] = (p)false;
        this.d[93] = (p)((short)n4);
        this.a = (Random)bl;
        this.d[96] = (p)((short)n5);
    }

    private static int[] a(i i2) {
        int[] nArray = new int[2];
        int n2 = i2.n - 80;
        if (n2 < 0) {
            n2 = 0;
        }
        switch (i2.e) {
            case 1: {
                nArray[0] = i2.m - 96;
                break;
            }
            case 2: {
                nArray[0] = i2.m - 144;
            }
        }
        if (nArray[0] < z[0]) {
            nArray[0] = z[0];
        } else if (nArray[0] > z[1] - 240) {
            nArray[0] = z[1] - 240;
        }
        nArray[1] = n2;
        if (nArray[1] > z[2] - 260) {
            nArray[1] = z[2] - 260;
        } else if (nArray[1] < z[3]) {
            nArray[1] = z[3];
        }
        return nArray;
    }

    private void j() {
        switch (this.u) {
            case 0: {
                this.d[0][0] = this.x[0] / 2;
                this.d[1][0] = this.x[0] / 2;
                this.d[0][1] = this.x[1] / 2;
                this.d[1][1] = this.x[1] / 2;
                return;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                this.d[0][0] = this.x[0] / 4;
                this.d[0][1] = this.x[1];
                this.d[1][0] = this.x[0] / 2;
                this.d[1][1] = this.x[1];
            }
        }
    }

    private void k() {
        Object object;
        block193: {
            int n2;
            int n3;
            object = this;
            if (((h)object).p[0] == 4 && ((h)object).q[0] == 1 && ((h)object).e != null) {
                for (n3 = ((h)object).e.a.length - 1; n3 >= 0; --n3) {
                    ((h)object).a(((h)object).e.a[n3], ((h)object).e);
                }
            }
            if (((h)object).a != null && ((h)object).c[27] != null && ((h)object).c[27][0] != null) {
                for (n3 = 0; n3 < ((h)object).a.a.length; ++n3) {
                    ((h)object).a(((h)object).a.a[n3], ((h)object).a);
                }
            }
            if (((h)object).c != null && ((h)object).c[26] != null && ((h)object).c[26][0] != null) {
                for (n3 = 0; n3 < ((h)object).c.a.length; ++n3) {
                    ((h)object).a(((h)object).c.a[n3], ((h)object).c);
                }
            }
            if (((h)object).d != null) {
                for (n3 = 0; n3 < ((h)object).d.a.length; ++n3) {
                    ((h)object).a(((h)object).d.a[n3], ((h)object).d);
                }
            }
            if (((h)object).c != null) {
                for (n3 = 0; n3 < ((h)object).c.length; ++n3) {
                    if (((h)object).c[n3] == null || !((h)object).c[n3].e) continue;
                    for (n2 = 0; n2 < ((h)object).c[n3].a.length; ++n2) {
                        super.a(((h)object).c[n3].a[n2], ((h)object).c[n3]);
                    }
                }
            }
            if (((h)object).a != null) {
                for (n3 = 0; n3 < ((h)object).a.length; ++n3) {
                    for (n2 = 0; n2 < ((h)object).a[n3].a.length; ++n2) {
                        ((h)object).a(((h)object).a[n3].a[n2], ((h)object).a[n3]);
                    }
                }
            }
            block0 : switch (this.p[0]) {
                case 27: {
                    if (this.d[44] > 0 && this.d[47] > 0 && this.d[68] == false) {
                        this.I();
                    }
                    this.a();
                    if (this.b != null && this.q[0] > 0 && this.g[this.q[0]][3] == true) {
                        for (int i2 = this.b.a.length - 1; i2 >= 0; --i2) {
                            this.a(this.b.a[i2], this.b);
                            if (this.b == null) break;
                        }
                    }
                    this.L();
                    break;
                }
                case 7: {
                    if (!this.b) {
                        int n4;
                        object = this;
                        if (((h)object).d[9] == true) {
                            ((h)object).d[9] = (p)false;
                            ((h)object).d[19] = (p)false;
                            ((h)object).d[20] = (p)false;
                        }
                        if (((h)object).d[21] > 0) {
                            ((h)object).d[21] = (p)((short)(((h)object).d[21] - true));
                            if (((h)object).d[21] == false) {
                                ((h)object).d[19] = (p)false;
                                ((h)object).d[20] = (p)false;
                            }
                            ((h)object).d[20] = (p)((short)(((h)object).d[21] % 2 == true ? -4 : 4));
                        }
                        object = this;
                        if (((h)object).a != null && ((h)object).c[((h)object).a.g] != null) {
                            for (n3 = 0; n3 < ((h)object).a.a.length; ++n3) {
                                super.a(((h)object).a.a[n3], (p)((h)object).a);
                            }
                        }
                        if (((h)object).a != null) {
                            for (n3 = 0; n3 < ((h)object).a.length; ++n3) {
                                int n5;
                                if (((h)object).a[n3] == null) continue;
                                if (((h)object).a[n3].a != null) {
                                    for (n2 = 0; n2 < ((h)object).a[n3].a.length; ++n2) {
                                        super.a((int[])((h)object).a[n3].a[n2], (p)((h)object).a[n3]);
                                    }
                                }
                                if (((h)object).a[n3].a != null) {
                                    for (n2 = 0; n2 < ((h)object).a[n3].a.length; ++n2) {
                                        if (((h)object).a[n3].a[n2].a == false || ((h)object).a[n3].a[n2].a == null) continue;
                                        for (n5 = 0; n5 < ((h)object).a[n3].a[n2].a.length; ++n5) {
                                            super.a((int[])((h)object).a[n3].a[n2].a[n5], (p)((h)object).a[n3].a[n2]);
                                        }
                                    }
                                }
                                if (((h)object).a[n3].a == null) continue;
                                for (n2 = 0; n2 < ((h)object).a[n3].a.length; ++n2) {
                                    if (((h)object).a[n3].a[n2] == null) continue;
                                    for (n5 = 0; n5 < ((c)((h)object).a[n3].a[n2]).length; ++n5) {
                                        if (((h)object).a[n3].a[n2][n5] == null) continue;
                                        super.a((int[])((i)((h)object).a[n3].a[n2][n5]).a[0], (p)((h)object).a[n3].a[n2][n5]);
                                    }
                                }
                            }
                        }
                        object = this;
                        ((h)object).a((p)((h)object).a);
                        super.a(((h)object).a);
                        super.a(((h)object).b);
                        super.a(((h)object).c);
                        int[] nArray = ((h)object).b[((h)object).q];
                        i[] iArray = ((h)object).c;
                        Object object2 = object;
                        if (iArray.length > 0 && iArray[0] != null) {
                            n4 = ((m)object2).a(((h)object2).a, iArray[0], 2, 0, false);
                            if (n4 < 3000) {
                                if (((h)object2).d[84] == false) {
                                    for (int i3 = 0; i3 < nArray.length; ++i3) {
                                        if (nArray[i3][0][0] != ((h)object2).p || nArray[i3][1][3] != false) continue;
                                        ((h)object2).d[84] = (p)true;
                                        ((h)object2).d[85] = (p)((short)(nArray[i3][1][2] - 18));
                                        super.q((int)nArray[i3][1][4]);
                                    }
                                }
                            } else {
                                ((h)object2).d[84] = (p)false;
                            }
                        }
                        iArray = ((h)object).a;
                        object2 = object;
                        if (iArray != null) {
                            for (int i4 = 0; i4 < iArray.length; ++i4) {
                                if (iArray[i4] == null) continue;
                                n4 = ((m)object2).a(((h)object2).a, iArray[i4], 2, 0, false);
                                if (n4 < 3000) {
                                    if (((h)object2).k[iArray[i4].i] < (((h)object2).k[2] == 1 ? 999 : 10)) {
                                        super.l((int)iArray[i4].i);
                                        ((h)object2).d[((h)object2).q][((h)object2).p][i4] = (p)true;
                                        ((h)object2).a.a[5] = h.a(((h)object2).a.a[5], 1, 1, 3);
                                        super.a(((h)object2).a, ((h)object2).a.a[5], 59, iArray[i4].m, iArray[i4].n, ((h)object2).a.e, 26, 1, 1, -1, 0, 1);
                                        iArray[i4] = null;
                                        continue;
                                    }
                                    if (iArray[i4].a[17]) continue;
                                    iArray[i4].a[17] = true;
                                    ((h)object2).C = ((m)object2).a(((h)object2).a);
                                    super.a(((h)object2).a, 18, ((h)object2).C[0] + (((h)object2).C[2] >> 1), ((h)object2).C[1] + 10);
                                    continue;
                                }
                                if (!iArray[i4].a[17]) continue;
                                iArray[i4].a[17] = false;
                            }
                        }
                        iArray = ((h)object).b;
                        object2 = object;
                        if (iArray != null) {
                            for (int i5 = 0; i5 < iArray.length; ++i5) {
                                if (iArray[i5] == null) continue;
                                n4 = ((m)object2).a(((h)object2).a, iArray[i5], 2, 0, false);
                                if (n4 < 3000) {
                                    if (iArray[i5].a[17]) continue;
                                    iArray[i5].a[17] = true;
                                    int[] nArray2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 163, 164, 165, 166, 167};
                                    if (nArray2[iArray[i5].i - 29] == 167) {
                                        int n6 = ((h)object2).i;
                                        n6[10] = n6[10] + true;
                                        ((h)object2).i[10] = ((h)object2).i[10] >= super.h() ? false : ((h)object2).i[10];
                                    }
                                    super.k(nArray2[iArray[i5].i - 29]);
                                    iArray[i5] = null;
                                    continue;
                                }
                                if (!iArray[i5].a[17]) continue;
                                iArray[i5].a[17] = false;
                            }
                        }
                        if (((h)object).d[93] == false) {
                            super.a((i)((h)object).a, 0, 0);
                        } else if (!super.a((i)((h)object).a, (int)((h)object).d[94], (int)((h)object).d[95])) {
                            switch (((h)object).d[93]) {
                                case 1: {
                                    for (n3 = 0; n3 < ((h)object).a.length; ++n3) {
                                        if (((h)object).a[n3].c != 2) continue;
                                        ((h)object).d[48] = (p)((short)n3);
                                        break;
                                    }
                                    super.a(((h)object).a[((h)object).d[48]], 2, 1);
                                    break;
                                }
                                case 2: {
                                    super.a(false, 0, 0, 0, 0);
                                    super.k(157);
                                    break;
                                }
                                case 3: {
                                    super.a(false, 100, 0, -1, 1);
                                    super.k(158);
                                }
                            }
                        }
                        super.p();
                        super.a(((h)object).a);
                        super.a((i)((h)object).a, ((h)object).a);
                        object2 = object;
                        if (((h)object2).j[((h)object2).a.c[0]].length > 0 && ((h)object2).a.k >= 0) {
                            ((h)object2).a.b = (short)(((h)object2).a.b & 3);
                            if (((h)object2).j[((h)object2).a.c[0]][((h)object2).a.k] > 0) {
                                ((h)object2).a.b = (short)(((h)object2).a.b | (((h)object2).a.e == 1 ? 8 : 4));
                            } else if (((h)object2).j[((h)object2).a.c[0]][((h)object2).a.k] < 0) {
                                ((h)object2).a.b = (short)(((h)object2).a.b | (((h)object2).a.e == 1 ? 4 : 8));
                            }
                            ((h)object2).a.k[0] = Math.abs(((h)object2).j[((h)object2).a.c[0]][((h)object2).a.k]);
                        }
                        super.b(((h)object).a);
                        super.a(((h)object).a);
                        super.d(((h)object).a);
                        if (!((h)object).a.a[1]) {
                            super.b(((h)object).a);
                            super.o();
                        }
                        if (((h)object).a != null) {
                            for (n3 = 0; n3 < ((h)object).a.length; ++n3) {
                                if (((h)object).a[n3] == null) continue;
                                super.a(((h)object).a[n3]);
                                if (((h)object).a[n3].h != 20) continue;
                                if (((h)object).a[0].a == false) {
                                    ((h)object).a[n3].a = (c[])false;
                                    continue;
                                }
                                if (((h)object).a[n3].c[0] == ((h)object).a[0].c[0]) continue;
                                ((h)object).a[n3].a[11] = (c)true;
                                ((h)object).a[n3].d = true;
                                super.a((p)((h)object).a[n3], (int)((h)object).a[0].c[0], (int)((h)object).a[((h)object).a[0].g][((h)object).a[0].c[0]][((Random)((h)object).a[((h)object).a[0].g][((h)object).a[0].c[0]]).length - 1][0]);
                                ((h)object).a[n3].h = true;
                            }
                        }
                        super.F();
                        object2 = object;
                        if (((h)object2).a != null) {
                            int n7;
                            for (n7 = 0; n7 < ((h)object2).a.length; ++n7) {
                                if (((h)object2).a[n7] == null || ((h)object2).a[n7].g != 0) continue;
                                super.a(((h)object2).a[n7]);
                            }
                            for (n7 = 0; n7 < ((h)object2).a.length; ++n7) {
                                if (((h)object2).a[n7] == null) continue;
                                nArray = ((m)object2).a(((h)object2).a[n7]);
                                int[] nArray3 = ((m)object2).a(((h)object2).a);
                                if (((h)object2).d[49] == false) {
                                    if (h.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray3[0], nArray3[1], nArray3[2], nArray3[3], 4) >= 3000) continue;
                                    if (((h)object2).q == true) {
                                        ((h)object2).d[33] = (p)((short)((h)object2).a[n7].c);
                                        ((h)object2).d[87] = (p)3;
                                        ((h)object2).d[88] = (p)false;
                                    }
                                    ((h)object2).s[0] = ((h)object2).a[n7].c;
                                    ((h)object2).d[49] = (p)true;
                                    ((h)object2).d[48] = (p)((short)n7);
                                    super.a(((h)object2).a[n7], 0, 11, (int)((h)object2).a.m, ((h)object2).a.n + ((h)object2).B, 1, 32, 1, 1, -1, 1, 0);
                                    break;
                                }
                                if (((h)object2).s[0] != ((h)object2).a[n7].c || h.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray3[0], nArray3[1], nArray3[2], nArray3[3], 4) < 3000) continue;
                                ((h)object2).d[33] = (p)-1;
                                ((h)object2).d[49] = (p)false;
                                super.a(((h)object2).a[n7], 0, 11, (int)((h)object2).a.m, ((h)object2).a.n + ((h)object2).B, 1, 32, 1, 0, -1, 1, 0);
                            }
                        }
                        super.G();
                        if (((h)object).d[22] < 0 || ((h)object).d[22] >= 0 && (((h)object).a == null || ((h)object).a != null && (((h)object).a.length == 0 || ((h)object).a.length > 0 && ((h)object).a[0].a == false))) {
                            if (((h)object).d[22] >= 0) {
                                if (((h)object).d[62] <= 0) {
                                    super.f((int)((h)object).p);
                                } else {
                                    ((h)object).d[62] = (p)((short)(((h)object).d[62] - true));
                                }
                            } else if (((h)object).d[4] == false) {
                                super.f((int)((h)object).p);
                            }
                        }
                        super.n();
                        if (!((h)object).a.a[9]) {
                            if (((h)object).a.e[0] != 15) {
                                ((h)object).a.b = (short)(((h)object).a.b & 3);
                            }
                            ((h)object).a.a[16] = false;
                        }
                    }
                    if (this.d[58] == false && this.v[0] > 0 && this.a() && this.v[5] == 2) {
                        this.q = (byte[])this.s;
                        this.p = (byte[])false;
                        if (((Random)this.a[this.q]).length > 0) {
                            for (int i6 = 0; i6 < ((Random)this.a[this.q]).length; ++i6) {
                                this.a[this.q][i6][1][6] = (Random)false;
                            }
                        }
                        h.a(this.p, 35);
                        this.w[2] = 0;
                    }
                    this.m();
                    if (this.q[0] != 0 || this.a != false) break;
                    this.L();
                    break;
                }
                case 40: {
                    this.w[0] = this.w[0] + 1;
                    this.w[1] = 20;
                    if (this.w[0] < this.w[1]) break;
                    this.w[0] = 0;
                    for (int i7 = 0; i7 < this.a.length; ++i7) {
                        this.a[i7] = null;
                    }
                    h.a(this.p, 41);
                    break;
                }
                case 41: {
                    this.w[0] = this.w[0] + 1;
                    this.w[1] = 12;
                    if (this.w[0] < this.w[1]) break;
                    this.w[0] = 0;
                    for (int i8 = 0; i8 < this.a.length; ++i8) {
                        this.a[i8] = null;
                    }
                    this.w[2] = 0;
                    this.w[3] = 50;
                    this.c[34] = new Image[1];
                    this.c[34][0] = this.b("/data/role/role_34_0.mid");
                    this.i[10] = (short)h.c(6);
                    this.p[0] = 33;
                    break;
                }
                case 42: {
                    break;
                }
                case 33: {
                    this.w[2] = this.w[2] + 1;
                    this.w[3] = 20;
                    switch (this.w[2]) {
                        case 2: {
                            break;
                        }
                        case 6: {
                            object = new n((String)this.b);
                            byte[] byArray = new byte[]{-1};
                            if (((n)object).a() == 0) {
                                byArray[0] = -1;
                            } else {
                                byArray = ((n)object).a(1);
                            }
                            this.d[34] = (p)((short)byArray[0]);
                            ((n)object).a();
                            break;
                        }
                        case 8: {
                            for (int i9 = 0; i9 < 8; ++i9) {
                                this.d[i9 + 100] = (p)false;
                            }
                            break;
                        }
                        case 10: {
                            object = this;
                            int[] nArray = new int[((h)object).E.length];
                            byte[] byArray = null;
                            byte[] byArray2 = new byte[4];
                            n n8 = new n("con1_qq_j");
                            if (n8.a() == 0) {
                                super.V();
                            } else {
                                int n9;
                                byArray = n8.a(1);
                                if (byArray.length != nArray.length << 2) {
                                    n8.b();
                                    super.V();
                                }
                                int n10 = 0;
                                for (n9 = 0; n9 < nArray.length; ++n9) {
                                    for (int i10 = 0; i10 < byArray2.length; ++i10) {
                                        byArray2[i10] = byArray[n10++];
                                    }
                                    nArray[n9] = (int)g.a(byArray2);
                                }
                                n9 = 0;
                                if (((h)object).d[34] < 0) {
                                    ((h)object).E = new int[34];
                                } else {
                                    for (n10 = 0; n10 < ((h)object).E.length; ++n10) {
                                        ((h)object).E[n10] = nArray[n9++];
                                    }
                                }
                            }
                            n8.a();
                            object = this;
                            ((h)object).a[5] = q.a("/data/music/music_5.mid", 1);
                            q.b(1);
                            break;
                        }
                        case 12: {
                            this.g(49);
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    this.w[2] = 0;
                    this.w[3] = 50;
                    int n11 = this.i;
                    n11[10] = n11[10] + true;
                    this.i[10] = this.i[10] >= this.h() ? false : this.i[10];
                    h.a(this.p, 42);
                    break;
                }
                case 32: {
                    this.w[3] = 50;
                    this.w[2] = this.w[2] + 1;
                    switch (this.w[2]) {
                        case 2: {
                            this.o(33);
                            this.n(33);
                            this.o(39);
                            this.n(39);
                            for (int i11 = 1; i11 <= 21; ++i11) {
                                this.o(i11);
                                this.n(i11);
                            }
                            this.o(29);
                            this.n(29);
                            this.o(30);
                            this.n(30);
                            this.o(37);
                            this.n(37);
                            this.o(41);
                            this.n(41);
                            this.o(42);
                            this.n(42);
                            this.n(25);
                            this.e(27);
                            this.b(27);
                            this.e(26);
                            this.b(26);
                            this.e(24);
                            this.b[0] = this.b[24];
                            this.b[0] = this.b[24];
                            this.c[0] = this.c[24];
                            this.a[0] = this.a[24];
                            this.d[0] = this.d[24];
                            this.b(0);
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 6: {
                            break;
                        }
                        case 8: {
                            break;
                        }
                        case 10: {
                            break;
                        }
                        case 12: {
                            this.e(31);
                            this.b(31);
                            break;
                        }
                        case 14: {
                            break;
                        }
                        case 16: {
                            this.e(28);
                            this.e(29);
                            this.e(30);
                            this.e(32);
                            this.e(37);
                            break;
                        }
                        case 18: {
                            this.b(24);
                            break;
                        }
                        case 20: {
                            this.d = (p[])h.a("/data/data/roomsinfo.mid");
                            this.b = h.a("/data/data/rolejump.mid");
                            this.r = (int)this.q;
                            this.e = (byte)new byte[this.d.length][];
                            for (int i12 = 0; i12 < this.d.length; ++i12) {
                                this.e[i12] = new byte[((p)this.d[i12]).length / 4];
                            }
                            this.d = (p[])new short[this.d.length];
                            this.j = new int[0];
                            if (this.d[34] < 0) {
                                this.y();
                            } else {
                                this.E();
                                if (this.d[34] < 0) {
                                    this.y();
                                }
                            }
                            this.a.d = 0;
                            this.a.e = 2;
                            this.a.f = 0;
                            this.U();
                            break;
                        }
                        case 22: {
                            break;
                        }
                        case 26: {
                            break;
                        }
                        case 28: {
                            this.d[35] = (p)false;
                            this.d[86] = (p)false;
                            if (this.d[34] >= 0) {
                                this.d[35] = (p)false;
                                this.d[86] = (p)true;
                                if (this.c != null) {
                                    for (int i13 = 0; i13 < this.c.length; ++i13) {
                                        if (this.c[i13].g != 29) continue;
                                        this.a(this.c[i13], 0, 0);
                                    }
                                }
                            }
                            this.w = (int[])this.d[this.q][this.p << 2];
                            this.t = h.i((int)this.q);
                            this.e[this.u] = null;
                            this.u = h.j(this.t);
                            this.e[this.u] = g.a(h.a("/data/data/mapmodule_" + this.u + ".mid"));
                            this.e[this.q][this.p] = true;
                            this.c(this.t);
                            this.e(28);
                            this.e(29);
                            this.e(30);
                            this.e(32);
                            this.e(37);
                            this.b(28);
                            this.b(29);
                            this.b(30);
                            this.b(32);
                            this.b(37);
                            if (this.u == 1) {
                                this.a((p)this.a, 15, 0);
                            } else {
                                this.a((p)this.a, 0, 0);
                            }
                            this.d[90] = this.u == 2 ? (Object)2 : (p)false;
                            int n12 = 0;
                            for (n3 = 0; n3 < ((void)this.e[this.q]).length; ++n3) {
                                if (this.e[this.q][n3] != true) continue;
                                ++n12;
                            }
                            this.x[this.q] = (byte)(n12 * 100 / ((void)this.e[this.q]).length);
                            this.c = new p();
                            this.c.a = new int[12][12];
                            this.d = new p();
                            this.d.a = new int[30][12];
                            this.d[4] = (p)false;
                            this.d((int)this.w);
                            this.u();
                            this.s();
                            this.a(0, this.l, this.m, 0);
                            this.d[87] = (p)false;
                            this.d[88] = (p)false;
                            this.x = h.a(this.a);
                            break;
                        }
                        case 32: {
                            this.t();
                            this.j();
                            this.v();
                            this.P();
                            this.r = (int)this.q;
                            break;
                        }
                        case 34: {
                            break;
                        }
                        case 36: {
                            this.b = this.a((int)this.p, (byte[][][])this.d[this.q]);
                            this.d[24] = (p)false;
                            this.c = this.b((int)this.p, (byte[][][])this.b[this.q]);
                            this.l[0] = 0;
                            this.a(this.a, 19, this.d[90] == true ? 81 : 80, 0, 0, this.a.e, 26, 1, 0, -1, 1, 0);
                        }
                    }
                    if (this.w[2] <= this.w[3]) break;
                    this.w[2] = 0;
                    h.a(this.p, 7);
                    h.a(this.q, 0);
                    this.b = false;
                    this.M();
                    this.a = (Random)false;
                    break;
                }
                case 34: {
                    this.w[3] = 10;
                    this.w[2] = this.w[2] + 1;
                    switch (this.w[2]) {
                        case 1: {
                            int n13;
                            for (n13 = 1; n13 <= 21; ++n13) {
                                this.o(n13);
                                this.n(n13);
                            }
                            this.a = null;
                            this.b = null;
                            for (n13 = 44; n13 <= 48; ++n13) {
                                this.o(n13);
                                this.n(n13);
                            }
                            this.o(29);
                            this.n(29);
                            this.o(30);
                            this.n(30);
                            this.o(37);
                            this.n(37);
                            this.o(41);
                            this.n(41);
                            this.o(42);
                            this.n(42);
                            this.n(25);
                            this.n(33);
                            this.o(33);
                            this.n(39);
                            this.o(39);
                            this.e(25);
                            System.gc();
                            this.K();
                            break;
                        }
                        case 5: {
                            this.d[17] = (p)((short)(this.x[0] / 240 + this.d[this.q][(this.p << 2) + true]));
                            this.d[18] = (p)((short)(this.x[1] / 320 + this.d[this.q][(this.p << 2) + 2]));
                            this.p = (byte[])this.v;
                            this.w = (int[])this.d[this.q][this.p << 2];
                            this.t = h.i((int)this.q);
                            this.e[this.u] = null;
                            this.u = h.j(this.t);
                            this.e[this.u] = g.a(h.a("/data/data/mapmodule_" + this.u + ".mid"));
                            this.e[this.q][this.p] = true;
                            int n14 = 0;
                            for (n3 = 0; n3 < ((void)this.e[this.q]).length; ++n3) {
                                if (this.e[this.q][n3] != true) continue;
                                ++n14;
                            }
                            this.x[this.q] = (byte)(n14 * 100 / ((void)this.e[this.q]).length);
                            this.c = new p();
                            this.c.a = new int[12][12];
                            this.d = new p();
                            this.d.a = new int[30][12];
                            this.d[4] = (p)false;
                            this.d((int)this.w);
                            this.u();
                            this.a.a = new int[46][12];
                            if (this.h[this.a.f][4] != true || this.a.a[this.a.f][0][0] != 1) {
                                this.a.a = new short[10][][];
                                for (n3 = 0; n3 < this.a.a.length; ++n3) {
                                    this.a.a[n3] = new short[i.b[this.a.h][this.h[n3][1]][6]][16];
                                }
                                this.a.b = new byte[10];
                            }
                            this.s();
                            this.K();
                            this.a(0, this.l, this.m, 0);
                            i.a(this.a, y[0], y[1]);
                            break;
                        }
                        case 6: {
                            this.x = h.a(this.a);
                            this.j();
                            this.t();
                            this.v();
                            this.b(0, 0);
                            this.d[35] = (p)false;
                            this.d[1] = (p)false;
                            this.d[55] = (p)false;
                            this.d[24] = (p)false;
                            this.d[61] = (p)false;
                            this.d[76] = (p)false;
                            this.d[49] = (p)false;
                            this.d[33] = (p)-1;
                            this.d[93] = (p)false;
                            this.d[96] = (p)false;
                            this.d[62] = (p)5;
                            this.d[15] = (p)false;
                            this.h = 0;
                            this.b = this.a((int)this.p, (byte[][][])this.d[this.q]);
                            this.c = this.b((int)this.p, (byte[][][])this.b[this.q]);
                            if (this.r != this.q) {
                                this.r = (int)this.q;
                                this.d[87] = (p)false;
                                this.d[88] = (p)false;
                                break;
                            }
                            this.d[87] = (p)3;
                            this.d[88] = (p)false;
                            break;
                        }
                        case 7: {
                            System.gc();
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    this.w[2] = 0;
                    this.d[17] = (p)((short)(this.x[0] / 240 + this.d[this.q][(this.p << 2) + true]));
                    this.d[18] = (p)((short)(this.x[1] / 320 + this.d[this.q][(this.p << 2) + 2]));
                    this.b = false;
                    h.a(this.p, 7);
                    break;
                }
                case 35: {
                    this.w[3] = 2;
                    this.w[2] = this.w[2] + 1;
                    switch (this.w[2]) {
                        case 1: {
                            this.l();
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    this.w[2] = 0;
                    if (this.i[21] == true && this.i[22] == false) {
                        this.d[16] = (p)48;
                        h.a(this.p, 37);
                        this.w[2] = 0;
                        this.i[22] = true;
                        break;
                    }
                    this.M();
                    this.b = false;
                    h.a(this.p, 7);
                    h.a(this.q, 0);
                    this.e(39);
                    this.b(39);
                    this.D();
                    this.a(this.c, 9, 0, (int)this.d[13], (int)this.d[14], 1, 39, 1, 1, -1, 2, 1);
                    break;
                }
                case 37: {
                    this.w[3] = 10;
                    this.w[2] = this.w[2] + 1;
                    switch (this.w[2]) {
                        case 2: {
                            if (this.d[16] == 44) {
                                this.n(39);
                                this.o(33);
                                this.n(33);
                            }
                            this.e(26);
                            this.b(26);
                            this.e(31);
                            this.b(31);
                            break;
                        }
                        case 8: {
                            this.g((int)this.d[16]);
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    this.w[2] = 0;
                    h.a(this.p, 27);
                    h.a(this.q, 0);
                    this.c(6, -1);
                    this.b = false;
                    this.a = (Random)true;
                    switch (this.d[16]) {
                        case 44: 
                        case 46: 
                        case 47: {
                            this.a(1, 16, 0);
                            break;
                        }
                        case 48: {
                            this.a(3, 16, 0);
                        }
                    }
                    break;
                }
                case 36: {
                    this.w[3] = 10;
                    this.w[2] = this.w[2] + 1;
                    switch (this.w[2]) {
                        case 2: {
                            if (this.b.g == 45) {
                                this.l();
                            }
                            System.gc();
                            break;
                        }
                        case 8: {
                            if (this.b.g == 45 && this.i[17] == false) {
                                this.i[17] = true;
                                this.a[0][1] = (Random)false;
                                this.f[0] = this.a[this.a[0][1]][0];
                                this.a.f = (byte)this.a[this.a.a][1];
                                for (int i14 = 0; i14 < ((byte)this.e).length; ++i14) {
                                    this.c[0][this.e[i14]] = this.c[0][this.c[this.a.f][i14]];
                                }
                                this.k(23);
                            }
                            this.M();
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    this.w[2] = 0;
                    if (this.b.g == 45) {
                        this.a(1, 16, 0);
                    } else {
                        this.h();
                    }
                    this.b = null;
                    h.a(this.p, 7);
                    h.a(this.q, 0);
                    this.b = false;
                    this.a = (Random)false;
                    break;
                }
                case 38: {
                    this.w[3] = 10;
                    this.w[2] = this.w[2] + 1;
                    switch (this.w[2]) {
                        case 2: {
                            this.b = null;
                            this.o(49);
                            this.n(49);
                            break;
                        }
                        case 4: {
                            this.e = new p();
                            this.e.a = new int[4][12];
                            this.e.g = 39;
                            this.n(26);
                            this.o(26);
                            this.n(24);
                            this.o(24);
                            this.n(0);
                            this.o(0);
                            this.n(31);
                            this.o(31);
                            this.n(37);
                            this.o(37);
                            this.e(33);
                            this.b(33);
                            this.e(39);
                            this.b(39);
                            this.e(27);
                            this.b(27);
                            System.gc();
                            break;
                        }
                        case 8: {
                            this.D();
                            this.a(this.e, 0, 0, (int)this.d[13], (int)this.d[14], 1, 33, 1, 1, -1, 2, 1);
                            this.a(this.e, 1, 1, (int)this.d[13], (int)this.d[14], 1, 33, 1, 0, -1, 2, 0);
                            this.a(this.e, 2, 0, (int)this.d[13], (int)this.d[14], 1, 39, 1, 0, -1, 2, 1);
                            this.a(this.e, 3, 2, (int)this.d[13], (int)this.d[14], 1, 33, 1, 1, -1, 2, 0);
                            this.x();
                            if (this.d[34] > 0) {
                                this.c[this.e][this.p[this.e]][0] = 1;
                            }
                            this.d[73] = (p)false;
                            this.c(5, -1);
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    h.a(this.p, 4);
                    h.a(this.q, 1);
                    break;
                }
                case 4: {
                    switch (this.q[0]) {
                        case 12: {
                            break block0;
                        }
                        case 21: {
                            this.d[42] = (p)((short)(this.d[42] - true));
                            if (this.d[42] + this.d[41] * this.d[43] <= 80) {
                                this.d[65] = (p)220;
                                this.d[41] = (p)((short)((((String)((Object)this.a[2][0][1][0])).length() + 1) / (this.d[65] / g.a((Font)a[0]))));
                                this.d[42] = (p)295;
                                this.d[43] = (p)25;
                                break block0;
                            }
                            break block193;
                        }
                        case 30: {
                            short s;
                            if (this.d[39] > 0) {
                                short s2 = (short)(this.d[39] - true);
                                s = s2;
                                this.d[39] = (p)s2;
                            } else {
                                s = 0;
                            }
                            this.d[39] = (p)s;
                            break block0;
                        }
                        case 11: {
                            this.o();
                        }
                    }
                }
            }
        }
        if (this.d[47] == true && this.d[68] > 0) {
            this.d[68] = (p)((short)(this.d[68] - true));
        }
        if (this.d[74] > 0) {
            this.d[74] = (p)((short)(this.d[74] - true));
        }
        int[] nArray = this.w;
        object = this.a;
        this.a.a = nArray;
    }

    private void l() {
        int n2;
        int n3;
        for (n3 = 1; n3 <= 21; ++n3) {
            this.n(n3);
        }
        this.a = null;
        for (n3 = 44; n3 <= 48; ++n3) {
            this.o(n3);
            this.n(n3);
        }
        this.n(29);
        this.n(30);
        this.n(37);
        this.n(41);
        this.n(42);
        System.gc();
        this.w = (int[])this.d[this.q][this.p << 2];
        this.t = h.i((int)this.q);
        this.e[this.u] = null;
        this.u = h.j(this.t);
        this.e[this.u] = g.a(h.a("/data/data/mapmodule_" + this.u + ".mid"));
        this.e[this.q][this.p] = true;
        if (this.u == 1) {
            this.a((p)this.a, 15, 0);
        } else {
            this.a((p)this.a, 0, 0);
        }
        this.d[90] = this.u == 2 ? (Object)2 : (p)false;
        n3 = 0;
        for (n2 = 0; n2 < ((void)this.e[this.q]).length; ++n2) {
            if (this.e[this.q][n2] != true) continue;
            ++n3;
        }
        this.x[this.q] = (byte)(n3 * 100 / ((void)this.e[this.q]).length);
        this.c = new p();
        this.c.a = new int[12][12];
        this.d = new p();
        this.d.a = new int[30][12];
        this.d[4] = (p)false;
        this.d((int)this.w);
        this.u();
        this.t();
        if (h.i(this.r) != this.t) {
            this.p(h.i(this.r));
            this.c(this.t);
        }
        this.a.a = new int[46][12];
        if (this.h[this.a.f][4] != true || this.a.a[this.a.f][0][0] != 1) {
            this.a.a = new short[10][][];
            for (n2 = 0; n2 < this.a.a.length; ++n2) {
                this.a.a[n2] = new short[i.b[this.a.h][this.h[n2][1]][6]][16];
            }
            this.a.b = new byte[10];
        }
        this.a(0, this.l, this.m, 0);
        if (this.q == true) {
            i.a(this.a, this.j << 1, this.k * 3);
        } else {
            i.a(this.a, this.j * 6, this.k * 5);
        }
        this.a.e = 1;
        this.x = h.a(this.a);
        this.j();
        this.s();
        this.v();
        for (n2 = 0; n2 < ((p)this.d[this.q]).length; ++n2) {
            for (n3 = 0; n3 < ((p)this.d[this.q][n2]).length; ++n3) {
                this.d[this.q][n2][n3] = (p)false;
            }
        }
        for (n2 = 0; n2 < ((void)this.b[this.q]).length; ++n2) {
            this.b[this.q][n2] = false;
        }
        this.b = this.a((int)this.p, (byte[][][])this.d[this.q]);
        this.c = this.b((int)this.p, (byte[][][])this.b[this.q]);
        this.b(0, 0);
        this.d[35] = (p)false;
        this.d[86] = (p)false;
        this.d[1] = (p)false;
        this.d[55] = (p)false;
        this.d[24] = (p)false;
        this.d[49] = (p)false;
        this.d[33] = (p)-1;
        this.d[93] = (p)false;
        this.d[96] = (p)false;
        this.d[15] = (p)false;
        if (this.r != this.q) {
            this.r = (int)this.q;
            this.d[87] = (p)false;
            this.d[88] = (p)false;
            return;
        }
        this.d[87] = (p)3;
        this.d[88] = (p)false;
    }

    private void m() {
        switch (this.q[0]) {
            case 14: {
                if (this.f == 0) {
                    this.w[2] = this.w[2] + 1;
                    this.w[3] = 2;
                    switch (this.w[2]) {
                        case 2: {
                            int n2;
                            int n3;
                            int n4;
                            this.a.a[0] = this.a.a[1];
                            this.a.d[0] = this.a.d[1];
                            h h2 = this;
                            int[] nArray = new int[2000];
                            byte[] byArray = new byte[(nArray.length << 2) + 1];
                            int n5 = 0;
                            byArray[0] = 1;
                            h2.d[34] = (p)((short)byArray[0]);
                            nArray[0] = (int)h2.q;
                            nArray[1] = (int)h2.p;
                            n5 = h.a(nArray, 2, (byte[][][][])h2.a, 0);
                            n5 = h.a(nArray, n5, (byte[][][][])h2.a, 6);
                            n5 = h.a(nArray, n5, (byte[][])h2.a);
                            for (n4 = 0; n4 < ((byte)h2.e).length; ++n4) {
                                nArray[n5++] = h2.e[n4];
                            }
                            for (n4 = 0; n4 < ((byte)h2.f).length; ++n4) {
                                nArray[n5++] = h2.f[n4];
                            }
                            for (n4 = 0; n4 < ((int)h2.i).length; ++n4) {
                                nArray[n5++] = h2.i[n4];
                            }
                            n5 = h.a(nArray, n5, (int)h2.a, (byte[])h2.e);
                            n5 = h.a(nArray, n5, h2.b ? 1 : 0, (byte[])h2.f);
                            n5 = h.a(nArray, n5, (int)h2.d, h2.l);
                            n5 = h.a(nArray, n5, (int)h2.c, h2.k);
                            for (n4 = 0; n4 < h2.k.length; ++n4) {
                                nArray[n5++] = h2.k[n4];
                            }
                            nArray[n5++] = (int)h2.a.m;
                            nArray[n5++] = h2.a.n;
                            nArray[n5++] = h2.a.f[0];
                            nArray[n5++] = h2.a.b[0];
                            nArray[n5++] = h2.a.c[0];
                            nArray[n5++] = h2.a.a;
                            nArray[n5++] = h2.a.b;
                            nArray[n5++] = h2.a.f;
                            nArray[n5++] = h2.a.a[1];
                            nArray[n5++] = h2.a.d[1];
                            nArray[n5++] = h2.a.e[0];
                            nArray[n5++] = h2.a.m[0];
                            nArray[n5++] = h2.x[0];
                            nArray[n5++] = h2.x[1];
                            nArray[n5++] = h2.a.e;
                            Object object = h2.e;
                            n4 = n5;
                            int[] nArray2 = nArray;
                            for (n3 = 12; n3 <= 19; ++n3) {
                                nArray2[n4++] = object[n3][1][0];
                            }
                            int n6 = n4;
                            object = h2.d;
                            n4 = n6;
                            int[] nArray3 = nArray;
                            n3 = n4;
                            for (n4 = 0; n4 < ((byte)object).length; ++n4) {
                                if (((void)object[n4]).length <= 0) continue;
                                for (n2 = 0; n2 < ((void)object[n4]).length; ++n2) {
                                    if (((void)object[n4][n2]).length <= 0) continue;
                                    for (int i2 = 0; i2 < ((void)object[n4][n2]).length; ++i2) {
                                        nArray3[n3++] = object[n4][n2][i2];
                                    }
                                }
                            }
                            int n7 = n3;
                            object = h2.b;
                            n4 = n7;
                            int[] nArray4 = nArray;
                            n3 = n4;
                            for (n4 = 0; n4 < ((byte)object).length; ++n4) {
                                if (((void)object[n4]).length <= 0) continue;
                                for (n2 = 0; n2 < ((void)object[n4]).length; ++n2) {
                                    nArray4[n3++] = object[n4][n2];
                                }
                            }
                            int n8 = n3;
                            for (n4 = 0; n4 < ((byte)h2.e).length; ++n4) {
                                for (int i3 = 0; i3 < ((void)h2.e[n4]).length; ++i3) {
                                    nArray[n8++] = h2.e[n4][i3];
                                }
                            }
                            for (n4 = 70; n4 <= 115; ++n4) {
                                nArray[n8++] = (int)h2.g[n4][0];
                            }
                            for (n4 = 0; n4 < h2.d.length; ++n4) {
                                nArray[n8++] = (int)h2.d[n4][0];
                            }
                            for (n4 = 0; n4 < h2.t.length; ++n4) {
                                nArray[n8++] = h2.t[n4];
                            }
                            for (n4 = 0; n4 < h2.u.length; ++n4) {
                                nArray[n8++] = h2.u[n4];
                            }
                            for (n4 = 0; n4 < ((int)h2.i).length; ++n4) {
                                for (int i4 = 0; i4 < ((void)h2.i[n4]).length; ++i4) {
                                    nArray[n8++] = h2.i[n4][i4];
                                }
                            }
                            for (n4 = 0; n4 < h2.x.length; ++n4) {
                                nArray[n8++] = h2.x[n4];
                            }
                            for (n4 = 0; n4 < h2.y.length; ++n4) {
                                nArray[n8++] = h2.y[n4];
                            }
                            h.a(nArray, n8, (byte[][][][])h2.b);
                            n8 = 1;
                            byArray[0] = 1;
                            for (int i5 = 0; i5 < nArray.length; ++i5) {
                                byte[] byArray2 = g.a((long)nArray[i5], 4);
                                for (n3 = 0; n3 < byArray2.length; ++n3) {
                                    byArray[n8++] = byArray2[n3];
                                }
                            }
                            n n9 = new n((String)h2.b);
                            if (n9.a() == 0) {
                                n9.a(byArray, 0, byArray.length);
                            } else {
                                n9.a(1, byArray, 0, byArray.length);
                            }
                            n9.a();
                            h2.a.a[0] = h2.a.a[1];
                            h2.a.d[0] = h2.a.d[1];
                        }
                    }
                    if (this.w[2] < this.w[3]) break;
                    this.w[2] = 0;
                    this.f = 1;
                    return;
                }
                if (this.f != 1) break;
                this.w[2] = this.w[2] + 1;
                if (this.w[2] < 8) break;
                this.w[2] = 0;
                this.d[35] = (p)true;
                if (this.c != null) {
                    for (int i6 = 0; i6 < this.c.length; ++i6) {
                        if (this.c[i6].g != 29) continue;
                        this.a(this.c[i6], 1, 1);
                    }
                }
                this.b = false;
                h.a(this.p, 7);
                h.a(this.q, 0);
                return;
            }
            case 22: {
                this.d[64] = (p)((short)(this.d[64] - true));
                if (this.d[64] > 0) break;
                this.q[0] = 0;
                if (this.q == 21 && this.i[18] == false) {
                    this.i[18] = true;
                    h.a(this.p, 4);
                    h.a(this.q, 21);
                    this.d[65] = (p)220;
                    this.d[41] = (p)((short)((((String)((Object)this.a)).length() + 1) / (this.d[65] / g.a((Font)a[0]))));
                    this.d[42] = (p)295;
                    this.d[43] = (p)25;
                    this.c(6, -1);
                    return;
                }
                this.b = false;
                h.a(this.p, 7);
                h.a(this.q, 0);
            }
        }
    }

    private void n() {
        if (this.a.a[1]) {
            this.a.a[1] = false;
            this.a.a[0] = 0;
            this.d[58] = (p)true;
            this.d[59] = (p)3;
            this.a = (Random)300;
            this.K();
        }
        if (this.d[58] != false) {
            if (this.d[58] == true) {
                if (this.d[59] <= 0) {
                    this.d[58] = (p)2;
                    this.a(0, 4, 1);
                } else {
                    this.d[59] = (p)((short)(this.d[59] - true));
                }
            } else if (this.d[58] == 2) {
                if (this.a() && this.v[5] == 1) {
                    this.d[58] = (p)3;
                    this.a = (Random)80;
                    this.c(9, 1);
                    this.a(4, 5, 1);
                }
            } else if (this.d[58] == 3 && this.a() && this.v[5] == 1) {
                this.K();
                this.d[58] = (p)false;
                this.d[61] = (p)false;
                this.d[76] = (p)false;
                this.a = (Random)80;
                h.a(this.p, 7);
                h.a(this.q, 19);
                this.b = true;
                if (this.k[8] > 0) {
                    this.f = 1;
                } else {
                    this.f = 0;
                    if (this.b[0][3] >= this.b[0][2]) {
                        this.q(3);
                    }
                }
            }
        }
        if (this.d[58] > 0) {
            this.a.c[0] = 5;
            this.a.k = 0;
        }
    }

    private void o() {
        int n2;
        h h2 = this;
        if (h2.a.b < 4 && h2.e[h2.a.a] >= h2.b((int)h2.a.f, (int)h2.a.b)) {
            h2.d[23] = (p)((short)h2.a.b);
            Random random = h2.a[h2.a.a];
            random[2] = (Random)((byte)(random[2] + true));
            h2.a.b = (byte)h2.a[h2.a.a][2];
            h2.e[h2.a.a] = false;
            h2.a(h2.a, 0, 54, 0, 0, h2.a.e, 26, 1, 1, -1, 1, 1);
            h2.k(93);
            h2.K();
        }
        for (n2 = 0; n2 < this.s.length; ++n2) {
            this.s[n2] = 0;
        }
        for (n2 = 0; n2 < 3; ++n2) {
            if (this.a[this.a.a][3 + (n2 << 1)] <= 0) continue;
            reference v1 = this.a[this.a.a][3 + (n2 << 1) + 1] / 3;
            this.s[v1] = this.s[v1] + this.d[this.a[this.a.a][3 + (n2 << 1) + 1]][1];
        }
        if ((this.q[0] == 0 || this.q[0] > 0 && this.g[this.q[0]][3] >= 57) && !this.b) {
            if (this.q == 6 || this.q == 14 || this.q == 19) {
                if (this.d[51] > 0) {
                    this.d[51] = (p)((short)(this.d[51] - true));
                } else if (this.d[51] == false) {
                    this.d[51] = (p)-1;
                    h.a(this.p, 7);
                    h.a(this.q, 0);
                    this.b = false;
                    this.a = (Random)true;
                    this.a(55, 0);
                    this.a(57, 0);
                    this.a(2, 16, 2);
                    this.s = 1;
                }
            }
            if (this.d[6] > 0) {
                this.d[6] = (p)((short)(this.d[6] - true));
            }
            if (this.l[0] > 0) {
                this.l[0] = this.l[0] - 1;
                if (this.l[0] == 0) {
                    this.a(this.a, 19, this.d[90] == true ? 81 : 80, 0, 0, this.a.e, 26, 1, 0, -1, 1, 0);
                }
            } else if (this.a.a[0] < this.a.a[1]) {
                this.a.a[0] = (short)(this.a.a[0] + 1);
            }
            if (this.a.a[0] > 0 && this.a.a[0] <= this.a.a[1] / 4) {
                this.d[69] = (p)((short)this.a());
                if (this.d[61] == false && this.d[69] >= 0) {
                    this.a(this.c, 6, 56 + (this.d[69] - 12), 0, 0, 1, 28, 1, 1, -1, 1, 1);
                    this.d[61] = (p)true;
                }
            }
            if (this.a.a[0] > 0 && this.a.d[0] <= this.a.d[1] / 5) {
                this.d[75] = (p)((short)this.b());
                if (this.d[76] == false && this.d[75] >= 0) {
                    this.a(this.c, 8, 63 + (this.d[75] - 15), 0, 0, 1, 28, 1, 1, -1, 1, 1);
                    this.d[76] = (p)true;
                }
            }
            if (this.a.a[this.a.f][0][0] == 1) {
                if (this.d[6] == false && this.q != false) {
                    this.a.d[0] = this.a.d[0] - h.m((int)this.h[this.a.f][12]);
                }
                if (this.a.d[0] < h.m((int)this.h[this.a.f][12])) {
                    this.a.a[this.a.f][0][0] = 0;
                    byte by = this.a.f;
                    this.a.b[by] = (byte)(this.a.b[by] - 1);
                    if (this.h[this.a.f][4] == 2) {
                        this.a((p)this.a, (int)this.a[0][this.a.e[0]][this.a.q + 1], (int)this.a[0][this.a.e[0]][this.a.q + 2]);
                        this.a.q += 3;
                    }
                    this.a(55, 0);
                    this.a(57, 0);
                }
            } else {
                Random random = this.a;
                random[0] = random[0] - true;
                if (random[0] <= 0) {
                    this.a[0] = this.a[1];
                    this.a.d[0] = this.a.d[0] + 1;
                    if (this.a.d[0] >= this.a.d[1]) {
                        this.a.d[0] = this.a.d[1];
                    }
                }
            }
        }
        this.a.b[1] = this.a.b[0] + this.f[this.a.a] * this.b[this.a.b] / 100;
        if (this.a.b[1] >= 500) {
            this.k(71);
        }
        this.a.c[1] = this.a.c[0] * (100 + this.s[2]) / 100;
        if (this.a.d[1] >= 300) {
            this.k(73);
        }
        if (this.a.f[0] >= 70) {
            this.k(113);
        }
        if (this.a.f[0] >= 45) {
            this.k(106);
            this.k(108);
        }
        if (this.a.f[0] >= 20) {
            this.k(83);
        }
        if (this.a.f[0] >= 15) {
            this.k(100);
        }
        if (this.a.m[0] >= 30000) {
            this.k(86);
        }
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.a.a[13] = false;
            this.d[5] = (p)true;
            if (this.a((i)this.a, this.b[n2].m, this.b[n2].n + 20, 20, 20, 10, 1, 100, -1) != 1000 || this.a.a[0] != 0 || this.a.a[0] <= 0 || this.a.a[this.a.f][0][0] == 1 && this.h[this.a.f][4] == true) continue;
            if (this.a.a[this.a.f][0][0] == 1 && this.h[this.a.f][4] == 2) {
                this.a.a[this.a.f][0][0] = 0;
                byte by = this.a.f;
                this.a.b[by] = (byte)(this.a.b[by] - 1);
                this.a((p)this.a, (int)this.a[0][this.a.e[0]][this.a.q + 1], (int)this.a[0][this.a.e[0]][this.a.q + 2]);
                this.a.q += 3;
                this.a(55, 0);
                this.a(57, 0);
            }
            h.a(this.a, 4, 0);
            this.a.h = true;
            this.a.b = (short)(this.a.b & 3);
            this.a.c = (short)(this.a.c & 3);
            this.a.b = (short)(this.a.b | (this.a.e == 1 ? 4 : 8));
            this.a.a[9] = true;
            this.a.a[4] = true;
            this.a.a[5] = false;
            this.a.a((byte[][][])this.b, (int)this.d[90], 3, 0);
        }
        if (this.q[0] == 0 && this.d[71] == true) {
            this.d[71] = (p)false;
            this.Q();
            this.x();
            this.b = true;
            h.a(this.q, 25);
        }
        if (this.f() >= 75) {
            this.k(114);
        }
        if (this.d[55] > 0) {
            this.d[55] = (p)((short)(this.d[55] - true));
        }
    }

    public final int a() {
        int n2 = -1;
        if (this.k[14] > 0) {
            n2 = 14;
        } else if (this.k[13] > 0) {
            n2 = 13;
        } else if (this.k[12] > 0) {
            n2 = 12;
        }
        return n2;
    }

    public final int b() {
        int n2 = -1;
        if (this.k[15] > 0) {
            n2 = 15;
        } else if (this.k[16] > 0) {
            n2 = 16;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(c var1_1) {
        block105: {
            block104: {
                block106: {
                    if (var1_1.g == 0) {
                        this.a((p)var1_1);
                    }
                    if (var1_1.g < 1 || var1_1.g > 11) break block104;
                    var3_2 = var1_1;
                    var2_3 = this;
                    var4_5 = 0;
                    if (var3_2 == null) break block105;
                    var5_6 = var3_2.g;
                    if (var3_2.a == false) break block106;
                    switch (var3_2.a[0]) {
                        case 5: {
                            if (var3_2.d || h.a(var2_3.a, var3_2, var3_2.i, 2) <= 0) break block105;
                            var3_2.d = true;
                            h.a((byte[])var3_2.a, 0);
                            break block105;
                        }
                        case 0: {
                            var3_2.a[11] = (c)true;
                            if (h.a(var2_3.a, var3_2, var3_2.h, 2) > 0) {
                                h.a((byte[])var3_2.a, 1);
                            } else {
                                h.a(var3_2, 7, 0);
                                h.a((byte[])var3_2.a, 2);
                            }
                            break block105;
                        }
                        case 1: {
                            h.a((byte[])var3_2.a, 2);
                            var4_5 = h.a((byte[])var2_3.f[var5_6]);
                            h.a(var3_2, var4_5, 0);
                            if (var3_2.e[0] != -1) break block105;
                            break block105;
                        }
                        case 2: {
                            if (var3_2.e[0] != 7 || var3_2.g != 2 && var3_2.g != 4 && var3_2.g != 5 && var3_2.g != 6 && var3_2.g != 7 && var3_2.g != 8 && var3_2.g != 9) ** GOTO lbl40
                            if (h.a(var2_3.a, var3_2, var3_2.h, 2) <= 0) ** GOTO lbl35
                            h.a((byte[])var3_2.a, 1);
                            break block105;
lbl35:
                            // 1 sources

                            var2_3.a((i)var3_2, var2_3.a);
                            if (var3_2.q != -1) break block105;
                            h.a((byte[])var3_2.a, 0);
                            break block105;
lbl40:
                            // 1 sources

                            if (var3_2.a[1] != 4 && var3_2.a[1] != 11) ** GOTO lbl50
                            var2_3.a((i)var3_2, var2_3.a);
                            if (var3_2.q != -1 && var3_2.e[0] != -1) break block105;
                            var3_2.a = (c[])false;
                            if (var3_2.g != 10 && var3_2.g != 11) break block105;
                            var2_3.d[4] = (p)false;
                            var2_3.h((int)var2_3.d[4]);
                            var2_3.b[var2_3.q][var2_3.p] = true;
                            break block105;
lbl50:
                            // 1 sources

                            if (var3_2.a[1] != 3 && var3_2.a[1] != 6) ** GOTO lbl61
                            var2_3.a((i)var3_2, var2_3.a);
                            if (var3_2.q != -1 && !var3_2.f) break block105;
                            var3_2.a[11] = (c)true;
                            if (h.a(var2_3.a, var3_2, var3_2.h, 2) > 0) {
                                h.a((byte[])var3_2.a, 1);
                            } else {
                                h.a(var3_2, 7, 0);
                                h.a((byte[])var3_2.a, 2);
                            }
                            break block105;
lbl61:
                            // 1 sources

                            var2_3.a((i)var3_2, var2_3.a);
                            if (var3_2.q != -1 && !var3_2.f) break block105;
                            h.a((byte[])var3_2.a, 0);
                            break block105;
                        }
                        case 3: {
                            var2_3.a(var3_2, 8, 2);
                            break block105;
                        }
                        case 4: {
                            var2_3.a(var3_2, 9, 2);
                            break block105;
                        }
                        case 6: {
                            var2_3.a(var3_2, 11, 2);
                            break block105;
                        }
                        case 7: {
                            var2_3.a(var3_2, 12, 2);
                            break block105;
                        }
                        case 8: {
                            var2_3.a(var3_2, 13, 2);
                            break block105;
                        }
                        case 9: {
                            var2_3.a(var3_2, 14, 2);
                            break block105;
                        }
                        case 10: {
                            var2_3.a(var3_2, 15, 2);
                            break block105;
                        }
                        case 11: {
                            var2_3.a(var3_2, 16, 2);
                        }
                    }
                    break block105;
                }
                if (var2_3.d[53] < 30 && var3_2.a[1] != false && var2_3.d[4] == true && var3_2.g >= 1 && var3_2.g <= 9) {
                    var3_2.a[6] = (c)((short)(var3_2.a[6] + true));
                    if (var3_2.a[6] >= 80) {
                        var2_3.d[53] = (p)((short)(var2_3.d[53] + true));
                        var2_3.a(var3_2, var3_2.g, var3_2.a * var2_3.j, var3_2.b * var2_3.k);
                        var2_3.a((p)var3_2, 0, 0);
                        var3_2.a[6] = (c)false;
                        var3_2.a[1] = (c)false;
                        var3_2.a[0] = var3_2.a[1];
                        h.a((byte[])var3_2.a, 1);
                        var3_2.d = true;
                        h.a(var3_2, 7, 0);
                        var2_3.C = var2_3.a((p)var3_2);
                        var2_3.a(var3_2, 0, 65, var3_2.m, var3_2.n + var2_3.C[3] / 2, 1, 26, 1, 1, -1, 0, 1);
                        var3_2.a = (c[])false;
                        ** GOTO lbl293
                    }
                }
                break block105;
            }
            if (var1_1.g >= 12 && var1_1.g <= 19) {
                var3_2 = var1_1;
                var2_3 = this;
                if (var3_2 != null) {
                    var4_5 = var3_2.g;
                    var5_6 = 0;
                    if (var3_2.a != false) {
                        switch (var3_2.a[0]) {
                            case 5: {
                                if (var3_2.d || h.a(var2_3.a, var3_2, var3_2.i, 2) <= 0) break;
                                if (var2_3.a[var2_3.q][var2_3.d[22]][1][0] == false) {
                                    switch (var4_5) {
                                        case 12: {
                                            var2_3.k(33 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 13: {
                                            var2_3.k(35 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 14: {
                                            var2_3.k(37 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 15: {
                                            var2_3.k(39 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 16: {
                                            var2_3.k(41 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 17: {
                                            var2_3.k(43 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 18: {
                                            var2_3.k(45 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 19: {
                                            var2_3.k(46 + (var2_3.d[22] << 1));
                                        }
                                    }
                                }
                                if (var4_5 == 15 || var4_5 == 18 || var4_5 == 19) {
                                    var2_3.c(8, -1);
                                } else {
                                    var2_3.c(7, -1);
                                }
                                var3_2.d = true;
                                h.a((byte[])var3_2.a, 0);
                                break;
                            }
                            case 0: {
                                var3_2.a[11] = (c)true;
                                h.a((byte[])var3_2.a, 1);
                                var2_3.d[72] = (p)false;
                                break;
                            }
                            case 1: {
                                var6_7 = new byte[][][]{new byte[][]{{100}, {50, 50}, {33, 33, 34}, {25, 25, 25, 25}, {20, 20, 20, 20, 20}}, new byte[][]{{16, 16, 17, 17, 17, 17}, {0, 16, 16, 17, 17, 17, 17}, {0, 0, 16, 16, 17, 17, 17, 17}, {0, 0, 0, 16, 16, 17, 17, 17, 17}, {0, 0, 0, 0, 16, 16, 17, 17, 17, 17}}};
                                var7_10 = 0;
                                if (var3_2.g == 17 || var3_2.g == 18 || var3_2.g == 19 || var3_2.g == 16) {
                                    var7_10 = 1;
                                }
                                if ((var8_11 = (var3_2.a[1] - var3_2.a[0]) * 100 / var3_2.a[1] / 20) > var2_3.d[24] && var8_11 < 5) {
                                    var2_3.d[24] = (p)((short)var8_11);
                                    var5_6 = var6_7[var7_10][var2_3.d[24]].length - 1;
                                } else {
                                    var5_6 = h.a(var6_7[var7_10][var2_3.d[24]]);
                                }
                                var2_3.d[72] = (p)false;
                                h.a(var3_2, var5_6, 0);
                                h.a((byte[])var3_2.a, 2);
                                if (var3_2.e[0] != -1) break;
                                break;
                            }
                            case 2: {
                                if (var3_2.a[1] == 4) {
                                    var2_3.a((i)var3_2, var2_3.a);
                                    if (var3_2.q == -1) {
                                        var3_2.a = (c[])false;
                                    }
                                }
                                if (var3_2.a[1] == 6) {
                                    var2_3.a((i)var3_2, var2_3.a);
                                    if (var3_2.q != -1) break;
                                    h.a((byte[])var3_2.a, 0);
                                    var2_3.a = (Random)false;
                                    var2_3.k(162);
                                    break;
                                }
                                var2_3.a((i)var3_2, var2_3.a);
                                if (var3_2.q != -1) break;
                                h.a((byte[])var3_2.a, 1);
                                break;
                            }
                            case 4: {
                                var3_2.b = 0;
                                var3_2.a = (c[])-1;
                                var3_2.f = true;
                                if (var2_3.a[var2_3.q][var2_3.d[22]][1][5] == false) {
                                    var3_2.e = var2_3.a[var2_3.q][var2_3.d[22]][1][8] == true ? 1 : (byte)2;
                                    h.a(var3_2, 11, 0);
                                    var2_3.a((i)var3_2, 1);
                                } else {
                                    h.a(var3_2, 10, 0);
                                }
                                var3_2.h = true;
                                var3_2.r = 0;
                                if (var2_3.d[90] == true) {
                                    var2_3.b[0] = var2_3.b[24];
                                    var2_3.b[0] = var2_3.b[24];
                                    var2_3.c[0] = var2_3.c[24];
                                    var2_3.a[0] = var2_3.a[24];
                                    var2_3.d[0] = var2_3.d[24];
                                    var2_3.a.n -= h.f(50);
                                    var2_3.d[90] = var2_3.u == 2 ? (Object)2 : (p)false;
                                    var2_3.a.a[19][1] = 80;
                                }
                                if (var3_2.a != null && var3_2.a.length > 0) {
                                    for (var5_6 = 0; var5_6 < var3_2.a.length; ++var5_6) {
                                        for (var9_13 = 0; var9_13 < ((c)var3_2.a[var5_6]).length; ++var9_13) {
                                            var3_2.a[var5_6][var9_13][0] = (c)false;
                                            v0 = var3_2.b;
                                            v1 = var5_6;
                                            v0[v1] = (byte)(v0[v1] - true);
                                        }
                                    }
                                }
                                var3_2.a = (c[])new int[26][12];
                                var3_2.a = null;
                                h.a((byte[])var3_2.a, 2);
                                var2_3.M();
                                var2_3.d[4] = (p)false;
                                var2_3.h((int)var2_3.d[4]);
                                if (var2_3.a[var2_3.q][var2_3.d[22]][1][0] == false) {
                                    var2_3.a[var2_3.q][var2_3.d[22]][1][0] = (Random)true;
                                    switch (var4_5) {
                                        case 12: {
                                            var2_3.k(34 + (var2_3.d[22] << 1));
                                            if (var2_3.a[var2_3.q][var2_3.d[22]][1][5] != true) break;
                                            var2_3.k(85);
                                            var2_3.k(98);
                                            break;
                                        }
                                        case 13: {
                                            var2_3.k(36 + (var2_3.d[22] << 1));
                                            if (var2_3.a[var2_3.q][var2_3.d[22]][1][5] != true) break;
                                            var2_3.k(79);
                                            break;
                                        }
                                        case 14: {
                                            var2_3.k(38 + (var2_3.d[22] << 1));
                                            if (var2_3.a[var2_3.q][var2_3.d[22]][1][5] != true) break;
                                            var2_3.k(77);
                                            break;
                                        }
                                        case 15: {
                                            var2_3.k(40 + (var2_3.d[22] << 1));
                                            if (var2_3.a[var2_3.q][var2_3.d[22]][1][5] != true) break;
                                            var2_3.k(74);
                                            break;
                                        }
                                        case 16: {
                                            var2_3.k(42 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 17: {
                                            var2_3.k(44 + (var2_3.d[22] << 1));
                                            break;
                                        }
                                        case 19: {
                                            var2_3.k(47 + (var2_3.d[22] << 1));
                                        }
                                    }
                                }
                                if (var2_3.a[var2_3.q][var2_3.d[22]][1][6] == false) {
                                    var2_3.a[var2_3.q][var2_3.d[22]][1][6] = (Random)true;
                                }
                                if (var2_3.a[var2_3.q][var2_3.d[22]][1][5] != true || var4_5 != 17 && var4_5 != 18 && var4_5 != 19 && var4_5 != 16) break;
                                var5_6 = 1 + var2_3.a[var2_3.q][var2_3.d[22]][1][1] - 12;
                                if (var2_3.h <= var2_3.i[var5_6]) {
                                    var2_3.i[var5_6] = var2_3.h;
                                    var2_3.d[63] = (p)true;
                                    if (var2_3.h < 387) {
                                        switch (var4_5) {
                                            case 16: {
                                                var2_3.k(87);
                                                break;
                                            }
                                            case 17: {
                                                var2_3.k(78);
                                                break;
                                            }
                                            case 18: {
                                                var2_3.k(75);
                                                break;
                                            }
                                            case 19: {
                                                var2_3.k(72);
                                            }
                                            default: {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    var2_3.d[63] = (p)false;
                                }
                                var2_3.d[64] = (p)40;
                                var2_3.k(130);
                                break;
                            }
                            case 6: {
                                if (var4_5 != 15) break;
                                var3_2.h = true;
                                h.a(var3_2, 11, 0);
                                h.a((byte[])var3_2.a, 2);
                                var2_3.a = (Random)true;
                            }
                        }
                    }
                    if (var3_2.d && var3_2.a[1] == false && (var3_2.g == 17 || var3_2.g == 18 || var3_2.g == 19 || var3_2.g == 16)) {
                        ++var2_3.h;
                    }
                }
            }
        }
        if (var1_1.k[0] > 0 && var1_1.a == false) {
            var3_2 = var1_1;
            var2_3 = this;
            var4_5 = var3_2.m;
            var5_6 = var3_2.n;
            var6_8 = var3_2.g[2];
            var7_10 = var3_2.g[3];
            v2 = new int[]{0, 0, 0};
            var8_12 = null;
            var8_12 = h.a(var6_8 - var4_5, (long)(var7_10 - var5_6), (long)var3_2.k[0]);
            var5_6 = var3_2.o - var6_8;
            var9_13 = var3_2.p - var7_10;
            if (var5_6 * var5_6 + var9_13 * var9_13 <= var3_2.k[0] * var3_2.k[0]) {
                var8_12[2] = 1;
                var3_2.o = var6_8;
                var3_2.p = var7_10;
            } else {
                var3_2.o += var8_12[0];
                var3_2.p += var8_12[1];
            }
            var3_2.m = var3_2.o;
            var3_2.n = var3_2.p;
            if (var8_12[2] != 1) {
                if (var3_2.o < var3_2.j[0]) {
                    var3_2.o = var3_2.j[0];
                    var8_12[2] = 1;
                } else if (var3_2.o > var3_2.j[0] + var3_2.j[2]) {
                    var3_2.o = var3_2.j[0] + var3_2.j[2];
                    var8_12[2] = 1;
                } else if (var3_2.p < var3_2.j[1] - var3_2.j[3]) {
                    var3_2.p = var3_2.j[1] - var3_2.j[3];
                    var8_12[2] = 1;
                } else if (var3_2.p > var3_2.j[1]) {
                    var3_2.p = var3_2.j[1];
                    var8_12[2] = 1;
                }
            }
            if (var8_12[2] == 1) {
                var3_2.m = var3_2.o;
                var3_2.n = var3_2.p;
                var3_2.b = false;
                var3_2.a = (short)-1;
            }
        }
        this.a((i)var1_1);
        this.d(var1_1);
        this.b((i)var1_1);
        var3_2 = var1_1;
        var2_3 = this;
        if (var3_2 != null && var3_2.a != null) {
            for (var4_5 = 0; var4_5 < var3_2.a.length; ++var4_5) {
                if (var3_2.a[var4_5] == null) continue;
                for (var5_6 = 0; var5_6 < ((c)var3_2.a[var4_5]).length; ++var5_6) {
                    if (var3_2.a[var4_5][var5_6] == null) continue;
                    if (var3_2.a[var4_5][var5_6].g == false) {
                        var2_3.a((p)var3_2.a[var4_5][var5_6]);
                    }
                    if (var2_3.b) continue;
                    var2_3.a((i)var3_2.a[var4_5][var5_6]);
                    var2_3.b((i)var3_2.a[var4_5][var5_6]);
                    if (var3_2.a[var4_5][var5_6].m < var3_2.a[var4_5][var5_6].j[0]) {
                        var3_2.a[var4_5][var5_6].m = var3_2.a[var4_5][var5_6].j[0];
                        continue;
                    }
                    if (var3_2.a[var4_5][var5_6].m <= var3_2.a[var4_5][var5_6].j[0] + var3_2.a[var4_5][var5_6].j[2]) continue;
                    var3_2.a[var4_5][var5_6].m = var3_2.a[var4_5][var5_6].j[0] + var3_2.a[var4_5][var5_6].j[2];
                }
            }
        }
        var3_2 = var1_1;
        var2_3 = this;
        if (var3_2.a != null) {
            for (var4_5 = 0; var4_5 < var3_2.a.length; ++var4_5) {
                if (var3_2.a[var4_5] == null) continue;
                for (var5_6 = 0; var5_6 < ((c)var3_2.a[var4_5]).length; ++var5_6) {
                    if (var3_2.a[var4_5][var5_6] == null) continue;
                    var6_9 = var2_3.a((p)var2_3.a, var3_2.a[var4_5][var5_6], 2, 0, false);
                    if (var6_9 < 3000) {
                        if (var3_2.a[var4_5][var5_6].i >= 18 && var3_2.a[var4_5][var5_6].i <= 27 && ((byte)var2_3.e).length >= var2_3.a) {
                            if (!var3_2.a[var4_5][var5_6].a[17]) {
                                var2_3.k(126);
                            }
                            var3_2.a[var4_5][var5_6].a[17] = true;
                            continue;
                        }
                        if (var2_3.k[var3_2.a[var4_5][var5_6].i] < (var2_3.k[2] == 1 ? 999 : 10)) {
                            var2_3.l((int)var3_2.a[var4_5][var5_6].i);
                            var2_3.a.a[5] = h.a(var2_3.a.a[5], 1, 1, 3);
                            var2_3.a(var2_3.a, var2_3.a.a[5], 59, var3_2.a[var4_5][var5_6].m, var3_2.a[var4_5][var5_6].n, var2_3.a.e, 26, 1, 1, -1, 0, 1);
                            var3_2.a[var4_5][var5_6] = null;
                            continue;
                        }
                        if (var3_2.a[var4_5][var5_6].a[17]) continue;
                        var3_2.a[var4_5][var5_6].a[17] = true;
                        var2_3.C = var2_3.a((p)var2_3.a);
                        var2_3.a(var2_3.a, 18, var2_3.C[0] + (var2_3.C[2] >> 1), var2_3.C[1] + 10);
                        continue;
                    }
                    if (!var3_2.a[var4_5][var5_6].a[17]) continue;
                    var3_2.a[var4_5][var5_6].a[17] = false;
                }
            }
        }
        if (var1_1.a != null) {
            for (var2_4 = 0; var2_4 < var1_1.a.length; ++var2_4) {
                if (var1_1.a[var2_4].a == false) continue;
                this.a(var1_1.a[var2_4]);
            }
        }
    }

    private void p() {
        if (this.a.a[5]) {
            switch (this.a.e[0]) {
                case 1: 
                case 2: {
                    if ((this.a.b & 0xC) == 0) {
                        h.a(this.a, 3, 0);
                        this.a.h = true;
                        break;
                    }
                    if (this.a.e[0] != 1) {
                        if (this.a.e == 2 && (this.a.b & 0xC) == 8 || this.a.e == 1 && (this.a.b & 0xC) == 4) {
                            h.a(this.a, 1, 0);
                            this.a.h = true;
                        } else {
                            h.a(this.a, 2, 0);
                        }
                        if ((this.a.b & 0xC) == 4) {
                            this.a.e = (byte)2;
                            break;
                        }
                        if ((this.a.b & 0xC) == 8) {
                            this.a.e = 1;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } else {
            this.a.b = (short)(this.a.b | 2);
            switch (this.a.e[0]) {
                case 0: 
                case 2: 
                case 7: 
                case 15: 
                case 17: {
                    h.a(this.a, 9, 0);
                    this.a.h = true;
                    this.a.a((byte[][][])this.b, (int)this.d[90], 1, 0);
                    break;
                }
                case 9: {
                    h.a(this.a, 9, 0);
                    this.a.h = true;
                }
            }
        }
        if (!(this.a.a[9] || (this.a.b & 0xC) != 4 && (this.a.b & 0xC) != 8)) {
            if (this.a.a[5] && this.a.e[0] != 15 && ((this.a.b & 0xC) == 4 && this.a.e == 1 || (this.a.b & 0xC) == 8 && this.a.e == 2) && (this.a.e[0] == 11 || this.a.e[0] == 12 || this.a.e[0] == 18 || this.a.e[0] == 19 || this.a.e[0] == 20 || this.a.e[0] == 13 || this.a.e[0] == 22)) {
                h.a(this.a, 15, 0);
                this.a.h = true;
                this.d[0] = (p)false;
            } else if (this.a.e[0] == 0 || this.a.e[0] == 2 || this.a.e[0] == 3 || this.a.e[0] == 7 || this.a.e[0] == 17 || this.a.e[0] == 8 || this.a.e[0] == 9 || this.a.e[0] == 10 || (this.a.e[0] == 12 || this.a.e[0] == 19) && this.a.a[5] && (this.a.b & 0xC) != 0) {
                switch (this.a.e[0]) {
                    case 0: 
                    case 2: 
                    case 3: 
                    case 7: 
                    case 12: 
                    case 17: 
                    case 19: {
                        this.a.a[0][0][0] = 0;
                        if (this.a.e == 2 && (this.a.b & 0xC) == 8 || this.a.e == 1 && (this.a.b & 0xC) == 4) {
                            h.a(this.a, 1, 0);
                            this.a.h = true;
                            break;
                        }
                        h.a(this.a, 2, 0);
                        if (this.a.c[0] == 1) break;
                        this.a.c[0] = 1;
                        this.a.k = 0;
                    }
                }
                if ((this.a.b & 0xC) == 4) {
                    this.a.e = (byte)2;
                } else if ((this.a.b & 0xC) == 8) {
                    this.a.e = 1;
                }
            }
        }
        if (this.a.a[14]) {
            if ((this.a.c & 0xC) == 4) {
                this.a.b = (short)(this.a.b & 3);
                this.a.b = (short)(this.a.b | 4);
                this.a.e = (byte)2;
            } else if ((this.a.c & 0xC) == 8) {
                this.a.b = (short)(this.a.b & 3);
                this.a.b = (short)(this.a.b | 8);
                this.a.e = 1;
            }
        }
        if (this.a.a[16]) {
            if (this.a.e[0] == 17) {
                r.a(this.a, (int)this.a.m, this.a.n - 2);
                return;
            }
            if (this.a.e[0] == 0 || this.a.e[0] == 3 || this.a.e[0] == 10 || this.a.e[0] == 12 || this.a.e[0] == 11 || this.a.e[0] == 19 || this.a.e[0] == 18 || this.a.e[0] == 20 || this.a.e[0] == 13 || this.a.e[0] == 22) {
                h.a(this.a, 17, 0);
                this.a((p)this.a, 7, 1);
                this.a.h = true;
            }
        }
    }

    private void q() {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.length; ++i2) {
                for (int i3 = 0; i3 < this.g[i2].length; ++i3) {
                    for (int i4 = 0; i4 < this.g[i2][i3].length; ++i4) {
                        this.g[i2][i3][i4] = -1;
                    }
                }
            }
            return;
        }
        new Throwable("\"mapReset();\"map is NULL!").printStackTrace();
    }

    private boolean a(i i2, i i3) {
        int[] nArray = i2.h;
        Object object = ((Random)this.a[i2.g][i2.c[0]]).length;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        if (i2.r - 1 >= 0) {
            --i2.r;
            return true;
        }
        if (i2.h == false && i2.f == false && this.a[i2.g][i2.c[0]][object - 1][0] > 0) {
            return true;
        }
        if (i2.e[0] >= 0) {
            if (i2.q > ((Random)this.a[nArray][i2.e[0]]).length || i2.q < 0) {
                return true;
            }
            do {
                if (this.a[nArray][i2.e[0]][i2.q] != -2) {
                    Object object2;
                    if (this.a[nArray][i2.e[0]][i2.q] == -12) {
                        ++i2.q;
                    } else if (this.a[nArray][i2.e[0]][i2.q] == -3) {
                        if (i2.e != (i3.m > i2.m ? 1 : 2)) {
                            i2.e = (int[])(i3.m > i2.m ? 1 : 2);
                        }
                        ++i2.q;
                    } else if (this.a[nArray][i2.e[0]][i2.q] == -5) {
                        i2.e = (int[])(i3.e == 2 ? 1 : 2);
                        ++i2.q;
                    } else if (this.a[nArray][i2.e[0]][i2.q] == -58) {
                        i2.e = (int[])(i2.m > this.d[30] ? 2 : 1);
                        ++i2.q;
                    } else if (this.a[nArray][i2.e[0]][i2.q] == -23) {
                        i2.q += 2;
                    } else if (this.a[nArray][i2.e[0]][i2.q] == -16) {
                        if ((this.d[90] == true || i2.c > 0) && (this.d[90] != true || i2.c < 0)) break;
                        ++i2.q;
                    } else if (this.a[nArray][i2.e[0]][i2.q] == -18) {
                        if (!i2.a[5]) break;
                        if (i2.a[15]) {
                            i2.a[15] = false;
                            i2.q += 3;
                        } else {
                            i2.q = !i2.b ? ++i2.q : (i2.q += 5);
                        }
                    } else {
                        if (this.a[nArray][i2.e[0]][i2.q] == -10) {
                            i2.r = (int)this.a[nArray][i2.e[0]][++i2.q];
                            ++i2.q;
                            break;
                        }
                        if (this.a[nArray][i2.e[0]][i2.q] == -13) {
                            if (this.a[nArray][i2.e[0]][i2.q + 1] >= 0) {
                                i2.k[0] = (byte)this.a[nArray][i2.e[0]][i2.q + 1];
                                if (i2.k[0] > 2) {
                                    i2.k[0] = h.f(i2.k[0]);
                                }
                            } else {
                                i2.k[0] = (byte)this.x;
                            }
                            i2.q += 2;
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -14) {
                            i2.k[0] = this.g();
                            ++i2.q;
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -15) {
                            i2.q = this.u == 1 ? ++i2.q : (i2.q += 5);
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -53) {
                            this.x = (int[])(h.c((int)(this.a[nArray][i2.e[0]][i2.q + 2] - this.a[nArray][i2.e[0]][i2.q + 1] + true)) + this.a[nArray][i2.e[0]][i2.q + 1]);
                            i2.q += 3;
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -54) {
                            int n2;
                            i i4;
                            if (this.a[nArray][i2.e[0]][i2.q + 1] >= 0) {
                                i4 = i2;
                                n2 = (int)this.a[nArray][i2.e[0]][i2.q + 1];
                            } else {
                                i4 = i2;
                                n2 = h.c(2) == 0 ? 1 : (byte)this.x;
                            }
                            i4.l = n2;
                            i2.q += 2;
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -56) {
                            this.x = this.a[nArray][i2.e[0]][i2.q + 1] + (this.d[24] + true) * this.a[nArray][i2.e[0]][i2.q + 2];
                            i2.q += 3;
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -9) {
                            l2 = i3.m - i2.m;
                            l3 = i3.n + h.f(20) - i2.n;
                            i2.o = i2.m;
                            i2.p = i2.n;
                            l4 = (long)this.a[nArray][i2.e[0]][i2.q + 2];
                            object2 = false;
                            object = 0;
                            if (this.a[nArray][i2.e[0]][i2.q + 1] == true) {
                                int[] nArray2 = h.a(l2, l3, l4);
                                object2 = nArray2[0];
                                object = nArray2[1];
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 2) {
                                object2 = this.a[nArray][i2.e[0]][i2.q + 2];
                                object = 0;
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 3) {
                                object2 = false;
                                object = this.a[nArray][i2.e[0]][i2.q + 2];
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 4) {
                                int[] nArray3 = h.a(l2, 0L, l4);
                                object2 = nArray3[0];
                                object = nArray3[1];
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 5) {
                                int[] nArray4 = h.a(0L, l3, l4);
                                object2 = nArray4[0];
                                object = nArray4[1];
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 6) {
                                object2 = this.d[25] == true ? this.a[nArray][i2.e[0]][i2.q + 2] : -this.a[nArray][i2.e[0]][i2.q + 2];
                                object = 0;
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 7) {
                                l2 = (long)(this.d[30] - i2.m);
                                l3 = (long)(this.d[31] + h.f(60) - i2.n);
                                i2.o = i2.m;
                                i2.p = i2.n;
                                int[] nArray5 = h.a(l2, l3, l4);
                                object2 = nArray5[0];
                                object = nArray5[1];
                            } else if (this.a[nArray][i2.e[0]][i2.q + 1] == 8) {
                                l2 = i3.m - i2.m;
                                l3 = i3.n + h.f(110) - i2.n;
                                int[] nArray6 = h.a(l2, l3, l4);
                                object2 = nArray6[0];
                                object = nArray6[1];
                            }
                            if ((this.a[nArray][i2.e[0]][i2.q + 1] == true || this.a[nArray][i2.e[0]][i2.q + 1] == 2 || this.a[nArray][i2.e[0]][i2.q + 1] == 4 || this.a[nArray][i2.e[0]][i2.q + 1] == 6) && object2 == false) {
                                object2 = g.c(30);
                            }
                            if ((this.a[nArray][i2.e[0]][i2.q + 1] == true || this.a[nArray][i2.e[0]][i2.q + 1] == 3 || this.a[nArray][i2.e[0]][i2.q + 1] == 5) && object == 0) {
                                object = g.c(40);
                            }
                            i.a(i2.g, i2.m, i2.n, i2.m + object2, i2.n + object);
                            i2.q += 3;
                        } else if (this.a[nArray][i2.e[0]][i2.q] == -6) {
                            i2.a = (byte)this.a[nArray][i2.e[0]][i2.q + 1];
                            i2.q += 2;
                        } else {
                            Object object3;
                            if (this.a[nArray][i2.e[0]][i2.q] == -24) {
                                object2 = -1;
                                switch (i2.e[0]) {
                                    case 11: {
                                        switch (this.h[this.a.f][0]) {
                                            case 0: {
                                                object2 = 17;
                                                break;
                                            }
                                            case 1: {
                                                object2 = 18;
                                                break;
                                            }
                                            case 2: {
                                                object2 = 19;
                                            }
                                        }
                                        break;
                                    }
                                    case 12: {
                                        object2 = 20;
                                        break;
                                    }
                                    case 18: {
                                        switch (this.h[this.a.f][0]) {
                                            case 0: {
                                                object2 = 21;
                                                break;
                                            }
                                            case 1: {
                                                object2 = 22;
                                                break;
                                            }
                                            case 2: {
                                                object2 = 23;
                                            }
                                        }
                                        break;
                                    }
                                    case 19: {
                                        object2 = 24;
                                        break;
                                    }
                                    case 20: {
                                        switch (this.h[this.a.f][0]) {
                                            case 0: {
                                                object2 = 25;
                                                break;
                                            }
                                            case 1: {
                                                object2 = 26;
                                                break;
                                            }
                                            case 2: {
                                                object2 = 27;
                                            }
                                        }
                                        break;
                                    }
                                    case 21: {
                                        object2 = 28;
                                        break;
                                    }
                                    case 16: {
                                        object2 = 31;
                                    }
                                }
                                this.a((p)i2, (int)object2, 1);
                                ++i2.q;
                                break;
                            }
                            if (this.a[nArray][i2.e[0]][i2.q] == -27) {
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -28) {
                                if (i2.g == false && this.a[nArray][i2.e[0]][i2.q + 1] == 21 || this.a[nArray][i2.e[0]][i2.q + 1] == 25) {
                                    this.a.a((byte[][][])this.b, (int)this.d[90], 6, 0);
                                    this.a.b = (short)(this.a.b | 1);
                                    this.a.a[4] = true;
                                    this.a.a[5] = false;
                                }
                                h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 1], 0);
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -30) {
                                if ((i2.e[0] == 12 || i2.e[0] == 19) && this.d[56] == true) {
                                    this.d[56] = (p)false;
                                    h.a(i2, 11, 0);
                                    i2.h = (int[])true;
                                } else {
                                    ++i2.q;
                                    if (i2.a[5]) {
                                        ++i2.q;
                                    }
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q], 0);
                                }
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -25) {
                                if (this.d[0] == false && ((this.h(52) == 1 || this.h(-3) == 1) && this.a.e == 1 || (this.h(54) == 1 || this.h(-4) == 1) && this.a.e == 2)) {
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 1], 0);
                                    i2.h = (int[])true;
                                    this.d[0] = (p)((short)(this.d[0] + true));
                                } else {
                                    this.d[0] = (p)false;
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 2], 0);
                                    i2.h = (int[])true;
                                }
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -26) {
                                if (this.h(53) == 1 || this.h(-5) == 1) {
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 1], 0);
                                    i2.h = (int[])true;
                                } else {
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 2], 0);
                                    i2.h = (int[])true;
                                }
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -52) {
                                if ((this.h(57) == 1 || this.h(55) == 1) && (this.d[6] > 0 || this.d[6] == false && this.a.d[0] - h.l((int)this.h[this.a.f][12]) >= 0)) {
                                    if (this.d[6] == false && this.q != false) {
                                        this.a.d[0] = this.a.d[0] - h.l((int)this.h[this.a.f][12]);
                                    }
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 1], 0);
                                    i2.h = (int[])true;
                                } else {
                                    h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q + 2], 0);
                                    i2.h = (int[])true;
                                }
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -4) {
                                if (this.h(57) == 1 || this.h(55) == 1) break;
                                if (this.a.a[this.a.f][0][0] > 0) {
                                    byte by = this.a.f;
                                    this.a.b[by] = (byte)(this.a.b[by] - 1);
                                    this.a.a[this.a.f][0][0] = 0;
                                    this.a((p)this.a, (int)this.a[nArray][i2.e[0]][i2.q + 1], (int)this.a[nArray][i2.e[0]][i2.q + 2]);
                                    i2.q += 3;
                                }
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -31) {
                                ++i2.q;
                                if ((this.a.b & 0xC) != 8 && (this.a.b & 0xC) != 4) {
                                    ++i2.q;
                                }
                                h.a(i2, (int)this.a[nArray][i2.e[0]][i2.q], 0);
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -32) {
                                this.d[21] = this.a[nArray][i2.e[0]][i2.q + 1];
                                i2.q += 2;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -35) {
                                i2.e = (int[])((byte)this.a[nArray][i2.e[0]][i2.q + 1]);
                                i2.q += 2;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -36) {
                                if (i2.b || i2.a != -1) break;
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -19) {
                                i2.h = (int[])true;
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -38) {
                                if (i2.a[9]) break;
                                i2.q = i2.a[5] ? ++i2.q : (i2.q += 3);
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -39) {
                                object2 = false;
                                object = 0;
                                int n3 = h.f((int)this.a[nArray][i2.e[0]][i2.q + 2]);
                                object3 = h.f((int)this.a[nArray][i2.e[0]][i2.q + 3]);
                                i2.o = i2.m;
                                i2.p = i2.n;
                                Object object4 = false;
                                object4 = this.a[nArray][i2.e[0]][i2.q + 1] >= 0 ? this.a[nArray][i2.e[0]][i2.q + 1] : this.x;
                                switch (object4) {
                                    case 0: {
                                        object2 = this.a.e == 1 ? i3.m + n3 : i3.m - n3;
                                        object = i3.n;
                                        break;
                                    }
                                    case 1: {
                                        object2 = this.a.e == 1 ? i3.m - n3 : i3.m + n3;
                                        object = i3.n;
                                        break;
                                    }
                                    case 2: {
                                        object2 = this.a.e == 1 ? i3.m + n3 : i3.m - n3;
                                        object = i3.n + object3;
                                        break;
                                    }
                                    case 3: {
                                        object2 = this.a.e == 1 ? i3.m - n3 : i3.m + n3;
                                        object = i3.n + object3;
                                        break;
                                    }
                                    case 4: {
                                        object2 = this.a.e == 1 ? i3.m + n3 : i3.m - n3;
                                        object = i2.n;
                                        break;
                                    }
                                    case 5: {
                                        object2 = this.a.e == 1 ? i3.m - n3 : i3.m + n3;
                                        object = i2.n;
                                        break;
                                    }
                                    case 6: {
                                        object2 = i2.m;
                                        object = i3.n;
                                        break;
                                    }
                                    case 7: {
                                        object2 = i2.m < i3.m ? i2.m + n3 : i2.m - n3;
                                        object = i2.n;
                                        break;
                                    }
                                    case 8: {
                                        object2 = i2.m;
                                        object = i2.n - object3;
                                        break;
                                    }
                                    case 9: {
                                        object2 = i3.m - n3;
                                        object = i3.n + object3;
                                        break;
                                    }
                                    case 10: {
                                        object2 = i3.m + n3;
                                        object = i3.n + object3;
                                        break;
                                    }
                                    case 11: {
                                        object2 = i3.m - n3;
                                        object = i3.n;
                                        break;
                                    }
                                    case 12: {
                                        object2 = i3.m + n3;
                                        object = i3.n;
                                        break;
                                    }
                                    case 13: {
                                        object2 = i3.m - n3 * 3 / 2;
                                        object = i3.n;
                                        break;
                                    }
                                    case 14: {
                                        object2 = i3.m + n3 * 3 / 2;
                                        object = i3.n;
                                    }
                                }
                                i2.e = (int[])(i2.m < object2 ? 1 : 2);
                                i.a(i2.g, i2.m, i2.n, (int)object2, object);
                                i2.q += 4;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -55) {
                                object2 = false;
                                object = 0;
                                Random random = this.a[nArray][i2.e[0]][i2.q + 1];
                                object3 = this.a[nArray][i2.e[0]][i2.q + 2];
                                i2.o = i2.m;
                                i2.p = i2.n;
                                object2 = i3.m > i2.m ? i2.m - random : i2.m + random;
                                object = i3.n > i2.n ? i2.n - object3 : i2.n + object3;
                                i.a(i2.g, i2.m, i2.n, (int)object2, object);
                                i2.q += 3;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -40) {
                                i2.c[0] = false;
                                i2.k = 0;
                                i2.r = (int)(this.a[this.q][this.d[22]][1][2] - this.d[24] * this.a[this.q][this.d[22]][1][3]);
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -41) {
                                if (i2.r > 0) break;
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -42) {
                                this.d[30] = (p)((short)i3.m);
                                this.d[31] = (p)((short)i3.n);
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -43) {
                                if (this.a[nArray][i2.e[0]][i2.q + 1] >= 0) {
                                    object2 = h.f(80);
                                    switch (this.a[nArray][i2.e[0]][i2.q + 1]) {
                                        case 0: {
                                            i2.m = (int)(this.d[30] + h.b(100));
                                            i2.n = (int)(this.d[31] + h.c(60));
                                            break;
                                        }
                                        case 1: {
                                            i2.m = (int)(this.d[30] - object2);
                                            i2.n = (int)this.d[31];
                                            break;
                                        }
                                        case 2: {
                                            i2.m = (int)(this.d[30] + object2);
                                            i2.n = (int)this.d[31];
                                            break;
                                        }
                                        case 3: {
                                            i2.m = (int)this.d[30];
                                            i2.n = (int)(this.d[31] + object2);
                                        }
                                    }
                                } else {
                                    switch (this.x) {
                                        case 1: {
                                            i2.m = (int)(this.d[30] + o[this.d[26]] * this.a[nArray][i2.e[0]][i2.q + 2]);
                                            i2.n = (int)this.d[31];
                                            break;
                                        }
                                        case 2: {
                                            i2.m = (int)(this.d[30] - o[this.d[26]] * this.a[nArray][i2.e[0]][i2.q + 2]);
                                            i2.n = (int)this.d[31];
                                        }
                                    }
                                }
                                i2.q += 2;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -44) {
                                object2 = false;
                                object = 0;
                                Random random = this.a[nArray][i2.e[0]][i2.q + 2];
                                object3 = this.a[nArray][i2.e[0]][i2.q + 3];
                                i2.o = i2.m;
                                i2.p = i2.n;
                                switch (this.a[nArray][i2.e[0]][i2.q + 1]) {
                                    case 0: {
                                        object2 = i2.e == true ? i3.m - random : i3.m + random;
                                        object = i3.n;
                                        break;
                                    }
                                    case 1: {
                                        break;
                                    }
                                    case 2: {
                                        object2 = i2.e == true ? i2.m + random : i2.m - random;
                                        object = i2.n + object3;
                                        break;
                                    }
                                    case 3: {
                                        object2 = i2.e == true ? i2.m - random : i2.m + random;
                                        object = i2.n + object3;
                                    }
                                }
                                i.a(i2.g, i2.m, i2.n, (int)object2, object);
                                i2.q += 4;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -45) {
                                this.d[25] = (p)((short)i2.e);
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -57) {
                                this.d[26] = (p)((short)i3.e);
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -46) {
                                if (this.a.a[16]) {
                                    h.a(i2, 17, 6);
                                } else {
                                    ++i2.q;
                                }
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -47) {
                                object2 = false;
                                object = 0;
                                int n4 = i2.k[0] * (this.a[this.q][this.d[22]][1][2] - this.d[24] * this.a[this.q][this.d[22]][1][3]);
                                i2.o = i2.m;
                                i2.p = i2.n;
                                switch (this.a[nArray][i2.e[0]][i2.q + 1]) {
                                    case 0: {
                                        object2 = i2.e == true ? i2.m + n4 : i2.m - n4;
                                        object = i2.n;
                                        break;
                                    }
                                    case 1: {
                                        object2 = i2.e == true ? i2.m - n4 : i2.m + n4;
                                        object = i2.n;
                                    }
                                }
                                i.a(i2.g, i2.m, i2.n, (int)object2, object);
                                i2.q += 2;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -49) {
                                i2.a[9] = this.f[nArray - 12][i2.e[0]][this.d[72]];
                                this.d[72] = (p)((short)(this.d[72] + true));
                                ++i2.q;
                            } else if (this.a[nArray][i2.e[0]][i2.q] == -50) {
                                i2.e = (int[])(i2.e == true ? 2 : 1);
                                ++i2.q;
                            }
                        }
                    }
                    if (this.a[nArray][i2.e[0]][i2.q] >= 0) {
                        object2 = this.a[nArray][i2.e[0]][i2.q + 1];
                        this.a((p)i2, (int)this.a[nArray][i2.e[0]][i2.q], (int)object2);
                        i2.q += 2;
                        break;
                    }
                    if (this.a[nArray][i2.e[0]][i2.q] != -2) continue;
                    i2.q = -1;
                    break;
                }
                i2.q = -1;
                break;
            } while (this.a[nArray][i2.e[0]][i2.q] < -2);
        }
        i2.h = (int[])false;
        return true;
    }

    private int a(i i2, int n2, boolean n3) {
        n3 = 0;
        n3 = 0;
        int n4 = 0;
        int n5 = 0;
        boolean bl = false;
        if (n2 > 0) {
            int[] nArray = this.a((p)i2);
            n3 = nArray[0];
            n4 = nArray[1];
            n5 = nArray[2];
            int n6 = nArray[3];
            if ((n3 = this.a(i2, n3, n4, n5, n6, this.g[0], n2, true)) >= 1000 && n3 < 2000) {
                return n3;
            }
        }
        return 3000;
    }

    private static void a(i i2, int n2, int n3) {
        if (i2 == null) {
            return;
        }
        i2.e[1] = i2.e[0];
        i2.e[0] = (byte)n2;
        i2.q = n3;
    }

    private void a(p p2, int n2, int n3) {
        block13: {
            block15: {
                block14: {
                    p2.c[1] = p2.c[0];
                    p2.c[0] = (byte)n2;
                    if (p2.c[1] != p2.c[0] || p2.h) {
                        p2.f = false;
                        p2.k = 0;
                        p2.j = 0;
                        p2.d = 0;
                        p2.h = false;
                    }
                    int n4 = p2.g;
                    int n5 = ((Random)this.a[n4][n2]).length;
                    if (n3 >= 0) {
                        this.a[n4][n2][n5 - 1][0] = (Random)((short)n3);
                    }
                    p2.b[0] = (short)this.a[n4][p2.c[0]][p2.k][1];
                    this.b(p2);
                    if (p2.g != 0) break block13;
                    if (p2.c[0] != 40) break block14;
                    switch (this.h[p2.f][12]) {
                        case 6: {
                            this.a(this.a, 20, 43, 0, 0, this.a.e, 0, 1, 1, -1, 1, 1);
                            break block13;
                        }
                        case 7: {
                            this.a(this.a, 20, 46, 0, 0, this.a.e, 0, 1, 1, -1, 1, 1);
                            break block13;
                        }
                        case 8: {
                            this.a(this.a, 20, 49, 0, 0, this.a.e, 0, 1, 1, -1, 1, 1);
                        }
                        default: {
                            return;
                        }
                    }
                }
                if (p2.c[0] != 42) break block15;
                switch (this.h[p2.f][12]) {
                    case 6: {
                        this.a(this.a, 20, 45, 0, 0, this.a.e, 0, 1, 1, -1, 1, 1);
                        break block13;
                    }
                    case 7: {
                        this.a(this.a, 20, 48, 0, 0, this.a.e, 0, 1, 1, -1, 1, 1);
                        break block13;
                    }
                    case 8: {
                        this.a(this.a, 20, 51, 0, 0, this.a.e, 0, 1, 1, -1, 1, 1);
                    }
                    default: {
                        return;
                    }
                }
            }
            if (p2.c[0] == 41) {
                p2.g = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void a(p var1_1) {
        block84: {
            if (var1_1 == null) {
                return;
            }
            var2_2 = var1_1.g;
            var3_3 = ((Random)this.a[var2_2][var1_1.c[0]]).length - 2;
            if (var1_1.d[0] < var1_1.d[1]) {
                var1_1.d[0] = (byte)(var1_1.d[0] + 1);
            }
            if (var1_1.d[0] < var1_1.d[1]) break block84;
            var1_1.d[0] = 0;
            var1_1.d = (byte)(var1_1.d + 1);
            if (var1_1.d < this.a[var2_2][var1_1.c[0]][var1_1.k][0]) break block84;
            if (var1_1.k < var3_3) {
                ++var1_1.k;
                var1_1.d = 0;
            }
            if (var1_1.k < var3_3 || var1_1.d < this.a[var2_2][var1_1.c[0]][var1_1.k][0]) break block84;
            var1_1.d = 0;
            if (this.a[var2_2][var1_1.c[0]][var3_3 + 1][0] == false) ** GOTO lbl-1000
            if (var1_1.j < this.a[var2_2][var1_1.c[0]][var3_3 + 1][0]) {
                ++var1_1.j;
            }
            if (var1_1.j >= this.a[var2_2][var1_1.c[0]][var3_3 + 1][0]) {
                var1_1.j = (int)this.a[var2_2][var1_1.c[0]][var3_3 + 1][0];
                var1_1.f = true;
            } else lbl-1000:
            // 2 sources

            {
                var1_1.k = 0;
            }
        }
        var4_5 = var1_1;
        var3_4 = this;
        if (var3_4.a[var4_5.g][var4_5.c[0]][var4_5.k][0] == false) {
            if (var4_5.g == 0) {
                if (var4_5.e[0] == 13) {
                    var4_5.g = true;
                } else if (var4_5.e[0] == 22) {
                    if (var3_4.a.a[var3_4.a.f][0][0] == 0) {
                        var4_5.g = true;
                    } else {
                        var3_4.a.a[var3_4.a.f][0][0] = 0;
                        v0 = var3_4.a.f;
                        var3_4.a.b[v0] = (byte)(var3_4.a.b[v0] - 1);
                    }
                }
            } else if (var4_5.g == 7) {
                if (var4_5.c[0] == 2) {
                    var4_5.g = true;
                    var4_5.f = 0;
                }
            } else if (var4_5.g >= 12 && var4_5.g <= 19) {
                if (var4_5.e[0] == 10) {
                    if (var3_4.d[55] == false) {
                        var3_4.d[1] = (p)true;
                        var3_4.d[55] = (p)25;
                    }
                    var3_4.b(0, 4);
                    var3_4.a((i)var4_5, 0);
                } else if (var4_5.h == 12) {
                    if (var4_5.c[0] == 6 || var4_5.c[0] == 7) {
                        var4_5.g = true;
                        var4_5.f = 1;
                        var3_4.b(0, 7);
                    } else if (var4_5.c[0] == 10) {
                        var3_4.b((c)var4_5);
                    }
                } else if (var4_5.h == 13) {
                    if (var4_5.c[0] == 15) {
                        var3_4.b((c)var4_5);
                    }
                } else if (var4_5.h == 14) {
                    if (var4_5.c[0] == 3) {
                        var4_5.g = true;
                        var4_5.f = 0;
                    } else if (var4_5.c[0] == 4) {
                        var4_5.g = true;
                        var4_5.f = 1;
                    } else if (var4_5.c[0] == 5) {
                        var4_5.g = true;
                        var4_5.f = (byte)2;
                    } else if (var4_5.c[0] == 6) {
                        var4_5.g = true;
                        var4_5.f = (byte)3;
                    } else if (var4_5.c[0] == 12) {
                        var3_4.b((c)var4_5);
                    } else if (var4_5.c[0] == 8 && var3_4.v[0] == 0) {
                        if (var3_4.d[90] != true) {
                            var3_4.b[0] = var3_4.b[25];
                            var3_4.c[0] = var3_4.c[25];
                            var3_4.a[0] = var3_4.a[25];
                            var3_4.d[0] = var3_4.d[25];
                            var3_4.C = var3_4.a(var4_5);
                            var3_4.a.n += var3_4.C[3];
                            var3_4.d[90] = (p)true;
                            var3_4.a.a[19][1] = 81;
                        } else {
                            var3_4.b[0] = var3_4.b[24];
                            var3_4.c[0] = var3_4.c[24];
                            var3_4.a[0] = var3_4.a[24];
                            var3_4.d[0] = var3_4.d[24];
                            var3_4.C = var3_4.a(var4_5);
                            var3_4.a.n -= var3_4.C[3];
                            var3_4.d[90] = var3_4.u == 2 ? (Object)2 : (p)false;
                            var3_4.a.a[19][1] = 80;
                        }
                        if (var3_4.a.a[5]) {
                            var3_4.a.a[5] = false;
                            var3_4.a.a[4] = true;
                        }
                        if (var3_4.a.a[var3_4.a.f][0][0] == 1 && (var3_4.h[var3_4.a.f][4] == 2 || var3_4.h[var3_4.a.f][4] == false)) {
                            v1 = var3_4.a.f;
                            var3_4.a.b[v1] = (byte)(var3_4.a.b[v1] - 1);
                            var3_4.a.a[var3_4.a.f][0][0] = 0;
                            var3_4.a(55, 0);
                            var3_4.a(57, 0);
                        }
                        h.a(var3_4.a, 9, 0);
                        var3_4.a.h = true;
                        var3_4.a.a((byte[][][])var3_4.b, (int)var3_4.d[90], 1, 0);
                        if (var3_4.d[58] == false) {
                            var3_4.a(3, 5, 0);
                        }
                    }
                } else if (var4_5.h == 15) {
                    if (var4_5.c[0] == 4) {
                        var4_5.g = true;
                        var4_5.f = 0;
                    } else if (var4_5.c[0] == 8) {
                        var3_4.b((c)var4_5);
                    }
                }
            } else if (var4_5.g == 37) {
                var3_4.d[1] = (p)true;
            } else if (var4_5.g == 29 && var4_5.c[0] == 1) {
                var3_4.a(var4_5, 0, 0);
                var3_4.d[35] = (p)false;
            }
        } else if (var3_4.a[var4_5.g][var4_5.c[0]][var4_5.k][0] == -1) {
            if (var4_5.g == 37) {
                var3_4.a(var4_5, 3, 0);
                var3_4.i[var4_5.c][0] = true;
                if (var4_5.c == 2) {
                    var3_4.a(true, (int)var3_4.a.m, 0, 2, 0);
                } else {
                    var3_4.a = (Random)false;
                    if (var3_4.q == false) {
                        var3_4.w();
                    } else if (var4_5.c == 1) {
                        var3_4.k(128);
                    } else if (var3_4.s[0] == 6 || var3_4.s[0] == 14 || var3_4.s[0] == 19) {
                        if (var3_4.s[0] == 6) {
                            var3_4.a.m[1] = 1000;
                        } else if (var3_4.s[0] == 14) {
                            var3_4.a.m[1] = 10000;
                        } else if (var3_4.s[0] == 19) {
                            var3_4.a.m[1] = 30000;
                        }
                        var3_4.k(160);
                    } else {
                        var3_4.k(129);
                    }
                }
            } else if (var4_5.g >= 12 && var4_5.g <= 19 && var4_5.e[0] == 10) {
                if (var3_4.d[54] == true) {
                    var3_4.e[var4_5.g][1][0] = false;
                    var3_4.d[54] = (p)false;
                } else {
                    v2 = var3_4.e[var4_5.g][1];
                    v2[0] = (byte)(v2[0] + true);
                    if (var3_4.e[var4_5.g][1][0] > 5) {
                        var3_4.e[var4_5.g][1][0] = 5;
                    }
                }
            }
        }
        if (var4_5.h == 12) {
            if (var4_5.c[0] == 5) {
                var4_5.g = true;
                var4_5.f = 0;
            }
        } else if (var4_5.h == 13) {
            if (var4_5.c[0] == 8 || var4_5.c[0] == 9 || var4_5.c[0] == 10) {
                var3_4.C = var3_4.a(var4_5);
                var3_4.B = h.a(var3_4.C);
                var3_4.d[89] = (p)h.a((short)var3_4.d[89], 1, 22, 28);
                var3_4.a(var3_4.d, (int)var3_4.d[89], 77, var3_4.B[0], var3_4.B[1], 1, 26, 1, 1, -1, 0, 1);
            }
        } else if (var4_5.h == 15 && var4_5.c[0] == 6) {
            var4_5.g = true;
            var4_5.f = 1;
        }
        if (var1_1.g >= 1 && var1_1.g <= 11 && var1_1.g != 1 && var1_1.g != 10 && var1_1.g != 11 && (var1_1.e[0] == 9 && var1_1.l >= 0 && var1_1.k >= var1_1.l || var1_1.e[0] == 16)) {
            var1_1.f = true;
            var1_1.h = true;
            h.a((i)var1_1, 10, 0);
            var1_1.r = 0;
            this.a((i)var1_1, 0);
        }
        var1_1.b[0] = (short)this.a[var2_2][var1_1.c[0]][var1_1.k][1];
        this.b(var1_1);
    }

    private void b(p p2) {
        int n2 = p2.g;
        Object object = p2.c[0];
        object = this.a[n2][object][p2.k][1];
        int n3 = p2.l[0];
        p2.l[0] = this.c[n2][object][3] - this.c[n2][object][1];
        if (n3 != 0) {
            p2.l[1] = n3;
            return;
        }
        p2.l[1] = p2.l[0];
    }

    private int a(i i2) {
        boolean bl = false;
        i2.p = i2.n;
        i i3 = i2;
        h h2 = this;
        i3.c = h2.b[i3.d][i3.e][i3.f];
        i3.p += i3.c;
        if (i3.g == false && i3.a[9] && i3.f == ((void)h2.b[h2.d[90]][i3.e]).length - 1) {
            i3.a[9] = false;
        }
        if (i3.f < ((void)h2.b[i3.d][i3.e]).length - 1) {
            ++i3.f;
        }
        i3 = i2;
        h2 = this;
        int n2 = 3000;
        if (h2.d[90] != true) {
            if (i3.c <= 0) {
                while (n2 == 3000 && i3.n > i3.p - 20) {
                    i3.n -= 2;
                    n2 = h2.a(i3, 2, true);
                    i3.b = (short)(i3.b & 0xC);
                }
            } else if (i3.c > 0) {
                while (n2 == 3000 && i3.n < i3.p) {
                    i3.n += 2;
                    n2 = h2.a(i3, 1, true);
                    i3.b = (short)(i3.b & 0xC);
                }
            }
        } else if (h2.d[90] == true) {
            if (i3.c >= 0) {
                while (n2 == 3000 && i3.n < i3.p + 10) {
                    i3.n += 2;
                    n2 = h2.a(i3, 1, true);
                    i3.b = (short)(i3.b & 0xC);
                }
            } else if (i3.c < 0) {
                while (n2 == 3000 && i3.n > i3.p) {
                    i3.n -= 2;
                    n2 = h2.a(i3, 2, true);
                    i3.b = (short)(i3.b & 0xC);
                }
            }
        }
        int n3 = n2;
        if (i2.g == false) {
            if (n3 >= 1000 && n3 < 3000) {
                if (i2.a[4] && this.d[90] != true && i2.c <= 0 || this.d[90] == true && i2.c >= 0) {
                    i2.a[4] = false;
                    i2.a[6] = false;
                    i2.a[14] = false;
                    i2.a[5] = true;
                    i2.b = (short)(i2.b & 0xC);
                    if (this.d[90] != true && -this.a.c >= this.b[this.d[90]][0][0] * 10 / 7 || this.d[90] == true && -this.a.c <= this.b[this.d[90]][0][0] * 10 / 7 || i2.e[0] == 4) {
                        this.a.a[15] = true;
                        i2.b = (short)(i2.b & 3);
                        this.a.h = true;
                        h.a(this.a, 10, 0);
                    } else if (i2.e[0] == 16) {
                        this.a.h = true;
                        h.a(this.a, 3, 0);
                    } else if (i2.e[0] == 9) {
                        this.a.h = true;
                        if ((i2.b & 0xC) == 0) {
                            h.a(this.a, 3, 0);
                        } else {
                            h.a(this.a, 2, 0);
                        }
                    }
                    this.a.a((byte[][][])this.b, (int)this.d[90], 2, 0);
                } else if (i2.a[4]) {
                    this.a.h = true;
                    h.a(this.a, 9, 0);
                    this.a.a((byte[][][])this.b, (int)this.d[90], 1, 0);
                } else {
                    this.a.a((byte[][][])this.b, (int)this.d[90], 2, 0);
                }
                if (i2.a[9]) {
                    i2.a[9] = false;
                }
                i2.p = i2.n;
            } else {
                i2.n = i2.p;
                if (i2.a[5]) {
                    this.a.h = true;
                    h.a(this.a, 9, 0);
                    this.a.a((byte[][][])this.b, (int)this.d[90], 1, 0);
                    this.a.b = (short)(this.a.b | 2);
                    i2.a[5] = false;
                    i2.a[4] = true;
                    if (this.h[this.a.f][4] == 2 && this.a.a[this.a.f][0][0] > 0) {
                        byte by = this.a.f;
                        this.a.b[by] = (byte)(this.a.b[by] - 1);
                        this.a.a[this.a.f][0][0] = 0;
                        this.a(55, 0);
                        this.a(57, 0);
                    }
                }
            }
        } else if (i2.g == 28 && n3 >= 1000 && n3 < 3000) {
            if (i2.a[4] && (this.d[90] != true && i2.c < 0 || this.d[90] == true && i2.c > 0)) {
                i2.a[4] = false;
                i2.a[6] = false;
                i2.a[14] = false;
                i2.a[5] = true;
                i2.b = (short)(i2.b & 0xC);
                if (i2.g == 28) {
                    i2.g = (int[])false;
                }
            }
            if ((i2.b & 3) == 0 && !i2.a[4]) {
                i2.a[5] = true;
                i2.a[4] = false;
                i2.c = 0;
                i2.k[0] = 0;
                if (i2.g == 28 && i2.g == true) {
                    i2.g = (int[])false;
                }
            }
        }
        return n3;
    }

    private int b(i i2) {
        boolean bl = false;
        if (i2.g > 0) {
            h.b(i2, 6, this.l - 6);
        } else {
            h.b(i2, z[0] + 6, z[1] - 6);
        }
        i i3 = i2;
        int n2 = 3000;
        while (n2 == 3000 && i3.m != i3.o) {
            if (i3.m < i3.o) {
                i3.m += 10;
                if (i3.m > i3.o) {
                    i3.m = i3.o;
                }
            } else if (i3.m > i3.o) {
                i3.m -= 10;
                if (i3.m < i3.o) {
                    i3.m = i3.o;
                }
            }
            n2 = this.a(i3, (int)(i3.b & 0xC), true);
        }
        i3.o = i3.m;
        int n3 = n2;
        i2.o = i2.m;
        return n3;
    }

    private void a(int n2, int n3, int n4, int n5) {
        h.z[0] = 0;
        h.z[1] = n3 < this.l - 32 ? n3 + 16 : n3;
        h.z[2] = n4 < this.m - 32 ? n4 + 16 : n4;
        h.z[3] = 0;
    }

    private static void b(i i2, int n2, int n3) {
        i2.o = i2.m;
        if ((i2.b & 0xC) == 4) {
            i2.o -= i2.k[0];
        } else if ((i2.b & 0xC) == 8) {
            i2.o += i2.k[0];
        }
        if (i2.o <= n2) {
            i2.o = n2;
        }
        if (i2.o >= n3) {
            i2.o = n3;
        }
    }

    public final void d() {
        this.r();
        if (this.C >= 0) {
            this.O();
        }
        switch (this.p[0]) {
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: {
                break;
            }
            default: {
                if (this.p[0] == 29 || this.q[0] == 31 || this.q[0] == 34) break;
                this.A = this.p[0];
                this.p[0] = 29;
                this.a.repaint();
                this.a.serviceRepaints();
            }
        }
        this.a.a = true;
    }

    public final void e() {
        this.a.a = false;
        System.gc();
    }

    private static int g(int n2) {
        int[] nArray = new int[]{-1982, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -1, -2, -3, -4, -6, -7, -5, 35, 42, -11};
        return h.a(n2, nArray);
    }

    public final void a(int n2, int n3) {
        if ((n2 = h.g(n2)) >= 0) {
            this.D[n2] = n3;
        }
    }

    private void r() {
        this.D = new int[this.D.length];
    }

    private int h(int n2) {
        n2 = h.g(n2);
        return this.D[n2];
    }

    private void b(int n2) {
        Object object = new int[]{30, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 30, 30, 17, 11, 1, 1, 1, 1, 1, 7, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 26, 17, 7, 7, 7, 33, 1, 1, 1, 1, 1, 1, 1};
        void var3_4 = this.b[n2];
        if (this.c[n2] == null) {
            this.c[n2] = new Image[object[n2]];
        }
        if (n2 >= 44 && n2 <= 48) {
            if (this.c[n2][0] == null && object[n2] > 0) {
                object = new int[][]{{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0, 10, 0, 23, 0, 13, 0, 29, 2, 0, 5, 0, 9, 0, 15, 0, 26, 2, 26, 3, 26, 4, 26, 5, 26, 6, 26, 12, 41, 0, -1, 0}, {0, 1, 0, 2, 0, 3, 0, 5, 0, 6, 0, 8, 0, 9, 0, 10, 0, 23, 0, 29, 15, 0, 26, 2, 26, 3, 26, 4, 26, 5, 26, 6, -1, 0}, {0, 0, 0, 1, 0, 2, 0, 9, 41, 0, -1, 4, -1, 1}, {0, 0, 0, 9, 15, 0, 41, 0, 42, 0, -1, 0, -1, 5}, {0, 0, 0, 1, 0, 2, 0, 9, 42, 0, 42, 1, -1, 1}};
                int n3 = 0;
                for (int i2 = 0; i2 < this.c[n2].length; ++i2) {
                    var3_4 = object[n2 - 44][i2 << 1];
                    n3 = object[n2 - 44][(i2 << 1) + 1];
                    if (var3_4 >= 0) {
                        if (this.c[var3_4] == null || this.c[var3_4] != null && this.c[var3_4][n3] == null) {
                            this.b((int)var3_4);
                        }
                        this.c[n2][i2] = this.c[var3_4][n3];
                        continue;
                    }
                    if (this.b[n3] == null || this.b[n3] != null && this.b[n3][0] == null) {
                        this.c(n3);
                    }
                    this.c[n2][i2] = this.b[n3][0];
                }
                return;
            }
        } else if (this.c[n2][0] == null && object[n2] > 0) {
            if (n2 != var3_4) {
                if (this.c[var3_4] == null || this.c[var3_4][0] == null) {
                    this.e((int)var3_4);
                    this.b((int)var3_4);
                }
                this.c[n2] = this.c[var3_4];
                return;
            }
            if (n2 == 40 || n2 == 43 || n2 == 50 || n2 == 51 || n2 == 52 || n2 == 53 || n2 == 54 || n2 == 55 || n2 == 56) {
                this.c[n2][0] = h.a("/data/role/role_" + n2 + "_0.png");
                return;
            }
            for (int i3 = 0; i3 < this.c[n2].length; ++i3) {
                this.c[n2][i3] = var3_4 == 14 && i3 == 1 ? this.b("/data/role/role_26_12.mid") : this.b("/data/role/role_" + (int)var3_4 + "_" + i3 + ".mid");
            }
            if (n2 == 27) {
                this.c[n2][3] = h.a("/data/role/role_27_3.png");
            }
        }
    }

    private void c(int n2) {
        if (this.b[n2] == null) {
            this.b[n2] = new Image[1];
        }
        if (this.b[n2][0] == null) {
            Image image;
            this.b[n2][0] = image = this.b("/data/scene/scene_" + n2 + "_0.mid");
        }
    }

    private void d(int n2) {
        int n3 = 0;
        n3 = 0;
        byte[] byArray = new byte[4];
        byte by = 0;
        int n4 = 0;
        int n5 = -1;
        int n6 = -1;
        int n7 = -1;
        int n8 = -1;
        int n9 = 0;
        try {
            String string = "/data/map/map_" + n2 + ".mid";
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(6L);
            n3 = dataInputStream.readByte();
            byte[] byArray2 = new byte[n3];
            dataInputStream.read(byArray2);
            n4 = (int)h.b(byArray2);
            dataInputStream.read(byArray2);
            int n10 = (int)h.b(byArray2);
            dataInputStream.read(byArray2);
            n3 = (int)h.b(byArray2);
            this.l = n10 * this.j;
            this.m = n3 * this.k;
            this.g = new short[2][];
            this.d = new int[2][2];
            this.g = new short[1][n10][n3];
            this.e = new short[1][];
            this.f = new short[3][];
            this.h = new short[1][];
            this.q();
            inputStream.read(byArray2);
            n10 = (short)h.b(byArray2);
            for (int i2 = 0; i2 < n4; ++i2) {
                if (n10 >= -1) continue;
                by = dataInputStream.readByte();
                n9 = 0;
                inputStream.read(byArray);
                n3 = (int)h.b(byArray);
                inputStream.read(byArray2);
                n10 = (short)h.b(byArray2);
                switch (by) {
                    case 0: {
                        byte by2 = (byte)(n7 + 1);
                        n7 = by2;
                        this.g[by2] = new short[n3 * 3];
                        break;
                    }
                    case 1: {
                        byte by3 = (byte)(n6 + 1);
                        n6 = by3;
                        this.f[by3] = new short[n3 * 3];
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        byte by4 = (byte)(n5 + 1);
                        n5 = by4;
                        this.e[by4] = new short[n3 * 3];
                        break;
                    }
                    case 4: {
                        byte by5 = (byte)(n8 + 1);
                        n8 = by5;
                        this.h[by5] = new short[n3 * 3];
                        break;
                    }
                    case 5: {
                        this.a = new i[n3];
                        break;
                    }
                    case 6: {
                        this.c = new p[n3];
                        break;
                    }
                    case 7: {
                        if (this.d[this.q][(this.p << 2) + 3] != false) break;
                        this.a = new c[n3];
                        break;
                    }
                    case 8: {
                        if (this.d[this.q][(this.p << 2) + 3] != true) break;
                        this.a = new c[n3];
                        break;
                    }
                    case 9: {
                        if (this.d[this.q][(this.p << 2) + 3] != 2) break;
                        this.a = new c[n3];
                        break;
                    }
                    case 10: {
                        this.a = new p[n3];
                    }
                }
                while (n10 >= 0) {
                    inputStream.read(byArray2);
                    n3 = (short)h.b(byArray2);
                    switch (by) {
                        case 0: {
                            int n11 = n9;
                            n9 = (short)(n9 + 1);
                            this.g[n7][n11] = (short)n10;
                            int n12 = n9;
                            n9 = (short)(n9 + 1);
                            this.g[n7][n12] = (short)n3;
                            inputStream.read(byArray);
                            int n13 = n9;
                            n9 = (short)(n9 + 1);
                            this.g[n7][n13] = (short)h.b(byArray);
                            break;
                        }
                        case 1: {
                            int n14 = n9;
                            n9 = (short)(n9 + 1);
                            this.f[n6][n14] = (short)n10;
                            int n15 = n9;
                            n9 = (short)(n9 + 1);
                            this.f[n6][n15] = (short)n3;
                            inputStream.read(byArray);
                            int n16 = n9;
                            n9 = (short)(n9 + 1);
                            this.f[n6][n16] = (short)h.b(byArray);
                            break;
                        }
                        case 2: {
                            inputStream.read(byArray);
                            this.g[0][n10][n3] = (short)h.b(byArray);
                            break;
                        }
                        case 3: {
                            inputStream.read(byArray);
                            int n17 = n9;
                            n9 = (short)(n9 + 1);
                            this.e[n5][n17] = (short)n10;
                            int n18 = n9;
                            n9 = (short)(n9 + 1);
                            this.e[n5][n18] = (short)n3;
                            int n19 = n9;
                            n9 = (short)(n9 + 1);
                            this.e[n5][n19] = (short)h.b(byArray);
                            break;
                        }
                        case 4: {
                            inputStream.read(byArray);
                            int n20 = n9;
                            n9 = (short)(n9 + 1);
                            this.h[n8][n20] = (short)n10;
                            int n21 = n9;
                            n9 = (short)(n9 + 1);
                            this.h[n8][n21] = (short)n3;
                            int n22 = n9;
                            n9 = (short)(n9 + 1);
                            this.h[n8][n22] = (short)h.b(byArray);
                            break;
                        }
                        case 5: {
                            int n23;
                            inputStream.read(byArray);
                            if (this.d[this.q][this.p][n9] == false) {
                                this.a[n9] = new i();
                                this.a[n9].a = (byte[])new int[1][12];
                                n23 = ((int)h.b(byArray) >> 3) - 9;
                                this.a[n9].i = (int[])this.g[n23][0][h.a((byte[])this.g[n23][1])];
                                this.a[n9].g = (int[])28;
                                this.a((p)this.a[n9], (int)this.t[this.a[n9].i], 0);
                                i.a(this.a[n9], n10 * this.j, n3 * this.k);
                                this.a[n9].g = (int[])true;
                                this.a[n9].b[0] = this.a[this.a[n9].g][this.a[n9].c[0]][this.a[n9].k][1];
                                this.a(this.a[n9], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                                this.a[n9].a((byte[][][])this.b, 0, 4, 0);
                            }
                            n9 = (short)(n9 + 1);
                            break;
                        }
                        case 6: {
                            inputStream.read(byArray);
                            int n24 = n9;
                            n9 = (short)(n9 + 1);
                            int n25 = ((int)h.b(byArray) >> 3) - 13;
                            int n26 = n3;
                            int n23 = n10;
                            n3 = n24;
                            h h2 = this;
                            if (h2.c.length <= 0) break;
                            int[] nArray = new int[]{30, 29, 42, 42, 41};
                            h2.e(nArray[n25]);
                            h2.b(nArray[n25]);
                            if (nArray[n25] == 42 && h2.i[21] == true) {
                                h2.c[n3] = h2.a(nArray[n25], n23 * h2.j, n26 * h2.k, 1, 0, 1);
                                break;
                            }
                            h2.c[n3] = h2.a(nArray[n25], n23 * h2.j, n26 * h2.k, 0, 0, 1);
                            break;
                        }
                        case 7: {
                            inputStream.read(byArray);
                            if (this.d[this.q][(this.p << 2) + 3] != false) break;
                            int n27 = n9;
                            n9 = (short)(n9 + 1);
                            this.c(n27, n10, n3, ((int)h.b(byArray) >> 3) - 18 + 1);
                            break;
                        }
                        case 8: {
                            inputStream.read(byArray);
                            if (this.d[this.q][(this.p << 2) + 3] != true) break;
                            int n28 = n9;
                            n9 = (short)(n9 + 1);
                            this.c(n28, n10, n3, ((int)h.b(byArray) >> 3) - 18 + 1);
                            break;
                        }
                        case 9: {
                            inputStream.read(byArray);
                            if (this.d[this.q][(this.p << 2) + 3] != 2) break;
                            int n29 = n9;
                            n9 = (short)(n9 + 1);
                            this.c(n29, n10, n3, ((int)h.b(byArray) >> 3) - 18 + 1);
                            break;
                        }
                        case 10: {
                            inputStream.read(byArray);
                            int n30 = n9;
                            n9 = (short)(n9 + 1);
                            int n25 = ((int)h.b(byArray) >> 3) - 29 + 1;
                            int n26 = n3;
                            int n23 = n10;
                            n3 = n30;
                            h h3 = this;
                            if (h3.a.length <= 0) break;
                            h3.e(37);
                            h3.b(37);
                            int n31 = 0;
                            n31 = h3.i[n25][0] == true ? 3 : (h3.i[n25][1] == true ? 1 : 0);
                            h3.a[n3] = h3.a(37, n23 * h3.j, n26 * h3.k, n31, 0, 1);
                            h3.a[n3].c = (byte)n25;
                            break;
                        }
                        default: {
                            inputStream.read(byArray);
                        }
                    }
                    inputStream.read(byArray2);
                    n10 = (short)h.b(byArray2);
                }
            }
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void e(int n2) {
        byte[][] byArray = this.c[n2];
        InputStream inputStream = g.a("/data/animate/role_" + (int)byArray + "_act.mid");
        this.b[n2] = g.a(inputStream);
        this.b[n2] = g.a(inputStream);
        this.c[n2] = (byte[][])g.a(inputStream);
        this.d[n2] = g.a(inputStream);
        this.a[n2] = g.a(inputStream);
        try {
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void a(int[] nArray, int n2, int n3) {
        if (nArray[8] > 0) {
            int n4 = this.x[1] + this.d[20];
            int n5 = this.x[0] + this.d[19];
            Random random = this.a;
            boolean bl = this.b;
            boolean bl2 = this.b;
            Image[][] imageArray = this.c;
            boolean bl3 = true;
            k k2 = this.a;
            if (nArray[8] == 1 && ((Random)random[nArray[0]][nArray[1]]).length > 1) {
                int n6 = nArray[0];
                int n7 = nArray[1];
                int n8 = nArray[2];
                Random random2 = random[n6][n7][n8][1];
                n7 = 0;
                n8 = 0;
                int n9 = 0;
                int n10 = 320;
                if (nArray[11] == 1) {
                    n7 = n2;
                    n8 = n3;
                    n9 = 30;
                    n10 = 260;
                } else if (nArray[11] == 0) {
                    n7 = n2 + nArray[5];
                    n8 = n3 + nArray[6];
                    n9 = 30;
                    n10 = 260;
                } else if (nArray[11] == 2) {
                    n7 = n2 + nArray[5];
                    n8 = n3 + nArray[6];
                }
                k2.a(imageArray[n6], (short[][])bl[n6][random2], n7, n8, (short[][])bl2[n6], (byte)nArray[7], n5, n4, 0, n9, 240, n10);
            }
        }
    }

    private void a(p p2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        if (((Random)this.a[n7]).length > 0) {
            this.a(p2.a[n2], n3, n4, n5, n6, n7, n8, n9, -1, n11, n12);
        }
    }

    private void a(int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int n12 = ((Random)this.a[n6][n2]).length;
        nArray[0] = n6;
        nArray[1] = n2;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[8] = n8;
        nArray[4] = 0;
        nArray[5] = n3;
        nArray[6] = n4;
        nArray[7] = n5;
        nArray[9] = n7;
        nArray[10] = n9;
        nArray[11] = n10;
        if (n11 >= 0) {
            this.a[n6][n2][n12 - 1][0] = (Random)((short)n11);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void a(i var1_1) {
        var2_2 = 0;
        var2_2 = 0;
        var3_3 = false;
        if (var1_1.a == null) {
            return;
        }
        for (var5_4 = 0; var5_4 < var1_1.a.length; ++var5_4) {
            if (var1_1.a[var5_4] == null) continue;
            for (var6_6 = 0; var6_6 < var1_1.a[var5_4].length; ++var6_6) {
                block46: {
                    var4_5 = var1_1.a[var5_4][var6_6];
                    if (var1_1.g == false) {
                        if (var4_5[0] > 0) {
                            if (this.h[var5_4][4] == false) {
                                if (h.a(var4_5[3] - var4_5[1]) + h.a(var4_5[4] - var4_5[2]) > h.a(i.b[var1_1.h][this.h[var5_4][1]][4])) {
                                    if (var4_5[7] == 33 && var4_5[12] > -1) {
                                        var4_5[6] = 0;
                                        var4_5[7] = var4_5[13];
                                        this.a[var4_5[11]][var4_5[7]][((Random)this.a[var4_5[11]][var4_5[7]]).length - 1][0] = (Random)var4_5[14];
                                        var4_5[13] = i.b[var1_1.h][var4_5[12]][9];
                                        var4_5[14] = i.b[var1_1.h][var4_5[12]][10];
                                        var4_5[12] = i.b[var1_1.h][var4_5[12]][8];
                                    } else {
                                        var4_5[0] = 0;
                                        v0 = var5_4;
                                        var1_1.b[v0] = (byte)(var1_1.b[v0] - 1);
                                    }
                                }
                            } else if (this.h[var5_4][4] == 2 && this.h(57) != 1 && this.h(55) != 1 && this.a.a[this.a.f][0][0] > 0) {
                                v1 = this.a.f;
                                this.a.b[v1] = (byte)(this.a.b[v1] - 1);
                                this.a.a[this.a.f][0][0] = 0;
                                this.a((p)this.a, (int)this.a[0][this.a.e[0]][this.a.q + 1], (int)this.a[0][this.a.e[0]][this.a.q + 2]);
                                this.a.q += 3;
                            }
                        }
                    } else if (var1_1.h == 13) {
                        if (var4_5[0] > 0 && h.a(var4_5[4] - var4_5[2]) > h.a(160)) {
                            var4_5[0] = 0;
                            v2 = var5_4;
                            var1_1.b[v2] = (byte)(var1_1.b[v2] - 1);
                        }
                    } else if (var1_1.g >= true && var1_1.g <= 19 && var4_5[0] > 0 && h.a(var4_5[3] - var4_5[1]) + h.a(var4_5[4] - var4_5[2]) > h.a(i.b[var1_1.h][var5_4][4])) {
                        var4_5[0] = 0;
                        v3 = var5_4;
                        var1_1.b[v3] = (byte)(var1_1.b[v3] - 1);
                    }
                    if (var4_5[0] != 1) break block46;
                    switch (var1_1.h) {
                        case 0: {
                            var3_3 = true;
                            switch (this.h[var5_4][1]) {
                                case 0: 
                                case 1: 
                                case 2: {
                                    if (var4_5[7] != 34) break;
                                    var2_2 = var1_1.a[var5_4][var6_6][9];
                                    var4_5[3] = (short)(var4_5[3] + ((i.b[var1_1.h][var5_4][1] + var4_5[10]) * h.c[var2_2][0] >> 16));
                                    var4_5[4] = (short)(var4_5[4] + ((i.b[var1_1.h][var5_4][2] + var4_5[10]) * h.c[var2_2][1] >> 16));
                                    var4_5[10] = (short)(var4_5[10] + 6);
                                    break;
                                }
                                case 3: 
                                case 4: 
                                case 5: {
                                    var4_5[3] = (short)var1_1.m;
                                    var4_5[4] = (short)var1_1.n;
                                    break;
                                }
                                case 6: 
                                case 7: 
                                case 8: {
                                    var4_5[3] = (short)var1_1.m;
                                    var4_5[4] = (short)var1_1.n;
                                }
                            }
                            break;
                        }
                        case 7: {
                            var3_3 = true;
                            switch (var5_4) {
                                case 0: {
                                    if (var4_5[7] != 9) break;
                                    var2_2 = var1_1.a[var5_4][var6_6][9];
                                    var4_5[3] = (short)(var4_5[3] + ((i.b[var1_1.h][var5_4][1] + var4_5[10]) * h.c[var2_2][0] >> 16));
                                    var4_5[4] = (short)(var4_5[4] + ((i.b[var1_1.h][var5_4][2] + var4_5[10]) * h.c[var2_2][1] >> 16));
                                    var4_5[10] = (short)(var4_5[10] + 6);
                                }
                            }
                            break;
                        }
                        case 12: {
                            var3_3 = true;
                            switch (var5_4) {
                                case 0: {
                                    var2_2 = var1_1.a[var5_4][var6_6][9];
                                    var4_5[3] = (short)(var4_5[3] + (i.b[var1_1.h][var5_4][1] * h.c[var2_2][0] >> 16));
                                    var4_5[4] = (short)(var4_5[4] + (i.b[var1_1.h][var5_4][2] * h.c[var2_2][1] >> 16));
                                }
                            }
                            break;
                        }
                        case 13: {
                            var3_3 = true;
                            ** GOTO lbl-1000
                        }
                        case 14: {
                            var3_3 = true;
                            switch (var5_4) {
                                case 0: 
                                case 1: 
                                case 2: 
                                case 3: {
                                    var2_2 = var1_1.a[var5_4][var6_6][9];
                                    var4_5[3] = (short)(var4_5[3] + ((i.b[var1_1.h][var5_4][1] + var4_5[10]) * h.c[var2_2][0] >> 16));
                                    var4_5[4] = (short)(var4_5[4] + ((i.b[var1_1.h][var5_4][2] + var4_5[10]) * h.c[var2_2][1] >> 16));
                                    var4_5[10] = var4_5[10];
                                }
                            }
                            break;
                        }
                        case 15: {
                            var3_3 = true;
                            switch (var5_4) {
                                case 0: {
                                    var2_2 = var1_1.a[var5_4][var6_6][9];
                                    var4_5[3] = (short)(var4_5[3] + (i.b[var1_1.h][var5_4][1] * h.c[var2_2][0] >> 16));
                                    var4_5[4] = (short)(var4_5[4] + (i.b[var1_1.h][var5_4][2] * h.c[var2_2][1] >> 16));
                                    break block46;
                                }
                                case 1: lbl-1000:
                                // 2 sources

                                {
                                    var2_2 = var1_1.a[var5_4][var6_6][9];
                                    var4_5[3] = (short)(var4_5[3] + (i.b[var1_1.h][var5_4][1] * h.c[var2_2][0] >> 16));
                                    var4_5[4] = (short)(var4_5[4] + (i.b[var1_1.h][var5_4][2] * h.c[var2_2][1] >> 16));
                                }
                            }
                        }
                    }
                }
                if (!var3_3 || var4_5[0] != 1) continue;
                var2_2 = ((Random)this.a[var4_5[11]][var4_5[7]]).length - 2;
                if (var4_5[8] < this.a[var4_5[11]][var4_5[7]][var4_5[6]][0] - true) {
                    var4_5[8] = (short)(var4_5[8] + 1);
                    continue;
                }
                var4_5[8] = 0;
                if (var4_5[6] < var2_2) {
                    var4_5[6] = (short)(var4_5[6] + 1);
                    continue;
                }
                if (this.a[var4_5[11]][var4_5[7]][var2_2 + 1][0] == false) {
                    var4_5[6] = 0;
                    continue;
                }
                if (var4_5[12] > -1) {
                    var4_5[6] = 0;
                    var4_5[7] = var4_5[13];
                    this.a[var4_5[11]][var4_5[7]][((Random)this.a[var4_5[11]][var4_5[7]]).length - 1][0] = (Random)var4_5[14];
                    var4_5[13] = i.b[var1_1.h][var4_5[12]][9];
                    var4_5[14] = i.b[var1_1.h][var4_5[12]][10];
                    var4_5[12] = i.b[var1_1.h][var4_5[12]][8];
                    continue;
                }
                var4_5[0] = 0;
                v4 = var5_4;
                var1_1.b[v4] = (byte)(var1_1.b[v4] - 1);
            }
        }
    }

    private void b(i i2) {
        if (i2.g != false && i2.a != null && i2.c) {
            this.a(4, (i)this.a, i2);
            this.a(3, (i)this.a, i2);
        }
        if (i2.g == false) {
            if (this.a != null) {
                for (int i3 = 0; i3 < this.a.length; ++i3) {
                    if (this.a[i3] == null) continue;
                    if (this.a[i3].g >= 1 && this.a[i3].g <= 11 && this.a[i3].e[0] != 9 || this.a[i3].g >= 12 && this.a[i3].g <= 21 && this.a[i3].e[0] != 10) {
                        this.a(2, i2, this.a[i3]);
                        this.a(1, i2, this.a[i3]);
                    }
                    if (this.a[i3].a == null) continue;
                    for (int i4 = 0; i4 < this.a[i3].a.length; ++i4) {
                        if (this.a[i3].a[i4].a == false || (this.a[i3].a[i4].g < 1 || this.a[i3].a[i4].g > 11 || this.a[i3].a[i4].e[0] == 9) && (this.a[i3].a[i4].g < 12 || this.a[i3].a[i4].g > 21 || this.a[i3].a[i4].e[0] == 10)) continue;
                        this.a(2, i2, this.a[i3].a[i4]);
                        this.a(1, i2, this.a[i3].a[i4]);
                    }
                }
                return;
            }
        } else if (i2.g == true && i2.e[0] == 9) {
            if (this.a.e[0] != 15 && this.a.e[0] != 24 && this.a.e[0] != 25) {
                this.a(5, i2, this.a);
            }
            if (this.a != null) {
                for (int i5 = 0; i5 < this.a.length; ++i5) {
                    if (this.a[i5] == null || (this.a[i5].g < 1 || this.a[i5].g > 11 || this.a[i5].e[0] == 9) && (this.a[i5].g < 12 || this.a[i5].g > 21 || this.a[i5].e[0] == 10 || this.a[i5].e[0] == 11)) continue;
                    this.a(5, i2, this.a[i5]);
                }
                return;
            }
        } else if (i2.g >= true && i2.g <= 21 && this.a.e[0] != 15 && this.a.e[0] != 24 && this.a.e[0] != 25 && (i2.g >= true && i2.g <= 11 && i2.e[0] != 9 || i2.g >= 12 && i2.g <= 21 && i2.e[0] != 10 && i2.e[0] != 11)) {
            if (i2.a != null) {
                this.a(2, i2, this.a);
            }
            this.a(1, i2, this.a);
            if (i2.h == 12) {
                this.a(0, i2, this.a);
            }
        }
    }

    private void c(i i2) {
        if (i2.a == null) {
            return;
        }
        if (i2.a.length > 0) {
            for (int i3 = 0; i3 < i2.a.length; ++i3) {
                for (int i4 = 0; i4 < i2.a[i3].length; ++i4) {
                    short[] sArray = i2.a[i3][i4];
                    if (sArray[0] != 1 || sArray[0] != 1) continue;
                    this.a.a(this.c[sArray[11]], (short[][])this.b[sArray[11]][this.a[sArray[11]][sArray[7]][sArray[6]][1]], sArray[3], sArray[4] - 30, (short[][])this.b[sArray[11]], (byte)sArray[5], this.x[0] + this.d[19], this.x[1] + this.d[20] - 30, 0, 30, 240, 260);
                }
            }
        }
    }

    private void d(i i2) {
        if (i2 == null) {
            return;
        }
        int[] nArray = new int[4];
        int[] nArray2 = i2.g;
        int n2 = 0;
        short[][][] sArrayArray = new short[][][]{new short[][]{new short[0], {0, 1, 23}, {12, 11, 13}}, new short[][]{new short[0], {0, 1, 23, 2, 22}, {12, 11, 13, 10, 14}}, new short[][]{new short[0], {0, 1, 23}, {12, 11, 13}}, new short[0][]};
        Object object = false;
        if (i2.g != false) {
            if (i2.g == false) {
                object = i2.f;
                if (i2.b[object] < i.b[i2.h][this.h[object][1]][6] && i2.a[object] != null) {
                    for (int i3 = 0; i3 < i2.a[object].length; ++i3) {
                        short[] sArray = i2.a[object][i3];
                        if (sArray[0] != 0 || n2 >= i.b[i2.h][this.h[object][1]][0]) continue;
                        ++n2;
                        int n3 = object;
                        i2.b[n3] = (byte)(i2.b[n3] + 1);
                        sArray[0] = 1;
                        sArray[5] = this.a.e;
                        sArray[6] = 0;
                        sArray[11] = 0;
                        sArray[10] = 0;
                        sArray[7] = (short)this.h[i2.f][2];
                        sArray[12] = i.b[i2.h][this.h[i2.f][1]][8];
                        sArray[13] = i.b[i2.h][this.h[i2.f][1]][9];
                        sArray[14] = i.b[i2.h][this.h[i2.f][1]][10];
                        sArray[15] = 0;
                        switch (this.h[i2.f][1]) {
                            case 0: 
                            case 1: 
                            case 2: {
                                if (this.d[90] != true) {
                                    if (sArray[5] == 1) {
                                        sArray[9] = 3;
                                    } else if (sArray[5] == 2) {
                                        sArray[9] = 9;
                                    }
                                } else if (this.d[90] == true) {
                                    if (sArray[5] == 1) {
                                        sArray[9] = 21;
                                    } else if (sArray[5] == 2) {
                                        sArray[9] = 15;
                                    }
                                }
                                this.C = this.a((p)this.a);
                                nArray[0] = this.C[0] + (this.C[2] >> 1) - 30;
                                nArray[1] = this.C[1] - (this.C[3] >> 1) + 30;
                                nArray[2] = 60;
                                nArray[3] = 60;
                                this.B = h.a(nArray);
                                sArray[1] = (short)this.B[0];
                                sArray[2] = (short)this.B[1];
                                this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)true;
                                break;
                            }
                            case 3: 
                            case 4: 
                            case 5: {
                                sArray[1] = (short)i2.m;
                                sArray[2] = (short)i2.n;
                                this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                break;
                            }
                            case 6: 
                            case 7: 
                            case 8: {
                                sArray[1] = (short)i2.m;
                                sArray[2] = (short)i2.n;
                                this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                            }
                        }
                        sArray[3] = sArray[1];
                        sArray[4] = sArray[2];
                    }
                }
            } else if (nArray2 >= true && nArray2 <= 21 && i.b[i2.h].length > 0 && i2.b[object = i2.f] < i.b[i2.h][object][6] && i2.a[object] != null) {
                for (int i4 = 0; i4 < i2.a[object].length; ++i4) {
                    short[] sArray = i2.a[object][i4];
                    if (sArray[0] != 0 || n2 >= i.b[i2.h][object][0]) continue;
                    ++n2;
                    int n4 = object;
                    i2.b[n4] = (byte)(i2.b[n4] + 1);
                    block5 : switch (i2.h) {
                        case 7: {
                            sArray[0] = 1;
                            sArray[5] = (short)i2.e;
                            sArray[6] = 0;
                            sArray[12] = -1;
                            switch (object) {
                                case 0: {
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e]);
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    sArray[7] = 9;
                                    sArray[10] = 0;
                                    if (sArray[5] == 1) {
                                        sArray[9] = 21;
                                    } else if (sArray[5] == 2) {
                                        sArray[9] = 15;
                                    }
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)true;
                                }
                            }
                            break;
                        }
                        case 12: {
                            sArray[0] = 1;
                            sArray[5] = (short)i2.e;
                            sArray[6] = 0;
                            sArray[12] = -1;
                            switch (object) {
                                case 0: {
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e] - h.c(10));
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1] + h.b(10));
                                    sArray[11] = (short)i2.g;
                                    sArray[7] = 9;
                                    sArray[9] = sArrayArray[0][sArray[5]][h.c(3)];
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                    break;
                                }
                                case 1: {
                                    sArray[5] = (short)i2.e;
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e] + h.b(20));
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    sArray[7] = 8;
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)true;
                                }
                            }
                            break;
                        }
                        case 13: {
                            break;
                        }
                        case 14: {
                            sArray[0] = 1;
                            sArray[5] = (short)i2.e;
                            sArray[6] = 0;
                            sArray[12] = -1;
                            switch (object) {
                                case 0: {
                                    sArray[7] = 9;
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e]);
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                    sArray[10] = 0;
                                    sArray[9] = (short)h.b(sArray[1], (int)sArray[2], (int)this.a.m, this.a.n + h.f(30));
                                    sArray[12] = -1;
                                    break;
                                }
                                case 1: {
                                    sArray[7] = 9;
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e]);
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                    sArray[10] = 0;
                                    sArray[9] = (short)(h.b(sArray[1], (int)sArray[2], (int)this.a.m, this.a.n + h.f(30)) + (n2 - 2 << 1));
                                    sArray[12] = -1;
                                    break;
                                }
                                case 2: {
                                    sArray[7] = 9;
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e]);
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                    sArray[10] = 0;
                                    sArray[9] = (short)(h.b(sArray[1], (int)sArray[2], (int)this.a.m, this.a.n + h.f(30)) + (n2 - 3 << 1));
                                    sArray[12] = -1;
                                    break;
                                }
                                case 3: {
                                    sArray[7] = 10;
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e]);
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                    sArray[10] = 0;
                                    sArray[9] = (short)h.b(sArray[1], (int)sArray[2], (int)this.a.m, this.a.n + h.f(30));
                                    sArray[12] = -1;
                                }
                            }
                            if (sArray[9] < 0) {
                                sArray[9] = (short)(sArray[9] + c.length);
                            }
                            if (sArray[9] < c.length) break;
                            sArray[9] = (short)(sArray[9] - c.length);
                            break;
                        }
                        case 15: {
                            sArray[0] = 1;
                            sArray[5] = (short)i2.e;
                            sArray[6] = 0;
                            sArray[12] = -1;
                            switch (object) {
                                case 0: {
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e]);
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1]);
                                    sArray[11] = (short)i2.g;
                                    sArray[7] = 9;
                                    sArray[9] = sArrayArray[1][sArray[5]][n2 - 1];
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                    break block5;
                                }
                                case 1: {
                                    sArray[1] = (short)(i2.m + this.d[i2.g][i2.b[0]][0] * o[i2.e] + h.b(10));
                                    sArray[2] = (short)(i2.n - this.d[i2.g][i2.b[0]][1] + h.b(10));
                                    sArray[11] = (short)i2.g;
                                    sArray[7] = 9;
                                    sArray[9] = sArrayArray[2][sArray[5]][h.c(3)];
                                    this.a[sArray[11]][sArray[7]][((Random)this.a[sArray[11]][sArray[7]]).length - 1][0] = (Random)false;
                                }
                            }
                        }
                    }
                    sArray[3] = sArray[1];
                    sArray[4] = sArray[2];
                    sArray[15] = 0;
                }
            }
            i2.g = (int[])false;
        }
    }

    private void f(int n2) {
        reference var2_2 = this.a.m / this.n;
        int n3 = this.a.n / this.o;
        boolean n4 = false;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int[] n10 = null;
        for (int i2 = 0; i2 < ((void)this.f[this.q][n2]).length; i2 += 3) {
            if (this.f[this.q][n2][i2] != var2_2 || this.f[this.q][n2][i2 + 1] != n3) continue;
            for (int i3 = 0; i3 < 4; ++i3) {
                int n9;
                block24: {
                    reference var4_5;
                    n8 = this.f[this.q][n2][i2 + 2] & 1 << i3;
                    switch (n8) {
                        case 1: {
                            var4_5 = var2_2 * this.n + this.j;
                            n5 = (n3 + 1) * this.o + this.k;
                            n6 = this.n - (this.j << 1);
                            n7 = 4;
                            break;
                        }
                        case 2: {
                            var4_5 = var2_2 * this.n + this.j;
                            n5 = n3 * this.o - this.k;
                            n6 = this.n - (this.j << 1);
                            n7 = 24;
                            break;
                        }
                        case 4: {
                            var4_5 = var2_2 * this.n;
                            n5 = (n3 + 1) * this.o - this.k;
                            n6 = 4;
                            n7 = this.o - this.k;
                            break;
                        }
                        case 8: {
                            var4_5 = (var2_2 + true) * this.n - 4;
                            n5 = (n3 + 1) * this.o - this.k;
                            n6 = 4;
                            n7 = this.o - this.k;
                        }
                    }
                    n10 = this.a((p)this.a);
                    Object object = this.d[this.q][(n2 << 2) + 1] + var2_2;
                    reference var13_17 = this.d[this.q][(n2 << 2) + 2] + n3;
                    int h2 = h.a((int)var4_5, n5, n6, n7, n10[0], n10[1], n10[2], n10[3], n8);
                    if (h2 >= 3000) continue;
                    switch (n8) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            --var13_17;
                            break;
                        }
                        case 4: {
                            --object;
                            break;
                        }
                        case 8: {
                            ++object;
                        }
                    }
                    int n11 = n8;
                    reference var14_18 = ++var13_17;
                    var13_17 = object;
                    object = n2;
                    h i5 = this;
                    for (int i4 = 0; i4 < ((p)i5.d[i5.q]).length; i4 += 4) {
                        if (var13_17 < i5.d[i5.q][i4 + 1] || var13_17 >= i5.d[i5.q][i4 + 1] + i5.r[i5.d[i5.q][i4] << 1] || var14_18 < i5.d[i5.q][i4 + 2] || var14_18 >= i5.d[i5.q][i4 + 2] + i5.r[(i5.d[i5.q][i4] << 1) + true]) continue;
                        switch (n11) {
                            case 1: {
                                h.y[0] = (int)(i5.a.m / i5.n * i5.n + i5.n / 2 - (i5.d[i5.q][i4 + 1] - i5.d[i5.q][(object << 2) + true]) * i5.n);
                                h.y[1] = 20;
                                break;
                            }
                            case 2: {
                                h.y[0] = (int)(i5.a.m / i5.n * i5.n + i5.n / 2 - (i5.d[i5.q][i4 + 1] - i5.d[i5.q][(object << 2) + true]) * i5.n);
                                h.y[1] = i5.r[(i5.d[i5.q][i4] << 1) + true] * i5.o - 25;
                                break;
                            }
                            case 4: {
                                h.y[0] = i5.r[i5.d[i5.q][i4] << 1] * i5.n - 20;
                                h.y[1] = i5.a.n - (i5.d[i5.q][i4 + 2] - i5.d[i5.q][(object << 2) + 2]) * i5.o;
                                break;
                            }
                            case 8: {
                                h.y[0] = 14;
                                h.y[1] = i5.a.n - (i5.d[i5.q][i4 + 2] - i5.d[i5.q][(object << 2) + 2]) * i5.o;
                            }
                        }
                        n9 = i4 / 4;
                        break block24;
                    }
                    n9 = -1;
                }
                this.v = (int[])n9;
                if (n8 != 1 && n8 != 2 && ((n8 != 4 || this.a.e != 2) && (n8 != 8 || this.a.e != 1) || this.a.e[0] != 1 && this.a.e[0] != 2 && this.a.e[0] != 8) || this.v < 0) continue;
                if (this.q == false && this.v == 24) {
                    this.d[16] = (p)45;
                    this.e[this.q][this.v] = true;
                    n8 = 0;
                    for (int i5 = 0; i5 < ((void)this.e[this.q]).length; ++i5) {
                        if (this.e[this.q][i5] != true) continue;
                        ++n8;
                    }
                    this.x[this.q] = (byte)(n8 * 100 / ((void)this.e[this.q]).length);
                    h.a(this.p, 37);
                    this.w[2] = 0;
                    continue;
                }
                if (this.q == 3 && n2 == 2 || this.q == 7 && n2 == 2 || this.q == 9 && n2 == 2 || this.q == 11 && n2 == 2 || this.q == 13 && n2 == 6 || this.q == 16 && n2 == 6 || this.q == 18 && n2 == 6 || this.q == 21 && n2 == 6) {
                    this.r();
                    this.g = 1;
                    this.a(this.E);
                    h.a(this.p, 4);
                    h.a(this.q, 34);
                    this.F[0] = 41;
                    this.F[2] = 0;
                    continue;
                }
                this.a(this.E);
                this.b = true;
                this.d[17] = (p)((short)(this.x[0] / 240 + this.d[this.q][(n2 << 2) + 1]));
                this.d[18] = (p)((short)(this.x[1] / 320 + this.d[this.q][(n2 << 2) + 2]));
                h.a(this.p, 34);
                return;
            }
        }
    }

    private static int i(int n2) {
        int[] nArray = new int[]{0, 1, 2, 2, 3, 3, 0, 4, 5, 9, 4, 4, 6, 6, 5, 7, 7, 8, 0, 3, 0, 9};
        return nArray[n2];
    }

    private static int j(int n2) {
        int n3 = -1;
        switch (n2) {
            case 0: 
            case 4: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: 
            case 6: {
                n3 = 2;
                break;
            }
            case 3: 
            case 7: {
                n3 = 3;
                break;
            }
            case 5: 
            case 8: {
                n3 = 4;
                break;
            }
            case 9: {
                n3 = 5;
            }
        }
        return n3;
    }

    private static int a(byte[] byArray) {
        int n2 = -1;
        int n3 = h.c(100);
        int n4 = 0;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (n3 >= n4 && n3 < n4 + byArray[i2]) {
                n2 = i2;
                break;
            }
            n4 += byArray[i2];
        }
        return n2;
    }

    private static int[] a(long l2, long l3, long l4) {
        int[] nArray = new int[]{0, 0, 0};
        int n2 = h.a(l2 * l2 + l3 * l3);
        if (n2 == 0) {
            nArray[2] = 1;
            return nArray;
        }
        if (l3 != 0L) {
            nArray[0] = (int)(l4 * l2 / (long)n2);
        }
        if (l2 != 0L) {
            nArray[1] = (int)(l4 * l3 / (long)n2);
        }
        if (l2 == 0L) {
            nArray[0] = 0;
            nArray[1] = (int)(l4 + 2L * l4 * ((l3 & Integer.MIN_VALUE) >> 31));
        }
        if (l3 == 0L) {
            nArray[1] = 0;
            nArray[0] = (int)(l4 + 2L * l4 * ((l2 & Integer.MIN_VALUE) >> 31));
        }
        return nArray;
    }

    /*
     * Exception decompiling
     */
    private short a(i var1_1, int var2_2, int var3_4, int var4_6, int var5_7, int var6_8, int var7_9, int var8_10, int var9_12) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static short a(short s, int n2, int n3, int n4) {
        short s2 = s;
        if (s < n3 || s > n4) {
            s2 = (short)n3;
        } else if ((s2 = (short)(s2 + n2)) > n4) {
            s2 = (short)n3;
        }
        return s2;
    }

    private void b(int n2, int n3, int n4, int n5) {
        int n6;
        this.d[81] = (p)h.a((short)this.d[81], 4, 2, 21);
        this.a(this.d, (int)this.d[81], 0, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(this.d, (int)(this.d[81] + true), 0, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(this.d, (int)(this.d[81] + 2), 0, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(this.d, (int)(this.d[81] + 3), 0, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        n7 = h.d(n3);
        if (n2 == 0) {
            n8 = n4 - n7 * 1;
            for (n6 = 0; n6 < n7; ++n6) {
                n9 = n3 % h.e(n7 + 1 - n6) / h.e(n7 - n6);
                this.a(this.d, (int)(this.d[81] + n6), n9 + 0, n8 + n6 * 7, n5, 1, 26, 1, 1, -1, 0, 1);
            }
        }
        if (n2 == 1) {
            n8 = n4 - n7 * 3;
            for (n6 = 0; n6 < n7; ++n6) {
                n9 = n3 % h.e(n7 + 1 - n6) / h.e(n7 - n6);
                this.a(this.d, (int)(this.d[81] + n6), n9 + 10, n8 + n6 * 14, n5, 1, 26, 1, 1, -1, 0, 1);
            }
        }
    }

    private void a(i i2, int n2, int n3, int n4, int n5) {
        i2.a[6] = h.a(i2.a[6], 5, 4, 18);
        int n6 = 0;
        if (n2 == 0) {
            n6 = 20;
        } else if (n2 == 1) {
            n6 = 31;
        }
        this.a(i2, i2.a[6], n6, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(i2, i2.a[6] + 1, n6, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(i2, i2.a[6] + 2, n6, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(i2, i2.a[6] + 3, n6, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        this.a(i2, i2.a[6] + 4, n6, n4, n5, 1, 26, 1, 0, -1, 0, 1);
        if (n3 < 0) {
            this.a(i2, i2.a[6] + 4, 78, n4, n5, 1, 26, 1, 1, -1, 0, 1);
            return;
        }
        n2 = 0;
        int n7 = 0;
        int n8 = 0;
        n7 = 0;
        n2 = h.d(n3);
        n7 = n4 - (n2 << 3 >> 1);
        n8 = n7 + 20;
        this.a(i2, i2.a[6] + 4, n6, n7, n5, 1, 26, 1, 1, -1, 0, 1);
        for (n4 = 0; n4 < n2; ++n4) {
            n7 = n3 % h.e(n2 + 1 - n4) / h.e(n2 - n4);
            this.a(i2, i2.a[6] + n4, n6 + 1 + n7, n8 + (n4 << 3), n5, 1, 26, 1, 1, -1, 0, 1);
        }
    }

    private void a(i i2, int n2, int n3, int n4) {
        byte[] byArray = new byte[]{-1, -1, -1, -1, 42, 43, 44, 45, 46, -1, -1, -1, 47, 48, 49, 50, 51, 52, 53};
        if (byArray[n2] > 0) {
            i2.a[6] = h.a(i2.a[6], 5, 4, 18);
            this.a(i2, i2.a[6], byArray[n2], n3, n4, 1, 26, 1, 0, -1, 0, 1);
            this.a(i2, i2.a[6] + 1, byArray[n2], n3, n4, 1, 26, 1, 0, -1, 0, 1);
            this.a(i2, i2.a[6] + 2, byArray[n2], n3, n4, 1, 26, 1, 0, -1, 0, 1);
            this.a(i2, i2.a[6] + 3, byArray[n2], n3, n4, 1, 26, 1, 0, -1, 0, 1);
            this.a(i2, i2.a[6] + 4, byArray[n2], n3, n4, 1, 26, 1, 0, -1, 0, 1);
            this.a(i2, i2.a[6], byArray[n2], n3, n4, 1, 26, 1, 1, -1, 0, 1);
        }
    }

    private void a(r object, int n2) {
        int n3;
        ((r)object).e[1] = n3 = h.k(((r)object).f[0]);
        boolean bl = false;
        if (((r)object).f[0] < ((r)object).f[1]) {
            if (n2 > 0) {
                if (n2 > 9999) {
                    n2 = 9999;
                }
                this.C = this.a((p)object);
                this.a((i)object, 1, n2, this.C[0] + (this.C[2] >> 1) + h.b(4) * 12, this.C[1] + 10 + h.b(4) * 6);
                ((r)object).e[0] = ((r)object).e[0] + n2;
                if (((r)object).e[0] >= n3) {
                    ((r)object).f[2] = ((r)object).f[0];
                    ((r)object).a[2] = ((r)object).a[1];
                    ((r)object).d[2] = ((r)object).d[1];
                    ((r)object).c[2] = ((r)object).c[0];
                    ((r)object).b[2] = ((r)object).b[0];
                }
                while (((r)object).e[0] >= n3) {
                    ((r)object).e[0] = ((r)object).e[0] - n3;
                    if (((r)object).f[0] >= ((r)object).f[1]) continue;
                    ((r)object).f[0] = ((r)object).f[0] + 1;
                    ((r)object).e[1] = h.k(((r)object).f[0]);
                    bl = true;
                    n3 = h.k(((r)object).f[0]);
                    ((r)object).a[1] = ((r)object).a[1] + 20;
                    ((r)object).d[1] = ((r)object).d[1] + 10;
                    ((r)object).c[0] = ((r)object).c[0] + (2 + ((r)object).f[0] / 12);
                    ((r)object).b[0] = ((r)object).b[0] + (2 + ((r)object).f[0] / 6);
                    if (this.q[0] != 0) continue;
                    this.k(92);
                }
            }
            if (bl) {
                this.a(this.a, 0, 54, 0, 0, this.a.e, 26, 1, 1, -1, 1, 1);
                ((r)object).a[0] = ((r)object).a[1];
                ((r)object).d[0] = ((r)object).d[1];
                object = new byte[][]{{10, 2, 8, 20}, {15, 13}, {20, 0, 6, 7}, {25, 16, 22}, {30, 4, 5, 3}, {35, 1, 14}};
                for (n2 = 0; n2 < ((Object)object).length; ++n2) {
                    if (this.a.f[0] < object[n2][0]) continue;
                    for (n3 = 1; n3 < ((Object)object[n2]).length; ++n3) {
                        if (h.a((byte)object[n2][n3], this.k) >= 0) continue;
                        this.k = this.a(this.k, (int)object[n2][n3], 1, 0);
                        this.i[23] = true;
                    }
                }
            }
        }
    }

    private static int k(int n2) {
        return n2 + 50 + n2 * n2 * 12;
    }

    private static int l(int n2) {
        int[] nArray = new int[]{10, 20, 30, 10, 20, 30, 10, 20, 30};
        return nArray[n2];
    }

    private static int m(int n2) {
        int[] nArray = new int[]{0, 0, 0, 1, 3, 5, 2, 6, 10};
        return nArray[n2];
    }

    private void s() {
        if (this.c == null) {
            this.c = (byte[][][])g.a("/data/data/arrow.mid");
        }
        int[] nArray = new int[]{60, 61, 62, 63};
        for (int i2 = 0; i2 < 3; ++i2) {
            if (i2 < this.c[this.q][this.p].length) {
                this.a(this.c, i2, nArray[this.c[this.q][this.p][i2][2]], (int)(this.c[this.q][this.p][i2][0] * 20), (int)(this.c[this.q][this.p][i2][1] * 20), 1, 26, 1, 1, -1, 0, 0);
                continue;
            }
            this.a(this.c, i2, 0, 0, 0, 1, 26, 1, 0, -1, 0, 0);
        }
        this.c = null;
    }

    private void c(int n2, int n3, int n4, int n5) {
        if (this.a.length > 0 && ((n5 == 10 || n5 == 11) && this.b[this.q][this.p] == false || n5 != 10 && n5 != 11)) {
            this.e(n5);
            this.b(n5);
            this.a[n2] = (c)this.a(n5, this.a.m >= n3 * this.j ? (byte)1 : 2, n3 * this.j, n4 * this.k, 0, 0, 0, 0, 0);
            this.a[n2].a = n3;
            this.a[n2].b = n4;
            if ((n5 == 10 || n5 == 11) && this.b[this.q][this.p] == false) {
                this.a[n2].a[1] = this.a[n2].a[1] * 5;
                this.a[n2].a[0] = this.a[n2].a[1];
                this.d[4] = (p)true;
                this.d[53] = (p)false;
                this.h((int)this.d[4]);
            }
        }
    }

    private void t() {
        this.d[22] = (p)-1;
        if (((Random)this.a[this.q]).length > 0) {
            Object object;
            for (object = 0; object < ((Random)this.a[this.q]).length; ++object) {
                if (this.p != this.a[this.q][object][0][0]) continue;
                this.d[22] = (p)((short)object);
                break;
            }
            if (this.d[22] >= 0 && this.a[this.q][this.d[22]][1][6] == false) {
                this.d[71] = (p)true;
                this.d[45] = (p)false;
                this.d[54] = (p)false;
                this.a = new c[((Random)this.a[this.q][this.d[22]]).length - 1];
                this.C = this.a((int)this.p);
                for (int i2 = 0; i2 < this.a.length; ++i2) {
                    object = this.a[this.q][this.d[22]][i2 + 1][1];
                    this.e((int)object);
                    this.b((int)object);
                    this.a[i2] = (c)this.a((int)object, this.a.m >= this.a[this.q][this.d[22]][i2 + 1][13] * this.j ? (byte)1 : 2, (int)(this.a[this.q][this.d[22]][i2 + 1][13] * this.j), (int)(this.a[this.q][this.d[22]][i2 + 1][14] * this.k), this.C[0] + this.j, this.C[1] - this.k, this.C[2] - 2 * this.j, this.C[3] - 2 * this.k, (int)(this.a[this.q][this.d[22]][i2 + 1][15] - 5));
                    if (this.a[i2].h == 14) {
                        this.e(25);
                    }
                    if (object == 15 && this.a[this.q][this.d[22]][1][0] == false) {
                        c.a(this.a[i2], (byte)11);
                    }
                    if (this.a[this.q][this.d[22]][i2 + 1][10] != true) continue;
                    this.e((int)this.a[this.q][this.d[22]][i2 + 1][11]);
                    this.b((int)this.a[this.q][this.d[22]][i2 + 1][11]);
                    this.a[i2].a = new c[this.a[this.q][this.d[22]][i2 + 1][12]];
                    for (object = 0; object < this.a[i2].a.length; ++object) {
                        this.a[i2].a[object] = (c)this.a((int)this.a[this.q][this.d[22]][i2 + 1][11], this.a.m >= 0 * this.j ? (byte)1 : 2, 0 * this.j, 0 * this.k, 0, 0, 0, 0, 0);
                        this.a[i2].a[object].a = (c[])false;
                    }
                }
                this.d[4] = (p)true;
                this.h((int)this.d[4]);
            } else {
                this.d[22] = (p)-1;
            }
        }
        this.c = false;
    }

    private void b(int n2, int n3) {
        if (n3 == 0) {
            this.d[21] = (p)false;
            this.d[9] = (p)false;
            this.d[19] = (p)false;
            this.d[20] = (p)false;
            return;
        }
        if (n2 == 0) {
            this.d[21] = (p)((short)n3);
            this.d[19] = (p)false;
            this.d[20] = (p)((short)(this.d[21] % 2 == true ? -4 : 4));
            return;
        }
        if (n2 == 1 && this.d[21] == false) {
            this.d[9] = (p)true;
            this.d[19] = (p)false;
            this.d[20] = (p)true;
        }
    }

    private void g(int n2) {
        this.e(n2);
        this.b(n2);
        this.b = new p();
        this.b.g = n2;
        this.b.a = new int[10][12];
        this.D();
        this.a(this.b, 0, 0, (int)this.d[13], (int)this.d[14], 1, n2, 1, 1, -1, 2, 0);
        this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, n2, 1, 1, -1, 2, 0);
        if (n2 == 49) {
            this.d[10] = (p)35;
            this.d[11] = (p)35;
        } else {
            this.d[10] = (p)false;
            this.d[11] = (p)35;
        }
        this.d[99] = (p)false;
        this.k(159);
    }

    private void b(c c2) {
        this.d[24] = (p)4;
        for (int i2 = 0; i2 < this.d[24] + 2; ++i2) {
            if (c2.a == null || c2.a[i2].a != false) continue;
            if (c2.h == 12) {
                this.C = this.a((int)this.p);
                this.B = h.a(this.C);
            } else if (c2.h == 13 || c2.h == 14) {
                this.C = this.a((p)c2);
                int n2 = h.f(40);
                this.C[0] = this.C[0] - n2;
                this.C[1] = this.C[1] + n2;
                this.C[2] = this.C[2] + (n2 << 1);
                this.C[3] = this.C[3] + (n2 << 1);
                this.B = h.a(this.C);
            } else if (c2.h == 15) {
                this.C[0] = (int)(this.a.m - h.f(80));
                this.C[1] = this.a.n + h.f(110);
                this.C[2] = h.f(160);
                this.C[3] = 1;
                this.B = h.a(this.C);
            }
            this.a(c2.a[i2], c2.a[i2].g, this.B[0], this.B[1]);
            this.a((p)c2.a[i2], 0, 0);
            c2.a[i2].a[1] = (c)false;
            c2.a[i2].a[0] = c2.a[i2].a[1];
            h.a((byte[])c2.a[i2].a, 1);
            c2.a[i2].d = true;
            h.a(c2.a[i2], 7, 0);
            this.C = this.a((p)c2.a[i2]);
            this.a(c2.a[i2], 0, 65, c2.a[i2].m, c2.a[i2].n + this.C[3] / 2, 1, 26, 1, 1, -1, 0, 1);
        }
    }

    private void u() {
        int n2 = this.h[0].length / 3;
        this.b = new p[n2];
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2] = new p();
            this.b[n2].m = this.h[0][n2 * 3] * 20;
            this.b[n2].n = this.h[0][n2 * 3 + 1] * 20;
        }
    }

    private void h(int n2) {
        this.a(this.c, 10, 76, 0, 0, 1, 26, 1, n2, -1, 0, 0);
        this.a(this.c, 11, 76, this.r[this.d[this.q][this.p << 2] << 1] * this.n, 0, 1, 26, 1, n2, -1, 0, 0);
    }

    private void v() {
        int n2;
        if (this.r != this.q) {
            this.d = new p[0];
            this.e = new p[0];
            for (n2 = 0; n2 < this.m.length; ++n2) {
                if (this.m[n2] < 0) continue;
                this.n(this.m[n2]);
                this.o(this.m[n2]);
            }
        }
        if (this.m[this.t] >= 0) {
            this.e(this.m[this.t]);
            this.b(this.m[this.t]);
            if (this.u == 1) {
                this.d = new p[30];
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    this.d[n2] = this.a(this.m[this.t], this.x[0] + h.c(240), this.x[1] + h.c(260), h.c(((Random)this.a[this.m[this.t]]).length), 0, 0);
                    this.d[n2].k = h.c(((Random)this.a[this.m[this.t]][0]).length - 1);
                    this.d[n2].k[0] = h.b(3) + 10;
                }
                this.e = new p[this.n.length / 2];
                for (n2 = 0; n2 < this.e.length; ++n2) {
                    this.e[n2] = this.a(this.m[this.t], this.n[n2 << 1] * 20 + h.c(20), this.n[(n2 << 1) + 1] * 20, 4, 1, 0);
                    this.e[n2].k = h.c(((Random)this.a[this.m[this.t]][4]).length - 1);
                }
                return;
            }
            if (this.u == 0 || this.u == 3 || this.u == 4) {
                n2 = 0;
                switch (this.u) {
                    case 0: {
                        n2 = 6;
                        break;
                    }
                    case 3: 
                    case 4: {
                        n2 = 15;
                    }
                }
                this.d = new p[n2];
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    this.d[n2] = this.a(this.m[this.t], this.x[0] + h.c(240), this.x[1] + h.c(260), 0, 0, 0);
                    this.d[n2].k = h.c(((Random)this.a[this.m[this.t]][0]).length - 1);
                    this.d[n2].k[0] = h.b(3);
                }
                this.e = new p[0];
                return;
            }
            if (this.u == 2) {
                this.d = new p[6];
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    this.d[n2] = this.a(this.m[this.t], this.x[0] + h.c(240), this.x[1] + h.c(260), h.c(4), 0, 0);
                    this.d[n2].k = h.c(((Random)this.a[this.m[this.t]][0]).length - 1);
                    this.d[n2].k[0] = h.b(3);
                    this.d[n2].k[1] = h.c(5) + 4;
                }
                this.e = new p[4];
                for (n2 = 0; n2 < this.e.length; ++n2) {
                    this.e[n2] = this.a(this.m[this.t], this.x[0] + h.c(240), this.x[1] + h.c(260), n2 % 2 + 4, 0, 0);
                    this.e[n2].k = h.c(((Random)this.a[this.m[this.t]][n2 % 2 + 4]).length - 1);
                    this.e[n2].k[0] = h.c(2) + 1;
                }
            }
        }
    }

    private void w() {
        this.a = (Random)true;
        this.b = false;
        h.a(this.p, 7);
        h.a(this.q, 0);
        this.a(2, 16, 2);
        this.s = this.s[0];
    }

    private void x() {
        this.p = new byte[5];
        this.e = 0;
        this.c = new byte[5][4][3];
        this.f = 0;
    }

    private void y() {
        int n2;
        int n3;
        this.r = (int)this.q;
        this.q = (byte[])false;
        this.p = (byte[])false;
        this.a = (r)this.a(0, (byte)1, this.j * 3, this.k * 3, 0, this.m, this.l, this.m, 1);
        this.a.e[0] = 0;
        this.a.e[1] = h.k(this.a.f[0]);
        this.a.a[1] = 350;
        this.a.a[0] = this.a.a[1];
        this.a.b[0] = 20;
        this.a.c[0] = 10;
        this.a.d[1] = 100;
        this.a.d[0] = this.a.d[1];
        this.a.f[0] = 1;
        this.a.m[0] = 1000;
        this.a.e = 1;
        for (n3 = 0; n3 < ((Random)this.a).length; ++n3) {
            this.i(n3);
        }
        this.a[0][0] = (Random)true;
        this.a[0][1] = (Random)6;
        this.a[0][2] = (Random)4;
        this.a[0][3] = (Random)true;
        this.a[0][4] = (Random)10;
        this.a[0][5] = (Random)true;
        this.a[0][6] = (Random)7;
        this.a[0][7] = (Random)true;
        this.a[0][8] = (Random)16;
        this.e[0] = false;
        this.a.f = 0;
        this.m(0);
        this.e = (byte)new byte[]{0};
        for (n3 = 0; n3 < ((byte)this.f).length; ++n3) {
            this.f[n3] = false;
        }
        this.f[0] = this.a[this.a[0][1]][0] / 20;
        for (n3 = 0; n3 < ((Random)this.a).length; ++n3) {
            if (((Random)this.a[n3]).length <= 0) continue;
            for (int i2 = 0; i2 < ((Random)this.a[n3]).length; ++i2) {
                for (n2 = 1; n2 < ((Random)this.a[n3][i2]).length; ++n2) {
                    this.a[n3][i2][n2][0] = (Random)false;
                    this.a[n3][i2][n2][6] = (Random)false;
                }
            }
        }
        for (n3 = 0; n3 < ((byte)this.e).length; ++n3) {
            this.e[n3] = false;
        }
        for (n3 = 0; n3 < this.k.length; ++n3) {
            this.k[n3] = 0;
        }
        int[] nArray = new int[500];
        h.b(nArray, 0, (byte[][][])this.d);
        h.a(nArray, 0, (byte[][][])this.e);
        for (n2 = 0; n2 < ((boolean)this.b).length; ++n2) {
            for (int i3 = 0; i3 < ((void)this.b[n2]).length; ++i3) {
                this.b[n2][i3] = false;
            }
        }
        this.f = (byte)new byte[]{12};
        for (n2 = 0; n2 < this.k.length; ++n2) {
            this.k[n2] = 0;
        }
        this.k[this.f[0]] = 1;
        this.k = new byte[]{12, 15, 17, 18};
        this.l = new byte[]{12};
        this.P();
        for (n2 = 0; n2 < ((int)this.i).length; ++n2) {
            this.i[n2] = n2 >= 1 && n2 <= 9 ? 22500 : 0;
        }
        for (n2 = 0; n2 < this.g.length; ++n2) {
            this.g[n2][0] = n2 >= 70 && n2 <= 87 || n2 >= 94 && n2 <= 115 ? (Object)true : (short[])-1;
        }
        for (n2 = 0; n2 < this.d.length; ++n2) {
            this.d[n2][0] = n2 == 0 || n2 == 6 || n2 == 12 ? (Object)true : (p)false;
        }
        this.t = new int[]{0, 0, 1000};
        this.u = new int[]{0, 100000};
        for (n2 = 0; n2 < ((int)this.i).length; ++n2) {
            for (int i4 = 0; i4 < ((void)this.i[n2]).length; ++i4) {
                this.i[n2][i4] = n2 >= 0 && n2 <= 2 && i4 == 1 || n2 >= 0 && n2 <= 1 && i4 == 0;
            }
        }
        for (n2 = 0; n2 < this.x.length; ++n2) {
            this.x[n2] = 0;
        }
        for (n2 = 0; n2 < this.y.length; ++n2) {
            this.y[n2] = n2 == 0 ? 1 : 0;
        }
        for (n2 = 0; n2 < ((boolean)this.b).length; ++n2) {
            if (((void)this.b[n2]).length <= 0) continue;
            for (int i5 = 0; i5 < ((void)this.b[n2]).length; ++i5) {
                if (((void)this.b[n2][i5]).length <= 0) continue;
                for (n3 = 1; n3 < ((void)this.b[n2][i5]).length; ++n3) {
                    this.b[n2][i5][n3][3] = false;
                }
            }
        }
    }

    private void z() {
        if (this.z == 0) {
            Object object;
            int n2;
            Object object2 = null;
            Object[] objectArray = null;
            Object object3 = null;
            int n3 = -1;
            int n4 = 0;
            switch (this.q[0]) {
                case 1: {
                    if (this.f != 0 || this.d[73] != true) break;
                    object3 = this.d[34] > 0 ? this.a : (Object)this.b;
                    n3 = 3;
                    break;
                }
                case 14: {
                    break;
                }
                case 11: {
                    switch (this.d[this.e]) {
                        case 21: {
                            objectArray = this.d;
                            n3 = 1;
                            break;
                        }
                        case 22: {
                            if (this.p[this.e] != 0) break;
                            object2 = this.e;
                            objectArray = this.d;
                            n3 = 2;
                            n4 = 1;
                            break;
                        }
                        case 23: {
                            if (this.p[this.e] != 0) break;
                            object2 = this.f;
                            objectArray = this.d;
                            n3 = 2;
                            n4 = 3;
                            break;
                        }
                        case 24: {
                            object2 = this.g;
                            objectArray = this.d;
                            n3 = 2;
                            n4 = 3;
                            break;
                        }
                        case 25: {
                            object2 = this.i;
                            objectArray = this.d;
                            n3 = 2;
                            n4 = 3;
                        }
                    }
                    break;
                }
                case 12: {
                    switch (this.j[this.e]) {
                        case 27: {
                            if (this.p[this.e] != 0 || this.f != 0) break;
                            object2 = this.k;
                            objectArray = this.j;
                            n3 = 2;
                            n4 = 3;
                            break;
                        }
                        case 28: {
                            if (this.p[this.e] != 0 || this.f != 0) break;
                            object2 = this.m;
                            objectArray = this.j;
                            n3 = 2;
                            n4 = 3;
                        }
                    }
                    break;
                }
                case 2: {
                    object2 = this.c;
                    n3 = 0;
                    break;
                }
                case 28: {
                    if (this.p[this.e] == 0 && this.f == 0) {
                        object2 = this.h;
                        n3 = 0;
                        n4 = 3;
                    }
                    if (this.p[this.e] != 1) break;
                    object2 = this.g;
                    n3 = 0;
                    n4 = 3;
                    break;
                }
                case 32: {
                    if (this.p[this.e] != 0) break;
                    object2 = this.n;
                    n3 = 0;
                }
            }
            if ((n3 == 0 || n3 == 2) && ((byte[][][])object2).length > 0) {
                n2 = n4;
                object = object2;
                object2 = this;
                if (object != null) {
                    if (super.h(-1) == 1 || super.h(50) == 1) {
                        if (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] > 0) {
                            byte[] byArray = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                            byArray[0] = (byte)(byArray[0] - 1);
                            if (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] > 0) {
                                byte[] byArray2 = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                                byArray2[1] = (byte)(byArray2[1] - 1);
                            } else {
                                byte[] byArray3 = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                                byArray3[2] = (byte)(byArray3[2] - 1);
                            }
                        } else {
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] = (byte)(((byte[][][])object).length - 1);
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2] = (byte)(((byte[][][])object).length < n2 ? 0 : ((byte[][][])object).length - n2);
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] = (byte)(((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] - ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2]);
                        }
                        ((h)object2).a.b();
                    }
                    if (super.h(-2) == 1 || super.h(56) == 1) {
                        if (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] < ((byte[][][])object).length - 1) {
                            byte[] byArray = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                            byArray[0] = (byte)(byArray[0] + 1);
                            if (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] < n2 - 1) {
                                byte[] byArray4 = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                                byArray4[1] = (byte)(byArray4[1] + 1);
                            } else {
                                byte[] byArray5 = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                                byArray5[2] = (byte)(byArray5[2] + 1);
                            }
                        } else {
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] = 0;
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] = 0;
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2] = 0;
                        }
                        ((h)object2).a.b();
                    }
                }
            }
            if ((n3 == 1 || n3 == 2) && objectArray.length > 0) {
                n2 = n4;
                object = objectArray;
                object2 = this;
                if (object != null) {
                    if (super.h(-3) == 1 || super.h(52) == 1) {
                        ((h)object2).e = ((h)object2).e > 0 ? (byte)(((h)object2).e - 1) : (byte)(((byte[][][])object).length - 1);
                        if (((h)object2).q[0] == 11 && ((h)object2).d[((h)object2).e] == 22) {
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] = (byte)h.a(((h)object2).a.a, (byte[])((h)object2).e);
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2] = (byte)(((byte)((h)object2).e).length < n2 ? 0 : (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] >= ((byte)((h)object2).e).length - n2 ? ((byte)((h)object2).e).length - n2 : ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0]));
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] = (byte)(((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] - ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2]);
                            ((h)object2).d[46] = (p)((short)((h)object2).c[((h)object2).e][0][0]);
                            for (int i2 = 0; i2 < ((byte)((h)object2).e).length; ++i2) {
                                ((h)object2).c[24][((h)object2).e[i2]] = ((h)object2).c[24][((h)object2).c[((h)object2).a[((h)object2).e[((h)object2).d[46]]][1]][i2]];
                            }
                            super.a(((h)object2).a, 11, 52, (int)((h)object2).d[13], (int)((h)object2).d[14], 1, 24, 1, 1, -1, 2, 0);
                        }
                        ((h)object2).a.b();
                    }
                    if (super.h(-4) == 1 || super.h(54) == 1) {
                        ((h)object2).e = ((h)object2).e < ((byte[][][])object).length - 1 ? (byte)(((h)object2).e + 1) : (byte)0;
                        if (((h)object2).q[0] == 11 && ((h)object2).d[((h)object2).e] == 22) {
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] = (byte)h.a(((h)object2).a.a, (byte[])((h)object2).e);
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2] = (byte)(((byte)((h)object2).e).length < n2 ? 0 : (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] >= ((byte)((h)object2).e).length - n2 ? ((byte)((h)object2).e).length - n2 : ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0]));
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] = (byte)(((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] - ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2]);
                            ((h)object2).d[46] = (p)((short)((h)object2).c[((h)object2).e][0][0]);
                            for (int i3 = 0; i3 < ((byte)((h)object2).e).length; ++i3) {
                                ((h)object2).c[24][((h)object2).e[i3]] = ((h)object2).c[24][((h)object2).c[((h)object2).a[((h)object2).e[((h)object2).d[46]]][1]][i3]];
                            }
                            super.a(((h)object2).a, 11, 52, (int)((h)object2).d[13], (int)((h)object2).d[14], 1, 24, 1, 1, -1, 2, 0);
                        }
                        ((h)object2).a.b();
                    }
                }
            }
            if (n3 == 3 && (object3).length > 0) {
                object = object3;
                object2 = this;
                if (object != null) {
                    if (super.h(-1) == 1 || super.h(50) == 1 || super.h(-3) == 1 || super.h(52) == 1) {
                        if (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] > 0) {
                            byte[] byArray = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                            byArray[0] = (byte)(byArray[0] - 1);
                        } else {
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] = (byte)(((byte[][][])object).length - 1);
                        }
                    }
                    if (super.h(-2) == 1 || super.h(56) == 1 || super.h(-4) == 1 || super.h(54) == 1) {
                        if (((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] < ((byte[][][])object).length - 1) {
                            byte[] byArray = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]];
                            byArray[0] = (byte)(byArray[0] + 1);
                        } else {
                            ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0] = 0;
                        }
                    }
                    ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][2] = ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1];
                    ((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][1] = (byte)object[((h)object2).c[((h)object2).e][((h)object2).p[((h)object2).e]][0]];
                }
            }
        }
        if (++this.z >= 4) {
            this.z = 0;
        }
    }

    private void A() {
        int n2 = this.i;
        n2[10] = n2[10] + true;
        this.i[10] = this.i[10] >= this.h() ? false : this.i[10];
        h.a(this.p, 38);
        this.N();
        this.w[2] = 0;
    }

    private void B() {
        if (this.h(50) == 1 || this.h(-1) == 1) {
            if (this.d[18] < this.c[this.q][0]) {
                this.d[18] = (p)((short)(this.d[18] + true));
            }
        } else if (this.h(56) == 1 || this.h(-2) == 1) {
            if (this.d[18] > 0) {
                this.d[18] = (p)((short)(this.d[18] - true));
            }
        } else if (this.h(52) == 1 || this.h(-3) == 1) {
            if (this.d[17] > 0) {
                this.d[17] = (p)((short)(this.d[17] - true));
            }
        } else if ((this.h(54) == 1 || this.h(-4) == 1) && this.d[17] < this.c[this.q][1]) {
            this.d[17] = (p)((short)(this.d[17] + true));
        }
        if (this.h(-7) == 1 || this.h(48) == 1 || this.h(-11) == 1) {
            h.a(this.p, 7);
            h.a(this.q, 0);
            this.b = false;
            this.r();
        }
    }

    private void C() {
        int n2;
        if (this.j[this.e] == 27 && this.p[this.e] == 1 && this.f == 0) {
            if (this.h(-3) == 1 || this.h(52) == 1) {
                this.r();
                if (this.d[8] > true) {
                    this.d[8] = (p)((short)(this.d[8] - true));
                }
            } else if (this.h(-4) == 1 || this.h(54) == 1) {
                this.r();
                n2 = this.k[this.c[this.e][0][0]];
                if (this.k[n2] + this.d[8] < (this.k[2] == 1 ? 999 : 10) && this.d[8] < 99) {
                    this.d[8] = (p)((short)(this.d[8] + true));
                }
            } else if (this.h(-1) == 1 || this.h(50) == 1) {
                this.r();
                n2 = this.k[this.c[this.e][0][0]];
                if (this.k[n2] + this.d[8] < (this.k[2] == 1 ? 999 : 10) && this.d[8] < 99) {
                    int n3 = 10;
                    int n4 = 10;
                    int n5 = 10;
                    if (this.k[n2] + this.d[8] < (this.k[2] == 1 ? 999 : 10) && this.k[n2] + this.d[8] + 10 > (this.k[2] == 1 ? 999 : 10)) {
                        n4 = (this.k[2] == 1 ? 999 : 10) - (this.k[n2] + this.d[8]);
                    }
                    if (this.d[8] < 99 && this.d[8] + 10 > 99) {
                        n5 = 99 - this.d[8];
                    }
                    if (10 > n4) {
                        n3 = n4;
                    }
                    if (n3 > n5) {
                        n3 = n5;
                    }
                    this.d[8] = (p)((short)(this.d[8] + n3));
                }
            } else if (this.h(-2) == 1 || this.h(56) == 1) {
                this.r();
                if (this.d[8] > true) {
                    this.d[8] = (p)((short)(this.d[8] - 10));
                    if (this.d[8] < true) {
                        this.d[8] = (p)true;
                    }
                }
            }
        }
        if (this.j[this.e] == 28 && this.p[this.e] == 1 && this.f == 0) {
            if (this.h(-3) == 1 || this.h(52) == 1) {
                this.r();
                if (this.d[8] > true) {
                    this.d[8] = (p)((short)(this.d[8] - true));
                }
            } else if (this.h(-4) == 1 || this.h(54) == 1) {
                this.r();
                n2 = this.m[this.c[this.e][0][0]];
                if (this.d[8] < this.k[n2]) {
                    this.d[8] = (p)((short)(this.d[8] + true));
                }
            } else if (this.h(-1) == 1 || this.h(50) == 1) {
                this.r();
                n2 = this.m[this.c[this.e][0][0]];
                this.d[8] = this.d[8] < this.k[n2] - 10 ? (Object)((short)(this.d[8] + 10)) : (p)((short)this.k[n2]);
            } else if (this.h(-2) == 1 || this.h(56) == 1) {
                this.r();
                this.d[8] = this.d[8] > 10 ? (Object)((short)(this.d[8] - 10)) : (p)true;
            }
        }
        if (this.h(-6) == 1 || this.h(-5) == 1 || this.h(53) == 1) {
            this.r();
            block0 : switch (this.j[this.e]) {
                case 27: {
                    switch (this.p[this.e]) {
                        case 0: {
                            if (this.f == 0) {
                                this.d[8] = (p)true;
                                if (this.k[this.c[this.e][0][0]] >= 0 && this.k[this.c[this.e][0][0]] <= 2 && this.k[this.k[this.c[this.e][0][0]]] > 0) {
                                    this.p[this.e] = 3;
                                    this.f = (byte)4;
                                    break block0;
                                }
                                if (this.a.m[0] >= this.a(this.k[this.c[this.e][0][0]], (int)this.d[8])) {
                                    if (this.k[this.c[this.e][0][0]] <= 17 && this.k[this.k[this.c[this.e][0][0]]] >= (this.k[2] == 1 ? 999 : 10) || this.k[this.c[this.e][0][0]] >= 18 && ((byte)this.e).length >= 30) {
                                        this.p[this.e] = 3;
                                        this.f = (byte)2;
                                        break block0;
                                    }
                                    if (this.k[this.c[this.e][0][0]] >= 8 && this.k[this.c[this.e][0][0]] <= 17) {
                                        this.p[this.e] = 1;
                                        this.f = 0;
                                        break block0;
                                    }
                                    this.a.m[1] = this.a(this.k[this.c[this.e][0][0]], (int)this.d[8]);
                                    this.p[this.e] = 2;
                                    this.f = 0;
                                    break block0;
                                }
                                this.p[this.e] = 3;
                                this.f = 1;
                                break block0;
                            }
                            if (this.f != 1 && this.f != 2) break;
                            this.d[8] = (p)true;
                            this.p[this.e] = 2;
                            this.f = 0;
                            break block0;
                        }
                        case 1: {
                            if (this.f != 0) break;
                            this.a.m[1] = this.a(this.k[this.c[this.e][0][0]], (int)this.d[8]);
                            this.p[this.e] = 2;
                            this.f = 0;
                            break block0;
                        }
                        case 2: {
                            if (this.a.m[0] < this.a(this.k[this.c[this.e][0][0]], (int)this.d[8])) {
                                this.p[this.e] = 3;
                                this.f = 1;
                                break block0;
                            }
                            this.a.m[0] = this.a.m[0] - this.a.m[1];
                            if (this.k[this.c[this.e][0][0]] >= 3 && this.k[this.c[this.e][0][0]] <= 7) {
                                int n6 = this.i;
                                int n7 = 11 + (this.k[this.c[this.e][0][0]] - 3);
                                n6[n7] = n6[n7] + true;
                                this.p[this.e] = 3;
                                this.f = (byte)3;
                            } else {
                                this.p[this.e] = 3;
                                this.f = 0;
                            }
                            this.b(this.k[this.c[this.e][0][0]], (int)this.d[8], 0);
                            if (this.k[this.c[this.e][0][0]] < 18 || this.k[this.c[this.e][0][0]] > 27) break;
                            this.f[this.d[12]] = this.a[this.a[this.d[12]][1]][0];
                            break block0;
                        }
                        case 3: {
                            if (this.f == 1) {
                                this.q(1);
                            }
                            this.f = 0;
                            this.p[this.e] = 0;
                        }
                    }
                    break;
                }
                case 28: {
                    switch (this.p[this.e]) {
                        case 0: {
                            this.d[8] = (p)true;
                            if (this.c[this.e][0][0] < this.l.length) {
                                if (this.k[this.l[this.c[this.e][0][0]]] == 1) {
                                    this.a.m[1] = this.a(0, this.m[this.c[this.e][0][0]], (int)this.d[8]);
                                    this.p[this.e] = 2;
                                    this.f = 0;
                                    break block0;
                                }
                                this.p[this.e] = 1;
                                this.f = 0;
                                break block0;
                            }
                            if (this.a.a != this.m[this.c[this.e][0][0]]) {
                                this.a.m[1] = this.a(1, this.m[this.c[this.e][0][0]], (int)this.d[8]);
                                this.p[this.e] = 2;
                                this.f = 0;
                                break block0;
                            }
                            this.p[this.e] = 3;
                            this.f = 1;
                            break block0;
                        }
                        case 1: {
                            if (this.f != 0) break block0;
                            this.a.m[1] = this.a(0, this.m[this.c[this.e][0][0]], (int)this.d[8]);
                            this.p[this.e] = 2;
                            break block0;
                        }
                        case 2: {
                            this.a.m[0] = this.a.m[0] + this.a.m[1];
                            if (this.c[this.e][0][0] < this.l.length) {
                                byte by = this.m[this.c[this.e][0][0]];
                                this.k[by] = this.k[by] - this.d[8];
                                if (this.k[this.m[this.c[this.e][0][0]]] == 0) {
                                    this.l = this.a(this.l, (int)this.m[this.c[this.e][0][0]], 0, 0);
                                }
                            } else {
                                this.e = (byte)this.a((byte[])this.e, (byte[][])this.a, 0, (int)this.m[this.c[this.e][0][0]]);
                                for (n2 = 18; n2 <= 27; ++n2) {
                                    this.k[n2] = 0;
                                }
                                for (n2 = 0; n2 < ((byte)this.e).length; ++n2) {
                                    int n8 = 18 + this.a[this.e[n2]][1];
                                    this.k[n8] = this.k[n8] + 1;
                                }
                            }
                            this.P();
                            if (this.c[this.e][0][0] >= this.m.length) {
                                this.c[this.e][0][0] = 0;
                                this.c[this.e][0][1] = 0;
                                this.c[this.e][0][2] = 0;
                            }
                            this.p[this.e] = 3;
                            this.f = 0;
                            break block0;
                        }
                        case 3: {
                            this.f = 0;
                            this.p[this.e] = 0;
                        }
                    }
                }
            }
        } else if (this.h(-7) == 1 || this.h(-11) == 1) {
            this.a(-7, 0);
            this.a(-11, 0);
            switch (this.p[this.e]) {
                case 0: {
                    if (this.f == 0) {
                        h.a(this.p, 7);
                        h.a(this.q, 0);
                        this.c(this.e[0][0], -1);
                        this.b = false;
                        break;
                    }
                    this.f = 0;
                    this.p[this.e] = 0;
                    break;
                }
                case 1: {
                    this.f = 0;
                    this.p[this.e] = 0;
                    break;
                }
                case 2: {
                    this.f = 0;
                    this.p[this.e] = 0;
                }
            }
        }
        if (this.h(48) == 1) {
            this.a(48, 0);
            switch (this.p[this.e]) {
                case 0: {
                    if (this.f != 0 || this.j[this.e] != 27 || this.f != 0) break;
                    this.q(1);
                }
            }
        }
    }

    public final int a(byte by, int n2) {
        Object object = false;
        if (by >= 3 && by <= 7) {
            int[] nArray = new int[]{200, 200, 100, 100, 1000};
            object = this.g[by] + this.i[by + 11 - 3] * nArray[by - 3];
        } else {
            object = this.g[by] * n2;
        }
        if (this.k[1] == 1) {
            object /= 2;
        }
        return (int)object;
    }

    public final int a(int n2, byte by, int n3) {
        Object object = 0;
        if (n2 == 0) {
            object = (this.g[by] >> 1) * n3;
        } else if (n2 == 1) {
            object = this.g[18 + this.a[by][1]] * this.a[by][2] / 12;
        }
        return object;
    }

    public final int b(int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        switch (k.a(n2)) {
            case 0: {
                n4 = 0;
                break;
            }
            case 6674541: {
                n4 = 1;
                break;
            }
            case 4044011: {
                n4 = 2;
                break;
            }
            case 11689977: {
                n4 = 3;
            }
        }
        switch (this.h[n2][0]) {
            case 2: {
                n5 = 40;
                break;
            }
            case 1: {
                n5 = 50;
                break;
            }
            case 0: {
                n5 = 60;
            }
        }
        return (n3 + n4) * n5 / 2;
    }

    private void i(int n2) {
        this.a[n2][0] = (Random)false;
        this.a[n2][1] = (Random)false;
        this.a[n2][2] = (Random)true;
        this.a[n2][3] = (Random)-1;
        this.a[n2][4] = (Random)-1;
        this.a[n2][5] = (Random)-1;
        this.a[n2][6] = (Random)-1;
        this.a[n2][7] = (Random)-1;
        this.a[n2][8] = (Random)-1;
        this.e[n2] = false;
    }

    private byte[] a(byte[] byArray, byte[][] byArray2, int n2, int n3) {
        byte[] byArray3 = null;
        if (n2 == 0) {
            int n4;
            byArray3 = new byte[byArray.length - 1];
            n2 = h.a((byte)n3, byArray);
            int n5 = byArray.length - 1;
            for (n4 = 0; n4 < byArray.length; ++n4) {
                if (byArray2[byArray[n4]][0] != 0) continue;
                n5 = n4;
                break;
            }
            for (n4 = 0; n4 < n2; ++n4) {
                byArray3[n4] = byArray[n4];
            }
            for (n4 = n2; n4 < n5; ++n4) {
                byArray3[n4] = byArray[n4 + 1];
            }
            this.i(n3);
        } else if (n2 == 1) {
            int n6;
            if (byArray.length >= this.a) {
                this.d[78] = (p)-1;
                return byArray;
            }
            for (n2 = 0; n2 < byArray2.length; ++n2) {
                if (byArray2[n2][0] != 0) continue;
                this.d[12] = (p)((short)n2);
                break;
            }
            byArray3 = new byte[byArray.length + 1];
            n2 = byArray.length;
            int n7 = byArray.length;
            for (n6 = 0; n6 < byArray.length; ++n6) {
                if (this.c(n3, 3) < this.c(byArray2[byArray[n6]][1], 3)) {
                    n2 = 0;
                    break;
                }
                if (byArray2[byArray[n6]][0] != 1 || n6 == byArray.length - 1 || this.c(n3, 3) < this.c(byArray2[byArray[n6]][1], 3) || this.c(n3, 3) >= this.c(byArray2[byArray[n6 + 1]][1], 3)) continue;
                n2 = n6 + 1;
                break;
            }
            for (n6 = 0; n6 < n2; ++n6) {
                byArray3[n6] = byArray[n6];
            }
            for (n6 = n7; n6 > n2; --n6) {
                byArray3[n6] = byArray[n6 - 1];
            }
            byArray3[n2] = (byte)this.d[12];
            this.i((int)this.d[12]);
            byArray2[this.d[12]][0] = 1;
            byArray2[this.d[12]][1] = (byte)n3;
            this.d[78] = this.d[12];
        }
        return byArray3;
    }

    private byte[] a(byte[] byArray, int n2, int n3, int n4) {
        byte[] byArray2 = null;
        int n5 = byArray.length;
        int n6 = byArray.length;
        if (n3 == 0) {
            byArray2 = new byte[byArray.length - 1];
            for (n3 = 0; n3 < byArray.length; ++n3) {
                if (byArray[n3] != n2) continue;
                n5 = n3;
                break;
            }
            if (n5 == byArray.length) {
                return byArray;
            }
            for (n3 = 0; n3 < n5; ++n3) {
                byArray2[n3] = byArray[n3];
            }
            for (n3 = n5; n3 < byArray2.length; ++n3) {
                byArray2[n3] = byArray[n3 + 1];
            }
        } else {
            byArray2 = new byte[byArray.length + 1];
            for (n3 = 0; n3 < byArray.length; ++n3) {
                if (n2 == byArray[n3]) {
                    return byArray;
                }
                if (this.c(n2, n4) < this.c(byArray[n3], n4)) {
                    n5 = n3;
                    break;
                }
                if (n3 == byArray.length - 1 && this.c(n2, n4) > this.c(byArray[n3], n4)) {
                    n5 = n3 + 1;
                    break;
                }
                if (this.c(n2, n4) <= this.c(byArray[n3], n4) || this.c(n2, n4) >= this.c(byArray[n3 + 1], n4)) continue;
                n5 = n3 + 1;
                break;
            }
            for (n3 = 0; n3 < n5; ++n3) {
                byArray2[n3] = byArray[n3];
            }
            for (n3 = n6; n3 > n5; --n3) {
                byArray2[n3] = byArray[n3 - 1];
            }
            byArray2[n5] = (byte)n2;
        }
        return byArray2;
    }

    private int[] a(int[] nArray, int n2, int n3, int n4) {
        int[] nArray2 = null;
        int n5 = nArray.length;
        int n6 = nArray.length;
        if (n3 == 0) {
            nArray2 = new int[nArray.length - 1];
            for (n3 = 0; n3 < nArray.length; ++n3) {
                if (nArray[n3] != n2) continue;
                n5 = n3;
                break;
            }
            if (n5 == nArray.length) {
                return nArray;
            }
            for (n3 = 0; n3 < n5; ++n3) {
                nArray2[n3] = nArray[n3];
            }
            for (n3 = n5; n3 < nArray2.length; ++n3) {
                nArray2[n3] = nArray[n3 + 1];
            }
        } else {
            nArray2 = new int[nArray.length + 1];
            for (n3 = 0; n3 < nArray.length; ++n3) {
                if (n2 == nArray[n3]) {
                    return nArray;
                }
                if (this.c(n2, n4) < this.c(nArray[n3], n4)) {
                    n5 = n3;
                    break;
                }
                if (n3 == nArray.length - 1 && this.c(n2, n4) > this.c(nArray[n3], n4)) {
                    n5 = n3 + 1;
                    break;
                }
                if (this.c(n2, n4) <= this.c(nArray[n3], n4) || this.c(n2, n4) >= this.c(nArray[n3 + 1], n4)) continue;
                n5 = n3 + 1;
                break;
            }
            for (n3 = 0; n3 < n5; ++n3) {
                nArray2[n3] = nArray[n3];
            }
            for (n3 = n6; n3 > n5; --n3) {
                nArray2[n3] = nArray[n3 - 1];
            }
            nArray2[n5] = n2;
        }
        return nArray2;
    }

    private void b(int n2, int n3, int n4) {
        if (n2 >= 0 && n2 <= 2) {
            this.f = (byte)this.a((byte[])this.f, n2, 1, 0);
            int n5 = n2;
            this.k[n5] = this.k[n5] + n3;
        }
        if (n2 >= 12 && n2 <= 17 || n2 == 8) {
            this.f = (byte)this.a((byte[])this.f, n2, 1, 0);
            this.l = this.a(this.l, n2, 1, 0);
            this.P();
            int n6 = n2;
            this.k[n6] = this.k[n6] + n3;
            if (this.k[n2] > (this.k[2] == 1 ? 999 : 10)) {
                int n7 = this.k[n2] = this.k[2] == 1 ? 999 : 10;
            }
        }
        if (n2 >= 18 && n2 <= 27) {
            this.e = (byte)this.a((byte[])this.e, (byte[][])this.a, 1, n2 - 18);
            for (n3 = 18; n3 <= 27; ++n3) {
                this.k[n3] = 0;
            }
            for (n3 = 0; n3 < ((byte)this.e).length; ++n3) {
                int n8 = 18 + this.a[this.e[n3]][1];
                this.k[n8] = this.k[n8] + 1;
            }
            if (this.y[this.a[this.d[12]][1]] == 0) {
                this.y[this.a[this.d[12]][1]] = 1;
            }
            if (this.c() >= 80) {
                this.k(111);
            }
            this.P();
        }
        if (n2 == 4) {
            this.a.b[0] = this.a.b[0] + 10;
        } else if (n2 == 5) {
            this.a.c[0] = this.a.c[0] + 5;
        } else if (n2 == 6) {
            this.a.a[1] = this.a.a[1] + 20;
        } else if (n2 == 7) {
            this.a.d[1] = this.a.d[1] + 10;
        } else if (n2 == 3) {
            for (n3 = h.k(this.a.f[0]); n3 > 0; n3 -= 9999) {
                if (n3 <= 9999) {
                    this.a(this.a, n3);
                    continue;
                }
                this.a(this.a, 9999);
            }
        } else if (n2 >= 9 && n2 <= 11) {
            int[] nArray = new int[]{1, 10, 100};
            this.a.m[1] = nArray[n2 - 9];
            if (this.a.m[1] > 9999) {
                this.a.m[1] = 9999;
            }
            this.a.m[0] = this.a.m[0] + this.a.m[1];
            this.C = this.a((p)this.a);
            this.a(this.a, 0, this.a.m[1], this.C[0] + (this.C[2] >> 1), this.C[1] + 10);
        }
        if (n2 >= 4 && n2 <= 17) {
            this.C = this.a((p)this.a);
            this.a(this.a, n2, this.C[0] + (this.C[2] >> 1), this.C[1] + 10);
        }
    }

    private int c(int n2, int n3) {
        int n4 = -1;
        switch (n3) {
            case 0: {
                Object object = new int[]{0, 1, 2, 28, 3, 4, 5, 6, 7, 8, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
                n4 = h.a(n2, (int[])object);
                break;
            }
            case 1: {
                int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
                n4 = h.a((int)((h)object).g[n2][3], nArray);
                break;
            }
            case 3: {
                Object object = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                n4 = h.a(n2, (int[])object);
            }
        }
        return n4;
    }

    public final int c() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.y.length; ++i2) {
            n2 += this.y[i2];
        }
        return n2 * 10;
    }

    public final int d() {
        int n2 = 0;
        for (int i2 = 0; i2 < ((int)this.i).length; ++i2) {
            n2 += this.i[i2][0];
        }
        return n2 * 100 / ((int)this.i).length;
    }

    public final int e() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.x.length; ++i2) {
            n2 += this.x[i2];
        }
        return n2;
    }

    public final int f() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            n2 += this.d[i2][0];
        }
        return n2 * 100 / this.d.length;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    private void j(int n2) {
        if (this.k[n2] > 0) {
            int n3 = 0;
            block8: do {
                switch (n3 == 0 ? n2 : n3) {
                    case 12: {
                        this.a.a[0] = this.a.a[0] + 100;
                        n3 = 17;
                        continue block8;
                    }
                    case 13: {
                        this.a.a[0] = this.a.a[0] + 300;
                        n3 = 17;
                        continue block8;
                    }
                    case 14: {
                        this.a.a[0] = this.a.a[0] + 600;
                        n3 = 17;
                        continue block8;
                    }
                    case 15: {
                        this.a.d[0] = this.a.d[0] + 200;
                        n3 = 17;
                        continue block8;
                    }
                    case 16: {
                        this.a.d[0] = this.a.d[1];
                        this.d[6] = (p)375;
                    }
                    case 17: {
                        int n4 = n2;
                        this.k[n4] = this.k[n4] - 1;
                        break;
                    }
                }
                break;
            } while (true);
            if (this.a.a[0] > this.a.a[1]) {
                this.a.a[0] = this.a.a[1];
            }
            if (this.a.d[0] > this.a.d[1]) {
                this.a.d[0] = this.a.d[1];
            }
            if (this.k[n2] == 0) {
                this.l = this.a(this.l, n2, 0, 0);
            }
        }
    }

    private void D() {
        this.d[13] = (p)((short)(this.x[0] + this.d[19]));
        this.d[14] = (p)((short)(this.x[1] + this.d[20] + 320));
    }

    private void a(int[] object, p p2) {
        if (object[8] > 0 && ((Random)this.a[object[0]]).length > 0 && ((Random)this.a[object[0]][object[1]]).length > 0) {
            int n2 = ((Random)this.a[object[0]][object[1]]).length - 1;
            object[3] = object[3] + 1;
            if (object[3] >= this.a[object[0]][object[1]][object[2]][0]) {
                object[2] = object[2] + 1;
                if (object[2] > n2 - 1) {
                    if (this.a[object[0]][object[1]][n2][0] > 0) {
                        object[4] = object[4] + 1;
                        if (object[4] >= this.a[object[0]][object[1]][n2][0]) {
                            object[4] = 0;
                            object[8] = 0;
                            if (object[10] >= 0) {
                                this.a((int[])object, object[10], object[5], object[6], object[7], object[0], 1, 1, -1, 0, 0);
                            }
                        }
                    } else {
                        object[2] = 0;
                    }
                }
                object[3] = 0;
            }
            if (this.a[object[0]][object[1]][object[2]][0] == false) {
                if (object[0] == 26) {
                    if (object[1] == 65) {
                        ((c)p2).a = (c[])true;
                    }
                } else if (object[0] == 27) {
                    if (object[1] == 9) {
                        this.d[47] = (p)true;
                        this.d[68] = (p)5;
                        this.Q();
                    }
                } else if (object[0] == 28) {
                    if (this.q[0] != 19 && this.d[58] == false && object[1] >= 56 && object[1] <= 58) {
                        this.j((int)this.d[69]);
                        this.d[79] = this.d[69];
                        this.d[61] = (p)false;
                        this.a(this.c, 7, 64, 0, 0, 1, 26, 1, 1, -1, 1, 1);
                    } else if (this.q[0] != 19 && this.d[58] == false && object[1] >= 63 && object[1] <= 64) {
                        this.j((int)this.d[75]);
                        this.d[79] = this.d[75];
                        this.d[76] = (p)false;
                        this.a(this.c, 7, 64, 0, 0, 1, 26, 1, 1, -1, 1, 1);
                    }
                } else if (object[0] == 39) {
                    if (object[1] == 0 && this.p[0] == 7) {
                        this.a = (Random)false;
                        this.b = false;
                        h.a(this.p, 7);
                        h.a(this.q, 0);
                        this.o(39);
                        this.n(39);
                        this.D();
                        this.a(this.c, 9, 0, (int)this.d[13], (int)this.d[14], 1, 39, 1, 0, -1, 2, 0);
                    }
                } else if (object[0] == 33) {
                    this.a(this.e, 2, 0, (int)this.d[13], (int)this.d[14], 1, 39, 1, 1, -1, 2, 1);
                }
            } else if (this.a[object[0]][object[1]][object[2]][0] == -1 && object[0] == 33) {
                this.d[73] = (p)true;
                this.a(this.e, 0, 0, (int)this.d[13], (int)this.d[14], 1, 33, 1, 0, -1, 2, 1);
                this.a(this.e, 1, 1, (int)this.d[13], (int)this.d[14], 1, 33, 1, 1, -1, 2, 0);
            }
            if (object[0] >= 44 && object[0] <= 49) {
                if (this.a[object[0]][object[1]][object[2]][0] == false) {
                    this.d[1] = (p)true;
                    return;
                }
                if (this.a[object[0]][object[1]][object[2]][0] == -1) {
                    if (object[0] == 44) {
                        this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                        return;
                    }
                } else if (this.a[object[0]][object[1]][object[2]][0] == -2) {
                    if (object[0] == 44) {
                        this.a(this.b, 1, 2, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                        return;
                    }
                } else {
                    if (this.a[object[0]][object[1]][object[2]][0] == -3) {
                        this.a(0, 8, 0);
                        return;
                    }
                    if (this.a[object[0]][object[1]][object[2]][0] == -4) {
                        this.a(1, 8, 0);
                        return;
                    }
                    if (this.a[object[0]][object[1]][object[2]][0] == -5) {
                        this.a(3, 4, 0);
                        return;
                    }
                    if (this.a[object[0]][object[1]][object[2]][0] == -6) {
                        if (object[0] == 44) {
                            h h2 = this;
                            object = h2;
                            h2.v[0] = 0;
                            this.i[10] = (short)h.c(6);
                            h.a(this.p, 32);
                            this.w[2] = 0;
                        } else if (object[0] == 46 || object[0] == 47 || object[0] == 48) {
                            h h3 = this;
                            object = h3;
                            h3.v[0] = 0;
                            int n3 = this.i;
                            n3[10] = n3[10] + true;
                            this.i[10] = this.i[10] >= this.h() ? false : this.i[10];
                            h.a(this.p, 36);
                            this.w[2] = 0;
                        } else if (object[0] == 45) {
                            this.q = (byte[])true;
                            this.p = (byte[])false;
                            h h4 = this;
                            object = h4;
                            h4.v[0] = 0;
                            int n4 = this.i;
                            n4[10] = n4[10] + true;
                            this.i[10] = this.i[10] >= this.h() ? false : this.i[10];
                            h.a(this.p, 36);
                            this.w[2] = 0;
                        } else if (object[0] == 49) {
                            this.A();
                        }
                        this.q[0] = 0;
                        return;
                    }
                    if (this.a[object[0]][object[1]][object[2]][0] == -7) {
                        this.d[99] = (p)true;
                        if (object[0] == 46) {
                            this.a(this.b, 1, 2, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 47) {
                            this.a(this.b, 1, 2, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 48) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 49) {
                            this.a(this.b, 1, 2, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                    } else if (this.a[object[0]][object[1]][object[2]][0] == -8) {
                        this.d[99] = (p)2;
                        if (object[0] == 46) {
                            this.a(this.b, 1, 3, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 47) {
                            this.a(this.b, 1, 3, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 48) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 49) {
                            this.a(this.b, 1, 3, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                    } else if (this.a[object[0]][object[1]][object[2]][0] == -9) {
                        this.d[99] = (p)3;
                        if (object[0] == 46) {
                            this.a(this.b, 1, 4, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 47) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 48) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 49) {
                            this.a(this.b, 1, 4, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                    } else if (this.a[object[0]][object[1]][object[2]][0] == -10) {
                        this.d[99] = (p)4;
                        if (object[0] == 46) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 48) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                        if (object[0] == 49) {
                            this.a(this.b, 1, 5, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                    } else if (this.a[object[0]][object[1]][object[2]][0] == -11) {
                        this.d[99] = (p)false;
                        if (object[0] == 49) {
                            this.a(this.b, 1, 1, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                    } else if (this.a[object[0]][object[1]][object[2]][0] == -12) {
                        this.d[99] = (p)5;
                        if (object[0] == 49) {
                            this.a(this.b, 1, 6, (int)this.d[13], (int)this.d[14], 1, object[0], 1, 1, -1, 2, 0);
                            return;
                        }
                    } else {
                        if (this.a[object[0]][object[1]][object[2]][0] == -13) {
                            this.d[70] = (p)h.a((short)this.d[70], 2, 2, 9);
                            int n5 = 120 + this.d[object[0]][this.a[object[0]][object[1]][object[2]][1]][0];
                            int n6 = -160 - this.d[object[0]][this.a[object[0]][object[1]][object[2]][1]][1];
                            this.D();
                            this.a(this.b, (int)this.d[70], 66 + h.c(3), (int)(this.d[13] + n5), (int)(this.d[14] + n6), 1, 26, 1, 1, -1, 0, 1);
                            this.a(this.b, (int)(this.d[70] + true), 69 + h.c(7), (int)(this.d[13] + n5), (int)(this.d[14] + n6), 1, 26, 1, 1, -1, 0, 1);
                            return;
                        }
                        if (this.a[object[0]][object[1]][object[2]][0] <= -40) {
                            this.q[0] = 0;
                            if (object[0] == 44) {
                                this.k(132 + (-40 - this.a[object[0]][object[1]][object[2]][0]));
                            } else if (object[0] == 45) {
                                this.k(139 + (-40 - this.a[object[0]][object[1]][object[2]][0]));
                            } else if (object[0] == 46) {
                                this.k(142 + (-40 - this.a[object[0]][object[1]][object[2]][0]));
                            } else if (object[0] == 47) {
                                this.k(147 + (-40 - this.a[object[0]][object[1]][object[2]][0]));
                            } else if (object[0] == 48) {
                                this.k(151 + (-40 - this.a[object[0]][object[1]][object[2]][0]));
                            }
                            this.k(159);
                        }
                    }
                }
            }
        }
    }

    private static int b(int n2, int n3, int n4, int n5) {
        boolean bl = n4 < n2;
        n2 = n4 - n2;
        n3 = n5 - n3;
        n2 = g.a((long)(n2 * n2 + n3 * n3));
        n2 = n3 * g.a(2, 16) / n2;
        if (!bl) {
            for (n3 = 0; n3 < 24; ++n3) {
                if (n2 == c[n3][1]) {
                    return n3;
                }
                if (n2 <= c[n3][1] || n2 >= c[n3 + 1][1]) continue;
                return n3;
            }
        } else {
            for (n3 = 6; n3 <= 18; ++n3) {
                if (n2 == c[n3][1]) {
                    return n3;
                }
                if (n2 >= c[n3][1] || n2 <= c[n3 + 1][1]) continue;
                return n3;
            }
        }
        return -1;
    }

    private static int[] a(int[] nArray) {
        int[] nArray2 = new int[]{0, 0};
        nArray2[0] = nArray[2] > 0 ? nArray[0] + h.c(nArray[2]) : nArray[0];
        nArray2[1] = nArray[3] > 0 ? nArray[1] - h.c(nArray[3]) : nArray[1];
        return nArray2;
    }

    private int[] a(int n2) {
        int[] nArray = new int[4];
        int[] nArray2 = nArray;
        nArray[2] = this.r[this.d[this.q][n2 << 2] << 1] * this.n;
        nArray2[3] = this.r[(this.d[this.q][n2 << 2] << 1) + true] * this.o;
        nArray2[0] = 0;
        nArray2[1] = nArray2[3];
        return nArray2;
    }

    private void E() {
        int n2;
        this.a = null;
        int[] nArray = new int[2000];
        int n3 = 1 + (nArray.length << 2);
        byte[] byArray = new byte[n3];
        Object object = new byte[4];
        n n4 = new n((String)this.b);
        if (n4.a() == 0) {
            byArray[0] = -1;
            n4.a(byArray, 0, byArray.length);
        } else {
            byArray = n4.a(1);
            if (byArray.length != n3) {
                byte[] byArray2 = new byte[n3];
                byArray = byArray2;
                byArray2[0] = -1;
                n4.a(1, byArray, 0, byArray.length);
            }
        }
        this.d[34] = (p)((short)byArray[0]);
        n4.a();
        int n5 = 1;
        for (n3 = 0; n3 < nArray.length; ++n3) {
            for (n2 = 0; n2 < ((byte[])object).length; ++n2) {
                object[n2] = byArray[n5++];
            }
            nArray[n3] = (int)g.a(object);
        }
        this.q = (byte[])nArray[0];
        this.p = (byte[])nArray[1];
        n3 = h.b(nArray, 2, (byte[][][][])this.a, 0);
        n3 = h.b(nArray, n3, (byte[][][][])this.a, 6);
        object = this.a;
        int n6 = n3;
        int[] nArray2 = nArray;
        for (n5 = 0; n5 < ((byte[])object).length; ++n5) {
            for (n2 = 0; n2 < ((byte)object[n5]).length; ++n2) {
                object[n5][n2] = (byte)nArray2[n6++];
            }
        }
        int n7 = n6;
        for (n5 = 0; n5 < ((byte)this.e).length; ++n5) {
            this.e[n5] = nArray[n7++];
        }
        for (n5 = 0; n5 < ((byte)this.f).length; ++n5) {
            this.f[n5] = nArray[n7++];
        }
        for (n5 = 0; n5 < ((int)this.i).length; ++n5) {
            this.i[n5] = nArray[n7++];
        }
        this.e = (byte)h.a(nArray, n7, (int)this.a);
        this.f = (byte)h.a(nArray, n7 += this.a, this.b ? 1 : 0);
        this.l = h.a(nArray, n7 += this.b, (int)this.d);
        this.k = h.a(nArray, n7 += this.d, (int)this.c);
        n7 += this.c;
        for (n5 = 0; n5 < this.k.length; ++n5) {
            this.k[n5] = nArray[n7++];
        }
        h.y[0] = nArray[n7++];
        h.y[1] = nArray[n7++];
        this.a = (r)this.a(0, (byte)1, y[0], y[1], 0, this.m, this.l, this.m, 1);
        i.a(this.a, y[0], y[1]);
        this.a.f[0] = nArray[n7++];
        this.a.b[0] = nArray[n7++];
        this.a.c[0] = nArray[n7++];
        this.a.a = (byte)nArray[n7++];
        this.a.b = (byte)nArray[n7++];
        this.a.f = (byte)nArray[n7++];
        this.a.a[1] = nArray[n7++];
        this.a.d[1] = nArray[n7++];
        this.a.e[0] = nArray[n7++];
        this.a.m[0] = nArray[n7++];
        this.x[0] = nArray[n7++];
        this.x[1] = nArray[n7++];
        this.a.e = (byte)nArray[n7++];
        n7 = h.a(nArray, n7, (byte[][][])this.e);
        n7 = h.b(nArray, n7, (byte[][][])this.d);
        object = this.b;
        n6 = n7;
        int[] nArray3 = nArray;
        n5 = n6;
        for (n2 = 0; n2 < ((byte[])object).length; ++n2) {
            if (((byte)object[n2]).length <= 0) continue;
            for (n6 = 0; n6 < ((byte)object[n2]).length; ++n6) {
                object[n2][n6] = (byte)nArray3[n5++];
            }
        }
        int n8 = n5;
        for (n5 = 0; n5 < ((byte)this.e).length; ++n5) {
            for (n2 = 0; n2 < ((void)this.e[n5]).length; ++n2) {
                this.e[n5][n2] = (byte)nArray[n8++];
            }
        }
        for (n5 = 70; n5 <= 115; ++n5) {
            this.g[n5][0] = (short[])((byte)nArray[n8++]);
        }
        for (n5 = 0; n5 < this.d.length; ++n5) {
            this.d[n5][0] = (p)((byte)nArray[n8++]);
        }
        for (n5 = 0; n5 < this.t.length; ++n5) {
            this.t[n5] = nArray[n8++];
        }
        for (n5 = 0; n5 < this.u.length; ++n5) {
            this.u[n5] = nArray[n8++];
        }
        for (n5 = 0; n5 < ((int)this.i).length; ++n5) {
            for (n2 = 0; n2 < ((void)this.i[n5]).length; ++n2) {
                this.i[n5][n2] = (byte)nArray[n8++];
            }
        }
        for (n5 = 0; n5 < this.x.length; ++n5) {
            this.x[n5] = (byte)nArray[n8++];
        }
        for (n5 = 0; n5 < this.y.length; ++n5) {
            this.y[n5] = (byte)nArray[n8++];
        }
        object = this.b;
        n6 = n8;
        int[] nArray4 = nArray;
        n5 = n6;
        for (n2 = 0; n2 < ((byte[])object).length; ++n2) {
            if (((byte)object[n2]).length <= 0) continue;
            for (n6 = 0; n6 < ((byte)object[n2]).length; ++n6) {
                if (((void)object[n2][n6]).length <= 0) continue;
                for (int i2 = 1; i2 < ((void)object[n2][n6]).length; ++i2) {
                    object[n2][n6][i2][3] = (byte)nArray4[n5++];
                }
            }
        }
        this.a.a[0] = this.a.a[1];
        this.a.d[0] = this.a.d[1];
        for (n5 = 0; n5 < ((byte)this.e).length; ++n5) {
            this.c[0][this.e[n5]] = this.c[0][this.c[this.a.f][n5]];
        }
        this.a.e[1] = h.k(this.a.f[0]);
    }

    private static byte[] a(int[] nArray, int n2, int n3) {
        int n4;
        byte[] byArray = new byte[n3];
        byte[] byArray2 = new byte[n3];
        for (n4 = 0; n4 < byArray2.length; ++n4) {
            byArray2[n4] = (byte)nArray[n2++];
            if (byArray2[n4] >= 0) continue;
            byArray = new byte[n4];
            break;
        }
        for (n4 = 0; n4 < byArray.length; ++n4) {
            byArray[n4] = byArray2[n4];
        }
        return byArray;
    }

    private static int a(int[] nArray, int n2, int n3, byte[] byArray) {
        for (int i2 = 0; i2 < n3; ++i2) {
            nArray[n2++] = i2 < byArray.length ? byArray[i2] : -1;
        }
        return n2;
    }

    private static int a(int[] nArray, int n2, byte[][][][] byArray, int n3) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2].length <= 0) continue;
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                for (int i4 = 1; i4 < byArray[i2][i3].length; ++i4) {
                    nArray[n2++] = byArray[i2][i3][i4][n3];
                }
            }
        }
        return n2;
    }

    private static int b(int[] nArray, int n2, byte[][][][] byArray, int n3) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2].length <= 0) continue;
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                for (int i4 = 1; i4 < byArray[i2][i3].length; ++i4) {
                    byArray[i2][i3][i4][n3] = (byte)nArray[n2++];
                }
            }
        }
        return n2;
    }

    private static int a(int[] nArray, int n2, byte[][][] byArray) {
        for (int i2 = 12; i2 <= 19; ++i2) {
            byArray[i2][1][0] = (byte)nArray[n2++];
        }
        return n2;
    }

    private static int a(int[] nArray, int n2, byte[][] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                nArray[n2++] = byArray[i2][i3];
            }
        }
        return n2;
    }

    private static int b(int[] nArray, int n2, byte[][][] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2].length <= 0) continue;
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                if (byArray[i2][i3].length <= 0) continue;
                for (int i4 = 0; i4 < byArray[i2][i3].length; ++i4) {
                    byArray[i2][i3][i4] = (byte)nArray[n2++];
                }
            }
        }
        return n2;
    }

    private static int a(int[] nArray, int n2, byte[][][][] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2].length <= 0) continue;
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                if (byArray[i2][i3].length <= 0) continue;
                for (int i4 = 1; i4 < byArray[i2][i3].length; ++i4) {
                    nArray[n2++] = byArray[i2][i3][i4][3];
                }
            }
        }
        return n2;
    }

    private void F() {
        if (this.c != null) {
            for (int i2 = 0; i2 < this.c.length; ++i2) {
                if (this.c[i2] == null || !this.c[i2].e) continue;
                if (this.c[i2].g == 0) {
                    this.a(this.c[i2]);
                }
                int[] nArray = this.a(this.c[i2]);
                int[] nArray2 = this.a((p)this.a);
                if (this.c[i2].g == 29) {
                    if (this.d[35] != false) continue;
                    if (h.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                        if (this.d[86] != false) continue;
                        this.Q();
                        this.x();
                        this.K();
                        this.b = true;
                        this.d[35] = (p)true;
                        h.a(this.q, 14);
                        this.d[86] = (p)true;
                        this.f = 0;
                        this.w[2] = 0;
                        continue;
                    }
                    this.d[86] = (p)false;
                    continue;
                }
                if (this.c[i2].g == 30) {
                    if (h.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                        if (this.i[16] == false) {
                            this.d[36] = (p)true;
                            this.d[37] = (p)true;
                            this.a(this.c[i2], 1, 0);
                            this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                            this.k(24);
                            continue;
                        }
                        if (this.i[23] == true) {
                            this.i[23] = false;
                            this.d[36] = (p)true;
                            this.d[37] = (p)true;
                            this.a(this.c[i2], 1, 0);
                            this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                            this.k(28);
                            continue;
                        }
                        if (this.d[36] != false) continue;
                        this.d[36] = (p)true;
                        this.d[37] = (p)true;
                        this.a(this.c[i2], 1, 0);
                        this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                        continue;
                    }
                    this.d[36] = (p)false;
                    this.d[37] = (p)false;
                    this.a(this.c[i2], 0, 0);
                    this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 0, -1, 1, 0);
                    continue;
                }
                if (this.c[i2].g != 42) continue;
                if (h.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                    if (this.i[19] == false) {
                        this.i[19] = true;
                        this.d[27] = (p)true;
                        this.d[28] = (p)true;
                        this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                        this.k(156);
                        this.a.b = (short)(this.a.b & 3);
                        continue;
                    }
                    if (this.i[24] == false && this.a[3][0][1][0] == true) {
                        this.i[24] = true;
                        this.d[27] = (p)true;
                        this.d[28] = (p)true;
                        this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                        this.k(25);
                        this.a.b = (short)(this.a.b & 3);
                        continue;
                    }
                    if (this.i[25] == false && this.a[11][0][1][0] == true) {
                        this.i[25] = true;
                        this.d[27] = (p)true;
                        this.d[28] = (p)true;
                        this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                        this.k(26);
                        this.a.b = (short)(this.a.b & 3);
                        continue;
                    }
                    if (this.d[27] != false) continue;
                    this.d[27] = (p)true;
                    this.d[28] = (p)true;
                    this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 1, -1, 1, 0);
                    continue;
                }
                this.d[27] = (p)false;
                this.d[28] = (p)false;
                this.a(this.c[i2], 0, 11, (int)this.a.m, this.a.n + this.B, 1, 32, 1, 0, -1, 1, 0);
            }
        }
    }

    private void G() {
        int n2;
        if (this.e != null && this.e.length > 0) {
            if (this.u == 1) {
                for (n2 = 0; n2 < this.e.length; ++n2) {
                    if (this.e[n2].m < this.x[0] || this.e[n2].m > this.x[0] + 240) continue;
                    this.a(this.e[n2]);
                    if (!this.e[n2].f) continue;
                    this.e[n2].m = this.n[n2 << 1] * 20 + h.c(20);
                    this.e[n2].h = true;
                    this.a(this.e[n2], 4, 1);
                }
            } else if (this.u == 2) {
                for (n2 = 0; n2 < this.e.length; ++n2) {
                    this.a(this.e[n2], this.e[n2].k[0], 0, 40, 15);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            if (this.u == 0) {
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    this.a(this.d[n2], 0, 0, 10, 10);
                }
                return;
            }
            if (this.u == 1) {
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    this.a(this.d[n2], -this.d[n2].k[0], this.d[n2].c[0] == 0 || this.d[n2].c[0] == 1 ? this.d[n2].k[0] * 3 : this.d[n2].k[0] << 1, 10, 10);
                }
                return;
            }
            if (this.u == 2 || this.u == 3 || this.u == 4) {
                for (n2 = 0; n2 < this.d.length; ++n2) {
                    this.a(this.d[n2], this.d[n2].k[0], this.u == 4 ? -2 : (this.u == 2 ? this.d[n2].k[1] : 2), 10, 10);
                }
            }
        }
    }

    private void a(p p2, int n2, int n3, int n4, int n5) {
        if (p2.g == 0) {
            p2.m += n2;
            p2.n += n3;
            if (p2.m <= this.x[0] - n4) {
                p2.m = this.x[0] + 240 + n4;
            } else if (p2.m >= this.x[0] + 240 + n4) {
                p2.m = this.x[0] - n4;
            } else if (p2.n >= this.x[1] + 260 + n5) {
                p2.n = this.x[1] - n5;
            } else if (p2.n <= this.x[1] - n5) {
                p2.n = this.x[1] + 260 + n5;
            }
            this.a(p2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void H() {
        if (this.h(53) == 1 || this.h(-6) == 1 || this.h(-5) == 1) {
            this.a(53, 0);
            this.a(-6, 0);
            this.a(-5, 0);
            switch (this.p[this.e]) {
                case 0: {
                    if (this.f != 0) return;
                    if (this.a[this.a.a][3 + (this.c[this.e][this.p[this.e]][1] << 1)] == false) {
                        this.p[this.e] = 1;
                        this.f = 0;
                        return;
                    }
                    if (this.a[this.a.a][3 + (this.c[this.e][this.p[this.e]][1] << 1)] > 0) {
                        this.p[this.e] = 3;
                        this.f = (byte)3;
                        return;
                    }
                    if (this.a[this.a.a][3 + (this.c[this.e][this.p[this.e]][1] << 1)] != -1) return;
                    this.p[this.e] = 3;
                    this.f = (byte)4;
                    return;
                }
                case 1: {
                    if (this.f == 0) {
                        if (this.d[this.g[this.c[this.e][this.p[this.e]][0]]][0] == true) {
                            this.a.m[1] = this.a((int)this.a.b, k.a(this.a.f), (int)this.g[this.c[this.e][this.p[this.e]][0]]);
                            if (this.a.m[0] >= this.a.m[1]) {
                                this.p[this.e] = 2;
                                this.f = 0;
                                return;
                            } else {
                                this.p[this.e] = 3;
                                this.f = 1;
                            }
                            return;
                        } else {
                            this.p[this.e] = 3;
                            this.f = (byte)5;
                        }
                        return;
                    }
                    if (this.f != 1) return;
                    this.c(this.e[0][0], -1);
                    this.b = false;
                    h.a(this.p, 7);
                    h.a(this.q, 0);
                    this.q[0] = 0;
                    return;
                }
                case 2: {
                    if (this.f == 0) {
                        this.a.m[0] = this.a.m[0] - this.a.m[1];
                        this.a[this.a.a][3 + (this.c[this.e][0][1] << 1)] = (Random)true;
                        this.a[this.a.a][3 + (this.c[this.e][0][1] << 1) + 1] = this.g[this.c[this.e][1][0]];
                        this.p[this.e] = 3;
                        this.f = 0;
                        return;
                    }
                    if (this.f != 1) return;
                    for (int i2 = 0; i2 < 3; ++i2) {
                        if (this.a[this.a.a][3 + (i2 << 1)] != true) continue;
                        this.a[this.a.a][3 + (i2 << 1)] = (Random)false;
                        this.a[this.a.a][3 + (i2 << 1) + 1] = (Random)-1;
                    }
                    this.p[this.e] = 3;
                    this.f = (byte)2;
                    return;
                }
                case 3: {
                    if (this.f == 0) {
                        if (this.d[32] == false) {
                            this.b = false;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.c(this.e[0][0], -1);
                            this.q[0] = 0;
                            return;
                        }
                        if (this.d[32] != true) return;
                        this.p[this.e] = 0;
                        this.f = 0;
                        return;
                    }
                    if (this.f == 1) {
                        this.q(1);
                    }
                    if (this.d[32] == false) {
                        this.p[this.e] = 1;
                        this.f = 0;
                        return;
                    }
                    if (this.d[32] != true) return;
                    this.p[this.e] = 0;
                    this.f = 0;
                }
                default: {
                    return;
                }
            }
        }
        if (this.h(-7) == 1 || this.h(-11) == 1) {
            this.a(-7, 0);
            this.a(-11, 0);
            switch (this.p[this.e]) {
                case 0: {
                    if (this.f == 0) {
                        this.b = false;
                        h.a(this.p, 7);
                        h.a(this.q, 0);
                        this.c(this.e[0][0], -1);
                        this.q[0] = 0;
                        return;
                    }
                    if (this.f != 1) return;
                    this.p[this.e] = 1;
                    this.f = 1;
                    return;
                }
                case 1: {
                    if (this.f != 0) return;
                    if (this.d[32] == false) {
                        this.p[this.e] = 1;
                        this.f = 1;
                        return;
                    }
                    if (this.d[32] != true) return;
                    this.p[this.e] = 0;
                    this.f = 0;
                    return;
                }
                case 2: {
                    if (this.f == 0) {
                        this.p[this.e] = 1;
                        this.f = 0;
                        return;
                    }
                    if (this.f != 1) return;
                    this.p[this.e] = 0;
                    this.f = 0;
                }
                default: {
                    return;
                }
            }
        }
        if (this.h(48) != 1) return;
        this.a(48, 0);
        switch (this.p[this.e]) {
            case 0: {
                if (this.f != 0) return;
                this.p[this.e] = 2;
                this.f = 1;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void I() {
        block34: {
            block36: {
                block35: {
                    if (this.q[0] <= 0) break block34;
                    if (this.h(53) != 1 && this.h(-5) != 1 && this.h(-6) != 1 && this.h(-7) != 1) break block35;
                    if (this.g[this.q[0]][1] != 9) {
                        this.a(53, 0);
                        this.a(-5, 0);
                        this.a(-6, 0);
                        this.a(-7, 0);
                    }
                    switch (this.g[this.q[0]][1]) {
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: {
                            this.d[43] = (p)((short)(this.d[43] + true));
                            if (this.d[43] >= ((Random)this.a[this.g[this.q[0]][1] - 2 + 4][this.g[this.q[0]][2]]).length) {
                                this.q[0] = 0;
                                this.d[43] = (p)false;
                                this.d[44] = (p)false;
                                break;
                            }
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 16: {
                            if (this.q[0] != 167) break;
                            ** GOTO lbl114
                        }
                        case 15: {
                            this.d[43] = (p)((short)(this.d[43] + true));
                            if (this.d[43] < ((Random)this.a[3][this.g[this.q[0]][2]]).length) {
                                this.d[47] = (p)false;
                                this.Q();
                                this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                                break;
                            }
                            ** GOTO lbl114
                        }
                        case 1: {
                            this.d[43] = (p)((short)(this.d[43] + true));
                            if (this.d[43] >= ((Random)this.a[2][this.g[this.q[0]][2]]).length) {
                                if (this.q[0] == 31) {
                                    this.a = (Random)true;
                                    this.q[0] = 0;
                                    this.b = false;
                                    this.a(this.a[this.d[48]], 2, 1);
                                    break;
                                }
                                if (this.q[0] == 24 || this.q[0] == 27 || this.q[0] == 28) {
                                    if (this.i[16] == false) {
                                        this.i[16] = true;
                                    }
                                    this.q[0] = 0;
                                    this.d[43] = (p)false;
                                    this.d[44] = (p)false;
                                    this.J();
                                    break;
                                }
                                if (this.q[0] == 29) {
                                    this.q[0] = 0;
                                    this.d[43] = (p)false;
                                    this.d[44] = (p)false;
                                    this.x();
                                    this.Q();
                                    this.N();
                                    this.x();
                                    this.Q();
                                    this.a.b();
                                    this.d[32] = (p)true;
                                    this.b = true;
                                    h.a(this.p, 4);
                                    h.a(this.q, 28);
                                    break;
                                }
                                if (this.q[0] == 39) {
                                    this.b = false;
                                    h.a(this.p, 7);
                                    h.a(this.q, 0);
                                    this.q[0] = 0;
                                    this.d[43] = (p)false;
                                    this.d[44] = (p)false;
                                    h.a((byte[])this.a[0].a, 6);
                                    break;
                                }
                                if (this.q[0] == 156) {
                                    this.q[0] = 0;
                                    this.d[43] = (p)false;
                                    this.d[44] = (p)false;
                                    this.b = false;
                                    h.a(this.p, 7);
                                    h.a(this.q, 0);
                                    this.a(true, 220, 0, 1, 1);
                                    break;
                                }
                                if (this.q[0] == 157) {
                                    this.q[0] = 0;
                                    this.d[43] = (p)false;
                                    this.d[44] = (p)false;
                                    this.b = false;
                                    h.a(this.p, 7);
                                    h.a(this.q, 0);
                                    this.d[97] = (p)true;
                                    break;
                                }
                                if (this.q[0] == 158) {
                                    this.d[47] = (p)false;
                                    this.d[44] = (p)false;
                                    this.q[0] = 0;
                                    this.w();
                                    break;
                                }
                                this.b = false;
                                h.a(this.p, 7);
                                h.a(this.q, 0);
                                this.q[0] = 0;
                                this.d[43] = (p)false;
                                this.d[44] = (p)false;
                                break;
                            }
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 8: {
                            this.d[43] = (p)((short)(this.d[43] + true));
                            if (this.d[43] < ((Random)this.a[0][0][this.g[this.q[0]][2]]).length) break;
                            if (this.q[0] >= 1 && this.q[0] <= 11) {
                                this.k(this.q[0] + 11);
                            }
                            if (this.q[0] == 161) {
                                this.q(1);
                            }
lbl114:
                            // 5 sources

                            this.q[0] = 0;
                            this.d[43] = (p)false;
                            this.d[44] = (p)false;
                            this.b = false;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                        }
                    }
                }
                if (this.h(-6) != 1 && this.h(-5) != 1 && this.h(53) != 1) break block36;
                if (this.g[this.q[0]][1] == 9) {
                    this.a(-6, 0);
                    this.a(-5, 0);
                    this.a(53, 0);
                }
                switch (this.g[this.q[0]][1]) {
                    case 9: {
                        if (this.q[0] != 128 && this.q[0] != 129 && this.q[0] != 160) ** GOTO lbl158
                        if (this.s[0] == 2 && this.i[26] == false) {
                            this.i[26] = true;
                            this.q[0] = 0;
                            this.d[47] = (p)false;
                            this.d[44] = (p)false;
                            this.b = false;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.a(true, 100, 0, 3, 1);
                        } else if (this.s[0] == 6 || this.s[0] == 14 || this.s[0] == 19) {
                            if (this.a.m[0] >= this.a.m[1]) {
                                this.a.m[0] = this.a.m[0] - this.a.m[1];
                                this.d[47] = (p)false;
                                this.d[44] = (p)false;
                                this.d[51] = (p)3750;
                                this.q[0] = 0;
                                this.w();
                            } else {
                                this.q[0] = 0;
                                this.d[47] = (p)false;
                                this.d[44] = (p)false;
                                this.k(161);
                            }
                        } else {
                            this.d[47] = (p)false;
                            this.d[44] = (p)false;
                            this.q[0] = 0;
                            this.w();
                        }
                        break block34;
lbl158:
                        // 1 sources

                        if (this.q[0] >= 116 && this.q[0] <= 125) {
                            this.m((int)this.d[12]);
                            this.d[44] = (p)false;
                            this.d[47] = (p)false;
                            this.q[0] = 0;
                            this.b = false;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                        }
                    }
                    default: {
                        return;
                    }
                }
            }
            if (this.h(-7) == 1) {
                this.a(-7, 0);
                if (this.g[this.q[0]][1] == 9) {
                    this.d[44] = (p)false;
                    this.d[47] = (p)false;
                    this.q[0] = 0;
                    this.b = false;
                    h.a(this.p, 7);
                    h.a(this.q, 0);
                }
            }
        }
    }

    private void J() {
        int n2;
        this.b = true;
        h.a(this.p, 4);
        h.a(this.q, 12);
        h h2 = this;
        h2.v[0] = 0;
        this.P();
        this.x();
        this.Q();
        this.N();
        if (this.d[52] == false && this.k[2] == 0 && h.a((byte)2, this.k) >= 0) {
            this.d[52] = (p)true;
            this.c[0][0][0] = (byte)h.a((byte)2, this.k);
            this.c[0][0][2] = 0;
            this.c[0][0][1] = (byte)(this.c[0][0][0] - this.c[0][0][2]);
            this.a.m[1] = this.a((byte)2, 1);
            this.p[this.e] = 0;
            this.f = 1;
        }
        for (n2 = 18; n2 <= 27; ++n2) {
            this.k[n2] = 0;
        }
        for (n2 = 0; n2 < ((byte)this.e).length; ++n2) {
            int n3 = 18 + this.a[this.e[n2]][1];
            this.k[n3] = this.k[n3] + 1;
        }
    }

    private void k(int n2) {
        block3: {
            block4: {
                block5: {
                    if (this.g[n2][0] == false) break block3;
                    if ((n2 < 70 || n2 > 87) && (n2 < 94 || n2 > 115)) break block4;
                    if (n2 < 70 || n2 > 87) break block5;
                    if (this.d[n2 - 70][0] != false) break block3;
                    this.d[n2 - 70][0] = (p)true;
                    break block4;
                }
                if (n2 >= 94 && n2 <= 115 && this.i[n2 - 94][1] == false) {
                    this.i[n2 - 94][1] = true;
                    this.j = this.a(this.j, n2, 1, 1);
                    if (this.a != null && this.a.length > 0) {
                        for (int i2 = 0; i2 < this.a.length; ++i2) {
                            if (this.a[i2].c != n2 - 94 || this.a[i2].c[0] != 0) continue;
                            this.a(this.a[i2], 1, 0);
                        }
                        return;
                    }
                }
                break block3;
            }
            this.j = this.a(this.j, n2, 1, 1);
        }
    }

    private void K() {
        if (this.q[0] > 0 && (this.g[this.q[0]][1] == false || this.g[this.q[0]][1] == 7)) {
            this.q[0] = 0;
            this.d[38] = (p)false;
            this.a(this.c, 5, 0, (int)this.a.m, this.a.n, 1, 32, 1, 0, -1, 1, 0);
        }
    }

    private void L() {
        if (this.q[0] > 0) {
            switch (this.g[this.q[0]][1]) {
                case 0: {
                    if (this.p[0] != 7 || this.d[38] <= 0) break;
                    this.d[38] = (p)((short)(this.d[38] - true));
                    if (this.d[38] > 0) break;
                    this.q[0] = 0;
                    this.a(this.c, 5, 0, (int)this.a.m, this.a.n, 1, 32, 1, 0, -1, 1, 0);
                    break;
                }
                case 1: {
                    break;
                }
                case 7: {
                    if (this.p[0] != 7 || this.d[38] <= 0) break;
                    this.d[38] = (p)((short)(this.d[38] - true));
                    if (this.d[38] > 0) break;
                    this.q[0] = 0;
                }
            }
        }
        if ((this.p[0] < 32 || this.p[0] > 42) && (this.q[0] == 0 || this.q[0] > 0 && this.g[this.q[0]][3] >= 57)) {
            if (this.j != null && this.j.length > 0) {
                h h2 = this;
                while (h2.j.length > 0 && h2.g[h2.j[0]][0] == false) {
                    h2.j = h2.a(h2.j, h2.j[0], 0, 0);
                }
                if (h2.j.length > 0) {
                    if (this.p[0] != 27) {
                        h2 = this;
                        h2.v[0] = 0;
                    }
                    if (this.g[this.j[0]][0] > 0) {
                        short[][] sArray = this.g[this.j[0]];
                        sArray[0] = (short[])((byte)(sArray[0] - true));
                    }
                    switch (this.g[this.j[0]][1]) {
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: {
                            this.d[44] = (p)true;
                            this.d[43] = (p)false;
                            this.d[40] = (p)((short)((((String)((Object)this.a[this.g[this.j[0]][1] - 2 + 4][this.g[this.j[0]][2]][this.d[43]][0])).length() + 1) / (220 / g.a((Font)a[0]))));
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 16: {
                            this.b = true;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.d[44] = (p)true;
                            this.d[43] = (p)false;
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 15: {
                            this.b = true;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.d[44] = (p)true;
                            this.d[43] = (p)false;
                            this.d[40] = (p)((short)((((String)((Object)this.a[3][this.g[this.j[0]][2]][this.d[43]][0])).length() + 1) / (220 / g.a((Font)a[0]))));
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 1: {
                            this.b = true;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.d[44] = (p)true;
                            this.d[43] = (p)false;
                            this.d[40] = (p)((short)((((String)((Object)this.a[2][this.g[this.j[0]][2]][this.d[43]][0])).length() + 1) / (220 / g.a((Font)a[0]))));
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 8: {
                            this.b = true;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.d[44] = (p)true;
                            this.d[43] = (p)false;
                            this.d[40] = (p)true;
                            this.d[47] = (p)false;
                            this.Q();
                            this.a(this.a, 9, 9, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 1);
                            break;
                        }
                        case 0: {
                            this.d[40] = (p)true;
                            this.d[38] = (p)100;
                            this.a(this.c, 5, this.j[0] - 12, (int)this.a.m, this.a.n, 1, 32, 1, 1, -1, 1, 0);
                            break;
                        }
                        case 9: {
                            this.b = true;
                            h.a(this.p, 7);
                            h.a(this.q, 0);
                            this.d[47] = (p)true;
                            this.d[44] = (p)true;
                            break;
                        }
                        case 7: {
                            this.d[40] = (p)true;
                            this.d[38] = (p)20;
                            break;
                        }
                        case 11: {
                            this.x();
                            this.b = true;
                            h.a(this.p, 7);
                            h.a(this.q, 22);
                            break;
                        }
                        case 12: {
                            this.Q();
                            this.x();
                            this.b = true;
                            h.a(this.q, 23);
                            break;
                        }
                        case 13: {
                            this.Q();
                            this.x();
                            this.b = true;
                            h.a(this.q, 24);
                        }
                    }
                    this.r();
                    this.q[0] = this.j[0];
                    this.j = this.a(this.j, this.j[0], 0, 0);
                    this.Q();
                    return;
                }
            } else if (this.p[0] == 7 && this.d[22] >= 0 && this.a[this.q][this.d[22]][1][1] == 15 && this.a[this.q][this.d[22]][1][6] == true && this.i[20] == false) {
                this.d[16] = (p)46;
                h.a(this.p, 37);
                this.w[2] = 0;
                this.i[20] = true;
                if (this.c != null && this.c.length > 0) {
                    for (int i2 = 0; i2 < this.c.length; ++i2) {
                        if (this.c[i2] == null || this.c[i2].g != 41 || this.c[i2].e) continue;
                        this.c[i2].e = true;
                    }
                    return;
                }
            } else if (this.p[0] == 7 && this.d[22] >= 0 && this.a[this.q][this.d[22]][1][1] == 18 && this.a[this.q][this.d[22]][1][6] == true && this.i[21] == false) {
                this.d[16] = (p)47;
                h.a(this.p, 37);
                this.w[2] = 0;
                this.i[21] = true;
            }
        }
    }

    private i[] a(int n2, byte[][][] byArray) {
        i[] iArray = null;
        if (byArray != null && byArray.length > 0) {
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                if (byArray[i2][0][0] != n2) continue;
                iArray = new i[byArray[i2].length - 1];
                int n3 = 0;
                for (n2 = 1; n2 < byArray[i2].length; ++n2) {
                    iArray[n3] = new i();
                    iArray[n3].a = (byte[])new int[1][12];
                    iArray[n3].i = (int[])byArray[i2][n2][2];
                    iArray[n3].g = (int[])28;
                    this.a((p)iArray[n3], (int)this.t[iArray[n3].i], 0);
                    i.a(iArray[n3], byArray[i2][n2][0] * this.j, byArray[i2][n2][1] * this.k);
                    iArray[n3].g = (int[])true;
                    iArray[n3].b[0] = this.a[iArray[n3].g][iArray[n3].c[0]][iArray[n3].k][1];
                    this.a(iArray[n3], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                    iArray[n3].a((byte[][][])this.b, 0, 4, 0);
                    ++n3;
                }
                break;
            }
        }
        return iArray;
    }

    private void a(i i2, int n2) {
        int n3 = 0;
        this.C = this.a((p)i2);
        if (i2.g >= true && i2.g <= 11) {
            if (n2 == 0) {
                byte[] byArray = new byte[]{0, 0, 0};
                byte[] byArray2 = byArray;
                byArray[0] = this.e[i2.g][1][0] == false ? this.e[i2.g][2][0] : (byte)(this.e[i2.g][2][0] + this.e[i2.g][2][1] * this.q);
                byArray2[1] = this.e[i2.g][1][1] == false ? this.e[i2.g][2][2] : (byte)(this.e[i2.g][2][2] * this.q);
                byArray2[2] = (byte)(100 - (byArray2[0] + byArray2[1]));
                for (int i3 = 0; i3 < i2.a.length; ++i3) {
                    i2.a[i3] = new i[1 + this.s[5] / 100 + (this.s[5] % 100 == 0 ? 0 : (h.c(2) == 0 ? 0 : 1))];
                    for (int i4 = 0; i4 < i2.a[i3].length; ++i4) {
                        i2.a[i3][i4] = new i();
                        n3 = h.a(byArray2);
                        if (n3 >= 0 && n3 <= 1) {
                            this.a((int)i2.g, i2.a[i3][i4], n3, n2);
                            continue;
                        }
                        i2.a[i3][i4] = null;
                    }
                }
                i2.d = false;
                this.d[89] = (p)h.a((short)this.d[89], 2, 22, 28);
                this.a(this.d, (int)this.d[89], 66 + h.c(3), this.C[0] + (this.C[2] >> 1), this.C[1] - (this.C[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                this.a(this.d, (int)(this.d[89] + true), 69 + h.c(7), this.C[0] + (this.C[2] >> 1), this.C[1] - (this.C[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                return;
            }
        } else if (i2.g >= 12 && i2.g <= 19) {
            if (n2 == 0) {
                byte[] byArray = new byte[]{0, 0, 0, 0, 0};
                byte[] byArray3 = byArray;
                byArray[0] = (byte)(this.e[i2.g][2][0] + this.e[i2.g][1][0] * 3);
                byArray3[1] = (byte)(60 - byArray3[0]);
                byArray3[2] = this.e[i2.g][2][2];
                byArray3[3] = this.e[i2.g][2][3];
                byArray3[4] = this.e[i2.g][2][4];
                for (int i5 = 0; i5 < i2.a.length; ++i5) {
                    if (i5 != this.d[45]) continue;
                    i2.a[i5] = new i[1 + this.s[5] / 100 + (this.s[5] % 100 == 0 ? 0 : (h.c(2) == 0 ? 0 : 1))];
                    for (int i6 = 0; i6 < i2.a[i5].length; ++i6) {
                        i2.a[i5][i6] = new i();
                        n3 = h.a(byArray3);
                        if (this.e[i2.g][0][n3] >= 18 && this.e[i2.g][0][n3] <= 27) {
                            if (this.c) {
                                n3 = 1;
                            } else {
                                this.c = true;
                            }
                        }
                        this.a((int)i2.g, i2.a[i5][i6], n3, n2);
                        if (i2.a[i5][i6].i < 18 || i2.a[i5][i6].i > 27) continue;
                        this.d[54] = (p)true;
                    }
                }
                this.d[45] = (p)((short)(this.d[45] + true));
                this.d[89] = (p)h.a((short)this.d[89], 2, 22, 28);
                this.a(this.d, (int)this.d[89], 66 + h.c(3), this.C[0] + (this.C[2] >> 1), this.C[1] - (this.C[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                this.a(this.d, (int)(this.d[89] + true), 69 + h.c(7), this.C[0] + (this.C[2] >> 1), this.C[1] - (this.C[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                return;
            }
            if (n2 == 1) {
                i2.a[0] = new i[10];
                for (int i7 = 0; i7 < i2.a[0].length; ++i7) {
                    i2.a[0][i7] = new i();
                    n3 = h.c(3) + 9;
                    this.a((int)i2.g, i2.a[0][i7], n3, n2);
                }
            }
        }
    }

    private void a(int n2, i i2, int n3, int n4) {
        i2.a = (byte[])new int[1][12];
        i2.g = (int[])28;
        if (n4 == 0) {
            i2.i = this.e[n2][0][n3];
        } else if (n4 == 1) {
            i2.i = (int[])n3;
        }
        this.a((p)i2, (int)this.t[i2.i], 0);
        i.a(i2, this.C[0] + (this.C[2] >> 1), this.C[1] - (this.C[3] >> 1));
        i2.b[0] = this.a[i2.g][i2.c[0]][i2.k][1];
        i2.g = (int[])true;
        i2.a((byte[][][])this.b, 3, h.c(((void)this.b[3]).length), 0);
        i2.k[0] = h.b(11);
        i2.b = (short)(i2.b & 3);
        i2.b = (short)(i2.b | 8);
        i2.a[4] = true;
        i2.b = (short)(i2.b & 0xC);
        i2.b = (short)((i2.b ? 1 : 0) | 1);
        i2.j[0] = 10;
        i2.j[2] = this.n * this.r[this.d[this.q][this.p << 2] << 1] - 20;
        this.a(i2, 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
    }

    private void l(int n2) {
        this.b(n2, 1, 0);
        if (this.q[0] == 0) {
            if (n2 >= 4 && n2 <= 7) {
                this.k(88 + (n2 - 4));
            } else if (n2 >= 18 && n2 <= 27) {
                if (this.d[this.a[this.q][this.d[22]][1][16]] > 8) {
                    this.d[this.a[this.q][this.d[22]][1][16]] = (p)8;
                }
                this.f[this.d[12]] = this.a[this.a[this.d[12]][1]][0] * (80 + 5 * this.d[this.a[this.q][this.d[22]][1][16]]) / 100;
                Random random = this.a[this.q][this.d[22]][1][16];
                this.d[random] = (p)((short)(this.d[random] + true));
                this.k(116 + (n2 - 18));
            }
            if (n2 == 21) {
                this.k(102);
                return;
            }
            if (n2 == 23) {
                this.k(104);
                return;
            }
            if (n2 == 25) {
                this.k(109);
            }
        }
    }

    private void a(i[] iArray) {
        if (iArray != null) {
            for (int i2 = 0; i2 < iArray.length; ++i2) {
                if (iArray[i2] == null) continue;
                if (iArray[i2].g == false) {
                    this.a((p)iArray[i2]);
                }
                this.a((int[])iArray[i2].a[0], (p)iArray[i2]);
                if (this.b) continue;
                this.a(iArray[i2]);
            }
        }
    }

    private static int[] a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int[] nArray = new int[4];
        int[] nArray2 = nArray;
        nArray[0] = n2 > n6 ? n2 : n6;
        nArray2[1] = n3 < n7 ? n3 : n7;
        n2 = n2 + n4 < n6 + n8 ? n2 + n4 : n6 + n8;
        n3 = n3 - n5 > n7 - n9 ? n3 - n5 : n7 - n9;
        nArray2[2] = n2 - nArray2[0];
        nArray2[3] = nArray2[1] - n3;
        return nArray2;
    }

    private void m(int n2) {
        if (this.a.a[this.a.f][0][0] == 1) {
            this.a.a[this.a.f][0][0] = 0;
            byte by = this.a.f;
            this.a.b[by] = (byte)(this.a.b[by] - 1);
            this.a(55, 0);
            this.a(57, 0);
        }
        this.a.a = (byte)n2;
        this.a.b = (byte)this.a[this.a.a][2];
        this.a.f = (byte)this.a[this.a.a][1];
        for (n2 = 0; n2 < ((byte)this.e).length; ++n2) {
            this.c[0][this.e[n2]] = this.c[0][this.c[this.a.f][n2]];
        }
    }

    private void c(int n2, int n3) {
        if (n3 != 0) {
            this.N();
            int n4 = n2;
            h h2 = this;
            for (int i2 = 0; i2 < h2.a.length; ++i2) {
                h2.a[i2] = null;
            }
            h2.a[n4] = q.a("/data/music/music_" + n4 + ".mid", 1);
            this.e[1][0] = this.e[0][0];
            this.e[1][1] = this.e[0][1];
            this.e[1][2] = this.e[0][2];
            this.e[0][0] = n2;
            this.e[0][1] = n3;
            this.e[0][2] = 1;
            q.a(this.a[n2], 1, 1, n3, 1);
            if (n3 == -1) {
                this.C = n2;
            }
        }
    }

    private void M() {
        int n2 = 0;
        switch (this.u) {
            case 0: {
                n2 = 0;
                break;
            }
            case 1: {
                n2 = 1;
                break;
            }
            case 2: {
                n2 = 2;
                break;
            }
            case 3: {
                n2 = 3;
                break;
            }
            case 4: {
                n2 = 4;
                break;
            }
            case 5: {
                n2 = 4;
            }
        }
        this.c(n2, -1);
    }

    private void N() {
        this.C = -1;
        this.O();
    }

    private void O() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.e[0][0] != i2) continue;
            q.a(this.a[i2], 1);
            this.e[1][2] = this.e[0][2];
            this.e[0][2] = 0;
            this.a[i2] = null;
        }
    }

    private void n(int n2) {
        if (((void)this.b[n2]).length != 0) {
            this.b[n2] = new short[0][];
            this.b[n2] = new short[0][][];
            this.c[n2] = (byte[][])new short[0][];
            this.d[n2] = new short[0][];
            this.a[n2] = new short[0][][];
        }
    }

    private void o(int n2) {
        if (this.c[n2] != null && this.c[n2].length > 0) {
            for (int i2 = 0; i2 < this.c[n2].length; ++i2) {
                if (this.c[n2][i2] == null) continue;
                this.c[n2][i2] = null;
            }
        }
    }

    private void p(int n2) {
        if (this.b[n2].length > 0) {
            for (int i2 = 0; i2 < this.b[n2].length; ++i2) {
                if (this.b[n2][i2] == null) continue;
                this.b[n2][i2] = null;
            }
        }
    }

    private void a(int n2, i i2, i i3) {
        int n3 = 0;
        int n4 = 0;
        Object object = 0;
        Object object2 = 0;
        int n5 = 0;
        int[] nArray = i2.g;
        int[] nArray2 = i3.g;
        Object var11_11 = null;
        short[] sArray = null;
        int n6 = 0;
        boolean n7 = false;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        Object object3 = null;
        if (n2 == 0) {
            object3 = this.c;
            n5 = 0;
        } else if (n2 == 1) {
            object3 = this.d;
            n5 = 1;
        } else if (n2 == 2) {
            object3 = this.d;
            n5 = 2;
        } else if (n2 == 3 || n2 == 4) {
            object3 = this.d;
        } else if (n2 == 5) {
            object3 = this.d;
            n5 = 3;
        }
        switch (n2) {
            case 0: 
            case 1: 
            case 5: {
                object = object3[nArray][i2.b[0]][2] - object3[nArray][i2.b[0]][0];
                object2 = object3[nArray][i2.b[0]][3] - object3[nArray][i2.b[0]][1];
                n3 = i2.m + (i2.e == true ? object3[nArray][i2.b[0]][0] : -object3[nArray][i2.b[0]][2]);
                n4 = i2.n - object3[nArray][i2.b[0]][1];
                if (this.a(i2, i3, (int)nArray, (int)nArray2, n3, n4, (int)object, (int)object2, n5) != 1000 || nArray != false || this.a.b >= 4) break;
                byte by = this.e;
                byte by2 = this.a.a;
                by[by2] = by[by2] + true;
                return;
            }
            case 2: {
                for (n2 = 0; n2 < i2.a.length; ++n2) {
                    if (i2.a[n2] == null) continue;
                    for (int i4 = 0; i4 < i2.a[n2].length; ++i4) {
                        Random random;
                        short[] sArray2 = i2.a[n2][i4];
                        if (sArray2[0] != 1) continue;
                        if (i2.g >= true && i2.g <= 21 && nArray2 == false && sArray2[15] == 1) {
                            for (int i5 = 0; i5 < this.a.length; ++i5) {
                                if (this.a[i5] == null) continue;
                                this.a(2, i2, this.a[i5]);
                            }
                            continue;
                        }
                        n3 = sArray2[3] + (sArray2[5] == 1 ? this.d[sArray2[11]][random][0] : -this.d[sArray2[11]][random][2]);
                        if (this.a(i2, i3, (int)nArray, (int)nArray2, n3, n4 = sArray2[4] - this.d[sArray2[11]][random = this.a[sArray2[11]][sArray2[7]][sArray2[6]][1]][1], (int)(object = (Object)(this.d[sArray2[11]][random][2] - this.d[sArray2[11]][random][0])), (int)(object2 = (Object)(this.d[sArray2[11]][random][3] - this.d[sArray2[11]][random][1])), n5) != 1000) continue;
                        if (i2.g == false && this.h[n2][12] / 3 == false && sArray2[7] == 34 && sArray2[12] > -1) {
                            sArray2[6] = 0;
                            sArray2[7] = sArray2[13];
                            this.a[sArray2[11]][sArray2[7]][((Random)this.a[sArray2[11]][sArray2[7]]).length - 1][0] = (Random)sArray2[14];
                            sArray2[13] = i.b[i2.h][sArray2[12]][9];
                            sArray2[14] = i.b[i2.h][sArray2[12]][10];
                            sArray2[12] = i.b[i2.h][sArray2[12]][8];
                            continue;
                        }
                        if ((i2.h != 12 || n2 != 0) && i2.h != 14 && i2.h != 15) continue;
                        sArray2[0] = 0;
                        int n8 = n2;
                        i2.b[n8] = (byte)(i2.b[n8] - 1);
                    }
                }
                return;
            }
            case 3: {
                for (n2 = 0; n2 < i3.a.length; ++n2) {
                    if (i3.a[n2] == null) continue;
                    for (int i6 = 0; i6 < i3.a[n2].length; ++i6) {
                        reference var15_26;
                        reference var14_23;
                        int n9;
                        Random random;
                        sArray = i3.a[n2][i6];
                        if (sArray[0] != 1 || (i3.h != 12 || n2 != 0) && i3.h != 14 && i3.h != 15 || h.a(n3 = i2.m + (i2.e == true ? object3[nArray][i2.b[0]][0] : -object3[nArray][i2.b[0]][2]), n4 = i2.n - object3[nArray][i2.b[0]][1], object = object3[nArray][i2.b[0]][2] - object3[nArray][i2.b[0]][0], object2 = object3[nArray][i2.b[0]][3] - object3[nArray][i2.b[0]][1], n6 = sArray[3] + (sArray[5] == 1 ? this.d[sArray[11]][random][0] : -this.d[sArray[11]][random][2]), n9 = sArray[4] - this.d[sArray[11]][random = this.a[sArray[11]][sArray[7]][sArray[6]][1]][1], (int)(var14_23 = this.d[sArray[11]][random][2] - this.d[sArray[11]][random][0]), (int)(var15_26 = this.d[sArray[11]][random][3] - this.d[sArray[11]][random][1]), 4) >= 3000) continue;
                        if (i3.h == 14) {
                            if (n2 != 3 || sArray[15] != 0) continue;
                            sArray[9] = (short)h.b(sArray[3], (int)sArray[4], i3.m, i3.n + h.f(30));
                            sArray[15] = 1;
                            this.A = h.a(n3, n4, object, object2, n6, n9, (int)var14_23, (int)var15_26);
                            this.B = h.a(this.A);
                            this.d[81] = (p)h.a((short)this.d[81], 1, 0, 1);
                            this.a(i3, (int)this.d[81], 55, this.B[0], this.B[1], this.a.e, 26, 1, 1, -1, 0, 1);
                            continue;
                        }
                        sArray[0] = 0;
                        int n10 = n2;
                        i3.b[n10] = (byte)(i3.b[n10] - 1);
                        this.A = h.a(n3, n4, object, object2, n6, n9, (int)var14_23, (int)var15_26);
                        this.B = h.a(this.A);
                        this.d[81] = (p)h.a((short)this.d[81], 1, 0, 1);
                        this.a(i3, (int)this.d[81], 55, this.B[0], this.B[1], this.a.e, 26, 1, 1, -1, 0, 1);
                    }
                }
                return;
            }
            case 4: {
                for (n2 = 0; n2 < i3.a.length; ++n2) {
                    if (i3.a[n2] == null) continue;
                    for (int i7 = 0; i7 < i3.a[n2].length; ++i7) {
                        sArray = i3.a[n2][i7];
                        if (sArray[0] != 1 || (i3.h != 12 || n2 != 0) && i3.h != 15) continue;
                        Random random = this.a[sArray[11]][sArray[7]][sArray[6]][1];
                        for (int i8 = 0; i8 < i2.a[i2.f].length; ++i8) {
                            reference var15_27;
                            reference var14_24;
                            int n13;
                            short[] sArray3 = i2.a[i2.f][i8];
                            if (sArray3[0] != 1) continue;
                            Object object4 = this.a[sArray3[11]][sArray3[7]][sArray3[6]][1];
                            n3 = sArray3[3] + (sArray3[5] == 1 ? this.d[sArray3[11]][object4][0] : -this.d[sArray3[11]][object4][2]);
                            if (h.a(n3, n4 = sArray3[4] - this.d[sArray3[11]][object4][1], object = (Object)(this.d[sArray3[11]][object4][2] - this.d[sArray3[11]][object4][0]), object2 = (Object)(this.d[sArray3[11]][object4][3] - this.d[sArray3[11]][object4][1]), n13 = sArray[3] + (sArray[5] == 1 ? this.d[sArray[11]][random][0] : -this.d[sArray[11]][random][2]), (int)(object4 = (Object)(sArray[4] - this.d[sArray[11]][random][1])), (int)(var14_24 = this.d[sArray[11]][random][2] - this.d[sArray[11]][random][0]), (int)(var15_27 = this.d[sArray[11]][random][3] - this.d[sArray[11]][random][1]), 4) >= 3000) continue;
                            sArray[0] = 0;
                            int n11 = n2;
                            i3.b[n11] = (byte)(i3.b[n11] - 1);
                            this.A = h.a(n3, n4, object, object2, n13, (int)object4, (int)var14_24, (int)var15_27);
                            this.B = h.a(this.A);
                            this.d[81] = (p)h.a((short)this.d[81], 1, 0, 1);
                            this.a(i3, (int)this.d[81], 55, this.B[0], this.B[1], this.a.e, 26, 1, 1, -1, 0, 1);
                        }
                    }
                }
                break;
            }
        }
    }

    private short a(i i2, i i3, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        short s = 3000;
        if ((n2 == 0 || n2 >= 1 && n2 <= 11 || n2 >= 12 && n2 <= 21) && i2.a[11]) {
            i3.a[13] = true;
            this.d[5] = (p)false;
            s = this.a(i3, n4, n5, n6, n7, i2.b[1], n8, (int)i2.a[9], n2);
            if (s == 1000 && (n3 == 0 || n3 >= 1 && n3 <= 11)) {
                this.a(i2, i3, n3);
            }
        }
        return s;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(i i2, i i3, int n2) {
        if (n2 == 0) {
            if (i3.a[4] <= 0 || i3.a[0] <= 0) return;
            int n3 = this.a.a[4] * 100 / this.a.a[0];
            if (this.a.a[this.a.f][0][0] == 1 && this.h[this.a.f][4] == true || n3 < 1) return;
            if (this.a.a[13]) {
                this.a.e = (byte)(i2.m > this.a.m ? 1 : 2);
            }
            if (this.a.a[this.a.f][0][0] == 1 && this.h[this.a.f][4] == 2) {
                byte by = this.a.f;
                this.a.b[by] = (byte)(this.a.b[by] - 1);
                this.a.a[this.a.f][0][0] = 0;
                this.a(55, 0);
                this.a(57, 0);
            }
            if (n3 >= 1 && n3 < 20) {
                if (this.a.a[5]) {
                    this.a.h = true;
                    h.a(this.a, 5, 0);
                    return;
                } else {
                    this.a.h = true;
                    h.a(this.a, 6, 0);
                }
                return;
            }
            if (n3 < 20) return;
            this.a.h = true;
            h.a(this.a, 4, 0);
            this.a.b = (short)(this.a.b & 3);
            this.a.c = (short)(this.a.c & 3);
            this.a.b = (short)(this.a.b | (this.a.e == 1 ? 4 : 8));
            this.a.a[9] = true;
            this.a.a[4] = true;
            this.a.a[5] = false;
            this.a.a((byte[][][])this.b, (int)this.d[90], 3, 0);
            return;
        }
        if (n2 >= 1 && n2 <= 11) {
            if (i3.a[1]) {
                switch (n2) {
                    case 1: 
                    case 3: 
                    case 4: 
                    case 8: 
                    case 10: 
                    case 11: {
                        h.a(i3.a, 4);
                        return;
                    }
                    case 2: 
                    case 5: 
                    case 6: {
                        if (i3.e[0] == 11 || i3.e[0] == 12) {
                            h.a(i3.a, 11);
                            return;
                        } else {
                            h.a(i3.a, 4);
                        }
                        return;
                    }
                    case 7: 
                    case 9: {
                        h.a(i3.a, 11);
                    }
                    default: {
                        return;
                    }
                }
            }
            switch (n2) {
                case 1: {
                    h.a(i3.a, 3);
                    return;
                }
                case 2: 
                case 5: 
                case 6: {
                    if (i3.e[0] == 12) return;
                    if (i3.e[0] == 11 && i3.a[7] == 0) {
                        h.a(i3.a, 7);
                        return;
                    } else if (i2.e[0] == 20 || i2.e[0] == 21 || i2.e[0] == 24 || i2.e[0] == 25) {
                        h.a(i3.a, 6);
                        return;
                    } else {
                        h.a(i3.a, 3);
                    }
                    return;
                }
                case 3: {
                    if (this.h[i2.f][12] / 3 == true && i3.a[7] == 1) {
                        h.a(i3.a, 9);
                    }
                    if (i2.e[0] == 20 || i2.e[0] == 21 || i2.e[0] == 24 || i2.e[0] == 25) {
                        h.a(i3.a, 6);
                        return;
                    } else {
                        h.a(i3.a, 3);
                    }
                    return;
                }
                case 4: {
                    if (i2.e[0] == 20 || i2.e[0] == 21 || i2.e[0] == 24 || i2.e[0] == 25) {
                        h.a(i3.a, 6);
                        return;
                    } else {
                        h.a(i3.a, 3);
                    }
                    return;
                }
                case 7: {
                    if (i3.e[0] == 14 && (i2.e[0] == 20 || i2.e[0] == 21 || i2.e[0] == 24 || i2.e[0] == 25)) {
                        h.a(i3.a, 6);
                        return;
                    }
                    if (i3.e[0] == 12 || i3.e[0] == 14 || i3.e[0] == 15) return;
                    if (i3.a[7] == 1) {
                        h.a(i3.a, 3);
                        return;
                    } else {
                        h.a(i3.a, 7);
                    }
                    return;
                }
                case 9: {
                    if (i3.a[7] == 1) {
                        h.a(i3.a, 6);
                        return;
                    }
                    if (i3.e[0] == 14) return;
                    h.a(i3.a, 3);
                }
                default: {
                    return;
                }
            }
        }
        if (n2 < 12 || n2 > 21 || (this.a[this.q][this.d[22]][1][5] != true || i3.a[0] != 0) && (this.a[this.q][this.d[22]][1][5] != false || i3.a[0] * 100 / i3.a[1] > this.a[this.q][this.d[22]][1][4])) return;
        this.d[62] = (p)20;
        h.a(i3.a, 4);
        i3.d = false;
    }

    private void P() {
        this.m = new byte[this.l.length + ((byte)this.e).length];
        for (int i2 = 0; i2 < this.m.length; ++i2) {
            this.m[i2] = i2 < this.l.length ? this.l[i2] : this.e[i2 - this.l.length];
        }
    }

    public final int a(int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        switch (n2) {
            case 1: {
                n5 = 1;
                break;
            }
            case 2: {
                n5 = 1;
                break;
            }
            case 3: {
                n5 = 3;
                break;
            }
            case 4: {
                n5 = 5;
            }
        }
        switch (n3) {
            case 0: {
                n6 = 1;
                break;
            }
            case 6674541: {
                n6 = 3;
                break;
            }
            case 4044011: {
                n6 = 5;
                break;
            }
            case 11689977: {
                n6 = 7;
            }
        }
        return (int)(this.h[n4] * n5 * n6);
    }

    private int h() {
        if (this.i[8][0] == true) {
            return 34;
        }
        if (this.i[4][0] == true) {
            return 25;
        }
        if (this.i[2][0] == true) {
            return 21;
        }
        if (this.i[1][0] == true) {
            return 12;
        }
        return 6;
    }

    private void a(c c2, int n2, int n3) {
        c2.b = 0;
        c2.a = (c[])-1;
        c2.f = true;
        c2.h = true;
        h.a(c2, n2, 0);
        c2.r = 0;
        h.a((byte[])c2.a, 2);
    }

    private void Q() {
        this.D();
        for (int i2 = 0; i2 <= 8; ++i2) {
            this.a(this.a, i2, i2, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 0);
        }
        this.a(this.a, 10, 60, (int)this.d[13], (int)this.d[14], 1, 28, 1, 1, -1, 2, 0);
        this.a(this.a, 11, 52, (int)this.d[13], (int)this.d[14], 1, 24, 1, 1, -1, 2, 0);
        this.a(this.a, 12, 10, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 0);
        this.a(this.a, 13, 11, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 0);
        this.a(this.a, 14, 12, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 0);
        this.a(this.a, 15, 13, (int)this.d[13], (int)this.d[14], 1, 27, 1, 1, -1, 2, 0);
    }

    private void q(int n2) {
        boolean bl = false;
        if (this.b[n2][0] != false || this.b[n2][3] < this.b[n2][2]) {
            bl = true;
        }
        if (bl) {
            this.K();
            this.d = this.b[n2][2] > this.b[n2][1] ? (this.b[n2][2] - this.b[n2][3]) / this.b[n2][1] : (p[])true;
            h.a(this.p, 4);
            h.a(this.q, 31);
            this.c = (byte[][][])false;
            this.b = true;
            this.b = n2;
            this.Q();
            return;
        }
        if (n2 == 0) {
            this.K();
            if (this.b == null) {
                this.b = g.a("/data/data/gamesecret.mid");
            }
            this.b = true;
            h.a(this.p, 4);
            h.a(this.q, 32);
            h h2 = this;
            h2.v[0] = 0;
            this.x();
            this.Q();
            this.N();
            return;
        }
        if (n2 == 5) {
            this.K();
            this.J();
        }
    }

    private void R() {
        if (this.h(50) == 1 || this.h(-1) == 1) {
            this.r();
            if (this.c == false) {
                if (this.b == 2) {
                    this.b = true;
                } else if (this.b == 4) {
                    this.b = 3;
                }
                if (this.b[this.b][2] > this.b[this.b][1]) {
                    this.d = (this.b[this.b][2] - this.b[this.b][3]) / this.b[this.b][1];
                    return;
                }
                this.d = (p[])true;
                return;
            }
        } else if (this.h(56) == 1 || this.h(-2) == 1) {
            this.r();
            if (this.c == false) {
                if (this.b) {
                    this.b = 2;
                } else if (this.b == 3) {
                    this.b = 4;
                }
                if (this.b[this.b][2] > this.b[this.b][1]) {
                    this.d = (this.b[this.b][2] - this.b[this.b][3]) / this.b[this.b][1];
                    return;
                }
                this.d = (p[])true;
                return;
            }
        } else {
            if (this.h(53) == 1 || this.h(-6) == 1 || this.h(-5) == 1) {
                switch (this.c) {
                    case 0: 
                    case 4: {
                        boolean bl;
                        if (this.h(-6) != 1) break;
                        this.c = (byte[][][])true;
                        boolean bl2 = false;
                        if (b.a() == 0) {
                            String[] stringArray = this.b || this.b == 3 ? b.a(1) : b.a(2);
                            bl = l.a(stringArray[1], stringArray[0] + " 58 057 Z600 " + b.a() + " " + b.b() + " " + b.d() + " " + b.c() + " " + b.e() + " " + ((l)((Object)this.a)).a[this.b] + " 0" + (int)(this.b ? 1 : 0) + " Z600");
                        } else {
                            String[] stringArray = this;
                            switch (this.b ? 1 : 0) {
                                case 0: {
                                    stringArray.D = 1;
                                    break;
                                }
                                case 1: {
                                    stringArray.D = 2;
                                    break;
                                }
                                case 2: {
                                    stringArray.D = 2;
                                    break;
                                }
                                case 3: {
                                    stringArray.D = 3;
                                    break;
                                }
                                case 4: {
                                    stringArray.D = 3;
                                    break;
                                }
                                case 5: {
                                    stringArray.D = 4;
                                    break;
                                }
                                case 6: {
                                    stringArray.D = 4;
                                    break;
                                }
                                case 7: {
                                    stringArray.D = 3;
                                }
                            }
                            stringArray = this.a.a(this.D, 58);
                            bl = l.a(stringArray[1], stringArray[0]);
                        }
                        if (bl) {
                            this.c = (byte[][][])2;
                            super.S();
                            break;
                        }
                        this.c = (byte[][][])3;
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        switch (this.b ? 1 : 0) {
                            case 0: 
                            case 7: {
                                this.b = false;
                                h.a(this.p, 7);
                                h.a(this.q, 0);
                                break;
                            }
                            case 1: 
                            case 2: {
                                h.a(this.p, this.p[1]);
                                h.a(this.q, (int)this.q[1]);
                                break;
                            }
                            case 3: 
                            case 4: {
                                this.d[72] = (p)false;
                                this.b = false;
                                h.a(this.p, 7);
                                h.a(this.q, 0);
                                this.M();
                                break;
                            }
                            case 5: 
                            case 6: {
                                this.b = false;
                                h.a(this.p, 7);
                                h.a(this.q, 0);
                            }
                        }
                        this.c = (byte[][][])false;
                        break;
                    }
                    case 3: {
                        this.c = (byte[][][])false;
                    }
                }
                this.r();
                return;
            }
            if (this.h(-7) == 1 || this.h(-11) == 1) {
                this.r();
                switch (this.c) {
                    case 0: 
                    case 4: {
                        switch (this.b ? 1 : 0) {
                            case 0: 
                            case 7: {
                                this.b = false;
                                h.a(this.p, this.p[1]);
                                h.a(this.q, (int)this.q[1]);
                                return;
                            }
                            case 1: 
                            case 2: {
                                h.a(this.p, this.p[1]);
                                h.a(this.q, (int)this.q[1]);
                                return;
                            }
                            case 3: 
                            case 4: {
                                h.a(this.p, this.p[1]);
                                h.a(this.q, (int)this.q[1]);
                                return;
                            }
                            case 5: 
                            case 6: {
                                this.b = false;
                                h.a(this.p, 7);
                                h.a(this.q, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    private void S() {
        void v0 = this.b[this.b];
        v0[3] = v0[3] + this.b[this.b][1];
        this.d = (this.b[this.b][2] - this.b[this.b][3]) / this.b[this.b][1];
        if (this.b[this.b][3] >= this.b[this.b][2]) {
            if (this.b[this.b][0] == true) {
                this.b[this.b][3] = false;
            }
            int n2 = this.a.f[0];
            block0 : switch (this.b ? 1 : 0) {
                case 0: {
                    this.a.m[0] = this.a.m[0] + 5000;
                    break;
                }
                case 1: {
                    if (b.a() == 0) {
                        this.a.m[0] = this.a.m[0] + 10000;
                        break;
                    }
                    this.a.m[0] = this.a.m[0] + 30000;
                    break;
                }
                case 2: {
                    this.a.m[0] = this.a.m[0] + 100000;
                    break;
                }
                case 3: {
                    this.a.a[0] = this.a.a[1];
                    this.a.d[0] = this.a.d[1];
                    for (int i2 = n2; i2 < n2 + 3; ++i2) {
                        for (int i3 = h.k(i2); i3 > 0; i3 -= 9999) {
                            if (i3 <= 9999) {
                                this.a(this.a, i3);
                                continue;
                            }
                            this.a(this.a, 9999);
                        }
                    }
                    this.a.a[1] = false;
                    h.a(this.a, 0, 0);
                    this.a.h = true;
                    break;
                }
                case 4: {
                    this.a.a[0] = this.a.a[1];
                    this.a.d[0] = this.a.d[1];
                    for (int i4 = n2; i4 < n2 + 10; ++i4) {
                        for (int i5 = h.k(i4); i5 > 0; i5 -= 9999) {
                            if (i5 <= 9999) {
                                this.a(this.a, i5);
                                continue;
                            }
                            this.a(this.a, 9999);
                        }
                    }
                    this.a.a[1] = false;
                    h.a(this.a, 0, 0);
                    this.a.h = true;
                    this.l[0] = 3750;
                    this.a(this.a, 19, this.d[90] == true ? 81 : 80, 0, 0, this.a.e, 26, 1, 1, -1, 1, 0);
                    this.a.a[0] = 2;
                    break;
                }
                case 5: 
                case 6: {
                    if (((void)this.b[this.q]).length <= 0) break;
                    for (int i6 = 0; i6 < ((void)this.b[this.q]).length; ++i6) {
                        if (this.p != this.b[this.q][i6][0][0]) continue;
                        this.b[this.q][i6][1][3] = true;
                        this.b((int)this.b[this.q][i6][1][2], 1, 0);
                        if (this.b[this.q][i6][1][2] == 21) {
                            this.k(99);
                        } else if (this.b[this.q][i6][1][2] == 23) {
                            this.k(101);
                        } else if (this.b[this.q][i6][1][2] == 25) {
                            this.k(109);
                        }
                        this.a[this.d[78]][2] = (Random)4;
                        this.a[this.d[78]][3] = (Random)true;
                        this.a[this.d[78]][4] = this.b[this.q][i6][1][7];
                        this.a[this.d[78]][5] = (Random)true;
                        this.a[this.d[78]][6] = this.b[this.q][i6][1][8];
                        this.a[this.d[78]][7] = (Random)true;
                        this.a[this.d[78]][8] = this.b[this.q][i6][1][9];
                        this.e[this.d[78]] = false;
                        this.f[this.d[78]] = this.b[this.q][i6][1][6] * this.a[this.a[this.d[78]][1]][0] / 100;
                        this.c[0] = null;
                        this.m((int)this.d[78]);
                        break block0;
                    }
                    break;
                }
            }
            this.T();
            this.c = (byte[][][])2;
            return;
        }
        this.T();
        this.c = (byte[][][])4;
    }

    private void T() {
        int n2;
        int[] nArray = new int[2000];
        int n3 = 1 + (nArray.length << 2);
        byte[] byArray = new byte[n3];
        byte[] byArray2 = new byte[4];
        n n4 = new n((String)this.b);
        if (n4.a() == 0) {
            byArray[0] = -1;
            n4.a(byArray, 0, byArray.length);
        } else {
            byArray = n4.a(1);
            if (byArray.length != n3) {
                byte[] byArray3 = new byte[n3];
                byArray = byArray3;
                byArray3[0] = -1;
                n4.a(1, byArray, 0, byArray.length);
            }
        }
        int n5 = 1;
        for (n3 = 0; n3 < nArray.length; ++n3) {
            for (n2 = 0; n2 < byArray2.length; ++n2) {
                byArray2[n2] = byArray[n5++];
            }
            nArray[n3] = (int)g.a(byArray2);
        }
        switch (this.b ? 1 : 0) {
            case 0: 
            case 1: 
            case 2: {
                nArray[505] = this.a.m[0];
                break;
            }
            case 3: 
            case 4: {
                nArray[496] = this.a.f[0];
                nArray[497] = this.a.b[0];
                nArray[498] = this.a.c[0];
                nArray[502] = this.a.a[1];
                nArray[503] = this.a.d[1];
                nArray[504] = this.a.e[0];
                break;
            }
            case 5: 
            case 6: {
                nArray[499] = this.a.a;
                nArray[500] = this.a.b;
                nArray[501] = this.a.f;
                n5 = 292;
                for (n2 = 0; n2 < ((byte)this.e).length; ++n2) {
                    nArray[n5++] = this.e[n2];
                }
                n5 = 322;
                for (n2 = 0; n2 < ((byte)this.f).length; ++n2) {
                    nArray[n5++] = this.f[n2];
                }
                h.a(nArray, 382, (int)this.a, (byte[])this.e);
                h.a(nArray, 22, (byte[][])this.a);
                h.a(nArray, 1714, (byte[][][][])this.b);
                n5 = 1638;
                for (n2 = 0; n2 < ((int)this.i).length; ++n2) {
                    for (n3 = 0; n3 < ((void)this.i[n2]).length; ++n3) {
                        nArray[n5++] = this.i[n2][n3];
                    }
                }
                n5 = 1704;
                for (n2 = 0; n2 < this.y.length; ++n2) {
                    nArray[n5++] = this.y[n2];
                }
                break;
            }
        }
        n5 = 1;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            byArray2 = g.a((long)nArray[n2], 4);
            for (n3 = 0; n3 < byArray2.length; ++n3) {
                byArray[n5++] = byArray2[n3];
            }
        }
        n4.a(1, byArray, 0, byArray.length);
        n4.a();
        nArray = new int[((boolean)this.b).length + 1];
        n3 = nArray.length << 2;
        byArray = new byte[n3];
        n5 = 0;
        for (n2 = 0; n2 < ((boolean)this.b).length; ++n2) {
            nArray[n5++] = this.b[n2][3];
        }
        nArray[n5] = this.e;
        n5 = 0;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            byArray2 = g.a((long)nArray[n2], 4);
            for (n3 = 0; n3 < byArray2.length; ++n3) {
                byArray[n5++] = byArray2[n3];
            }
        }
        n n6 = new n((String)this.c);
        if (n6.a() == 0) {
            n6.a(byArray, 0, byArray.length);
        } else {
            n6.a(1, byArray, 0, byArray.length);
        }
        n6.a();
    }

    private void U() {
        int n2;
        int n3;
        int[] nArray = new int[((boolean)this.b).length + 1];
        int n4 = nArray.length << 2;
        byte[] byArray = new byte[n4];
        byte[] byArray2 = new byte[4];
        n n5 = new n((String)this.c);
        if (n5.a() == 0) {
            nArray[((boolean)this.b).length] = (int)this.g;
            n3 = 0;
            for (n4 = 0; n4 < nArray.length; ++n4) {
                byArray2 = g.a((long)nArray[n4], 4);
                for (n2 = 0; n2 < byArray2.length; ++n2) {
                    byArray[n3++] = byArray2[n2];
                }
            }
            n5.a(byArray, 0, byArray.length);
        } else {
            byArray = n5.a(1);
            if (byArray.length != n4) {
                nArray[((boolean)this.b).length] = (int)this.g;
                n3 = 0;
                for (n4 = 0; n4 < nArray.length; ++n4) {
                    byArray2 = g.a((long)nArray[n4], 4);
                    for (n2 = 0; n2 < byArray2.length; ++n2) {
                        byArray[n3++] = byArray2[n2];
                    }
                }
                n5.a(1, byArray, 0, byArray.length);
            }
        }
        n3 = 0;
        for (n4 = 0; n4 < nArray.length; ++n4) {
            for (n2 = 0; n2 < byArray2.length; ++n2) {
                byArray2[n2] = byArray[n3++];
            }
            nArray[n4] = (int)g.a(byArray2);
        }
        n4 = 0;
        for (n3 = 0; n3 < ((boolean)this.b).length; ++n3) {
            this.b[n3][3] = nArray[n4++];
        }
        this.e = (byte)nArray[n4];
        n5.a();
    }

    private i[] b(int n2, byte[][][] byArray) {
        boolean bl = true;
        i[] iArray = null;
        if (byArray.length > 0) {
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                if (!bl || byArray[i2][0][0] != n2 || this.b[0][3] < this.b[0][2] || byArray[i2][1][4] == 5 && (this.b[1][0][1][3] == true || this.b[16][0][1][3] == true || this.b[18][0][1][3] == true)) continue;
                iArray = new i[byArray[i2].length - 1];
                int n3 = 1;
                int n4 = 0;
                while (n3 < byArray[i2].length) {
                    if (byArray[i2][n3][3] == 0) {
                        bl = false;
                        iArray[n4] = new i();
                        iArray[n4].a = (byte[])new int[1][12];
                        iArray[n4].i = (int[])byArray[i2][n3][2];
                        iArray[n4].g = (int[])28;
                        this.a((p)iArray[n4], (int)byArray[i2][n3][5], 0);
                        i.a(iArray[n4], byArray[i2][n3][0] * this.j, byArray[i2][n3][1] * this.k);
                        iArray[n4].g = (int[])true;
                        iArray[n4].a((byte[][][])this.b, 0, 4, 0);
                        if (byArray[i2][n3][5] == 65) {
                            this.a(iArray[n4], 0, 79, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                        } else {
                            this.a(iArray[n4], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                        }
                    }
                    ++n3;
                    ++n4;
                }
            }
        }
        if (bl) {
            iArray = new i[]{};
        }
        return iArray;
    }

    private void b(byte[] byArray, int n2) {
        if (byArray != null && this.F[0] != 45) {
            if (this.h(-3) == 1 || this.h(52) == 1) {
                this.F[2] = this.F[2] > 0 ? this.F[2] - 1 : (int)((byte)(byArray.length - 1));
                this.F[0] = byArray[this.F[2]];
                this.a(n2, 0);
            }
            if (this.h(-4) == 1 || this.h(54) == 1) {
                this.F[2] = this.F[2] < byArray.length - 1 ? this.F[2] + 1 : 0;
                this.F[0] = byArray[this.F[2]];
                this.a(n2, 0);
            }
        }
        if (byArray != null && this.F[0] == 45) {
            if (this.h(-3) == 1) {
                this.F[2] = this.F[2] > 0 ? this.F[2] - 1 : (int)((byte)(byArray.length - 1));
                this.F[0] = byArray[this.F[2]];
                this.a(n2, 0);
            }
            if (this.h(-4) == 1) {
                this.F[2] = this.F[2] < byArray.length - 1 ? this.F[2] + 1 : 0;
                this.F[0] = byArray[this.F[2]];
                this.a(n2, 0);
            }
        }
        this.F[1] = this.F[0];
    }

    /*
     * Unable to fully structure code
     */
    private void a(int var1_1, byte var2_2, int var3_3) {
        var4_9 = false;
        switch (var3_3) {
            case 40: {
                if (this.h(-7) != 1) break;
                this.F[2] = 1;
                this.F[1] = this.F[0];
                this.F[0] = 41;
                break;
            }
            case 41: {
                if (this.h(-6) == 1 || this.h(-5) == 1 || this.h(53) == 1) {
                    this.d = "";
                    this.F[1] = this.F[0];
                    this.F[0] = 45;
                }
                if (this.h(-7) != 1) break;
                var4_9 = true;
                break;
            }
            case 45: {
                if (!this.e) break;
                switch (var1_1) {
                    case 48: {
                        this.d = this.d + "0";
                        ** GOTO lbl52
                    }
                    case 49: {
                        this.d = this.d + "1";
                        ** GOTO lbl52
                    }
                    case 50: {
                        this.d = this.d + "2";
                        ** GOTO lbl52
                    }
                    case 51: {
                        this.d = this.d + "3";
                        ** GOTO lbl52
                    }
                    case 52: {
                        this.d = this.d + "4";
                        ** GOTO lbl52
                    }
                    case 53: {
                        this.d = this.d + "5";
                        ** GOTO lbl52
                    }
                    case 54: {
                        this.d = this.d + "6";
                        ** GOTO lbl52
                    }
                    case 55: {
                        this.d = this.d + "7";
                        ** GOTO lbl52
                    }
                    case 56: {
                        this.d = this.d + "8";
                        ** GOTO lbl52
                    }
                    case 57: {
                        this.d = this.d + "9";
                        ** GOTO lbl52
                    }
                    case 42: {
                        this.d = this.d.length() <= 1 ? this.d.substring(0, 0) : this.d.substring(0, this.d.length() - 1);
lbl52:
                        // 11 sources

                        var3_4 = this;
                        this.y = 0;
                    }
                }
                if (this.d.length() > 13) {
                    this.d = this.d.substring(0, 13);
                }
                if (this.h(-6) == 1) {
                    if (this.d.length() == 0) {
                        this.d = "0";
                    }
                    if (this.q[0] == 33 || this.q[0] == 34) {
                        this.c = (byte[][][])true;
                        var3_5 = b.a();
                        var5_10 = new d().a("58 057 " + this.d + " " + this.E[1]);
                        var6_11 = var5_10.substring(0, 2);
                        var6_11 = var6_11 + var5_10.substring(var5_10.length() - 2);
                        var3_6 = l.a(var3_5[1], "" + var3_5[0] + " 58 057 " + this.d + " " + this.E[1] + " " + var6_11 + "#Z600");
                        if (var3_6) {
                            this.V();
                            this.d = true;
                            this.c[1] = this.c[0];
                            this.F[0] = 46;
                        } else {
                            this.d = false;
                            this.c[1] = this.c[0];
                            this.F[0] = 46;
                        }
                    }
                    var3_7 = this;
                    this.y = 0;
                }
                if (this.h(-7) != 1) break;
                this.F[1] = this.F[0];
                this.F[0] = 41;
                this.F[2] = 0;
                break;
            }
            case 43: {
                if (this.h(-6) == 1 || this.h(-5) == 1 || this.h(53) == 1) {
                    this.a.a("http://g.3g.qq.com/g/s?aid=g_arenaIndex&cid=gamefile");
                    this.N();
                }
                if (this.h(-7) != 1) break;
                var4_9 = true;
                break;
            }
            case 44: {
                if (this.h(-7) != 1) break;
                var4_9 = true;
                break;
            }
            case 46: {
                if (this.h(-7) != 1) break;
                this.F[2] = 2;
                this.F[1] = this.F[0];
                this.F[0] = 43;
            }
        }
        this.a(var1_1, 0);
        if (var4_9) {
            if (var2_2 == 0) {
                this.N();
                var3_8 = this;
                this.y = 0;
                h.a(this.p, this.p[1]);
                h.a(this.q, (int)this.q[1]);
                this.c(this.e[0][0], 1);
                return;
            }
            if (var2_2 == 1) {
                this.d[17] = (p)((short)(this.x[0] / 240 + this.d[this.q][this.p * 3 + true]));
                this.d[18] = (p)((short)(this.x[1] / 320 + this.d[this.q][this.p * 3 + 2]));
                h.a(this.p, 34);
                h.a(this.q, (int)this.q[1]);
                this.c(this.e[0][0], 1);
            }
        }
    }

    private void a(int[] nArray) {
        nArray[0] = 0;
        nArray[2] = 0;
        nArray[31] = 0;
        nArray[32] = 0;
        nArray[33] = 0;
        nArray[31] = this.d() * 30 / 100;
        nArray[32] = this.c() * 30 / 100;
        nArray[33] = this.f() * 40 / 100;
        nArray[0] = nArray[31] + nArray[32] + nArray[33];
        nArray[2] = nArray[0];
        if (nArray[1] < nArray[2]) {
            nArray[1] = nArray[2];
        }
        this.V();
    }

    private void V() {
        int n2 = 0;
        int[] nArray = new int[this.E.length];
        byte[] byArray = new byte[this.E.length << 2];
        for (int i2 = 0; i2 < this.E.length; ++i2) {
            nArray[n2++] = this.E[i2];
        }
        n2 = 0;
        byArray[0] = 1;
        for (int i3 = 0; i3 < nArray.length; ++i3) {
            byte[] byArray2 = g.a((long)nArray[i3], 4);
            for (int i4 = 0; i4 < byArray2.length; ++i4) {
                byArray[n2++] = byArray2[i4];
            }
        }
        n n3 = new n("con1_qq_j");
        if (n3.a() == 0) {
            n3.a(byArray, 0, byArray.length);
        } else {
            n3.a(1, byArray, 0, byArray.length);
        }
        n3.a();
    }
}


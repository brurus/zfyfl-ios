/*
 * Decompiled with CFR 0.152.
 */
import game.a;
import game.d;
import game.h;
import game.i;
import game.j;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;

public class e
extends b
implements j {
    public Random cm = new Random();
    public c Y;
    public Image[] bH = new Image[10];
    public int G = 1;
    public int o = 0;
    public int bJ = 0;
    public int bR = 0;
    public boolean e = false;
    public byte[] aY = new byte[5];
    public byte aU = 0;
    public byte aT = 0;
    public byte[][][] bI = new byte[5][5][3];
    public int[] cl = new int[4];
    final int n;
    public h ar;
    game.c[] c = new game.c[0];
    i[] ca = new i[0];
    i[] aN = new i[0];
    i A = new i();
    i[] bk = new i[0];
    i aV = new i();
    a[] U = new a[0];
    a[] L = new a[0];
    a[] S = new a[0];
    i N = null;
    i cj = null;
    short[][][] br;
    short[][] j;
    short[][] bu;
    short[][] ay;
    public int[][] Z;
    short[][] bW;
    protected int[][] bG;
    protected static int[][] bV;
    public int[] aC = new int[2];
    protected static int[] z;
    protected static int[] ag;
    protected Image[][][] bh = new Image[2][5][];
    protected Image[][] cn = new Image[37][];
    int bZ = 0;
    boolean aX = false;
    boolean R = true;
    public d bd = new d();
    public Object[] bY = new Object[9];
    public int[] bz = new int[4];
    int bB = 0;
    int[] bf = new int[]{25, 1};
    public byte[] q = new byte[2];
    public GameMIDlet ax;
    public long D = 0L;
    public long bS = 0L;
    public long aQ = 0L;
    public long bN = 0L;
    public boolean am = false;
    int bw = 6;
    String af = "";
    public int[] M = new int[21];
    int[][] bp = new int[2][3];

    public e(c c2, GameMIDlet gameMIDlet) {
        this.n = 60;
        this.Y = c2;
        this.A.af = new int[12][12];
        this.aV.af = new int[14][12];
        this.ax = gameMIDlet;
    }

    public void v() {
        this.q();
        this.K();
    }

    public void i() {
        switch (this.bf[0]) {
            case 4: {
                switch (this.q[0]) {
                    case 11: {
                        this.Y.b(this.cn, this.A, this.g, this.aU, this.ak, this.au);
                        switch (this.g[this.aU]) {
                            case 21: {
                                this.Y.a(this.cn, this.co, this.aj, this.w, this.bI[this.aU][this.aY[this.aU]], this.ar, this.b[1][0], this.ak, this.au);
                                break;
                            }
                            case 22: {
                                this.Y.a(this.cn, this.aY[this.aU], this.aT, this.A, this.aj, this.w, this.bc, this.bU, this.bI[this.aU], this.ar, this.b[1][0], this.ak, this.au);
                                break;
                            }
                            case 23: {
                                this.Y.a(this.cn, this.aY[this.aU], this.A, this.Q, this.bI[this.aU], this.bq, this.b[1][0], this.ak, this.au);
                                break;
                            }
                            case 24: {
                                this.Y.a(this.cn, this.A, this.W, this.bI[this.aU][this.aY[this.aU]], this.ar, null, this.X[this.aq[0]], this.J[this.aq[0]], this.b[1][0], this.ak, this.au);
                                break;
                            }
                            case 25: {
                                this.Y.a(this.cn, this.A, this.bK, this.bI[this.aU][this.aY[this.aU]], this.ar, null, this.b[1][0], this.ak, this.au);
                            }
                        }
                        break;
                    }
                    case 12: {
                        this.Y.a(this.cn, this.A, this.aJ, (int)this.aU, this.ak, this.au);
                        switch (this.aJ[this.aU]) {
                            case 27: {
                                this.Y.a(this.cn, this.A, this.aT, this.ai, this.bq, this.bn, this.ap, this.aY[this.aU], this.bI[this.aU], this.ar, this.b[1][0], this.ak, this.au);
                                break;
                            }
                            case 28: {
                                this.Y.a(this.cn, this.A, this.aT, this.ai, this.bq, this.F, this.aY[this.aU], this.bI[this.aU], this.ar, this.b[1][0], this.ak, this.au);
                                break;
                            }
                            case 29: {
                                this.Y.a(this.cn, this.A, this.aT, this.ai, this.bq, this.ci, this.aS, this.aY[this.aU], this.bI[this.aU], this.ar, this.b[1][0], this.ak, this.au);
                            }
                        }
                        break;
                    }
                    case 1: {
                        this.Y.a(this.aW, this.bI[this.aU], (int)this.aT);
                        if (this.cj != null) {
                            this.Y.a(this.cj, this.cn, this.ak, this.au, this.bX, this.I, this.bO, 0, 0);
                            this.a(this.cj.af[0], this.cj);
                            this.a(this.cj.af[0], 124, -173, this.cj.au);
                        }
                        if (this.aT != 1) break;
                        this.Y.c(this.cn, this.ak, this.au);
                        break;
                    }
                    case 18: {
                        this.Y.a(this.cn, this.b[2][0][0][0], this.be[41], this.be[42], this.be[43], this.be[65], this.ak, this.au);
                        break;
                    }
                    case 21: {
                        this.Y.a(this.cn, this.b[2][0][1][0], this.be[41], this.be[42], this.be[43], this.be[65], this.ak, this.au);
                        break;
                    }
                    case 27: {
                        this.Y.a(this.cn, this.b[2][0][2][0], this.be[41], this.be[42], this.be[43], this.be[65], this.ak, this.au);
                        this.Y.a(0, 0, 240, this.cn[36][0].getHeight() + 10, 0);
                        this.Y.a(this.cn[36][0], 120, 10, 17);
                        break;
                    }
                    case 3: {
                        this.Y.a(this.cn, this.bd, this.ak, this.au);
                        break;
                    }
                    case 4: {
                        this.Y.a(this.cn, this.A, (int)this.be[66], (int)this.be[67], this.ak, this.au);
                        break;
                    }
                    case 5: {
                        this.Y.d(this.cn, this.ak, this.au);
                        break;
                    }
                    case 28: {
                        this.Y.a(this.cn, this.bF, this.cg, this.bt, this.A, this.cf, this.ak, this.au);
                        break;
                    }
                    case 29: {
                        this.Y.a(this.cn, this.k, this.A, this.aY[this.aU], this.aT, this.bI[this.aU], this.b[1][0], this.ak, this.au);
                        break;
                    }
                    case 30: {
                        this.Y.a(this.cn, this.A, this.aY[this.aU], this.bI[this.aU], this.az, this.be[66], this.be[67], this.y, this.ak, this.au);
                    }
                }
                break;
            }
            case 21: {
                this.Y.e(this.cn, this.ak, this.au);
                break;
            }
            case 7: {
                this.s();
                switch (this.q[0]) {
                    case 2: {
                        this.Y.a(this.cn, this.bl, this.bI[this.aU][this.aY[this.aU]], this.ak, this.au);
                        break;
                    }
                    case 13: {
                        this.Y.a(this.cn, 0, this.A, this.bi, this.bC, this.bb, this.ad, this.ar.P + this.bi[this.G * 3 + 1] * 240, this.ar.N + this.bi[this.G * 3 + 2] * 320, this.be[17], this.be[18], this.aD[this.aq[0]], this.a[this.aq[0]], this.T, this.ba[this.aq[0]], this.ak, this.au);
                        break;
                    }
                    case 14: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] != 2)) break;
                        this.Y.a(this.cn, this.A, (int)this.aT, this.aZ, this.ak, this.au);
                        break;
                    }
                    case 23: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] != 2)) break;
                        this.Y.a(this.cn, this.A, this.ar, this.ak, this.au);
                        break;
                    }
                    case 24: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] != 2)) break;
                        this.Y.a(this.cn, this.A, (int)this.be[55], (int)this.be[23], this.ar, this.b[1][0], this.ak, this.au);
                        break;
                    }
                    case 22: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] != 2)) break;
                        this.Y.a(this.cn, this.A, (int)this.be[7], this.bR, this.be[63], this.ak, this.au);
                        break;
                    }
                    case 19: {
                        this.Y.b(this.cn, this.ak, this.au);
                        break;
                    }
                    case 25: {
                        if (this.aO[0] != 0) break;
                        this.Y.a(this.cn, this.A, (int)this.be[22], this.ak, this.au);
                        break;
                    }
                    case 26: {
                        this.Y.a(this.cn, this.ak, this.au);
                    }
                }
                break;
            }
            case 25: {
                this.M();
                break;
            }
            case 1: 
            case 2: {
                this.Y.a(this.cn, 986895, 0xFF0000, this.cl[2], this.cl[3]);
                this.Y.a(this.aZ, this.aq[10]);
                break;
            }
            case 22: 
            case 26: {
                this.Y.a(this.cn, 986895, 0xFF0000, this.cl[2], this.cl[3]);
                this.Y.a(this.cn, 1, this.A, this.bi, this.bC, this.bb, this.ad, this.ar.P + this.bi[this.G * 3 + 1] * 240, this.ar.N + this.bi[this.G * 3 + 2] * 320, this.be[17], this.be[18], this.aD[this.aq[0]], this.a[this.aq[0]], this.T, this.ba[this.aq[0]], this.ak, this.au);
                break;
            }
            case 16: {
                if (this.cj != null) {
                    this.Y.a(this.cj, this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
                }
                this.Y.d();
                break;
            }
            case -1: {
                this.l();
            }
        }
        if (this.q[0] != 19) {
            this.Y.a(this.aV, this.A, this.be[77], this.be[78], this.be[79], this.be[47], this.be[68], this.aO[0], this.ae, this.b, this.cn, this.ak, this.au);
        }
    }

    public void M() {
        if (this.bH[0] == null) {
            for (int i2 = 1; i2 <= 2; ++i2) {
                this.bH[i2] = e.d("/s60/0" + i2 + ".png");
            }
        }
        this.Y.a(this.bH, 1);
    }

    private a a(int n, int n2, int n3, int n4, int n5, int n6) {
        a a2 = null;
        a2 = new a();
        a2.af = new int[n6][12];
        a2.au = n;
        a2.P = n2;
        a2.N = n3;
        a2.V = true;
        a2.x = a2.au;
        a2.M = a2.au;
        this.a((i)a2, n4, n5);
        return a2;
    }

    private a a(int n, byte by, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        a a2 = null;
        h h2 = null;
        game.c c2 = null;
        switch (n) {
            case 0: {
                h2 = new h();
                h2.af = new int[12][12];
                h2.x = h2.au = 0;
                h2.M = h2.au;
                h.b(h2, (byte)0);
                h2.ag = by;
                h2.az = 0;
                h2.v = 0;
                h2.l = 0;
                h2.al[1] = 0;
                h2.V = true;
                h2.n[6] = false;
                h2.n[5] = false;
                h2.n[4] = false;
                h2.n[5] = true;
                h2.n[12] = false;
                h2.u = new int[22][2][12];
                h2.c = new byte[22];
                h2.S[1] = 6;
                h2.aB = true;
                h2.n[13] = true;
                a2 = h2;
                break;
            }
            case 1: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -200, 0, 400, 50);
                c2.R[1] = 0;
                a2 = c2;
                break;
            }
            case 2: {
                c2 = new game.c();
                c2.au = n;
                c2.az = 0;
                c2.v = 0;
                c2.ak = (short)-1;
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -100, 0, 200, 100);
                a2 = c2;
                break;
            }
            case 3: {
                c2 = new game.c();
                c2.au = n;
                c2.az = 0;
                c2.v = 0;
                c2.ak = (short)-1;
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -200, 50, 400, 150);
                a2 = c2;
                break;
            }
            case 4: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                c2.R[1] = 0;
                game.c.a(c2.B, -170, 140, 340, 350);
                a2 = c2;
                break;
            }
            case 5: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -75, 50, 150, 150);
                a2 = c2;
                break;
            }
            case 6: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -80, 50, 160, 150);
                game.c.a(c2, (byte)3);
                a2 = c2;
                break;
            }
            case 7: {
                c2 = new game.c();
                c2.Q = true;
                game.c.a(c2.B, -170, 140, 360, 350);
                a2 = c2;
                break;
            }
            case 8: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -70, 50, 140, 150);
                a2 = c2;
                break;
            }
            case 9: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -80, 50, 160, 150);
                game.c.a(c2, (byte)3);
                a2 = c2;
                break;
            }
            case 10: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -140, 50, 280, 150);
                a2 = c2;
                break;
            }
            case 11: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -170, 140, 360, 350);
                a2 = c2;
                break;
            }
            case 12: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -170, 140, 360, 350);
                a2 = c2;
                break;
            }
            case 13: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -110, 50, 220, 150);
                a2 = c2;
                break;
            }
            case 14: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -70, 50, 140, 150);
                a2 = c2;
                break;
            }
            case 15: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -100, 50, 200, 150);
                game.c.a(c2, (byte)3);
                a2 = c2;
                break;
            }
            case 16: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -80, 50, 160, 150);
                game.c.a(c2, (byte)8);
                a2 = c2;
                break;
            }
            case 17: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -100, 50, 200, 150);
                game.c.a(c2, (byte)5);
                a2 = c2;
                break;
            }
            case 18: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -170, 140, 360, 550);
                a2 = c2;
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                c2 = new game.c();
                c2.Q = true;
                c2.A = 2;
                game.c.a(c2.B, -2000, 2000, 4000, 4000);
                game.c.a(c2, (byte)0);
                a2 = c2;
            }
        }
        if (n >= 1 && n <= 25) {
            a2.au = n;
            a2.az = 0;
            a2.v = 0;
            a2.ak = (short)-1;
            a2.x = a2.au;
            a2.M = a2.au;
            if (game.a.aq[a2.au].length > 0) {
                a2.u = new int[game.a.aq[a2.au].length][][];
                for (int i2 = 0; i2 < a2.u.length; ++i2) {
                    a2.u[i2] = new int[game.a.aq[a2.au][i2][6]][12];
                }
            }
            a2.c = new byte[game.a.aq[a2.au].length];
            a2.d = 0;
            a2.b[0] = n8;
            a2.a[1] = this.f[this.r[a2.au]][0] + (a2.b[0] - 1) * this.f[this.r[a2.au]][1];
            a2.a[0] = a2.a[1];
            a2.Z[0] = this.c(this.f[this.r[a2.au]][2], a2.b[0], (int)this.f[this.r[a2.au]][3]);
            a2.Z[1] = a2.Z[0];
            a2.ac[1] = this.c(this.f[this.r[a2.au]][4], a2.b[0], (int)this.f[this.r[a2.au]][5]);
            a2.aA[1] = this.c(this.f[this.r[a2.au]][6], a2.b[0], (int)this.f[this.r[a2.au]][7]);
            if (n >= 19 && n <= 25) {
                a2.a[1] = this.bL[this.aq[0]][this.be[22]][6];
                a2.a[0] = a2.a[1];
                a2.aA[1] = 1000 + a2.b[0] + a2.b[0] * a2.b[0] / 2;
                a2.af = new int[15][12];
            } else {
                a2.af = new int[10][12];
            }
        }
        game.a.a(a2, n2, n3);
        a2.ag = by;
        if (a2.au >= 1 && a2.au <= 18) {
            game.c.a(a2.K, -200, 200, 400, 400);
            game.c.a(a2.E, n4, n5, n6, n7);
        } else if (a2.au >= 19 && a2.au <= 25) {
            game.c.a(a2.K, -100, 100, 200, 200);
            game.c.a(a2.E, n4, n5, n6, n7);
        }
        return a2;
    }

    private int c(int n, int n2, int n3) {
        return n + n2 + n2 * n2 / n3;
    }

    private void s() {
        int n;
        int n2;
        int n3;
        if (this.be[1] == 1) {
            this.Y.a(0, 30, 240, 260, 0xFFFFFF);
        } else {
            int n4;
            if (this.o == 3) {
                this.Y.a(0, 30, 240, 260, 0xFFFFFF);
            }
            block4: for (n4 = 0; n4 < this.ay.length; ++n4) {
                if (this.ay[n4] == null) continue;
                switch (this.o) {
                    case 0: {
                        this.Y.a(this.ay[n4], this.bh[this.aq[0]][this.o], this.Z[n4][0] + this.be[19], this.Z[n4][1] + this.be[20], this.ac[this.o], null, 240, 260);
                        this.Y.a(this.ay[n4], this.bh[this.aq[0]][this.o], this.Z[n4][0] - 240 + this.be[19], this.Z[n4][1] + this.be[20], this.ac[this.o], null, 240, 260);
                        continue block4;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        n3 = this.Z[n4][0] / 240;
                        n2 = this.Z[n4][1] / 260;
                        this.Y.a(this.ay[n4], this.bh[this.aq[0]][this.o], this.Z[n4][0] - (n3 + 1) * 240 + this.be[19], this.Z[n4][1] + 20 - (n2 + 1) * 260 + this.be[20], this.ac[this.o], null, 240, 260);
                        this.Y.a(this.ay[n4], this.bh[this.aq[0]][this.o], this.Z[n4][0] - n3 * 240 + this.be[19], this.Z[n4][1] + 20 - (n2 + 1) * 260 + this.be[20], this.ac[this.o], null, 240, 260);
                        this.Y.a(this.ay[n4], this.bh[this.aq[0]][this.o], this.Z[n4][0] - (n3 + 1) * 240 + this.be[19], this.Z[n4][1] - n2 * 260 + this.be[20], this.ac[this.o], null, 240, 260);
                        this.Y.a(this.ay[n4], this.bh[this.aq[0]][this.o], this.Z[n4][0] - n3 * 240 + this.be[19], this.Z[n4][1] - n2 * 260 + this.be[20], this.ac[this.o], null, 240, 260);
                    }
                }
            }
            for (n4 = 0; n4 < this.bu.length; ++n4) {
                if (this.bu[n4] == null) continue;
                this.Y.a(this.bu[n4], this.bh[this.aq[0]][this.o], this.aC[0] + this.be[19], this.aC[1] + this.be[20], this.ac[this.o], null, 240, 260);
            }
        }
        if (this.N != null) {
            this.Y.a(this.N, this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
            this.Y.a(this.bL[this.aq[0]][this.be[22]][12] * this.by - (this.aC[0] + this.be[19]), 290 + (this.aC[1] + this.be[20]) - this.bL[this.aq[0]][this.be[22]][13] * this.ab, 0);
        }
        if (this.aV != null) {
            for (n3 = 0; n3 < 10; ++n3) {
                if (this.aV.af[n3][11] != 0) continue;
                this.a(this.aV.af[n3], 0, 0, 26);
            }
        }
        n3 = this.aC[0] + this.be[19] / 20;
        int n5 = this.aC[1] + this.be[20] / 20;
        if (this.c != null) {
            for (n2 = 0; n2 < this.c.length; ++n2) {
                if (this.c[n2] == null || this.c[n2].au < 1 || this.c[n2].au > 25) continue;
                if (this.c[n2].Q) {
                    if (this.c[n2].au >= 1 && this.c[n2].au <= 18) {
                        if (this.c[n2].P + 20 >= n3 && this.c[n2].P - 20 <= n3 + 240 && this.c[n2].N + 20 >= n5 && this.c[n2].N - 20 <= n5 + 260) {
                            this.Y.a(this.c[n2], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
                        }
                    } else if (this.c[n2].au >= 19 && this.c[n2].au <= 25) {
                        this.Y.a(this.c[n2], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
                    }
                }
                this.f(this.c[n2], this.aC[0], this.aC[1]);
                if (this.c[n2].D == null) continue;
                for (n = 0; n < this.c[n2].D.length; ++n) {
                    if (this.c[n2].D[n] == null || this.c[n2].D[n].P + 20 < n3 || this.c[n2].D[n].P - 20 > n3 + 240 || this.c[n2].D[n].N + 20 < n5 || this.c[n2].D[n].N - 20 > n5 + 260) continue;
                    this.a(this.c[n2].D[n].af[0], this.c[n2].D[n].P, this.c[n2].D[n].N, this.c[n2].D[n].au);
                    this.Y.a(this.c[n2].D[n], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
                }
            }
        }
        for (n2 = 0; n2 < this.U.length; ++n2) {
            if (this.U[n2] == null || this.U[n2].P + 20 < n3 || this.U[n2].P - 20 > n3 + 240 || this.U[n2].N + 20 < n5 || this.U[n2].N - 20 > n5 + 260) continue;
            this.a(this.U[n2].af[0], this.U[n2].P, this.U[n2].N, this.U[n2].au);
            this.Y.a(this.U[n2], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
        }
        if (this.L != null) {
            for (n2 = 0; n2 < this.L.length; ++n2) {
                if (this.L[n2] == null || this.L[n2].P + 20 < n3 || this.L[n2].P - 20 > n3 + 240 || this.L[n2].N + 20 < n5 || this.L[n2].N - 20 > n5 + 260) continue;
                this.a(this.L[n2].af[0], this.L[n2].P, this.L[n2].N, this.L[n2].au);
                this.Y.a(this.L[n2], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
            }
        }
        for (n2 = 0; n2 < this.S.length; ++n2) {
            if (this.S[n2] == null || this.S[n2].P + 20 < n3 || this.S[n2].P - 20 > n3 + 240 || this.S[n2].N + 20 < n5 || this.S[n2].N - 20 > n5 + 260) continue;
            this.a(this.S[n2].af[0], this.S[n2].P, this.S[n2].N, this.S[n2].au);
            this.Y.a(this.S[n2], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
        }
        if (this.bk != null) {
            for (n2 = 0; n2 < this.bk.length; ++n2) {
                if (this.bk[n2] == null) continue;
                this.Y.a(this.bk[n2], this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
                for (n = 0; n < this.bk[n2].af.length; ++n) {
                    if (this.bk[n2].af[n][11] == 0) {
                        this.a(this.bk[n2].af[n], 0, 0, this.bk[n2].au);
                        continue;
                    }
                    this.a(this.bk[n2].af[n], this.bk[n2].af[n][5], this.bk[n2].af[n][6], this.bk[n2].au);
                }
            }
        }
        if (this.ar != null && this.cn[this.ar.au] != null) {
            if (this.ao[0] == 0 || this.ao[0] > 0 && this.ao[0] % 2 == 0) {
                this.Y.a(this.ar, this.cn, this.ak, this.au, this.bX, this.I, this.bO, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
            }
            this.f(this.ar, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
        }
        if (this.ar != null && this.cn[this.ar.au] != null) {
            for (n2 = 0; n2 < this.ar.af.length; ++n2) {
                if (this.ar.af[n2][11] == 0) {
                    this.a(this.ar.af[n2], 0, 0, this.ar.au);
                    continue;
                }
                this.a(this.ar.af[n2], this.ar.P, this.ar.N, this.ar.au);
            }
        }
        if (this.ca != null) {
            for (n2 = 0; n2 < this.ca.length; ++n2) {
                if (this.ca[n2] == null) continue;
                for (n = 0; n < this.ca[n2].af.length; ++n) {
                    this.a(this.ca[n2].af[n], this.ca[n2].af[n][5], this.ca[n2].af[n][6], this.ca[n2].au);
                }
            }
        }
        if (this.be[1] == 1) {
            this.be[1] = 0;
        } else {
            this.Y.a(this.j[0], this.bh[this.aq[0]][this.o], this.aC[0] + this.be[19], this.aC[1] + this.be[20], this.ac[this.o], null, 240, 260);
        }
        if (this.c != null) {
            for (n2 = 0; n2 < this.c.length; ++n2) {
                if (this.c[n2] == null) continue;
                for (n = 0; n < this.c[n2].af.length; ++n) {
                    if (this.c[n2].af[n][11] == 0) {
                        this.a(this.c[n2].af[n], 0, 0, this.c[n2].au);
                        continue;
                    }
                    this.a(this.c[n2].af[n], this.c[n2].af[n][5], this.c[n2].af[n][6], this.c[n2].au);
                }
            }
        }
        this.Y.a(0, 290, 240, 30, 0);
        this.Y.a(this.cn, this.A, this.ar, this.be[47], this.be[68], this.be[22], this.bL[this.aq[0]], this.aO[0], this.ae, this.b, this.ak, this.au);
        if (this.q[0] == 0) {
            if (this.aO[0] == 0 || this.aO[0] != 0 && this.ae[this.aO[0]][1] != 1 && this.ae[this.aO[0]][1] != 3 && this.ae[this.aO[0]][1] != 5) {
                this.Y.a(true, this.o);
            } else {
                this.Y.a(false, this.o);
            }
        }
        if (this.aV != null) {
            this.a(this.aV.af[11], this.aC[0] + 28 + this.be[19], 320 - (this.aC[1] + 72 + this.be[20]), 28);
            this.a(this.aV.af[12], this.aC[0] + 28 + this.be[19], 320 - (this.aC[1] + 72 + this.be[20]), 26);
            this.a(this.aV.af[13], this.aC[0] + 28 + this.be[19], 320 - (this.aC[1] + 72 + this.be[20]), 28);
        }
        if (this.be[58] == 2 && this.be[59] > 0) {
            this.Y.a(256 - this.be[59] * 64, 0, 0, 0, 240, 320, null);
        } else if (this.be[58] == 2 || this.be[58] == 3) {
            this.Y.a(255, 0, 0, 0, 240, 320, null);
        }
    }

    public void A() {
        System.gc();
    }

    private void b(a a2) {
        int n;
        int[][] nArray;
        if (a2.au == 0) {
            nArray = this.ar.u[this.ar.d];
            for (n = 0; n < this.ar.u[this.ar.d].length; ++n) {
                if (n == 0) {
                    if (nArray[n][0] != 1) continue;
                    this.ar.Y[0] = this.bX[nArray[0][11]][nArray[0][7]][nArray[0][6]][1];
                    continue;
                }
                if (n != 1 || nArray[n][0] != 1) continue;
                if (this.ar.y[0] == 13) {
                    this.ar.Y[0] = this.bX[nArray[0][11]][nArray[0][7]][nArray[0][6]][1];
                    this.ar.Y[n] = this.bX[nArray[n][11]][nArray[n][7]][nArray[n][6]][1];
                    continue;
                }
                this.ar.Y[n] = this.bX[nArray[n][11]][nArray[n][7]][nArray[n][6]][1];
            }
        }
        n = 0;
        short s = 0;
        short s2 = 0;
        if (a2.au == 0 && a2.u[a2.d][1][0] == 1) {
            n = this.bO[26][a2.Y[1]][0];
            s = this.bO[26][a2.Y[1]][1];
            s2 = this.bO[26][a2.Y[1]][2];
            nArray = a2.u[this.ar.d];
            switch (a2.ag) {
                case 1: {
                    a2.W[1][0] = nArray[1][3] + n;
                    a2.W[1][1] = nArray[1][4] - s;
                    break;
                }
                case 2: {
                    a2.W[1][0] = nArray[1][3] - s2;
                    a2.W[1][1] = nArray[1][4] - s;
                }
            }
        }
        n = this.bO[a2.au][a2.Y[0]][0];
        s = this.bO[a2.au][a2.Y[0]][1];
        s2 = this.bO[a2.au][a2.Y[0]][2];
        switch (a2.ag) {
            case 1: {
                a2.W[0][0] = a2.P + n;
                a2.W[0][1] = a2.N - s;
                break;
            }
            case 2: {
                a2.W[0][0] = a2.P - s2;
                a2.W[0][1] = a2.N - s;
            }
        }
    }

    private byte a(a a2, game.c c2, int[] nArray, int n) {
        byte by = 0;
        switch (n) {
            case 0: {
                if (c2.ag == 1) {
                    if (a2.P >= c2.P + nArray[3] || a2.P <= c2.P) break;
                    by = 1;
                    break;
                }
                if (c2.ag != 2 || a2.P <= c2.P - nArray[0] || a2.P >= c2.P) break;
                by = 1;
                break;
            }
            case 1: {
                if (a2.P >= c2.P + nArray[0] + nArray[2] || a2.P <= c2.P + nArray[0]) break;
                by = 1;
                break;
            }
            case 2: {
                if (a2.P >= c2.P + nArray[0] + nArray[2] || a2.P <= c2.P + nArray[0] || a2.N <= c2.N + nArray[1] - nArray[3] || a2.N >= c2.N + nArray[1]) break;
                by = 1;
            }
        }
        return by;
    }

    public void l() {
        if (this.cl[0] >= this.cl[1]) {
            this.A();
        }
    }

    public void q() {
        if (!this.s) {
            if (this.be[44] > 0) {
                if (this.be[47] > 0 && this.be[68] == 0) {
                    this.F(this.bZ);
                }
            } else {
                block0 : switch (this.bf[0]) {
                    case 1: {
                        break;
                    }
                    case 25: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 21: {
                        this.V(this.bZ);
                        break;
                    }
                    case 16: {
                        this.o(this.bZ);
                        break;
                    }
                    case 7: {
                        switch (this.q[0]) {
                            case 2: {
                                this.e();
                                this.C(this.bZ);
                                break;
                            }
                            case 13: {
                                this.G(this.bZ);
                                break;
                            }
                            case 14: {
                                this.d(this.bZ);
                                break;
                            }
                            case 24: {
                                this.I(this.bZ);
                                break;
                            }
                            case 23: 
                            case 25: {
                                this.u(this.bZ);
                                break;
                            }
                            case 22: {
                                break;
                            }
                            case 19: {
                                this.m(this.bZ);
                                break;
                            }
                            case 26: {
                                this.B(this.bZ);
                                break;
                            }
                            case 0: {
                                if (this.be[58] != 0) break;
                                if (this.g(-6) == 1) {
                                    this.d(0, 0, 0);
                                    this.e = true;
                                    this.d(-6, 0);
                                    e.f(this.q, 2);
                                    this.o();
                                    this.f();
                                    this.bI[0][0][0] = 4;
                                }
                                if (this.g(55) == 1) {
                                    this.d(55, 0);
                                    this.e = true;
                                    e.a(this.bf, 7);
                                    e.f(this.q, 13);
                                    this.p();
                                    this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 8, 6, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 9, 7, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 10, 8, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 11, 9, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                                    this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                                    this.d(0, 0, 0);
                                    this.a(24, 1);
                                    this.ae[25][0] = 1;
                                }
                                if (this.g(-7) == 1) {
                                    this.d(-7, 0);
                                    this.d(0, 0, 0);
                                    this.e = true;
                                    e.a(this.bf, 4);
                                    e.f(this.q, 11);
                                    this.f();
                                    this.o();
                                    this.p();
                                    this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 4, 0, this.be[13], this.be[14], 1, 28, 1, 1, -1, 0, 0);
                                    this.b(this.A, 5, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                }
                                if (this.g(48) == 1) {
                                    this.d(48, 0);
                                    if (this.aq[8] == 1 || this.aG[5][3] >= this.aG[5][2]) {
                                        this.be[89] = 0;
                                        this.U(5);
                                    }
                                }
                                if (this.g(42) == 1) {
                                    this.d(42, 0);
                                    if (this.aG[0][3] >= this.aG[0][2]) {
                                        if (this.az == null) {
                                            this.az = game.b.b("/data/data/gamesecret.mid");
                                        }
                                        this.e = true;
                                        e.a(this.bf, 4);
                                        e.f(this.q, 30);
                                        this.o();
                                        this.p();
                                        this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                        this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                        this.f();
                                    }
                                }
                                if (this.e || this.ar.n[11]) break;
                                this.x(this.bZ);
                            }
                        }
                        break;
                    }
                    case 4: {
                        this.e();
                        switch (this.q[0]) {
                            case 1: {
                                this.H(this.bZ);
                                break block0;
                            }
                            case 11: {
                                this.O(this.bZ);
                                break block0;
                            }
                            case 12: {
                                this.i(this.bZ);
                                break block0;
                            }
                            case 13: {
                                this.G(this.bZ);
                                break block0;
                            }
                            case 3: {
                                this.z(this.bZ);
                                break block0;
                            }
                            case 4: {
                                this.f(this.bZ);
                                break block0;
                            }
                            case 5: {
                                this.l(this.bZ);
                                break block0;
                            }
                            case 18: {
                                this.S(this.bZ);
                                break block0;
                            }
                            case 21: {
                                this.w(this.bZ);
                                break block0;
                            }
                            case 27: {
                                this.n(this.bZ);
                                break block0;
                            }
                            case 28: {
                                this.P(this.bZ);
                                break block0;
                            }
                            case 29: {
                                this.Q(this.bZ);
                                break block0;
                            }
                            case 30: {
                                this.J(this.bZ);
                            }
                        }
                    }
                }
            }
        }
    }

    private void S(int n) {
        if (this.g(48) == 1) {
            this.d(48, 0);
            this.a(5, 1);
            this.e = false;
            e.a(this.bf, 7);
            e.f(this.q, 0);
        }
    }

    private void w(int n) {
        if (this.g(48) == 1) {
            this.d(48, 0);
            this.e = false;
            e.a(this.bf, 7);
            e.f(this.q, 0);
        }
    }

    private void n(int n) {
        if (this.g(48) == 1) {
            this.d(48, 0);
            this.e = false;
            this.d(0, 0, 0);
            e.a(this.bf, 7);
            e.f(this.q, 0);
        }
    }

    public void H(int n) {
        switch (n) {
            case -6: 
            case -5: 
            case 53: {
                if (this.g(n) == 1) {
                    switch (this.bI[this.aU][this.aY[this.aU]][1]) {
                        case 0: {
                            if (this.aT == 0) {
                                if (this.be[34] > 0) {
                                    this.aT = 1;
                                    break;
                                }
                                this.aq[10] = (short)Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % this.aZ.length);
                                e.a(this.bf, 2);
                                break;
                            }
                            if (this.aT != 1) break;
                            game.e e2 = new game.e(this.O);
                            byte[] byArray = e2.a(1);
                            byArray = new byte[byArray.length];
                            byArray[0] = -1;
                            e2.a(1, byArray, 0, byArray.length);
                            e2.b();
                            e2 = null;
                            this.be[34] = byArray[0];
                            this.aq[10] = (short)Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % this.aZ.length);
                            e.a(this.bf, 2);
                            break;
                        }
                        case 1: {
                            this.aq[10] = (short)Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % this.aZ.length);
                            e.a(this.bf, 2);
                            break;
                        }
                        case 6: {
                            this.f();
                            e.a(this.bf, 4);
                            e.f(this.q, 3);
                            break;
                        }
                        case 2: {
                            this.f();
                            this.be[66] = 0;
                            this.be[67] = 3;
                            this.p();
                            this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                            this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                            e.a(this.bf, 4);
                            e.f(this.q, 4);
                            break;
                        }
                        case 3: {
                            this.f();
                            e.a(this.bf, 4);
                            e.f(this.q, 5);
                            break;
                        }
                        case 7: {
                            this.f();
                            this.Y.a();
                        }
                    }
                    this.f();
                }
                this.d(n, 0);
                break;
            }
            case -11: 
            case -7: {
                if (this.aT != 1) break;
                this.aT = 0;
            }
        }
    }

    public void x(int n) {
        if (this.g(57) == 1) {
            this.d(57, 0);
            if (this.ar.u[this.ar.d][1][0] == 0 && this.ar.u[this.ar.d][0][0] == 0) {
                if ((this.ar.y[0] == 1 || this.ar.y[0] == 0 || this.ar.y[0] == 2 || this.ar.y[0] == 3 || this.ar.y[0] == 7 || this.ar.y[0] == 10 || this.ar.y[0] == 12) && (this.be[6] > 0 || this.be[6] == 0 && this.ar.C[0] - this.b(this.L(this.ar.d + 44)) >= 0)) {
                    if (this.be[6] == 0) {
                        this.ar.C[0] = this.ar.C[0] - this.b(this.L(this.ar.d + 44));
                    }
                    this.d(this.ar, 13, 0);
                    if (this.ae[4][0] < 3) {
                        this.be[73] = 0;
                        if (this.aO[0] == 4) {
                            byte[] byArray = this.ae[4];
                            byArray[0] = (byte)(byArray[0] + 1);
                        }
                    }
                    this.a(4, 0);
                    switch (this.L(this.ar.d + 44)) {
                        case 1: {
                            this.a(43, 1);
                            break;
                        }
                        case 2: {
                            this.a(44, 1);
                            break;
                        }
                        case 3: {
                            this.a(45, 1);
                            break;
                        }
                        case 4: {
                            this.a(46, 1);
                            break;
                        }
                        case 5: {
                            this.a(47, 1);
                            break;
                        }
                        case 6: {
                            this.a(48, 1);
                            break;
                        }
                        case 7: {
                            this.a(49, 1);
                            break;
                        }
                        case 8: {
                            this.a(50, 1);
                            break;
                        }
                        case 9: {
                            this.a(51, 1);
                            break;
                        }
                        case 10: {
                            this.a(52, 1);
                        }
                    }
                }
            } else if (this.L(this.ar.d + 44) == 7 || this.L(this.ar.d + 44) == 8 || this.L(this.ar.d + 44) == 9 || this.L(this.ar.d + 44) == 10) {
                this.ar.u[this.ar.d][1][0] = 0;
                byte by = this.ar.d;
                this.ar.c[by] = (byte)(this.ar.c[by] - 1);
            }
        }
        if (this.ar.y[0] == 12) {
            this.be[56] = this.g(53) == 1 || this.g(-5) == 1 ? (short)1 : 0;
        }
        if (this.be[57] == 1) {
            if (this.ar.y[0] == 11 || this.ar.y[0] == 12) {
                if (this.g(53) != 1 && this.g(-5) != 1) {
                    this.be[57] = 0;
                }
            } else {
                this.be[57] = 0;
            }
        }
        if (this.be[37] == 0) {
            if (!(this.g(53) != 1 && this.g(-5) != 1 || this.be[57] != 0 || this.ar.y[0] != 1 && this.ar.y[0] != 0 && this.ar.y[0] != 2 && this.ar.y[0] != 3 && this.ar.y[0] != 7 && this.ar.y[0] != 8 && this.ar.y[0] != 9 && this.ar.y[0] != 10 && this.ar.y[0] != 12)) {
                this.be[57] = 1;
                if (this.ar.n[5]) {
                    this.ar.aE[0] = 0;
                }
                this.d(this.ar, 11, 0);
                this.ar.ap = true;
                this.a(4, 1);
                switch (this.a(this.ar.d) % 5) {
                    case 0: {
                        this.a(61, 1);
                        break;
                    }
                    case 1: {
                        this.a(60, 1);
                        break;
                    }
                    case 2: {
                        this.a(59, 1);
                        break;
                    }
                    case 3: {
                        this.a(63, 1);
                        break;
                    }
                    case 4: {
                        this.a(62, 1);
                    }
                }
            }
        } else if (this.g(53) == 1 || this.g(-5) == 1) {
            this.d(53, 0);
            this.d(-5, 0);
            this.d(0, 0, 0);
            this.a(73, 1);
        }
        if (this.g(50) == 1 || this.g(-1) == 1) {
            this.d(50, 0);
            this.d(-1, 0);
            if (this.ar.n[4] && !this.ar.n[6]) {
                if (this.ar.y[0] == 8 || this.ar.y[0] == 9) {
                    if (this.ar.n[16]) {
                        this.ar.n[16] = false;
                    }
                    this.ar.n[6] = true;
                    this.ar.a(this.bm[0]);
                    this.ar.v = (short)(this.ar.v | 1);
                    this.d(this.ar, 8, 0);
                    this.a((i)this.ar, 10, 1);
                    this.ar.ap = true;
                    this.a(2, 0);
                    this.a(2, 1);
                }
            } else if (this.ar.n[5] && !this.ar.n[11] && !this.ar.n[4]) {
                if (this.ar.y[0] == 0 || this.ar.y[0] == 1 || this.ar.y[0] == 3 || this.ar.y[0] == 10 || this.ar.y[0] == 12 || this.ar.y[0] == 2) {
                    this.ar.v = (short)(this.ar.v | 1);
                    this.ar.n[4] = true;
                    this.ar.n[5] = false;
                    this.ar.a(this.bm[0]);
                    this.d(this.ar, 8, 0);
                    this.a((i)this.ar, 10, 1);
                    this.ar.ap = true;
                    this.a(1, 1);
                    this.a(2, 1);
                    this.b(this.ar, 10, 13, this.ar.P, this.ar.N, this.ar.ag, 26, 1, 1, -1, 0, 1);
                } else if (this.ar.y[0] == 7) {
                    this.d(this.ar, 0, 0);
                    this.a((i)this.ar, 10, 1);
                    this.ar.ap = true;
                }
            }
        }
        if (this.g(49) == 1 || this.g(51) == 1) {
            if (this.ar.n[4] && !this.ar.n[6] && (this.ar.y[0] == 8 || this.ar.y[0] == 9)) {
                this.ar.n[16] = true;
                this.ar.n[6] = true;
                this.ar.a(this.bm[0]);
                this.d(this.ar, 8, 0);
                this.a((i)this.ar, 10, 1);
                this.ar.ap = true;
            }
            if (!(!this.ar.n[5] || this.ar.n[11] || this.ar.n[4] || this.ar.y[0] != 0 && this.ar.y[0] != 1 && this.ar.y[0] != 3 && this.ar.y[0] != 10 && this.ar.y[0] != 2)) {
                this.ar.v = (short)(this.ar.v | 1);
                this.ar.n[4] = true;
                this.ar.n[5] = false;
                this.ar.n[16] = true;
                this.ar.a(this.bm[0]);
                this.d(this.ar, 8, 0);
                this.a((i)this.ar, 10, 1);
                this.ar.ap = true;
            }
            if (this.g(49) == 1) {
                this.ar.aw = (short)(this.ar.aw & 3);
                this.ar.aw = (short)(this.ar.aw | 4);
            }
            if (this.g(51) == 1) {
                this.ar.aw = (short)(this.ar.aw & 3);
                this.ar.aw = (short)(this.ar.aw | 8);
            }
            this.d(49, 0);
            this.d(51, 0);
        }
        if (this.g(-2) == 1 || this.g(56) == 1) {
            this.ar.n[18] = true;
        }
        if (this.g(52) == 1 || this.g(-3) == 1) {
            this.ar.v = (short)(this.ar.v & 3);
            this.ar.v = (short)(this.ar.v | 4);
            if (this.ar.n[16]) {
                this.ar.n[16] = false;
            }
        } else if (this.g(54) == 1 || this.g(-4) == 1) {
            this.ar.v = (short)(this.ar.v & 3);
            this.ar.v = (short)(this.ar.v | 8);
            if (this.ar.n[16]) {
                this.ar.n[16] = false;
            }
        }
    }

    public void D(int n) {
        this.bZ = n;
        this.aX = true;
        this.bB = 0;
    }

    public void j(int n) {
        this.aX = false;
        this.bZ = 0;
    }

    private boolean a(a a2, int n, int n2, int n3, int n4) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n5 = 0;
        int n6 = 0;
        if (a2 != null) {
            n5 = a2.N - 80;
            switch (a2.ag) {
                case 1: {
                    n6 = a2.P - 96 - 12;
                    break;
                }
                case 2: {
                    n6 = a2.P - 144;
                }
            }
        } else {
            n5 = n2;
            n6 = n;
        }
        int n7 = 12;
        int n8 = 0;
        int n9 = 0;
        if (this.aC[1] > n5) {
            n8 = 40;
        } else if (this.aC[1] < n5) {
            n8 = 40;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if (n6 < ag[0]) {
            n6 = ag[0];
        } else if (n6 > ag[1] - 240) {
            n6 = ag[1] - 240;
        }
        if (this.aC[0] < n6) {
            if (this.aC[0] < ag[1] - 240) {
                n9 = this.aC[0];
                this.aC[0] = this.aC[0] + n7;
                bl = true;
                if (this.aC[0] >= n6) {
                    this.aC[0] = n6;
                }
                this.c(0, n7, n8, this.aC[0] - n9);
            }
        } else if (this.aC[0] > n6 && this.aC[0] > ag[0]) {
            n9 = this.aC[0];
            this.aC[0] = this.aC[0] - n7;
            bl = true;
            if (this.aC[0] <= n6) {
                this.aC[0] = n6;
            }
            this.c(1, n7, n8, n9 - this.aC[0]);
        }
        if (this.aC[0] <= ag[0]) {
            if (ag[0] - this.aC[0] < n7) {
                this.aC[0] = ag[0];
            }
            if (this.aC[0] == ag[0]) {
                bl = false;
            }
        } else if (this.aC[0] >= ag[1] - 240) {
            if (this.aC[0] - (ag[1] - 240) < n7) {
                this.aC[0] = ag[1] - 240;
            }
            if (this.aC[0] == ag[1] - 240) {
                bl = false;
            }
        }
        if (this.aC[1] > n5) {
            if (this.aC[1] > ag[3]) {
                n9 = this.aC[1];
                this.aC[1] = this.aC[1] - n8;
                bl2 = true;
                if (this.aC[1] <= n5) {
                    this.aC[1] = n5;
                }
                this.c(2, n7, n8, n9 - this.aC[1]);
            }
        } else if (this.aC[1] < n5 && this.aC[1] < ag[2] - 260) {
            n9 = this.aC[1];
            this.aC[1] = this.aC[1] + n8;
            bl2 = true;
            if (this.aC[1] >= n5) {
                this.aC[1] = n5;
            }
            this.c(3, n7, n8, this.aC[1] - n9);
        }
        if (this.aC[1] >= ag[2] - 260) {
            if (this.aC[1] + 260 - ag[2] < n8) {
                this.aC[1] = ag[2] - 260;
            }
            if (this.aC[1] == ag[2] - 260) {
                bl2 = false;
            }
        } else if (this.aC[1] <= ag[3]) {
            if (ag[3] - this.aC[1] < n8) {
                this.aC[1] = ag[3];
            }
            if (this.aC[1] == ag[3]) {
                bl2 = false;
            }
        }
        return bl | bl2;
    }

    private void c(int n, int n2, int n3, int n4) {
        int n5 = n4;
        int n6 = n4;
        int n7 = 2;
        block0 : switch (n) {
            case 0: {
                switch (this.o) {
                    case 0: {
                        int[] nArray = this.Z[1];
                        nArray[0] = nArray[0] + n5 / 4;
                        if (this.Z[1][0] < 240) break;
                        this.Z[1][0] = 0;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a();
                    }
                }
                break;
            }
            case 1: {
                switch (this.o) {
                    case 0: {
                        int[] nArray = this.Z[1];
                        nArray[0] = nArray[0] - n5 / 4;
                        if (this.Z[1][0] >= 0) break;
                        int[] nArray2 = this.Z[1];
                        nArray2[0] = nArray2[0] + 240;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a();
                    }
                }
                break;
            }
            case 2: {
                switch (this.o) {
                    case 0: {
                        this.Z[1][1] = this.aC[1] + this.be[20];
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a();
                    }
                }
                break;
            }
            case 3: {
                switch (this.o) {
                    case 0: {
                        this.Z[1][1] = this.aC[1] + this.be[20];
                        break block0;
                    }
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a();
                    }
                }
            }
        }
    }

    private int[] j(a a2) {
        int[] nArray = new int[2];
        int n = a2.N - 80;
        if (n < 0) {
            n = 0;
        }
        switch (a2.ag) {
            case 1: {
                nArray[0] = a2.P - 96;
                break;
            }
            case 2: {
                nArray[0] = a2.P - 144;
            }
        }
        if (nArray[0] < ag[0]) {
            nArray[0] = ag[0];
        } else if (nArray[0] > ag[1] - 240) {
            nArray[0] = ag[1] - 240;
        }
        nArray[1] = n;
        if (nArray[1] > ag[2] - 260) {
            nArray[1] = ag[2] - 260;
        } else if (nArray[1] < ag[3]) {
            nArray[1] = ag[3];
        }
        return nArray;
    }

    private void a() {
        switch (this.o) {
            case 0: {
                this.Z[1][0] = 0;
                this.Z[1][1] = this.aC[1] + this.be[20];
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                this.Z[0][0] = this.aC[0] / 2;
                this.Z[1][0] = this.aC[0] / 2;
                this.Z[2][0] = this.aC[0] / 2;
                this.Z[0][1] = this.aC[1] / 2;
                this.Z[1][1] = this.aC[1] / 2;
                this.Z[2][1] = this.aC[1] / 2;
            }
        }
    }

    public void K() {
        try {
            block137: {
                this.F();
                block1 : switch (this.bf[0]) {
                    case 7: {
                        if (!this.e) {
                            this.j();
                            this.C();
                        }
                        this.N();
                        this.m();
                        break;
                    }
                    case 25: {
                        this.cl[0] = this.cl[0] + 1;
                        this.cl[1] = 12;
                        if (this.cl[0] < this.cl[1]) break;
                        this.cl[0] = 0;
                        for (int i2 = 0; i2 < this.bH.length; ++i2) {
                            this.bH[i2] = null;
                        }
                        this.cl[2] = 0;
                        this.cl[3] = 50;
                        this.W(34);
                        this.aq[10] = (short)Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % this.aZ.length);
                        this.bf[0] = 1;
                        break;
                    }
                    case 21: {
                        break;
                    }
                    case 1: {
                        this.cl[2] = this.cl[2] + 1;
                        this.cl[3] = 12;
                        switch (this.cl[2]) {
                            case 2: {
                                this.W(27);
                                this.a(27);
                                break;
                            }
                            case 4: {
                                this.W(33);
                                this.a(33);
                                break;
                            }
                            case 6: {
                                this.W(26);
                                this.a(26);
                                this.W(35);
                                break;
                            }
                            case 8: {
                                this.cj = this.a(33, 124, 122, 0, 1, 1);
                                break;
                            }
                        }
                        if (this.cl[2] < this.cl[3]) break;
                        this.cl[2] = 0;
                        this.cl[3] = 50;
                        this.aq[10] = this.aq[10] + 1;
                        this.aq[10] = this.aq[10] >= this.aZ.length ? 0 : this.aq[10];
                        e.a(this.bf, 21);
                        break;
                    }
                    case 16: {
                        if (this.cj == null) break;
                        this.a(this.cj);
                        if (!this.cj.F) break;
                        this.a(33);
                        this.p();
                        this.b(this.cj, 0, 2, this.be[13], this.be[14], 1, 33, 1, 1, -1, 0, 0);
                        this.a(this.cj, 1, 0);
                        this.o();
                        game.e e2 = new game.e(this.O);
                        byte[] byArray = new byte[]{-1};
                        if (e2.a() == 0) {
                            byArray[0] = -1;
                        } else {
                            byArray = e2.a(1);
                        }
                        this.be[34] = byArray[0];
                        e2.b();
                        e2 = null;
                        if (this.be[34] > 0) {
                            this.bI[this.aU][this.aY[this.aU]][0] = 1;
                        }
                        e.a(this.bf, 4);
                        e.f(this.q, 1);
                        break;
                    }
                    case 2: {
                        this.cl[3] = 40;
                        this.cl[2] = this.cl[2] + 1;
                        switch (this.cl[2]) {
                            case 2: {
                                this.c(33);
                                this.N(33);
                                this.W(0);
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
                                break;
                            }
                            case 14: {
                                break;
                            }
                            case 16: {
                                this.W(27);
                                this.W(28);
                                this.W(29);
                                this.W(30);
                                this.W(31);
                                this.W(32);
                                this.W(36);
                                break;
                            }
                            case 18: {
                                this.a(0);
                                for (int i3 = 27; i3 <= 32; ++i3) {
                                    this.a(i3);
                                }
                                this.a[0] = game.b.a(e.e("/data/data/roompropdata0.mid"));
                                this.a[1] = game.b.a(e.e("/data/data/roompropdata1.mid"));
                                break;
                            }
                            case 20: {
                                this.be = new short[this.be.length];
                                game.e e3 = new game.e(this.O);
                                byte[] byArray = new byte[]{-1};
                                if (e3.a() == 0) {
                                    byArray[0] = -1;
                                } else {
                                    byArray = e3.a(1);
                                }
                                this.be[34] = byArray[0];
                                e3.b();
                                e3 = null;
                                if (this.be[34] < 0) {
                                    this.h();
                                } else {
                                    this.O();
                                    if (this.be[34] < 0) {
                                        this.h();
                                    }
                                }
                                this.Q();
                                break;
                            }
                            case 22: {
                                if (this.aq[0] != 0 || this.bh[1] == null) break;
                                for (int i4 = 0; i4 < 5; ++i4) {
                                    this.bh[1][i4] = null;
                                }
                                System.gc();
                                break;
                            }
                            case 26: {
                                if (this.aq[0] == 0) {
                                    this.cb = game.b.a("/data/data/monsters.mid");
                                    this.aa = null;
                                    this.X[0] = game.b.a("/data/data/enemydropprop_0.mid");
                                    this.J[0] = game.b.a("/data/data/bossdropprop_0.mid");
                                    this.ba[0] = game.b.a(e.e("/data/data/roomnpcdata_0.mid"));
                                    this.X[1] = null;
                                    this.J[1] = null;
                                    this.ba[1] = null;
                                } else {
                                    this.cb = null;
                                    this.aa = game.b.a("/data/data/monsters_two.mid");
                                    this.X[0] = null;
                                    this.J[0] = null;
                                    this.ba[0] = null;
                                    this.X[1] = game.b.a("/data/data/enemydropprop_1.mid");
                                    this.J[1] = game.b.a("/data/data/bossdropprop_1.mid");
                                    this.ba[1] = game.b.a(e.e("/data/data/roomnpcdata_1.mid"));
                                }
                                this.b = game.b.c("/data/data/allstring.mid");
                                this.bP = game.b.a("/data/data/arrow.mid");
                                break;
                            }
                            case 28: {
                                int n;
                                this.bk = null;
                                for (n = 0; n < this.ba[this.aq[0]].length; ++n) {
                                    if (this.ba[this.aq[0]][n][0][0] != this.G) continue;
                                    this.bk = new a[this.ba[this.aq[0]][n].length - 1];
                                    for (int i5 = 1; i5 < this.ba[this.aq[0]][n].length; ++i5) {
                                        this.bk[i5 - 1] = this.a(this.ba[this.aq[0]][n][i5][2], this.ba[this.aq[0]][n][i5][0] * this.by, this.ba[this.aq[0]][n][i5][1] * this.ab + this.ab, 0, 0, 1);
                                    }
                                }
                                this.be[35] = 0;
                                this.be[86] = 0;
                                this.be[52] = 0;
                                if (this.be[34] >= 0) {
                                    this.be[35] = 1;
                                    if (this.bk != null) {
                                        for (n = 0; n < this.bk.length; ++n) {
                                            if (this.bk[n].au != 29) continue;
                                            this.a(this.bk[n], 2, 0);
                                        }
                                    }
                                }
                                this.aA = this.bi[this.G * 3];
                                this.bb[this.G] = 1;
                                this.s(this.aA);
                                this.aV = new a();
                                this.aV.af = new int[14][12];
                                this.E();
                                this.L();
                                this.r();
                                this.bJ = this.o;
                                this.o = this.b((byte)this.aA);
                                this.h(this.aq[0], this.o);
                                this.aP = this.o;
                                this.b(0, this.B, this.d, 0);
                                if (this.bJ != this.o) {
                                    this.ac[this.bJ] = null;
                                }
                                this.be[87] = 0;
                                this.be[88] = 0;
                                this.ac[this.o] = game.b.b(e.e("/data/data/mapmodule_" + this.o + ".mid"));
                                break;
                            }
                            case 32: {
                                int n;
                                this.be[22] = (short)e.a(this.G, this.aD[this.aq[0]]);
                                for (n = 1; n <= 25; ++n) {
                                    this.c(n);
                                    this.N(n);
                                }
                                if (this.aq[0] == 0) {
                                    this.c = new game.c[this.cb[this.G].length];
                                    for (n = 0; n < this.c.length; ++n) {
                                        this.a((int)this.cb[this.G][n][0]);
                                        this.W(this.cb[this.G][n][0]);
                                        if (this.cb[this.G][n][0] == 24) {
                                            this.a(2);
                                            this.W(2);
                                        }
                                        this.c[n] = (game.c)this.a((int)this.cb[this.G][n][0], this.cb[this.G][n][1], this.cb[this.G][n][2] * this.by, this.cb[this.G][n][3] * this.ab + this.ab, this.cb[this.G][n][4] * this.by, this.cb[this.G][n][5] * this.ab, this.cb[this.G][n][6] * this.by, this.cb[this.G][n][7] * this.ab, (int)this.cb[this.G][n][8]);
                                    }
                                } else {
                                    this.c = new game.c[this.aa[this.G].length];
                                    for (n = 0; n < this.c.length; ++n) {
                                        this.a((int)this.aa[this.G][n][0]);
                                        this.W(this.aa[this.G][n][0]);
                                        if (this.aa[this.G][n][0] == 24) {
                                            this.a(2);
                                            this.W(2);
                                        }
                                        this.c[n] = (game.c)this.a((int)this.aa[this.G][n][0], this.aa[this.G][n][1], this.aa[this.G][n][2] * this.by, this.aa[this.G][n][3] * this.ab + this.ab, this.aa[this.G][n][4] * this.by, this.aa[this.G][n][5] * this.ab, this.aa[this.G][n][6] * this.by, this.aa[this.G][n][7] * this.ab, (int)this.aa[this.G][n][8]);
                                    }
                                }
                                break;
                            }
                            case 36: {
                                this.aC = this.j(this.ar);
                                this.d(0, 0, 0);
                                this.U = this.a(this.G, this.a[this.aq[0]]);
                                this.S = this.a(this.G, this.T);
                                this.be[24] = 0;
                                if (this.aq[0] == 0 || (this.N != null && this.be[22] >= 0 || this.be[22] < 0) && this.aq[0] > 0) {
                                    this.L = this.b(this.G, this.bx[this.aq[0]]);
                                }
                                this.ao[0] = 0;
                                break;
                            }
                        }
                        if (this.cl[2] <= this.cl[3]) break;
                        this.cl[2] = 0;
                        this.aq[10] = this.aq[10] + 1;
                        int n = this.aq[10] = this.aq[10] >= this.aZ.length ? 0 : this.aq[10];
                        if (this.be[34] < 0) {
                            e.a(this.bf, 4);
                            e.f(this.q, 18);
                            this.R();
                            this.be[65] = 220;
                            this.be[41] = (short)((this.b[2][0][0][0].length() + 1) / (this.be[65] / game.b.a(game.j.aF[0])));
                            this.be[42] = 295;
                            this.be[43] = 25;
                            break;
                        }
                        e.a(this.bf, 7);
                        this.e = true;
                        e.f(this.q, 26);
                        break;
                    }
                    case 22: {
                        this.cl[3] = 10;
                        this.cl[2] = this.cl[2] + 1;
                        switch (this.cl[2]) {
                            case 1: {
                                for (int i6 = 1; i6 <= 25; ++i6) {
                                    this.c(i6);
                                    this.N(i6);
                                }
                                this.N = null;
                                this.c = null;
                                this.k();
                                System.gc();
                                break;
                            }
                            case 5: {
                                this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                                this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                                this.G = this.bj;
                                this.bb[this.G] = 1;
                                this.aA = this.bi[this.G * 3];
                                this.bJ = this.o;
                                this.o = this.b((byte)this.aA);
                                this.h(this.aq[0], this.o);
                                if (this.bJ != this.o) {
                                    this.ac[this.bJ] = null;
                                    this.ac[this.o] = null;
                                    this.ac[this.o] = game.b.b(e.e("/data/data/mapmodule_" + this.o + ".mid"));
                                    this.be[87] = 0;
                                    this.be[88] = 0;
                                } else {
                                    this.be[87] = 3;
                                    this.be[88] = 0;
                                }
                                this.aP = this.o;
                                this.s(this.aA);
                                this.aV = new a();
                                this.aV.af = new int[14][12];
                                this.E();
                                this.L();
                                this.r();
                                this.d(0, 0, 0);
                                this.be[45] = 0;
                                this.be[54] = 0;
                                this.b(0, this.B, this.d, 0);
                                game.a.a(this.ar, z[0], z[1]);
                                this.ar.m[1] = this.ar.m[0];
                                if (this.be[53] != 1) break;
                                this.cb = null;
                                this.aa = game.b.a("/data/data/monsters_two.mid");
                                this.X[0] = null;
                                this.J[0] = null;
                                this.ba[0] = null;
                                this.X[1] = game.b.a("/data/data/enemydropprop_1.mid");
                                this.J[1] = game.b.a("/data/data/bossdropprop_1.mid");
                                this.ba[1] = game.b.a(e.e("/data/data/roomnpcdata_1.mid"));
                                break;
                            }
                            case 6: {
                                int n;
                                this.aC = this.j(this.ar);
                                this.a();
                                this.be[22] = (short)e.a(this.G, this.aD[this.aq[0]]);
                                if (this.be[22] < 0 || this.be[22] >= 0 && this.bL[this.aq[0]][this.be[22]][0] == 0) {
                                    if (this.aq[0] == 0) {
                                        this.c = new game.c[this.cb[this.G].length];
                                        for (n = 0; n < this.c.length; ++n) {
                                            this.a((int)this.cb[this.G][n][0]);
                                            this.W(this.cb[this.G][n][0]);
                                            if (this.cb[this.G][n][0] == 24) {
                                                this.a(2);
                                                this.W(2);
                                            }
                                            this.c[n] = (game.c)this.a((int)this.cb[this.G][n][0], this.cb[this.G][n][1], this.cb[this.G][n][2] * this.by, this.cb[this.G][n][3] * this.ab + this.ab, this.cb[this.G][n][4] * this.by, this.cb[this.G][n][5] * this.ab, this.cb[this.G][n][6] * this.by, this.cb[this.G][n][7] * this.ab, (int)this.cb[this.G][n][8]);
                                        }
                                    } else {
                                        this.c = new game.c[this.aa[this.G].length];
                                        for (n = 0; n < this.c.length; ++n) {
                                            this.a((int)this.aa[this.G][n][0]);
                                            this.W(this.aa[this.G][n][0]);
                                            if (this.aa[this.G][n][0] == 24) {
                                                this.a(2);
                                                this.W(2);
                                            }
                                            this.c[n] = (game.c)this.a((int)this.aa[this.G][n][0], this.aa[this.G][n][1], this.aa[this.G][n][2] * this.by, this.aa[this.G][n][3] * this.ab + this.ab, this.aa[this.G][n][4] * this.by, this.aa[this.G][n][5] * this.ab, this.aa[this.G][n][6] * this.by, this.aa[this.G][n][7] * this.ab, (int)this.aa[this.G][n][8]);
                                        }
                                    }
                                    if (this.be[22] >= 0 && this.bL[this.aq[0]][this.be[22]][1] == 23) {
                                        if (this.aq[0] == 0) {
                                            game.c.a(this.c[0], (byte)17);
                                        }
                                    } else if (this.be[22] >= 0 && this.bL[this.aq[0]][this.be[22]][1] == 19) {
                                        this.be[54] = 1;
                                    }
                                } else {
                                    this.c = null;
                                    if (this.bQ[this.aq[0]][this.be[22]] > 0) {
                                        this.N = this.a(26, this.bL[this.aq[0]][this.be[22]][7] * this.by, this.bL[this.aq[0]][this.be[22]][8] * this.ab, 57, 0, 0);
                                    }
                                }
                                if (this.be[22] >= 0 && this.bL[this.aq[0]][this.be[22]][1] != 19 && this.bL[this.aq[0]][this.be[22]][1] != 24 && this.bq[this.J[this.aq[0]][this.bL[this.aq[0]][this.be[22]][1] - 19][0][0]] == 0) {
                                    this.be[71] = 1;
                                }
                                this.bk = null;
                                for (n = 0; n < this.ba[this.aq[0]].length; ++n) {
                                    if (this.ba[this.aq[0]][n][0][0] != this.G) continue;
                                    this.bk = new a[this.ba[this.aq[0]][n].length - 1];
                                    for (int i7 = 1; i7 < this.ba[this.aq[0]][n].length; ++i7) {
                                        this.bk[i7 - 1] = this.a(this.ba[this.aq[0]][n][i7][2], this.ba[this.aq[0]][n][i7][0] * this.by, this.ba[this.aq[0]][n][i7][1] * this.ab + this.ab, 0, 0, 1);
                                    }
                                }
                                this.be[35] = 0;
                                this.be[86] = 0;
                                this.be[52] = 0;
                                this.be[1] = 0;
                                this.be[21] = 0;
                                this.be[19] = 0;
                                this.be[20] = 0;
                                this.be[24] = 0;
                                this.be[61] = 0;
                                this.be[76] = 0;
                                this.be[72] = 0;
                                this.be[62] = 5;
                                this.bR = 0;
                                this.U = null;
                                this.U = this.a(this.G, this.a[this.aq[0]]);
                                this.S = null;
                                this.S = this.a(this.G, this.T);
                                if (this.aq[0] != 0 && ((this.N == null || this.be[22] < 0) && this.be[22] >= 0 || this.aq[0] <= 0)) break;
                                this.L = this.b(this.G, this.bx[this.aq[0]]);
                                break;
                            }
                            case 7: {
                                System.gc();
                            }
                        }
                        if (this.cl[2] < this.cl[3]) break;
                        this.cl[2] = 0;
                        this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                        this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                        if (this.be[53] == 1) {
                            this.be[53] = 0;
                            this.be[61] = 0;
                            this.be[76] = 0;
                            this.a(21, 1);
                            this.e = false;
                            e.a(this.bf, 7);
                        } else {
                            this.e = false;
                            e.a(this.bf, 7);
                            this.a(25, 1);
                        }
                        if (this.bJ != this.o) {
                            this.R();
                        } else if (this.be[22] >= 0 && this.bL[this.aq[0]][this.be[22]][0] == 0) {
                            this.f();
                        }
                        if (this.aq[9] != 0 || this.G != 20) break;
                        this.d(0, 0, 0);
                        this.aq[9] = 1;
                        this.e = true;
                        e.a(this.bf, 4);
                        e.f(this.q, 27);
                        this.be[65] = 220;
                        this.be[41] = (short)((this.b[2][0][2][0].length() + 1) / (this.be[65] / game.b.a(game.j.aF[0])));
                        this.be[42] = 295;
                        this.be[43] = 25;
                        break;
                    }
                    case 26: {
                        this.cl[3] = 5;
                        this.cl[2] = this.cl[2] + 1;
                        switch (this.cl[2]) {
                            case 1: {
                                for (int i8 = 1; i8 <= 25; ++i8) {
                                    this.c(i8);
                                    this.N(i8);
                                }
                                this.N = null;
                                this.c = null;
                                System.gc();
                                this.L = new a[0];
                                this.aV = new a();
                                this.aV.af = new int[14][12];
                                this.d(0, 0, 0);
                                this.be[45] = 0;
                                this.b(0, this.B, this.d, 0);
                                game.a.a(this.ar, 20, 80);
                                this.ar.m[1] = this.ar.m[0];
                                this.ar.ag = 1;
                                break;
                            }
                            case 2: {
                                this.be[22] = (short)e.a(this.G, this.aD[this.aq[0]]);
                                if (this.aq[0] == 0) {
                                    this.c = new game.c[this.cb[this.G].length];
                                    for (int i9 = 0; i9 < this.c.length; ++i9) {
                                        this.a((int)this.cb[this.G][i9][0]);
                                        this.W(this.cb[this.G][i9][0]);
                                        if (this.cb[this.G][i9][0] == 24) {
                                            this.a(2);
                                            this.W(2);
                                        }
                                        this.c[i9] = (game.c)this.a((int)this.cb[this.G][i9][0], this.cb[this.G][i9][1], this.cb[this.G][i9][2] * this.by, this.cb[this.G][i9][3] * this.ab + this.ab, this.cb[this.G][i9][4] * this.by, this.cb[this.G][i9][5] * this.ab, this.cb[this.G][i9][6] * this.by, this.cb[this.G][i9][7] * this.ab, (int)this.cb[this.G][i9][8]);
                                        this.cb[this.G][i9][1] = 2;
                                    }
                                } else {
                                    this.c = new game.c[this.aa[this.G].length];
                                    for (int i10 = 0; i10 < this.c.length; ++i10) {
                                        this.a((int)this.aa[this.G][i10][0]);
                                        this.W(this.aa[this.G][i10][0]);
                                        if (this.aa[this.G][i10][0] == 24) {
                                            this.a(2);
                                            this.W(2);
                                        }
                                        this.c[i10] = (game.c)this.a((int)this.aa[this.G][i10][0], this.aa[this.G][i10][1], this.aa[this.G][i10][2] * this.by, this.aa[this.G][i10][3] * this.ab + this.ab, this.aa[this.G][i10][4] * this.by, this.aa[this.G][i10][5] * this.ab, this.aa[this.G][i10][6] * this.by, this.aa[this.G][i10][7] * this.ab, (int)this.aa[this.G][i10][8]);
                                        this.aa[this.G][i10][1] = 2;
                                    }
                                }
                                this.aC = this.j(this.ar);
                                this.a();
                                this.be[35] = 0;
                                this.be[86] = 0;
                                this.be[52] = 0;
                                this.be[1] = 0;
                                this.be[21] = 0;
                                this.be[19] = 0;
                                this.be[20] = 0;
                                this.be[24] = 0;
                                this.b(this.ar, 10, 13, this.ar.P, this.ar.N, this.ar.ag, 26, 1, 0, -1, 0, 1);
                                break;
                            }
                        }
                        if (this.cl[2] < this.cl[3]) break;
                        this.e = false;
                        this.cl[2] = 0;
                        this.bR = 0;
                        e.a(this.bf, 7);
                        this.R();
                        break;
                    }
                    case 4: {
                        switch (this.q[0]) {
                            case 12: {
                                int n;
                                boolean bl;
                                int n2;
                                if (this.aJ[this.aU] == 28 && this.aY[this.aU] == 2) {
                                    n2 = -1;
                                    bl = false;
                                    if (this.aT == 6) {
                                        this.be[10] = (short)(this.be[10] + 1);
                                        if (this.be[10] >= this.be[11]) {
                                            this.be[10] = this.be[11];
                                            bl = true;
                                        }
                                        if (bl) {
                                            this.be[15] = (short)(this.be[15] + 1);
                                            if (this.be[15] >= this.be[16]) {
                                                this.be[15] = 0;
                                                this.be[10] = 0;
                                                n2 = this.F[this.bI[this.aU][0][0]];
                                                for (n = 0; n < this.ai[n2 - 20][0].length / 2; ++n) {
                                                    byte by = this.ai[n2 - 20][0][2 * n];
                                                    this.bq[by] = this.bq[by] - this.ai[n2 - 20][0][2 * n + 1] * this.be[8];
                                                }
                                                this.a((int)this.ai[n2 - 20][1][0], (int)this.be[8], 0);
                                                this.aT = 0;
                                                this.aY[this.aU] = 3;
                                            }
                                        }
                                    }
                                }
                                if (this.aJ[this.aU] == 29 && this.aY[this.aU] == 2) {
                                    n2 = -1;
                                    bl = false;
                                    if (this.aT == 5) {
                                        this.be[10] = (short)(this.be[10] + 1);
                                        if (this.be[10] >= this.be[11]) {
                                            this.be[10] = this.be[11];
                                            bl = true;
                                        }
                                        if (bl) {
                                            this.be[15] = (short)(this.be[15] + 1);
                                            if (this.be[15] >= this.be[16]) {
                                                this.be[15] = 0;
                                                this.be[10] = 0;
                                                n2 = this.ci[this.bI[this.aU][0][0]];
                                                n = -1;
                                                for (int i11 = 0; i11 < this.ai[n2 - 20][0].length / 2; ++i11) {
                                                    if (this.bq[this.ai[n2 - 20][0][2 * i11]] >= this.ai[n2 - 20][0][2 * i11 + 1]) continue;
                                                    n = this.ai[n2 - 20][0][2 * i11] + 9;
                                                    for (int i12 = 0; i12 < this.ai[n - 20][0].length / 2; ++i12) {
                                                        byte by = this.ai[n - 20][0][2 * i12];
                                                        this.bq[by] = this.bq[by] - this.ai[n - 20][0][2 * i12 + 1] * (this.ai[n2 - 20][0][2 * i11 + 1] - this.bq[this.ai[n2 - 20][0][2 * i11]]);
                                                    }
                                                    this.bq[this.ai[n2 - 20][0][2 * i11]] = this.ai[n2 - 20][0][2 * i11 + 1];
                                                }
                                                this.aT = (byte)3;
                                                this.aY[this.aU] = 2;
                                            }
                                        }
                                    }
                                    if (this.aT == 6) {
                                        this.be[10] = (short)(this.be[10] + 1);
                                        if (this.be[10] >= this.be[11]) {
                                            this.be[10] = this.be[11];
                                            bl = true;
                                        }
                                        if (bl) {
                                            this.be[15] = (short)(this.be[15] + 1);
                                            if (this.be[15] >= this.be[16]) {
                                                this.be[15] = 0;
                                                this.be[10] = 0;
                                                n2 = this.ci[this.bI[this.aU][0][0]];
                                                for (n = 0; n < this.ai[n2 - 20][0].length / 2; ++n) {
                                                    byte by = this.ai[n2 - 20][0][2 * n];
                                                    this.bq[by] = this.bq[by] - this.ai[n2 - 20][0][2 * n + 1];
                                                }
                                                this.bc = this.a(this.bc, this.aj, 1, (int)this.ai[n2 - 20][1][0]);
                                                this.aT = (byte)8;
                                                this.aY[this.aU] = 2;
                                                break block1;
                                            }
                                        }
                                    }
                                }
                                break block137;
                            }
                            case 18: {
                                this.be[42] = (short)(this.be[42] - 2);
                                if (this.be[42] + this.be[41] * this.be[43] <= 160) {
                                    this.a(5, 1);
                                    e.a(this.bf, 7);
                                    e.f(this.q, 0);
                                    break block1;
                                }
                                break block137;
                            }
                            case 21: {
                                this.be[42] = (short)(this.be[42] - 2);
                                if (this.be[42] + this.be[41] * this.be[43] <= 160) {
                                    this.e = false;
                                    e.a(this.bf, 7);
                                    e.f(this.q, 0);
                                    break block1;
                                }
                                break block137;
                            }
                            case 27: {
                                this.be[42] = (short)(this.be[42] - 2);
                                if (this.be[42] + this.be[41] * this.be[43] <= 160) {
                                    this.d(0, 0, 0);
                                    this.e = false;
                                    e.a(this.bf, 7);
                                    e.f(this.q, 0);
                                    break block1;
                                }
                                break block137;
                            }
                            case 1: {
                                if (this.cj != null) {
                                    this.a(this.cj);
                                    break block1;
                                }
                                break block137;
                            }
                            case 11: {
                                this.H();
                            }
                        }
                    }
                }
            }
            if (this.be[47] == 1 && this.be[68] > 0) {
                this.be[68] = (short)(this.be[68] - 1);
            }
            this.Y.a(this.cl);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void C() {
        if (this.be[21] >= 0) {
            if (this.be[21] == 0) {
                this.be[19] = 0;
                this.be[20] = 0;
            } else {
                this.be[20] = (short)(this.be[21] % 2 == 1 ? -4 : 4);
                this.be[21] = (short)(this.be[21] - 1);
            }
        }
        this.a((i)this.ar);
        this.a(this.U);
        this.a(this.S);
        this.a(this.L);
        this.a(this.L, this.bx[this.aq[0]]);
        this.b(this.U, this.a[this.aq[0]]);
        this.b(this.S, this.T);
        this.a((a)this.ar, 0, 0, 3, 3);
        this.w();
        this.h(this.ar);
        this.a((a)this.ar, null);
        this.d(this.ar);
        this.c(this.ar, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
        this.c(this.ar);
        this.b(this.ar);
        this.a((a)this.ar, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
        this.H();
        this.J();
        this.y();
        this.x();
        if (this.be[22] < 0 || this.c == null || this.be[22] >= 0 && this.c[0].a[0] == 0 || this.be[22] == 0 && !this.c[0].Q) {
            if (this.be[22] >= 0) {
                if (this.be[62] <= 0) {
                    this.A(this.G);
                } else {
                    this.be[62] = (short)(this.be[62] - 1);
                }
            } else {
                this.A(this.G);
            }
        }
        this.u();
        if (!this.ar.n[11]) {
            this.ar.v = (short)(this.ar.v & 3);
            this.ar.n[18] = false;
        }
    }

    private void N() {
        switch (this.q[0]) {
            case 14: {
                if (this.aT != 0) break;
                this.cl[2] = this.cl[2] + 1;
                this.cl[3] = 20;
                switch (this.cl[2]) {
                    case 2: {
                        this.I();
                    }
                }
                if (this.cl[2] < this.cl[3]) break;
                this.cl[2] = 0;
                this.aT = 1;
                this.aq[10] = this.aq[10] + 1;
                this.aq[10] = this.aq[10] >= this.aZ.length ? 0 : this.aq[10];
                break;
            }
            case 22: {
                this.be[64] = (short)(this.be[64] - 1);
                if (this.be[64] > 0) break;
                this.e = false;
                e.a(this.bf, 7);
                e.f(this.q, 0);
                if (this.be[7] == 0 && this.aq[0] == 1 && this.bL[this.aq[0]][this.be[22]][1] == 24) break;
            }
        }
    }

    private void u() {
        if (this.ar.n[0]) {
            this.ar.n[0] = false;
            this.be[58] = 1;
            this.be[59] = 3;
            ch = 300;
            this.d(0, 0, 0);
        }
        if (this.be[58] != 0) {
            if (this.be[58] == 1) {
                if (this.be[59] <= 0) {
                    this.be[58] = 2;
                    this.be[59] = 4;
                } else {
                    this.be[59] = (short)(this.be[59] - 1);
                }
            } else if (this.be[58] == 2) {
                if (this.be[59] <= 0) {
                    this.be[58] = 3;
                    ch = 80;
                    this.be[59] = 5;
                    this.f(8, 1);
                } else {
                    this.be[59] = (short)(this.be[59] - 1);
                }
            } else if (this.be[58] == 3) {
                if (this.be[59] <= 0) {
                    this.d(0, 0, 0);
                    this.be[58] = 0;
                    this.be[61] = 0;
                    this.be[76] = 0;
                    ch = 80;
                    e.a(this.bf, 7);
                    e.f(this.q, 19);
                    this.e = true;
                    if (this.aG[0][3] >= this.aG[0][2]) {
                        this.U(3);
                    }
                } else {
                    this.be[59] = (short)(this.be[59] - 1);
                }
            }
        }
        if (this.be[58] > 0) {
            this.ar.ar[0] = 5;
            this.ar.az = 0;
        }
    }

    private void H() {
        int n;
        this.c();
        for (n = 0; n < this.co.length; ++n) {
            this.co[n] = 0;
        }
        for (n = 0; n < 3; ++n) {
            if (this.aj[this.ar.j][3 + n * 2] <= 0) continue;
            byte by = this.aj[this.ar.j][3 + n * 2 + 1];
            this.co[by] = this.co[by] + this.c(this.aj[this.ar.j][3 + n * 2 + 1], 10);
        }
        if (this.be[6] > 0) {
            this.be[6] = (short)(this.be[6] - 1);
        }
        if (this.ar.u[this.ar.d][1][0] == 0 && this.be[6] == 0 && (this.ah[0] = this.ah[0] - 1) <= 0) {
            this.ah[0] = this.ah[1];
            this.ar.C[0] = this.ar.C[0] + 1;
            if (this.ar.C[0] >= this.ar.C[1]) {
                this.ar.C[0] = this.ar.C[1];
            }
        }
        this.ar.Z[1] = this.ar.a[0] < this.ar.a[1] * 2 / 5 ? this.ar.Z[0] + this.at[this.ar.d][0] * (100 + this.bE[this.aj[this.ar.j][2]]) * (100 + this.co[6] + this.co[8]) / 10000 : this.ar.Z[0] + this.at[this.ar.d][0] * (100 + this.bE[this.aj[this.ar.j][2]]) * (100 + this.co[6]) / 10000;
        this.ar.ac[1] = this.ar.ac[0];
        if (this.ao[0] > 0) {
            this.ao[0] = this.ao[0] - 1;
        } else if (this.ar.S[0] < this.ar.S[1]) {
            this.ar.S[0] = (short)(this.ar.S[0] + 1);
        }
        for (n = 0; n < this.ca.length; ++n) {
            this.ar.n[15] = false;
            this.be[5] = 1;
            int[] nArray = this.ca[n].af[0];
            short s = this.bX[nArray[0]][nArray[1]][nArray[2]][1];
            if (this.a(this.ar, this.ca[n].P + this.bO[nArray[0]][s][0], this.ca[n].N - this.bO[nArray[0]][s][1], this.bO[nArray[0]][s][2] - this.bO[nArray[0]][s][0], this.bO[nArray[0]][s][3] - this.bO[nArray[0]][s][1], 10, 1) != 1000 || this.ar.as[0] <= 0 || this.ar.a[0] <= 0 || this.ar.u[this.ar.d][1][0] == 1 && (this.L(this.ar.d + 44) == 8 || this.L(this.ar.d + 44) == 7)) continue;
            this.d(this.ar, 4, 0);
            this.ar.v = (short)(this.ar.v & 3);
            this.ar.aw = (short)(this.ar.aw & 3);
            this.ar.v = (short)(this.ar.v | (this.ar.ag == 1 ? 4 : 8));
            this.ar.n[11] = true;
            this.ar.n[4] = true;
            this.ar.n[5] = false;
            this.ar.a(this.bm[3]);
        }
        for (n = 0; n < this.aN.length; ++n) {
            this.ar.n[15] = false;
            this.be[5] = 1;
            if (this.a(this.ar, this.aN[n].P, this.aN[n].N + 20, 20, 20, 10, 1) != 1000 || this.ar.as[0] <= 0 || this.ar.a[0] <= 0 || this.ar.u[this.ar.d][1][0] == 1 && (this.L(this.ar.d + 44) == 8 || this.L(this.ar.d + 44) == 7)) continue;
            this.d(this.ar, 4, 0);
            this.ar.v = (short)(this.ar.v & 3);
            this.ar.aw = (short)(this.ar.aw & 3);
            this.ar.v = (short)(this.ar.v | (this.ar.ag == 1 ? 4 : 8));
            this.ar.n[11] = true;
            this.ar.n[4] = true;
            this.ar.n[5] = false;
            this.ar.a(this.bm[3]);
        }
        if (this.ar.a[0] <= this.ar.a[1] / 5) {
            this.be[69] = (short)this.G();
            if (this.be[61] == 0 && this.be[69] >= 0) {
                this.b(this.aV, 11, 29 + this.be[69], 0, 0, 1, 28, 1, 1, -1, 1, 1);
                this.be[61] = 1;
            }
        }
        if (this.ar.C[0] <= this.ar.C[1] / 10) {
            this.be[75] = (short)this.P();
            if (this.be[76] == 0 && this.be[75] >= 0) {
                this.b(this.aV, 13, 33, 0, 0, 1, 28, 1, 1, -1, 1, 1);
                this.be[76] = 1;
            }
        }
        if (this.q[0] == 0 && this.be[71] == 1) {
            this.be[71] = 0;
            this.p();
            this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.o();
            this.e = true;
            e.f(this.q, 25);
        }
    }

    public int c(int n, int n2) {
        int n3 = 0;
        switch (n) {
            case 0: {
                n3 = 3 * n2;
                break;
            }
            case 1: {
                n3 = n2 / 2;
                break;
            }
            case 2: {
                n3 = 10 * n2;
                break;
            }
            case 3: {
                n3 = 10 * n2;
                break;
            }
            case 4: {
                n3 = 10 * n2;
                break;
            }
            case 5: {
                n3 = n2;
                break;
            }
            case 6: {
                n3 = 10 * n2;
                break;
            }
            case 7: {
                n3 = 30 * n2;
                break;
            }
            case 8: {
                n3 = 50 + 20 * n2;
            }
        }
        return n3;
    }

    private int G() {
        int n = -1;
        if (this.bq[0] > 0) {
            n = 0;
        } else if (this.bq[1] > 0) {
            n = 1;
        } else if (this.bq[2] > 0) {
            n = 2;
        }
        return n;
    }

    private int P() {
        int n = -1;
        if (this.bq[3] > 0) {
            n = 3;
        }
        return n;
    }

    private void J() {
        if (this.c != null) {
            for (int i2 = 0; i2 < this.c.length; ++i2) {
                if (this.c[i2] == null) continue;
                if (this.c[i2].ah == 0) {
                    this.a((i)this.c[i2]);
                }
                if (this.c[i2].au >= 1 && this.c[i2].au <= 18) {
                    this.b(this.c[i2]);
                } else if (this.c[i2].au >= 19 && this.c[i2].au <= 25) {
                    this.a(this.c[i2]);
                }
                if (this.c[i2].aE[0] > 0 && this.c[i2].ak == 0) {
                    this.e((a)this.c[i2]);
                }
                this.c(this.c[i2], this.aC[0], this.aC[1]);
                this.c((a)this.c[i2]);
                this.b((a)this.c[i2]);
                this.a((a)this.c[i2], this.aC[0], this.aC[1]);
                this.c(this.c[i2]);
                this.e(this.c[i2]);
                this.d(this.c[i2]);
            }
        }
    }

    private void w() {
        int[] nArray;
        if (this.ar.n[5]) {
            switch (this.ar.y[0]) {
                case 1: 
                case 2: {
                    if ((this.ar.v & 0xC) == 0) {
                        this.d(this.ar, 3, 0);
                        this.ar.ap = true;
                        break;
                    }
                    if (this.ar.y[0] == 1) break;
                    if (this.ar.ag == 2 && (this.ar.v & 0xC) == 8 || this.ar.ag == 1 && (this.ar.v & 0xC) == 4) {
                        this.d(this.ar, 1, 0);
                        this.ar.ap = true;
                    } else {
                        this.d(this.ar, 2, 0);
                    }
                    if ((this.ar.v & 0xC) == 4) {
                        this.ar.ag = (byte)2;
                        break;
                    }
                    if ((this.ar.v & 0xC) != 8) break;
                    this.ar.ag = 1;
                }
            }
        } else {
            this.ar.v = (short)(this.ar.v | 2);
            switch (this.ar.y[0]) {
                case 0: 
                case 2: 
                case 7: {
                    this.d(this.ar, 9, 0);
                    this.ar.n[4] = true;
                    this.ar.n[5] = false;
                    this.ar.a(this.bm[1]);
                }
            }
        }
        if (!this.ar.n[11] && ((this.ar.v & 0xC) == 4 || (this.ar.v & 0xC) == 8) && (this.ar.y[0] == 0 || this.ar.y[0] == 2 || this.ar.y[0] == 3 || this.ar.y[0] == 7 || this.ar.y[0] == 8 || this.ar.y[0] == 9 || this.ar.y[0] == 10 || this.ar.y[0] == 12 && this.ar.n[5] && (this.ar.v & 0xC) != 0)) {
            switch (this.ar.y[0]) {
                case 0: 
                case 2: 
                case 3: 
                case 7: 
                case 12: {
                    this.ar.u[0][0][0] = 0;
                    if (this.ar.ag == 2 && (this.ar.v & 0xC) == 8 || this.ar.ag == 1 && (this.ar.v & 0xC) == 4) {
                        this.d(this.ar, 1, 0);
                        this.ar.ap = true;
                        break;
                    }
                    this.d(this.ar, 2, 0);
                    if (this.ar.ar[0] == 1) break;
                    this.ar.ar[0] = 1;
                    this.ar.az = 0;
                }
            }
            if ((this.ar.v & 0xC) == 4) {
                this.ar.ag = (byte)2;
            } else if ((this.ar.v & 0xC) == 8) {
                this.ar.ag = 1;
            }
        }
        if (this.ar.n[16]) {
            if ((this.ar.aw & 0xC) == 4) {
                this.ar.v = (short)(this.ar.v & 3);
                this.ar.v = (short)(this.ar.v | 4);
                this.ar.ag = (byte)2;
            } else if ((this.ar.aw & 0xC) == 8) {
                this.ar.v = (short)(this.ar.v & 3);
                this.ar.v = (short)(this.ar.v | 8);
                this.ar.ag = 1;
            }
        }
        if (this.ar.y[0] != 7 && this.ar.y[0] != 0) {
            this.be[0] = 0;
        }
        if (this.ar.n[18]) {
            if (this.be[0] > 0 && this.be[51] == 0) {
                h.a(this.ar, this.ar.P, this.ar.N - 2);
                this.be[46] = 1;
                this.a(3, 0);
            } else if (this.ar.y[0] == 0 || this.ar.y[0] == 3 || this.ar.y[0] == 10 || this.ar.y[0] == 12) {
                this.d(this.ar, 7, 0);
                if (this.ar.ar[0] != 7) {
                    this.ar.ar[0] = 7;
                    this.ar.az = 0;
                }
                this.be[0] = 8;
            }
            this.be[51] = 1;
        } else {
            this.be[51] = 0;
        }
        if (this.be[0] > 0) {
            this.be[0] = (short)(this.be[0] - 1);
        }
        if (this.ar.y[0] != 11 && this.ar.y[0] != 12 && this.ar.y[0] != 13 && (nArray = this.ar.u[this.ar.d][0])[0] == 1) {
            nArray[0] = 0;
            byte by = this.ar.d;
            this.ar.c[by] = (byte)(this.ar.c[by] - 1);
        }
    }

    protected void z() {
        if (this.br != null) {
            for (int i2 = 0; i2 < this.br.length; ++i2) {
                for (int i3 = 0; i3 < this.br[i2].length; ++i3) {
                    for (int i4 = 0; i4 < this.br[i2][i3].length; ++i4) {
                        this.br[i2][i3][i4] = -1;
                    }
                }
            }
        } else {
            new Throwable("\"mapReset();\"map is NULL!").printStackTrace();
        }
    }

    private boolean a(a a2, a a3) {
        int n = a2.au;
        int n2 = this.bX[n][a2.ar[0]].length;
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        if (a2.J - 1 >= 0) {
            --a2.J;
            return true;
        }
        if (!a2.ap && !a2.F && this.bX[n][a2.ar[0]][n2 - 1][0] > 0) {
            return true;
        }
        if (a2.y[0] >= 0) {
            if (a2.L > this.aR[n][a2.y[0]].length || a2.L < 0) {
                return true;
            }
            do {
                if (this.aR[n][a2.y[0]][a2.L] != -2) {
                    short s;
                    int n3;
                    int n4;
                    if (this.aR[n][a2.y[0]][a2.L] == -12) {
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -11) {
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -3) {
                        if (a2.ag != (a3.P > a2.P ? (byte)1 : 2)) {
                            a2.ag = (byte)(a3.P > a2.P ? 1 : 2);
                        }
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -23) {
                        a2.aD = (byte)this.aR[n][a2.y[0]][a2.L + 1];
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -16) {
                        if (a2.l > 0) break;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -18) {
                        if (!a2.n[5]) break;
                        if (a2.n[17]) {
                            a2.n[17] = false;
                            a2.L += 3;
                        } else {
                            a2.L = a2.v == 0 ? ++a2.L : (a2.L += 5);
                        }
                    } else if (this.aR[n][a2.y[0]][a2.L] == -10) {
                        a2.J = this.aR[n][a2.y[0]][++a2.L];
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -13) {
                        a2.aE[0] = (byte)this.aR[n][a2.y[0]][a2.L + 1];
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -9) {
                        int[] nArray;
                        l = a3.P - a2.P;
                        l2 = a3.N - a2.N;
                        a2.aa = a2.P;
                        a2.G = a2.N;
                        l3 = this.aR[n][a2.y[0]][a2.L + 2];
                        int n5 = 0;
                        n4 = 0;
                        if (this.aR[n][a2.y[0]][a2.L + 1] == 1) {
                            nArray = this.a(l, l2, l3);
                            n5 = nArray[0];
                            n4 = nArray[1];
                        } else if (this.aR[n][a2.y[0]][a2.L + 1] == 2) {
                            n5 = this.aR[n][a2.y[0]][a2.L + 2];
                            n4 = 0;
                        } else if (this.aR[n][a2.y[0]][a2.L + 1] == 3) {
                            n5 = 0;
                            n4 = this.aR[n][a2.y[0]][a2.L + 2];
                        } else if (this.aR[n][a2.y[0]][a2.L + 1] == 4) {
                            nArray = this.a(l, 0L, l3);
                            n5 = nArray[0];
                            n4 = nArray[1];
                        } else if (this.aR[n][a2.y[0]][a2.L + 1] == 5) {
                            nArray = this.a(0L, l2, l3);
                            n5 = nArray[0];
                            n4 = nArray[1];
                        } else if (this.aR[n][a2.y[0]][a2.L + 1] == 6) {
                            n5 = this.be[25] == 1 ? this.aR[n][a2.y[0]][a2.L + 2] : -this.aR[n][a2.y[0]][a2.L + 2];
                            n4 = 0;
                        }
                        if ((this.aR[n][a2.y[0]][a2.L + 1] == 1 || this.aR[n][a2.y[0]][a2.L + 1] == 2 || this.aR[n][a2.y[0]][a2.L + 1] == 4 || this.aR[n][a2.y[0]][a2.L + 1] == 6) && n5 == 0) {
                            n5 = game.b.E(30);
                        }
                        if ((this.aR[n][a2.y[0]][a2.L + 1] == 1 || this.aR[n][a2.y[0]][a2.L + 1] == 3 || this.aR[n][a2.y[0]][a2.L + 1] == 5) && n4 == 0) {
                            n4 = game.b.E(40);
                        }
                        game.a.a(a2.am, a2.P, a2.N, a2.P + n5, a2.N + n4);
                        a2.L += 3;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -6) {
                        a2.ak = (byte)this.aR[n][a2.y[0]][a2.L + 1];
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -24) {
                        ++a2.L;
                        int n6 = this.a(a2.d) % 5;
                        a2.L += 11 * n6;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -25) {
                        ++a2.L;
                        int n7 = this.a(a2.d) % 5;
                        a2.L += 10 * n7;
                        if (a2.n[12]) {
                            a2.n[12] = false;
                            a2.L += 5;
                        }
                    } else if (this.aR[n][a2.y[0]][a2.L] == -26) {
                        ++a2.L;
                        int n8 = this.L(a2.d);
                        a2.L += 4 * n8;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -27) {
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -28) {
                        if (a2.y[0] == 11 && ((a2.v & 0xC) == 4 || (a2.v & 0xC) == 8) && a2.n[5]) {
                            a2.u[0][0][0] = 0;
                            if (a2.ag == 2 && (a2.v & 0xC) == 8 || a2.ag == 1 && (a2.v & 0xC) == 4) {
                                this.d(a2, 1, 0);
                            } else {
                                this.d(a2, 2, 0);
                            }
                            if ((a2.v & 0xC) == 4) {
                                a2.ag = (byte)2;
                            } else if ((a2.v & 0xC) == 8) {
                                a2.ag = 1;
                            }
                        } else {
                            this.d(a2, (int)this.aR[n][a2.y[0]][a2.L + 1], 0);
                        }
                    } else if (this.aR[n][a2.y[0]][a2.L] == -29) {
                        ++a2.L;
                        int n9 = this.a(a2.d) % 5;
                        if (a2.n[12] && (n9 == 0 || n9 == 1 || n9 == 3)) {
                            a2.n[12] = false;
                            a2.L += 4;
                        }
                    } else if (this.aR[n][a2.y[0]][a2.L] == -30) {
                        if (a2.y[0] == 12 && this.be[56] == 1) {
                            this.a(4, 1);
                            this.be[56] = 0;
                            this.d(a2, 11, 0);
                            a2.ap = true;
                        } else {
                            ++a2.L;
                            if (a2.n[5]) {
                                ++a2.L;
                            }
                            this.d(a2, (int)this.aR[n][a2.y[0]][a2.L], 0);
                        }
                    } else if (this.aR[n][a2.y[0]][a2.L] == -31) {
                        ++a2.L;
                        if ((this.ar.v & 0xC) != 8 && (this.ar.v & 0xC) != 4) {
                            ++a2.L;
                        }
                        this.d(a2, (int)this.aR[n][a2.y[0]][a2.L], 0);
                    } else if (this.aR[n][a2.y[0]][a2.L] == -32) {
                        this.be[21] = this.aR[n][a2.y[0]][a2.L + 1];
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -33) {
                        a2.aE[0] = a2.n[4] ? (int)((byte)this.aR[n][a2.y[0]][a2.L + 1]) : (int)((byte)this.aR[n][a2.y[0]][a2.L + 2]);
                        a2.L += 3;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -35) {
                        a2.ag = (byte)this.aR[n][a2.y[0]][a2.L + 1];
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -36) {
                        if (a2.v != 0 || a2.ak != -1) break;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -37) {
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -19) {
                        a2.ap = true;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -38) {
                        if (a2.n[11]) break;
                        a2.L = a2.n[5] ? ++a2.L : (a2.L += 3);
                    } else if (this.aR[n][a2.y[0]][a2.L] == -39) {
                        int n10 = 0;
                        n4 = 0;
                        n3 = this.aR[n][a2.y[0]][a2.L + 2];
                        s = this.aR[n][a2.y[0]][a2.L + 3];
                        a2.aa = a2.P;
                        a2.G = a2.N;
                        switch (this.aR[n][a2.y[0]][a2.L + 1]) {
                            case 0: {
                                n10 = this.ar.ag == 1 ? a3.P + n3 : a3.P - n3;
                                n4 = a3.N;
                                break;
                            }
                            case 1: {
                                n10 = this.ar.ag == 1 ? a3.P - n3 : a3.P + n3;
                                n4 = a3.N;
                                break;
                            }
                            case 2: {
                                n10 = this.ar.ag == 1 ? a3.P + n3 : a3.P - n3;
                                n4 = a3.N + s;
                                break;
                            }
                            case 3: {
                                n10 = this.ar.ag == 1 ? a3.P - n3 : a3.P + n3;
                                n4 = a3.N + s;
                                break;
                            }
                            case 4: {
                                n10 = this.ar.ag == 1 ? a3.P + n3 : a3.P - n3;
                                n4 = a2.N;
                                break;
                            }
                            case 5: {
                                n10 = this.ar.ag == 1 ? a3.P - n3 : a3.P + n3;
                                n4 = a2.N;
                            }
                        }
                        game.a.a(a2.am, a2.P, a2.N, n10, n4);
                        a2.L += 4;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -40) {
                        a2.ar[0] = 0;
                        a2.az = 0;
                        a2.J = this.bL[this.aq[0]][this.be[22]][2 + this.aq[0] * 2] - this.be[24] * this.bL[this.aq[0]][this.be[22]][3 + this.aq[0] * 2];
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -41) {
                        if (a2.J > 0) break;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -42) {
                        this.be[30] = (short)a3.P;
                        this.be[31] = (short)a3.N;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -43) {
                        a2.P = this.be[30];
                        a2.N = this.be[31];
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -44) {
                        int n11 = 0;
                        n4 = 0;
                        n3 = this.aR[n][a2.y[0]][a2.L + 2];
                        s = this.aR[n][a2.y[0]][a2.L + 3];
                        a2.aa = a2.P;
                        a2.G = a2.N;
                        switch (this.aR[n][a2.y[0]][a2.L + 1]) {
                            case 0: {
                                n11 = a2.ag == 1 ? a3.P - n3 : a3.P + n3;
                                n4 = a3.N;
                                break;
                            }
                            case 2: {
                                n11 = a2.ag == 1 ? a2.P + n3 : a2.P - n3;
                                n4 = a2.N;
                            }
                        }
                        game.a.a(a2.am, a2.P, a2.N, n11, n4);
                        a2.L += 4;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -45) {
                        this.be[25] = a2.ag;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -46) {
                        if (this.ar.n[18]) break;
                        ++a2.L;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -47) {
                        int n12 = 0;
                        n4 = 0;
                        n3 = a2.aE[0] * (this.bL[this.aq[0]][this.be[22]][2 + this.aq[0] * 2] - this.be[24] * this.bL[this.aq[0]][this.be[22]][3 + this.aq[0] * 2]);
                        a2.aa = a2.P;
                        a2.G = a2.N;
                        switch (this.aR[n][a2.y[0]][a2.L + 1]) {
                            case 0: {
                                n12 = a2.ag == 1 ? a2.P + n3 : a2.P - n3;
                                n4 = a2.N;
                                break;
                            }
                            case 1: {
                                n12 = a2.ag == 1 ? a2.P - n3 : a2.P + n3;
                                n4 = a2.N;
                            }
                        }
                        game.a.a(a2.am, a2.P, a2.N, n12, n4);
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -48) {
                        int[] nArray = new int[]{12, 10, 12, 21};
                        n4 = nArray[this.be[24] % 2 * 2] * this.by;
                        n3 = nArray[this.be[24] % 2 * 2 + 1] * this.ab;
                        if (a2.N == n3) {
                            a2.L += 8;
                        } else {
                            a2.aa = a2.P;
                            a2.G = a2.N;
                            game.a.a(a2.am, a2.P, a2.N, n4, n3);
                            ++a2.L;
                        }
                    } else if (this.aR[n][a2.y[0]][a2.L] == -49) {
                        a2.Z[1] = a2.Z[0] * this.x[n - 19][a2.y[0]][this.aR[n][a2.y[0]][a2.L + 1]] / 100;
                        a2.L += 2;
                    } else if (this.aR[n][a2.y[0]][a2.L] == -50) {
                        a2.ag = (byte)(a2.ag == 1 ? 2 : 1);
                        ++a2.L;
                    }
                    if (this.aR[n][a2.y[0]][a2.L] >= 0) {
                        short s2 = this.aR[n][a2.y[0]][a2.L + 1];
                        n4 = -1;
                        if (a2.au == 0) {
                            switch (a2.y[0]) {
                                case 11: 
                                case 12: {
                                    if (this.ar.n[4]) {
                                        n4 = this.aR[n][a2.y[0]][a2.L] + 18;
                                        break;
                                    }
                                    n4 = this.aR[n][a2.y[0]][a2.L];
                                    break;
                                }
                                case 13: {
                                    n4 = this.aR[n][a2.y[0]][a2.L];
                                    break;
                                }
                                default: {
                                    n4 = this.aR[n][a2.y[0]][a2.L];
                                    break;
                                }
                            }
                        } else {
                            n4 = this.aR[n][a2.y[0]][a2.L];
                        }
                        this.a((i)a2, n4, (int)s2);
                        if (a2.au == 0 && (a2.y[0] == 11 || a2.y[0] == 12 || a2.y[0] == 13)) {
                            a2.aC = true;
                        }
                        a2.L += 2;
                        break;
                    }
                    if (this.aR[n][a2.y[0]][a2.L] != -2) continue;
                    a2.L = -1;
                    break;
                }
                a2.L = -1;
                break;
            } while (this.aR[n][a2.y[0]][a2.L] < -2);
        }
        a2.ap = false;
        return true;
    }

    public byte a(byte by) {
        byte[] byArray = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 7, 14};
        return byArray[by];
    }

    public int L(int n) {
        int[] nArray = new int[]{0, 2, 5, 6, 8, 1, 2, 4, 6, 8, 0, 3, 5, 7, 8, 0, 2, 4, 6, 8, 4, 8, 9, 4, -1, -1, 7, -1, 9, 2, 3, 6, 3, -1, -1, -1, 8, 4, 3, -1, 5, 2, 2, 8, 5, 4, 1, 2, 9, 1, 5, 6, 3, 8, 3, 1, 1, 1, 10, 4, 3, 2, 7, 6, 6, 10};
        return nArray[n];
    }

    protected int a(a a2, int n, boolean bl) {
        int[] nArray;
        int n2 = 3000;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        int n6 = -1;
        if (n > 0 && (n2 = this.a(a2, n3 = (nArray = this.b((i)a2))[0], n4 = nArray[1], n5 = nArray[2], n6 = nArray[3], this.br[0], n, bl)) >= 1000 && n2 < 2000) {
            return n2;
        }
        return 3000;
    }

    private void d(a a2, int n, int n2) {
        if (a2 == null) {
            return;
        }
        a2.y[1] = a2.y[0];
        a2.y[0] = (byte)n;
        a2.L = n2;
    }

    private void a(i i2, int n, int n2) {
        i2.ar[1] = i2.ar[0];
        i2.ar[0] = (byte)n;
        if (i2.ar[1] != i2.ar[0] || i2.ap) {
            i2.F = false;
            i2.az = 0;
            i2.e = 0;
            i2.at = 0;
            i2.ap = false;
        }
        int n3 = i2.au & 0xFFFFFF7F;
        int n4 = this.bX[n3][n].length;
        if (n2 >= 0) {
            this.bX[n3][n][n4 - 1][0] = (short)n2;
        }
    }

    private void a(i i2) {
        if (i2 == null) {
            return;
        }
        int n = i2.au;
        int n2 = this.bX[n][i2.ar[0]].length - 2;
        if (i2.al[0] < i2.al[1]) {
            i2.al[0] = (byte)(i2.al[0] + 1);
        }
        if (i2.al[0] >= i2.al[1]) {
            i2.al[0] = 0;
            i2.at = (byte)(i2.at + 1);
            if (i2.at >= this.bX[n][i2.ar[0]][i2.az][0]) {
                if (i2.az < n2) {
                    if (this.bX[n][i2.ar[0]][i2.az][0] == 0) {
                        if (i2.au == 0 && i2.ar[0] >= 50 && i2.ar[0] <= 59) {
                            i2.H = true;
                        } else if (i2.au == 5 || i2.au == 6) {
                            i2.H = true;
                        } else if (i2.au == 16) {
                            i2.H = true;
                        } else if (i2.au >= 19 && i2.au <= 25) {
                            if (i2.y[0] == 10) {
                                byte[] byArray = new byte[]{17, 17, 17, 17, 16, 16};
                                this.be[26] = (short)(this.be[26] + 1);
                                if (this.be[26] < 2 || this.be[26] > 9) {
                                    this.be[26] = 2;
                                }
                                int[] nArray = this.b(i2);
                                this.b(i2, this.be[26], 24 + this.a(byArray), nArray[0] + (nArray[2] >> 1), nArray[1] - (nArray[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                                this.be[1] = 1;
                                this.be[21] = 4;
                            } else if (i2.au == 19 || i2.au == 25) {
                                if (i2.ar[0] == 11) {
                                    this.be[25] = i2.ag;
                                    this.be[26] = 10;
                                    this.b(i2, this.be[26], 8, i2.P + game.j.h[this.be[25]] * 51, i2.N + 47, 1, i2.au, 1, 1, -1, 0, 1);
                                    this.be[33] = (short)(i2.P + game.j.h[this.be[25]] * 51);
                                }
                            } else if (i2.au == 20 || i2.au == 24) {
                                if (i2.ar[0] == 6) {
                                    i2.H = true;
                                    i2.d = (byte)3;
                                } else if (i2.ar[0] == 7) {
                                    this.b(i2, 11, 8, i2.P, i2.N, i2.ag, i2.au, 1, 1, -1, 0, 1);
                                } else if (i2.ar[0] == 9) {
                                    this.b(i2, 12, 10, i2.P, i2.N, i2.ag, i2.au, 1, 1, -1, 0, 1);
                                } else if (i2.ar[0] == 11) {
                                    this.b(i2, 13, 12, i2.P, i2.N, i2.ag, i2.au, 1, 1, -1, 0, 1);
                                } else if (i2.ar[0] == 15) {
                                    this.b(i2, 14, 14, i2.P, i2.N, i2.ag, i2.au, 1, 1, -1, 0, 1);
                                    i2.H = true;
                                    i2.d = 0;
                                }
                            } else if (i2.au == 21) {
                                if (i2.ar[0] == 2) {
                                    this.be[21] = 4;
                                } else if (i2.ar[0] == 3 || i2.ar[0] == 4) {
                                    i2.H = true;
                                    i2.d = 0;
                                } else if (i2.ar[0] == 6) {
                                    i2.H = true;
                                    i2.d = 1;
                                    this.be[27] = (short)(i2.P + 28 * game.j.h[i2.ag]);
                                    this.be[28] = (short)i2.N;
                                    this.be[33] = this.be[27];
                                    this.be[21] = 7;
                                }
                            } else if (i2.au == 22) {
                                if (i2.ar[0] == 1) {
                                    i2.H = true;
                                    i2.d = 0;
                                    this.be[27] = (short)this.ar.P;
                                    this.be[28] = (short)this.ar.N;
                                } else if (i2.ar[0] == 14) {
                                    i2.H = true;
                                    i2.d = 1;
                                    this.be[27] = (short)this.ar.P;
                                    this.be[28] = (short)this.ar.N;
                                } else if (i2.ar[0] == 15) {
                                    i2.H = true;
                                    i2.d = (byte)2;
                                    this.be[27] = (short)this.ar.P;
                                    this.be[28] = (short)this.ar.N;
                                } else if (i2.ar[0] == 12) {
                                    i2.H = true;
                                    i2.d = (byte)3;
                                } else if (i2.ar[0] == 17) {
                                    i2.H = true;
                                    i2.d = (byte)4;
                                } else if (i2.ar[0] == 10 && (i2.y[0] == 4 || i2.y[0] == 7)) {
                                    int[] nArray = this.b(i2);
                                    int[] nArray2 = this.a(nArray);
                                    this.be[26] = (short)(this.be[26] + 1);
                                    if (this.be[26] < 10 || this.be[26] > 13) {
                                        this.be[26] = 10;
                                    }
                                    this.b(i2, this.be[26], 13, nArray2[0], nArray2[1], i2.ag, 22, 1, 1, -1, 0, 1);
                                }
                            } else if (i2.au == 23) {
                                if (i2.ar[0] == 8) {
                                    i2.H = true;
                                    i2.d = 0;
                                    this.be[27] = (short)(i2.P + 35 * game.j.h[i2.ag]);
                                    this.be[28] = (short)i2.N;
                                    this.be[33] = this.be[27];
                                } else if (i2.ar[0] == 10 || i2.ar[0] == 11) {
                                    i2.H = true;
                                    i2.d = 1;
                                } else if (i2.ar[0] == 9) {
                                    i2.H = true;
                                    i2.d = (byte)2;
                                } else if (i2.ar[0] == 1) {
                                    this.b(i2, 1, 15, i2.P, i2.N, i2.ag, 23, 1, 1, -1, 0, 1);
                                }
                            }
                        } else if (i2.au == 29 && i2.ar[0] == 1) {
                            this.a(i2, 2, 0);
                        }
                    } else if (this.bX[n][i2.ar[0]][i2.az][0] == -1) {
                        if (i2.au == 22) {
                            int[] nArray;
                            if (i2.ar[0] == 1) {
                                this.b(i2, 10, 2, i2.P, i2.N, i2.ag, 22, 1, 1, -1, 0, 1);
                            } else if (i2.ar[0] == 14) {
                                this.b(i2, 10, 3, i2.P, i2.N, i2.ag, 22, 1, 1, -1, 0, 1);
                            } else if (i2.ar[0] == 15) {
                                this.b(i2, 10, 4, i2.P, i2.N, i2.ag, 22, 1, 1, -1, 0, 1);
                            } else if (i2.ar[0] == 12) {
                                int[] nArray3 = this.b(i2);
                                nArray = this.a(nArray3);
                                this.b(i2, 10, 13, nArray[0], nArray[1], i2.ag, 22, 1, 1, -1, 0, 1);
                            } else if (i2.ar[0] == 17) {
                                int[] nArray4 = this.b(i2);
                                nArray = this.a(nArray4);
                                this.b(i2, 10, 13, nArray[0], nArray[1], i2.ag, 22, 1, 1, -1, 0, 1);
                                nArray = this.a(nArray4);
                                this.b(i2, 11, 13, nArray[0], nArray[1], i2.ag, 22, 1, 1, -1, 0, 1);
                                nArray = this.a(nArray4);
                                this.b(i2, 12, 13, nArray[0], nArray[1], i2.ag, 22, 1, 1, -1, 0, 1);
                            }
                        } else if (i2.au == 23 && i2.ar[0] == 8) {
                            this.be[1] = 1;
                        }
                        if ((i2.au == 19 || i2.au == 25) && i2.ar[0] == 10 || (i2.au == 20 || i2.au == 24) && i2.ar[0] == 16 || i2.au == 21 && i2.ar[0] == 10 || i2.au == 22 && i2.ar[0] == 19 || i2.au == 23 && i2.ar[0] == 16) {
                            this.k((a)i2);
                            if (i2.au != 19 && this.aq[0] > 0) {
                                this.o();
                                this.d(0, 0, 0);
                                this.e = true;
                                e.a(this.bf, 7);
                                int n3 = 1 + this.bL[this.aq[0]][this.be[22]][1] - 19;
                                if (this.bR < this.aq[n3]) {
                                    this.aq[n3] = this.bR;
                                    this.be[63] = 1;
                                } else {
                                    this.be[63] = 0;
                                }
                                this.be[64] = 30;
                                e.a(this.bf, 7);
                                e.f(this.q, 22);
                            }
                        }
                    } else if (i2.au == 22 && i2.ar[0] == 10) {
                        if (i2.y[0] == 4 || i2.y[0] == 7) {
                            i2.H = true;
                            i2.d = (byte)5;
                        } else if (i2.y[0] == 8 || i2.y[0] == 9) {
                            this.be[26] = (short)(this.be[26] + 1);
                            if (this.be[26] < 10 || this.be[26] > 13) {
                                this.be[26] = 10;
                            }
                            int[] nArray = this.b(i2);
                            int[] nArray5 = this.a(nArray);
                            this.b(i2, this.be[26], 13, nArray5[0], nArray5[1], i2.ag, 22, 1, 1, -1, 0, 1);
                            i2.H = true;
                            i2.d = (byte)6;
                        }
                    }
                    if ((i2.au == 20 || i2.au == 24) && i2.ar[0] == 13) {
                        i2.H = true;
                        if (i2.au == 20 && i2.y[0] == 9 || i2.au == 24 && i2.y[0] == 4) {
                            if (this.be[32] == 0) {
                                this.be[32] = 1;
                                this.b(i2, 14, 14, i2.P, i2.N, i2.ag, i2.au, 1, 1, -1, 0, 1);
                            }
                            i2.d = 1;
                        } else if (i2.au == 24 && i2.y[0] == 7) {
                            if (this.be[32] == 0) {
                                this.be[32] = 1;
                                this.b(i2, 14, 14, i2.P, i2.N, i2.ag, i2.au, 1, 1, -1, 0, 1);
                            }
                            i2.d = (byte)2;
                        }
                    }
                    ++i2.az;
                    i2.at = 0;
                }
                if (i2.az + 0 >= n2 && i2.at >= this.bX[n][i2.ar[0]][i2.az][0]) {
                    i2.at = 0;
                    if (this.bX[n][i2.ar[0]][n2 + 1][0] == 0) {
                        i2.az = 0;
                    } else {
                        if (i2.e < this.bX[n][i2.ar[0]][n2 + 1][0]) {
                            ++i2.e;
                        }
                        if (i2.e >= this.bX[n][i2.ar[0]][n2 + 1][0]) {
                            i2.e = this.bX[n][i2.ar[0]][n2 + 1][0];
                            i2.F = true;
                        } else {
                            i2.az = 0;
                        }
                    }
                }
            }
        }
        if (i2.au >= 1 && i2.au <= 25 || i2.au == 29 || i2.au == 30 || i2.au == 26) {
            i2.Y[0] = this.bX[n][i2.ar[0]][i2.az][1];
        } else if (i2.au == 0) {
            i2.s = this.bX[n][i2.ar[0]][i2.az][1];
        }
        this.i((a)i2);
    }

    private void i(a a2) {
        try {
            int n = a2.au;
            byte by = a2.ar[0];
            int n2 = a2.az;
            short s = this.bX[n][by][a2.az][1];
            int n3 = a2.aj[0];
            a2.aj[0] = this.I[n][s][3] - this.I[n][s][1];
            a2.aj[1] = n3 != 0 ? n3 : a2.aj[0];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int f(a a2) {
        int n = 3000;
        int n2 = 10;
        boolean bl = false;
        while (n == 3000 && a2.P != a2.aa) {
            if (a2.P < a2.aa) {
                a2.P += n2;
                if (a2.P > a2.aa) {
                    a2.P = a2.aa;
                }
            } else if (a2.P > a2.aa) {
                a2.P -= n2;
                if (a2.P < a2.aa) {
                    a2.P = a2.aa;
                }
            }
            n = this.a(a2, a2.v & 0xC, true);
        }
        a2.aa = a2.P;
        return n;
    }

    private void g(a a2) {
        if (!a2.n[4] && !a2.n[11]) {
            a2.l = -4;
        }
        a2.G += a2.l;
        if (a2.au == 0 && a2.n[11] && a2.l <= a2.ab) {
            a2.n[11] = false;
            a2.l = a2.ab;
        }
        if (a2.l > a2.ab) {
            a2.l += a2.p;
        }
    }

    private int h(a a2) {
        int n = 3000;
        this.g(a2);
        n = this.a(a2);
        a2.aG = a2.G = a2.N;
        if (a2.au == 0) {
            if (n >= 1000 && n < 3000) {
                if (a2.n[4] && a2.l < 0) {
                    a2.n[4] = false;
                    a2.n[6] = false;
                    a2.n[16] = false;
                    a2.n[5] = true;
                    a2.v = (short)(a2.v & 0xC);
                    if (-this.ar.l > this.bm[0][0]) {
                        this.ar.n[17] = true;
                        a2.v = (short)(a2.v & 3);
                    }
                    if (a2.au == 0) {
                        this.b(this.ar, 10, 13, this.ar.P, this.ar.N, this.ar.ag, 26, 1, 1, -1, 0, 1);
                    }
                    this.ar.a(this.bm[2]);
                    if (a2.n[11]) {
                        a2.n[11] = false;
                    }
                    if (a2.y[0] == 11) {
                        a2.aE[0] = 0;
                    }
                }
                if ((a2.v & 3) == 0 && !a2.n[4]) {
                    a2.n[5] = true;
                    a2.n[4] = false;
                    a2.l = 0;
                } else {
                    this.ar.a(this.bm[1]);
                }
            } else {
                if (a2.n[5]) {
                    this.d(this.ar, 9, 0);
                    this.ar.a(this.bm[1]);
                    this.ar.v = (short)(this.ar.v | 2);
                }
                a2.n[5] = false;
                a2.n[4] = true;
            }
        } else if (a2.au == 28 && n >= 1000 && n < 3000) {
            if (a2.n[4] && a2.l < 0) {
                a2.n[4] = false;
                a2.n[6] = false;
                a2.n[16] = false;
                a2.n[5] = true;
                a2.v = (short)(a2.v & 0xC);
                if (a2.au == 28) {
                    a2.ah = 0;
                }
            }
            if ((a2.v & 3) == 0 && !a2.n[4]) {
                a2.n[5] = true;
                a2.n[4] = false;
                a2.l = 0;
                if (a2.au == 28 && a2.ah == 1) {
                    a2.ah = 0;
                }
            }
        }
        return n;
    }

    private int d(a a2) {
        int n = 3000;
        if (a2.au > 0) {
            this.e(a2, 6, this.B - 6);
        } else {
            this.e(a2, ag[0] + 6, ag[1] - 6);
        }
        n = this.f(a2);
        a2.g = a2.aa = a2.P;
        return n;
    }

    private void b(int n, int n2, int n3, int n4) {
        e.ag[0] = n > 32 ? n - 16 : n;
        e.ag[1] = n2 < this.B - 32 ? n2 + 16 : n2;
        e.ag[2] = n3 < this.d - 32 ? n3 + 16 : n3;
        e.ag[3] = n4 > 32 ? n4 - 16 : n4;
    }

    private void e(a a2, int n, int n2) {
        a2.aa = a2.P;
        if ((a2.v & 0xC) == 4) {
            a2.aa -= a2.aE[0];
        } else if ((a2.v & 0xC) == 8) {
            a2.aa += a2.aE[0];
        }
        if (a2.aa <= n) {
            a2.aa = n;
        }
        if (a2.aa >= n2) {
            a2.aa = n2;
        }
    }

    private int a(a a2) {
        int n;
        block4: {
            int n2;
            block3: {
                n = 3000;
                n2 = 2;
                if (a2.l > 0) break block3;
                while (n == 3000 && a2.N > a2.G - 10) {
                    a2.N -= n2;
                    n = this.a(a2, 2, true);
                    a2.v = (short)(a2.v & 0xC);
                    if (a2.au != 0) continue;
                    if (n == 1001) {
                        this.a(3, 1);
                        continue;
                    }
                    this.be[48] = 0;
                    this.a(3, 0);
                }
                break block4;
            }
            if (a2.l <= 0) break block4;
            while (n == 3000 && a2.N < a2.G) {
                a2.N += n2;
                n = this.a(a2, 1, true);
                a2.v = (short)(a2.v & 0xC);
            }
        }
        return n;
    }

    public void d() {
        this.M = new int[this.M.length];
        this.f();
        switch (this.bf[0]) {
            case 1: 
            case 2: 
            case 22: 
            case 26: {
                this.cl[2] = 0;
                break;
            }
            case 7: {
                switch (this.q[0]) {
                    case 0: {
                        if (this.e) break;
                        this.d(0, 0, 0);
                        this.e = true;
                        e.f(this.q, 2);
                        this.o();
                        this.bI[0][0][0] = 4;
                        break;
                    }
                    case 18: 
                    case 21: 
                    case 27: {
                        this.be[42] = 295;
                        break;
                    }
                    case 22: {
                        this.be[64] = 30;
                    }
                }
                break;
            }
            default: {
                this.e = false;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void t() {
        switch (this.bf[0]) {
            case 16: {
                this.f(this.bp[0][0], 1);
                break;
            }
            case 4: {
                if (this.q[0] == 13) {
                    this.f(this.bp[0][0], 1);
                    break;
                }
                if (this.q[0] != 1) break;
                this.f(this.bp[0][0], 1);
                break;
            }
            case 7: {
                switch (this.q[0]) {
                    case 0: {
                        if (this.e) break;
                        this.d(0, 0, 0);
                        this.e = true;
                        e.f(this.q, 2);
                        this.o();
                        this.bI[0][0][0] = 4;
                    }
                }
                break;
            }
        }
        System.gc();
    }

    public int K(int n) {
        int[] nArray = new int[]{-1982, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -1, -2, -3, -4, -6, -7, -5, 35, 42, -11};
        return e.a(n, nArray);
    }

    public void d(int n, int n2) {
        int n3 = this.K(n);
        if (n3 >= 0) {
            this.M[n3] = n2;
        }
    }

    private int g(int n) {
        int n2 = this.K(n);
        return this.M[n2];
    }

    private void W(int n) {
        int[] nArray = new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[][] nArrayArray = new int[][]{{0}, {0}, {0}, {0}, {0}, {0}, {-1}, {0}, {0}, {-1}, {0}, {0}, {0}, {0}, {0}, {-1}, {-1}, {-1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {-1}, {0, 1, 2, 3}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}};
        try {
            int n2;
            if (this.cn[n] == null) {
                this.cn[n] = new Image[nArray[n]];
            }
            if (nArrayArray[n2 = this.ce[n]][0] != -1 && this.cn[n][nArrayArray[n2][0]] == null) {
                String string = "/data/role/role_" + n2 + ".mid";
                DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream(string));
                dataInputStream.skip(4L);
                int n3 = 0;
                int n4 = dataInputStream.readInt();
                for (int i2 = 0; i2 < nArrayArray[n].length; ++i2) {
                    n3 = dataInputStream.readInt();
                    byte[] byArray = new byte[n3];
                    for (int i3 = 0; i3 < n3; ++i3) {
                        byArray[i3] = (byte)(dataInputStream.readByte() ^ n4);
                    }
                    this.cn[n][nArrayArray[n2][i2]] = game.b.e(byArray, 0);
                }
            }
            for (int i4 = 0; i4 < this.cn[n].length; ++i4) {
                if (this.cn[n][i4] != null) continue;
                if (n == 0 && i4 == 1) {
                    this.cn[n][i4] = this.cn[26][1];
                    continue;
                }
                if (!(n == 20 && i4 == 1 || n == 21 && i4 == 1) && (n != 24 || i4 != 1)) continue;
                this.cn[n][i4] = this.cn[26][0];
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void h(int n, int n2) {
        int[] nArray = new int[]{3, 3, 3, 3, 3};
        int[][] nArrayArray = new int[][]{{1, 2}, {2}, {2}, {2}, {2}};
        if (this.bh[n][n2] == null) {
            this.bh[n][n2] = new Image[nArray[n2]];
        }
        try {
            int n3;
            String string = "/data/scene/scene_" + n + "_" + n2 + ".mid";
            DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream(string));
            dataInputStream.skip(4L);
            int n4 = 0;
            int n5 = dataInputStream.readInt();
            if (this.bh[n][n2][nArrayArray[n2][0]] == null) {
                for (n3 = 0; n3 < nArrayArray[n2].length; ++n3) {
                    n4 = dataInputStream.readInt();
                    byte[] byArray = new byte[n4];
                    for (int i2 = 0; i2 < n4; ++i2) {
                        byArray[i2] = (byte)(dataInputStream.readByte() ^ n5);
                    }
                    this.bh[n][n2][nArrayArray[n2][n3]] = game.b.e(byArray, 0);
                }
            }
            for (n3 = 1; n3 < this.bh[n][n2].length; ++n3) {
                if (this.bh[n][n2][n3] != null || n2 < 1 || n2 > 4 || n3 != 1) continue;
                this.bh[n][n2][n3] = this.cn[26][3];
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void s(int n) {
        boolean bl = false;
        int n2 = 0;
        byte by = 0;
        byte[] byArray = new byte[4];
        byte by2 = 0;
        int n3 = 0;
        boolean bl2 = true;
        int n4 = -1;
        int n5 = 1;
        int n6 = -1;
        int n7 = 3;
        int n8 = -1;
        int n9 = 3;
        int n10 = -1;
        int n11 = 1;
        int n12 = -1;
        int n13 = 0;
        try {
            String string = "/data/map/map_" + n + ".mid";
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(6L);
            by = dataInputStream.readByte();
            byte[] byArray2 = new byte[by];
            dataInputStream.read(byArray2);
            n3 = (int)e.c(byArray2);
            dataInputStream.read(byArray2);
            int n14 = (int)e.c(byArray2);
            dataInputStream.read(byArray2);
            int n15 = (int)e.c(byArray2);
            this.B = n14 * this.by;
            this.d = n15 * this.ab;
            this.ay = new short[n9][];
            this.Z = new int[n9][2];
            this.br = new short[1][n14][n15];
            this.j = new short[n5][];
            this.bG = new int[n5][2];
            this.bu = new short[n7][];
            bV = new int[n7][2];
            this.bW = new short[n11][];
            game.a.X = 0;
            this.z();
            inputStream.read(byArray2);
            long l = e.c(byArray2);
            short s = (short)e.c(byArray2);
            for (int i2 = 0; i2 < n3; ++i2) {
                if (s >= -1) continue;
                by2 = dataInputStream.readByte();
                n13 = 0;
                inputStream.read(byArray);
                n2 = (int)e.c(byArray);
                inputStream.read(byArray2);
                s = (short)e.c(byArray2);
                switch (by2) {
                    case 1: {
                        n10 = (byte)(n10 + 1);
                        this.ay[n10] = new short[n2 * 3];
                        break;
                    }
                    case 2: {
                        n8 = (byte)(n8 + 1);
                        this.bu[n8] = new short[n2 * 3];
                        break;
                    }
                    case 3: {
                        n4 = (byte)(n4 + 1);
                        break;
                    }
                    case 4: {
                        n6 = (byte)(n6 + 1);
                        this.j[n6] = new short[n2 * 3];
                        break;
                    }
                    case 5: {
                        n12 = (byte)(n12 + 1);
                        this.bW[n12] = new short[n2 * 3];
                    }
                }
                while (s >= 0) {
                    short s2 = s;
                    inputStream.read(byArray2);
                    short s3 = (short)e.c(byArray2);
                    switch (by2) {
                        case 0: {
                            inputStream.read(byArray);
                            break;
                        }
                        case 1: {
                            int n16 = n13;
                            n13 = (short)(n13 + 1);
                            this.ay[n10][n16] = s2;
                            int n17 = n13;
                            n13 = (short)(n13 + 1);
                            this.ay[n10][n17] = s3;
                            inputStream.read(byArray);
                            int n18 = n13;
                            n13 = (short)(n13 + 1);
                            this.ay[n10][n18] = (short)e.c(byArray);
                            break;
                        }
                        case 2: {
                            int n19 = n13;
                            n13 = (short)(n13 + 1);
                            this.bu[n8][n19] = s2;
                            int n20 = n13;
                            n13 = (short)(n13 + 1);
                            this.bu[n8][n20] = s3;
                            inputStream.read(byArray);
                            int n21 = n13;
                            n13 = (short)(n13 + 1);
                            this.bu[n8][n21] = (short)e.c(byArray);
                            break;
                        }
                        case 3: {
                            inputStream.read(byArray);
                            this.br[0][s2][s3] = (short)e.c(byArray);
                            break;
                        }
                        case 4: {
                            inputStream.read(byArray);
                            int n22 = n13;
                            n13 = (short)(n13 + 1);
                            this.j[n6][n22] = s2;
                            int n23 = n13;
                            n13 = (short)(n13 + 1);
                            this.j[n6][n23] = s3;
                            int n24 = n13;
                            n13 = (short)(n13 + 1);
                            this.j[n6][n24] = (short)e.c(byArray);
                            break;
                        }
                        case 5: {
                            inputStream.read(byArray);
                            int n25 = n13;
                            n13 = (short)(n13 + 1);
                            this.bW[n12][n25] = s2;
                            int n26 = n13;
                            n13 = (short)(n13 + 1);
                            this.bW[n12][n26] = s3;
                            int n27 = n13;
                            n13 = (short)(n13 + 1);
                            this.bW[n12][n27] = (short)e.c(byArray);
                            break;
                        }
                        default: {
                            inputStream.read(byArray);
                        }
                    }
                    inputStream.read(byArray2);
                    s = (short)e.c(byArray2);
                }
            }
            inputStream.close();
            inputStream = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(int n) {
        String string = "/data/animate/role_";
        int n2 = this.aL[n];
        try {
            InputStream inputStream;
            if (this.ak[n].length == 0) {
                inputStream = e.e(string + n2 + "_module.mid");
                this.ak[n] = e.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.au[n].length == 0) {
                inputStream = e.e(string + n2 + "_frame.mid");
                this.au[n] = e.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.I[n].length == 0) {
                inputStream = e.e(string + n2 + "_colli.mid");
                this.I[n] = e.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.bO[n].length == 0) {
                inputStream = e.e(string + n2 + "_att.mid");
                this.bO[n] = e.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.bX[n].length == 0) {
                inputStream = e.e(string + n2 + "_action.mid");
                this.bX[n] = e.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            inputStream = null;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void a(int[] nArray, int n, int n2, int n3) {
        if (nArray[8] > 0) {
            this.Y.a(nArray, n, n2, 1, this.cn, this.ak, this.au, this.bX, this.aC[0] + this.be[19], this.aC[1] + this.be[20]);
        }
    }

    private void b(i i2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.a(i2.af[n], n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }

    private void a(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = this.bX[n5][n].length;
        nArray[0] = n5;
        nArray[1] = n;
        nArray[2] = 0;
        nArray[8] = n7;
        nArray[4] = 0;
        nArray[5] = n2;
        nArray[6] = n3;
        nArray[7] = n4;
        nArray[9] = n6;
        nArray[10] = n8;
        nArray[11] = n9;
        if (n10 >= 0) {
            this.bX[n5][n][n11 - 1][0] = (short)n10;
        }
    }

    private void c(a a2, int n, int n2) {
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        if (a2.u == null) {
            return;
        }
        for (int i2 = 0; i2 < a2.u.length; ++i2) {
            if (a2.u[i2] == null) continue;
            for (int i3 = 0; i3 < a2.u[i2].length; ++i3) {
                int[] nArray;
                block52: {
                    block57: {
                        block56: {
                            block53: {
                                block55: {
                                    block54: {
                                        nArray = a2.u[i2][i3];
                                        if (nArray[0] == 1) {
                                            n3 = nArray[5];
                                            short s = this.bX[nArray[11]][nArray[7]][nArray[6]][1];
                                        }
                                        if (a2.au == 19 || a2.au == 25) {
                                            if (nArray[0] > 0 && e.y(nArray[4] - nArray[2]) > e.y(160)) {
                                                nArray[0] = 0;
                                                int n6 = i2;
                                                a2.c[n6] = (byte)(a2.c[n6] - 1);
                                            }
                                        } else if (a2.au >= 1 && a2.au <= 25 && nArray[0] > 0) {
                                            if (e.y(nArray[3] - nArray[1]) + e.y(nArray[4] - nArray[2]) > e.y(game.a.aq[a2.au][i2][4])) {
                                                nArray[0] = 0;
                                                int n7 = i2;
                                                a2.c[n7] = (byte)(a2.c[n7] - 1);
                                            }
                                        }
                                        if (nArray[0] == 1) {
                                            block0 : switch (a2.au) {
                                                case 0: {
                                                    bl = true;
                                                    if (i3 == 0) {
                                                        nArray[1] = a2.P;
                                                        nArray[2] = a2.N;
                                                        nArray[3] = nArray[1];
                                                        nArray[4] = nArray[2];
                                                        break;
                                                    }
                                                    if (i3 != 1) break;
                                                    switch (this.L(i2 + 44)) {
                                                        case 3: {
                                                            nArray[3] = nArray[3] + (2 + nArray[10]) * game.j.h[nArray[5]];
                                                            nArray[10] = nArray[10] + 4;
                                                            if (nArray[3] < nArray[1] + 480 && nArray[3] > nArray[1] - 480) break;
                                                            nArray[0] = 0;
                                                            int n8 = i2;
                                                            a2.c[n8] = (byte)(a2.c[n8] - 1);
                                                            break;
                                                        }
                                                        case 7: 
                                                        case 8: 
                                                        case 9: 
                                                        case 10: {
                                                            nArray[3] = this.ar.P;
                                                            nArray[4] = this.ar.N;
                                                            nArray[5] = this.ar.ag;
                                                            if (this.be[6] != 0 || (this.be[49] = (short)(this.be[49] + 1)) < this.be[50]) break;
                                                            this.be[49] = 0;
                                                            this.ar.C[0] = this.ar.C[0] - 1;
                                                            if (this.ar.C[0] > 0) break;
                                                            this.ar.C[0] = 0;
                                                            nArray[0] = 0;
                                                            int n9 = i2;
                                                            a2.c[n9] = (byte)(a2.c[n9] - 1);
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 5: {
                                                    bl = true;
                                                    break;
                                                }
                                                case 6: 
                                                case 16: {
                                                    bl = true;
                                                    nArray[3] = nArray[3] + game.a.aq[a2.au][i2][1] * game.j.h[n3];
                                                    nArray[4] = nArray[4] + game.a.aq[a2.au][i2][2] * game.j.h[n3];
                                                    break;
                                                }
                                                case 19: 
                                                case 25: {
                                                    bl = true;
                                                    n4 = a2.u[i2][i3][9];
                                                    nArray[3] = nArray[3] + (game.a.aq[a2.au][i2][1] * game.j.an[n4][0] >> 16);
                                                    nArray[4] = nArray[4] + (game.a.aq[a2.au][i2][2] * game.j.an[n4][1] >> 16);
                                                    break;
                                                }
                                                case 20: 
                                                case 24: {
                                                    bl = true;
                                                    switch (i2) {
                                                        case 0: {
                                                            nArray[3] = nArray[3] + game.a.aq[a2.au][i2][1] * game.j.h[nArray[5]];
                                                            nArray[4] = nArray[4] + game.a.aq[a2.au][i2][2] * game.j.h[nArray[5]];
                                                            break;
                                                        }
                                                        case 1: 
                                                        case 2: {
                                                            n4 = a2.u[i2][i3][9];
                                                            nArray[3] = nArray[3] + (game.a.aq[a2.au][i2][1] * game.j.an[n4][0] >> 16);
                                                            nArray[4] = nArray[4] + (game.a.aq[a2.au][i2][2] * game.j.an[n4][1] >> 16);
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 21: {
                                                    bl = true;
                                                    switch (i2) {
                                                        case 0: {
                                                            nArray[3] = nArray[3] + (game.a.aq[a2.au][i2][1] + nArray[10]) * game.j.h[nArray[5]];
                                                            nArray[10] = nArray[10] + 8;
                                                            break block0;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 22: {
                                                    bl = true;
                                                    switch (i2) {
                                                        case 0: 
                                                        case 1: 
                                                        case 2: {
                                                            n4 = a2.u[i2][i3][9];
                                                            nArray[3] = nArray[3] + ((game.a.aq[a2.au][i2][1] + nArray[10]) * game.j.an[n4][0] >> 16);
                                                            nArray[4] = nArray[4] + ((game.a.aq[a2.au][i2][2] + nArray[10]) * game.j.an[n4][1] >> 16);
                                                            nArray[10] = nArray[10] + 0;
                                                            break;
                                                        }
                                                        case 3: {
                                                            break;
                                                        }
                                                        case 4: {
                                                            n4 = a2.u[i2][i3][9];
                                                            nArray[3] = nArray[3] + ((game.a.aq[a2.au][i2][1] + nArray[10]) * game.j.an[n4][0] >> 16);
                                                            nArray[4] = nArray[4] + ((game.a.aq[a2.au][i2][2] + nArray[10]) * game.j.an[n4][1] >> 16);
                                                            nArray[10] = nArray[10] + 0;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 23: {
                                                    bl = true;
                                                    switch (i2) {
                                                        case 0: {
                                                            break block0;
                                                        }
                                                        case 1: {
                                                            nArray[3] = nArray[3] + game.a.aq[a2.au][i2][1] * game.j.h[nArray[5]];
                                                            nArray[4] = nArray[4] + game.a.aq[a2.au][i2][2] * game.j.h[nArray[5]];
                                                            break block0;
                                                        }
                                                        case 2: {
                                                            n4 = a2.u[i2][i3][9];
                                                            nArray[3] = nArray[3] + ((game.a.aq[a2.au][i2][1] + nArray[10]) * game.j.an[n4][0] >> 16);
                                                            nArray[4] = nArray[4] + ((game.a.aq[a2.au][i2][2] + nArray[10]) * game.j.an[n4][1] >> 16);
                                                            nArray[10] = nArray[10] + 0;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!bl || nArray[0] != 1) continue;
                                        n5 = this.bX[nArray[11]][nArray[7]].length - 2;
                                        if (nArray[8] < this.bX[nArray[11]][nArray[7]][nArray[6]][0] - 1) {
                                            nArray[8] = nArray[8] + 1;
                                            continue;
                                        }
                                        nArray[8] = 0;
                                        if (nArray[6] >= n5) break block52;
                                        nArray[6] = nArray[6] + 1;
                                        if (this.bX[nArray[11]][nArray[7]][nArray[6]][0] != 0) continue;
                                        if (a2.au != 21) break block53;
                                        if (nArray[5] != 1) break block54;
                                        if (this.be[33] + game.a.aq[a2.au][i2][4] >= this.be[27]) break block55;
                                    }
                                    if (nArray[5] != 2) continue;
                                    if (this.be[33] - game.a.aq[a2.au][i2][4] > this.be[27]) continue;
                                }
                                a2.H = true;
                                a2.d = 1;
                                this.be[27] = (short)(nArray[1] + game.a.aq[a2.au][i2][1] * game.j.h[nArray[5]]);
                                this.be[28] = (short)nArray[2];
                                continue;
                            }
                            if (a2.au != 23) continue;
                            if (nArray[5] != 1) break block56;
                            if (this.be[33] + game.a.aq[a2.au][i2][4] >= this.be[27]) break block57;
                        }
                        if (nArray[5] != 2) continue;
                        if (this.be[33] - game.a.aq[a2.au][i2][4] > this.be[27]) continue;
                    }
                    a2.H = true;
                    a2.d = 0;
                    this.be[27] = (short)(nArray[1] + game.a.aq[a2.au][i2][1] * game.j.h[nArray[5]]);
                    this.be[28] = (short)nArray[2];
                    continue;
                }
                if (this.bX[nArray[11]][nArray[7]][n5 + 1][0] == 0) {
                    nArray[6] = 0;
                    continue;
                }
                nArray[0] = 0;
                int n10 = i2;
                a2.c[n10] = (byte)(a2.c[n10] - 1);
            }
        }
    }

    private void a(a a2, int n, int n2) {
        int n3 = 0;
        int n4 = -1;
        boolean bl = false;
        boolean bl2 = false;
        int n5 = 0;
        int n6 = 0;
        if (a2.u == null) {
            return;
        }
        for (int i2 = 0; i2 < a2.u.length; ++i2) {
            if (a2.u[i2] == null) continue;
            for (int i3 = 0; i3 < a2.u[i2].length; ++i3) {
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int[] nArray = a2.u[i2][i3];
                if (nArray[0] != 1) continue;
                n3 = nArray[5];
                short s = this.bX[nArray[11]][nArray[7]][nArray[6]][1];
                if (a2.au >= 1 && a2.au <= 25) {
                    if (a2.a[0] <= 0 || ((game.c)a2).n[9] || !a2.Q) continue;
                    n13 = 0;
                    n12 = 0;
                    n11 = 0;
                    n10 = 0;
                    n9 = 0;
                    n8 = 0;
                    if (a2.au != 22) {
                        for (n7 = 1; n7 >= 0; --n7) {
                            if (this.ar.u[this.ar.d][n7][0] != 1 || this.a(n13 = this.ar.W[n7][0], n12 = this.ar.W[n7][1], n11 = this.bO[n6 = this.ar.u[this.ar.d][n7][11]][this.ar.Y[n7]][2] - this.bO[n6][this.ar.Y[n7]][0], n10 = this.bO[n6][this.ar.Y[n7]][3] - this.bO[n6][this.ar.Y[n7]][1], n9 = nArray[3] + (n3 == 1 ? this.bO[nArray[11]][s][0] : -this.bO[nArray[11]][s][2]), n8 = nArray[4] - this.bO[nArray[11]][s][1], this.bO[nArray[11]][s][2] - this.bO[nArray[11]][s][0], this.bO[nArray[11]][s][3] - this.bO[nArray[11]][s][1], 4) >= 3000) continue;
                            nArray[0] = 0;
                            int n14 = i2;
                            a2.c[n14] = (byte)(a2.c[n14] - 1);
                            this.be[70] = 1;
                            this.bz = this.a(n13, n12, n11, n10, n9, n8, this.bO[nArray[11]][s][2] - this.bO[nArray[11]][s][0], this.bO[nArray[11]][s][3] - this.bO[nArray[11]][s][1]);
                            int[] nArray2 = this.a(this.bz);
                            this.b(a2, 0, 11, nArray2[0], nArray2[1], this.ar.ag, 26, 1, 1, -1, 0, 1);
                        }
                    }
                    if (nArray[0] != 1) continue;
                    this.ar.n[15] = true;
                    this.be[5] = 0;
                    if (this.a(this.ar, nArray[3] + (n3 == 1 ? this.bO[nArray[11]][s][0] : -this.bO[nArray[11]][s][2]), nArray[4] - this.bO[nArray[11]][s][1], this.bO[nArray[11]][s][2] - this.bO[nArray[11]][s][0], this.bO[nArray[11]][s][3] - this.bO[nArray[11]][s][1], game.a.aq[a2.au][i2][7 + this.aq[0]], 1) != 1000) continue;
                    nArray[0] = 0;
                    int n15 = i2;
                    a2.c[n15] = (byte)(a2.c[n15] - 1);
                    if (this.ar.as[0] <= 0 || this.ar.a[0] <= 0) continue;
                    n5 = this.ar.as[0] * 100 / this.ar.a[0];
                    if (this.ar.u[this.ar.d][1][0] == 1 && (this.L(this.ar.d + 44) == 8 || this.L(this.ar.d + 44) == 7) || this.ar.y[0] == 13 || n5 < 1) continue;
                    if (n5 >= 1 && n5 < 10) {
                        if (this.ar.n[5]) {
                            this.d(this.ar, 5, 0);
                            this.ar.ap = true;
                            continue;
                        }
                        this.d(this.ar, 6, 0);
                        this.ar.ap = true;
                        continue;
                    }
                    if (n5 < 10) continue;
                    this.d(this.ar, 4, 0);
                    this.ar.ap = true;
                    this.ar.v = (short)(this.ar.v & 3);
                    this.ar.aw = (short)(this.ar.aw & 3);
                    this.ar.ag = (byte)(nArray[5] == 1 ? 2 : 1);
                    this.ar.v = (short)(this.ar.v | (this.ar.ag == 1 ? 4 : 8));
                    this.ar.n[11] = true;
                    this.ar.n[4] = true;
                    this.ar.n[5] = false;
                    this.ar.a(this.bm[3]);
                    continue;
                }
                if (a2.au != 0) continue;
                n13 = 0;
                n12 = 0;
                n11 = 0;
                n10 = 0;
                n9 = 0;
                if (this.c == null) continue;
                for (n7 = 0; n7 < this.c.length; ++n7) {
                    n8 = this.c[n7].au & 0xFFFFFF7F;
                    int n16 = i3;
                    if (n16 == 1) {
                        n9 = 2;
                        n6 = 26;
                    } else if (n16 == 0) {
                        n9 = 1;
                        n6 = this.ar.au & 0xFFFFFF7F;
                    }
                    this.ar.as[1] = n16;
                    n11 = this.bO[n6][this.ar.Y[n16]][2] - this.bO[n6][this.ar.Y[n16]][0];
                    n10 = this.bO[n6][this.ar.Y[n16]][3] - this.bO[n6][this.ar.Y[n16]][1];
                    n13 = this.ar.W[n16][0];
                    n12 = this.ar.W[n16][1];
                    if (this.c[n7].n[9] || !this.c[n7].n[13] || n16 != 1 && (n16 != 0 || this.ar.ar[0] < 14)) continue;
                    this.be[5] = 0;
                    if (this.a(this.c[n7], n13, n12, n11, n10, this.ar.Z[1], n9) != 1000) continue;
                    if (this.ar.ax < 9) {
                        byte by = this.ar.j;
                        this.w[by] = this.w[by] + 1;
                    }
                    if (n8 >= 1 && n8 <= 18) {
                        if (this.c[n7].n[0]) {
                            e.f(this.c[n7].O, 4);
                            this.c[n7].ap = true;
                            this.c[n7].aB = false;
                            if (n8 < 1 || n8 > 18) continue;
                            byte[][] byArrayArray = new byte[][]{new byte[0], {0, 0, 0, 0, 0, 0, 50, 50}, {20, 20, 20, 20, 20, 0, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {20, 20, 20, 20, 20, 0, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {20, 20, 20, 20, 20, 0, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {20, 20, 20, 20, 20, 0, 0, 0}, {20, 20, 20, 20, 20, 0, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {10, 10, 10, 10, 10, 50, 0, 0}, {20, 20, 20, 20, 20, 0, 0, 0}};
                            int n17 = this.a(byArrayArray[n8]);
                            int[] nArray3 = this.b((i)this.c[n7]);
                            this.b(this.c[n7], 0, 24 + n17, nArray3[0] + (nArray3[2] >> 1), nArray3[1] - (nArray3[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                            continue;
                        }
                        if (n8 >= 13 && n8 <= 17) continue;
                        e.f(this.c[n7].O, 3);
                        continue;
                    }
                    if (n8 < 19 || n8 > 25 || this.c[n7].a[0] != 0) continue;
                    this.be[62] = 20;
                    e.f(this.c[n7].O, 4);
                    this.c[n7].aB = false;
                }
            }
        }
    }

    private void f(a a2, int n, int n2) {
        boolean bl = false;
        if (a2.u == null) {
            return;
        }
        if (a2.u.length > 0) {
            for (int i2 = 0; i2 < a2.u.length; ++i2) {
                for (int i3 = 0; i3 < a2.u[i2].length; ++i3) {
                    int[] nArray = a2.u[i2][i3];
                    if (nArray[0] != 1) continue;
                    int n3 = 0xFF0000;
                    if (nArray[0] != 1) continue;
                    this.Y.a(this.cn[nArray[11]], this.au[nArray[11]][this.bX[nArray[11]][nArray[7]][nArray[6]][1]], nArray[3] + 0, nArray[4] - 30, 1, this.ak[nArray[11]], (byte)nArray[5], this.aC[0] + this.be[19], this.aC[1] + this.be[20], nArray[11]);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(a a2) {
        int[] nArray;
        Object var2_2 = null;
        Object var3_3 = null;
        Object var4_4 = null;
        int n = a2.au & 0xFFFFFF7F;
        if (a2 == null) {
            return;
        }
        int n2 = 0;
        int[][][] nArrayArray = new int[][][]{new int[][]{{0, 6, 18}}, new int[][]{new int[0], {0, 1, 23}, {12, 11, 13}}, new int[][]{new int[0], {0, 1, 23, 2, 22}, {12, 11, 13, 10, 14}}, new int[][]{{6, 0, 18, 12, 3, 21, 15, 9}}};
        int n3 = -1;
        if (a2.aC) {
            if (n == 0) {
                n3 = this.a(a2.d);
                nArray = a2.u[a2.d][0];
                if (a2.y[0] == 11 || a2.y[0] == 12 || a2.y[0] == 13) {
                    nArray[0] = 1;
                    nArray[1] = a2.P;
                    nArray[2] = a2.N;
                    nArray[3] = nArray[1];
                    nArray[4] = nArray[2];
                    nArray[5] = a2.ag;
                    nArray[6] = 0;
                    nArray[11] = 0;
                    switch (a2.y[0]) {
                        case 11: 
                        case 12: 
                        case 13: {
                            nArray[7] = a2.ar[0] + 46 + n3 / 5 * 46;
                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = this.bX[nArray[11]][a2.ar[0]][this.bX[nArray[11]][a2.ar[0]].length - 1][0];
                            break;
                        }
                    }
                }
            }
            a2.aC = false;
        }
        if (a2.H) {
            if (a2.au == 0) {
                int n4 = this.L(a2.d + 22);
                if (n4 >= 0) {
                    nArray = a2.u[a2.d][1];
                    if (a2.y[0] == 13) {
                        nArray[0] = 1;
                        nArray[1] = a2.P;
                        nArray[2] = a2.N;
                        nArray[3] = nArray[1];
                        nArray[4] = nArray[2];
                        nArray[5] = a2.ag;
                        nArray[6] = 0;
                        nArray[11] = 26;
                        nArray[7] = n4;
                        switch (this.L(a2.d + 44)) {
                            case 0: 
                            case 1: 
                            case 2: 
                            case 4: 
                            case 5: 
                            case 6: {
                                this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                break;
                            }
                            case 3: {
                                nArray[10] = 0;
                                this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                break;
                            }
                            case 7: {
                                this.be[49] = 0;
                                this.be[50] = 1;
                                this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                break;
                            }
                            case 8: {
                                this.be[49] = 0;
                                this.be[50] = 1;
                                this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                break;
                            }
                            case 9: {
                                this.be[49] = 0;
                                this.be[50] = 1;
                                this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                break;
                            }
                            case 10: {
                                this.be[49] = 0;
                                this.be[50] = 2;
                                this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                break;
                            }
                            default: {
                                break;
                            }
                        }
                    }
                }
            } else if (n >= 1 && n <= 25) {
                if (game.a.aq[a2.au].length > 0) {
                    n3 = a2.d;
                    if (a2.c[n3] < game.a.aq[a2.au][n3][6] && a2.u[n3] != null) {
                        for (int i2 = 0; i2 < a2.u[n3].length; ++i2) {
                            nArray = a2.u[n3][i2];
                            if (nArray[0] != 0) continue;
                            if (n2 >= game.a.aq[a2.au][n3][0]) continue;
                            ++n2;
                            int n5 = n3;
                            a2.c[n5] = (byte)(a2.c[n5] + 1);
                            nArray[0] = 1;
                            nArray[5] = a2.ag;
                            nArray[6] = 0;
                            switch (a2.au) {
                                case 5: {
                                    nArray[1] = a2.P;
                                    nArray[2] = a2.N;
                                    nArray[11] = 5;
                                    nArray[7] = 2;
                                    this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                    break;
                                }
                                case 6: {
                                    nArray[1] = a2.P;
                                    nArray[2] = a2.N;
                                    nArray[11] = 6;
                                    nArray[7] = 5;
                                    this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                    break;
                                }
                                case 16: {
                                    nArray[1] = a2.P;
                                    nArray[2] = a2.N;
                                    nArray[11] = 16;
                                    nArray[7] = 10;
                                    this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                    break;
                                }
                                case 19: 
                                case 25: {
                                    nArray[1] = this.be[27];
                                    nArray[2] = this.be[28] - 7;
                                    nArray[11] = a2.au;
                                    nArray[7] = 9;
                                    nArray[9] = nArrayArray[0][0][n2];
                                    this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                    break;
                                }
                                case 20: 
                                case 24: {
                                    nArray[5] = a2.ag;
                                    switch (n3) {
                                        case 0: {
                                            nArray[1] = a2.P + 25 * game.j.h[a2.ag];
                                            nArray[2] = a2.N + 34 - 20 + 12 * n2;
                                            nArray[11] = 26;
                                            nArray[7] = 18;
                                            nArray[9] = -1;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 1: {
                                            nArray[1] = a2.P + 25 * game.j.h[a2.ag] + (this.cm.nextInt() & Integer.MAX_VALUE) % 10;
                                            nArray[2] = a2.N + 34 + (this.cm.nextInt() & Integer.MAX_VALUE) % 8;
                                            nArray[11] = 26;
                                            nArray[7] = 18;
                                            nArray[9] = nArrayArray[1][a2.ag][Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % 3];
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 2: {
                                            nArray[1] = a2.P + 25 * game.j.h[a2.ag] + (this.cm.nextInt() & Integer.MAX_VALUE) % 10;
                                            nArray[2] = a2.N + 34 + (this.cm.nextInt() & Integer.MAX_VALUE) % 15;
                                            nArray[11] = 2;
                                            nArray[7] = 1;
                                            nArray[9] = nArrayArray[2][a2.ag][Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % 5];
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 3: {
                                            nArray[1] = a2.P - 16 * game.j.h[a2.ag];
                                            nArray[2] = a2.N;
                                            nArray[11] = 26;
                                            nArray[7] = 60;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 21: {
                                    switch (n3) {
                                        case 0: {
                                            nArray[10] = 0;
                                            nArray[5] = a2.ag;
                                            nArray[1] = a2.P + 48 * game.j.h[a2.ag];
                                            nArray[2] = a2.N;
                                            nArray[11] = 21;
                                            nArray[7] = 5;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 1: {
                                            nArray[5] = this.be[25];
                                            nArray[1] = this.be[27];
                                            nArray[2] = this.be[28];
                                            nArray[11] = 26;
                                            nArray[7] = 19;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 22: {
                                    int n6 = -1;
                                    switch (n3) {
                                        case 0: {
                                            nArray[7] = 5 + Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % 4;
                                            nArray[5] = a2.ag;
                                            nArray[1] = a2.P + 4 * game.j.h[a2.ag];
                                            nArray[2] = a2.N + 36;
                                            nArray[11] = 22;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            n6 = this.a(nArray[1], nArray[2], (int)this.be[27], this.be[28] + 20);
                                            nArray[10] = 0;
                                            nArray[9] = n6;
                                            break;
                                        }
                                        case 1: {
                                            nArray[7] = 5 + Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % 4;
                                            nArray[5] = a2.ag;
                                            nArray[1] = a2.P + 4 * game.j.h[a2.ag];
                                            nArray[2] = a2.N + 36;
                                            nArray[11] = 22;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            n6 = this.a(nArray[1], nArray[2], (int)this.be[27], this.be[28] + 20);
                                            nArray[10] = 0;
                                            nArray[9] = n6 + (n2 - 2) * 2;
                                            break;
                                        }
                                        case 2: {
                                            nArray[7] = 5 + Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % 4;
                                            nArray[5] = a2.ag;
                                            nArray[1] = a2.P + 4 * game.j.h[a2.ag];
                                            nArray[2] = a2.N + 36;
                                            nArray[11] = 22;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            n6 = this.a(nArray[1], nArray[2], (int)this.be[27], this.be[28] + 20);
                                            nArray[10] = 0;
                                            nArray[9] = n6 + (n2 - 3) * 2;
                                            break;
                                        }
                                        case 3: {
                                            int[] nArray2 = new int[]{-1, 56, 24, 28, -1, -1, -26, 28, 13, 53, 22, 44, 22, 17, 15, 3, -13, 4, -20, 13, -21, 39, -13, 50};
                                            nArray[1] = a2.P + nArray2[2 * (n2 - 1)] * game.j.h[a2.ag];
                                            nArray[2] = a2.N + nArray2[2 * (n2 - 1) + 1];
                                            nArray[11] = 22;
                                            nArray[7] = 11;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                            break;
                                        }
                                        case 4: {
                                            int[] nArray3 = new int[]{-1, 56, 24, 28, -1, -1, -26, 29, 16, 46, 17, 8, -19, 13, -17, 46};
                                            nArray[1] = a2.P + nArray3[2 * (n2 - 1)] * game.j.h[a2.ag];
                                            nArray[2] = a2.N + nArray3[2 * (n2 - 1) + 1];
                                            nArray[11] = 22;
                                            nArray[7] = 16;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                            nArray[9] = nArrayArray[3][0][n2 - 1];
                                            nArray[10] = 0;
                                            break;
                                        }
                                        case 5: 
                                        case 6: {
                                            int[] nArray4 = this.b((i)this.ar);
                                            nArray4[0] = nArray4[0] - 80;
                                            nArray4[1] = nArray4[1] + 60;
                                            nArray4[2] = nArray4[2] + 160;
                                            nArray4[3] = nArray4[3] + 120;
                                            int[] nArray5 = this.a(nArray4);
                                            nArray[1] = nArray5[0];
                                            nArray[2] = nArray5[1];
                                            nArray[11] = 22;
                                            nArray[7] = 11;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                            break;
                                        }
                                    }
                                    if (nArray[9] < 0) {
                                        nArray[9] = nArray[9] + game.j.an.length;
                                    }
                                    if (nArray[9] < game.j.an.length) break;
                                    nArray[9] = nArray[9] - game.j.an.length;
                                    break;
                                }
                                case 23: {
                                    switch (n3) {
                                        case 0: {
                                            nArray[5] = this.be[25];
                                            nArray[1] = this.be[27];
                                            nArray[2] = this.be[28];
                                            nArray[11] = 26;
                                            nArray[7] = 19;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 1;
                                            break;
                                        }
                                        case 1: {
                                            nArray[5] = a2.ag;
                                            nArray[1] = a2.P + 10 * game.j.h[a2.ag];
                                            nArray[2] = a2.N + 31;
                                            nArray[11] = 23;
                                            nArray[7] = 12;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 2: {
                                            nArray[1] = a2.P + 10 * game.j.h[a2.ag];
                                            nArray[2] = a2.N + 31;
                                            nArray[11] = 23;
                                            nArray[7] = 12;
                                            this.bX[nArray[11]][nArray[7]][this.bX[nArray[11]][nArray[7]].length - 1][0] = 0;
                                            nArray[10] = 0;
                                            nArray[9] = n2 - 1;
                                            if (nArray[9] >= 0 && nArray[9] <= 6 || nArray[9] >= 19 && nArray[9] <= 23) {
                                                nArray[5] = 1;
                                                break;
                                            }
                                            if (nArray[9] < 7 || nArray[9] > 18) break;
                                            nArray[5] = 2;
                                        }
                                    }
                                    break;
                                }
                            }
                            nArray[3] = nArray[1];
                            nArray[4] = nArray[2];
                        }
                    }
                }
            }
            a2.H = false;
        }
    }

    private void A(int n) {
        int n2 = this.ar.P / 240;
        int n3 = this.ar.N / 260;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int[] nArray = null;
        for (int i2 = 0; i2 < this.bC[n].length; i2 += 3) {
            if (this.bC[n][i2 + 0] != n2 || this.bC[n][i2 + 1] != n3) continue;
            for (int i3 = 0; i3 < 4; ++i3) {
                n8 = this.bC[n][i2 + 2] & 1 << i3;
                switch (n8) {
                    case 1: {
                        n4 = n2 * 240 + this.by * 1;
                        n5 = (n3 + 1) * 260 + this.ab;
                        n6 = 240 - this.by * 2;
                        n7 = 3;
                        break;
                    }
                    case 2: {
                        n4 = n2 * 240 + this.by * 1;
                        n5 = n3 * 260 - this.ab;
                        n6 = 240 - this.by * 2;
                        n7 = 23;
                        break;
                    }
                    case 4: {
                        n4 = n2 * 240;
                        n5 = (n3 + 1) * 260 - this.ab;
                        n6 = 3;
                        n7 = 260 - this.ab;
                        break;
                    }
                    case 8: {
                        n4 = (n2 + 1) * 240 - 4;
                        n5 = (n3 + 1) * 260 - this.ab;
                        n6 = 3;
                        n7 = 260 - this.ab;
                    }
                }
                nArray = this.b((i)this.ar);
                int n9 = this.bi[n * 3 + 1] + n2;
                int n10 = this.bi[n * 3 + 2] + n3;
                int n11 = this.a(n4, n5, n6, n7, nArray[0], nArray[1], nArray[2], nArray[3], n8);
                if (n11 >= 3000) continue;
                switch (n8) {
                    case 1: {
                        ++n10;
                        break;
                    }
                    case 2: {
                        --n10;
                        break;
                    }
                    case 4: {
                        --n9;
                        break;
                    }
                    case 8: {
                        ++n9;
                    }
                }
                this.bj = this.e(n, n9, n10, n8);
                if (n8 != 1 && n8 != 2 && ((n8 != 4 || this.ar.ag != 2) && (n8 != 8 || this.ar.ag != 1) || this.ar.y[0] != 1 && this.ar.y[0] != 2 && this.ar.y[0] != 8) || this.bj < 0) continue;
                this.e = true;
                this.be[17] = (short)(this.aC[0] / 240 + this.bi[n * 3 + 1]);
                this.be[18] = (short)(this.aC[1] / 320 + this.bi[n * 3 + 2]);
                e.a(this.bf, 22);
                return;
            }
        }
    }

    private int e(int n, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.bi.length; i2 += 3) {
            if (n2 < this.bi[i2 + 1] || n2 >= this.bi[i2 + 1] + this.ad[this.bi[i2] * 2] || n3 < this.bi[i2 + 2] || n3 >= this.bi[i2 + 2] + this.ad[this.bi[i2] * 2 + 1]) continue;
            switch (n4) {
                case 1: {
                    e.z[0] = this.ar.P / 240 * 240 + 120 - (this.bi[i2 + 1] - this.bi[n * 3 + 1]) * 240;
                    e.z[1] = 20;
                    break;
                }
                case 2: {
                    e.z[0] = this.ar.P / 240 * 240 + 120 - (this.bi[i2 + 1] - this.bi[n * 3 + 1]) * 240;
                    e.z[1] = this.ad[this.bi[i2] * 2 + 1] * 260 - 25;
                    break;
                }
                case 4: {
                    e.z[0] = this.ad[this.bi[i2] * 2] * 240 - 20;
                    e.z[1] = this.ar.N - (this.bi[i2 + 2] - this.bi[n * 3 + 2]) * 260;
                    break;
                }
                case 8: {
                    e.z[0] = 14;
                    e.z[1] = this.ar.N - (this.bi[i2 + 2] - this.bi[n * 3 + 2]) * 260;
                }
            }
            return i2 / 3;
        }
        return -1;
    }

    public int b(byte by) {
        byte[][] byArrayArray = new byte[][]{{0, 1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, {17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28}, {29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41}, {42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55}};
        for (int i2 = 0; i2 < byArrayArray.length; ++i2) {
            if (e.a(by, byArrayArray[i2]) < 0) continue;
            return i2;
        }
        return 0;
    }

    private void b(game.c c2) {
        int n = -1;
        if (c2 == null) {
            return;
        }
        int n2 = c2.au & 0xFFFFFF7F;
        if (c2.Q) {
            switch (c2.O[0]) {
                case 5: {
                    if (c2.aB || this.a(this.ar, c2, c2.K, 2) <= 0) break;
                    c2.aB = true;
                    e.f(c2.O, 0);
                    break;
                }
                case 0: {
                    c2.n[13] = true;
                    if (this.a(this.ar, c2, c2.B, 2) > 0) {
                        e.f(c2.O, 1);
                        break;
                    }
                    this.d(c2, 7, 0);
                    e.f(c2.O, 2);
                    break;
                }
                case 1: {
                    e.f(c2.O, 2);
                    n = this.a(this.v[n2]);
                    this.d(c2, n, 0);
                    if (c2.y[0] != -1) break;
                    break;
                }
                case 2: {
                    if (c2.y[0] == 7 && (c2.au == 5 || c2.au == 6 || c2.au == 8 || c2.au == 9 || c2.au == 14 || c2.au == 16)) {
                        if (this.a(this.ar, c2, c2.B, 2) > 0) {
                            e.f(c2.O, 1);
                            break;
                        }
                        this.a(c2, this.ar);
                        if (c2.L != -1) break;
                        e.f(c2.O, 0);
                        break;
                    }
                    if (c2.O[1] == 4) {
                        this.a(c2, this.ar);
                        if (c2.L != -1 && c2.y[0] != -1) break;
                        if (n2 == 3) {
                            c2.n[0] = false;
                            c2.a[0] = c2.a[1];
                            e.f(c2.O, 5);
                            break;
                        }
                        c2.Q = false;
                        break;
                    }
                    if (c2.O[1] == 3) {
                        this.a(c2, this.ar);
                        if (c2.L != -1 && !c2.F) break;
                        if (n2 == 2) {
                            this.d(c2, 0, 11);
                            c2.ap = true;
                            e.f(c2.O, 2);
                            break;
                        }
                        if (n2 == 3) {
                            this.d(c2, 6, 5);
                            c2.ap = true;
                            e.f(c2.O, 2);
                            break;
                        }
                        e.f(c2.O, 1);
                        break;
                    }
                    this.a(c2, this.ar);
                    if (c2.L != -1 && !c2.F) break;
                    if (n2 == 2 && c2.O[1] == 1) {
                        c2.Q = false;
                        break;
                    }
                    e.f(c2.O, 0);
                    break;
                }
                case 3: {
                    c2.v = 0;
                    c2.ak = (short)-1;
                    this.d(c2, 8, 0);
                    c2.ap = true;
                    e.f(c2.O, 2);
                    break;
                }
                case 4: {
                    c2.v = 0;
                    c2.ak = (short)-1;
                    this.d(c2, 9, 0);
                    c2.ap = true;
                    e.f(c2.O, 2);
                }
            }
        }
    }

    private void a(game.c c2) {
        if (c2 == null) {
            return;
        }
        int n = c2.au & 0xFFFFFF7F;
        int n2 = 0;
        if (c2.Q) {
            switch (c2.O[0]) {
                case 5: {
                    if (c2.aB || this.a(this.ar, c2, c2.K, 2) <= 0) break;
                    if (this.be[45] == 0 && this.bL[this.aq[0]][this.be[22]][0] == 0) {
                        switch (n) {
                            case 19: {
                                if (this.aq[0] != 0) break;
                                this.a(6, 1);
                                break;
                            }
                            case 20: {
                                if (this.aq[0] == 0) {
                                    this.a(8, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(76, 1);
                                break;
                            }
                            case 21: {
                                if (this.aq[0] == 0) {
                                    this.a(10, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(78, 1);
                                break;
                            }
                            case 22: {
                                if (this.aq[0] == 0) {
                                    this.a(12, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(80, 1);
                                break;
                            }
                            case 23: {
                                if (this.aq[0] == 0) {
                                    this.a(16, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(84, 1);
                                break;
                            }
                            case 24: {
                                if (this.aq[0] == 0) {
                                    this.a(18, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(22, 1);
                                break;
                            }
                            case 25: {
                                if (this.aq[0] == 0) {
                                    this.a(14, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(82, 1);
                            }
                        }
                        break;
                    }
                    c2.aB = true;
                    e.f(c2.O, 0);
                    break;
                }
                case 0: {
                    c2.n[13] = true;
                    e.f(c2.O, 1);
                    break;
                }
                case 1: {
                    byte[][][] byArrayArray = new byte[][][]{new byte[][]{{100}, {50, 50}, {33, 33, 34}, {25, 25, 25, 25}, {20, 20, 20, 20, 20}}, new byte[][]{{16, 16, 17, 17, 17, 17}, {0, 16, 16, 17, 17, 17, 17}, {0, 0, 16, 16, 17, 17, 17, 17}, {0, 0, 0, 16, 16, 17, 17, 17, 17}, {0, 0, 0, 0, 16, 16, 17, 17, 17, 17}}};
                    int n3 = (c2.a[1] - c2.a[0]) * 100 / c2.a[1] / 20;
                    if (n3 > this.be[24] && n3 < 5) {
                        this.be[24] = (short)n3;
                        n2 = byArrayArray[this.aq[0]][this.be[24]].length - 1;
                    } else {
                        n2 = this.a(byArrayArray[this.aq[0]][this.be[24]]);
                    }
                    this.d(c2, n2, 0);
                    e.f(c2.O, 2);
                    if (c2.y[0] != -1) break;
                    break;
                }
                case 2: {
                    if (c2.O[1] == 4) {
                        this.a(c2, this.ar);
                        if (c2.L == -1) {
                            c2.Q = false;
                        }
                    }
                    if (c2.O[1] == 6) {
                        this.a(c2, this.ar);
                        if (c2.L != -1) break;
                        e.f(c2.O, 5);
                        this.s = false;
                        this.a(20, 1);
                        break;
                    }
                    this.a(c2, this.ar);
                    if (c2.L != -1) break;
                    e.f(c2.O, 1);
                    break;
                }
                case 4: {
                    c2.v = 0;
                    c2.ak = (short)-1;
                    c2.F = true;
                    this.d(c2, 10, 0);
                    c2.ap = true;
                    e.f(c2.O, 2);
                    this.f();
                    if (this.bL[this.aq[0]][this.be[22]][0] == 0) {
                        this.bL[this.aq[0]][this.be[22]][0] = 1;
                        switch (n) {
                            case 19: {
                                if (this.aq[0] != 0) break;
                                if (this.aG[0][3] < this.aG[0][2]) {
                                    this.U(0);
                                    this.al = "01";
                                    break;
                                }
                                this.p(this.ar.j);
                                this.aj[this.ar.j][0] = 1;
                                this.aj[this.ar.j][1] = 2;
                                this.w[this.ar.j] = 0;
                                this.v(0);
                                this.a(7, 1);
                                break;
                            }
                            case 20: {
                                if (this.aq[0] == 0) {
                                    this.a(9, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(77, 1);
                                break;
                            }
                            case 21: {
                                if (this.aq[0] == 0) {
                                    this.a(11, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(79, 1);
                                break;
                            }
                            case 22: {
                                if (this.aq[0] == 0) {
                                    this.a(13, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(81, 1);
                                break;
                            }
                            case 23: {
                                if (this.aq[0] == 0) {
                                    this.a(17, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(85, 1);
                                break;
                            }
                            case 24: {
                                if (this.aq[0] == 0) {
                                    this.a(19, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(23, 1);
                                break;
                            }
                            case 25: {
                                if (this.aq[0] == 0) {
                                    this.bc = this.a(this.bc, this.aj, 1, 6);
                                    this.a(15, 1);
                                    break;
                                }
                                if (this.aq[0] != 1) break;
                                this.a(83, 1);
                            }
                        }
                        break;
                    }
                    this.f(this.o + 1, -1);
                    break;
                }
                case 6: {
                    if (n != 23) break;
                    this.d(c2, 12, 0);
                    e.f(c2.O, 2);
                }
            }
        }
        if (!c2.n[0] && this.aq[0] > 0) {
            ++this.bR;
        }
    }

    public int a(byte[] byArray) {
        int n = -1;
        int n2 = e.k(100);
        int n3 = 0;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (n2 >= n3 && n2 < n3 + byArray[i2]) {
                n3 += byArray[i2];
                n = i2;
                break;
            }
            n3 += byArray[i2];
        }
        return n;
    }

    public int[] e(a a2) {
        int n = a2.P;
        int n2 = a2.N;
        int n3 = a2.am[2];
        int n4 = a2.am[3];
        int[] nArray = new int[]{0, 0, 0};
        nArray = this.a((long)(n3 - n), (long)(n4 - n2), (long)a2.aE[0]);
        int n5 = a2.aa - n3;
        int n6 = a2.G - n4;
        if (n5 * n5 + n6 * n6 <= a2.aE[0] * a2.aE[0]) {
            nArray[2] = 1;
            a2.aa = n3;
            a2.G = n4;
        } else {
            a2.aa += nArray[0];
            a2.G += nArray[1];
        }
        a2.P = a2.aa;
        a2.N = a2.G;
        if (nArray[2] != 1) {
            if (a2.aa <= a2.E[0]) {
                a2.aa = a2.E[0];
                nArray[2] = 1;
            } else if (a2.aa >= a2.E[0] + a2.E[2]) {
                a2.aa = a2.E[0] + a2.E[2];
                nArray[2] = 1;
            }
        }
        if (nArray[2] == 1) {
            a2.I = a2.P = a2.aa;
            a2.g = a2.P;
            a2.ai = a2.N = a2.G;
            a2.aG = a2.N;
            a2.v = 0;
            a2.ak = (short)-1;
            a2.z = a2.v;
        }
        return nArray;
    }

    private int[] a(long l, long l2, long l3) {
        int[] nArray = new int[]{0, 0, 0};
        int n = e.a(l * l + l2 * l2);
        if (n == 0) {
            nArray[2] = 1;
            return nArray;
        }
        if (l2 != 0L) {
            nArray[0] = (int)(l3 * l / (long)n);
        }
        if (l != 0L) {
            nArray[1] = (int)(l3 * l2 / (long)n);
        }
        if (l == 0L) {
            nArray[0] = 0;
            nArray[1] = (int)(l3 + 2L * l3 * ((l2 & Integer.MIN_VALUE) >> 31));
        }
        if (l2 == 0L) {
            nArray[1] = 0;
            nArray[0] = (int)(l3 + 2L * l3 * ((l & Integer.MIN_VALUE) >> 31));
        }
        return nArray;
    }

    private void c(game.c c2) {
        if (!this.e) {
            if (c2 == null) {
                return;
            }
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            boolean bl = false;
            int n6 = c2.au & 0xFFFFFF7F;
            if (c2 == null) {
                return;
            }
            if (this.ar.S[0] >= this.ar.S[1] && c2.a[0] > 0 && !c2.n[9] && c2.Q) {
                int n7 = 0;
                for (int i2 = 1; i2 >= 0; --i2) {
                    int n8 = c2.au & 0xFFFFFF7F;
                    if (i2 == 0) {
                        n4 = this.I[n8][c2.Y[0]][2] - this.I[n8][c2.Y[0]][0];
                        n5 = this.I[n8][c2.Y[0]][3] - this.I[n8][c2.Y[0]][1];
                        n2 = c2.P + (c2.ag == 1 ? this.I[n8][c2.Y[0]][0] : -this.I[n8][c2.Y[0]][2]);
                        n3 = c2.N - this.I[n8][c2.Y[0]][1];
                        n = 0;
                    } else if (i2 == 1) {
                        n4 = this.bO[n8][c2.Y[0]][2] - this.bO[n8][c2.Y[0]][0];
                        n5 = this.bO[n8][c2.Y[0]][3] - this.bO[n8][c2.Y[0]][1];
                        n2 = c2.W[0][0];
                        n3 = c2.W[0][1];
                        n = 1;
                    }
                    if ((n8 < 1 || n8 > 18) && (n8 < 19 || n8 > 25 || i2 != 1) || !c2.n[13]) continue;
                    this.ar.n[15] = true;
                    this.be[5] = 0;
                    if (this.a(this.ar, n2, n3, n4, n5, c2.Z[1], n) != 1000 || this.ar.as[0] <= 0 || this.ar.a[0] <= 0) continue;
                    n7 = this.ar.as[0] * 100 / this.ar.a[0];
                    if (this.ar.u[this.ar.d][1][0] == 1 && (this.L(this.ar.d + 44) == 8 || this.L(this.ar.d + 44) == 7) || this.ar.y[0] == 13) continue;
                    if (n7 >= 1 && this.ar.n[15]) {
                        this.ar.ag = (byte)(c2.P > this.ar.P ? 1 : 2);
                    }
                    if (n7 < 1) continue;
                    if (n7 >= 1 && n7 < 10) {
                        if (this.ar.n[5]) {
                            this.d(this.ar, 5, 0);
                            this.ar.ap = true;
                            continue;
                        }
                        this.d(this.ar, 6, 0);
                        this.ar.ap = true;
                        continue;
                    }
                    if (n7 < 10) continue;
                    this.d(this.ar, 4, 0);
                    this.ar.ap = true;
                    this.ar.v = (short)(this.ar.v & 3);
                    this.ar.aw = (short)(this.ar.aw & 3);
                    this.ar.v = (short)(this.ar.v | (this.ar.ag == 1 ? 4 : 8));
                    this.ar.n[11] = true;
                    this.ar.n[4] = true;
                    this.ar.n[5] = false;
                    this.ar.a(this.bm[3]);
                }
            }
        }
    }

    private short a(a a2, int n, int n2, int n3, int n4, int n5, int n6) {
        short s = 3000;
        int n7 = a2.au & 0xFFFFFF7F;
        boolean bl = false;
        short[] sArray = null;
        if (a2.a[0] == 0) {
            return s;
        }
        if (n7 == 0) {
            sArray = ((h)a2).S;
        } else if (n7 >= 1) {
            sArray = ((game.c)a2).R;
        }
        if (sArray[0] >= sArray[1] && a2.a[0] > 0) {
            bl = true;
        }
        int[] nArray = new int[]{0, 0, 0, 0};
        if (bl && a2.aB) {
            nArray = this.b((i)a2);
            s = (short)this.a(n, n2, n3, n4, nArray[0], nArray[1], nArray[2], nArray[3], 4);
        }
        if (s == 1000 && a2.aB) {
            this.bz = this.a(n, n2, n3, n4, nArray[0], nArray[1], nArray[2], nArray[3]);
            this.b(a2, n5, n6);
            if (a2.au >= 1 && a2.au <= 25) {
                this.ar.n[12] = true;
            }
        }
        return s;
    }

    private void b(a a2, int n, int n2) {
        int n3;
        int n4;
        short[] sArray = null;
        Object var5_5 = null;
        Object var6_6 = null;
        int n5 = a2.au & 0xFFFFFF7F;
        if (n5 <= 0) {
            sArray = ((h)a2).S;
        } else if (n5 >= 1) {
            sArray = ((game.c)a2).R;
        }
        long l = 0L;
        a2.n[14] = false;
        int[] nArray = this.a(this.bz);
        this.be[70] = 1;
        if (this.be[5] == 0) {
            if (a2.au == 0) {
                l = n * 50 / a2.ac[1] - 50;
                if (n2 == 0) {
                    l = l * 30L / 100L;
                }
                if (n2 == 1) {
                    l = n * 50 / a2.ac[1] - 50;
                } else if (n2 == 2) {
                    l = n * 50 / a2.ac[1] - 50;
                }
                if (l < 10L) {
                    l = 10L;
                }
                if (this.ar.u[this.ar.d][1][0] == 1) {
                    if (this.L(this.ar.d + 44) == 7) {
                        l = l * 30L / 100L;
                    } else if (this.L(this.ar.d + 44) == 8) {
                        l = l * 50L / 100L;
                    }
                }
                l = l * (long)(100 + (this.cm.nextInt() & Integer.MAX_VALUE) % 11) / 100L;
                if (this.be[22] >= 0) {
                    for (n4 = 0; n4 < this.be[24]; ++n4) {
                        l = l * 113L / 100L;
                    }
                }
                if (l > 9999L) {
                    l = 9999L;
                }
                if ((n4 = (int)l * 100 / a2.a[0]) < 1) {
                    this.b(a2, this.be[70], 12, nArray[0], nArray[1], a2.ag, 26, 1, 1, -1, 0, 1);
                } else if (n4 >= 1) {
                    this.b(a2, this.be[70], 11, nArray[0], nArray[1], a2.ag, 26, 1, 1, -1, 0, 1);
                }
            } else if (a2.au >= 1 && a2.au <= 25 && a2.aB) {
                n4 = Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % 100);
                n3 = n;
                l = n3 = n3 * 50 / a2.ac[1] - 50;
                if (l < 10L) {
                    l = 10L;
                }
                if (this.ar.ar[0] >= 50 && this.ar.ar[0] <= 59 && this.L(this.ar.d + 44) == 2) {
                    a2.n[14] = true;
                    l = l * (long)(this.at[this.ar.d][2] + this.co[7]) * (long)(100 + this.co[2]) / 10000L;
                } else if (n2 == 2) {
                    if (n4 < this.at[this.ar.d][1]) {
                        l = l * (long)(this.at[this.ar.d][2] + this.co[7]) * (long)this.bg[this.L(this.ar.d + 44)] * (long)(100 + this.co[2]) / 1000000L;
                        a2.n[14] = true;
                    } else {
                        l = l * (long)this.bg[this.L(this.ar.d + 44)] * (long)(100 + this.co[2]) / 10000L;
                    }
                } else if (n4 < this.at[this.ar.d][1]) {
                    l = l * (long)(this.at[this.ar.d][2] + this.co[7]) / 100L;
                    a2.n[14] = true;
                }
                l = l * (long)(100 + (this.cm.nextInt() & Integer.MAX_VALUE) % 11) / 100L;
                if (l > 9999L) {
                    l = 9999L;
                }
                if (a2.n[14]) {
                    this.b(a2, this.be[70], 10, nArray[0], nArray[1], this.ar.P <= a2.P ? 1 : 2, 26, 1, 1, -1, 0, 1);
                } else {
                    this.b(a2, this.be[70], 11, nArray[0], nArray[1], this.ar.P <= a2.P ? 1 : 2, 26, 1, 1, -1, 0, 1);
                }
            }
        } else if (this.be[5] == 1) {
            l = n;
            this.b(a2, this.be[70], 11, nArray[0], nArray[1], a2.ag, 26, 1, 1, -1, 0, 1);
        }
        if (a2.au == 0) {
            l -= l * (long)this.co[0] / 100L;
        } else {
            this.ar.a[0] = (int)((long)this.ar.a[0] + l * (long)this.co[1] / 100L);
            if (this.ar.a[0] > this.ar.a[1]) {
                this.ar.a[0] = this.ar.a[1];
            }
        }
        if (this.aO[0] > 0 && this.be[44] > 0) {
            l = 0L;
        }
        a2.as[0] = (int)l;
        if (a2.a[0] > 0) {
            a2.a[0] = a2.a[0] - a2.as[0];
            if (a2.a[0] <= 0) {
                a2.a[0] = 0;
                a2.n[0] = true;
            }
        }
        sArray[0] = 0;
        a2.m[0] = (short)nArray[0];
        a2.m[1] = (short)nArray[1];
        if (a2.au == 0) {
            this.a(a2, 0, (int)l, a2.m[0], a2.m[1]);
        } else if (a2.au >= 1 && a2.au <= 25) {
            if (a2.n[14]) {
                this.a(a2, 1, (int)l, a2.m[0], a2.m[1]);
            } else {
                this.a(a2, 0, (int)l, a2.m[0], a2.m[1]);
            }
        }
        if (a2.au >= 1 && a2.au <= 25 && !a2.n[14]) {
            this.a(26, 1);
        }
        if (n5 == 0) {
            sArray[1] = 15;
        } else if (a2.a[0] == 0) {
            n4 = a2.aA[1];
            if (this.ar.b[0] >= a2.b[0] + 6) {
                n4 = n4 * 70 / 100;
            }
            n3 = n4 * (100 + this.co[4]) / 100;
            if (this.ar.b[0] >= a2.b[0] + 10) {
                n3 = 1;
            } else if (this.ar.b[0] >= a2.b[0]) {
                n3 = n3 * (10 - (this.ar.b[0] - a2.b[0])) / 10;
            }
            if (this.ar.b[0] >= 25 && this.aG[8][3] < this.aG[8][2] && n5 >= 1 && n5 <= 18) {
                this.U(8);
            } else {
                this.a(this.ar, n3);
            }
            if (a2.au >= 1 && a2.au <= 18) {
                this.k(a2);
            }
            this.a(a2.au, 1, 1);
        }
    }

    private void a(a a2, int n, int n2, short s, short s2) {
        int n3;
        if (a2.as[2] < 2 || a2.as[2] >= 10) {
            a2.as[2] = 2;
        }
        a2.as[2] = a2.as[2] + 4;
        if (a2.as[2] < 2 || a2.as[2] >= 10) {
            a2.as[2] = 2;
        }
        this.b(a2, a2.as[2] + 0, 32, s, s2, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.as[2] + 1, 32, s, s2, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.as[2] + 2, 32, s, s2, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.as[2] + 3, 32, s, s2, 1, 26, 1, 0, -1, 0, 1);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 8;
        int n8 = 14;
        n4 = e.R(n2);
        if (n == 0) {
            for (n3 = 0; n3 < n4; ++n3) {
                n6 = n2 % e.q(n4 + 1 - n3) / e.q(n4 - n3);
                n5 = s - (n7 >> 2) * n4;
                this.b(a2, a2.as[2] + n3, 32 + n6, n5 + n3 * n7, s2, 1, 26, 1, 1, -1, 0, 1);
            }
        }
        if (n == 1) {
            for (n3 = 0; n3 < n4; ++n3) {
                n6 = n2 % e.q(n4 + 1 - n3) / e.q(n4 - n3);
                n5 = s - (n8 >> 2) * n4;
                this.b(a2, a2.as[2] + n3, 42 + n6, n5 + n3 * n8, s2, 1, 26, 1, 1, -1, 0, 1);
            }
        }
    }

    private void a(h h2, int n) {
        int n2;
        h2.aA[1] = n2 = this.t(h2.b[0]);
        boolean bl = false;
        if (h2.b[0] < h2.b[1]) {
            if (n > 0) {
                h2.aA[0] = h2.aA[0] + n;
                if (h2.aA[0] >= n2) {
                    h2.b[2] = h2.b[0];
                    h2.a[2] = h2.a[1];
                    h2.C[2] = h2.C[1];
                    h2.ac[2] = h2.ac[0];
                    h2.Z[2] = h2.Z[0];
                }
                while (h2.aA[0] >= n2) {
                    h2.aA[0] = h2.aA[0] - n2;
                    if (h2.b[0] >= h2.b[1]) continue;
                    h2.b[0] = h2.b[0] + 1;
                    h2.aA[1] = this.t(h2.b[0]);
                    bl = true;
                    n2 = this.t(h2.b[0]);
                    h2.a[1] = h2.a[1] + 20;
                    h2.C[1] = h2.C[1] + 10;
                    h2.ac[0] = h2.ac[0] + (2 + h2.b[0] / 10);
                    h2.Z[0] = h2.Z[0] + (1 + h2.b[0] / 5);
                    this.be[80] = 0;
                    if (this.q[0] == 0) {
                        this.p();
                        this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                        this.o();
                        this.e = true;
                        e.f(this.q, 23);
                    }
                    if (this.aO[0] <= 0 || this.ae[this.aO[0]][1] != 0 && this.ae[this.aO[0]][1] != 3) continue;
                    this.d(0, 0, 0);
                }
            }
            if (bl) {
                this.b(this.ar, 0, 15, 0, 0, this.ar.ag, 26, 1, 1, -1, 1, 1);
                h2.a[0] = h2.a[1];
                h2.C[0] = h2.C[1];
                this.B();
                this.S = this.a(this.G, this.T);
            }
        }
    }

    public int t(int n) {
        return n + n * n * 15;
    }

    private int b(int n) {
        int[] nArray = new int[]{0, 40, 30, 40, 40, 40, 50, 20, 20, 20, 20};
        return nArray[n];
    }

    private void E() {
        int n = this.bu[0].length / 3;
        this.ca = new a[n];
        if (n > 0) {
            int n2;
            this.be[4] = 100;
            this.be[3] = this.be[4];
            block6: for (n2 = 0; n2 < this.ca.length; ++n2) {
                this.ca[n2] = new a();
                this.ca[n2].af = new int[1][12];
                this.ca[n2].P = this.bu[0][n2 * 3 + 0] * 20;
                this.ca[n2].N = this.bu[0][n2 * 3 + 1] * 20;
                switch (this.bu[0][n2 * 3 + 2] & 7) {
                    case 0: {
                        this.ca[n2].d = 0;
                        continue block6;
                    }
                    case 1: {
                        this.ca[n2].d = (byte)2;
                        continue block6;
                    }
                    case 3: {
                        this.ca[n2].d = (byte)3;
                        continue block6;
                    }
                    case 4: {
                        this.ca[n2].d = 1;
                    }
                }
            }
            for (n2 = 0; n2 < this.ca.length; ++n2) {
                this.b(this.ca[n2], 0, 20 + this.ca[n2].d, this.ca[n2].P, this.ca[n2].N, 1, 26, 1, 1, -1, 1, 0);
            }
        } else {
            this.be[4] = 0;
        }
    }

    private void L() {
        int n = this.bW[0].length / 3;
        this.aN = new i[n];
        for (int i2 = 0; i2 < this.aN.length; ++i2) {
            this.aN[i2] = new i();
            this.aN[i2].P = this.bW[0][i2 * 3 + 0] * 20;
            this.aN[i2].N = this.bW[0][i2 * 3 + 1] * 20;
        }
    }

    private void r() {
        for (int i2 = 0; i2 < this.bP[this.G].length; ++i2) {
            this.b(this.aV, i2, this.bP[this.G][i2][2], this.bP[this.G][i2][0] * 20, this.bP[this.G][i2][1] * 20, 1, 26, 1, 1, -1, 0, 0);
        }
    }

    private void o() {
        this.aY = new byte[5];
        this.aU = 0;
        this.bI = new byte[5][4][3];
        this.aT = 0;
    }

    private void h() {
        int n;
        int n2;
        this.G = 1;
        this.ar = (h)this.a(0, (byte)1, 60, 60, 0, this.d, this.B, this.d, 1);
        this.ar.aA[0] = 0;
        this.ar.aA[1] = this.t(this.ar.b[0]);
        this.ar.a[1] = 500;
        this.ar.a[0] = this.ar.a[1];
        this.ar.Z[0] = 15;
        this.ar.ac[0] = 10;
        this.ar.C[1] = 100;
        this.ar.C[0] = this.ar.C[1];
        this.ar.b[0] = 1;
        this.ar.t[0] = 0;
        this.bb = new byte[this.bi.length / 3];
        this.bb[this.bj] = 1;
        for (n2 = 0; n2 < this.aj.length; ++n2) {
            this.p(n2);
        }
        this.ar.d = 0;
        this.v(0);
        for (n2 = 0; n2 < this.bL[0].length; ++n2) {
            this.bL[0][n2][0] = 0;
        }
        for (n2 = 0; n2 < this.bL[1].length; ++n2) {
            this.bL[1][n2][0] = 0;
        }
        for (n2 = 0; n2 < this.w.length; ++n2) {
            this.w[n2] = 0;
        }
        for (n2 = 0; n2 < this.bq.length; ++n2) {
            this.bq[n2] = 0;
        }
        n2 = 0;
        int[] nArray = new int[250];
        this.d(nArray, n2, this.a[0]);
        this.d(nArray, n2, this.a[1]);
        this.d(nArray, n2, this.bx[0]);
        this.d(nArray, n2, this.bx[1]);
        this.b(nArray, n2, this.T);
        this.bc = new byte[]{0};
        this.Q = new byte[]{0};
        for (n = 0; n < this.bq.length; ++n) {
            this.bq[n] = 0;
        }
        this.bq[this.Q[0]] = 1;
        this.W = new byte[0];
        this.bK = new byte[]{0, 1, 2, 3, 4, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 35, 36, 37};
        this.ap = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 33, 49, 30, 44};
        this.F = new byte[]{20};
        this.aS = new byte[]{37};
        for (n = 0; n < this.aq.length; ++n) {
            this.aq[n] = n >= 1 && n <= 7 ? 22500 : 0;
        }
        this.bb = new byte[this.bi.length / 3];
        this.be[74] = 0;
        this.ae[1][0] = 0;
        this.ae[2][0] = 0;
        this.ae[3][0] = 0;
        this.ae[4][0] = 0;
        this.ae[24][0] = 0;
        this.ae[25][0] = 0;
        this.ar.t[0] = 500;
    }

    public void e() {
        if (this.bB == 0) {
            byte[] byArray = null;
            byte[] byArray2 = null;
            byte[] byArray3 = null;
            int n = -1;
            switch (this.q[0]) {
                case 1: {
                    if (this.aT != 0) break;
                    byArray3 = this.aW;
                    n = 3;
                    break;
                }
                case 14: {
                    break;
                }
                case 11: {
                    switch (this.g[this.aU]) {
                        case 21: {
                            byArray2 = this.g;
                            n = 1;
                            break;
                        }
                        case 22: {
                            if (this.aY[this.aU] == 0) {
                                byArray = this.bc;
                                byArray2 = this.g;
                                n = 2;
                                break;
                            }
                            if (this.aY[this.aU] != 1) break;
                            byArray = this.bU;
                            n = 0;
                            break;
                        }
                        case 23: {
                            if (this.aY[this.aU] != 0) break;
                            byArray = this.Q;
                            byArray2 = this.g;
                            n = 2;
                            break;
                        }
                        case 24: {
                            byArray = this.W;
                            byArray2 = this.g;
                            n = 2;
                            break;
                        }
                        case 25: {
                            byArray = this.bK;
                            byArray2 = this.g;
                            n = 2;
                        }
                    }
                    break;
                }
                case 12: {
                    switch (this.aJ[this.aU]) {
                        case 27: {
                            if (this.aY[this.aU] != 0 || this.aT != 0) break;
                            byArray = this.ap;
                            byArray2 = this.aJ;
                            n = 2;
                            break;
                        }
                        case 28: {
                            if (this.aY[this.aU] != 0 || this.aT != 0) break;
                            byArray = this.F;
                            byArray2 = this.aJ;
                            n = 2;
                            break;
                        }
                        case 29: {
                            if (this.aY[this.aU] != 0 || this.aT != 0) break;
                            byArray = this.ci;
                            byArray2 = this.aJ;
                            n = 2;
                        }
                    }
                    break;
                }
                case 2: {
                    byArray = this.bl;
                    n = 0;
                    break;
                }
                case 29: {
                    if (this.aY[this.aU] != 0 || this.aT != 0) break;
                    byArray = this.k;
                    n = 0;
                    break;
                }
                case 30: {
                    if (this.aY[this.aU] != 0) break;
                    byArray = this.aE;
                    n = 0;
                }
            }
            if ((n == 0 || n == 2) && byArray.length > 0) {
                this.a(byArray, this.bZ);
            }
            if ((n == 1 || n == 2) && byArray2.length > 0) {
                this.c(byArray2, this.bZ);
            }
            if (n == 3 && byArray3.length > 0) {
                this.b(byArray3, this.bZ);
            }
        }
        if (++this.bB >= 4) {
            this.bB = 0;
        }
    }

    public void a(byte[] byArray, int n) {
        if (byArray != null) {
            if (this.g(-1) == 1 || this.g(50) == 1) {
                if (this.bI[this.aU][this.aY[this.aU]][0] > 0) {
                    byte[] byArray2 = this.bI[this.aU][this.aY[this.aU]];
                    byArray2[0] = (byte)(byArray2[0] - 1);
                } else {
                    this.bI[this.aU][this.aY[this.aU]][0] = (byte)(byArray.length - 1);
                }
            }
            if (this.g(-2) == 1 || this.g(56) == 1) {
                if (this.bI[this.aU][this.aY[this.aU]][0] < byArray.length - 1) {
                    byte[] byArray3 = this.bI[this.aU][this.aY[this.aU]];
                    byArray3[0] = (byte)(byArray3[0] + 1);
                } else {
                    this.bI[this.aU][this.aY[this.aU]][0] = 0;
                }
            }
            this.bI[this.aU][this.aY[this.aU]][2] = this.bI[this.aU][this.aY[this.aU]][1];
            this.bI[this.aU][this.aY[this.aU]][1] = byArray[this.bI[this.aU][this.aY[this.aU]][0]];
        }
    }

    public void c(byte[] byArray, int n) {
        if (byArray != null) {
            if (this.g(-3) == 1 || this.g(52) == 1) {
                this.aU = this.aU > 0 ? (byte)(this.aU - 1) : (byte)(byArray.length - 1);
                if (this.q[0] == 11 && this.aY[this.aU] == 0 && this.aU == 1) {
                    this.bI[this.aU][this.aY[this.aU]][0] = (byte)e.a(this.ar.j, this.bc);
                }
            }
            if (this.g(-4) == 1 || this.g(54) == 1) {
                this.aU = this.aU < byArray.length - 1 ? (byte)(this.aU + 1) : (byte)0;
                if (this.q[0] == 11 && this.aY[this.aU] == 0 && this.aU == 1) {
                    this.bI[this.aU][this.aY[this.aU]][0] = (byte)e.a(this.ar.j, this.bc);
                }
            }
        }
    }

    public void b(byte[] byArray, int n) {
        if (byArray != null) {
            if (this.g(-1) == 1 || this.g(50) == 1 || this.g(-3) == 1 || this.g(52) == 1) {
                if (this.bI[this.aU][this.aY[this.aU]][0] > 0) {
                    byte[] byArray2 = this.bI[this.aU][this.aY[this.aU]];
                    byArray2[0] = (byte)(byArray2[0] - 1);
                } else {
                    this.bI[this.aU][this.aY[this.aU]][0] = (byte)(byArray.length - 1);
                }
            }
            if (this.g(-2) == 1 || this.g(56) == 1 || this.g(-4) == 1 || this.g(54) == 1) {
                if (this.bI[this.aU][this.aY[this.aU]][0] < byArray.length - 1) {
                    byte[] byArray3 = this.bI[this.aU][this.aY[this.aU]];
                    byArray3[0] = (byte)(byArray3[0] + 1);
                } else {
                    this.bI[this.aU][this.aY[this.aU]][0] = 0;
                }
            }
            this.bI[this.aU][this.aY[this.aU]][2] = this.bI[this.aU][this.aY[this.aU]][1];
            this.bI[this.aU][this.aY[this.aU]][1] = byArray[this.bI[this.aU][this.aY[this.aU]][0]];
        }
    }

    public void V(int n) {
        if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
            this.d(n, 0);
            this.bd.a(1);
            e e2 = this;
            e2.bd.b();
            this.cl[0] = this.cl[1];
            e.a(this.bf, 16);
            this.R();
        }
        if (this.g(-7) == 1) {
            this.d(n, 0);
            game.d.b(1);
            e e3 = this;
            e3.bd.b();
            this.cl[0] = this.cl[1];
            e.a(this.bf, 16);
        }
    }

    public void B(int n) {
        if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
            this.d(n, 0);
            this.be[74] = 0;
            this.ae[1][0] = 0;
            this.ae[2][0] = 0;
            this.ae[3][0] = 0;
            this.ae[4][0] = 0;
            this.ae[24][0] = 0;
            this.ae[25][0] = 0;
            this.ae[42][0] = 0;
            this.ae[43][0] = 0;
            this.ae[44][0] = 0;
            this.ae[45][0] = 0;
            this.ae[46][0] = 0;
            this.ae[47][0] = 0;
            this.ae[48][0] = 0;
            this.ae[49][0] = 0;
            this.ae[50][0] = 0;
            this.ae[51][0] = 0;
            this.ae[52][0] = 0;
            this.ae[53][0] = 0;
            this.ae[54][0] = 0;
            this.ae[55][0] = 0;
            this.ae[56][0] = 0;
            this.ae[57][0] = 0;
            this.ae[58][0] = 0;
            this.ae[59][0] = 0;
            this.ae[60][0] = 0;
            this.ae[61][0] = 0;
            this.ae[62][0] = 0;
            this.ae[63][0] = 0;
            this.e = false;
            e.f(this.q, 0);
            this.R();
        }
        if (this.g(-7) == 1) {
            this.d(n, 0);
            this.be[74] = 1;
            this.ae[1][0] = 1;
            this.ae[2][0] = 3;
            this.ae[3][0] = 1;
            this.ae[4][0] = 3;
            this.ae[24][0] = 1;
            this.ae[25][0] = 1;
            this.ae[42][0] = 1;
            this.ae[43][0] = 1;
            this.ae[45][0] = 1;
            this.ae[46][0] = 1;
            this.ae[47][0] = 1;
            this.ae[48][0] = 1;
            this.ae[49][0] = 1;
            this.ae[50][0] = 1;
            this.ae[51][0] = 1;
            this.ae[52][0] = 1;
            this.ae[53][0] = 1;
            this.ae[54][0] = 1;
            this.ae[55][0] = 1;
            this.ae[56][0] = 1;
            this.ae[57][0] = 1;
            this.ae[58][0] = 1;
            this.ae[59][0] = 1;
            this.ae[60][0] = 1;
            this.ae[61][0] = 1;
            this.ae[62][0] = 1;
            this.ae[63][0] = 1;
            this.e = false;
            e.f(this.q, 0);
            this.R();
        }
    }

    public void o(int n) {
        if (this.g(48) == 1) {
            this.d(48, 0);
            this.a(33);
            this.p();
            this.b(this.cj, 0, 2, this.be[13], this.be[14], 1, 33, 1, 1, -1, 0, 0);
            this.a(this.cj, 1, 0);
            this.o();
            game.e e2 = new game.e(this.O);
            byte[] byArray = new byte[]{-1};
            if (e2.a() == 0) {
                byArray[0] = -1;
            } else {
                byArray = e2.a(1);
            }
            this.be[34] = byArray[0];
            e2.b();
            e2 = null;
            if (this.be[34] > 0) {
                this.bI[this.aU][this.aY[this.aU]][0] = 1;
            }
            e.a(this.bf, 4);
            e.f(this.q, 1);
        }
    }

    public void C(int n) {
        if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
            switch (this.bI[this.aU][this.aY[this.aU]][1]) {
                case 26: {
                    e.f(this.q, 0);
                    this.f(this.bp[0][0], -1);
                    this.e = false;
                    break;
                }
                case 20: {
                    this.o();
                    game.e e2 = new game.e(this.O);
                    byte[] byArray = new byte[]{-1};
                    if (e2.a() == 0) {
                        byArray[0] = -1;
                    } else {
                        byArray = e2.a(1);
                    }
                    this.be[34] = byArray[0];
                    e2.b();
                    e2 = null;
                    if (this.be[34] > 0) {
                        e.f(this.bI[this.aU][this.aY[this.aU]], 1);
                    } else {
                        e.f(this.bI[this.aU][this.aY[this.aU]], 0);
                    }
                    this.e = false;
                    this.a(33);
                    this.W(33);
                    this.p();
                    this.b(this.cj, 0, 2, this.be[13], this.be[14], 1, 33, 1, 1, -1, 0, 0);
                    e.a(this.bf, 4);
                    e.f(this.q, 1);
                    this.R();
                    break;
                }
                case 6: {
                    this.f();
                    e.a(this.bf, 4);
                    e.f(this.q, 3);
                    break;
                }
                case 2: {
                    this.f();
                    this.be[66] = 0;
                    this.be[67] = 3;
                    this.p();
                    this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    e.a(this.bf, 4);
                    e.f(this.q, 4);
                    break;
                }
                case 30: {
                    this.f(this.bp[0][0], -1);
                    this.e = true;
                    e.a(this.bf, 7);
                    e.f(this.q, 13);
                    this.p();
                    this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 8, 6, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 9, 7, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 10, 8, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 11, 9, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                    this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                    this.a(25, 1);
                    break;
                }
                case 31: {
                    if (this.aG[0][3] < this.aG[0][2]) break;
                    this.U(0);
                    this.al = "01";
                    break;
                }
                case 32: {
                    break;
                }
                case 33: {
                    if (this.aG[0][3] < this.aG[0][2]) break;
                    this.be[89] = 0;
                    this.U(5);
                }
            }
            this.d(n, 0);
        }
        if (this.g(-7) == 1 || this.g(-11) == 1) {
            e.f(this.q, 0);
            this.f(this.bp[0][0], -1);
            this.e = false;
            this.d(n, 0);
        }
    }

    public void G(int n) {
        if (this.g(50) == 1 || this.g(-1) == 1) {
            this.a(24, 0);
            if (this.be[18] < 28) {
                this.be[18] = (short)(this.be[18] + 1);
            }
        } else if (this.g(56) == 1 || this.g(-2) == 1) {
            this.a(24, 0);
            if (this.be[18] > 0) {
                this.be[18] = (short)(this.be[18] - 1);
            }
        } else if (this.g(52) == 1 || this.g(-3) == 1) {
            this.a(24, 0);
            if (this.be[17] > 0) {
                this.be[17] = (short)(this.be[17] - 1);
            }
        } else if (this.g(54) == 1 || this.g(-4) == 1) {
            this.a(24, 0);
            if (this.be[17] < 71) {
                this.be[17] = (short)(this.be[17] + 1);
            }
        }
        if (this.g(-7) == 1 || this.g(55) == 1 || this.g(-11) == 1) {
            this.a(24, 0);
            this.a(25, 0);
            e.a(this.bf, 7);
            e.f(this.q, 0);
            this.e = false;
            this.a(25, 1);
            this.d(n, 0);
        }
    }

    public void O(int n) {
        block39: {
            if (this.g(-6) != 1 && this.g(-5) != 1 && this.g(53) != 1) break block39;
            this.d(n, 0);
            block0 : switch (this.g[this.aU]) {
                case 22: {
                    switch (this.aY[this.aU]) {
                        case 0: {
                            if (this.aj[this.bc[this.bI[this.aU][0][0]]][0] <= 0) break;
                            this.aY[this.aU] = 1;
                            this.bI[this.aU][this.aY[this.aU]][0] = 0;
                            break;
                        }
                        case 1: {
                            switch (this.bI[this.aU][this.aY[this.aU]][1]) {
                                case 0: {
                                    if (this.ar.j != this.bc[this.bI[this.aU][0][0]]) {
                                        this.aY[this.aU] = 2;
                                        break;
                                    }
                                    this.aY[this.aU] = 3;
                                    this.aT = 1;
                                    break;
                                }
                                case 1: {
                                    if (this.ar.j != this.bc[this.bI[this.aU][0][0]]) {
                                        this.aY[this.aU] = 2;
                                        byte by = this.bc[this.bI[this.aU][0][0]];
                                        this.ar.t[1] = this.at[this.aj[by][1]][3] * this.aj[by][2] / 2;
                                        break;
                                    }
                                    this.aY[this.aU] = 3;
                                    this.aT = (byte)3;
                                    break;
                                }
                                case 2: {
                                    this.aY[this.aU] = 0;
                                }
                            }
                            break;
                        }
                        case 2: {
                            switch (this.bI[this.aU][1][1]) {
                                case 0: {
                                    this.v(this.bc[this.bI[this.aU][0][0]]);
                                    this.aY[this.aU] = 3;
                                    this.aT = 0;
                                    break;
                                }
                                case 1: {
                                    byte by = this.bc[this.bI[this.aU][0][0]];
                                    this.ar.t[1] = this.at[this.aj[by][1]][3] * this.aj[by][2] / 2;
                                    this.ar.t[0] = this.ar.t[0] + this.ar.t[1];
                                    this.bc = this.a(this.bc, this.aj, 0, (int)by);
                                    if (this.bI[this.aU][0][0] >= this.bc.length) {
                                        this.bI[this.aU][0][0] = 0;
                                    }
                                    this.aY[this.aU] = 3;
                                    this.aT = (byte)2;
                                }
                            }
                            break;
                        }
                        case 3: {
                            this.aY[this.aU] = 0;
                            this.aT = 0;
                        }
                    }
                    break;
                }
                case 23: {
                    switch (this.aY[this.aU]) {
                        case 0: {
                            if (this.Q[this.bI[this.aU][0][0]] >= 0 && this.Q[this.bI[this.aU][0][0]] <= 4 && this.bq[this.Q[this.bI[this.aU][0][0]]] > 0) {
                                if (this.Q[this.bI[this.aU][0][0]] >= 0 && this.Q[this.bI[this.aU][0][0]] <= 2) {
                                    if (this.ar.a[0] < this.ar.a[1]) {
                                        this.aY[this.aU] = 2;
                                        break block0;
                                    }
                                    this.aY[this.aU] = 3;
                                    this.aT = 1;
                                    break block0;
                                }
                                if (this.Q[this.bI[this.aU][0][0]] == 3) {
                                    if (this.ar.C[0] < this.ar.C[1]) {
                                        this.aY[this.aU] = 2;
                                        break block0;
                                    }
                                    this.aY[this.aU] = 3;
                                    this.aT = 1;
                                    break block0;
                                }
                                this.aY[this.aU] = 2;
                                break block0;
                            }
                            break block39;
                        }
                        case 2: {
                            this.M(this.Q[this.bI[this.aU][0][0]]);
                            this.aY[this.aU] = 3;
                            this.aT = 0;
                            break block0;
                        }
                        case 3: {
                            this.aY[this.aU] = 0;
                            this.aT = 0;
                        }
                    }
                }
            }
        }
        if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(-7, 0);
            this.d(-11, 0);
            switch (this.aY[this.aU]) {
                case 0: {
                    e.a(this.bf, 7);
                    e.f(this.q, 0);
                    this.f(this.bp[0][0], -1);
                    this.e = false;
                    break;
                }
                case 1: {
                    this.aY[this.aU] = 0;
                    break;
                }
                case 2: {
                    if (this.g[this.aU] == 22) {
                        this.aY[this.aU] = 1;
                    }
                    if (this.g[this.aU] != 23) break;
                    this.aY[this.aU] = 0;
                }
            }
        }
    }

    public void i(int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        if (this.aJ[this.aU] == 27 && this.aY[this.aU] == 1 && this.aT == 0) {
            if (this.g(-3) == 1 || this.g(52) == 1) {
                this.d(n, 0);
                if (this.be[8] > 1) {
                    this.be[8] = (short)(this.be[8] - 1);
                }
            } else if (this.g(-4) == 1 || this.g(54) == 1) {
                this.d(n, 0);
                n6 = this.ap[this.bI[this.aU][0][0]];
                if (this.bq[n6] + this.be[8] < 999 && this.be[8] < 99) {
                    this.be[8] = (short)(this.be[8] + 1);
                }
            } else if (this.g(-1) == 1 || this.g(50) == 1) {
                this.d(n, 0);
                n6 = this.ap[this.bI[this.aU][0][0]];
                if (this.bq[n6] + this.be[8] < 999 && this.be[8] < 99) {
                    n5 = 10;
                    n4 = 10;
                    n3 = 10;
                    if (this.bq[n6] + this.be[8] < 999 && this.bq[n6] + this.be[8] + 10 > 999) {
                        n4 = 999 - (this.bq[n6] + this.be[8]);
                    }
                    if (this.be[8] < 99 && this.be[8] + 10 > 99) {
                        n3 = 99 - this.be[8];
                    }
                    if (n5 > n4) {
                        n5 = n4;
                    }
                    if (n5 > n3) {
                        n5 = n3;
                    }
                    this.be[8] = (short)(this.be[8] + n5);
                }
            } else if (this.g(-2) == 1 || this.g(56) == 1) {
                this.d(n, 0);
                if (this.be[8] > 1) {
                    this.be[8] = (short)(this.be[8] - 10);
                    if (this.be[8] < 1) {
                        this.be[8] = 1;
                    }
                }
            }
        } else if (this.aJ[this.aU] == 28 && this.aY[this.aU] == 1 && this.aT == 0) {
            if (this.g(-3) == 1 || this.g(52) == 1) {
                this.d(n, 0);
                if (this.be[8] > 1) {
                    this.be[8] = (short)(this.be[8] - 1);
                }
            } else if (this.g(-4) == 1 || this.g(54) == 1) {
                this.d(n, 0);
                n6 = this.F[this.bI[this.aU][0][0]];
                if (this.bq[this.ai[n6 - 20][1][0]] + this.be[8] < 999 && this.be[8] < 99 && this.d(this.ai[n6 - 20][0], this.be[8] + 1)) {
                    this.be[8] = (short)(this.be[8] + 1);
                }
            } else if (this.g(-1) == 1 || this.g(50) == 1) {
                this.d(n, 0);
                n6 = this.F[this.bI[this.aU][0][0]];
                if (this.bq[this.ai[n6 - 20][1][0]] + this.be[8] < 999 && this.be[8] < 99) {
                    n5 = 10;
                    n4 = 10;
                    n3 = 10;
                    if (this.bq[this.ai[n6 - 20][1][0]] + this.be[8] < 999 && this.bq[this.ai[n6 - 20][1][0]] + this.be[8] + 10 > 999) {
                        n4 = 999 - (this.bq[this.ai[n6 - 20][1][0]] + this.be[8]);
                    }
                    if (this.be[8] < 99 && this.be[8] + 10 > 99) {
                        n3 = 99 - this.be[8];
                    }
                    if (n5 > n4) {
                        n5 = n4;
                    }
                    if (n5 > n3) {
                        n5 = n3;
                    }
                    for (n2 = n5; n2 >= 0; --n2) {
                        if (!this.d(this.ai[n6 - 20][0], this.be[8] + n2)) continue;
                        this.be[8] = (short)(this.be[8] + n2);
                        break;
                    }
                }
            } else if (this.g(-2) == 1 || this.g(56) == 1) {
                this.d(n, 0);
                if (this.be[8] > 1) {
                    this.be[8] = (short)(this.be[8] - 10);
                    if (this.be[8] < 1) {
                        this.be[8] = 1;
                    }
                }
            }
        }
        if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
            this.d(n, 0);
            block0 : switch (this.aJ[this.aU]) {
                case 27: {
                    switch (this.aY[this.aU]) {
                        case 0: {
                            if (this.aT == 0) {
                                this.be[8] = 1;
                                this.aY[this.aU] = 1;
                                if (this.ar.t[0] >= this.a(this.ap[this.bI[this.aU][0][0]], (int)this.be[8])) {
                                    if (this.bq[this.ap[this.bI[this.aU][0][0]]] >= 999) {
                                        this.aT = (byte)2;
                                        this.aY[this.aU] = 3;
                                        break block0;
                                    }
                                    if (this.ap[this.bI[this.aU][0][0]] >= 29 && this.ap[this.bI[this.aU][0][0]] <= 50 || this.ap[this.bI[this.aU][0][0]] >= 5 && this.ap[this.bI[this.aU][0][0]] <= 9) {
                                        if (this.aG[5][3] < this.aG[5][2]) {
                                            this.be[89] = 1;
                                            this.U(5);
                                        }
                                        this.aT = 1;
                                        break block0;
                                    }
                                    if (this.aG[5][3] >= this.aG[5][2]) break;
                                    this.be[89] = 1;
                                    this.U(5);
                                    break block0;
                                }
                                this.aT = 1;
                                this.aY[this.aU] = 3;
                                break block0;
                            }
                            if (this.aT != 1) break;
                            this.bI[0][0][0] = 0;
                            this.be[8] = 1;
                            this.aT = 0;
                            this.aY[this.aU] = 1;
                            break block0;
                        }
                        case 1: {
                            if (this.aT == 0) {
                                this.aT = 1;
                                break block0;
                            }
                            if (this.aT != 1) break;
                            if (this.ar.t[0] < this.a(this.ap[this.bI[this.aU][0][0]], (int)this.be[8])) {
                                this.U(1);
                                break block0;
                            }
                            this.ar.t[1] = this.a(this.ap[this.bI[this.aU][0][0]], (int)this.be[8]);
                            this.ar.t[0] = this.ar.t[0] - this.ar.t[1];
                            this.a((int)this.ap[this.bI[this.aU][0][0]], (int)this.be[8], 0);
                            this.aY[this.aU] = 3;
                            if (this.ap[this.bI[this.aU][0][0]] >= 5 && this.ap[this.bI[this.aU][0][0]] <= 9) {
                                int[] nArray = this.E[this.ap[this.bI[this.aU][0][0]] - 5];
                                nArray[2] = nArray[2] + 1;
                                this.aT = (byte)3;
                                break block0;
                            }
                            this.aT = 0;
                            break block0;
                        }
                        case 2: {
                            break block0;
                        }
                        case 3: {
                            if (this.aT == 1) {
                                this.U(1);
                            }
                            this.aT = 0;
                            this.aY[this.aU] = 0;
                        }
                    }
                    break;
                }
                case 28: {
                    n6 = -1;
                    n5 = 1;
                    n4 = 1;
                    switch (this.aY[this.aU]) {
                        case 0: {
                            if (this.F.length <= 0) break;
                            this.be[8] = 1;
                            n6 = this.F[this.bI[this.aU][0][0]];
                            if (this.d(this.ai[n6 - 20][0], (int)this.be[8])) {
                                if (this.bq[this.ai[n6 - 20][1][0]] >= 999) {
                                    this.aT = (byte)3;
                                    this.aY[this.aU] = 3;
                                    break block0;
                                }
                                if (this.F[this.bI[this.aU][0][0]] < 20 || this.F[this.bI[this.aU][0][0]] > 28) break;
                                this.aT = 0;
                                this.aY[this.aU] = 1;
                                break block0;
                            }
                            this.aT = 1;
                            this.aY[this.aU] = 3;
                            break block0;
                        }
                        case 1: {
                            if (this.aT == 0) {
                                this.aT = 1;
                                break block0;
                            }
                            if (this.aT != 1) break;
                            this.aT = (byte)6;
                            this.aY[this.aU] = 2;
                            this.be[10] = 0;
                            this.be[11] = 8;
                            this.be[16] = 10;
                            break block0;
                        }
                        case 3: {
                            this.aT = 0;
                            this.aY[this.aU] = 0;
                        }
                    }
                    break;
                }
                case 29: {
                    n3 = -1;
                    n2 = 1;
                    boolean bl = true;
                    switch (this.aY[this.aU]) {
                        case 0: {
                            if (e.a(this.ci[this.bI[this.aU][0][0]], this.aS) >= 0) {
                                int n7;
                                boolean bl2 = true;
                                for (n7 = 0; n7 < this.aj.length; ++n7) {
                                    if (this.aj[n7][0] != 0) continue;
                                    bl2 = false;
                                    break;
                                }
                                if (bl2) {
                                    this.aT = (byte)7;
                                    this.aY[this.aU] = 2;
                                    break block0;
                                }
                                n2 = 1;
                                n3 = this.ci[this.bI[this.aU][0][0]];
                                for (n7 = 0; n7 < this.ai[n3 - 20][0].length / 2; ++n7) {
                                    if (this.bq[this.ai[n3 - 20][0][2 * n7]] >= this.ai[n3 - 20][0][2 * n7 + 1]) continue;
                                    n2 = 0;
                                    break;
                                }
                                if (n2 != 0) {
                                    this.aT = 0;
                                    this.aY[this.aU] = 2;
                                    break block0;
                                }
                                this.aT = (byte)2;
                                this.aY[this.aU] = 2;
                                break block0;
                            }
                            this.aT = (byte)5;
                            this.aY[this.aU] = 3;
                            break block0;
                        }
                        case 1: {
                            break block0;
                        }
                        case 2: {
                            switch (this.aT) {
                                case 0: 
                                case 3: 
                                case 4: {
                                    this.aT = (byte)6;
                                    this.aY[this.aU] = 2;
                                    this.be[10] = 0;
                                    this.be[11] = 100;
                                    this.be[16] = 10;
                                    break block0;
                                }
                                case 2: {
                                    int n8;
                                    int n9 = 0;
                                    boolean bl3 = true;
                                    n3 = this.ci[this.bI[this.aU][0][0]];
                                    for (n8 = 0; n8 < this.ai[n3 - 20][0].length / 2; ++n8) {
                                        if (this.bq[this.ai[n3 - 20][0][2 * n8]] >= this.ai[n3 - 20][0][2 * n8 + 1]) continue;
                                        if (e.a(this.ai[n3 - 20][0][2 * n8], this.ap) >= 0) {
                                            n9 += this.a(this.ai[n3 - 20][0][2 * n8], this.ai[n3 - 20][0][2 * n8 + 1] - this.bq[this.ai[n3 - 20][0][2 * n8]]);
                                            continue;
                                        }
                                        bl3 = false;
                                        break;
                                    }
                                    if (!bl3) {
                                        this.aT = (byte)4;
                                        this.aY[this.aU] = 3;
                                        break block0;
                                    }
                                    if (this.ar.t[0] >= n9) {
                                        this.ar.t[1] = n9;
                                        this.ar.t[0] = this.ar.t[0] - this.ar.t[1];
                                        for (n8 = 0; n8 < this.ai[n3 - 20][0].length / 2; ++n8) {
                                            if (this.bq[this.ai[n3 - 20][0][2 * n8]] >= this.ai[n3 - 20][0][2 * n8 + 1]) continue;
                                            this.a((int)this.ai[n3 - 20][0][2 * n8], this.ai[n3 - 20][0][2 * n8 + 1] - this.bq[this.ai[n3 - 20][0][2 * n8]], 0);
                                        }
                                        this.aT = (byte)4;
                                        this.aY[this.aU] = 2;
                                        break block0;
                                    }
                                    this.aT = (byte)2;
                                    this.aY[this.aU] = 3;
                                    break block0;
                                }
                                case 7: {
                                    this.o();
                                    this.aT = 1;
                                    this.aY[this.aU] = 0;
                                    break block0;
                                }
                                case 8: {
                                    this.v(this.be[12]);
                                    this.aT = 0;
                                    this.aY[this.aU] = 3;
                                }
                            }
                            break block0;
                        }
                        case 3: {
                            if (this.aT == 2) {
                                this.U(1);
                            }
                            this.aT = 0;
                            this.aY[this.aU] = 0;
                        }
                    }
                }
            }
        } else if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(-7, 0);
            this.d(-11, 0);
            switch (this.aY[this.aU]) {
                case 0: {
                    e.a(this.bf, 7);
                    e.f(this.q, 0);
                    this.f(this.bp[0][0], -1);
                    this.e = false;
                    break;
                }
                case 1: {
                    if (this.aJ[this.aU] == 27) {
                        if (this.aT == 0) {
                            this.aY[this.aU] = 0;
                            break;
                        }
                        if (this.aT != 1) break;
                        if (this.ap[this.bI[this.aU][0][0]] >= 29 && this.ap[this.bI[this.aU][0][0]] <= 50 || this.ap[this.bI[this.aU][0][0]] >= 5 && this.ap[this.bI[this.aU][0][0]] <= 9) {
                            this.aT = 0;
                            this.aY[this.aU] = 0;
                            break;
                        }
                        this.aT = 0;
                        break;
                    }
                    if (this.aJ[this.aU] != 28) break;
                    if (this.aT == 0) {
                        this.aY[this.aU] = 0;
                        break;
                    }
                    if (this.aT != 1) break;
                    this.aT = 0;
                    break;
                }
                case 2: {
                    if (this.aJ[this.aU] == 27) {
                        this.aT = 0;
                        this.aY[this.aU] = 1;
                    }
                    if (this.aJ[this.aU] != 29) break;
                    if (this.aT == 8) {
                        this.aT = (byte)3;
                        this.aY[this.aU] = 3;
                        break;
                    }
                    if (this.aT == 5 || this.aT == 6) break;
                    this.aT = 0;
                    this.aY[this.aU] = 0;
                }
            }
        } else if (this.g(48) == 1) {
            this.d(48, 0);
            if (this.aJ[this.aU] == 27 && this.aY[this.aU] == 0 && this.aT == 0) {
                this.U(1);
            }
        }
    }

    public int a(byte by, int n) {
        int n2 = 0;
        n2 = by >= 5 && by <= 9 ? this.E[by - 5][0] + this.E[by - 5][1] * this.E[by - 5][2] : this.bn[by] * n;
        if (this.aG[5][3] >= this.aG[5][2]) {
            n2 /= 2;
        }
        return n2;
    }

    public boolean d(byte[] byArray, int n) {
        boolean bl = true;
        for (int i2 = 0; i2 < byArray.length / 2; ++i2) {
            if (this.bq[byArray[i2 * 2]] >= byArray[i2 * 2 + 1] * n) continue;
            bl = false;
            break;
        }
        return bl;
    }

    public int g(int n, int n2) {
        int n3 = 0;
        int n4 = this.a((byte)n) % 5;
        int n5 = 0;
        switch (this.Y.a(n, 0)) {
            case 0: {
                n5 = 0;
                break;
            }
            case 48128: {
                n5 = 1;
                break;
            }
            case 1179903: {
                n5 = 2;
                break;
            }
            case 12517596: {
                n5 = 3;
            }
        }
        switch (n4) {
            case 0: {
                n3 = (n2 + n5) * 25;
                break;
            }
            case 1: {
                n3 = (n2 + n5) * 25;
                break;
            }
            case 2: {
                n3 = (n2 + n5) * 35;
                break;
            }
            case 3: {
                n3 = (n2 + n5) * 30;
                break;
            }
            case 4: {
                n3 = (n2 + n5) * 35;
            }
        }
        return n3;
    }

    private void p(int n) {
        if (n == 0) {
            this.aj[n][0] = 1;
            this.aj[n][1] = 6;
            this.aj[n][2] = 1;
            this.aj[n][3] = 0;
            this.aj[n][4] = -1;
            this.aj[n][5] = 0;
            this.aj[n][6] = -1;
            this.aj[n][7] = 0;
            this.aj[n][8] = -1;
            this.w[n] = 0;
        } else {
            this.aj[n][0] = 0;
            this.aj[n][1] = 0;
            this.aj[n][2] = 1;
            this.aj[n][3] = 0;
            this.aj[n][4] = -1;
            this.aj[n][5] = 0;
            this.aj[n][6] = -1;
            this.aj[n][7] = 0;
            this.aj[n][8] = -1;
            this.w[n] = 0;
        }
    }

    private byte[] a(byte[] byArray, byte[][] byArray2, int n, int n2) {
        byte[] byArray3 = null;
        if (n == 0) {
            int n3;
            byArray3 = new byte[byArray.length - 1];
            int n4 = e.a((byte)n2, byArray);
            int n5 = byArray.length - 1;
            for (n3 = 0; n3 < byArray.length; ++n3) {
                if (byArray2[byArray[n3]][0] != 0) continue;
                n5 = n3;
                break;
            }
            for (n3 = 0; n3 < n4; ++n3) {
                byArray3[n3] = byArray[n3];
            }
            for (n3 = n4; n3 < n5; ++n3) {
                byArray3[n3] = byArray[n3 + 1];
            }
            this.p(n2);
        } else if (n == 1) {
            int n6;
            int n7;
            if (byArray.length >= this.aK) {
                this.be[78] = -1;
                return byArray;
            }
            for (n7 = 0; n7 < byArray2.length; ++n7) {
                if (byArray2[n7][0] != 0) continue;
                this.be[12] = (short)n7;
                break;
            }
            byArray3 = new byte[byArray.length + 1];
            n7 = byArray.length;
            int n8 = byArray.length;
            for (n6 = 0; n6 < byArray.length; ++n6) {
                if (this.T(n2) < this.T(byArray2[byArray[n6]][1])) {
                    n7 = 0;
                    break;
                }
                if (byArray2[byArray[n6]][0] != 1 || n6 == byArray.length - 1 || this.T(n2) < this.T(byArray2[byArray[n6]][1]) || this.T(n2) >= this.T(byArray2[byArray[n6 + 1]][1])) continue;
                n7 = n6 + 1;
                break;
            }
            for (n6 = 0; n6 < n7; ++n6) {
                byArray3[n6] = byArray[n6];
            }
            for (n6 = n8; n6 > n7; --n6) {
                byArray3[n6] = byArray[n6 - 1];
            }
            byArray3[n7] = (byte)this.be[12];
            this.p(this.be[12]);
            byArray2[this.be[12]][0] = 1;
            byArray2[this.be[12]][1] = (byte)n2;
            this.be[78] = this.be[12];
        }
        return byArray3;
    }

    private byte[] a(byte[] byArray, int n, int n2, int n3) {
        byte[] byArray2 = null;
        int n4 = byArray.length;
        int n5 = byArray.length;
        if (n2 == 0) {
            int n6;
            byArray2 = new byte[byArray.length - 1];
            for (n6 = 0; n6 < byArray.length; ++n6) {
                if (byArray[n6] != n) continue;
                n4 = n6;
                break;
            }
            if (n4 == byArray.length) {
                return byArray;
            }
            for (n6 = 0; n6 < n4; ++n6) {
                byArray2[n6] = byArray[n6];
            }
            for (n6 = n4; n6 < byArray2.length; ++n6) {
                byArray2[n6] = byArray[n6 + 1];
            }
        } else {
            int n7;
            byArray2 = new byte[byArray.length + 1];
            for (n7 = 0; n7 < byArray.length; ++n7) {
                if (n == byArray[n7]) {
                    return byArray;
                }
                if (this.b(n, n3) < this.b((int)byArray[n7], n3)) {
                    n4 = n7;
                    break;
                }
                if (n7 == byArray.length - 1 && this.b(n, n3) > this.b((int)byArray[n7], n3)) {
                    n4 = n7 + 1;
                    break;
                }
                if (this.b(n, n3) <= this.b((int)byArray[n7], n3) || this.b(n, n3) >= this.b((int)byArray[n7 + 1], n3)) continue;
                n4 = n7 + 1;
                break;
            }
            for (n7 = 0; n7 < n4; ++n7) {
                byArray2[n7] = byArray[n7];
            }
            for (n7 = n5; n7 > n4; --n7) {
                byArray2[n7] = byArray[n7 - 1];
            }
            byArray2[n4] = (byte)n;
        }
        return byArray2;
    }

    private void a(int n, int n2, int n3) {
        switch (n3) {
            case 0: {
                if (n >= 0 && n <= 4 || n >= 10 && n <= 19 || n >= 20 && n <= 50) {
                    if (e.a((byte)n, this.Q) < 0) {
                        this.Q = this.a(this.Q, n, 1, n3);
                    }
                    int n4 = n;
                    this.bq[n4] = this.bq[n4] + n2;
                    if (this.bq[n] > 999) {
                        this.bq[n] = 999;
                    }
                }
                if (n >= 20 && n <= 28 && e.a((byte)(n - 9), this.ap) < 0) {
                    this.ap = this.a(this.ap, n - 9, 1, n3);
                }
                if (n >= 20 && n <= 28 && e.a((byte)n, this.F) < 0) {
                    this.F = this.a(this.F, n, 1, n3);
                    int n5 = n;
                    this.bq[n5] = this.bq[n5] + 1;
                }
                if (n >= 29 && n <= 50 && e.a((byte)n, this.aS) < 0) {
                    this.aS = this.a(this.aS, n, 1, n3);
                    int n6 = n;
                    this.bq[n6] = this.bq[n6] + 1;
                    this.ap = this.a(this.ap, n, 0, n3);
                    if (this.bI[0][0][0] >= this.ap.length) {
                        this.bI[0][0][0] = (byte)(this.ap.length - 1);
                    }
                }
                if (n >= 54 && n <= 75) {
                    this.bc = this.a(this.bc, this.aj, 1, n - 54);
                }
                if (n == 5) {
                    this.ar.Z[0] = this.ar.Z[0] + 10;
                    if (this.q[0] != 0) break;
                    this.a(36, 1);
                    break;
                }
                if (n == 6) {
                    this.ar.ac[0] = this.ar.ac[0] + 5;
                    if (this.q[0] != 0) break;
                    this.a(37, 1);
                    break;
                }
                if (n == 7) {
                    this.ar.a[1] = this.ar.a[1] + 30;
                    if (this.q[0] != 0) break;
                    this.a(38, 1);
                    break;
                }
                if (n == 8) {
                    this.ar.C[1] = this.ar.C[1] + 20;
                    if (this.q[0] != 0) break;
                    this.a(39, 1);
                    break;
                }
                if (n == 9) {
                    this.ar.b[2] = this.ar.b[0];
                    this.ar.a[2] = this.ar.a[1];
                    this.ar.C[2] = this.ar.C[1];
                    this.ar.ac[2] = this.ar.ac[0];
                    this.ar.Z[2] = this.ar.Z[0];
                    this.ar.b[0] = this.ar.b[0] + 1;
                    this.ar.a[1] = this.ar.a[1] + 20;
                    this.ar.C[1] = this.ar.C[1] + 10;
                    this.ar.ac[0] = this.ar.ac[0] + (2 + this.ar.b[0] / 10);
                    this.ar.Z[0] = this.ar.Z[0] + (1 + this.ar.b[0] / 5);
                    this.b(this.ar, 0, 15, 0, 0, this.ar.ag, 26, 1, 1, -1, 1, 1);
                    this.ar.a[0] = this.ar.a[1];
                    this.ar.C[0] = this.ar.C[1];
                    this.be[80] = 1;
                    if (this.q[0] == 0) {
                        this.p();
                        this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                        this.o();
                        this.e = true;
                        e.f(this.q, 23);
                    }
                    if (this.aO[0] <= 0 || this.ae[this.aO[0]][1] != 0 && this.ae[this.aO[0]][1] != 3) break;
                    this.d(0, 0, 0);
                    break;
                }
                if (n == 51) {
                    this.ar.t[1] = 1 * (100 + this.co[3]) / 100;
                    this.ar.t[0] = this.ar.t[0] + this.ar.t[1];
                    this.be[79] = (short)this.ar.t[1];
                    this.a(41, 1);
                    break;
                }
                if (n == 52) {
                    this.ar.t[1] = 10 * (100 + this.co[3]) / 100;
                    this.ar.t[0] = this.ar.t[0] + this.ar.t[1];
                    this.be[79] = (short)this.ar.t[1];
                    this.a(41, 1);
                    break;
                }
                if (n != 53) break;
                this.ar.t[1] = 500 * (100 + this.co[3]) / 100;
                this.ar.t[0] = this.ar.t[0] + this.ar.t[1];
                this.be[79] = (short)this.ar.t[1];
                this.a(41, 1);
                break;
            }
            case 1: {
                if (n < 1 || n > 25 || n == 19 || e.a((byte)n, this.W) >= 0) break;
                this.W = this.a(this.W, n, 1, n3);
                this.a(29, 1);
                break;
            }
            case 2: {
                if (n < 0 || n > 38 || e.a((byte)n, this.bK) >= 0) break;
                this.bK = this.a(this.bK, n, 1, n3);
                this.be[79] = (short)n;
                this.a(70, 1);
            }
        }
    }

    private int T(int n) {
        int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 12, 7, 8, 9, 19, 10, 6, 11, 20, 13, 14, 15, 16, 17, 18, 21};
        return e.a(n, nArray);
    }

    private int b(int n, int n2) {
        int n3 = -1;
        switch (n2) {
            case 0: {
                int[] nArray = new int[]{0, 1, 2, 3, 4, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 33, 37, 42, 46, 31, 39, 38, 43, 47, 49, 30, 34, 35, 40, 44, 48, 32, 36, 41, 45, 50};
                n3 = e.a(n, nArray);
                break;
            }
            case 1: {
                int[] nArray = new int[]{1, 4, 5, 3, 2, 8, 6, 13, 14, 18, 10, 11, 7, 12, 15, 9, 16, 17, 20, 21, 22, 25, 23, 24};
                n3 = e.a(n, nArray);
                break;
            }
            case 2: {
                int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};
                n3 = e.a(n, nArray);
                break;
            }
            case 3: {
                int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 12, 7, 8, 9, 19, 10, 6, 11, 20, 13, 14, 15, 16, 17, 18, 21};
                n3 = e.a(n, nArray);
            }
        }
        return n3;
    }

    private void M(int n) {
        if (this.bq[n] > 0) {
            switch (n) {
                case 0: {
                    this.ar.a[0] = this.ar.a[0] + 100;
                    int n2 = n;
                    this.bq[n2] = this.bq[n2] - 1;
                    break;
                }
                case 1: {
                    this.ar.a[0] = this.ar.a[0] + 300;
                    int n3 = n;
                    this.bq[n3] = this.bq[n3] - 1;
                    break;
                }
                case 2: {
                    this.ar.a[0] = this.ar.a[0] + 600;
                    int n4 = n;
                    this.bq[n4] = this.bq[n4] - 1;
                    break;
                }
                case 3: {
                    this.ar.C[0] = this.ar.C[0] + this.ar.C[1] * 50 / 100;
                    int n5 = n;
                    this.bq[n5] = this.bq[n5] - 1;
                    break;
                }
                case 4: {
                    this.ar.C[0] = this.ar.C[1];
                    this.be[6] = 250;
                    int n6 = n;
                    this.bq[n6] = this.bq[n6] - 1;
                }
            }
            if (this.ar.a[0] > this.ar.a[1]) {
                this.ar.a[0] = this.ar.a[1];
            }
            if (this.ar.C[0] > this.ar.C[1]) {
                this.ar.C[0] = this.ar.C[1];
            }
        }
    }

    private void p() {
        this.be[13] = (short)(this.aC[0] + this.be[19]);
        this.be[14] = (short)(this.aC[1] + this.be[20] + 290);
    }

    private void F() {
        int n;
        if ((this.q[0] != 0 || this.aO[0] != 0) && this.A != null && this.cn[26] != null) {
            for (n = 0; n < this.A.af.length; ++n) {
                this.a(this.A.af[n], this.A);
            }
        }
        if (this.aV != null && this.cn[26] != null) {
            for (n = 0; n < this.aV.af.length; ++n) {
                this.a(this.aV.af[n], this.aV);
            }
        }
        if (this.bk != null) {
            for (n = 0; n < this.bk.length; ++n) {
                for (int i2 = 0; i2 < this.bk[n].af.length; ++i2) {
                    this.a(this.bk[n].af[i2], this.bk[n]);
                }
            }
        }
    }

    private void j() {
        int n;
        int n2;
        if (this.ar != null && this.cn[this.ar.au] != null) {
            for (n2 = 0; n2 < this.ar.af.length; ++n2) {
                this.a(this.ar.af[n2], (i)this.ar);
            }
        }
        if (this.ca != null) {
            for (n2 = 0; n2 < this.ca.length; ++n2) {
                if (this.ca[n2] == null) continue;
                for (n = 0; n < this.ca[n2].af.length; ++n) {
                    this.a(this.ca[n2].af[n], this.ca[n2]);
                }
            }
        }
        if (this.c != null) {
            for (n2 = 0; n2 < this.c.length; ++n2) {
                if (this.c[n2] != null) {
                    for (n = 0; n < this.c[n2].af.length; ++n) {
                        this.a(this.c[n2].af[n], (i)this.c[n2]);
                    }
                    if (this.be[29] == 1) {
                        this.be[29] = 0;
                        n = this.be[26];
                        this.be[26] = (short)(this.be[26] + 1);
                        if (this.be[26] < 10 || this.be[26] > 14) {
                            this.be[26] = 10;
                        }
                        this.b(this.c[n2], this.be[26], 8, this.c[n2].af[n][5] + game.j.h[this.be[25]] * 16, this.c[n2].af[n][6], 1, this.c[n2].au, 1, 1, -1, 0, 1);
                    }
                }
                if (this.c[n2].D == null) continue;
                for (n = 0; n < this.c[n2].D.length; ++n) {
                    if (this.c[n2].D[n] == null) continue;
                    this.a(this.c[n2].D[n].af[0], (i)this.c[n2].D[n]);
                }
            }
        }
    }

    private void a(int[] nArray, i i2) {
        if (nArray[8] > 0) {
            int n = this.bX[nArray[0]][nArray[1]].length - 1;
            nArray[3] = nArray[3] + 1;
            if (nArray[3] >= this.bX[nArray[0]][nArray[1]][nArray[2]][0]) {
                nArray[2] = nArray[2] + 1;
                if (nArray[2] > n - 1) {
                    if (this.bX[nArray[0]][nArray[1]][n][0] > 0 && (nArray[4] = nArray[4] + 1) >= this.bX[nArray[0]][nArray[1]][n][0]) {
                        nArray[4] = 0;
                        nArray[8] = 0;
                        if (this.be[32] == 1) {
                            this.be[32] = 0;
                        }
                        if (nArray[10] >= 0) {
                            this.a(nArray, nArray[10], nArray[5], nArray[6], nArray[7], nArray[0], 1, 1, -1, 0, 0);
                        }
                    }
                    nArray[2] = 0;
                }
                nArray[3] = 0;
            }
            if (this.bX[nArray[0]][nArray[1]][nArray[2]][0] == 0) {
                if (nArray[0] == 26 && nArray[1] == 10) {
                    this.be[1] = 1;
                } else if ((nArray[0] == 19 || nArray[0] == 25) && nArray[1] == 8) {
                    i2.H = true;
                    this.be[27] = (short)i2.af[this.be[26]][5];
                    this.be[28] = (short)i2.af[this.be[26]][6];
                } else if (nArray[0] == 27 && nArray[1] == 5) {
                    this.be[47] = 1;
                    this.be[68] = 5;
                    this.p();
                    this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                } else if (this.q[0] != 19 && this.be[58] == 0 && nArray[0] == 28 && nArray[1] >= 29 && nArray[1] <= 31) {
                    this.M(this.be[69]);
                    this.be[79] = this.be[69];
                    this.be[61] = 0;
                    this.b(this.aV, 12, 59, 0, 0, 1, 26, 1, 1, -1, 1, 1);
                    this.a(71, 1);
                } else if (this.q[0] != 19 && this.be[58] == 0 && nArray[0] == 28 && nArray[1] == 33) {
                    this.M(this.be[75]);
                    this.be[79] = this.be[75];
                    this.be[76] = 0;
                    this.b(this.aV, 12, 59, 0, 0, 1, 26, 1, 1, -1, 1, 1);
                    this.a(71, 1);
                }
            } else if (this.bX[nArray[0]][nArray[1]][nArray[2]][0] == -1 && this.c[0] != null && this.c[0].a[0] > 0 && (nArray[0] == 19 || nArray[0] == 25) && nArray[1] == 8 && (this.be[25] == 1 && this.be[33] + game.a.aq[i2.au][0][4] >= i2.af[this.be[26]][5] || this.be[25] == 2 && this.be[33] - game.a.aq[i2.au][0][4] <= i2.af[this.be[26]][5])) {
                this.be[29] = 1;
            }
        }
    }

    private int a(int n, int n2, int n3, int n4) {
        block5: {
            int n5;
            boolean bl;
            block4: {
                bl = n3 < n;
                int n6 = n3 - n;
                int n7 = n4 - n2;
                int n8 = game.b.a(n6 * n6 + n7 * n7);
                n5 = n7 * game.b.e(2, 16) / n8;
                if (bl) break block4;
                for (int i2 = 0; i2 < 24; ++i2) {
                    if (n5 == game.j.an[i2][1]) {
                        return i2;
                    }
                    if (n5 <= game.j.an[i2][1] || n5 >= game.j.an[i2 + 1][1]) continue;
                    return i2;
                }
                break block5;
            }
            if (!bl) break block5;
            for (int i3 = 6; i3 <= 18; ++i3) {
                if (n5 == game.j.an[i3][1]) {
                    return i3;
                }
                if (n5 >= game.j.an[i3][1] || n5 <= game.j.an[i3 + 1][1]) continue;
                return i3;
            }
        }
        return -1;
    }

    private int[] a(int[] nArray) {
        int[] nArray2 = new int[]{0, 0};
        nArray2[0] = nArray[2] > 0 ? nArray[0] + Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % nArray[2] : nArray[0];
        nArray2[1] = nArray[3] > 0 ? nArray[1] - Math.abs(this.cm.nextInt() & Integer.MAX_VALUE) % nArray[3] : nArray[1];
        return nArray2;
    }

    private void O() {
        int n;
        this.ar = null;
        int[] nArray = new int[1536];
        int n2 = 1 + nArray.length * 4;
        byte[] byArray = new byte[n2];
        byte[] byArray2 = new byte[4];
        game.e e2 = new game.e(this.O);
        if (e2.a() == 0) {
            byArray[0] = -1;
            e2.a(byArray, 0, byArray.length);
        } else {
            byArray = e2.a(1);
            if (byArray.length != n2) {
                byArray = new byte[n2];
                byArray[0] = -1;
                e2.a(1, byArray, 0, byArray.length);
            }
        }
        this.be[34] = byArray[0];
        e2.b();
        e2 = null;
        int n3 = 1;
        for (n = 0; n < nArray.length; ++n) {
            for (int i2 = 0; i2 < byArray2.length; ++i2) {
                byArray2[i2] = byArray[n3++];
            }
            nArray[n] = (int)game.b.b(byArray2);
        }
        n = 0;
        this.G = nArray[n++];
        for (n3 = 0; n3 < this.bL[0].length; ++n3) {
            this.bL[0][n3][0] = (short)nArray[n++];
        }
        for (n3 = 0; n3 < this.bL[1].length; ++n3) {
            this.bL[1][n3][0] = (short)nArray[n++];
        }
        for (n3 = 0; n3 < this.w.length; ++n3) {
            this.w[n3] = nArray[n++];
        }
        for (n3 = 0; n3 < this.bq.length; ++n3) {
            this.bq[n3] = nArray[n++];
        }
        e.z[0] = nArray[n++];
        e.z[1] = nArray[n++];
        this.ar = (h)this.a(0, (byte)1, z[0], z[1], 0, this.d, this.B, this.d, 1);
        this.ar.b[0] = nArray[n++];
        this.ar.Z[0] = nArray[n++];
        this.ar.ac[0] = nArray[n++];
        this.ar.j = (byte)nArray[n++];
        this.ar.ax = (byte)nArray[n++];
        this.ar.d = (byte)nArray[n++];
        this.ar.a[1] = nArray[n++];
        this.ar.C[1] = nArray[n++];
        this.ar.aA[0] = nArray[n++];
        this.ar.t[0] = nArray[n++];
        this.ar.a[0] = nArray[n++];
        this.ar.C[0] = nArray[n++];
        n = this.d(nArray, n, this.a[0]);
        n = this.d(nArray, n, this.a[1]);
        n = this.b(nArray, n, this.T);
        this.bc = this.a(nArray, n, (int)this.aK);
        this.Q = this.a(nArray, n += this.aK, (int)this.av);
        this.W = this.a(nArray, n += this.av, (int)this.bA);
        this.bK = this.a(nArray, n += this.bA, (int)this.cc);
        this.ap = this.a(nArray, n += this.cc, (int)this.aI);
        this.F = this.a(nArray, n += this.aI, (int)this.bD);
        this.aS = this.a(nArray, n += this.bD, (int)this.K);
        n += this.K;
        n = this.b(nArray, n, this.aj);
        for (n3 = 0; n3 < this.bb.length; ++n3) {
            this.bb[n3] = (byte)nArray[n++];
        }
        for (n3 = 0; n3 < this.aq.length; ++n3) {
            this.aq[n3] = nArray[n++];
        }
        this.aC[0] = nArray[n++];
        this.aC[1] = nArray[n++];
        for (n3 = 0; n3 < this.E.length; ++n3) {
            this.E[n3][2] = nArray[n++];
        }
        n = this.d(nArray, n, this.bx[0]);
        n = this.d(nArray, n, this.bx[1]);
        this.ar.aA[1] = this.t(this.ar.b[0]);
    }

    private void I() {
        int n;
        int[] nArray = new int[1536];
        byte[] byArray = new byte[nArray.length * 4 + 1];
        int n2 = 0;
        byArray[0] = 1;
        nArray[n2++] = this.G;
        for (n = 0; n < this.bL[0].length; ++n) {
            nArray[n2++] = this.bL[0][n][0];
        }
        for (n = 0; n < this.bL[1].length; ++n) {
            nArray[n2++] = this.bL[1][n][0];
        }
        for (n = 0; n < this.w.length; ++n) {
            nArray[n2++] = this.w[n];
        }
        for (n = 0; n < this.bq.length; ++n) {
            nArray[n2++] = this.bq[n];
        }
        nArray[n2++] = this.ar.P;
        nArray[n2++] = this.ar.N;
        nArray[n2++] = this.ar.b[0];
        nArray[n2++] = this.ar.Z[0];
        nArray[n2++] = this.ar.ac[0];
        nArray[n2++] = this.ar.j;
        nArray[n2++] = this.ar.ax;
        nArray[n2++] = this.ar.d;
        nArray[n2++] = this.ar.a[1];
        nArray[n2++] = this.ar.C[1];
        nArray[n2++] = this.ar.aA[0];
        nArray[n2++] = this.ar.t[0];
        nArray[n2++] = this.ar.a[0];
        nArray[n2++] = this.ar.C[0];
        n2 = this.a(nArray, n2, this.a[0]);
        n2 = this.a(nArray, n2, this.a[1]);
        n2 = this.c(nArray, n2, this.T);
        n2 = this.a(nArray, n2, (int)this.aK, this.bc);
        n2 = this.a(nArray, n2, (int)this.av, this.Q);
        n2 = this.a(nArray, n2, (int)this.bA, this.W);
        n2 = this.a(nArray, n2, (int)this.cc, this.bK);
        n2 = this.a(nArray, n2, (int)this.aI, this.ap);
        n2 = this.a(nArray, n2, (int)this.bD, this.F);
        n2 = this.a(nArray, n2, (int)this.K, this.aS);
        n2 = this.a(nArray, n2, this.aj);
        for (n = 0; n < this.bb.length; ++n) {
            nArray[n2++] = this.bb[n];
        }
        for (n = 0; n < this.aq.length; ++n) {
            nArray[n2++] = this.aq[n];
        }
        nArray[n2++] = this.aC[0];
        nArray[n2++] = this.aC[1];
        for (n = 0; n < this.E.length; ++n) {
            nArray[n2++] = this.E[n][2];
        }
        n2 = this.a(nArray, n2, this.bx[0]);
        n2 = this.a(nArray, n2, this.bx[1]);
        n2 = 1;
        byArray[0] = 1;
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            byte[] byArray2 = game.b.a((long)nArray[i2], 4);
            for (int i3 = 0; i3 < byArray2.length; ++i3) {
                byArray[n2++] = byArray2[i3];
            }
        }
        game.e e2 = new game.e(this.O);
        if (e2.a() == 0) {
            e2.a(byArray, 0, byArray.length);
        } else {
            e2.a(1, byArray, 0, byArray.length);
        }
        e2.b();
        e2 = null;
    }

    private byte[] a(int[] nArray, int n, int n2) {
        int n3;
        byte[] byArray = new byte[n2];
        byte[] byArray2 = new byte[n2];
        for (n3 = 0; n3 < byArray2.length; ++n3) {
            byArray2[n3] = (byte)nArray[n++];
            if (byArray2[n3] >= 0) continue;
            byArray = new byte[n3];
            break;
        }
        for (n3 = 0; n3 < byArray.length; ++n3) {
            byArray[n3] = byArray2[n3];
        }
        return byArray;
    }

    private int a(int[] nArray, int n, int n2, byte[] byArray) {
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray[n++] = i2 < byArray.length ? byArray[i2] : -1;
        }
        return n;
    }

    private int a(int[] nArray, int n, byte[][] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                nArray[n++] = byArray[i2][i3];
            }
        }
        return n;
    }

    private int b(int[] nArray, int n, byte[][] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            for (int i3 = 0; i3 < byArray[i2].length; ++i3) {
                byArray[i2][i3] = (byte)nArray[n++];
            }
        }
        return n;
    }

    private int a(int[] nArray, int n, short[][][] sArray) {
        int n2 = n;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            for (int i3 = 1; i3 < sArray[i2].length; ++i3) {
                nArray[n2++] = sArray[i2][i3][3];
            }
        }
        return n2;
    }

    private int d(int[] nArray, int n, short[][][] sArray) {
        int n2 = n;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            for (int i3 = 1; i3 < sArray[i2].length; ++i3) {
                sArray[i2][i3][3] = (short)nArray[n2++];
            }
        }
        return n2;
    }

    private int b(int[] nArray, int n, short[][][] sArray) {
        int n2 = n;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            for (int i3 = 1; i3 < sArray[i2].length; ++i3) {
                sArray[i2][i3][2] = (short)nArray[n2++];
                sArray[i2][i3][3] = (short)nArray[n2++];
            }
        }
        return n2;
    }

    private int c(int[] nArray, int n, short[][][] sArray) {
        int n2 = n;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            for (int i3 = 1; i3 < sArray[i2].length; ++i3) {
                nArray[n2++] = sArray[i2][i3][2];
                nArray[n2++] = sArray[i2][i3][3];
            }
        }
        return n2;
    }

    private void y() {
        if (this.bk != null) {
            for (int i2 = 0; i2 < this.bk.length; ++i2) {
                if (this.bk[i2] == null) continue;
                if (this.bk[i2].ah == 0) {
                    this.a(this.bk[i2]);
                }
                int[] nArray = this.b(this.bk[i2]);
                int[] nArray2 = this.b((i)this.ar);
                if (this.bk[i2].au == 29) {
                    if (this.be[35] != 0) continue;
                    if (this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                        if (this.be[86] != 0) continue;
                        this.p();
                        this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                        this.o();
                        this.d(0, 0, 0);
                        this.e = true;
                        this.be[35] = 1;
                        e.f(this.q, 14);
                        this.be[86] = 1;
                        this.aT = (byte)2;
                        continue;
                    }
                    this.be[86] = 0;
                    continue;
                }
                if (this.bk[i2].au != 30) continue;
                if (this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                    if (this.aq[8] == 0) {
                        this.aq[8] = 1;
                        this.a(72, 1);
                        this.be[36] = 1;
                        continue;
                    }
                    if (this.be[36] != 0) continue;
                    this.be[36] = 1;
                    this.be[37] = 1;
                    this.a(this.bk[i2], 1, 0);
                    this.b(this.bk[i2], 0, 5, this.bk[i2].P, this.bk[i2].N, 1, 32, 1, 1, -1, 1, 0);
                    continue;
                }
                this.be[36] = 0;
                this.be[37] = 0;
                this.a(this.bk[i2], 0, 0);
                this.b(this.bk[i2], 0, 5, this.bk[i2].P, this.bk[i2].N, 1, 32, 1, 0, -1, 1, 0);
            }
        }
    }

    private void x() {
        if (this.N != null && this.ae[this.aO[0]][1] != 1) {
            this.a(this.N);
            int[] nArray = this.b(this.N);
            int[] nArray2 = this.b((i)this.ar);
            if (this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                if (this.be[52] == 0) {
                    this.be[52] = 1;
                    this.a(68, 1);
                }
            } else {
                this.be[52] = 0;
            }
        }
    }

    private void d(int n) {
        if (this.aT == 1) {
            if (this.g(48) == 1 || this.g(-6) == 1 || this.g(-7) == 1) {
                this.d(48, 0);
                this.d(-6, 0);
                this.d(-7, 0);
                this.be[35] = 1;
                if (this.bk != null) {
                    for (int i2 = 0; i2 < this.bk.length; ++i2) {
                        if (this.bk[i2].au != 29) continue;
                        this.a(this.bk[i2], 1, 1);
                    }
                }
                this.e = false;
                e.a(this.bf, 7);
                e.f(this.q, 0);
            }
        } else if (this.aT == 2) {
            if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
                this.d(n, 0);
                if (this.ar.t[0] >= this.E[5][0] + this.E[5][1] * this.E[5][2]) {
                    this.ar.a[0] = this.ar.a[1];
                    this.ar.C[0] = this.ar.C[1];
                    this.ar.t[1] = this.E[5][0] + this.E[5][1] * this.E[5][2];
                    this.ar.t[0] = this.ar.t[0] - this.ar.t[1];
                    int[] nArray = this.E[5];
                    nArray[2] = nArray[2] + 1;
                    this.aT = 0;
                } else {
                    this.U(1);
                }
            } else if (this.g(-7) == 1) {
                this.d(n, 0);
                this.be[35] = 0;
                this.be[86] = 1;
                this.e = false;
                e.a(this.bf, 7);
                e.f(this.q, 0);
            }
        }
    }

    private void u(int n) {
        if (this.g(48) == 1 || this.g(-6) == 1 || this.g(-7) == 1) {
            if (this.be[80] == 1) {
                this.a(33, 1, 2);
                this.be[80] = 0;
            }
            if (this.be[81] == 1) {
                this.a(17 + this.be[55], 1, 2);
                this.be[81] = 0;
            }
            this.e = false;
            this.d(48, 0);
            this.d(-6, 0);
            this.d(-7, 0);
            e.f(this.q, 0);
        }
    }

    private void m(int n) {
        if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
            this.d(n, 0);
            this.e = false;
            e.a(this.bf, 2);
            this.f();
        }
        if (this.g(-7) == 1) {
            this.d(n, 0);
            this.o();
            this.a(33);
            this.W(33);
            this.p();
            this.b(this.cj, 0, 2, this.be[13], this.be[14], 1, 33, 1, 1, -1, 0, 0);
            if (this.be[34] > 0) {
                this.bI[this.aU][this.aY[this.aU]][0] = 1;
            }
            this.f();
            e.a(this.bf, 4);
            e.f(this.q, 1);
        }
    }

    private void F(int n) {
        if (this.aO[0] > 0) {
            if (this.g(48) == 1 || this.g(-6) == 1 || this.g(-7) == 1) {
                if (this.ae[this.aO[0]][1] == 1 || this.ae[this.aO[0]][1] == 3) {
                    this.d(48, 0);
                    this.d(-6, 0);
                    this.d(-7, 0);
                }
                block0 : switch (this.ae[this.aO[0]][1]) {
                    case 1: {
                        this.be[43] = (short)(this.be[43] + 1);
                        if (this.be[43] >= this.b[2][this.ae[this.aO[0]][2]].length) {
                            if (this.aO[0] == 6 || this.aO[0] == 8 || this.aO[0] == 10 || this.aO[0] == 12 || this.aO[0] == 14 || this.aO[0] == 18 || this.aO[0] == 20 || this.aO[0] == 22) {
                                this.R();
                            } else if (this.aO[0] == 7 || this.aO[0] == 9 || this.aO[0] == 11 || this.aO[0] == 13 || this.aO[0] == 15 || this.aO[0] == 17 || this.aO[0] == 19 || this.aO[0] == 23) {
                                this.f(this.o + 1, -1);
                            }
                            if (this.aO[0] == 16) {
                                this.s = true;
                                this.aO[0] = 0;
                                this.e = false;
                                e.f(this.c[0].O, 6);
                            } else if (this.aO[0] == 19) {
                                int n2;
                                this.e = true;
                                this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                                this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                                this.aO[0] = 0;
                                this.G = this.bj = 1;
                                this.be[44] = 0;
                                game.a.a(this.ar, 60, 60);
                                e.z[0] = 60;
                                e.z[1] = 60;
                                this.ar.ag = 1;
                                this.ar.a[0] = this.ar.a[1];
                                this.ar.C[0] = this.ar.C[1];
                                this.be[53] = 1;
                                this.aq[0] = 1;
                                int[] nArray = new int[]{29, 31, 34, 38, 39, 40, 42, 43, 46, 47, 48};
                                for (n2 = 0; n2 < nArray.length; ++n2) {
                                    if (e.a((byte)nArray[n2], this.aS) >= 0) continue;
                                    this.ap = this.a(this.ap, nArray[n2], 1, 0);
                                }
                                for (n2 = 20; n2 <= 24; ++n2) {
                                    if (e.a((byte)n2, this.F) >= 0) continue;
                                    this.F = this.a(this.F, n2, 1, 0);
                                    int n3 = n2;
                                    this.bq[n3] = this.bq[n3] + 1;
                                }
                                this.bb = new byte[this.bi.length / 3];
                                this.I();
                                h.b(this.ar, (byte)0);
                                h.a(this.ar, (byte)0);
                                this.ar.ag = 1;
                                this.ar.az = 0;
                                this.ar.v = 0;
                                this.ar.l = 0;
                                this.ar.al[1] = 0;
                                this.ar.V = true;
                                this.ar.n[6] = false;
                                this.ar.n[5] = false;
                                this.ar.n[4] = false;
                                this.ar.n[5] = true;
                                this.ar.n[12] = false;
                                for (n2 = 0; n2 < this.ar.u[this.ar.d].length; ++n2) {
                                    if (this.ar.u[this.ar.d][n2][0] != 1) continue;
                                    this.ar.u[this.ar.d][n2][0] = 0;
                                    byte by = this.ar.d;
                                    this.ar.c[by] = (byte)(this.ar.c[by] - 1);
                                }
                                e.a(this.bf, 22);
                            } else if (this.aO[0] == 23) {
                                this.aO[0] = 0;
                                this.be[44] = 0;
                                e.a(this.bf, 4);
                                e.f(this.q, 21);
                                this.be[65] = 220;
                                this.be[41] = (short)((this.b[2][0][1][0].length() + 1) / (this.be[65] / game.b.a(game.j.aF[0])));
                                this.be[42] = 295;
                                this.be[43] = 25;
                            } else if (this.aO[0] == 21) {
                                this.aO[0] = 0;
                                this.be[43] = 0;
                                this.be[44] = 0;
                                this.p();
                                this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.o();
                                this.d(0, 0, 0);
                                this.e = true;
                                this.be[35] = 1;
                                e.f(this.q, 14);
                                this.I();
                                this.aT = 1;
                            } else if (this.aO[0] == 72 || this.aO[0] == 73) {
                                this.aO[0] = 0;
                                this.be[43] = 0;
                                this.be[44] = 0;
                                this.e = true;
                                e.a(this.bf, 4);
                                e.f(this.q, 12);
                                this.o();
                                this.p();
                                this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 4, 0, this.be[13], this.be[14], 1, 28, 1, 1, -1, 0, 0);
                                this.b(this.A, 5, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.f();
                                if (this.bq[0] == 0 && this.bq[1] == 0 && this.bq[2] == 0 && this.ar.t[0] >= this.a((byte)0, 1)) {
                                    this.aT = 1;
                                }
                            } else {
                                if (this.aq[0] == 0 && (this.aO[0] == 9 || this.aO[0] == 11 || this.aO[0] == 13 || this.aO[0] == 15 || this.aO[0] == 17)) {
                                    this.e = false;
                                    e.a(this.bf, 7);
                                    e.f(this.q, 0);
                                } else {
                                    this.e = false;
                                }
                                this.aO[0] = 0;
                                this.be[43] = 0;
                                this.be[44] = 0;
                                this.be[45] = 1;
                            }
                            if (this.bf[0] != 7 || this.q[0] == 0) break;
                            this.e = true;
                            break;
                        }
                        this.be[47] = 0;
                        this.p();
                        this.b(this.A, 6, 5, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 1);
                        break;
                    }
                    case 3: {
                        this.be[43] = (short)(this.be[43] + 1);
                        if (this.be[43] < this.b[0][1][this.ae[this.aO[0]][2]].length) break;
                        int n4 = this.aO[0];
                        if (this.aO[0] >= 33 && this.aO[0] <= 40 || this.aO[0] >= 42 && this.aO[0] <= 52 || this.aO[0] >= 59 && this.aO[0] <= 63 || this.aO[0] >= 74 && this.aO[0] <= 75) {
                            this.aO[0] = 0;
                            this.be[43] = 0;
                            this.be[44] = 0;
                            this.e = false;
                        } else if (this.aO[0] >= 53 && this.aO[0] <= 58 || this.aO[0] >= 64 && this.aO[0] <= 66) {
                            this.aO[0] = 0;
                            this.be[43] = 0;
                            this.be[44] = 0;
                        }
                        switch (n4) {
                            case 42: {
                                this.a(4, 1, 2);
                                break block0;
                            }
                            case 43: {
                                this.a(5, 1, 2);
                                break block0;
                            }
                            case 44: {
                                this.a(6, 1, 2);
                                break block0;
                            }
                            case 45: {
                                this.a(7, 1, 2);
                                break block0;
                            }
                            case 46: {
                                this.a(8, 1, 2);
                                break block0;
                            }
                            case 47: {
                                this.a(9, 1, 2);
                                break block0;
                            }
                            case 48: {
                                this.a(10, 1, 2);
                                break block0;
                            }
                            case 49: {
                                this.a(11, 1, 2);
                                break block0;
                            }
                            case 50: {
                                this.a(12, 1, 2);
                                break block0;
                            }
                            case 51: {
                                this.a(13, 1, 2);
                                break block0;
                            }
                            case 52: {
                                this.a(14, 1, 2);
                                break block0;
                            }
                            case 36: {
                                this.a(29, 1, 2);
                                break block0;
                            }
                            case 37: {
                                this.a(30, 1, 2);
                                break block0;
                            }
                            case 38: {
                                this.a(31, 1, 2);
                                break block0;
                            }
                            case 39: {
                                this.a(32, 1, 2);
                            }
                        }
                    }
                }
            }
            if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
                if (this.ae[this.aO[0]][1] == 5) {
                    this.d(-6, 0);
                    this.d(-5, 0);
                    this.d(53, 0);
                }
                switch (this.ae[this.aO[0]][1]) {
                    case 5: {
                        this.be[47] = 0;
                        this.be[44] = 0;
                        if (this.aO[0] == 67) {
                            this.aO[0] = 0;
                            this.e = false;
                            this.v(this.be[78]);
                            this.a(28, 1);
                            break;
                        }
                        if (this.aO[0] == 68) {
                            this.aO[0] = 0;
                            this.e = true;
                            this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                            this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                            e.a(this.bf, 26);
                            e.f(this.q, 0);
                            break;
                        }
                        if (this.aO[0] != 74 && this.aO[0] != 75) break;
                        this.be[89] = 0;
                        this.U(5);
                        this.aO[0] = 0;
                    }
                }
            } else if (this.g(-7) == 1) {
                this.d(-7, 0);
                if (this.ae[this.aO[0]][1] == 5) {
                    this.be[44] = 0;
                    this.be[47] = 0;
                    this.e = false;
                    if (this.aO[0] == 67) {
                        this.aO[0] = 0;
                        this.a(28, 1);
                    } else if (this.aO[0] == 68) {
                        this.aO[0] = 0;
                        e.f(this.q, 0);
                    } else if (this.aO[0] == 74 || this.aO[0] == 75) {
                        this.aO[0] = 0;
                        e.f(this.q, 0);
                    }
                }
            }
        }
    }

    private void a(int n, int n2) {
        if (n2 == 1) {
            if (!this.ck) {
                switch (this.ae[n][1]) {
                    case 0: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] == 1 || this.ae[this.aO[0]][1] == 5 || this.ae[this.aO[0]][1] == 3) || this.be[22] >= 0) break;
                        switch (n) {
                            case 1: {
                                if (this.ae[n][0] >= 1) break;
                                byte[] byArray = this.ae[n];
                                byArray[0] = (byte)(byArray[0] + 1);
                                this.d(n, 100, 0);
                                break;
                            }
                            case 2: {
                                if (this.ae[n][0] >= 3) break;
                                byte[] byArray = this.ae[n];
                                byArray[0] = (byte)(byArray[0] + 1);
                                if (this.ae[n][0] < 3) break;
                                this.d(n, 100, -1);
                                break;
                            }
                            case 3: {
                                if (this.ae[n][0] >= 1 || this.be[48] != 0) break;
                                this.be[48] = 1;
                                this.d(n, 100, 2);
                                break;
                            }
                            case 4: {
                                if (this.ae[n][0] >= 3) break;
                                this.be[73] = (short)(this.be[73] + 1);
                                if (this.be[73] < 30) break;
                                this.be[73] = 0;
                                if (this.ar.u[this.ar.d][1][0] != 0) break;
                                this.d(n, 100, 3);
                                break;
                            }
                            case 24: {
                                if (this.ae[n][0] >= 1) break;
                                byte[] byArray = this.ae[n];
                                byArray[0] = (byte)(byArray[0] + 1);
                                if (this.ae[n][0] < 1) break;
                                this.d(n, 100, 1);
                                break;
                            }
                            case 25: {
                                if (this.ae[n][0] >= 1) break;
                                if (this.be[72] == 0) {
                                    this.be[72] = 1;
                                    this.e = true;
                                    e.a(this.bf, 7);
                                    e.f(this.q, 13);
                                    this.p();
                                    this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 8, 6, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 9, 7, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 10, 8, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.b(this.A, 11, 9, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                    this.be[17] = (short)(this.aC[0] / 240 + this.bi[this.G * 3 + 1]);
                                    this.be[18] = (short)(this.aC[1] / 320 + this.bi[this.G * 3 + 2]);
                                    this.d(n, 100, 4);
                                    break;
                                }
                                this.d(n, 100, 4);
                            }
                        }
                        break;
                    }
                    case 1: {
                        this.e = true;
                        this.be[44] = 1;
                        this.d(n, 0, 0);
                        this.p();
                        this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                        break;
                    }
                    case 2: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] == 1 || this.ae[this.aO[0]][1] == 5 || this.ae[this.aO[0]][1] == 3) || this.be[22] >= 0 && (this.be[22] < 0 || n != 26 && n != 27 && n != 30 && n != 41 && n != 71)) break;
                        if (n == 26) {
                            if (this.be[22] >= 0 || this.ae[n][0] >= 1) break;
                            byte[] byArray = this.ae[n];
                            byArray[0] = (byte)(byArray[0] + 1);
                            this.d(n, 10, 0);
                            break;
                        }
                        this.d(n, 10, 0);
                        break;
                    }
                    case 3: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] == 1 || this.ae[this.aO[0]][1] == 5 || this.ae[this.aO[0]][1] == 3) || this.q[0] != 0) break;
                        if (n >= 33 && n <= 40 || n == 74 || n == 75) {
                            this.e = true;
                            this.be[44] = 1;
                            this.d(n, 0, 0);
                            break;
                        }
                        if (this.ae[n][0] >= 1) break;
                        byte[] byArray = this.ae[n];
                        byArray[0] = (byte)(byArray[0] + 1);
                        this.e = true;
                        this.be[44] = 1;
                        this.d(n, 0, 0);
                        break;
                    }
                    case 5: {
                        if (this.aO[0] != 0 && (this.aO[0] <= 0 || this.ae[this.aO[0]][1] == 1 || this.ae[this.aO[0]][1] == 5) || this.q[0] != 0) break;
                        if (n == 67 && this.be[78] < 0) {
                            this.a(69, 1);
                            break;
                        }
                        this.e = true;
                        this.be[47] = 1;
                        this.be[68] = 5;
                        this.be[44] = 1;
                        this.d(n, 0, 0);
                        break;
                    }
                }
            }
            if (this.ck) {
                this.ck = false;
            }
        } else if (n2 == 0 && this.aO[0] == n) {
            switch (this.ae[n][1]) {
                case 0: {
                    if (this.be[38] <= 0) break;
                    switch (this.aO[0]) {
                        case 2: 
                        case 4: 
                        case 24: 
                        case 25: {
                            this.aO[0] = 0;
                            this.be[38] = 0;
                            this.b(this.aV, 10, 0, this.ar.P, this.ar.N, 1, 32, 1, 0, -1, 1, 0);
                            break;
                        }
                        case 3: {
                            this.b(this.aV, 10, 0, this.ar.P, this.ar.N, 1, 32, 1, 0, -1, 1, 0);
                            if (this.be[46] != 1 || this.ae[n][0] >= 1) break;
                            byte[] byArray = this.ae[n];
                            byArray[0] = (byte)(byArray[0] + 1);
                            this.aO[0] = 0;
                            this.be[38] = 0;
                        }
                    }
                    break;
                }
                case 2: {
                    if (this.be[38] <= 0) break;
                    this.aO[0] = 0;
                    this.be[38] = 0;
                }
            }
        }
    }

    private void d(int n, int n2, int n3) {
        switch (this.ae[n][1]) {
            case 0: {
                this.be[40] = 1;
                this.be[38] = (short)n2;
                if (n3 >= 0) {
                    this.b(this.aV, 10, n3, this.ar.P, this.ar.N, 1, 32, 1, 1, -1, 1, 0);
                } else {
                    this.b(this.aV, 10, 0, this.ar.P, this.ar.N, 1, 32, 1, 0, -1, 1, 0);
                }
                this.aO[0] = n;
                break;
            }
            case 1: {
                this.be[43] = 0;
                this.be[40] = (short)((this.b[2][this.ae[n][2]][this.be[43]][0].length() + 1) / (220 / game.b.a(game.j.aF[0])));
                this.be[47] = 0;
                this.p();
                this.b(this.A, 6, 5, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 1);
                break;
            }
            case 4: {
                this.be[44] = 0;
                this.s = false;
                this.b(this.aV, 10, 0, this.ar.P, this.ar.N, 1, 32, 1, 0, -1, 1, 0);
                break;
            }
            case 2: {
                this.be[40] = 1;
                this.be[38] = (short)n2;
                break;
            }
            case 3: {
                this.be[43] = 0;
                this.be[40] = 1;
                this.be[47] = 0;
                this.p();
                this.b(this.A, 6, 5, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 1);
                break;
            }
        }
        this.aO[0] = n;
    }

    private void m() {
        if (this.aO[0] > 0) {
            switch (this.ae[this.aO[0]][1]) {
                case 0: {
                    if (this.be[38] <= 0) break;
                    this.be[38] = (short)(this.be[38] - 1);
                    if (this.be[38] > 0) break;
                    this.aO[0] = 0;
                    this.b(this.aV, 10, 0, this.ar.P, this.ar.N, 1, 32, 1, 0, -1, 1, 0);
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    if (this.be[38] <= 0) break;
                    this.be[38] = (short)(this.be[38] - 1);
                    if (this.be[38] > 0) break;
                    this.aO[0] = 0;
                    break;
                }
                case 3: {
                    break;
                }
            }
        }
    }

    private a[] a(int n, short[][][] sArray) {
        int n2 = 0;
        a[] aArray = null;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            n2 = 0;
            if (sArray[i2][0][0] == n) {
                int n3;
                for (n3 = 1; n3 < sArray[i2].length; ++n3) {
                    if (sArray[i2][n3][3] != 0) continue;
                    ++n2;
                }
                aArray = new a[n2];
                int n4 = 0;
                for (n3 = 1; n3 < sArray[i2].length; ++n3) {
                    if (sArray[i2][n3][3] != 0) continue;
                    aArray[n4] = new a();
                    aArray[n4].af = new int[1][12];
                    aArray[n4].av = sArray[i2][n3][2];
                    aArray[n4].au = 28;
                    this.a((i)aArray[n4], this.h(aArray[n4].av), 0);
                    game.a.a(aArray[n4], sArray[i2][n3][0] * this.by, sArray[i2][n3][1] * this.ab + this.ab);
                    aArray[n4].ah = 1;
                    this.b(aArray[n4], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                    ++n4;
                }
                break;
            }
            aArray = new a[]{};
        }
        return aArray;
    }

    private void k(a a2) {
        if (a2.au >= 1 && a2.au <= 18) {
            int n;
            int n2 = Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % 100);
            byte[][] byArray = this.X[this.aq[0]][a2.au - 1];
            if (byArray[0][1] > 0 && this.bq[byArray[0][0]] == 0 && n2 < byArray[0][1]) {
                n = byArray[0][0];
            } else {
                int n3 = this.a(byArray[2]);
                n = byArray[1][n3];
            }
            if (n < 127) {
                a2.D = new a[1];
                a2.D[0] = new a();
                a2.D[0].af = new int[1][12];
                a2.D[0].au = 28;
                a2.D[0].av = n;
                this.a((i)a2.D[0], this.h(a2.D[0].av), 0);
                if (a2.au == 2) {
                    game.a.a(a2.D[0], a2.P, a2.N - 20);
                } else {
                    game.a.a(a2.D[0], a2.P, a2.N + 16);
                }
                a2.D[0].ah = 1;
                this.b(a2.D[0], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
            }
        } else if (a2.au >= 19 && a2.au <= 25) {
            int n;
            int n4;
            int n5 = Math.abs((this.cm.nextInt() & Integer.MAX_VALUE) % 100);
            byte[][] byArray = this.J[this.aq[0]][a2.au - 19];
            if (byArray[0][1] > 0 && this.bq[byArray[0][0]] == 0 && n5 < byArray[0][1]) {
                this.be[7] = 1;
                a2.D = new a[byArray[0].length - 1];
                a2.D[0] = new a();
                a2.D[0].af = new int[1][12];
                a2.D[0].au = 28;
                a2.D[0].av = byArray[0][0];
                if (a2.D.length > 1) {
                    for (n4 = 1; n4 < a2.D.length; ++n4) {
                        a2.D[n4] = new a();
                        a2.D[n4].af = new int[1][12];
                        a2.D[n4].au = 28;
                        a2.D[n4].av = byArray[0][n4 + 1];
                    }
                }
            } else if (byArray[3][0] > 0) {
                this.be[7] = 0;
                a2.D = new a[byArray[3][0] + this.co[5]];
                int[] nArray = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 51, 52, 53};
                for (n = 0; n < a2.D.length; ++n) {
                    int n6 = this.a(byArray[2]);
                    a2.D[n] = new a();
                    a2.D[n].af = new int[1][12];
                    a2.D[n].au = 28;
                    a2.D[n].av = nArray[n6];
                }
            }
            n4 = 0;
            n = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 17;
            if (a2.D != null) {
                for (int i2 = 0; i2 < a2.D.length; ++i2) {
                    n4 = (i2 + 1) % 2 == 1 ? 1 : -1;
                    n = (i2 + 1) / 2 * n9;
                    this.a((i)a2.D[i2], this.h(a2.D[i2].av), 0);
                    n7 = a2.P;
                    n8 = a2.N + 16;
                    if (a2.P - a2.D.length / 2 * n9 <= 10) {
                        n7 += 10 - (a2.P - a2.D.length / 2 * n9);
                    } else if (a2.P + a2.D.length / 2 * n9 >= this.by * this.bL[this.aq[0]][this.be[22]][9] - 10) {
                        n7 -= a2.P + a2.D.length / 2 * n9 - (this.by * this.bL[this.aq[0]][this.be[22]][9] - 10);
                    }
                    if (n8 >= this.ab * this.bL[this.aq[0]][this.be[22]][10] - this.ab * 3) {
                        n8 -= n8 - (this.ab * this.bL[this.aq[0]][this.be[22]][10] - this.ab * 3);
                    } else if (n8 <= this.ab * this.bL[this.aq[0]][this.be[22]][11]) {
                        n8 += this.ab * this.bL[this.aq[0]][this.be[22]][11] - n8;
                    }
                    game.a.a(a2.D[i2], n7 + n4 * n, n8);
                    a2.D[i2].ah = 1;
                    this.b(a2.D[i2], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                }
            }
        }
    }

    private void b(a[] aArray, short[][][] sArray) {
        int n = 0;
        int n2 = 0;
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            if (aArray[i2] == null) continue;
            int n3 = this.a((i)this.ar, aArray[i2], 2, 0, false);
            if (n3 < 3000) {
                block1: for (int i3 = 0; i3 < sArray.length; ++i3) {
                    if (sArray[i3][0][0] != this.G) continue;
                    for (int i4 = 1; i4 < sArray[i3].length; ++i4) {
                        if (sArray[i3][i4][3] != 0) continue;
                        if (n2 == n) {
                            sArray[i3][i4][3] = 1;
                            this.r(aArray[i2].av);
                            aArray[i2] = null;
                            continue block1;
                        }
                        ++n2;
                    }
                }
                continue;
            }
            ++n;
        }
    }

    private void d(game.c c2) {
        if (c2.D != null) {
            for (int i2 = 0; i2 < c2.D.length; ++i2) {
                int n;
                if (c2.D[i2] == null || (n = this.a((i)this.ar, c2.D[i2], 2, 0, false)) >= 3000) continue;
                this.r(c2.D[i2].av);
                c2.D[i2] = null;
            }
        }
    }

    private void r(int n) {
        this.b(this.ar, 11, 17, this.ar.P, this.ar.N, this.ar.ag, 26, 1, 1, -1, 0, 1);
        this.a(n, 1, 0);
        if (this.q[0] == 0) {
            if (n >= 0 && n <= 4 || n >= 10 && n <= 19) {
                this.be[79] = (short)n;
                this.a(27, 1);
            } else if (n >= 54 && n <= 75) {
                this.a(67, 1);
            } else if (n >= 20 && n <= 28) {
                this.be[78] = (short)n;
                this.a(74, 1);
            } else if (n >= 29 && n <= 50) {
                this.be[78] = (short)n;
                this.a(75, 1);
            }
        }
    }

    private int h(int n) {
        int[] nArray = new int[]{11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 16, 16, 16, 16, 16, 16, 16, 16, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 21, 22, 23, 17, -1, -1, 19, 20, -1, 37, -1, 35, -1, 36, -1, 34, -1, -1, -1, -1, -1, -1, -1, 18, -1};
        if (n >= nArray.length) {
            return -1;
        }
        return nArray[n];
    }

    private void e(game.c c2) {
        if (c2 == null) {
            return;
        }
        if (c2.D != null) {
            for (int i2 = 0; i2 < c2.D.length; ++i2) {
                if (c2.D[i2] == null) continue;
                if (c2.D[i2].ah == 0) {
                    this.a((i)c2.D[i2]);
                }
                if (this.e) continue;
                c2.D[i2].a(this.bm[4]);
                this.h(c2.D[i2]);
            }
        }
    }

    private void a(a[] aArray) {
        for (int i2 = 0; i2 < aArray.length; ++i2) {
            if (aArray[i2] == null) continue;
            if (aArray[i2].ah == 0) {
                this.a((i)aArray[i2]);
            }
            this.a(aArray[i2].af[0], (i)aArray[i2]);
            if (this.e) continue;
            aArray[i2].a(this.bm[4]);
            this.h(aArray[i2]);
        }
    }

    public int[] a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int[] nArray = new int[4];
        nArray[0] = n > n5 ? n : n5;
        nArray[1] = n2 < n6 ? n2 : n6;
        int n9 = n + n3 < n5 + n7 ? n + n3 : n5 + n7;
        int n10 = n2 - n4 > n6 - n8 ? n2 - n4 : n6 - n8;
        nArray[2] = n9 - nArray[0];
        nArray[3] = nArray[1] - n10;
        return nArray;
    }

    private void B() {
        short[] sArray = new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 51, 52, 53};
        for (int i2 = 0; i2 < this.T.length; ++i2) {
            this.T[i2][1][3] = 0;
            this.T[i2][1][2] = sArray[this.a(this.u[this.aq[0]])];
        }
    }

    private void v(int n) {
        if (this.ar.u[this.ar.d][1][0] == 1) {
            this.ar.u[this.ar.d][1][0] = 0;
            byte by = this.ar.d;
            this.ar.c[by] = (byte)(this.ar.c[by] - 1);
        }
        this.ar.j = (byte)n;
        this.ar.ax = this.aj[this.ar.j][2];
        this.ar.d = this.aj[this.ar.j][1];
    }

    private void c() {
        if (this.ar.ax < 9) {
            this.be[23] = this.ar.ax;
            if (this.w[this.ar.j] >= this.g(this.ar.d, this.ar.ax)) {
                byte[] byArray = this.aj[this.ar.j];
                byArray[2] = (byte)(byArray[2] + 1);
                this.ar.ax = this.aj[this.ar.j][2];
                this.w[this.ar.j] = 0;
                this.b(this.ar, 0, 15, 0, 0, this.ar.ag, 26, 1, 1, -1, 1, 1);
                this.be[81] = 1;
                this.p();
                this.b(this.A, 7, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                this.o();
                this.e = true;
                e.f(this.q, 24);
                if (this.aO[0] > 0 && (this.ae[this.aO[0]][1] == 0 || this.ae[this.aO[0]][1] == 3)) {
                    this.d(0, 0, 0);
                }
            }
        }
    }

    private void f(int n, int n2) {
        if (n2 != 0) {
            this.f();
            this.e(n);
            this.bp[0][0] = n;
            this.bd.a(this.bY[n], 1, 1, n2, 1);
        }
    }

    private void R() {
        int n = 0;
        int n2 = 0;
        switch (this.bf[0]) {
            case 7: {
                if (this.q[0] == 19) {
                    n = 1;
                    n2 = 8;
                    break;
                }
                n = -1;
                if (this.be[22] < 0) {
                    n2 = this.o + 1;
                    break;
                }
                if (this.bL[this.aq[0]][this.be[22]][1] == 24) {
                    n2 = 7;
                    break;
                }
                n2 = 6;
                break;
            }
            case 4: {
                switch (this.q[0]) {
                    case 18: {
                        n = -1;
                        n2 = 1;
                        break;
                    }
                    case 1: {
                        n = -1;
                        n2 = 0;
                    }
                }
                break;
            }
            case 16: {
                n = -1;
                n2 = 0;
            }
        }
        if (n != 0) {
            this.f();
            this.e(n2);
            this.bp[0][0] = n2;
            this.bd.a(this.bY[n2], 1, 1, n, 1);
        }
    }

    public void f() {
        for (int i2 = 0; i2 < this.bY.length; ++i2) {
            if (this.bp[0][0] != i2) continue;
            try {
                game.d.b(this.bY[i2], 1);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    protected void e(int n) {
        this.bY[n] = this.bd.a("/data/music/music_" + n + ".mid", 1);
    }

    public void z(int n) {
        if (this.g(-3) == 1 || this.g(52) == 1) {
            game.d.a((byte)1, false);
            e e2 = this;
            e2.bd.b();
            this.d(n, 0);
        } else if (this.g(-4) == 1 || this.g(54) == 1) {
            game.d.a((byte)1, true);
            e e3 = this;
            e3.bd.b();
            this.d(n, 0);
        }
        if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(n, 0);
            e.a(this.bf, this.bf[1]);
            e.f(this.q, this.q[1]);
            this.f();
            if (this.q[0] == 1) {
                this.R();
            }
        }
    }

    public void l(int n) {
        switch (n) {
            case -7: {
                this.d(n, 0);
                e.a(this.bf, this.bf[1]);
                e.f(this.q, this.q[1]);
                this.f();
                if (this.q[0] != 1) break;
                this.R();
            }
        }
    }

    public void f(int n) {
        if (this.g(52) == 1 || this.g(-3) == 1) {
            this.d(n, 0);
            if (this.be[66] > 0) {
                this.be[66] = (short)(this.be[66] - 1);
            }
        } else if (this.g(-4) == 1 || this.g(54) == 1) {
            this.d(n, 0);
            if (this.be[66] < this.be[67] - 1) {
                this.be[66] = (short)(this.be[66] + 1);
            }
        }
        if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(n, 0);
            e.a(this.bf, this.bf[1]);
            e.f(this.q, this.q[1]);
            this.f();
            if (this.q[0] == 1) {
                this.R();
            }
        }
    }

    private void c(int n) {
        if (this.ak[n].length != 0) {
            this.ak[n] = new short[0][];
            this.au[n] = new short[0][][];
            this.I[n] = new short[0][];
            this.bO[n] = new short[0][];
            this.bX[n] = new short[0][][];
        }
    }

    private void N(int n) {
        if (this.cn[n] != null) {
            this.cn[n] = null;
        }
    }

    private void k() {
        for (int i2 = 0; i2 < 5; ++i2) {
            if (this.bh[this.aq[0]][i2] == null) continue;
            this.bh[this.aq[0]][i2] = null;
        }
    }

    private void U(int n) {
        boolean bl = false;
        if (this.aG[n][0] == 0) {
            if (this.aG[n][3] < this.aG[n][2]) {
                bl = true;
            }
        } else {
            bl = true;
        }
        if (bl) {
            this.a(0, 0);
            this.bt = this.aG[n][2] > this.aG[n][1] ? (this.aG[n][2] - this.aG[n][3]) / this.aG[n][1] : 0;
            e.a(this.bf, 4);
            e.f(this.q, 28);
            this.cg = 0;
            this.ck = true;
            this.e = true;
            this.bF = n;
            this.p();
            this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
        } else if (n == 0) {
            if (this.az == null) {
                this.az = game.b.b("/data/data/gamesecret.mid");
            }
            this.e = true;
            e.a(this.bf, 4);
            e.f(this.q, 30);
            this.o();
            this.p();
            this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.f();
        } else if (n == 5) {
            this.e = true;
            e.a(this.bf, 4);
            e.f(this.q, 12);
            this.o();
            this.p();
            this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.A, 4, 0, this.be[13], this.be[14], 1, 28, 1, 1, -1, 0, 0);
            this.b(this.A, 5, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
            this.f();
            if (this.aO[0] == 74) {
                this.aU = 1;
                this.bI[0][0][0] = (byte)game.b.a((byte)this.be[78], this.F);
            } else if (this.aO[0] == 75) {
                this.aU = (byte)2;
                this.bI[0][0][0] = (byte)game.b.a((byte)this.be[78], this.aS);
            } else if (this.bq[0] == 0 && this.bq[1] == 0 && this.bq[2] == 0 && this.ar.t[0] >= this.a((byte)0, 1)) {
                this.aT = 1;
            }
            this.aO[0] = 0;
        }
    }

    private void P(int n) {
        if (this.g(50) == 1 || this.g(-1) == 1) {
            this.d(n, 0);
            if (this.cg == 0) {
                if (this.bF == 2) {
                    this.bF = 1;
                } else if (this.bF == 4) {
                    this.bF = 3;
                }
                this.bt = this.aG[this.bF][2] > this.aG[this.bF][1] ? (this.aG[this.bF][2] - this.aG[this.bF][3]) / this.aG[this.bF][1] : 0;
            }
        } else if (this.g(56) == 1 || this.g(-2) == 1) {
            this.d(n, 0);
            if (this.cg == 0) {
                if (this.bF == 1) {
                    this.bF = 2;
                } else if (this.bF == 3) {
                    this.bF = 4;
                }
                this.bt = this.aG[this.bF][2] > this.aG[this.bF][1] ? (this.aG[this.bF][2] - this.aG[this.bF][3]) / this.aG[this.bF][1] : 0;
            }
        } else if (this.g(53) == 1 || this.g(-6) == 1 || this.g(-5) == 1) {
            switch (this.cg) {
                case 0: 
                case 4: {
                    if (this.g(-6) != 1) break;
                    this.cg = 1;
                    this.g();
                    String[][] stringArray = game.b.D();
                    int n2 = 0;
                    n2 = this.bF == 1 || this.bF == 3 ? 0 : 1;
                    String string = stringArray[n2][0] + "026" + this.al + GameMIDlet.b;
                    boolean bl = this.bT.a(string, this.bF, stringArray[n2][1]);
                    if (bl) {
                        this.b();
                        break;
                    }
                    this.cg = 3;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    this.ck = false;
                    switch (this.bF) {
                        case 0: {
                            this.e = false;
                            e.a(this.bf, 7);
                            e.f(this.q, 0);
                            this.p(this.ar.j);
                            this.aj[this.ar.j][0] = 1;
                            this.aj[this.ar.j][1] = 2;
                            this.w[this.ar.j] = 0;
                            this.v(0);
                            this.a(7, 1);
                            break;
                        }
                        case 1: 
                        case 2: {
                            e.a(this.bf, this.bf[1]);
                            e.f(this.q, this.q[1]);
                            break;
                        }
                        case 3: 
                        case 4: {
                            this.e = false;
                            e.a(this.bf, 7);
                            e.f(this.q, 0);
                            this.R();
                            break;
                        }
                        case 5: {
                            if (this.be[89] == 0) {
                                this.aO[0] = 0;
                                this.e = true;
                                e.a(this.bf, 4);
                                e.f(this.q, 12);
                                this.o();
                                this.p();
                                this.b(this.A, 0, 0, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 1, 1, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.A, 4, 0, this.be[13], this.be[14], 1, 28, 1, 1, -1, 0, 0);
                                this.b(this.A, 5, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                                this.f();
                                break;
                            }
                            e.a(this.bf, this.bf[1]);
                            e.f(this.q, this.q[1]);
                            this.be[89] = 0;
                            break;
                        }
                        case 6: {
                            this.e = false;
                            e.a(this.bf, 7);
                            e.f(this.q, 0);
                            this.a(67, 1);
                            break;
                        }
                        case 7: {
                            this.e = false;
                            e.a(this.bf, 7);
                            e.f(this.q, 0);
                            this.a(75, 1);
                            break;
                        }
                        case 8: {
                            this.e = false;
                            e.a(this.bf, 7);
                            e.f(this.q, 0);
                        }
                    }
                    this.cg = 0;
                    break;
                }
                case 3: {
                    this.ck = false;
                    this.cg = 0;
                }
            }
            this.d(n, 0);
        } else if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(n, 0);
            switch (this.cg) {
                case 0: 
                case 4: {
                    switch (this.bF) {
                        case 0: {
                            this.a(33);
                            this.W(33);
                            this.p();
                            this.b(this.cj, 0, 2, this.be[13], this.be[14], 1, 33, 1, 1, -1, 0, 0);
                            this.a(this.cj, 1, 0);
                            this.o();
                            game.e e2 = new game.e(this.O);
                            byte[] byArray = new byte[]{-1};
                            if (e2.a() == 0) {
                                byArray[0] = -1;
                            } else {
                                byArray = e2.a(1);
                            }
                            this.be[34] = byArray[0];
                            e2.b();
                            e2 = null;
                            if (this.be[34] > 0) {
                                this.bI[this.aU][this.aY[this.aU]][0] = 1;
                            }
                            e.a(this.bf, 4);
                            e.f(this.q, 1);
                            break;
                        }
                        case 1: 
                        case 2: {
                            e.a(this.bf, this.bf[1]);
                            e.f(this.q, this.q[1]);
                            break;
                        }
                        case 3: 
                        case 4: {
                            e.a(this.bf, this.bf[1]);
                            e.f(this.q, this.q[1]);
                            break;
                        }
                        case 5: {
                            if (this.be[89] == 0) {
                                this.e = false;
                                e.a(this.bf, 7);
                                e.f(this.q, 0);
                                this.f(this.bp[0][0], -1);
                                break;
                            }
                            e.a(this.bf, this.bf[1]);
                            e.f(this.q, this.q[1]);
                            break;
                        }
                        case 6: 
                        case 7: 
                        case 8: {
                            this.e = false;
                            e.a(this.bf, 7);
                            e.f(this.q, 0);
                        }
                    }
                    break;
                }
                case 1: {
                    break;
                }
            }
        }
    }

    private void Q(int n) {
        if (this.g(53) == 1 || this.g(-6) == 1 || this.g(-5) == 1) {
            this.d(53, 0);
            this.d(-6, 0);
            this.d(-5, 0);
            switch (this.aY[this.aU]) {
                case 0: {
                    if (this.aT == 0) {
                        if (this.ar.t[0] >= this.b(this.ar.ax, this.Y.a((int)this.ar.d, 0), (int)this.k[this.bI[this.aU][this.aY[this.aU]][0]])) {
                            this.aY[this.aU] = 2;
                            this.aT = 0;
                            break;
                        }
                        this.U(1);
                        break;
                    }
                    if (this.aT != 1) break;
                    this.e = false;
                    e.a(this.bf, 7);
                    e.f(this.q, 0);
                    break;
                }
                case 2: {
                    if (this.aT != 0) break;
                    if (this.ar.ax == 3) {
                        this.aj[this.ar.j][3] = 1;
                        this.aj[this.ar.j][4] = this.k[this.bI[0][0][0]];
                    } else if (this.ar.ax == 6) {
                        this.aj[this.ar.j][5] = 1;
                        this.aj[this.ar.j][6] = this.k[this.bI[0][0][0]];
                    } else if (this.ar.ax == 9) {
                        this.aj[this.ar.j][7] = 1;
                        this.aj[this.ar.j][8] = this.k[this.bI[0][0][0]];
                    }
                    this.ar.t[1] = this.b(this.ar.ax, this.Y.a((int)this.ar.d, 0), (int)this.k[this.bI[0][0][0]]);
                    this.ar.t[0] = this.ar.t[0] - this.ar.t[1];
                    this.aY[this.aU] = 3;
                    this.aT = 0;
                    break;
                }
                case 3: {
                    if (this.aT != 0) break;
                    this.aY[this.aU] = 4;
                    this.aT = 0;
                    break;
                }
                case 4: {
                    if (this.aT != 0) break;
                    this.e = false;
                    e.a(this.bf, 7);
                    e.f(this.q, 0);
                }
            }
        } else if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(-7, 0);
            this.d(-11, 0);
            switch (this.aY[this.aU]) {
                case 0: {
                    if (this.aT == 0) {
                        this.aT = 1;
                        break;
                    }
                    if (this.aT != 1) break;
                    this.aT = 0;
                    break;
                }
                case 2: {
                    this.aY[this.aU] = 0;
                    this.aT = 0;
                }
            }
        } else if (this.g(48) == 1) {
            this.d(48, 0);
            this.U(1);
        }
    }

    private void b() {
        int[] nArray = this.aG[this.bF];
        nArray[3] = nArray[3] + this.aG[this.bF][1];
        this.bt = (this.aG[this.bF][2] - this.aG[this.bF][3]) / this.aG[this.bF][1];
        if (this.aG[this.bF][3] >= this.aG[this.bF][2]) {
            if (this.aG[this.bF][0] == 1) {
                this.aG[this.bF][3] = 0;
            }
            int n = this.ar.b[0];
            block0 : switch (this.bF) {
                case 0: {
                    this.ar.t[0] = this.ar.t[0] + 10000;
                    break;
                }
                case 1: {
                    this.ar.t[0] = this.ar.t[0] + 10000;
                    break;
                }
                case 2: {
                    this.ar.t[0] = this.ar.t[0] + 100000;
                    break;
                }
                case 3: {
                    this.ar.a[0] = this.ar.a[1];
                    this.ar.C[0] = this.ar.C[1];
                    for (int i2 = n; i2 < n + 1; ++i2) {
                        this.a(this.ar, this.t(i2));
                    }
                    this.ar.n[0] = false;
                    this.d(this.ar, 0, 0);
                    this.ar.ap = true;
                    this.ao[0] = 750;
                    this.ar.S[0] = 2;
                    break;
                }
                case 4: {
                    this.ar.a[0] = this.ar.a[1];
                    this.ar.C[0] = this.ar.C[1];
                    for (int i3 = n; i3 < n + 3; ++i3) {
                        this.a(this.ar, this.t(i3));
                    }
                    this.ar.n[0] = false;
                    this.d(this.ar, 0, 0);
                    this.ar.ap = true;
                    this.ao[0] = 3750;
                    this.ar.S[0] = 2;
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    for (int i4 = 0; i4 < this.bx[this.aq[0]].length; ++i4) {
                        if (this.G != this.bx[this.aq[0]][i4][0][0]) continue;
                        this.bx[this.aq[0]][i4][1][3] = 1;
                        this.a(this.L[0].av, 1, 0);
                        this.aj[this.be[78]][2] = 9;
                        this.aj[this.be[78]][3] = 1;
                        this.aj[this.be[78]][4] = 1;
                        this.aj[this.be[78]][5] = 1;
                        this.aj[this.be[78]][6] = 6;
                        this.aj[this.be[78]][7] = 1;
                        this.aj[this.be[78]][8] = 6;
                        this.L[0] = null;
                        break block0;
                    }
                    break;
                }
                case 7: {
                    for (int i5 = 0; i5 < this.bx[this.aq[0]].length; ++i5) {
                        if (this.G != this.bx[this.aq[0]][i5][0][0]) continue;
                        this.bx[this.aq[0]][i5][1][3] = 1;
                        this.a(this.L[0].av, 1, 0);
                        this.be[78] = (short)this.L[0].av;
                        this.L[0] = null;
                        break block0;
                    }
                    break;
                }
            }
            this.n();
            this.cg = 2;
        } else {
            this.n();
            this.cg = 4;
        }
    }

    private void n() {
        int n;
        int n2;
        int n3;
        int[] nArray = new int[1536];
        int n4 = 1 + nArray.length * 4;
        byte[] byArray = new byte[n4];
        byte[] byArray2 = new byte[4];
        game.e e2 = new game.e(this.O);
        if (e2.a() == 0) {
            byArray[0] = -1;
            e2.a(byArray, 0, byArray.length);
        } else {
            byArray = e2.a(1);
            if (byArray.length != n4) {
                byArray = new byte[n4];
                byArray[0] = -1;
                e2.a(1, byArray, 0, byArray.length);
            }
        }
        int n5 = 1;
        for (n3 = 0; n3 < nArray.length; ++n3) {
            for (n2 = 0; n2 < byArray2.length; ++n2) {
                byArray2[n2] = byArray[n5++];
            }
            nArray[n3] = (int)game.b.b(byArray2);
        }
        n3 = 118;
        switch (this.bF) {
            case 0: 
            case 1: 
            case 2: {
                nArray[n3 + 11] = this.ar.t[0];
                break;
            }
            case 3: {
                nArray[n3 + 2] = this.ar.b[0];
                nArray[n3 + 3] = this.ar.Z[0];
                nArray[n3 + 4] = this.ar.ac[0];
                nArray[n3 + 8] = this.ar.a[1];
                nArray[n3 + 9] = this.ar.C[1];
                nArray[n3 + 10] = this.ar.aA[0];
                break;
            }
            case 4: {
                nArray[n3 + 2] = this.ar.b[0];
                nArray[n3 + 3] = this.ar.Z[0];
                nArray[n3 + 4] = this.ar.ac[0];
                nArray[n3 + 8] = this.ar.a[1];
                nArray[n3 + 9] = this.ar.C[1];
                nArray[n3 + 10] = this.ar.aA[0];
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                n5 = 14;
                for (n2 = 0; n2 < this.w.length; ++n2) {
                    nArray[n5++] = this.w[n2];
                }
                n5 = 665;
                n5 = this.a(nArray, n5, (int)this.aK, this.bc);
                n5 = 892;
                n5 = this.a(nArray, n5, this.aj);
                n5 = 1527;
                n5 = this.a(nArray, n5, this.bx[0]);
                break;
            }
            case 7: {
                n2 = -1;
                for (n = 0; n < this.bx[this.aq[0]].length; ++n) {
                    if (this.G != this.bx[this.aq[0]][n][0][0]) continue;
                    n2 = this.bx[this.aq[0]][n][1][2];
                    break;
                }
                nArray[64 + n2] = this.bq[n2];
                n5 = 1531;
                n5 = this.a(nArray, n5, this.bx[1]);
                break;
            }
        }
        n5 = 1;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            byArray2 = game.b.a((long)nArray[n2], 4);
            for (n = 0; n < byArray2.length; ++n) {
                byArray[n5++] = byArray2[n];
            }
        }
        e2.a(1, byArray, 0, byArray.length);
        e2.b();
        e2 = null;
        nArray = new int[this.aG.length + 1];
        n4 = nArray.length * 4;
        byArray = new byte[n4];
        n5 = 0;
        for (n2 = 0; n2 < this.aG.length; ++n2) {
            nArray[n5++] = this.aG[n2][3];
        }
        nArray[n5++] = this.l;
        n5 = 0;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            byArray2 = game.b.a((long)nArray[n2], 4);
            for (n = 0; n < byArray2.length; ++n) {
                byArray[n5++] = byArray2[n];
            }
        }
        game.e e3 = new game.e(this.aH);
        if (e3.a() == 0) {
            e3.a(byArray, 0, byArray.length);
        } else {
            e3.a(1, byArray, 0, byArray.length);
        }
        e3.b();
        e3 = null;
    }

    private void Q() {
        int n;
        int n2;
        int n3;
        int[] nArray = new int[this.aG.length + 1];
        int n4 = nArray.length * 4;
        byte[] byArray = new byte[n4];
        byte[] byArray2 = new byte[4];
        game.e e2 = new game.e(this.aH);
        if (e2.a() == 0) {
            nArray[this.aG.length] = this.aw;
            n3 = 0;
            for (n2 = 0; n2 < nArray.length; ++n2) {
                byArray2 = game.b.a((long)nArray[n2], 4);
                for (n = 0; n < byArray2.length; ++n) {
                    byArray[n3++] = byArray2[n];
                }
            }
            e2.a(byArray, 0, byArray.length);
        } else {
            byArray = e2.a(1);
            if (byArray.length != n4) {
                nArray[this.aG.length] = this.aw;
                n3 = 0;
                for (n2 = 0; n2 < nArray.length; ++n2) {
                    byArray2 = game.b.a((long)nArray[n2], 4);
                    for (n = 0; n < byArray2.length; ++n) {
                        byArray[n3++] = byArray2[n];
                    }
                }
                e2.a(1, byArray, 0, byArray.length);
            }
        }
        n3 = 0;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            for (n = 0; n < byArray2.length; ++n) {
                byArray2[n] = byArray[n3++];
            }
            nArray[n2] = (int)game.b.b(byArray2);
        }
        n2 = 0;
        for (n3 = 0; n3 < this.aG.length; ++n3) {
            this.aG[n3][3] = nArray[n2++];
        }
        this.l = nArray[n2++];
        e2.b();
        e2 = null;
    }

    public int b(int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        switch (n) {
            case 3: {
                n4 = 1;
                break;
            }
            case 6: {
                n4 = 3;
                break;
            }
            case 9: {
                n4 = 6;
            }
        }
        switch (n2) {
            case 0: {
                n5 = 1;
                break;
            }
            case 48128: {
                n5 = 3;
                break;
            }
            case 1179903: {
                n5 = 6;
                break;
            }
            case 12517596: {
                n5 = 9;
            }
        }
        return this.t[n3] * n4 * n5;
    }

    private void I(int n) {
        if (this.g(48) == 1 || this.g(-6) == 1 || this.g(-7) == 1) {
            this.d(n, 0);
            if (this.be[80] == 1) {
                this.a(33, 1, 2);
                this.be[80] = 0;
                this.e = false;
                e.f(this.q, 0);
            }
            if (this.be[81] == 1) {
                this.a(17 + this.be[55], 1, 2);
                this.be[81] = 0;
                if (this.ar.ax == 3 || this.ar.ax == 6 || this.ar.ax == 9) {
                    this.e = true;
                    e.a(this.bf, 4);
                    e.f(this.q, 29);
                    this.o();
                    this.p();
                    this.b(this.A, 2, 2, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 3, 3, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.A, 5, 4, this.be[13], this.be[14], 1, 27, 1, 1, -1, 0, 0);
                } else {
                    this.e = false;
                    e.f(this.q, 0);
                }
            }
        }
    }

    public void J(int n) {
        if (this.aY[this.aU] == 1) {
            if (this.g(52) == 1 || this.g(-3) == 1) {
                this.d(n, 0);
                if (this.be[66] > 0) {
                    this.be[66] = (short)(this.be[66] - 1);
                }
            } else if (this.g(-4) == 1 || this.g(54) == 1) {
                this.d(n, 0);
                if (this.be[66] < this.be[67] - 1) {
                    this.be[66] = (short)(this.be[66] + 1);
                }
            }
        }
        if (this.g(-6) == 1 || this.g(-5) == 1 || this.g(53) == 1) {
            this.d(n, 0);
            if (this.aY[this.aU] == 0) {
                this.aY[this.aU] = 1;
                this.be[66] = 0;
                this.be[67] = (short)((this.az[this.aE[this.bI[this.aU][0][0]]].length + this.y - 1) / this.y);
            }
        } else if (this.g(-7) == 1 || this.g(-11) == 1) {
            this.d(n, 0);
            if (this.aY[this.aU] == 0) {
                e.a(this.bf, 7);
                e.f(this.q, 0);
                this.f(this.bp[0][0], -1);
                this.e = false;
                this.az = null;
            } else if (this.aY[this.aU] == 1) {
                this.aY[this.aU] = 0;
            }
        }
    }

    private a[] b(int n, short[][][] sArray) {
        int n2 = 0;
        a[] aArray = null;
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            n2 = 0;
            if (sArray[i2][0][0] == n) {
                if (sArray[i2][0][0] <= 53 && this.bq[sArray[i2][1][2]] == 0 || sArray[i2][0][0] > 53 && sArray[i2][1][3] == 0) {
                    ++n2;
                }
                aArray = new a[n2];
                int n3 = 0;
                for (int i3 = 1; i3 < sArray[i2].length; ++i3) {
                    if (sArray[i2][i3][3] != 0) continue;
                    aArray[n3] = new a();
                    aArray[n3].af = new int[1][12];
                    aArray[n3].av = sArray[i2][i3][2];
                    aArray[n3].au = 28;
                    this.a((i)aArray[n3], this.h(aArray[n3].av), 0);
                    game.a.a(aArray[n3], sArray[i2][i3][0] * this.by, sArray[i2][i3][1] * this.ab + this.ab);
                    aArray[n3].ah = 1;
                    this.b(aArray[n3], 0, 58, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                    ++n3;
                }
                break;
            }
            aArray = new a[]{};
        }
        return aArray;
    }

    private void a(a[] aArray, short[][][] sArray) {
        if (aArray.length > 0 && aArray[0] != null) {
            int n = this.a((i)this.ar, aArray[0], 2, 0, false);
            if (n < 3000) {
                if (this.be[84] == 0) {
                    for (int i2 = 0; i2 < sArray.length; ++i2) {
                        if (sArray[i2][0][0] != this.G || sArray[i2][1][3] != 0) continue;
                        this.be[84] = 1;
                        if (sArray[i2][1][2] >= 54) {
                            this.be[85] = (short)(sArray[i2][1][2] - 54);
                            this.U(6);
                            continue;
                        }
                        this.be[85] = sArray[i2][1][2];
                        this.U(7);
                    }
                }
            } else {
                this.be[84] = 0;
            }
        }
    }

    private void g() {
        switch (this.bF) {
            case 0: {
                this.al = "01";
                break;
            }
            case 1: {
                this.al = "02";
                break;
            }
            case 2: {
                this.al = "03";
                break;
            }
            case 3: {
                this.al = "04";
                break;
            }
            case 4: {
                this.al = "05";
                break;
            }
            case 5: {
                this.al = "06";
                break;
            }
            case 6: 
            case 7: {
                block21: for (int i2 = 0; i2 < this.bx[this.aq[0]].length; ++i2) {
                    if (this.G != this.bx[this.aq[0]][i2][0][0]) continue;
                    short s = this.bx[this.aq[0]][i2][1][2];
                    switch (s) {
                        case 66: {
                            this.al = "08";
                            continue block21;
                        }
                        case 62: {
                            this.al = "09";
                            continue block21;
                        }
                        case 64: {
                            this.al = "10";
                            continue block21;
                        }
                        case 60: {
                            this.al = "11";
                            continue block21;
                        }
                        case 45: {
                            this.al = "12";
                            continue block21;
                        }
                        case 32: {
                            this.al = "13";
                            continue block21;
                        }
                        case 41: {
                            this.al = "14";
                            continue block21;
                        }
                        case 36: {
                            this.al = "15";
                            continue block21;
                        }
                        case 50: {
                            this.al = "16";
                        }
                    }
                }
                break;
            }
            case 8: {
                this.al = "07";
            }
        }
    }

    static {
        z = new int[2];
        ag = new int[4];
    }
}


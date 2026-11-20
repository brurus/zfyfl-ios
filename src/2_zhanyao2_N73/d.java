/*
 * Decompiled with CFR 0.152.
 */
import game.c;
import game.e;
import game.h;
import game.i;
import game.j;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;

public class d
extends a
implements j {
    public Random cx = new Random();
    public b ac;
    public Image[] bS = new Image[10];
    public int cb = 0;
    public int[] R = new int[]{0, 0};
    public boolean f = false;
    public byte[] bg = new byte[5];
    public byte bb = 0;
    public byte ba = 0;
    public byte[][][] bT = new byte[5][5][3];
    public int[] cw = new int[5];
    final int p;
    public h ay;
    c[] c = new c[0];
    i[] ar = new i[0];
    i E = new i();
    i[] bt = new i[0];
    i ag = new i();
    i[] S = new i[0];
    i bd = new i();
    game.a[] X = new game.a[0];
    i aO = new i();
    game.a[] P = new game.a[0];
    i cs = null;
    short[][][] bB;
    short[][] m;
    short[][] bF;
    short[][] aE;
    public int[][] ad;
    short[][] cg;
    protected int[][] bR;
    protected static int[][] cf;
    public int[] aK = new int[2];
    protected static int[] D;
    protected static int[] al;
    protected Image[][] bp = new Image[10][];
    protected Image[][] cy = new Image[41][];
    int cm = 0;
    boolean bf = false;
    boolean W = true;
    public game.d bl = new game.d();
    public Object[] cl = new Object[10];
    public int[] bL = new int[4];
    int bM = 0;
    int[] bn = new int[]{0, 1};
    public byte[] u = new byte[2];
    int[] s;
    int[] aJ;
    boolean g = false;
    public long H = 0L;
    public long cc = 0L;
    public long aX = 0L;
    public long bY = 0L;
    public boolean au = false;
    int bI = 6;
    String ak = "";
    public int[] Q = new int[21];
    int[][] bz = new int[2][3];
    int aY;
    int br;
    String bc = "108";

    public d(b b2) {
        this.p = 60;
        this.ac = b2;
        this.E.T = new int[12][12];
        this.bd.T = new int[10][12];
        this.aO.T = new int[26][12];
    }

    public void C() {
        this.u();
        this.R();
        if (this.I[0] < this.I[2]) {
            this.I[1] = this.I[1] + 1;
            if (this.I[1] >= 45000) {
                this.I[0] = this.I[0] + 1;
                this.I[1] = 0;
                if (this.I[0] >= 6) {
                    this.a(121);
                }
            }
        }
    }

    public void n() {
        switch (this.bn[0]) {
            case 4: {
                switch (this.u[0]) {
                    case 11: {
                        this.ac.b(this.cy, this.E, this.i, this.bb, this.aq, this.aB);
                        switch (this.i[this.bb]) {
                            case 21: {
                                this.ac.a(this.cy, this.cz, this.ao, this.x, this.bT[this.bb][this.bg[this.bb]], this.ay, this.b[1][0], this.aq, this.aB);
                                break;
                            }
                            case 22: {
                                this.ac.a(this.cy, this.bg[this.bb], this.ba, this.E, this.ao, this.x, this.bk, this.bT[this.bb], this.ay, this.b[1][0], this.aq, this.aB);
                                break;
                            }
                            case 23: {
                                this.ac.a(this.cy, this.bg[this.bb], this.E, this.V, this.bT[this.bb], this.bA, this.b[1][0], this.aq, this.aB);
                                break;
                            }
                            case 24: {
                                this.ac.a(this.cy, this.E, this.ce, this.K, this.bT[this.bb][this.bg[this.bb]], this.ay, this.b[1][0], this.aq, this.aB);
                                break;
                            }
                            case 25: {
                                this.ac.a(this.cy, this.E, this.cj, this.bT[this.bb][this.bg[this.bb]], this.b[1][0], this.aq, this.aB);
                            }
                        }
                        break;
                    }
                    case 12: {
                        this.ac.a(this.cy, this.E, this.aP, (int)this.bb, this.aq, this.aB);
                        switch (this.aP[this.bb]) {
                            case 27: {
                                this.ac.a(this.cy, this.E, this.ba, this.bA, this.aw, this.bg[this.bb], this.bT[this.bb], this.ay, this.b[1][0], this.aq, this.aB);
                                break;
                            }
                            case 28: {
                                this.ac.a(this.cy, this.E, this.ba, this.bA, this.bD, this.bk, this.M, this.aF, this.ao, this.bg[this.bb], this.bT[this.bb], this.ay, this.b[1][0], this.aq, this.aB);
                            }
                        }
                        break;
                    }
                    case 1: {
                        this.ac.a(this.be, this.bT[this.bb], (int)this.ba, this.cs, this.cy, this.aq, this.aB);
                        break;
                    }
                    case 18: {
                        this.ac.a(this.cy, this.b[2][0][0][0], this.bm[41], this.bm[42], this.bm[43], this.bm[65], this.aq, this.aB);
                        this.ac.a(0, 0, 240, this.cy[36][0].getHeight() + 10, 0);
                        this.ac.a(this.cy[36][0], 120, 10, 17);
                        break;
                    }
                    case 21: {
                        this.ac.a(this.cy, this.b[2][0][1][0], this.bm[41], this.bm[42], this.bm[43], this.bm[65], this.aq, this.aB);
                        this.ac.a(0, 0, 240, this.cy[36][0].getHeight() + 10, 0);
                        this.ac.a(this.cy[36][1], 120, 10, 17);
                        break;
                    }
                    case 27: {
                        this.ac.a(this.cy, this.b[2][0][2][0], this.bm[41], this.bm[42], this.bm[43], this.bm[65], this.aq, this.aB);
                        this.ac.a(0, 0, 240, this.cy[36][0].getHeight() + 10, 0);
                        this.ac.a(this.cy[36][0], 120, 10, 17);
                        break;
                    }
                    case 3: {
                        this.ac.a(this.cy, this.bl, this.aq, this.aB);
                        break;
                    }
                    case 4: {
                        this.ac.a(this.cy, this.E, (int)this.bm[66], (int)this.bm[67], this.aq, this.aB);
                        break;
                    }
                    case 5: {
                        this.ac.c(this.cy, this.aq, this.aB);
                        break;
                    }
                    case 29: {
                        this.ac.a(this.cy, this.aQ, this.E, this.K, this.bg[this.bb], this.ba, this.bT[this.bb], this.ay, this.b[1][0], this.aq, this.aB);
                        break;
                    }
                    case 28: {
                        this.ac.a(this.cy, this.bQ, this.cq, this.bE, this.E, this.cp, this.aq, this.aB);
                        break;
                    }
                    case 30: {
                        this.ac.a(this.cy, this.E, this.bg[this.bb], this.bT[this.bb], this.aG, this.bm[66], this.bm[67], this.C, this.aq, this.aB);
                    }
                }
                break;
            }
            case 21: {
                this.ac.d(this.cy, this.aq, this.aB);
                break;
            }
            case 7: {
                this.v();
                switch (this.u[0]) {
                    case 2: {
                        this.ac.a(this.cy, this.bu, this.bT[this.bb][this.bg[this.bb]], this.aq, this.aB);
                        break;
                    }
                    case 13: {
                        this.ac.a(this.cy, 0, this.E, this.aH, this.bq[this.q], this.bN[this.q], this.bj[this.q], this.ai, this.ay.I + this.bq[this.q][this.L * 3 + 1] * 240, this.ay.G + this.bq[this.q][this.L * 3 + 2] * 320, this.bm[17], this.bm[18], this.a[this.q], null, this.aq, this.aB);
                        break;
                    }
                    case 14: {
                        this.ac.a(this.cy, this.E, (int)this.ba, this.bh, this.aq, this.aB);
                        break;
                    }
                    case 23: {
                        this.ac.a(this.cy, this.E, this.ay, this.aq, this.aB);
                        break;
                    }
                    case 24: {
                        this.ac.a(this.cy, this.E, (int)this.bm[23], this.ay, this.b[1][0], this.aq, this.aB);
                        break;
                    }
                    case 22: {
                        this.ac.a(this.cy, this.E, (int)this.bm[7], this.cb, this.bm[63], this.aq, this.aB);
                        break;
                    }
                    case 19: {
                        this.ac.a(this.cy, this.aq, this.aB);
                        break;
                    }
                    case 25: {
                        this.ac.a(this.cy, this.E, this.bV[this.q][this.bm[22]][1], this.aa[this.bV[this.q][this.bm[22]][1]][0][0] - 31, this.aq, this.aB);
                    }
                }
                break;
            }
            case 0: {
                this.bS[1] = game.b.c("/s60/splogo.png");
                this.ac.a(this.bS);
                break;
            }
            case 25: {
                this.S();
                break;
            }
            case 1: 
            case 2: {
                this.ac.a(this.cy, 986895, 0xFF0000, this.cw[2], this.cw[3]);
                this.ac.a(this.bh, this.ax[10]);
                break;
            }
            case 22: {
                this.ac.a(this.cy, 986895, 0xFF0000, this.cw[2], this.cw[3]);
                this.ac.a(this.cy, 1, this.E, this.aH, this.bq[this.q], this.bN[this.q], this.bj[this.q], this.ai, this.ay.I + this.bq[this.q][this.L * 3 + 1] * 240, this.ay.G + this.bq[this.q][this.L * 3 + 2] * 320, this.bm[17], this.bm[18], this.a[this.q], null, this.aq, this.aB);
                break;
            }
            case 26: {
                this.ac.a(0, 0, 240, 320, 0xFFFFFF);
                break;
            }
            case -1: {
                this.p();
            }
        }
        if (this.u[0] != 19) {
            this.ac.a(this.bd, this.E, this.bm[77], this.bm[78], this.bm[79], this.bm[47], this.bm[68], this.aV[0], this.aj, this.b, this.cy, this.aq, this.aB);
        }
    }

    public void S() {
        if (this.bS[0] == null) {
            for (int k = 1; k <= 2; ++k) {
                this.bS[k] = d.c("/s60/0" + k + ".png");
            }
        }
        this.ac.a(this.bS, 1);
    }

    private game.a a(int n, int n2, int n3, int n4, int n5, int n6) {
        game.a a2 = null;
        a2 = new game.a();
        a2.T = new int[n6][12];
        a2.ag = n;
        a2.I = n2;
        a2.G = n3;
        a2.L = true;
        a2.q = a2.ag;
        a2.F = a2.ag;
        this.a((i)a2, n4, n5);
        return a2;
    }

    private game.a a(int n, byte by, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        game.a a2 = null;
        h h2 = null;
        c c2 = null;
        try {
            int n9;
            switch (n) {
                case 0: {
                    h2 = new h();
                    h2.T = new int[30][12];
                    h2.q = h2.ag = 0;
                    h2.F = h2.ag;
                    h.b(h2, (byte)0);
                    h2.U = by;
                    h2.ao = 0;
                    h2.o = 0;
                    h2.j = 0;
                    h2.Z[1] = 0;
                    h2.L = true;
                    h2.k[6] = false;
                    h2.k[5] = false;
                    h2.k[4] = false;
                    h2.k[5] = true;
                    h2.k[10] = false;
                    if (game.a.ad[h2.q].length > 0) {
                        h2.n = new int[10][][];
                        for (n9 = 0; n9 < h2.n.length; ++n9) {
                            h2.n[n9] = new int[game.a.ad[h2.q][this.aF[n9][7]][6]][15];
                        }
                    }
                    h2.c = new byte[10];
                    h2.J[1] = 6;
                    h2.ap = true;
                    h2.k[11] = true;
                    a2 = h2;
                    break;
                }
                case 1: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -50, 50, 100, 150);
                    a2 = c2;
                    break;
                }
                case 2: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -100, 140, 200, 350);
                    a2 = c2;
                    break;
                }
                case 3: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -100, 140, 200, 350);
                    a2 = c2;
                    break;
                }
                case 4: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -100, 140, 200, 350);
                    a2 = c2;
                    break;
                }
                case 5: {
                    c2 = new c();
                    c2.ag = n;
                    c2.ao = 0;
                    c2.o = 0;
                    c2.X = (short)-1;
                    c2.K = true;
                    game.c.a(c2.t, -200, 50, 400, 150);
                    a2 = c2;
                    break;
                }
                case 6: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -60, 50, 120, 150);
                    a2 = c2;
                    break;
                }
                case 7: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -100, 50, 200, 150);
                    a2 = c2;
                    break;
                }
                case 8: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -100, 140, 200, 350);
                    a2 = c2;
                    break;
                }
                case 9: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -110, 50, 220, 150);
                    a2 = c2;
                    break;
                }
                case 10: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -35, 50, 70, 150);
                    a2 = c2;
                    break;
                }
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: {
                    c2 = new c();
                    c2.K = true;
                    game.c.a(c2.t, -2000, 2000, 4000, 4000);
                    game.c.a(c2, (byte)0);
                    a2 = c2;
                }
            }
            if (n >= 1 && n <= 19) {
                a2.ag = n;
                a2.ae = true;
                a2.ao = 0;
                a2.o = 0;
                a2.X = (short)-1;
                a2.q = this.aS[a2.ag];
                a2.F = a2.ag;
                if (game.a.ad[a2.q].length > 0) {
                    a2.n = new int[game.a.ad[a2.q].length][][];
                    for (n9 = 0; n9 < a2.n.length; ++n9) {
                        a2.n[n9] = new int[game.a.ad[a2.q][n9][6]][15];
                    }
                }
                a2.c = new byte[game.a.ad[a2.q].length];
                a2.d = 0;
                a2.a[0] = n8;
                a2.b[1] = this.e(this.e[this.t[a2.ag]][0], this.e[this.t[a2.ag]][1], this.e[this.t[a2.ag]][2], a2.a[0]);
                a2.b[0] = a2.b[1];
                a2.N[0] = this.e(this.e[this.t[a2.ag]][3], this.e[this.t[a2.ag]][4], this.e[this.t[a2.ag]][5], a2.a[0]);
                a2.N[1] = a2.N[0];
                a2.R[1] = this.e(this.e[this.t[a2.ag]][6], this.e[this.t[a2.ag]][7], this.e[this.t[a2.ag]][8], a2.a[0]);
                a2.an[1] = this.e(this.e[this.t[a2.ag]][9], this.e[this.t[a2.ag]][10], this.e[this.t[a2.ag]][11], a2.a[0]);
                if (n >= 11 && n <= 19) {
                    a2.b[1] = this.k[a2.ag - 11];
                    a2.b[0] = a2.b[1];
                    a2.an[1] = 10 + a2.a[0] * 10 + a2.a[0] * a2.a[0] * 10;
                    a2.T = new int[4][12];
                    a2.w = new game.a[10][];
                } else {
                    a2.T = null;
                    a2.w = new game.a[1][];
                    if (n == 4) {
                        a2.b[1] = 1;
                        a2.b[0] = a2.b[1];
                    }
                }
            }
            game.a.a(a2, n2, n3);
            a2.U = by;
            if (a2.ag >= 1 && a2.ag <= 10) {
                game.c.a(a2.D, -200, 200, 400, 400);
                game.c.a(a2.x, n4, n5, n6, n7);
            } else if (a2.ag >= 11 && a2.ag <= 19) {
                game.c.a(a2.D, -100, 100, 200, 200);
                game.c.a(a2.x, n4, n5, n6, n7);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return a2;
    }

    private int e(int n, int n2, int n3, int n4) {
        return n + n4 * n2 + n4 * n4 / n3;
    }

    private void v() {
        int n;
        int n2;
        int n3;
        int n4 = this.aK[0] + this.bm[19] / 20;
        int n5 = this.aK[1] + this.bm[20] / 20;
        if (this.bm[1] == 1) {
            this.ac.a(0, 30, 240, 260, 0xFFFFFF);
        } else {
            int n6;
            if (this.by == 2) {
                n3 = 0;
                if (this.q == 2) {
                    n3 = 3100552;
                } else if (this.q == 6) {
                    n3 = 6440519;
                } else if (this.q == 9) {
                    n3 = 4552814;
                }
                this.ac.a(0, 30, 240, 260, n3);
            }
            block5: for (n2 = 0; n2 < 2; ++n2) {
                if (this.aE[n2] == null) continue;
                switch (this.by) {
                    case 1: {
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] + this.bm[19], this.ad[n2][1] + this.bm[20], this.ah[this.by], null, 240, 260);
                        continue block5;
                    }
                    case 2: {
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] + this.bm[19], this.ad[n2][1] + this.bm[20], this.ah[this.by], null, 240, 260);
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] - 240 + this.bm[19], this.ad[n2][1] + this.bm[20], this.ah[this.by], null, 240, 260);
                        continue block5;
                    }
                    case 0: 
                    case 3: {
                        n3 = this.ad[n2][0] / 240;
                        n = this.ad[n2][1] / 260;
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] - (n3 + 1) * 240 + this.bm[19], this.ad[n2][1] + 20 - (n + 1) * 260 + this.bm[20], this.ah[this.by], null, 240, 260);
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] - n3 * 240 + this.bm[19], this.ad[n2][1] + 20 - (n + 1) * 260 + this.bm[20], this.ah[this.by], null, 240, 260);
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] - (n3 + 1) * 240 + this.bm[19], this.ad[n2][1] - n * 260 + this.bm[20], this.ah[this.by], null, 240, 260);
                        this.ac.a(this.aE[n2], this.bp[this.ci], this.ad[n2][0] - n3 * 240 + this.bm[19], this.ad[n2][1] - n * 260 + this.bm[20], this.ah[this.by], null, 240, 260);
                    }
                }
            }
            if (this.bF[1] != null) {
                this.ac.a(this.bF[1], this.bp[this.ci], this.aK[0] + this.bm[19], this.aK[1] + this.bm[20], this.ah[this.by], null, 240, 260);
            }
            short s = this.bm[29] = (this.bm[29] = (short)(this.bm[29] + 1)) > 3 ? (short)0 : this.bm[29];
            if (this.bm[29] / 2 == 0) {
                this.ac.a(this.aE[2], this.bp[this.ci], this.aK[0] + this.bm[19], this.aK[1] + this.bm[20], this.ah[this.by], null, 240, 260);
            } else {
                this.ac.a(this.bF[0], this.bp[this.ci], this.aK[0] + this.bm[19], this.aK[1] + this.bm[20], this.ah[this.by], null, 240, 260);
            }
            if (this.bF[2] != null) {
                this.ac.a(this.bF[2], this.bp[this.ci], this.aK[0] + this.bm[19], this.aK[1] + this.bm[20], this.ah[this.by], null, 240, 260);
            }
            if (this.bd != null) {
                for (n2 = 0; n2 < 5; ++n2) {
                    if (this.bd.T[n2][11] != 0) continue;
                    this.a(this.bd.T[n2], 0, 0, 26);
                }
            }
            if (this.c != null) {
                for (n2 = 0; n2 < this.c.length; ++n2) {
                    if (this.c[n2] == null || !this.c[n2].S || this.c[n2].ag < 1 || this.c[n2].ag > 10) continue;
                    if (this.c[n2].K && this.c[n2].ag >= 1 && this.c[n2].ag <= 10 && this.c[n2].I + 20 >= n4 && this.c[n2].I - 20 <= n4 + 240 && this.c[n2].G + 20 >= n5 && this.c[n2].G - 20 <= n5 + 260) {
                        this.ac.a(this.c[n2], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                    }
                    if (this.c[n2].w == null) continue;
                    for (n6 = 0; n6 < this.c[n2].w.length; ++n6) {
                        if (this.c[n2].w[n6] == null) continue;
                        for (int k = 0; k < this.c[n2].w[n6].length; ++k) {
                            if (this.c[n2].w[n6][k] == null || this.c[n2].w[n6][k].I + 20 < n4 || this.c[n2].w[n6][k].I - 20 > n4 + 240 || this.c[n2].w[n6][k].G + 20 < n5 || this.c[n2].w[n6][k].G - 20 > n5 + 260) continue;
                            this.a(this.c[n2].w[n6][k].T[0], this.c[n2].w[n6][k].I, this.c[n2].w[n6][k].G, this.c[n2].w[n6][k].ag);
                            this.ac.a(this.c[n2].w[n6][k], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                        }
                    }
                }
            }
            if (this.X != null) {
                for (n2 = 0; n2 < this.X.length; ++n2) {
                    if (this.X[n2] == null || this.X[n2].I + 20 < n4 || this.X[n2].I - 20 > n4 + 240 || this.X[n2].G + 20 < n5 || this.X[n2].G - 20 > n5 + 260) continue;
                    this.a(this.X[n2].T[0], this.X[n2].I, this.X[n2].G, this.X[n2].ag);
                    this.ac.a(this.X[n2], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                }
            }
            if (this.P != null) {
                for (n2 = 0; n2 < this.P.length; ++n2) {
                    if (this.P[n2] == null || this.P[n2].I + 20 < n4 || this.P[n2].I - 20 > n4 + 240 || this.P[n2].G + 20 < n5 || this.P[n2].G - 20 > n5 + 260) continue;
                    this.a(this.P[n2].T[0], this.P[n2].I, this.P[n2].G, this.P[n2].ag);
                    this.ac.a(this.P[n2], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                }
            }
            if (this.bt != null) {
                for (n2 = 0; n2 < this.bt.length; ++n2) {
                    if (this.bt[n2] == null || this.bt[n2].I + 40 < n4 || this.bt[n2].I - 40 > n4 + 240 || this.bt[n2].G + 75 < n5 || this.bt[n2].G - 20 > n5 + 260) continue;
                    this.ac.a(this.bt[n2], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                    for (n6 = 0; n6 < this.bt[n2].T.length; ++n6) {
                        if (this.bt[n2].T[n6][11] == 0) {
                            this.a(this.bt[n2].T[n6], 0, 0, this.bt[n2].ag);
                            continue;
                        }
                        if (n6 == 0) {
                            if (this.f) continue;
                            this.a(this.bt[n2].T[n6], this.ay.I, this.ay.G + 60, this.bt[n2].ag);
                            continue;
                        }
                        this.a(this.bt[n2].T[n6], this.bt[n2].T[n6][5], this.bt[n2].T[n6][6], this.bt[n2].ag);
                    }
                }
            }
            if (this.ar != null) {
                for (n2 = 0; n2 < this.ar.length; ++n2) {
                    if (this.ar[n2] == null || this.ar[n2].I + 35 < n4 || this.ar[n2].I - 35 > n4 + 240) continue;
                    this.ac.a(this.ar[n2], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                    for (n6 = 0; n6 < this.ar[n2].T.length; ++n6) {
                        if (this.ar[n2].T[n6][11] == 0) {
                            this.a(this.ar[n2].T[n6], 0, 0, this.ar[n2].ag);
                            continue;
                        }
                        if (n6 == 0) {
                            if (this.f) continue;
                            this.a(this.ar[n2].T[n6], this.ay.I, this.ay.G + 60, this.ar[n2].ag);
                            continue;
                        }
                        this.a(this.ar[n2].T[n6], this.ar[n2].T[n6][5], this.ar[n2].T[n6][6], this.ar[n2].ag);
                    }
                }
            }
        }
        if (this.ay != null && this.cy[this.ay.ag] != null) {
            if (this.ay.S && (this.av[0] == 0 || this.av[0] > 0 && this.av[0] % 2 == 0)) {
                this.ac.a(this.ay, this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
            }
            this.d(this.ay, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
        }
        if (this.bm[1] == 0 && this.c != null) {
            for (n3 = 0; n3 < this.c.length; ++n3) {
                if (this.c[n3] == null || !this.c[n3].S || this.c[n3].ag < 11 || this.c[n3].ag > 19) continue;
                if (this.c[n3].K && this.c[n3].ag >= 11 && this.c[n3].ag <= 19) {
                    this.ac.a(this.c[n3], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                }
                this.d(this.c[n3], this.aK[0], this.aK[1]);
                if (this.c[n3].w == null) continue;
                for (n = 0; n < this.c[n3].w.length; ++n) {
                    if (this.c[n3].w[n] == null) continue;
                    for (n2 = 0; n2 < this.c[n3].w[n].length; ++n2) {
                        if (this.c[n3].w[n][n2] == null || this.c[n3].w[n][n2].I + 20 < n4 || this.c[n3].w[n][n2].I - 20 > n4 + 240 || this.c[n3].w[n][n2].G + 20 < n5 || this.c[n3].w[n][n2].G - 20 > n5 + 260) continue;
                        this.a(this.c[n3].w[n][n2].T[0], this.c[n3].w[n][n2].I, this.c[n3].w[n][n2].G, this.c[n3].w[n][n2].ag);
                        this.ac.a(this.c[n3].w[n][n2], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                    }
                }
            }
        }
        if (this.ay != null && this.cy[this.ay.ag] != null) {
            for (n3 = 0; n3 < this.ay.T.length; ++n3) {
                if (this.ay.T[n3][11] == 0) {
                    if (n3 == 19) {
                        if (this.bm[51] < 5) {
                            this.bm[51] = (short)(this.bm[51] + 1);
                        }
                        this.a(this.ay.T[n3], this.bm[52] * this.bm[51], this.bm[53] * this.bm[51], this.ay.ag);
                        continue;
                    }
                    this.a(this.ay.T[n3], 0, 0, this.ay.ag);
                    continue;
                }
                this.a(this.ay.T[n3], this.ay.I, this.ay.G, this.ay.ag);
            }
        }
        if (this.bm[1] == 0) {
            this.ac.a(this.m[0], this.bp[this.ci], this.aK[0] + this.bm[19], this.aK[1] + this.bm[20], this.ah[this.by], null, 240, 260);
            if (this.c != null) {
                for (n3 = 0; n3 < this.c.length; ++n3) {
                    if (this.c[n3] == null || this.c[n3].T == null) continue;
                    for (n = 0; n < this.c[n3].T.length; ++n) {
                        if (this.c[n3].T[n][11] == 0) {
                            this.a(this.c[n3].T[n], 0, 0, this.c[n3].ag);
                            continue;
                        }
                        this.a(this.c[n3].T[n], this.c[n3].T[n][5], this.c[n3].T[n][6], this.c[n3].ag);
                    }
                }
            }
            if (this.aO != null) {
                for (n3 = 0; n3 < this.aO.T.length; ++n3) {
                    if (this.aO.T[n3][11] != 0) continue;
                    this.a(this.aO.T[n3], 0, 0, 26);
                }
            }
            if (this.S != null && this.S.length > 0) {
                for (n3 = 0; n3 < this.S.length; ++n3) {
                    if (this.S[n3] == null) continue;
                    this.ac.a(this.S[n3], this.cy, this.aq, this.aB, this.ck, this.O, this.bZ, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
                }
            }
            if (this.u[0] == 0) {
                if (this.aV[0] == 0 || this.aV[0] != 0 && this.aj[this.aV[0]][1] != 1 && this.aj[this.aV[0]][1] != 3 && this.aj[this.aV[0]][1] != 4) {
                    this.ac.a(true, this.q);
                } else {
                    this.ac.a(false, this.q);
                }
            }
        }
        this.ac.a(0, 290, 240, 30, 0);
        this.ac.a(this.cy, this.E, this.ay, this.bm[47], this.bm[68], this.bm[22], this.bV[this.q], this.aV[0], this.aj, this.b, this.aq, this.aB);
        if (this.bm[1] == 0 && this.bd != null) {
            this.a(this.bd.T[6], this.aK[0] + 28 + this.bm[19], 320 - (this.aK[1] + 72 + this.bm[20]), 28);
            this.a(this.bd.T[7], this.aK[0] + 28 + this.bm[19], 320 - (this.aK[1] + 72 + this.bm[20]), 26);
            this.a(this.bd.T[8], this.aK[0] + 28 + this.bm[19], 320 - (this.aK[1] + 72 + this.bm[20]), 28);
            this.a(this.bd.T[9], 120, -160, 39);
        }
        if (this.bm[1] == 1) {
            this.bm[1] = 0;
        }
        if (this.bm[72] == 1) {
            this.ac.a(this.R[0], this.R[1], 0, 0, 240, 320, null);
        }
    }

    public void H() {
    }

    private byte a(game.a a2, c c2, int[] nArray, int n) {
        byte by = 0;
        switch (n) {
            case 0: {
                if (c2.U == 1) {
                    if (a2.I >= c2.I + nArray[3] || a2.I <= c2.I) break;
                    by = 1;
                    break;
                }
                if (c2.U != 2 || a2.I <= c2.I - nArray[0] || a2.I >= c2.I) break;
                by = 1;
                break;
            }
            case 1: {
                if (a2.I >= c2.I + nArray[0] + nArray[2] || a2.I <= c2.I + nArray[0]) break;
                by = 1;
                break;
            }
            case 2: {
                if (a2.I >= c2.I + nArray[0] + nArray[2] || a2.I <= c2.I + nArray[0] || a2.G <= c2.G + nArray[1] - nArray[3] || a2.G >= c2.G + nArray[1]) break;
                by = 1;
            }
        }
        return by;
    }

    public void p() {
        if (this.cw[0] >= this.cw[1]) {
            this.H();
        }
    }

    public void u() {
        block42: {
            block43: {
                if (this.v) break block42;
                if (this.bm[44] <= 0) break block43;
                if (this.bm[47] > 0 && this.bm[68] == 0) {
                    this.j(this.cm);
                }
                break block42;
            }
            block0 : switch (this.bn[0]) {
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
                    this.P(this.cm);
                    break;
                }
                case 7: {
                    switch (this.u[0]) {
                        case 2: {
                            this.j();
                            this.g(this.cm);
                            break;
                        }
                        case 13: {
                            this.l(this.cm);
                            break;
                        }
                        case 14: {
                            this.f(this.cm);
                            break;
                        }
                        case 24: {
                            this.p(this.cm);
                            break;
                        }
                        case 23: {
                            this.M(this.cm);
                            break;
                        }
                        case 25: {
                            this.O(this.cm);
                            break;
                        }
                        case 19: {
                            this.w(this.cm);
                            break;
                        }
                        case 0: {
                            if (this.bm[58] != 0) break;
                            if (this.m(-6) == 1) {
                                this.ab();
                                this.f = true;
                                this.c(-6, 0);
                                d.e(this.u, 2);
                                this.s();
                                this.k();
                                this.bT[0][0][0] = 4;
                            }
                            if (this.m(48) == 1) {
                                this.c(48, 0);
                                this.t();
                                this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 8, 6, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 9, 7, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 10, 8, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 11, 9, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.bm[17] = (short)(this.aK[0] / 240 + this.bq[this.q][this.L * 3 + 1]);
                                this.bm[18] = (short)(this.aK[1] / 320 + this.bq[this.q][this.L * 3 + 2]);
                                this.ab();
                                this.f = true;
                                d.a(this.bn, 7);
                                d.e(this.u, 13);
                            }
                            if (this.m(-7) == 1) {
                                this.c(-7, 0);
                                this.ab();
                                this.f = true;
                                d.a(this.bn, 4);
                                d.e(this.u, 11);
                                this.k();
                                this.s();
                                this.t();
                                this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 4, 0, this.bm[13], this.bm[14], 1, 28, 1, 1, -1, 0, 0);
                                this.b(this.E, 5, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                            }
                            if (this.m(42) == 1) {
                                this.c(42, 0);
                                if (this.ax[16] == 1 || this.aM[5][3] >= this.aM[5][2]) {
                                    this.bm[46] = 1;
                                    this.K(5);
                                }
                            }
                            if (this.m(35) == 1) {
                                this.c(35, 0);
                                if (this.aM[0][3] >= this.aM[0][2]) {
                                    this.K(0);
                                }
                            }
                            if (this.f || this.ay.k[9]) break;
                            this.T(this.cm);
                        }
                    }
                    break;
                }
                case 4: {
                    this.j();
                    switch (this.u[0]) {
                        case 1: {
                            if (this.bm[73] == 1) {
                                this.n(this.cm);
                                break block0;
                            }
                            break block42;
                        }
                        case 11: {
                            this.A(this.cm);
                            break block0;
                        }
                        case 12: {
                            this.r(this.cm);
                            break block0;
                        }
                        case 13: {
                            this.l(this.cm);
                            break block0;
                        }
                        case 3: {
                            this.V(this.cm);
                            break block0;
                        }
                        case 4: {
                            this.k(this.cm);
                            break block0;
                        }
                        case 5: {
                            this.u(this.cm);
                            break block0;
                        }
                        case 18: {
                            this.F(this.cm);
                            break block0;
                        }
                        case 21: {
                            this.S(this.cm);
                            break block0;
                        }
                        case 27: {
                            this.z(this.cm);
                            break block0;
                        }
                        case 29: {
                            this.C(this.cm);
                            break block0;
                        }
                        case 28: {
                            this.B(this.cm);
                            break block0;
                        }
                        case 30: {
                            this.o(this.cm);
                        }
                    }
                }
            }
        }
    }

    private void F(int n) {
        if (this.m(48) == 1) {
            this.c(48, 0);
            this.aV[0] = 0;
            this.a(10);
            this.f = false;
            d.a(this.bn, 7);
            d.e(this.u, 0);
            this.ac();
        }
    }

    private void S(int n) {
        if (this.m(48) == 1) {
            this.c(48, 0);
            this.f = false;
            d.a(this.bn, 7);
            d.e(this.u, 0);
            this.ac();
        }
    }

    private void z(int n) {
        if (this.m(48) == 1) {
            this.c(48, 0);
            this.ab();
            this.f = false;
            d.a(this.bn, 7);
            d.e(this.u, 0);
        }
    }

    public void n(int n) {
        if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
            switch (this.be[this.bT[this.bb][this.bg[this.bb]][0]]) {
                case 0: {
                    if (this.ba == 0) {
                        if (this.bm[34] > 0) {
                            this.ba = 1;
                            break;
                        }
                        this.ax[10] = (short)d.i(6);
                        d.a(this.bn, 2);
                        break;
                    }
                    if (this.ba != 1 || this.m(-6) != 1) break;
                    e e2 = new e(this.T);
                    byte[] byArray = e2.a(1);
                    byArray = new byte[byArray.length];
                    byArray[0] = -1;
                    e2.a(1, byArray, 0, byArray.length);
                    e2.b();
                    e2 = null;
                    this.bm[34] = byArray[0];
                    this.ax[10] = (short)d.i(6);
                    this.cs = null;
                    d.a(this.bn, 2);
                    break;
                }
                case 1: {
                    this.ax[10] = (short)d.i(6);
                    this.cs = null;
                    d.a(this.bn, 2);
                    break;
                }
                case 6: {
                    this.k();
                    d.a(this.bn, 4);
                    d.e(this.u, 3);
                    break;
                }
                case 2: {
                    this.k();
                    this.bm[66] = 0;
                    this.bm[67] = 3;
                    this.t();
                    this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    d.a(this.bn, 4);
                    d.e(this.u, 4);
                    break;
                }
                case 3: {
                    this.k();
                    d.a(this.bn, 4);
                    d.e(this.u, 5);
                    break;
                }
                case 7: {
                    this.ac.a();
                }
            }
            this.k();
            this.c(-6, 0);
            this.c(-5, 0);
            this.c(53, 0);
        } else if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(n, 0);
            if (this.ba == 1) {
                this.ba = 0;
                this.e(8, -1);
            }
        }
    }

    public void T(int n) {
        if (this.m(57) == 1 && (this.ay.r[0] == 1 || this.ay.r[0] == 0 || this.ay.r[0] == 2 || this.ay.r[0] == 3 || this.ay.r[0] == 7 || this.ay.r[0] == 17 || this.ay.r[0] == 10 || this.ay.r[0] == 12) && (this.bm[6] > 0 || this.bm[6] == 0 && this.ay.v[0] - this.c(this.aF[this.ay.d][11]) >= 0)) {
            if (this.bm[6] == 0) {
                this.ay.v[0] = this.ay.v[0] - this.c(this.aF[this.ay.d][11]);
            }
            this.b(this.ay, 13, 0);
        }
        if (this.ay.r[0] == 12) {
            this.bm[56] = this.m(53) == 1 || this.m(-5) == 1 ? (short)1 : 0;
        }
        if (this.bm[57] == 1) {
            if (this.ay.r[0] == 11 || this.ay.r[0] == 16 || this.ay.r[0] == 12) {
                if (this.m(53) != 1 && this.m(-5) != 1) {
                    this.bm[57] = 0;
                }
            } else {
                this.bm[57] = 0;
            }
        }
        if (this.bm[37] == 1) {
            if (this.m(53) == 1 || this.m(-5) == 1) {
                this.c(53, 0);
                this.c(-5, 0);
                this.a(55);
            }
        } else if (this.bm[49] == 1) {
            if (this.m(53) == 1 || this.m(-5) == 1) {
                this.c(53, 0);
                this.c(-5, 0);
                if (this.q == 1 && this.aM[0][2] > this.aM[0][3]) {
                    this.K(0);
                } else if (this.z[this.ae[0]][0] == 0) {
                    if (this.z[this.ae[0]][1] == 0) {
                        switch (this.ae[0]) {
                            case 2: {
                                this.a(59);
                                break;
                            }
                            case 3: {
                                this.a(60);
                                break;
                            }
                            case 4: {
                                this.a(61);
                                break;
                            }
                            case 5: {
                                this.a(62);
                                break;
                            }
                            case 6: {
                                this.a(63);
                                break;
                            }
                            case 7: {
                                this.a(64);
                                break;
                            }
                            case 8: {
                                this.a(65);
                            }
                        }
                    } else if (this.ax[19] == 0) {
                        this.ax[19] = 1;
                        this.a(56);
                    } else {
                        this.a(57);
                    }
                } else {
                    this.ax[10] = this.ax[10] + 1;
                    this.ax[10] = this.ax[10] >= this.U() ? 0 : this.ax[10];
                    this.a(133);
                }
            }
        } else if (!(this.m(53) != 1 && this.m(-5) != 1 || this.bm[57] != 0 || this.ay.r[0] != 1 && this.ay.r[0] != 0 && this.ay.r[0] != 2 && this.ay.r[0] != 3 && this.ay.r[0] != 7 && this.ay.r[0] != 17 && this.ay.r[0] != 8 && this.ay.r[0] != 14 && this.ay.r[0] != 9 && this.ay.r[0] != 10 && this.ay.r[0] != 12)) {
            this.bm[57] = 1;
            if (this.ay.k[5]) {
                this.b(this.ay, 11, 0);
            } else {
                this.b(this.ay, 16, 0);
            }
            this.ay.ac = true;
        }
        if (this.m(50) == 1 || this.m(-1) == 1) {
            this.c(50, 0);
            this.c(-1, 0);
            if (this.ay.k[4] && !this.ay.k[6]) {
                if (this.ay.r[0] == 8 || this.ay.r[0] == 9) {
                    if (this.ay.k[14]) {
                        this.ay.k[14] = false;
                    }
                    this.ay.k[6] = true;
                    this.ay.a(this.bv[0]);
                    this.ay.o = (short)(this.ay.o | 1);
                    this.b(this.ay, 14, 0);
                    this.a((i)this.ay, 14, 0);
                    this.ay.ac = true;
                }
            } else if (!(!this.ay.k[5] || this.ay.k[9] || this.ay.k[4] || this.ay.r[0] != 0 && this.ay.r[0] != 1 && this.ay.r[0] != 3 && this.ay.r[0] != 10 && this.ay.r[0] != 12 && this.ay.r[0] != 15 && this.ay.r[0] != 7 && this.ay.r[0] != 17 && this.ay.r[0] != 2 && this.ay.r[0] != 11 && this.ay.r[0] != 13)) {
                this.ay.o = (short)(this.ay.o | 1);
                this.ay.k[4] = true;
                this.ay.k[5] = false;
                this.ay.a(this.bv[0]);
                this.b(this.ay, 8, 0);
                this.a((i)this.ay, 9, 1);
                this.ay.ac = true;
            }
        }
        if (this.m(49) == 1 || this.m(51) == 1) {
            if (this.ay.k[4] && !this.ay.k[6] && (this.ay.r[0] == 8 || this.ay.r[0] == 9)) {
                this.ay.k[14] = true;
                this.ay.k[6] = true;
                this.ay.a(this.bv[0]);
                this.b(this.ay, 14, 0);
                this.a((i)this.ay, 14, 0);
                this.ay.ac = true;
            }
            if (!(!this.ay.k[5] || this.ay.k[9] || this.ay.k[4] || this.ay.r[0] != 0 && this.ay.r[0] != 1 && this.ay.r[0] != 3 && this.ay.r[0] != 10 && this.ay.r[0] != 15 && this.ay.r[0] != 2)) {
                this.ay.o = (short)(this.ay.o | 1);
                this.ay.k[4] = true;
                this.ay.k[5] = false;
                this.ay.k[14] = true;
                this.ay.a(this.bv[0]);
                this.b(this.ay, 8, 0);
                this.a((i)this.ay, 9, 1);
                this.ay.ac = true;
            }
            if (this.m(49) == 1) {
                this.ay.ak = (short)(this.ay.ak & 3);
                this.ay.ak = (short)(this.ay.ak | 4);
            }
            if (this.m(51) == 1) {
                this.ay.ak = (short)(this.ay.ak & 3);
                this.ay.ak = (short)(this.ay.ak | 8);
            }
            this.c(49, 0);
            this.c(51, 0);
        }
        if (this.m(-2) == 1 || this.m(56) == 1) {
            this.ay.k[16] = true;
            this.c(-2, 0);
            this.c(56, 0);
        }
        if (this.ay.r[0] != 15 || this.ay.r[0] == 15 && !this.ay.k[5]) {
            if (this.m(52) == 1 || this.m(-3) == 1) {
                this.ay.o = (short)(this.ay.o & 3);
                this.ay.o = (short)(this.ay.o | 4);
                if (this.ay.k[14]) {
                    this.ay.k[14] = false;
                }
            } else if (this.m(54) == 1 || this.m(-4) == 1) {
                this.ay.o = (short)(this.ay.o & 3);
                this.ay.o = (short)(this.ay.o | 8);
                if (this.ay.k[14]) {
                    this.ay.k[14] = false;
                }
            }
        }
    }

    public void h(int n) {
        this.cm = n;
        this.bf = true;
        this.bM = 0;
    }

    public void t(int n) {
        this.bf = false;
        this.cm = 0;
    }

    private boolean c(game.a a2, int n, int n2, int n3, int n4) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n5 = 0;
        int n6 = 0;
        if (a2 != null) {
            n5 = a2.G - 80;
            switch (a2.U) {
                case 1: {
                    n6 = a2.I - 96 - 12;
                    break;
                }
                case 2: {
                    n6 = a2.I - 144;
                }
            }
        } else {
            n5 = n2;
            n6 = n;
        }
        int n7 = 12;
        int n8 = 0;
        int n9 = 0;
        if (this.aK[1] > n5) {
            n8 = 40;
        } else if (this.aK[1] < n5) {
            n8 = 40;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if (n6 < al[0]) {
            n6 = al[0];
        } else if (n6 > al[1] - 240) {
            n6 = al[1] - 240;
        }
        if (this.aK[0] < n6) {
            if (this.aK[0] < al[1] - 240) {
                n9 = this.aK[0];
                this.aK[0] = this.aK[0] + n7;
                bl = true;
                if (this.aK[0] >= n6) {
                    this.aK[0] = n6;
                }
                this.c(0, n7, n8, this.aK[0] - n9);
            }
        } else if (this.aK[0] > n6 && this.aK[0] > al[0]) {
            n9 = this.aK[0];
            this.aK[0] = this.aK[0] - n7;
            bl = true;
            if (this.aK[0] <= n6) {
                this.aK[0] = n6;
            }
            this.c(1, n7, n8, n9 - this.aK[0]);
        }
        if (this.aK[0] <= al[0]) {
            if (al[0] - this.aK[0] < n7) {
                this.aK[0] = al[0];
            }
            if (this.aK[0] == al[0]) {
                bl = false;
            }
        } else if (this.aK[0] >= al[1] - 240) {
            if (this.aK[0] - (al[1] - 240) < n7) {
                this.aK[0] = al[1] - 240;
            }
            if (this.aK[0] == al[1] - 240) {
                bl = false;
            }
        }
        if (this.aK[1] > n5) {
            if (this.aK[1] > al[3]) {
                n9 = this.aK[1];
                this.aK[1] = this.aK[1] - n8;
                bl2 = true;
                if (this.aK[1] <= n5) {
                    this.aK[1] = n5;
                }
                this.c(2, n7, n8, n9 - this.aK[1]);
            }
        } else if (this.aK[1] < n5 && this.aK[1] < al[2] - 260) {
            n9 = this.aK[1];
            this.aK[1] = this.aK[1] + n8;
            bl2 = true;
            if (this.aK[1] >= n5) {
                this.aK[1] = n5;
            }
            this.c(3, n7, n8, this.aK[1] - n9);
        }
        if (this.aK[1] >= al[2] - 260) {
            if (this.aK[1] + 260 - al[2] < n8) {
                this.aK[1] = al[2] - 260;
            }
            if (this.aK[1] == al[2] - 260) {
                bl2 = false;
            }
        } else if (this.aK[1] <= al[3]) {
            if (al[3] - this.aK[1] < n8) {
                this.aK[1] = al[3];
            }
            if (this.aK[1] == al[3]) {
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
                switch (this.by) {
                    case 2: {
                        int[] nArray = this.ad[1];
                        nArray[0] = nArray[0] + n5 / 4;
                        if (this.ad[1][0] < 240) break;
                        this.ad[1][0] = 0;
                        break;
                    }
                    case 0: 
                    case 3: {
                        this.a();
                    }
                }
                break;
            }
            case 1: {
                switch (this.by) {
                    case 2: {
                        int[] nArray = this.ad[1];
                        nArray[0] = nArray[0] - n5 / 4;
                        if (this.ad[1][0] >= 0) break;
                        int[] nArray2 = this.ad[1];
                        nArray2[0] = nArray2[0] + 240;
                        break;
                    }
                    case 0: 
                    case 3: {
                        this.a();
                    }
                }
                break;
            }
            case 2: {
                switch (this.by) {
                    case 2: {
                        this.ad[1][1] = this.aK[1] + this.bm[20];
                        break;
                    }
                    case 0: 
                    case 3: {
                        this.a();
                    }
                }
                break;
            }
            case 3: {
                switch (this.by) {
                    case 2: {
                        this.ad[1][1] = this.aK[1] + this.bm[20];
                        break block0;
                    }
                    case 0: 
                    case 3: {
                        this.a();
                    }
                }
            }
        }
    }

    private int[] j(game.a a2) {
        int[] nArray = new int[2];
        int n = a2.G - 80;
        if (n < 0) {
            n = 0;
        }
        switch (a2.U) {
            case 1: {
                nArray[0] = a2.I - 96;
                break;
            }
            case 2: {
                nArray[0] = a2.I - 144;
            }
        }
        if (nArray[0] < al[0]) {
            nArray[0] = al[0];
        } else if (nArray[0] > al[1] - 240) {
            nArray[0] = al[1] - 240;
        }
        nArray[1] = n;
        if (nArray[1] > al[2] - 260) {
            nArray[1] = al[2] - 260;
        } else if (nArray[1] < al[3]) {
            nArray[1] = al[3];
        }
        return nArray;
    }

    private void a() {
        switch (this.by) {
            case 1: 
            case 2: {
                this.ad[1][0] = 0;
                this.ad[1][1] = this.aK[1] + this.bm[20];
                break;
            }
            case 0: 
            case 3: {
                this.ad[0][0] = this.aK[0] / 2;
                this.ad[1][0] = this.aK[0] / 2;
                this.ad[2][0] = this.aK[0] / 2;
                this.ad[0][1] = this.aK[1] / 2;
                this.ad[1][1] = this.aK[1] / 2;
                this.ad[2][1] = this.aK[1] / 2;
            }
        }
    }

    public void R() {
        block98: {
            this.L();
            block0 : switch (this.bn[0]) {
                case 7: {
                    if (!this.f) {
                        this.o();
                        this.K();
                    }
                    this.T();
                    if (this.u[0] != 0 || this.v) break;
                    this.q();
                    break;
                }
                case 0: {
                    this.cw[0] = this.cw[0] + 1;
                    this.cw[1] = 15;
                    if (this.cw[0] < this.cw[1]) break;
                    this.cw[0] = 0;
                    for (int k = 0; k < this.bS.length; ++k) {
                        this.bS[k] = null;
                    }
                    d.a(this.bn, 25);
                    break;
                }
                case 25: {
                    this.cw[0] = this.cw[0] + 1;
                    this.cw[1] = 12;
                    if (this.cw[0] < this.cw[1]) break;
                    this.cw[0] = 0;
                    for (int k = 0; k < this.bS.length; ++k) {
                        this.bS[k] = null;
                    }
                    this.cw[2] = 0;
                    this.cw[3] = 50;
                    this.R(34);
                    this.ax[10] = (short)d.i(6);
                    this.bn[0] = 1;
                    break;
                }
                case 21: {
                    break;
                }
                case 1: {
                    this.cw[2] = this.cw[2] + 1;
                    this.cw[3] = 12;
                    switch (this.cw[2]) {
                        case 2: {
                            this.R(27);
                            this.b(27);
                            break;
                        }
                        case 4: {
                            this.R(33);
                            this.b(33);
                            this.R(39);
                            this.b(39);
                            break;
                        }
                        case 6: {
                            this.R(26);
                            this.b(26);
                            this.R(35);
                            break;
                        }
                        case 8: {
                            for (int k = 0; k < 10; ++k) {
                                this.bm[90 + k] = 0;
                            }
                            break;
                        }
                        case 10: {
                            this.e();
                            this.bl.a(1);
                        }
                    }
                    if (this.cw[2] < this.cw[3]) break;
                    this.cw[2] = 0;
                    this.cw[3] = 50;
                    this.ax[10] = this.ax[10] + 1;
                    this.ax[10] = this.ax[10] >= this.U() ? 0 : this.ax[10];
                    d.a(this.bn, 21);
                    break;
                }
                case 2: {
                    this.cw[3] = 40;
                    this.cw[2] = this.cw[2] + 1;
                    switch (this.cw[2]) {
                        case 2: {
                            this.d(33);
                            this.y(33);
                            this.R(0);
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
                            this.R(28);
                            this.R(29);
                            this.R(30);
                            this.R(31);
                            this.R(32);
                            this.R(36);
                            this.R(37);
                            this.b(37);
                            this.R(38);
                            this.b(38);
                            this.R(40);
                            this.b(40);
                            break;
                        }
                        case 18: {
                            this.b(0);
                            this.b(28);
                            this.b(29);
                            this.b(30);
                            this.b(31);
                            this.b(32);
                            break;
                        }
                        case 20: {
                            this.bU = this.q;
                            this.bj = new byte[this.bq.length][];
                            for (int k = 0; k < this.bq.length; ++k) {
                                this.bj[k] = new byte[this.bq[k].length / 3];
                            }
                            this.bm = new short[this.bm.length];
                            this.bX = new int[0];
                            e e2 = new e(this.T);
                            byte[] byArray = new byte[]{-1};
                            if (e2.a() == 0) {
                                byArray[0] = -1;
                            } else {
                                byArray = e2.a(1);
                            }
                            this.bm[34] = byArray[0];
                            e2.b();
                            e2 = null;
                            if (this.bm[34] < 0) {
                                this.m();
                            } else {
                                this.X();
                                if (this.bm[34] < 0) {
                                    this.m();
                                }
                            }
                            this.aa();
                            break;
                        }
                        case 22: {
                            this.H(0);
                            this.H(4);
                            this.H(7);
                            this.H(1);
                            this.H(this.q);
                            break;
                        }
                        case 26: {
                            break;
                        }
                        case 28: {
                            int n;
                            this.g();
                            this.y();
                            this.bm[35] = 0;
                            this.bm[86] = 0;
                            if (this.bm[34] >= 0) {
                                this.bm[35] = 0;
                                this.bm[86] = 1;
                                if (this.bt != null) {
                                    for (n = 0; n < this.bt.length; ++n) {
                                        if (this.bt[n].ag != 29) continue;
                                        this.a(this.bt[n], 0, 0);
                                    }
                                }
                            }
                            this.aU = this.bq[this.q][this.L * 3];
                            this.ci = this.b(this.q, this.aU);
                            this.ah[this.by] = null;
                            this.by = this.L(this.ci);
                            this.ah[this.by] = game.b.b(d.d("/data/data/mapmodule_" + this.by + ".mid"));
                            this.bj[this.q][this.L] = 1;
                            n = 0;
                            for (int k = 0; k < this.bj[this.q].length; ++k) {
                                if (this.bj[this.q][k] != 1) continue;
                                ++n;
                            }
                            this.bO[this.q] = (byte)(n * 100 / this.bj[this.q].length);
                            if (this.c() >= 900) {
                                this.a(122);
                            }
                            if (this.c() >= 500) {
                                this.a(113);
                            }
                            this.J(this.aU);
                            this.bd = new game.a();
                            this.bd.T = new int[10][12];
                            this.V();
                            this.b(0, this.F, this.d, 0);
                            this.bU = this.q;
                            this.bm[87] = 0;
                            this.bm[88] = 0;
                            break;
                        }
                        case 32: {
                            this.bm[22] = (short)d.a((byte)this.L, this.aH[0][this.q]);
                            if (this.bm[22] >= 0 && this.bV[this.q][this.bm[22]][5] == 1) {
                                this.bm[54] = 0;
                            }
                            for (int k = 1; k <= 19; ++k) {
                                this.d(k);
                            }
                            this.aK = this.j(this.ay);
                            this.Z();
                            this.E();
                            this.l();
                            break;
                        }
                        case 36: {
                            this.X = this.a(this.L, this.a[this.q]);
                            this.bm[24] = 0;
                            this.P = this.b(this.L, this.bJ[this.q]);
                            this.av[0] = 0;
                            break;
                        }
                    }
                    if (this.cw[2] <= this.cw[3]) break;
                    this.cw[2] = 0;
                    this.ax[10] = this.ax[10] + 1;
                    int n = this.ax[10] = this.ax[10] >= this.U() ? 0 : this.ax[10];
                    if (this.bm[34] < 0) {
                        d.a(this.bn, 4);
                        d.e(this.u, 18);
                        this.e(8, -1);
                        this.bm[65] = 220;
                        this.bm[41] = (short)((this.b[2][0][0][0].length() + 1) / (this.bm[65] / game.b.a(game.j.as[0])));
                        this.bm[42] = 295;
                        this.bm[43] = 25;
                        break;
                    }
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                    this.f = false;
                    this.ac();
                    break;
                }
                case 22: {
                    this.cw[3] = 10;
                    this.cw[2] = this.cw[2] + 1;
                    switch (this.cw[2]) {
                        case 1: {
                            for (int k = 1; k <= 19; ++k) {
                                this.d(k);
                                this.y(k);
                            }
                            this.c = null;
                            this.H();
                            this.ab();
                            break;
                        }
                        case 5: {
                            int n;
                            this.bm[17] = (short)(this.aK[0] / 240 + this.bq[this.q][this.L * 3 + 1]);
                            this.bm[18] = (short)(this.aK[1] / 320 + this.bq[this.q][this.L * 3 + 2]);
                            this.L = this.bs;
                            this.aU = this.bq[this.q][this.L * 3];
                            this.ci = this.b(this.q, this.aU);
                            this.ah[this.by] = null;
                            this.by = this.L(this.ci);
                            this.ah[this.by] = game.b.b(d.d("/data/data/mapmodule_" + this.by + ".mid"));
                            this.bj[this.q][this.L] = 1;
                            int n2 = 0;
                            for (n = 0; n < this.bj[this.q].length; ++n) {
                                if (this.bj[this.q][n] != 1) continue;
                                ++n2;
                            }
                            this.bO[this.q] = (byte)(n2 * 100 / this.bj[this.q].length);
                            if (this.c() >= 900) {
                                this.a(122);
                            }
                            if (this.c() >= 500) {
                                this.a(113);
                            }
                            this.J(this.aU);
                            if (this.bU != this.q) {
                                this.bU = this.q;
                                this.bm[87] = 0;
                                this.bm[88] = 0;
                            } else {
                                this.bm[87] = 3;
                                this.bm[88] = 0;
                            }
                            this.ay.T = new int[46][12];
                            if (game.a.ad[this.ay.q].length > 0) {
                                this.ay.n = new int[10][][];
                                for (n = 0; n < this.ay.n.length; ++n) {
                                    this.ay.n[n] = new int[game.a.ad[this.ay.q][this.aF[n][7]][6]][15];
                                }
                            }
                            this.ay.c = new byte[10];
                            this.bd = new game.a();
                            this.bd.T = new int[10][12];
                            this.V();
                            this.ab();
                            this.b(0, this.F, this.d, 0);
                            game.a.a(this.ay, D[0], D[1]);
                            break;
                        }
                        case 6: {
                            this.aK = this.j(this.ay);
                            this.a();
                            this.bm[22] = (short)d.a((byte)this.L, this.aH[0][this.q]);
                            if (this.bm[22] < 0 || this.bm[22] >= 0 && this.bV[this.q][this.bm[22]][6] == 0) {
                                this.Z();
                                if (this.bm[22] >= 0 && this.bV[this.q][this.bm[22]][1] == 15 && this.bV[this.q][this.bm[22]][0] == 0) {
                                    game.c.a(this.c[0], (byte)13);
                                }
                            }
                            if (this.bm[22] >= 0 && this.bV[this.q][this.bm[22]][6] == 0) {
                                this.bm[71] = 1;
                                this.bm[45] = 0;
                            }
                            this.g();
                            this.y();
                            this.E();
                            this.bm[35] = 0;
                            this.bm[1] = 0;
                            this.bm[55] = 0;
                            this.bm[21] = 0;
                            this.bm[19] = 0;
                            this.bm[20] = 0;
                            this.bm[24] = 0;
                            this.bm[61] = 0;
                            this.bm[76] = 0;
                            this.bm[49] = 0;
                            this.bm[62] = 5;
                            this.cb = 0;
                            this.X = null;
                            this.X = this.a(this.L, this.a[this.q]);
                            this.P = this.b(this.L, this.bJ[this.q]);
                            break;
                        }
                        case 7: {
                            this.H();
                        }
                    }
                    if (this.cw[2] < this.cw[3]) break;
                    this.cw[2] = 0;
                    this.bm[17] = (short)(this.aK[0] / 240 + this.bq[this.q][this.L * 3 + 1]);
                    this.bm[18] = (short)(this.aK[1] / 320 + this.bq[this.q][this.L * 3 + 2]);
                    this.f = false;
                    d.a(this.bn, 7);
                    break;
                }
                case 26: {
                    this.cw[3] = 2;
                    this.cw[2] = this.cw[2] + 1;
                    switch (this.cw[2]) {
                        case 1: {
                            int n;
                            int n3;
                            for (n3 = 1; n3 <= 19; ++n3) {
                                this.d(n3);
                                this.y(n3);
                            }
                            this.c = null;
                            this.H();
                            this.aU = this.bq[this.q][this.L * 3];
                            this.ci = this.b(this.q, this.aU);
                            this.ah[this.by] = null;
                            this.by = this.L(this.ci);
                            this.ah[this.by] = game.b.b(d.d("/data/data/mapmodule_" + this.by + ".mid"));
                            this.bj[this.q][this.L] = 1;
                            n3 = 0;
                            for (n = 0; n < this.bj[this.q].length; ++n) {
                                if (this.bj[this.q][n] != 1) continue;
                                ++n3;
                            }
                            this.bO[this.q] = (byte)(n3 * 100 / this.bj[this.q].length);
                            if (this.c() >= 900) {
                                this.a(122);
                            }
                            if (this.c() >= 500) {
                                this.a(113);
                            }
                            this.J(this.aU);
                            if (this.bU != this.q) {
                                this.v(this.bU);
                                this.H(this.q);
                                this.bU = this.q;
                                this.bm[87] = 0;
                                this.bm[88] = 0;
                                this.ac();
                            } else {
                                this.bm[87] = 3;
                                this.bm[88] = 0;
                            }
                            this.ay.T = new int[46][12];
                            if (game.a.ad[this.ay.q].length > 0) {
                                this.ay.n = new int[10][][];
                                for (n = 0; n < this.ay.n.length; ++n) {
                                    this.ay.n[n] = new int[game.a.ad[this.ay.q][this.aF[n][7]][6]][15];
                                }
                            }
                            this.ay.c = new byte[10];
                            this.bd = new game.a();
                            this.bd.T = new int[10][12];
                            this.b(0, this.F, this.d, 0);
                            if (this.q == 1) {
                                game.a.a(this.ay, this.bK * 2, this.af * 3);
                            } else {
                                game.a.a(this.ay, this.bK * 6, this.af * 5);
                            }
                            this.ay.U = 1;
                            this.aK = this.j(this.ay);
                            this.a();
                            this.V();
                            this.g();
                            this.y();
                            this.E();
                            if (this.a[this.q].length > 0) {
                                for (n = 0; n < this.a[this.q].length; ++n) {
                                    for (int k = 1; k < this.a[this.q][n].length; ++k) {
                                        if (this.a[this.q][n][k][2] >= 14 && this.a[this.q][n][k][2] <= 30) continue;
                                        this.a[this.q][n][k][3] = 0;
                                    }
                                }
                            }
                            this.X = null;
                            this.X = this.a(this.L, this.a[this.q]);
                            this.P = this.b(this.L, this.bJ[this.q]);
                            this.bm[35] = 0;
                            this.bm[86] = 0;
                            this.bm[1] = 0;
                            this.bm[55] = 0;
                            this.bm[21] = 0;
                            this.bm[19] = 0;
                            this.bm[20] = 0;
                            this.bm[24] = 0;
                            this.bm[49] = 0;
                        }
                    }
                    if (this.cw[2] < this.cw[3]) break;
                    this.cw[2] = 0;
                    this.f = false;
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                    this.t();
                    this.b(this.bd, 9, 0, this.bm[13], this.bm[14], 1, 39, 1, 1, -1, 0, 1);
                    break;
                }
                case 4: {
                    switch (this.u[0]) {
                        case 12: {
                            break block0;
                        }
                        case 18: {
                            this.bm[42] = (short)(this.bm[42] - 1);
                            if (this.bm[42] + this.bm[41] * this.bm[43] <= 80) {
                                this.bm[65] = 220;
                                this.bm[41] = (short)((this.b[2][0][0][0].length() + 1) / (this.bm[65] / game.b.a(game.j.as[0])));
                                this.bm[42] = 295;
                                this.bm[43] = 25;
                                break block0;
                            }
                            break block98;
                        }
                        case 21: {
                            this.bm[42] = (short)(this.bm[42] - 1);
                            if (this.bm[42] + this.bm[41] * this.bm[43] <= 80) {
                                this.bm[65] = 220;
                                this.bm[41] = (short)((this.b[2][0][1][0].length() + 1) / (this.bm[65] / game.b.a(game.j.as[0])));
                                this.bm[42] = 295;
                                this.bm[43] = 25;
                                break block0;
                            }
                            break block98;
                        }
                        case 27: {
                            this.bm[42] = (short)(this.bm[42] - 2);
                            if (this.bm[42] + this.bm[41] * this.bm[43] <= 80) {
                                this.ab();
                                this.f = false;
                                d.a(this.bn, 7);
                                d.e(this.u, 0);
                                break block0;
                            }
                            break block98;
                        }
                        case 11: {
                            this.N();
                        }
                    }
                }
            }
        }
        if (this.bm[47] == 1 && this.bm[68] > 0) {
            this.bm[68] = (short)(this.bm[68] - 1);
        }
        this.ac.a(this.cw);
    }

    private void K() {
        if (this.bm[21] >= 0) {
            if (this.bm[21] == 0) {
                this.bm[19] = 0;
                this.bm[20] = 0;
            } else {
                this.bm[20] = (short)(this.bm[21] % 2 == 1 ? -4 : 4);
                this.bm[21] = (short)(this.bm[21] - 1);
            }
        }
        this.a((i)this.ay);
        this.a(this.X);
        this.a(this.P);
        this.a(this.P, this.bJ[this.q]);
        this.b(this.X, this.a[this.q]);
        this.c(this.ay, 0, 0, 3, 3);
        this.D();
        this.h(this.ay);
        this.a((game.a)this.ay, null);
        this.c(this.ay);
        this.a((game.a)this.ay, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
        this.b(this.ay);
        this.e(this.ay);
        if (!this.ay.k[0]) {
            this.N();
        }
        this.Q();
        this.F();
        this.h();
        this.B();
        if (this.bm[22] < 0 || this.bm[22] >= 0 && (this.c == null || this.c != null && !this.c[0].K)) {
            if (this.bm[22] >= 0) {
                if (this.bm[62] <= 0) {
                    this.e(this.L);
                } else {
                    this.bm[62] = (short)(this.bm[62] - 1);
                }
            } else {
                this.e(this.L);
            }
        }
        this.z();
        if (!this.ay.k[9]) {
            if (this.ay.r[0] != 15) {
                this.ay.o = (short)(this.ay.o & 3);
            }
            this.ay.k[16] = false;
        }
    }

    private void T() {
        switch (this.u[0]) {
            case 14: {
                if (this.ba != 0) break;
                this.cw[2] = this.cw[2] + 1;
                this.cw[3] = 30;
                switch (this.cw[2]) {
                    case 2: {
                        this.P();
                    }
                }
                if (this.cw[2] < this.cw[3]) break;
                this.cw[2] = 0;
                this.ba = 1;
                this.ax[10] = this.ax[10] + 1;
                this.ax[10] = this.ax[10] >= this.U() ? 0 : this.ax[10];
                break;
            }
            case 22: {
                this.bm[64] = (short)(this.bm[64] - 1);
                if (this.bm[64] > 0) break;
                this.aV[0] = 0;
                if (this.q == 9 && this.ax[18] == 0) {
                    this.ax[18] = 1;
                    d.a(this.bn, 4);
                    d.e(this.u, 21);
                    this.bm[65] = 220;
                    this.bm[41] = (short)((this.b[2][0][1][0].length() + 1) / (this.bm[65] / game.b.a(game.j.as[0])));
                    this.bm[42] = 295;
                    this.bm[43] = 25;
                    this.e(8, -1);
                    break;
                }
                this.f = false;
                d.a(this.bn, 7);
                d.e(this.u, 0);
            }
        }
    }

    private void z() {
        if (this.ay.k[0]) {
            this.ay.k[0] = false;
            this.bm[58] = 1;
            this.bm[59] = 3;
            cr = 300;
            this.ab();
        }
        if (this.bm[58] != 0) {
            if (this.bm[58] == 1) {
                if (this.bm[59] <= 0) {
                    this.bm[58] = 2;
                    this.bm[59] = 4;
                } else {
                    this.bm[59] = (short)(this.bm[59] - 1);
                }
            } else if (this.bm[58] == 2) {
                if (this.bm[59] <= 0) {
                    this.bm[58] = 3;
                    cr = 80;
                    this.bm[59] = 5;
                    this.e(9, 1);
                } else {
                    this.bm[59] = (short)(this.bm[59] - 1);
                }
                this.R[0] = this.bm[59] > 0 ? (int)((short)(256 - this.bm[59] * 64)) : 255;
                this.R[1] = 0;
                this.bm[72] = 1;
            } else if (this.bm[58] == 3) {
                if (this.bm[59] <= 0) {
                    this.ab();
                    this.bm[58] = 0;
                    this.bm[72] = 0;
                    this.bm[61] = 0;
                    this.bm[76] = 0;
                    cr = 80;
                    d.a(this.bn, 7);
                    d.e(this.u, 19);
                    this.f = true;
                    if (this.aM[0][3] >= this.aM[0][2]) {
                        this.K(3);
                    }
                } else {
                    this.bm[59] = (short)(this.bm[59] - 1);
                }
                this.R[0] = 255;
                this.R[1] = 0;
                this.bm[72] = 1;
            }
        }
        if (this.bm[58] > 0) {
            this.ay.af[0] = 5;
            this.ay.ao = 0;
        }
    }

    private void N() {
        int n;
        this.d();
        for (n = 0; n < this.cz.length; ++n) {
            this.cz[n] = 0;
        }
        for (n = 0; n < 3; ++n) {
            if (this.ao[this.ay.i][3 + n * 2] <= 0) continue;
            int n2 = this.ao[this.ay.i][3 + n * 2 + 1] / 3;
            this.cz[n2] = this.cz[n2] + this.K[this.ao[this.ay.i][3 + n * 2 + 1]][1];
        }
        if (this.bm[6] > 0) {
            this.bm[6] = (short)(this.bm[6] - 1);
        }
        if ((this.an[0] = this.an[0] - 1) <= 0) {
            this.an[0] = this.an[1];
            this.ay.v[0] = this.ay.v[0] + 1;
            if (this.ay.v[0] >= this.ay.v[1]) {
                this.ay.v[0] = this.ay.v[1];
            }
        }
        this.ay.N[1] = this.ay.b[0] < this.ay.b[1] * 30 / 100 ? (this.ay.N[0] + this.ch[this.ay.i] * this.bP[this.ay.al] * (100 + this.cz[0]) / 10000) * (100 + this.cz[2]) / 100 : this.ay.N[0] + this.ch[this.ay.i] * this.bP[this.ay.al] * (100 + this.cz[0]) / 10000;
        if (this.ay.N[1] >= 500) {
            this.a(105);
        }
        this.ay.R[1] = this.ay.R[0];
        if (this.ay.R[1] >= 300) {
            this.a(108);
        }
        if (this.ay.v[1] >= 500) {
            this.a(109);
        }
        if (this.ay.b[1] >= 1000) {
            this.a(110);
        }
        if (this.ay.a[0] >= 45) {
            this.a(127);
        }
        if (this.ay.a[0] >= 30) {
            this.a(112);
        }
        if (this.ay.a[0] >= 10) {
            this.a(104);
        }
        if (this.ay.a[0] >= 7) {
            this.a(103);
        }
        if (this.ay.a[0] >= 5) {
            this.a(102);
        }
        if (this.ay.au[0] >= 10000) {
            this.a(111);
        }
        if (this.av[0] > 0) {
            this.av[0] = this.av[0] - 1;
        } else if (this.ay.J[0] < this.ay.J[1]) {
            this.ay.J[0] = (short)(this.ay.J[0] + 1);
        }
        if (this.ay.b[0] <= this.ay.b[1] / 4) {
            this.bm[69] = (short)this.M();
            if (this.bm[61] == 0 && this.bm[69] >= 0) {
                this.b(this.bd, 6, 23 + (this.bm[69] - 3), 0, 0, 1, 28, 1, 1, -1, 1, 1);
                this.bm[61] = 1;
            }
        }
        if (this.ay.v[0] <= this.ay.v[1] / 5) {
            this.bm[75] = (short)this.Y();
            if (this.bm[76] == 0 && this.bm[75] >= 0) {
                this.b(this.bd, 8, 26, 0, 0, 1, 28, 1, 1, -1, 1, 1);
                this.bm[76] = 1;
            }
        }
        if (this.u[0] == 0 && this.bm[71] == 1) {
            this.bm[71] = 0;
            this.t();
            this.b(this.E, 7, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.s();
            this.f = true;
            d.e(this.u, 25);
        }
        if (this.bm[70] > 0) {
            this.bm[70] = (short)(this.bm[70] - 15);
            if (this.bm[70] <= 0) {
                this.bm[72] = 0;
                this.q = this.cv;
                this.L = 0;
                this.ay.S = true;
                this.bm[70] = 0;
                if (this.bV[this.q].length > 0) {
                    for (n = 0; n < this.bV[this.q].length; ++n) {
                        this.bV[this.q][n][6] = 0;
                    }
                }
                d.a(this.bn, 26);
            } else {
                this.R[1] = 0xFFFFFF;
                this.R[0] = 256 - this.bm[70];
                this.bm[72] = 1;
            }
        }
        if (this.O() >= 80) {
            this.a(129);
        }
        if (this.bm[55] > 0) {
            this.bm[55] = (short)(this.bm[55] - 1);
        }
    }

    private int M() {
        int n = -1;
        if (this.bA[3] > 0) {
            n = 3;
        } else if (this.bA[4] > 0) {
            n = 4;
        } else if (this.bA[5] > 0) {
            n = 5;
        }
        return n;
    }

    private int Y() {
        int n = -1;
        if (this.bA[6] > 0) {
            n = 6;
        }
        return n;
    }

    private void Q() {
        if (this.c != null) {
            for (int k = 0; k < this.c.length; ++k) {
                if (this.c[k] == null) continue;
                if (this.c[k].V == 0) {
                    this.a((i)this.c[k]);
                }
                if (this.c[k].ag >= 1 && this.c[k].ag <= 10) {
                    this.b(this.c[k]);
                } else if (this.c[k].ag >= 11 && this.c[k].ag <= 19) {
                    this.a(this.c[k]);
                }
                if (this.c[k].ar[0] > 0 && this.c[k].X == 0) {
                    this.d((game.a)this.c[k]);
                }
                this.a((game.a)this.c[k], this.aK[0], this.aK[1]);
                this.b((game.a)this.c[k]);
                this.e(this.c[k]);
                this.d(this.c[k]);
                this.c(this.c[k]);
            }
        }
    }

    private void D() {
        if (this.ay.k[5]) {
            switch (this.ay.r[0]) {
                case 1: 
                case 2: {
                    if ((this.ay.o & 0xC) == 0) {
                        this.b(this.ay, 3, 0);
                        this.ay.ac = true;
                        break;
                    }
                    if (this.ay.r[0] == 1) break;
                    if (this.ay.U == 2 && (this.ay.o & 0xC) == 8 || this.ay.U == 1 && (this.ay.o & 0xC) == 4) {
                        this.b(this.ay, 1, 0);
                        this.ay.ac = true;
                    } else {
                        this.b(this.ay, 2, 0);
                    }
                    if ((this.ay.o & 0xC) == 4) {
                        this.ay.U = (byte)2;
                        break;
                    }
                    if ((this.ay.o & 0xC) != 8) break;
                    this.ay.U = 1;
                }
            }
        } else {
            this.ay.o = (short)(this.ay.o | 2);
            switch (this.ay.r[0]) {
                case 0: 
                case 2: 
                case 7: 
                case 15: 
                case 17: {
                    this.b(this.ay, 9, 0);
                    this.ay.ac = true;
                    this.ay.a(this.bv[1]);
                    break;
                }
                case 9: {
                    this.b(this.ay, 9, 0);
                    this.ay.ac = true;
                }
            }
        }
        if (!(this.ay.k[9] || (this.ay.o & 0xC) != 4 && (this.ay.o & 0xC) != 8)) {
            if (this.ay.k[5] && this.ay.r[0] != 15 && ((this.ay.o & 0xC) == 4 && this.ay.U == 1 || (this.ay.o & 0xC) == 8 && this.ay.U == 2) && (this.ay.r[0] == 11 || this.ay.r[0] == 12 || this.ay.r[0] == 13)) {
                this.b(this.ay, 15, 0);
                this.ay.ac = true;
                this.bm[0] = 0;
            } else if (this.ay.r[0] == 0 || this.ay.r[0] == 2 || this.ay.r[0] == 3 || this.ay.r[0] == 7 || this.ay.r[0] == 17 || this.ay.r[0] == 8 || this.ay.r[0] == 9 || this.ay.r[0] == 10 || this.ay.r[0] == 12 && this.ay.k[5] && (this.ay.o & 0xC) != 0) {
                switch (this.ay.r[0]) {
                    case 0: 
                    case 2: 
                    case 3: 
                    case 7: 
                    case 12: 
                    case 17: {
                        this.ay.n[0][0][0] = 0;
                        if (this.ay.U == 2 && (this.ay.o & 0xC) == 8 || this.ay.U == 1 && (this.ay.o & 0xC) == 4) {
                            this.b(this.ay, 1, 0);
                            this.ay.ac = true;
                            break;
                        }
                        this.b(this.ay, 2, 0);
                        if (this.ay.af[0] == 1) break;
                        this.ay.af[0] = 1;
                        this.ay.ao = 0;
                    }
                }
                if ((this.ay.o & 0xC) == 4) {
                    this.ay.U = (byte)2;
                } else if ((this.ay.o & 0xC) == 8) {
                    this.ay.U = 1;
                }
            }
        }
        if (this.ay.k[14]) {
            if ((this.ay.ak & 0xC) == 4) {
                this.ay.o = (short)(this.ay.o & 3);
                this.ay.o = (short)(this.ay.o | 4);
                this.ay.U = (byte)2;
            } else if ((this.ay.ak & 0xC) == 8) {
                this.ay.o = (short)(this.ay.o & 3);
                this.ay.o = (short)(this.ay.o | 8);
                this.ay.U = 1;
            }
        }
        if (this.ay.k[16]) {
            if (this.ay.r[0] == 17) {
                h.a(this.ay, this.ay.I, this.ay.G - 2);
            } else if (this.ay.r[0] == 0 || this.ay.r[0] == 3 || this.ay.r[0] == 10 || this.ay.r[0] == 12 || this.ay.r[0] == 11 || this.ay.r[0] == 13) {
                this.b(this.ay, 17, 0);
                this.a((i)this.ay, 7, 1);
                this.ay.ac = true;
            }
        }
    }

    protected void G() {
        if (this.bB != null) {
            for (int k = 0; k < this.bB.length; ++k) {
                for (int i2 = 0; i2 < this.bB[k].length; ++i2) {
                    for (int i3 = 0; i3 < this.bB[k][i2].length; ++i3) {
                        this.bB[k][i2][i3] = -1;
                    }
                }
            }
        } else {
            new Throwable("\"mapReset();\"map is NULL!").printStackTrace();
        }
    }

    private boolean a(game.a a2, game.a a3) {
        int n = a2.q;
        int n2 = this.ck[a2.ag][a2.af[0]].length;
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        if (a2.C - 1 >= 0) {
            --a2.C;
            return true;
        }
        if (!a2.ac && !a2.y && this.ck[a2.ag][a2.af[0]][n2 - 1][0] > 0) {
            return true;
        }
        if (a2.r[0] >= 0) {
            if (a2.E > this.aZ[n][a2.r[0]].length || a2.E < 0) {
                return true;
            }
            do {
                if (this.aZ[n][a2.r[0]][a2.E] != -2) {
                    if (this.aZ[n][a2.r[0]][a2.E] == -12) {
                        ++a2.E;
                    } else if (this.aZ[n][a2.r[0]][a2.E] == -11) {
                        ++a2.E;
                    } else if (this.aZ[n][a2.r[0]][a2.E] == -3) {
                        if (a2.U != (a3.I > a2.I ? (byte)1 : 2)) {
                            a2.U = (byte)(a3.I > a2.I ? 1 : 2);
                        }
                        ++a2.E;
                    } else if (this.aZ[n][a2.r[0]][a2.E] == -58) {
                        a2.U = (byte)(a2.I > this.bm[30] ? 2 : 1);
                        ++a2.E;
                    } else if (this.aZ[n][a2.r[0]][a2.E] == -23) {
                        a2.aq = (byte)this.aZ[n][a2.r[0]][a2.E + 1];
                        a2.E += 2;
                    } else if (this.aZ[n][a2.r[0]][a2.E] == -16) {
                        if (a2.j > -a2.l) break;
                        ++a2.E;
                    } else if (this.aZ[n][a2.r[0]][a2.E] == -18) {
                        if (!a2.k[5]) break;
                        if (a2.k[15]) {
                            a2.k[15] = false;
                            a2.E += 3;
                        } else {
                            a2.E = a2.o == 0 ? ++a2.E : (a2.E += 5);
                        }
                    } else {
                        int n3;
                        if (this.aZ[n][a2.r[0]][a2.E] == -10) {
                            a2.C = this.aZ[n][a2.r[0]][++a2.E];
                            ++a2.E;
                            break;
                        }
                        if (this.aZ[n][a2.r[0]][a2.E] == -13) {
                            a2.ar[0] = this.aZ[n][a2.r[0]][a2.E + 1] >= 0 ? (int)((byte)this.aZ[n][a2.r[0]][a2.E + 1]) : (int)((byte)this.J);
                            a2.E += 2;
                        } else if (this.aZ[n][a2.r[0]][a2.E] == -53) {
                            this.J = d.i(this.aZ[n][a2.r[0]][a2.E + 2] - this.aZ[n][a2.r[0]][a2.E + 1] + 1) + this.aZ[n][a2.r[0]][a2.E + 1];
                            a2.E += 3;
                        } else if (this.aZ[n][a2.r[0]][a2.E] == -54) {
                            a2.ai = this.aZ[n][a2.r[0]][a2.E + 1] >= 0 ? this.aZ[n][a2.r[0]][a2.E + 1] : (byte)(d.i(2) == 0 ? 1 : (byte)this.J);
                            a2.E += 2;
                        } else if (this.aZ[n][a2.r[0]][a2.E] == -56) {
                            this.J = this.aZ[n][a2.r[0]][a2.E + 1] + (this.bm[24] + 1) * this.aZ[n][a2.r[0]][a2.E + 2];
                            a2.E += 3;
                        } else if (this.aZ[n][a2.r[0]][a2.E] == -9) {
                            int[] nArray;
                            l = a3.I - a2.I;
                            l2 = a3.G - a2.G;
                            a2.P = a2.I;
                            a2.z = a2.G;
                            l3 = this.aZ[n][a2.r[0]][a2.E + 2];
                            int n4 = 0;
                            n3 = 0;
                            if (this.aZ[n][a2.r[0]][a2.E + 1] == 1) {
                                nArray = this.a(l, l2, l3);
                                n4 = nArray[0];
                                n3 = nArray[1];
                            } else if (this.aZ[n][a2.r[0]][a2.E + 1] == 2) {
                                n4 = this.aZ[n][a2.r[0]][a2.E + 2];
                                n3 = 0;
                            } else if (this.aZ[n][a2.r[0]][a2.E + 1] == 3) {
                                n4 = 0;
                                n3 = this.aZ[n][a2.r[0]][a2.E + 2];
                            } else if (this.aZ[n][a2.r[0]][a2.E + 1] == 4) {
                                nArray = this.a(l, 0L, l3);
                                n4 = nArray[0];
                                n3 = nArray[1];
                            } else if (this.aZ[n][a2.r[0]][a2.E + 1] == 5) {
                                nArray = this.a(0L, l2, l3);
                                n4 = nArray[0];
                                n3 = nArray[1];
                            } else if (this.aZ[n][a2.r[0]][a2.E + 1] == 6) {
                                n4 = this.bm[25] == 1 ? this.aZ[n][a2.r[0]][a2.E + 2] : -this.aZ[n][a2.r[0]][a2.E + 2];
                                n3 = 0;
                            } else if (this.aZ[n][a2.r[0]][a2.E + 1] == 7) {
                                l = this.bm[30] - a2.I;
                                l2 = this.bm[31] - a2.G;
                                a2.P = a2.I;
                                a2.z = a2.G;
                                nArray = this.a(l, l2, l3);
                                n4 = nArray[0];
                                n3 = nArray[1];
                            }
                            if ((this.aZ[n][a2.r[0]][a2.E + 1] == 1 || this.aZ[n][a2.r[0]][a2.E + 1] == 2 || this.aZ[n][a2.r[0]][a2.E + 1] == 4 || this.aZ[n][a2.r[0]][a2.E + 1] == 6) && n4 == 0) {
                                n4 = game.b.i(30);
                            }
                            if ((this.aZ[n][a2.r[0]][a2.E + 1] == 1 || this.aZ[n][a2.r[0]][a2.E + 1] == 3 || this.aZ[n][a2.r[0]][a2.E + 1] == 5) && n3 == 0) {
                                n3 = game.b.i(40);
                            }
                            game.a.a(a2.aa, a2.I, a2.G, a2.I + n4, a2.G + n3);
                            a2.E += 3;
                        } else if (this.aZ[n][a2.r[0]][a2.E] == -6) {
                            a2.X = (byte)this.aZ[n][a2.r[0]][a2.E + 1];
                            a2.E += 2;
                        } else {
                            short s;
                            int n5;
                            if (this.aZ[n][a2.r[0]][a2.E] == -24) {
                                int n6 = -1;
                                switch (a2.r[0]) {
                                    case 11: {
                                        n6 = this.aF[this.ay.d][1];
                                        break;
                                    }
                                    case 12: {
                                        n6 = this.aF[this.ay.d][2];
                                        break;
                                    }
                                    case 16: {
                                        n6 = this.aF[this.ay.d][3];
                                        break;
                                    }
                                    case 13: {
                                        n6 = this.aF[this.ay.d][6];
                                    }
                                }
                                this.a((i)a2, n6, 1);
                                ++a2.E;
                                break;
                            }
                            if (this.aZ[n][a2.r[0]][a2.E] == -27) {
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -28) {
                                if (a2.r[0] == 11 && ((a2.o & 0xC) == 4 || (a2.o & 0xC) == 8) && a2.k[5]) {
                                    a2.n[0][0][0] = 0;
                                    if (a2.U == 2 && (a2.o & 0xC) == 8 || a2.U == 1 && (a2.o & 0xC) == 4) {
                                        this.b(a2, 1, 0);
                                    } else {
                                        this.b(a2, 2, 0);
                                    }
                                    if ((a2.o & 0xC) == 4) {
                                        a2.U = (byte)2;
                                    } else if ((a2.o & 0xC) == 8) {
                                        a2.U = 1;
                                    }
                                } else {
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 1], 0);
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -29) {
                                ++a2.E;
                                byte by = this.aF[this.ay.d][0];
                                if (a2.k[10] && (by == 0 || by == 1 || by == 3)) {
                                    a2.k[10] = false;
                                    a2.E += 4;
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -30) {
                                if (a2.r[0] == 12 && this.bm[56] == 1) {
                                    this.bm[56] = 0;
                                    this.b(a2, 11, 0);
                                    a2.ac = true;
                                } else {
                                    ++a2.E;
                                    if (a2.k[5]) {
                                        ++a2.E;
                                    }
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E], 0);
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -25) {
                                if (this.bm[0] == 0 && ((this.m(52) == 1 || this.m(-3) == 1) && this.ay.U == 1 || (this.m(54) == 1 || this.m(-4) == 1) && this.ay.U == 2)) {
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 1], 0);
                                    a2.ac = true;
                                    this.bm[0] = (short)(this.bm[0] + 1);
                                } else {
                                    this.bm[0] = 0;
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 2], 0);
                                    a2.ac = true;
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -26) {
                                if (this.m(53) == 1 || this.m(-5) == 1) {
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 1], 0);
                                    a2.ac = true;
                                } else {
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 2], 0);
                                    a2.ac = true;
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -52) {
                                if (this.m(57) == 1 && (this.bm[6] > 0 || this.bm[6] == 0 && this.ay.v[0] - this.c(this.aF[this.ay.d][11]) >= 0)) {
                                    if (this.bm[6] == 0) {
                                        this.ay.v[0] = this.ay.v[0] - this.c(this.aF[this.ay.d][11]);
                                    }
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 1], 0);
                                    a2.ac = true;
                                } else {
                                    this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E + 2], 0);
                                    a2.ac = true;
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -31) {
                                ++a2.E;
                                if ((this.ay.o & 0xC) != 8 && (this.ay.o & 0xC) != 4) {
                                    ++a2.E;
                                }
                                this.b(a2, (int)this.aZ[n][a2.r[0]][a2.E], 0);
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -32) {
                                this.bm[21] = this.aZ[n][a2.r[0]][a2.E + 1];
                                a2.E += 2;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -33) {
                                a2.ar[0] = a2.k[4] ? (int)((byte)this.aZ[n][a2.r[0]][a2.E + 1]) : (int)((byte)this.aZ[n][a2.r[0]][a2.E + 2]);
                                a2.E += 3;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -35) {
                                a2.U = (byte)this.aZ[n][a2.r[0]][a2.E + 1];
                                a2.E += 2;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -36) {
                                if (a2.o != 0 || a2.X != -1) break;
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -37) {
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -19) {
                                a2.ac = true;
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -38) {
                                if (a2.k[9]) break;
                                a2.E = a2.k[5] ? ++a2.E : (a2.E += 3);
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -39) {
                                int n7 = 0;
                                n3 = 0;
                                n5 = this.aZ[n][a2.r[0]][a2.E + 2];
                                s = this.aZ[n][a2.r[0]][a2.E + 3];
                                a2.P = a2.I;
                                a2.z = a2.G;
                                int n8 = 0;
                                n8 = this.aZ[n][a2.r[0]][a2.E + 1] >= 0 ? this.aZ[n][a2.r[0]][a2.E + 1] : this.J;
                                switch (n8) {
                                    case 0: {
                                        n7 = this.ay.U == 1 ? a3.I + n5 : a3.I - n5;
                                        n3 = a3.G;
                                        break;
                                    }
                                    case 1: {
                                        n7 = this.ay.U == 1 ? a3.I - n5 : a3.I + n5;
                                        n3 = a3.G;
                                        break;
                                    }
                                    case 2: {
                                        n7 = this.ay.U == 1 ? a3.I + n5 : a3.I - n5;
                                        n3 = a3.G + s;
                                        break;
                                    }
                                    case 3: {
                                        n7 = this.ay.U == 1 ? a3.I - n5 : a3.I + n5;
                                        n3 = a3.G + s;
                                        break;
                                    }
                                    case 4: {
                                        n7 = this.ay.U == 1 ? a3.I + n5 : a3.I - n5;
                                        n3 = a2.G;
                                        break;
                                    }
                                    case 5: {
                                        n7 = this.ay.U == 1 ? a3.I - n5 : a3.I + n5;
                                        n3 = a2.G;
                                    }
                                }
                                a2.U = (byte)(a2.I < n7 ? 1 : 2);
                                game.a.a(a2.aa, a2.I, a2.G, n7, n3);
                                a2.E += 4;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -55) {
                                int n9 = 0;
                                n3 = 0;
                                n5 = this.aZ[n][a2.r[0]][a2.E + 1];
                                s = this.aZ[n][a2.r[0]][a2.E + 2];
                                a2.P = a2.I;
                                a2.z = a2.G;
                                n9 = a3.I > a2.I ? a2.I - n5 : a2.I + n5;
                                n3 = a3.G > a2.G ? a2.G - s : a2.G + s;
                                game.a.a(a2.aa, a2.I, a2.G, n9, n3);
                                a2.E += 3;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -40) {
                                a2.af[0] = 0;
                                a2.ao = 0;
                                a2.C = this.bV[this.q][this.bm[22]][2] - this.bm[24] * this.bV[this.q][this.bm[22]][3];
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -41) {
                                if (a2.C > 0) break;
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -42) {
                                this.bm[30] = (short)a3.I;
                                this.bm[31] = (short)a3.G;
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -43) {
                                if (this.aZ[n][a2.r[0]][a2.E + 1] >= 0) {
                                    switch (this.aZ[n][a2.r[0]][a2.E + 1]) {
                                        case 0: {
                                            a2.I = this.bm[30];
                                            a2.G = this.bm[31];
                                            break;
                                        }
                                        case 3: {
                                            a2.I = this.bm[30] + d.s(100);
                                            a2.G = this.bm[31] + d.i(60);
                                        }
                                    }
                                } else {
                                    switch (this.J) {
                                        case 1: {
                                            a2.I = this.bm[30] + game.j.h[this.bm[26]] * this.aZ[n][a2.r[0]][a2.E + 2];
                                            a2.G = this.bm[31];
                                            break;
                                        }
                                        case 2: {
                                            a2.I = this.bm[30] - game.j.h[this.bm[26]] * this.aZ[n][a2.r[0]][a2.E + 2];
                                            a2.G = this.bm[31];
                                        }
                                    }
                                }
                                a2.E += 3;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -44) {
                                int n10 = 0;
                                n3 = 0;
                                n5 = this.aZ[n][a2.r[0]][a2.E + 2];
                                s = this.aZ[n][a2.r[0]][a2.E + 3];
                                a2.P = a2.I;
                                a2.z = a2.G;
                                switch (this.aZ[n][a2.r[0]][a2.E + 1]) {
                                    case 0: {
                                        n10 = a2.U == 1 ? a3.I - n5 : a3.I + n5;
                                        n3 = a3.G;
                                        break;
                                    }
                                    case 2: {
                                        n10 = a2.U == 1 ? a2.I + n5 : a2.I - n5;
                                        n3 = a2.G;
                                    }
                                }
                                game.a.a(a2.aa, a2.I, a2.G, n10, n3);
                                a2.E += 4;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -45) {
                                this.bm[25] = a2.U;
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -57) {
                                this.bm[26] = a3.U;
                                ++a2.E;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -46) {
                                if (this.ay.k[16]) {
                                    this.b(a2, 17, 6);
                                } else {
                                    ++a2.E;
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -47) {
                                int n11 = 0;
                                n3 = 0;
                                n5 = a2.ar[0] * (this.bV[this.q][this.bm[22]][2] - this.bm[24] * this.bV[this.q][this.bm[22]][3]);
                                a2.P = a2.I;
                                a2.z = a2.G;
                                switch (this.aZ[n][a2.r[0]][a2.E + 1]) {
                                    case 0: {
                                        n11 = a2.U == 1 ? a2.I + n5 : a2.I - n5;
                                        n3 = a2.G;
                                        break;
                                    }
                                    case 1: {
                                        n11 = a2.U == 1 ? a2.I - n5 : a2.I + n5;
                                        n3 = a2.G;
                                    }
                                }
                                game.a.a(a2.aa, a2.I, a2.G, n11, n3);
                                a2.E += 2;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -48) {
                                int[] nArray = new int[]{12, 10, 12, 21};
                                n3 = nArray[this.bm[24] % 2 * 2] * this.bK;
                                n5 = nArray[this.bm[24] % 2 * 2 + 1] * this.af;
                                if (a2.G == n5) {
                                    a2.E += 8;
                                } else {
                                    a2.P = a2.I;
                                    a2.z = a2.G;
                                    game.a.a(a2.aa, a2.I, a2.G, n3, n5);
                                    ++a2.E;
                                }
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -49) {
                                a2.J[9] = this.A[n - 11][a2.r[0]][this.aZ[n][a2.r[0]][a2.E + 1]];
                                a2.E += 2;
                            } else if (this.aZ[n][a2.r[0]][a2.E] == -50) {
                                a2.U = (byte)(a2.U == 1 ? 2 : 1);
                                ++a2.E;
                            }
                        }
                    }
                    if (this.aZ[n][a2.r[0]][a2.E] >= 0) {
                        short s = this.aZ[n][a2.r[0]][a2.E + 1];
                        this.a((i)a2, (int)this.aZ[n][a2.r[0]][a2.E], (int)s);
                        a2.E += 2;
                        break;
                    }
                    if (this.aZ[n][a2.r[0]][a2.E] != -2) continue;
                    a2.E = -1;
                    break;
                }
                a2.E = -1;
                break;
            } while (this.aZ[n][a2.r[0]][a2.E] < -2);
        }
        a2.ac = false;
        return true;
    }

    protected int a(game.a a2, int n, boolean bl) {
        int[] nArray;
        int n2 = 3000;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        int n6 = -1;
        if (n > 0 && (n2 = this.a(a2, n3 = (nArray = this.b((i)a2))[0], n4 = nArray[1], n5 = nArray[2], n6 = nArray[3], this.bB[0], n, bl)) >= 1000 && n2 < 2000) {
            return n2;
        }
        return 3000;
    }

    private void b(game.a a2, int n, int n2) {
        if (a2 == null) {
            return;
        }
        a2.r[1] = a2.r[0];
        a2.r[0] = (byte)n;
        a2.E = n2;
    }

    private void a(i i2, int n, int n2) {
        i2.af[1] = i2.af[0];
        i2.af[0] = (byte)n;
        if (i2.af[1] != i2.af[0] || i2.ac) {
            i2.y = false;
            i2.ao = 0;
            i2.f = 0;
            i2.ah = 0;
            i2.ac = false;
        }
        int n3 = i2.ag & 0xFFFFFF7F;
        int n4 = this.ck[n3][n].length;
        if (n2 >= 0) {
            this.ck[n3][n][n4 - 1][0] = (short)n2;
        }
        i2.O[0] = this.ck[n3][i2.af[0]][i2.ao][1];
    }

    private void a(i i2) {
        int n;
        block76: {
            int n2;
            block77: {
                block79: {
                    int n3;
                    block78: {
                        block80: {
                            if (i2 == null) {
                                return;
                            }
                            n = i2.ag;
                            n2 = this.ck[n][i2.af[0]].length - 2;
                            if (i2.Z[0] < i2.Z[1]) {
                                i2.Z[0] = (byte)(i2.Z[0] + 1);
                            }
                            if (i2.Z[0] < i2.Z[1]) break block76;
                            i2.Z[0] = 0;
                            i2.ah = (byte)(i2.ah + 1);
                            if (i2.ah < this.ck[n][i2.af[0]][i2.ao][0]) break block76;
                            if (i2.ao >= n2) break block77;
                            if (this.ck[n][i2.af[0]][i2.ao][0] == 0) {
                                if (i2.ag == 0) {
                                    if (i2.af[0] == 18 || i2.af[0] == 22 || i2.af[0] == 26) {
                                        i2.A = true;
                                    }
                                    if (i2.af[0] >= 15 && i2.af[0] <= 26) {
                                        this.aJ = this.c(i2);
                                        for (n3 = 0; n3 < this.aF[this.ay.d][5]; ++n3) {
                                            this.ay.J[8] = this.a(this.ay.J[8], 1, 20, 29);
                                            this.s = this.a(this.aJ);
                                            this.b(i2, this.ay.J[8], this.aF[this.ay.d][10], this.s[0], this.s[1], this.ay.U, 0, 1, 1, -1, 0, 1);
                                        }
                                    }
                                } else if (i2.ag >= 11 && i2.ag <= 19) {
                                    if (i2.r[0] == 10) {
                                        byte[] byArray = new byte[]{17, 17, 17, 17, 16, 16};
                                        ((c)i2).J[5] = this.a(((c)i2).J[5], 1, 14, 21);
                                        this.aJ = this.b(i2);
                                        this.bm[89] = this.a(this.bm[89], 1, 22, 25);
                                        this.b(this.aO, this.bm[89], 45 + this.a(byArray), this.aJ[0] + (this.aJ[2] >> 1), this.aJ[1] - (this.aJ[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                                        if (this.bm[55] == 0) {
                                            this.bm[1] = 1;
                                            this.bm[55] = 25;
                                        }
                                        this.bm[21] = 4;
                                        this.a((game.a)i2, 0);
                                    } else if (i2.q != 12) {
                                        if (i2.q == 11) {
                                            if (i2.af[0] == 6) {
                                                i2.A = true;
                                                i2.d = (byte)3;
                                            } else if (i2.af[0] == 7) {
                                                this.b(i2, 0, 8, i2.I, i2.G, i2.U, i2.ag, 1, 1, -1, 0, 1);
                                            } else if (i2.af[0] == 9) {
                                                this.b(i2, 1, 10, i2.I, i2.G, i2.U, i2.ag, 1, 1, -1, 0, 1);
                                            } else if (i2.af[0] == 11) {
                                                this.b(i2, 2, 12, i2.I, i2.G, i2.U, i2.ag, 1, 1, -1, 0, 1);
                                            } else if (i2.af[0] == 15) {
                                                this.b(i2, 3, 14, i2.I, i2.G, i2.U, i2.ag, 1, 1, -1, 0, 1);
                                                i2.A = true;
                                                i2.d = 0;
                                            }
                                        } else if (i2.q == 13) {
                                            if (i2.af[0] == 2) {
                                                this.bm[21] = 4;
                                            } else if (i2.af[0] == 3 || i2.af[0] == 4) {
                                                i2.A = true;
                                                i2.d = 0;
                                            } else if (i2.af[0] == 6) {
                                                i2.A = true;
                                                i2.d = 1;
                                                this.bm[27] = (short)(i2.I + 28 * game.j.h[i2.U]);
                                                this.bm[28] = (short)i2.G;
                                                this.bm[33] = this.bm[27];
                                                this.bm[21] = 7;
                                            }
                                        } else if (i2.q != 14 && i2.q == 15) {
                                            if (i2.af[0] == 9) {
                                                i2.A = true;
                                                if (i2.r[0] == 8) {
                                                    i2.d = (byte)3;
                                                } else if (i2.r[0] == 4 || i2.r[0] == 6) {
                                                    i2.d = (byte)4;
                                                } else if (i2.r[0] == 9) {
                                                    i2.d = (byte)5;
                                                }
                                            } else if (i2.af[0] == 5) {
                                                i2.A = true;
                                                i2.d = 0;
                                            } else if (i2.af[0] == 6) {
                                                i2.A = true;
                                                i2.d = 0;
                                            } else if (i2.af[0] == 7) {
                                                i2.A = true;
                                                i2.d = (byte)2;
                                            } else if (i2.af[0] == 3) {
                                                this.b(i2, 0, 12, i2.I, i2.G, i2.U, 15, 1, 1, -1, 0, 1);
                                            }
                                        }
                                    }
                                } else if (i2.ag == 37) {
                                    this.bm[1] = 1;
                                } else if (i2.ag == 29 && i2.af[0] == 1) {
                                    this.a(i2, 0, 0);
                                    this.bm[35] = 0;
                                }
                            } else if (this.ck[n][i2.af[0]][i2.ao][0] == -1) {
                                if (i2.ag == 37) {
                                    this.a(i2, i2.af[0] - 3, 0);
                                    this.v = false;
                                    this.z[this.Y[this.q][this.bm[50]][this.bm[48] + 1][2]][0] = 1;
                                    if (this.q == 0) {
                                        for (int k = 14; k <= 22; ++k) {
                                            if (d.a((byte)k, this.V) >= 0) continue;
                                            this.V = this.a(this.V, k, 1, 0);
                                        }
                                        this.I();
                                    } else if (this.Y[this.q][this.bm[50]][this.bm[48] + 1][2] == 0) {
                                        this.a(136);
                                    } else {
                                        this.a(58);
                                    }
                                    if (this.J() >= 100) {
                                        this.a(120);
                                    }
                                } else if (i2.ag >= 11 && i2.ag <= 19 && i2.r[0] == 10) {
                                    if (this.bm[54] == 1) {
                                        this.aa[i2.ag][1][0] = 0;
                                        this.bm[54] = 0;
                                    } else {
                                        byte[] byArray = this.aa[i2.ag][1];
                                        byArray[0] = (byte)(byArray[0] + 1);
                                        if (this.aa[i2.ag][1][0] > 5) {
                                            this.aa[i2.ag][1][0] = 5;
                                        }
                                    }
                                }
                            }
                            if (i2.q != 11) break block78;
                            if (i2.af[0] != 13) break block79;
                            i2.A = true;
                            if (i2.r[0] != 4) break block80;
                            if (this.bm[32] == 0) {
                                this.bm[32] = 1;
                                this.b(i2, 0, 14, i2.I, i2.G, i2.U, i2.ag, 1, 1, -1, 0, 1);
                            }
                            i2.d = 1;
                            break block79;
                        }
                        if (i2.r[0] != 7) break block79;
                        if (this.bm[32] == 0) {
                            this.bm[32] = 1;
                            this.b(i2, 0, 14, i2.I, i2.G, i2.U, i2.ag, 1, 1, -1, 0, 1);
                        }
                        i2.d = (byte)2;
                        break block79;
                    }
                    if (i2.q == 12 && (i2.af[0] == 4 || i2.af[0] == 3)) {
                        for (n3 = 0; n3 < 3; ++n3) {
                            this.aJ = this.b(i2);
                            this.s = this.a(this.aJ);
                            this.bm[89] = this.a(this.bm[89], 1, 22, 25);
                            this.b(this.aO, this.bm[89], 16, this.s[0], this.s[1], 1, 26, 1, 1, -1, 0, 1);
                        }
                    }
                }
                ++i2.ao;
                i2.ah = 0;
            }
            if (i2.ag != 4 && i2.ag >= 1 && i2.ag <= 10 && i2.ai >= 0 && i2.r[0] == 9 && i2.ao >= i2.ai) {
                i2.y = true;
                this.b((game.a)i2, 10, 0);
                i2.C = 0;
                i2.ac = true;
                this.a((game.a)i2, 0);
            } else if (i2.ao + 0 >= n2 && i2.ah >= this.ck[n][i2.af[0]][i2.ao][0]) {
                i2.ah = 0;
                if (this.ck[n][i2.af[0]][n2 + 1][0] == 0) {
                    i2.ao = 0;
                } else {
                    if (i2.f < this.ck[n][i2.af[0]][n2 + 1][0]) {
                        ++i2.f;
                    }
                    if (i2.f >= this.ck[n][i2.af[0]][n2 + 1][0]) {
                        i2.f = this.ck[n][i2.af[0]][n2 + 1][0];
                        i2.y = true;
                    } else {
                        i2.ao = 0;
                    }
                }
            }
        }
        i2.O[0] = this.ck[n][i2.af[0]][i2.ao][1];
        this.i((game.a)i2);
    }

    private void i(game.a a2) {
        try {
            int n = a2.ag;
            byte by = a2.af[0];
            int n2 = a2.ao;
            short s = this.ck[n][by][a2.ao][1];
            int n3 = a2.Y[0];
            a2.Y[0] = this.O[n][s][3] - this.O[n][s][1];
            a2.Y[1] = n3 != 0 ? n3 : a2.Y[0];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int f(game.a a2) {
        int n = 3000;
        int n2 = 10;
        boolean bl = false;
        while (n == 3000 && a2.I != a2.P) {
            if (a2.I < a2.P) {
                a2.I += n2;
                if (a2.I > a2.P) {
                    a2.I = a2.P;
                }
            } else if (a2.I > a2.P) {
                a2.I -= n2;
                if (a2.I < a2.P) {
                    a2.I = a2.P;
                }
            }
            n = this.a(a2, a2.o & 0xC, true);
        }
        a2.P = a2.I;
        return n;
    }

    private void g(game.a a2) {
        if (!a2.k[4] && !a2.k[9]) {
            a2.j = -4;
        }
        a2.z += a2.j;
        if (a2.ag == 0 && a2.k[9] && a2.j <= a2.Q) {
            a2.k[9] = false;
            a2.j = a2.Q;
        }
        if (a2.j > a2.Q) {
            a2.j += a2.l;
        }
    }

    private int h(game.a a2) {
        int n = 3000;
        this.g(a2);
        n = this.a(a2);
        a2.at = a2.z = a2.G;
        if (a2.ag == 0) {
            if (n >= 1000 && n < 3000) {
                if (a2.k[4] && a2.j < 0) {
                    a2.k[4] = false;
                    a2.k[6] = false;
                    a2.k[14] = false;
                    a2.k[5] = true;
                    a2.o = (short)(a2.o & 0xC);
                    if (-this.ay.j > this.bv[0][0] || a2.r[0] == 4) {
                        this.ay.k[15] = true;
                        a2.o = (short)(a2.o & 3);
                        this.b(this.ay, 10, 0);
                        this.ay.ac = true;
                    } else if (a2.r[0] == 16) {
                        this.b(this.ay, 3, 0);
                        this.ay.ac = true;
                    } else if (a2.r[0] == 9) {
                        if ((a2.o & 0xC) == 0) {
                            this.b(this.ay, 3, 0);
                        } else {
                            this.b(this.ay, 2, 0);
                        }
                        this.ay.ac = true;
                    }
                    this.ay.a(this.bv[2]);
                    if (a2.k[9]) {
                        a2.k[9] = false;
                    }
                }
                if ((a2.o & 3) == 0 && !a2.k[4]) {
                    a2.k[5] = true;
                    a2.k[4] = false;
                    a2.j = 0;
                } else {
                    this.ay.a(this.bv[1]);
                }
            } else {
                if (a2.k[5]) {
                    this.b(this.ay, 9, 0);
                    this.ay.ac = true;
                    this.ay.a(this.bv[1]);
                    this.ay.o = (short)(this.ay.o | 2);
                }
                a2.k[5] = false;
                a2.k[4] = true;
            }
        } else if (a2.ag == 28 && n >= 1000 && n < 3000) {
            if (a2.k[4] && a2.j < 0) {
                a2.k[4] = false;
                a2.k[6] = false;
                a2.k[14] = false;
                a2.k[5] = true;
                a2.o = (short)(a2.o & 0xC);
                if (a2.ag == 28) {
                    a2.V = 0;
                }
            }
            if ((a2.o & 3) == 0 && !a2.k[4]) {
                a2.k[5] = true;
                a2.k[4] = false;
                a2.j = 0;
                a2.ar[0] = 0;
                if (a2.ag == 28 && a2.V == 1) {
                    a2.V = 0;
                }
            }
        }
        return n;
    }

    private int c(game.a a2) {
        int n = 3000;
        if (a2.ag > 0) {
            this.c(a2, 6, this.F - 6);
        } else {
            this.c(a2, al[0] + 6, al[1] - 6);
        }
        n = this.f(a2);
        a2.g = a2.P = a2.I;
        return n;
    }

    private void b(int n, int n2, int n3, int n4) {
        d.al[0] = n > 32 ? n - 16 : n;
        d.al[1] = n2 < this.F - 32 ? n2 + 16 : n2;
        d.al[2] = n3 < this.d - 32 ? n3 + 16 : n3;
        d.al[3] = n4 > 32 ? n4 - 16 : n4;
    }

    private void c(game.a a2, int n, int n2) {
        a2.P = a2.I;
        if ((a2.o & 0xC) == 4) {
            a2.P -= a2.ar[0];
        } else if ((a2.o & 0xC) == 8) {
            a2.P += a2.ar[0];
        }
        if (a2.P <= n) {
            a2.P = n;
        }
        if (a2.P >= n2) {
            a2.P = n2;
        }
    }

    private int a(game.a a2) {
        int n;
        block3: {
            int n2;
            block2: {
                n = 3000;
                n2 = 2;
                if (a2.j > 0) break block2;
                while (n == 3000 && a2.G > a2.z - 10) {
                    a2.G -= n2;
                    n = this.a(a2, 2, true);
                    a2.o = (short)(a2.o & 0xC);
                }
                break block3;
            }
            if (a2.j <= 0) break block3;
            while (n == 3000 && a2.G < a2.z) {
                a2.G += n2;
                n = this.a(a2, 1, true);
                a2.o = (short)(a2.o & 0xC);
            }
        }
        return n;
    }

    public void f() {
        this.Q = new int[this.Q.length];
        this.k();
        switch (this.bn[0]) {
            case 1: 
            case 2: 
            case 22: 
            case 26: {
                this.cw[2] = 0;
                break;
            }
            case 4: {
                switch (this.u[0]) {
                    case 18: 
                    case 21: {
                        this.bm[42] = 295;
                    }
                }
                break;
            }
            case 7: {
                switch (this.u[0]) {
                    case 0: {
                        if (this.f) break;
                        this.ab();
                        this.f = true;
                        d.e(this.u, 2);
                        this.s();
                        this.bT[0][0][0] = 4;
                        break;
                    }
                    case 18: 
                    case 21: {
                        this.bm[42] = 295;
                        break;
                    }
                    case 22: {
                        this.bm[64] = 30;
                    }
                }
                break;
            }
            default: {
                this.f = false;
            }
        }
    }

    public void w() {
        block0 : switch (this.bn[0]) {
            case 4: {
                switch (this.u[0]) {
                    case 1: 
                    case 13: 
                    case 18: 
                    case 21: {
                        this.e(this.bz[0][0], -1);
                    }
                }
                break;
            }
            case 7: {
                switch (this.u[0]) {
                    case 13: 
                    case 14: 
                    case 18: 
                    case 21: 
                    case 23: 
                    case 24: 
                    case 25: {
                        this.e(this.bz[0][0], -1);
                        break block0;
                    }
                    case 0: {
                        if (!this.f) {
                            this.ab();
                            this.f = true;
                            d.a(this.bn, 7);
                            d.e(this.u, 2);
                            this.s();
                            this.bT[0][0][0] = 4;
                            break block0;
                        }
                        this.e(this.bz[0][0], -1);
                    }
                }
            }
        }
        this.H();
    }

    public int q(int n) {
        int[] nArray = new int[]{-1982, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -1, -2, -3, -4, -6, -7, -5, 35, 42, -11};
        return d.a(n, nArray);
    }

    public void c(int n, int n2) {
        int n3 = this.q(n);
        if (n3 >= 0) {
            this.Q[n3] = n2;
        }
    }

    private int m(int n) {
        int n2 = this.q(n);
        return this.Q[n2];
    }

    private void R(int n) {
        int[] nArray = new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1};
        int[][] nArrayArray = new int[][]{{0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0, 1}, {0}, {0}, {-1}, {0}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {0, 1}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0}, {0, 1}, {0}, {0}, {0}, {0}};
        try {
            int n2;
            if (this.cy[n] == null) {
                this.cy[n] = new Image[nArray[n]];
            }
            if (this.cy[n2 = this.co[n]] == null) {
                this.cy[n2] = new Image[nArray[n2]];
            }
            if (nArrayArray[n2][0] != -1 && this.cy[n2][nArrayArray[n2][0]] == null) {
                String string = "/data/role/role_" + n2 + ".mid";
                DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream(string));
                dataInputStream.skip(4L);
                int n3 = 0;
                int n4 = dataInputStream.readInt();
                for (int k = 0; k < nArrayArray[n2].length; ++k) {
                    n3 = dataInputStream.readInt();
                    byte[] byArray = new byte[n3];
                    for (int i2 = 0; i2 < n3; ++i2) {
                        byArray[i2] = (byte)(dataInputStream.readByte() ^ n4);
                    }
                    this.cy[n2][nArrayArray[n2][k]] = game.b.d(byArray, 0);
                }
            }
            for (int k = 0; k < this.cy[n].length; ++k) {
                if (this.cy[n][k] != null) continue;
                this.cy[n][k] = n == 0 && k == 1 ? this.cy[26][1] : this.cy[n2][k];
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void H(int n) {
        try {
            int[] nArray = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
            String string = "/data/scene/scene_" + n + ".mid";
            if (this.bp[n] == null) {
                this.bp[n] = new Image[nArray[n]];
            }
            if (this.bp[n][1] == null) {
                DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream(string));
                dataInputStream.skip(4L);
                int n2 = 0;
                int n3 = dataInputStream.readInt();
                n2 = dataInputStream.readInt();
                byte[] byArray = new byte[n2];
                for (int k = 0; k < n2; ++k) {
                    byArray[k] = (byte)(dataInputStream.readByte() ^ n3);
                }
                this.bp[n][1] = game.b.d(byArray, 0);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void J(int n) {
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
            n3 = (int)d.c(byArray2);
            dataInputStream.read(byArray2);
            int n14 = (int)d.c(byArray2);
            dataInputStream.read(byArray2);
            int n15 = (int)d.c(byArray2);
            this.F = n14 * this.bK;
            this.d = n15 * this.af;
            this.aE = new short[n9][];
            this.ad = new int[n9][2];
            this.bB = new short[1][n14][n15];
            this.m = new short[n5][];
            this.bR = new int[n5][2];
            this.bF = new short[n7][];
            cf = new int[n7][2];
            this.cg = new short[n11][];
            game.a.M = 0;
            this.G();
            inputStream.read(byArray2);
            long l = d.c(byArray2);
            short s = (short)d.c(byArray2);
            for (int k = 0; k < n3; ++k) {
                if (s >= -1) continue;
                by2 = dataInputStream.readByte();
                n13 = 0;
                inputStream.read(byArray);
                n2 = (int)d.c(byArray);
                inputStream.read(byArray2);
                s = (short)d.c(byArray2);
                switch (by2) {
                    case 1: {
                        n10 = (byte)(n10 + 1);
                        this.aE[n10] = new short[n2 * 3];
                        break;
                    }
                    case 2: {
                        n8 = (byte)(n8 + 1);
                        this.bF[n8] = new short[n2 * 3];
                        break;
                    }
                    case 3: {
                        n4 = (byte)(n4 + 1);
                        break;
                    }
                    case 4: {
                        n6 = (byte)(n6 + 1);
                        this.m[n6] = new short[n2 * 3];
                        break;
                    }
                    case 5: {
                        n12 = (byte)(n12 + 1);
                        this.cg[n12] = new short[n2 * 3];
                    }
                }
                while (s >= 0) {
                    short s2 = s;
                    inputStream.read(byArray2);
                    short s3 = (short)d.c(byArray2);
                    switch (by2) {
                        case 0: {
                            inputStream.read(byArray);
                            break;
                        }
                        case 1: {
                            int n16 = n13;
                            n13 = (short)(n13 + 1);
                            this.aE[n10][n16] = s2;
                            int n17 = n13;
                            n13 = (short)(n13 + 1);
                            this.aE[n10][n17] = s3;
                            inputStream.read(byArray);
                            int n18 = n13;
                            n13 = (short)(n13 + 1);
                            this.aE[n10][n18] = (short)d.c(byArray);
                            break;
                        }
                        case 2: {
                            int n19 = n13;
                            n13 = (short)(n13 + 1);
                            this.bF[n8][n19] = s2;
                            int n20 = n13;
                            n13 = (short)(n13 + 1);
                            this.bF[n8][n20] = s3;
                            inputStream.read(byArray);
                            int n21 = n13;
                            n13 = (short)(n13 + 1);
                            this.bF[n8][n21] = (short)d.c(byArray);
                            break;
                        }
                        case 3: {
                            inputStream.read(byArray);
                            this.bB[0][s2][s3] = (short)d.c(byArray);
                            break;
                        }
                        case 4: {
                            inputStream.read(byArray);
                            int n22 = n13;
                            n13 = (short)(n13 + 1);
                            this.m[n6][n22] = s2;
                            int n23 = n13;
                            n13 = (short)(n13 + 1);
                            this.m[n6][n23] = s3;
                            int n24 = n13;
                            n13 = (short)(n13 + 1);
                            this.m[n6][n24] = (short)d.c(byArray);
                            break;
                        }
                        case 5: {
                            inputStream.read(byArray);
                            int n25 = n13;
                            n13 = (short)(n13 + 1);
                            this.cg[n12][n25] = s2;
                            int n26 = n13;
                            n13 = (short)(n13 + 1);
                            this.cg[n12][n26] = s3;
                            int n27 = n13;
                            n13 = (short)(n13 + 1);
                            this.cg[n12][n27] = (short)d.c(byArray);
                            break;
                        }
                        default: {
                            inputStream.read(byArray);
                        }
                    }
                    inputStream.read(byArray2);
                    s = (short)d.c(byArray2);
                }
            }
            inputStream.close();
            inputStream = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void b(int n) {
        String string = "/data/animate/role_";
        int n2 = this.aS[n];
        try {
            InputStream inputStream;
            if (this.aq[n].length == 0) {
                inputStream = d.d(string + n2 + "_module.mid");
                this.aq[n] = d.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.aB[n].length == 0) {
                inputStream = d.d(string + n2 + "_frame.mid");
                this.aB[n] = d.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.O[n].length == 0) {
                inputStream = d.d(string + n2 + "_colli.mid");
                this.O[n] = d.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.bZ[n].length == 0) {
                inputStream = d.d(string + n2 + "_att.mid");
                this.bZ[n] = d.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.ck[n].length == 0) {
                inputStream = d.d(string + n2 + "_action.mid");
                this.ck[n] = d.a(inputStream);
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
            this.ac.a(nArray, n, n2, 1, this.cy, this.aq, this.aB, this.ck, this.aK[0] + this.bm[19], this.aK[1] + this.bm[20]);
        }
    }

    private void b(i i2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.a(i2.T[n], n2, n3, n4, n5, n6, n7, n8, n9, n10, n11);
    }

    private void a(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = this.ck[n5][n].length;
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
            this.ck[n5][n][n11 - 1][0] = (short)n10;
        }
    }

    private void a(game.a a2, int n, int n2) {
        boolean bl = false;
        int n3 = -1;
        int n4 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (a2.n == null) {
            return;
        }
        for (int k = 0; k < a2.n.length; ++k) {
            if (a2.n[k] == null) continue;
            for (int i2 = 0; i2 < a2.n[k].length; ++i2) {
                int[] nArray;
                block45: {
                    block47: {
                        block46: {
                            nArray = a2.n[k][i2];
                            if (a2.ag == 0) {
                                if (nArray[0] > 0) {
                                    if (d.U(nArray[3] - nArray[1]) + d.U(nArray[4] - nArray[2]) > d.U(game.a.ad[a2.q][this.aF[k][7]][4])) {
                                        if (nArray[7] == 7 && nArray[12] > -1) {
                                            nArray[6] = 0;
                                            nArray[7] = nArray[13];
                                            this.ck[nArray[11]][nArray[7]][this.ck[nArray[11]][nArray[7]].length - 1][0] = (short)nArray[14];
                                            nArray[13] = game.a.ad[a2.q][nArray[12]][9];
                                            nArray[14] = game.a.ad[a2.q][nArray[12]][10];
                                            nArray[12] = game.a.ad[a2.q][nArray[12]][8];
                                        } else {
                                            nArray[0] = 0;
                                            int n5 = k;
                                            a2.c[n5] = (byte)(a2.c[n5] - 1);
                                        }
                                    }
                                }
                            } else if (a2.q == 12) {
                                if (nArray[0] > 0 && d.U(nArray[4] - nArray[2]) > d.U(160)) {
                                    nArray[0] = 0;
                                    int n6 = k;
                                    a2.c[n6] = (byte)(a2.c[n6] - 1);
                                }
                            } else if (a2.ag >= 1 && a2.ag <= 19 && nArray[0] > 0) {
                                if (d.U(nArray[3] - nArray[1]) + d.U(nArray[4] - nArray[2]) > d.U(game.a.ad[a2.q][k][4])) {
                                    nArray[0] = 0;
                                    int n7 = k;
                                    a2.c[n7] = (byte)(a2.c[n7] - 1);
                                }
                            }
                            if (nArray[0] == 1) {
                                block0 : switch (a2.q) {
                                    case 0: {
                                        bl2 = true;
                                        switch (this.aF[k][7]) {
                                            case 0: 
                                            case 1: 
                                            case 2: {
                                                nArray[3] = nArray[3] + (2 + nArray[10]) * game.j.h[nArray[5]];
                                                nArray[10] = nArray[10] + 4;
                                                if (nArray[3] < nArray[1] + 480 && nArray[3] > nArray[1] - 480) break;
                                                nArray[0] = 0;
                                                int n8 = k;
                                                a2.c[n8] = (byte)(a2.c[n8] - 1);
                                                break;
                                            }
                                            case 3: 
                                            case 9: 
                                            case 12: {
                                                if (nArray[7] != 7) break;
                                                n3 = a2.n[k][i2][9];
                                                nArray[3] = nArray[3] + ((game.a.ad[a2.q][k][1] + nArray[10]) * bW[n3][0] >> 16);
                                                nArray[4] = nArray[4] + ((game.a.ad[a2.q][k][2] + nArray[10]) * bW[n3][1] >> 16);
                                                nArray[10] = nArray[10] + 6;
                                            }
                                        }
                                        break;
                                    }
                                    case 12: {
                                        bl2 = true;
                                        n3 = a2.n[k][i2][9];
                                        nArray[3] = nArray[3] + (game.a.ad[a2.q][k][1] * bW[n3][0] >> 16);
                                        nArray[4] = nArray[4] + (game.a.ad[a2.q][k][2] * bW[n3][1] >> 16);
                                        break;
                                    }
                                    case 11: {
                                        bl2 = true;
                                        switch (k) {
                                            case 0: {
                                                nArray[3] = nArray[3] + game.a.ad[a2.q][k][1] * game.j.h[nArray[5]];
                                                nArray[4] = nArray[4] + game.a.ad[a2.q][k][2] * game.j.h[nArray[5]];
                                                break;
                                            }
                                            case 1: 
                                            case 2: {
                                                n3 = a2.n[k][i2][9];
                                                nArray[3] = nArray[3] + (game.a.ad[a2.q][k][1] * bW[n3][0] >> 16);
                                                nArray[4] = nArray[4] + (game.a.ad[a2.q][k][2] * bW[n3][1] >> 16);
                                            }
                                        }
                                        break;
                                    }
                                    case 13: {
                                        bl2 = true;
                                        switch (k) {
                                            case 0: {
                                                nArray[3] = nArray[3] + (game.a.ad[a2.q][k][1] + nArray[10]) * game.j.h[nArray[5]];
                                                nArray[10] = nArray[10] + 8;
                                                break block0;
                                            }
                                        }
                                        break;
                                    }
                                    case 15: {
                                        bl2 = true;
                                        switch (k) {
                                            case 0: 
                                            case 1: 
                                            case 2: {
                                                n3 = a2.n[k][i2][9];
                                                nArray[3] = nArray[3] + ((game.a.ad[a2.q][k][1] + nArray[10]) * bW[n3][0] >> 16);
                                                nArray[4] = nArray[4] + ((game.a.ad[a2.q][k][2] + nArray[10]) * bW[n3][1] >> 16);
                                                nArray[10] = nArray[10] + 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!bl2 || nArray[0] != 1) continue;
                            n4 = this.ck[nArray[11]][nArray[7]].length - 2;
                            if (nArray[8] < this.ck[nArray[11]][nArray[7]][nArray[6]][0] - 1) {
                                nArray[8] = nArray[8] + 1;
                                continue;
                            }
                            nArray[8] = 0;
                            if (nArray[6] >= n4) break block45;
                            nArray[6] = nArray[6] + 1;
                            if (this.ck[nArray[11]][nArray[7]][nArray[6]][0] != 0 || a2.q != 13) continue;
                            if (nArray[5] != 1) break block46;
                            if (this.bm[33] + game.a.ad[a2.q][k][4] >= this.bm[27]) break block47;
                        }
                        if (nArray[5] != 2) continue;
                        if (this.bm[33] - game.a.ad[a2.q][k][4] > this.bm[27]) continue;
                    }
                    a2.A = true;
                    a2.d = 1;
                    this.bm[27] = (short)(nArray[1] + game.a.ad[a2.q][k][1] * game.j.h[nArray[5]]);
                    this.bm[28] = (short)nArray[2];
                    continue;
                }
                if (this.ck[nArray[11]][nArray[7]][n4 + 1][0] == 0) {
                    nArray[6] = 0;
                    continue;
                }
                if (nArray[12] > -1) {
                    nArray[6] = 0;
                    nArray[7] = nArray[13];
                    if (a2.q == 15) {
                        nArray[11] = 26;
                    }
                    this.ck[nArray[11]][nArray[7]][this.ck[nArray[11]][nArray[7]].length - 1][0] = (short)nArray[14];
                    nArray[13] = game.a.ad[a2.q][nArray[12]][9];
                    nArray[14] = game.a.ad[a2.q][nArray[12]][10];
                    nArray[12] = game.a.ad[a2.q][nArray[12]][8];
                    if (nArray[11] != 26 || nArray[7] != 7) continue;
                    int[] nArray2 = this.A();
                    nArray[9] = nArray2 == null ? (this.ay.U == 1 ? 0 : 12) : this.a(nArray[1], nArray[2], nArray2[0], nArray2[1] + 20);
                    nArray[10] = 2;
                    if (nArray[9] < 0) {
                        nArray[9] = nArray[9] + bW.length;
                    }
                    if (nArray[9] < bW.length) continue;
                    nArray[9] = nArray[9] - bW.length;
                    continue;
                }
                nArray[0] = 0;
                int n9 = k;
                a2.c[n9] = (byte)(a2.c[n9] - 1);
            }
        }
    }

    private int[] A() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int[][] nArray = null;
        if (this.c != null && this.c.length > 0) {
            int n4;
            for (n4 = 0; n4 < this.c.length; ++n4) {
                if (!this.c[n4].K || this.c[n4].k[0]) continue;
                n = this.O[this.c[n4].ag][this.c[n4].O[0]][2] - this.O[this.c[n4].ag][this.c[n4].O[0]][0];
                n2 = this.O[this.c[n4].ag][this.c[n4].O[0]][3] - this.O[this.c[n4].ag][this.c[n4].O[0]][1];
                if (n == 0 || n2 == 0) continue;
                ++n3;
            }
            nArray = new int[n3][2];
            n3 = 0;
            for (n4 = 0; n4 < this.c.length; ++n4) {
                if (!this.c[n4].K || this.c[n4].k[0]) continue;
                n = this.O[this.c[n4].ag][this.c[n4].O[0]][2] - this.O[this.c[n4].ag][this.c[n4].O[0]][0];
                n2 = this.O[this.c[n4].ag][this.c[n4].O[0]][3] - this.O[this.c[n4].ag][this.c[n4].O[0]][1];
                if (n == 0 || n2 == 0) continue;
                nArray[n3][0] = this.c[n4].I;
                nArray[n3][1] = this.c[n4].G;
                ++n3;
            }
        }
        if (nArray != null && nArray.length > 0) {
            return nArray[d.i(nArray.length)];
        }
        return null;
    }

    private void e(game.a a2) {
        if (a2.ag == 0) {
            if (this.c != null) {
                for (int k = 0; k < this.c.length; ++k) {
                    if ((this.c[k].ag < 1 || this.c[k].ag > 10 || this.c[k].r[0] == 9) && (this.c[k].ag < 11 || this.c[k].ag > 19 || this.c[k].r[0] == 10)) continue;
                    this.a(2, a2, this.c[k]);
                    this.a(1, a2, this.c[k]);
                }
            }
        } else if (a2.ag == 4 && a2.r[0] == 9) {
            if (this.ay.r[0] != 15) {
                this.a(5, a2, this.ay);
            }
            if (this.c != null) {
                for (int k = 0; k < this.c.length; ++k) {
                    if ((this.c[k].ag < 1 || this.c[k].ag > 10 || this.c[k].r[0] == 9) && (this.c[k].ag < 11 || this.c[k].ag > 19 || this.c[k].r[0] == 10 || this.c[k].r[0] == 11)) continue;
                    this.a(5, a2, this.c[k]);
                }
            }
        } else if (a2.ag >= 1 && a2.ag <= 19 && this.ay.r[0] != 15 && (a2.ag >= 1 && a2.ag <= 10 && a2.r[0] != 9 || a2.ag >= 11 && a2.ag <= 19 && a2.r[0] != 10 && a2.r[0] != 11)) {
            if (a2.n != null) {
                this.a(2, a2, this.ay);
            }
            this.a(1, a2, this.ay);
            this.a(0, a2, this.ay);
        }
    }

    private void d(game.a a2, int n, int n2) {
        boolean bl = false;
        if (a2.n == null) {
            return;
        }
        if (a2.n.length > 0) {
            for (int k = 0; k < a2.n.length; ++k) {
                for (int i2 = 0; i2 < a2.n[k].length; ++i2) {
                    int[] nArray = a2.n[k][i2];
                    if (nArray[0] != 1) continue;
                    int n3 = 0xFF0000;
                    if (nArray[0] != 1) continue;
                    this.ac.a(this.cy[nArray[11]], this.aB[nArray[11]][this.ck[nArray[11]][nArray[7]][nArray[6]][1]], nArray[3] + 0, nArray[4] - 30, 1, this.aq[nArray[11]], (byte)nArray[5], this.aK[0] + this.bm[19], this.aK[1] + this.bm[20], nArray[11]);
                }
            }
        }
    }

    private void b(game.a a2) {
        if (a2 == null) {
            return;
        }
        int[] nArray = new int[4];
        int n = a2.ag & 0xFFFFFF7F;
        int n2 = 0;
        int[][][] nArrayArray = new int[][][]{new int[0][], new int[][]{new int[0], {0, 1, 23}, {12, 11, 13}}, new int[][]{new int[0], {0, 1, 23, 2, 22}, {12, 11, 13, 10, 14}}, new int[0][]};
        int n3 = -1;
        if (a2.A) {
            if (a2.ag == 0) {
                n3 = a2.d;
                if (a2.c[n3] < game.a.ad[a2.q][this.aF[n3][7]][6] && a2.n[n3] != null) {
                    for (int k = 0; k < a2.n[n3].length; ++k) {
                        int[] nArray2 = a2.n[n3][k];
                        if (nArray2[0] != 0) continue;
                        if (n2 >= game.a.ad[a2.q][this.aF[n3][7]][0]) continue;
                        ++n2;
                        int n4 = n3;
                        a2.c[n4] = (byte)(a2.c[n4] + 1);
                        nArray2[0] = 1;
                        nArray2[5] = this.ay.U;
                        nArray2[6] = 0;
                        nArray2[11] = 26;
                        nArray2[10] = 0;
                        nArray2[7] = this.aF[a2.d][8];
                        nArray2[12] = game.a.ad[a2.q][this.aF[a2.d][7]][8];
                        nArray2[13] = game.a.ad[a2.q][this.aF[a2.d][7]][9];
                        nArray2[14] = game.a.ad[a2.q][this.aF[a2.d][7]][10];
                        switch (this.aF[a2.d][7]) {
                            case 0: 
                            case 1: 
                            case 2: {
                                nArray2[1] = a2.I;
                                nArray2[2] = a2.G;
                                this.ck[nArray2[11]][nArray2[7]][this.ck[nArray2[11]][nArray2[7]].length - 1][0] = 0;
                                break;
                            }
                            case 3: 
                            case 9: 
                            case 12: {
                                this.aJ = this.b((i)this.ay);
                                nArray[0] = this.aJ[0] + (this.aJ[2] >> 1) - 30;
                                nArray[1] = this.aJ[1] - (this.aJ[3] >> 1) + 30;
                                nArray[2] = 60;
                                nArray[3] = 60;
                                this.s = this.a(nArray);
                                nArray2[1] = this.s[0];
                                nArray2[2] = this.s[1];
                                this.ck[nArray2[11]][nArray2[7]][this.ck[nArray2[11]][nArray2[7]].length - 1][0] = 1;
                                break;
                            }
                            case 6: 
                            case 7: 
                            case 8: {
                                nArray2[1] = a2.I;
                                nArray2[2] = a2.G;
                                this.ck[nArray2[11]][nArray2[7]][this.ck[nArray2[11]][nArray2[7]].length - 1][0] = 1;
                            }
                        }
                        nArray2[3] = nArray2[1];
                        nArray2[4] = nArray2[2];
                    }
                }
            } else if (n >= 1 && n <= 19) {
                if (game.a.ad[a2.q].length > 0) {
                    n3 = a2.d;
                    if (a2.c[n3] < game.a.ad[a2.q][n3][6] && a2.n[n3] != null) {
                        for (int k = 0; k < a2.n[n3].length; ++k) {
                            int[] nArray3 = a2.n[n3][k];
                            if (nArray3[0] != 0) continue;
                            if (n2 >= game.a.ad[a2.q][n3][0]) continue;
                            ++n2;
                            int n5 = n3;
                            a2.c[n5] = (byte)(a2.c[n5] + 1);
                            switch (a2.q) {
                                case 11: {
                                    nArray3[0] = 1;
                                    nArray3[5] = a2.U;
                                    nArray3[6] = 0;
                                    nArray3[12] = -1;
                                    switch (n3) {
                                        case 0: {
                                            nArray3[1] = a2.I + this.bZ[a2.ag][a2.O[0]][0] * game.j.h[a2.U];
                                            nArray3[2] = a2.G - this.bZ[a2.ag][a2.O[0]][1] - 20 + 12 * n2;
                                            nArray3[11] = 26;
                                            nArray3[7] = 13;
                                            nArray3[9] = -1;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 1: {
                                            nArray3[1] = a2.I + this.bZ[a2.ag][a2.O[0]][0] * game.j.h[a2.U] + d.s(10);
                                            nArray3[2] = a2.G - this.bZ[a2.ag][a2.O[0]][1] + d.s(8);
                                            nArray3[11] = 26;
                                            nArray3[7] = 13;
                                            nArray3[9] = nArrayArray[1][a2.U][d.i(3)];
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 2: {
                                            nArray3[1] = a2.I + this.bZ[a2.ag][a2.O[0]][0] * game.j.h[a2.U] + d.s(10);
                                            nArray3[2] = a2.G - this.bZ[a2.ag][a2.O[0]][1] + d.s(15);
                                            nArray3[11] = a2.ag;
                                            nArray3[7] = 17;
                                            nArray3[9] = nArrayArray[2][a2.U][d.i(5)];
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 3: {
                                            nArray3[1] = a2.I - 16 * game.j.h[a2.U];
                                            nArray3[2] = a2.G;
                                            nArray3[11] = 26;
                                            nArray3[7] = 12;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 1;
                                        }
                                    }
                                    break;
                                }
                                case 13: {
                                    nArray3[0] = 1;
                                    nArray3[5] = a2.U;
                                    nArray3[6] = 0;
                                    nArray3[12] = -1;
                                    switch (n3) {
                                        case 0: {
                                            nArray3[10] = 0;
                                            nArray3[5] = a2.U;
                                            nArray3[1] = a2.I + 48 * game.j.h[a2.U];
                                            nArray3[2] = a2.G;
                                            nArray3[11] = a2.ag;
                                            nArray3[7] = 5;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            break;
                                        }
                                        case 1: {
                                            nArray3[5] = this.bm[25];
                                            nArray3[1] = this.bm[27];
                                            nArray3[2] = this.bm[28];
                                            nArray3[11] = 26;
                                            nArray3[7] = 15;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 1;
                                        }
                                    }
                                    break;
                                }
                                case 15: {
                                    nArray3[0] = 1;
                                    nArray3[5] = a2.U;
                                    nArray3[6] = 0;
                                    nArray3[12] = -1;
                                    switch (n3) {
                                        case 0: {
                                            nArray3[7] = 8;
                                            nArray3[1] = a2.I + this.bZ[a2.ag][a2.O[0]][0] * game.j.h[a2.U];
                                            nArray3[2] = a2.G - this.bZ[a2.ag][a2.O[0]][1];
                                            nArray3[11] = a2.ag;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            nArray3[10] = 0;
                                            nArray3[9] = this.a(nArray3[1], nArray3[2], this.ay.I, this.ay.G + 30);
                                            nArray3[12] = -1;
                                            break;
                                        }
                                        case 1: {
                                            nArray3[7] = 8;
                                            nArray3[1] = a2.I + this.bZ[a2.ag][a2.O[0]][0] * game.j.h[a2.U];
                                            nArray3[2] = a2.G - this.bZ[a2.ag][a2.O[0]][1];
                                            nArray3[11] = a2.ag;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            nArray3[10] = 0;
                                            nArray3[9] = this.a(nArray3[1], nArray3[2], this.ay.I, this.ay.G + 30) + (n2 - 2) * 2;
                                            nArray3[12] = -1;
                                            break;
                                        }
                                        case 2: {
                                            nArray3[7] = 8;
                                            nArray3[1] = a2.I + this.bZ[a2.ag][a2.O[0]][0] * game.j.h[a2.U];
                                            nArray3[2] = a2.G - this.bZ[a2.ag][a2.O[0]][1];
                                            nArray3[11] = a2.ag;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 0;
                                            nArray3[10] = 0;
                                            nArray3[9] = this.a(nArray3[1], nArray3[2], this.ay.I, this.ay.G + 30) + (n2 - 3) * 2;
                                            nArray3[12] = -1;
                                            break;
                                        }
                                        case 3: 
                                        case 4: 
                                        case 5: {
                                            nArray3[7] = 10;
                                            nArray3[1] = this.bm[30] + d.s(181);
                                            nArray3[2] = 2 * this.af;
                                            nArray3[11] = a2.ag;
                                            this.ck[nArray3[11]][nArray3[7]][this.ck[nArray3[11]][nArray3[7]].length - 1][0] = 1;
                                            nArray3[10] = 0;
                                            nArray3[12] = game.a.ad[a2.q][n3][8];
                                            nArray3[13] = game.a.ad[a2.q][n3][9];
                                            nArray3[14] = game.a.ad[a2.q][n3][10];
                                        }
                                    }
                                    if (nArray3[9] < 0) {
                                        nArray3[9] = nArray3[9] + bW.length;
                                    }
                                    if (nArray3[9] < bW.length) break;
                                    nArray3[9] = nArray3[9] - bW.length;
                                }
                            }
                            nArray3[3] = nArray3[1];
                            nArray3[4] = nArray3[2];
                        }
                    }
                }
            }
            a2.A = false;
        }
    }

    private void e(int n) {
        int n2 = this.ay.I / 240;
        int n3 = this.ay.G / 260;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int[] nArray = null;
        for (int k = 0; k < this.bN[this.q][n].length; k += 3) {
            if (this.bN[this.q][n][k + 0] != n2 || this.bN[this.q][n][k + 1] != n3) continue;
            for (int i2 = 0; i2 < 4; ++i2) {
                n8 = this.bN[this.q][n][k + 2] & 1 << i2;
                switch (n8) {
                    case 1: {
                        n4 = n2 * 240 + this.bK * 1;
                        n5 = (n3 + 1) * 260 + this.af;
                        n6 = 240 - this.bK * 2;
                        n7 = 3;
                        break;
                    }
                    case 2: {
                        n4 = n2 * 240 + this.bK * 1;
                        n5 = n3 * 260 - this.af;
                        n6 = 240 - this.bK * 2;
                        n7 = 23;
                        break;
                    }
                    case 4: {
                        n4 = n2 * 240;
                        n5 = (n3 + 1) * 260 - this.af;
                        n6 = 3;
                        n7 = 260 - this.af;
                        break;
                    }
                    case 8: {
                        n4 = (n2 + 1) * 240 - 4;
                        n5 = (n3 + 1) * 260 - this.af;
                        n6 = 3;
                        n7 = 260 - this.af;
                    }
                }
                nArray = this.b((i)this.ay);
                int n9 = this.bq[this.q][n * 3 + 1] + n2;
                int n10 = this.bq[this.q][n * 3 + 2] + n3;
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
                this.bs = this.f(n, n9, n10, n8);
                if (n8 != 1 && n8 != 2 && ((n8 != 4 || this.ay.U != 2) && (n8 != 8 || this.ay.U != 1) || this.ay.r[0] != 1 && this.ay.r[0] != 2 && this.ay.r[0] != 8) || this.bs < 0) continue;
                this.f = true;
                this.bm[17] = (short)(this.aK[0] / 240 + this.bq[this.q][n * 3 + 1]);
                this.bm[18] = (short)(this.aK[1] / 320 + this.bq[this.q][n * 3 + 2]);
                d.a(this.bn, 22);
                return;
            }
        }
    }

    private int f(int n, int n2, int n3, int n4) {
        for (int k = 0; k < this.bq[this.q].length; k += 3) {
            if (n2 < this.bq[this.q][k + 1] || n2 >= this.bq[this.q][k + 1] + this.ai[this.bq[this.q][k] * 2] || n3 < this.bq[this.q][k + 2] || n3 >= this.bq[this.q][k + 2] + this.ai[this.bq[this.q][k] * 2 + 1]) continue;
            switch (n4) {
                case 1: {
                    d.D[0] = this.ay.I / 240 * 240 + 120 - (this.bq[this.q][k + 1] - this.bq[this.q][n * 3 + 1]) * 240;
                    d.D[1] = 20;
                    break;
                }
                case 2: {
                    d.D[0] = this.ay.I / 240 * 240 + 120 - (this.bq[this.q][k + 1] - this.bq[this.q][n * 3 + 1]) * 240;
                    d.D[1] = this.ai[this.bq[this.q][k] * 2 + 1] * 260 - 25;
                    break;
                }
                case 4: {
                    d.D[0] = this.ai[this.bq[this.q][k] * 2] * 240 - 20;
                    d.D[1] = this.ay.G - (this.bq[this.q][k + 2] - this.bq[this.q][n * 3 + 2]) * 260;
                    break;
                }
                case 8: {
                    d.D[0] = 14;
                    d.D[1] = this.ay.G - (this.bq[this.q][k + 2] - this.bq[this.q][n * 3 + 2]) * 260;
                }
            }
            return k / 3;
        }
        return -1;
    }

    public int b(int n, int n2) {
        int n3 = -1;
        switch (n) {
            case 0: {
                if (n2 < 0 || n2 > 14) break;
                n3 = 0;
                break;
            }
            case 1: {
                if (n2 < 51 || n2 > 51) break;
                n3 = 1;
                break;
            }
            case 2: {
                if (n2 < 15 || n2 > 32) break;
                n3 = 2;
                break;
            }
            case 3: {
                if (n2 < 33 || n2 > 50) break;
                n3 = 3;
                break;
            }
            case 4: {
                if (n2 < 0 || n2 > 14) break;
                n3 = 4;
                break;
            }
            case 5: {
                if (n2 < 33 || n2 > 50) break;
                n3 = 5;
                break;
            }
            case 6: {
                if (n2 < 15 || n2 > 32) break;
                n3 = 6;
                break;
            }
            case 7: {
                if (n2 < 0 || n2 > 14) break;
                n3 = 7;
                break;
            }
            case 8: {
                if (n2 < 33 || n2 > 50) break;
                n3 = 8;
                break;
            }
            case 9: {
                if (n2 < 15 || n2 > 32) break;
                n3 = 9;
            }
        }
        return n3;
    }

    public int L(int n) {
        int n2 = -1;
        switch (n) {
            case 0: 
            case 4: 
            case 7: {
                n2 = 0;
                break;
            }
            case 1: {
                n2 = 1;
                break;
            }
            case 2: 
            case 6: 
            case 9: {
                n2 = 2;
                break;
            }
            case 3: 
            case 5: 
            case 8: {
                n2 = 3;
            }
        }
        return n2;
    }

    private void b(c c2) {
        int n = -1;
        if (c2 == null) {
            return;
        }
        int n2 = c2.ag & 0xFFFFFF7F;
        if (c2.K) {
            switch (c2.H[0]) {
                case 5: {
                    if (c2.ap || this.a(this.ay, c2, c2.D, 2) <= 0) break;
                    c2.ap = true;
                    d.e(c2.H, 0);
                    break;
                }
                case 0: {
                    c2.k[11] = true;
                    if (this.a(this.ay, c2, c2.t, 2) > 0) {
                        d.e(c2.H, 1);
                        break;
                    }
                    this.b(c2, 7, 0);
                    d.e(c2.H, 2);
                    break;
                }
                case 1: {
                    d.e(c2.H, 2);
                    n = this.a(this.y[n2]);
                    this.b(c2, n, 0);
                    if (c2.r[0] != -1) break;
                    break;
                }
                case 2: {
                    if (c2.r[0] == 7 && (c2.ag == 1 || c2.ag == 6 || c2.ag == 10)) {
                        if (this.a(this.ay, c2, c2.t, 2) > 0) {
                            d.e(c2.H, 1);
                            break;
                        }
                        this.a((game.a)c2, this.ay);
                        if (c2.E != -1) break;
                        d.e(c2.H, 0);
                        break;
                    }
                    if (c2.H[1] == 4) {
                        this.a((game.a)c2, this.ay);
                        if (c2.E != -1 && c2.r[0] != -1) break;
                        if (n2 == 5) {
                            c2.k[0] = false;
                            c2.b[0] = c2.b[1];
                            d.e(c2.H, 5);
                            break;
                        }
                        c2.K = false;
                        break;
                    }
                    if (c2.H[1] == 3) {
                        this.a((game.a)c2, this.ay);
                        if (c2.E != -1 && !c2.y) break;
                        if (n2 == 5) {
                            this.b(c2, 6, 5);
                            c2.ac = true;
                            d.e(c2.H, 2);
                            break;
                        }
                        c2.k[11] = true;
                        if (this.a(this.ay, c2, c2.t, 2) > 0) {
                            d.e(c2.H, 1);
                            break;
                        }
                        this.b(c2, 7, 0);
                        d.e(c2.H, 2);
                        break;
                    }
                    this.a((game.a)c2, this.ay);
                    if (c2.E != -1 && !c2.y) break;
                    d.e(c2.H, 0);
                    break;
                }
                case 3: {
                    c2.o = 0;
                    c2.X = (short)-1;
                    c2.y = true;
                    this.b(c2, 8, 0);
                    c2.ac = true;
                    d.e(c2.H, 2);
                    break;
                }
                case 4: {
                    c2.o = 0;
                    c2.X = (short)-1;
                    c2.y = true;
                    this.b(c2, 9, 0);
                    c2.ac = true;
                    c2.C = 0;
                    d.e(c2.H, 2);
                }
            }
        }
    }

    private void a(c c2) {
        if (c2 == null) {
            return;
        }
        int n = c2.ag & 0xFFFFFF7F;
        int n2 = 0;
        if (c2.K) {
            switch (c2.H[0]) {
                case 5: {
                    if (c2.ap || this.a(this.ay, c2, c2.D, 2) <= 0) break;
                    if (this.bV[this.q][this.bm[22]][0] == 0) {
                        switch (n) {
                            case 11: {
                                this.a(20 + this.bm[22] * 2);
                                break;
                            }
                            case 12: {
                                this.a(22 + this.bm[22] * 2);
                                break;
                            }
                            case 13: {
                                this.a(24 + this.bm[22] * 2);
                                break;
                            }
                            case 14: {
                                this.a(26 + this.bm[22] * 2);
                                break;
                            }
                            case 15: {
                                this.a(28 + this.bm[22] * 2);
                                break;
                            }
                            case 16: {
                                this.a(30 + this.bm[22] * 2);
                                break;
                            }
                            case 17: {
                                this.a(34 + this.bm[22] * 2);
                                break;
                            }
                            case 18: {
                                this.a(38 + this.bm[22] * 2);
                                break;
                            }
                            case 19: {
                                this.a(42 + this.bm[22] * 2);
                            }
                        }
                        c2.ap = true;
                        d.e(c2.H, 0);
                        break;
                    }
                    int[] nArray = new int[]{5, 7, 5, 0, 6};
                    this.e(nArray[c2.q - 11], -1);
                    c2.ap = true;
                    d.e(c2.H, 0);
                    break;
                }
                case 0: {
                    c2.k[11] = true;
                    d.e(c2.H, 1);
                    break;
                }
                case 1: {
                    int n3;
                    byte[][][] byArrayArray = new byte[][][]{new byte[][]{{100}, {50, 50}, {33, 33, 34}, {25, 25, 25, 25}, {20, 20, 20, 20, 20}}, new byte[][]{{16, 16, 17, 17, 17, 17}, {0, 16, 16, 17, 17, 17, 17}, {0, 0, 16, 16, 17, 17, 17, 17}, {0, 0, 0, 16, 16, 17, 17, 17, 17}, {0, 0, 0, 0, 16, 16, 17, 17, 17, 17}}};
                    int n4 = 0;
                    if (c2.ag == 16 || c2.ag == 17 || c2.ag == 18 || c2.ag == 19) {
                        n4 = 1;
                    }
                    if ((n3 = (c2.b[1] - c2.b[0]) * 100 / c2.b[1] / 20) > this.bm[24] && n3 < 5) {
                        this.bm[24] = (short)n3;
                        n2 = byArrayArray[n4][this.bm[24]].length - 1;
                    } else {
                        n2 = this.a(byArrayArray[n4][this.bm[24]]);
                    }
                    this.b(c2, n2, 0);
                    d.e(c2.H, 2);
                    if (c2.r[0] != -1) break;
                    break;
                }
                case 2: {
                    if (c2.H[1] == 4) {
                        this.a((game.a)c2, this.ay);
                        if (c2.E == -1) {
                            c2.K = false;
                            if (this.bV[this.q][this.bm[22]][0] == 1 && this.bV[this.q][this.bm[22]][5] == 0) {
                                this.a(134);
                            }
                        }
                    }
                    if (c2.H[1] == 6) {
                        this.a((game.a)c2, this.ay);
                        if (c2.E != -1) break;
                        d.e(c2.H, 0);
                        this.v = false;
                        this.a(52);
                        break;
                    }
                    this.a((game.a)c2, this.ay);
                    if (c2.E != -1) break;
                    d.e(c2.H, 1);
                    break;
                }
                case 4: {
                    int n5;
                    c2.o = 0;
                    c2.X = (short)-1;
                    c2.y = true;
                    if (this.bV[this.q][this.bm[22]][5] == 0) {
                        c2.U = this.bV[this.q][this.bm[22]][8] == 1 ? (byte)1 : (byte)2;
                        this.b(c2, 11, 0);
                        this.a((game.a)c2, 1);
                    } else {
                        this.b(c2, 10, 0);
                    }
                    c2.ac = true;
                    c2.C = 0;
                    if (c2.n != null && c2.n.length > 0) {
                        for (n5 = 0; n5 < c2.n.length; ++n5) {
                            for (int k = 0; k < c2.n[n5].length; ++k) {
                                c2.n[n5][k][0] = 0;
                                int n6 = n5;
                                c2.c[n6] = (byte)(c2.c[n6] - 1);
                            }
                        }
                    }
                    c2.T = new int[26][12];
                    d.e(c2.H, 2);
                    this.ac();
                    if (this.bV[this.q][this.bm[22]][0] == 0) {
                        this.bV[this.q][this.bm[22]][0] = 1;
                        switch (n) {
                            case 11: {
                                this.a(21 + this.bm[22] * 2);
                                break;
                            }
                            case 12: {
                                this.a(23 + this.bm[22] * 2);
                                if (this.bV[this.q][this.bm[22]][5] != 1) break;
                                this.a(101);
                                this.a(123);
                                break;
                            }
                            case 13: {
                                this.a(25 + this.bm[22] * 2);
                                if (this.bV[this.q][this.bm[22]][5] != 1) break;
                                this.a(99);
                                this.a(124);
                                break;
                            }
                            case 14: {
                                this.a(27 + this.bm[22] * 2);
                                if (this.bV[this.q][this.bm[22]][5] != 1) break;
                                this.a(100);
                                break;
                            }
                            case 15: {
                                this.a(29 + this.bm[22] * 2);
                                if (this.bV[this.q][this.bm[22]][5] != 1) break;
                                this.a(106);
                                break;
                            }
                            case 16: {
                                this.a(31 + this.bm[22] * 2);
                                break;
                            }
                            case 17: {
                                this.a(35 + this.bm[22] * 2);
                                break;
                            }
                            case 18: {
                                this.a(39 + this.bm[22] * 2);
                                break;
                            }
                            case 19: {
                                this.a(43 + this.bm[22] * 2);
                            }
                        }
                    }
                    if (this.bV[this.q][this.bm[22]][6] == 0) {
                        this.bV[this.q][this.bm[22]][6] = 1;
                    }
                    if (this.bV[this.q][this.bm[22]][5] != 1 || n != 16 && n != 17 && n != 18 && n != 19) break;
                    n5 = 1 + this.bV[this.q][this.bm[22]][1] - 11;
                    if (this.cb <= this.ax[n5]) {
                        this.ax[n5] = this.cb;
                        this.bm[63] = 1;
                        if (this.cb < 31000 / G) {
                            switch (n) {
                                case 16: {
                                    this.a(115);
                                    break;
                                }
                                case 17: {
                                    this.a(116);
                                    break;
                                }
                                case 18: {
                                    this.a(117);
                                    break;
                                }
                                case 19: {
                                    this.a(118);
                                }
                            }
                        }
                    } else {
                        this.bm[63] = 0;
                    }
                    this.bm[64] = 40;
                    this.a(98);
                    break;
                }
                case 6: {
                    if (n != 15) break;
                    this.b(c2, 13, 0);
                    d.e(c2.H, 2);
                }
            }
        }
        if (!(c2.k[0] || c2.ag != 16 && c2.ag != 17 && c2.ag != 18 && c2.ag != 19)) {
            ++this.cb;
        }
    }

    public int a(byte[] byArray) {
        int n = -1;
        int n2 = d.i(100);
        int n3 = 0;
        for (int k = 0; k < byArray.length; ++k) {
            if (n2 >= n3 && n2 < n3 + byArray[k]) {
                n3 += byArray[k];
                n = k;
                break;
            }
            n3 += byArray[k];
        }
        return n;
    }

    public int[] d(game.a a2) {
        int n = a2.I;
        int n2 = a2.G;
        int n3 = a2.aa[2];
        int n4 = a2.aa[3];
        int[] nArray = new int[]{0, 0, 0};
        nArray = this.a((long)(n3 - n), (long)(n4 - n2), (long)a2.ar[0]);
        int n5 = a2.P - n3;
        int n6 = a2.z - n4;
        if (n5 * n5 + n6 * n6 <= a2.ar[0] * a2.ar[0]) {
            nArray[2] = 1;
            a2.P = n3;
            a2.z = n4;
        } else {
            a2.P += nArray[0];
            a2.z += nArray[1];
        }
        a2.I = a2.P;
        a2.G = a2.z;
        if (nArray[2] != 1) {
            if (a2.P <= a2.x[0]) {
                a2.P = a2.x[0];
                nArray[2] = 1;
            } else if (a2.P >= a2.x[0] + a2.x[2]) {
                a2.P = a2.x[0] + a2.x[2];
                nArray[2] = 1;
            }
        }
        if (nArray[2] == 1) {
            a2.B = a2.I = a2.P;
            a2.g = a2.I;
            a2.W = a2.G = a2.z;
            a2.at = a2.G;
            a2.o = 0;
            a2.X = (short)-1;
            a2.s = a2.o;
        }
        return nArray;
    }

    private int[] a(long l, long l2, long l3) {
        int[] nArray = new int[]{0, 0, 0};
        int n = d.a(l * l + l2 * l2);
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

    private short a(game.a a2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        short s = 3000;
        int n9 = a2.ag & 0xFFFFFF7F;
        boolean bl = false;
        short[] sArray = null;
        if (a2.b[0] == 0) {
            return s;
        }
        if (n9 == 0) {
            sArray = ((h)a2).J;
        } else if (n9 >= 1) {
            sArray = ((c)a2).J;
        }
        if (sArray[0] >= sArray[1] && a2.b[0] > 0) {
            bl = true;
        }
        if (bl && a2.ap) {
            this.aJ = this.b((i)a2);
            s = (short)this.a(n, n2, n3, n4, this.aJ[0], this.aJ[1], this.aJ[2], this.aJ[3], 4);
        }
        if (s == 1000 && a2.ap) {
            this.bL = this.a(n, n2, n3, n4, this.aJ[0], this.aJ[1], this.aJ[2], this.aJ[3]);
            this.b(a2, n5, n6, n7, n8);
            if (a2.ag >= 1 && a2.ag <= 19) {
                this.ay.k[10] = true;
            }
        }
        return s;
    }

    private void b(game.a a2, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        short[] sArray = null;
        int n7 = a2.ag & 0xFFFFFF7F;
        if (n7 <= 0) {
            sArray = ((h)a2).J;
        } else if (n7 >= 1) {
            sArray = ((c)a2).J;
        }
        long l = 0L;
        a2.k[12] = false;
        this.s = this.a(this.bL);
        this.bm[80] = this.a(this.bm[80], 1, 0, 1);
        if (this.bm[5] == 0) {
            if (a2.ag == 0) {
                l = n * 50 / a2.R[1] - 50;
                if (n2 == 0) {
                    l = l * 30L / 100L;
                } else if (n2 == 3) {
                    l *= 1L;
                } else if (n4 >= 11 && n4 <= 19) {
                    l = l * (long)n3 / 100L;
                }
                if (l < 10L) {
                    l = 10L;
                }
                l = l * (long)(100 + d.s(11)) / 100L;
                if (this.bm[22] >= 0) {
                    for (n6 = 0; n6 < this.bm[24]; ++n6) {
                        l = l * 113L / 100L;
                    }
                }
                if (l > 9999L) {
                    l = 9999L;
                }
                if ((n6 = (int)l * 100 / a2.b[0]) < 1) {
                    this.b(this.aO, this.bm[80], 21, this.s[0], this.s[1], a2.U, 26, 1, 1, -1, 0, 1);
                } else if (n6 >= 1) {
                    this.b(this.aO, this.bm[80], 19, this.s[0], this.s[1], a2.U, 26, 1, 1, -1, 0, 1);
                }
            } else if (a2.ag >= 1 && a2.ag <= 19 && a2.ap) {
                n6 = d.i(100);
                n5 = n;
                l = n5 = n5 * 50 / a2.R[1] - 50;
                if (l < 10L) {
                    l = 10L;
                }
                if (n2 == 2) {
                    if (n6 < this.aA[this.ay.d][1]) {
                        l = l * (long)(this.aA[this.ay.d][2] + this.cz[1]) * (long)this.bo[this.aF[this.ay.d][11]] * (long)(100 + this.cz[4]) / 1000000L;
                        a2.k[12] = true;
                        if (this.bm[55] == 0) {
                            this.bm[1] = 1;
                            this.bm[55] = 25;
                        }
                    } else {
                        l = l * (long)this.bo[this.aF[this.ay.d][11]] * (long)(100 + this.cz[4]) / 10000L;
                    }
                } else if (n2 == 3) {
                    l *= 15L;
                } else if (n6 < this.aA[this.ay.d][1]) {
                    l = l * (long)(this.aA[this.ay.d][2] + this.cz[1]) / 100L;
                    a2.k[12] = true;
                    if (this.bm[55] == 0) {
                        this.bm[1] = 1;
                        this.bm[55] = 25;
                    }
                }
                if ((l = l * (long)(100 + d.s(11)) / 100L) > 9999L) {
                    l = 9999L;
                }
                if (a2.k[12]) {
                    this.b(this.aO, this.bm[80], 20, this.s[0], this.s[1], this.ay.I <= a2.I ? 1 : 2, 26, 1, 1, -1, 0, 1);
                } else {
                    this.b(this.aO, this.bm[80], 19, this.s[0], this.s[1], this.ay.I <= a2.I ? 1 : 2, 26, 1, 1, -1, 0, 1);
                }
            }
        } else if (this.bm[5] == 1) {
            l = n;
            this.b(this.aO, this.bm[80], 19, this.s[0], this.s[1], a2.U, 26, 1, 1, -1, 0, 1);
        }
        if (a2.ag == 0) {
            l -= l * (long)this.cz[3] / 100L;
        } else {
            this.ay.b[0] = (int)((long)this.ay.b[0] + l * (long)this.cz[5] / 100L);
            if (this.ay.b[0] > this.ay.b[1]) {
                this.ay.b[0] = this.ay.b[1];
            }
            this.ay.v[0] = (int)((long)this.ay.v[0] + l * (long)this.cz[5] / 200L);
            if (this.ay.v[0] > this.ay.v[1]) {
                this.ay.v[0] = this.ay.v[1];
            }
        }
        if (this.aV[0] > 0 && this.bm[44] > 0 || this.v) {
            l = 0L;
        }
        a2.J[4] = (short)l;
        if (a2.b[0] > 0) {
            a2.b[0] = a2.b[0] - a2.J[4];
            if (a2.b[0] <= 0) {
                a2.b[0] = 0;
                a2.k[0] = true;
            }
        }
        sArray[0] = 0;
        if (a2.ag == 0) {
            this.a(a2, 0, (int)l, this.s[0], this.s[1]);
        } else if (a2.ag >= 1 && a2.ag <= 19) {
            if (a2.k[12]) {
                this.a(a2, 1, (int)l, this.s[0], this.s[1]);
            } else {
                this.a(a2, 0, (int)l, this.s[0], this.s[1]);
            }
        }
        if (n7 == 0) {
            sArray[1] = 15;
        } else if (a2.b[0] == 0) {
            n6 = a2.an[1];
            n5 = n6 * (100 + this.cz[7]) / 100;
            if (this.ay.a[0] >= a2.a[0] + 10) {
                n5 /= 10;
            } else if (this.ay.a[0] >= a2.a[0]) {
                n5 = n5 * (10 - (this.ay.a[0] - a2.a[0])) / 10;
            }
            if (this.ay.a[0] >= 25 && this.aM[6][3] < this.aM[6][2]) {
                this.K(6);
            } else {
                this.a(this.ay, n5);
            }
            if (this.B[0] < this.B[1]) {
                this.B[0] = this.B[0] + 1;
                if (this.B[0] >= 5000) {
                    this.a(119);
                } else if (this.B[0] >= 1000) {
                    this.a(107);
                }
            }
        }
    }

    private short a(short s, int n, int n2, int n3) {
        short s2 = s;
        if (s < n2 || s > n3) {
            s2 = (short)n2;
        } else if ((s2 = (short)(s2 + n)) > n3) {
            s2 = (short)n2;
        }
        return s2;
    }

    private void a(game.a a2, int n, int n2, int n3, int n4) {
        int n5;
        this.bm[81] = this.a(this.bm[81], 4, 2, 21);
        this.b(this.aO, this.bm[81] + 0, 25, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(this.aO, this.bm[81] + 1, 25, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(this.aO, this.bm[81] + 2, 25, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(this.aO, this.bm[81] + 3, 25, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 8;
        int n10 = 14;
        n6 = d.E(n2);
        if (n == 0) {
            n7 = n3 - (n9 >> 2) * n6;
            for (n5 = 0; n5 < n6; ++n5) {
                n8 = n2 % d.G(n6 + 1 - n5) / d.G(n6 - n5);
                this.b(this.aO, this.bm[81] + n5, 25 + n8, n7 + n5 * n9, n4, 1, 26, 1, 1, -1, 0, 1);
            }
        }
        if (n == 1) {
            n7 = n3 - (n10 >> 2) * n6;
            for (n5 = 0; n5 < n6; ++n5) {
                n8 = n2 % d.G(n6 + 1 - n5) / d.G(n6 - n5);
                this.b(this.aO, this.bm[81] + n5, 35 + n8, n7 + n5 * n10, n4, 1, 26, 1, 1, -1, 0, 1);
            }
        }
    }

    private void d(game.a a2, int n, int n2, int n3, int n4) {
        a2.J[6] = this.a(a2.J[6], 5, 4, 18);
        int n5 = 0;
        if (n == 0) {
            n5 = 55;
        } else if (n == 1) {
            n5 = 66;
        }
        this.b(a2, a2.J[6] + 0, n5, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.J[6] + 1, n5, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.J[6] + 2, n5, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.J[6] + 3, n5, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        this.b(a2, a2.J[6] + 4, n5, n3, n4, 1, 26, 1, 0, -1, 0, 1);
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 38;
        int n11 = 8;
        n6 = d.E(n2);
        n7 = n3 - (n6 * n11 >> 1);
        n8 = n7 + (n10 + n11 >> 1);
        this.b(a2, a2.J[6] + 4, n5, n7, n4, 1, 26, 1, 1, -1, 0, 1);
        for (int k = 0; k < n6; ++k) {
            n9 = n2 % d.G(n6 + 1 - k) / d.G(n6 - k);
            this.b(a2, a2.J[6] + k, n5 + 1 + n9, n8 + k * n11, n4, 1, 26, 1, 1, -1, 0, 1);
        }
    }

    private void a(h h2, int n) {
        int n2;
        h2.an[1] = n2 = this.N(h2.a[0]);
        boolean bl = false;
        if (h2.a[0] < h2.a[1]) {
            if (n > 0) {
                if (n > 9999) {
                    n = 9999;
                }
                this.aJ = this.b((i)h2);
                this.d(h2, 1, n, this.aJ[0] + (this.aJ[2] >> 1) + d.s(4) * 12, this.aJ[1] + 10 + d.s(4) * 6);
                h2.an[0] = h2.an[0] + n;
                if (h2.an[0] >= n2) {
                    h2.a[2] = h2.a[0];
                    h2.b[2] = h2.b[1];
                    h2.v[2] = h2.v[1];
                    h2.R[2] = h2.R[0];
                    h2.N[2] = h2.N[0];
                }
                while (h2.an[0] >= n2) {
                    h2.an[0] = h2.an[0] - n2;
                    if (h2.a[0] >= h2.a[1]) continue;
                    h2.a[0] = h2.a[0] + 1;
                    h2.an[1] = this.N(h2.a[0]);
                    bl = true;
                    n2 = this.N(h2.a[0]);
                    h2.b[1] = h2.b[1] + 10;
                    h2.v[1] = h2.v[1] + 10;
                    h2.R[0] = h2.R[0] + (2 + h2.a[0] / 12);
                    h2.N[0] = h2.N[0] + (2 + h2.a[0] / 6);
                    if (this.u[0] != 0) continue;
                    this.a(130);
                }
            }
            if (bl) {
                this.b(this.ay, 0, 17, 0, 0, this.ay.U, 26, 1, 1, -1, 1, 1);
                h2.b[0] = h2.b[1];
                h2.v[0] = h2.v[1];
            }
        }
    }

    public int N(int n) {
        return 30 + n + n * n * 20;
    }

    private int c(int n) {
        int[] nArray = new int[]{20, 30, 50, 20, 30, 50, 20, 30, 50};
        return nArray[n];
    }

    private void V() {
        if (this.ca == null) {
            this.ca = game.b.a("/data/data/arrow.mid");
        }
        for (int k = 0; k < 3; ++k) {
            if (k < this.ca[this.q][this.L].length) {
                this.b(this.bd, k, this.ca[this.q][this.L][k][2], this.ca[this.q][this.L][k][0] * 20, this.ca[this.q][this.L][k][1] * 20, 1, 26, 1, 1, -1, 0, 0);
                continue;
            }
            this.b(this.bd, k, 0, 0, 0, 1, 26, 1, 0, -1, 0, 0);
        }
        this.ca = null;
    }

    private void g() {
        if (this.bi == null) {
            this.bi = game.b.a("/data/data/roomnpcdata.mid");
        }
        this.bt = null;
        for (int k = 0; k < this.bi[this.q].length; ++k) {
            if (this.bi[this.q].length <= 0 || this.bi[this.q][k][0][0] != this.L) continue;
            this.bt = new game.a[this.bi[this.q][k].length - 1];
            for (int i2 = 1; i2 < this.bi[this.q][k].length; ++i2) {
                this.bt[i2 - 1] = this.a(this.bi[this.q][k][i2][2], this.bi[this.q][k][i2][0] * this.bK, this.bi[this.q][k][i2][1] * this.af, 0, 0, 1);
            }
        }
        this.bi = null;
    }

    private void y() {
        this.ar = null;
        int n = 0;
        for (int k = 0; k < this.Y[this.q].length; ++k) {
            if (this.Y[this.q].length <= 0 || this.Y[this.q][k][0][0] != this.L) continue;
            this.ar = new game.a[this.Y[this.q][k].length - 1];
            for (int i2 = 1; i2 < this.Y[this.q][k].length; ++i2) {
                n = this.z[this.Y[this.q][k][i2][2]][0] == 1 ? 4 * this.Y[this.q][k][i2][2] : (this.z[this.Y[this.q][k][i2][2]][1] == 1 ? 4 * this.Y[this.q][k][i2][2] + 2 : 4 * this.Y[this.q][k][i2][2] + 1);
                this.ar[i2 - 1] = this.a(37, this.Y[this.q][k][i2][0] * this.bK, this.Y[this.q][k][i2][1] * this.af, n, 0, 2);
                this.ar[i2 - 1].u = this.Y[this.q][k][i2][2];
            }
            this.bm[50] = (short)k;
        }
    }

    private void Z() {
        if (this.cn == null) {
            this.cn = game.b.a("/data/data/monsters.mid");
        }
        this.c = new c[this.cn[this.q][this.L].length];
        for (int k = 0; k < this.c.length; ++k) {
            this.b(this.cn[this.q][this.L][k][0]);
            this.R(this.cn[this.q][this.L][k][0]);
            this.c[k] = (c)this.a((int)this.cn[this.q][this.L][k][0], this.cn[this.q][this.L][k][1], this.cn[this.q][this.L][k][2] * this.bK, this.cn[this.q][this.L][k][3] * this.af, this.cn[this.q][this.L][k][4] * this.bK, this.cn[this.q][this.L][k][5] * this.af, this.cn[this.q][this.L][k][6] * this.bK, this.cn[this.q][this.L][k][7] * this.af, (int)this.cn[this.q][this.L][k][8]);
        }
        this.cn = null;
        this.g = false;
    }

    private void E() {
        if (this.by == 1 || this.by == 3) {
            int n = 0;
            int n2 = 0;
            switch (this.q) {
                case 1: {
                    n = 30;
                    n2 = 0;
                    break;
                }
                case 3: {
                    n = 6;
                    n2 = 1;
                    break;
                }
                case 5: {
                    n = 6;
                    n2 = 2;
                    break;
                }
                case 8: {
                    n = 6;
                    n2 = 3;
                }
            }
            this.S = new i[n];
            for (int k = 0; k < this.S.length; ++k) {
                this.S[k] = this.a(40, this.aK[0] + d.i(240), this.aK[1] + d.i(260), n2, 0, 0);
                if (this.by == 3) {
                    this.S[k].ao = d.i(3);
                }
                this.S[k].ar[0] = d.s(3);
            }
        } else {
            this.S = new i[0];
        }
    }

    private void I() {
        this.v = true;
        this.f = false;
        d.a(this.bn, 7);
        d.e(this.u, 0);
        this.b(this.ay, 19, 30, this.ay.I, this.ay.G, this.ay.U, 0, 1, 1, 31, 0, 1);
        this.ay.S = false;
        this.bm[51] = 0;
        this.bm[52] = (short)((this.ar[this.bm[48]].I + this.bZ[this.ar[this.bm[48]].ag][this.ar[this.bm[48]].O[0]][0] - this.ay.I) / 5);
        this.bm[53] = (short)((this.ar[this.bm[48]].G - this.bZ[this.ar[this.bm[48]].ag][this.ar[this.bm[48]].O[0]][1] - this.ay.G) / 5);
        this.b(this.ar[this.bm[48]], 0, 0, this.ay.I, this.ay.G + 60, 1, 32, 1, 0, -1, 1, 0);
    }

    private void s() {
        this.bg = new byte[5];
        this.bb = 0;
        this.bT = new byte[5][4][3];
        this.ba = 0;
    }

    private void m() {
        int n;
        int n2;
        this.bU = this.q;
        this.q = 0;
        this.L = 0;
        this.ay = (h)this.a(0, (byte)1, this.bK * 3, this.af * 3, 0, this.d, this.F, this.d, 1);
        this.ay.an[0] = 0;
        this.ay.an[1] = this.N(this.ay.a[0]);
        this.ay.b[1] = 300;
        this.ay.b[0] = this.ay.b[1];
        this.ay.N[0] = 20;
        this.ay.R[0] = 10;
        this.ay.v[1] = 100;
        this.ay.v[0] = this.ay.v[1];
        this.ay.a[0] = 1;
        this.ay.au[0] = 1000;
        this.ay.U = 1;
        for (n2 = 0; n2 < this.ao.length; ++n2) {
            this.D(n2);
        }
        this.ay.d = 0;
        this.Q(0);
        this.bk = new byte[]{0};
        for (n2 = 0; n2 < this.ch.length; ++n2) {
            this.ch[n2] = 0;
        }
        this.ch[0] = this.aA[this.ao[0][1]][0];
        for (n2 = 0; n2 < this.bV.length; ++n2) {
            if (this.bV[n2].length <= 0) continue;
            for (int k = 0; k < this.bV[n2].length; ++k) {
                this.bV[n2][k][0] = 0;
                this.bV[n2][k][6] = 0;
            }
        }
        for (n2 = 0; n2 < this.x.length; ++n2) {
            this.x[n2] = 0;
        }
        for (n2 = 0; n2 < this.bA.length; ++n2) {
            this.bA[n2] = 0;
        }
        n2 = 0;
        int[] nArray = new int[250];
        this.b(nArray, n2, this.a);
        this.a(nArray, n2, this.aa);
        this.V = new byte[]{3};
        for (n = 0; n < this.bA.length; ++n) {
            this.bA[n] = 0;
        }
        this.bA[this.V[0]] = 1;
        this.bD = new byte[]{3};
        this.l();
        for (n = 0; n < this.ax.length; ++n) {
            this.ax[n] = n >= 1 && n <= 9 ? 22500 : 0;
        }
        for (n = 0; n < this.aj.length; ++n) {
            this.aj[n][0] = n >= 99 && n <= 129 ? 1 : -1;
        }
        for (n = 0; n < this.K.length; ++n) {
            this.K[n][0] = n == 0 || n == 3 || n == 9 ? (short)1 : 0;
        }
        this.I[0] = 0;
        this.I[1] = 0;
        this.B[0] = 0;
        for (n = 0; n < this.z.length; ++n) {
            for (int k = 0; k < this.z[n].length; ++k) {
                this.z[n][k] = (n == 0 || n == 1) && k == 1 ? (byte)1 : 0;
            }
        }
        for (n = 0; n < this.bO.length; ++n) {
            this.bO[n] = 0;
        }
        for (n = 0; n < this.bH.length; ++n) {
            this.bH[n] = n == 0 ? (byte)1 : 0;
        }
    }

    public void j() {
        if (this.bM == 0) {
            byte[] byArray = null;
            byte[] byArray2 = null;
            byte[] byArray3 = null;
            int n = -1;
            switch (this.u[0]) {
                case 1: {
                    if (this.ba != 0 || this.bm[73] != 1) break;
                    byArray3 = this.be;
                    n = 3;
                    break;
                }
                case 14: {
                    break;
                }
                case 11: {
                    switch (this.i[this.bb]) {
                        case 21: {
                            byArray2 = this.i;
                            n = 1;
                            break;
                        }
                        case 22: {
                            if (this.bg[this.bb] != 0) break;
                            byArray = this.bk;
                            byArray2 = this.i;
                            n = 2;
                            break;
                        }
                        case 23: {
                            if (this.bg[this.bb] != 0) break;
                            byArray = this.V;
                            byArray2 = this.i;
                            n = 2;
                            break;
                        }
                        case 24: {
                            byArray = this.ce;
                            byArray2 = this.i;
                            n = 2;
                            break;
                        }
                        case 25: {
                            byArray = this.cj;
                            byArray2 = this.i;
                            n = 2;
                        }
                    }
                    break;
                }
                case 12: {
                    switch (this.aP[this.bb]) {
                        case 27: {
                            if (this.bg[this.bb] != 0 || this.ba != 0) break;
                            byArray = this.aw;
                            byArray2 = this.aP;
                            n = 2;
                            break;
                        }
                        case 28: {
                            if (this.bg[this.bb] != 0 || this.ba != 0) break;
                            byArray = this.M;
                            byArray2 = this.aP;
                            n = 2;
                        }
                    }
                    break;
                }
                case 2: {
                    byArray = this.bu;
                    n = 0;
                    break;
                }
                case 29: {
                    if (this.bg[this.bb] != 0 || this.ba != 0) break;
                    byArray = this.aQ;
                    n = 0;
                    break;
                }
                case 30: {
                    if (this.bg[this.bb] != 0) break;
                    byArray = this.aL;
                    n = 0;
                }
            }
            if ((n == 0 || n == 2) && byArray.length > 0) {
                this.a(byArray, this.cm);
            }
            if ((n == 1 || n == 2) && byArray2.length > 0) {
                this.c(byArray2, this.cm);
            }
            if (n == 3 && byArray3.length > 0) {
                this.b(byArray3, this.cm);
            }
        }
        if (++this.bM >= 4) {
            this.bM = 0;
        }
    }

    public void a(byte[] byArray, int n) {
        if (byArray != null) {
            if (this.m(-1) == 1 || this.m(50) == 1) {
                if (this.bT[this.bb][this.bg[this.bb]][0] > 0) {
                    byte[] byArray2 = this.bT[this.bb][this.bg[this.bb]];
                    byArray2[0] = (byte)(byArray2[0] - 1);
                } else {
                    this.bT[this.bb][this.bg[this.bb]][0] = (byte)(byArray.length - 1);
                }
                this.ac.b();
            }
            if (this.m(-2) == 1 || this.m(56) == 1) {
                if (this.bT[this.bb][this.bg[this.bb]][0] < byArray.length - 1) {
                    byte[] byArray3 = this.bT[this.bb][this.bg[this.bb]];
                    byArray3[0] = (byte)(byArray3[0] + 1);
                } else {
                    this.bT[this.bb][this.bg[this.bb]][0] = 0;
                }
                this.ac.b();
            }
            this.bT[this.bb][this.bg[this.bb]][2] = this.bT[this.bb][this.bg[this.bb]][1];
            this.bT[this.bb][this.bg[this.bb]][1] = byArray[this.bT[this.bb][this.bg[this.bb]][0]];
        }
    }

    public void c(byte[] byArray, int n) {
        if (byArray != null) {
            if (this.m(-3) == 1 || this.m(52) == 1) {
                this.bb = this.bb > 0 ? (byte)(this.bb - 1) : (byte)(byArray.length - 1);
                if (this.u[0] == 11 && this.bg[this.bb] == 0 && this.bb == 1) {
                    this.bT[this.bb][this.bg[this.bb]][0] = (byte)d.a(this.ay.i, this.bk);
                }
                this.ac.b();
            }
            if (this.m(-4) == 1 || this.m(54) == 1) {
                this.bb = this.bb < byArray.length - 1 ? (byte)(this.bb + 1) : (byte)0;
                if (this.u[0] == 11 && this.bg[this.bb] == 0 && this.bb == 1) {
                    this.bT[this.bb][this.bg[this.bb]][0] = (byte)d.a(this.ay.i, this.bk);
                }
                this.ac.b();
            }
        }
    }

    public void b(byte[] byArray, int n) {
        if (byArray != null) {
            if (this.m(-1) == 1 || this.m(50) == 1 || this.m(-3) == 1 || this.m(52) == 1) {
                if (this.bT[this.bb][this.bg[this.bb]][0] > 0) {
                    byte[] byArray2 = this.bT[this.bb][this.bg[this.bb]];
                    byArray2[0] = (byte)(byArray2[0] - 1);
                } else {
                    this.bT[this.bb][this.bg[this.bb]][0] = (byte)(byArray.length - 1);
                }
            }
            if (this.m(-2) == 1 || this.m(56) == 1 || this.m(-4) == 1 || this.m(54) == 1) {
                if (this.bT[this.bb][this.bg[this.bb]][0] < byArray.length - 1) {
                    byte[] byArray3 = this.bT[this.bb][this.bg[this.bb]];
                    byArray3[0] = (byte)(byArray3[0] + 1);
                } else {
                    this.bT[this.bb][this.bg[this.bb]][0] = 0;
                }
            }
            this.bT[this.bb][this.bg[this.bb]][2] = this.bT[this.bb][this.bg[this.bb]][1];
            this.bT[this.bb][this.bg[this.bb]][1] = byArray[this.bT[this.bb][this.bg[this.bb]][0]];
        }
    }

    public void P(int n) {
        if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
            this.c(n, 0);
            this.bl.a(1);
            d d2 = this;
            d2.bl.b();
            this.cw[0] = this.cw[1];
            this.W();
        }
        if (this.m(-7) == 1) {
            this.c(n, 0);
            game.d.b(1);
            d d3 = this;
            d3.bl.b();
            this.cw[0] = this.cw[1];
            this.W();
        }
    }

    private void W() {
        this.cs = new i();
        this.cs.T = new int[3][12];
        this.cs.ag = 39;
        this.R(33);
        this.b(33);
        this.t();
        this.b(this.cs, 0, 0, this.bm[13], this.bm[14], 1, 33, 1, 1, -1, 0, 0);
        this.b(this.cs, 1, 1, this.bm[13], this.bm[14], 1, 33, 1, 1, -1, 0, 0);
        this.b(this.cs, 2, 0, this.bm[13], this.bm[14], 1, 39, 1, 1, -1, 0, 1);
        this.s();
        e e2 = new e(this.T);
        byte[] byArray = new byte[]{-1};
        if (e2.a() == 0) {
            byArray[0] = -1;
        } else {
            byArray = e2.a(1);
        }
        this.bm[34] = byArray[0];
        e2.b();
        e2 = null;
        if (this.bm[34] > 0) {
            this.bT[this.bb][this.bg[this.bb]][0] = 1;
        }
        this.bm[73] = 0;
        d.a(this.bn, 4);
        d.e(this.u, 1);
        this.e(8, -1);
    }

    public void g(int n) {
        if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
            switch (this.bu[this.bT[this.bb][this.bg[this.bb]][0]]) {
                case 26: {
                    d.e(this.u, 0);
                    this.e(this.bz[0][0], -1);
                    this.f = false;
                    break;
                }
                case 20: {
                    this.W();
                    break;
                }
                case 6: {
                    this.k();
                    d.a(this.bn, 4);
                    d.e(this.u, 3);
                    break;
                }
                case 2: {
                    this.k();
                    this.bm[66] = 0;
                    this.bm[67] = 3;
                    this.t();
                    this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    d.a(this.bn, 4);
                    d.e(this.u, 4);
                    break;
                }
                case 30: {
                    this.e(this.bz[0][0], -1);
                    this.f = true;
                    d.a(this.bn, 7);
                    d.e(this.u, 13);
                    this.t();
                    this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 8, 6, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 9, 7, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 10, 8, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.b(this.E, 11, 9, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.bm[17] = (short)(this.aK[0] / 240 + this.bq[this.q][this.L * 3 + 1]);
                    this.bm[18] = (short)(this.aK[1] / 320 + this.bq[this.q][this.L * 3 + 2]);
                    break;
                }
                case 31: {
                    if (this.aM[0][3] < this.aM[0][2]) break;
                    this.K(0);
                    break;
                }
                case 32: {
                    break;
                }
                case 33: {
                    this.bm[46] = 1;
                    this.K(5);
                }
            }
            this.c(n, 0);
        }
        if (this.m(-7) == 1 || this.m(-11) == 1) {
            d.e(this.u, 0);
            this.e(this.bz[0][0], -1);
            this.f = false;
            this.c(n, 0);
        }
    }

    public void l(int n) {
        byte[][] byArrayArray = new byte[][]{{5, 0, 0, 24}, {0, 0, 0, 3}, {2, 0, 0, 25}, {4, 0, 0, 25}, {8, 0, 0, 19}, {4, 0, 0, 24}, {5, 0, 0, 22}, {9, 0, 0, 16}, {8, 0, 0, 21}, {29, 0, 0, 20}};
        if (this.m(50) == 1 || this.m(-1) == 1) {
            if (this.bm[18] < byArrayArray[this.q][0]) {
                this.bm[18] = (short)(this.bm[18] + 1);
            }
        } else if (this.m(56) == 1 || this.m(-2) == 1) {
            if (this.bm[18] > byArrayArray[this.q][1]) {
                this.bm[18] = (short)(this.bm[18] - 1);
            }
        } else if (this.m(52) == 1 || this.m(-3) == 1) {
            if (this.bm[17] > byArrayArray[this.q][2]) {
                this.bm[17] = (short)(this.bm[17] - 1);
            }
        } else if ((this.m(54) == 1 || this.m(-4) == 1) && this.bm[17] < byArrayArray[this.q][3]) {
            this.bm[17] = (short)(this.bm[17] + 1);
        }
        if (this.m(-7) == 1 || this.m(48) == 1 || this.m(-11) == 1) {
            d.a(this.bn, 7);
            d.e(this.u, 0);
            this.f = false;
            this.c(n, 0);
        }
    }

    public void A(int n) {
        block30: {
            if (this.m(-6) != 1 && this.m(-5) != 1 && this.m(53) != 1) break block30;
            this.c(n, 0);
            block0 : switch (this.i[this.bb]) {
                case 22: {
                    switch (this.bg[this.bb]) {
                        case 0: {
                            if (this.ao[this.bk[this.bT[this.bb][0][0]]][0] <= 0) break;
                            if (this.ay.i != this.bk[this.bT[this.bb][0][0]]) {
                                this.Q(this.bk[this.bT[this.bb][0][0]]);
                                this.bg[this.bb] = 3;
                                this.ba = 0;
                                break;
                            }
                            this.bg[this.bb] = 3;
                            this.ba = 1;
                            break;
                        }
                        case 3: {
                            this.bg[this.bb] = 0;
                            this.ba = 0;
                        }
                    }
                    break;
                }
                case 23: {
                    switch (this.bg[this.bb]) {
                        case 0: {
                            if (this.V[this.bT[this.bb][0][0]] >= 3 && this.V[this.bT[this.bb][0][0]] <= 8 && this.bA[this.V[this.bT[this.bb][0][0]]] > 0) {
                                if (this.V[this.bT[this.bb][0][0]] >= 3 && this.V[this.bT[this.bb][0][0]] <= 5) {
                                    if (this.ay.b[0] < this.ay.b[1]) {
                                        this.bg[this.bb] = 2;
                                        break block0;
                                    }
                                    this.bg[this.bb] = 3;
                                    this.ba = 1;
                                    break block0;
                                }
                                if (this.V[this.bT[this.bb][0][0]] == 6) {
                                    if (this.ay.v[0] < this.ay.v[1]) {
                                        this.bg[this.bb] = 2;
                                        break block0;
                                    }
                                    this.bg[this.bb] = 3;
                                    this.ba = 1;
                                    break block0;
                                }
                                if (this.V[this.bT[this.bb][0][0]] == 7) {
                                    this.bg[this.bb] = 2;
                                    break block0;
                                }
                                if (this.V[this.bT[this.bb][0][0]] == 8) {
                                    if (this.q == 1) {
                                        this.bg[this.bb] = 3;
                                        this.ba = 1;
                                        break block0;
                                    }
                                    this.bg[this.bb] = 2;
                                    break block0;
                                }
                            }
                            break block30;
                        }
                        case 2: {
                            this.x(this.V[this.bT[this.bb][0][0]]);
                            if (this.V[this.bT[this.bb][0][0]] == 8) {
                                this.bg[this.bb] = 0;
                                this.ba = 0;
                                d.a(this.bn, 7);
                                d.e(this.u, 0);
                                this.f = false;
                                this.v = true;
                                this.R[1] = 0xFFFFFF;
                                this.bm[70] = 256;
                                this.cv = 1;
                                break block0;
                            }
                            this.bg[this.bb] = 3;
                            this.ba = 0;
                            break block0;
                        }
                        case 3: {
                            this.bg[this.bb] = 0;
                            this.ba = 0;
                        }
                    }
                }
            }
        }
        if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(-7, 0);
            this.c(-11, 0);
            switch (this.bg[this.bb]) {
                case 0: {
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                    this.e(this.bz[0][0], -1);
                    this.f = false;
                    break;
                }
                case 1: {
                    this.bg[this.bb] = 0;
                    break;
                }
                case 2: {
                    if (this.i[this.bb] == 22) {
                        this.bg[this.bb] = 1;
                    }
                    if (this.i[this.bb] != 23) break;
                    this.bg[this.bb] = 0;
                }
            }
        }
    }

    public void r(int n) {
        block75: {
            block74: {
                byte by;
                if (this.aP[this.bb] == 27 && this.bg[this.bb] == 1 && this.ba == 0) {
                    if (this.m(-3) == 1 || this.m(52) == 1) {
                        this.c(n, 0);
                        if (this.bm[8] > 1) {
                            this.bm[8] = (short)(this.bm[8] - 1);
                        }
                    } else if (this.m(-4) == 1 || this.m(54) == 1) {
                        this.c(n, 0);
                        by = this.aw[this.bT[this.bb][0][0]];
                        if (this.bA[by] + this.bm[8] < 999 && this.bm[8] < 99) {
                            this.bm[8] = (short)(this.bm[8] + 1);
                        }
                    } else if (this.m(-1) == 1 || this.m(50) == 1) {
                        this.c(n, 0);
                        by = this.aw[this.bT[this.bb][0][0]];
                        if (this.bA[by] + this.bm[8] < 999 && this.bm[8] < 99) {
                            int n2 = 10;
                            int n3 = 10;
                            int n4 = 10;
                            if (this.bA[by] + this.bm[8] < 999 && this.bA[by] + this.bm[8] + 10 > 999) {
                                n3 = 999 - (this.bA[by] + this.bm[8]);
                            }
                            if (this.bm[8] < 99 && this.bm[8] + 10 > 99) {
                                n4 = 99 - this.bm[8];
                            }
                            if (n2 > n3) {
                                n2 = n3;
                            }
                            if (n2 > n4) {
                                n2 = n4;
                            }
                            this.bm[8] = (short)(this.bm[8] + n2);
                        }
                    } else if (this.m(-2) == 1 || this.m(56) == 1) {
                        this.c(n, 0);
                        if (this.bm[8] > 1) {
                            this.bm[8] = (short)(this.bm[8] - 10);
                            if (this.bm[8] < 1) {
                                this.bm[8] = 1;
                            }
                        }
                    }
                }
                if (this.aP[this.bb] == 28 && this.bg[this.bb] == 1 && this.ba == 0) {
                    if (this.m(-3) == 1 || this.m(52) == 1) {
                        this.c(n, 0);
                        if (this.bm[8] > 1) {
                            this.bm[8] = (short)(this.bm[8] - 1);
                        }
                    } else if (this.m(-4) == 1 || this.m(54) == 1) {
                        this.c(n, 0);
                        by = this.M[this.bT[this.bb][0][0]];
                        if (this.bm[8] < this.bA[by]) {
                            this.bm[8] = (short)(this.bm[8] + 1);
                        }
                    } else if (this.m(-1) == 1 || this.m(50) == 1) {
                        this.c(n, 0);
                        by = this.M[this.bT[this.bb][0][0]];
                        this.bm[8] = this.bm[8] < this.bA[by] - 10 ? (short)(this.bm[8] + 10) : (short)this.bA[by];
                    } else if (this.m(-2) == 1 || this.m(56) == 1) {
                        this.c(n, 0);
                        this.bm[8] = this.bm[8] > 10 ? (short)(this.bm[8] - 10) : (short)1;
                    }
                }
                if (this.m(-6) != 1 && this.m(-5) != 1 && this.m(53) != 1) break block74;
                this.c(n, 0);
                block0 : switch (this.aP[this.bb]) {
                    case 27: {
                        switch (this.bg[this.bb]) {
                            case 0: {
                                if (this.ba == 0) {
                                    this.bm[8] = 1;
                                    this.bg[this.bb] = 1;
                                    if (this.ay.au[0] >= this.a(this.aw[this.bT[this.bb][0][0]], (int)this.bm[8])) {
                                        if (this.aw[this.bT[this.bb][0][0]] <= 8 && this.bA[this.aw[this.bT[this.bb][0][0]]] >= 999 || this.aw[this.bT[this.bb][0][0]] >= 31 && this.bk.length >= 30) {
                                            this.ba = (byte)2;
                                            this.bg[this.bb] = 3;
                                            break block0;
                                        }
                                        if (this.aw[this.bT[this.bb][0][0]] < 9) break;
                                        this.ay.au[1] = this.a(this.aw[this.bT[this.bb][0][0]], (int)this.bm[8]);
                                        this.ba = 1;
                                        break block0;
                                    }
                                    this.ba = 1;
                                    this.bg[this.bb] = 3;
                                    break block0;
                                }
                                if (this.ba != 1) break;
                                this.bm[8] = 1;
                                this.ba = 0;
                                this.bg[this.bb] = 1;
                                break block0;
                            }
                            case 1: {
                                if (this.ba == 0) {
                                    this.ay.au[1] = this.a(this.aw[this.bT[this.bb][0][0]], (int)this.bm[8]);
                                    this.ba = 1;
                                    break block0;
                                }
                                if (this.ba != 1) break;
                                if (this.ay.au[0] < this.a(this.aw[this.bT[this.bb][0][0]], (int)this.bm[8])) {
                                    this.K(1);
                                    break block0;
                                }
                                this.ay.au[0] = this.ay.au[0] - this.ay.au[1];
                                if (this.aw[this.bT[this.bb][0][0]] >= 9 && this.aw[this.bT[this.bb][0][0]] <= 13) {
                                    int n5 = 11 + (this.aw[this.bT[this.bb][0][0]] - 9);
                                    this.ax[n5] = this.ax[n5] + 1;
                                }
                                this.a((int)this.aw[this.bT[this.bb][0][0]], (int)this.bm[8], 0);
                                if (this.aw[this.bT[this.bb][0][0]] >= 31 && this.aw[this.bT[this.bb][0][0]] <= 40) {
                                    this.ch[this.bm[12]] = this.aA[this.ao[this.bm[12]][1]][0];
                                }
                                this.ba = 0;
                                this.bg[this.bb] = 3;
                                break block0;
                            }
                            case 2: {
                                break block0;
                            }
                            case 3: {
                                if (this.ba == 1) {
                                    this.K(1);
                                }
                                this.ba = 0;
                                this.bg[this.bb] = 0;
                            }
                        }
                        break;
                    }
                    case 28: {
                        switch (this.bg[this.bb]) {
                            case 0: {
                                this.bm[8] = 1;
                                if (this.bT[this.bb][0][0] < this.bD.length) {
                                    this.bg[this.bb] = 1;
                                    this.ba = 0;
                                    break block0;
                                }
                                if (this.ay.i != this.M[this.bT[this.bb][0][0]]) {
                                    this.ay.au[1] = this.a(1, this.M[this.bT[this.bb][0][0]], (int)this.bm[8]);
                                    this.bg[this.bb] = 1;
                                    this.ba = 1;
                                    break block0;
                                }
                                this.bg[this.bb] = 3;
                                this.ba = 1;
                                break block0;
                            }
                            case 1: {
                                if (this.ba == 0) {
                                    this.ay.au[1] = this.a(0, this.M[this.bT[this.bb][0][0]], (int)this.bm[8]);
                                    this.ba = 1;
                                    break block0;
                                }
                                if (this.ba == 1) {
                                    this.ay.au[0] = this.ay.au[0] + this.ay.au[1];
                                    if (this.bT[this.bb][0][0] < this.bD.length) {
                                        byte by2 = this.M[this.bT[this.bb][0][0]];
                                        this.bA[by2] = this.bA[by2] - this.bm[8];
                                        if (this.bA[this.M[this.bT[this.bb][0][0]]] == 0) {
                                            this.bD = this.a(this.bD, (int)this.M[this.bT[this.bb][0][0]], 0, 0);
                                        }
                                    } else {
                                        this.bk = this.a(this.bk, this.ao, 0, (int)this.M[this.bT[this.bb][0][0]]);
                                    }
                                    this.l();
                                    if (this.bT[this.bb][0][0] >= this.M.length) {
                                        this.bT[this.bb][0][0] = 0;
                                    }
                                    this.bg[this.bb] = 3;
                                    this.ba = 0;
                                    break block0;
                                }
                                break block75;
                            }
                            case 2: {
                                break block0;
                            }
                            case 3: {
                                this.ba = 0;
                                this.bg[this.bb] = 0;
                            }
                        }
                    }
                }
                break block75;
            }
            if (this.m(-7) == 1 || this.m(-11) == 1) {
                this.c(-7, 0);
                this.c(-11, 0);
                switch (this.bg[this.bb]) {
                    case 0: {
                        d.a(this.bn, 7);
                        d.e(this.u, 0);
                        this.e(this.bz[0][0], -1);
                        this.f = false;
                        break;
                    }
                    case 1: {
                        if (this.aP[this.bb] == 27) {
                            if (this.ba == 0) {
                                this.bg[this.bb] = 0;
                                break;
                            }
                            if (this.ba != 1) break;
                            if (this.aw[this.bT[this.bb][0][0]] >= 9) {
                                this.ba = 0;
                                this.bg[this.bb] = 0;
                                break;
                            }
                            this.ba = 0;
                            break;
                        }
                        if (this.aP[this.bb] != 28) break;
                        if (this.ba == 0) {
                            this.bg[this.bb] = 0;
                            break;
                        }
                        if (this.ba != 1) break;
                        if (this.bT[this.bb][0][0] >= this.bD.length) {
                            this.ba = 0;
                            this.bg[this.bb] = 0;
                            break;
                        }
                        this.ba = 0;
                        break;
                    }
                    case 2: {
                        if (this.aP[this.bb] == 27) {
                            this.ba = 0;
                            this.bg[this.bb] = 1;
                            break;
                        }
                        if (this.aP[this.bb] != 28) break;
                        this.ba = 0;
                        this.bg[this.bb] = 1;
                    }
                }
            } else if (this.m(48) == 1) {
                this.c(48, 0);
                if (this.aP[this.bb] == 27 && this.bg[this.bb] == 0 && this.ba == 0) {
                    this.K(1);
                }
            }
        }
    }

    public int a(byte by, int n) {
        int n2 = 0;
        if (by >= 9 && by <= 13) {
            int[] nArray = new int[]{200, 200, 100, 100, 1000};
            n2 = this.bw[by] + this.ax[11 + by - 9] * nArray[by - 9];
        } else {
            n2 = this.bw[by] * n;
        }
        if (this.aM[5][3] >= this.aM[5][2]) {
            n2 /= 2;
        }
        return n2;
    }

    public int a(int n, byte by, int n2) {
        int n3 = 0;
        if (n == 0) {
            n3 = (this.bw[by] >> 1) * n2;
        } else if (n == 1) {
            n3 = this.bw[31 + this.ao[by][1]] * this.ao[by][2] / 24;
        }
        return n3;
    }

    public int f(int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        switch (this.ac.a(n, 0)) {
            case 0: {
                n3 = 0;
                break;
            }
            case 65280: {
                n3 = 1;
                break;
            }
            case 255: {
                n3 = 2;
                break;
            }
            case 0xFF00FF: {
                n3 = 3;
            }
        }
        switch (this.aF[n][0]) {
            case 0: {
                n4 = 40;
                break;
            }
            case 1: {
                n4 = 60;
                break;
            }
            case 2: {
                n4 = 80;
            }
        }
        return (n2 + n3) * n4 / 2;
    }

    private void D(int n) {
        if (n == 0) {
            this.ao[n][0] = 1;
            this.ao[n][1] = 0;
            this.ao[n][2] = 4;
            this.ao[n][3] = 1;
            this.ao[n][4] = 16;
            this.ao[n][5] = 1;
            this.ao[n][6] = 25;
            this.ao[n][7] = 1;
            this.ao[n][8] = 10;
            this.x[n] = 0;
        } else {
            this.ao[n][0] = 0;
            this.ao[n][1] = 0;
            this.ao[n][2] = 1;
            this.ao[n][3] = 0;
            this.ao[n][4] = -1;
            this.ao[n][5] = 0;
            this.ao[n][6] = -1;
            this.ao[n][7] = 0;
            this.ao[n][8] = -1;
            this.x[n] = 0;
        }
    }

    private byte[] a(byte[] byArray, byte[][] byArray2, int n, int n2) {
        byte[] byArray3 = null;
        if (n == 0) {
            int n3;
            byArray3 = new byte[byArray.length - 1];
            int n4 = d.a((byte)n2, byArray);
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
            this.D(n2);
        } else if (n == 1) {
            int n6;
            int n7;
            if (byArray.length >= this.aR) {
                this.bm[78] = -1;
                return byArray;
            }
            for (n7 = 0; n7 < byArray2.length; ++n7) {
                if (byArray2[n7][0] != 0) continue;
                this.bm[12] = (short)n7;
                break;
            }
            byArray3 = new byte[byArray.length + 1];
            n7 = byArray.length;
            int n8 = byArray.length;
            for (n6 = 0; n6 < byArray.length; ++n6) {
                if (this.a(n2, 3) < this.a((int)byArray2[byArray[n6]][1], 3)) {
                    n7 = 0;
                    break;
                }
                if (byArray2[byArray[n6]][0] != 1 || n6 == byArray.length - 1 || this.a(n2, 3) < this.a((int)byArray2[byArray[n6]][1], 3) || this.a(n2, 3) >= this.a((int)byArray2[byArray[n6 + 1]][1], 3)) continue;
                n7 = n6 + 1;
                break;
            }
            for (n6 = 0; n6 < n7; ++n6) {
                byArray3[n6] = byArray[n6];
            }
            for (n6 = n8; n6 > n7; --n6) {
                byArray3[n6] = byArray[n6 - 1];
            }
            byArray3[n7] = (byte)this.bm[12];
            this.D(this.bm[12]);
            byArray2[this.bm[12]][0] = 1;
            byArray2[this.bm[12]][1] = (byte)n2;
            this.bm[78] = this.bm[12];
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
                if (this.a(n, n3) < this.a((int)byArray[n7], n3)) {
                    n4 = n7;
                    break;
                }
                if (n7 == byArray.length - 1 && this.a(n, n3) > this.a((int)byArray[n7], n3)) {
                    n4 = n7 + 1;
                    break;
                }
                if (this.a(n, n3) <= this.a((int)byArray[n7], n3) || this.a(n, n3) >= this.a((int)byArray[n7 + 1], n3)) continue;
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

    private int[] c(int[] nArray, int n, int n2, int n3) {
        int[] nArray2 = null;
        int n4 = nArray.length;
        int n5 = nArray.length;
        if (n2 == 0) {
            int n6;
            nArray2 = new int[nArray.length - 1];
            for (n6 = 0; n6 < nArray.length; ++n6) {
                if (nArray[n6] != n) continue;
                n4 = n6;
                break;
            }
            if (n4 == nArray.length) {
                return nArray;
            }
            for (n6 = 0; n6 < n4; ++n6) {
                nArray2[n6] = nArray[n6];
            }
            for (n6 = n4; n6 < nArray2.length; ++n6) {
                nArray2[n6] = nArray[n6 + 1];
            }
        } else {
            int n7;
            nArray2 = new int[nArray.length + 1];
            for (n7 = 0; n7 < nArray.length; ++n7) {
                if (n == nArray[n7]) {
                    return nArray;
                }
                if (this.a(n, n3) < this.a(nArray[n7], n3)) {
                    n4 = n7;
                    break;
                }
                if (n7 == nArray.length - 1 && this.a(n, n3) > this.a(nArray[n7], n3)) {
                    n4 = n7 + 1;
                    break;
                }
                if (this.a(n, n3) <= this.a(nArray[n7], n3) || this.a(n, n3) >= this.a(nArray[n7 + 1], n3)) continue;
                n4 = n7 + 1;
                break;
            }
            for (n7 = 0; n7 < n4; ++n7) {
                nArray2[n7] = nArray[n7];
            }
            for (n7 = n5; n7 > n4; --n7) {
                nArray2[n7] = nArray[n7 - 1];
            }
            nArray2[n4] = n;
        }
        return nArray2;
    }

    private void a(int n, int n2, int n3) {
        switch (n3) {
            case 0: {
                if (n >= 3 && n <= 8 || n >= 14 && n <= 30) {
                    if (d.a((byte)n, this.V) < 0) {
                        this.V = this.a(this.V, n, 1, n3);
                    }
                    if (n >= 3 && n <= 8) {
                        this.bD = this.a(this.bD, n, 1, n3);
                        this.l();
                    }
                    int n4 = n;
                    this.bA[n4] = this.bA[n4] + n2;
                    if (this.bA[n] > 999) {
                        this.bA[n] = 999;
                    }
                }
                if (n >= 31 && n <= 40) {
                    this.bk = this.a(this.bk, this.ao, 1, n - 31);
                    if (this.bH[this.ao[this.bm[12]][1]] == 0) {
                        this.bH[this.ao[this.bm[12]][1]] = 1;
                    }
                    if (this.x() >= 90) {
                        this.a(114);
                    }
                    if (this.x() >= 80) {
                        this.a(128);
                    }
                    this.l();
                }
                if (n == 9) {
                    this.ay.N[0] = this.ay.N[0] + 10;
                    break;
                }
                if (n == 10) {
                    this.ay.R[0] = this.ay.R[0] + 5;
                    break;
                }
                if (n == 11) {
                    this.ay.b[1] = this.ay.b[1] + 20;
                    break;
                }
                if (n == 12) {
                    this.ay.v[1] = this.ay.v[1] + 10;
                    break;
                }
                if (n == 13) {
                    this.ay.a[2] = this.ay.a[0];
                    this.ay.b[2] = this.ay.b[1];
                    this.ay.v[2] = this.ay.v[1];
                    this.ay.R[2] = this.ay.R[0];
                    this.ay.N[2] = this.ay.N[0];
                    this.ay.a[0] = this.ay.a[0] + 1;
                    this.ay.b[1] = this.ay.b[1] + 20;
                    this.ay.v[1] = this.ay.v[1] + 10;
                    this.ay.R[0] = this.ay.R[0] + (2 + this.ay.a[0] / 12);
                    this.ay.N[0] = this.ay.N[0] + (2 + this.ay.a[0] / 6);
                    this.b(this.ay, 0, 17, 0, 0, this.ay.U, 26, 1, 1, -1, 1, 1);
                    this.ay.b[0] = this.ay.b[1];
                    this.ay.v[0] = this.ay.v[1];
                    if (this.u[0] != 0) break;
                    this.a(130);
                    break;
                }
                if (n < 0 || n > 2) break;
                int[] nArray = new int[]{1, 10, 100};
                this.ay.au[1] = nArray[n] * (100 + this.cz[6]) / 100;
                if (this.ay.au[1] > 9999) {
                    this.ay.au[1] = 9999;
                }
                this.ay.au[0] = this.ay.au[0] + this.ay.au[1];
                this.aJ = this.b((i)this.ay);
                this.d(this.ay, 0, this.ay.au[1], this.aJ[0] + (this.aJ[2] >> 1), this.aJ[1] + 10);
            }
        }
    }

    private int a(int n, int n2) {
        int n3 = -1;
        switch (n2) {
            case 0: {
                int[] nArray = new int[]{3, 4, 5, 6, 7, 8, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
                n3 = d.a(n, nArray);
                break;
            }
            case 1: {
                int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
                n3 = d.a((int)this.aj[n][3], nArray);
                break;
            }
            case 3: {
                int[] nArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                n3 = d.a(n, nArray);
            }
        }
        return n3;
    }

    public int x() {
        int n = 0;
        for (int k = 0; k < this.bH.length; ++k) {
            n += this.bH[k];
        }
        return n * 10;
    }

    public int J() {
        int n = 0;
        for (int k = 0; k < this.z.length; ++k) {
            n += this.z[k][0];
        }
        return n * 100 / this.z.length;
    }

    public int c() {
        int n = 0;
        for (int k = 0; k < this.bO.length; ++k) {
            n += this.bO[k];
        }
        return n;
    }

    public int O() {
        int n = 0;
        for (int k = 0; k < this.K.length; ++k) {
            n += this.K[k][0];
        }
        return n * 100 / this.K.length;
    }

    private void x(int n) {
        if (this.bA[n] > 0) {
            switch (n) {
                case 3: {
                    this.ay.b[0] = this.ay.b[0] + 100;
                    int n2 = n;
                    this.bA[n2] = this.bA[n2] - 1;
                    break;
                }
                case 4: {
                    this.ay.b[0] = this.ay.b[0] + 300;
                    int n3 = n;
                    this.bA[n3] = this.bA[n3] - 1;
                    break;
                }
                case 5: {
                    this.ay.b[0] = this.ay.b[0] + 600;
                    int n4 = n;
                    this.bA[n4] = this.bA[n4] - 1;
                    break;
                }
                case 6: {
                    this.ay.v[0] = this.ay.v[0] + 200;
                    int n5 = n;
                    this.bA[n5] = this.bA[n5] - 1;
                    break;
                }
                case 7: {
                    this.ay.v[0] = this.ay.v[1];
                    this.bm[6] = (short)(30000 / cr);
                    int n6 = n;
                    this.bA[n6] = this.bA[n6] - 1;
                    break;
                }
                case 8: {
                    int n7 = n;
                    this.bA[n7] = this.bA[n7] - 1;
                }
            }
            if (this.ay.b[0] > this.ay.b[1]) {
                this.ay.b[0] = this.ay.b[1];
            }
            if (this.ay.v[0] > this.ay.v[1]) {
                this.ay.v[0] = this.ay.v[1];
            }
            if (this.bA[n] == 0) {
                this.bD = this.a(this.bD, n, 0, 0);
            }
        }
    }

    private void t() {
        this.bm[13] = (short)(this.aK[0] + this.bm[19]);
        this.bm[14] = (short)(this.aK[1] + this.bm[20] + 290);
    }

    private void L() {
        int n;
        int n2;
        if (this.bn[0] == 4 && this.u[0] == 1 && this.cs != null) {
            for (n2 = 0; n2 < this.cs.T.length; ++n2) {
                this.a(this.cs.T[n2], this.cs);
            }
        }
        if ((this.u[0] != 0 || this.aV[0] != 0 && this.aj[this.aV[0]][3] <= 43) && this.E != null && this.cy[26] != null) {
            for (n2 = 0; n2 < this.E.T.length; ++n2) {
                this.a(this.E.T[n2], this.E);
            }
        }
        if (this.bd != null && this.cy[26] != null) {
            for (n2 = 0; n2 < this.bd.T.length; ++n2) {
                this.a(this.bd.T[n2], this.bd);
            }
        }
        if (this.aO != null) {
            for (n2 = 0; n2 < this.aO.T.length; ++n2) {
                this.a(this.aO.T[n2], this.aO);
            }
        }
        if (this.bt != null) {
            for (n2 = 0; n2 < this.bt.length; ++n2) {
                for (n = 0; n < this.bt[n2].T.length; ++n) {
                    this.a(this.bt[n2].T[n], this.bt[n2]);
                }
            }
        }
        if (this.ar != null) {
            for (n2 = 0; n2 < this.ar.length; ++n2) {
                for (n = 0; n < this.ar[n2].T.length; ++n) {
                    this.a(this.ar[n2].T[n], this.ar[n2]);
                }
            }
        }
    }

    private void o() {
        int n;
        if (this.ay != null && this.cy[this.ay.ag] != null) {
            for (n = 0; n < this.ay.T.length; ++n) {
                this.a(this.ay.T[n], (i)this.ay);
            }
        }
        if (this.c != null) {
            for (n = 0; n < this.c.length; ++n) {
                int n2;
                if (this.c[n] != null && this.c[n].T != null) {
                    for (n2 = 0; n2 < this.c[n].T.length; ++n2) {
                        this.a(this.c[n].T[n2], (i)this.c[n]);
                    }
                }
                if (this.c[n].w == null) continue;
                for (n2 = 0; n2 < this.c[n].w.length; ++n2) {
                    if (this.c[n].w[n2] == null) continue;
                    for (int k = 0; k < this.c[n].w[n2].length; ++k) {
                        if (this.c[n].w[n2][k] == null) continue;
                        this.a(this.c[n].w[n2][k].T[0], (i)this.c[n].w[n2][k]);
                    }
                }
            }
        }
    }

    private void a(int[] nArray, i i2) {
        if (nArray[8] > 0) {
            int n = this.ck[nArray[0]][nArray[1]].length - 1;
            nArray[3] = nArray[3] + 1;
            if (nArray[3] >= this.ck[nArray[0]][nArray[1]][nArray[2]][0]) {
                nArray[2] = nArray[2] + 1;
                if (nArray[2] > n - 1) {
                    if (this.ck[nArray[0]][nArray[1]][n][0] > 0 && (nArray[4] = nArray[4] + 1) >= this.ck[nArray[0]][nArray[1]][n][0]) {
                        nArray[4] = 0;
                        nArray[8] = 0;
                        if (this.bm[32] == 1) {
                            this.bm[32] = 0;
                        }
                        if (nArray[10] >= 0) {
                            this.a(nArray, nArray[10], nArray[5], nArray[6], nArray[7], nArray[0], 1, 1, -1, 0, 0);
                        }
                    }
                    nArray[2] = 0;
                }
                nArray[3] = 0;
            }
            if (this.ck[nArray[0]][nArray[1]][nArray[2]][0] == 0) {
                if (nArray[0] == 26 && nArray[1] == 10) {
                    this.bm[1] = 1;
                } else if (nArray[0] == 27) {
                    if (nArray[1] == 5) {
                        this.bm[47] = 1;
                        this.bm[68] = 5;
                        this.t();
                        this.b(this.E, 7, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    }
                } else if (nArray[0] == 28) {
                    if (this.u[0] != 19 && this.bm[58] == 0 && nArray[1] >= 23 && nArray[1] <= 25) {
                        this.x(this.bm[69]);
                        this.bm[79] = this.bm[69];
                        this.bm[61] = 0;
                        this.b(this.bd, 7, 77, 0, 0, 1, 26, 1, 1, -1, 1, 1);
                        switch (this.bm[69]) {
                            case 3: {
                                this.a(94);
                                break;
                            }
                            case 4: {
                                this.a(95);
                                break;
                            }
                            case 5: {
                                this.a(96);
                            }
                        }
                    } else if (this.u[0] != 19 && this.bm[58] == 0 && nArray[1] == 26) {
                        this.x(this.bm[75]);
                        this.bm[79] = this.bm[75];
                        this.bm[76] = 0;
                        this.b(this.bd, 7, 77, 0, 0, 1, 26, 1, 1, -1, 1, 1);
                        if (this.bm[75] == 6) {
                            this.a(97);
                        }
                    }
                } else if (nArray[0] == 0) {
                    if (nArray[1] == 31) {
                        this.b(this.ay, 19, 30, this.ay.I, this.ay.G, this.ay.U, 0, 1, 0, 31, 0, 1);
                        this.v = true;
                        this.R[1] = 0xFFFFFF;
                        this.bm[70] = 256;
                        this.cv = this.am[this.Y[this.q][this.bm[50]][this.bm[48] + 1][2]];
                    }
                } else if (nArray[0] == 39 && nArray[1] == 0) {
                    if (this.bn[0] == 7) {
                        this.v = false;
                        this.f = false;
                        d.a(this.bn, 7);
                        d.e(this.u, 0);
                        this.t();
                        this.b(this.bd, 9, 0, this.bm[13], this.bm[14], 1, 39, 1, 0, -1, 0, 0);
                        if (this.ax[17] == 0) {
                            this.ax[17] = 1;
                            this.a(53);
                        }
                    } else if (this.bn[0] == 4) {
                        this.bm[73] = 1;
                    }
                }
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
                n5 = n7 * game.b.d(2, 16) / n8;
                if (bl) break block4;
                for (int k = 0; k < 24; ++k) {
                    if (n5 == bW[k][1]) {
                        return k;
                    }
                    if (n5 <= bW[k][1] || n5 >= bW[k + 1][1]) continue;
                    return k;
                }
                break block5;
            }
            if (!bl) break block5;
            for (int k = 6; k <= 18; ++k) {
                if (n5 == bW[k][1]) {
                    return k;
                }
                if (n5 >= bW[k][1] || n5 <= bW[k + 1][1]) continue;
                return k;
            }
        }
        return -1;
    }

    private int[] a(int[] nArray) {
        int[] nArray2 = new int[]{0, 0};
        nArray2[0] = nArray[2] > 0 ? nArray[0] + d.i(nArray[2]) : nArray[0];
        nArray2[1] = nArray[3] > 0 ? nArray[1] - d.i(nArray[3]) : nArray[1];
        return nArray2;
    }

    private void X() {
        int n;
        int n2;
        this.ay = null;
        int[] nArray = new int[1081];
        int n3 = 1 + nArray.length * 4;
        byte[] byArray = new byte[n3];
        byte[] byArray2 = new byte[4];
        e e2 = new e(this.T);
        if (e2.a() == 0) {
            byArray[0] = -1;
            e2.a(byArray, 0, byArray.length);
        } else {
            byArray = e2.a(1);
            if (byArray.length != n3) {
                byArray = new byte[n3];
                byArray[0] = -1;
                e2.a(1, byArray, 0, byArray.length);
            }
        }
        this.bm[34] = byArray[0];
        e2.b();
        e2 = null;
        int n4 = 1;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            for (n = 0; n < byArray2.length; ++n) {
                byArray2[n] = byArray[n4++];
            }
            nArray[n2] = (int)game.b.b(byArray2);
        }
        n2 = 0;
        this.q = nArray[n2++];
        this.L = nArray[n2++];
        n2 = this.a(nArray, n2, this.bV, 0);
        n2 = this.a(nArray, n2, this.bV, 6);
        n2 = this.b(nArray, n2, this.ao);
        for (n4 = 0; n4 < this.x.length; ++n4) {
            this.x[n4] = nArray[n2++];
        }
        for (n4 = 0; n4 < this.ch.length; ++n4) {
            this.ch[n4] = nArray[n2++];
        }
        for (n4 = 0; n4 < this.ax.length; ++n4) {
            this.ax[n4] = nArray[n2++];
        }
        this.bk = this.a(nArray, n2, (int)this.aR);
        this.V = this.a(nArray, n2 += this.aR, (int)this.aC);
        this.bD = this.a(nArray, n2 += this.aC, (int)this.ap);
        n2 += this.ap;
        for (n4 = 0; n4 < this.bA.length; ++n4) {
            this.bA[n4] = nArray[n2++];
        }
        d.D[0] = nArray[n2++];
        d.D[1] = nArray[n2++];
        this.ay = (h)this.a(0, (byte)1, D[0], D[1], 0, this.d, this.F, this.d, 1);
        this.ay.a[0] = nArray[n2++];
        this.ay.N[0] = nArray[n2++];
        this.ay.R[0] = nArray[n2++];
        this.ay.i = (byte)nArray[n2++];
        this.ay.al = (byte)nArray[n2++];
        this.ay.d = (byte)nArray[n2++];
        this.ay.b[1] = nArray[n2++];
        this.ay.v[1] = nArray[n2++];
        this.ay.an[0] = nArray[n2++];
        this.ay.au[0] = nArray[n2++];
        this.aK[0] = nArray[n2++];
        this.aK[1] = nArray[n2++];
        this.ay.U = (byte)nArray[n2++];
        n2 = this.a(nArray, n2, this.aa);
        n2 = this.b(nArray, n2, this.a);
        for (n4 = 0; n4 < this.bj.length; ++n4) {
            for (n = 0; n < this.bj[n4].length; ++n) {
                this.bj[n4][n] = (byte)nArray[n2++];
            }
        }
        for (n4 = 99; n4 <= 129; ++n4) {
            this.aj[n4][0] = (byte)nArray[n2++];
        }
        for (n4 = 0; n4 < this.K.length; ++n4) {
            this.K[n4][0] = (byte)nArray[n2++];
        }
        for (n4 = 0; n4 < this.I.length; ++n4) {
            this.I[n4] = nArray[n2++];
        }
        for (n4 = 0; n4 < this.B.length; ++n4) {
            this.B[n4] = nArray[n2++];
        }
        for (n4 = 0; n4 < this.z.length; ++n4) {
            for (n = 0; n < this.z[n4].length; ++n) {
                this.z[n4][n] = (byte)nArray[n2++];
            }
        }
        for (n4 = 0; n4 < this.bO.length; ++n4) {
            this.bO[n4] = (byte)nArray[n2++];
        }
        for (n4 = 0; n4 < this.bH.length; ++n4) {
            this.bH[n4] = (byte)nArray[n2++];
        }
        n2 = this.b(nArray, n2, this.bJ);
        this.ay.b[0] = this.ay.b[1];
        this.ay.v[0] = this.ay.v[1];
        this.ay.an[1] = this.N(this.ay.a[0]);
    }

    private void P() {
        int n;
        int n2;
        int[] nArray = new int[1081];
        byte[] byArray = new byte[nArray.length * 4 + 1];
        int n3 = 0;
        byArray[0] = 1;
        nArray[n3++] = this.q;
        nArray[n3++] = this.L;
        n3 = this.b(nArray, n3, this.bV, 0);
        n3 = this.b(nArray, n3, this.bV, 6);
        n3 = this.a(nArray, n3, this.ao);
        for (n2 = 0; n2 < this.x.length; ++n2) {
            nArray[n3++] = this.x[n2];
        }
        for (n2 = 0; n2 < this.ch.length; ++n2) {
            nArray[n3++] = this.ch[n2];
        }
        for (n2 = 0; n2 < this.ax.length; ++n2) {
            nArray[n3++] = this.ax[n2];
        }
        n3 = this.a(nArray, n3, (int)this.aR, this.bk);
        n3 = this.a(nArray, n3, (int)this.aC, this.V);
        n3 = this.a(nArray, n3, (int)this.ap, this.bD);
        for (n2 = 0; n2 < this.bA.length; ++n2) {
            nArray[n3++] = this.bA[n2];
        }
        nArray[n3++] = this.ay.I;
        nArray[n3++] = this.ay.G;
        nArray[n3++] = this.ay.a[0];
        nArray[n3++] = this.ay.N[0];
        nArray[n3++] = this.ay.R[0];
        nArray[n3++] = this.ay.i;
        nArray[n3++] = this.ay.al;
        nArray[n3++] = this.ay.d;
        nArray[n3++] = this.ay.b[1];
        nArray[n3++] = this.ay.v[1];
        nArray[n3++] = this.ay.an[0];
        nArray[n3++] = this.ay.au[0];
        nArray[n3++] = this.aK[0];
        nArray[n3++] = this.aK[1];
        nArray[n3++] = this.ay.U;
        n3 = this.b(nArray, n3, this.aa);
        n3 = this.a(nArray, n3, this.a);
        for (n2 = 0; n2 < this.bj.length; ++n2) {
            for (n = 0; n < this.bj[n2].length; ++n) {
                nArray[n3++] = this.bj[n2][n];
            }
        }
        for (n2 = 99; n2 <= 129; ++n2) {
            nArray[n3++] = this.aj[n2][0];
        }
        for (n2 = 0; n2 < this.K.length; ++n2) {
            nArray[n3++] = this.K[n2][0];
        }
        for (n2 = 0; n2 < this.I.length; ++n2) {
            nArray[n3++] = this.I[n2];
        }
        for (n2 = 0; n2 < this.B.length; ++n2) {
            nArray[n3++] = this.B[n2];
        }
        for (n2 = 0; n2 < this.z.length; ++n2) {
            for (n = 0; n < this.z[n2].length; ++n) {
                nArray[n3++] = this.z[n2][n];
            }
        }
        for (n2 = 0; n2 < this.bO.length; ++n2) {
            nArray[n3++] = this.bO[n2];
        }
        for (n2 = 0; n2 < this.bH.length; ++n2) {
            nArray[n3++] = this.bH[n2];
        }
        n3 = this.a(nArray, n3, this.bJ);
        n3 = 1;
        byArray[0] = 1;
        for (n = 0; n < nArray.length; ++n) {
            byte[] byArray2 = game.b.a((long)nArray[n], 4);
            for (int k = 0; k < byArray2.length; ++k) {
                byArray[n3++] = byArray2[k];
            }
        }
        e e2 = new e(this.T);
        if (e2.a() == 0) {
            e2.a(byArray, 0, byArray.length);
        } else {
            e2.a(1, byArray, 0, byArray.length);
        }
        e2.b();
        e2 = null;
        this.ay.b[0] = this.ay.b[1];
        this.ay.v[0] = this.ay.v[1];
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
        for (int k = 0; k < n2; ++k) {
            nArray[n++] = k < byArray.length ? byArray[k] : -1;
        }
        return n;
    }

    private int b(int[] nArray, int n, byte[][][] byArray, int n2) {
        for (int k = 0; k < byArray.length; ++k) {
            if (byArray[k].length <= 0) continue;
            for (int i2 = 0; i2 < byArray[k].length; ++i2) {
                nArray[n++] = byArray[k][i2][n2];
            }
        }
        return n;
    }

    private int a(int[] nArray, int n, byte[][][] byArray, int n2) {
        for (int k = 0; k < byArray.length; ++k) {
            if (byArray[k].length <= 0) continue;
            for (int i2 = 0; i2 < byArray[k].length; ++i2) {
                byArray[k][i2][n2] = (byte)nArray[n++];
            }
        }
        return n;
    }

    private int b(int[] nArray, int n, byte[][][] byArray) {
        for (int k = 11; k <= 19; ++k) {
            nArray[n++] = byArray[k][1][0];
        }
        return n;
    }

    private int a(int[] nArray, int n, byte[][][] byArray) {
        for (int k = 11; k <= 19; ++k) {
            byArray[k][1][0] = (byte)nArray[n++];
        }
        return n;
    }

    private int a(int[] nArray, int n, byte[][] byArray) {
        for (int k = 0; k < byArray.length; ++k) {
            for (int i2 = 0; i2 < byArray[k].length; ++i2) {
                nArray[n++] = byArray[k][i2];
            }
        }
        return n;
    }

    private int b(int[] nArray, int n, byte[][] byArray) {
        for (int k = 0; k < byArray.length; ++k) {
            for (int i2 = 0; i2 < byArray[k].length; ++i2) {
                byArray[k][i2] = (byte)nArray[n++];
            }
        }
        return n;
    }

    private int a(int[] nArray, int n, byte[][][][] byArray) {
        int n2 = n;
        for (int k = 0; k < byArray.length; ++k) {
            if (byArray[k].length <= 0) continue;
            for (int i2 = 0; i2 < byArray[k].length; ++i2) {
                for (int i3 = 1; i3 < byArray[k][i2].length; ++i3) {
                    nArray[n2++] = byArray[k][i2][i3][3];
                }
            }
        }
        return n2;
    }

    private int b(int[] nArray, int n, byte[][][][] byArray) {
        int n2 = n;
        for (int k = 0; k < byArray.length; ++k) {
            if (byArray[k].length <= 0) continue;
            for (int i2 = 0; i2 < byArray[k].length; ++i2) {
                for (int i3 = 1; i3 < byArray[k][i2].length; ++i3) {
                    byArray[k][i2][i3][3] = (byte)nArray[n2++];
                }
            }
        }
        return n2;
    }

    private void F() {
        if (this.bt != null) {
            for (int k = 0; k < this.bt.length; ++k) {
                if (this.bt[k] == null) continue;
                if (this.bt[k].V == 0) {
                    this.a(this.bt[k]);
                }
                int[] nArray = this.b(this.bt[k]);
                int[] nArray2 = this.b((i)this.ay);
                if (this.bt[k].ag == 29) {
                    if (this.bm[35] != 0) continue;
                    if (this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                        if (this.bm[86] != 0 || this.ay.au[0] < 100) continue;
                        this.t();
                        this.b(this.E, 7, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                        this.s();
                        this.ab();
                        this.f = true;
                        this.bm[35] = 1;
                        d.e(this.u, 14);
                        this.bm[86] = 1;
                        this.ba = (byte)2;
                        continue;
                    }
                    this.bm[86] = 0;
                    continue;
                }
                if (this.bt[k].ag != 30) continue;
                if (this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) {
                    if (this.ax[16] == 0) {
                        this.bm[36] = 1;
                        this.bm[37] = 1;
                        this.a(this.bt[k], 1, 0);
                        this.b(this.bt[k], 0, 0, this.ay.I, this.ay.G + 60, 1, 32, 1, 1, -1, 1, 0);
                        this.a(54);
                        continue;
                    }
                    if (this.bm[36] != 0) continue;
                    this.bm[36] = 1;
                    this.bm[37] = 1;
                    this.a(this.bt[k], 1, 0);
                    this.b(this.bt[k], 0, 0, this.ay.I, this.ay.G + 60, 1, 32, 1, 1, -1, 1, 0);
                    continue;
                }
                this.bm[36] = 0;
                this.bm[37] = 0;
                this.a(this.bt[k], 0, 0);
                this.b(this.bt[k], 0, 0, this.ay.I, this.ay.G + 60, 1, 32, 1, 0, -1, 1, 0);
            }
        }
    }

    private void B() {
        if (this.S != null && this.S.length > 0) {
            for (int k = 0; k < this.S.length; ++k) {
                if (this.S[k].V != 0) continue;
                this.S[k].I += this.S[k].ar[0];
                this.S[k].G += 2;
                if (this.S[k].I <= this.aK[0] - 10) {
                    this.S[k].I = this.aK[0] + 240 + 10;
                } else if (this.S[k].I >= this.aK[0] + 240 + 10) {
                    this.S[k].I = this.aK[0] - 10;
                } else if (this.S[k].G >= this.aK[1] + 260 + 10) {
                    this.S[k].G = this.aK[1] - 10;
                } else if (this.S[k].G <= this.aK[1] - 10) {
                    this.S[k].G = this.aK[1] + 260 + 10;
                }
                this.a(this.S[k]);
            }
        }
    }

    private void h() {
        if (this.ar != null) {
            int n;
            for (n = 0; n < this.ar.length; ++n) {
                if (this.ar[n] == null || this.ar[n].V != 0) continue;
                this.a(this.ar[n]);
            }
            for (n = 0; n < this.ar.length; ++n) {
                if (this.ar[n] == null) continue;
                int[] nArray = this.b(this.ar[n]);
                int[] nArray2 = this.b((i)this.ay);
                if (this.bm[49] == 0) {
                    if (this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) >= 3000) continue;
                    this.ae[0] = this.ar[n].u;
                    this.bm[49] = 1;
                    this.bm[48] = (short)n;
                    this.b(this.ar[n], 0, 0, this.ay.I, this.ay.G + 60, 1, 32, 1, 1, -1, 1, 0);
                    this.b(this.ar[n], 1, 0, this.ar[n].I + 23, this.ar[n].G, 2, 38, 1, 1, 1, 0, 1);
                    return;
                }
                if (this.ae[0] != this.ar[n].u || this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray2[0], nArray2[1], nArray2[2], nArray2[3], 4) < 3000) continue;
                this.bm[49] = 0;
                this.b(this.ar[n], 0, 0, this.ay.I, this.ay.G + 60, 1, 32, 1, 0, -1, 1, 0);
                this.b(this.ar[n], 1, 2, this.ar[n].I + 23, this.ar[n].G, 2, 38, 1, 1, 3, 0, 1);
            }
        }
    }

    private void f(int n) {
        if (this.ba == 1) {
            if (this.m(48) == 1 || this.m(-6) == 1 || this.m(-7) == 1) {
                this.c(48, 0);
                this.c(-6, 0);
                this.c(-7, 0);
                this.bm[35] = 1;
                if (this.bt != null) {
                    for (int k = 0; k < this.bt.length; ++k) {
                        if (this.bt[k].ag != 29) continue;
                        this.a(this.bt[k], 1, 1);
                    }
                }
                this.f = false;
                d.a(this.bn, 7);
                d.e(this.u, 0);
            }
        } else if (this.ba == 2) {
            if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
                this.c(n, 0);
                this.ay.b[0] = this.ay.b[1];
                this.ay.v[0] = this.ay.v[1];
                this.ay.au[1] = 100;
                this.ay.au[0] = this.ay.au[0] - this.ay.au[1];
                this.ba = 0;
            } else if (this.m(-7) == 1) {
                this.c(n, 0);
                this.bm[35] = 0;
                this.bm[86] = 1;
                this.f = false;
                d.a(this.bn, 7);
                d.e(this.u, 0);
            }
        }
    }

    private void M(int n) {
        if (this.m(48) == 1 || this.m(-6) == 1 || this.m(-7) == 1) {
            this.c(n, 0);
            this.f = false;
            d.a(this.bn, 7);
            d.e(this.u, 0);
            this.aV[0] = 0;
        }
    }

    private void O(int n) {
        if (this.m(48) == 1 || this.m(-6) == 1 || this.m(-7) == 1) {
            this.c(n, 0);
            this.f = false;
            d.a(this.bn, 7);
            d.e(this.u, 0);
            this.aV[0] = 0;
            if (this.c != null && (this.c[0].ag == 14 && this.z[4][1] == 0 || this.c[0].ag == 15 && this.z[5][1] == 0)) {
                this.a(135);
            }
        }
    }

    private void p(int n) {
        if (this.m(48) == 1 || this.m(-6) == 1 || this.m(-7) == 1) {
            this.c(n, 0);
            this.s();
            this.t();
            this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 4, 0, this.bm[13], this.bm[14], 1, 28, 1, 1, -1, 0, 0);
            this.b(this.E, 5, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.ac.b();
            block0: for (int k = 0; k < this.aQ.length; ++k) {
                this.aQ[k] = (byte)(k * 3);
                for (int i2 = 2; i2 >= 0; --i2) {
                    if (this.K[k * 3 + i2][0] != 1) continue;
                    this.aQ[k] = (byte)(k * 3 + i2);
                    continue block0;
                }
            }
            this.f = true;
            d.a(this.bn, 4);
            d.e(this.u, 29);
        }
    }

    private void C(int n) {
        if (this.bg[this.bb] == 0 && this.ba == 0) {
            byte by = this.bT[this.bb][this.bg[this.bb]][0];
            if (this.m(-3) == 1 || this.m(52) == 1) {
                this.c(n, 0);
                byte by2 = by;
                this.aQ[by2] = (byte)(this.aQ[by2] - 1);
                if (this.aQ[by] < by * 3) {
                    this.aQ[by] = (byte)(by * 3 + 2);
                }
                this.ac.b();
            } else if (this.m(-4) == 1 || this.m(54) == 1) {
                this.c(n, 0);
                byte by3 = by;
                this.aQ[by3] = (byte)(this.aQ[by3] + 1);
                if (this.aQ[by] > (byte)(by * 3 + 2)) {
                    this.aQ[by] = (byte)(by * 3);
                }
                this.ac.b();
            }
        }
        if (this.m(53) == 1 || this.m(-6) == 1 || this.m(-5) == 1) {
            this.c(53, 0);
            this.c(-6, 0);
            this.c(-5, 0);
            switch (this.bg[this.bb]) {
                case 0: {
                    if (this.ba == 0) {
                        if (this.K[this.aQ[this.bT[this.bb][this.bg[this.bb]][0]]][0] <= 0) break;
                        this.ay.au[1] = this.b(this.ay.al, this.ac.a((int)this.ay.d, 0), (int)this.aQ[this.bT[this.bb][this.bg[this.bb]][0]]);
                        if (this.ay.au[0] >= this.ay.au[1]) {
                            this.bg[this.bb] = 2;
                            this.ba = 0;
                            break;
                        }
                        this.bg[this.bb] = 3;
                        this.ba = 1;
                        break;
                    }
                    if (this.ba != 1) break;
                    this.f = false;
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                    this.aV[0] = 0;
                    break;
                }
                case 2: {
                    if (this.ba != 0) break;
                    if (this.ay.al == 2) {
                        this.ao[this.ay.i][3] = 1;
                        this.ao[this.ay.i][4] = this.aQ[this.bT[0][0][0]];
                    } else if (this.ay.al == 3) {
                        this.ao[this.ay.i][5] = 1;
                        this.ao[this.ay.i][6] = this.aQ[this.bT[0][0][0]];
                    } else if (this.ay.al == 4) {
                        this.ao[this.ay.i][7] = 1;
                        this.ao[this.ay.i][8] = this.aQ[this.bT[0][0][0]];
                    }
                    this.ay.au[0] = this.ay.au[0] - this.ay.au[1];
                    this.bg[this.bb] = 3;
                    this.ba = 0;
                    break;
                }
                case 3: {
                    if (this.ba == 0) {
                        this.f = false;
                        d.a(this.bn, 7);
                        d.e(this.u, 0);
                        this.aV[0] = 0;
                        break;
                    }
                    if (this.ba == 1) {
                        this.K(1);
                    }
                    this.bg[this.bb] = 0;
                    this.ba = 0;
                }
            }
        } else if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(-7, 0);
            this.c(-11, 0);
            switch (this.bg[this.bb]) {
                case 0: {
                    if (this.ba == 0) {
                        this.ba = 1;
                        break;
                    }
                    if (this.ba != 1) break;
                    this.ba = 0;
                    break;
                }
                case 2: {
                    this.bg[this.bb] = 0;
                    this.ba = 0;
                }
            }
        }
    }

    private void w(int n) {
        if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
            this.c(n, 0);
            this.f = false;
            d.a(this.bn, 2);
            this.k();
        }
        if (this.m(-7) == 1) {
            this.c(n, 0);
            this.W();
        }
    }

    private void j(int n) {
        if (this.aV[0] > 0) {
            if (this.m(48) == 1 || this.m(-6) == 1 || this.m(-7) == 1) {
                if (this.aj[this.aV[0]][1] != 4) {
                    this.c(48, 0);
                    this.c(-6, 0);
                    this.c(-7, 0);
                }
                switch (this.aj[this.aV[0]][1]) {
                    case 1: {
                        this.bm[43] = (short)(this.bm[43] + 1);
                        if (this.bm[43] >= this.b[2][this.aj[this.aV[0]][2]].length) {
                            switch (this.aV[0]) {
                                case 20: 
                                case 24: 
                                case 26: 
                                case 34: 
                                case 36: 
                                case 38: 
                                case 40: {
                                    this.e(5, -1);
                                    break;
                                }
                                case 22: 
                                case 30: 
                                case 32: {
                                    this.e(7, -1);
                                    break;
                                }
                                case 42: 
                                case 44: 
                                case 46: 
                                case 48: 
                                case 50: 
                                case 52: {
                                    this.e(6, -1);
                                }
                            }
                            if (this.aV[0] == 28) {
                                this.v = true;
                                this.aV[0] = 0;
                                this.f = false;
                                d.e(this.c[0].H, 6);
                                break;
                            }
                            if (this.aV[0] == 56) {
                                this.f = false;
                                d.a(this.bn, 7);
                                d.e(this.u, 0);
                                this.aV[0] = 0;
                                this.bm[43] = 0;
                                this.bm[44] = 0;
                                this.ax[19] = 1;
                                this.v = true;
                                this.aV[0] = 0;
                                this.f = false;
                                this.a(this.ar[this.bm[48]], 4 * this.Y[this.q][this.bm[50]][this.bm[48] + 1][2] + 3, 1);
                                break;
                            }
                            if (this.aV[0] == 57) {
                                this.v = true;
                                this.aV[0] = 0;
                                this.f = false;
                                this.a(this.ar[this.bm[48]], 4 * this.Y[this.q][this.bm[50]][this.bm[48] + 1][2] + 3, 1);
                                break;
                            }
                            if (this.aV[0] == 133) {
                                this.aV[0] = 0;
                                if (this.Y[this.q][this.bm[50]][this.bm[48] + 1][2] == 0) {
                                    this.a(136);
                                    break;
                                }
                                this.a(58);
                                break;
                            }
                            if (this.aV[0] == 54 || this.aV[0] == 55) {
                                if (this.ax[16] == 0) {
                                    this.ax[16] = 1;
                                }
                                this.aV[0] = 0;
                                this.bm[43] = 0;
                                this.bm[44] = 0;
                                this.bm[46] = 0;
                                this.f = true;
                                d.a(this.bn, 4);
                                d.e(this.u, 12);
                                this.s();
                                this.t();
                                this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 4, 0, this.bm[13], this.bm[14], 1, 28, 1, 1, -1, 0, 0);
                                this.b(this.E, 5, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.k();
                                if (this.bA[3] != 0 || this.bA[4] != 0 || this.bA[5] != 0 || this.ay.au[0] < this.a((byte)5, 1)) break;
                                this.bT[this.bb][this.bg[this.bb]][0] = (byte)d.a((byte)5, this.aw);
                                this.bT[this.bb][this.bg[this.bb]][1] = 5;
                                this.ba = 1;
                                break;
                            }
                            this.f = false;
                            d.a(this.bn, 7);
                            d.e(this.u, 0);
                            this.aV[0] = 0;
                            this.bm[43] = 0;
                            this.bm[44] = 0;
                            break;
                        }
                        this.bm[47] = 0;
                        this.t();
                        this.b(this.E, 6, 5, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 1);
                        break;
                    }
                    case 3: {
                        this.bm[43] = (short)(this.bm[43] + 1);
                        if (this.bm[43] < this.b[0][0][this.aj[this.aV[0]][2]].length) break;
                        switch (this.aV[0]) {
                            case 1: {
                                this.a(11);
                                break;
                            }
                            case 2: {
                                this.a(12);
                                break;
                            }
                            case 3: {
                                this.a(13);
                                break;
                            }
                            case 4: {
                                this.a(14);
                                break;
                            }
                            case 5: {
                                this.a(15);
                                break;
                            }
                            case 6: {
                                this.a(16);
                                break;
                            }
                            case 7: {
                                this.a(17);
                                break;
                            }
                            case 8: {
                                this.a(18);
                                break;
                            }
                            case 9: {
                                this.a(19);
                            }
                        }
                        this.aV[0] = 0;
                        this.bm[43] = 0;
                        this.bm[44] = 0;
                        this.f = false;
                        d.a(this.bn, 7);
                        d.e(this.u, 0);
                    }
                }
            }
            if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
                if (this.aj[this.aV[0]][1] == 4) {
                    this.c(-6, 0);
                    this.c(-5, 0);
                    this.c(53, 0);
                }
                switch (this.aj[this.aV[0]][1]) {
                    case 4: {
                        if (this.aV[0] == 58 || this.aV[0] == 136) {
                            this.bm[47] = 0;
                            this.bm[44] = 0;
                            this.aV[0] = 0;
                            this.I();
                            break;
                        }
                        if (this.aV[0] < 80 || this.aV[0] > 89) break;
                        this.Q(this.bm[12]);
                        this.bm[44] = 0;
                        this.bm[47] = 0;
                        this.aV[0] = 0;
                        this.f = false;
                        d.a(this.bn, 7);
                        d.e(this.u, 0);
                    }
                }
            } else if (this.m(-7) == 1) {
                this.c(-7, 0);
                if (this.aj[this.aV[0]][1] == 4) {
                    this.bm[44] = 0;
                    this.bm[47] = 0;
                    this.aV[0] = 0;
                    this.f = false;
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                }
            }
        }
    }

    private void a(int n) {
        if (this.aj[n][0] != 0) {
            if (n >= 99 && n <= 129) {
                int[] nArray;
                if (n >= 99 && n <= 122) {
                    int[] nArray2 = new int[]{6, 12, 15, 18, 21, 24, 1, 4, 7, 10, 13, 16, 19, 22, 25, 2, 5, 8, 11, 14, 17, 20, 23, 26};
                    if (this.K[nArray2[n - 99]][0] == 0) {
                        this.K[nArray2[n - 99]][0] = 1;
                        this.bX = this.c(this.bX, n, 1, 1);
                    }
                } else if (n >= 123 && n <= 129 && this.z[(nArray = new int[]{2, 3, 4, 5, 6, 7, 8})[n - 123]][1] == 0) {
                    this.z[nArray[n - 123]][1] = 1;
                    this.y();
                    this.bX = this.c(this.bX, n, 1, 1);
                }
            } else {
                this.bX = this.c(this.bX, n, 1, 1);
            }
        }
    }

    private void ab() {
        if (this.aV[0] > 0 && (this.aj[this.aV[0]][1] == 0 || this.aj[this.aV[0]][1] == 2)) {
            this.aV[0] = 0;
            this.bm[38] = 0;
            this.b(this.bd, 5, 0, this.ay.I, this.ay.G, 1, 32, 1, 0, -1, 1, 0);
        }
    }

    private void q() {
        if (this.aV[0] > 0) {
            switch (this.aj[this.aV[0]][1]) {
                case 0: {
                    if (this.bn[0] != 7 || this.bm[38] <= 0) break;
                    this.bm[38] = (short)(this.bm[38] - 1);
                    if (this.bm[38] > 0) break;
                    this.aV[0] = 0;
                    this.b(this.bd, 5, 0, this.ay.I, this.ay.G, 1, 32, 1, 0, -1, 1, 0);
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    if (this.bn[0] != 7 || this.bm[38] <= 0) break;
                    this.bm[38] = (short)(this.bm[38] - 1);
                    if (this.bm[38] > 0) break;
                    this.aV[0] = 0;
                    break;
                }
                case 3: {
                    break;
                }
            }
        }
        if ((this.aV[0] == 0 || this.aV[0] > 0 && this.aj[this.aV[0]][3] >= 42) && this.bX != null && this.bX.length > 0 && this.i()) {
            if (this.aj[this.bX[0]][0] > 0) {
                byte[] byArray = this.aj[this.bX[0]];
                byArray[0] = (byte)(byArray[0] - 1);
            }
            switch (this.aj[this.bX[0]][1]) {
                case 1: {
                    this.f = true;
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                    this.bm[44] = 1;
                    this.bm[43] = 0;
                    this.bm[40] = (short)((this.b[2][this.aj[this.bX[0]][2]][this.bm[43]][0].length() + 1) / (220 / game.b.a(game.j.as[0])));
                    this.bm[47] = 0;
                    this.t();
                    this.b(this.E, 6, 5, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 1);
                    this.b(this.E, 7, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    break;
                }
                case 3: {
                    this.f = true;
                    d.a(this.bn, 7);
                    d.e(this.u, 0);
                    this.bm[44] = 1;
                    this.bm[43] = 0;
                    this.bm[40] = 1;
                    this.bm[47] = 0;
                    this.t();
                    this.b(this.E, 6, 5, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 1);
                    break;
                }
                case 0: {
                    this.bm[40] = 1;
                    this.bm[38] = 100;
                    this.b(this.bd, 5, this.bX[0] - 11, this.ay.I, this.ay.G, 1, 32, 1, 1, -1, 1, 0);
                    break;
                }
                case 4: {
                    this.f = true;
                    this.bm[47] = 1;
                    this.bm[68] = 5;
                    this.bm[44] = 1;
                    break;
                }
                case 2: {
                    this.bm[40] = 1;
                    this.bm[38] = 20;
                    break;
                }
                case 6: {
                    this.s();
                    this.f = true;
                    d.a(this.bn, 7);
                    d.e(this.u, 22);
                    break;
                }
                case 7: {
                    this.t();
                    this.b(this.E, 7, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.s();
                    this.f = true;
                    d.e(this.u, 23);
                    break;
                }
                case 8: {
                    this.t();
                    this.b(this.E, 7, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                    this.s();
                    this.f = true;
                    d.e(this.u, 24);
                }
            }
            this.aV[0] = this.bX[0];
            this.bX = this.c(this.bX, this.bX[0], 0, 0);
        }
    }

    private boolean i() {
        while (this.bX.length > 0 && this.aj[this.bX[0]][0] == 0) {
            this.bX = this.c(this.bX, this.bX[0], 0, 0);
        }
        return this.bX.length > 0;
    }

    private game.a[] a(int n, byte[][][] byArray) {
        int n2 = 0;
        game.a[] aArray = null;
        for (int k = 0; k < byArray.length; ++k) {
            n2 = 0;
            if (byArray[k][0][0] == n) {
                int n3;
                for (n3 = 1; n3 < byArray[k].length; ++n3) {
                    if (byArray[k][n3][3] != 0) continue;
                    ++n2;
                }
                aArray = new game.a[n2];
                int n4 = 0;
                for (n3 = 1; n3 < byArray[k].length; ++n3) {
                    if (byArray[k][n3][3] != 0) continue;
                    aArray[n4] = new game.a();
                    aArray[n4].T = new int[1][12];
                    aArray[n4].aj = byArray[k][n3][2];
                    aArray[n4].ag = 28;
                    this.a((i)aArray[n4], (int)this.ab[aArray[n4].aj], 0);
                    game.a.a(aArray[n4], byArray[k][n3][0] * this.bK, byArray[k][n3][1] * this.af);
                    aArray[n4].V = 1;
                    aArray[n4].O[0] = this.ck[aArray[n4].ag][aArray[n4].af[0]][aArray[n4].ao][1];
                    this.b(aArray[n4], 0, 22, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                    aArray[n4].a(this.bv[4]);
                    ++n4;
                }
                break;
            }
            aArray = new game.a[]{};
        }
        return aArray;
    }

    private void a(game.a a2, int n) {
        int n2 = 0;
        int n3 = 0;
        if (a2.ag >= 1 && a2.ag <= 10) {
            if (n == 0) {
                byte[] byArray = new byte[]{0, 0, 0};
                byArray[0] = this.aa[a2.ag][1][0] == 0 ? this.aa[a2.ag][2][0] : (byte)(this.aa[a2.ag][2][0] + this.aa[a2.ag][2][1] * this.q);
                byArray[1] = this.aa[a2.ag][1][1] == 0 ? this.aa[a2.ag][2][2] : (byte)(this.aa[a2.ag][2][2] * this.q);
                byArray[2] = (byte)(100 - (byArray[0] + byArray[1]));
                for (int k = 0; k < a2.w.length; ++k) {
                    a2.w[k] = new game.a[1 + this.cz[8] / 100 + (this.cz[8] % 100 == 0 ? 0 : (d.i(2) == 0 ? 0 : 1))];
                    this.aJ = this.b((i)a2);
                    for (int i2 = 0; i2 < a2.w[k].length; ++i2) {
                        a2.w[k][i2] = new game.a();
                        n2 = this.a(byArray);
                        if (n2 >= 0 && n2 <= 1) {
                            this.a(a2.ag, a2.w[k][i2], n2, n);
                            continue;
                        }
                        a2.w[k][i2] = null;
                    }
                }
                a2.ap = false;
                this.bm[89] = this.a(this.bm[89], 1, 22, 25);
                if (a2.ag == 9) {
                    n3 = 50;
                    this.b(this.aO, this.bm[89], n3, this.aJ[0] + (this.aJ[2] >> 1), this.aJ[1] - this.aJ[3] + 35, 1, 26, 1, 1, -1, 0, 1);
                } else {
                    n3 = d.i(5) + 45;
                    this.b(this.aO, this.bm[89], n3, this.aJ[0] + (this.aJ[2] >> 1), this.aJ[1] - (this.aJ[3] >> 1), 1, 26, 1, 1, -1, 0, 1);
                }
            }
        } else if (a2.ag >= 11 && a2.ag <= 19) {
            if (n == 0) {
                byte[] byArray = new byte[]{0, 0, 0, 0, 0};
                byArray[0] = (byte)(this.aa[a2.ag][2][0] + this.aa[a2.ag][1][0] * 3);
                byArray[1] = (byte)(60 - byArray[0]);
                byArray[2] = this.aa[a2.ag][2][2];
                byArray[3] = this.aa[a2.ag][2][3];
                byArray[4] = this.aa[a2.ag][2][4];
                for (int k = 0; k < a2.w.length; ++k) {
                    if (k != this.bm[45]) continue;
                    a2.w[k] = new game.a[1 + this.cz[8] / 100 + (this.cz[8] % 100 == 0 ? 0 : (d.i(2) == 0 ? 0 : 1))];
                    for (int i3 = 0; i3 < a2.w[k].length; ++i3) {
                        a2.w[k][i3] = new game.a();
                        n2 = this.a(byArray);
                        if (this.aa[a2.ag][0][n2] >= 31 && this.aa[a2.ag][0][n2] <= 40) {
                            if (this.g) {
                                n2 = 1;
                            } else {
                                this.g = true;
                            }
                        }
                        this.a(a2.ag, a2.w[k][i3], n2, n);
                        if (a2.w[k][i3].aj < 31 || a2.w[k][i3].aj > 40) continue;
                        this.bm[54] = 1;
                    }
                }
                this.bm[45] = (short)(this.bm[45] + 1);
            } else if (n == 1) {
                a2.w[0] = new game.a[10];
                for (int k = 0; k < a2.w[0].length; ++k) {
                    a2.w[0][k] = new game.a();
                    n2 = d.i(3) + 0;
                    this.a(a2.ag, a2.w[0][k], n2, n);
                }
            }
        }
    }

    private void a(int n, game.a a2, int n2, int n3) {
        a2.T = new int[1][12];
        a2.ag = 28;
        if (n3 == 0) {
            a2.aj = this.aa[n][0][n2];
        } else if (n3 == 1) {
            a2.aj = n2;
        }
        this.a((i)a2, (int)this.ab[a2.aj], 0);
        game.a.a(a2, this.aJ[0] + (this.aJ[2] >> 1), this.aJ[1] - (this.aJ[3] >> 1));
        a2.O[0] = this.ck[a2.ag][a2.af[0]][a2.ao][1];
        a2.V = 1;
        int[] nArray = new int[]{0, 0, 0};
        nArray[0] = d.i(21) + 7;
        nArray[1] = -5;
        nArray[2] = -40;
        a2.a(nArray);
        a2.ar[0] = d.s(11);
        a2.o = (short)(a2.o & 3);
        a2.o = (short)(a2.o | 8);
        a2.k[4] = true;
        a2.o = (short)(a2.o & 0xC);
        a2.o = (short)(a2.o | 1);
        a2.x[0] = 10;
        a2.x[2] = 240 * this.ai[this.bq[this.q][this.L * 3] * 2] - 20;
        this.b(a2, 0, 22, 0, 0, 1, 26, 0, 1, -1, 1, 0);
    }

    private void b(game.a[] aArray, byte[][][] byArray) {
        int n = 0;
        int n2 = 0;
        if (aArray != null) {
            for (int k = 0; k < aArray.length; ++k) {
                if (aArray[k] == null) continue;
                int n3 = this.a((i)this.ay, aArray[k], 2, 0, false);
                if (n3 < 3000) {
                    block1: for (int i2 = 0; i2 < byArray.length; ++i2) {
                        if (byArray[i2][0][0] != this.L) continue;
                        for (int i3 = 1; i3 < byArray[i2].length; ++i3) {
                            if (byArray[i2][i3][3] != 0) continue;
                            if (n2 == n) {
                                byArray[i2][i3][3] = 1;
                                this.I(aArray[k].aj);
                                this.ay.J[5] = this.a(this.ay.J[5], 1, 1, 3);
                                this.b(this.ay, this.ay.J[5], 23, aArray[k].I, aArray[k].G, this.ay.U, 26, 1, 1, -1, 0, 1);
                                aArray[k] = null;
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
    }

    private void c(c c2) {
        if (c2.w != null) {
            for (int k = 0; k < c2.w.length; ++k) {
                if (c2.w[k] == null) continue;
                for (int i2 = 0; i2 < c2.w[k].length; ++i2) {
                    if (c2.w[k][i2] == null) continue;
                    int n = this.a((i)this.ay, c2.w[k][i2], 2, 0, false);
                    if (n < 3000) {
                        if (c2.w[k][i2].aj >= 31 && c2.w[k][i2].aj <= 40 && this.bk.length >= this.aR) {
                            if (!c2.w[k][i2].k[17]) {
                                this.a(132);
                            }
                            c2.w[k][i2].k[17] = true;
                            continue;
                        }
                        this.I(c2.w[k][i2].aj);
                        this.ay.J[5] = this.a(this.ay.J[5], 1, 1, 3);
                        this.b(this.ay, this.ay.J[5], 23, c2.w[k][i2].I, c2.w[k][i2].G, this.ay.U, 26, 1, 1, -1, 0, 1);
                        c2.w[k][i2] = null;
                        continue;
                    }
                    c2.w[k][i2].k[17] = false;
                }
            }
        }
    }

    private void I(int n) {
        this.a(n, 1, 0);
        if (n >= 31 && n <= 40) {
            if (this.bm[90 + this.q] > 8) {
                this.bm[90 + this.q] = 8;
            }
            this.ch[this.bm[12]] = this.aA[this.ao[this.bm[12]][1]][0] * (80 + 5 * this.bm[90 + this.q]) / 100;
            int n2 = 90 + this.q;
            this.bm[n2] = (short)(this.bm[n2] + 1);
        }
        if (this.u[0] == 0) {
            byte[] byArray = new byte[]{-1, -1, -1, 66, 67, 68, 69, 70, 71, 90, 91, 92, 93, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89};
            if (byArray[n] >= 0) {
                this.a(byArray[n]);
            }
            if (n == 35) {
                this.a(125);
            } else if (n == 36) {
                this.a(126);
            }
        }
    }

    private void d(c c2) {
        if (c2 == null) {
            return;
        }
        if (c2.w != null) {
            for (int k = 0; k < c2.w.length; ++k) {
                if (c2.w[k] == null) continue;
                for (int i2 = 0; i2 < c2.w[k].length; ++i2) {
                    if (c2.w[k][i2] == null) continue;
                    if (c2.w[k][i2].V == 0) {
                        this.a((i)c2.w[k][i2]);
                    }
                    if (this.f) continue;
                    this.h(c2.w[k][i2]);
                    this.c(c2.w[k][i2]);
                    if (c2.w[k][i2].I < c2.w[k][i2].x[0]) {
                        c2.w[k][i2].I = c2.w[k][i2].x[0];
                        continue;
                    }
                    if (c2.w[k][i2].I <= c2.w[k][i2].x[0] + c2.w[k][i2].x[2]) continue;
                    c2.w[k][i2].I = c2.w[k][i2].x[0] + c2.w[k][i2].x[2];
                }
            }
        }
    }

    private void a(game.a[] aArray) {
        if (aArray != null) {
            for (int k = 0; k < aArray.length; ++k) {
                if (aArray[k] == null) continue;
                if (aArray[k].V == 0) {
                    this.a((i)aArray[k]);
                }
                this.a(aArray[k].T[0], (i)aArray[k]);
                if (this.f) continue;
                this.h(aArray[k]);
            }
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

    private void Q(int n) {
        if (this.ay.n[this.ay.d][1][0] == 1) {
            this.ay.n[this.ay.d][1][0] = 0;
            byte by = this.ay.d;
            this.ay.c[by] = (byte)(this.ay.c[by] - 1);
        }
        this.ay.i = (byte)n;
        this.ay.al = this.ao[this.ay.i][2];
        this.ay.d = this.ao[this.ay.i][1];
    }

    private void d() {
        if (this.ay.al < 4 && this.x[this.ay.i] >= this.f(this.ay.d, this.ay.al)) {
            this.bm[23] = this.ay.al;
            byte[] byArray = this.ao[this.ay.i];
            byArray[2] = (byte)(byArray[2] + 1);
            this.ay.al = this.ao[this.ay.i][2];
            this.x[this.ay.i] = 0;
            this.b(this.ay, 0, 17, 0, 0, this.ay.U, 26, 1, 1, -1, 1, 1);
            this.a(131);
            this.ab();
        }
    }

    private void e(int n, int n2) {
        if (n2 != 0) {
            this.k();
            this.bz[0][0] = n;
            this.bl.a(this.cl[n], 1, 1, n2, 1);
        }
    }

    private void ac() {
        int n = 0;
        int n2 = 0;
        n = -1;
        switch (this.q) {
            case 0: {
                n2 = 6;
                break;
            }
            case 1: {
                n2 = 4;
                break;
            }
            case 2: {
                n2 = 2;
                break;
            }
            case 3: {
                n2 = 1;
                break;
            }
            case 4: {
                n2 = 3;
                break;
            }
            case 5: {
                n2 = 0;
                break;
            }
            case 6: {
                n2 = 2;
                break;
            }
            case 7: {
                n2 = 3;
                break;
            }
            case 8: {
                n2 = 1;
                break;
            }
            case 9: {
                n2 = 0;
            }
        }
        if (n != 0) {
            this.k();
            this.bz[0][0] = n2;
            this.bl.a(this.cl[n2], 1, 1, n, 1);
        }
    }

    public void k() {
        for (int k = 0; k < this.cl.length; ++k) {
            if (this.bz[0][0] != k) continue;
            try {
                this.bl.b(this.cl[k], 1);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    protected void e() {
        for (int k = 0; k < this.cl.length; ++k) {
            this.cl[k] = this.bl.a("/data/music/music_" + k + ".mid", 1);
        }
        this.bl.a(1);
    }

    public void V(int n) {
        if (this.m(-3) == 1 || this.m(52) == 1) {
            game.d.a((byte)1, false);
            d d2 = this;
            d2.bl.b();
            this.c(n, 0);
        } else if (this.m(-4) == 1 || this.m(54) == 1) {
            game.d.a((byte)1, true);
            d d3 = this;
            d3.bl.b();
            this.c(n, 0);
        }
        if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(n, 0);
            d.a(this.bn, this.bn[1]);
            d.e(this.u, this.u[1]);
            if (this.u[0] == 1) {
                this.e(this.bz[0][0], -1);
            }
        }
    }

    public void u(int n) {
        switch (n) {
            case -7: {
                this.c(n, 0);
                d.a(this.bn, this.bn[1]);
                d.e(this.u, this.u[1]);
                if (this.u[0] != 1) break;
                this.e(this.bz[0][0], -1);
            }
        }
    }

    public void k(int n) {
        if (this.m(52) == 1 || this.m(-3) == 1) {
            this.c(n, 0);
            if (this.bm[66] > 0) {
                this.bm[66] = (short)(this.bm[66] - 1);
            }
        } else if (this.m(-4) == 1 || this.m(54) == 1) {
            this.c(n, 0);
            if (this.bm[66] < this.bm[67] - 1) {
                this.bm[66] = (short)(this.bm[66] + 1);
            }
        }
        if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(n, 0);
            d.a(this.bn, this.bn[1]);
            d.e(this.u, this.u[1]);
            if (this.u[0] == 1) {
                this.e(this.bz[0][0], -1);
            }
        }
    }

    private void d(int n) {
        if (this.aq[n].length != 0) {
            this.aq[n] = new short[0][];
            this.aB[n] = new short[0][][];
            this.O[n] = new short[0][];
            this.bZ[n] = new short[0][];
            this.ck[n] = new short[0][][];
        }
    }

    private void y(int n) {
        if (this.cy[n] != null && this.cy[n].length > 0) {
            for (int k = 0; k < this.cy[n].length; ++k) {
                if (this.cy[n][k] == null) continue;
                this.cy[n][k] = null;
            }
        }
    }

    private void v(int n) {
        if (this.bp[n].length > 0) {
            for (int k = 0; k < this.bp[n].length; ++k) {
                if (this.bp[n][k] == null) continue;
                this.bp[n][k] = null;
            }
        }
    }

    private void a(int n, game.a a2, game.a a3) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = a2.ag;
        int n8 = a3.ag;
        int[] nArray = null;
        int[] nArray2 = null;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        short s = 0;
        short s2 = 0;
        short[][][] sArray = null;
        if (n == 0) {
            sArray = this.O;
            n6 = 0;
        } else if (n == 1) {
            sArray = this.bZ;
            n6 = 1;
        } else if (n == 2) {
            sArray = this.bZ;
            n6 = 2;
        } else if (n == 3 && n <= 4) {
            sArray = this.bZ;
        } else if (n == 5) {
            sArray = this.bZ;
            n6 = 3;
        }
        switch (n) {
            case 0: 
            case 1: 
            case 5: {
                n4 = sArray[n7][a2.O[0]][2] - sArray[n7][a2.O[0]][0];
                n5 = sArray[n7][a2.O[0]][3] - sArray[n7][a2.O[0]][1];
                n2 = a2.I + (a2.U == 1 ? sArray[n7][a2.O[0]][0] : -sArray[n7][a2.O[0]][2]);
                n3 = a2.G - sArray[n7][a2.O[0]][1];
                if (this.a(n, a2, a3, n7, n8, n2, n3, n4, n5, n6) != 1000 || n7 != 0 || this.ay.al >= 4) break;
                byte by = this.ay.i;
                this.x[by] = this.x[by] + 1;
                break;
            }
            case 2: {
                for (int k = 0; k < a2.n.length; ++k) {
                    if (a2.n[k] == null) continue;
                    for (int i2 = 0; i2 < a2.n[k].length; ++i2) {
                        nArray = a2.n[k][i2];
                        if (nArray[0] != 1 || this.a(n, a2, a3, n7, n8, n2 = nArray[3] + (nArray[5] == 1 ? this.bZ[nArray[11]][s2][0] : -this.bZ[nArray[11]][s2][2]), n3 = nArray[4] - this.bZ[nArray[11]][s2 = this.ck[nArray[11]][nArray[7]][nArray[6]][1]][1], n4 = this.bZ[nArray[11]][s2][2] - this.bZ[nArray[11]][s2][0], n5 = this.bZ[nArray[11]][s2][3] - this.bZ[nArray[11]][s2][1], n6) != 1000) continue;
                        if (a2.ag == 0 && (this.aF[k][7] == 3 || this.aF[k][7] == 9 || this.aF[k][7] == 12) && nArray[7] == 7 && nArray[12] > -1) {
                            nArray[6] = 0;
                            nArray[7] = nArray[13];
                            this.ck[nArray[11]][nArray[7]][this.ck[nArray[11]][nArray[7]].length - 1][0] = (short)nArray[14];
                            nArray[13] = game.a.ad[a2.q][nArray[12]][9];
                            nArray[14] = game.a.ad[a2.q][nArray[12]][10];
                            nArray[12] = game.a.ad[a2.q][nArray[12]][8];
                            continue;
                        }
                        if (a2.q != 11 && a2.q != 15) continue;
                        nArray[0] = 0;
                        int n13 = k;
                        a2.c[n13] = (byte)(a2.c[n13] - 1);
                    }
                }
                break;
            }
            case 3: {
                for (int k = 0; k < a3.n.length; ++k) {
                    if (a3.n[k] == null) continue;
                    for (int i3 = 0; i3 < a3.n[k].length; ++i3) {
                        nArray2 = a3.n[k][i3];
                        if (nArray2[0] != 1 || this.a(n2 = a2.I + (a2.U == 1 ? sArray[n7][a2.O[0]][0] : -sArray[n7][a2.O[0]][2]), n3 = a2.G - sArray[n7][a2.O[0]][1], n4 = sArray[n7][a2.O[0]][2] - sArray[n7][a2.O[0]][0], n5 = sArray[n7][a2.O[0]][3] - sArray[n7][a2.O[0]][1], n9 = nArray2[3] + (nArray2[5] == 1 ? this.bZ[nArray2[11]][s][0] : -this.bZ[nArray2[11]][s][2]), n10 = nArray2[4] - this.bZ[nArray2[11]][s = this.ck[nArray2[11]][nArray2[7]][nArray2[6]][1]][1], n11 = this.bZ[nArray2[11]][s][2] - this.bZ[nArray2[11]][s][0], n12 = this.bZ[nArray2[11]][s][3] - this.bZ[nArray2[11]][s][1], 4) >= 3000) continue;
                        nArray2[0] = 0;
                        int n14 = k;
                        a3.c[n14] = (byte)(a3.c[n14] - 1);
                        this.bL = this.a(n2, n3, n4, n5, n9, n10, n11, n12);
                        this.s = this.a(this.bL);
                        this.bm[81] = this.a(this.bm[81], 1, 0, 1);
                        this.b(a3, this.bm[81], 19, this.s[0], this.s[1], this.ay.U, 26, 1, 1, -1, 0, 1);
                    }
                }
                break;
            }
            case 4: {
                for (int k = 0; k < a3.n.length; ++k) {
                    if (a3.n[k] == null) continue;
                    for (int i4 = 0; i4 < a3.n[k].length; ++i4) {
                        nArray2 = a3.n[k][i4];
                        if (nArray2[0] != 1) continue;
                        s = this.ck[nArray2[11]][nArray2[7]][nArray2[6]][1];
                        for (int i5 = 0; i5 < a2.n[a2.d].length; ++i5) {
                            nArray = a2.n[a2.d][i5];
                            if (nArray[0] != 1 || this.a(n2 = nArray[3] + (nArray[5] == 1 ? this.bZ[nArray[11]][s2][0] : -this.bZ[nArray[11]][s2][2]), n3 = nArray[4] - this.bZ[nArray[11]][s2 = this.ck[nArray[11]][nArray[7]][nArray[6]][1]][1], n4 = this.bZ[nArray[11]][s2][2] - this.bZ[nArray[11]][s2][0], n5 = this.bZ[nArray[11]][s2][3] - this.bZ[nArray[11]][s2][1], n9 = nArray2[3] + (nArray2[5] == 1 ? this.bZ[nArray2[11]][s][0] : -this.bZ[nArray2[11]][s][2]), n10 = nArray2[4] - this.bZ[nArray2[11]][s][1], n11 = this.bZ[nArray2[11]][s][2] - this.bZ[nArray2[11]][s][0], n12 = this.bZ[nArray2[11]][s][3] - this.bZ[nArray2[11]][s][1], 4) >= 3000) continue;
                            nArray2[0] = 0;
                            int n15 = k;
                            a3.c[n15] = (byte)(a3.c[n15] - 1);
                            this.bL = this.a(n2, n3, n4, n5, n9, n10, n11, n12);
                            this.s = this.a(this.bL);
                            this.bm[81] = this.a(this.bm[81], 1, 0, 1);
                            this.b(a3, this.bm[81], 19, this.s[0], this.s[1], this.ay.U, 26, 1, 1, -1, 0, 1);
                        }
                    }
                }
                break;
            }
        }
    }

    private short a(int n, game.a a2, game.a a3, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        short s = 3000;
        if ((n2 == 0 || n2 >= 1 && n2 <= 10 || n2 >= 11 && n2 <= 19 && (n == 1 || n == 2)) && a2.k[11]) {
            a3.k[13] = true;
            this.bm[5] = 0;
            s = this.a(a3, n4, n5, n6, n7, a2.N[1], n8, (int)a2.J[9], n2);
            if (s == 1000) {
                if (n3 == 0) {
                    if (a3.J[4] > 0 && a3.b[0] > 0) {
                        int n9 = this.ay.J[4] * 100 / this.ay.b[0];
                        if (this.ay.r[0] != 13) {
                            if (n9 >= 1 && this.ay.k[13]) {
                                this.ay.U = (byte)(a2.I > this.ay.I ? 1 : 2);
                            }
                            if (n9 >= 1) {
                                if (n9 >= 1 && n9 < 10) {
                                    if (this.ay.k[5]) {
                                        this.b(this.ay, 5, 0);
                                        this.ay.ac = true;
                                    } else {
                                        this.b(this.ay, 6, 0);
                                        this.ay.ac = true;
                                    }
                                } else if (n9 >= 10) {
                                    this.b(this.ay, 4, 0);
                                    this.ay.ac = true;
                                    this.ay.o = (short)(this.ay.o & 3);
                                    this.ay.ak = (short)(this.ay.ak & 3);
                                    this.ay.o = (short)(this.ay.o | (this.ay.U == 1 ? 4 : 8));
                                    this.ay.k[9] = true;
                                    this.ay.k[4] = true;
                                    this.ay.k[5] = false;
                                    this.ay.a(this.bv[3]);
                                }
                            }
                        }
                    }
                } else if (n3 >= 1 && n3 <= 10) {
                    if (a3.k[0]) {
                        d.e(a3.H, 4);
                        a3.ac = true;
                    } else if (n3 != 9 && n3 != 10) {
                        d.e(a3.H, 3);
                    }
                } else if (n3 >= 11 && n3 <= 19 && (this.bV[this.q][this.bm[22]][5] == 1 && a3.b[0] == 0 || this.bV[this.q][this.bm[22]][5] == 0 && a3.b[0] * 100 / a3.b[1] <= this.bV[this.q][this.bm[22]][4])) {
                    this.bm[62] = 20;
                    d.e(a3.H, 4);
                    a3.ap = false;
                }
            }
        }
        return s;
    }

    public void l() {
        this.M = new byte[this.bD.length + this.bk.length];
        for (int k = 0; k < this.M.length; ++k) {
            this.M[k] = k < this.bD.length ? this.bD[k] : this.bk[k - this.bD.length];
        }
    }

    public int b(int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        switch (n) {
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 1;
                break;
            }
            case 3: {
                n4 = 3;
                break;
            }
            case 4: {
                n4 = 6;
            }
        }
        switch (n2) {
            case 0: {
                n5 = 1;
                break;
            }
            case 65280: {
                n5 = 3;
                break;
            }
            case 255: {
                n5 = 6;
                break;
            }
            case 0xFF00FF: {
                n5 = 9;
            }
        }
        return this.w[n3] * n4 * n5;
    }

    private int U() {
        if (this.z[3][0] == 1) {
            return 34;
        }
        if (this.z[2][0] == 1) {
            return 25;
        }
        if (this.z[1][0] == 1) {
            return 21;
        }
        if (this.z[0][0] == 1) {
            return 12;
        }
        return 6;
    }

    private void K(int n) {
        boolean bl = false;
        if (this.aM[n][0] == 0) {
            if (this.aM[n][3] < this.aM[n][2]) {
                bl = true;
            }
        } else {
            bl = true;
        }
        if (bl) {
            this.ab();
            this.bE = this.aM[n][2] > this.aM[n][1] ? (this.aM[n][2] - this.aM[n][3]) / this.aM[n][1] : 1;
            d.a(this.bn, 4);
            d.e(this.u, 28);
            this.cq = 0;
            this.ct = true;
            this.f = true;
            this.bQ = n;
            this.t();
            this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
        } else if (n == 0) {
            this.ab();
            if (this.aG == null) {
                this.aG = game.b.b("/data/data/gamesecret.mid");
            }
            this.f = true;
            d.a(this.bn, 4);
            d.e(this.u, 30);
            this.s();
            this.t();
            this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.k();
        } else if (n == 5) {
            this.ab();
            this.f = true;
            d.a(this.bn, 4);
            d.e(this.u, 12);
            this.s();
            this.t();
            this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.b(this.E, 4, 0, this.bm[13], this.bm[14], 1, 28, 1, 1, -1, 0, 0);
            this.b(this.E, 5, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
            this.k();
            if (this.bA[3] == 0 && this.bA[4] == 0 && this.bA[5] == 0 && this.ay.au[0] >= this.a((byte)5, 1)) {
                this.bT[this.bb][this.bg[this.bb]][0] = (byte)d.a((byte)5, this.aw);
                this.bT[this.bb][this.bg[this.bb]][1] = 5;
                this.ba = 1;
            }
        }
    }

    private void B(int n) {
        if (this.m(50) == 1 || this.m(-1) == 1) {
            this.c(n, 0);
            if (this.cq == 0) {
                if (this.bQ == 2) {
                    this.bQ = 1;
                } else if (this.bQ == 4) {
                    this.bQ = 3;
                }
                this.bE = this.aM[this.bQ][2] > this.aM[this.bQ][1] ? (this.aM[this.bQ][2] - this.aM[this.bQ][3]) / this.aM[this.bQ][1] : 1;
            }
        } else if (this.m(56) == 1 || this.m(-2) == 1) {
            this.c(n, 0);
            if (this.cq == 0) {
                if (this.bQ == 1) {
                    this.bQ = 2;
                } else if (this.bQ == 3) {
                    this.bQ = 4;
                }
                this.bE = this.aM[this.bQ][2] > this.aM[this.bQ][1] ? (this.aM[this.bQ][2] - this.aM[this.bQ][3]) / this.aM[this.bQ][1] : 1;
            }
        } else if (this.m(53) == 1 || this.m(-6) == 1 || this.m(-5) == 1) {
            switch (this.cq) {
                case 0: 
                case 4: {
                    if (this.m(-6) != 1) break;
                    this.cq = 1;
                    String string = "";
                    String string2 = "";
                    if (this.bQ == 1 || this.bQ == 3) {
                        this.aY = ++this.aY > 3 ? 0 : this.aY;
                        switch (this.aY) {
                            case 0: {
                                string = "106695883";
                                string2 = "53140601199";
                                break;
                            }
                            case 1: {
                                string = "106695883";
                                string2 = "53440601199";
                                break;
                            }
                            case 2: {
                                string = "10661828";
                                string2 = "5G000640601199";
                                break;
                            }
                            case 3: {
                                string = "10669668";
                                string2 = "HDGL40601199";
                            }
                        }
                    } else {
                        this.br = ++this.br > 1 ? 0 : this.br;
                        switch (this.br) {
                            case 0: {
                                string = "10668088";
                                string2 = "DJ000640601299";
                                break;
                            }
                            case 1: {
                                string = "106610985";
                                string2 = "j 24040601299";
                            }
                        }
                    }
                    boolean bl = this.cd.a(string2 + this.bc, this.bQ, string);
                    if (bl) {
                        this.b();
                        break;
                    }
                    this.cq = 3;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    this.ct = false;
                    switch (this.bQ) {
                        case 0: {
                            this.f = false;
                            d.a(this.bn, 7);
                            d.e(this.u, 0);
                            break;
                        }
                        case 1: 
                        case 2: {
                            d.a(this.bn, this.bn[1]);
                            d.e(this.u, this.u[1]);
                            break;
                        }
                        case 3: 
                        case 4: {
                            this.bm[72] = 0;
                            this.f = false;
                            d.a(this.bn, 7);
                            d.e(this.u, 0);
                            this.ac();
                            break;
                        }
                        case 5: {
                            if (this.bm[46] == 1) {
                                this.ab();
                                this.f = true;
                                d.a(this.bn, 4);
                                d.e(this.u, 12);
                                this.s();
                                this.t();
                                this.b(this.E, 0, 0, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 1, 1, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 2, 2, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 3, 3, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.b(this.E, 4, 0, this.bm[13], this.bm[14], 1, 28, 1, 1, -1, 0, 0);
                                this.b(this.E, 5, 4, this.bm[13], this.bm[14], 1, 27, 1, 1, -1, 0, 0);
                                this.k();
                                if (this.bA[3] != 0 || this.bA[4] != 0 || this.bA[5] != 0 || this.ay.au[0] < this.a((byte)5, 1)) break;
                                this.bT[this.bb][this.bg[this.bb]][0] = (byte)d.a((byte)5, this.aw);
                                this.bT[this.bb][this.bg[this.bb]][1] = 5;
                                this.ba = 1;
                                break;
                            }
                            d.a(this.bn, this.bn[1]);
                            d.e(this.u, this.u[1]);
                            this.bm[46] = 1;
                            break;
                        }
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: {
                            this.f = false;
                            d.a(this.bn, 7);
                            d.e(this.u, 0);
                        }
                    }
                    this.cq = 0;
                    break;
                }
                case 3: {
                    this.ct = false;
                    this.cq = 0;
                }
            }
            this.c(n, 0);
        } else if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(n, 0);
            switch (this.cq) {
                case 0: 
                case 4: {
                    switch (this.bQ) {
                        case 0: {
                            this.f = false;
                            d.a(this.bn, this.bn[1]);
                            d.e(this.u, this.u[1]);
                            break;
                        }
                        case 1: 
                        case 2: {
                            d.a(this.bn, this.bn[1]);
                            d.e(this.u, this.u[1]);
                            break;
                        }
                        case 3: 
                        case 4: {
                            d.a(this.bn, this.bn[1]);
                            d.e(this.u, this.u[1]);
                            break;
                        }
                        case 5: {
                            if (this.bm[46] == 1) {
                                this.f = false;
                                d.a(this.bn, 7);
                                d.e(this.u, 0);
                                this.e(this.bz[0][0], -1);
                                break;
                            }
                            d.a(this.bn, this.bn[1]);
                            d.e(this.u, this.u[1]);
                            break;
                        }
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: {
                            this.f = false;
                            d.a(this.bn, 7);
                            d.e(this.u, 0);
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

    private void b() {
        int[] nArray = this.aM[this.bQ];
        nArray[3] = nArray[3] + this.aM[this.bQ][1];
        this.bE = (this.aM[this.bQ][2] - this.aM[this.bQ][3]) / this.aM[this.bQ][1];
        if (this.aM[this.bQ][3] >= this.aM[this.bQ][2]) {
            if (this.aM[this.bQ][0] == 1) {
                this.aM[this.bQ][3] = 0;
            }
            int n = this.ay.a[0];
            block0 : switch (this.bQ) {
                case 0: {
                    this.ay.au[0] = this.ay.au[0] + 5000;
                    break;
                }
                case 1: {
                    this.ay.au[0] = this.ay.au[0] + 10000;
                    break;
                }
                case 2: {
                    this.ay.au[0] = this.ay.au[0] + 100000;
                    break;
                }
                case 3: {
                    this.ay.b[0] = this.ay.b[1];
                    this.ay.v[0] = this.ay.v[1];
                    for (int k = n; k < n + 3; ++k) {
                        for (int i2 = this.N(k); i2 > 0; i2 -= 9999) {
                            if (i2 <= 9999) {
                                this.a(this.ay, i2);
                                continue;
                            }
                            this.a(this.ay, 9999);
                        }
                    }
                    this.ay.k[0] = false;
                    this.b(this.ay, 0, 0);
                    this.ay.ac = true;
                    break;
                }
                case 4: {
                    this.ay.b[0] = this.ay.b[1];
                    this.ay.v[0] = this.ay.v[1];
                    for (int k = n; k < n + 10; ++k) {
                        for (int i3 = this.N(k); i3 > 0; i3 -= 9999) {
                            if (i3 <= 9999) {
                                this.a(this.ay, i3);
                                continue;
                            }
                            this.a(this.ay, 9999);
                        }
                    }
                    this.ay.k[0] = false;
                    this.b(this.ay, 0, 0);
                    this.ay.ac = true;
                    this.av[0] = 3750;
                    this.ay.J[0] = 2;
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: 
                case 8: 
                case 9: 
                case 10: {
                    if (this.bJ[this.q].length <= 0) break;
                    for (int k = 0; k < this.bJ[this.q].length; ++k) {
                        if (this.L != this.bJ[this.q][k][0][0]) continue;
                        this.bJ[this.q][k][1][3] = 1;
                        this.a((int)this.bJ[this.q][k][1][2], 1, 0);
                        if (this.bJ[this.q][k][1][2] == 35) {
                            this.a(125);
                        } else if (this.bJ[this.q][k][1][2] == 36) {
                            this.a(126);
                        }
                        this.ao[this.bm[78]][2] = 4;
                        this.ao[this.bm[78]][3] = 1;
                        this.ao[this.bm[78]][4] = this.bJ[this.q][k][1][7];
                        this.ao[this.bm[78]][5] = 1;
                        this.ao[this.bm[78]][6] = this.bJ[this.q][k][1][8];
                        this.ao[this.bm[78]][7] = 1;
                        this.ao[this.bm[78]][8] = this.bJ[this.q][k][1][9];
                        this.x[this.bm[78]] = 0;
                        this.ch[this.bm[78]] = this.bJ[this.q][k][1][6] * this.aA[this.ao[this.bm[78]][1]][0] / 100;
                        this.P[0] = null;
                        this.Q(this.bm[78]);
                        break block0;
                    }
                    break;
                }
            }
            this.r();
            this.cq = 2;
        } else {
            this.r();
            this.cq = 4;
        }
    }

    private void r() {
        int n;
        int n2;
        int n3;
        int[] nArray = new int[1081];
        int n4 = 1 + nArray.length * 4;
        byte[] byArray = new byte[n4];
        byte[] byArray2 = new byte[4];
        e e2 = new e(this.T);
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
        n3 = 474;
        switch (this.bQ) {
            case 0: 
            case 1: 
            case 2: {
                nArray[n3 + 11] = this.ay.au[0];
                break;
            }
            case 3: {
                nArray[n3 + 2] = this.ay.a[0];
                nArray[n3 + 3] = this.ay.N[0];
                nArray[n3 + 4] = this.ay.R[0];
                nArray[n3 + 8] = this.ay.b[1];
                nArray[n3 + 9] = this.ay.v[1];
                nArray[n3 + 10] = this.ay.an[0];
                break;
            }
            case 4: {
                nArray[n3 + 2] = this.ay.a[0];
                nArray[n3 + 3] = this.ay.N[0];
                nArray[n3 + 4] = this.ay.R[0];
                nArray[n3 + 8] = this.ay.b[1];
                nArray[n3 + 9] = this.ay.v[1];
                nArray[n3 + 10] = this.ay.an[0];
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                n5 = 14;
                for (n2 = 0; n2 < this.x.length; ++n2) {
                    nArray[n5++] = this.x[n2];
                }
                n5 = 334;
                for (n2 = 0; n2 < this.ch.length; ++n2) {
                    nArray[n5++] = this.ch[n2];
                }
                n5 = 384;
                n5 = this.a(nArray, n5, (int)this.aR, this.bk);
                n5 = 34;
                n5 = this.a(nArray, n5, this.ao);
                n5 = 1072;
                n5 = this.a(nArray, n5, this.bJ);
                n5 = 1034;
                for (n2 = 0; n2 < this.z.length; ++n2) {
                    for (n = 0; n < this.z[n2].length; ++n) {
                        nArray[n5++] = this.z[n2][n];
                    }
                }
                n5 = 1062;
                for (n2 = 0; n2 < this.bH.length; ++n2) {
                    nArray[n5++] = this.bH[n2];
                }
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
        nArray = new int[this.aM.length + 1];
        n4 = nArray.length * 4;
        byArray = new byte[n4];
        n5 = 0;
        for (n2 = 0; n2 < this.aM.length; ++n2) {
            nArray[n5++] = this.aM[n2][3];
        }
        nArray[n5++] = this.n;
        n5 = 0;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            byArray2 = game.b.a((long)nArray[n2], 4);
            for (n = 0; n < byArray2.length; ++n) {
                byArray[n5++] = byArray2[n];
            }
        }
        e e3 = new e(this.aN);
        if (e3.a() == 0) {
            e3.a(byArray, 0, byArray.length);
        } else {
            e3.a(1, byArray, 0, byArray.length);
        }
        e3.b();
        e3 = null;
    }

    private void aa() {
        int n;
        int n2;
        int n3;
        int[] nArray = new int[this.aM.length + 1];
        int n4 = nArray.length * 4;
        byte[] byArray = new byte[n4];
        byte[] byArray2 = new byte[4];
        e e2 = new e(this.aN);
        if (e2.a() == 0) {
            nArray[this.aM.length] = this.aD;
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
                nArray[this.aM.length] = this.aD;
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
        for (n3 = 0; n3 < this.aM.length; ++n3) {
            this.aM[n3][3] = nArray[n2++];
        }
        this.n = nArray[n2++];
        e2.b();
        e2 = null;
    }

    public void o(int n) {
        if (this.bg[this.bb] == 1) {
            if (this.m(52) == 1 || this.m(-3) == 1) {
                this.c(n, 0);
                if (this.bm[66] > 0) {
                    this.bm[66] = (short)(this.bm[66] - 1);
                }
            } else if (this.m(-4) == 1 || this.m(54) == 1) {
                this.c(n, 0);
                if (this.bm[66] < this.bm[67] - 1) {
                    this.bm[66] = (short)(this.bm[66] + 1);
                }
            }
        }
        if (this.m(-6) == 1 || this.m(-5) == 1 || this.m(53) == 1) {
            this.c(n, 0);
            if (this.bg[this.bb] == 0) {
                this.bg[this.bb] = 1;
                this.bm[66] = 0;
                this.bm[67] = (short)((this.aG[this.aL[this.bT[this.bb][0][0]]].length + this.C - 1) / this.C);
            }
        } else if (this.m(-7) == 1 || this.m(-11) == 1) {
            this.c(n, 0);
            if (this.bg[this.bb] == 0) {
                d.a(this.bn, 7);
                d.e(this.u, 0);
                this.e(this.bz[0][0], -1);
                this.f = false;
                this.aG = null;
            } else if (this.bg[this.bb] == 1) {
                this.bg[this.bb] = 0;
            }
        }
    }

    private game.a[] b(int n, byte[][][] byArray) {
        boolean bl = false;
        boolean bl2 = true;
        game.a[] aArray = null;
        if (byArray.length > 0) {
            for (int k = 0; k < byArray.length; ++k) {
                bl = false;
                if (!bl2 || byArray[k][0][0] != n) continue;
                bl2 = false;
                aArray = new game.a[byArray[k].length - 1];
                int n2 = 1;
                int n3 = 0;
                while (n2 < byArray[k].length) {
                    if (byArray[k][n2][3] == 0 && (byArray[k][n2][5] == 27 && this.aM[0][3] >= this.aM[0][2] || byArray[k][n2][5] != 27)) {
                        aArray[n3] = new game.a();
                        aArray[n3].T = new int[1][12];
                        aArray[n3].aj = byArray[k][n2][2];
                        aArray[n3].ag = 28;
                        this.a((i)aArray[n3], (int)byArray[k][n2][5], 0);
                        game.a.a(aArray[n3], byArray[k][n2][0] * this.bK, byArray[k][n2][1] * this.af);
                        aArray[n3].V = 1;
                        if (byArray[k][n2][5] == 27) {
                            this.b(aArray[n3], 0, 79, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                        } else {
                            this.b(aArray[n3], 0, 22, 0, 0, 1, 26, 0, 1, -1, 1, 0);
                        }
                    }
                    ++n2;
                    ++n3;
                }
            }
        }
        if (bl2) {
            aArray = new game.a[]{};
        }
        return aArray;
    }

    private void a(game.a[] aArray, byte[][][] byArray) {
        if (aArray.length > 0 && aArray[0] != null) {
            int n = this.a((i)this.ay, aArray[0], 2, 0, false);
            if (n < 3000) {
                if (this.bm[84] == 0) {
                    for (int k = 0; k < byArray.length; ++k) {
                        if (byArray[k][0][0] != this.L || byArray[k][1][3] != 0) continue;
                        this.bm[84] = 1;
                        this.bm[85] = (short)(byArray[k][1][2] - 31);
                        this.K(byArray[k][1][4]);
                    }
                }
            } else {
                this.bm[84] = 0;
            }
        }
    }

    static {
        D = new int[2];
        al = new int[4];
    }
}


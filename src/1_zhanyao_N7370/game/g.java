/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.f;
import game.i;
import game.j;

public class g
extends f
implements j {
    protected static byte[][][] aB = new byte[][][]{new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}};
    public int by = 20;
    public int ab = 20;
    public int aP = 0;
    public int o = 0;
    public int bM = 0;
    public int aA = 0;
    public int G = 0;
    public int bj = 0;
    public int B;
    public int d;
    public int as = 280;
    public int H = 320;

    protected int a(i i2, int n, int n2, int n3, int n4, short[][] sArray, int n5, boolean bl) {
        int n6 = n5;
        int n7 = n;
        int n8 = n2;
        int n9 = 2;
        int n10 = 2;
        int n11 = 20;
        int n12 = 20;
        int n13 = n;
        int n14 = n2;
        byte by = 0;
        switch (n5) {
            case 1: {
                n9 = n3 / n11 + (n3 % n11 != 0 ? 1 : 0);
                n13 = n;
                n14 = n2;
                n10 = n4 / n12 + (n4 % n12 != 0 ? 1 : 0);
                break;
            }
            case 2: {
                n9 = n3 / n11 + (n3 % n11 != 0 ? 1 : 0);
                n13 = n;
                n14 = n2 - n4 + 1;
                n10 = n4 / n12 + (n4 % n12 != 0 ? 1 : 0);
                break;
            }
            case 4: {
                n9 = n4 / n12 + (n4 % n12 != 0 ? 1 : 0);
                n13 = n;
                n14 = n2;
                n10 = n3 / n11 + (n3 % n11 != 0 ? 1 : 0);
                break;
            }
            case 8: {
                n9 = n4 / n12 + (n4 % n12 != 0 ? 1 : 0);
                n13 = n + n3 - 1;
                n14 = n2;
                n10 = n3 / n11 + (n3 % n11 != 0 ? 1 : 0);
            }
        }
        block22: for (int i3 = 0; i3 < n10; ++i3) {
            block23: for (int i4 = 0; i4 <= n9; ++i4) {
                n7 = n13 - n13 % n11;
                n8 = n14 + (this.ab - n14 % n12 - 1);
                if (n7 >= 0 && n7 < this.B && n8 >= 0 && n8 < this.d) {
                    int n15 = sArray[n7 / n11][n8 / n12] >> 3;
                    by = aB[this.aP][0][n15 + 1];
                    switch (by) {
                        case 0: {
                            if (this.a(n, n2, n3, n4, n7, n8, n11, n12, n5) != 1000) break;
                            if (bl && null != i2) {
                                this.a(i2, g.d(n, n2, n3, n4), g.d(n7, n8, n11, n12), n5);
                            }
                            return by + 1000;
                        }
                        case 1: {
                            if (n5 != 2 || this.a(n, n2 - n4 + 0, n3, 0, n7, n8, n11, 2, 2) >= 3000) break;
                            if (bl && null != i2) {
                                this.a(i2, g.d(n, n2 - n4, n3, 0), g.d(n7, n8, n11, 1), 2);
                            }
                            return by + 1000;
                        }
                        case 2: {
                            if (!this.a(i2, n, n2 - 0 + 0, n3, n4, n7, n8 - this.ab + 1, 1000, 1000, this.by, 0, n5)) break;
                            return by + 1000;
                        }
                        case 3: {
                            if (!this.a(i2, n, n2 - 0 + 0, n3, n4, n7, n8 + 0, -1000, 1000, this.by, 0, n5)) break;
                            return by + 1000;
                        }
                    }
                }
                switch (n6) {
                    case 1: 
                    case 2: {
                        if ((n13 += this.by) <= n + n3) continue block23;
                        n13 = n + n3;
                        continue block23;
                    }
                    case 4: 
                    case 8: {
                        if ((n14 -= this.ab) >= n2 - n4) continue block23;
                        n14 = n2 - n4;
                    }
                }
            }
            switch (n6) {
                case 1: {
                    if ((n14 -= this.ab) < n2 - n4) {
                        n14 = n2 - n4;
                    }
                    n13 = n;
                    continue block22;
                }
                case 2: {
                    if ((n14 += this.ab) > n2 + n4) {
                        n14 = n2 + n4;
                    }
                    n13 = n;
                    continue block22;
                }
                case 3: {
                    if ((n13 += this.by) > n + n3) {
                        n13 = n + n3;
                    }
                    n14 = n2;
                    continue block22;
                }
                case 4: {
                    if ((n13 -= this.by) < n - n3) {
                        n13 = n - n3;
                    }
                    n14 = n2;
                }
            }
        }
        return 3000;
    }

    public int[] a(i i2, int n, i i3, int n2, int n3) {
        int n4;
        int[] nArray = new int[9];
        int n5 = 3000;
        int[] nArray2 = this.b(i2);
        for (n4 = 0; n4 < nArray2.length; ++n4) {
            nArray[n4] = nArray2[n4];
        }
        nArray2 = this.b(i3);
        for (n4 = 0; n4 < nArray2.length; ++n4) {
            nArray[n4 + 4] = nArray2[n4];
        }
        switch (n) {
            case 2: {
                nArray[1] = nArray[1] - nArray[3];
                nArray[3] = 0;
            }
        }
        switch (n2) {
            default: 
        }
        n5 = this.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray[4], nArray[5], nArray[6], nArray[7], n3);
        nArray[8] = n5 + i3.au + 500;
        if (nArray[8] >= 1000 && nArray[8] < 3000) {
            return nArray;
        }
        return null;
    }

    protected int[] b(i i2) {
        int[] nArray = new int[4];
        int n = i2.x;
        short s = i2.au == 0 ? i2.s : i2.Y[0];
        try {
            nArray[0] = i2.P + (i2.ag == 1 ? this.I[n][s][0] : -this.I[n][s][2]);
            nArray[1] = i2.N - this.I[n][s][1];
            nArray[2] = this.I[n][s][2] - this.I[n][s][0];
            nArray[3] = this.I[n][s][3] - this.I[n][s][1];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return nArray;
    }

    protected boolean a(i i2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int[] nArray = g.d(n, n2, n3, n4);
        int n12 = n11 == 0 ? (int)i2.v : n11;
        int n13 = 0;
        switch (n10) {
            case 0: {
                if (n7 > 0) {
                    n13 = 2;
                    switch (n12) {
                        case 8: {
                            if (nArray[n13 * 2 + 1] < n6 + n9 * n8 / n7 && nArray[n13 * 2 + 1] >= n6) {
                                if (nArray[n13 * 2] < 1 + n5 + (nArray[n13 * 2 + 1] - n6) * n7 / n8) break;
                                if (null != i2) {
                                    i2.N += (nArray[n13 * 2] - n5) * n8 / n7 - (nArray[n13 * 2 + 1] - n6);
                                }
                                return true;
                            }
                            if (!this.a(n5, n6, nArray)) break;
                            if (null != i2) {
                                i2.P -= nArray[4] - n5 + 1;
                            }
                            return true;
                        }
                        case 2: {
                            if (nArray[n13 * 2] < n5 + n9 && nArray[n13 * 2] >= n5) {
                                if (nArray[n13 * 2 + 1] > 2 + n6 + (nArray[n13 * 2] - n5) * n8 / n7) break;
                                if (null != i2) {
                                    i2.N += (nArray[n13 * 2] - n5) * n8 / n7 - (nArray[n13 * 2 + 1] - n6) + 2 + 0;
                                }
                                return true;
                            }
                            if (!this.a(n5 + n9 - 1, n6 + n9 * n8 / n7, nArray)) break;
                            if (null != i2) {
                                i2.N += n6 + n9 * n8 / n7 - nArray[5] + 1;
                            }
                            return true;
                        }
                    }
                    break;
                }
                if (n7 >= 0) break;
                n13 = 3;
                switch (n12) {
                    case 4: {
                        if (nArray[n13 * 2 + 1] < n6 && nArray[n13 * 2 + 1] >= n6 - n9 * n8 / -n7) {
                            if (nArray[n13 * 2] > n5 + (n6 - nArray[n13 * 2 + 1]) * -n7 / n8) break;
                            if (null != i2) {
                                i2.N += n6 - nArray[n13 * 2 + 1] - (nArray[n13 * 2] - n5) * -n8 / n7;
                            }
                            return true;
                        }
                        if (!this.a(n5 + n9 - 1, n6 - n9 * n8 / -n7, nArray)) break;
                        if (null != i2) {
                            i2.P += n5 + n9 - 1 - nArray[6] + 1;
                        }
                        return true;
                    }
                    case 2: {
                        if (nArray[n13 * 2] < n5 + n9 && nArray[n13 * 2] > n5) {
                            if (nArray[n13 * 2 + 1] > 2 + n6 - (nArray[n13 * 2] - n5) * n8 / -n7) break;
                            if (null != i2) {
                                i2.N += n6 - nArray[n13 * 2 + 1] - (nArray[n13 * 2] - n5) * n8 / -n7 + 2;
                            }
                            return true;
                        }
                        if (!this.a(n5, n6, nArray)) break;
                        if (null != i2) {
                            i2.N += n6 - nArray[5] + 2;
                        }
                        return true;
                    }
                }
                break;
            }
        }
        return false;
    }

    protected boolean a(int n, int n2, int[] nArray) {
        return n >= nArray[0] && n <= nArray[2] && n2 >= nArray[5] && n2 <= nArray[3];
    }

    protected int a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int[] nArray = g.d(n, n2, n3, n4);
        int[] nArray2 = g.d(n5, n6, n7, n8);
        if (n3 == 0 && n4 == 0 || n7 == 0 && n8 == 0) {
            return 3000;
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            if (nArray[i2 * 2] >= nArray2[0] && nArray[i2 * 2] <= nArray2[2] && nArray[i2 * 2 + 1] <= nArray2[3] && nArray[i2 * 2 + 1] >= nArray2[5]) {
                return 1000;
            }
            if (nArray2[i2 * 2] < nArray[0] || nArray2[i2 * 2] > nArray[2] || nArray2[i2 * 2 + 1] > nArray[3] || nArray2[i2 * 2 + 1] < nArray[5]) continue;
            return 1000;
        }
        if (nArray2[0] >= nArray[0] && nArray2[2] <= nArray[2] && nArray2[1] >= nArray[3] && nArray2[7] <= nArray[5]) {
            return 1000;
        }
        if (nArray[0] >= nArray2[0] && nArray[2] <= nArray2[2] && nArray[1] >= nArray2[3] && nArray[7] <= nArray2[5]) {
            return 1000;
        }
        switch (n9) {
            case 1: {
                if (nArray[1] != nArray2[5] - 1 || !(nArray[0] >= nArray2[0] && nArray[0] <= nArray2[2] || nArray[2] >= nArray2[0] && nArray[2] <= nArray2[2] || nArray2[0] >= nArray[0] && nArray2[0] <= nArray[2]) && (nArray2[2] < nArray[0] || nArray2[2] > nArray[2])) break;
                return 2000;
            }
            case 2: {
                if (nArray[5] != nArray2[1] + 1 || !(nArray[0] >= nArray2[0] && nArray[0] <= nArray2[2] || nArray[2] >= nArray2[0] && nArray[2] <= nArray2[2] || nArray2[0] >= nArray[0] && nArray2[0] <= nArray[2]) && (nArray2[2] < nArray[0] || nArray2[2] > nArray[2])) break;
                return 2000;
            }
            case 4: {
                if (nArray[0] != nArray2[2] + 1 || !(nArray[1] <= nArray2[1] && nArray[1] >= nArray2[7] || nArray[7] <= nArray2[1] && nArray[7] >= nArray2[7] || nArray2[1] <= nArray[1] && nArray2[1] >= nArray[7]) && (nArray2[7] > nArray[1] || nArray2[7] < nArray[7])) break;
                return 2000;
            }
            case 8: {
                if (nArray[2] != nArray2[0] - 1 || !(nArray2[1] <= nArray[1] && nArray2[1] >= nArray[7] || nArray2[7] <= nArray[1] && nArray2[7] >= nArray[7] || nArray[1] <= nArray2[1] && nArray[1] >= nArray2[7]) && (nArray[7] > nArray2[1] || nArray[7] < nArray2[7])) break;
                return 2000;
            }
        }
        return 3000;
    }

    protected int a(i i2, i i3, int n, int n2, boolean bl) {
        int[] nArray = null;
        if (null == i2) {
            return -1;
        }
        if (null == i3) {
            return -1;
        }
        switch (n2) {
            case 2: {
                nArray = this.a(i2, 2, i3, 3, n);
                if (nArray == null) break;
                if (nArray[8] >= 1000 && nArray[8] < 2000) {
                    if (n != 2) break;
                    if (bl) {
                        this.a(i2, g.d(nArray[0], nArray[1], nArray[2], nArray[3]), g.d(nArray[4], nArray[5], nArray[6], nArray[7]), n);
                    }
                    return 1000 + i3.au + 500;
                }
                if (nArray[8] < 2000 || nArray[8] >= 3000) break;
                return 2000 + i3.au + 500;
            }
            default: {
                nArray = this.a(i2, 1, i3, 1, n);
                if (nArray == null) break;
                if (nArray[8] >= 1000 && nArray[8] < 2000) {
                    if (bl) {
                        this.a(i2, g.d(nArray[0], nArray[1], nArray[2], nArray[3]), g.d(nArray[4], nArray[5], nArray[6], nArray[7]), n);
                    }
                    return 1000 + i3.au + 500;
                }
                if (nArray[8] < 2000 || nArray[8] >= 3000) break;
                return 2000 + i3.au + 500;
            }
        }
        return 3000;
    }

    protected void a(i i2, int[] nArray, int[] nArray2, int n) {
        if ((n & 1) == 1) {
            i2.N -= nArray[1] - nArray2[5] + 1;
        } else if ((n & 2) == 2) {
            i2.N += nArray2[1] - nArray[5] + 2;
        } else if ((n & 4) == 4) {
            i2.P += nArray2[2] - nArray[0] + 1;
        } else if ((n & 8) == 8) {
            i2.P -= nArray[2] - nArray2[0] + 1;
        }
    }

    public int[][] a(short[] sArray) {
        int[][] nArray = new int[2][3];
        try {
            nArray[0][0] = sArray[1];
            nArray[0][1] = sArray[2];
            nArray[0][2] = sArray[3];
            nArray[1][0] = sArray[4];
            nArray[1][1] = sArray[5];
            nArray[1][2] = sArray[6];
        }
        catch (Exception exception) {
            return null;
        }
        return nArray;
    }

    public int[] a(short[] sArray, short[] sArray2) {
        int[] nArray = new int[2];
        int[][] nArray2 = this.a(sArray2);
        short s = sArray[3];
        short s2 = sArray[4];
        int n = s * nArray2[0][0] + s2 * nArray2[1][0];
        int n2 = s * nArray2[0][1] + s2 * nArray2[1][1];
        int n3 = this.a(nArray2);
        nArray[0] = nArray2[0][2];
        nArray[1] = nArray2[1][2];
        nArray = this.b(nArray, n3, n, n2);
        return nArray;
    }

    public int[] b(int[] nArray, int n, int n2, int n3) {
        int[] nArray2 = nArray;
        switch (n) {
            case 0: {
                break;
            }
            case 1: {
                nArray2[0] = nArray2[0] - n2;
                break;
            }
            case 2: {
                nArray2[0] = nArray2[0] + n2;
                nArray2[1] = nArray2[1] + n3;
                break;
            }
            case 3: {
                nArray2[1] = nArray2[1] - n3;
                break;
            }
            case 4: {
                nArray2[0] = nArray2[0] + n2;
                break;
            }
            case 5: {
                nArray2[0] = nArray2[0] + n2;
                nArray2[1] = nArray2[1] + n3;
                break;
            }
            case 6: {
                nArray2[1] = nArray2[1] + n3;
                break;
            }
        }
        return nArray2;
    }

    public int[] a(int[][] nArray, int[] nArray2, boolean bl) {
        int[] nArray3 = new int[]{nArray2[0] * nArray[0][0] + nArray2[1] * nArray[1][0], nArray2[0] * nArray[0][1] + nArray2[1] * nArray[1][1]};
        if (bl) {
            nArray3[0] = Math.abs(nArray3[0]);
            nArray3[1] = Math.abs(nArray3[1]);
        }
        return nArray3;
    }

    public int[][] a(int[][] nArray, int[][] nArray2) {
        int[][] nArray3 = new int[2][3];
        nArray3[0][0] = nArray[0][0] * nArray2[0][0] + nArray[0][1] * nArray2[1][0];
        nArray3[0][1] = nArray[0][0] * nArray2[0][1] + nArray[0][1] * nArray2[1][1];
        nArray3[0][2] = nArray[0][0] * nArray2[0][2] + nArray[0][1] * nArray2[1][2] + nArray[0][2];
        nArray3[1][0] = nArray[1][0] * nArray2[0][0] + nArray[1][1] * nArray2[1][0];
        nArray3[1][1] = nArray[1][0] * nArray2[0][1] + nArray[1][1] * nArray2[1][1];
        nArray3[1][2] = nArray[1][0] * nArray2[0][2] + nArray[1][1] * nArray2[1][2] + nArray[1][2];
        return nArray3;
    }

    public int[] a(short[] sArray, short[] sArray2, boolean bl) {
        int[] nArray = new int[2];
        int[][] nArray2 = this.a(sArray2);
        short s = sArray[3];
        short s2 = sArray[4];
        nArray[0] = s * nArray2[0][0] + s2 * nArray2[1][0];
        nArray[1] = s * nArray2[0][1] + s2 * nArray2[1][1];
        if (!bl) {
            nArray[0] = Math.abs(nArray[0]);
            nArray[1] = Math.abs(nArray[1]);
        }
        return nArray;
    }

    public int a(int[][] nArray) {
        if (nArray == null) {
            return -1;
        }
        switch (nArray[0][0]) {
            case 0: {
                if (nArray[0][1] == -1 && nArray[1][0] == 1 && nArray[1][1] == 0) {
                    return 1;
                }
                if (nArray[0][1] == 1 && nArray[1][0] == -1 && nArray[1][1] == 0) {
                    return 3;
                }
                if (nArray[0][1] == 1 && nArray[1][0] == 1 && nArray[1][1] == 0) {
                    return 7;
                }
                if (nArray[0][1] != -1 || nArray[1][0] != -1 || nArray[1][1] != 0) break;
                return 5;
            }
            case 1: {
                if (nArray[0][1] == 0 && nArray[1][0] == 0 && nArray[1][1] == 1) {
                    return 0;
                }
                if (nArray[0][1] != 0 || nArray[1][0] != 0 || nArray[1][1] != -1) break;
                return 6;
            }
            case -1: {
                if (nArray[0][1] == 0 && nArray[1][0] == 0 && nArray[1][1] == 1) {
                    return 4;
                }
                if (nArray[0][1] != 0 || nArray[1][0] != 0 || nArray[1][1] != -1) break;
                return 2;
            }
        }
        return -1;
    }
}


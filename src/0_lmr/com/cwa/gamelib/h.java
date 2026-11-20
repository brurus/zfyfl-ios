/*
 * Decompiled with CFR 0.152.
 */
package com.cwa.gamelib;

import com.cwa.gamelib.b;
import com.cwa.gamelib.e;
import com.cwa.gamelib.i;

public class h
extends e
implements b {
    protected static byte[][][] az = new byte[][][]{new byte[][]{new byte[111]}, new byte[][]{new byte[91]}, new byte[][]{new byte[82]}, new byte[][]{new byte[86]}, new byte[][]{new byte[21]}, new byte[][]{new byte[23]}};
    int bD = 20;
    int ab = 20;
    public int aV = 0;
    public int ay = 0;
    public int J = 0;
    public int H;
    public int j;
    public int bo = 0;

    protected int a(i i2, int n, int n2, int n3, int n4, short[][] sArray, int n5, boolean bl) {
        int n6 = n5;
        int n7 = n;
        int n8 = n2;
        int n9 = 2;
        int n10 = 20;
        int n11 = 20;
        int n12 = 0;
        int n13 = 0;
        byte by = 0;
        switch (n6) {
            case 1: {
                n9 = n3 / n10 + (n3 % n10 != 0 ? 1 : 0);
                n12 = n;
                n13 = n2;
                break;
            }
            case 2: {
                n9 = n3 / n10 + (n3 % n10 != 0 ? 1 : 0);
                n12 = n;
                n13 = n2 - n4 + 1;
                break;
            }
            case 4: {
                n9 = n4 / n11 + (n4 % n11 != 0 ? 1 : 0);
                n12 = n;
                n13 = n2;
                break;
            }
            case 8: {
                n9 = n4 / n11 + (n4 % n11 != 0 ? 1 : 0);
                n12 = n + n3 - 1;
                n13 = n2;
            }
        }
        block19: for (int j = 0; j <= n9; ++j) {
            n7 = n12 - n12 % n10;
            n8 = n13 + (this.ab - n13 % n11 - 1);
            if (n7 >= 0 && n7 < this.H && n8 >= 0 && n8 < this.j) {
                int n14 = sArray[n7 / n10][n8 / n11] >> 3;
                int n15 = sArray[n7 / n10][n8 / n11] & 7;
                by = az[this.aV][0][n14 + 1];
                switch (by) {
                    case 0: {
                        if (this.a(n, n2, n3, n4, n7, n8, n10, n11, n5) != 1000) break;
                        if (bl && null != i2) {
                            this.a(i2, this.c(n, n2, n3, n4), this.c(n7, n8, n10, n11), n5);
                        }
                        return by + 1000;
                    }
                    case 6: {
                        if (i2.aR == 2 || n5 == 1 || n5 == 2) break;
                        if (n5 == 0) {
                            int n16 = n5 = i2.K == 2 ? 4 : 8;
                        }
                        if (this.a(n, n2, n3, n4, n7, n8, n10, n11, n5) != 1000) break;
                        if (bl && null != i2) {
                            this.a(i2, this.c(n, n2, n3, n4), this.c(n7, n8, n10, n11), n5);
                        }
                        return by + 1000;
                    }
                    case 3: {
                        if (n5 != 2 || this.a(n, n2 - n4 + 0, n3, 0, n7, n8, n10, 2, 2) >= 3000) break;
                        if (bl && null != i2) {
                            this.a(i2, this.c(n, n2 - n4, n3, 0), this.c(n7, n8, n10, 1), 2);
                        }
                        return by + 1000;
                    }
                    case 4: {
                        if (n5 != 2 || this.a(n, n2 - n4 + 0, n3, 0, n7 + 8, n8, 8, 4, n5) != 1000) break;
                        if (bl && null != i2) {
                            this.a(i2, this.c(n, n2 - n4, n3, 0), this.c(n7, n8, n10, 1), n5);
                        }
                        return by + 1000;
                    }
                    case 5: {
                        if (n5 != 2 || this.a(n, n2 - n4 + 0, n3, 0, n7, n8, 8, 4, n5) != 1000) break;
                        if (bl && null != i2) {
                            this.a(i2, this.c(n, n2 - n4, n3, 0), this.c(n7, n8, n10, 1), n5);
                        }
                        return by + 1000;
                    }
                    case 1: {
                        if (!this.a(i2, n, n2, n3, n4, n7, n8 - this.ab + 1, 1000, 1000, this.bD, 0, n5)) break;
                        return by + 1000;
                    }
                    case 2: {
                        if (!this.a(i2, n, n2, n3, n4, n7, n8 + 0, -1000, 1000, this.bD, 0, n5)) break;
                        return by + 1000;
                    }
                }
            }
            switch (n6) {
                case 1: 
                case 2: {
                    if ((n12 += this.bD) <= n + n3) continue block19;
                    n12 = n + n3;
                    continue block19;
                }
                case 4: 
                case 8: {
                    if ((n13 -= this.ab) >= n2 - n4) continue block19;
                    n13 = n2 - n4;
                }
            }
        }
        return 3000;
    }

    private int[] a(i i2, int n, i i3, int n2, int n3) {
        int n4;
        int[] nArray = new int[9];
        int n5 = 3000;
        int[] nArray2 = this.p(i2);
        for (n4 = 0; n4 < nArray2.length; ++n4) {
            nArray[n4] = nArray2[n4];
        }
        nArray2 = this.p(i3);
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
        nArray[8] = n5 + i3.aR + 500;
        if (nArray[8] >= 1000 && nArray[8] < 3000) {
            return nArray;
        }
        return null;
    }

    protected int[] p(i i2) {
        int[] nArray = new int[4];
        int n = i2.aR;
        short s = this.bZ[n][i2.T[0]][i2.aV][1];
        try {
            nArray[0] = i2.C + this.L[n][s][0];
            nArray[1] = i2.A - this.L[n][s][1];
            nArray[2] = this.L[n][s][2] - this.L[n][s][0];
            nArray[3] = this.L[n][s][3] - this.L[n][s][1];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return nArray;
    }

    protected boolean a(i i2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int[] nArray = this.c(n, n2, n3, n4);
        int n12 = n11 == 0 ? (int)i2.ap : n11;
        int n13 = 0;
        switch (n10) {
            case 0: {
                if (n7 > 0) {
                    n13 = 2;
                    switch (n12) {
                        case 8: {
                            if (nArray[n13 * 2 + 1] < n6 + n9 * n8 / n7 && nArray[n13 * 2 + 1] >= n6) {
                                if (nArray[n13 * 2] < n5 + (nArray[n13 * 2 + 1] - n6) * n7 / n8) break;
                                if (null != i2) {
                                    i2.A += nArray[n13 * 2] - n5 - (nArray[n13 * 2 + 1] - n6) * n7 / n8 + 3 + 0;
                                }
                                return true;
                            }
                            if (!this.a(n5, n6, nArray)) break;
                            if (null != i2) {
                                i2.C -= nArray[4] - n5 + 1;
                            }
                            return true;
                        }
                        case 2: {
                            if (nArray[n13 * 2] < n5 + n9 && nArray[n13 * 2] >= n5) {
                                if (nArray[n13 * 2 + 1] > 2 + n6 + (nArray[n13 * 2] - n5) * n8 / n7) break;
                                if (null != i2) {
                                    i2.A += (nArray[n13 * 2] - n5) * n8 / n7 - (nArray[n13 * 2 + 1] - n6) + 2 + 0;
                                }
                                return true;
                            }
                            if (!this.a(n5 + n9 - 1, n6 + n9 * n8 / n7, nArray)) break;
                            if (null != i2) {
                                i2.A += n6 + n9 * n8 / n7 - nArray[5] + 1;
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
                            if (nArray[n13 * 2] >= n5 + (n6 - nArray[n13 * 2 + 1]) * -n7 / n8) break;
                            if (null != i2) {
                                i2.A += (n6 - nArray[n13 * 2 + 1]) * -n7 / n8 - (nArray[n13 * 2] - n5) + 1;
                            }
                            return true;
                        }
                        if (!this.a(n5 + n9 - 1, n6 - n9 * n8 / -n7, nArray)) break;
                        if (null != i2) {
                            i2.C += n5 + n9 - 1 - nArray[6] + 0;
                        }
                        return true;
                    }
                    case 2: {
                        if (nArray[n13 * 2] < n5 + n9 && nArray[n13 * 2] > n5) {
                            if (nArray[n13 * 2 + 1] > 2 + n6 - (nArray[n13 * 2] - n5) * n8 / -n7) break;
                            if (null != i2) {
                                i2.A += n6 - nArray[n13 * 2 + 1] - (nArray[n13 * 2] - n5) * n8 / -n7 + 2;
                            }
                            return true;
                        }
                        if (!this.a(n5, n6, nArray)) break;
                        if (null != i2) {
                            i2.A += n6 - nArray[5] + 2;
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
        int n10;
        int[] nArray = this.c(n, n2, n3, n4);
        int[] nArray2 = this.c(n5, n6, n7, n8);
        if (n3 == 0 && n4 == 0 || n7 == 0 && n8 == 0) {
            return 3000;
        }
        for (n10 = 0; n10 < 4; ++n10) {
            if (nArray[n10 * 2] >= nArray2[0] && nArray[n10 * 2] <= nArray2[2] && nArray[n10 * 2 + 1] <= nArray2[3] && nArray[n10 * 2 + 1] >= nArray2[5]) {
                return 1000;
            }
            if (nArray2[n10 * 2] < nArray[0] || nArray2[n10 * 2] > nArray[2] || nArray2[n10 * 2 + 1] > nArray[3] || nArray2[n10 * 2 + 1] < nArray[5]) continue;
            return 1000;
        }
        if (n9 == -2) {
            for (n10 = 0; n10 < 4; ++n10) {
                System.out.println(nArray[n10 * 2] + " ," + nArray[n10 * 2 + 1]);
            }
            for (n10 = 0; n10 < 4; ++n10) {
                System.out.println(nArray2[n10 * 2] + " ," + nArray2[n10 * 2 + 1]);
            }
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
                        this.a(i2, this.c(nArray[0], nArray[1], nArray[2], nArray[3]), this.c(nArray[4], nArray[5], nArray[6], nArray[7]), n);
                    }
                    return 1000 + i3.aR + 500;
                }
                if (nArray[8] < 2000 || nArray[8] >= 3000) break;
                return 2000 + i3.aR + 500;
            }
            default: {
                nArray = this.a(i2, 1, i3, 1, n);
                if (nArray == null) break;
                if (nArray[8] >= 1000 && nArray[8] < 2000) {
                    if (bl) {
                        this.a(i2, this.c(nArray[0], nArray[1], nArray[2], nArray[3]), this.c(nArray[4], nArray[5], nArray[6], nArray[7]), n);
                    }
                    return 1000 + i3.aR + 500;
                }
                if (nArray[8] < 2000 || nArray[8] >= 3000) break;
                return 2000 + i3.aR + 500;
            }
        }
        return 3000;
    }

    protected void a(i i2, int[] nArray, int[] nArray2, int n) {
        if ((n & 1) == 1) {
            i2.A -= nArray[1] - nArray2[5] + 1;
        } else if ((n & 2) == 2) {
            i2.A += nArray2[1] - nArray[5] + 2;
        } else if ((n & 4) == 4) {
            i2.C += nArray2[2] - nArray[0] + 1;
        } else if ((n & 8) == 8) {
            i2.C -= nArray[2] - nArray2[0] + 1;
        }
    }

    public int[] c(int n, int n2, int n3, int n4) {
        int[] nArray = new int[]{n, n2, n + n3 - 1, n2, n + n3 - 1, n2 - n4 + 1, n, n2 - n4 + 1};
        return nArray;
    }

    public int[][] a(short[][][][] sArray, int n, int n2, int n3) {
        int[][] nArray = new int[2][3];
        try {
            nArray[0][0] = sArray[n][n2][n3][1];
            nArray[0][1] = sArray[n][n2][n3][2];
            nArray[0][2] = sArray[n][n2][n3][3];
            nArray[1][0] = sArray[n][n2][n3][4];
            nArray[1][1] = sArray[n][n2][n3][5];
            nArray[1][2] = sArray[n][n2][n3][6];
        }
        catch (Exception exception) {
            return null;
        }
        return nArray;
    }

    public int[] b(short[][][] sArray, short[][][][] sArray2, int n, int n2, int n3) {
        int[] nArray = new int[2];
        int[][] nArray2 = this.a(sArray2, n, n2, n3);
        short s = sArray2[n][n2][n3][0];
        short s2 = sArray[n][s][3];
        short s3 = sArray[n][s][4];
        int n4 = s2 * nArray2[0][0] + s3 * nArray2[0][1];
        int n5 = s2 * nArray2[1][0] + s3 * nArray2[1][1];
        nArray[0] = nArray2[0][2] + (n4 < 0 ? n4 : 0);
        nArray[1] = nArray2[1][2] + (n5 < 0 ? n5 : 0);
        return nArray;
    }

    public int[] a(short[][][] sArray, short[][][][] sArray2, int n, int n2, int n3) {
        int[] nArray = new int[2];
        int[][] nArray2 = this.a(sArray2, n, n2, n3);
        short s = sArray2[n][n2][n3][0];
        short s2 = sArray[n][s][3];
        short s3 = sArray[n][s][4];
        int n4 = s2 * nArray2[0][0] + s3 * nArray2[0][1];
        int n5 = s2 * nArray2[1][0] + s3 * nArray2[1][1];
        nArray[0] = Math.abs(n4);
        nArray[1] = Math.abs(n5);
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
                    return 5;
                }
                if (nArray[0][1] != -1 || nArray[1][0] != -1 || nArray[1][1] != 0) break;
                return 7;
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
        return 0;
    }
}


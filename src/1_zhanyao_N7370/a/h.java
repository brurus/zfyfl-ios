/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.b;
import a.d;
import a.f;
import a.i;
import a.k;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class h
extends f
implements d,
k {
    protected static byte[][][] lN = new byte[][][]{new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}, new byte[][]{{-1, 0, 1, 2, 3, 4}}};
    public int lO = 20;
    public int lJ = 20;
    public int lK = 0;
    public int lM = 0;
    public int lR = 0;
    public int lQ = 0;
    public int lL = 0;
    public int lP = 0;
    public int lU;
    public int lT;
    public int lS = 280;
    public int lI = 320;

    protected int a(b b2, int n, int n2, int n3, int n4, short[][] sArray, int n5, boolean bl) {
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
        block22: for (int i2 = 0; i2 < n10; ++i2) {
            block23: for (int i3 = 0; i3 <= n9; ++i3) {
                n7 = n13 - n13 % n11;
                n8 = n14 + (this.lJ - n14 % n12 - 1);
                if (n7 >= 0 && n7 < this.lU && n8 >= 0 && n8 < this.lT) {
                    int n15 = sArray[n7 / n11][n8 / n12] >> 3;
                    by = lN[this.lK][0][n15 + 1];
                    switch (by) {
                        case 0: {
                            if (this.a(n, n2, n3, n4, n7, n8, n11, n12, n5) != 1000) break;
                            if (bl && null != b2) {
                                this.a(b2, i.if(n, n2, n3, n4), i.if(n7, n8, n11, n12), n5);
                            }
                            return by + 1000;
                        }
                        case 1: {
                            if (n5 != 2 || this.a(n, n2 - n4 + 0, n3, 0, n7, n8, n11, 2, 2) >= 3000) break;
                            if (bl && null != b2) {
                                this.a(b2, i.if(n, n2 - n4, n3, 0), i.if(n7, n8, n11, 1), 2);
                            }
                            return by + 1000;
                        }
                        case 2: {
                            if (!this.a(b2, n, n2 - 0 + 0, n3, n4, n7, n8 - this.lJ + 1, 1000, 1000, this.lO, 0, n5)) break;
                            return by + 1000;
                        }
                        case 3: {
                            if (!this.a(b2, n, n2 - 0 + 0, n3, n4, n7, n8 + 0, -1000, 1000, this.lO, 0, n5)) break;
                            return by + 1000;
                        }
                    }
                }
                switch (n6) {
                    case 1: 
                    case 2: {
                        if ((n13 += this.lO) <= n + n3) continue block23;
                        n13 = n + n3;
                        continue block23;
                    }
                    case 4: 
                    case 8: {
                        if ((n14 -= this.lJ) >= n2 - n4) continue block23;
                        n14 = n2 - n4;
                    }
                }
            }
            switch (n6) {
                case 1: {
                    if ((n14 -= this.lJ) < n2 - n4) {
                        n14 = n2 - n4;
                    }
                    n13 = n;
                    continue block22;
                }
                case 2: {
                    if ((n14 += this.lJ) > n2 + n4) {
                        n14 = n2 + n4;
                    }
                    n13 = n;
                    continue block22;
                }
                case 3: {
                    if ((n13 += this.lO) > n + n3) {
                        n13 = n + n3;
                    }
                    n14 = n2;
                    continue block22;
                }
                case 4: {
                    if ((n13 -= this.lO) < n - n3) {
                        n13 = n - n3;
                    }
                    n14 = n2;
                }
            }
        }
        return 3000;
    }

    public int[] a(b b2, int n, b b3, int n2, int n3) {
        int n4;
        int[] nArray = new int[9];
        int n5 = 3000;
        int[] nArray2 = this.a(b2);
        for (n4 = 0; n4 < nArray2.length; ++n4) {
            nArray[n4] = nArray2[n4];
        }
        nArray2 = this.a(b3);
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
        nArray[8] = n5 + b3.o8 + 500;
        if (nArray[8] >= 1000 && nArray[8] < 3000) {
            return nArray;
        }
        return null;
    }

    protected int[] a(b b2) {
        int[] nArray = new int[4];
        int n = b2.oB;
        short s = b2.o8 == 0 ? b2.oS : b2.oC[0];
        try {
            nArray[0] = b2.o0 + (b2.oE == 1 ? this.lF[n][s][0] : -this.lF[n][s][2]);
            nArray[1] = b2.oZ - this.lF[n][s][1];
            nArray[2] = this.lF[n][s][2] - this.lF[n][s][0];
            nArray[3] = this.lF[n][s][3] - this.lF[n][s][1];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return nArray;
    }

    protected boolean a(b b2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int[] nArray = i.if(n, n2, n3, n4);
        int n12 = n11 == 0 ? (int)b2.oH : n11;
        int n13 = 0;
        switch (n10) {
            case 0: {
                if (n7 > 0) {
                    n13 = 2;
                    switch (n12) {
                        case 8: {
                            if (nArray[n13 * 2 + 1] < n6 + n9 * n8 / n7 && nArray[n13 * 2 + 1] >= n6) {
                                if (nArray[n13 * 2] < 1 + n5 + (nArray[n13 * 2 + 1] - n6) * n7 / n8) break;
                                if (null != b2) {
                                    b2.oZ += (nArray[n13 * 2] - n5) * n8 / n7 - (nArray[n13 * 2 + 1] - n6);
                                }
                                return true;
                            }
                            if (!this.a(n5, n6, nArray)) break;
                            if (null != b2) {
                                b2.o0 -= nArray[4] - n5 + 1;
                            }
                            return true;
                        }
                        case 2: {
                            if (nArray[n13 * 2] < n5 + n9 && nArray[n13 * 2] >= n5) {
                                if (nArray[n13 * 2 + 1] > 2 + n6 + (nArray[n13 * 2] - n5) * n8 / n7) break;
                                if (null != b2) {
                                    b2.oZ += (nArray[n13 * 2] - n5) * n8 / n7 - (nArray[n13 * 2 + 1] - n6) + 2 + 0;
                                }
                                return true;
                            }
                            if (!this.a(n5 + n9 - 1, n6 + n9 * n8 / n7, nArray)) break;
                            if (null != b2) {
                                b2.oZ += n6 + n9 * n8 / n7 - nArray[5] + 1;
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
                            if (null != b2) {
                                b2.oZ += n6 - nArray[n13 * 2 + 1] - (nArray[n13 * 2] - n5) * -n8 / n7;
                            }
                            return true;
                        }
                        if (!this.a(n5 + n9 - 1, n6 - n9 * n8 / -n7, nArray)) break;
                        if (null != b2) {
                            b2.o0 += n5 + n9 - 1 - nArray[6] + 1;
                        }
                        return true;
                    }
                    case 2: {
                        if (nArray[n13 * 2] < n5 + n9 && nArray[n13 * 2] > n5) {
                            if (nArray[n13 * 2 + 1] > 2 + n6 - (nArray[n13 * 2] - n5) * n8 / -n7) break;
                            if (null != b2) {
                                b2.oZ += n6 - nArray[n13 * 2 + 1] - (nArray[n13 * 2] - n5) * n8 / -n7 + 2;
                            }
                            return true;
                        }
                        if (!this.a(n5, n6, nArray)) break;
                        if (null != b2) {
                            b2.oZ += n6 - nArray[5] + 2;
                        }
                        return true;
                    }
                }
                break;
            }
        }
        return false;
    }

    public boolean a(int n, int n2, int[] nArray) {
        return n >= nArray[0] && n <= nArray[2] && n2 >= nArray[5] && n2 <= nArray[3];
    }

    protected int a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int[] nArray = i.if(n, n2, n3, n4);
        int[] nArray2 = i.if(n5, n6, n7, n8);
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

    protected int a(b b2, b b3, int n, int n2, boolean bl) {
        int[] nArray = null;
        if (null == b2) {
            return -1;
        }
        if (null == b3) {
            return -1;
        }
        switch (n2) {
            case 2: {
                nArray = this.a(b2, 2, b3, 3, n);
                if (nArray == null) break;
                if (nArray[8] >= 1000 && nArray[8] < 2000) {
                    if (n != 2) break;
                    if (bl) {
                        this.a(b2, i.if(nArray[0], nArray[1], nArray[2], nArray[3]), i.if(nArray[4], nArray[5], nArray[6], nArray[7]), n);
                    }
                    return 1000 + b3.o8 + 500;
                }
                if (nArray[8] < 2000 || nArray[8] >= 3000) break;
                return 2000 + b3.o8 + 500;
            }
            default: {
                nArray = this.a(b2, 1, b3, 1, n);
                if (nArray == null) break;
                if (nArray[8] >= 1000 && nArray[8] < 2000) {
                    if (bl) {
                        this.a(b2, i.if(nArray[0], nArray[1], nArray[2], nArray[3]), i.if(nArray[4], nArray[5], nArray[6], nArray[7]), n);
                    }
                    return 1000 + b3.o8 + 500;
                }
                if (nArray[8] < 2000 || nArray[8] >= 3000) break;
                return 2000 + b3.o8 + 500;
            }
        }
        return 3000;
    }

    protected void a(b b2, int[] nArray, int[] nArray2, int n) {
        if ((n & 1) == 1) {
            b2.oZ -= nArray[1] - nArray2[5] + 1;
        } else if ((n & 2) == 2) {
            b2.oZ += nArray2[1] - nArray[5] + 2;
        } else if ((n & 4) == 4) {
            b2.o0 += nArray2[2] - nArray[0] + 1;
        } else if ((n & 8) == 8) {
            b2.o0 -= nArray[2] - nArray2[0] + 1;
        }
    }

    public int case(int n) {
        try {
            return i.a(n, i.lw);
        }
        catch (Exception exception) {
            new Throwable("\u83b7\u53d6\u4e0d\u5230 transform").printStackTrace();
            return -1;
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
        nArray = this.a(nArray, n3, n, n2);
        return nArray;
    }

    public int[] a(int[] nArray, int n, int n2, int n3) {
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

    public int[] a(short[][][] sArray, int n, int n2) {
        int[] nArray = new int[]{sArray[n][n2][3], sArray[n][n2][4]};
        return nArray;
    }

    public int[] if(short[][][] sArray, int n, int n2) {
        int[] nArray = new int[2];
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


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
extends g {
    private int a;
    public short[][][] b;
    public short[][][][] a = 60;
    public short[][][][] b = new short[this.a][0][];
    public short[][][] c;
    public short[][][] d;
    public short[][][] e;
    private static byte[] a = new byte[]{-1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
    public int j = 20;
    public int k = 20;
    public int l;
    public int m;
    public int n = 240;
    public int o = 260;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public int x = 0;

    public m() {
        this.a = new short[this.a][0][][];
        this.b = new short[this.a][0][][];
        this.c = new short[this.a][0][];
        this.d = new short[this.a][0][];
        this.e = new short[6][][];
    }

    protected final int a(p p2, int n2, int n3, int n4, int n5, short[][] sArray, int n6, boolean bl) {
        int n7 = n6;
        int n8 = 0;
        int n9 = 0;
        int n10 = 2;
        int n11 = 2;
        int n12 = n2;
        int n13 = n3;
        int n14 = 0;
        switch (n6) {
            case 1: {
                n10 = n4 / 20 + (n4 % 20 != 0 ? 1 : 0);
                n12 = n2;
                n13 = n3;
                n11 = n5 / 20 + (n5 % 20 != 0 ? 1 : 0);
                break;
            }
            case 2: {
                n10 = n4 / 20 + (n4 % 20 != 0 ? 1 : 0);
                n12 = n2;
                n13 = n3 - n5 + 1;
                n11 = n5 / 20 + (n5 % 20 != 0 ? 1 : 0);
                break;
            }
            case 4: {
                n10 = n5 / 20 + (n5 % 20 != 0 ? 1 : 0);
                n12 = n2;
                n13 = n3;
                n11 = n4 / 20 + (n4 % 20 != 0 ? 1 : 0);
                break;
            }
            case 8: {
                n10 = n5 / 20 + (n5 % 20 != 0 ? 1 : 0);
                n12 = n2 + n4 - 1;
                n13 = n3;
                n11 = n4 / 20 + (n4 % 20 != 0 ? 1 : 0);
            }
        }
        block27: for (int i2 = 0; i2 < n11; ++i2) {
            block28: for (int i3 = 0; i3 <= n10; ++i3) {
                n8 = n12 - n12 % 20;
                n9 = n13 + (this.k - n13 % 20 - 1);
                if (n8 >= 0 && n8 < this.l && n9 >= 0 && n9 < this.m) {
                    n14 = sArray[n8 / 20][n9 / 20] >> 3;
                    n14 = a[n14 + 1];
                    switch (n14) {
                        case 0: {
                            if (m.a(n2, n3, n4, n5, n8, n9, 20, 20, n6) != 1000) break;
                            if (bl && null != p2) {
                                m.a(p2, m.a(n2, n3, n4, n5), m.a(n8, n9, 20, 20), n6);
                            }
                            return n14 + 1000;
                        }
                        case 1: {
                            if (!this.a(p2, n2, n3, n4, n5, n8, n9 - this.k + 1, 1000, 1000, this.j, 0, n6)) break;
                            return n14 + 1000;
                        }
                        case 2: {
                            if (!this.a(p2, n2, n3, n4, n5, n8, n9, -1000, 1000, this.j, 0, n6)) break;
                            return n14 + 1000;
                        }
                        case 3: {
                            if (n6 != 2 || m.a(n2, n3 - n5, n4, 1, n8, n9 - 20, 20, 2, n6) >= 3000) break;
                            if (bl && null != p2) {
                                m.a(p2, m.a(n2, n3 - n5, n4, 1), m.a(n8, n9 - 20, 20, 1), n6);
                            }
                            return n14 + 1000;
                        }
                        case 4: {
                            if (n6 != 1 || m.a(n2, n3, n4, n5, n8, n9, 20, 2, n6) >= 3000) break;
                            if (bl && null != p2) {
                                m.a(p2, m.a(n2, n3, n4, n5), m.a(n8, n9, 20, 1), n6);
                            }
                            return n14 + 1000;
                        }
                        case 5: {
                            if (n6 != 4 && n6 != 8 || m.a(n2, n3, n4, n5, n8, n9, 20, 20, n6) != 1000) break;
                            if (bl && null != p2) {
                                m.a(p2, m.a(n2, n3, n4, n5), m.a(n8, n9, 20, 20), n6);
                            }
                            return n14 + 1000;
                        }
                        case 6: {
                            if (n6 != 8 || m.a(n2, n3, n4, n5, n8, n9, 20, 20, n6) != 1000) break;
                            if (bl && null != p2) {
                                m.a(p2, m.a(n2, n3, n4, n5), m.a(n8, n9, 20, 20), n6);
                            }
                            return n14 + 1000;
                        }
                        case 7: {
                            if (n6 != 4 || m.a(n2, n3, n4, n5, n8, n9, 20, 20, n6) != 1000) break;
                            if (bl && null != p2) {
                                m.a(p2, m.a(n2, n3, n4, n5), m.a(n8, n9, 20, 20), n6);
                            }
                            return n14 + 1000;
                        }
                        case 8: {
                            if (m.a(n2, n3, n4, n5, n8, n9, 20, 20, n6) != 1000) break;
                            return n14 + 1000;
                        }
                    }
                }
                switch (n7) {
                    case 1: 
                    case 2: {
                        if ((n12 += this.j) <= n2 + n4) continue block28;
                        n12 = n2 + n4;
                        continue block28;
                    }
                    case 4: 
                    case 8: {
                        if ((n13 -= this.k) >= n3 - n5) continue block28;
                        n13 = n3 - n5;
                    }
                }
            }
            switch (n7) {
                case 1: {
                    if ((n13 -= this.k) < n3 - n5) {
                        n13 = n3 - n5;
                    }
                    n12 = n2;
                    continue block27;
                }
                case 2: {
                    if ((n13 += this.k) > n3 + n5) {
                        n13 = n3 + n5;
                    }
                    n12 = n2;
                    continue block27;
                }
                case 3: {
                    if ((n12 += this.j) > n2 + n4) {
                        n12 = n2 + n4;
                    }
                    n13 = n3;
                    continue block27;
                }
                case 4: {
                    if ((n12 -= this.j) < n2 - n4) {
                        n12 = n2 - n4;
                    }
                    n13 = n3;
                }
            }
        }
        return 3000;
    }

    protected final int[] a(p p2) {
        int[] nArray = new int[4];
        int n2 = p2.g;
        short s = p2.b[0];
        nArray[0] = p2.m + (p2.e == 1 ? this.c[n2][s][0] : -this.c[n2][s][2]);
        nArray[1] = p2.n - this.c[n2][s][1];
        nArray[2] = this.c[n2][s][2] - this.c[n2][s][0];
        nArray[3] = this.c[n2][s][3] - this.c[n2][s][1];
        return nArray;
    }

    private boolean a(p p2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        Object object = m.a(n2, n3, n4, n5);
        int n13 = n2 = n12 == 0 ? (int)p2.b : n12;
        if (n8 > 0) {
            switch (n2) {
                case 8: {
                    if (object[5] < n7 + n10 * 1000 / n8 && object[5] >= n7) {
                        if (object[4] < n6 + 1 + (object[5] - n7) * n8 / 1000) break;
                        if (null != p2) {
                            p2.n += (object[4] - n6) * 1000 / n8 - (object[5] - n7);
                        }
                        return true;
                    }
                    if (!m.a(n6, n7, (int[])object)) break;
                    if (null != p2) {
                        p2.m -= object[4] - n6 + true;
                    }
                    return true;
                }
                case 2: {
                    if (object[4] < n6 + n10 && object[4] >= n6) {
                        if (object[5] > n7 + 2 + (object[4] - n6) * 1000 / n8) break;
                        if (null != p2) {
                            p2.n += (object[4] - n6) * 1000 / n8 - (object[5] - n7) + 2;
                        }
                        return true;
                    }
                    if (!m.a(n6 + n10 - 1, n7 + n10 * 1000 / n8, (int[])object)) break;
                    if (null != p2) {
                        p2.n += n7 + n10 * 1000 / n8 - object[5] + 1;
                    }
                    return true;
                }
            }
        } else if (n8 < 0) {
            switch (n2) {
                case 4: {
                    if (object[7] < n7 && object[7] >= n7 - n10 * 1000 / -n8) {
                        if (object[6] > n6 + (n7 - object[7]) * -n8 / 1000) break;
                        if (null != p2) {
                            p2.n += n7 - object[7] - (object[6] - n6) * -1000 / n8;
                        }
                        return true;
                    }
                    if (!m.a(n6 + n10 - 1, n7 - n10 * 1000 / -n8, (int[])object)) break;
                    if (null != p2) {
                        p2.m += n6 + n10 - 1 - object[6] + 1;
                    }
                    return true;
                }
                case 2: {
                    if (object[6] < n6 + n10 && object[6] > n6) {
                        if (object[7] > n7 + 2 - (object[6] - n6) * 1000 / -n8) break;
                        if (null != p2) {
                            p2.n += n7 - object[7] - (object[6] - n6) * 1000 / -n8 + 2;
                        }
                        return true;
                    }
                    if (!m.a(n6, n7, (int[])object)) break;
                    if (null != p2) {
                        p2.n += n7 - object[5] + 2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(int n2, int n3, int[] nArray) {
        return n2 >= nArray[0] && n2 <= nArray[2] && n3 >= nArray[5] && n3 <= nArray[3];
    }

    protected static int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int[] nArray = m.a(n2, n3, n4, n5);
        int[] nArray2 = m.a(n6, n7, n8, n9);
        if (n4 == 0 && n5 == 0 || n8 == 0 && n9 == 0) {
            return 3000;
        }
        for (n4 = 0; n4 < 4; ++n4) {
            if (nArray[n4 << 1] >= nArray2[0] && nArray[n4 << 1] <= nArray2[2] && nArray[(n4 << 1) + 1] <= nArray2[3] && nArray[(n4 << 1) + 1] >= nArray2[5]) {
                return 1000;
            }
            if (nArray2[n4 << 1] < nArray[0] || nArray2[n4 << 1] > nArray[2] || nArray2[(n4 << 1) + 1] > nArray[3] || nArray2[(n4 << 1) + 1] < nArray[5]) continue;
            return 1000;
        }
        if (nArray2[0] >= nArray[0] && nArray2[2] <= nArray[2] && nArray2[1] >= nArray[3] && nArray2[7] <= nArray[5]) {
            return 1000;
        }
        if (nArray[0] >= nArray2[0] && nArray[2] <= nArray2[2] && nArray[1] >= nArray2[3] && nArray[7] <= nArray2[5]) {
            return 1000;
        }
        switch (n10) {
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

    protected final int a(p object, p p2, int n2, int n3, boolean bl) {
        Object var3_6 = null;
        if (null == object) {
            return -1;
        }
        if (null == p2) {
            return -1;
        }
        int n4 = 2;
        boolean bl2 = true;
        p p3 = p2;
        int n42 = 1;
        m m2 = this;
        int[] nArray = new int[9];
        int n5 = 0;
        object = m2.a((p)object);
        for (n5 = 0; n5 < ((Object)object).length; ++n5) {
            nArray[n5] = (int)object[n5];
        }
        object = m2.a(p3);
        for (n5 = 0; n5 < ((Object)object).length; ++n5) {
            nArray[n5 + 4] = (int)object[n5];
        }
        switch (n42) {
            case 2: {
                nArray[1] = nArray[1] - nArray[3];
                nArray[3] = 0;
            }
        }
        n5 = m.a(nArray[0], nArray[1], nArray[2], nArray[3], nArray[4], nArray[5], nArray[6], nArray[7], n4);
        nArray[8] = n5 + p3.g + 500;
        int[] nArray2 = nArray[8] >= 1000 && nArray[8] < 3000 ? nArray : null;
        if (nArray2 != null) {
            if (nArray2[8] >= 1000 && nArray2[8] < 2000) {
                return 1000 + p2.g + 500;
            }
            if (nArray2[8] >= 2000 && nArray2[8] < 3000) {
                return 2000 + p2.g + 500;
            }
        }
        return 3000;
    }

    private static void a(p p2, int[] nArray, int[] nArray2, int n2) {
        if ((n2 & 1) == 1) {
            p2.n -= nArray[1] - nArray2[5] + 1;
            return;
        }
        if ((n2 & 2) == 2) {
            p2.n += nArray2[1] - nArray[5] + 2;
            return;
        }
        if ((n2 & 4) == 4) {
            p2.m += nArray2[2] - nArray[0] + 1;
            return;
        }
        if ((n2 & 8) == 8) {
            p2.m -= nArray[2] - nArray2[0] + 1;
        }
    }
}


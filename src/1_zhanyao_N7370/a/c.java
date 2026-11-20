/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class c
extends e {
    public int[] pU = new int[]{0, 0};
    public static byte[] fM = new byte[]{1, -1};
    public static final short pX = 1000;
    public short[] pc = new short[10];
    public int pW = 0;
    public int pT = 0;
    public int pY = 0;
    public int pZ = -1;
    public int[] pS = new int[2];
    public int[][] pV = new int[3][2];
    public int[] p0 = null;

    public c() {
        this.oz = this.oz;
        this.pk = this.pk;
    }

    public static void if(c c2, int n) {
        int n2;
        for (n2 = 0; n2 < c2.pV.length - 1; ++n2) {
            c2.pV[n2 + 1][0] = c2.pV[n2][0];
        }
        if (n2 > 0) {
            c2.pV[n2][0] = n;
        }
    }

    public static void do(c c2, int n) {
        int n2;
        for (n2 = 0; n2 < c2.pV.length - 1; ++n2) {
            c2.pV[n2 + 1][1] = c2.pV[n2][1];
        }
        if (n2 > 0) {
            c2.pV[n2][1] = n;
        }
    }
}


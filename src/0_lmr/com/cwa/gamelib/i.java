/*
 * Decompiled with CFR 0.152.
 */
package com.cwa.gamelib;

import com.cwa.gamelib.b;

public class i
implements b {
    public static short aG = 0;
    public int aD = 0;
    public int aR;
    public int aT = -1;
    public byte[] ac = new byte[]{4, 4};
    public byte[] B = new byte[]{0, 0};
    public static byte z = (byte)2;
    public static byte aP = (byte)5;
    public static byte az = (byte)7;
    public static byte f = (byte)10;
    public static byte al = (byte)15;
    i o;
    i[] au;
    public boolean aA = true;
    public boolean Z = false;
    public byte K = 1;
    public short ap = 0;
    public short O = (short)-1;
    public int C;
    public int A;
    public int I;
    public int u;
    public int e;
    public int aW;
    public int v;
    public int N;
    public int aV = 0;
    public int[] U = new int[2];
    public int b = 0;
    public short aH = 0;
    public boolean r = false;
    public byte[] T = new byte[2];
    public int[] af = new int[]{115, 115};
    public int[] G = new int[]{10, 200};
    public int[] J = new int[]{10, 103};
    public int[] m = new int[]{60, 60};
    public int[] cd = new int[]{0, 0};
    public int[] ag = new int[]{1, 99};
    public int[] Y = new int[]{20, 20};
    public byte ah = 0;
    public int aa = -1;
    public int ak = 0;
    public boolean ab = false;
    public byte[] at = new byte[]{0, 2};
    public byte aS = 0;
    public byte[] aL = new byte[]{0, 0};
    public int i = 0;
    public boolean E = false;
    public int[] aK = new int[2];
    public int[] ar = new int[4];
    public int[] c = new int[4];
    public int[] y = new int[4];
    public int[] k = new int[4];
    public int[] av = new int[4];
    public boolean D = false;
    public boolean[] an;
    public int F = 0;
    public int aw = 0;
    public int aE = 0;
    public int aO = 0;
    public int[][] W;
    public int[][] ao;
    public i[] w = new i[0];
    public i[] ai = new i[0];
    public i t;
    public int aJ = 0;
    public int[][] aF = new int[2][2];
    public short[] am = new short[4];
    public int[][] L = new int[10][12];
    public int[][][] j;
    public byte[] a;
    public static int[][] R = new int[][]{{1, 12, 0, 0, 240, -1, 8, 5}, {1, 12, 0, 0, 240, -1, 6, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 10, 0, 0, 240, -1, 1, 5}, {1, 8, 0, 0, 240, -1, 1, 5}, {1, 8, 0, 0, 50, -1, 1, 5}, {1, 15, 0, 0, 240, -1, 1, 5}, {1, 8, 0, 0, 480, 15, 9, 5}, {1, 8, 0, 0, 480, -1, 1, 5}, {1, 4, 0, 0, 240, -1, 1, 5}, {1, 4, 0, 0, 240, -1, 1, 5}, {5, 20, 20, 0, 480, -1, 70, 5}, {1, 10, 0, 0, 240, -1, 5, 5}, {3, 20, 20, 0, 240, -1, 3, 5}, {4, 20, 0, 0, 240, -1, 72, 5}, {12, 8, 8, 0, 480, -1, 12, 5}};
    public int[] H = new int[2];
    public int[] Q = new int[4];

    public static void a(int[] nArray, int n, int n2, int n3, int n4) {
        nArray[0] = n;
        nArray[1] = n2;
        nArray[2] = n3;
        nArray[3] = n4;
    }

    public static void a(i i2, int n, int n2, int n3) {
        if (n3 == 0 || n3 == 1) {
            i2.e = i2.C = n;
            i2.v = i2.C;
            i2.I = i2.C;
        }
        if (n3 == 0 || n3 == 2) {
            i2.aW = i2.A = n2;
            i2.N = i2.A;
            i2.u = i2.A;
        }
    }

    public static void a(i i2) {
        i2.v = i2.e = i2.C;
        i2.I = i2.e;
        i2.N = i2.aW = i2.A;
        i2.u = i2.aW;
    }

    public static void a(i i2, byte by) {
        i2.T[0] = by;
        i2.T[1] = i2.T[0];
        i2.r = false;
        i2.aH = 0;
        i2.aV = 0;
        i2.b = 0;
        i2.aS = 0;
    }
}


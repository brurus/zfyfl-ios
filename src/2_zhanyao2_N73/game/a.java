/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.i;

public class a
extends i {
    public static short M = 0;
    public byte[] H = new byte[]{5, 5};
    public boolean L = false;
    public a[][] w;
    public boolean K = true;
    public boolean S = true;
    public byte aq = 0;
    public boolean ae = false;
    public boolean ap = false;
    public boolean m = false;
    public short X = (short)-1;
    public int[] b = new int[]{150, 150, 0};
    public int[] N = new int[]{10, 200, 0};
    public int[] R = new int[]{10, 10, 0};
    public int[] v = new int[]{60, 60, 0};
    public int[] an = new int[]{0, 0};
    public int[] a = new int[]{1, 999, 0};
    public byte i = (byte)-1;
    public byte al = 1;
    public int j = 0;
    public int l = 0;
    public int Q = 0;
    public boolean[] k = new boolean[20];
    public short[] J = new short[10];
    public int[][][] n;
    public byte[] c;
    public static int[][][] ad = new int[][][]{new int[][]{{1, 5, 5, 0, 240, -1, 2, 0, -1, 0, 0}, {1, 5, 5, 0, 240, -1, 2, 0, -1, 0, 0}, {1, 5, 5, 0, 240, -1, 2, 0, -1, 0, 0}, {3, 5, 5, 0, 240, -1, 9, 0, 4, 7, 0}, {3, 5, 5, 0, 240, -1, 9, 0, 5, 8, 1}, {3, 5, 5, 0, 240, -1, 9, 0, -1, 0, 0}, {1, 5, 5, 0, 240, -1, 2, 0, -1, 0, 0}, {1, 5, 5, 0, 240, -1, 2, 0, -1, 0, 0}, {1, 5, 5, 0, 240, -1, 2, 0, -1, 0, 0}, {6, 5, 5, 0, 240, -1, 18, 0, 10, 7, 0}, {6, 5, 5, 0, 240, -1, 18, 0, 11, 8, 1}, {6, 5, 5, 0, 240, -1, 18, 0, -1, 0, 0}, {9, 5, 5, 0, 240, -1, 27, 0, 13, 7, 0}, {9, 5, 5, 0, 240, -1, 27, 0, 14, 8, 1}, {9, 5, 5, 0, 240, -1, 27, 0, -1, 0, 0}}, new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[][]{{3, 10, 0, 0, 360, -1, 9, 80}, {4, 20, 20, 0, 360, -1, 72, 75}, {5, 20, 20, 0, 360, -1, 70, 90}, {1, 30, 0, 0, 240, -1, 1, 80}}, new int[0][], new int[][]{{1, 4, 0, 0, 480, -1, 2, 80}, {1, 30, 0, 0, 240, -1, 6, 80}}, new int[0][], new int[][]{{1, 5, 5, 0, 240, -1, 5, 80}, {3, 5, 5, 0, 240, -1, 15, 80}, {5, 5, 5, 0, 240, -1, 25, 80}, {3, 0, 0, 0, 240, -1, 3, 80, 6, 14, 1}, {5, 0, 0, 0, 240, -1, 5, 80, 6, 14, 1}, {7, 0, 0, 0, 240, -1, 7, 80, 6, 14, 1}, {1, 0, 0, 0, 240, -1, 7, 80, -1, 0, 0}}};
    public int[] aa = new int[4];
    public int[] t = new int[4];
    public int[] e = new int[4];
    public int[] D = new int[4];
    public int[] p = new int[4];
    public int[] x = new int[4];

    public static void a(a a2, int n, int n2) {
        a2.g = a2.I = n;
        a2.B = a2.I;
        a2.P = a2.I;
        a2.at = a2.G = n2;
        a2.W = a2.G;
        a2.z = a2.G;
    }

    public static void a(a a2, byte by) {
        a2.af[0] = by;
        a2.af[1] = a2.af[0];
    }

    public static void b(a a2, byte by) {
        a2.r[0] = by;
        a2.r[1] = a2.r[0];
    }

    public static void a(int[] nArray, int n, int n2, int n3, int n4) {
        nArray[0] = n;
        nArray[1] = n2;
        nArray[2] = n3;
        nArray[3] = n4;
    }

    public void a(int[] nArray) {
        this.j = nArray[0];
        this.l = nArray[1];
        this.Q = nArray[2];
    }
}


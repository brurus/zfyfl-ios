/*
 * Decompiled with CFR 0.152.
 */
package com.cwa.gamelib;

import com.cwa.gamelib.GMIDlet;
import com.cwa.gamelib.a;
import com.cwa.gamelib.b;
import com.cwa.gamelib.d;
import com.cwa.gamelib.f;
import com.cwa.gamelib.g;
import com.cwa.gamelib.h;
import com.cwa.gamelib.i;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;

public class c
extends h
implements b,
com.sina.utils.wma.a {
    public byte[] bI = new byte[]{4, 2, 2, 2, 2};
    public String[][] s = new String[20][];
    public String[] au;
    public boolean aU = false;
    public byte[] aG = new byte[]{0, 0, 0, 0, 0, 0};
    public int cc = 10;
    public boolean[] bS = new boolean[]{true, true, true, true, true, true};
    public byte[] am = new byte[]{0, 0, 0, 0, 0, 0};
    public byte bA = 0;
    public byte cg = 0;
    public com.sina.utils.wma.b aP = null;
    public boolean aL = true;
    public byte[] ba = new byte[]{1, 2, 3, 4};
    public boolean aw = false;
    public int E = 10;
    public Random cm = new Random();
    public a Z;
    public Image[] bL = new Image[10];
    public int J = 0;
    public int u = 0;
    public int bN = 0;
    public int av = 0;
    public i cj = null;
    public byte[][] aB = new byte[54][];
    public g bj = new g();
    public Object[] cb = new Object[9];
    int al = 21;
    int br = 36;
    int ci = 71;
    int aJ = 1;
    int bb = 1;
    private int[][] cf = new int[2][2];
    public int[] cl = new int[20];
    public short[] ah = new short[130];
    public short[][] R = new short[][]{{2, -1, 2, -1, 0, 38, 0, 56, 0, 60, 0, 52, 0, 53, 0, 49, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 0, 50, 2, -1}, {2, -1, 2, -1, 2, -1, 2, -1, 2, -1, 0, 54}};
    public boolean D = false;
    public int a = 0;
    public int[][] r = new int[][]{{-1, 1}, {0, 0, 10, -20, 32, 11, 20, 32}, {-1, 0, 11, 10, 32}, {1, 0, 5, 0, 64}, {1, 0, 2, 0, 64}, {2, 0, 1, -16, 48, 3, 16, 48}, {-1, 0}, {-1, 0}, {-1, 0}, {-1, 0}, {11, 0, 8, 0, 8}, {11, 0, 10, -20, 32, 11, 20, 32}, {28, 0, 13, 0, 70}, {25, 0, 7, 0, 64}, {66, 0, 14, 0, 70}, {49, 0, 9, 0, 64}};
    public int aT = 0;
    public int aS = 0;
    public int[][][] af = new int[][][]{new int[][]{{0, 0}}, new int[][]{{1, 0}, {1, 0, 1, 0, 0, 2, 0, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 0, 1, 0, 1, 1, 0, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 12, 1, 1, 0, 1, 0, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 12, 1, 1, 1, 1, 0, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 12, 1, 1, 2, 1, 0, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 12, 1, 1, 3, 1, 0, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 0, 1, 2, 4, 1, 0, 130, 240, 24, 1, 17}}, new int[][]{{2, 0}, {1, 0, 2, 1, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 2, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 3, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 4, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 5, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 6, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 7, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 8, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 9, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 30}, {1, 0, 2, 10, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 32}, {1, 0, 2, 11, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 20}, {1, 0, 2, 12, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 21}, {1, 0, 2, 13, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 14, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 15, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 16, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 17, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 26}, {1, 0, 2, 18, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 19, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 28}, {1, 0, 2, 20, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 29}, {1, 0, 2, 21, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{2, 0}, {1, 0, 2, 22, 0, 1, 0, 130, 240, 24, 1, 20}}, new int[][]{{3, 18}, {1, 2, 1, 3, 4, -1, 6, 6, 100, 0, 0, 0, -1, 0}, {1, 1, 18, 2, 0, -1, 6, 6, 0, 0, 0, 1, 11, 0}}, new int[][]{{3, 19}, {1, 2, 1, 6, 0, -1, 6, 6, 0, 0, 0, 0, -1, 0}}, new int[][]{{3, 0}, {1, 2, 1, 3, 0, -1, 6, 6, 0, 0, 0, 0, -1, 0}, {1, 1, 18, 2, 0, -1, 6, 6, 0, 0, 0, 1, 19, 0}}, new int[][]{{1, 0}, {1, 0, 1, 5, 1, 1, 40, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 0, 1, 6, 0, 1, 40, 130, 240, 24, 1, 17}}, new int[0][], new int[][]{{1, 0}, {1, 0, 1, 6, 1, 1, 40, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 0, 1, 6, 2, 1, 40, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 0, 1, 6, 3, 1, 40, 130, 240, 24, 1, 17}}, new int[][]{{1, 0}, {1, 0, 1, 7, 4, 1, 0, 130, 240, 24, 1, 17}}};
    public int bV = 20;
    public int f = 0;
    public int[][] bg = new int[1][];
    public byte[] aF = new byte[]{11, 25, 28, 49, 66, 75, 91};
    public short[] bO = new short[]{0, 17, 250, 48, 2, 9, 10, 1100, 32, 27, 150, 0, 16, 250, 48, 2, 11, 12, 4500, 60, 120, 400, 0, 14, 80, 64, 1, 13, 14, 1500, 46, 97, 250, 0, 18, 80, 32, 1, 17, 21, 10000, 130, 280, 1000, 0, 15, 80, 64, 1, 15, 16, 1600, 42, 150, 400, 0, 14, 80, 64, 1, 22, 23, 7000, 70, 193, 900, 0, 18, 80, 32, 1, 24, 25, 1, 130, 280, 0};
    public byte aE = (byte)11;
    public int[] bf = new int[4];
    public int aZ = 0;
    public int[][] bX = new int[4][4];
    public byte[][][] bM = new byte[4][4][3];
    public boolean[] aI = new boolean[20];
    final int t;
    public d ap;
    public f[] i;
    int[][][][] e = new int[][][][]{new int[][][]{new int[][]{{0}, {11, 5, 22, 0}}, new int[][]{{3}, {16, 12, 44, 0}}, new int[][]{{6}, {19, 3, 10, 0}}, new int[][]{{7}, {7, 8, 47, 0}}, new int[][]{{12}, {30, 4, 51, 0}}, new int[][]{{16}, {3, 16, 12, 0}}, new int[][]{{31}, {29, 12, 44, 0}}, new int[][]{{39}, {8, 22, 44, 0}}, new int[][]{{43}, {4, 11, 26, 0}, {3, 11, 37, 0}}, new int[][]{{48}, {4, 11, 14, 0}}, new int[][]{{50}, {7, 16, 18, 0}}, new int[][]{{67}, {8, 18, 13, 0}}, new int[][]{{69}, {5, 22, 15, 0}}, new int[][]{{70}, {27, 8, 52, 0}}, new int[][]{{58}, {5, 3, 11, 0}}, new int[][]{{63}, {29, 2, 48, 0}}, new int[][]{{20}, {3, 8, 25, 0}}, new int[][]{{26}, {7, 5, 44, 0}}, new int[][]{{81}, {4, 4, 19, 0}}, new int[][]{{83}, {6, 32, 44, 0}}, new int[][]{{84}, {4, 25, 44, 0}}, new int[][]{{86}, {40, 6, 21, 0}}, new int[][]{{87}, {13, 12, 44, 0}}}, new int[][][]{new int[][]{{12}, {30, 4, 27, 0}, {27, 51, 27, 0}}, new int[][]{{6}, {3, 3, 29, 0}, {8, 3, 31, 0}, {12, 3, 30, 0}, {15, 3, 32, 0}}, new int[][]{{70}, {27, 8, 28, 0}}}};
    i[] U;
    int[][] ac;
    int[][] bc;
    i[] F;
    public byte[] A = new byte[2];
    public byte[] bl = new byte[]{1, 1};
    public byte[] be = new byte[]{0, 6, 2, 3, 7};
    public byte[] bq = new byte[]{19, 6, 2, 16};
    public byte[] m = new byte[]{12, 13, 15, 14};
    public byte[] B = new byte[]{0, 1, 5, 2, 6, 3, 4, 7, 8};
    public byte[] bU = new byte[]{20, 21, 24};
    public byte[] v = new byte[]{22, 23};
    public short[] ck = new short[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
    public byte[] bp = new byte[14];
    public short[] bh = new short[70];
    public byte[] as = new byte[]{0, 2};
    public byte[] bu = new byte[]{1, 3, 4, 2};
    public byte[][] V = new byte[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}};
    public byte ag = (byte)-1;
    public byte c = (byte)-1;
    public byte[] bK = new byte[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    public byte[][] C = new byte[][]{{0, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26}, {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 63, 64, 65, 66}};
    public byte[] aA = new byte[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    public byte[] bP = new byte[]{59, 58, 60, 56, 57, 62, 67, 68, 46, 47, 48, 49, 50, 51, 52, 53, 54, 69};
    public byte[] z = new byte[]{33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43};
    public byte[] bv = new byte[]{25, 26, 27, 28, 29, 30, 31, 32};
    public byte[] ax = new byte[14];
    public byte[] aK = new byte[]{0, 0, 0, 7, 8};
    short[][][] bw;
    short[][] o;
    short[][] by;
    short[][][] at = new short[6][][];
    short[][][] aa = new short[6][][];
    protected int[][] bJ;
    private byte[][] bF = new byte[][]{{14, 17, 20, 23, 26, 29, 32, 35, 23}, {38, 41, 44, 47, 50, 53, 56, 59, 47}, {62, 65, 68, 71, 74, 77, 80, 83, 71}};
    protected static int[][] bY;
    public int[] aH = new int[2];
    protected static int[][][] aY;
    protected static int[] G;
    protected static int[] ai;
    protected static Image[][] bn;
    protected static Image[][][] b;
    protected static Image[][][] aD;
    protected static Image[][][] k;
    protected static Image[][] aO;
    private short[] bm = new short[]{10, 5, 3, 11, 8, 3, 0, 11, 3, 7, 11, 1, 51, 10, 1, 5, 13, 1, 6, 15, 1, 5, 18, 1, 4, 20, 1, 51, 21, 1, 8, 22, 1, 6, 24, 2, 12, 26, 2, 1, 21, 4, 27, 10, 10, 25, 9, 10, 27, 8, 9, 3, 7, 8, 9, 5, 7, 3, 4, 8, 10, 1, 9, 50, 3, 8, 5, 3, 7, 3, 2, 6, 51, 3, 6, 6, 4, 6, 2, 6, 6, 3, 7, 6, 31, 9, 9, 13, 22, 4, 21, 23, 4, 24, 25, 4, 13, 24, 5, 17, 23, 5, 20, 21, 7, 14, 20, 6, 23, 28, 4, 22, 31, 4, 13, 33, 4, 18, 34, 4, 13, 35, 8, 19, 36, 8, 13, 35, 13, 22, 33, 11, 23, 30, 12, 15, 29, 11, 50, 28, 12, 20, 27, 11, 22, 25, 10, 21, 27, 10, 16, 29, 8, 51, 30, 8, 23, 31, 8, 36, 17, 6, 27, 16, 6, 31, 17, 7, 32, 14, 6, 50, 13, 6, 25, 13, 7, 28, 12, 7, 51, 11, 9, 50, 11, 10, 30, 11, 11, 35, 12, 13, 51, 18, 12, 29, 19, 10, 34, 20, 12, 26, 20, 9, 30, 19, 7, 33, 22, 13, 35, 24, 14, 50, 24, 13, 45, 32, 13, 51, 32, 14, 37, 31, 13, 42, 29, 14, 41, 28, 14, 46, 29, 17, 50, 32, 17, 45, 25, 17, 47, 22, 17, 48, 18, 18, 46, 25, 18, 39, 28, 18, 40, 27, 20, 51, 26, 20, 49, 28, 22, 44, 25, 22, 51, 25, 24, 50, 23, 23, 38, 24, 23, 43, 22, 24, 50, 17, 1};
    private byte[] bi = new byte[this.bm.length / 3];
    public final short ao = (short)240;
    public final short K = (short)260;
    private short[][] bH = new short[][]{{2, 0, 8}, {0, 0, 4, 2, 0, 8}, {0, 0, 6}, {0, 1, 1, 0, 0, 4, 1, 0, 8}, {0, 0, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 12, 0, 3, 8}, {0, 0, 12}, {0, 0, 4, 1, 1, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 4}, {0, 0, 12}, {0, 0, 12, 0, 1, 8}, {0, 0, 12}, {0, 0, 12, 0, 1, 8}, {0, 0, 4, 0, 1, 8}, {0, 0, 4, 1, 0, 8, 0, 1, 4, 1, 1, 8}, {0, 0, 12, 0, 1, 4}, {2, 0, 8}, {0, 0, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 8, 0, 1, 8}, {0, 0, 12}, {0, 0, 4, 1, 0, 8}, {0, 0, 12}, {0, 0, 4, 0, 1, 4}, {0, 0, 4, 1, 0, 8}, {0, 0, 12}, {0, 0, 5, 1, 0, 8}, {0, 0, 4, 2, 0, 8, 0, 1, 4}, {0, 0, 12}, {0, 0, 10, 0, 2, 4}, {0, 0, 4, 1, 0, 8}, {0, 0, 4, 0, 1, 8}, {0, 0, 4, 2, 0, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 12}, {0, 0, 4, 0, 4, 12}, {0, 0, 12}, {0, 0, 4, 0, 5, 4}, {0, 0, 12}, {0, 1, 4}, {0, 0, 4, 2, 0, 8}, {0, 0, 4, 0, 1, 12}, {0, 0, 8}, {0, 0, 4, 1, 0, 8}, {1, 0, 8, 1, 1, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 8, 0, 2, 4}, {0, 0, 12}, {0, 0, 4, 2, 0, 8}, {0, 0, 4, 2, 0, 8}, {0, 0, 12, 0, 1, 8}, {0, 0, 4, 1, 0, 8}, {0, 0, 4, 1, 0, 8, 0, 1, 4}, {0, 0, 8}, {0, 0, 12}, {0, 0, 8, 0, 2, 4}, {0, 0, 12}, {0, 0, 4}, {0, 0, 4, 0, 2, 8}, {0, 0, 4}, {0, 0, 8}, {0, 0, 8, 0, 2, 12}, {0, 0, 4, 1, 1, 8}, {0, 0, 4, 0, 1, 4}, {0, 0, 4, 0, 2, 8}, {0, 0, 4, 1, 0, 8, 1, 1, 8}, {0, 0, 4}, {0, 0, 4}, {0, 0, 4, 2, 0, 8}, {0, 0, 4}, {0, 0, 8, 0, 1, 12}, {0, 0, 4, 1, 0, 8}, {0, 0, 8, 0, 3, 12}, {0, 0, 4, 2, 0, 8}, {0, 0, 4}, {0, 0, 4, 2, 0, 8}, {0, 1, 4, 2, 0, 8, 2, 1, 8}, {3, 0, 8}, {0, 0, 4, 2, 0, 8}, {0, 0, 4, 0, 2, 4}, {0, 0, 12, 0, 2, 12}, {0, 0, 8}, {0, 0, 4}, {1, 0, 8, 0, 1, 4}, {0, 0, 4}, {0, 0, 8}, {0, 0, 12, 0, 1, 12}, {1, 0, 8}, {0, 0, 12}};
    private byte[] ae = new byte[]{1, 1, 1, 1, 1, 1, 1, 2, 1, 4, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 3, 1, 3, 1, 3, 1, 1, 1, 1, 2, 1, 2, 1, 3, 1, 3, 1, 5, 1, 6, 2, 1, 2, 1, 2, 2, 3, 1, 3, 2, 1, 1, 1, 2, 1, 2, 1, 3, 1, 3, 1, 3, 2, 1, 2, 2, 2, 2, 2, 2, 3, 1, 3, 1, 1, 2, 1, 2, 1, 3, 1, 3, 1, 4, 2, 1, 2, 1, 2, 2, 3, 1, 3, 1, 3, 2, 4, 1, 4, 1, 1, 1, 1, 1, 0, 0, 0, 0};
    protected Image[][][][] cn = new Image[28][][][];
    protected Image[][][][] W = new Image[10][][][];
    protected Image[] T = new Image[3];
    int ca = 0;
    boolean bd = false;
    boolean Q = true;
    public boolean l = false;
    int bG = 0;
    public long I = 0L;
    public long bW = 0L;
    public long bE = 0L;
    public long aW = 0L;
    public long bR = 0L;
    public long bx = 0L;
    public long bs = 0L;
    public long aR = 0L;
    public long[] d;
    public boolean an = false;
    int bz = 14;
    String[] O = new String[]{"lie1_a_s_qq_y", "lie1_b_s_qq_y"};
    public int N = 0;
    int[][] bt = new int[2][3];
    public int[] M = new int[18];

    public c(a a2) {
        this.t = 60;
        this.Z = a2;
        this.k();
    }

    public void b() {
        this.y();
        this.t();
        this.D();
    }

    private int C(int n) {
        int n2 = 0;
        for (int j = 0; j < this.e[n].length; ++j) {
            n2 += this.e[n][j].length - 1;
        }
        return n2;
    }

    public void p() {
        byte[] byArray = null;
        switch (this.bl[0]) {
            case 7: {
                if (this.ah[69] == 1) {
                    if (this.ah[68] < 272) {
                        this.Z.a(120, 300);
                    }
                    this.Z.a(0, 0, 240, 300);
                    if (this.ah[68] >= -this.ah[67] * com.cwa.gamelib.b.h[2][23][0].length - 260) {
                        this.ah[68] = (short)(this.ah[68] - 2);
                        this.Z.a(com.cwa.gamelib.b.h[2][23][2], (int)this.ah[68], (int)this.ah[67]);
                    } else {
                        this.l = true;
                        this.ah[69] = 2;
                        this.ah[9] = 255;
                    }
                }
                if (this.ah[69] != 1) {
                    this.c();
                    this.Z.d();
                    if (this.aT == 0) {
                        this.aU = this.ap.ag[0] == this.cc;
                        this.Z.a(this.cn[19], this.ap, this.ak[19]);
                        this.Z.a(this.cn[26], this.av, 154, 17, this.ak[26]);
                    }
                    if (this.ah[5] == 3) {
                        this.Z.a(this.cn[24], this.bm, this.bH, this.bi, this.ae, this.ap.C + this.bm[this.J * 3 + 1] * 240, this.ap.A + this.bm[this.J * 3 + 2] * 320, (int)this.ah[20], (int)this.ah[21], this.ak[24]);
                    } else if (this.ah[5] == 4) {
                        this.ah[5] = 0;
                    }
                    if (this.ah[5] == 5) {
                        this.Z.b(this.cn[24], this.bq, this.bM[this.aZ][this.bf[this.aZ]], this.ak[24]);
                    } else if (this.ah[5] == 6) {
                        this.ah[5] = 0;
                    }
                    if (this.ah[8] == 1) {
                        this.Z.a(this.ah[9], 0, 0, 0, 240, 320, null);
                        if (this.ah[9] == 255) {
                            this.ah[8] = 0;
                            if (this.aG[1] < 1) {
                                this.a(1, (byte)4, (byte)19);
                                this.am[1] = 3;
                            } else {
                                this.a(5, (byte)4, (byte)19);
                                this.am[5] = 3;
                            }
                        }
                    }
                    if (this.ah[66] == 1) {
                        this.ah[9] = this.ah[9] + 8 < 255 ? (int)(this.ah[9] + 8) : 255;
                        this.Z.a(this.ah[9], 0, 0, 0, 240, 320, null);
                        if (this.ah[9] == 255) {
                            this.ah[66] = 0;
                            this.ah[68] = 320;
                            this.ah[117] = 0;
                            this.d(this.bl, 15);
                            this.ah[106] = 1;
                            this.ah[112 + this.a] = 1;
                            this.r();
                            this.F();
                            this.y(this.a);
                            this.i();
                        }
                    }
                    if (this.ah[69] == 0) {
                        this.z();
                    }
                }
                if (this.ah[116] == 1 || this.ah[116] == 3) {
                    if (this.ah[117] < 25) {
                        this.ah[117] = (short)(this.ah[117] + 1);
                        this.Z.a(this.cn[24], (int)this.ah[114], 0, this.ak[24], this.ah[116]);
                    } else {
                        this.ah[117] = 0;
                        this.ah[116] = 2;
                    }
                }
                if (this.ah[69] != 2) break;
                this.ah[9] = this.ah[9] - 8 > 0 ? (short)(this.ah[9] - 8) : (short)0;
                this.Z.a(this.ah[9], 0, 0, 0, 240, 320, null);
                if (this.ah[9] != 0) break;
                this.ah[69] = 0;
                this.l = false;
                break;
            }
            case 15: {
                if (this.ah[49] <= com.cwa.gamelib.b.h[2][23][0].length - 1 && this.aJ < 199) {
                    this.Z.a(com.cwa.gamelib.b.h[2][23][0][this.ah[49]], 120, 160, 17, com.cwa.gamelib.b.aC[0], com.cwa.gamelib.c.b(this.al, this.br, this.ci, this.aJ > 100 ? this.aJ - 100 : 100 - this.aJ), 0, 0, 240, 320);
                    this.aJ += 4;
                    if (this.aJ < 199) break;
                    this.aJ = 1;
                    if (this.ah[49] == com.cwa.gamelib.b.h[2][23][0].length - 1) {
                        this.aJ = 199;
                    }
                    this.ah[49] = (short)(this.ah[49] + 1);
                    break;
                }
                this.bb += 4;
                if (this.bb >= 100) {
                    this.bb = 100;
                }
                for (int j = 0; j < com.cwa.gamelib.b.h[2][23][1].length; ++j) {
                    this.Z.a(com.cwa.gamelib.b.h[2][23][1][j], 120, 80 + j * 22, 17, com.cwa.gamelib.b.aC[0], com.cwa.gamelib.c.b(this.al, this.br, this.ci, this.bb > 100 ? this.bb - 100 : 100 - this.bb), 0, 0, 240, 320);
                }
                this.ah[9] = 0;
                this.Z.a("\u8bf7\u6309\u6570\u5b570\u952e\u8fd4\u56de", 120, 318, 33, com.cwa.gamelib.b.aC[0], com.cwa.gamelib.c.b(this.al, this.br, this.ci, this.bb > 100 ? this.bb - 100 : 100 - this.bb), 0, 0, 240, 320);
                break;
            }
            case 30: {
                if (this.bL[5] == null) {
                    this.bL[5] = gameutils.a.a("/logo/logo_mobile.png");
                }
                this.Z.a(this.bL, this.cl);
                break;
            }
            case 1: {
                this.v();
                break;
            }
            case 21: {
                this.Z.e(this.cn[24], this.ak[24]);
                break;
            }
            case 16: {
                if (this.ah[95] == 0) {
                    this.Z.a(255, 320, 0, 0, 240, 320, null);
                    this.Z.a(this.cj, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, 0, 0, 0, 0, 240, 320);
                    if (this.cj.r) {
                        if (this.ah[91] < 5) {
                            this.Z.a(this.cn[23][0][0][0], 18, this.ak[23], 0, 0, 240, 320);
                        } else if (this.ah[91] < 10) {
                            this.Z.a(this.cn[23][0][0][0], 19, this.ak[23], 0, 0, 240, 320);
                        } else if (this.ah[91] < 15) {
                            this.Z.a(this.cn[23][0][0][0], 17, this.ak[23], 0, 0, 240, 320);
                        } else if (this.ah[91] <= 20) {
                            this.Z.a(255, 0, 0, 0, 240, 320, null);
                        }
                        this.ah[91] = (short)(this.ah[91] + 1);
                        if (this.ah[91] > 20) {
                            this.ah[91] = 0;
                            this.ah[95] = 1;
                            this.a(this.cj, 1, -1);
                        }
                    }
                } else if (this.ah[95] == 1) {
                    this.Z.a(255, 0, 0, 0, 240, 320, null);
                    this.Z.a(this.cj, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, 0, 0, 0, 0, 240, 320);
                    if (this.ah[91] < 5) {
                        this.Z.a(255, 0, 0, 0, 240, 320, null);
                    } else if (this.ah[91] < 10) {
                        this.Z.a(this.cn[23][0][0][0], 17, this.ak[23], 0, 0, 240, 320);
                    } else if (this.ah[91] < 15) {
                        this.Z.a(this.cn[23][0][0][0], 19, this.ak[23], 0, 0, 240, 320);
                    } else if (this.ah[91] <= 20) {
                        this.Z.a(this.cn[23][0][0][0], 18, this.ak[23], 0, 0, 240, 320);
                    }
                    this.ah[91] = (short)(this.ah[91] + 1);
                    if (this.ah[91] > 20) {
                        this.ah[95] = 2;
                    }
                } else if (this.ah[95] == 2) {
                    this.Z.a(255, 0, 0, 0, 240, 320, null);
                    this.Z.a(this.cj, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, 0, 0, 0, 0, 240, 320);
                    if (this.cj.r) {
                        this.Z.a(120, 288);
                    }
                }
                this.i(this.cj);
                break;
            }
            case 2: 
            case 13: {
                this.Z.b(986895, 0xFF0000, this.cl[2], this.cl[3]);
                break;
            }
            case 4: {
                switch (this.A[0]) {
                    case 0: {
                        this.Z.a(this.cj, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, 0, 0, 0, 0, 240, 320);
                        this.Z.a(this.cn, this.be, this.bM[this.aZ][this.bf[this.aZ]], 23, this.ak);
                        break;
                    }
                    case 3: {
                        this.Z.a(this.cn, this.ak, (int)this.ah[122], (int)this.ah[123], (int)this.bM[this.aZ][this.bf[this.aZ]][0]);
                        break;
                    }
                    case 17: {
                        if (this.D) {
                            this.x();
                            this.D = false;
                        }
                        this.Z.a(this.cn[24], this.v, this.bM[this.aZ][this.bf[this.aZ]], this.ak[24], (int)this.c, this.cf);
                        break;
                    }
                    case 2: {
                        this.Z.a(this.cn[24], null, this.bj, (int)this.bM[this.aZ][this.bf[this.aZ]][0], this.ak[24]);
                        break;
                    }
                    case 4: {
                        this.Z.b(this.cn[24], null, this.bj, this.bM[this.aZ][this.bf[this.aZ]][0], this.ak[24]);
                        break;
                    }
                    case 14: {
                        this.Z.a(this.cn[24], this.V, this.m, this.bM[this.aZ][this.bf[this.aZ]], this.ap, this.ak[24]);
                        switch (this.m[this.aZ]) {
                            case 12: {
                                this.Z.a(this.cn[24], this.V, this.B, this.bM[this.aZ][this.bf[this.aZ]], this.ah[0], this.ah[1], this.ap.ah, this.ck, this.ak[24]);
                                break;
                            }
                            case 13: {
                                this.Z.a(this.cn[24], this.cn[19], this.C[this.ah[106]], this.bM[this.aZ][this.bf[this.aZ]], this.ah[0], (int)this.ah[1], this.ap.ah, this.bh, this.ap.P, this.ak[24]);
                                break;
                            }
                            case 15: {
                                this.Z.a(this.cn[24], this.bK, this.bM[this.aZ][this.bf[this.aZ]], (int)this.ah[0], (int)this.ah[1], this.ax, this.cn, this.ak, this.ar, this.bZ, this.L, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
                                break;
                            }
                            case 14: {
                                this.Z.b(this.cn[24], this.cn[19], this.bP, this.bM[this.aZ][this.bf[this.aZ]], this.ah[0], this.ah[1], this.ap.ah, this.bh, this.ap.P, this.ak[24]);
                            }
                        }
                        break;
                    }
                    case 15: {
                        this.Z.a(this.cn[24], this.cn[19], this.V, byArray, this.bM[this.aZ], this.ah[0], this.ah[1], this.bf[this.aZ], this.ag, this.bh, this.ak[24]);
                        switch (this.bU[this.aZ]) {
                            case 20: {
                                switch (this.bf[this.aZ]) {
                                    case 0: {
                                        byArray = this.B;
                                        break;
                                    }
                                    case 1: {
                                        byArray = this.B;
                                        break;
                                    }
                                    case 2: {
                                        byArray = this.aA;
                                    }
                                }
                                this.Z.a(this.cn[24], this.cn[19], this.V, byArray, this.B, this.bM[this.aZ], this.ah[0], this.ah[1], this.bf[this.aZ], this.ag, this.ck, this.bh, this.ap.P, this.ak[24]);
                                break;
                            }
                            case 21: {
                                this.Z.b(this.cn[24], this.cn[19], this.V, this.z, this.bM[this.aZ], this.ah[0], this.ah[1], this.bf[this.aZ], this.ag, this.bh, this.ap.P, this.ak[24]);
                                break;
                            }
                            case 24: {
                                this.Z.a(this.cn[24], this.cn[19], this.V, this.bv, this.bM[this.aZ], this.ah[0], this.ah[1], this.bf[this.aZ], this.ag, this.bh, this.ap.P, this.ak[24]);
                            }
                        }
                        break;
                    }
                    case 16: {
                        break;
                    }
                    case 19: {
                        this.Z.a(this.cn[24], this.ak[24], this.s[this.bA], this.cg, this.bI[this.bA - 1]);
                        break;
                    }
                    case 18: {
                        this.Z.a(this.cn[24], this.ba, this.bM[this.aZ][this.bf[this.aZ]], this.ak[24]);
                        break;
                    }
                    case 20: {
                        this.Z.a(this.cn[24], this.ak[24], this.aw, this.bI[this.bA - 1]);
                        break;
                    }
                    case 21: {
                        this.Z.a(this.cn[24], this.ak[24], this.au, (int)this.ah[122], (int)this.ah[123], this.E);
                        break;
                    }
                    case 22: {
                        this.Z.d(this.cn[24], this.ak[24]);
                    }
                }
                break;
            }
            case 14: {
                this.Z.b(this.cn[24], this.ak[24]);
                this.ah[9] = this.ah[9] - 17 > 0 ? (short)(this.ah[9] - 17) : (short)0;
                this.Z.a(this.ah[9], 0, 0, 0, 240, 320, null);
                break;
            }
            case -1: {
                this.s();
            }
        }
    }

    public void v() {
        if (this.bL[0] == null) {
            for (int j = 1; j <= 2; ++j) {
                this.bL[j] = com.cwa.gamelib.c.a("/s60/0" + j + ".png");
            }
        }
        this.Z.a(this.bL, 1);
    }

    private i a(int n, int n2, int n3, byte by, int n4, int n5, int n6, int n7) {
        int n8;
        byte[][] byArrayArray = new byte[][]{new byte[0], {0, 1}, new byte[0], new byte[0], new byte[0], new byte[0], {16}, new byte[0], new byte[0], new byte[0], {10}, {10}, new byte[0], {17}, new byte[0], {18}, {13, 20}, {12}, {11, 16, 19}};
        i i2 = null;
        d d2 = null;
        f f2 = null;
        switch (n) {
            case 1: {
                d2 = new d();
                com.cwa.gamelib.d.a(d2, (byte)3);
                d2.ah = this.aK[1];
                d2.aV = 0;
                d2.ap = 0;
                d2.i = 0;
                d2.aL[1] = 0;
                d2.cd[1] = 100;
                d2.Z = true;
                com.cwa.gamelib.i.a(d2, G[0], G[1], 0);
                i2 = d2;
                break;
            }
            case 5: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.aA = false;
                f2.V[13] = (short)(20 + Math.abs(this.cm.nextInt() % 20));
                f2.V[3] = 25;
                com.cwa.gamelib.f.a(f2.av, n4, n5, n6, n7);
                f2.an[0] = false;
                i2 = f2;
                break;
            }
            case 6: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.d = 2;
                com.cwa.gamelib.f.a(f2.ar, -80, 0, 160, 80);
                com.cwa.gamelib.f.a(f2, (byte)0);
                i2 = f2;
                break;
            }
            case 7: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.f;
                f2.ac[1] = com.cwa.gamelib.i.az;
                f2.aA = true;
                f2.V[13] = 10;
                f2.d = 2;
                com.cwa.gamelib.f.a(f2.c, -60, 63, 120, 125);
                com.cwa.gamelib.f.a(f2.ar, -125, 60, 250, 125);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                i2 = f2;
                break;
            }
            case 8: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.f;
                f2.ac[1] = com.cwa.gamelib.i.az;
                f2.aA = true;
                f2.V[13] = 10;
                f2.d = 2;
                com.cwa.gamelib.f.a(f2.c, -80, f2.A, 160, 60);
                com.cwa.gamelib.f.a(f2.ar, -125, f2.A, 250, 60);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                i2 = f2;
                break;
            }
            case 9: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.V[13] = 2;
                f2.V[3] = 3;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.ar, -80, f2.A, 160, 60);
                com.cwa.gamelib.f.a(f2.k, -125, f2.A, 250, 25);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                i2 = f2;
                break;
            }
            case 10: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.f;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.V[13] = 2;
                f2.V[3] = 3;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.c, -40, f2.A, 80, 60);
                com.cwa.gamelib.f.a(f2.ar, -80, f2.A, 160, 60);
                com.cwa.gamelib.f.a(f2.k, -138, f2.A, 276, 75);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                f2.ah = 0;
                f2.V[5] = 1;
                i2 = f2;
                break;
            }
            case 11: {
                f2 = new f();
                f2.B[0] = 0;
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.az;
                f2.aA = true;
                f2.V[13] = 10;
                f2.d = 2;
                com.cwa.gamelib.f.a(f2.c, -60, 60, 120, 60);
                com.cwa.gamelib.f.a(f2.ar, -100, 75, 200, 75);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                f2.ah = 0;
                i2 = f2;
                break;
            }
            case 12: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.V[13] = 2;
                f2.V[3] = 3;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.av, 0, this.j, this.H, this.j);
                com.cwa.gamelib.f.a(f2.ar, -63, f2.A, 126, 60);
                com.cwa.gamelib.f.a(f2.k, -150, f2.A, 300, 25);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                i2 = f2;
                break;
            }
            case 13: {
                f2 = new f();
                f2.B[0] = 0;
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.an[2] = true;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.az;
                f2.aA = true;
                f2.V[13] = 10;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.c, -60, 60, 120, 125);
                com.cwa.gamelib.f.a(f2.ar, -125, 60, 250, 125);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                f2.ah = 0;
                i2 = f2;
                break;
            }
            case 14: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.az;
                f2.aA = true;
                f2.V[13] = 5;
                f2.V[11] = 10;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.av, 0, this.j, this.H, this.j);
                com.cwa.gamelib.f.a(f2.c, -64, f2.A, 64, this.j);
                com.cwa.gamelib.f.a(f2.ar, -100, f2.A, 100, 60);
                com.cwa.gamelib.f.a(f2.k, -this.H, f2.A, this.H, this.j);
                if (this.J == 75) {
                    com.cwa.gamelib.f.a(f2, (byte)7);
                } else {
                    com.cwa.gamelib.f.a(f2, (byte)0);
                }
                f2.E = true;
                f2.an[2] = true;
                i2 = f2;
                break;
            }
            case 15: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.ac[0] = com.cwa.gamelib.i.al;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.V[13] = 5;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.av, 0, this.j, this.H, this.j);
                com.cwa.gamelib.f.a(f2.c, -64, 64, 128, 128);
                com.cwa.gamelib.f.a(f2.ar, -125, f2.A, 125, 60);
                com.cwa.gamelib.f.a(f2.k, -125, f2.A, 125, 25);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                f2.an[2] = true;
                i2 = f2;
                break;
            }
            case 16: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.aA = true;
                f2.V[13] = 5;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.av, 60, this.j, this.H - 60, this.j);
                com.cwa.gamelib.f.a(f2.c, -64, f2.A, 128, 60);
                com.cwa.gamelib.f.a(f2.ar, -88, f2.A, 176, 60);
                com.cwa.gamelib.f.a(f2.k, -212, f2.A, 424, 25);
                com.cwa.gamelib.f.a(f2, (byte)2);
                f2.E = true;
                f2.an[2] = true;
                i2 = f2;
                break;
            }
            case 17: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.V[13] = 5;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.av, 80, this.j, this.H - 160, this.j);
                com.cwa.gamelib.f.a(f2.c, -60, f2.A, 120, 48);
                com.cwa.gamelib.f.a(f2.ar, -100, f2.A, 200, 48);
                com.cwa.gamelib.f.a(f2.k, -150, f2.A, 300, 20);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                f2.an[2] = true;
                i2 = f2;
                break;
            }
            case 18: {
                f2 = new f();
                f2.aV = 0;
                f2.ap = 0;
                f2.O = (short)-1;
                f2.ac[0] = com.cwa.gamelib.i.aP;
                f2.ac[1] = com.cwa.gamelib.i.f;
                f2.aA = true;
                f2.aa = -1;
                f2.V[13] = 5;
                f2.d = 1;
                com.cwa.gamelib.f.a(f2.av, -80, this.j, this.H + 160, this.j);
                com.cwa.gamelib.f.a(f2.c, -64, f2.A, 128, 60);
                com.cwa.gamelib.f.a(f2.ar, -125, f2.A, 250, 60);
                com.cwa.gamelib.f.a(f2.k, -125, f2.A, 250, 25);
                com.cwa.gamelib.f.a(f2, (byte)0);
                f2.E = true;
                f2.an[2] = true;
                i2 = f2;
            }
        }
        this.ah[100] = 0;
        i2.aR = n;
        i2.ag[0] = com.cwa.gamelib.b.p[n & 0xFFFFFF7F];
        if (i2.aR >= 0 && i2.aR <= 4) {
            i2.j = new int[com.cwa.gamelib.i.R.length][][];
            i2.a = new byte[com.cwa.gamelib.i.R.length];
            for (n8 = 0; n8 < i2.j.length; ++n8) {
                for (int j = 0; j <= 4; ++j) {
                    if (this.c((byte)n8, byArrayArray[j]) < 0) continue;
                    i2.j[n8] = new int[com.cwa.gamelib.i.R[n8][6]][12];
                }
            }
        }
        if (i2.aR >= 5 && i2.aR <= 18) {
            i2.j = new int[com.cwa.gamelib.i.R.length][][];
            i2.a = new byte[com.cwa.gamelib.i.R.length];
            for (n8 = 0; n8 < i2.j.length; ++n8) {
                if (this.c((byte)n8, byArrayArray[i2.aR]) < 0) continue;
                i2.j[n8] = new int[com.cwa.gamelib.i.R[n8][6]][12];
            }
        }
        com.cwa.gamelib.i.a(i2, n2, n3, 0);
        i2.K = by;
        if (i2.aR >= 5 && i2.aR <= 13) {
            com.cwa.gamelib.f.a(((f)i2).y, -100, 140, 200, 280);
            com.cwa.gamelib.f.a(i2.av, n4, n5, n6, n7);
        } else if (i2.aR >= 14 && i2.aR <= 18) {
            if (this.ah[106] == 0) {
                com.cwa.gamelib.f.a(i2.y, -113, 140, 226, 280);
            } else {
                com.cwa.gamelib.f.a(i2.y, -n6, 112, n6 * 2, 224);
            }
            com.cwa.gamelib.f.a(i2.av, n4, n5, n6, n7);
        }
        i2.af[0] = n <= 4 ? (i2.af[1] = com.cwa.gamelib.b.aQ[0][n & 0xFFFFFF7F]) : (i2.af[1] = com.cwa.gamelib.b.aQ[this.ah[106]][n & 0xFFFFFF7F]);
        return i2;
    }

    private short a(i i2, int n, int n2, int n3, int n4, int n5, int n6) {
        short s = 3000;
        int n7 = i2.aR & 0xFFFFFF7F;
        boolean bl = false;
        short[] sArray = null;
        if (i2.af[0] == 0) {
            return s;
        }
        if (n7 <= 4) {
            sArray = ((d)i2).aB;
        } else if (n7 > 4) {
            sArray = ((f)i2).V;
        }
        if (sArray[0] >= sArray[1] && i2.af[0] > 0) {
            bl = true;
        }
        if (bl && i2.Z) {
            s = (short)this.a(n, n2, n3, n4, i2.C + (i2.K == 1 ? this.L[n7][i2.aH][0] : -this.L[n7][i2.aH][2]), i2.A - this.L[n7][i2.aH][1], this.L[n7][i2.aH][2] - this.L[n7][i2.aH][0], this.L[n7][i2.aH][3] - this.L[n7][i2.aH][1], 4);
        }
        if (s == 1000 && i2.Z) {
            this.c(i2, n5, n6);
            if (n7 > 4) {
                this.ah[61] = 1;
            }
        }
        return s;
    }

    private void c(i i2, int n, int n2) {
        int n3;
        int n4;
        short[] sArray = null;
        int[] nArray = null;
        boolean[] blArray = null;
        int n5 = i2.aR & 0xFFFFFF7F;
        if (n5 <= 4) {
            sArray = ((d)i2).aB;
            nArray = ((d)i2).aI;
            blArray = ((d)i2).an;
        } else if (n5 > 4) {
            sArray = ((f)i2).V;
            nArray = ((f)i2).ad;
            blArray = ((f)i2).an;
        }
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (i2.aR <= 4) {
            n4 = 0;
            if (this.ah[13] - 10 >= 0) {
                n4 = com.cwa.gamelib.b.aM[this.ah[13] - 10][0];
            }
            n7 = com.cwa.gamelib.b.bB[0][n5] + com.cwa.gamelib.b.bk[this.aK[1]] + n4;
            n6 = 0;
            n6 = n * 3 / 2 - n7;
            if (this.ah[13] > 0) {
                this.a(this.ap, 1, 38, 0, this.ap.aK[0] >> 1, this.ap.K, 19, 1, 1, -1, 0);
            }
        } else if (i2.aR >= 5 && i2.aR <= 18) {
            if (i2.aR < 14) {
                i2.Z = true;
            }
            if (i2.Z) {
                n8 = com.cwa.gamelib.b.bB[this.ah[106]][i2.aR];
                if (i2.aR >= 14) {
                    n8 = com.cwa.gamelib.b.bB[this.ah[106]][i2.aR + this.ah[92] * 5];
                }
                n6 = n * 3 / 2 - n8;
                if (n2 == 2) {
                    if (this.ah[15] > 0) {
                        n6 = com.cwa.gamelib.b.X[0][(this.ah[15] - 10) / 5] * n6 / 100;
                    } else if (this.ah[16] > 0) {
                        n6 = com.cwa.gamelib.b.X[0][(this.ah[16] - 10) / 5] * n6 / 100;
                    }
                }
                n4 = Math.abs(this.cm.nextInt() % 100);
                n3 = 0;
                if (this.ah[14] > 0) {
                    if (this.ap.ah != 3 && n4 < 50) {
                        n3 = com.cwa.gamelib.b.aM[this.ah[14] - 10][0];
                        this.a(this.ap, 1, 39, -8, this.ap.aK[0], this.ap.K, 19, 0, 1, -1, 0);
                    }
                    if (this.ap.ah == 3 && n4 < 80) {
                        n3 = com.cwa.gamelib.b.aM[this.ah[14] - 10][0];
                    }
                }
                if (this.ap.ah == 8) {
                    n3 = 20;
                    this.a(this.ap, 1, 39, -8, this.ap.aK[0], this.ap.K, 19, 0, 1, -1, 0);
                }
                this.ap.af[0] = this.ap.af[0] + n3 > this.ap.af[1] ? this.ap.af[1] : this.ap.af[0] + n3;
            }
        }
        if (n2 == 0) {
            n6 >>= 1;
        }
        if (n6 <= 0) {
            n6 = 1;
        }
        if (this.aT > 0) {
            n6 = 0;
        }
        nArray[3] = n6;
        if (i2.aR <= 18) {
            if (i2.af[0] - n6 > 0) {
                if (i2.aR >= 14 && this.ah[100] <= 5) {
                    this.ah[100] = (short)(this.ah[100] + 1);
                    if (this.ah[100] >= 5) {
                        ((f)i2).V[12] = ((f)i2).V[13];
                    }
                }
                i2.af[0] = i2.af[0] - n6;
            } else {
                i2.af[0] = 0;
                if (i2.aR >= 5) {
                    this.bp[n5 - 5] = 1;
                }
                i2.Z = true;
                blArray[0] = true;
                i2.ap = 0;
                i2.O = (short)-1;
                if (i2.t == null && i2.aR >= 14 && this.ah[106] == 0) {
                    this.aT = this.bO[this.ah[6] * this.aE + 6];
                    this.ah[124] = 25;
                }
            }
        }
        sArray[0] = 0;
        i2.am[0] = 8;
        i2.am[1] = 0;
        i2.am[2] = (short)(i2.C + (i2.K == 1 ? this.L[n5][i2.aH][0] : -this.L[n5][i2.aH][2]));
        i2.am[3] = (short)(i2.A - this.L[n5][i2.aH][1]);
        if (n5 <= 4) {
            sArray[1] = 13;
            if (this.aT == 32) {
                i2.af[0] = 0;
            }
            if (i2.af[0] == 0) {
                if (this.ah[6] >= 0 && this.ah[106] == 0) {
                    if (this.bO[this.ah[6] * this.aE] != 0 || this.J != 49) {
                        this.ah[8] = 1;
                        this.ah[9] = 0;
                        this.i();
                        this.a(6, 1, 1);
                    }
                } else {
                    this.ah[8] = 1;
                    this.ah[9] = 0;
                    this.i();
                    this.a(6, 1, 1);
                }
            }
        } else {
            if (i2.aR <= 18) {
                sArray[1] = 3;
            }
            if (i2.af[0] == 0) {
                if (i2.aR >= 5 && i2.aR <= 13 && this.ap.ag[0] >= this.cc) {
                    if (this.cc == 10) {
                        if (this.aG[1] < 1) {
                            this.a(1, (byte)4, (byte)19);
                            this.am[1] = 0;
                        }
                    } else {
                        this.a(2, (byte)4, (byte)19);
                        this.am[2] = 0;
                    }
                }
                n4 = com.cwa.gamelib.b.cd[n5];
                if (i2.t != null) {
                    n4 = 0;
                }
                if (this.ap.ag[0] >= i2.ag[0]) {
                    if ((n4 -= n4 * ((this.ap.ag[0] - i2.ag[0]) * 10) / 100) <= (n3 = n4) * ((this.ap.ag[0] - i2.ag[0]) * 10) / 100) {
                        n4 = n3 * ((this.ap.ag[0] - i2.ag[0]) * 10) / 100;
                    }
                } else {
                    n4 = n4 + n4 * ((i2.ag[0] - this.ap.ag[0]) * 10) / 100 > n4 * 2 - n4 / 2 ? n4 * 2 - n4 / 2 : (n4 += n4 * ((i2.ag[0] - this.ap.ag[0]) * 10) / 100);
                }
                this.a(this.ap, n4);
            } else if (n5 == 14 && i2.T[0] == 3 | i2.T[0] == 10) {
                i2.r = true;
            }
        }
    }

    private int H(int n) {
        return n * 59 + 41;
    }

    private void a(d d2, int n) {
        int n2;
        d2.ag[1] = this.cc;
        d2.cd[1] = n2 = this.H(d2.ag[0]);
        boolean bl = false;
        if (d2.ag[0] < d2.ag[1]) {
            if (n > 0) {
                d2.cd[0] = d2.cd[0] + n;
                while (d2.cd[0] >= n2) {
                    d2.cd[0] = d2.cd[0] - n2;
                    if (d2.ag[0] >= this.cc) continue;
                    d2.ag[0] = d2.ag[0] + 1;
                    d2.cd[1] = this.H(d2.ag[0]);
                    if (d2.ag[0] >= this.cc) {
                        d2.cd[0] = 0;
                        if (this.cc == 10) {
                            if (this.aG[1] < 1) {
                                this.a(1, (byte)4, (byte)19);
                                this.am[1] = 0;
                            }
                        } else {
                            this.a(2, (byte)4, (byte)19);
                            this.am[2] = 0;
                        }
                    }
                    bl = true;
                    n2 = this.H(d2.ag[0]);
                    d2.af[1] = d2.af[1] + 17;
                    d2.m[1] = d2.m[1] + 7;
                    int[] nArray = com.cwa.gamelib.b.bB[0];
                    nArray[1] = nArray[1] + 1;
                    int[] nArray2 = com.cwa.gamelib.b.x[0];
                    nArray2[1] = nArray2[1] + 3;
                    com.cwa.gamelib.b.bB[0][2] = com.cwa.gamelib.b.bB[0][1];
                    com.cwa.gamelib.b.bB[0][3] = com.cwa.gamelib.b.bB[0][1];
                }
            }
            if (bl) {
                this.a(this.ap, 0, 44, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                this.a(this.ap, 2, 45, 0, this.ap.aK[0] + 20, 1, 19, 1, 1, -1, 0);
                d2.af[0] = d2.af[1];
                d2.m[0] = d2.m[1];
            }
        }
    }

    private void d(i i2) {
        int[][] nArrayArray = new int[][]{{4, -120, -130, 12, 0}, {2, 240, 12, 20, 0}, {3, 0, -120, 12, 4}, {1, 0, 0, 12, 12}};
        this.a(i2.L[0], i2.C, i2.A, i2.aR);
        this.Z.a(i2, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
        this.i(i2);
        if (i2.ap == 0 && i2.O == -1) {
            if (i2.B[0] < nArrayArray.length) {
                i2.ac[0] = (byte)nArrayArray[i2.B[0]][3];
                i2.ac[1] = (byte)nArrayArray[i2.B[0]][4];
                i2.O = (short)nArrayArray[i2.B[0]][0];
                i2.ap = (short)(i2.C > this.ap.C ? 4 : 8);
                if (i2.B[0] == nArrayArray.length - 2) {
                    com.cwa.gamelib.f.a(i2.Q, i2.C, i2.A, this.ap.C - i2.C, this.ap.A + 16 - i2.A);
                } else {
                    com.cwa.gamelib.f.a(i2.Q, i2.C, i2.A, nArrayArray[i2.B[0]][1], nArrayArray[i2.B[0]][2]);
                }
                i2.B[0] = (byte)(i2.B[0] + 1);
            }
        } else {
            this.k(i2);
            this.j(i2);
        }
    }

    public void G(int n) {
        switch (this.ah[23]) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                if ((this.l(-6) == 1 || this.l(-5) == 1 || this.l(53) == 1) && this.ah[99] == 1) {
                    this.ah[99] = 2;
                    this.F();
                    this.y(this.a);
                    this.ah[52] = 2;
                    this.a(n, 0);
                    this.ah[42] = 0;
                }
                if (this.l(-7) != 1) break;
                this.a(-7, 0);
                this.ah[42] = 0;
                this.ah[99] = 2;
                break;
            }
            case 5: {
                if (this.l(53) != 1 && this.l(-5) != 1 && this.l(-6) != 1) break;
                if (this.ah[35] < com.cwa.gamelib.b.h[this.ah[51]][this.ah[25]][this.ah[52]].length - 1) {
                    this.ah[35] = (short)(this.ah[35] + 1);
                } else {
                    this.ah[42] = 0;
                    this.ah[5] = 0;
                    if (this.ah[125] == 1) {
                        this.ah[125] = 2;
                    }
                }
                this.a(53, 0);
                this.a(-5, 0);
                this.a(-6, 0);
                break;
            }
            case 7: {
                if (this.l(53) != 1 && this.l(-5) != 1 && this.l(-6) != 1) break;
                if (this.ah[35] < com.cwa.gamelib.b.h[this.ah[51]][this.ah[25]][this.ah[52]].length - 1) {
                    this.ah[35] = (short)(this.ah[35] + 1);
                } else if (this.ah[52] < com.cwa.gamelib.b.h[this.ah[51]][this.ah[25]].length - 1) {
                    this.ah[52] = (short)(this.ah[52] + 1);
                    this.ah[35] = 1;
                } else {
                    if (this.ah[51] == 2 && this.ah[25] == 3 && this.aG[1] < 1) {
                        this.a(1, (byte)4, (byte)19);
                        this.am[1] = 2;
                    }
                    if (this.ah[51] == 2 && (this.ah[25] == 4 || this.ah[25] == 6 || this.ah[25] == 8 || this.ah[25] == 15 || this.ah[25] == 17)) {
                        this.a(3, (byte)4, (byte)19);
                        this.am[3] = 0;
                    }
                    this.ah[52] = 0;
                    this.ah[42] = 0;
                    this.ah[5] = 0;
                    this.ap.aB[0] = 0;
                    if (this.aT == 21) {
                        for (int j = 0; j < this.i[0].w.length; ++j) {
                            this.i[0].w[j].aA = false;
                        }
                    }
                    if (this.J == 11 && this.i[0].af[0] <= 0) {
                        if (this.ah[79] == 0) {
                            this.ah[79] = 1;
                        }
                    } else if (this.J == 25 && this.i[0].af[0] <= 0) {
                        if (this.ah[84] == 0) {
                            this.ah[84] = 1;
                        }
                    } else if (this.J == 28 && this.i[0].af[0] <= 0) {
                        this.ah[82] = 1;
                    } else if (this.J == 66 && this.i[0].af[0] <= 0) {
                        this.ah[86] = 1;
                    } else if (this.J == 49 && this.ah[60] == 0) {
                        this.ah[88] = 1;
                    }
                }
                this.a(53, 0);
                this.a(-5, 0);
                this.a(-6, 0);
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17) {
        this.ah[51] = (short)n;
        this.ah[52] = (short)n3;
        this.ah[25] = (short)n2;
        this.ah[35] = (short)n4;
        this.ah[34] = (short)n5;
        this.ah[36] = (short)n7;
        this.ah[29] = (short)n14;
        this.ah[37] = (short)n12;
        this.ah[38] = (short)n13;
        this.ah[30] = (short)n9;
        this.ah[39] = (short)n10;
        this.ah[31] = (short)n11;
        this.ah[40] = (short)n8;
        this.ah[32] = (short)n6;
        this.ah[41] = (short)n15;
        this.bV = n17;
        this.ah[104] = 0;
    }

    private void z() {
        int n;
        int n2;
        int n3 = -1;
        if (this.ay == 51 || this.ay == 50) {
            if (this.ap.C >= (this.H >> 1) - 16 && this.ap.C <= (this.H >> 1) + 16) {
                if (this.ay == 51) {
                    if (this.ah[99] == 0) {
                        this.ah[22] = 1;
                        this.ah[99] = 1;
                        this.ah[42] = 1;
                        this.ah[99] = 1;
                        this.ah[53] = 0;
                        this.ap.af[0] = this.ap.af[1];
                        this.ap.m[0] = this.ap.m[1];
                        this.ah[23] = 3;
                        this.a(1, 0, 0, 0, 1, 0, 0xFFFF00, 0xFFFF00, 1, 240, 36, 0, 160, 4, 0, 0, 17);
                        this.l = true;
                    } else if (this.ah[99] == 1) {
                        this.Z.a(this.cn[24], 0, this.ak[24]);
                    }
                } else if (this.ay == 50) {
                    if (this.ah[125] == 0) {
                        this.ah[125] = 1;
                        this.l();
                    } else if (this.ah[23] == 0 && this.ah[125] == 2) {
                        if (this.ap.L[6][8] == 0) {
                            this.a(this.ap, 6, 5, 0, 64, 1, 20, 1, 1, -1, 0);
                        }
                        this.ah[23] = 4;
                    }
                }
            } else if (this.ay == 50) {
                this.ah[23] = 0;
                if (this.ap.L[6][8] == 1) {
                    this.a(this.ap, 6, 0, 0, 0, 0, 0, 1, 0, -1, 0);
                }
            }
        }
        if (this.ah[22] == 0) {
            if (this.ah[65] == 0) {
                if (this.aS != 0 && this.aT == 0) {
                    this.aT = this.aS;
                }
            } else {
                this.ah[65] = (short)(this.ah[65] - 1);
            }
            if (this.aT > 0 && !this.l) {
                switch (this.af[this.aT][0][0]) {
                    case 1: {
                        this.ah[22] = 1;
                        this.ah[42] = 1;
                        this.ah[53] = (short)this.af[this.aT][1][1];
                        if (this.ah[23] == 6) {
                            this.a(this.af[this.aT][1][2], this.af[this.aT][1][3], this.af[this.aT][1][4], 0, this.af[this.aT][1][5], 0, 0xFFFF00, 0xFFFF00, 1, this.af[this.aT][1][8], this.af[this.aT][1][9], this.af[this.aT][1][6], this.af[this.aT][1][7], 4, 0, 0, this.af[this.aT][1][11]);
                        } else {
                            this.a(this.af[this.aT][1][2], this.af[this.aT][1][3], this.ah[64], 1, this.af[this.aT][1][5], 0, 0xFFFF00, 0xFFFF00, 1, this.af[this.aT][1][8], this.af[this.aT][1][9], 0, this.af[this.aT][1][7], 4, 0, 0, this.af[this.aT][1][11]);
                        }
                        this.l = true;
                        break;
                    }
                    case 2: {
                        this.ah[23] = 7;
                        this.ah[22] = 1;
                        this.ah[42] = 1;
                        this.ah[53] = (short)this.af[this.aT][1][1];
                        this.a(this.af[this.aT][1][2], this.af[this.aT][1][3], this.af[this.aT][1][4], 1, this.af[this.aT][1][5], 0, 0xFFFF00, 0xFFFF00, 1, this.af[this.aT][1][8], this.af[this.aT][1][9], this.af[this.aT][1][6], this.af[this.aT][1][7], 4, 0, 0, this.af[this.aT][1][11]);
                        this.l = true;
                        break;
                    }
                    case 3: {
                        for (n2 = 1; n2 < this.af[this.aT].length; ++n2) {
                            if (this.af[this.aT][n2][2] <= 4) {
                                this.a((i)this.ap, n2);
                                continue;
                            }
                            for (n = 0; n < this.i.length; ++n) {
                                if (this.i[n] == null || this.af[this.aT][n2][2] != (this.i[n].aR & 0xFFFFFF7F)) continue;
                                this.a(this.i[n], n2);
                            }
                        }
                        break;
                    }
                }
            }
        }
        if (this.af[this.aT][0][0] == 3) {
            for (n2 = 1; n2 < this.af[this.aT].length; ++n2) {
                if (this.af[this.aT][n2][2] <= 4) {
                    this.a((i)this.ap, n2);
                    continue;
                }
                for (n = 0; n < this.i.length; ++n) {
                    if (this.i[n] == null || this.af[this.aT][n2][2] != (this.i[n].aR & 0xFFFFFF7F)) continue;
                    this.a(this.i[n], n2);
                }
            }
        }
        if (this.ah[22] == 1) {
            switch (this.ah[23]) {
                case 6: {
                    if (this.ah[41] * this.ah[29] < this.ah[31] || (this.ah[53] = (short)(this.ah[53] - 1)) > 0) break;
                    this.ah[5] = 0;
                    this.ah[42] = 0;
                    this.ah[53] = 0;
                }
            }
        }
        switch (this.ah[42]) {
            case 0: {
                if (this.ah[41] > 0) {
                    this.ah[41] = (short)(this.ah[41] - 1);
                    break;
                }
                this.ah[22] = 0;
                this.ah[23] = 0;
                this.ah[42] = -1;
                this.ah[33] = 0;
                this.aS = this.af[this.aT][0][1];
                if (this.aS == 28) {
                    this.ah[65] = 50;
                }
                this.aT = 0;
                this.l = false;
                break;
            }
            case 1: {
                if (this.ah[41] * this.ah[29] < this.ah[31]) {
                    this.ah[41] = (short)(this.ah[41] + 1);
                    break;
                }
                this.ah[33] = 1;
            }
        }
        if (this.ah[22] == 0 && this.aT != 0) {
            this.ah[23] = 0;
            this.ah[42] = -1;
            this.ah[33] = 0;
            this.aS = this.af[this.aT][0][1];
            this.aT = 0;
            if (this.ah[60] == 0 && this.ah[6] > 0) {
                this.i[0].aA = false;
            }
            this.l = false;
        }
        if (this.ah[42] != -1) {
            if (this.ah[33] == 1 && this.ah[104] < this.ah[105]) {
                this.ah[104] = (short)(this.ah[104] + 1);
            }
            this.Z.a(this.cn[24], com.cwa.gamelib.b.h[this.ah[51]][this.ah[25]][this.ah[52]], this.ah[35], this.ah[34], this.ah[32], this.ah[40], this.ah[36], this.ah[30], this.ah[41], this.ah[29], this.ah[37], this.ah[38], this.ah[39], this.ah[31], this.ah[33], 1, 1, this.bV, this.ak[24]);
            if (this.ah[51] == 2) {
                this.ah[101] = Short.parseShort(com.cwa.gamelib.b.h[this.ah[51]][this.ah[25]][this.ah[52]][0]);
                if (this.ah[101] == 1) {
                    this.Z.a(this.cn[27], this.ah[101], 1, 0, 142, this.ak[27]);
                } else if (this.ah[101] >= 0) {
                    this.Z.a(this.cn[27], this.ah[101], 2, 190, 70, this.ak[27]);
                }
            }
        }
    }

    private void c() {
        int n;
        if (!this.l && this.ah[124] == 0) {
            if (this.ah[46] > 0) {
                this.ah[46] = (short)(this.ah[46] - 1);
            }
            if (this.ah[17] == -1) {
                this.ah[17] = 10;
                if (this.ap.an[6] && this.ap.af[0] > 0 && this.i[0].aR == 15 && this.ap.aB[0] >= this.ap.aB[1]) {
                    this.c(this.ap, 20, 1);
                    this.a(this.ap);
                }
            }
            if (this.ah[17] > 0) {
                this.ah[17] = (short)(this.ah[17] - 1);
                this.ah[18] = (short)(this.cm.nextInt() % 2);
                this.ah[19] = (short)(this.cm.nextInt() % 5);
                if (this.ah[17] == 0) {
                    this.ah[18] = 0;
                    this.ah[19] = 0;
                }
            }
            if (this.aT > 0) {
                this.ap.aB[0] = this.aT == 30 || this.aT == 32 ? (short)(this.ap.aB[1] + 1) : (short)0;
            }
            this.q();
            this.b(this.ap);
            this.e(this.ap);
            this.b(this.ap, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
            this.l(this.ap);
            if (this.ap.aB[0] < this.ap.aB[1]) {
                this.ap.aB[0] = (short)(this.ap.aB[0] + 1);
            }
            if (this.ap.am[1] < this.ap.am[0]) {
                this.ap.am[1] = (short)(this.ap.am[1] + 1);
            }
            this.a((i)this.ap, 0, 0, 3, 3);
            switch (this.ap.aR) {
                case 2: 
                case 3: {
                    this.ap.ap = (short)(this.ap.ap & 3);
                    this.ap.ap = (short)(this.ap.ap & 0xC);
                    this.ap.i = 0;
                }
            }
            if (this.aT == 0) {
                this.ah[58] = 0;
            }
            if (this.ap.an[6]) {
                switch (this.ap.aR) {
                    case 0: {
                        switch (this.ap.T[0]) {
                            case 0: {
                                if ((this.ap.ap & 0xC) != 0) break;
                                this.a((i)this.ap, 1, -1);
                                break;
                            }
                            case 3: {
                                if (this.ap.aV != this.bZ[this.ap.aR][this.ap.T[0]].length - 2) break;
                                this.a((i)this.ap, (int)this.ap.T[1], -1);
                                if (!this.ap.E) break;
                                this.ap.E = false;
                            }
                        }
                        this.ap.ap = (short)(this.ap.ap & 3);
                        break;
                    }
                    case 1: {
                        switch (this.ap.T[0]) {
                            case 13: {
                                if (!this.ap.r) break;
                                this.a((i)this.ap, 3, -1);
                                if (this.ap.ap == 0) break;
                                this.a((i)this.ap, 0, -1);
                                break;
                            }
                            case 1: {
                                if (!this.ap.r) break;
                                this.a((i)this.ap, 3, -1);
                                break;
                            }
                            case 11: {
                                if (!this.ap.r) break;
                                this.a((i)this.ap, 6, -1);
                                break;
                            }
                            case 3: {
                                if ((this.ap.ap & 0xC) != 0) {
                                    this.a((i)this.ap, 0, -1);
                                    break;
                                }
                                if (this.a((i)this.ap, 1, false) == 3000) break;
                                com.cwa.gamelib.i.a(this.ap, (byte)6);
                                break;
                            }
                            case 5: {
                                if (this.ap.r) {
                                    this.a((i)this.ap, 1, -1);
                                    break;
                                }
                                if ((this.ap.ap & 0xC) == 0) {
                                    this.a((i)this.ap, 3, -1);
                                    break;
                                }
                                this.a((i)this.ap, 0, -1);
                                break;
                            }
                            case 0: {
                                if ((this.ap.ap & 0xC) == 0) {
                                    this.a((i)this.ap, 3, -1);
                                    break;
                                }
                                this.a((i)this.ap, 0, -1);
                                break;
                            }
                            case 6: {
                                break;
                            }
                            case 7: 
                            case 9: {
                                this.ah[58] = 1;
                                if (!this.ap.r) break;
                                if (this.ap.T[1] >= this.bF[0][0] && this.ap.T[1] <= this.bF[0][7] + 2) {
                                    this.a((i)this.ap, 3, -1);
                                    this.ap.E = false;
                                    break;
                                }
                                if (this.ap.T[1] >= this.bF[1][0] && this.ap.T[1] <= this.bF[1][7] + 2) {
                                    this.a((i)this.ap, 6, -1);
                                    this.ap.E = false;
                                    break;
                                }
                                if (this.ap.T[1] >= this.bF[2][0] && this.ap.T[1] <= this.bF[2][7] + 2) {
                                    this.a((i)this.ap, 3, -1);
                                    this.ap.E = false;
                                    break;
                                }
                                if (this.ap.T[1] != this.ap.T[0] && this.ap.T[1] != 9 && this.ap.T[1] != 9) {
                                    this.a((i)this.ap, (int)this.ap.T[1], -1);
                                } else {
                                    this.a((i)this.ap, 3, -1);
                                }
                                this.ap.E = false;
                                break;
                            }
                            case 10: {
                                if (!this.ap.r) break;
                                this.ah[58] = 1;
                                if (this.ah[6] >= 0 && this.bO[this.ah[6] * this.aE] == 0 && this.J == 49) {
                                    this.ap.af[0] = this.ap.af[1];
                                    this.aT = 31;
                                    this.ah[22] = 0;
                                    this.ah[60] = 0;
                                    this.bO[this.ah[6] * this.aE] = 1;
                                    break;
                                }
                                if (this.ah[8] <= 0) break;
                                this.ah[9] = this.ah[9] + 17 < 255 ? (int)(this.ah[9] + 17) : 255;
                            }
                        }
                        if (this.ap.T[0] >= this.bF[0][0] && this.ap.T[0] <= this.bF[0][7] + 2) {
                            if (this.ap.r) {
                                if (this.ap.T[0] > this.bF[0][this.aK[1]]) {
                                    this.a((i)this.ap, 3, -1);
                                    if (this.ap.E) {
                                        this.ap.E = false;
                                    }
                                }
                                if (this.ap.T[0] == this.bF[0][this.aK[1]]) {
                                    if (this.ah[61] == 1) {
                                        this.a((i)this.ap, this.bF[0][this.aK[1]] + 2, -1);
                                    } else {
                                        this.a((i)this.ap, this.bF[0][this.aK[1]] + 1, -1);
                                    }
                                }
                            }
                        } else if (this.ap.T[0] >= this.bF[1][0] && this.ap.T[0] <= this.bF[1][7] + 2) {
                            if (this.ap.r) {
                                if (this.ap.T[0] > this.bF[1][this.aK[this.ap.aR]]) {
                                    this.a((i)this.ap, 6, -1);
                                    if (this.ap.E) {
                                        this.ap.E = false;
                                    }
                                }
                                if (this.ap.T[0] == this.bF[1][this.aK[this.ap.aR]]) {
                                    if (this.ah[61] == 1) {
                                        this.a((i)this.ap, this.bF[1][this.aK[this.ap.aR]] + 2, -1);
                                    } else {
                                        this.a((i)this.ap, this.bF[1][this.aK[this.ap.aR]] + 1, -1);
                                    }
                                }
                            }
                        } else if (this.ap.T[0] >= this.bF[2][0] && this.ap.T[0] <= this.bF[2][7] + 2) {
                            this.a((i)this.ap, 3, -1);
                        } else {
                            this.aK[1] = this.ap.ah;
                        }
                        if (this.ap.T[0] != 2) {
                            this.ap.ap = (short)(this.ap.ap & 3);
                        }
                        if (this.ap.T[0] != 2 || !this.ap.r) break;
                        this.a((i)this.ap, 6, -1);
                        this.ap.ap = (short)(this.ap.ap & 3);
                        break;
                    }
                    case 2: {
                        this.ap.ap = (short)(this.ap.ap & 3);
                        break;
                    }
                    case 4: {
                        switch (this.ap.T[0]) {
                            case 0: {
                                if ((this.ap.ap & 0xC) == 0) break;
                                this.a((i)this.ap, 2, -1);
                                break;
                            }
                            case 2: 
                            case 4: {
                                if ((this.ap.ap & 0xC) == 0) {
                                    this.a((i)this.ap, 0, -1);
                                    break;
                                }
                                this.a((i)this.ap, 2, -1);
                                break;
                            }
                            case 1: {
                                if (!this.ap.r) break;
                                if ((this.ap.ap & 0xC) == 0) {
                                    this.a((i)this.ap, 0, -1);
                                    break;
                                }
                                this.a((i)this.ap, 2, -1);
                            }
                        }
                        this.ap.ap = (short)(this.ap.ap & 3);
                    }
                }
                if (this.ap.aI[2] == 1) {
                    this.ap.aI[2] = 0;
                }
            } else {
                this.ap.ap = (short)(this.ap.ap | 2);
                switch (this.ap.aR) {
                    case 1: {
                        switch (this.ap.T[0]) {
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 6: {
                                this.a((i)this.ap, 5, -1);
                                this.ap.an[5] = true;
                                this.ap.aO = 1;
                                this.ap.aE = 10;
                                this.ap.i = this.ap.W[this.ap.aO][this.ap.aE];
                                break;
                            }
                            case 10: {
                                if (!this.ap.r || this.ah[8] <= 0) break;
                                if (this.ah[9] + 17 < 255) {
                                    this.ah[9] = (short)(this.ah[9] + 17);
                                    break;
                                }
                                this.ah[9] = 255;
                                break;
                            }
                            case 7: 
                            case 9: {
                                this.ah[58] = 1;
                                if (!this.ap.r) break;
                                if (this.ap.i < 0) {
                                    this.a((i)this.ap, 5, -1);
                                } else {
                                    this.a((i)this.ap, 4, -1);
                                }
                                this.ap.E = false;
                            }
                        }
                        if (this.ap.T[0] >= this.bF[2][0] && this.ap.T[0] <= this.bF[2][7] + 2 && this.ap.r) {
                            if (this.ap.T[0] > this.bF[2][this.aK[1]]) {
                                this.a((i)this.ap, 5, -1);
                                if (this.ap.E) {
                                    this.ap.E = false;
                                }
                            }
                            if (this.ap.T[0] == this.bF[2][this.aK[1]]) {
                                if (this.ah[61] == 1) {
                                    this.a((i)this.ap, this.bF[2][this.aK[1]] + 2, -1);
                                } else {
                                    this.a((i)this.ap, this.bF[2][this.aK[1]] + 1, -1);
                                }
                            }
                        }
                        if (this.ap.aI[2] != 0) break;
                        this.ap.ap = (short)(this.ap.ap & 3);
                    }
                }
            }
            this.a((i)this.ap);
        }
        this.Z.d();
        if (this.at[this.u] != null) {
            this.Z.a(this.at[this.u][0], bn[this.u], aO[this.u], false, this.u, this.aa[this.u]);
        }
        for (n = 0; n < this.by.length; ++n) {
            if (this.by[n] == null) continue;
            this.Z.a(this.by[n], aO[this.u], this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], this.ad[this.u], null, 240, 260);
        }
        if (this.bw.length != 0) {
            this.Z.a(this.bw[0], aO[this.u], this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], this.ad[this.u], null, 240, 260);
        }
        if (this.ac.length > 0) {
            this.Z.a(this.ac, aO[this.u], this.u, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], this.ad[this.u]);
            for (n = 0; n < this.ac.length; ++n) {
                if (this.ac[n][3] != 2) continue;
                this.a(this.bc[n], this.ac[n][0], this.ac[n][1], -1);
                if (this.bc[n][2] != 0 || this.bc[n][4] < this.bZ[this.bc[n][0]][this.bc[n][1]][this.bc[n][2]][0]) continue;
                this.ac[n][3] = 0;
            }
        }
        if (this.ay == 50) {
            this.Z.a(21, 0, this.ah[50], 1, this.H >> 1, 4 * this.ab, this.cn[21], this.ak, this.ar, this.bZ, this.L, this.aH[0], this.aH[1]);
            this.ah[50] = (short)(this.ah[50] + 1);
            if (this.ah[50] > this.bZ[21][0].length - 2) {
                this.ah[50] = 0;
            }
        }
        if (this.ah[124] > 0) {
            this.ah[124] = (short)(this.ah[124] - 1);
            if (this.ah[124] % 2 == 1) {
                this.Z.a(255, 0xFFFFFF, 0, 0, 240, 320, null);
            } else {
                this.Z.a(255, 0xFF0000, 0, 0, 240, 320, null);
            }
        }
        this.Z.a(this.J, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
        if (this.aT == 0 && this.ah[106] == 0) {
            this.E();
        }
        this.a(this.U);
        if (this.aT == 0) {
            this.b(this.U);
        }
        for (n = 0; n < this.i.length; ++n) {
            if (this.i[n] == null) continue;
            this.b(this.i[n]);
            if (!this.l) {
                if (this.i[n].V[0] < this.i[n].V[1]) {
                    this.i[n].V[0] = (short)(this.i[n].V[0] + 1);
                }
                if (this.i[n].am[1] < this.i[n].am[0]) {
                    this.i[n].am[1] = (short)(this.i[n].am[1] + 1);
                }
                for (int j = 0; j < this.i[n].w.length; ++j) {
                    if (((f)this.i[n].w[j]).V[0] < ((f)this.i[n].w[j]).V[1]) {
                        ((f)this.i[n].w[j]).V[0] = (short)(((f)this.i[n].w[j]).V[0] + 1);
                    }
                    if (this.i[n].w[j].am[1] >= this.i[n].w[j].am[0]) continue;
                    this.i[n].w[j].am[1] = (short)(this.i[n].w[j].am[1] + 1);
                }
                this.a(this.i[n]);
                this.k(this.i[n]);
                this.j(this.i[n]);
                this.d(this.i[n]);
            }
            this.c(this.i[n]);
            if (this.i[0].aR < 14 || this.i[0].o == null || this.i[0].o.aT < 55 || this.i[0].o.aT > 61) continue;
            this.d(this.i[0].o);
        }
        if (!this.l) {
            this.u();
        }
        if (this.ap != null && this.cn[this.ap.aR] != null) {
            for (n = 0; n < this.ap.L.length; ++n) {
                if (this.ap.L[n][8] <= 0 || this.ap.L[n][9] != 0) continue;
                this.a(this.ap.L[n], this.ap.C, this.ap.A, this.ap.aR);
            }
            this.Z.a(this.ap, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
            this.e(this.ap, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
            for (n = 0; n < this.ap.L.length; ++n) {
                if (this.ap.L[n][8] <= 0 || this.ap.L[n][9] != 1) continue;
                this.a(this.ap.L[n], this.ap.C, this.ap.A, this.ap.aR);
            }
            if (!this.l) {
                this.i(this.ap);
            }
        }
        if (this.o.length != 0) {
            for (n = 0; n < this.o.length; ++n) {
                this.Z.a(this.o[n], aO[this.u], this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], this.ad[this.u], null, 240, 260);
            }
        }
        if (this.ah[7] == 0) {
            this.e(this.J);
        }
    }

    private void u() {
        int[][] nArrayArray = new int[][]{{8, 0, 20, 38}, {16, 0, 16, 0}, {16, 0, 8, 0}, {8, 0}, new int[0]};
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 3000;
        int n6 = this.ap.aR & 0xFFFFFF7F;
        for (int j = 0; j < this.ac.length; ++j) {
            if (this.ac[j][3] == 1) {
                short s;
                int n7 = this.ac[j][2];
                if ((this.ap.aR == 1 && this.ap.T[0] >= this.bF[0][0] && this.ap.T[0] <= this.bF[2][7] + 2 || this.ap.aR == 4 && this.ap.T[0] == 1) && (s = (short)this.a(n = this.ap.aF[0][0], n2 = this.ap.aF[0][1], n3 = this.bT[n6][this.ap.aH][2] - this.bT[n6][this.ap.aH][0], n4 = this.bT[n6][this.ap.aH][3] - this.bT[n6][this.ap.aH][1], this.ac[j][0] + nArrayArray[this.u][n7 * 2] - 4, this.ac[j][1] + nArrayArray[this.u][n7 * 2 + 1] + 24, 16, 24, 4)) >= 1000 && s < 3000) {
                    this.ac[j][3] = 2;
                    this.a(this.bc[j], 41, nArrayArray[this.u][n7 * 2], nArrayArray[this.u][n7 * 2 + 1], 1, 19, 0, 1, -1, 0);
                    int n8 = Math.abs(this.cm.nextInt() % 100);
                    if (n8 <= 40) {
                        this.F[j] = new i();
                        this.F[j].aR = 19;
                    }
                    if (n8 <= 5) {
                        this.F[j].aT = 0;
                        this.a(this.F[j], (int)com.cwa.gamelib.b.q[this.F[j].aT * 2], -1);
                    } else if (n8 <= 10) {
                        this.F[j].aT = 2;
                        this.a(this.F[j], (int)com.cwa.gamelib.b.q[this.F[j].aT * 2], -1);
                    } else if (n8 <= 25) {
                        this.F[j].aT = 4;
                        this.a(this.F[j], (int)com.cwa.gamelib.b.q[this.F[j].aT * 2], -1);
                    } else if (n8 <= 40) {
                        this.F[j].aT = 3;
                        this.a(this.F[j], (int)com.cwa.gamelib.b.q[this.F[j].aT * 2], -1);
                    }
                    if (this.F[j] != null) {
                        com.cwa.gamelib.i.a(this.F[j], this.ac[j][0] + nArrayArray[this.u][n7 * 2], this.ac[j][1] + nArrayArray[this.u][n7 * 2 + 1], 0);
                    }
                }
            }
            if (this.F[j] == null) continue;
            this.Z.a(this.F[j], this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
            if (!this.l) {
                this.i(this.F[j]);
                this.F[j].i = -5;
                this.F[j].u += this.F[j].i;
                this.F[j].ap = (short)2;
            }
            this.h(this.F[j]);
            if (this.aT == 0) {
                n5 = this.a((i)this.ap, this.F[j], 2, 0, false);
            }
            if (n5 >= 3000) continue;
            this.F(this.F[j].aT);
            this.F[j] = null;
        }
    }

    private void q() {
        this.ah[12] = 0;
        this.ah[13] = 0;
        this.ah[14] = 0;
        this.ah[15] = 0;
        this.ah[16] = 0;
        block7: for (int j = 0; j < 4; j += 2) {
            switch (this.V[this.aK[1]][j]) {
                case 10: 
                case 15: 
                case 20: {
                    this.ah[12] = this.V[this.aK[1]][j];
                    continue block7;
                }
                case 11: 
                case 16: 
                case 21: {
                    this.ah[13] = this.V[this.aK[1]][j];
                    continue block7;
                }
                case 12: 
                case 17: 
                case 22: {
                    this.ah[14] = this.V[this.aK[1]][j];
                    continue block7;
                }
                case 13: 
                case 18: 
                case 23: {
                    this.ah[15] = this.V[this.aK[1]][j];
                    continue block7;
                }
                case 14: 
                case 19: 
                case 24: {
                    this.ah[16] = this.V[this.aK[1]][j];
                    continue block7;
                }
            }
        }
    }

    private void b(f f2) {
        int n;
        if (!this.l) {
            int n2;
            int n3;
            if (f2 == null) {
                return;
            }
            n = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = f2.aR & 0xFFFFFF7F;
            if (f2 == null) {
                return;
            }
            if ((this.ap.aR == 1 && this.ap.T[0] >= this.bF[0][0] && this.ap.T[0] <= this.bF[2][7] + 2 || this.ap.aR == 4 && this.ap.T[0] == 1) && f2.V[0] >= f2.V[1]) {
                n3 = this.ap.aR & 0xFFFFFF7F;
                n6 = this.bT[n3][this.ap.aH][2] - this.bT[n3][this.ap.aH][0];
                n7 = this.bT[n3][this.ap.aH][3] - this.bT[n3][this.ap.aH][1];
                n4 = this.ap.aF[0][0];
                n5 = this.ap.aF[0][1];
                if (f2.an[2] && f2.an[8]) {
                    if (this.ap.aR == 1) {
                        n8 = com.cwa.gamelib.b.bC[this.aK[1]] + com.cwa.gamelib.b.x[0][1];
                    }
                    if (f2.B[0] != 10) {
                        n2 = 0;
                        if (this.ah[12] - 10 >= 0) {
                            n2 = com.cwa.gamelib.b.aM[this.ah[12] - 10][0];
                        }
                        if (this.a(f2, n4, n5, n6, n7, n8 + n2, 1) == 1000) {
                            if (n9 >= 5 && n9 <= 13) {
                                this.d(f2.B, 10);
                            } else if (n9 >= 14 && n9 <= 18) {
                                if (f2.af[0] == 0) {
                                    this.d(f2.B, 10);
                                    this.bO[this.ah[6] * this.aE] = 1;
                                } else {
                                    switch (n9) {
                                        case 16: {
                                            if (f2.af[0] <= f2.af[1] * com.cwa.gamelib.b.aX[f2.aR - 14] / 100) {
                                                f2.ad[8] = 1;
                                            }
                                            if (f2.aa != -1) break;
                                            this.a((i)f2, 3, -1);
                                            this.d(f2.B, 10);
                                            break;
                                        }
                                        case 17: {
                                            if (f2.aa != -1) break;
                                            this.a((i)f2, 8, -1);
                                            this.d(f2.B, 10);
                                        }
                                    }
                                }
                            }
                            if (n9 == 15) {
                                this.a(f2, 0, 8, 32, 25, this.ap.K, 15, 1, 1, -1, 0);
                            }
                            this.a(this.ap, 9, 43, f2.C + this.L[n9][f2.aH][0] * com.cwa.gamelib.b.g[f2.K] + (this.L[n9][f2.aH][2] - this.L[n9][f2.aH][0] >> 1) * com.cwa.gamelib.b.g[f2.K], this.ap.aF[0][1] - 8, this.ap.K, 19, 1, 1, -1, 1);
                            f2.ad[0] = this.ap.K;
                            f2.ad[1] = 0;
                        }
                    }
                }
            }
            if (this.ap.aB[0] >= this.ap.aB[1] && f2.af[0] > 0 && f2.an[2] && f2.aA) {
                for (n2 = 1; n2 >= 0; --n2) {
                    n3 = f2.aR & 0xFFFFFF7F;
                    if (n2 == 0) {
                        n6 = this.L[n3][f2.aH][2] - this.L[n3][f2.aH][0];
                        n7 = this.L[n3][f2.aH][3] - this.L[n3][f2.aH][1];
                        n4 = f2.C + this.L[n3][f2.aH][0];
                        n5 = f2.A - this.L[n3][f2.aH][1];
                        n = 0;
                        n8 = com.cwa.gamelib.b.x[this.ah[106]][n9];
                        if (n9 >= 14) {
                            n8 = com.cwa.gamelib.b.x[this.ah[106]][n9 + this.ah[92] * 5];
                        }
                    } else if (n2 == 1) {
                        n6 = this.bT[n3][f2.aH][2] - this.bT[n3][f2.aH][0];
                        n7 = this.bT[n3][f2.aH][3] - this.bT[n3][f2.aH][1];
                        n4 = f2.aF[0][0];
                        n5 = f2.aF[0][1];
                        n = 1;
                        n8 = com.cwa.gamelib.b.x[this.ah[106]][n9];
                        if (n9 >= 14) {
                            n8 = com.cwa.gamelib.b.x[this.ah[106]][n9 + this.ah[92] * 5];
                        }
                    }
                    if (!f2.an[8] || this.a(this.ap, n4, n5, n6, n7, n8, n) != 1000) continue;
                    this.ap.aI[0] = f2.K;
                    switch (this.ap.aR) {
                        case 1: 
                        case 3: {
                            this.ap.aR = 1;
                            if (this.ah[91] == 1 || this.ap.T[0] < this.bF[0][0] || this.ap.T[0] > this.bF[2][7] + 2 || this.ap.af[0] <= 0) {
                                this.ap.E = true;
                                this.ap.ap = (short)(this.ap.ap & 3);
                                this.a(this.ap);
                                this.ah[91] = 0;
                                break;
                            }
                            this.a((i)this.ap, 9, -1);
                            this.ap.E = true;
                            this.ap.ap = (short)(this.ap.ap & 3);
                            break;
                        }
                        case 2: {
                            if (this.ap.af[0] != 0) break;
                            this.ap.aR = 1;
                            this.a((i)this.ap, 10, -1);
                        }
                    }
                    break;
                }
            }
            this.b(f2, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
            this.l(f2);
            if (f2.aA) {
                this.i(f2);
            }
        }
        this.a((i)f2);
        if (f2.aA) {
            this.m(f2);
        }
        this.e(f2, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
        for (n = 0; n < f2.w.length; ++n) {
            this.b((f)f2.w[n]);
        }
    }

    private void a(d d2) {
        d2.aI[2] = 1;
        d2.ap = 1;
        d2.ap = (short)(d2.ap | (this.ap.aI[0] == 2 ? 4 : 8));
        d2.K = (byte)(this.ap.aI[0] == 2 ? 1 : 2);
        d2.an[5] = true;
        d2.aE = 0;
        d2.aO = 2;
        d2.i = d2.W[d2.aO][d2.aE];
        if (this.ap.af[0] > 0) {
            this.a((i)d2, 7, -1);
        } else {
            this.a((i)d2, 10, -1);
            this.ah[62] = 0;
            this.ah[63] = 0;
        }
    }

    private void m(i i2) {
        int n = i2.aR & 0xFFFFFF7F;
        if (this.cn[n] == null) {
            return;
        }
        this.Z.a(i2, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
        for (int j = 0; j < i2.L.length; ++j) {
            this.a(i2.L[j], i2.C, i2.A, -1);
        }
    }

    private void a(int[] nArray, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        if (nArray[11] == 0) {
            n4 = n + nArray[5];
            n5 = n2 + nArray[6];
        } else if (nArray[11] == 1) {
            n4 = nArray[5];
            n5 = nArray[6];
        }
        if (nArray[8] > 0) {
            int n6 = this.bZ[nArray[0]][nArray[1]].length - 1;
            if (nArray[0] == 22) {
                this.Z.a(nArray[0], nArray[1], nArray[2], nArray[7], n4, n5, this.cn[19], this.ak, this.ar, this.bZ, this.L, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
            } else {
                this.Z.a(nArray[0], nArray[1], nArray[2], nArray[7], n4, n5, this.cn[nArray[0]], this.ak, this.ar, this.bZ, this.L, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
            }
            nArray[3] = nArray[3] + 1;
            if (nArray[3] > this.bZ[nArray[0]][nArray[1]][nArray[2]][0]) {
                nArray[3] = 0;
                if (n3 <= 4) {
                    if (nArray[0] == 19 && nArray[1] >= 49 && nArray[1] <= 66) {
                        nArray[7] = this.ap.K;
                    }
                    if (this.bZ[nArray[0]][nArray[1]][nArray[2]][0] == 0) {
                        this.ap.ab = true;
                    }
                    if (nArray[2] + 1 > n6 - 1) {
                        if (this.ah[62] == 2) {
                            this.ah[62] = 0;
                        }
                        if (this.ah[63] == 2) {
                            this.ah[63] = 0;
                        }
                    }
                }
                if ((nArray[2] = nArray[2] + 1) > n6 - 1) {
                    if (this.bZ[nArray[0]][nArray[1]][n6][0] > 0 && (nArray[4] = nArray[4] + 1) >= this.bZ[nArray[0]][nArray[1]][n6][0]) {
                        nArray[4] = 0;
                        nArray[8] = 0;
                        if (nArray[10] >= 0) {
                            this.a(nArray, nArray[10], nArray[5], nArray[6], nArray[7], nArray[0], 1, 1, -1, 0);
                        }
                    }
                    nArray[2] = 0;
                }
                nArray[3] = 0;
            }
        }
    }

    private void a(i i2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.a(i2.L[n], n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }

    private void a(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
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
    }

    public void d() {
        System.gc();
    }

    public int a(byte by) {
        byte[][] byArrayArray = new byte[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 52}, {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36}, {37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 53}, {50}, {51}};
        for (int j = 0; j < byArrayArray.length; ++j) {
            if (this.c(by, byArrayArray[j]) < 0) continue;
            return j;
        }
        return 0;
    }

    public int x(int n) {
        byte[][] byArrayArray = new byte[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27}, {29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52}, {14, 15, 16, 28, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71}, {72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91}};
        for (int j = 0; j < byArrayArray.length; ++j) {
            if (this.c((byte)n, byArrayArray[j]) < 0) continue;
            return j;
        }
        return 0;
    }

    private void a(i i2, int n) {
        int n2 = i2.aR & 0xFFFFFF7F;
        block0 : switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                d d2 = (d)i2;
                if (this.ah[22] == 0) {
                    d2.H[0] = d2.C;
                    d2.H[1] = d2.A;
                    d2.ac[0] = (byte)this.af[this.aT][n][6];
                    d2.ac[1] = (byte)this.af[this.aT][n][7];
                    if (this.af[this.aT][n][1] > 0) {
                        d2.K = (byte)this.af[this.aT][n][1];
                    } else if (this.af[this.aT][n][1] == -1) {
                        d2.K = (byte)(d2.C > this.i[0].C ? 2 : 1);
                    }
                    if (d2.aR != this.af[this.aT][n][2]) {
                        this.a(this.ap, 3, 4, 0, 0, this.ap.K, 18, 1, 1, -1, 0);
                    }
                    d2.aR = this.af[this.aT][n][2];
                    this.a((i)d2, this.af[this.aT][n][3], -1);
                    d2.ap = (byte)this.af[this.aT][n][4];
                    d2.F = 0;
                    this.ah[22] = 1;
                    break;
                }
                if (this.af[this.aT][n][8] > 0) {
                    if (Math.abs(d2.C - d2.H[0]) <= this.af[this.aT][n][8]) {
                        if (d2.aR == 1 && (d2.T[0] == 3 || d2.T[0] == 0 || d2.T[0] == 5 || d2.T[0] == 4) || d2.aR == 4 && d2.T[0] == 2 || d2.T[0] == 0) {
                            d2.ap = (byte)this.af[this.aT][n][4];
                        }
                        ++d2.F;
                    }
                } else if (this.af[this.aT][n][8] == -1 && Math.abs(d2.C - this.i[0].C) > 25) {
                    if (d2.aR == 1 && (d2.T[0] == 3 || d2.T[0] == 0 || d2.T[0] == 5 || d2.T[0] == 4) || d2.aR == 4 && d2.T[0] == 2 || d2.T[0] == 0) {
                        d2.ap = (short)(d2.C > this.i[0].C ? 4 : 8);
                    }
                    ++d2.F;
                }
                switch (this.aT) {
                    case 30: {
                        if (this.ah[58] == 0) break block0;
                        this.ah[22] = 0;
                        break block0;
                    }
                    case 31: {
                        if (this.ah[58] == 0) break block0;
                        this.ah[22] = 0;
                        break block0;
                    }
                    case 32: {
                        if (Math.abs(d2.C - this.i[0].C) > 25) break block0;
                        this.ah[22] = 0;
                        break block0;
                    }
                }
                this.ah[22] = 0;
                break;
            }
            case 18: {
                f f2 = (f)i2;
                f2.V[0] = f2.V[1];
                if (i2.aw != 0) break;
                this.a(i2, 2, -1);
                if (!i2.r) break;
                if (this.af[this.aT][n][0] == 0) {
                    i2.aA = false;
                }
                i2.ab = this.af[this.aT][n][11] != 0;
                i2.ah = (byte)this.af[this.aT][n][12];
                ++i2.aw;
            }
        }
    }

    private void a(f f2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = 0;
        if (f2 == null) {
            return;
        }
        int n8 = f2.aR & 0xFFFFFF7F;
        if (!f2.Z) {
            if (this.a((i)this.ap, f2, f2.y, 2) > 0) {
                f2.Z = true;
                if (this.ah[6] >= 0 && this.ah[60] == 1 && this.bO[this.ah[6] * this.aE] == 0 && this.ah[106] == 0 && n8 >= 14 && n8 <= 18) {
                    this.ah[23] = 7;
                    this.ah[55] = this.bO[this.ah[6] * this.aE + 5];
                    this.aT = this.bO[this.ah[6] * this.aE + 5];
                }
            }
        } else {
            switch (f2.aR) {
                case 5: {
                    switch (f2.B[0]) {
                        case 0: {
                            if (!f2.aA) {
                                f2.V[12] = (short)(f2.V[12] + 1);
                                if (f2.V[12] < f2.V[13]) break;
                                f2.an[0] = false;
                                n6 = this.cm.nextInt() % 50;
                                f2.aA = true;
                                f2.af[0] = f2.af[1];
                                f2.ad[5] = 0;
                                if (this.ap.C > f2.av[0] && this.ap.C < f2.av[0] + f2.av[2]) {
                                    n6 = this.ap.C + n6 > f2.av[0] + f2.av[2] ? f2.av[0] + f2.av[2] - 8 : (this.ap.C + n6 < f2.av[0] ? f2.av[0] + 8 : (n6 += this.ap.C));
                                    com.cwa.gamelib.f.a(f2, this.ap.C, f2.A, 0);
                                    f2.K = (byte)(f2.C < this.ap.C ? 1 : 2);
                                } else {
                                    com.cwa.gamelib.f.a(f2, n6 > 0 ? f2.av[0] + 8 : f2.av[0] + f2.av[2] - 8, f2.A, 0);
                                    f2.K = (byte)(n6 > 0 ? 1 : 2);
                                }
                                f2.V[12] = 0;
                                f2.O = (short)-1;
                                f2.o = null;
                                this.a((i)f2, 2, -1);
                                f2.E = true;
                                break;
                            }
                            if (f2.T[0] == 2 && f2.r) {
                                f2.E = false;
                                this.a((i)f2, 0, -1);
                                f2.an[0] = false;
                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 200 * com.cwa.gamelib.b.g[f2.K], 1);
                                f2.O = 0;
                                f2.V[2] = 0;
                                f2.ap = (short)(f2.C < this.ap.C ? 8 : 4);
                                f2.ac[0] = com.cwa.gamelib.i.z;
                                break;
                            }
                            if (f2.T[0] == 0) {
                                if (f2.ap != 0 || f2.O != -1 || (f2.V[2] = (short)(f2.V[2] + 1)) < f2.V[3]) break;
                                f2.V[2] = 0;
                                this.a((i)f2, 3, -1);
                                f2.O = (short)-1;
                                f2.E = true;
                                break;
                            }
                            if (f2.T[0] != 3 || !f2.r) break;
                            f2.E = false;
                            f2.aA = false;
                            f2.an[8] = false;
                            break;
                        }
                        case 10: {
                            if (f2.af[0] > 0) {
                                if (f2.ad[1] == 0 && f2.T[0] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    this.a((i)f2, 4, -1);
                                    f2.ap = 0;
                                    f2.O = (short)-1;
                                }
                                if (f2.ap != 0 || f2.O != -1 || !f2.r) break;
                                this.d(f2.B, f2.B[1]);
                                this.a((i)f2, (int)f2.T[1], -1);
                                f2.O = 0;
                                f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                break;
                            }
                            if (f2.ad[1] == 0) {
                                this.a((i)f2, 1, -1);
                                this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                f2.ad[1] = f2.ad[1] + 1;
                                f2.ap = 0;
                                f2.O = (short)-1;
                                break;
                            }
                            if (!f2.r) break;
                            this.a(f2, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0);
                            f2.aA = false;
                            this.d(f2.B, f2.B[1]);
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 6: {
                    if (f2.aA) {
                        if (f2.t == null) {
                            switch (f2.B[0]) {
                                case 0: {
                                    if (f2.T[0] == 0) {
                                        if (this.a((i)this.ap, f2, f2.ar, 2) <= 0) break;
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        n6 = this.ap.A - f2.A;
                                        f2.ap = (short)(n6 > 0 ? 1 : 2);
                                        f2.O = 1;
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, n6);
                                        this.a((i)f2, 1, -1);
                                        f2.E = true;
                                        break;
                                    }
                                    if (f2.T[0] == 1) {
                                        if (f2.ap != 0) break;
                                        f2.ac[0] = com.cwa.gamelib.i.az;
                                        f2.ap = (short)(f2.K == 2 ? 4 : 8);
                                        f2.O = 0;
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, this.H * com.cwa.gamelib.b.g[f2.K], 1);
                                        break;
                                    }
                                    if (f2.T[0] != 2) break;
                                    f2.ap = (short)2;
                                    f2.O = 1;
                                    com.cwa.gamelib.i.a(f2);
                                    f2.ac[1] = com.cwa.gamelib.i.aP;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -128);
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    break;
                                }
                                case 10: {
                                    if (f2.ad[1] == 0) {
                                        if (f2.af[0] == 0) {
                                            f2.ap = (short)2;
                                            f2.O = 1;
                                            com.cwa.gamelib.i.a(f2);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -96);
                                            this.a((i)f2, 2, -1);
                                            this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                            f2.ad[1] = f2.ad[1] + 1;
                                            break;
                                        }
                                        this.d(f2.B, f2.B[1]);
                                        break;
                                    }
                                    if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                }
                            }
                        } else if (f2.t.aR == 18) {
                            switch (f2.B[0]) {
                                case 0: {
                                    if (f2.ap != 0 || f2.O != -1) break;
                                    f2.M[0] = f2.M[0] + 1;
                                    if (f2.M[0] > 2) {
                                        f2.M[0] = 0;
                                    }
                                    if (f2.ad[6] == f2.M[0] && (f2.V[14] = (short)(f2.V[14] + 1)) > f2.V[15]) {
                                        f2.aA = false;
                                    }
                                    switch (f2.M[0]) {
                                        case 0: {
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 24, 48);
                                            f2.ac[0] = com.cwa.gamelib.i.aP;
                                            f2.O = (short)4;
                                            f2.ap = (short)8;
                                            break;
                                        }
                                        case 1: {
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, -48, -20);
                                            f2.ac[0] = (byte)(com.cwa.gamelib.i.aP * 2);
                                            f2.O = (short)2;
                                            f2.ap = (short)4;
                                            break;
                                        }
                                        case 2: {
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 24, 48);
                                            f2.ac[0] = com.cwa.gamelib.i.aP;
                                            f2.O = (short)3;
                                            f2.ap = (short)4;
                                        }
                                    }
                                    break;
                                }
                                case 10: {
                                    if (f2.ad[1] == 0) {
                                        if (f2.af[0] == 0) {
                                            f2.ap = (short)2;
                                            f2.O = 1;
                                            com.cwa.gamelib.i.a(f2);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -96);
                                            this.a((i)f2, 2, -1);
                                            this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                            f2.ad[1] = f2.ad[1] + 1;
                                            break;
                                        }
                                        this.d(f2.B, f2.B[1]);
                                        break;
                                    }
                                    if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                    f2.aA = false;
                                }
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 7: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                if (f2.ap != 0 || f2.O != -1) break;
                                if (!f2.Z && this.a((i)this.ap, f2, f2.y, 2) > 0) {
                                    f2.Z = true;
                                }
                                if (!f2.Z) break;
                                if (f2.T[0] == 0) {
                                    if (this.a((i)this.ap, f2, f2.c, 2) > 0) {
                                        f2.ac[0] = com.cwa.gamelib.i.aP;
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, this.ap.C - f2.C > 0 ? -64 : 64, Math.abs(this.ap.A - f2.A));
                                        f2.O = (short)3;
                                        break;
                                    }
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    if (this.a((i)this.ap, f2, f2.ar, 2) > 0) {
                                        this.a((i)f2, 1, -1);
                                        f2.ac[0] = com.cwa.gamelib.i.f;
                                        n7 = this.cm.nextInt() % 100;
                                        f2.O = Math.abs(n7) < 40 ? (short)3 : (short)2;
                                    } else {
                                        f2.ac[0] = com.cwa.gamelib.i.aP;
                                        f2.O = (short)3;
                                    }
                                    n6 = this.ap.C - f2.C == 0 ? 1 : this.ap.C - f2.C;
                                    n5 = this.ap.A - f2.A == 0 ? 1 : this.ap.A - f2.A;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(n6) < 50 ? n6 * 50 / Math.abs(n6) : n6, Math.abs(n5) < 100 ? n5 : n5 * 100 / Math.abs(n5));
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                    break;
                                }
                                if (f2.T[0] != 1 || f2.O != -1) break;
                                f2.ac[0] = com.cwa.gamelib.i.aP;
                                this.a((i)f2, 0, -1);
                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        f2.ap = (short)2;
                                        f2.O = 1;
                                        com.cwa.gamelib.i.a(f2);
                                        f2.ac[1] = com.cwa.gamelib.i.aP;
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -100);
                                        this.a((i)f2, 2, -1);
                                        this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, 0);
                                    break;
                                }
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    this.a((i)f2, 3, -1);
                                    f2.ap = 0;
                                    f2.O = (short)-1;
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                }
                                if (f2.ap != 0 || f2.O != -1 || !f2.r) break;
                                f2.ad[1] = 0;
                                this.d(f2.B, 0);
                                this.a((i)f2, 0, -1);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 8: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                if (f2.ap != 0 || f2.O != -1) break;
                                if (!f2.Z && this.a((i)this.ap, f2, f2.y, 2) > 0) {
                                    f2.Z = true;
                                }
                                if (f2.T[0] == 0) {
                                    if (!f2.Z) break;
                                    if (this.a((i)this.ap, f2, f2.c, 2) > 0) {
                                        f2.ac[0] = com.cwa.gamelib.i.aP;
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(this.ap.C - f2.C) < 40 ? com.cwa.gamelib.b.g[f2.K] * 50 : -(this.ap.C - f2.C), -(this.ap.A - f2.A));
                                        f2.O = 0;
                                        break;
                                    }
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    if (this.a((i)this.ap, f2, f2.ar, 2) > 0) {
                                        this.a((i)f2, 1, -1);
                                        f2.ac[0] = com.cwa.gamelib.i.f;
                                        n7 = this.cm.nextInt() % 100;
                                        f2.O = Math.abs(n7) < 40 ? (short)3 : (short)2;
                                    } else {
                                        f2.ac[0] = com.cwa.gamelib.i.aP;
                                        f2.O = (short)3;
                                    }
                                    n6 = this.ap.C - f2.C == 0 ? 1 : this.ap.C - f2.C;
                                    n5 = this.ap.A - f2.A == 0 ? 1 : this.ap.A - f2.A;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(n6) < 50 ? n6 * 50 / Math.abs(n6) : n6, Math.abs(n5) < 100 ? n5 : n5 * 100 / Math.abs(n5));
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                    break;
                                }
                                if (f2.T[0] != 1 || f2.O != -1 || f2.ap != 0) break;
                                this.a((i)f2, 0, -1);
                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        f2.ap = (short)2;
                                        f2.O = 1;
                                        com.cwa.gamelib.i.a(f2);
                                        f2.ac[1] = com.cwa.gamelib.i.aP;
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -80);
                                        this.a((i)f2, 2, -1);
                                        this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    this.a((i)f2, 3, -1);
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                    f2.ap = 0;
                                    f2.O = (short)-1;
                                }
                                if (f2.ap != 0 || f2.O != -1 || !f2.r) break;
                                this.d(f2.B, 0);
                                this.a((i)f2, 0, -1);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 9: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                if (f2.T[0] == 0) {
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    if (this.a((i)this.ap, f2, f2.ar, 1) > 0) {
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        this.a((i)f2, 1, -1);
                                        break;
                                    }
                                    if (this.a((i)this.ap, f2, f2.k, 1) <= 0) break;
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    f2.ap = (short)(this.ap.C < f2.C ? 4 : 8);
                                    f2.ac[0] = com.cwa.gamelib.i.aP;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, this.ap.C - f2.C, 1);
                                    f2.O = 0;
                                    break;
                                }
                                if (f2.T[0] == 1) {
                                    if (!f2.r || (f2.V[2] = (short)(f2.V[2] + 1)) < f2.V[3]) break;
                                    f2.V[2] = 0;
                                    this.a((i)f2, 0, -1);
                                    break;
                                }
                                if (f2.T[0] != 2) break;
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        this.a((i)f2, 2, -1);
                                        this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                        f2.ap = 0;
                                        f2.O = (short)-1;
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    this.a((i)f2, 3, -1);
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.ad[0] == 2 ? -16 : 16, 1);
                                    f2.ac[0] = com.cwa.gamelib.i.f;
                                    f2.ap = (short)(f2.ad[0] == 2 ? 8 : 4);
                                    f2.O = 0;
                                }
                                if (f2.ap != 0 || f2.O != -1 || !f2.r) break;
                                this.d(f2.B, f2.B[1]);
                                this.a((i)f2, (int)f2.T[1], -1);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 10: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                if (f2.ap == 0 && f2.O == -1) {
                                    if (this.a((i)this.ap, f2, f2.c, 1) > 0) {
                                        f2.K = (byte)(this.ap.C < f2.C ? 1 : 2);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, -(this.ap.C - f2.C), -(this.ap.A - f2.A));
                                        f2.O = 0;
                                        this.a((i)f2, 1, -1);
                                        break;
                                    }
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    if (this.a((i)this.ap, f2, f2.ar, 1) > 0) {
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        this.a((i)f2, 2, -1);
                                        f2.ah = (byte)10;
                                        this.d(f2.B, 3);
                                        break;
                                    }
                                    if (this.a((i)this.ap, f2, f2.k, 1) <= 0) break;
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    f2.ap = (short)(this.ap.C < f2.C ? 4 : 8);
                                    f2.ac[0] = com.cwa.gamelib.i.aP;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, this.ap.C - f2.C, 1);
                                    f2.O = 0;
                                    this.a((i)f2, 1, -1);
                                    break;
                                }
                                if (f2.T[0] != 2 || !f2.r || (f2.V[2] = (short)(f2.V[2] + 1)) < f2.V[3]) break;
                                f2.V[2] = 0;
                                this.a((i)f2, 0, -1);
                                break;
                            }
                            case 2: {
                                if (f2.T[0] == 2) {
                                    this.a((i)f2, 0, -1);
                                }
                                this.d(f2.B, 0);
                                break;
                            }
                            case 3: {
                                if (!f2.r || f2.T[0] != 2) break;
                                this.d(f2.B, 2);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        this.a((i)f2, 4, -1);
                                        this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                        f2.ap = 0;
                                        f2.O = (short)-1;
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    this.a((i)f2, 5, -1);
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.ad[0] == 2 ? -25 : 25, 1);
                                    f2.ac[0] = com.cwa.gamelib.i.al;
                                    f2.ap = (short)(f2.ad[0] == 2 ? 8 : 4);
                                    f2.O = 0;
                                }
                                if (f2.ap != 0 || f2.O != -1) break;
                                this.d(f2.B, f2.B[1]);
                                this.a((i)f2, (int)f2.T[1], -1);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 11: {
                    if (f2.aA) {
                        if (f2.B[0] == 0) {
                            if (f2.ap == 0 && f2.O == -1) {
                                if (!f2.Z && this.a((i)this.ap, f2, f2.y, 2) > 0) {
                                    f2.Z = true;
                                }
                                if (f2.Z) {
                                    if (this.a((i)this.ap, f2, f2.c, 2) > 0) {
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(this.ap.C - f2.C) < 40 ? com.cwa.gamelib.b.g[f2.K] * 60 : -(this.ap.C - f2.C), -(this.ap.A - f2.A));
                                        f2.ac[0] = com.cwa.gamelib.i.az;
                                        f2.O = (short)3;
                                    } else {
                                        f2.V[12] = (short)(f2.V[12] + 1);
                                        if (f2.V[12] >= f2.V[13]) {
                                            f2.V[12] = 0;
                                            if (this.a((i)this.ap, f2, f2.ar, 2) > 0) {
                                                this.d(f2.B, 2);
                                                n7 = Math.abs(this.cm.nextInt()) % 100;
                                                if (Math.abs(f2.A - this.ap.A) < 16 && n7 < 60) {
                                                    f2.ab = true;
                                                    f2.ah = (byte)9;
                                                } else {
                                                    n7 = this.cm.nextInt() % 100;
                                                    f2.O = Math.abs(n7) < 40 ? (short)3 : (short)2;
                                                }
                                            } else {
                                                f2.ac[0] = com.cwa.gamelib.i.aP;
                                                f2.O = (short)3;
                                            }
                                            if (f2.O != -1) {
                                                n6 = this.ap.C - f2.C == 0 ? 1 : this.ap.C - f2.C;
                                                n5 = this.ap.A - f2.A == 0 ? 1 : this.ap.A - f2.A;
                                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(n6) < 50 ? n6 * 50 / Math.abs(n6) : n6, Math.abs(n5) < 100 ? n5 : n5 * 100 / Math.abs(n5));
                                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                                f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (f2.B[0] == 2) {
                            if (f2.O == -1 && f2.ap == 0) {
                                this.d(f2.B, 0);
                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                            }
                        } else if (f2.B[0] == 10) {
                            if (f2.af[0] == 0) {
                                if (f2.ad[1] == 0) {
                                    f2.ap = (short)2;
                                    f2.O = 1;
                                    com.cwa.gamelib.i.a(f2);
                                    f2.ac[1] = com.cwa.gamelib.i.aP;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -100);
                                    this.a((i)f2, 4, -1);
                                    this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                    f2.ad[1] = f2.ad[1] + 1;
                                } else if (f2.r) {
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                }
                            } else {
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.ad[0] == 2 ? -16 : 16, 1);
                                    f2.ac[0] = com.cwa.gamelib.i.f;
                                    f2.ap = (short)(f2.ad[0] == 2 ? 8 : 4);
                                    f2.O = 0;
                                }
                                if (f2.ap == 0 && f2.O == -1) {
                                    this.d(f2.B, f2.B[1]);
                                }
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 12: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                if (f2.T[0] == 1 || f2.T[0] == 0) {
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    if (this.a((i)this.ap, f2, f2.ar, 1) > 0) {
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        this.a((i)f2, 5, -1);
                                        f2.ap = 0;
                                        f2.O = (short)-1;
                                        break;
                                    }
                                    if (this.a((i)this.ap, f2, f2.k, 1) <= 0) break;
                                    this.a((i)f2, 1, -1);
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    f2.ap = (short)(this.ap.C < f2.C ? 4 : 8);
                                    f2.ac[0] = com.cwa.gamelib.i.aP;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, this.ap.C - f2.C, 1);
                                    f2.O = 0;
                                    break;
                                }
                                if (f2.T[0] == 5) {
                                    if (!f2.r) break;
                                    f2.ap = (short)(this.ap.C < f2.C ? 4 : 8);
                                    f2.ac[0] = com.cwa.gamelib.i.f;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, com.cwa.gamelib.b.g[f2.K] * 40, 1);
                                    f2.O = 0;
                                    this.a((i)f2, 2, -1);
                                    break;
                                }
                                if (f2.T[0] == 2) {
                                    if (f2.ap != 0 || f2.O != -1) break;
                                    f2.V[3] = 15;
                                    f2.V[2] = (short)(f2.V[2] + 1);
                                    if (f2.V[2] < f2.V[3]) break;
                                    f2.V[2] = 0;
                                    f2.ap = (short)(f2.K == 1 ? 4 : 8);
                                    f2.ac[0] = com.cwa.gamelib.i.z;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, -com.cwa.gamelib.b.g[f2.K] * 64, 1);
                                    f2.O = 0;
                                    this.a((i)f2, 6, -1);
                                    break;
                                }
                                if (f2.T[0] == 6) {
                                    if (f2.ap != 0 || f2.O != -1) break;
                                    this.a((i)f2, 0, -1);
                                    break;
                                }
                                if (f2.T[0] != 3) break;
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        com.cwa.gamelib.i.a(f2);
                                        this.a((i)f2, 3, -1);
                                        this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        f2.ap = 0;
                                        f2.O = (short)-1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                    this.a((i)f2, 4, -1);
                                    f2.ap = 0;
                                    f2.O = (short)-1;
                                }
                                if (f2.ap != 0 || f2.O != -1 || !f2.r) break;
                                this.d(f2.B, f2.B[1]);
                                this.a((i)f2, (int)f2.T[1], -1);
                                f2.O = 0;
                                f2.ap = (short)(f2.K == 1 ? 8 : 4);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 13: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                if (f2.ap != 0 || f2.O != -1) break;
                                if (f2.T[0] == 0) {
                                    if (!f2.Z && this.a((i)this.ap, f2, f2.y, 2) > 0) {
                                        f2.Z = true;
                                    }
                                    if (!f2.Z) break;
                                    if (this.a((i)this.ap, f2, f2.c, 1) > 0) {
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(this.ap.C - f2.C) < 40 ? com.cwa.gamelib.b.g[f2.K] * 60 : -(this.ap.C - f2.C), -(this.ap.A - f2.A));
                                        f2.ac[0] = com.cwa.gamelib.i.aP;
                                        f2.O = 0;
                                        break;
                                    }
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    if (this.a((i)this.ap, f2, f2.ar, 1) <= 0) break;
                                    this.a((i)f2, 1, -1);
                                    n7 = Math.abs(this.cm.nextInt()) % 100;
                                    if (Math.abs(f2.A - this.ap.A) < 16 && n7 < 50) {
                                        f2.V[13] = 20;
                                        f2.ab = true;
                                        f2.ah = (byte)17;
                                        f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                        this.a(f2, 3, 46, f2.aF[0][0] - f2.C, f2.aF[0][1] - f2.A, f2.K, 19, 1, 1, -1, 0);
                                        break;
                                    }
                                    f2.V[13] = 10;
                                    f2.ac[0] = com.cwa.gamelib.i.az;
                                    n7 = this.cm.nextInt() % 100;
                                    f2.O = Math.abs(n7) < 40 ? (short)3 : (short)2;
                                    n6 = this.ap.C - f2.C == 0 ? 1 : this.ap.C - f2.C;
                                    n5 = this.ap.A - f2.A == 0 ? 1 : this.ap.A - f2.A;
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, Math.abs(n6) < 50 ? n6 * 50 / Math.abs(n6) : n6, Math.abs(n5) < 100 ? n5 : n5 * 100 / Math.abs(n5));
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                    break;
                                }
                                if (f2.T[0] != 1 || f2.O != -1) break;
                                this.a((i)f2, 0, -1);
                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        f2.ap = (short)2;
                                        f2.O = 1;
                                        com.cwa.gamelib.i.a(f2);
                                        f2.ac[1] = com.cwa.gamelib.i.aP;
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -100);
                                        this.a((i)f2, 2, -1);
                                        this.a(f2, 4, (f2.aR & 0xFFFFFF7F) - 5, 0, 0, f2.K, 22, 1, 1, -1, 0);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (f2.ad[1] == 0) {
                                    f2.ad[1] = f2.ad[1] + 1;
                                    com.cwa.gamelib.i.a(f2, f2.C, f2.A, 0);
                                    this.a((i)f2, 3, -1);
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.ad[0] == 2 ? -16 : 16, 1);
                                    f2.ac[0] = com.cwa.gamelib.i.f;
                                    f2.ap = (short)(f2.ad[0] == 2 ? 8 : 4);
                                    f2.O = 0;
                                }
                                if (f2.ap != 0 || f2.O != -1 || !f2.r) break;
                                this.d(f2.B, f2.B[1]);
                                this.a((i)f2, (int)f2.T[1], -1);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 14: {
                    if (f2.aA) {
                        n5 = 0;
                        if (this.J == 75) {
                            n5 = 7;
                        }
                        switch (f2.B[0]) {
                            case 0: {
                                f2.V[13] = 16;
                                if (!f2.an[2]) {
                                    f2.V[12] = (short)(f2.V[12] + 1);
                                    if (f2.V[12] < f2.V[13]) break;
                                    f2.V[12] = 0;
                                    this.a(f2, 2, 1);
                                    switch (f2.aa) {
                                        case 0: {
                                            this.a((i)f2, 5 + n5, -1);
                                            if (this.ap.C > 70) {
                                                com.cwa.gamelib.i.a(f2, this.ap.C - 80, this.ap.A, 0);
                                                break;
                                            }
                                            com.cwa.gamelib.i.a(f2, this.ap.C + 80, this.ap.A, 0);
                                            break;
                                        }
                                        case 1: {
                                            this.a((i)f2, 5 + n5, -1);
                                            if (this.ap.C < this.H - 70) {
                                                com.cwa.gamelib.i.a(f2, this.ap.C + 80, this.ap.A, 0);
                                                break;
                                            }
                                            com.cwa.gamelib.i.a(f2, this.ap.C - 80, this.ap.A, 0);
                                            break;
                                        }
                                        case 2: {
                                            this.a((i)f2, 6 + n5, -1);
                                            if (this.ap.C < this.H - 70) {
                                                com.cwa.gamelib.i.a(f2, this.ap.C, this.ap.A + this.ap.aK[0] + 48, 0);
                                                break;
                                            }
                                            com.cwa.gamelib.i.a(f2, this.ap.C, this.ap.A + this.ap.aK[0] + 48, 0);
                                            break;
                                        }
                                        case 3: {
                                            this.a((i)f2, 2 + n5, -1);
                                            if (this.ap.C > 48) {
                                                com.cwa.gamelib.i.a(f2, this.ap.C - 48, this.ap.A + Math.abs(this.cm.nextInt() % 40) + 40, 0);
                                                break;
                                            }
                                            com.cwa.gamelib.i.a(f2, this.ap.C + 48, this.ap.A + Math.abs(this.cm.nextInt() % 40) + 40, 0);
                                            break;
                                        }
                                        case 4: {
                                            this.a((i)f2, 2 + n5, -1);
                                            if (this.ap.C < this.H - 48) {
                                                com.cwa.gamelib.i.a(f2, this.ap.C + 48, this.ap.A + Math.abs(this.cm.nextInt() % 40 + 10), 0);
                                                break;
                                            }
                                            com.cwa.gamelib.i.a(f2, this.ap.C - 48, this.ap.A + Math.abs(this.cm.nextInt() % 40 + 10), 0);
                                        }
                                    }
                                    f2.K = (byte)(f2.C > this.ap.C ? 2 : 1);
                                    this.d(f2.B, 3);
                                    break;
                                }
                                if (f2.T[0] == 0 + n5) {
                                    this.a((i)f2, 1 + n5, -1);
                                    break;
                                }
                                if (f2.T[0] != 1 + n5 || !f2.r) break;
                                f2.an[2] = false;
                                break;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                if (!f2.r) break;
                                if (f2.T[0] == 3 + n5) {
                                    this.a((i)f2, 4 + n5, -1);
                                    break;
                                }
                                if (f2.T[0] != 4 + n5 && f2.T[0] != 5 + n5 && f2.T[0] != 6 + n5) break;
                                f2.an[2] = false;
                                this.a((i)f2, 0 + n5, -1);
                                this.d(f2.B, 0);
                                break;
                            }
                            case 3: {
                                if (!f2.an[2]) {
                                    f2.an[2] = true;
                                }
                                if (f2.T[0] == 2 + n5) {
                                    if (!f2.r) break;
                                    this.a((i)f2, 3 + n5, -1);
                                    this.d(f2.B, 2);
                                    break;
                                }
                                this.d(f2.B, 2);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        this.a((i)f2, 1, -1);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    if (f2.t != null) break;
                                    this.ah[60] = 0;
                                    break;
                                }
                                this.d(f2.B, f2.B[1]);
                                break;
                            }
                            case 11: {
                                if (f2.L[0][8] != 0) break;
                                f2.an[2] = true;
                                if (this.ah[66] != 0) break;
                                this.ah[65] = 30;
                                this.ah[66] = 1;
                                this.ah[49] = 1;
                                this.aJ = 1;
                                this.bb = 1;
                                this.ah[9] = 0;
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 15: {
                    if (f2.aA) {
                        block74 : switch (f2.B[0]) {
                            case 0: {
                                block81 : switch (f2.T[0]) {
                                    case 0: {
                                        f2.V[9] = 15;
                                        f2.V[8] = (short)(f2.V[8] + 1);
                                        if (f2.ap != 0 || f2.O != -1) break;
                                        if (f2.V[8] < f2.V[9]) {
                                            if (this.a((i)this.ap, f2, f2.c, 2) > 0) {
                                                f2.V[8] = 0;
                                                f2.ac[0] = com.cwa.gamelib.i.aP;
                                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, this.ap.C - f2.C > 0 ? -64 : 64, Math.abs(this.ap.A - f2.A));
                                                f2.O = (short)3;
                                                break;
                                            }
                                            f2.V[8] = 0;
                                            f2.ac[0] = com.cwa.gamelib.i.az;
                                            f2.ac[1] = com.cwa.gamelib.i.az;
                                            f2.O = (short)3;
                                            n4 = this.cm.nextInt() % 40;
                                            int n9 = n4 >= 0 ? 20 : -20;
                                            n3 = Math.abs(this.cm.nextInt() % 30) + 20;
                                            n6 = this.ap.C + (n4 += n9) - f2.C;
                                            n5 = this.ap.A + n3 - f2.A;
                                            if (n5 > 0 && n5 < 32) {
                                                n5 = 32;
                                            }
                                            if (n6 >= 0 && n6 < 32) {
                                                n6 = 32;
                                            } else if (n6 < 0 && n6 > -32) {
                                                n6 = -32;
                                            }
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, n6, n5);
                                            f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                            f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                            break;
                                        }
                                        if (f2.V[8] < f2.V[9]) break;
                                        f2.V[8] = 0;
                                        this.a(f2, 1, 1);
                                        switch (f2.aa) {
                                            case 0: {
                                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                                this.a((i)f2, 1, -1);
                                                this.d(f2.B, 3);
                                                f2.ac[0] = com.cwa.gamelib.i.al;
                                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, (this.ap.C - f2.C) * 3 >> 1, this.ap.A - f2.A);
                                                break block81;
                                            }
                                            case 1: {
                                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                                this.a((i)f2, 3, -1);
                                                f2.ac[1] = (byte)(com.cwa.gamelib.i.f << 1);
                                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 0, f2.A >= this.j - 150 ? this.j - f2.A - 64 : 150);
                                                f2.O = 1;
                                                this.d(f2.B, 3);
                                                break block81;
                                            }
                                            case 2: {
                                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                                this.a((i)f2, 1, -1);
                                                f2.ac[1] = com.cwa.gamelib.i.al;
                                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 0, f2.A < 150 ? 150 - f2.A : 1);
                                                f2.O = 1;
                                                this.d(f2.B, 3);
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                switch (f2.T[0]) {
                                    case 5: {
                                        if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                        f2.D = false;
                                        f2.V[7] = 10;
                                        if (f2.V[6] < f2.V[7]) {
                                            f2.V[6] = (short)(f2.V[6] + 1);
                                            break;
                                        }
                                        f2.V[6] = 0;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                        break;
                                    }
                                    case 2: {
                                        if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                        f2.V[7] = 8;
                                        if (f2.V[6] < f2.V[7]) {
                                            f2.V[6] = (short)(f2.V[6] + 1);
                                            break;
                                        }
                                        f2.V[6] = 0;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                        break;
                                    }
                                    case 6: {
                                        if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                        f2.V[7] = 2;
                                        if (f2.V[6] < f2.V[7]) {
                                            f2.V[6] = (short)(f2.V[6] + 1);
                                            break;
                                        }
                                        f2.V[6] = 0;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                    }
                                }
                                break;
                            }
                            case 3: {
                                switch (f2.T[0]) {
                                    case 3: 
                                    case 4: {
                                        if (!f2.r || f2.ap != 0 || f2.O != -1) break block74;
                                        if (f2.T[0] == 3) {
                                            this.a((i)f2, 4, -1);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 10, -320);
                                            f2.ac[1] = 30;
                                            f2.D = true;
                                            f2.ap = (short)2;
                                            f2.O = 1;
                                            break block74;
                                        }
                                        if (f2.T[0] != 4) break block74;
                                        this.d(f2.B, 2);
                                        this.a((i)f2, 5, -1);
                                        break block74;
                                    }
                                    case 1: {
                                        if (!f2.r || f2.ap != 0 || f2.O != -1) break block74;
                                        if (f2.aa == 2) {
                                            this.a((i)f2, 2, -1);
                                            f2.ab = true;
                                            f2.ah = (byte)18;
                                            this.d(f2.B, 2);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.K == 2 ? 16 : -16, 1);
                                            f2.ac[1] = 20;
                                            f2.ap = (short)4;
                                            f2.O = 0;
                                            break block74;
                                        }
                                        if (f2.aa != 0) break block74;
                                        this.a((i)f2, 6, -1);
                                        this.d(f2.B, 2);
                                        f2.ap = (short)(f2.K == 1 ? 8 : 4);
                                        f2.O = (short)3;
                                        break block74;
                                    }
                                }
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        f2.ap = (short)2;
                                        f2.O = 1;
                                        com.cwa.gamelib.i.a(f2);
                                        f2.ac[1] = com.cwa.gamelib.i.aP;
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -100);
                                        this.a((i)f2, 9, -1);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    if (f2.t != null) break;
                                    this.ah[60] = 0;
                                    break;
                                }
                                this.d(f2.B, f2.B[1]);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 16: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                f2.V[9] = 25;
                                if (f2.V[8] < f2.V[9]) {
                                    f2.V[8] = (short)(f2.V[8] + 1);
                                }
                                if (f2.ap == 0 && f2.O == -1) {
                                    if (this.a((i)this.ap, f2, f2.c, 1) > 0 && f2.C > this.bD * 4 && f2.C < this.H - this.bD * 4) {
                                        n6 = Math.abs(this.cm.nextInt() % 100);
                                        if (n6 < 10) {
                                            f2.ac[0] = com.cwa.gamelib.i.f;
                                            f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.C - this.ap.C < 0 ? -this.bD * 3 : this.bD * 3, Math.abs(this.ap.A - f2.A));
                                            f2.O = 0;
                                            this.a((i)f2, 10, -1);
                                        } else if (n6 < 20) {
                                            n5 = this.ap.C > f2.C ? 80 : -80;
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, n5, 1);
                                            this.a((i)f2, 5, -1);
                                        }
                                        if (n6 < 20) {
                                            f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                            f2.ac[0] = com.cwa.gamelib.i.az;
                                            f2.O = 0;
                                        }
                                    } else {
                                        f2.V[12] = (short)(f2.V[12] + 1);
                                        if (f2.V[12] >= f2.V[13]) {
                                            f2.V[13] = 4;
                                            f2.V[12] = 0;
                                            if (this.a((i)this.ap, f2, f2.ar, 1) > 0) {
                                                this.a(f2, 2, 1);
                                                f2.K = (byte)(this.ap.C > f2.C ? 1 : 2);
                                                switch (f2.aa) {
                                                    case 0: {
                                                        this.ah[91] = 1;
                                                        this.a((i)f2, 0, -1);
                                                        break;
                                                    }
                                                    case 1: {
                                                        this.a((i)f2, 9, 5);
                                                        break;
                                                    }
                                                    case 2: {
                                                        this.a((i)f2, 1, -1);
                                                        break;
                                                    }
                                                    case 3: {
                                                        this.a((i)f2, 9, 6);
                                                    }
                                                }
                                                this.d(f2.B, 2);
                                            } else if (f2.T[0] == 2) {
                                                f2.ac[0] = com.cwa.gamelib.i.az;
                                                f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                                n5 = this.ap.C - f2.C;
                                                if (n5 == 0) {
                                                    n5 = this.cm.nextInt() % this.bD * 4 + this.bD * 2;
                                                }
                                                int n10 = n4 = (n6 = Math.abs(n5)) < this.bD * 2 ? -n5 * this.bD * 8 / n5 : n5 - n5 * this.bD * 4 / n6;
                                                if (n4 == 0) {
                                                    n4 = com.cwa.gamelib.b.g[Math.abs(this.cm.nextInt() % 2) + 1] * (Math.abs(this.cm.nextInt() % 32) + 16);
                                                }
                                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, n4, 1);
                                                f2.O = 0;
                                                if (com.cwa.gamelib.b.g[f2.K] * f2.Q[2] >= 0) {
                                                    this.a((i)f2, 5, -1);
                                                } else if (com.cwa.gamelib.b.g[f2.K] * f2.Q[2] < 0) {
                                                    this.a((i)f2, 10, -1);
                                                }
                                            }
                                        }
                                    }
                                    if (f2.ap != 0 || f2.O != -1 || f2.B[0] != 0) break;
                                    this.a((i)f2, 2, -1);
                                    break;
                                }
                                if (!f2.r) break;
                                if (f2.T[0] == 10) {
                                    this.a((i)f2, 11, -1);
                                    break;
                                }
                                if (f2.T[0] != 5) break;
                                this.a((i)f2, 6, -1);
                                break;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                if (f2.ap != 0 || f2.O != -1) break;
                                if (f2.aa == 2) {
                                    if (f2.aV != 2) break;
                                    f2.ab = true;
                                    f2.ah = (byte)13;
                                    this.d(f2.B, 3);
                                    break;
                                }
                                if (f2.aa == 1) {
                                    if (f2.T[0] == 9) {
                                        f2.ac[0] = com.cwa.gamelib.i.f;
                                        this.a((i)f2, 4, -1);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, -com.cwa.gamelib.b.g[f2.K] * 16, 1);
                                        f2.O = 0;
                                        f2.ap = (short)4;
                                        break;
                                    }
                                    if (f2.r && f2.T[0] == 4) {
                                        f2.ab = true;
                                        f2.ah = (byte)20;
                                        this.a((i)f2, 14, -1);
                                        break;
                                    }
                                    if (f2.T[0] != 14) break;
                                    this.d(f2.B, 3);
                                    break;
                                }
                                this.d(f2.B, 3);
                                break;
                            }
                            case 3: {
                                if (!f2.r) break;
                                this.d(f2.B, 0);
                                this.a((i)f2, 2, -1);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        this.a((i)f2, 8, -1);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (!f2.r) break;
                                this.a((i)f2, (int)f2.T[1], -1);
                                this.d(f2.B, f2.B[1]);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 17: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                f2.V[9] = 25;
                                if (f2.V[8] < f2.V[9]) {
                                    f2.V[8] = (short)(f2.V[8] + 1);
                                }
                                if (f2.ap != 0 || f2.O != -1) break;
                                if (this.a((i)this.ap, f2, f2.c, 1) > 0 && f2.C > 32 && f2.C < this.H - 32) {
                                    n6 = Math.abs(this.cm.nextInt() % 100);
                                    if (n6 <= 40) {
                                        f2.aa = 0;
                                        this.a((i)f2, 4, -1);
                                        this.d(f2.B, 2);
                                        break;
                                    }
                                    f2.ac[0] = com.cwa.gamelib.i.f;
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.C - this.ap.C < 0 ? -48 : 48, Math.abs(this.ap.A - f2.A));
                                    f2.O = 0;
                                    this.a((i)f2, 2, -1);
                                    break;
                                }
                                f2.V[12] = (short)(f2.V[12] + 1);
                                if (f2.V[12] >= f2.V[13]) {
                                    f2.V[13] = 4;
                                    f2.V[12] = 0;
                                    n6 = Math.abs(this.cm.nextInt() % 100);
                                    f2.K = (byte)(this.ap.C > f2.C ? 1 : 2);
                                    if (n6 <= 60) {
                                        this.a(f2, 2, 1);
                                        switch (f2.aa) {
                                            case 0: {
                                                f2.aa = 0;
                                                this.a((i)f2, 4, 3);
                                                this.d(f2.B, 2);
                                                break;
                                            }
                                            case 1: {
                                                f2.ah = (byte)12;
                                                this.a((i)f2, 3, -1);
                                                this.d(f2.B, 2);
                                            }
                                        }
                                        break;
                                    }
                                    if (f2.T[0] != 0) break;
                                    f2.ac[0] = com.cwa.gamelib.i.az;
                                    f2.K = (byte)(this.ap.C < f2.C ? 2 : 1);
                                    n5 = this.ap.C - f2.C;
                                    if (n5 == 0) {
                                        n5 = this.cm.nextInt() % 64 + 32;
                                    }
                                    int n11 = n4 = (n6 = Math.abs(n5)) < 32 ? -n5 * 128 / n5 : n5 - n5 * 60 / n6;
                                    if (n4 == 0) {
                                        n4 = com.cwa.gamelib.b.g[Math.abs(this.cm.nextInt() % 2) + 1] * (Math.abs(this.cm.nextInt() % 32) + 16);
                                    }
                                    com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, n4, 1);
                                    f2.O = 0;
                                    if (com.cwa.gamelib.b.g[f2.K] * f2.Q[2] >= 0) {
                                        this.a((i)f2, 1, -1);
                                        break;
                                    }
                                    if (com.cwa.gamelib.b.g[f2.K] * f2.Q[2] >= 0) break;
                                    this.a((i)f2, 2, -1);
                                    break;
                                }
                                if (f2.ap != 0 || f2.O != -1) break;
                                this.a((i)f2, 0, -1);
                                break;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                if (f2.aa == 1) {
                                    f2.ah = (byte)12;
                                    this.d(f2.B, 3);
                                    break;
                                }
                                if (f2.aa == 0) {
                                    if (f2.T[0] == 4) {
                                        f2.ac[0] = com.cwa.gamelib.i.al;
                                        this.a((i)f2, 5, -1);
                                        com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, com.cwa.gamelib.b.g[f2.K] * this.H, 1);
                                        f2.O = 0;
                                        f2.ap = (short)4;
                                        break;
                                    }
                                    if (f2.T[0] == 5) {
                                        this.a((i)f2, 6, 2);
                                        break;
                                    }
                                    if (f2.T[0] != 6) break;
                                    this.d(f2.B, 3);
                                    break;
                                }
                                this.d(f2.B, 3);
                                break;
                            }
                            case 3: {
                                if (!f2.r || f2.ap != 0 || f2.O != -1) break;
                                this.d(f2.B, 0);
                                this.a((i)f2, 0, -1);
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        this.a((i)f2, 9, -1);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r) break;
                                    f2.aA = false;
                                    this.d(f2.B, f2.B[1]);
                                    break;
                                }
                                if (!f2.r) break;
                                this.a((i)f2, (int)f2.T[1], -1);
                                this.d(f2.B, f2.B[1]);
                            }
                        }
                    }
                    f2.an[8] = true;
                    break;
                }
                case 18: {
                    if (f2.aA) {
                        switch (f2.B[0]) {
                            case 0: {
                                f2.V[9] = 10;
                                if (f2.V[8] < f2.V[9]) {
                                    f2.V[8] = (short)(f2.V[8] + 1);
                                }
                                if (f2.T[0] == 4) {
                                    this.a((i)f2, 0, -1);
                                }
                                if (f2.V[8] < f2.V[9]) break;
                                f2.V[8] = 0;
                                this.a(f2, 1, 1);
                                this.d(f2.B, 2);
                                break;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                switch (f2.aa) {
                                    case 0: {
                                        this.a((i)f2, 1, -1);
                                        this.d(f2.B, 3);
                                        break;
                                    }
                                    case 1: {
                                        this.a((i)f2, 2, -1);
                                        if (!f2.r) break;
                                        f2.ab = true;
                                        f2.ah = (byte)11;
                                        this.d(f2.B, 3);
                                        break;
                                    }
                                    case 2: {
                                        this.a((i)f2, 1, -1);
                                        if (!f2.r) break;
                                        f2.K = (byte)(f2.C < this.ap.C ? 1 : 2);
                                        f2.ah = (byte)16;
                                        com.cwa.gamelib.f.R[f2.ah][0] = 4;
                                        com.cwa.gamelib.f.R[f2.ah][4] = this.H;
                                        this.d(f2.B, 3);
                                        break;
                                    }
                                    case 3: {
                                        this.a((i)f2, 7, -1);
                                        if (!f2.r) break;
                                        f2.ab = true;
                                        f2.ah = (byte)19;
                                        com.cwa.gamelib.f.R[f2.ah][0] = 6;
                                        com.cwa.gamelib.f.R[f2.ah][4] = this.H;
                                        this.d(f2.B, 3);
                                        break;
                                    }
                                    case 4: {
                                        this.a((i)f2, 1, -1);
                                        int[] nArray = new int[]{this.bD, this.ab * 4, 1, this.bD * 5, this.ab * 3, 1, this.bD * 8, this.bD * 3, 1, this.bD * 12, this.ab * 4, 2, this.bD * 17, this.ab * 3, 2, this.bD * 22, this.ab * 4, 2};
                                        if (!f2.r) break;
                                        n2 = Math.abs(this.cm.nextInt() % 6);
                                        if (f2.t == null) {
                                            f2.w = new f[5];
                                            n = 0;
                                            for (int j = 0; j < 6; ++j) {
                                                if (j == n2 || n >= f2.w.length) continue;
                                                f2.w[n] = (f)this.a(18, nArray[j * 3], nArray[j * 3 + 1], (byte)nArray[j * 3 + 2], 0, this.j, this.H, this.j);
                                                f2.w[n].t = f2;
                                                f2.w[n].af[1] = 1;
                                                f2.w[n].af[0] = 1;
                                                f2.w[n].aA = true;
                                                f2.w[n].Z = true;
                                                this.d(f2.w[n].B, -1);
                                                this.a(f2.w[n], 0, -1);
                                                ++n;
                                            }
                                            com.cwa.gamelib.i.a(f2, nArray[n2 * 3], nArray[n2 * 3 + 1], 0);
                                            f2.K = (byte)nArray[n2 * 3 + 2];
                                            this.a((i)f2, 0, -1);
                                        }
                                        this.d(f2.B, 3);
                                    }
                                }
                                break;
                            }
                            case 3: {
                                switch (f2.aa) {
                                    case 0: {
                                        if (f2.r) {
                                            this.a((i)f2, 5, -1);
                                            f2.K = (byte)(f2.C < this.ap.C ? 1 : 2);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, f2.K == 1 ? this.H + this.bD * 4 - f2.C : -(f2.C + this.bD * 4), this.ab * 4 - f2.A);
                                            f2.O = (short)3;
                                            f2.ap = (short)(f2.C < this.ap.C ? 8 : 4);
                                            f2.ac[0] = com.cwa.gamelib.i.al;
                                        }
                                        if (f2.T[0] != 5 || f2.ap != 0 || f2.O != -1) break;
                                        f2.V[3] = 10;
                                        f2.V[2] = (short)(f2.V[2] + 1);
                                        if (f2.V[2] <= f2.V[3]) break;
                                        f2.V[2] = 0;
                                        this.a((i)f2, 4, -1);
                                        com.cwa.gamelib.i.a(f2, f2.C - com.cwa.gamelib.b.g[f2.K] * (this.bD * 5), this.ab * 4, 0);
                                        f2.K = (byte)(f2.C > this.H >> 1 ? 2 : 1);
                                        this.d(f2.B, 0);
                                        break;
                                    }
                                    case 1: {
                                        if (!f2.r) break;
                                        f2.V[3] = 15;
                                        f2.V[2] = (short)(f2.V[2] + 1);
                                        if (f2.V[2] <= f2.V[3]) break;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                        break;
                                    }
                                    case 2: {
                                        int n12;
                                        if (!f2.r) break;
                                        if (f2.T[0] == 1) {
                                            this.a((i)f2, 4, -1);
                                            break;
                                        }
                                        if (f2.T[0] == 4) {
                                            this.a((i)f2, 8, -1);
                                            break;
                                        }
                                        if (f2.T[0] != 8) break;
                                        this.a(f2, 3, 46, f2.aF[0][0] - f2.C, f2.aF[0][1] - f2.A + 15, f2.K, 19, 1, 1, -1, 0);
                                        f2.V[3] = 50;
                                        if (f2.V[2] < f2.V[3]) {
                                            f2.ab = true;
                                            if (this.ah[17] >= 0) {
                                                this.ah[17] = -1;
                                            }
                                        }
                                        if ((f2.V[2] = (short)(f2.V[2] + 1)) <= f2.V[3]) break;
                                        for (n12 = 0; n12 < f2.w.length; ++n12) {
                                            f2.w[n12].aA = false;
                                        }
                                        f2.V[2] = 0;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                        break;
                                    }
                                    case 3: {
                                        if (!f2.r) break;
                                        this.a(f2, 3, 46, f2.aF[0][0] - f2.C, f2.aF[0][1] - f2.A, f2.K, 19, 1, 1, -1, 0);
                                        f2.V[3] = 50;
                                        if (f2.V[2] < f2.V[3]) {
                                            if (this.ah[17] >= 0) {
                                                this.ah[17] = -1;
                                            }
                                            if (f2.a[19] < com.cwa.gamelib.f.R[f2.ah][6]) {
                                                com.cwa.gamelib.f.R[f2.ah][0] = Math.abs(this.cm.nextInt() % 4) + 2;
                                                f2.ab = true;
                                                f2.ah = (byte)19;
                                            }
                                        }
                                        if ((f2.V[2] = (short)(f2.V[2] + 1)) <= f2.V[3]) break;
                                        f2.V[2] = 0;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                        break;
                                    }
                                    case 4: {
                                        int n12;
                                        f2.V[3] = 25;
                                        if (f2.T[0] == 0) {
                                            f2.V[2] = (short)(f2.V[2] + 1);
                                            if (f2.V[2] <= f2.V[3]) break;
                                            this.a((i)f2, 5, -1);
                                            com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, (this.H >> 1) - f2.C, this.ab * 4 - f2.A);
                                            f2.O = (short)3;
                                            f2.ap = (short)(f2.C < this.H >> 1 ? 8 : 4);
                                            f2.ac[0] = com.cwa.gamelib.i.al;
                                            for (n12 = 0; n12 < f2.w.length; ++n12) {
                                                this.a(f2.w[n12], 5, -1);
                                                com.cwa.gamelib.f.a(((f)f2.w[n12]).Q, f2.w[n12].C, f2.w[n12].A, (this.H >> 1) - f2.w[n12].C, this.ab * 2 - f2.w[n12].A);
                                                f2.w[n12].O = 0;
                                                f2.w[n12].ap = (short)(f2.w[n12].C < this.H >> 1 ? 8 : 4);
                                                f2.w[n12].ac[0] = com.cwa.gamelib.i.al;
                                            }
                                            break;
                                        }
                                        if (f2.T[0] != 5) break;
                                        n12 = 0;
                                        for (n2 = 0; n2 < f2.w.length; ++n2) {
                                            if (f2.w[n2].ap == 0 && f2.w[n2].O == -1) {
                                                f2.w[n2].aA = false;
                                                continue;
                                            }
                                            n12 = 1;
                                        }
                                        if (f2.ap != 0 || f2.O != -1 || n12 != 0) break;
                                        this.a((i)f2, 0, -1);
                                        this.d(f2.B, 0);
                                    }
                                }
                                break;
                            }
                            case 10: {
                                if (f2.af[0] == 0) {
                                    if (f2.ad[1] == 0) {
                                        this.a((i)f2, 1, -1);
                                        f2.ad[1] = f2.ad[1] + 1;
                                        break;
                                    }
                                    if (!f2.r || this.ah[106] != 0) break;
                                    f2.aA = false;
                                    this.d(f2.B, 11);
                                    if (f2.t == null) {
                                        this.ah[7] = 0;
                                        this.ah[60] = 0;
                                    }
                                    if (this.J != 91) break;
                                    f2.aA = true;
                                    f2.an[8] = false;
                                    f2.af[0] = f2.af[1];
                                    this.a((i)f2, 5, -1);
                                    this.d(f2.B, 11);
                                    break;
                                }
                                this.d(f2.B, f2.B[1]);
                                break;
                            }
                            case 11: {
                                if (this.aT != 0 || this.ah[65] != 0 || f2.t != null) break;
                                f2.aR = 14;
                                f2.Z = true;
                                this.ah[117] = 1;
                                f2.an[2] = false;
                                f2.ap = (short)2;
                                f2.O = 1;
                                com.cwa.gamelib.i.a(f2);
                                f2.ac[1] = com.cwa.gamelib.i.aP;
                                com.cwa.gamelib.f.a(f2.Q, f2.C, f2.A, 1, -32);
                                com.cwa.gamelib.i.a(f2, this.ap.C, 213, 0);
                                this.a(f2, 0, 48, 0, 0, f2.K, 19, 1, 1, -1, 0);
                                this.a((i)f2, 0, -1);
                            }
                        }
                    }
                    f2.an[8] = true;
                }
            }
        }
        if (f2.t == null) {
            if (n8 >= 14 && n8 <= 18 && f2.af[0] == 0) {
                if (this.bO[this.ah[6] * this.aE] == 0 && this.ah[106] == 0) {
                    this.ah[23] = 7;
                    this.ah[55] = (short)(this.bO[this.ah[6] * this.aE + 5] + 1);
                }
                this.bO[this.ah[6] * this.aE] = 1;
            }
            if (f2.an[0] && f2.ad[5] == 0 || this.J == 49 && this.ah[60] == 0) {
                if (f2.aR < 14) {
                    n5 = 0;
                    n4 = 0;
                    n3 = 0;
                    if (n5 == 0) {
                        n7 = Math.abs(this.cm.nextInt() % 100);
                        for (int j = 0; j < com.cwa.gamelib.b.aq[n8].length; j += 2) {
                            switch (com.cwa.gamelib.b.aq[n8][j]) {
                                case 37: {
                                    if (this.ap.P[33] <= 0 || this.ap.P[35] <= 0 || this.ap.P[34] <= 0 || this.ap.P[37] != 0 || n7 > com.cwa.gamelib.b.aq[n8][j + 1]) break;
                                    n4 = 1;
                                    break;
                                }
                                case 33: 
                                case 34: 
                                case 35: 
                                case 36: {
                                    if (this.ap.P[com.cwa.gamelib.b.aq[n8][j]] != 0 || n7 > com.cwa.gamelib.b.aq[n8][j + 1]) break;
                                    n4 = 1;
                                    break;
                                }
                                case 2: 
                                case 3: 
                                case 4: {
                                    if (n7 > com.cwa.gamelib.b.aq[n8][j + 1]) break;
                                    n4 = 1;
                                    break;
                                }
                                case 38: 
                                case 39: 
                                case 40: {
                                    if (this.ap.P[36] <= 0 || this.ap.P[com.cwa.gamelib.b.aq[n8][j]] != 0 || n7 > com.cwa.gamelib.b.aq[n8][j + 1]) break;
                                    n4 = 1;
                                    break;
                                }
                                case 41: 
                                case 42: 
                                case 43: {
                                    if (this.ap.P[com.cwa.gamelib.b.aq[n8][j] - 3] <= 0 || this.ap.P[com.cwa.gamelib.b.aq[n8][j]] != 0 || n7 > com.cwa.gamelib.b.aq[n8][j + 1]) break;
                                    n4 = 1;
                                }
                            }
                            if (n4 == 1) {
                                f2.o = new i();
                                f2.o.aT = com.cwa.gamelib.b.aq[n8][j];
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[f2.o.aT * 2], -1);
                                com.cwa.gamelib.i.a(f2.o, f2.C, f2.A + 16, 0);
                                break;
                            }
                            n5 = 2;
                            f2.ad[5] = 1;
                        }
                    }
                    if (n5 == 2) {
                        n6 = Math.abs(this.cm.nextInt() % 6);
                        switch (n6) {
                            case 0: {
                                if (this.ap.P[15] <= 0 || this.ap.P[10] <= 0 || this.ap.P[20] != 0 || (n7 = Math.abs(this.cm.nextInt() % 100)) > 10) break;
                                f2.o = new i();
                                f2.o.aT = 20;
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[30], -1);
                                this.a(f2.o, 0, 37, 0, 0, f2.o.K, 19, 1, 1, -1, 0);
                                com.cwa.gamelib.i.a(f2.o, f2.C, f2.A + 16, 0);
                                break;
                            }
                            case 1: {
                                if (this.ap.P[11] <= 0 || this.ap.P[16] != 0 || (n7 = Math.abs(this.cm.nextInt() % 100)) > 6) break;
                                f2.o = new i();
                                f2.o.aT = 16;
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[32], -1);
                                com.cwa.gamelib.i.a(f2.o, f2.C, f2.A + 16, 0);
                                break;
                            }
                            case 2: {
                                if (this.ap.P[12] <= 0 || this.ap.P[17] != 0 || (n7 = Math.abs(this.cm.nextInt() % 100)) > 6) break;
                                f2.o = new i();
                                f2.o.aT = 17;
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[34], -1);
                                com.cwa.gamelib.i.a(f2.o, f2.C, f2.A + 16, 0);
                                break;
                            }
                            case 3: {
                                if (this.ap.P[13] <= 0 || this.ap.P[18] <= 0 || this.ap.P[23] != 0 || (n7 = Math.abs(this.cm.nextInt() % 100)) > 3) break;
                                f2.o = new i();
                                f2.o.aT = 23;
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[46], -1);
                                com.cwa.gamelib.i.a(f2.o, f2.C, f2.A + 16, 0);
                                this.a(f2.o, 0, 37, 0, 0, f2.o.K, 19, 1, 1, -1, 0);
                                break;
                            }
                            case 4: {
                                if (this.ap.P[14] <= 0 || this.ap.P[19] <= 0 || this.ap.P[24] != 0 || (n7 = Math.abs(this.cm.nextInt() % 100)) > 2) break;
                                f2.o = new i();
                                f2.o.aT = 24;
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[48], -1);
                                com.cwa.gamelib.i.a(f2.o, f2.C, f2.A + 16, 0);
                                this.a(f2.o, 0, 37, 0, 0, f2.o.K, 19, 1, 1, -1, 0);
                            }
                        }
                    }
                } else {
                    if (this.ah[106] == 0) {
                        switch (this.J) {
                            case 11: 
                            case 25: 
                            case 28: 
                            case 49: 
                            case 66: {
                                if (f2.o != null || com.cwa.gamelib.b.aq[n8][1] == 0 || this.ap.V[com.cwa.gamelib.b.aq[n8][0] - 55] != 0) break;
                                f2.o = new i();
                                f2.o.aT = com.cwa.gamelib.b.aq[n8][0];
                                f2.o.aR = 19;
                                this.a(f2.o, (int)com.cwa.gamelib.b.q[f2.o.aT * 2], -1);
                                com.cwa.gamelib.i.a(f2.o, this.ap.C, this.ap.A + 80, 0);
                                this.ah[73] = 1;
                                break;
                            }
                            case 75: 
                            case 91: {
                                if (f2.aR < 14) break;
                                this.ah[7] = 0;
                                this.ah[60] = 0;
                            }
                        }
                    }
                    if (this.ah[106] > 0) {
                        this.ah[7] = 0;
                        f2.au = new i[10];
                        n2 = 0;
                        block167: for (int j = 0; j < f2.au.length; ++j) {
                            n7 = Math.abs(this.cm.nextInt() % 100);
                            n7 += 30;
                            n7 %= 100;
                            for (n = 0; n < com.cwa.gamelib.b.n.length; ++n) {
                                if (n7 >= com.cwa.gamelib.b.n[n][1]) continue;
                                f2.au[j] = new i();
                                f2.au[j].aT = com.cwa.gamelib.b.n[n][0];
                                f2.au[j].aR = 19;
                                this.a(f2.au[j], (int)com.cwa.gamelib.b.q[com.cwa.gamelib.b.n[n][0] * 2], -1);
                                com.cwa.gamelib.i.a(f2.au[j], (this.H >> 1) - com.cwa.gamelib.b.n.length * (this.bD >> 1) + j * this.bD + this.bD, this.j >> 1, 0);
                                this.a(f2.au[j], 0, 37, 0, 0, f2.au[j].K, 19, 1, 1, -1, 0);
                                continue block167;
                            }
                        }
                        f2.ad[5] = 1;
                    }
                }
                if (f2.o != null) {
                    f2.ad[5] = 1;
                }
            }
        }
        for (int j = 0; j < f2.w.length; ++j) {
            this.a((f)f2.w[j]);
        }
    }

    private void d(f f2) {
        if (f2 == null) {
            return;
        }
        if (f2.o != null) {
            this.a(f2.o.L[0], f2.o.C, f2.o.A, f2.o.aR);
            this.Z.a(f2.o, this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
            this.i(f2.o);
            if (!this.l) {
                f2.o.i = -3;
                f2.o.u += f2.o.i;
                f2.o.ap = (short)2;
                this.h(f2.o);
            }
        }
        if (f2.au != null) {
            for (int j = 0; j < f2.au.length; ++j) {
                if (f2.au[j] == null) continue;
                this.a(f2.au[j].L[0], f2.au[j].C, f2.au[j].A, f2.au[j].aR);
                this.Z.a(f2.au[j], this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
                this.i(f2.au[j]);
                if (this.l) continue;
                f2.au[j].i = -3;
                f2.au[j].u += f2.au[j].i;
                f2.au[j].ap = (short)2;
                this.h(f2.au[j]);
            }
        }
    }

    private void c(f f2) {
        int n;
        if (f2.o != null && (n = this.a((i)this.ap, f2.o, 2, 0, false)) < 3000) {
            this.F(f2.o.aT);
            f2.o = null;
        }
        if (f2.au != null) {
            for (n = 0; n < f2.au.length; ++n) {
                int n2;
                if (f2.au[n] == null || (n2 = this.a((i)this.ap, f2.au[n], 2, 0, false)) >= 3000) continue;
                this.F(f2.au[n].aT);
                f2.au[n] = null;
            }
        }
    }

    private void o(int n) {
        int n2 = 0;
        for (int j = 0; j < this.e[this.ah[106]].length; ++j) {
            n2 = 0;
            if (this.e[this.ah[106]][j][0][0] == n) {
                int n3;
                for (n3 = 1; n3 < this.e[this.ah[106]][j].length; ++n3) {
                    if (this.e[this.ah[106]][j][n3][3] != 0) continue;
                    ++n2;
                }
                this.U = new i[n2];
                int n4 = 0;
                for (n3 = 1; n3 < this.e[this.ah[106]][j].length; ++n3) {
                    if (this.e[this.ah[106]][j][n3][3] != 0) continue;
                    this.U[n4] = new i();
                    this.U[n4].aT = this.e[this.ah[106]][j][n3][2];
                    this.U[n4].aR = 19;
                    this.a(this.U[n4], (int)com.cwa.gamelib.b.q[this.U[n4].aT * 2], -1);
                    com.cwa.gamelib.i.a(this.U[n4], this.e[this.ah[106]][j][n3][0] * this.bD + 8, this.e[this.ah[106]][j][n3][1] * this.ab + 16, 0);
                    if (com.cwa.gamelib.b.q[this.U[n4].aT * 2 + 1] >= 0) {
                        this.a(this.U[n4], 0, com.cwa.gamelib.b.q[this.U[n4].aT * 2 + 1], 0, 0, this.U[n4].K, 19, 0, 1, -1, 0);
                    }
                    ++n4;
                }
                break;
            }
            this.U = new i[0];
        }
    }

    public void o() {
        if (this.ah[6] < 0) {
            if (this.u < 4) {
                this.i();
                this.a(this.u, -1, 0);
            } else if (this.u >= 4 && this.u <= 5) {
                this.i();
            }
        } else if (this.J == 91 && this.bO[this.ah[6] * this.aE] == 0 || this.ah[106] > 0) {
            this.i();
            this.a(5, -1, 1);
        } else if (this.bO[this.ah[6] * this.aE] == 0 || this.ah[106] > 0) {
            this.i();
            this.a(4, -1, 1);
        } else {
            this.i();
        }
    }

    public void A() {
        this.M = new int[18];
        switch (this.bl[0]) {
            case 1: 
            case 2: 
            case 22: {
                this.N = 0;
                break;
            }
            case 7: {
                if (this.ah[69] == 0 && this.aT == 0 && !this.l && this.ah[8] != 1) {
                    this.l = true;
                    this.i();
                    this.w();
                    this.aZ = 0;
                    this.bf[this.aZ] = 0;
                    this.d(this.A, 1);
                    this.d(this.bM[this.aZ][this.bf[this.aZ]], 19);
                    this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.bq);
                    this.ah[5] = 5;
                }
                if (this.aT <= 0) break;
                this.a(this.bt[1][0], this.bt[1][1], this.bt[1][2]);
                break;
            }
            case 4: {
                switch (this.A[this.aZ]) {
                    case 0: {
                        this.a(this.bt[1][0], this.bt[1][1], this.bt[1][2]);
                    }
                }
                break;
            }
            default: {
                this.l = false;
            }
        }
    }

    private void a(i[] iArray) {
        for (int j = 0; j < iArray.length; ++j) {
            if (iArray[j] == null) continue;
            this.i(iArray[j]);
            this.a(iArray[j].L[0], iArray[j].C, iArray[j].A, -1);
            this.Z.a(iArray[j], this.cn, this.ak, this.ar, this.bZ, this.L, this.bT, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19], 0, 43, 240, 260);
            if (this.l) continue;
            iArray[j].i = -3;
            iArray[j].u += iArray[j].i;
            iArray[j].ap = (short)2;
            this.h(iArray[j]);
        }
    }

    private void E() {
        int n = 0;
        if (this.ah[75] == 1) {
            if (this.ah[74] > 0) {
                int n2 = 2;
                int n3 = 0;
                while (n2 < this.r[this.ah[74]].length) {
                    this.a(this.ap, 6 + n3, this.r[this.ah[74]][n2], this.r[this.ah[74]][n2 + 1], this.r[this.ah[74]][n2 + 2], 1, 20, 1, 1, this.r[this.ah[74]][0], 0);
                    n2 += 3;
                    ++n3;
                }
                this.ah[75] = 2;
            }
        } else if (this.ah[75] == 2) {
            switch (this.ah[74]) {
                case 3: {
                    if (this.ah[76] < 3) break;
                    n = 1;
                    break;
                }
                case 4: {
                    if (this.ah[77] != 1) break;
                    n = 1;
                    break;
                }
                case 5: {
                    if (this.ah[78] != 1) break;
                    n = 1;
                    break;
                }
                case 10: {
                    if (this.ah[79] != 1 || this.ah[80] != 1) break;
                    this.ah[79] = 2;
                    n = 1;
                    break;
                }
                case 11: {
                    if (this.ah[79] != 2 || this.ah[81] != 1) break;
                    n = 1;
                    break;
                }
                case 12: {
                    if (this.ah[82] != 1 || this.ah[83] != 1) break;
                    n = 1;
                    break;
                }
                case 13: {
                    if (this.ah[84] != 1 || this.ah[85] != 1) break;
                    n = 1;
                    break;
                }
                case 14: {
                    if (this.ah[86] != 1 || this.ah[87] != 1) break;
                    n = 1;
                    break;
                }
                case 15: {
                    if (this.ah[88] != 1 || this.ah[89] != 1) break;
                    n = 1;
                }
            }
            if (this.J != this.r[this.ah[74]][0]) {
                n = 1;
            }
            if (n > 0) {
                this.ah[75] = 0;
                this.ah[74] = 0;
                this.a(this.ap, 6, 0, 0, 0, 1, 20, 1, 0, -1, 0);
                this.a(this.ap, 7, 0, 0, 0, 1, 20, 1, 0, -1, 0);
            }
        } else if (this.ah[75] == 0) {
            if (this.J == 0) {
                if (this.r[1][1] == 0) {
                    this.ah[75] = 1;
                    this.ah[74] = 1;
                    this.ah[23] = 5;
                    this.aT = this.ah[74] + 33;
                    this.ah[64] = (short)this.af[this.aT][1][4];
                }
            } else if (this.J == 1) {
                if (this.r[3][1] == 0) {
                    this.ah[75] = 1;
                    this.ah[74] = 3;
                    this.ah[76] = 0;
                    this.ah[23] = 5;
                    this.aT = this.ah[74] + 33;
                    this.ah[64] = (short)this.af[this.aT][1][4];
                } else if (this.r[4][1] == 0 && this.ap.C > 240) {
                    this.ah[77] = 0;
                    this.ah[75] = 1;
                    this.ah[74] = 4;
                    this.ah[23] = 5;
                    this.aT = this.ah[74] + 33;
                    this.ah[64] = (short)this.af[this.aT][1][4];
                }
            } else if (this.J == 2) {
                if (this.r[5][1] == 0) {
                    this.ah[75] = 1;
                    this.ah[74] = 5;
                    this.ah[78] = 0;
                    this.ah[23] = 5;
                    this.aT = this.ah[74] + 33;
                    this.ah[64] = (short)this.af[this.aT][1][4];
                }
            } else if (this.J == 11) {
                if (this.r[10][1] == 0) {
                    if (this.ah[79] == 1) {
                        this.ah[75] = 1;
                        this.ah[74] = 10;
                        this.ah[80] = 0;
                    }
                } else if (this.r[11][1] == 0 && this.ah[79] == 2) {
                    this.ah[75] = 1;
                    this.ah[74] = 11;
                    this.ah[81] = 0;
                }
            } else if (this.J == 25) {
                if (this.r[13][1] == 0 && this.ah[84] == 1) {
                    this.ah[85] = 0;
                    this.ah[75] = 1;
                    this.ah[74] = 13;
                }
            } else if (this.J == 28) {
                if (this.r[12][1] == 0 && this.ah[82] == 1) {
                    this.ah[83] = 0;
                    this.ah[75] = 1;
                    this.ah[74] = 12;
                }
            } else if (this.J == 66) {
                if (this.r[14][1] == 0 && this.ah[86] == 1) {
                    this.ah[87] = 0;
                    this.ah[75] = 1;
                    this.ah[74] = 14;
                }
            } else if (this.J == 49 && this.r[15][1] == 0 && this.ah[88] == 1) {
                this.ah[87] = 0;
                this.ah[75] = 1;
                this.ah[74] = 15;
            }
            this.r[this.ah[74]][1] = 1;
        }
    }

    private void b(i[] iArray) {
        for (int j = 0; j < iArray.length; ++j) {
            int n;
            if (iArray[j] == null || (n = this.a((i)this.ap, iArray[j], 2, 0, false)) >= 3000) continue;
            block1: for (int k = 0; k < this.e[this.ah[106]].length; ++k) {
                if (this.e[this.ah[106]][k][0][0] != this.J) continue;
                for (int i2 = 1; i2 < this.e[this.ah[106]][k].length; ++i2) {
                    if (this.e[this.ah[106]][k][i2][2] != iArray[j].aT) continue;
                    this.e[this.ah[106]][k][i2][3] = 1;
                    this.F(iArray[j].aT);
                    if (iArray[j].aT >= 46 && iArray[j].aT <= 53) {
                        int n2 = (iArray[j].aT - 46) * 2;
                        this.ck[n2] = (short)(this.ck[n2] + 1);
                        this.ap.ah = (byte)(iArray[j].aT - 46);
                        this.ah[62] = 0;
                        this.ah[63] = 0;
                        this.a(this.ap, 5, 0, 0, 0, this.ap.K, 19, 1, 0, -1, 0);
                    }
                    iArray[j] = null;
                    continue block1;
                }
            }
            break;
        }
    }

    private void z(int n) {
        for (int j = 0; j < this.R[this.ah[106]].length; j += 2) {
            if (n != this.R[this.ah[106]][j + 1]) {
                if (this.R[this.ah[106]][j + 0] != 1) continue;
                this.R[this.ah[106]][j + 0] = 2;
                continue;
            }
            this.R[this.ah[106]][j + 0] = 1;
        }
    }

    private void l() {
        int n = -1;
        this.aT = 39;
        this.ah[23] = 5;
        int n2 = 0;
        for (n2 = 0; n2 < this.R[this.ah[106]].length; n2 += 2) {
            if (this.R[this.ah[106]][n2 + 0] <= 0 || this.R[this.ah[106]][n2 + 0] != 1) continue;
            n = n2 >> 1;
            this.R[this.ah[106]][n2 + 0] = 2;
        }
        if (n >= 0) {
            this.ah[64] = (short)n;
        } else {
            this.ah[64] = (short)Math.abs(this.cm.nextInt() % com.cwa.gamelib.b.h[1][7 + this.ah[106]].length);
            while (this.R[this.ah[106]][this.ah[64] * 2] <= 0) {
                this.ah[64] = (short)Math.abs(this.cm.nextInt() % com.cwa.gamelib.b.h[1][7 + this.ah[106]].length);
                n2 += 2;
            }
        }
    }

    private void F(int n) {
        this.a(this.ap, 2, 71, 0, 5, this.ap.K, 19, 1, 1, -1, 0);
        switch (n) {
            case 44: {
                this.ap.af[1] = this.ap.af[1] + 20;
                this.ap.af[0] = this.ap.af[1];
                if (this.bh[n] == 0) {
                    this.ap.P[n] = 1;
                    this.ah[23] = 5;
                    this.aT = 7;
                }
                this.ah[64] = (short)n;
                this.bh[n] = 1;
                break;
            }
            case 45: {
                this.ap.m[1] = this.ap.m[1] + 15;
                this.ap.m[0] = this.ap.m[1];
                if (this.bh[n] == 0) {
                    this.ap.P[n] = 1;
                    this.ah[23] = 5;
                    this.aT = 7;
                }
                this.ah[64] = (short)n;
                this.bh[n] = 1;
                break;
            }
            case 0: {
                if (this.bh[n] == 0) {
                    this.ap.P[n] = 1;
                    this.ah[23] = 5;
                    this.aT = 7;
                }
                this.ah[64] = (short)n;
                if (this.ap.P[n] < 99) {
                    int n2 = n;
                    this.ap.P[n2] = (short)(this.ap.P[n2] + 1);
                }
                this.bh[n] = 1;
                break;
            }
            case 56: 
            case 57: 
            case 58: 
            case 59: 
            case 60: {
                this.ap.V[n - 55] = 1;
                if (this.ap.s[n - 55] == 0) {
                    this.ap.s[n - 55] = 1;
                }
                this.ah[64] = (short)n;
                this.ah[7] = 0;
                this.ah[60] = 0;
                this.ah[73] = 0;
                this.bh[n] = 1;
                break;
            }
            default: {
                if (n < 0) break;
                if (this.bh[n] == 0) {
                    this.ah[23] = 5;
                    this.aT = 7;
                }
                this.ah[64] = (short)n;
                if (n != 20 && n != 23 && n != 24 && n != 21 && n != 22 && n != 30 && n != 32 && n != 28 && this.ap.P[n] < 99) {
                    int n3 = n;
                    this.ap.P[n3] = (short)(this.ap.P[n3] + 1);
                }
                if (n == 10) {
                    this.ap.P[62] = 1;
                    this.bh[62] = 1;
                }
                if (n == 53) {
                    this.ck[14] = 1;
                }
                this.bh[n] = 1;
            }
        }
    }

    private int a(f f2, int n, int n2) {
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = f2.aR & 0xFFFFFF7F;
        int[][][] nArrayArray = new int[][][]{new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[0][], new int[][]{{0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}}, new int[0][], new int[][]{{0, 2, 3}, {0, 2, 1, 3, 0}}, new int[][]{{0, 1}, {0, 1}}, new int[][]{{1, 3, 1, 0}, {3, 4, 2, 0}}};
        if (n == 0 || n2 == 0) {
            return -1;
        }
        do {
            n3 = Math.abs(this.cm.nextInt());
            switch (n6) {
                case 14: {
                    n5 = f2.af[0] <= f2.af[1] * 10 / 100 ? 1 : 0;
                    if ((n3 %= 100) <= 20) {
                        f2.ak = 0;
                    } else if (n3 <= 40) {
                        f2.ak = 1;
                    } else if (n3 <= 60) {
                        f2.ak = 2;
                    } else if (n3 <= 80) {
                        f2.ak = 3;
                    } else if (n3 <= 100) {
                        f2.ak = 4;
                    }
                    if (f2.aa == nArrayArray[n6][n5][f2.ak]) {
                        ++f2.l;
                        break;
                    }
                    f2.l = 0;
                    f2.aa = nArrayArray[n6][n5][f2.ak];
                    break;
                }
                case 15: {
                    if ((n3 %= 100) < 33) {
                        if (f2.aa == 0) {
                            if (f2.l <= n) {
                                ++f2.l;
                            }
                        } else {
                            f2.l = 0;
                        }
                        if (f2.l > n) break;
                        f2.aa = 0;
                        return 0;
                    }
                    if (n3 < 66 && f2.C >= f2.av[0] && f2.C <= f2.av[0] + f2.av[2]) {
                        if (f2.aa == 1) {
                            if (f2.l <= n) {
                                ++f2.l;
                            }
                        } else {
                            f2.l = 0;
                        }
                        if (f2.l > n) break;
                        f2.aa = 1;
                        return 1;
                    }
                    if (n3 >= 100) break;
                    if (f2.aa == 2) {
                        if (f2.l <= n) {
                            ++f2.l;
                        }
                    } else {
                        f2.l = 0;
                    }
                    if (f2.l > n) break;
                    f2.aa = 2;
                    return 2;
                }
                case 16: {
                    n5 = f2.af[0] <= f2.af[1] * 20 / 100 ? 1 : 0;
                    if (f2.ak >= nArrayArray[n6][n5].length) {
                        f2.ak = 0;
                    }
                    if (f2.ad[8] > 0 && n5 == 1) {
                        f2.aa = 1;
                        f2.ad[8] = f2.ad[8] - 1;
                        break;
                    }
                    if (this.ap.B[0] == 4) {
                        f2.aa = 0;
                        break;
                    }
                    f2.aa = nArrayArray[n6][n5][f2.ak];
                    ++f2.ak;
                    if (this.ah[100] < 5) break;
                    n3 = Math.abs(this.cm.nextInt()) % 100;
                    if (n3 < 100) {
                        f2.aa = 0;
                    }
                    this.ah[100] = 0;
                    break;
                }
                case 17: {
                    n5 = f2.af[0] <= f2.af[1] * 20 / 100 ? 1 : 0;
                    if (f2.ad[8] > 0 && n5 == 1) {
                        f2.aa = 0;
                        f2.ad[8] = f2.ad[8] - 1;
                        break;
                    }
                    f2.l = f2.aa == nArrayArray[n6][n5][f2.ak] ? ++f2.l : 0;
                    f2.aa = nArrayArray[n6][n5][f2.ak];
                    f2.ak = Math.abs(this.cm.nextInt() % nArrayArray[n6][n5].length);
                    if (this.ah[100] >= 5) {
                        n3 = Math.abs(this.cm.nextInt()) % 100;
                        if (n3 < 100) {
                            f2.aa = 0;
                        }
                        this.ah[100] = 0;
                    }
                    if (f2.ak < nArrayArray[n6][n5].length) break;
                    f2.ak = 0;
                    break;
                }
                case 18: {
                    n5 = f2.af[0] <= f2.af[1] * 30 / 100 ? 1 : 0;
                    if (f2.ak >= nArrayArray[18][n5].length) {
                        f2.ak = 0;
                    }
                    f2.aa = nArrayArray[18][n5][f2.ak];
                    ++f2.ak;
                    if (this.ah[100] < 5) break;
                    n3 = Math.abs(this.cm.nextInt()) % 100;
                    if (n3 < 50) {
                        f2.aa = 0;
                    }
                    this.ah[100] = 0;
                }
            }
        } while (f2.l > n);
        return -1;
    }

    private void b(i i2, int n, int n2) {
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        boolean bl = false;
        if (i2.j == null) {
            return;
        }
        for (int j = 0; j < i2.j.length; ++j) {
            if (i2.j[j] == null) continue;
            for (int k = 0; k < i2.j[j].length; ++k) {
                int[] nArray;
                block36: {
                    int n6;
                    int n7;
                    short s;
                    block35: {
                        int n8;
                        int n9;
                        int n10;
                        nArray = i2.j[j][k];
                        if (nArray[0] != 1) continue;
                        n3 = nArray[5];
                        s = this.bZ[nArray[11]][nArray[7]][nArray[6]][1];
                        if (i2.aR < 5) break block35;
                        if (this.ap.B[0] != 0 || this.ap.aB[0] < this.ap.aB[1] || i2.af[0] <= 0 || !((f)i2).an[2] || !i2.aA) break block36;
                        if (j < 11 && this.a(n10 = this.ap.aF[0][0], n9 = this.ap.aF[0][1], n7 = this.bT[n6 = this.ap.aR & 0xFFFFFF7F][this.ap.aH][2] - this.bT[n6][this.ap.aH][0], n8 = this.bT[n6][this.ap.aH][3] - this.bT[n6][this.ap.aH][1], nArray[3] + this.bT[nArray[11]][s][0], nArray[4] - this.bT[nArray[11]][s][1], this.bT[nArray[11]][s][2] - this.bT[nArray[11]][s][0], this.bT[nArray[11]][s][3] - this.bT[nArray[11]][s][1], 4) < 3000) {
                            nArray[11] = 19;
                            nArray[6] = 0;
                            nArray[7] = 41;
                        }
                        if ((nArray[7] == 41 || nArray[11] == 19) && i2.aR < 14 && i2.aR != 13 || this.a(this.ap, nArray[3] + this.bT[nArray[11]][s][0], nArray[4] - this.bT[nArray[11]][s][1], this.bT[nArray[11]][s][2] - this.bT[nArray[11]][s][0], this.bT[nArray[11]][s][3] - this.bT[nArray[11]][s][1], com.cwa.gamelib.b.aN[this.ah[106]][j], 1) != 1000) break block36;
                        nArray[0] = 0;
                        int n11 = j;
                        i2.a[n11] = (byte)(i2.a[n11] - 1);
                        switch (this.ap.aR) {
                            case 1: 
                            case 3: {
                                this.ap.aR = 1;
                                if (j != 20 && j != 13) {
                                    if (this.ap.T[0] < this.bF[0][0] || this.ap.T[0] > this.bF[2][7] + 2) {
                                        this.ap.E = true;
                                        this.ap.aI[0] = nArray[5];
                                        this.ap.aI[1] = 0;
                                        this.a(this.ap);
                                        break;
                                    }
                                    this.ap.E = true;
                                    this.ap.ap = (short)(this.ap.ap & 3);
                                    this.a(this.ap);
                                    break;
                                }
                                this.d(this.ap.B, 4);
                                this.a(this.ap, 4, 12, 0, 0, this.ap.K, 16, 1, 1, -1, 0);
                                this.a(this.ap, 8, 12, 0, this.ap.aK[0] + 20, 1, 20, 1, 1, -1, 0);
                                break;
                            }
                            case 2: {
                                if (this.ap.af[0] != 0) break;
                                this.ap.aR = 1;
                                this.a((i)this.ap, 10, -1);
                            }
                        }
                        break block36;
                    }
                    for (n6 = 0; n6 < this.i.length; ++n6) {
                        n7 = this.i[n6].aR & 0xFFFFFF7F;
                        if (this.a(this.i[n6], nArray[3] + this.bT[nArray[11]][s][0], nArray[4] - this.bT[nArray[11]][s][1], this.bT[nArray[11]][s][2] - this.bT[nArray[11]][s][0], this.bT[nArray[11]][s][3] - this.bT[nArray[11]][s][1], com.cwa.gamelib.b.x[0][1] + com.cwa.gamelib.b.bC[i2.ah] + this.ah[12], 2) != 1000) continue;
                        nArray[0] = 0;
                        int n12 = j;
                        i2.a[n12] = (byte)(i2.a[n12] - 1);
                        if (n7 >= 5 && n7 <= 13) {
                            this.d(this.i[n6].B, 10);
                        } else if (n7 >= 14 && n7 <= 18) {
                            if (this.i[n6].af[0] == 0) {
                                this.d(this.i[n6].B, 10);
                                this.bO[this.ah[6] * this.aE] = 1;
                            } else {
                                switch (n7) {
                                    case 16: {
                                        if (this.i[n6].af[0] <= this.i[n6].af[1] * com.cwa.gamelib.b.aX[this.i[n6].aR - 14] / 100) {
                                            this.i[n6].ad[8] = 1;
                                        }
                                        if (this.i[n6].aa != -1) break;
                                        this.a((i)this.i[n6], 3, -1);
                                        this.d(this.i[n6].B, 10);
                                        break;
                                    }
                                    case 17: {
                                        if (this.i[n6].aa != -1) break;
                                        this.a((i)this.i[n6], 8, -1);
                                        this.d(this.i[n6].B, 10);
                                    }
                                }
                            }
                        }
                        if (n7 == 15) {
                            this.a(this.i[n6], 0, 8, 32, 25, this.ap.K, 15, 1, 1, -1, 0);
                        }
                        this.a(this.i[n6], 1, 43, this.i[n6].C + this.L[n7][this.i[n6].aH][0] * com.cwa.gamelib.b.g[this.i[n6].K] + (this.L[n7][this.i[n6].aH][2] - this.L[n7][this.i[n6].aH][0] >> 1) * com.cwa.gamelib.b.g[this.i[n6].K], nArray[4], this.ap.K, 19, 1, 1, -1, 1);
                        this.i[n6].ad[0] = this.ap.K;
                        this.i[n6].ad[1] = 0;
                    }
                }
                if (nArray[0] > 0) {
                    if (com.cwa.gamelib.c.K(nArray[3] - nArray[1]) + com.cwa.gamelib.c.K(nArray[4] - nArray[2]) > com.cwa.gamelib.c.K(com.cwa.gamelib.i.R[j][4])) {
                        nArray[0] = 0;
                        int n13 = j;
                        i2.a[n13] = (byte)(i2.a[n13] - 1);
                    }
                }
                switch (j) {
                    case 0: {
                        bl = true;
                        nArray[3] = nArray[3] + com.cwa.gamelib.i.R[j][1] * com.cwa.gamelib.b.g[n3];
                        nArray[4] = nArray[4] + com.cwa.gamelib.i.R[j][2] * com.cwa.gamelib.b.g[n3];
                        break;
                    }
                    case 1: {
                        bl = false;
                        nArray[3] = nArray[3] + com.cwa.gamelib.i.R[j][1] * com.cwa.gamelib.b.g[n3];
                        nArray[4] = nArray[4] + com.cwa.gamelib.i.R[j][2] * com.cwa.gamelib.b.g[n3];
                        break;
                    }
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 17: 
                    case 19: {
                        bl = true;
                        nArray[3] = nArray[3] + com.cwa.gamelib.i.R[j][1] * com.cwa.gamelib.b.g[n3];
                        nArray[4] = nArray[4] + com.cwa.gamelib.i.R[j][2] * com.cwa.gamelib.b.g[n3];
                        break;
                    }
                    case 16: 
                    case 20: {
                        bl = true;
                    }
                    case 18: {
                        n4 = i2.j[j][k][9];
                        nArray[3] = nArray[3] + (com.cwa.gamelib.i.R[j][1] * com.cwa.gamelib.b.bQ[n4][0] >> 16);
                        nArray[4] = nArray[4] + (com.cwa.gamelib.i.R[j][2] * com.cwa.gamelib.b.bQ[n4][1] >> 16);
                    }
                }
                if (!bl || nArray[0] != 1) continue;
                n5 = this.bZ[nArray[11]][nArray[7]].length - 2;
                if (nArray[8] < this.bZ[nArray[11]][nArray[7]][nArray[6]][0] - 1) {
                    nArray[8] = nArray[8] + 1;
                    continue;
                }
                nArray[8] = 0;
                if (nArray[6] < n5) {
                    nArray[6] = nArray[6] + 1;
                    continue;
                }
                if (this.bZ[nArray[11]][nArray[7]][n5 + 1][0] == 0) {
                    nArray[6] = 0;
                    continue;
                }
                nArray[10] = nArray[10] + 1;
                if (nArray[10] < this.bZ[nArray[11]][nArray[7]][n5 + 1][0]) {
                    nArray[6] = 0;
                    continue;
                }
                nArray[0] = 0;
                int n14 = j;
                i2.a[n14] = (byte)(i2.a[n14] - 1);
            }
        }
    }

    private void e(i i2, int n, int n2) {
        boolean bl = false;
        if (i2.j == null) {
            return;
        }
        for (int j = 0; j < i2.j.length; ++j) {
            if (i2.j[j] == null) continue;
            for (int k = 0; k < i2.j[j].length; ++k) {
                int[] nArray = i2.j[j][k];
                if (nArray[0] != 1) continue;
                int n3 = 0xFF0000;
                this.Z.a(nArray[11], nArray[7], nArray[6], nArray[5], nArray[3], nArray[4], this.cn[nArray[11]], this.ak, this.ar, this.bZ, this.L, this.aH[0] + this.ah[18], this.aH[1] + this.ah[19]);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(i i2) {
        block27: {
            short[] sArray;
            block29: {
                byte by;
                int[][][] nArrayArray;
                int n;
                int n2;
                block30: {
                    block28: {
                        d d2 = null;
                        f f2 = null;
                        sArray = null;
                        n2 = i2.aR & 0xFFFFFF7F;
                        if ((i2.aR & 0xFFFFFF7F) >= 5 && (i2.aR & 0xFFFFFF7F) <= 18) {
                            f2 = (f)i2;
                            sArray = f2.V;
                        }
                        if (i2.aR >= 0 && i2.aR <= 4) {
                            d2 = (d)i2;
                            sArray = d2.aB;
                        }
                        if (d2 == null && f2 == null) {
                            return;
                        }
                        n = 0;
                        nArrayArray = new int[][][]{new int[][]{new int[0], {20, 21, 22}, {14, 15, 16}}, new int[][]{new int[0], {0, 1, 23, 2, 22}, {12, 11, 13, 10, 14}}, new int[][]{{0, 2, 4, 6, 8, 10, 12}}};
                        if (!i2.ab) break block27;
                        by = i2.ah;
                        if (n2 == 1) {
                            if (this.ah[15] > 0) {
                                by = 0;
                            }
                            if (this.ah[16] > 0) {
                                by = 1;
                            }
                        }
                        if (by < 0) {
                            return;
                        }
                        if (sArray[4] != 0) break block28;
                        if (i2.a[by] >= com.cwa.gamelib.i.R[by][6]) break block28;
                        if (i2.j[by] == null) break block29;
                        if (i2.a[by] % com.cwa.gamelib.i.R[by][0] != 0) break block29;
                        break block30;
                    }
                    sArray[4] = (short)(sArray[4] + 1);
                    break block29;
                }
                block11: for (int j = 0; j < i2.j[by].length; ++j) {
                    int[] nArray = i2.j[by][j];
                    if (nArray[0] != 0) continue;
                    if (n >= com.cwa.gamelib.i.R[by][0]) continue;
                    ++n;
                    byte by2 = by;
                    i2.a[by2] = (byte)(i2.a[by2] + 1);
                    nArray[0] = 1;
                    nArray[1] = i2.aF[0][0];
                    nArray[2] = i2.aF[0][1];
                    nArray[3] = nArray[1];
                    nArray[4] = nArray[2];
                    nArray[5] = i2.K;
                    nArray[6] = 0;
                    nArray[10] = 10;
                    switch (by) {
                        case 0: {
                            nArray[1] = i2.C + com.cwa.gamelib.b.g[i2.K] * 16;
                            nArray[2] = i2.A + 25;
                            nArray[3] = nArray[1];
                            nArray[4] = nArray[2];
                            nArray[11] = 19;
                            nArray[7] = 67;
                            nArray[9] = -1;
                            continue block11;
                        }
                        case 1: {
                            nArray[1] = i2.C + com.cwa.gamelib.b.g[i2.K] * 16;
                            nArray[2] = i2.A + 25;
                            nArray[3] = nArray[1];
                            nArray[4] = nArray[2];
                            nArray[11] = 19;
                            nArray[7] = 68 + (this.ah[16] - 10) / 5;
                            nArray[9] = -1;
                            continue block11;
                        }
                        case 11: {
                            nArray[11] = 18;
                            nArray[7] = 3;
                            nArray[9] = -1;
                            continue block11;
                        }
                        case 18: {
                            nArray[11] = 15;
                            nArray[7] = 10;
                            nArray[9] = nArrayArray[0][i2.K][j];
                            continue block11;
                        }
                        case 10: 
                        case 12: 
                        case 13: {
                            nArray[11] = n2;
                            if (n2 == 10) {
                                nArray[7] = 3;
                            } else if (n2 == 11) {
                                nArray[7] = 2;
                            } else if (n2 == 16) {
                                nArray[7] = 7;
                            } else if (n2 == 17) {
                                nArray[7] = 7;
                            }
                            nArray[9] = -1;
                            continue block11;
                        }
                        case 17: {
                            nArray[11] = 19;
                            nArray[7] = 47;
                            nArray[9] = -1;
                            continue block11;
                        }
                        case 19: {
                            int[] nArray2 = new int[]{35, 25, 15, 0, -10, -15, -25, -35, 40};
                            nArray[11] = 19;
                            nArray[7] = 47;
                            nArray[9] = -1;
                            nArray[2] = nArray[2] + nArray2[Math.abs(this.cm.nextInt() % 9)];
                            nArray[4] = nArray[2];
                            continue block11;
                        }
                        case 20: {
                            nArray[11] = 16;
                            nArray[7] = 7;
                            nArray[9] = 0 + j * 2;
                            continue block11;
                        }
                        case 16: {
                            nArray[11] = 18;
                            nArray[7] = 5;
                            nArray[2] = nArray[2] + this.cm.nextInt() % 15;
                            nArray[4] = nArray[2];
                            nArray[9] = nArrayArray[1][i2.K][Math.abs(this.cm.nextInt()) % 5];
                            continue block11;
                        }
                        default: {
                            nArray[9] = -1;
                        }
                    }
                }
            }
            if (sArray[4] > sArray[5]) {
                sArray[4] = 0;
            }
            i2.ab = false;
        }
    }

    private void a(i i2) {
        i2.aF[1][0] = i2.aF[0][0];
        i2.aF[1][1] = i2.aF[0][1];
        short s = this.bT[i2.aR & 0xFFFFFF7F][i2.aH][0];
        short s2 = this.bT[i2.aR & 0xFFFFFF7F][i2.aH][1];
        short s3 = this.bZ[i2.aR & 0xFFFFFF7F][i2.T[0]][i2.aV][1];
        switch (i2.K) {
            case 1: {
                i2.aF[0][0] = i2.C + s;
                i2.aF[0][1] = i2.A - s2;
                break;
            }
            case 2: {
                i2.aF[0][0] = i2.C - this.bT[i2.aR & 0xFFFFFF7F][i2.aH][2];
                i2.aF[0][1] = i2.A - s2;
            }
        }
    }

    private byte a(i i2, f f2, int[] nArray, int n) {
        byte by = 0;
        switch (n) {
            case 0: {
                if (f2.K == 1) {
                    if (i2.C >= f2.C + nArray[3] || i2.C <= f2.C) break;
                    by = 1;
                    break;
                }
                if (f2.K != 2 || i2.C <= f2.C - nArray[0] || i2.C >= f2.C) break;
                by = 1;
                break;
            }
            case 1: {
                if (i2.C >= f2.C + nArray[0] + nArray[2] || i2.C <= f2.C + nArray[0]) break;
                by = 1;
                break;
            }
            case 2: {
                if (i2.C >= f2.C + nArray[0] + nArray[2] || i2.C <= f2.C + nArray[0] || i2.A <= f2.A + nArray[1] - nArray[3] || i2.A >= f2.A + nArray[1]) break;
                by = 1;
            }
        }
        return by;
    }

    public void s() {
        if (this.cl[0] >= this.cl[1]) {
            this.d();
        }
    }

    public void y() {
        switch (this.bl[0]) {
            case 1: {
                break;
            }
            case 21: {
                this.w(this.ca);
                break;
            }
            case 4: {
                if (this.bG == 0) {
                    this.h();
                    switch (this.A[0]) {
                        case 0: {
                            this.m(this.ca);
                            break;
                        }
                        case 17: {
                            this.s(this.ca);
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 14: {
                            this.A(this.ca);
                            break;
                        }
                        case 15: {
                            this.q(this.ca);
                            break;
                        }
                        case 16: {
                            this.j(this.ca);
                            break;
                        }
                        case 2: {
                            this.L(this.ca);
                            break;
                        }
                        case 3: {
                            this.k(this.ca);
                            break;
                        }
                        case 4: {
                            this.v(this.ca);
                            break;
                        }
                        case 19: {
                            this.r(this.ca);
                            break;
                        }
                        case 18: {
                            this.h(this.ca);
                            break;
                        }
                        case 20: {
                            this.a(this.ca);
                            break;
                        }
                        case 21: {
                            this.u(this.ca);
                            break;
                        }
                        case 22: {
                            this.i(this.ca);
                        }
                    }
                }
                if (++this.bG < 4) break;
                this.bG = 0;
                break;
            }
            case 7: {
                if (this.ah[23] == 4 || this.ah[23] == 0 && this.ap.af[0] > 0) {
                    this.E(this.ca);
                } else if (this.ah[104] >= this.ah[105]) {
                    this.G(this.ca);
                }
                if (this.ap.af[0] <= 0 || this.ah[5] != 0 || this.aT != 0 || this.aS != 0 || this.ah[73] != 0 || this.ah[23] != 0 && this.ah[23] != 4 || this.ah[116] == 1 || this.ah[116] == 3 || this.ah[117] != 0) break;
                this.J(this.ca);
                break;
            }
            case 16: {
                if (!this.bd || this.l(48) != 1) break;
                if (this.ah[95] == 2) {
                    if (this.cj.r) {
                        this.i();
                        this.a(8, -1, 1);
                        this.t(this.ca);
                        this.c(23);
                        this.d(this.bl, 4);
                        this.d(this.A, 0);
                        this.d(this.bM[this.aZ][this.bf[this.aZ]], 0);
                        this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.be);
                    }
                } else if (this.ah[95] == 0) {
                    this.ah[91] = 0;
                    this.ah[95] = 1;
                    this.a(this.cj, 1, -1);
                    this.i();
                }
                this.a(48, 0);
            }
        }
    }

    public void h() {
        byte[] byArray = null;
        int n = 0;
        switch (this.A[0]) {
            case 0: {
                byArray = this.be;
                break;
            }
            case 17: {
                byArray = this.v;
                if (this.c == -1) break;
                n = -1;
                break;
            }
            case 14: {
                switch (this.m[this.aZ]) {
                    case 12: {
                        byArray = this.B;
                        n = 1;
                        break;
                    }
                    case 13: {
                        byArray = this.C[this.ah[106]];
                        n = 1;
                        break;
                    }
                    case 15: {
                        byArray = this.bK;
                        n = 1;
                        break;
                    }
                    case 14: {
                        byArray = this.bP;
                        n = 1;
                    }
                }
                break;
            }
            case 1: {
                byArray = this.bq;
                break;
            }
            case 15: {
                if (this.bU[this.aZ] == 20) {
                    switch (this.bf[this.aZ]) {
                        case 0: {
                            byArray = this.B;
                            break;
                        }
                        case 1: {
                            byArray = this.as;
                            break;
                        }
                        case 2: {
                            if (this.ag != -1) break;
                            byArray = this.aA;
                            break;
                        }
                        case 3: {
                            byArray = this.bP;
                        }
                    }
                } else if (this.bU[this.aZ] == 21) {
                    byArray = this.z;
                } else if (this.bU[this.aZ] == 24) {
                    byArray = this.bv;
                }
                n = 1;
                break;
            }
            case 18: {
                byArray = this.ba;
            }
        }
        if (n == 0) {
            this.a(byArray, this.ca);
        } else if (n == 1) {
            this.b(byArray, this.ca);
        }
    }

    public void a(byte[] byArray, int n) {
        if (byArray != null) {
            switch (n) {
                case -3: 
                case -1: 
                case 50: 
                case 52: {
                    if (this.bM[this.aZ][this.bf[this.aZ]][2] > 0) {
                        byte[] byArray2 = this.bM[this.aZ][this.bf[this.aZ]];
                        byArray2[2] = (byte)(byArray2[2] - 1);
                        break;
                    }
                    this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)(byArray.length - 1);
                    break;
                }
                case -4: 
                case -2: 
                case 54: 
                case 56: {
                    if (this.bM[this.aZ][this.bf[this.aZ]][2] < byArray.length - 1) {
                        byte[] byArray3 = this.bM[this.aZ][this.bf[this.aZ]];
                        byArray3[2] = (byte)(byArray3[2] + 1);
                        break;
                    }
                    this.bM[this.aZ][this.bf[this.aZ]][2] = 0;
                }
            }
        }
        this.bM[this.aZ][this.bf[this.aZ]][1] = this.bM[this.aZ][this.bf[this.aZ]][0];
        if (byArray != null) {
            this.bM[this.aZ][this.bf[this.aZ]][0] = byArray[this.bM[this.aZ][this.bf[this.aZ]][2]];
        }
    }

    public void b(byte[] byArray, int n) {
        if (byArray != null) {
            switch (n) {
                case -1: 
                case 50: {
                    if (this.A[0] == 15 && this.bf[this.aZ] == 2 && this.ag == 0) break;
                    if (this.ah[0] > 0) {
                        this.ah[0] = (short)(this.ah[0] - 1);
                    }
                    this.bX[this.aZ][this.bf[this.aZ]] = this.ah[0];
                    if (this.bM[this.aZ][this.bf[this.aZ]][2] > 0) {
                        byte[] byArray2 = this.bM[this.aZ][this.bf[this.aZ]];
                        byArray2[2] = (byte)(byArray2[2] - 1);
                    } else {
                        this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)(byArray.length - 1);
                    }
                    this.d(this.bM[this.aZ][this.bf[this.aZ]], byArray[this.bM[this.aZ][this.bf[this.aZ]][2]]);
                    break;
                }
                case -2: 
                case 56: {
                    if (this.A[0] == 15 && this.bf[this.aZ] == 2 && this.ag == 0) break;
                    if (this.ah[0] < this.ah[1] - 1) {
                        this.ah[0] = (short)(this.ah[0] + 1);
                    }
                    this.bX[this.aZ][this.bf[this.aZ]] = this.ah[0];
                    if (this.bM[this.aZ][this.bf[this.aZ]][2] < byArray.length - 1) {
                        byte[] byArray3 = this.bM[this.aZ][this.bf[this.aZ]];
                        byArray3[2] = (byte)(byArray3[2] + 1);
                    } else {
                        this.bM[this.aZ][this.bf[this.aZ]][2] = 0;
                    }
                    this.d(this.bM[this.aZ][this.bf[this.aZ]], byArray[this.bM[this.aZ][this.bf[this.aZ]][2]]);
                }
            }
        }
        this.bM[this.aZ][this.bf[this.aZ]][1] = this.bM[this.aZ][this.bf[this.aZ]][0];
        if (byArray != null) {
            this.bM[this.aZ][this.bf[this.aZ]][0] = byArray[this.bM[this.aZ][this.bf[this.aZ]][2]];
        }
    }

    protected int a(int n, byte[] byArray) {
        int n2 = 0;
        for (n2 = 0; n2 < byArray.length; ++n2) {
            if (byArray[n2] != n) continue;
            return n2;
        }
        return -1;
    }

    public void E(int n) {
        if (this.ah[69] == 0) {
            switch (n) {
                case 48: {
                    if (this.l(48) == 1) {
                        this.bM[this.aZ][this.bf[this.aZ]][2] = 0;
                        this.a(0, (byte)4, (byte)18);
                    }
                    this.a(48, 0);
                    break;
                }
                case 49: 
                case 51: {
                    if (this.l(49) == 1 || this.l(51) == 1) {
                        if (!this.l) {
                            this.i();
                            this.ah[78] = 1;
                            this.l = true;
                            this.ah[5] = 3;
                            this.ah[4] = 0;
                            this.ah[20] = (short)(this.aH[0] / 240 + this.bm[this.J * 3 + 1]);
                            this.ah[21] = (short)(this.aH[1] / 320 + this.bm[this.J * 3 + 2]);
                        } else if (this.ah[5] == 3) {
                            this.ah[5] = 4;
                            this.l = false;
                            this.o();
                        }
                    }
                    this.a(49, 0);
                    this.a(51, 0);
                    break;
                }
                case 57: {
                    if (this.l(57) != 1) break;
                    if (!(this.ap.aR != 2 && this.ap.aR != 1 || this.ap.T[0] >= 7 && this.ap.T[0] <= 10)) {
                        if (this.ap.V[1] > 0) {
                            this.ah[89] = 1;
                            this.ap.aR = 3;
                            com.cwa.gamelib.i.a(this.ap, (byte)1);
                            this.a((i)this.ap, 1, true);
                            this.a((i)this.ap, 2, true);
                            this.a((i)this.ap, this.ap.K == 2 ? 4 : 8, true);
                            this.a(this.ap, 3, 4, 0, 0, this.ap.K, 18, 1, 1, -1, 0);
                        }
                    } else if (this.ap.aR == 3) {
                        this.ap.aR = 1;
                        com.cwa.gamelib.i.a(this.ap, (byte)3);
                        if (this.a((i)this.ap, 1, false) != 3000) {
                            com.cwa.gamelib.i.a(this.ap, (byte)6);
                        }
                        this.a((i)this.ap, 2, true);
                        this.a((i)this.ap, this.ap.K == 2 ? 4 : 8, true);
                        this.a(this.ap, 3, 4, 0, 0, this.ap.K, 18, 1, 1, -1, 0);
                    }
                    this.a(57, 0);
                    break;
                }
                case 55: {
                    if (this.l(55) != 1) break;
                    if (this.ap.aR == 3 || this.ap.aR == 1 && (this.ap.T[0] < 7 || this.ap.T[0] > 10)) {
                        if (this.ap.V[5] > 0) {
                            if (this.ah[84] == 1) {
                                this.ah[85] = 1;
                            }
                            this.ap.aR = 2;
                            com.cwa.gamelib.i.a(this.ap, (byte)0);
                            com.cwa.gamelib.i.a(this.ap, this.ap.C, this.ap.A + (this.ap.aK[0] >> 1), 0);
                            this.a((i)this.ap, 1, true);
                            this.a((i)this.ap, 2, true);
                            this.a((i)this.ap, this.ap.K == 2 ? 4 : 8, true);
                            this.a(this.ap, 3, 4, 0, 0, this.ap.K, 18, 1, 1, -1, 0);
                        }
                    } else if (this.ap.aR == 2) {
                        this.ap.aR = 1;
                        com.cwa.gamelib.i.a(this.ap, (byte)3);
                        if (this.a((i)this.ap, 1, false) != 3000) {
                            com.cwa.gamelib.i.a(this.ap, (byte)6);
                        }
                        this.a((i)this.ap, 2, true);
                        this.a((i)this.ap, this.ap.K == 2 ? 4 : 8, true);
                        this.a(this.ap, 3, 4, 0, 0, this.ap.K, 18, 1, 1, -1, 0);
                    }
                    this.a(55, 0);
                    break;
                }
                case -1: 
                case 50: {
                    if (!this.l || this.l(50) != 1 && this.l(-1) != 1) break;
                    switch (this.ah[5]) {
                        case 3: {
                            if (this.ah[21] >= 22) break;
                            this.ah[21] = (short)(this.ah[21] + 1);
                            break;
                        }
                        case 5: {
                            this.h();
                        }
                    }
                    this.a(50, 0);
                    this.a(-1, 0);
                    break;
                }
                case -3: 
                case 52: {
                    if (!this.l || this.l(52) != 1 && this.l(-3) != 1) break;
                    switch (this.ah[5]) {
                        case 3: {
                            if (this.ah[20] <= 0) break;
                            this.ah[20] = (short)(this.ah[20] - 1);
                        }
                    }
                    break;
                }
                case -4: 
                case 54: {
                    if (!this.l || this.l(54) != 1 && this.l(-4) != 1) break;
                    switch (this.ah[5]) {
                        case 3: {
                            if (this.ah[20] >= 33) break;
                            this.ah[20] = (short)(this.ah[20] + 1);
                        }
                    }
                    break;
                }
                case -2: 
                case 56: {
                    if (!this.l) break;
                    if (this.l(56) == 1 || this.l(-2) == 1) {
                        switch (this.ah[5]) {
                            case 3: {
                                if (this.ah[21] <= 0) break;
                                this.ah[21] = (short)(this.ah[21] - 1);
                                break;
                            }
                            case 5: {
                                this.h();
                            }
                        }
                    }
                    this.a(56, 0);
                    this.a(-2, 0);
                    break;
                }
                case -6: 
                case -5: 
                case 53: {
                    if (this.ah[5] == 0) {
                        if (this.l(-6) == 1) {
                            this.l = true;
                            this.i();
                            this.w();
                            this.aZ = 0;
                            this.bf[this.aZ] = 0;
                            this.d(this.A, 1);
                            this.d(this.bM[this.aZ][this.bf[this.aZ]], 19);
                            this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.bq);
                            this.ah[5] = 5;
                            this.a(-6, 0);
                        }
                        if (this.ah[23] != 4 || this.l(-5) != 1 && this.l(53) != 1) break;
                        this.w();
                        this.l = true;
                        this.i();
                        this.aZ = 0;
                        this.bf[this.aZ] = 0;
                        this.d(this.bM[this.aZ][this.bf[this.aZ]], 0);
                        this.d(this.A, 15);
                        this.d(this.bl, 4);
                        this.ah[1] = 3;
                        this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.B);
                        this.ah[0] = 0;
                        this.d(this.bM[this.aZ][1], 10);
                        this.d(this.bM[1][0], this.z[0]);
                        this.d(this.bM[2][0], this.bv[0]);
                        this.ah[42] = 0;
                        this.ah[23] = 0;
                        this.a(-5, 0);
                        this.a(53, 0);
                        break;
                    }
                    if (this.ah[5] != 5 || !this.l) break;
                    this.f(n);
                    this.a(n, 0);
                    break;
                }
                case -7: {
                    if (this.l && this.ah[5] == 1) {
                        this.l = false;
                        this.ah[5] = 2;
                    } else if (this.l && this.ah[5] == 3) {
                        this.l = false;
                        this.ah[5] = 4;
                        this.o();
                    } else if (this.ah[5] == 0 && !this.l) {
                        if (this.l(-7) == 1) {
                            this.l = true;
                            this.i();
                            this.w();
                            this.aZ = 0;
                            this.bf[this.aZ] = 0;
                            this.ah[1] = 3;
                            this.d(this.bl, 4);
                            this.d(this.A, 14);
                            this.d(this.bM[2][this.bf[2]], this.bK[0]);
                            this.bM[2][this.bf[2]][2] = (byte)this.a((int)this.bM[2][this.bf[2]][0], this.bK);
                            this.d(this.bM[this.aZ][this.bf[this.aZ]], this.aK[1]);
                            this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.B);
                            this.ah[0] = this.bM[this.aZ][this.bf[this.aZ]][2] > this.B.length - this.ah[1] ? (short)(this.bM[this.aZ][this.bf[this.aZ]][2] - this.B.length + this.ah[1]) : (short)0;
                            this.bX[this.aZ][this.bf[this.aZ]] = this.ah[0];
                        }
                    } else if (this.ah[5] == 5 && this.l) {
                        this.f(n);
                    }
                    this.a(-7, 0);
                }
            }
        } else if (this.ah[69] == 1 && this.l(48) == 1) {
            if (this.ah[68] < 256) {
                this.l = true;
                this.ah[69] = 2;
                this.ah[9] = 255;
            }
            this.a(48, 0);
        }
    }

    public void w(int n) {
        switch (n) {
            case -6: 
            case -5: 
            case 53: {
                this.bj.a(1);
                c c2 = this;
                c2.bj.b();
                this.cl[0] = this.cl[1];
                this.d(this.bl, 16);
                this.i();
                this.a(7, 1, 1);
                break;
            }
            case -7: {
                g.b(1);
                c c3 = this;
                c3.bj.b();
                this.cl[0] = this.cl[1];
                this.d(this.bl, 16);
            }
        }
    }

    public void A(int n) {
        short[] sArray = new short[]{3, 3, 1, 3};
        int n2 = 0;
        switch (n) {
            case -3: 
            case 52: {
                if (this.aZ > 0) {
                    --this.aZ;
                }
                this.ah[0] = (short)this.bX[this.aZ][this.bf[this.aZ]];
                this.ah[1] = sArray[this.aZ];
                break;
            }
            case -4: 
            case 54: {
                if (this.aZ < this.m.length - 1) {
                    ++this.aZ;
                }
                this.ah[0] = (short)this.bX[this.aZ][this.bf[this.aZ]];
                this.ah[1] = sArray[this.aZ];
                break;
            }
            case -6: 
            case -5: 
            case 53: {
                switch (this.m[this.aZ]) {
                    case 13: {
                        switch (this.bM[this.aZ][this.bf[this.aZ]][0]) {
                            case 0: {
                                if (this.ap.P[this.bM[this.aZ][this.bf[this.aZ]][0]] <= 0) break;
                                this.ap.af[0] = this.ap.af[0] + 50;
                                if (this.ap.af[0] > this.ap.af[1]) {
                                    this.ap.af[0] = this.ap.af[1];
                                }
                                byte by = this.bM[this.aZ][this.bf[this.aZ]][0];
                                this.ap.P[by] = (short)(this.ap.P[by] - 1);
                                break;
                            }
                            case 63: {
                                if (this.ap.P[this.bM[this.aZ][this.bf[this.aZ]][0]] <= 0) break;
                                n2 = Math.abs(this.cm.nextInt() % 100);
                                if (n2 < 30) {
                                    for (int j = 0; j < 3; ++j) {
                                        this.a(this.ap, this.H(this.ap.ag[0]));
                                    }
                                }
                                byte by = this.bM[this.aZ][this.bf[this.aZ]][0];
                                this.ap.P[by] = (short)(this.ap.P[by] - 1);
                                break;
                            }
                            case 64: {
                                if (this.ap.P[this.bM[this.aZ][this.bf[this.aZ]][0]] <= 0) break;
                                int[] nArray = com.cwa.gamelib.b.x[0];
                                nArray[1] = nArray[1] + 3;
                                byte by = this.bM[this.aZ][this.bf[this.aZ]][0];
                                this.ap.P[by] = (short)(this.ap.P[by] - 1);
                                break;
                            }
                            case 65: {
                                if (this.ap.P[this.bM[this.aZ][this.bf[this.aZ]][0]] <= 0) break;
                                int[] nArray = com.cwa.gamelib.b.bB[0];
                                nArray[1] = nArray[1] + 3;
                                byte by = this.bM[this.aZ][this.bf[this.aZ]][0];
                                this.ap.P[by] = (short)(this.ap.P[by] - 1);
                                break;
                            }
                            case 66: {
                                if (this.ap.P[this.bM[this.aZ][this.bf[this.aZ]][0]] <= 0) break;
                                if (this.ap.af[1] < 999999) {
                                    this.ap.af[1] = this.ap.af[1] + 30;
                                }
                                byte by = this.bM[this.aZ][this.bf[this.aZ]][0];
                                this.ap.P[by] = (short)(this.ap.P[by] - 1);
                            }
                        }
                        break;
                    }
                    case 12: {
                        if (this.ck[2 * this.bM[this.aZ][this.bf[this.aZ]][0]] <= 0) break;
                        this.ap.ah = this.bM[this.aZ][this.bf[this.aZ]][0];
                        this.ah[62] = 0;
                        this.ah[63] = 0;
                        this.a((i)this.ap, (int)this.ap.T[1], -1);
                        this.a(this.ap, 5, 0, 0, 0, this.ap.K, 19, 1, 0, -1, 0);
                    }
                }
                this.a(-6, 0);
                this.a(-5, 0);
                break;
            }
            case -7: {
                if (this.l(-7) != 1) break;
                this.d(this.bl, 7);
                this.w();
                this.l = false;
                this.a(-7, 0);
                this.o();
            }
        }
    }

    private void d(byte[] byArray, int n) {
        byArray[1] = byArray[0];
        byArray[0] = (byte)n;
    }

    public void x() {
        for (int j = 0; j < this.cf.length; ++j) {
            this.ap = null;
            this.D(j);
            this.u = this.x(this.J);
            if (this.ah[45] >= 0) {
                this.cf[j][0] = this.ap.ag[0];
                this.cf[j][1] = this.u;
                continue;
            }
            this.cf[j][0] = -1;
            this.cf[j][1] = -1;
        }
    }

    public void m(int n) {
        switch (n) {
            case -6: 
            case -5: 
            case 53: {
                if (this.l(n) == 1) {
                    switch (this.bM[this.aZ][this.bf[this.aZ]][0]) {
                        case 25: {
                            this.Z.f();
                            this.i();
                            this.Z.a();
                            break;
                        }
                        case 0: {
                            this.i();
                            this.ah = new short[130];
                            this.ah[67] = 20;
                            this.ah[105] = 5;
                            this.D = true;
                            this.d(this.A, 17);
                            this.aZ = 0;
                            this.d(this.bM[this.aZ][this.bf[this.aZ]], 22);
                            break;
                        }
                        case 6: {
                            this.i();
                            this.d(this.bl, 4);
                            this.d(this.A, 2);
                            break;
                        }
                        case 2: {
                            this.i();
                            this.ah[122] = 1;
                            this.ah[123] = 3;
                            this.d(this.bl, 4);
                            this.d(this.A, 3);
                            break;
                        }
                        case 3: {
                            this.i();
                            this.d(this.bl, 4);
                            this.d(this.A, 4);
                            break;
                        }
                        case 4: {
                            this.i();
                            break;
                        }
                        case 7: {
                            this.i();
                            this.Z.a();
                        }
                    }
                }
                this.a(n, 0);
            }
        }
    }

    public void s(int n) {
        switch (n) {
            case 48: {
                if (this.c != -1) break;
                this.a = this.bM[this.aZ][this.bf[this.aZ]][2];
                if (this.cf[this.a][0] == -1) break;
                this.c = 0;
                break;
            }
            case -6: 
            case -5: 
            case 53: {
                if (this.c == -1) {
                    this.a = this.bM[this.aZ][this.bf[this.aZ]][2];
                    if (this.cf[this.a][0] < 0) {
                        this.ah[70] = -1;
                        this.ah[7] = 0;
                        this.ah[60] = 1;
                        this.ah[69] = 1;
                        this.aT = 8;
                        this.ah[68] = 320;
                        this.ah[98] = 0;
                        this.d(this.bl, 2);
                        break;
                    }
                    this.ah[96] = 1;
                    this.ah[7] = 0;
                    this.ah[98] = 1;
                    this.d(this.bl, 2);
                    break;
                }
                if (this.c != 0) break;
                this.a = this.bM[this.aZ][this.bf[this.aZ]][2];
                gameutils.b b2 = new gameutils.b(this.O[this.a]);
                byte[] byArray = b2.a(1);
                byArray = new byte[byArray.length];
                byArray[0] = -1;
                b2.a(1, byArray, 0, byArray.length);
                b2.b();
                b2 = null;
                this.D = true;
                this.c = (byte)-1;
                break;
            }
            case -7: {
                if (this.c == -1) {
                    this.d(this.A, 0);
                    this.i();
                    this.a(8, -1, 1);
                    this.w();
                    break;
                }
                if (this.c != 0) break;
                this.c = (byte)-1;
            }
        }
    }

    public void j(int n) {
        switch (n) {
            case -3: 
            case 52: {
                break;
            }
            case -4: 
            case 54: {
                break;
            }
            case -1: 
            case 50: {
                break;
            }
            case -2: 
            case 56: {
                break;
            }
            case -7: {
                if (this.l(-7) != 1) break;
                this.d(this.bl, 7);
                this.l = false;
                this.a(-7, 0);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void q(int var1_1) {
        var2_2 = new short[]{3, 3, 3};
        var3_3 = false;
        if (this.l(var1_1) == 1) {
            if (this.bU[this.aZ] == 20) {
                if (this.bf[this.aZ] == 2 && this.ag != -1 && this.ag != 7) {
                    if (this.ag == 2) {
                        this.a(4, (byte)4, (byte)19);
                        this.am[4] = 5;
                    }
                    this.ag = (byte)-1;
                    this.a(var1_1, 0);
                }
            } else if (this.bf[this.aZ] == 0 && this.ag != -1) {
                if (this.ag == 2) {
                    this.a(4, (byte)4, (byte)19);
                    this.am[4] = 5;
                }
                this.ag = (byte)-1;
                this.a(var1_1, 0);
            }
        }
        block0 : switch (var1_1) {
            case -3: 
            case 52: {
                if (this.aZ > 0) {
                    --this.aZ;
                }
                this.ah[0] = (short)this.bX[this.aZ][this.bf[this.aZ]];
                this.ah[1] = var2_2[this.aZ];
                break;
            }
            case -4: 
            case 54: {
                if (this.aZ < this.bU.length - 1) {
                    ++this.aZ;
                }
                this.ah[0] = (short)this.bX[this.aZ][this.bf[this.aZ]];
                this.ah[1] = var2_2[this.aZ];
                break;
            }
            case -6: 
            case -5: 
            case 53: {
                if (this.l(var1_1) != 1) ** GOTO lbl132
                block6 : switch (this.bf[this.aZ]) {
                    case 0: {
                        if (this.bU[this.aZ] == 20) {
                            if (this.ck[this.bM[this.aZ][this.bf[this.aZ]][0] * 2] <= 0) break;
                            this.bf[this.aZ] = 1;
                            this.bM[this.aZ][this.bf[this.aZ]][0] = 0;
                            this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.as);
                            break;
                        }
                        if (this.ap.P[this.bM[this.aZ][this.bf[this.aZ]][0]] > 0) {
                            if (this.a(this.bM[this.aZ][this.bf[this.aZ]][0], com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][0])) {
                                if (this.ap.P[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] < 99) {
                                    if (com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0] >= 49 && com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0] <= 50 || com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0] >= 53 && com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0] <= 54) {
                                        if (this.ck[(com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0] - 46) * 2] < 1) {
                                            v0 = com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0];
                                            this.ap.P[v0] = (short)(this.ap.P[v0] + com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][1]);
                                            this.bh[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] = 1;
                                            this.b(this.bM[this.aZ][this.bf[this.aZ]][0], com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][0]);
                                            if (this.ap.P[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] > 99) {
                                                this.ap.P[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] = 99;
                                            }
                                            this.ag = (byte)4;
                                            v1 = (com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0] - 46) * 2;
                                            this.ck[v1] = (short)(this.ck[v1] + 1);
                                            this.z(com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]);
                                        } else {
                                            this.ag = (byte)5;
                                        }
                                    } else {
                                        v2 = com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0];
                                        this.ap.P[v2] = (short)(this.ap.P[v2] + com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][1]);
                                        this.bh[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] = 1;
                                        this.b(this.bM[this.aZ][this.bf[this.aZ]][0], com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][0]);
                                        if (this.ap.P[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] > 99) {
                                            this.ap.P[com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]] = 99;
                                        }
                                        this.ag = (byte)4;
                                    }
                                    switch (com.cwa.gamelib.b.aj[this.bM[this.aZ][this.bf[this.aZ]][0] - 10][1][0]) {
                                        case 49: 
                                        case 50: 
                                        case 54: {
                                            break block6;
                                        }
                                    }
                                    break;
                                }
                                this.ag = (byte)5;
                                break;
                            }
                            this.ag = (byte)2;
                            break;
                        }
                        this.ag = 0;
                        break;
                    }
                    case 1: {
                        this.ah[2] = 0;
                        this.ah[3] = 2;
                        this.ag = (byte)-1;
                        this.bf[this.aZ] = 2;
                        this.bM[this.aZ][this.bf[this.aZ]][0] = 10;
                        this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.aA);
                        this.ah[1] = 3;
                        if (this.bM[this.aZ][this.bf[this.aZ]][2] > this.aA.length - this.ah[1]) {
                            this.ah[0] = (short)(this.bM[this.aZ][this.bf[this.aZ]][2] - this.aA.length + this.ah[1]);
                            break;
                        }
                        this.ah[0] = 0;
                        break;
                    }
                    case 2: {
                        if (this.ag != -1) ** GOTO lbl128
                        if (this.ap.P[this.bM[this.aZ][2][0]] <= 0) ** GOTO lbl126
                        if (!this.a(this.bM[this.aZ][2][0], com.cwa.gamelib.b.aj[this.bM[this.aZ][2][0] - 10][0])) ** GOTO lbl124
                        if (this.c(this.bM[this.aZ][2][0], this.V[this.bM[this.aZ][0][0]]) >= 0) ** GOTO lbl122
                        if ((this.bM[this.aZ][2][0] - 10) % 5 != 3) ** GOTO lbl103
                        for (var4_4 = 0; var4_4 < 2; ++var4_4) {
                            if (this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] % 5 != 4 && (this.V[this.bM[this.aZ][0][0]][var4_4 * 2] - 10) % 5 == 4) {
                                this.ag = (byte)4;
                            } else {
                                if (this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] % 5 == 4 || (this.V[this.bM[this.aZ][0][0]][var4_4 * 2] - 10) % 5 == -1) continue;
                                this.ag = (byte)7;
                            }
                            ** GOTO lbl114
                        }
                        ** GOTO lbl114
lbl103:
                        // 1 sources

                        if ((this.bM[this.aZ][2][0] - 10) % 5 != 4) ** GOTO lbl112
                        for (var4_5 = 0; var4_5 < 2; ++var4_5) {
                            if (this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] % 5 != 3 && (this.V[this.bM[this.aZ][0][0]][var4_5 * 2] - 10) % 5 == 3) {
                                this.ag = (byte)5;
                            } else {
                                if (this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] % 5 == 3 || (this.V[this.bM[this.aZ][0][0]][var4_5 * 2] - 10) % 5 == -1) continue;
                                this.ag = (byte)7;
                            }
                            ** GOTO lbl114
                        }
                        ** GOTO lbl114
lbl112:
                        // 1 sources

                        if ((this.bM[this.aZ][2][0] - 10) % 5 == 2 && (this.bM[this.aZ][0][0] == 4 || this.bM[this.aZ][0][0] == 8)) {
                            this.ag = (byte)8;
                        }
lbl114:
                        // 9 sources

                        if (this.ag != -1) break;
                        if (this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] > -1) {
                            this.ag = (byte)7;
                            break;
                        }
                        this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] = this.bM[this.aZ][2][0];
                        this.b(this.bM[this.aZ][2][0], com.cwa.gamelib.b.aj[this.bM[this.aZ][2][0] - 10][0]);
                        this.ag = 1;
                        break;
lbl122:
                        // 1 sources

                        this.ag = (byte)3;
                        break;
lbl124:
                        // 1 sources

                        this.ag = (byte)2;
                        break;
lbl126:
                        // 1 sources

                        this.ag = 0;
                        break;
lbl128:
                        // 1 sources

                        if (this.ag != 7) break;
                        this.V[this.bM[this.aZ][0][0]][this.bM[this.aZ][1][0] + 0] = this.bM[this.aZ][2][0];
                        this.b(this.bM[this.aZ][2][0], com.cwa.gamelib.b.aj[this.bM[this.aZ][2][0] - 10][0]);
                        this.ag = (byte)6;
                    }
                }
lbl132:
                // 19 sources

                this.a(-6, 0);
                this.a(-5, 0);
                this.a(53, 0);
                break;
            }
            case -7: {
                if (this.l(var1_1) != 1) break;
                switch (this.bf[this.aZ]) {
                    case 0: {
                        if (this.ag == -1) {
                            this.l = false;
                            this.ah[23] = 0;
                            this.d(this.bl, 7);
                            this.o();
                            this.a(-7, 0);
                            break block0;
                        }
                        this.ag = (byte)-1;
                        break block0;
                    }
                    case 1: {
                        this.ah[1] = 3;
                        this.bM[this.aZ][this.bf[this.aZ]][0] = 0;
                        this.ah[0] = this.bM[this.aZ][this.bf[this.aZ]][2] > this.B.length - this.ah[1] ? (short)(this.bM[this.aZ][this.bf[this.aZ]][2] - this.B.length + this.ah[1]) : 0;
                        this.bf[this.aZ] = 0;
                        break block0;
                    }
                    case 2: {
                        if (this.ag == -1) {
                            this.ah[1] = 3;
                            this.ah[0] = this.bM[this.aZ][this.bf[this.aZ]][2] > this.B.length - this.ah[1] ? (short)(this.bM[this.aZ][this.bf[this.aZ]][2] - this.B.length + this.ah[1]) : 0;
                            this.bf[this.aZ] = 1;
                            break block0;
                        }
                        this.ag = (byte)-1;
                    }
                }
            }
        }
    }

    public boolean a(byte by, byte[] byArray) {
        int n = -1;
        boolean bl = false;
        for (int j = 0; j < byArray.length; j += 2) {
            n = byArray[j];
            if (byArray[j + 1] > this.ap.P[n]) {
                bl = false;
                break;
            }
            bl = true;
        }
        return bl;
    }

    public void b(byte by, byte[] byArray) {
        int n = -1;
        if (this.a(by, byArray)) {
            for (int j = 0; j < byArray.length; j += 2) {
                n = byArray[j];
                if (byArray[j + 1] > this.ap.P[n]) continue;
                int n2 = n;
                this.ap.P[n2] = (short)(this.ap.P[n2] - byArray[j + 1]);
            }
        }
    }

    public void f(int n) {
        switch (n) {
            case -6: 
            case -5: 
            case 53: {
                if (this.l(-6) != 1 && this.l(-5) != 1 && this.l(53) != 1) break;
                switch (this.bM[this.aZ][this.bf[this.aZ]][0]) {
                    case 19: {
                        this.ah[5] = 6;
                        this.l = false;
                        this.o();
                        break;
                    }
                    case 16: {
                        this.i();
                        this.a(8, -1, 1);
                        this.c(23);
                        this.d(this.bl, 4);
                        this.d(this.A, 0);
                        this.d(this.bM[this.aZ][this.bf[this.aZ]], 0);
                        this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.be);
                        this.ah[5] = 6;
                        this.l = false;
                        break;
                    }
                    case 6: {
                        this.i();
                        this.d(this.bl, 4);
                        this.d(this.A, 2);
                        break;
                    }
                    case 2: {
                        this.ah[122] = 1;
                        this.ah[123] = 3;
                        this.d(this.bl, 4);
                        this.d(this.A, 3);
                    }
                }
                this.a(n, 0);
                break;
            }
            case -7: {
                if (this.l(-7) != 1) break;
                this.d(this.bl, 7);
                this.ah[5] = 6;
                this.l = false;
                this.a(n, 0);
                this.o();
            }
        }
    }

    public void L(int n) {
        switch (n) {
            case -3: 
            case 52: {
                g.a((byte)1, false);
                c c2 = this;
                c2.bj.b();
                this.a(n, 0);
                break;
            }
            case -4: 
            case 54: {
                g.a((byte)1, true);
                c c3 = this;
                c3.bj.b();
                this.a(n, 0);
                break;
            }
            case -7: {
                this.a(n, 0);
                this.d(this.bl, this.bl[1]);
                this.d(this.A, this.A[1]);
                this.i();
                if (this.A[0] != 0) break;
                this.a(8, -1, 1);
            }
        }
    }

    public void k(int n) {
        switch (n) {
            case -3: 
            case 52: {
                this.a(n, 0);
                if (this.ah[122] - 1 <= 0) break;
                this.ah[122] = (short)(this.ah[122] - 1);
                break;
            }
            case -4: 
            case 54: {
                this.a(n, 0);
                if (this.ah[122] + 1 > this.ah[123]) break;
                this.ah[122] = (short)(this.ah[122] + 1);
                break;
            }
            case -7: {
                this.a(n, 0);
                this.d(this.bl, this.bl[1]);
                this.d(this.A, this.A[1]);
                this.i();
                if (this.A[0] != 0) break;
                this.a(8, -1, 1);
            }
        }
    }

    public void v(int n) {
        switch (n) {
            case -7: {
                this.a(n, 0);
                this.d(this.bl, this.bl[1]);
                this.d(this.A, this.A[1]);
                this.i();
                if (this.A[0] != 0) break;
                this.a(8, -1, 1);
            }
        }
    }

    private void w() {
        this.bf = new int[4];
        this.aZ = 0;
        this.bX = new int[4][4];
        this.bM = new byte[4][4][3];
    }

    private void m() {
        int n;
        int n2;
        this.ah[67] = 20;
        this.ah[104] = 0;
        this.ah[105] = 5;
        this.ah[106] = 0;
        this.ah[112 + this.a] = 0;
        this.ah[116] = 0;
        for (n2 = 0; n2 < this.r.length; ++n2) {
            this.r[n2][1] = 0;
        }
        for (n2 = 0; n2 < 4; ++n2) {
            this.ah[118 + n2] = 0;
        }
        this.bi = new byte[this.bm.length / 3];
        this.bi[this.bo] = 1;
        this.ah[103] = 0;
        com.cwa.gamelib.b.bB[0][1] = 10;
        com.cwa.gamelib.b.bB[0][2] = 10;
        com.cwa.gamelib.b.bB[0][3] = 10;
        com.cwa.gamelib.b.x[0][1] = 15;
        for (n2 = 0; n2 < this.R.length; ++n2) {
            for (n = 0; n < this.R[n2].length; n += 2) {
                this.R[n2][n] = 2;
            }
        }
        for (n2 = 2; n2 < 8; ++n2) {
            this.R[0][n2 * 2] = 0;
        }
        this.R[0][32] = 0;
        this.R[1][10] = 0;
        for (n2 = 0; n2 < this.bO.length; n2 += this.aE) {
            this.bO[n2] = 0;
        }
        for (n2 = 0; n2 < this.ap.P.length; ++n2) {
            this.ap.P[n2] = 0;
        }
        for (n2 = 0; n2 < this.bh.length; ++n2) {
            this.bh[n2] = 0;
        }
        for (n2 = 0; n2 < this.ap.V.length; ++n2) {
            this.ap.V[n2] = 0;
        }
        this.ap.P[46] = 1;
        this.bh[46] = 1;
        for (n2 = 0; n2 < this.ck.length; n2 += 2) {
            this.ck[n2] = n2 == 0 ? (short)1 : 0;
            this.ck[n2 + 1] = 2;
        }
        for (n2 = 0; n2 < this.V.length; ++n2) {
            for (n = 0; n < this.V[n2].length; n += 2) {
                this.V[n2][n] = -1;
                this.V[n2][n + 1] = -1;
            }
        }
        for (n2 = 0; n2 < this.e[this.ah[106]].length; ++n2) {
            this.e[this.ah[106]][n2][1][3] = 0;
        }
        this.ap.cd[0] = 0;
        this.ap.ag[0] = 0;
        for (n2 = 0; n2 < this.bp.length; ++n2) {
            this.bp[n2] = 0;
        }
        this.aK[1] = this.ap.ah = 0;
        this.ah[42] = -1;
        this.cc = 10;
    }

    private void y(int n) {
        int n2;
        int n3;
        int n4;
        boolean bl = true;
        this.bg[0] = new int[299 + this.C(0) + this.C(1) + 7 + this.r.length + 4 + (this.R[0].length >> 1) + (this.R[1].length >> 1)];
        byte[] byArray = new byte[1 + this.bg[0].length * 4];
        int n5 = 0;
        this.bg[0][n5++] = this.J;
        this.bg[0][n5++] = this.ap.C;
        this.bg[0][n5++] = this.ap.A;
        for (n4 = 0; n4 < this.ap.P.length - 0; ++n4) {
            this.bg[0][n5++] = this.ap.P[n4];
        }
        for (n4 = 0; n4 < this.ap.V.length; ++n4) {
            this.bg[0][n5++] = this.ap.V[n4];
        }
        for (n4 = 0; n4 < this.ck.length; n4 += 2) {
            this.bg[0][n5++] = this.ck[n4];
        }
        for (n4 = 0; n4 < this.V.length; ++n4) {
            for (n3 = 0; n3 < this.V[n4].length; n3 += 2) {
                this.bg[0][n5++] = this.V[n4][n3];
            }
        }
        this.bg[0][n5++] = this.ap.cd[0];
        this.bg[0][n5++] = com.cwa.gamelib.b.bB[0][1];
        this.bg[0][n5++] = com.cwa.gamelib.b.x[0][1];
        this.bg[0][n5++] = this.aK[1];
        this.bg[0][n5++] = this.ap.ag[0];
        this.bg[0][n5++] = this.ap.af[1];
        this.bg[0][n5++] = this.ap.m[1];
        for (n4 = 0; n4 < this.bO.length; n4 += this.aE) {
            this.bg[0][n5++] = this.bO[n4];
        }
        for (n4 = 0; n4 < this.bi.length; ++n4) {
            this.bg[0][n5++] = this.bi[n4];
        }
        for (n4 = 0; n4 < this.bp.length; ++n4) {
            this.bg[0][n5++] = this.bp[n4];
        }
        for (n4 = 0; n4 < this.bh.length - 0; ++n4) {
            this.bg[0][n5++] = this.bh[n4];
        }
        this.bg[0][n5++] = this.ah[103];
        for (n4 = 0; n4 < this.e.length; ++n4) {
            for (n3 = 0; n3 < this.e[n4].length; ++n3) {
                for (n2 = 1; n2 < this.e[n4][n3].length; ++n2) {
                    this.bg[0][n5++] = this.e[n4][n3][n2][3];
                }
            }
        }
        this.bg[0][n5++] = this.ah[106];
        for (n4 = 107; n4 <= 111; ++n4) {
            this.bg[0][n5++] = this.ah[n4];
        }
        for (n4 = 0; n4 < this.r.length; ++n4) {
            this.bg[0][n5++] = this.r[n4][1];
        }
        this.bg[0][n5++] = this.ah[112 + n];
        for (n4 = 0; n4 < 4; ++n4) {
            this.bg[0][n5++] = this.ah[118 + n4];
        }
        for (n4 = 0; n4 < this.R.length; ++n4) {
            for (n3 = 0; n3 < this.R[n4].length; n3 += 2) {
                this.bg[0][n5++] = this.R[n4][n3];
            }
        }
        n5 = 1;
        byArray[0] = 1;
        for (n3 = 0; n3 < this.bg[0].length; ++n3) {
            byte[] byArray2 = gameutils.a.a((long)this.bg[0][n3], 4);
            for (n2 = 0; n2 < byArray2.length; ++n2) {
                byArray[n5++] = byArray2[n2];
            }
        }
        gameutils.b b2 = new gameutils.b(this.O[n]);
        if (b2.a() == 0) {
            b2.a(byArray, 0, byArray.length);
        } else {
            b2.a(1, byArray, 0, byArray.length);
        }
        b2.b();
        b2 = null;
    }

    private void D(int n) {
        int n2;
        int n3;
        this.ap = null;
        int n4 = this.C(0);
        int n5 = this.C(1);
        this.bg[0] = new int[299 + n4 + n5 + 7 + this.r.length + 4 + (this.R[0].length >> 1) + (this.R[1].length >> 1)];
        byte[] byArray = new byte[1 + this.bg[0].length * 4];
        byte[] byArray2 = new byte[4];
        this.ah[112 + n] = 0;
        gameutils.b b2 = new gameutils.b(this.O[n]);
        if (b2.a() == 0) {
            byArray[0] = -1;
            b2.a(byArray, 0, byArray.length);
        } else {
            byArray = b2.a(1);
            if (byArray.length != this.bg[0].length * 4 + 1) {
                b2.c();
                byArray = new byte[1 + this.bg[0].length * 4];
                byArray[0] = -1;
                b2.a(byArray, 0, byArray.length);
            }
        }
        this.ah[45] = byArray[0];
        b2.b();
        b2 = null;
        int n6 = 1;
        for (n3 = 0; n3 < this.bg[0].length; ++n3) {
            for (n2 = 0; n2 < byArray2.length; ++n2) {
                byArray2[n2] = byArray[n6++];
            }
            this.bg[0][n3] = (int)gameutils.a.a(byArray2);
        }
        n3 = 0;
        this.J = this.bg[0][n3++];
        this.ah[70] = (short)this.J;
        com.cwa.gamelib.c.G[0] = this.bg[0][n3++];
        com.cwa.gamelib.c.G[1] = this.bg[0][n3++];
        this.ah[71] = (short)G[0];
        this.ah[72] = (short)G[1];
        this.ap = (d)this.a(1, G[0], G[1], (byte)1, 0, this.j, this.H, this.j);
        for (n6 = 0; n6 < this.ap.P.length - 0; ++n6) {
            this.ap.P[n6] = (short)this.bg[0][n3++];
            if (n6 < 46 || n6 > 53 || this.ap.P[n6] <= 0) continue;
            this.ck[(n6 - 46) * 2] = 1;
        }
        for (n6 = 0; n6 < this.ap.V.length; ++n6) {
            this.ap.V[n6] = (byte)this.bg[0][n3++];
        }
        for (n6 = 0; n6 < this.ck.length; n6 += 2) {
            this.ck[n6] = (byte)this.bg[0][n3++];
        }
        if (this.bh[62] != 0) {
            this.bh[67] = 1;
            this.bh[68] = 1;
        } else {
            this.bh[67] = 0;
            this.bh[68] = 0;
        }
        for (n6 = 0; n6 < this.V.length; ++n6) {
            for (n2 = 0; n2 < this.V[n6].length; n2 += 2) {
                this.V[n6][n2] = (byte)this.bg[0][n3++];
            }
        }
        this.ap.cd[0] = this.bg[0][n3++];
        com.cwa.gamelib.b.bB[0][1] = (short)this.bg[0][n3++];
        com.cwa.gamelib.b.bB[0][2] = com.cwa.gamelib.b.bB[0][1];
        com.cwa.gamelib.b.bB[0][3] = com.cwa.gamelib.b.bB[0][1];
        com.cwa.gamelib.b.x[0][1] = (short)this.bg[0][n3++];
        this.aK[1] = (byte)this.bg[0][n3++];
        this.ap.ah = this.aK[1];
        this.ap.ag[0] = this.bg[0][n3++];
        this.ap.af[1] = this.bg[0][n3++];
        this.ap.m[1] = this.bg[0][n3++];
        this.ap.cd[1] = this.H(this.ap.ag[0]);
        for (n6 = 0; n6 < this.bO.length; n6 += this.aE) {
            this.bO[n6] = (byte)this.bg[0][n3++];
        }
        for (n6 = 0; n6 < this.bi.length; ++n6) {
            this.bi[n6] = (byte)this.bg[0][n3++];
        }
        for (n6 = 0; n6 < this.bp.length; ++n6) {
            this.bp[n6] = (byte)this.bg[0][n3++];
        }
        for (n6 = 0; n6 < this.bh.length - 0; ++n6) {
            this.bh[n6] = (short)this.bg[0][n3++];
        }
        this.ah[103] = (short)this.bg[0][n3++];
        for (n6 = 0; n6 < this.e.length; ++n6) {
            for (n2 = 0; n2 < this.e[n6].length; ++n2) {
                for (int j = 1; j < this.e[n6][n2].length; ++j) {
                    this.e[n6][n2][j][3] = this.bg[0][n3++];
                }
            }
        }
        this.ah[106] = (short)this.bg[0][n3++];
        for (n6 = 107; n6 <= 111; ++n6) {
            this.ah[n6] = (short)this.bg[0][n3++];
        }
        for (n6 = 0; n6 < this.r.length; ++n6) {
            this.r[n6][1] = this.bg[0][n3++];
        }
        this.ah[112 + n] = (short)this.bg[0][n3++];
        for (n6 = 0; n6 < 4; ++n6) {
            this.ah[118 + n6] = (short)this.bg[0][n3++];
        }
        for (n6 = 0; n6 < this.R.length; ++n6) {
            for (n2 = 0; n2 < this.R[n6].length; n2 += 2) {
                this.R[n6][n2] = (short)this.bg[0][n3++];
            }
        }
        if (this.bh[10] == 1) {
            this.bh[62] = 1;
            this.ap.P[62] = 1;
        }
        this.ap.af[0] = this.ap.af[1];
        this.ap.m[0] = this.ap.m[1];
    }

    private void r() {
        int[] nArray = new int[]{33, 40, 43, 35, 34, 38, 41, 36, 39, 42, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 69};
        for (int j = 0; j < nArray.length; ++j) {
            this.ap.P[nArray[j]] = 1;
            this.bh[nArray[j]] = 1;
        }
    }

    public void J(int n) {
        int n2 = 0;
        if (this.ap.af[0] <= 0) {
            return;
        }
        if (this.ap.aI[2] == 1) {
            if (this.l(53) == 1 || this.l(-5) == 1) {
                if (this.ah[15] > 0) {
                    if (this.ah[62] == 0) {
                        n2 = Math.abs(this.cm.nextInt() % 100);
                        if (this.aK[1] == 6) {
                            n2 = 0;
                        }
                        if (n2 <= 30) {
                            this.ah[62] = 1;
                            this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 49 + (this.ah[15] - 10) / 5 * 3 + 1, 0);
                        }
                    } else if (this.ap.L[5][1] == 49 + (this.ah[15] - 10) / 5 * 3 + 1) {
                        this.ah[62] = 2;
                        this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                    }
                } else if (this.ah[16] > 0) {
                    if (this.ah[63] == 0) {
                        n2 = Math.abs(this.cm.nextInt() % 100);
                        if (this.aK[1] == 7) {
                            n2 = 0;
                        }
                        if (n2 <= 20) {
                            this.ah[63] = 1;
                            this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 58 + (this.ah[16] - 10) / 5 * 3 + 1, 0);
                        }
                    } else if (this.ap.L[5][1] == 58 + (this.ah[16] - 10) / 5 * 3 + 1) {
                        this.ah[63] = 2;
                        this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                    }
                }
                this.a(n, 0);
            }
            return;
        }
        if (this.l(53) == 1 || this.l(-5) == 1) {
            switch (this.ap.aR) {
                case 1: {
                    this.ah[76] = (short)(this.ah[76] + 1);
                    if (this.ah[76] > 3) {
                        this.ah[76] = 3;
                    }
                    if (this.ap.B[0] == 4) {
                        this.ap.aB[3] = 4;
                        this.ap.aB[2] = (short)(this.ap.aB[2] + 1);
                        if (this.ap.aB[2] >= this.ap.aB[3]) {
                            this.ap.aB[2] = 0;
                            this.a(this.ap, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0);
                            this.a(this.ap, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0);
                            this.d(this.ap.B, 0);
                        }
                        this.a(n, 0);
                        break;
                    }
                    if (this.ap.T[0] == 0) {
                        this.a((i)this.ap, 3, -1);
                    }
                    if (this.ap.T[0] == 3 || this.ap.ah >= 0 && this.ap.ah <= 4 && (this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 1 || this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 2)) {
                        if (this.ah[15] > 0) {
                            if (this.ah[62] == 0) {
                                n2 = Math.abs(this.cm.nextInt() % 100);
                                if (this.aK[1] == 6) {
                                    n2 = 0;
                                }
                                if (n2 <= 30) {
                                    this.ah[62] = 1;
                                    this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 49 + (this.ah[15] - 10) / 5 * 3 + 1, 0);
                                }
                            } else if (this.ap.L[5][1] == 49 + (this.ah[15] - 10) / 5 * 3 + 1) {
                                this.ah[62] = 2;
                                this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                            }
                        } else if (this.ah[16] > 0) {
                            if (this.ah[63] == 0) {
                                n2 = Math.abs(this.cm.nextInt() % 100);
                                if (this.aK[1] == 7) {
                                    n2 = 0;
                                }
                                if (n2 <= 20) {
                                    this.ah[63] = 1;
                                    this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 58 + (this.ah[16] - 10) / 5 * 3 + 1, 0);
                                }
                            } else if (this.ap.L[5][1] == 58 + (this.ah[16] - 10) / 5 * 3 + 1) {
                                this.ah[63] = 2;
                                this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                            }
                        }
                        this.ap.E = true;
                        this.a((i)this.ap, (int)this.bF[0][this.aK[this.ap.aR]], -1);
                        this.ah[61] = 0;
                    }
                    if (this.ap.T[0] == 4 || this.ap.T[0] == 5 || this.ap.T[0] == 12 || this.ap.ah >= 0 && this.ap.ah <= 4 && (this.ap.T[0] == this.bF[2][this.aK[this.ap.aR]] + 1 || this.ap.T[0] == this.bF[2][this.aK[this.ap.aR]] + 2)) {
                        if (this.ah[15] > 0) {
                            if (this.ah[62] == 0) {
                                n2 = Math.abs(this.cm.nextInt() % 100);
                                if (this.aK[1] == 6) {
                                    n2 = 0;
                                }
                                if (n2 <= 30) {
                                    this.ah[62] = 1;
                                    this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 49 + (this.ah[15] - 10) / 5 * 3 + 1, 0);
                                }
                            } else if (this.ap.L[5][1] == 49 + (this.ah[15] - 10) / 5 * 3 + 1) {
                                this.ah[62] = 2;
                                this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                            }
                        } else if (this.ah[16] > 0) {
                            if (this.ah[63] == 0) {
                                n2 = Math.abs(this.cm.nextInt() % 100);
                                if (this.aK[1] == 7) {
                                    n2 = 0;
                                }
                                if (n2 <= 20) {
                                    this.ah[63] = 1;
                                    this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 58 + (this.ah[16] - 10) / 5 * 3 + 1, 0);
                                }
                            } else if (this.ap.L[5][1] == 58 + (this.ah[16] - 10) / 5 * 3 + 1) {
                                this.ah[63] = 2;
                                this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                            }
                        }
                        this.ap.E = true;
                        this.a((i)this.ap, (int)this.bF[2][this.aK[this.ap.aR]], -1);
                        this.ah[61] = 0;
                    }
                    if (this.ap.T[0] != 6 && (this.ap.ah < 0 || this.ap.ah > 4 || this.ap.T[0] != this.bF[1][this.aK[this.ap.aR]] + 1 && this.ap.T[0] != this.bF[1][this.aK[this.ap.aR]] + 2)) break;
                    if (this.ah[15] > 0) {
                        if (this.ah[62] == 0) {
                            n2 = Math.abs(this.cm.nextInt() % 100);
                            if (this.aK[1] == 6) {
                                n2 = 0;
                            }
                            if (n2 <= 30) {
                                this.ah[62] = 1;
                                this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 49 + (this.ah[15] - 10) / 5 * 3 + 1, 0);
                            }
                        } else if (this.ap.L[5][1] == 49 + (this.ah[15] - 10) / 5 * 3 + 1) {
                            this.ah[62] = 2;
                            this.a(this.ap, 5, 49 + (this.ah[15] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                        }
                    } else if (this.ah[16] > 0) {
                        if (this.ah[63] == 0) {
                            n2 = Math.abs(this.cm.nextInt() % 100);
                            if (this.aK[1] == 0) {
                                n2 = 0;
                            }
                            if (n2 <= 20) {
                                this.ah[63] = 1;
                                this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3, 0, 0, this.ap.K, 19, 1, 1, 58 + (this.ah[16] - 10) / 5 * 3 + 1, 0);
                            }
                        } else if (this.ap.L[5][1] == 58 + (this.ah[16] - 10) / 5 * 3 + 1) {
                            this.ah[63] = 2;
                            this.a(this.ap, 5, 58 + (this.ah[16] - 10) / 5 * 3 + 2, 0, 0, this.ap.K, 19, 1, 1, -1, 0);
                        }
                    }
                    this.ap.E = true;
                    this.a((i)this.ap, (int)this.bF[1][this.aK[this.ap.aR]], -1);
                    this.ah[61] = 0;
                    break;
                }
                case 4: {
                    this.a((i)this.ap, 1, -1);
                }
            }
            this.a(53, 0);
            this.a(-5, 0);
        }
        if (this.ap.B[0] == 0) {
            if (this.l(50) == 1 || this.l(-1) == 1) {
                switch (this.ap.aR) {
                    case 1: {
                        if (this.ap.an[6] && !this.ap.an[7] && !this.ap.an[5] && this.ap.aI[4] == 0 && this.ap.aI[5] == 0) {
                            if (this.ap.T[0] == 6 || this.ap.T[0] == 11 || this.ap.ah >= 0 && this.ap.ah <= 4 && (this.ap.T[0] == this.bF[1][this.aK[this.ap.aR]] + 1 || this.ap.T[0] == this.bF[1][this.aK[this.ap.aR]] + 2)) {
                                if (this.ah[46] > 1 && this.ap.V[3] == 1) {
                                    this.ah[87] = 1;
                                    this.ap.ap = (short)(this.ap.ap | 1);
                                    this.ap.an[5] = true;
                                    this.ap.aE = 0;
                                    this.ap.aO = 3;
                                    this.ap.i = this.ap.W[this.ap.aO][this.ap.aE];
                                    this.ap.aI[4] = 3;
                                    this.a((i)this.ap, 4, -1);
                                }
                                if (this.ap.V[3] == 0 || this.ah[46] == 0) {
                                    this.a((i)this.ap, 3, -1);
                                    if (this.a((i)this.ap, 1, false) < 3000) {
                                        this.a((i)this.ap, 6, -1);
                                    }
                                }
                                this.a(50, 0);
                                this.a(-1, 0);
                            } else if ((this.ap.T[0] == 3 || this.ap.T[0] == 0 || this.ap.ah >= 0 && this.ap.ah <= 4 && (this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 1 || this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 2)) && this.ah[46] == 0 && this.ap.aI[4] == 0) {
                                this.ah[77] = 1;
                                this.ap.ap = (short)(this.ap.ap | 1);
                                this.ap.an[5] = true;
                                this.ap.aE = 0;
                                this.ap.aO = 1;
                                this.ap.i = this.ap.W[this.ap.aO][this.ap.aE];
                                this.ap.aI[4] = 1;
                                this.a((i)this.ap, 4, -1);
                            }
                        } else if (this.ah[46] == 0 && this.ap.aI[4] == 1 && this.ap.aI[5] == 1 && this.ap.V[2] == 1) {
                            this.ah[83] = 1;
                            this.ap.ap = (short)(this.ap.ap | 1);
                            this.ap.an[5] = true;
                            this.ap.aE = 0;
                            this.ap.aO = 1;
                            this.ap.i = this.ap.W[this.ap.aO][this.ap.aE];
                            this.ap.aI[4] = this.ap.aI[4] + 1;
                            this.ap.aI[5] = this.ap.aI[5] + 1;
                            this.a((i)this.ap, 4, -1);
                            this.a(50, 0);
                            this.a(-1, 0);
                        }
                        if (this.ah[46] != 0 || this.ap.aI[4] >= 3 || this.ap.T[0] != 4 && this.ap.T[0] != 12 && (this.ap.T[0] < this.bF[2][0] || this.ap.T[0] > this.bF[2][7] + 2) || this.ap.aI[5] != 0 || this.ap.aE < 2) break;
                        this.ap.aO = 1;
                        this.a(50, 0);
                        this.a(-1, 0);
                        break;
                    }
                    case 3: {
                        this.ap.ap = (short)(this.ap.ap & 0xC);
                        this.ap.ap = (short)(this.ap.ap | 1);
                        this.ap.i = com.cwa.gamelib.i.az;
                        if (this.ap.A + this.ap.i >= ai[2] - 20) {
                            this.ap.i = 0;
                        }
                        this.ap.u += this.ap.i;
                    }
                }
            }
            if (this.l(52) == 1 || this.l(-3) == 1) {
                switch (this.ap.aR) {
                    case 1: {
                        if (this.ap.T[0] == 4) {
                            this.ap.ac[0] = com.cwa.gamelib.i.f;
                            this.a((i)this.ap, 12, -1);
                        } else if (this.ap.T[0] == 3 || this.ap.ah >= 0 && this.ap.ah <= 4 && (this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 1 || this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 2)) {
                            if (this.ap.K == 1 && this.ap.T[0] == 3) {
                                this.a((i)this.ap, 13, -1);
                            } else {
                                this.ap.ac[0] = com.cwa.gamelib.i.f;
                                this.a((i)this.ap, 0, -1);
                            }
                        } else if (this.ap.T[0] == 6 && this.ap.V[4] == 1) {
                            if (this.ah[79] == 2 && this.ah[81] == 0) {
                                this.ah[81] = 1;
                            }
                            this.a((i)this.ap, 2, -1);
                            this.ap.ac[0] = com.cwa.gamelib.i.f;
                            this.a(52, 0);
                            this.a(-3, 0);
                        }
                        if ((this.ap.T[0] >= this.bF[0][0] || this.ap.T[0] == 9 || this.ap.T[0] == 7) && this.ap.T[0] <= this.bF[1][7] + 2) break;
                        if (this.ap.T[0] == 6 && this.ap.V[4] == 1 && this.ap.K == 2 || this.ap.T[0] != 6 && this.ap.T[0] != 13) {
                            this.ap.ap = (short)(this.ap.ap & 3);
                            this.ap.ap = (short)(this.ap.ap | 4);
                        }
                        if (this.ap.T[0] >= this.bF[0][0] && this.ap.T[0] <= this.bF[2][7] + 2) break;
                        this.ap.K = (byte)2;
                        break;
                    }
                    case 2: 
                    case 3: {
                        this.ap.ac[0] = com.cwa.gamelib.i.az;
                        if (this.ap.aR == 2) {
                            this.ap.ac[0] = com.cwa.gamelib.i.aP;
                        }
                        this.ap.ap = (short)(this.ap.ap & 3);
                        this.ap.ap = (short)(this.ap.ap | 4);
                        this.ap.K = (byte)2;
                        break;
                    }
                    case 4: {
                        if (this.ap.T[0] == 0) {
                            this.a((i)this.ap, 2, -1);
                            this.ap.ac[0] = com.cwa.gamelib.i.aP;
                        }
                        if (this.ap.T[0] != 1) {
                            this.ap.ap = (short)(this.ap.ap & 3);
                            this.ap.ap = (short)(this.ap.ap | 4);
                        }
                        if (this.ap.T[0] != 2) break;
                        this.ap.K = (byte)2;
                    }
                }
            } else if (this.l(54) == 1 || this.l(-4) == 1) {
                switch (this.ap.aR) {
                    case 1: {
                        if (this.ap.T[0] == 4) {
                            this.ap.ac[0] = com.cwa.gamelib.i.f;
                            this.a((i)this.ap, 12, -1);
                        } else if (this.ap.T[0] == 3 || this.ap.ah >= 0 && this.ap.ah <= 4 && (this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 1 || this.ap.T[0] == this.bF[0][this.aK[this.ap.aR]] + 2)) {
                            if (this.ap.K == 2 && this.ap.T[0] == 3) {
                                this.a((i)this.ap, 13, -1);
                            } else {
                                this.ap.ac[0] = com.cwa.gamelib.i.f;
                                this.a((i)this.ap, 0, -1);
                            }
                        } else if (this.ap.T[0] == 6 && this.ap.V[4] == 1) {
                            if (this.ah[79] == 2 && this.ah[81] == 0) {
                                this.ah[81] = 1;
                            }
                            this.a((i)this.ap, 2, -1);
                            this.ap.ac[0] = com.cwa.gamelib.i.f;
                            this.a(54, 0);
                            this.a(-4, 0);
                        }
                        if ((this.ap.T[0] >= this.bF[0][0] || this.ap.T[0] == 9 || this.ap.T[0] == 7) && this.ap.T[0] <= this.bF[1][7] + 2) break;
                        if (this.ap.T[0] == 6 && this.ap.V[4] == 1 && this.ap.K == 1 || this.ap.T[0] != 6 && this.ap.T[0] != 13) {
                            this.ap.ap = (short)(this.ap.ap & 3);
                            this.ap.ap = (short)(this.ap.ap | 8);
                        }
                        if (this.ap.T[0] >= this.bF[0][0] && this.ap.T[0] <= this.bF[2][7] + 2) break;
                        this.ap.K = 1;
                        break;
                    }
                    case 2: 
                    case 3: {
                        this.ap.ac[0] = com.cwa.gamelib.i.az;
                        if (this.ap.aR == 2) {
                            this.ap.ac[0] = com.cwa.gamelib.i.aP;
                        }
                        this.ap.ap = (short)(this.ap.ap & 3);
                        this.ap.ap = (short)(this.ap.ap | 8);
                        this.ap.K = 1;
                    }
                }
            }
            if (this.l(56) == 1 || this.l(-2) == 1) {
                switch (this.ap.aR) {
                    case 3: {
                        this.ap.ap = (short)(this.ap.ap & 0xC);
                        this.ap.ap = (short)(this.ap.ap | 2);
                        this.ap.i = -com.cwa.gamelib.i.az;
                        this.ap.u += this.ap.i;
                        break;
                    }
                    case 1: {
                        if (this.ap.T[0] == 3) {
                            this.a((i)this.ap, 11, -1);
                            this.ah[46] = 5;
                            if (this.ah[79] == 1 && this.ah[80] == 0) {
                                this.ah[80] = 1;
                            }
                        } else if (this.ap.T[0] == 6) {
                            this.ah[46] = 5;
                            com.cwa.gamelib.i.a(this.ap, this.ap.C, this.ap.A - 2, 0);
                            if (this.ah[79] == 1 && this.ah[80] == 0) {
                                this.ah[80] = 1;
                            }
                        }
                        this.a(56, 0);
                        this.a(-2, 0);
                    }
                }
            }
        }
    }

    public void g(int n) {
        this.a(n, 1);
        try {
            switch (this.bl[0]) {
                case 7: {
                    if (this.l) break;
                    if (this.ap.aI[4] == 1) {
                        this.ap.aI[5] = 1;
                        break;
                    }
                    if (this.ap.aI[4] != 2 || this.ap.V[3] != 1 || this.ap.aR != 4) break;
                    this.ap.aI[5] = 2;
                    break;
                }
                case 14: {
                    if (this.ah[9] != 0 || this.l(48) != 1) break;
                    this.x();
                    this.D = false;
                    this.a = this.bM[this.aZ][this.bf[this.aZ]][2];
                    if (this.cf[this.a][0] < 0) {
                        this.ah[70] = -1;
                        this.ah[7] = 0;
                        this.ah[60] = 1;
                        this.ah[69] = 1;
                        this.aT = 8;
                        this.ah[68] = 320;
                        this.ah[98] = 0;
                        this.d(this.bl, 2);
                        break;
                    }
                    this.ah[96] = 1;
                    this.ah[7] = 0;
                    this.ah[98] = 1;
                    this.d(this.bl, 2);
                    break;
                }
                case 15: {
                    if (this.ah[9] != 0 || this.l(48) != 1) break;
                    this.i = new f[0];
                    this.bf[this.aZ] = 0;
                    this.c(23);
                    this.d(this.bl, 4);
                    this.d(this.A, 0);
                    this.d(this.bM[this.aZ][this.bf[this.aZ]], 0);
                    this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.be);
                    this.l = false;
                    this.d();
                    this.i();
                    this.a(8, -1, 1);
                    this.a(48, 0);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.ca = n;
        this.bd = true;
        this.bG = 0;
    }

    public void t(int n) {
        this.a(n, 0);
        this.bd = false;
        this.ca = -1982;
    }

    private boolean a(i i2, int n, int n2, int n3, int n4) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n5 = 0;
        int n6 = 0;
        if (i2 != null) {
            n5 = i2.A - 80;
            switch (i2.K) {
                case 1: {
                    n6 = i2.C - 96 - 12;
                    break;
                }
                case 2: {
                    n6 = i2.C - 144;
                }
            }
        } else {
            n5 = n2;
            n6 = n;
        }
        int n7 = 12;
        int n8 = 0;
        if (this.aH[1] > n5) {
            n8 = 40;
        } else if (this.aH[1] < n5) {
            n8 = 40;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if (n6 < ai[0]) {
            n6 = ai[0];
        } else if (n6 > ai[1] - 240) {
            n6 = ai[1] - 240;
        }
        if (this.aH[0] < n6) {
            if (this.aH[0] < ai[1] - 240) {
                this.aH[0] = this.aH[0] + n7;
                bl = true;
                if (this.aH[0] >= n6) {
                    this.aH[0] = n6;
                }
            }
        } else if (this.aH[0] > n6 && this.aH[0] > ai[0]) {
            this.aH[0] = this.aH[0] - n7;
            bl = true;
            if (this.aH[0] <= n6) {
                this.aH[0] = n6;
            }
        }
        if (this.aH[0] <= ai[0]) {
            if (ai[0] - this.aH[0] < n7) {
                this.aH[0] = ai[0];
            }
            if (this.aH[0] == ai[0]) {
                bl = false;
            }
        } else if (this.aH[0] >= ai[1] - 240) {
            if (this.aH[0] - (ai[1] - 240) < n7) {
                this.aH[0] = ai[1] - 240;
            }
            if (this.aH[0] == ai[1] - 240) {
                bl = false;
            }
        }
        if (this.aH[1] > n5) {
            if (this.aH[1] > ai[3]) {
                this.aH[1] = this.aH[1] - n8;
                bl2 = true;
                if (this.aH[1] <= n5) {
                    this.aH[1] = n5;
                }
            }
        } else if (this.aH[1] < n5 && this.aH[1] < ai[2] - 260) {
            this.aH[1] = this.aH[1] + n8;
            bl2 = true;
            if (this.aH[1] >= n5) {
                this.aH[1] = n5;
            }
        }
        if (this.aH[1] >= ai[2] - 260) {
            if (this.aH[1] + 260 - ai[2] < n8) {
                this.aH[1] = ai[2] - 260;
            }
            if (this.aH[1] == ai[2] - 260) {
                bl2 = false;
            }
        } else if (this.aH[1] <= ai[3]) {
            if (ai[3] - this.aH[1] < n8) {
                this.aH[1] = ai[3];
            }
            if (this.aH[1] == ai[3]) {
                bl2 = false;
            }
        }
        return bl | bl2;
    }

    private int[] q(i i2) {
        int[] nArray = new int[2];
        int n = i2.A - i2.aK[0] - 74;
        if (n < 0) {
            n = 0;
        }
        switch (i2.K) {
            case 1: {
                nArray[0] = i2.C - 96;
                break;
            }
            case 2: {
                nArray[0] = i2.C - 144;
            }
        }
        if (nArray[0] < ai[0]) {
            nArray[0] = ai[0];
        } else if (nArray[0] > ai[1] - 240) {
            nArray[0] = ai[1] - 240;
        }
        nArray[1] = n;
        if (nArray[1] > ai[2] - 260) {
            nArray[1] = ai[2] - 260;
        } else if (nArray[1] < ai[3]) {
            nArray[1] = ai[3];
        }
        return nArray;
    }

    private void c(int n) {
        String string = "/data/animate/";
        String[] stringArray = new String[]{"player_a_", "player_b_", "player_c_", "player_d_", "player_e_", "enemy_a_", "enemy_b_", "enemy_c_", "enemy_d_", "enemy_e_", "enemy_f_", "enemy_g_", "enemy_h_", "enemy_i_", "boss_a_", "boss_b_", "boss_c_", "boss_d_", "boss_e_", "effect_", "key_", "effect_0_", "dying_", "preface_", "ui_", "num_", "scene_", "figure_"};
        try {
            InputStream inputStream;
            if (this.ak[n].length == 0) {
                inputStream = com.cwa.gamelib.c.b(string + stringArray[n] + "module.mid");
                this.ak[n] = com.cwa.gamelib.c.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.ar[n].length == 0) {
                inputStream = com.cwa.gamelib.c.b(string + stringArray[n] + "frame.mid");
                this.ar[n] = com.cwa.gamelib.c.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.L[n].length == 0) {
                inputStream = com.cwa.gamelib.c.b(string + stringArray[n] + "colli.mid");
                this.L[n] = com.cwa.gamelib.c.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.bT[n].length == 0) {
                inputStream = com.cwa.gamelib.c.b(string + stringArray[n] + "att.mid");
                this.bT[n] = com.cwa.gamelib.c.b(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (this.bZ[n].length == 0) {
                inputStream = com.cwa.gamelib.c.b(string + stringArray[n] + "action.mid");
                this.bZ[n] = com.cwa.gamelib.c.a(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void t() {
        switch (this.bl[0]) {
            case 30: {
                this.cl[0] = this.cl[0] + 1;
                this.cl[1] = 45;
                if (this.cl[0] < this.cl[1]) break;
                this.cl[0] = 0;
                this.bl[1] = this.bl[0];
                this.bl[0] = 1;
                break;
            }
            case 1: {
                this.cl[0] = this.cl[0] + 1;
                this.cl[1] = 10;
                if (this.cl[0] < this.cl[1]) break;
                this.cl[0] = 0;
                for (int j = 0; j < this.bL.length; ++j) {
                    this.bL[j] = null;
                }
                this.cl[3] = 10;
                this.d(this.bl, 13);
                break;
            }
            case 13: {
                this.cl[2] = this.cl[2] + 1;
                this.cl[3] = 10;
                switch (this.cl[2]) {
                    case 2: {
                        this.c(23);
                        this.c(24);
                        break;
                    }
                    case 3: {
                        this.c(25);
                        this.c(26);
                        break;
                    }
                    case 4: {
                        this.c(27);
                        this.c(19);
                        break;
                    }
                    case 5: {
                        this.c(20);
                        this.a();
                        break;
                    }
                    case 6: {
                        this.B();
                        break;
                    }
                    case 7: {
                        this.n();
                        break;
                    }
                    case 8: {
                        break;
                    }
                    case 9: {
                        this.g();
                        this.bj.a(1);
                        this.cl[0] = this.cl[0] + 1;
                        break;
                    }
                    case 10: {
                        this.cj = new i();
                        this.cj.C = 120;
                        this.cj.A = 140;
                        this.cj.aR = 23;
                        com.cwa.gamelib.i.a(this.cj, (byte)0);
                        this.ah[95] = 0;
                        this.ah[91] = 0;
                    }
                }
                if (this.cl[2] < this.cl[3]) break;
                this.cl[2] = 0;
                this.d(this.bl, 21);
                break;
            }
            case 16: {
                break;
            }
            case 2: {
                this.cl[3] = 50;
                this.cl[2] = this.cl[2] + 1;
                switch (this.cl[2]) {
                    case 6: {
                        this.d(23);
                        break;
                    }
                    case 7: {
                        this.ah[99] = 2;
                        this.ah[97] = 2;
                        this.ah[125] = 0;
                        break;
                    }
                    case 8: {
                        int n;
                        block46: for (n = 0; n < az.length; ++n) {
                            if (az[n].length <= 0) continue;
                            com.cwa.gamelib.c.az[n][0][0] = -1;
                            switch (n) {
                                case 0: {
                                    com.cwa.gamelib.c.az[n][0][17] = 1;
                                    com.cwa.gamelib.c.az[n][0][23] = 2;
                                    com.cwa.gamelib.c.az[n][0][21] = 2;
                                    com.cwa.gamelib.c.az[n][0][52] = 3;
                                    com.cwa.gamelib.c.az[n][0][53] = 3;
                                    com.cwa.gamelib.c.az[n][0][54] = 3;
                                    com.cwa.gamelib.c.az[n][0][106] = 6;
                                    com.cwa.gamelib.c.az[n][0][48] = 6;
                                    com.cwa.gamelib.c.az[n][0][60] = -1;
                                    continue block46;
                                }
                                case 1: {
                                    com.cwa.gamelib.c.az[n][0][62] = 1;
                                    com.cwa.gamelib.c.az[n][0][57] = 1;
                                    com.cwa.gamelib.c.az[n][0][58] = 2;
                                    com.cwa.gamelib.c.az[n][0][70] = 3;
                                    com.cwa.gamelib.c.az[n][0][71] = 3;
                                    com.cwa.gamelib.c.az[n][0][72] = 3;
                                    com.cwa.gamelib.c.az[n][0][73] = 3;
                                    continue block46;
                                }
                                case 2: {
                                    com.cwa.gamelib.c.az[n][0][66] = 1;
                                    com.cwa.gamelib.c.az[n][0][70] = 2;
                                    com.cwa.gamelib.c.az[n][0][72] = 2;
                                    com.cwa.gamelib.c.az[n][0][60] = 3;
                                    com.cwa.gamelib.c.az[n][0][61] = 3;
                                    continue block46;
                                }
                                case 3: {
                                    com.cwa.gamelib.c.az[n][0][31] = 2;
                                    com.cwa.gamelib.c.az[n][0][33] = 2;
                                    com.cwa.gamelib.c.az[n][0][27] = 1;
                                    com.cwa.gamelib.c.az[n][0][61] = 3;
                                    com.cwa.gamelib.c.az[n][0][62] = 3;
                                    com.cwa.gamelib.c.az[n][0][77] = 6;
                                    com.cwa.gamelib.c.az[n][0][74] = 6;
                                    continue block46;
                                }
                                case 4: {
                                    continue block46;
                                }
                            }
                        }
                        if (this.ah[98] == 0 || this.ah[98] == 1 && this.ah[112 + this.a] == 1) {
                            this.bo = 0;
                            if (this.ah[112 + this.a] == 0) {
                                this.ap = (d)this.a(1, 16 * this.bD, 3 * this.ab, (byte)1, 0, this.j, this.H, this.j);
                                this.m();
                                this.f();
                            } else {
                                this.D(this.a);
                                this.bo = 0;
                                if (this.ah[112 + this.a] == 1) {
                                    this.ah[112 + this.a] = 2;
                                }
                                com.cwa.gamelib.i.a(this.ap, 16 * this.bD, 3 * this.ab, 0);
                                this.ap.K = 1;
                            }
                        } else if (this.ah[98] == 1 && this.ah[112 + this.a] == 0 || this.ah[98] == 1 && this.ah[112 + this.a] == 2 || this.ah[112 + this.a] == 2) {
                            this.D(this.a);
                            this.bo = this.bg[0][0];
                            this.f();
                        }
                        this.J = this.bo;
                        this.bi[this.J] = 1;
                        this.ay = this.bm[this.J * 3];
                        this.bN = this.u;
                        this.u = this.a((byte)this.ay);
                        this.av = this.x(this.J);
                        this.aV = this.u;
                        this.b(this.ay);
                        this.d = new long[4];
                        if (this.ay == 3 || this.ay == 22) {
                            this.n(this.J);
                        }
                        if (this.J == 49) {
                            this.bw[0][1][12] = 696;
                            this.bw[0][2][12] = 696;
                            this.bw[0][3][12] = 696;
                        }
                        this.c(1);
                        this.c(2);
                        this.c(3);
                        for (n = 5; n < 19; ++n) {
                            this.c(n);
                        }
                        this.c(21);
                        this.c(22);
                        this.o(this.J);
                        break;
                    }
                    case 12: {
                        break;
                    }
                    case 16: {
                        break;
                    }
                    case 20: {
                        break;
                    }
                    case 25: {
                        for (int j = 5; j <= 13; ++j) {
                        }
                        break;
                    }
                    case 35: {
                        this.cn[3] = this.cn[6];
                        this.cn[14][0] = new Image[1][1];
                        this.cn[14][0][0][0] = this.cn[19][0][0][0];
                        break;
                    }
                    case 40: {
                        break;
                    }
                    case 42: {
                        break;
                    }
                    case 46: {
                        this.a(0, this.H, this.j, 0);
                        this.ah[6] = (short)this.a(this.J, this.aF);
                        if (this.ah[6] < 0) {
                            this.i = new f[this.ce[this.J].length];
                            if (this.ce[this.J].length > 0) {
                                for (int j = 0; j < this.i.length; ++j) {
                                    this.i[j] = (f)this.a(this.ce[this.J][j][0], this.ce[this.J][j][2] * this.bD, this.ce[this.J][j][3] * this.ab + 20, (byte)this.ce[this.J][j][1], this.ce[this.J][j][4] * this.bD, this.ce[this.J][j][5] * this.ab, this.ce[this.J][j][6] * this.bD, this.ce[this.J][j][7] * this.ab);
                                }
                                aY = null;
                            }
                        } else if (this.bO[this.ah[6] * this.aE] == 0 || this.ah[106] > 0) {
                            this.ah[92] = this.J == 75 || this.J == 91 ? (short)1 : 0;
                            this.i = new f[1];
                            this.i[0] = (f)this.a(this.ce[this.J][0][0], this.ce[this.J][0][2] * this.bD, this.ce[this.J][0][3] * this.ab, (byte)this.ce[this.J][0][1], this.ce[this.J][0][4] * this.bD, this.ce[this.J][0][5] * this.ab, this.ce[this.J][0][6] * this.bD, this.ce[this.J][0][7] * this.ab);
                            this.i[0].af[0] = this.i[0].af[1] = com.cwa.gamelib.b.aQ[this.ah[106]][this.i[0].aR + this.ah[92] * 5];
                        } else {
                            this.i = new f[0];
                        }
                        this.aH = this.q(this.ap);
                    }
                }
                if (this.cl[2] > this.cl[3]) {
                    this.l = false;
                    this.cl[2] = 0;
                    this.ah[114] = 0;
                    this.d(this.bl, 7);
                    this.o();
                }
                this.d();
                break;
            }
            case 22: {
                if (this.N != 0) break;
                this.cl[3] = 2;
                this.cl[2] = this.cl[2] + 1;
                switch (this.cl[2]) {
                    case 1: {
                        this.J = this.bo;
                        this.ah[125] = 0;
                        this.o(this.J);
                        this.bi[this.J] = 1;
                        this.ay = this.bm[this.J * 3];
                        this.ah[99] = 0;
                        this.ah[97] = 0;
                        this.bN = this.u;
                        this.ah[116] = 0;
                        this.u = this.a((byte)this.ay);
                        this.av = this.x(this.J);
                        this.aV = this.u;
                        this.ah[6] = (short)this.a(this.J, this.aF);
                        if (this.ah[6] >= 0) {
                            if (this.ah[106] == 0 && this.bO[this.ah[6] * this.aE] == 0 || this.ah[106] > 0 && this.J != 49) {
                                this.ah[7] = 1;
                                this.ah[60] = 1;
                            }
                        } else {
                            this.ah[7] = 0;
                            this.ah[60] = 1;
                        }
                        this.b(this.ay);
                        this.d = new long[4];
                        if (this.ay == 3 || this.ay == 22) {
                            this.n(this.J);
                        }
                        if (this.J == 49) {
                            this.bw[0][1][12] = 696;
                            this.bw[0][2][12] = 696;
                            this.bw[0][3][12] = 696;
                        }
                        if (this.bN == this.u || this.bN >= 4 || this.u >= 4 || this.ah[118 + this.u] != 0) break;
                        this.ah[23] = 6;
                        this.aT = this.u + 3;
                        this.ah[118 + this.u] = 1;
                        break;
                    }
                    case 2: {
                        this.a(0, this.H, this.j, 0);
                        com.cwa.gamelib.i.a(this.ap, G[0], G[1], 0);
                        this.ap.am[1] = this.ap.am[0];
                        if (this.ah[6] < 0) {
                            this.i = new f[this.ce[this.J].length];
                            if (this.ce[this.J].length > 0) {
                                for (int j = 0; j < this.i.length; ++j) {
                                    this.i[j] = (f)this.a(this.ce[this.J][j][0], this.ce[this.J][j][2] * this.bD, this.ce[this.J][j][3] * this.ab + this.ab, (byte)this.ce[this.J][j][1], this.ce[this.J][j][4] * this.bD, this.ce[this.J][j][5] * this.ab, this.ce[this.J][j][6] * this.bD, this.ce[this.J][j][7] * this.ab);
                                }
                                aY = null;
                            }
                        } else if (this.ah[106] == 0 && this.bO[this.ah[6] * this.aE] == 0 || this.ah[106] > 0 && this.J != 49) {
                            this.ah[92] = this.J == 75 || this.J == 91 ? (short)1 : 0;
                            this.i = new f[1];
                            this.i[0] = (f)this.a(this.ce[this.J][0][0], this.ce[this.J][0][2] * this.bD, this.ce[this.J][0][3] * this.ab, (byte)this.ce[this.J][0][1], this.ce[this.J][0][4] * this.bD, this.ce[this.J][0][5] * this.ab, this.ce[this.J][0][6] * this.bD, this.ce[this.J][0][7] * this.ab);
                            this.i[0].af[0] = this.i[0].af[1] = com.cwa.gamelib.b.aQ[this.ah[106]][this.i[0].aR + this.ah[92] * 5];
                        } else {
                            this.i = new f[0];
                        }
                        this.aH = this.q(this.ap);
                    }
                }
                if (this.cl[2] < this.cl[3]) break;
                this.a((i)this.ap, 2, true);
                this.l = false;
                this.cl[2] = 0;
                this.ah[114] = 0;
                this.d(this.bl, 7);
                if (this.bN != this.u) {
                    this.i();
                }
                this.o();
                break;
            }
            case 7: {
                if (this.ah[6] < 0 || this.ah[106] <= 0 || this.ah[116] != 0 || this.i.length <= 0 || this.i[0] == null) break;
                if (this.i[0].af[0] > 0) {
                    this.ah[114] = (short)(this.ah[114] + 1);
                    break;
                }
                if (this.ah[107 + this.i[0].aR - 14] <= 12) {
                    this.ah[107 + this.i[0].aR - 14] = this.ah[114];
                    this.ah[116] = 1;
                    this.ah[117] = 1;
                    break;
                }
                if (this.ah[114] < this.ah[107 + this.i[0].aR - 14]) {
                    this.ah[107 + this.i[0].aR - 14] = this.ah[114];
                    this.ah[116] = 1;
                    this.ah[117] = 1;
                    break;
                }
                this.ah[116] = 3;
                this.ah[117] = 1;
                break;
            }
            case 4: {
                this.cl[5] = 4;
                this.cl[4] = this.cl[4] + 1;
                if (this.cl[4] < this.cl[5]) break;
                this.cl[4] = 0;
            }
        }
        this.Z.a(this.cl);
    }

    private void n(int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = this.a((byte)this.bm[n * 3]);
        for (int j = 0; j < this.bH[n].length; j += 3) {
            int n5;
            int n6;
            n2 = this.bH[n][j] * 12;
            n3 = this.bH[n][j + 1] * 13;
            if ((this.bH[n][j + 2] & 1) != 0) {
                for (n6 = n2 + 1; n6 < n2 + 11; ++n6) {
                    this.bw[0][n6][n3 + 12] = -1;
                }
            }
            if ((this.bH[n][j + 2] & 2) != 0) {
                for (n6 = n2 + 1; n6 < n2 + 11; ++n6) {
                    this.bw[0][n6][n3] = -1;
                }
            }
            if ((this.bH[n][j + 2] & 4) != 0) {
                for (n6 = n3 + 4; n6 < n3 + 12; ++n6) {
                    this.bw[0][n2][n6] = -1;
                    this.bw[0][n2 + 1][n6] = -1;
                }
                for (n6 = 0; n6 < this.by.length; ++n6) {
                    if (this.by[n6] == null) continue;
                    for (n5 = 0; n5 < this.by[n6].length; n5 += 3) {
                        if (this.by[n6][n5] != n2 && this.by[n6][n5] != n2 + 1 || this.by[n6][n5 + 1] < n3 + 4 || this.by[n6][n5 + 1] >= n3 + 12) continue;
                        if (n4 == 0) {
                            switch (this.by[n6][n5 + 2] >> 3) {
                                case 69: 
                                case 70: 
                                case 71: 
                                case 72: 
                                case 73: {
                                    this.by[n6][n5 + 2] = -1;
                                }
                            }
                            continue;
                        }
                        if (n4 != 1) continue;
                        switch (this.by[n6][n5 + 2] >> 3) {
                            case 79: 
                            case 80: 
                            case 81: 
                            case 82: 
                            case 83: 
                            case 84: 
                            case 85: {
                                this.by[n6][n5 + 2] = -1;
                            }
                        }
                    }
                }
                for (n6 = 0; n6 < this.o.length; ++n6) {
                    for (n5 = 0; n5 < this.o[n6].length; n5 += 3) {
                        if (this.o[n6][n5] != n2 && this.o[n6][n5] != n2 + 1 || this.o[n6][n5 + 1] < n3 + 3 || this.o[n6][n5 + 1] >= n3 + 12) continue;
                        if (n4 == 0) {
                            switch (this.o[n6][n5 + 2] >> 3) {
                                case 59: 
                                case 60: 
                                case 67: {
                                    this.o[n6][n5 + 2] = -1;
                                }
                            }
                            continue;
                        }
                        if (n4 != 1) continue;
                        switch (this.o[n6][n5 + 2] >> 3) {
                            case 79: {
                                this.o[n6][n5 + 2] = -1;
                            }
                        }
                    }
                }
            }
            if ((this.bH[n][j + 2] & 8) == 0) continue;
            for (n6 = n3 + 4; n6 < n3 + 12; ++n6) {
                this.bw[0][n2 + 11][n6] = -1;
                this.bw[0][n2 - 1 + 11][n6] = -1;
            }
            for (n6 = 0; n6 < this.by.length; ++n6) {
                if (this.by[n6] == null) continue;
                for (n5 = 0; n5 < this.by[n6].length; n5 += 3) {
                    if (this.by[n6][n5] != n2 + 11 && this.by[n6][n5] != n2 + 10 || this.by[n6][n5 + 1] < n3 + 4 || this.by[n6][n5 + 1] >= n3 + 12) continue;
                    if (n4 == 0) {
                        switch (this.by[n6][n5 + 2] >> 3) {
                            case 68: 
                            case 71: 
                            case 72: {
                                this.by[n6][n5 + 2] = -1;
                            }
                        }
                        continue;
                    }
                    if (n4 != 1) continue;
                    switch (this.by[n6][n5 + 2] >> 3) {
                        case 80: 
                        case 81: 
                        case 82: 
                        case 83: 
                        case 84: 
                        case 85: 
                        case 86: {
                            this.by[n6][n5 + 2] = -1;
                        }
                    }
                }
            }
            for (n6 = 0; n6 < this.o.length; ++n6) {
                for (n5 = 0; n5 < this.o[n6].length; n5 += 3) {
                    if (this.o[n6][n5] != n2 + 11 && this.o[n6][n5] != n2 + 10 || this.o[n6][n5 + 1] < n3 + 3 || this.o[n6][n5 + 1] >= n3 + 12) continue;
                    if (n4 == 0) {
                        switch (this.o[n6][n5 + 2] >> 3) {
                            case 59: 
                            case 60: 
                            case 67: {
                                this.o[n6][n5 + 2] = -1;
                            }
                        }
                        continue;
                    }
                    if (n4 != 1) continue;
                    switch (this.o[n6][n5 + 2] >> 3) {
                        case 79: {
                            this.o[n6][n5 + 2] = -1;
                        }
                    }
                }
            }
        }
    }

    protected void n() {
        int[] nArray = new int[]{0, 1, 2, 3, 4, 5};
        int[] nArray2 = new int[]{1, 1, 1, 1, 1, 1};
        DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream("/data/scene.mid"));
        try {
            dataInputStream.skip(4L);
            int n = 0;
            int n2 = dataInputStream.readInt();
            for (int j = 0; j < nArray.length; ++j) {
                if (null == aO[nArray[j]]) {
                    com.cwa.gamelib.c.aO[nArray[j]] = new Image[nArray2[nArray[j]]];
                }
                n = dataInputStream.readInt();
                byte[] byArray = new byte[n];
                for (int k = 0; k < n; ++k) {
                    byArray[k] = (byte)(dataInputStream.readByte() ^ n2);
                }
                if (aO[nArray[j]][0] != null) continue;
                com.cwa.gamelib.c.aO[nArray[j]][0] = gameutils.a.c(byArray, 0);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void g() {
        int n = 0;
        try {
            DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream("/data/snd.mid"));
            dataInputStream.skip(4L);
            int n2 = dataInputStream.readInt();
            for (int j = 0; j < this.cb.length; ++j) {
                n = dataInputStream.readInt();
                byte[] byArray = new byte[n];
                for (int k = 0; k < n; ++k) {
                    byArray[k] = (byte)(dataInputStream.readByte() ^ n2);
                }
                this.cb[j] = this.bj.a(byArray, 1);
            }
            this.bj.a(1);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void a() {
        byte[][] byArrayArray = new byte[][]{{1, 0}, {1, 1}, {2, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}, {10, 0}, {11, 0}, {12, 0}, {13, 0}, {14, 1}, {15, 0}, {16, 0}, {17, 0}, {18, 0}, {18, 1}, {18, 2}, {19, 0}, {20, 0}, {21, 0}, {23, 0}, {23, 1}, {24, 0}, {25, 0}, {26, 0}, {27, 0}};
        byte[] byArray = new byte[]{0, 2, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1, 0, 2, 1, 1, 1, 1};
        DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream("/data/role.mid"));
        try {
            dataInputStream.skip(4L);
            int n = 0;
            int n2 = dataInputStream.readInt();
            for (int j = 0; j < byArrayArray.length; ++j) {
                if (null == this.cn[byArrayArray[j][0]]) {
                    this.cn[byArrayArray[j][0]] = new Image[byArray[byArrayArray[j][0]]][][];
                }
                if (null == this.cn[byArrayArray[j][0]][byArrayArray[j][1]]) {
                    this.cn[byArrayArray[j][0]][byArrayArray[j][1]] = new Image[1][1];
                }
                n = dataInputStream.readInt();
                byte[] byArray2 = new byte[n];
                for (int k = 0; k < n; ++k) {
                    byArray2[k] = (byte)(dataInputStream.readByte() ^ n2);
                }
                if (null != this.cn[byArrayArray[j][0]][byArrayArray[j][1]][0][0]) continue;
                this.cn[byArrayArray[j][0]][byArrayArray[j][1]][0][0] = gameutils.a.c(byArray2, 0);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void e(int n) {
        int n2 = this.ap.C / 240;
        int n3 = this.ap.A / 260;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int[] nArray = null;
        for (int j = 0; j < this.bH[n].length; j += 3) {
            if (this.bH[n][j + 0] != n2 || this.bH[n][j + 1] != n3) continue;
            for (int k = 0; k < 4; ++k) {
                n8 = this.bH[n][j + 2] & 1 << k;
                switch (n8) {
                    case 1: {
                        n4 = n2 * 240 + 0;
                        n5 = (n3 + 1) * 260;
                        n6 = 240;
                        n7 = this.ab;
                        break;
                    }
                    case 2: {
                        n4 = 0;
                        n5 = this.ab;
                        n6 = 240;
                        n7 = this.ab;
                        break;
                    }
                    case 4: {
                        n4 = n2 * 240;
                        n5 = (n3 + 1) * 260 - this.ab;
                        n6 = 3;
                        n7 = 260;
                        break;
                    }
                    case 8: {
                        n4 = (n2 + 1) * 240 - 4;
                        n5 = (n3 + 1) * 260 - this.ab;
                        n6 = 3;
                        n7 = 260;
                    }
                }
                nArray = this.p(this.ap);
                int n9 = this.bm[n * 3 + 1] + n2;
                int n10 = this.bm[n * 3 + 2] + n3;
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
                this.bo = this.d(n, n9, n10, n8);
                if (this.bo < 0) continue;
                this.l = true;
                this.d(this.bl, 22);
                return;
            }
        }
    }

    private int d(int n, int n2, int n3, int n4) {
        for (int j = 0; j < this.bm.length; j += 3) {
            if (n2 < this.bm[j + 1] || n2 >= this.bm[j + 1] + this.ae[this.bm[j] * 2] || n3 < this.bm[j + 2] || n3 >= this.bm[j + 2] + this.ae[this.bm[j] * 2 + 1]) continue;
            switch (n4) {
                case 1: {
                    com.cwa.gamelib.c.G[0] = this.ap.C - (this.bm[j + 1] - this.bm[n * 3 + 1]) * 240;
                    com.cwa.gamelib.c.G[1] = 20;
                    break;
                }
                case 2: {
                    com.cwa.gamelib.c.G[0] = this.ap.C - (this.bm[j + 1] - this.bm[n * 3 + 1]) * 240;
                    com.cwa.gamelib.c.G[1] = this.ae[this.bm[j] * 2 + 1] * 260 - 50;
                    break;
                }
                case 4: {
                    com.cwa.gamelib.c.G[0] = this.ae[this.bm[j] * 2] * 240 - 20;
                    com.cwa.gamelib.c.G[1] = this.ap.A - (this.bm[j + 2] - this.bm[n * 3 + 2]) * 260;
                    break;
                }
                case 8: {
                    com.cwa.gamelib.c.G[0] = 14;
                    com.cwa.gamelib.c.G[1] = this.ap.A - (this.bm[j + 2] - this.bm[n * 3 + 2]) * 260;
                }
            }
            return j / 3;
        }
        return -1;
    }

    protected void b(int n) {
        short s = 0;
        int n2 = 0;
        byte by = 0;
        byte[] byArray = new byte[4];
        byte by2 = 0;
        int n3 = 0;
        byte[] byArray2 = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};
        int n4 = -1;
        byte[] byArray3 = new byte[]{1, 1, 2, 1, 1, 1, 1, 0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int n5 = -1;
        byte[] byArray4 = new byte[]{3, 3, 4, 4, 3, 3, 4, 3, 4, 3, 4, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 1, 0, 0};
        int n6 = -1;
        byte[] byArray5 = new byte[]{0, 2, 0, 1, 0, 0};
        int n7 = -1;
        int n8 = 0;
        try {
            String string = "/data/map/m_" + n + ".mid";
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(6L);
            by = dataInputStream.readByte();
            byte[] byArray6 = new byte[by];
            dataInputStream.read(byArray6);
            n3 = (int)com.cwa.gamelib.c.b(byArray6);
            dataInputStream.read(byArray6);
            int n9 = (int)com.cwa.gamelib.c.b(byArray6);
            dataInputStream.read(byArray6);
            int n10 = (int)com.cwa.gamelib.c.b(byArray6);
            this.j = n10 * 20;
            this.H = n9 * 20;
            this.H = n9 * this.bD;
            this.j = n10 * this.ab;
            int n11 = this.a((byte)n);
            if (n > 51 && byArray5[n11] > 0) {
                this.at[n11] = new short[byArray5[n11]][];
                this.aa[n11] = new short[byArray5[n11]][2];
            }
            this.bw = new short[1][n9][n10];
            this.o = new short[byArray3[n]][];
            int n12 = this.a((byte)n);
            this.bJ = new int[byArray3[n]][2];
            this.by = new short[byArray4[n]][];
            bY = new int[byArray4[n]][2];
            this.ac = new int[0][4];
            this.bc = new int[0][12];
            com.cwa.gamelib.i.aG = 0;
            this.e();
            inputStream.read(byArray6);
            long l = com.cwa.gamelib.c.b(byArray6);
            short s2 = (short)com.cwa.gamelib.c.b(byArray6);
            for (int j = 0; j < n3; ++j) {
                if (s2 >= -1) continue;
                by2 = dataInputStream.readByte();
                n8 = 0;
                inputStream.read(byArray);
                n2 = (int)com.cwa.gamelib.c.b(byArray);
                inputStream.read(byArray6);
                s2 = (short)com.cwa.gamelib.c.b(byArray6);
                switch (by2) {
                    case 1: {
                        n6 = (byte)(n6 + 1);
                        this.by[n6] = new short[n2 * 3];
                        break;
                    }
                    case 6: {
                        this.ac = new int[n2][4];
                        this.bc = new int[n2][12];
                        this.F = new i[n2];
                        break;
                    }
                    case 2: {
                        n4 = (byte)(n4 + 1);
                        break;
                    }
                    case 3: {
                        if (this.o.length <= 0) break;
                        n5 = (byte)(n5 + 1);
                        this.o[n5] = new short[n2 * 3];
                        break;
                    }
                    case 5: {
                        break;
                    }
                    case 7: {
                        n7 = (byte)(n7 + 1);
                        this.at[n12][n7] = new short[n2 * 3];
                    }
                }
                while (s2 >= 0) {
                    short s3 = s2;
                    inputStream.read(byArray6);
                    short s4 = (short)com.cwa.gamelib.c.b(byArray6);
                    switch (by2) {
                        case 0: {
                            inputStream.read(byArray);
                            break;
                        }
                        case 1: {
                            int n13 = n8;
                            n8 = (short)(n8 + 1);
                            this.by[n6][n13] = s3;
                            int n14 = n8;
                            n8 = (short)(n8 + 1);
                            this.by[n6][n14] = s4;
                            inputStream.read(byArray);
                            int n15 = n8;
                            n8 = (short)(n8 + 1);
                            this.by[n6][n15] = (short)com.cwa.gamelib.c.b(byArray);
                            break;
                        }
                        case 2: {
                            inputStream.read(byArray);
                            this.bw[0][s3][s4] = (short)com.cwa.gamelib.c.b(byArray);
                            break;
                        }
                        case 3: {
                            inputStream.read(byArray);
                            if (this.o.length <= 0) break;
                            int n16 = n8;
                            n8 = (short)(n8 + 1);
                            this.o[n5][n16] = s3;
                            int n17 = n8;
                            n8 = (short)(n8 + 1);
                            this.o[n5][n17] = s4;
                            int n18 = n8;
                            n8 = (short)(n8 + 1);
                            this.o[n5][n18] = (short)com.cwa.gamelib.c.b(byArray);
                            break;
                        }
                        case 4: {
                            inputStream.read(byArray);
                            this.bw[0][s3][s4] = (short)com.cwa.gamelib.c.b(byArray);
                            break;
                        }
                        case 5: {
                            inputStream.read(byArray);
                            break;
                        }
                        case 6: {
                            inputStream.read(byArray);
                            this.ac[n8][0] = s3 * 20;
                            this.ac[n8][1] = s4 * 20;
                            s = (short)com.cwa.gamelib.c.b(byArray);
                            this.ac[n8][2] = s >> 3;
                            this.ac[n8][3] = 1;
                            n8 = (short)(n8 + 1);
                            break;
                        }
                        case 7: {
                            int n19 = n8;
                            n8 = (short)(n8 + 1);
                            this.at[n12][n7][n19] = s3;
                            int n20 = n8;
                            n8 = (short)(n8 + 1);
                            this.at[n12][n7][n20] = s4;
                            inputStream.read(byArray);
                            int n21 = n8;
                            n8 = (short)(n8 + 1);
                            this.at[n12][n7][n21] = (short)com.cwa.gamelib.c.b(byArray);
                            break;
                        }
                        default: {
                            inputStream.read(byArray);
                        }
                    }
                    inputStream.read(byArray6);
                    s2 = (short)com.cwa.gamelib.c.b(byArray6);
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void e() {
        if (this.bw != null) {
            for (int j = 0; j < this.bw.length; ++j) {
                for (int k = 0; k < this.bw[j].length; ++k) {
                    for (int i2 = 0; i2 < this.bw[j][k].length; ++i2) {
                        this.bw[j][k][i2] = -1;
                    }
                }
            }
        } else {
            new Throwable("\"mapReset();\"map is NULL!").printStackTrace();
        }
    }

    protected int a(i i2, int n, boolean bl) {
        int[] nArray;
        int n2 = 3000;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        int n6 = -1;
        if (n > 0 && (n2 = this.a(i2, n3 = (nArray = this.p(i2))[0], n4 = nArray[1], n5 = nArray[2], n6 = nArray[3], this.bw[0], n, bl)) >= 1000 && n2 < 3000) {
            if (n2 - 1000 == 6 && this.ah[103] <= 0) {
                this.aT = 33;
                this.ah[22] = 0;
                this.ah[64] = 0;
                this.ah[23] = 5;
                this.ah[103] = (short)(this.ah[103] + 1);
            }
            return n2;
        }
        return 3000;
    }

    private void a(i i2, int n, int n2) {
        i2.T[1] = i2.T[0];
        i2.T[0] = (byte)n;
        if (i2.T[1] != i2.T[0]) {
            i2.r = false;
            i2.aV = 0;
            i2.b = 0;
            i2.aS = 0;
        }
        int n3 = i2.aR & 0xFFFFFF7F;
        int n4 = this.bZ[n3][n].length;
        if (n2 >= 0) {
            this.bZ[n3][n][n4 - 1][0] = (short)n2;
        }
    }

    private void i(i i2) {
        if (i2 == null) {
            return;
        }
        int n = i2.aR & 0xFFFFFF7F;
        int n2 = this.bZ[n][i2.T[0]].length - 2;
        if (i2.aL[0] < i2.aL[1]) {
            i2.aL[0] = (byte)(i2.aL[0] + 1);
        } else {
            i2.aL[0] = 0;
            if (n >= 0 && n <= 23) {
                if (this.bZ[n][i2.T[0]][i2.aV][0] == 0) {
                    i2.ab = true;
                }
                byte by = i2.aS;
                i2.aS = (byte)(by + 1);
                if (by >= this.bZ[n][i2.T[0]][i2.aV][0] - 1) {
                    i2.aS = (byte)(this.bZ[n][i2.T[0]][i2.aV][0] - 1);
                    if (i2.aV < n2) {
                        i2.aS = 0;
                        ++i2.aV;
                    } else if (i2.aV + 1 > n2) {
                        if (this.bZ[n][i2.T[0]][n2 + 1][0] == 0) {
                            i2.aV = 0;
                        } else if (++i2.b < this.bZ[n][i2.T[0]][n2 + 1][0]) {
                            i2.aV = 0;
                        } else {
                            i2.b = this.bZ[n][i2.T[0]][n2 + 1][0];
                            i2.r = true;
                        }
                    }
                }
            }
        }
        i2.aH = this.bZ[n][i2.T[0]][i2.aV][1];
        this.o(i2);
    }

    private void o(i i2) {
        try {
            int n = i2.aR & 0xFFFFFF7F;
            byte by = i2.T[0];
            int n2 = i2.aV;
            short s = this.bZ[n][by][i2.aV][1];
            int n3 = i2.aK[0];
            i2.aK[0] = this.L[n][s][3] - this.L[n][s][1];
            i2.aK[1] = n3 != 0 ? n3 : i2.aK[0];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int c(i i2) {
        int n = 3000;
        int n2 = 4;
        boolean bl = false;
        while (n == 3000 && i2.C != i2.I) {
            if (i2.C < i2.I) {
                i2.C += n2;
                if (i2.C > i2.I) {
                    i2.C = i2.I;
                }
            } else if (i2.C > i2.I) {
                i2.C -= n2;
                if (i2.C < i2.I) {
                    i2.C = i2.I;
                }
            }
            if ((n = this.a(i2, i2.ap & 0xC, true)) != 3000) continue;
        }
        i2.I = i2.C;
        return n;
    }

    private void n(i i2) {
        i2.i = i2.an[5] ? i2.W[i2.aO][i2.aE] : -4;
        i2.u += i2.i;
        if (i2.i <= 0) {
            switch (i2.aR) {
                case 1: {
                    if (i2.T[0] != 4 && i2.T[0] != 12) break;
                    this.a((i)this.ap, 5, -1);
                }
            }
        }
        if (i2.aE < i2.W[i2.aO].length - 1) {
            ++i2.aE;
        }
    }

    private int e(i i2) {
        int n = 3000;
        if (i2.aR == 1) {
            this.n(i2);
        }
        n = this.h(i2);
        i2.aW = i2.u = i2.A;
        if (i2.aR <= 4) {
            if (n >= 1000 && n < 3000) {
                if (i2.an[5] && i2.i < 0) {
                    i2.an[5] = false;
                    i2.ap = (short)(i2.ap & 3);
                    i2.ap = (short)(i2.ap & 0xC);
                    i2.an[6] = true;
                    i2.aE = 6;
                    i2.aO = 0;
                    i2.i = 0;
                    this.ah[46] = 0;
                }
                if ((i2.ap & 3) == 0 && !i2.an[5]) {
                    i2.an[6] = true;
                    i2.i = 0;
                    this.ap.aI[4] = 0;
                    this.ap.aI[5] = 0;
                } else {
                    i2.aE = this.ap.ao[this.ap.aO][0];
                    i2.i = this.ap.W[this.ap.aO][this.ap.aE];
                }
            } else {
                i2.an[6] = false;
                if (this.ap.aI[4] == 0 && this.ap.aI[5] == 0) {
                    this.ap.aI[4] = 1;
                    this.ap.aI[5] = 1;
                }
            }
        }
        return n;
    }

    private int b(i i2) {
        int n = 3000;
        if (i2.aR > 4) {
            this.d(i2, 6, this.H - 6);
        } else {
            this.d(i2, ai[0] + 6, ai[1] - 1);
        }
        n = this.c(i2);
        i2.e = i2.I = i2.C;
        return n;
    }

    private void a(int n, int n2, int n3, int n4) {
        com.cwa.gamelib.c.ai[0] = n > 32 ? n - 16 : n;
        com.cwa.gamelib.c.ai[1] = n2 < this.H - 32 ? n2 + 16 : n2;
        com.cwa.gamelib.c.ai[2] = n3 < this.j - 32 ? n3 + 16 : n3;
        com.cwa.gamelib.c.ai[3] = n4 > 32 ? n4 - 16 : n4;
    }

    private void d(i i2, int n, int n2) {
        i2.I = i2.C;
        if ((i2.ap & 0xC) == 4) {
            i2.I -= i2.ac[0];
        } else if ((i2.ap & 0xC) == 8) {
            i2.I += i2.ac[0];
        }
        if (i2.I <= n) {
            i2.I = n;
        }
        if (i2.I >= n2) {
            i2.I = n2;
        }
    }

    private int[] j(i i2) {
        int n = 0;
        int[] nArray = new int[3];
        boolean bl = false;
        int n2 = i2.Q[3];
        int n3 = i2.Q[2];
        if (i2.O == 3 || i2.O == 4 || i2.O == 6 || i2.O == 7) {
            n3 <<= 1;
        }
        if (i2.O >= 2 && i2.O <= 7) {
            if (n3 == 0) {
                i2.ap = 0;
                i2.O = (short)-1;
            } else {
                int n4 = 20;
                long l = -(4 * n2 << n4) / (n3 * n3);
                long l2 = (4 * n2 << n4) / n3;
                long l3 = 0L;
                nArray[0] = n3 > 0 ? i2.ac[0] : (n3 < 0 ? -i2.ac[0] : i2.ac[0]);
                i2.I += nArray[0];
                switch (i2.O) {
                    case 2: 
                    case 5: {
                        n = i2.I - i2.e;
                        break;
                    }
                    case 3: 
                    case 6: {
                        n = i2.I - i2.e;
                        break;
                    }
                    case 4: 
                    case 7: {
                        n = (n3 >> 1) + (i2.I - i2.e);
                    }
                }
                l3 = l * (long)n * (long)n + l2 * (long)n;
                nArray[0] = i2.I - i2.e;
                nArray[1] = (int)(l3 >> n4);
                switch (i2.O) {
                    case 4: 
                    case 7: {
                        nArray[1] = nArray[1] - n2;
                    }
                }
                switch (i2.O) {
                    case 2: 
                    case 5: {
                        if ((nArray[0] < n3 || n3 <= 0) && (nArray[0] > n3 || n3 >= 0)) break;
                        nArray[0] = n3;
                        nArray[1] = 0;
                        nArray[2] = 1;
                        i2.ap = 0;
                        i2.O = (short)-1;
                        break;
                    }
                    case 3: 
                    case 6: {
                        if ((nArray[0] < n3 >> 1 || n3 <= 0) && (nArray[0] > n3 >> 1 || n3 >= 0)) break;
                        nArray[0] = n3 >> 1;
                        nArray[1] = n2;
                        nArray[2] = 1;
                        i2.ap = 0;
                        i2.O = (short)-1;
                        break;
                    }
                    case 4: 
                    case 7: {
                        if ((nArray[0] < n3 >> 1 || n3 <= 0) && (nArray[0] > n3 >> 1 || n3 >= 0)) break;
                        nArray[0] = n3 >> 1;
                        nArray[1] = -n2;
                        nArray[2] = 1;
                        i2.ap = 0;
                        i2.O = (short)-1;
                    }
                }
                i2.C = i2.e + nArray[0];
                i2.A = i2.aW + nArray[1];
                if (i2.O < 0) {
                    com.cwa.gamelib.i.a(i2, i2.C, i2.A, 0);
                }
            }
        }
        for (n2 = 0; n2 < i2.ai.length; ++n2) {
            if (i2.ai[n2] == null || i2.ai[n2].ap == 0 || i2.ai[n2].O == -1) continue;
            this.j((f)i2.ai[n2]);
        }
        for (n2 = 0; n2 < i2.w.length; ++n2) {
            if (i2.w[n2] == null || i2.w[n2].ap == 0 || i2.w[n2].O == -1) continue;
            this.j((f)i2.w[n2]);
        }
        return nArray;
    }

    private int[] k(i i2) {
        int n;
        int[] nArray = new int[3];
        switch (i2.O) {
            case 0: {
                nArray = this.f(i2);
                break;
            }
            case 1: {
                nArray = this.g(i2);
                break;
            }
        }
        if (nArray[2] == 1) {
            com.cwa.gamelib.i.a(i2, i2.C, i2.A, 0);
            i2.ap = 0;
            i2.O = (short)-1;
        }
        for (n = 0; n < i2.ai.length; ++n) {
            if (i2.ai[n] == null) continue;
            this.k((f)i2.ai[n]);
        }
        for (n = 0; n < i2.w.length; ++n) {
            if (i2.w[n] == null) continue;
            this.k((f)i2.w[n]);
        }
        return nArray;
    }

    private int[] f(i i2) {
        int[] nArray = new int[3];
        if (i2.Q[2] > 0) {
            nArray[0] = i2.ac[0];
            if (i2.C + nArray[0] - i2.e >= i2.av[2] + i2.av[0] - i2.e) {
                nArray[0] = i2.av[2] + i2.av[0] - i2.e - (i2.C - i2.e);
                i2.e = i2.C + nArray[0];
                nArray[2] = 1;
            } else if (i2.C + nArray[0] - i2.e >= i2.Q[2]) {
                nArray[0] = i2.Q[2] - (i2.C - i2.e);
                i2.e = i2.C + nArray[0];
                nArray[2] = 1;
            }
        } else if (i2.Q[2] < 0) {
            nArray[0] = -i2.ac[0];
            if (nArray[0] + i2.C - i2.e <= i2.av[0] - i2.e) {
                nArray[0] = i2.av[0] - i2.e - (i2.C - i2.e);
                i2.e = i2.C + nArray[0];
                nArray[2] = 1;
            } else if (nArray[0] + i2.C - i2.e <= i2.Q[2]) {
                nArray[0] = i2.Q[2] - (i2.C - i2.e);
                i2.e = i2.C + nArray[0];
                nArray[2] = 1;
            }
        } else {
            nArray[2] = 1;
        }
        i2.C += nArray[0];
        if (nArray[2] == 1) {
            com.cwa.gamelib.i.a(i2, i2.C, i2.A, 0);
        }
        return nArray;
    }

    private int[] g(i i2) {
        int[] nArray = new int[3];
        if (i2.Q[3] > 0) {
            nArray[1] = i2.ac[1];
            if (i2.u + nArray[1] - i2.aW >= i2.Q[3]) {
                nArray[1] = i2.Q[3] + i2.aW - i2.u;
                i2.aW = i2.u + nArray[1];
                nArray[2] = 1;
            }
        } else if (i2.Q[3] < 0) {
            nArray[1] = -i2.ac[1];
            if (i2.u + nArray[1] - i2.aW <= i2.Q[3]) {
                nArray[1] = i2.Q[3] + i2.aW - i2.u;
                i2.aW = i2.u + nArray[1];
                nArray[2] = 1;
            }
        } else {
            nArray[2] = 1;
        }
        i2.u += nArray[1];
        int n = 3000;
        i2.i = nArray[1];
        if (i2.D) {
            n = this.h(i2);
        }
        if (n >= 1000 && n < 3000) {
            nArray[2] = 1;
            if (i2.aR == 15) {
                this.ah[17] = -1;
            }
        } else {
            i2.A = i2.u;
        }
        return nArray;
    }

    private int h(i i2) {
        int n;
        block3: {
            int n2;
            block2: {
                n = 3000;
                n2 = 2;
                if (i2.i >= 0) break block2;
                while (n == 3000 && i2.A > i2.u - 10) {
                    i2.A -= n2;
                    n = this.a(i2, 2, true);
                    i2.ap = (short)(i2.ap & 0xC);
                }
                break block3;
            }
            if (i2.i <= 0) break block3;
            while (n == 3000 && i2.A < i2.u) {
                i2.A += n2;
                n = this.a(i2, 1, true);
                i2.ap = (short)(i2.ap & 0xC);
            }
        }
        return n;
    }

    private void a(int n, int n2, int n3) {
        this.bt[1] = this.bt[0];
        this.bt[0][0] = n;
        this.bt[0][1] = n2;
        this.bt[0][2] = n3;
        if (n2 != 0) {
            this.bj.a(this.cb[n], 1, 1, n2, 1);
        }
    }

    public void i() {
        for (int j = 0; j < this.cb.length; ++j) {
            if (this.bt[0][0] != j) continue;
            try {
                this.bj.b(this.cb[j], 1);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public int p(int n) {
        int[] nArray = new int[]{-1982, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -1, -2, -3, -4, -6, -7, -5};
        return com.cwa.gamelib.c.a(n, nArray);
    }

    public void a(int n, int n2) {
        int n3 = this.p(n);
        if (n3 >= 0) {
            this.M[n3] = n2;
        }
    }

    private int l(int n) {
        int n2 = this.p(n);
        if (n2 > 0) {
            return this.M[n2];
        }
        return 0;
    }

    private void d(int n) {
        if (this.ak[n].length != 0) {
            this.ak[n] = new short[0][];
            this.ar[n] = new short[0][][];
            this.L[n] = new short[0][];
            this.bT[n] = new short[0][];
            this.bZ[n] = new short[0][][];
        }
    }

    public void a(String string, String string2, String string3, boolean bl) {
        try {
            if (bl) {
                int n = this.bA - 1;
                this.bI[n] = (byte)(this.bI[n] - 1);
                if (this.bI[this.bA - 1] <= 0) {
                    int n2;
                    int n3;
                    int n4 = this.C(0);
                    int n5 = this.C(1);
                    this.bg[0] = new int[299 + n4 + n5 + 7 + this.r.length + 4 + (this.R[0].length >> 1) + (this.R[1].length >> 1)];
                    byte[] byArray = new byte[1 + this.bg[0].length * 4];
                    byte[] byArray2 = new byte[4];
                    gameutils.b b2 = new gameutils.b(this.O[this.a]);
                    if (b2.a() == 0) {
                        byArray[0] = -1;
                        b2.a(byArray, 0, byArray.length);
                    } else {
                        byArray = b2.a(1);
                    }
                    int n6 = 1;
                    for (n3 = 0; n3 < this.bg[0].length; ++n3) {
                        for (n2 = 0; n2 < byArray2.length; ++n2) {
                            byArray2[n2] = byArray[n6++];
                        }
                        this.bg[0][n3] = (int)gameutils.a.a(byArray2);
                    }
                    switch (this.bA) {
                        case 1: {
                            byte by = this.bA;
                            this.aG[by] = (byte)(this.aG[by] + 1);
                            if (this.aG[this.bA] < 1) break;
                            switch (this.am[this.bA]) {
                                case 2: {
                                    this.am[this.bA] = 0;
                                    break;
                                }
                                case 3: {
                                    this.am[this.bA] = 0;
                                }
                            }
                            this.ap.af[0] = this.ap.af[1];
                            com.cwa.gamelib.d.a(this.ap, (byte)3);
                            this.ap.aV = 0;
                            this.ap.ap = 0;
                            this.ap.i = 0;
                            this.ap.Z = true;
                            this.ap.an[8] = true;
                            this.ap.an[2] = true;
                            this.aG[this.bA] = 1;
                            this.bh[69] = 1;
                            this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
                            break;
                        }
                        case 2: {
                            byte by = this.bA;
                            this.aG[by] = (byte)(this.aG[by] + 1);
                            this.ap.P[2] = (short)(this.ap.P[2] + 10);
                            this.ap.P[3] = (short)(this.ap.P[3] + 10);
                            this.ap.P[4] = (short)(this.ap.P[4] + 10);
                            this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
                            break;
                        }
                        case 3: {
                            byte by = this.bA;
                            this.aG[by] = (byte)(this.aG[by] + 1);
                            this.ap.af[1] = this.ap.af[1] + 100;
                            this.ap.af[0] = this.ap.af[0] + 100;
                            int[] nArray = com.cwa.gamelib.b.x[0];
                            nArray[1] = nArray[1] + 20;
                            int[] nArray2 = com.cwa.gamelib.b.bB[0];
                            nArray2[1] = nArray2[1] + 10;
                            break;
                        }
                        case 4: {
                            byte by = this.bA;
                            this.aG[by] = (byte)(this.aG[by] + 1);
                            this.ap.P[2] = (short)(this.ap.P[2] + 30);
                            this.ap.P[3] = (short)(this.ap.P[3] + 30);
                            this.ap.P[4] = (short)(this.ap.P[4] + 30);
                            break;
                        }
                        case 5: {
                            byte by = this.bA;
                            this.aG[by] = (byte)(this.aG[by] + 1);
                            this.am[this.bA] = 0;
                            this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
                            this.ap.af[1] = this.ap.af[1] + 100;
                            this.ap.af[0] = this.ap.af[0] + 100;
                            this.ap.af[0] = this.ap.af[1];
                            com.cwa.gamelib.d.a(this.ap, (byte)3);
                            this.ap.aV = 0;
                            this.ap.ap = 0;
                            this.ap.i = 0;
                            this.ap.Z = true;
                            this.ap.an[8] = true;
                            this.ap.an[2] = true;
                        }
                    }
                    for (n3 = 0; n3 < this.ap.P.length; ++n3) {
                        if (this.ap.P[n3] > 99) {
                            this.ap.P[n3] = 99;
                        }
                        if (this.ap.P[n3] > 0 && this.bh[n3] == 0) {
                            this.bh[n3] = 1;
                            if (this.bg[0][228 + n3] == 0) {
                                this.bg[0][228 + n3] = 1;
                            }
                        }
                        if (this.bh[n3] <= 0 || this.ap.P[n3] != 0) continue;
                        this.ap.P[n3] = 1;
                        if (this.bg[0][3 + n3] != 0) continue;
                        this.bg[0][3 + n3] = 1;
                    }
                    switch (this.bA) {
                        case 1: {
                            this.bg[0][297] = this.bh[69];
                            break;
                        }
                        case 2: {
                            this.bg[0][5] = this.ap.P[2];
                            this.bg[0][6] = this.ap.P[3];
                            this.bg[0][7] = this.ap.P[4];
                            break;
                        }
                        case 3: {
                            this.bg[0][112] = this.ap.af[1];
                            this.bg[0][109] = com.cwa.gamelib.b.x[0][1];
                            this.bg[0][108] = com.cwa.gamelib.b.bB[0][1];
                            break;
                        }
                        case 4: {
                            this.bg[0][5] = this.ap.P[2];
                            this.bg[0][6] = this.ap.P[3];
                            this.bg[0][7] = this.ap.P[4];
                            break;
                        }
                        case 5: {
                            this.bg[0][112] = this.ap.af[1];
                        }
                    }
                    n6 = 1;
                    for (n3 = 0; n3 < this.bg[0].length; ++n3) {
                        byArray2 = gameutils.a.a((long)this.bg[0][n3], 4);
                        for (n2 = 0; n2 < byArray2.length; ++n2) {
                            byArray[n6++] = byArray2[n2];
                        }
                    }
                    if (b2.a() == 0) {
                        b2.a(byArray, 0, byArray.length);
                    } else {
                        b2.a(1, byArray, 0, byArray.length);
                    }
                    b2.b();
                    b2 = null;
                }
                this.F();
                this.aw = true;
            }
            this.d(this.A, 20);
            this.cg = 0;
            this.aL = true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void B(int n) {
        switch (n) {
            case 1: {
                this.bh[69] = 1;
                this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
                break;
            }
            case 2: {
                this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
                break;
            }
            case 5: {
                this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
            }
        }
        for (int j = 0; j < this.ap.P.length; ++j) {
            if (this.bh[j] <= 0 || this.ap.P[j] != 0) continue;
            this.ap.P[j] = 1;
        }
    }

    public void r(int n) {
        if (this.aL) {
            if (this.l(-6) == 1 || this.l(-5) == 1 || this.l(53) == 1) {
                this.cg = 1;
            }
            if (this.l(-7) == 1) {
                this.C();
            }
            this.a(n, 0);
        }
    }

    public void h(int n) {
        if (this.l(-6) == 1 || this.l(-5) == 1 || this.l(53) == 1) {
            byte by = this.ba[this.bM[this.aZ][this.bf[this.aZ]][2]];
            if (by != 1 || by == 1 && this.aG[1] < 1) {
                this.a((int)by, (byte)4, (byte)19);
                this.am[by] = 1;
            }
            if (by == 1 && this.aG[1] >= 1) {
                this.ah[122] = 1;
                if (this.au == null) {
                    this.au = gameutils.a.c("/data/gamesecret.mid");
                }
                this.ah[123] = (short)((this.au.length + this.E - 1) / this.E);
                this.a((int)by, (byte)4, (byte)21);
            }
        }
        if (this.l(-7) == 1) {
            this.o();
            this.w();
            this.d(this.bl, 7);
            this.l = false;
        }
        this.a(n, 0);
    }

    public void a(int n) {
        if (this.l(-6) == 1 || this.l(-5) == 1 || this.l(53) == 1) {
            if (this.aw) {
                if (this.bI[this.bA - 1] > 0) {
                    this.cg = 1;
                } else {
                    this.C();
                    this.aw = false;
                    this.bI[this.bA - 1] = this.bA == 1 ? 4 : 2;
                }
                this.F();
            } else {
                this.a((int)this.bA, (byte)4, (byte)19);
            }
        }
        if (this.l(-7) == 1 && (this.bA == 1 && this.aG[1] < 1 || this.bA != 1 && this.bI[this.bA - 1] > 0)) {
            this.C();
        }
        this.a(n, 0);
    }

    public void u(int n) {
        switch (n) {
            case -3: 
            case 52: {
                this.a(n, 0);
                if (this.ah[122] - 1 <= 0) break;
                this.ah[122] = (short)(this.ah[122] - 1);
                break;
            }
            case -4: 
            case 54: {
                this.a(n, 0);
                if (this.ah[122] + 1 > this.ah[123]) break;
                this.ah[122] = (short)(this.ah[122] + 1);
                break;
            }
            case -7: {
                this.a(n, 0);
                this.a((int)this.bA, (byte)4, (byte)18);
            }
        }
    }

    public void D() {
        if (this.cg == 1) {
            try {
                String[][] stringArray = gameutils.a.j();
                String string = "0" + this.bA;
                this.aP.a(stringArray[0][1], stringArray[0][0] + "016" + string + GMIDlet.b, null);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.cg = (byte)2;
            this.aL = false;
        }
    }

    public void a(int n, byte by, byte by2) {
        this.a(this.ca, 0);
        this.bA = (byte)n;
        this.l = true;
        this.i();
        if (by2 == 19) {
            this.s[this.bA] = gameutils.a.b((byte)(this.bA - 1));
        }
        this.d(this.bl, by);
        this.d(this.A, by2);
    }

    public void f() {
        this.B();
        for (int j = 0; j < this.aG.length; ++j) {
            if (this.aG[j] > 0) {
                this.B(j);
            }
            this.I(j);
        }
    }

    public void B() {
        byte[] byArray = new byte[this.aG.length + this.bI.length];
        gameutils.b b2 = new gameutils.b("save_c");
        if (b2.a() == 0) {
            b2.a(byArray, 0, byArray.length);
        } else {
            int n;
            byArray = b2.a(1);
            int n2 = 0;
            for (n = 0; n < this.aG.length; ++n) {
                this.aG[n] = byArray[n2++];
            }
            for (n = 0; n < this.bI.length; ++n) {
                this.bI[n] = byArray[n2++];
            }
        }
        b2.b();
        b2 = null;
        this.cc = 10 + this.aG[1] * 5 + this.aG[2] * 10 + this.aG[5] * 3;
    }

    public void F() {
        int n;
        byte[] byArray = new byte[this.aG.length + this.bI.length];
        int n2 = 0;
        for (n = 0; n < this.aG.length; ++n) {
            byArray[n2++] = this.aG[n];
        }
        for (n = 0; n < this.bI.length; ++n) {
            byArray[n2++] = this.bI[n];
        }
        gameutils.b b2 = new gameutils.b("save_c");
        if (b2.a() == 0) {
            b2.a(byArray, 0, byArray.length);
        } else {
            b2.a(1, byArray, 0, byArray.length);
        }
        b2.b();
        b2 = null;
    }

    public void k() {
        try {
            this.aP = new com.sina.utils.wma.b(this);
            this.aP.a("sms://");
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return;
        }
    }

    public void i(int n) {
        if (this.l(-6) == 1 || this.l(-5) == 1 || this.l(53) == 1) {
            this.bM[this.aZ][this.bf[this.aZ]][2] = 1;
            this.d(this.A, 18);
        }
        if (this.l(-7) == 1) {
            this.o();
            this.w();
            this.d(this.bl, 7);
            this.l = false;
        }
        this.a(n, 0);
    }

    public void C() {
        switch (this.am[this.bA]) {
            case 0: {
                this.o();
                this.w();
                this.d(this.bl, 7);
                this.l = false;
                break;
            }
            case 1: {
                this.a((int)this.bA, (byte)4, (byte)18);
                break;
            }
            case 2: {
                this.aT = 0;
                this.c(23);
                this.d(this.bl, 4);
                this.d(this.A, 0);
                this.d(this.bM[this.aZ][this.bf[this.aZ]], 0);
                this.bM[this.aZ][this.bf[this.aZ]][2] = (byte)this.a((int)this.bM[this.aZ][this.bf[this.aZ]][0], this.be);
                this.ah[5] = 6;
                this.a(8, -1, 1);
                break;
            }
            case 3: {
                this.d(this.bl, 14);
                break;
            }
            case 4: {
                this.ah[122] = 1;
                if (this.au == null) {
                    this.au = gameutils.a.c("/data/gamesecret.mid");
                }
                this.ah[123] = (short)((this.au.length + this.E - 1) / this.E);
                this.a((int)this.bA, (byte)4, (byte)21);
                break;
            }
            case 5: {
                this.d(this.bl, 4);
                this.d(this.A, 15);
            }
        }
    }

    public void I(int n) {
        switch (n) {
            case 1: {
                if ((this.aG[n] != 0 || this.bI[n - 1] != 0) && (this.aG[n] != 1 || this.bI[n - 1] != 0)) break;
                this.bI[n - 1] = 4;
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                if (this.aG[n] != 0 || this.bI[n - 1] != 0) break;
                this.bI[n - 1] = 2;
            }
        }
    }

    static {
        G = new int[2];
        ai = new int[4];
        bn = new Image[6][];
        b = new Image[9][][];
        aD = new Image[9][][];
        k = new Image[9][][];
        aO = new Image[6][];
    }
}


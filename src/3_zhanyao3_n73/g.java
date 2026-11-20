/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g {
    public static byte[] o = new byte[]{0, 1, -1};
    public static Font[] a = new Font[]{Font.getFont((int)0, (int)0, (int)8), Font.getFont((int)0, (int)0, (int)0), Font.getFont((int)0, (int)0, (int)16)};
    private static Random a = new Random();
    private static int[] a = new int[]{0, 5, 3, 6, 2, 4, 1, 7};
    public static int[] o = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
    private static Random b = new Random();
    public static final int[][] c = new int[][]{{65536, 0}, {63303, 16962}, {56756, 32768}, {46341, 46341}, {32768, 56756}, {16962, 63303}, {0, 65536}, {-16962, 63303}, {Short.MIN_VALUE, 56756}, {-46341, 46341}, {-56756, 32768}, {-63303, 16962}, {-65536, 0}, {-63303, -16962}, {-56756, Short.MIN_VALUE}, {-46341, -46341}, {Short.MIN_VALUE, -56756}, {-16962, -63303}, {0, -65536}, {16962, -63303}, {37590, -53684}, {46341, -46341}, {56756, Short.MIN_VALUE}, {63303, -16962}, {65536, 0}};
    private static int[] b;

    public static int[] a(int n2, int n3, int n4, int n5) {
        int[] nArray = new int[]{n2, n3, n2 + n4 - 1, n3, n2 + n4 - 1, n3 - n5 + 1, n2, n3 - n5 + 1};
        return nArray;
    }

    public static void a(byte[] byArray, int n2) {
        byArray[1] = byArray[0];
        byArray[0] = (byte)n2;
    }

    public static void a(int[] nArray, int n2) {
        nArray[1] = nArray[0];
        nArray[0] = n2;
    }

    public static int a(long l2) {
        int n2 = 0;
        for (int i2 = 0x100000; i2 != 0; i2 >>= 2) {
            int n3 = n2 + i2;
            n2 >>= 1;
            if ((long)n3 > l2) continue;
            l2 -= (long)n3;
            n2 += i2;
        }
        return n2;
    }

    public static int a(int n2) {
        return n2 * n2;
    }

    public static int a(int n2, int n3) {
        n2 = 1;
        for (n3 = 0; n3 < 16; ++n3) {
            n2 <<= 1;
        }
        return n2;
    }

    public static void a(int n2, int n3, int n4, int n5, Graphics graphics) {
        graphics.setColor(n5);
        graphics.drawRoundRect(n2 - n4, n3 - n4, n4 + n4, n4 + n4, n4 + n4, n4 + n4);
    }

    public static byte[] a(long l2, int n2) {
        byte[] byArray = null;
        byArray = new byte[4];
        int n3 = 3;
        int n4 = 0;
        while (n3 >= 0) {
            byArray[n4] = (byte)(l2 >> (n3 << 3) & 0xFFL);
            --n3;
            ++n4;
        }
        return byArray;
    }

    public static long a(byte[] byArray) {
        long l2 = 0L;
        if (byArray == null) {
            return -2147483647L;
        }
        int n2 = byArray.length;
        int n3 = n2 - 1;
        int n4 = 0;
        while (n3 >= 0) {
            switch (n2) {
                case 1: {
                    l2 += (long)((byte)((byArray[n4] & 0xFF) << (n3 << 3)));
                    break;
                }
                case 2: {
                    l2 += (long)((short)((byArray[n4] & 0xFF) << (n3 << 3)));
                    break;
                }
                case 4: {
                    l2 += (long)((byArray[n4] & 0xFF) << (n3 << 3));
                    break;
                }
                case 8: {
                    l2 += (long)((byArray[n4] & 0xFF) << (n3 << 3));
                }
            }
            --n3;
            ++n4;
        }
        return l2;
    }

    protected static long b(byte[] byArray) {
        int n2 = 0;
        int n3 = byArray.length;
        block6: for (int i2 = 0; i2 < n3; ++i2) {
            switch (n3) {
                case 1: {
                    n2 += (byte)((byArray[i2] & 0xFF) << (i2 << 3));
                    continue block6;
                }
                case 2: {
                    n2 += (short)((byArray[i2] & 0xFF) << (i2 << 3));
                    continue block6;
                }
                case 4: {
                    n2 += (byArray[i2] & 0xFF) << (i2 << 3);
                    continue block6;
                }
                case 8: {
                    n2 = (int)((long)n2 + (long)((byArray[i2] & 0xFF) << (i2 << 3)));
                }
            }
        }
        return n2;
    }

    public static byte[][][] a(String object) {
        byte[][][] byArrayArray = null;
        int n2 = 0;
        try {
            object = "".getClass().getResourceAsStream((String)object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            n2 = dataInputStream.readShort();
            if (n2 > 0) {
                byArrayArray = new byte[n2][][];
            }
            for (int i2 = 0; i2 < byArrayArray.length; ++i2) {
                n2 = dataInputStream.readShort();
                byArrayArray[i2] = new byte[n2][];
                for (int i3 = 0; i3 < byArrayArray[i2].length; ++i3) {
                    n2 = dataInputStream.readShort();
                    byArrayArray[i2][i3] = new byte[n2];
                    for (int i4 = 0; i4 < n2; ++i4) {
                        byArrayArray[i2][i3][i4] = dataInputStream.readByte();
                    }
                }
            }
            ((InputStream)object).close();
        }
        catch (Exception exception) {}
        return byArrayArray;
    }

    public static byte[][][][] a(String object) {
        byte[][][][] byArrayArray = null;
        int n2 = 0;
        try {
            object = "".getClass().getResourceAsStream((String)object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            n2 = dataInputStream.readShort();
            if (n2 > 0) {
                byArrayArray = new byte[n2][][][];
            }
            for (int i2 = 0; i2 < byArrayArray.length; ++i2) {
                n2 = dataInputStream.readShort();
                byArrayArray[i2] = new byte[n2][][];
                for (int i3 = 0; i3 < byArrayArray[i2].length; ++i3) {
                    n2 = dataInputStream.readShort();
                    byArrayArray[i2][i3] = new byte[n2][];
                    for (int i4 = 0; i4 < byArrayArray[i2][i3].length; ++i4) {
                        n2 = dataInputStream.readShort();
                        byArrayArray[i2][i3][i4] = new byte[n2];
                        for (int i5 = 0; i5 < n2; ++i5) {
                            byArrayArray[i2][i3][i4][i5] = dataInputStream.readByte();
                        }
                    }
                }
            }
            ((InputStream)object).close();
        }
        catch (Exception exception) {}
        return byArrayArray;
    }

    public static short[][][] a(InputStream inputStream) {
        short[][][] sArrayArray = null;
        int n2 = 0;
        if (inputStream == null) {
            return null;
        }
        try {
            inputStream = new DataInputStream(inputStream);
            n2 = ((DataInputStream)inputStream).readShort();
            if (n2 >= 0) {
                sArrayArray = new short[n2][][];
            }
            for (int i2 = 0; i2 < sArrayArray.length; ++i2) {
                n2 = ((DataInputStream)inputStream).readShort();
                sArrayArray[i2] = new short[n2][];
                for (int i3 = 0; i3 < sArrayArray[i2].length; ++i3) {
                    n2 = ((DataInputStream)inputStream).readShort();
                    sArrayArray[i2][i3] = new short[n2];
                    for (int i4 = 0; i4 < n2; ++i4) {
                        sArrayArray[i2][i3][i4] = ((DataInputStream)inputStream).readShort();
                    }
                }
            }
        }
        catch (Exception exception) {}
        return sArrayArray;
    }

    public static byte[][] a(String object) {
        byte[][] byArrayArray = null;
        int n2 = 0;
        try {
            object = "".getClass().getResourceAsStream((String)object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            n2 = dataInputStream.readShort();
            if (n2 >= 0) {
                byArrayArray = new byte[n2][];
            }
            for (int i2 = 0; i2 < byArrayArray.length; ++i2) {
                n2 = dataInputStream.readShort();
                byArrayArray[i2] = new byte[n2];
                for (n2 = 0; n2 < byArrayArray[i2].length; ++n2) {
                    byArrayArray[i2][n2] = dataInputStream.readByte();
                }
            }
            ((InputStream)object).close();
        }
        catch (Exception exception) {}
        return byArrayArray;
    }

    public static InputStream a(String string) {
        try {
            return "".getClass().getResourceAsStream(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static short[][] a(InputStream inputStream) {
        short[][] sArrayArray = null;
        int n2 = 0;
        if (inputStream == null) {
            return null;
        }
        try {
            inputStream = new DataInputStream(inputStream);
            n2 = ((DataInputStream)inputStream).readShort();
            if (n2 >= 0) {
                sArrayArray = new short[n2][];
            }
            for (int i2 = 0; i2 < sArrayArray.length; ++i2) {
                n2 = ((DataInputStream)inputStream).readShort();
                sArrayArray[i2] = new short[n2];
                for (n2 = 0; n2 < sArrayArray[i2].length; ++n2) {
                    sArrayArray[i2][n2] = ((DataInputStream)inputStream).readShort();
                }
            }
        }
        catch (Exception exception) {}
        return sArrayArray;
    }

    public static int[][] a(String object) {
        int[][] nArrayArray = null;
        int n2 = 0;
        try {
            object = "".getClass().getResourceAsStream((String)object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            n2 = dataInputStream.readShort();
            if (n2 >= 0) {
                nArrayArray = new int[n2][];
            }
            for (int i2 = 0; i2 < nArrayArray.length; ++i2) {
                n2 = dataInputStream.readShort();
                nArrayArray[i2] = new int[n2];
                for (n2 = 0; n2 < nArrayArray[i2].length; ++n2) {
                    nArrayArray[i2][n2] = dataInputStream.readInt();
                }
            }
            ((InputStream)object).close();
        }
        catch (Exception exception) {}
        return nArrayArray;
    }

    public static int a(byte by, byte[] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (by != byArray[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int a(char c2, char[] cArray) {
        for (int i2 = 0; i2 < cArray.length; ++i2) {
            if (c2 != cArray[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int a(int n2, int[] nArray) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (n2 != nArray[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static Image a(String string) {
        try {
            return Image.createImage((String)string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        graphics.drawRegion(image, n6, n7, n8, n9, a[n5], n2, n3, 20);
    }

    public static int b(int n2) {
        return a.nextInt() % n2;
    }

    public static int c(int n2) {
        return (b.nextInt() & Integer.MAX_VALUE) % n2;
    }

    public static int d(int n2) {
        return ("" + n2).length();
    }

    public static int e(int n2) {
        int n3 = 1;
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            n3 *= 10;
        }
        return n3;
    }

    public static int a(Font font) {
        return font.stringWidth("\u5b57");
    }

    public static String[][] a(String object) {
        String[][] stringArrayArray = null;
        StringBuffer stringBuffer = new StringBuffer();
        short s = 0;
        int n2 = 0;
        try {
            object = "".getClass().getResourceAsStream((String)object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            s = dataInputStream.readShort();
            if (s > 0) {
                stringArrayArray = new String[s][];
            }
            for (int i2 = 0; i2 < stringArrayArray.length; ++i2) {
                s = dataInputStream.readShort();
                stringArrayArray[i2] = new String[s];
                for (int i3 = 0; i3 < stringArrayArray[i2].length; ++i3) {
                    n2 = dataInputStream.readByte();
                    for (int i4 = 0; i4 < n2; ++i4) {
                        s = dataInputStream.readShort();
                        stringBuffer.append((char)s);
                    }
                    stringArrayArray[i2][i3] = stringBuffer.toString();
                    stringBuffer = new StringBuffer();
                }
            }
            ((InputStream)object).close();
        }
        catch (Exception exception) {}
        return stringArrayArray;
    }

    public static int f(int n2) {
        if (n2 > 1 || n2 < -1) {
            return n2;
        }
        return n2;
    }

    public final Image b(String object) {
        Image image = null;
        int n2 = 0;
        n2 = 0;
        int n3 = 0;
        byte[] byArray = null;
        int[][] nArray = new int[4][2];
        try {
            int n4;
            object = "".getClass().getResourceAsStream((String)object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(g.a(-1991225785L, 4));
            byteArrayOutputStream.write(g.a(218765834L, 4));
            byteArrayOutputStream.write(g.a(13L, 4));
            byteArrayOutputStream.write(g.a(1229472850L, 4));
            byteArrayOutputStream.write(g.a((long)dataInputStream.readInt(), 4));
            byteArrayOutputStream.write(g.a((long)dataInputStream.readInt(), 4));
            byteArrayOutputStream.write(dataInputStream.readByte());
            byteArrayOutputStream.write(g.a(0x3000000L, 4));
            byteArrayOutputStream.write(g.a(0L, 4));
            nArray[0][0] = 8;
            nArray[0][1] = 13;
            n3 = 8 + (nArray[0][1] + 12);
            n2 = dataInputStream.readInt();
            byteArrayOutputStream.write(g.a((long)n2, 4));
            byteArrayOutputStream.write(g.a(1347179589L, 4));
            byArray = new byte[n2];
            for (n4 = 0; n4 < byArray.length; ++n4) {
                byArray[n4] = (byte)dataInputStream.read();
            }
            byteArrayOutputStream.write(byArray);
            byteArrayOutputStream.write(g.a(0L, 4));
            nArray[1][0] = n3;
            nArray[1][1] = n2;
            n3 += nArray[1][1] + 12;
            n2 = dataInputStream.readInt();
            if (n2 == 1951551059) {
                n2 = dataInputStream.read();
                if (n2 == 0) {
                    n2 = 256;
                }
                byteArrayOutputStream.write(g.a((long)n2, 4));
                byteArrayOutputStream.write(g.a(1951551059L, 4));
                n4 = dataInputStream.read();
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (i2 == n4) {
                        byteArrayOutputStream.write(0);
                        continue;
                    }
                    byteArrayOutputStream.write(255);
                }
                byteArrayOutputStream.write(g.a(0L, 4));
                nArray[2][0] = n3;
                nArray[2][1] = n2;
                n3 += nArray[2][1] + 12;
                n2 = dataInputStream.readInt();
            } else {
                nArray[2][0] = n3;
                nArray[2][1] = n2;
            }
            byteArrayOutputStream.write(g.a((long)n2, 4));
            byteArrayOutputStream.write(g.a(1229209940L, 4));
            byte[] byArray2 = new byte[n2];
            for (n4 = 0; n4 < byArray2.length; ++n4) {
                byArray2[n4] = (byte)dataInputStream.read();
            }
            byteArrayOutputStream.write(byArray2);
            byteArrayOutputStream.write(g.a(0L, 4));
            nArray[3][0] = n3;
            nArray[3][1] = n2;
            byteArrayOutputStream.write(g.a(0L, 4));
            byteArrayOutputStream.write(g.a(1229278788L, 4));
            byteArrayOutputStream.write(g.a(-1371381630L, 4));
            byte[] byArray3 = byteArrayOutputStream.toByteArray();
            for (int i3 = 0; i3 < nArray.length; ++i3) {
                int n5;
                int n6 = nArray[i3][1];
                int n7 = nArray[i3][0];
                byte[] byArray4 = byArray3;
                Object object2 = this;
                int n8 = n6 + 4;
                int n9 = n7 + 4;
                object2 = byArray4;
                object2 = byArray4;
                int n10 = -1;
                if (b == null) {
                    b = new int[256];
                    for (int i4 = 0; i4 < 256; ++i4) {
                        n5 = i4;
                        for (int i5 = 0; i5 < 8; ++i5) {
                            if ((n5 & 1) == 1) {
                                n5 = 0xEDB88320 ^ n5 >>> 1;
                                continue;
                            }
                            n5 >>>= 1;
                        }
                        g.b[i4] = n5;
                    }
                }
                for (n5 = n9; n5 < n8 + n9; ++n5) {
                    n10 = b[(n10 ^ object2[n5]) & 0xFF] ^ n10 >>> 8;
                }
                n2 = ~n10;
                byArray4[n7 + 8 + n6] = (byte)(n2 >>> 24);
                byArray4[n7 + 8 + n6 + 1] = (byte)(n2 >> 16);
                byArray4[n7 + 8 + n6 + 2] = (byte)(n2 >> 8);
                byArray4[n7 + 8 + n6 + 3] = (byte)n2;
            }
            image = Image.createImage((byte[])byArray3, (int)0, (int)byArray3.length);
            ((InputStream)object).close();
            byteArrayOutputStream.close();
        }
        catch (Exception exception) {}
        return image;
    }

    public static boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        return n2 + n4 >= n6 && n3 + n5 >= n7 && n6 + n8 >= n2 && n7 + n9 >= n3;
    }
}


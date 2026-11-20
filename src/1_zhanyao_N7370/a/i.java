/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.d;
import a.k;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class i
implements k,
d {
    private static Random ln = new Random();
    public static final int[] lw = new int[]{0, 5, 3, 6, 2, 7, 1, 4};
    public static final int lr = 0;
    public static final int lu = 1;
    public static final int lp = 2;
    public static final int ly = 3;
    public static final int lt = 4;
    public static final int lm = 5;
    public static final int lk = 6;
    public static final int ls = 7;
    public static int[][] lj = new int[][]{{1, 0, 0, 0, 1, 0}, {0, -1, 0, 1, 0, 0}, {-1, 0, 0, 0, -1, 0}, {0, 1, 0, -1, 0, 0}, {-1, 0, 0, 0, 1, 0}, {0, -1, 0, -1, 0, 0}, {1, 0, 0, 0, -1, 0}, {0, 1, 0, 1, 0, 0}};
    public static int[][][] lv = new int[][][]{new int[][]{{1, 0, 0}, {0, 1, 0}}, new int[][]{{0, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {0, -1, 0}}, new int[][]{{0, 1, 0}, {-1, 0, 0}}, new int[][]{{-1, 0, 0}, {0, 1, 0}}, new int[][]{{0, -1, 0}, {-1, 0, 0}}, new int[][]{{1, 0, 0}, {0, -1, 0}}, new int[][]{{0, 1, 0}, {1, 0, 0}}};
    public static int lq = 0;
    public static int lo = -1;
    public static int lx;
    public static int lz;
    static Random ll;

    public static void a(Object object) {
        System.out.print(object);
    }

    public static void if(Object object) {
    }

    public static int[] if(int n, int n2, int n3, int n4) {
        int[] nArray = new int[]{n, n2, n + n3 - 1, n2, n + n3 - 1, n2 - n4 + 1, n, n2 - n4 + 1};
        return nArray;
    }

    public static void a(byte[] byArray, int n) {
        byArray[1] = byArray[0];
        byArray[0] = (byte)n;
    }

    public static void a(int[] nArray, int n) {
        nArray[1] = nArray[0];
        nArray[0] = n;
    }

    public static int a(long l) {
        int n = 0;
        for (int i2 = 0x100000; i2 != 0; i2 >>= 2) {
            int n2 = n + i2;
            n >>= 1;
            if ((long)n2 > l) continue;
            l -= (long)n2;
            n += i2;
        }
        return n;
    }

    public static String do() {
        long l = 0L;
        System.gc();
        return "FreeMem : " + (Runtime.getRuntime().freeMemory() >> 10) + "k";
    }

    public static String for() {
        System.gc();
        return "TotaMem : " + (Runtime.getRuntime().totalMemory() >> 10) + "k";
    }

    public static String a() {
        System.gc();
        return "UsedMem : " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() >> 10) + "k";
    }

    public static int try(int n) {
        return n * n;
    }

    public static int a(int n, int n2) {
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 *= n;
        }
        return n3;
    }

    public static void a(String string, int n, int n2, int n3, Graphics graphics, Font font, int n4, int n5) {
        int n6 = graphics.getColor();
        graphics.setFont(font);
        int[][] nArrayArray = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        graphics.setColor(n4);
        for (int i2 = 0; i2 < nArrayArray.length; ++i2) {
            graphics.drawString(string, n + nArrayArray[i2][0], n2 + nArrayArray[i2][1], n3);
        }
        graphics.setColor(n5);
        graphics.drawString(string, n, n2, n3);
        graphics.setColor(n6);
    }

    public static void a(String[] stringArray) {
        int n = -1;
        int n2 = 10;
        String string = "";
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            n = stringArray[i2].indexOf("%%");
            while (n >= 0) {
                if (n == 0) {
                    stringArray[i2] = stringArray[i2].substring(n + n2, stringArray[i2].length());
                } else {
                    string = stringArray[i2].substring(0, n - 1);
                    stringArray[i2] = string + stringArray[i2].substring(n + n2, stringArray[i2].length());
                }
                n = stringArray[i2].indexOf("%%");
            }
        }
    }

    public static void a(int n, int n2, int n3, int n4, Graphics graphics) {
        graphics.setColor(n4);
        graphics.drawRoundRect(n - n3, n2 - n3, n3 + n3, n3 + n3, n3 + n3, n3 + n3);
    }

    public static String[] a(int n, int n2, int n3, int n4, int n5, Font font, String string) {
        String[] stringArray = new String[50];
        int n6 = font.getHeight() + 2;
        char[] cArray = new char[1];
        int n7 = 0;
        lx = n4 / n6;
        String[] stringArray2 = null;
        if (lo < 0) {
            lo = 0;
            int n8 = 0;
            stringArray[i.lo] = "";
            for (int i2 = 0; i2 < string.length(); ++i2) {
                cArray[0] = string.charAt(i2);
                String string2 = new String(cArray);
                int n9 = lo;
                stringArray[n9] = stringArray[n9] + string2;
                if (string2.equals("#")) {
                    if (++n8 == 2) {
                        if (!stringArray[lo].equals("##")) {
                            stringArray[i.lo] = stringArray[lo].substring(0, stringArray[lo].length() - 2);
                            stringArray[++i.lo] = "";
                        }
                        ++n7;
                        n8 = 0;
                    }
                } else {
                    n8 = 0;
                }
                if (font.stringWidth(stringArray[lo]) <= n3) continue;
                stringArray[++i.lo] = "";
                int n10 = lo;
                stringArray[n10] = stringArray[n10] + stringArray[lo - 1].substring(stringArray[lo - 1].length() - 1, stringArray[lo - 1].length());
                stringArray[i.lo - 1] = stringArray[lo - 1].substring(0, stringArray[lo - 1].length() - 1);
            }
            lq = (lo + 1) / lx;
            if ((lo + 1) % lx != 0) {
                ++lq;
            }
            stringArray2 = new String[lo + 1];
            for (int i3 = 0; i3 < stringArray2.length; ++i3) {
                stringArray2[i3] = stringArray[i3];
            }
        }
        return stringArray2;
    }

    public static void a(int n) {
    }

    public static byte[] a(long l, int n) {
        byte[] byArray = null;
        byArray = new byte[n];
        int n2 = n - 1;
        int n3 = 0;
        while (n2 >= 0) {
            byArray[n3] = (byte)(l >> n2 * 8 & 0xFFL);
            --n2;
            ++n3;
        }
        return byArray;
    }

    public static long if(byte[] byArray) {
        long l = 0L;
        if (byArray == null) {
            return -2147483647L;
        }
        int n = byArray.length;
        int n2 = n - 1;
        int n3 = 0;
        while (n2 >= 0) {
            switch (n) {
                case 1: {
                    l += (long)((byte)((byArray[n3] & 0xFF) << n2 * 8));
                    break;
                }
                case 2: {
                    l += (long)((short)((byArray[n3] & 0xFF) << n2 * 8));
                    break;
                }
                case 4: {
                    l += (long)((byArray[n3] & 0xFF) << n2 * 8);
                    break;
                }
                case 8: {
                    l += (long)((byArray[n3] & 0xFF) << n2 * 8);
                }
            }
            --n2;
            ++n3;
        }
        return l;
    }

    protected static long a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        block6: for (int i2 = 0; i2 < n2; ++i2) {
            switch (n2) {
                case 1: {
                    n += (byte)((byArray[i2] & 0xFF) << i2 * 8);
                    continue block6;
                }
                case 2: {
                    n += (short)((byArray[i2] & 0xFF) << i2 * 8);
                    continue block6;
                }
                case 4: {
                    n += (byArray[i2] & 0xFF) << i2 * 8;
                    continue block6;
                }
                case 8: {
                    n = (int)((long)n + (long)((byArray[i2] & 0xFF) << i2 * 8));
                }
            }
        }
        return n;
    }

    public static byte[][][] try(String string) {
        Object object = null;
        int n = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            n = dataInputStream.readShort();
            if (n > 0) {
                object = new byte[n][][];
            }
            for (int i2 = 0; i2 < ((byte[][][])object).length; ++i2) {
                n = dataInputStream.readShort();
                object[i2] = new byte[n][];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    n = dataInputStream.readShort();
                    object[i2][i3] = new byte[n];
                    for (int i4 = 0; i4 < n; ++i4) {
                        object[i2][i3][i4] = dataInputStream.readByte();
                    }
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static byte[][][][] a(String string) {
        Object object = null;
        int n = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            n = dataInputStream.readShort();
            if (n > 0) {
                object = new byte[n][][][];
            }
            for (int i2 = 0; i2 < ((byte[][][][])object).length; ++i2) {
                n = dataInputStream.readShort();
                object[i2] = new byte[n][][];
                for (int i3 = 0; i3 < ((byte[][][][])object).length; ++i3) {
                    n = dataInputStream.readShort();
                    object[i2][i3] = new byte[n][];
                    for (int i4 = 0; i4 < object[i2].length; ++i4) {
                        n = dataInputStream.readShort();
                        object[i2][i3][i4] = new byte[n];
                        for (int i5 = 0; i5 < n; ++i5) {
                            object[i2][i3][i4][i5] = dataInputStream.readByte();
                        }
                    }
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static short[][][] int(InputStream inputStream) {
        Object object = null;
        int n = 0;
        try {
            if (inputStream == null) {
                return object;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            n = dataInputStream.readShort();
            if (n >= 0) {
                object = new short[n][][];
            }
            for (int i2 = 0; i2 < ((short[][][])object).length; ++i2) {
                n = dataInputStream.readShort();
                object[i2] = new short[n][];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    n = dataInputStream.readShort();
                    object[i2][i3] = new short[n];
                    for (int i4 = 0; i4 < n; ++i4) {
                        object[i2][i3][i4] = dataInputStream.readShort();
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static short[][][][] do(InputStream inputStream) {
        Object object = null;
        int n = 0;
        try {
            if (inputStream == null) {
                return object;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            n = dataInputStream.readShort();
            if (n >= 0) {
                object = new short[n][][][];
            }
            for (int i2 = 0; i2 < ((short[][][][])object).length; ++i2) {
                n = dataInputStream.readShort();
                object[i2] = new short[n][][];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    n = dataInputStream.readShort();
                    object[i2][i3] = new short[n][];
                    for (int i4 = 0; i4 < object[i2][i3].length; ++i4) {
                        n = dataInputStream.readShort();
                        object[i2][i3][i4] = new short[n];
                        for (int i5 = 0; i5 < n; ++i5) {
                            object[i2][i3][i4][i5] = dataInputStream.readShort();
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static int[][][] for(InputStream inputStream) {
        Object object = null;
        int n = 0;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            n = dataInputStream.readShort();
            if (n >= 0) {
                object = new int[n][][];
            }
            for (int i2 = 0; i2 < ((int[][][])object).length; ++i2) {
                n = dataInputStream.readShort();
                object[i2] = new int[n][];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    n = dataInputStream.readShort();
                    object[i2][i3] = new int[n];
                    for (int i4 = 0; i4 < n; ++i4) {
                        object[i2][i3][i4] = dataInputStream.readInt();
                    }
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static byte[][] new(String string) {
        Object object = null;
        short s = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            s = dataInputStream.readShort();
            if (s >= 0) {
                object = new byte[s][];
            }
            for (int i2 = 0; i2 < ((byte[][])object).length; ++i2) {
                s = dataInputStream.readShort();
                object[i2] = new byte[s];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    object[i2][i3] = dataInputStream.readByte();
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static int[] a(InputStream inputStream) {
        int[] nArray = null;
        short s = 0;
        if (inputStream == null) {
            return nArray;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            s = dataInputStream.readShort();
            if (s > 0) {
                nArray = new int[s];
            }
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                nArray[i2] = dataInputStream.readInt();
            }
            dataInputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return nArray;
    }

    public static InputStream int(String string) {
        try {
            return "".getClass().getResourceAsStream(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static short[][] if(InputStream inputStream) {
        Object object = null;
        short s = 0;
        try {
            if (inputStream == null) {
                return object;
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            s = dataInputStream.readShort();
            if (s >= 0) {
                object = new short[s][];
            }
            for (int i2 = 0; i2 < ((short[][])object).length; ++i2) {
                s = dataInputStream.readShort();
                object[i2] = new short[s];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    object[i2][i3] = dataInputStream.readShort();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static int[][] do(String string) {
        Object object = null;
        short s = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            s = dataInputStream.readShort();
            if (s >= 0) {
                object = new int[s][];
            }
            for (int i2 = 0; i2 < ((int[][])object).length; ++i2) {
                s = dataInputStream.readShort();
                object[i2] = new int[s];
                for (int i3 = 0; i3 < object[i2].length; ++i3) {
                    object[i2][i3] = dataInputStream.readInt();
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static int if(byte by, byte[] byArray) {
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (by != byArray[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int a(short s, short[] sArray) {
        for (int i2 = 0; i2 < sArray.length; ++i2) {
            if (s != sArray[i2]) continue;
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

    public static int a(int n, int[] nArray) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (n != nArray[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int a(int n, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = n * 255 / 100;
        int n9 = n2 * 255 / 100;
        int n10 = n3 * 255 / 100;
        int n11 = n4 * 255 / 100;
        n5 = (255 - n8) * (255 - n11) / 255;
        n6 = (255 - n9) * (255 - n11) / 255;
        n7 = (255 - n10) * (255 - n11) / 255;
        return (n5 << 16) + (n6 << 8) + n7;
    }

    public static Image byte(String string) {
        try {
            return Image.createImage((String)string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Image if(int n, int n2) {
        try {
            return Image.createImage((int)n, (int)n2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static Image if(byte[] byArray, int n) {
        Image image = null;
        try {
            image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            int n2 = 0;
            int n3 = 0;
            if (n >= 7 && n <= 5) {
                n2 = image.getWidth();
                n3 = image.getHeight();
            } else {
                n2 = image.getHeight();
                n3 = image.getWidth();
            }
            switch (n) {
                case 0: {
                    return image;
                }
            }
            return image;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void a(Image image, int n, int n2, int n3, int n4, short[][] sArray, int n5, Graphics graphics) {
        i.a(image, sArray[n4][1], sArray[n4][2], sArray[n4][3], sArray[n4][4], n, n2, n3, n5, graphics);
    }

    public static int if(int n, int[] nArray) {
        int n2 = 0;
        for (n2 = 0; n2 < nArray.length; ++n2) {
            if (nArray[n2] != n) continue;
            return n2;
        }
        return -1;
    }

    public static int a(int n, short[] sArray) {
        int n2 = 0;
        for (n2 = 0; n2 < sArray.length; ++n2) {
            if (sArray[n2] != n) continue;
            return n2;
        }
        return -1;
    }

    public static byte a(byte by, byte[] byArray) {
        byte by2 = 0;
        for (by2 = 0; by2 < byArray.length; by2 = (byte)(by2 + 1)) {
            if (byArray[by2] != by) continue;
            return by2;
        }
        return -1;
    }

    public static void a(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Graphics graphics) {
        graphics.drawRegion(image, n, n2, n3, n4, lw[n8], n5, n6, n7);
    }

    public static byte[] a(String string, int n) {
        byte[] byArray = null;
        int n2 = 0;
        int n3 = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(4L);
            n3 = dataInputStream.readInt();
            dataInputStream.skip(n);
            n2 = dataInputStream.readInt();
            byArray = new byte[n2];
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                byArray[i2] = (byte)(dataInputStream.read() ^ n3);
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return byArray;
    }

    public static byte[] a(byte[] byArray, int n, int n2) {
        byte[] byArray2 = null;
        byArray2 = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            byArray2[i2] = byArray[n + i2];
        }
        return byArray2;
    }

    public static void a(int n, int n2, int n3, int n4, int n5, Graphics graphics) {
        graphics.setClip(n, n2, n3, n4);
        graphics.setColor(n5);
        graphics.fillRect(n, n2, n3, n4);
    }

    public static int[] a(Graphics graphics) {
        int[] nArray = new int[]{graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight()};
        return nArray;
    }

    public static int do(int n) {
        return (ln.nextInt() & Integer.MAX_VALUE) % n;
    }

    public static int new(int n) {
        return ln.nextInt() % n;
    }

    public static int if(int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }

    public static int for(int n) {
        int n2 = 0;
        if (n / 1000 >= 1) {
            n2 = 4;
        } else if (n / 100 >= 1) {
            n2 = 3;
        } else if (n / 10 >= 1) {
            n2 = 2;
        } else if (n >= 0) {
            n2 = 1;
        }
        return n2;
    }

    public static int int(int n) {
        int n2 = 1;
        for (int i2 = 0; i2 < n - 1; ++i2) {
            n2 *= 10;
        }
        return n2;
    }

    public static int byte(int n) {
        return Math.abs((ll.nextInt() & Integer.MAX_VALUE) % n);
    }

    public static Image if(String string, int n) {
        DataInputStream dataInputStream = new DataInputStream("".getClass().getResourceAsStream(string));
        byte[] byArray = null;
        try {
            dataInputStream.skip(4L);
            int n2 = 0;
            int n3 = dataInputStream.readInt();
            dataInputStream.skip(n);
            n2 = dataInputStream.readInt();
            byArray = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                byArray[i2] = (byte)(dataInputStream.readByte() ^ n3);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return i.if(byArray, 0);
    }

    public static int a(Font font) {
        return font.stringWidth("\u5b57");
    }

    public static String[][][][] for(String string) {
        String[][][][] stringArray = null;
        StringBuffer stringBuffer = new StringBuffer();
        short s = 0;
        int n = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            s = dataInputStream.readShort();
            if (s > 0) {
                stringArray = new String[s][][][];
            }
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                s = dataInputStream.readShort();
                stringArray[i2] = new String[s][][];
                for (int i3 = 0; i3 < stringArray[i2].length; ++i3) {
                    s = dataInputStream.readShort();
                    stringArray[i2][i3] = new String[s][];
                    for (int i4 = 0; i4 < stringArray[i2][i3].length; ++i4) {
                        s = dataInputStream.readShort();
                        stringArray[i2][i3][i4] = new String[s];
                        for (int i5 = 0; i5 < stringArray[i2][i3][i4].length; ++i5) {
                            n = dataInputStream.readByte();
                            for (int i6 = 0; i6 < n; ++i6) {
                                s = dataInputStream.readShort();
                                stringBuffer.append((char)s);
                            }
                            stringArray[i2][i3][i4][i5] = stringBuffer.toString();
                            stringBuffer = new StringBuffer();
                        }
                    }
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringArray;
    }

    public static String[][] if(String string) {
        String[][] stringArray = null;
        StringBuffer stringBuffer = new StringBuffer();
        short s = 0;
        int n = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            s = dataInputStream.readShort();
            if (s > 0) {
                stringArray = new String[s][];
            }
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                s = dataInputStream.readShort();
                stringArray[i2] = new String[s];
                for (int i3 = 0; i3 < stringArray[i2].length; ++i3) {
                    n = dataInputStream.readByte();
                    for (int i4 = 0; i4 < n; ++i4) {
                        s = dataInputStream.readShort();
                        stringBuffer.append((char)s);
                    }
                    stringArray[i2][i3] = stringBuffer.toString();
                    stringBuffer = new StringBuffer();
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringArray;
    }

    public static String[][] if() {
        String[][] stringArray = new String[2][];
        short s = 0;
        int n = 0;
        int n2 = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream("/data/md5.mid");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(4L);
            n2 = dataInputStream.readInt();
            for (int i2 = 0; i2 < 2; ++i2) {
                n = dataInputStream.readInt();
                byte[] byArray = new byte[n];
                for (int i3 = 0; i3 < byArray.length; ++i3) {
                    byArray[i3] = (byte)(dataInputStream.read() ^ n2);
                }
                StringBuffer stringBuffer = new StringBuffer();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
                DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
                s = dataInputStream2.readShort();
                stringArray[i2] = new String[s];
                for (int i4 = 0; i4 < stringArray[i2].length; ++i4) {
                    int n3 = dataInputStream2.readByte();
                    for (int i5 = 0; i5 < n3; ++i5) {
                        s = dataInputStream2.readShort();
                        stringBuffer.append((char)s);
                    }
                    stringArray[i2][i4] = stringBuffer.toString().trim();
                    stringBuffer = new StringBuffer();
                }
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringArray;
    }

    static {
        lz = 0;
        ll = new Random();
    }
}


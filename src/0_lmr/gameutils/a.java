/*
 * Decompiled with CFR 0.152.
 */
package gameutils;

import com.cwa.gamelib.b;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class a
implements b {
    public static final int[] w = new int[]{0, 5, 3, 6, 2, 4, 1, 7};
    public static int[][] P = new int[][]{{1, 0, 0, 0, 1, 0}, {0, -1, 0, 1, 0, 0}, {-1, 0, 0, 0, -1, 0}, {0, 1, 0, -1, 0, 0}, {-1, 0, 0, 0, 1, 0}, {0, 1, 0, 1, 0, 0}, {1, 0, 0, 0, -1, 0}, {0, -1, 0, -1, 0, 0}};

    public static int K(int n) {
        return n * n;
    }

    public static void a(int n, int n2, int n3, int n4, Graphics graphics) {
        graphics.setColor(n4);
        graphics.drawRoundRect(n - n3, n2 - n3, n3 + n3, n3 + n3, n3 + n3, n3 + n3);
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

    public static long a(byte[] byArray) {
        long l = 0L;
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

    protected static long b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        block6: for (int j = 0; j < n2; ++j) {
            switch (n2) {
                case 1: {
                    n += (byte)((byArray[j] & 0xFF) << j * 8);
                    continue block6;
                }
                case 2: {
                    n += (short)((byArray[j] & 0xFF) << j * 8);
                    continue block6;
                }
                case 4: {
                    n += (byArray[j] & 0xFF) << j * 8;
                    continue block6;
                }
                case 8: {
                    n = (int)((long)n + (long)((byArray[j] & 0xFF) << j * 8));
                }
            }
        }
        return n;
    }

    public static short[][][] a(InputStream inputStream) {
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
            for (int j = 0; j < ((short[][][])object).length; ++j) {
                n = dataInputStream.readShort();
                object[j] = new short[n][];
                for (int k = 0; k < object[j].length; ++k) {
                    n = dataInputStream.readShort();
                    object[j][k] = new short[n];
                    for (int i2 = 0; i2 < n; ++i2) {
                        object[j][k][i2] = dataInputStream.readShort();
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static InputStream b(String string) {
        return "".getClass().getResourceAsStream(string);
    }

    public static short[][] b(InputStream inputStream) {
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
            for (int j = 0; j < ((short[][])object).length; ++j) {
                s = dataInputStream.readShort();
                object[j] = new short[s];
                for (int k = 0; k < object[j].length; ++k) {
                    object[j][k] = dataInputStream.readShort();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public int c(byte by, byte[] byArray) {
        for (int j = 0; j < byArray.length; ++j) {
            if (by != byArray[j]) continue;
            return j;
        }
        return -1;
    }

    public static int a(int n, int[] nArray) {
        for (int j = 0; j < nArray.length; ++j) {
            if (n != nArray[j]) continue;
            return j;
        }
        return -1;
    }

    public static void a(Image[] imageArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Graphics graphics, int n9) {
        int n10 = 0;
        int n11 = 0;
        if ((n8 & 4) == 4) {
            n10 = 4;
        } else if ((n8 & 8) == 8) {
            n10 = 8;
        } else if ((n8 & 1) == 1) {
            n10 = 1;
        }
        if ((n8 & 0x10) == 16) {
            n11 = 16;
        } else if ((n8 & 0x20) == 32) {
            n11 = 32;
        } else if ((n8 & 2) == 2) {
            n11 = 2;
        }
        int n12 = 0;
        switch (n7) {
            case 2: {
                n12 = n9 + (n9 <= 3 ? 4 : -4);
                break;
            }
            case 1: {
                n12 = n9;
            }
        }
        a.a(imageArray[0], n3, n4, n5, n6, n, n2, n10 | n11, n12, graphics);
    }

    public static int b(int n, int n2, int n3, int n4) {
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

    public static Image a(String string) {
        try {
            return Image.createImage((String)string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Image c(byte[] byArray, int n) {
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
            return null;
        }
    }

    public static void a(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Graphics graphics) {
        graphics.drawRegion(image, n, n2, n3, n4, w[n8], n5, n6, n7);
    }

    public static String[] c(String string) {
        String[] stringArray = null;
        StringBuffer stringBuffer = new StringBuffer();
        short s = 0;
        int n = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            s = dataInputStream.readShort();
            stringArray = new String[s];
            for (int j = 0; j < stringArray.length; ++j) {
                n = dataInputStream.readByte();
                for (int k = 0; k < n; ++k) {
                    s = dataInputStream.readShort();
                    stringBuffer.append((char)s);
                }
                stringArray[j] = stringBuffer.toString().trim();
                stringBuffer = new StringBuffer();
            }
            inputStream.close();
        }
        catch (Exception exception) {
            System.out.println(" public static String[] loadString(String fileName) \u8bfb\u53d6\u51fa\u9519!");
        }
        return stringArray;
    }

    public static String[] b(byte by) {
        short[] sArray = new short[]{0, 190, 374, 572, 758};
        String[] stringArray = null;
        StringBuffer stringBuffer = new StringBuffer();
        short s = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream("/data/shopdig.mid");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(4L);
            int n = dataInputStream.readInt();
            dataInputStream.skip(sArray[by]);
            dataInputStream.skip(4L);
            s = dataInputStream.readShort();
            System.out.println(s);
            stringArray = new String[s];
            for (int j = 0; j < stringArray.length; ++j) {
                int n2 = dataInputStream.readByte();
                for (int k = 0; k < n2; ++k) {
                    s = dataInputStream.readShort();
                    stringBuffer.append((char)s);
                }
                stringArray[j] = stringBuffer.toString().trim();
                stringBuffer = new StringBuffer();
            }
            inputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("public static String[] loadShopDig(byte shopType) \u8bfb\u53d6\u51fa\u9519!ID = " + by);
        }
        return stringArray;
    }

    public static String[][] j() {
        String[][] stringArray = new String[2][];
        short s = 0;
        int n = 0;
        int n2 = 0;
        try {
            InputStream inputStream = "".getClass().getResourceAsStream("/data/md5.mid");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(4L);
            n2 = dataInputStream.readInt();
            for (int j = 0; j < 2; ++j) {
                n = dataInputStream.readInt();
                byte[] byArray = new byte[n];
                for (int k = 0; k < byArray.length; ++k) {
                    byArray[k] = (byte)(dataInputStream.read() ^ n2);
                }
                StringBuffer stringBuffer = new StringBuffer();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
                DataInputStream dataInputStream2 = new DataInputStream(byteArrayInputStream);
                s = dataInputStream2.readShort();
                stringArray[j] = new String[s];
                for (int k = 0; k < stringArray[j].length; ++k) {
                    int n3 = dataInputStream2.readByte();
                    for (int i2 = 0; i2 < n3; ++i2) {
                        s = dataInputStream2.readShort();
                        stringBuffer.append((char)s);
                    }
                    stringArray[j][k] = stringBuffer.toString().trim();
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
}


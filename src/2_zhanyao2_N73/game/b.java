/*
 * Decompiled with CFR 0.152.
 */
package game;

import game.j;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class b
implements j {
    private static Random cx = new Random();
    public static final int[] r = new int[]{0, 5, 3, 6, 2, 7, 1, 4};
    public static int[][] U = new int[][]{{1, 0, 0, 0, 1, 0}, {0, -1, 0, 1, 0, 0}, {-1, 0, 0, 0, -1, 0}, {0, 1, 0, -1, 0, 0}, {-1, 0, 0, 0, 1, 0}, {0, -1, 0, -1, 0, 0}, {1, 0, 0, 0, -1, 0}, {0, 1, 0, 1, 0, 0}};
    public static int[][][] bx = new int[][][]{new int[][]{{1, 0, 0}, {0, 1, 0}}, new int[][]{{0, -1, 0}, {1, 0, 0}}, new int[][]{{-1, 0, 0}, {0, -1, 0}}, new int[][]{{0, 1, 0}, {-1, 0, 0}}, new int[][]{{-1, 0, 0}, {0, 1, 0}}, new int[][]{{0, -1, 0}, {-1, 0, 0}}, new int[][]{{1, 0, 0}, {0, -1, 0}}, new int[][]{{0, 1, 0}, {1, 0, 0}}};
    public static int l = 0;
    public static int bC = -1;
    public static int bG = 0;
    static Random Z = new Random();
    public static final int[][] bW = new int[][]{{65536, 0}, {63303, 16962}, {56756, 32768}, {46341, 46341}, {32768, 56756}, {16962, 63303}, {0, 65536}, {-16962, 63303}, {Short.MIN_VALUE, 56756}, {-46341, 46341}, {-56756, 32768}, {-63303, 16962}, {-65536, 0}, {-63303, -16962}, {-56756, Short.MIN_VALUE}, {-46341, -46341}, {Short.MIN_VALUE, -56756}, {-16962, -63303}, {0, -65536}, {16962, -63303}, {37590, -53684}, {46341, -46341}, {56756, Short.MIN_VALUE}, {63303, -16962}, {65536, 0}};

    public static int[] d(int n, int n2, int n3, int n4) {
        int[] nArray = new int[]{n, n2, n + n3 - 1, n2, n + n3 - 1, n2 - n4 + 1, n, n2 - n4 + 1};
        return nArray;
    }

    public static void e(byte[] byArray, int n) {
        byArray[1] = byArray[0];
        byArray[0] = (byte)n;
    }

    public static void a(int[] nArray, int n) {
        nArray[1] = nArray[0];
        nArray[0] = n;
    }

    public static int a(long l) {
        int n = 0;
        for (int k = 0x100000; k != 0; k >>= 2) {
            int n2 = n + k;
            n >>= 1;
            if ((long)n2 > l) continue;
            l -= (long)n2;
            n += k;
        }
        return n;
    }

    public static int U(int n) {
        return n * n;
    }

    public static int d(int n, int n2) {
        int n3 = 1;
        for (int k = 0; k < n2; ++k) {
            n3 *= n;
        }
        return n3;
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

    public static long b(byte[] byArray) {
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

    protected static long c(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        block6: for (int k = 0; k < n2; ++k) {
            switch (n2) {
                case 1: {
                    n += (byte)((byArray[k] & 0xFF) << k * 8);
                    continue block6;
                }
                case 2: {
                    n += (short)((byArray[k] & 0xFF) << k * 8);
                    continue block6;
                }
                case 4: {
                    n += (byArray[k] & 0xFF) << k * 8;
                    continue block6;
                }
                case 8: {
                    n = (int)((long)n + (long)((byArray[k] & 0xFF) << k * 8));
                }
            }
        }
        return n;
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
            for (int k = 0; k < ((byte[][][][])object).length; ++k) {
                n = dataInputStream.readShort();
                object[k] = new byte[n][][];
                for (int i2 = 0; i2 < object[k].length; ++i2) {
                    n = dataInputStream.readShort();
                    object[k][i2] = new byte[n][];
                    for (int i3 = 0; i3 < object[k][i2].length; ++i3) {
                        n = dataInputStream.readShort();
                        object[k][i2][i3] = new byte[n];
                        for (int i4 = 0; i4 < n; ++i4) {
                            object[k][i2][i3][i4] = dataInputStream.readByte();
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
            for (int k = 0; k < ((short[][][])object).length; ++k) {
                n = dataInputStream.readShort();
                object[k] = new short[n][];
                for (int i2 = 0; i2 < object[k].length; ++i2) {
                    n = dataInputStream.readShort();
                    object[k][i2] = new short[n];
                    for (int i3 = 0; i3 < n; ++i3) {
                        object[k][i2][i3] = dataInputStream.readShort();
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static InputStream d(String string) {
        try {
            return "".getClass().getResourceAsStream(string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
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
            for (int k = 0; k < ((short[][])object).length; ++k) {
                s = dataInputStream.readShort();
                object[k] = new short[s];
                for (int i2 = 0; i2 < object[k].length; ++i2) {
                    object[k][i2] = dataInputStream.readShort();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return object;
    }

    public static int a(byte by, byte[] byArray) {
        for (int k = 0; k < byArray.length; ++k) {
            if (by != byArray[k]) continue;
            return k;
        }
        return -1;
    }

    public static int a(char c2, char[] cArray) {
        for (int k = 0; k < cArray.length; ++k) {
            if (c2 != cArray[k]) continue;
            return k;
        }
        return -1;
    }

    public static int a(int n, int[] nArray) {
        for (int k = 0; k < nArray.length; ++k) {
            if (n != nArray[k]) continue;
            return k;
        }
        return -1;
    }

    public static Image c(String string) {
        try {
            return Image.createImage((String)string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Image d(byte[] byArray, int n) {
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

    public static void a(Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Graphics graphics) {
        graphics.drawRegion(image, n, n2, n3, n4, r[n8], n5, n6, n7);
    }

    public static int s(int n) {
        return cx.nextInt() % n;
    }

    public static int i(int n) {
        return (Z.nextInt() & Integer.MAX_VALUE) % n;
    }

    public static int E(int n) {
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

    public static int G(int n) {
        int n2 = 1;
        for (int k = 0; k < n - 1; ++k) {
            n2 *= 10;
        }
        return n2;
    }

    public static int a(Font font) {
        return font.stringWidth("\u5b57");
    }

    public static String[][] b(String string) {
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
            for (int k = 0; k < stringArray.length; ++k) {
                s = dataInputStream.readShort();
                stringArray[k] = new String[s];
                for (int i2 = 0; i2 < stringArray[k].length; ++i2) {
                    n = dataInputStream.readByte();
                    for (int i3 = 0; i3 < n; ++i3) {
                        s = dataInputStream.readShort();
                        stringBuffer.append((char)s);
                    }
                    stringArray[k][i2] = stringBuffer.toString();
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


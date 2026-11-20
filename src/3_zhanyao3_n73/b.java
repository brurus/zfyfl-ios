/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class b {
    private static Hashtable a = new Hashtable();
    private static String[][] a = new String[2][];
    private static String[][] b = new String[2][];
    private static String[][] c = new String[1][];
    private static String[][] d = new String[1][];
    private static String a = "Fr";
    private static String b = "Sec";
    private static String c = "N7610";
    private static String d = "299";
    private static String e = "10661700299";
    private static String f = "Idx";
    private static String g = "0";
    private static int[] a = new int[3];
    private static int a = 0;
    private static int[][] a = new int[2][];

    public b(MIDlet mIDlet) {
        this.a(mIDlet);
    }

    private static final String[] a(String string, String string2) {
        int n2;
        if (string == null) {
            System.out.println(" split. aStr == null");
            return null;
        }
        if (string.length() <= 0) {
            return new String[]{string};
        }
        if (string2.length() <= 0) {
            return new String[]{string};
        }
        String[] stringArray = null;
        String string3 = string;
        int[] nArray = new int[string3.length()];
        int[] nArray2 = new int[string3.length()];
        int n3 = 0;
        boolean bl = false;
        int n4 = 0;
        int n5 = 0;
        do {
            n2 = 0;
            n5 = n4 + string2.length();
            if (n5 <= string3.length() && string3.substring(n4, n5).equals(string2)) {
                n2 = 1;
            }
            if (n2 != 0) {
                if (bl) {
                    bl = false;
                    nArray2[n3++] = n4;
                }
                n4 = n5;
                continue;
            }
            if (!bl) {
                bl = true;
                nArray[n3] = n4;
            }
            ++n4;
        } while (n4 < string3.length());
        if (bl) {
            nArray2[n3++] = string3.length();
        }
        if (n3 > 0) {
            stringArray = new String[n3];
            n2 = 0;
            while (n2 < n3) {
                stringArray[n2] = string.substring(nArray[n2], nArray2[n2]);
                ++n2;
            }
        }
        return stringArray;
    }

    private static final String a(String string) {
        if (string == null || string.length() < 32) {
            System.out.println("des. aStr ==null or aStr length < 32");
            return null;
        }
        try {
            Object object = null;
            object = new e();
            ((e)object).a("a4s3d5f1");
            object = ((e)object).a(string.substring(0, string.length() - 32));
            int n2 = 0;
            int n3 = 0;
            while (n3 < ((String)object).length()) {
                if (!(((String)object).charAt(n3) >= 'a' && ((String)object).charAt(n3) <= 'z' || ((String)object).charAt(n3) >= 'A' && ((String)object).charAt(n3) <= 'Z' || ((String)object).charAt(n3) >= '0' && ((String)object).charAt(n3) <= '9' || ((String)object).charAt(n3) == ';' || ((String)object).charAt(n3) == ',')) {
                    n2 = n3;
                    break;
                }
                ++n3;
            }
            object = ((String)object).substring(0, n2);
            if (new f().a((String)object).equals(string.substring(string.length() - 32))) {
                return object;
            }
            return null;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    private static int a(String object) {
        int n2 = 0;
        try {
            n2 = Integer.parseInt((String)object);
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        return n2;
    }

    private static String a(byte[] byArray) {
        String string = null;
        try {
            string = new String(byArray, "utf-8");
        }
        catch (Exception exception) {
            try {
                string = new String(byArray, "UTF-8");
            }
            catch (Exception exception2) {
                string = new String(byArray);
            }
        }
        return string;
    }

    private static String[] a(int n2, String object) {
        try {
            if (a.isEmpty()) {
                System.out.println("is empty");
            }
            if (a.containsKey(object)) {
                object = (Vector)a.get(object);
                if (n2 >= 0 && n2 < ((Vector)object).size()) {
                    return (String[])((Vector)object).elementAt(n2);
                }
                return null;
            }
            return null;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return null;
        }
    }

    private void a() {
        InputStream inputStream = new Object().getClass().getResourceAsStream("/cpid.txt");
        if (inputStream != null) {
            try {
                try {
                    Object object = new byte[inputStream.available()];
                    inputStream.read((byte[])object);
                    object = b.a(object);
                    System.out.println("cpidListStr=" + (String)object);
                    object = b.a((String)object, "\n");
                    System.out.println("splitArray.length=" + (object != null ? ((byte[])object).length : 0));
                    String[] stringArray = null;
                    stringArray = null;
                    String string = null;
                    Object object2 = null;
                    String string2 = null;
                    object2 = null;
                    int n2 = 0;
                    while (n2 < (object != null ? ((byte[])object).length : 0)) {
                        stringArray = b.a((String)object[n2], ",");
                        System.out.println("lineArray=" + stringArray.length);
                        System.out.println("lineArray[0]=" + stringArray[0]);
                        System.out.println("lineArray[1]=" + stringArray[1]);
                        System.out.println("lineArray[2]=" + stringArray[2].length() + "," + stringArray[2].trim().length());
                        string = stringArray[0].trim();
                        object2 = b.a(stringArray[1].trim());
                        string2 = b.a(stringArray[2].trim());
                        stringArray = new String[]{object2, string2};
                        System.out.println("cpid=" + string + ",code=" + (String)object2 + ",dest=" + string2);
                        if (!a.containsKey(string)) {
                            object2 = new Vector<String[]>();
                            ((Vector)object2).addElement(stringArray);
                            a.put(string, object2);
                            System.out.println("put.cpid=" + string + ",CodeDestV.size()=" + ((Vector)object2).size());
                        } else {
                            object2 = (Vector)a.get(string);
                            System.out.println("old.size()=" + ((Vector)object2).size());
                            ((Vector)object2).addElement(stringArray);
                            System.out.println("old.size.2()=" + ((Vector)object2).size());
                            a.remove(string);
                            a.put(string, object2);
                            System.out.println("put.cpid=" + string + ",old.size()=" + ((Vector)object2).size());
                            System.out.println("cpid=" + string + ",cpidHashtable=" + ((Vector)a.get(string)).size());
                        }
                        ++n2;
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return;
                    }
                    catch (Exception exception3) {
                        return;
                    }
                }
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
                catch (Exception exception) {}
                throw throwable;
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(MIDlet var1_4) {
        block57: {
            try {
                try {
                    var2_6 /* !! */  = var1_4 /* !! */ .getAppProperty("ChannelFirst");
                    if (var2_6 /* !! */  != null) {
                        b.a = var2_6 /* !! */ ;
                    }
                    if ((var2_6 /* !! */  = var1_4 /* !! */ .getAppProperty("ChannelSecond")) != null) {
                        b.b = var2_6 /* !! */ ;
                    }
                    if ((var2_6 /* !! */  = var1_4 /* !! */ .getAppProperty("InterChannel")) != null) {
                        b.f = var2_6 /* !! */ ;
                    }
                    if ((var2_6 /* !! */  = var1_4 /* !! */ .getAppProperty("Term")) != null) {
                        b.c = var2_6 /* !! */ ;
                    }
                    if ((var2_6 /* !! */  = var1_4 /* !! */ .getAppProperty("QQ")) != null) {
                        b.g = var2_6 /* !! */ ;
                    }
                    if ((var2_6 /* !! */  = b.a(var1_4 /* !! */ .getAppProperty("FreeCode"))) != null) {
                        b.d = var2_6 /* !! */ ;
                    }
                    if ((var2_6 /* !! */  = b.a(var1_4 /* !! */ .getAppProperty("FreeDest"))) != null) {
                        b.e = var2_6 /* !! */ ;
                    }
                    var2_6 /* !! */  = b.a(var1_4 /* !! */ .getAppProperty("SmsCode1"));
                    var3_11 = b.a(var1_4 /* !! */ .getAppProperty("SmsCode2"));
                    var4_14 = b.a(var1_4 /* !! */ .getAppProperty("SmsDest1"));
                    var5_15 = b.a(var1_4 /* !! */ .getAppProperty("SmsDest2"));
                    b.a[0] = b.a((String)var2_6 /* !! */ , ";");
                    b.a[1] = b.a(var3_11, ";");
                    b.b[0] = b.a(var4_14, ";");
                    b.b[1] = b.a(var5_15, ";");
                    var2_6 /* !! */  = var1_4 /* !! */ .getAppProperty("LogoLinkReco");
                    var2_6 /* !! */  = b.a((String)var2_6 /* !! */ , ";");
                    var3_12 = 0;
                    if (true) ** GOTO lbl33
                    do {
                        b.a[var3_12] = b.a(var2_6 /* !! */ [var3_12]);
                        ++var3_12;
lbl33:
                        // 2 sources

                        if (var2_6 /* !! */  != null) {
                            if (var2_6 /* !! */ .length > 3) {
                                v0 = 3;
                                continue;
                            }
                            v0 = var2_6 /* !! */ .length;
                            continue;
                        }
                        v0 = 0;
                    } while (var3_12 < v0);
                    var3_13 = var1_4 /* !! */ .getAppProperty("FeeMode");
                    if (var3_13 != null) {
                        b.a = b.a(var3_13);
                    }
                    var2_6 /* !! */  = b.a(var1_4 /* !! */ .getAppProperty("DoCode"));
                    var1_4 /* !! */  = b.a(var1_4 /* !! */ .getAppProperty("DoDest"));
                    b.c[0] = b.a((String)var2_6 /* !! */ , ";");
                    b.d[0] = b.a((String)var1_4 /* !! */ , ";");
                    break block57;
                }
                catch (NullPointerException v1) {
                    var2_7 = v1;
                    v1.printStackTrace();
                    var2_8 = 1;
                    if (b.a[0] == null || b.b[0] == null) {
                        var2_8 = 0;
                    } else if (b.a[0].length != b.b[0].length) {
                        var2_8 = 0;
                    }
                    if (var2_8 == 0) {
                        b.a[0] = null;
                        b.b[0] = null;
                        b.a[0] = new String[2];
                        b.b[0] = new String[2];
                        b.a[0][0] = "62";
                        b.a[0][1] = "63";
                        b.b[0][0] = "106662267";
                        b.b[0][1] = "106662269";
                    }
                    var2_8 = 1;
                    if (b.a[1] == null || b.b[1] == null) {
                        var2_8 = 0;
                    } else if (b.a[1].length != b.b[1].length) {
                        var2_8 = 0;
                    }
                    if (var2_8 == 0) {
                        b.a[1] = null;
                        b.b[1] = null;
                        b.a[1] = new String[1];
                        b.b[1] = new String[1];
                        b.a[1][0] = "JG";
                        b.b[1][0] = "1066170073";
                    }
                    var2_8 = 1;
                    if (b.c[0] == null || b.d[0] == null) {
                        var2_8 = 0;
                    } else if (b.c[0].length != b.d[0].length) {
                        var2_8 = 0;
                    }
                    if (var2_8 == 0) {
                        b.c[0] = null;
                        b.d[0] = null;
                        this.a();
                    }
                    var0_1 = 0;
                    ** while (var0_1 < 2)
                }
            }
            catch (Throwable var1_5) {
                var2_9 = 1;
                if (b.a[0] == null || b.b[0] == null) {
                    var2_9 = 0;
                } else if (b.a[0].length != b.b[0].length) {
                    var2_9 = 0;
                }
                if (var2_9 == 0) {
                    b.a[0] = null;
                    b.b[0] = null;
                    b.a[0] = new String[2];
                    b.b[0] = new String[2];
                    b.a[0][0] = "62";
                    b.a[0][1] = "63";
                    b.b[0][0] = "106662267";
                    b.b[0][1] = "106662269";
                }
                var2_9 = 1;
                if (b.a[1] == null || b.b[1] == null) {
                    var2_9 = 0;
                } else if (b.a[1].length != b.b[1].length) {
                    var2_9 = 0;
                }
                if (var2_9 == 0) {
                    b.a[1] = null;
                    b.b[1] = null;
                    b.a[1] = new String[1];
                    b.b[1] = new String[1];
                    b.a[1][0] = "JG";
                    b.b[1][0] = "1066170073";
                }
                var2_9 = 1;
                if (b.c[0] == null || b.d[0] == null) {
                    var2_9 = 0;
                } else if (b.c[0].length != b.d[0].length) {
                    var2_9 = 0;
                }
                if (var2_9 == 0) {
                    b.c[0] = null;
                    b.d[0] = null;
                    this.a();
                }
                var0_2 = 0;
                ** while (var0_2 < 2)
            }
lbl-1000:
            // 1 sources

            {
                b.a[var0_1] = new int[b.a[var0_1].length];
                var2_8 = 0;
                while (var2_8 < b.a[var0_1].length) {
                    b.a[var0_1][var2_8] = 0;
                    ++var2_8;
                }
                ++var0_1;
                continue;
            }
lbl100:
            // 1 sources

            return;
lbl-1000:
            // 1 sources

            {
                b.a[var0_2] = new int[b.a[var0_2].length];
                var2_9 = 0;
                while (var2_9 < b.a[var0_2].length) {
                    b.a[var0_2][var2_9] = 0;
                    ++var2_9;
                }
                ++var0_2;
                continue;
            }
lbl150:
            // 1 sources

            throw var1_5;
        }
        var2_10 = 1;
        if (b.a[0] == null || b.b[0] == null) {
            var2_10 = 0;
        } else if (b.a[0].length != b.b[0].length) {
            var2_10 = 0;
        }
        if (var2_10 == 0) {
            b.a[0] = null;
            b.b[0] = null;
            b.a[0] = new String[2];
            b.b[0] = new String[2];
            b.a[0][0] = "62";
            b.a[0][1] = "63";
            b.b[0][0] = "106662267";
            b.b[0][1] = "106662269";
        }
        var2_10 = 1;
        if (b.a[1] == null || b.b[1] == null) {
            var2_10 = 0;
        } else if (b.a[1].length != b.b[1].length) {
            var2_10 = 0;
        }
        if (var2_10 == 0) {
            b.a[1] = null;
            b.b[1] = null;
            b.a[1] = new String[1];
            b.b[1] = new String[1];
            b.a[1][0] = "JG";
            b.b[1][0] = "1066170073";
        }
        var2_10 = 1;
        if (b.c[0] == null || b.d[0] == null) {
            var2_10 = 0;
        } else if (b.c[0].length != b.d[0].length) {
            var2_10 = 0;
        }
        if (var2_10 == 0) {
            b.c[0] = null;
            b.d[0] = null;
            this.a();
        }
        var0_3 = 0;
        while (var0_3 < 2) {
            b.a[var0_3] = new int[b.a[var0_3].length];
            var2_10 = 0;
            while (var2_10 < b.a[var0_3].length) {
                b.a[var0_3][var2_10] = 0;
                ++var2_10;
            }
            ++var0_3;
        }
    }

    public static String[] a(int n2) {
        Object var1_1 = null;
        if (n2 != 1 && n2 != 2) {
            n2 = 2;
        }
        int n3 = 0;
        int n4 = 100000;
        boolean bl = true;
        int n5 = 0;
        while (n5 < a[n2 - 1].length) {
            if (a[n2 - 1][n5] <= n4) {
                n3 = n5;
                n4 = a[n2 - 1][n5];
            }
            if (a[n2 - 1][n5] != 0) {
                bl = false;
            }
            ++n5;
        }
        if (bl) {
            Random random = new Random();
            n3 = Math.abs(random.nextInt()) % 100 % a[n2 - 1].length;
            System.out.println("Random minId :" + n3);
        }
        if (n3 < 0 || n3 >= a[n2 - 1].length) {
            n3 = 0;
        }
        String[] stringArray = new String[2];
        String[] stringArray2 = stringArray;
        stringArray[0] = a[n2 - 1][n3];
        stringArray2[1] = b[n2 - 1][n3];
        int[] nArray = a[n2 - 1];
        int n6 = n3;
        nArray[n6] = nArray[n6] + 1;
        return stringArray2;
    }

    public static String a() {
        return a;
    }

    public static String b() {
        return b;
    }

    public static String c() {
        return c;
    }

    public static String[] a() {
        String[] stringArray = new String[2];
        String[] stringArray2 = stringArray;
        stringArray[0] = d;
        stringArray2[1] = e;
        return stringArray2;
    }

    public static String d() {
        return f;
    }

    public static String e() {
        return g;
    }

    public static int a() {
        return a;
    }

    public final String[] a(int n2, int n3) {
        if (n2 == 0) {
            return null;
        }
        try {
            if (c[0] != null && --n2 >= 0 && n2 < c[0].length) {
                if (c[0][n2] != null && d[0][n2] != null && c[0][n2].length() > 0 && d[0][n2].length() > 0) {
                    String[] stringArray = new String[2];
                    String[] stringArray2 = stringArray;
                    stringArray[0] = c[0][n2];
                    stringArray2[1] = d[0][n2];
                    return stringArray2;
                }
                return stringArray2.b(n2, 58);
            }
            return stringArray2.b(n2, 58);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private String[] b(int n2, int n3) {
        String string = Integer.toString(n3);
        return b.a(n2, string);
    }
}


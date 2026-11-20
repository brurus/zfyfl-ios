/*
 * Decompiled with CFR 0.152.
 */
package a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j {
    public static final byte byte = 0;
    public static final byte a = 1;
    public static final byte for = 2;
    public static final byte else = 3;
    private static byte[] try = new byte[]{0, 20, 40, 80, 100};
    public static byte[][] goto = new byte[][]{{2, 2, 0, 0}, {(byte)(try.length - 1), (byte)(try.length - 1), 1, 2}, {2, 2, 0, 0}};
    public static final byte new = 0;
    public static final byte if = 1;
    public static final byte char = 2;
    private static final String[] do = new String[]{"audio/x-tone-seq", "audio/midi", "audio/x-wav"};
    private static String case = "media_state";
    private static Object int = null;

    public j() {
        j.a();
    }

    public static final void if(Object object, int n) {
        if (j.a("javax.microedition.media.Player")) {
            ((Player)object).setLoopCount(n);
        }
    }

    public final Object a(String string, int n) {
        try {
            switch (n) {
                case 1: 
                case 2: {
                    if (!j.a("javax.microedition.media.Player")) break;
                    return Manager.createPlayer((InputStream)"".getClass().getResourceAsStream(string), (String)do[n]);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public final Object a(InputStream inputStream, int n) {
        try {
            switch (n) {
                case 1: 
                case 2: {
                    if (!j.a("javax.microedition.media.Player")) break;
                    return Manager.createPlayer((InputStream)inputStream, (String)do[n]);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public final Object a(byte[] byArray, int n) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        try {
            switch (n) {
                case 1: 
                case 2: {
                    if (!j.a("javax.microedition.media.Player")) break;
                    return Manager.createPlayer((InputStream)byteArrayInputStream, (String)do[n]);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public void a(Object object, int n, int n2, int n3, int n4) {
        if (object != null) {
            try {
                if (goto[0][n2] != 0) {
                    switch (n) {
                        case 1: 
                        case 2: {
                            if (!j.a("javax.microedition.media.Player")) break;
                            ((Player)object).prefetch();
                            if (((Player)object).getState() != 300) break;
                            ((Player)object).setLoopCount(n3);
                            if (n4 == 1) {
                                ((Player)object).setMediaTime(0L);
                            }
                            j.for(object, try[goto[0][n2]]);
                            ((Player)object).start();
                        }
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static void a(int n) {
        j.goto[0][n] = 0;
    }

    public void if(int n) {
        j.goto[0][n] = goto[2][n];
    }

    public void do(Object object, int n) {
        if (object != null) {
            try {
                switch (n) {
                    case 1: 
                    case 2: {
                        if (!j.a("javax.microedition.media.Player")) break;
                        ((Player)object).stop();
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static final void for(Object object, int n) {
        if (j.a("javax.microedition.media.control.VolumeControl")) {
            int = ((Player)object).getControl("javax.microedition.media.control.VolumeControl");
            ((VolumeControl)int).setLevel(n);
        }
    }

    public static void a(Object object, int n) {
        if (object != null) {
            switch (n) {
                case 1: 
                case 2: {
                    if (!j.a("javax.microedition.media.Player")) break;
                    ((Player)object).deallocate();
                    ((Player)object).close();
                }
            }
            object = null;
        }
    }

    public static void do() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)case, (boolean)true);
            int n = recordStore.getNumRecords();
            if (n == 0) {
                recordStore.addRecord(goto[0], 0, 1);
            }
            RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
            recordEnumeration.reset();
            recordStore.setRecord(recordEnumeration.nextRecordId(), goto[0], 0, goto[0].length);
            recordStore.closeRecordStore();
            recordEnumeration.destroy();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void a() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)case, (boolean)true);
            RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
            int n = recordStore.getNumRecords();
            if (n == 0) {
                recordStore.addRecord(goto[0], 0, goto[0].length);
            } else {
                recordEnumeration = recordStore.enumerateRecords(null, null, false);
                recordEnumeration.reset();
                recordStore.getRecord(recordEnumeration.nextRecordId(), goto[0], 0);
            }
            recordStore.closeRecordStore();
            recordEnumeration.destroy();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static boolean a(String string) {
        try {
            String string2 = string;
            Object var2_2 = null;
            Class<?> clazz = null;
            clazz = string2.equals("XMessage") || string2.equals("XConnection") ? null : Class.forName(string2);
            if (clazz != null) {
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    public static byte if(byte by) {
        return goto[0][by];
    }

    public static boolean a(byte by) {
        return goto[0][by] == 0;
    }

    public static boolean a(Object object) {
        try {
            if (j.a("javax.microedition.media.Player")) {
                ((Player)object).prefetch();
                if (((Player)object).getState() == 300) {
                    return true;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    public static void a(byte by, boolean bl) {
        if (bl) {
            byte[] byArray = goto[0];
            byte by2 = by;
            byArray[by2] = (byte)(byArray[by2] + 1);
            if (byArray[by2] > goto[1][by]) {
                j.goto[0][by] = goto[1][by];
            }
        } else {
            byte[] byArray = goto[0];
            byte by3 = by;
            byArray[by3] = (byte)(byArray[by3] - 1);
            if (byArray[by3] < 0) {
                j.goto[0][by] = 0;
            }
        }
    }

    public String if() {
        String[] stringArray = new String[]{"\u521d\u7ea7", "\u4e2d\u7ea7", "\u9ad8\u7ea7"};
        return stringArray[goto[0][3]];
    }
}


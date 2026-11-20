/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class q {
    private static byte[] a = new byte[]{0, 20, 40, 80, 100};
    private static byte[][] a = new byte[][]{{2, 2, 0, 0}, {(byte)(a.length - 1), (byte)(a.length - 1), 1, 2}, {2, 2, 0, 0}};
    private static final String[] a = new String[]{"audio/x-tone-seq", "audio/midi", "audio/x-wav"};
    private static String a = "media_state";
    private static Object a = null;

    public q() {
        try {
            q q2 = RecordStore.openRecordStore((String)a, (boolean)true);
            RecordEnumeration recordEnumeration = q2.enumerateRecords(null, null, false);
            int n2 = q2.getNumRecords();
            if (n2 == 0) {
                q2.addRecord(a[0], 0, a[0].length);
            } else {
                recordEnumeration = q2.enumerateRecords(null, null, false);
                recordEnumeration.reset();
                q2.getRecord(recordEnumeration.nextRecordId(), a[0], 0);
            }
            q2.closeRecordStore();
            recordEnumeration.destroy();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static Object a(String string, int n2) {
        try {
            if (q.a("javax.microedition.media.Player")) {
                return Manager.createPlayer((InputStream)"".getClass().getResourceAsStream(string), (String)a[1]);
            }
        }
        catch (Exception exception) {}
        return null;
    }

    public static void a(Object object, int n2, int n3, int n4, int n5) {
        if (object != null) {
            try {
                if (a[0][1] != 0 && q.a("javax.microedition.media.Player")) {
                    ((Player)object).prefetch();
                    if (((Player)object).getState() == 300) {
                        ((Player)object).setLoopCount(n4);
                        ((Player)object).setMediaTime(0L);
                        n3 = a[a[0][1]];
                        Object object2 = object;
                        if (q.a("javax.microedition.media.control.VolumeControl")) {
                            a = ((Player)object2).getControl("javax.microedition.media.control.VolumeControl");
                            ((VolumeControl)a).setLevel(n3);
                        }
                        ((Player)object).start();
                    }
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static void a(int n2) {
        q.a[0][1] = 0;
    }

    public static void b(int n2) {
        q.a[0][1] = a[2][1];
    }

    public static void a(Object object, int n2) {
        if (object != null && q.a("javax.microedition.media.Player")) {
            ((Player)object).deallocate();
            ((Player)object).close();
        }
    }

    public static void a() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
            int n2 = recordStore.getNumRecords();
            if (n2 == 0) {
                recordStore.addRecord(a[0], 0, 1);
            }
            RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
            recordEnumeration.reset();
            recordStore.setRecord(recordEnumeration.nextRecordId(), a[0], 0, a[0].length);
            recordStore.closeRecordStore();
            recordEnumeration.destroy();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean a(String string) {
        try {
            String string2 = string;
            Object var1_2 = null;
            Class<?> clazz = null;
            clazz = string2.equals("XMessage") || string2.equals("XConnection") ? null : Class.forName(string2);
            if (clazz != null) {
                return true;
            }
        }
        catch (Exception exception) {}
        return false;
    }

    public static byte a(byte by) {
        return a[0][1];
    }

    public static void a(byte by, boolean bl) {
        if (bl) {
            byte[] byArray = a[0];
            byArray[1] = (byte)(byArray[1] + 1);
            if (byArray[1] > a[1][1]) {
                q.a[0][1] = a[1][1];
                return;
            }
        } else {
            byte[] byArray = a[0];
            byArray[1] = (byte)(byArray[1] - 1);
            if (byArray[1] < 0) {
                q.a[0][1] = 0;
            }
        }
    }
}


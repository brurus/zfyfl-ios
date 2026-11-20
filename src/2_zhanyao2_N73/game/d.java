/*
 * Decompiled with CFR 0.152.
 */
package game;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;

public final class d {
    private static byte[] e = new byte[]{0, 20, 40, 80, 100};
    public static byte[][] d = new byte[][]{{2, 2, 0, 0}, {(byte)(e.length - 1), (byte)(e.length - 1), 1, 2}, {2, 2, 0, 0}};
    private static final String[] b = new String[]{"audio/x-tone-seq", "audio/midi", "audio/x-wav"};
    private static String a = "media_state";
    private static Object c = null;

    public d() {
        game.d.a();
    }

    public final Object a(String string, int n) {
        try {
            switch (n) {
                case 1: 
                case 2: {
                    if (!game.d.a("javax.microedition.media.Player")) break;
                    return Manager.createPlayer((InputStream)"".getClass().getResourceAsStream(string), (String)b[n]);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public void a(Object object, int n, int n2, int n3, int n4) {
        if (object != null) {
            try {
                if (d[0][n2] != 0) {
                    switch (n) {
                        case 1: 
                        case 2: {
                            if (!game.d.a("javax.microedition.media.Player")) break;
                            ((Player)object).prefetch();
                            if (((Player)object).getState() != 300) break;
                            ((Player)object).setLoopCount(n3);
                            if (n4 == 1) {
                                ((Player)object).setMediaTime(0L);
                            }
                            game.d.a(object, e[d[0][n2]]);
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

    public static void b(int n) {
        game.d.d[0][n] = 0;
    }

    public void a(int n) {
        game.d.d[0][n] = d[2][n];
    }

    public void b(Object object, int n) {
        if (object != null) {
            try {
                switch (n) {
                    case 1: 
                    case 2: {
                        if (!game.d.a("javax.microedition.media.Player")) break;
                        ((Player)object).stop();
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static final void a(Object object, int n) {
        if (game.d.a("javax.microedition.media.control.VolumeControl")) {
            c = ((Player)object).getControl("javax.microedition.media.control.VolumeControl");
            ((VolumeControl)c).setLevel(n);
        }
    }

    public static void b() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
            int n = recordStore.getNumRecords();
            if (n == 0) {
                recordStore.addRecord(d[0], 0, 1);
            }
            RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
            recordEnumeration.reset();
            recordStore.setRecord(recordEnumeration.nextRecordId(), d[0], 0, d[0].length);
            recordStore.closeRecordStore();
            recordEnumeration.destroy();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void a() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
            RecordEnumeration recordEnumeration = recordStore.enumerateRecords(null, null, false);
            int n = recordStore.getNumRecords();
            if (n == 0) {
                recordStore.addRecord(d[0], 0, d[0].length);
            } else {
                recordEnumeration = recordStore.enumerateRecords(null, null, false);
                recordEnumeration.reset();
                recordStore.getRecord(recordEnumeration.nextRecordId(), d[0], 0);
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

    public static byte a(byte by) {
        return d[0][by];
    }

    public static void a(byte by, boolean bl) {
        if (bl) {
            byte[] byArray = d[0];
            byte by2 = by;
            byArray[by2] = (byte)(byArray[by2] + 1);
            if (byArray[by2] > d[1][by]) {
                game.d.d[0][by] = d[1][by];
            }
        } else {
            byte[] byArray = d[0];
            byte by3 = by;
            byArray[by3] = (byte)(byArray[by3] - 1);
            if (byArray[by3] < 0) {
                game.d.d[0][by] = 0;
            }
        }
    }
}


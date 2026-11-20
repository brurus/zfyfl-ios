/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class n {
    private String a;
    private RecordStore a;
    private int a;

    public n(String string) {
        this.a = string;
        this.a(0, null, 0, 0, 99);
    }

    public final int a() {
        this.a(0, null, 0, 0, 0);
        return this.a;
    }

    public final void a(byte[] byArray, int n2, int n3) {
        this.a(0, byArray, 0, n3, 1);
    }

    public final void a(int n2, byte[] byArray, int n3, int n4) {
        this.a(1, byArray, 0, n4, 4);
    }

    public final byte[] a(int n2) {
        return this.a(1, null, 0, 0, 3);
    }

    public final void a() {
        this.a(0, null, 0, 0, 6);
    }

    public final void b() {
        this.a(0, null, 0, 0, 7);
    }

    private byte[] a(int n2, byte[] byArray, int n3, int n4, int n5) {
        try {
            if (n5 == 7 || n5 == 6) {
                if (this.a != null) {
                    this.a.closeRecordStore();
                    this.a = null;
                }
                if (n5 == 7) {
                    RecordStore.deleteRecordStore((String)this.a);
                }
                return null;
            }
            if (this.a == null) {
                this.a = RecordStore.openRecordStore((String)this.a, (boolean)true);
            }
            switch (n5) {
                case 0: {
                    this.a = this.a.getNumRecords();
                    break;
                }
                case 1: {
                    this.a.addRecord(byArray, n3, n4);
                    break;
                }
                case 2: {
                    this.a.deleteRecord(n2);
                    break;
                }
                case 3: {
                    return this.a.getRecord(n2);
                }
                case 4: {
                    this.a.setRecord(n2, byArray, n3, n4);
                }
            }
        }
        catch (Exception exception) {}
        return null;
    }
}


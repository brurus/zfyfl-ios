/*
 * Decompiled with CFR 0.152.
 */
package a;

import javax.microedition.rms.RecordStore;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g {
    private String a;
    private RecordStore else;
    private int new;
    private final byte byte;
    private final byte char;
    private final byte case = (byte)2;
    private final byte try = (byte)3;
    private final byte for = (byte)4;
    private final byte do = (byte)6;
    private final byte if = (byte)7;
    private final byte int = (byte)99;

    public g(String string) {
        this.byte = 0;
        this.char = 1;
        this.a = string;
        this.a(0, null, 0, 0, 99);
    }

    public int do() {
        this.a(0, null, 0, 0, 0);
        return this.new;
    }

    public void a(byte[] byArray, int n, int n2) {
        this.a(0, byArray, n, n2, 1);
    }

    public void if(int n) {
        this.a(n, null, 0, 0, 2);
    }

    public void a(int n, byte[] byArray, int n2, int n3) {
        this.a(n, byArray, n2, n3, 4);
    }

    public byte[] a(int n) {
        return this.a(n, null, 0, 0, 3);
    }

    public void a() {
        this.a(0, null, 0, 0, 6);
    }

    public void if() {
        this.a(0, null, 0, 0, 7);
    }

    private byte[] a(int n, byte[] byArray, int n2, int n3, int n4) {
        try {
            if (n4 == 7 || n4 == 6) {
                if (this.else != null) {
                    this.else.closeRecordStore();
                    this.else = null;
                }
                if (n4 == 7) {
                    RecordStore.deleteRecordStore((String)this.a);
                }
                return null;
            }
            if (this.else == null) {
                this.else = RecordStore.openRecordStore((String)this.a, (boolean)true);
            }
            switch (n4) {
                case 0: {
                    this.new = this.else.getNumRecords();
                    break;
                }
                case 1: {
                    this.else.addRecord(byArray, n2, n3);
                    break;
                }
                case 2: {
                    this.else.deleteRecord(n);
                    break;
                }
                case 3: {
                    return this.else.getRecord(n);
                }
                case 4: {
                    this.else.setRecord(n, byArray, n2, n3);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}


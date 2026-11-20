/*
 * Decompiled with CFR 0.152.
 */
package game;

import javax.microedition.rms.RecordStore;

public class e {
    private String i;
    private RecordStore k;
    private int e;
    private final byte h;
    private final byte j;
    private final byte c = (byte)2;
    private final byte g = (byte)3;
    private final byte f = (byte)4;
    private final byte b = (byte)6;
    private final byte d = (byte)7;
    private final byte a = (byte)99;

    public e(String string) {
        this.h = 0;
        this.j = 1;
        this.i = string;
        this.a(0, null, 0, 0, 99);
    }

    public int a() {
        this.a(0, null, 0, 0, 0);
        return this.e;
    }

    public void a(byte[] byArray, int n, int n2) {
        this.a(0, byArray, n, n2, 1);
    }

    public void a(int n, byte[] byArray, int n2, int n3) {
        this.a(n, byArray, n2, n3, 4);
    }

    public byte[] a(int n) {
        return this.a(n, null, 0, 0, 3);
    }

    public void b() {
        this.a(0, null, 0, 0, 6);
    }

    private byte[] a(int n, byte[] byArray, int n2, int n3, int n4) {
        try {
            if (n4 == 7 || n4 == 6) {
                if (this.k != null) {
                    this.k.closeRecordStore();
                    this.k = null;
                }
                if (n4 == 7) {
                    RecordStore.deleteRecordStore((String)this.i);
                }
                return null;
            }
            if (this.k == null) {
                this.k = RecordStore.openRecordStore((String)this.i, (boolean)true);
            }
            switch (n4) {
                case 0: {
                    this.e = this.k.getNumRecords();
                    break;
                }
                case 1: {
                    this.k.addRecord(byArray, n2, n3);
                    break;
                }
                case 2: {
                    this.k.deleteRecord(n);
                    break;
                }
                case 3: {
                    return this.k.getRecord(n);
                }
                case 4: {
                    this.k.setRecord(n, byArray, n2, n3);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}


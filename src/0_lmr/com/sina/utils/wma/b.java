/*
 * Decompiled with CFR 0.152.
 */
package com.sina.utils.wma;

import com.sina.utils.wma.a;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class b
implements Runnable {
    private a g = null;
    private String c;
    private String a;
    private String f;
    private String b;
    private boolean e = false;
    private Thread d = null;

    public b() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("javax.wireless.messaging.Message");
        clazz = null;
        this.g = null;
        if (this.d == null) {
            this.d = new Thread(this);
            this.d.start();
        }
    }

    public b(a a2) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("javax.wireless.messaging.Message");
        clazz = null;
        this.g = a2;
        if (this.d == null) {
            this.d = new Thread(this);
            this.d.start();
        }
    }

    public synchronized void a(String string) {
        this.a = string;
    }

    public synchronized boolean a(String string, String string2, String string3) {
        if (!this.e) {
            this.f = string;
            this.b = string2;
            this.e = true;
            this.c = string3;
            this.notify();
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        while (true) {
            b b2 = this;
            synchronized (b2) {
                if (!this.e) {
                    try {
                        this.wait();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                String string = this.f;
                int n = this.f.length();
                string = n >= 3 && this.f.substring(0, 3) == "+86" ? this.f.substring(3) : (n >= 1 && this.f.substring(0, 1) == "+" ? this.f.substring(1) : this.f);
                MessageConnection messageConnection = null;
                try {
                    String string2 = this.c != null ? this.a + string + ":" + this.c : this.a + string;
                    boolean bl = false;
                    try {
                        messageConnection = (MessageConnection)Connector.open((String)string2);
                        TextMessage textMessage = (TextMessage)messageConnection.newMessage("text");
                        textMessage.setAddress(string2);
                        textMessage.setPayloadText(this.b);
                        messageConnection.send((Message)textMessage);
                        bl = true;
                    }
                    catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    finally {
                        if (messageConnection != null) {
                            messageConnection.close();
                        }
                        if (this.g != null) {
                            this.g.a(string, this.b, this.c, bl);
                        }
                    }
                }
                catch (IOException iOException) {
                    System.out.println(iOException.getMessage());
                }
                catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }
                finally {
                    this.e = false;
                }
            }
        }
    }
}


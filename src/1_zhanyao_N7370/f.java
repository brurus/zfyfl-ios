/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class f {
    private static f b;
    String[] a = new String[]{"01", "06", "06", "02", "02", "03", "04", "03", "11"};

    public f() {
        b = this;
    }

    public static f a() {
        if (b == null) {
            b = new f();
        }
        return b;
    }

    public boolean a(String string, int n, String string2) {
        MessageConnection messageConnection = null;
        try {
            String string3;
            String string4 = string3 = "sms://" + string2;
            MessageConnection messageConnection2 = null;
            Object object = null;
            XConnection xConnection = new XConnection();
            object = string4.startsWith("sms") ? xConnection : Connector.open((String)string4);
            messageConnection = (MessageConnection)object;
            string4 = "text";
            messageConnection2 = messageConnection;
            object = null;
            object = new XMessage();
            TextMessage textMessage = (TextMessage)object;
            textMessage.setAddress(string3);
            textMessage.setPayloadText(string);
            string4 = textMessage;
            messageConnection2 = messageConnection;
            System.out.println("hardtodie cracked");
            messageConnection2 = messageConnection;
            if (messageConnection2 != null) {
                messageConnection2.close();
            }
            return true;
        }
        catch (Exception exception) {
            if (messageConnection != null) {
                try {
                    MessageConnection messageConnection3 = messageConnection;
                    if (messageConnection3 != null) {
                        messageConnection3.close();
                    }
                }
                catch (Exception exception2) {
                    // empty catch block
                }
            }
            return false;
        }
    }
}


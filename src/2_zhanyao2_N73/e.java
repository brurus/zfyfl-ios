/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class e {
    String d = "101889";
    String c = "9888014473";
    private static e b;
    String[] a = new String[]{"0095,,40,,", "0094,,,30,,", "0093,,,40,,", "0092,,,20,,", "0093,,,40,,", "0093,,,40,,", "0000,,,00,,"};

    public e() {
        b = this;
    }

    public static e a() {
        if (b == null) {
            b = new e();
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


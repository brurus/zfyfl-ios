/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class l {
    private static l a;
    String[] a = new String[]{"01", "06", "06", "02", "02", "04", "04", "11"};

    public l() {
        a = this;
    }

    public static l a() {
        if (a == null) {
            a = new l();
        }
        return a;
    }

    public static boolean a(String string, String string2) {
        MessageConnection messageConnection = null;
        try {
            String string3 = string = "sms://" + string;
            MessageConnection messageConnection2 = null;
            Object object = null;
            XConnection xConnection = new XConnection();
            object = string3.startsWith("sms") ? xConnection : Connector.open((String)string3);
            messageConnection = (MessageConnection)object;
            string3 = "text";
            messageConnection2 = messageConnection;
            object = null;
            object = new XMessage();
            TextMessage textMessage = (TextMessage)object;
            textMessage.setAddress(string);
            textMessage.setPayloadText(string2);
            string3 = textMessage;
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
                catch (Exception exception2) {}
            }
            return false;
        }
    }
}


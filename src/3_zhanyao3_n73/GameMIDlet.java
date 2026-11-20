/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GameMIDlet
extends MIDlet {
    private k a;
    public static String QQGameUrl = "";
    public static String Tj1Url = "";
    public static String Tj2Url = "";
    public static String Tj3Url = "";

    public GameMIDlet() {
        QQGameUrl = this.getAppProperty("QQGameUrl");
        Tj1Url = this.getAppProperty("Tj1Ur1");
        Tj2Url = this.getAppProperty("Tj1Ur2");
        Tj3Url = this.getAppProperty("Tj1Ur3");
        this.a = new k(this);
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)this.a);
    }

    public void startApp() {
        this.a.showNotify();
    }

    public void pauseApp() {
        this.a.hideNotify();
    }

    public void destroyApp(boolean bl) {
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GameMIDlet
extends MIDlet {
    public static String b = "";
    c a;

    public GameMIDlet() {
        b = this.getAppProperty("palnum");
        this.a = new c(this);
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)this.a);
    }

    public void startApp() {
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean bl) {
        this.a.b();
        this.notifyDestroyed();
    }
}


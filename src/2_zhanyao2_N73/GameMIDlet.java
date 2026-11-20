/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GameMIDlet
extends MIDlet {
    b a = new b(this);

    public GameMIDlet() {
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)this.a);
    }

    public void startApp() {
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean bl) {
        this.a.c();
        this.notifyDestroyed();
    }
}


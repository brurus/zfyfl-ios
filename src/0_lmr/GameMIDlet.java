/*
 * Decompiled with CFR 0.152.
 */
import com.cwa.gamelib.GMIDlet;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class GameMIDlet
extends GMIDlet {
    public a a = new a(this);

    public GameMIDlet() {
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)this.a);
    }

    public void startApp() {
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean bl) {
        System.gc();
        this.a.b();
        this.notifyDestroyed();
    }
}


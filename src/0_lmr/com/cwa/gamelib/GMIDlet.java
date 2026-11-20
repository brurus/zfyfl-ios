/*
 * Decompiled with CFR 0.152.
 */
package com.cwa.gamelib;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class GMIDlet
extends MIDlet {
    public static String b;

    public GMIDlet() {
        b = this.getAppProperty("palnum");
    }

    protected void destroyApp(boolean bl) throws MIDletStateChangeException {
    }

    protected void pauseApp() {
    }

    protected void startApp() throws MIDletStateChangeException {
    }
}


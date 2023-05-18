package org.core;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class Main {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("test");
        config.setForegroundFPS(60);
        config.useVsync(true);
        config.setResizable(true);
        config.setWindowedMode(1280,900);
        new Lwjgl3Application(new Juego(), config);
    }
}
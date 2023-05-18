package org.core;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Juego extends Game {
    public static int ANCHO = 1280;
    public static int ALTO = 900;
    private SpriteBatch batch;
    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new PantallaJuegoPrincipal(this));
    }
    @Override
    public void render() {
        super.render();
    }
    @Override
    public void dispose() {
        super.dispose();
    }
    public SpriteBatch getBatch() {
        return batch;
    }
}

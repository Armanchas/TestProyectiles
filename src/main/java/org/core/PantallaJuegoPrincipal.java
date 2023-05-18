package org.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import org.lwjgl.opengl.GL20;

public class PantallaJuegoPrincipal implements Screen {
    private Juego juego;
    private Jugador jugador;
    private Texture img, imgBala;
    public PantallaJuegoPrincipal(Juego juego) {
        this.juego = juego;
        img = new Texture("nave.png");
        imgBala = new Texture("bala.png");
        jugador = new Jugador(img, imgBala);

    }
    @Override
    public void show() {

    }
    @Override
    public void render(float v) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        juego.getBatch().begin();

        jugador.update(v);
        jugador.draw(juego.getBatch());

        juego.getBatch().end();
    }
    @Override
    public void resize(int i, int i1) {

    }
    @Override
    public void pause() {

    }
    @Override
    public void resume() {

    }
    @Override
    public void hide() {

    }
    @Override
    public void dispose() {
        img.dispose();
        imgBala.dispose();
    }
}

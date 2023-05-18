package org.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;


public class Jugador {
    private Vector2 posicionJugador;
    private Vector2 posicionBala;
    private Sprite sprite;
    private Sprite spriteBala;
    private float speed;
    private float speedBala;
    public Jugador(Texture img, Texture imgBala) {
        sprite = new Sprite(img);
        sprite.setScale(4);
        this.speed = 500;
        posicionJugador = new Vector2(Gdx.graphics.getWidth()/2f, sprite.getScaleY()*sprite.getHeight()/2f);

        spriteBala = new Sprite(imgBala);
        spriteBala.setScale(1.4f);
        this.speedBala = 400;
        posicionBala = new Vector2(0,10000);

    }
    public void tp() {
        if (posicionJugador.x>=Juego.ANCHO) {
            posicionJugador.x = 2;
        }
        if (posicionJugador.x<=0) {
            posicionJugador.x = Juego.ANCHO;
        }
        if (posicionJugador.y>=Juego.ALTO) {
            posicionJugador.y = 2;
        }
        if (posicionJugador.y<=0) {
            posicionJugador.y = Juego.ALTO;
        }
    }
    public void update(float delta) {
        tp();

        posicionBala.y+=speedBala*delta;

        if (Gdx.input.isKeyPressed(Input.Keys.ENTER) && posicionBala.y>=Gdx.graphics.getHeight()) {
            posicionBala.x = posicionJugador.x+14;
            posicionBala.y = posicionJugador.y+40;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            posicionJugador.x += delta * speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            posicionJugador.x -= delta * speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            posicionJugador.y += delta * speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            posicionJugador.y -= delta * speed;
        }
    }
    public void draw(SpriteBatch batch) {
        sprite.setPosition(posicionJugador.x, posicionJugador.y);
        sprite.draw(batch);
        spriteBala.setPosition(posicionBala.x, posicionBala.y);
        spriteBala.draw(batch);
    }
}

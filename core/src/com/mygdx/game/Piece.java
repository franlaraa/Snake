package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Piece {
        private float width;
        private float positionX;
        private float positionY;
        private final Texture texture= new Texture("badlogic.jpg");

        //constructor (Piece)
    public Piece(float width, float positionX, float positionY) {
        this.width = width;
        this.positionX = positionX;
        this.positionY = positionY;
    }

        /** Method to draw the sprite texture*/
    public void render(SpriteBatch spriteBatch){
        spriteBatch.begin();
        spriteBatch.draw(this.texture, this.positionX * this.width, this.positionY * this.width);
        spriteBatch.end();
    }

    public void dispose(){
        texture.dispose();
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    /**getters and setters of positions X and Y*/
    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    /**methods to increment and decrement X and Y*/
    public void incrementX(float positionX){
        this.positionX= positionX++;
    }
    public void decrementX(float positionX){
        this.positionX= positionX--;
    }
    public void incrementY(float posicionY){
        this.positionY=posicionY++;
    }
    public void decrementY(float posicionY){
        this.positionY=posicionY--;
    }

}

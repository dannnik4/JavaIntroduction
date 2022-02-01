package com.hillel.classwork.lesson14.Chess;

public abstract class ChessItem implements Drawable {

    protected int x, y;
    protected int value;

    public int getValue() {
        return value;
    }

}
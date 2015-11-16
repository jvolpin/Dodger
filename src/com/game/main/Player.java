package com.game.main;

import java.awt.*;

/**
 * Created by jvolpin on 15/11/15.
 */
public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    public void tick() {
        x += velX;
        y += velY;


    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);

    }
}

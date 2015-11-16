package com.game.main;

import javax.swing.JFrame;
import java.awt.*;

/**
 * Created by jvolpin on 14/11/15.
 */
public class Window extends javax.swing.JFrame {

    private static final long serialVersionUID = -93129846129498L;

    public Window (int width, int height, String title, Game game){
        JFrame frame = new JFrame(title);
        Dimension size = new Dimension(width, height);
        frame.setMinimumSize(size);
        frame.setPreferredSize(size);
        frame.setMaximumSize(size);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(game);
        frame.setVisible(true);
        game.start();



    }


}

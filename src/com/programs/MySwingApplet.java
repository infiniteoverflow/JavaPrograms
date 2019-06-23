package com.programs;

/*
<object code = "MySwingApplet" width=200 height=200>
</object>
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingApplet extends JApplet {
    JButton jAlpha,jBeta;

    JLabel jlab;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch (java.lang.Exception e) {

        }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());
        jAlpha = new JButton("Alpha");
        jBeta = new JButton("Beta");

        jAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha is Pressed");
            }
        });


        jBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta is Pressed");
            }
        });

        add(jAlpha);
        add(jBeta);

        jlab = new JLabel("Press a Button");
        add(jlab);
    }

}

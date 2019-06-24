package com.programs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxDemo extends JApplet {

    String data[] = {"C","C++","Java","PHP"};
    JButton show;
    JComboBox langs;
    JLabel jlab;
    String s;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        public void run() {
                            makeGUI();
                        }
                    }
            );
        } catch (java.lang.Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {

        setLayout(new FlowLayout());

        langs = new JComboBox(data);
        add(langs);

        langs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = langs.getSelectedItem().toString();
            }
        });

        show = new JButton("Show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText(s);
            }
        });
        add(show);

        jlab = new JLabel();
        add(jlab);
    }
}

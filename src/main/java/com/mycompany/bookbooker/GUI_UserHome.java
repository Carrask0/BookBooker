/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookbooker;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class GUI_UserHome {

    private static JFrame frame = null;
    private static JPanel panel;

    public GUI_UserHome() {
        
        if(frame == null) {
            
            frame = new JFrame();
            panel = new JPanel();

            frame.setSize(350, 700);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setLayout(null);

            // New label
            JLabel label = new JLabel("User Home");
            label.setBounds(10, 20, 80, 25);
            panel.add(label);

            frame.setVisible(true);
        }
    }
}

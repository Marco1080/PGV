/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mariokart;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author 2damb
 */
public class GestorFondo implements Runnable{
    JPanel jframeMain;
    boolean running = true;
    public GestorFondo(JPanel jframeMain) {
        this.jframeMain = jframeMain;
    }
    
    
    @Override
    public void run() {
        Color nuevoColor;
        while ( running) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorFondo.class.getName()).log(Level.SEVERE, null, ex);
            }
            nuevoColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            jframeMain.setBackground(nuevoColor);
        }
    }
    
}

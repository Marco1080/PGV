package com.mycompany.mariokart;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class Coche implements Runnable {
    
    JProgressBar circuito;
    String nombre;
    String color;
    boolean running = true;

    public Coche(JProgressBar circuito) {
        this.circuito = circuito;
    }

    @Override
    public void run() {
        
            for (int i = 1; i <= 100 && running; i++) {
                circuito.setValue(i);
                try {
                    Random rn = new Random();
                    int delay = rn.nextInt(10) + 1;
                    Thread.sleep(delay * 100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }
    public void detenerCoche() {
        running = false;
    }
}

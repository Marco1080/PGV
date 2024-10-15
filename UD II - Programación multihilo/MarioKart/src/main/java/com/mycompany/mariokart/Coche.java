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
        
            for (int i = 1; i <= 100; i++) {
                circuito.setValue(i);
                try {
                    Random rn = new Random();
                    int delay = rn.nextInt(10) + 1;
                    Thread.sleep(delay *100);
                    if ( !running ) {
                        Thread.sleep(5000);
                        running = true;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
    }
    public void detenerCoche() {
        running = false;
    }
    
    public static void mostrarPrimerLugar(JProgressBar bar1,
            JProgressBar bar2, 
            JProgressBar bar3, 
            JProgressBar bar4) {
        
                System.out.println(bar1.getValue());
                System.out.println(bar2.getValue());
                System.out.println(bar3.getValue());
                System.out.println(bar4.getValue());
    }
}

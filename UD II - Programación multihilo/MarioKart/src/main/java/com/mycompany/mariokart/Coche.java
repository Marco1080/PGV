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
    //static Coche coche;
    static  boolean hasEnd = false;
    static int place = 1;

    public Coche(JProgressBar circuito, String color) {
        this.circuito = circuito;
        this.color = color;
    }

    @Override
    public void run() {
        
            for( int y = 0; y < 3; y++) {
                for (int i = 1; i <= 100; i++) {
                circuito.setValue(i);
                
                try {
                    Random rn = new Random();
                    int delay = rn.nextInt(10) + 1;
                    Thread.sleep(delay *10);
                    if ( !running ) {
                        Thread.sleep(5000);
                        running = true;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
                }
                
}           
                if ( y == 2){
                    hasEnd = true;
                    System.out.println(this.color + " ha llegado en el puesto " + place);
                    String puesto = "" + place;
                    JFrameMain.colocarPuesto(this.color, puesto);
                    place++;
                }
    
                }
            }
            
    public void  detenerCoche() {
        running = false;
    }
    
}

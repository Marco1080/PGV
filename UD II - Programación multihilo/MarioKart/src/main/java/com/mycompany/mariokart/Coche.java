package com.mycompany.mariokart;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Coche implements Runnable {
    
    JProgressBar circuito;
    String nombre;
    String color;
    boolean running = true;
    boolean amIRunning = true;
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
                    else if (!amIRunning){
                        Thread.sleep(3000);
                        amIRunning = true;
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
    
    public void lanzarCaparazonRojo(Coche[] lista) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(lista.length); 
        lista[numeroAleatorio].amIRunning = false;
        System.out.println(numeroAleatorio + " se ha detenido " + lista[numeroAleatorio].color);
    }
    
    public void lanzarCaparazonAzul(Coche[] lista) {
        Coche cocheMasRapido = lista[0];
        for(int i = 0; i < lista.length;i++) {
            if(cocheMasRapido.circuito.getValue() < lista[i].circuito.getValue()){
                cocheMasRapido = lista[i];
            }
        }
        cocheMasRapido.amIRunning = false;
    }
}

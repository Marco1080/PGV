/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrerahilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;


/**
 *
 * @author 2damb
 */
public class Utilities implements Runnable{
    JProgressBar barra;

    public Utilities(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run() {
        for( int i = 1; i <=100; i++) {
            try {
                Thread.sleep(100);
                System.out.println(i);
                barra.setValue(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

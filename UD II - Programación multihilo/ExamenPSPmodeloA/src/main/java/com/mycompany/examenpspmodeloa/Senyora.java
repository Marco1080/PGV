/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpspmodeloa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2damb
 */
public class Senyora implements Runnable {

    String nombre;

    public Senyora(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Soy " + nombre + " y tardo " + " segundos en cruzar");
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magic;

/**
 *
 * @author tonyi
 */
class Jugador implements Runnable {

    private String nombre;
    private Club nombreClub;

    public Jugador(Club nombreClub, String nombre) {
        this.nombreClub = nombreClub;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        nombreClub.entrarClub(nombre);
    }
}

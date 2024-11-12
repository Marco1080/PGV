/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.magic;

/**
 *
 * @author tonyi
 */
public class Magic {

    public static void main(String[] args) {
        Club club = new Club();

        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new Jugador(club, "Jugador " + i));
            thread.start();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magic;

/**
 *
 * @author tonyi
 */
import java.util.concurrent.Semaphore;

class Club {

    private Semaphore semaphore = new Semaphore(3);

    public void entrarClub(String nombre) {
        try {
            System.out.println(nombre + " está en la puerta del club.");
            semaphore.acquire();

            int tiempo = (1 + (int) (Math.random() * 10));
            System.out.println(nombre + " ha entrado al club por " + tiempo + " minutos");

            Thread.sleep(tiempo * 1000);

            System.out.println(nombre + " ha terminado su partida.");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            semaphore.release();
            System.out.println(nombre + " ha salido del club.");
        }
    }
}

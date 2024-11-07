/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpspmodeloa;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author 2damb
 */
public class PasoDeCebra {

    private final ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public static int numeroSenyora = 0;
    public static int numeroCiclista = 0;
    
    //condition.await()
    boolean libre = true;

    public PasoDeCebra() {
    }

    public void pasarSenyora(String nombre, int tiempo) throws InterruptedException {
        lock.lock();
        Thread thread = new Thread(new Senyora(nombre + numeroSenyora));
        condition.wait();
        lock.unlock();
    }

    public void pasarCiclista() {
        lock.lock();

        lock.unlock();

    }

    public void salirSenyora() {

        condition.signalAll();
    }

    public void salirCiclista() {

        condition.signalAll();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Random;

/**
 *
 * @author hp
 */
public class WorkerBee extends Bee {

    public WorkerBee() {
        super();//call base class (Bee) constructor
        this.setType("Worker");
    }

    @Override
    public void damage() {
        super.damage();
        if (this.getHealth() < 70) {
            this.setAlive(false);
        }
    }
}

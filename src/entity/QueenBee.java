/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author hp
 */
public class QueenBee extends Bee {

    public QueenBee() {
        super();//call base class (Bee) constructor
        this.setType("Queen");
    }

    @Override
    public void damage() {
        super.damage();
        if (this.getHealth() < 20) {
            this.setAlive(false);
        }
    }

}

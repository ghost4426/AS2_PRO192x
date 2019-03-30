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
//male bee
public class Drone extends Bee {

    public Drone() {
        super();
        this.setType("Drone");
    }

    @Override
    public void damage() {
        super.damage();
        if (this.getHealth() < 50) {
            this.setAlive(false);
        }
    }
}

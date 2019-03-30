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
public class Bee {

    private String type;
    private byte health;
    private boolean alive;

    public Bee() {
        this.health = 100;
        this.alive = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    //attack this bee
    public void damage() {
        if (this.alive) {
            this.health = (byte) (this.health - (new Random().nextInt(this.health + 1)));
        }
        if (this.health < 0) {
            this.health = 0;
        }
    }

    @Override
    public String toString() {
        String alive = "Dead";
        if (this.alive) {
            alive = "Alive";
        }
        return String.format("%-7s %7d %7s", this.type, this.health, alive);
    }
}

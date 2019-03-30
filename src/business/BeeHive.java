/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.QueenBee;
import entity.Bee;
import entity.WorkerBee;
import entity.Drone;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hp
 */
public class BeeHive {

    private ArrayList<Bee> listBee;

    public void init() {
        //create list of 10 bees  of Queen, Drone and Worker types
        //in each bee, type and health attributes are randomly chosen

        int type = 0; // 0 = queen bee, 1 = worker bee, 2 = drone
        boolean isHasQueen = false;

        this.listBee = new ArrayList<>();
        while (listBee.size() != 10) {
            type = new Random().nextInt(3);
            //check type = 0 and QueenBee not yet created to create QueenBee
            if (type == 0 && !isHasQueen) {
                listBee.add(new QueenBee());
                isHasQueen = true;
            } // check type = 1 to create WorkerBee
            else if (type == 1) {
                listBee.add(new WorkerBee());
            }// check type = 2 to create WorkerBee 
            else if (type == 2) {
                listBee.add(new Drone());
            }

            
            //check if listbee not contain QueenBee clear and create list again
            if (listBee.size() == 10 && !isHasQueen) {
                listBee.clear();
                System.out.println("------------ loop1");
            }
        }
    }

    public ArrayList<Bee> getAllBees() {
        return listBee;
    }

    //attach all bees
    public void attackBees() {
        for (int i = 0; i < listBee.size(); i++) {
            this.listBee.get(i).damage();
        }
    }

    //check if all bee are dead
    public boolean isAllBeeDead() {
        for (int i = 0; i < listBee.size(); i++) {
            if (this.listBee.get(i).isAlive()) {
                return false;
            }
        }
        return true;
    }
}

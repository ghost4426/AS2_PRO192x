/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.BeeHive;
import entity.Bee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PRO192xA2Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BeeHive bh = null;
        boolean keepRunning = true;
        Scanner s = new Scanner(System.in);
        int choice;
        while (keepRunning) {
            //menu
            System.out.println("--------------Bee hive--------------");
            System.out.println("\t1 - Create bee list");
            System.out.println("\t2 - Attack bees");
            System.out.println("\t3 - Exit");
            System.out.print("Enter your choice (1, 2 or 3): ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    bh = new BeeHive();
                    bh.init();//create 10 bees
                    System.out.println("Bees details at the beginning:");
                    showBees(bh);
                    break;
                case 2:
                    if (bh == null) {
                        System.out.println("No bee!");
                    } else {
                        bh.attackBees();//attach bees
                        System.out.println("Bees details at the moment:");
                        showBees(bh);
                    }
                    break;
                default:
                    keepRunning = false;
            }
        }

    }

    public static void showBees(BeeHive bees) {
    ArrayList<Bee> beeList = bees.getAllBees();
        if (bees.isAllBeeDead()) {
            System.out.println("All bees are dead!");
        }
        for (int i = 0; i < beeList.size(); i++) {
            System.out.printf("%-2d) %s\n", i + 1, beeList.get(i).toString());
        }
    }

}

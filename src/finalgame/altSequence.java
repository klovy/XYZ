/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import static finalgame.Character.getAttack;
import static finalgame.Character.getHealth;
import static finalgame.Character.getSpeed;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mikeb
 */
public class altSequence {

    public static String One() {
        System.out.println(".....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("Your journey is about to begin... ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("On this journey you will defeat monsters\nuntil"
                + " you earn enough coins to purchase\nthe Sword of Destiny and "
                + "use it to kill the Evil Queen.");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
        System.out.println();
        System.out.println("Everytime you slaughter one of the Queen's\nmonsters "
                + "they wil drop a random amount of coins. Once you\nhave "
                + "collected 100 coins I will take you to the\nBlack Smith "
                + "and we will pay him to forge the sword.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println("Here comes a monster now, I hope you're ready to "
                + "begin..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        return ("");
    }

    public static String Attack() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int mon;
        int numb;
        int nMH = 0;
        int nCH = 0;
        mon = rand.nextInt(7);
                
        if (mon <= 3) {
            System.out.println("It's a Goblin!");
            Monster monster = new Monster("Goblin", 5, 15, 5);
        } else if ((mon > 3) && (mon <= 5)) {
            System.out.println("It's an Ogre!!");
            Monster monster = new Monster("Ogre", 15, 15, 10);
        } else {
            System.out.println("Oh Shit! It's a Knight!");
            Monster monster = new Monster("Knight", 20, 20, 10);
        }
        while (nMH > 0);
        {   

            System.out.println("What do you want to do now?\n1: Attack\n2: Heal");
            System.out.print(" : ");
            numb = input.nextInt();
            nMH = Monster.getHealth();
            switch (numb) {
                case 1:
                    while (nMH > 0) { 
                        System.out.printf("You did %d damage\n",
                                Character.getAttack());
                        nMH -= Character.getAttack();
                        System.out.println("The monster attacked you");
                Random seq = new Random();
                int x = seq.nextInt(60);
                int s = Character.getSpeed();
                
                if (s > x) {
                    System.out.print("The enemies attack missed!\n");
                } else {
                    Character.damage( Monster.getAttack());
                    System.out.printf("Health = %d\n", Character.getHealth());
                }
                if(Character.getHealth()<=0 ){
                    System.out.println("You have been defeated");
                    try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
                    System.exit(0);
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
                                     
                    }
                    break;
                case 2:
                    Character.heal(15);
                    System.out.printf("Your Health is now at %d\n", nCH);
                    break;
                    
                default:
                    System.out.println("Invalid option\n You loose a turn for "
                            + "being a little bitch again");
                    break;
            }
            if (nMH <= 0) {
               System.out.printf("You slayed the monster\n");
               Character.setPrize();
            }
            
        }

        return ("");
    }

    public static String Two() {
        System.out.println("You've earned enough coins to buy the sword!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
        System.out.println("Awesome! Now that you've bought the sword you can "
                + "go fight the Evil Queen.");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
        return ("");
    }

    public static String bossFight() {
        Monster boss = new Monster("Evil Queen", 20, 50, 15);

        return ("");
    }
}

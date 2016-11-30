package finalgame;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mikeb
 */
public class Character {

    //fields
    private static String type;
    private static int attack;
    private static int health;
    private static int speed;
    private static int prize = 0;
    

    //constructors
    public static void newCharacter(String type, int attack, int health, int speed) {
        type = type;
        attack = attack;
        health = health;
        speed = speed;
        
    }

    //methods
    public static String getType() {
        return type;
    }
    
    public static int getPrize(){
        
            return prize;
    }
    public static int setPrize(){
        Random rand2 = new Random();
            prize = rand2.nextInt(10) + 16;
            System.out.printf("You earned %d coins for defeating the monster!\n",
                prize);
        return prize;
    }

    public static int getAttack() {
        return attack;
    }

    public static int getHealth() {
        return health;
    }

    public static int getSpeed() {
        return speed;
    }

    public static int setHealth(int health) {
        return health;
    }

    public static String generateChar() {
        Scanner input = new Scanner(System.in);
        int number;
        

        System.out.println("What class will you be?");
        System.out.println("1: Titan");
        System.out.println("2: Hunter");
        System.out.println("3: Warlock");
        System.out.print(" : ");
        number = input.nextInt();

        newCharacter("Titan", 20, 100, 5);

        
        switch (number) {
            case 1: {
                System.out.println("Congratulations! You have chosen the "
                        + " mighty Titan.");
                newCharacter("Titan", 20, 100, 5);
                break;
            }
            case 2: {
                System.out.println("Congratulations! You have chosen the"
                        + " brave Hunter.");
                newCharacter("Hunter", 10, 50, 20);
                break;
            }
            case 3: {
                System.out.println("Congratulations! You have chosen the"
                        + " fierce Warlock");
                newCharacter("Warlock", 15, 75, 15);
                break;
            }
            case 31337: {
                System.out.println("..........");
                System.out.println("You have unlocked a secret character.....");
                newCharacter("Master", 30, 300, 30);
                break;
            }
            default: {
                System.out.println("Invalid input");
                System.out.println("If you want to be a little bitch then you "
                        + "can play as a little bitch");
                newCharacter("Little Bitch", 5, 5, 0);
            }
        }
        return toText();
    }

    public static void heal(int up)
    {
        health += up;
    }

    public static void damage(int down)
    {
        health -= down;
    }

    
    public static String toText() {
        return String.format("%s, Attack = %d, Health = %d, Speed = %d\n",
                type, attack, health, speed);
    }
}

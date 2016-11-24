/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import java.util.Random;

/**
 *
 * @author mikeb
 */
public class Monster {
    //fields

    private static String type;
    private static int attack;
    private static int health;
    private static int speed;

    //constructors
    public Monster(String type, int attack, int health, int speed) {
        this.type = type;
        this.attack = attack;
        this.health = health;
        this.speed = speed;
    }

    //methods
    public static String getType() {
        return type;
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

    public int setHealth() {
        return health;
    }
}

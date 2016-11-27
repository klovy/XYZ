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
public class FinalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int extra;
        int bank = 0;
        int prize = 0;
        System.out.printf(Character.generateChar());
        System.out.printf(Sequence.One());
        while (bank < 100) {
            Runtime.getRuntime().gc();
            System.out.printf(altSequence.Attack());//change to alt seq
            //Monster.getHealth();
            //if (Monster.getHealth ()<= 0) //I'm trying to find a way to reference the monter's health so it will only reward a
                //character if the monster dies, not when you heal
            
            Random rand2 = new Random();
            prize = rand2.nextInt(10) + 16;
            System.out.printf("You earned %d coins for defeating the monster!\n",
                    prize);
            bank += prize;
            
        }
        System.out.println(altSequence.Two());
        System.out.println(altSequence.bossFight());
//okay
    }

}

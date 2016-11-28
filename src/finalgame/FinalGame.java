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
        int nMH = 0;
        
        
        System.out.printf(Character.generateChar());
        System.out.printf(altSequence.One());
        while ( bank < 100) {
            bank +=prize;
            Runtime.getRuntime().gc();
            System.out.printf(altSequence.Attack());//change to alt seq
            
           
        }
        System.out.println(Sequence.Two());
        System.out.println(Sequence.bossFight());

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Megalin
 */
public class GuessTheNumber {
    
    int theNUMBER;
    int max = 100;
    Scanner scanner = new Scanner(System.in);
    
    public GuessTheNumber() {
        Random rand = new Random();
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
        
    }
    
    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");

            }
            else if (move < theNUMBER) {
                System.out.println("Your number is too small");
            }
            else {
                System.out.println("YOU GOT IT BRO");
            }
        }
    }
    
    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Our number is pretty small");
        }
        else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        }
        else {
            System.out.println("Our number is out of range");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //howBigIsMyNumber(0);
        //howBigIsMyNumber(1000);
        
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to my game. Try and guess my impossible"
            + " number. It is between 0 and " + guessGame.max + " inclusive."
            + " just type a number to get started.");
  
        guessGame.play();
    }
    
}

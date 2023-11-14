package fr.wasson;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Random generateur = new Random();
        Scanner scanner = new Scanner(System.in);

        final int NBCASES = 20;
        final int NBLANCES = 5;
        int nbParties = 1;
        int lancer;
        int reste = NBCASES;
        int numCase = 0;
        int index = 1;

        do {
            lancer = 0;

            lancer = generateur.nextInt(6) + 1;
            reste = reste - lancer;
            numCase = numCase + lancer;

            if (numCase > 20) {
                int tmp = numCase - NBCASES;
                numCase = numCase - tmp;
                reste = tmp;
            }

            System.out.print("Lancer " + index++ + " : vous avez fait " + lancer + ". Vous êtes sur la case " + numCase + " (encore " + reste + " cases)");
            scanner.nextLine();

            if (numCase == 20) {
                System.out.println("Vous avez gagné !\nVous avez fait " + nbParties++ + " parties.");
            }

        } while (numCase != 20);

        scanner.close();

    }
    
}

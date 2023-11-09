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
        int reste;
        int numCase;

        do {
            lancer = 0;
            reste = NBCASES;
            numCase = 0;

            for (int i = 1; i <= NBLANCES; i++) {
                lancer = generateur.nextInt(6) + 1;
                reste = reste - lancer;
                numCase = numCase + lancer;
                System.out.print("Lancer " + i + " : vous avez fait " + lancer + ". Vous êtes sur la case " + numCase + " (encore " + reste + " cases)");
                scanner.nextLine();
            };

            if (numCase == 20) {
                System.out.println("Vous avez gagné !\nVous avez fait " + nbParties++ + " parties.");
            } else {
                System.out.println("Vous avez perdu !\nVous avez fait " + nbParties++ + " parties.");
            }

        } while (numCase != 20);

        scanner.close();

    }
    
}

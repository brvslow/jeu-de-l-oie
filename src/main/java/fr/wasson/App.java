package fr.wasson;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Random generateur = new Random();
        Scanner scanner = new Scanner(System.in);

        int nbCases = 20;
        int nbLances = 5;
        int lancer;
        int reste;
        int numCase;

        do {
            lancer = 0;
            reste = nbCases;
            numCase = 0;

            for (int i = 1; i <= nbLances; i++) {
                lancer = generateur.nextInt(6) + 1;
                reste = reste - lancer;
                numCase = numCase + lancer;
                System.out.print("Lancer " + i + " : vous avez fait " + lancer + ". Vous êtes sur la case " + numCase + " (encore " + reste + " cases)");
                scanner.nextLine();
            };

            if (numCase == 20) {
                System.out.println("Vous avez gagné !");
            } else {
                System.out.println("Vous avez perdu !");
            }

        } while (numCase != 20);

        scanner.close();

    }
    
}

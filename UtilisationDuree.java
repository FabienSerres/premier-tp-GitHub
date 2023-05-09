/*
 * UtilisationDuree.java
 */

package lesdurees;

import java.util.Scanner;
import lesdurees.DureeHMS;

/**
 * Utilisation des méthodes traitant les durées
 * @author fabien.serres
 */
public class UtilisationDuree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         testChaine();
    }
    
    /** 
     * Permet de tester si deux dates sont différentes
     * 
     */
    public static void testDifferente() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("Parmi ces 3 durées, "
                + DureeHMS.combienDifferentes(d1, d2, d3) + " sont différentes.");

    }

    /** 
     * Permet de tester si trois durées données sont dans le bon ordre
     * 
     */
    public static void testOrdre() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("ces 3 durées sont "
                + (DureeHMS.ordre(d1, d2, d3) ? " ordonnées " : " dans le désordre"));

    }

  

    /** 
     * Permet de tester si une chaîne saisie est bien une heure
     * 
     */
    public static void testChaine() {
        Scanner entree = new Scanner(System.in);
        String phrase;
        System.out.print("Entrez une chaine : ");
        phrase = entree.nextLine();
        if (DureeHMS.estChaineDuree(phrase)) {
            System.out.println("OK !!");
        } else {
            System.out.println("ERREUR !!! ");
        }
    }

}
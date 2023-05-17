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
     * Lancement des méthodes de test
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         testChaine();
         testOrdre();
         testDifferente();
    }
    
    /** 
     * Permet de tester si deux dates sont différentes
     * 
     */
    public static void testDifferente() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première duree : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième duree : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième duree : ");

        System.out.println("Parmi ces 3 durees, "
                + DureeHMS.combienDifferentes(d1, d2, d3) + " sont differentes.");

    }

    /** 
     * Permet de tester si trois durées données sont dans le bon ordre
     * 
     */
    public static void testOrdre() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première duree : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième duree : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième duree : ");

        System.out.println("ces 3 durees sont "
                + (DureeHMS.ordre(d1, d2, d3) ? " ordonnees " : " dans le desordre"));

    }

  

    /** 
     * Permet de tester si une chaîne saisie est bien une heure
     * 
     */
    public static void testChaine() {
        Scanner entree = new Scanner(System.in);
        String phrase;
        System.out.println("Vous allez entrer une chaine et le programme " 
                         + "vérifiera si elle est bien dans le format hh:mm:ss.");
        System.out.println("Le separeteur ':' peut etre remplace par n'importe " 
                         + "quel caractères.");
        System.out.print("\t==> ");
        phrase = entree.nextLine();
        if (DureeHMS.estChaineDuree(phrase)) {
            System.out.println("La chaine " + phrase + " respecte bien le " 
                               + "format hh:mm:ss");
        } else {
            System.out.println("ERREUR !!! ");
        }
    }

}
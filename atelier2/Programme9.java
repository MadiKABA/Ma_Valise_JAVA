package atelier2;

import java.util.Scanner;
public class Programme9 {

    int nbre_entier;
    float nbre_reel;
    String chaine; 
    Scanner scan = new Scanner(System.in);
    public void saisie()
    {
        System.out.println("Entre le nombre entier: ");
        nbre_entier=scan.nextInt();
        System.out.println("Entre le nombre reel: ");
        nbre_reel=scan.nextFloat();
        System.out.println("Entre le nombre: ");
        chaine=scan.next();

        System.out.println("l'entier saisie: "+nbre_entier);
        System.out.println("le reel saisie est est : "+nbre_reel);
        System.out.println("la chaine saisie est : "+chaine);
    }
    
}

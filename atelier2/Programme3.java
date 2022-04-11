package atelier2;

import java.util.Scanner;

public class Programme3 {

    int nbre1,nbre2,resultat;
    public void produit() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Entre le premier nombre: ");
            nbre1=scan.nextInt();
            System.out.println("Entre le deuxieme nombre: ");
            nbre2=scan.nextInt();
            resultat=nbre1-nbre2;
       System.out.println("La difference de "+nbre1+" + " +nbre2+" = "+resultat);;
        System.out.println("Bonjour P4");
    }   
    
}

package atelier2;

import java.util.Scanner;
public class Programme6 {

    int nbre1,somme=0,resultat;

    public void moyenne_de_5_entiers_positif()
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            do{
                System.out.println("Entre le nombre: "+i);
                nbre1=scan.nextInt();
            }while(nbre1<=0);
            somme=somme+nbre1;
        }
        resultat=somme/5;

        System.out.println("la moyenne des 5 nombre saisie est : "+resultat);

    } 
    
}

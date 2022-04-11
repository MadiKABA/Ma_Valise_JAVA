package atelier2;

import java.util.Scanner;
public class Programme5 {
    int nbre1,nbre2,resultat;
    

    public void quoatient() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Entre le premier nombre: ");
            nbre1=scan.nextInt();
            do{
                System.out.println("Entre le deuxieme nombre: ");
                nbre2=scan.nextInt();
            }while(nbre2<=0);

            resultat=nbre1/nbre2;
            System.out.println("Le quoatient de "+nbre1+" + " +nbre2+" = "+resultat);;
           
    
    }   
}

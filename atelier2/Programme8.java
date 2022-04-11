package atelier2;

import java.util.Scanner;
public class Programme8 {
    
    int nbre;
    Scanner scan = new Scanner(System.in);
    public void affciher()
    {
        do{
            System.out.println("Entre le nombre de valuer a afficher: ");
            nbre=scan.nextInt();
        }while(nbre<=0);

        System.out.println("Les nombre compros entre 1 et  "+nbre+" sont :");
        for (int j = 1; j <= nbre; j++) {
            System.out.println(j);
        }
    }
}

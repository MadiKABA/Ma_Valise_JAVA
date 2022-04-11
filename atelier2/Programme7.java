package atelier2;


import java.util.Scanner;
public class Programme7 {
    
    int nbre;
    Scanner scan = new Scanner(System.in);
    

    public void deternimer_signe_nombre()
    {
        System.out.println("Entre le nombre: ");
        nbre=scan.nextInt();

        if (nbre==0) {
            System.out.println("Le nombre : "+nbre+ " est null");
        }if (nbre<0) {
            System.out.println("Le nombre : "+nbre+ " est negatif");
        } else {
            System.out.println("Le nombre : "+nbre+ " est positif");
        }
    }
}

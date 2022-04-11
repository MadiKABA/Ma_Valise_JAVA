package atelier2;


import java.util.Scanner;
public class Programme4 {

    int nbre1,nbre2,resultat;
    public void quoatient() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Entre le premier nombre: ");
            nbre1=scan.nextInt();
            System.out.println("Entre le deuxieme nombre: ");
            nbre2=scan.nextInt();
            if (nbre2>0) {
                resultat=nbre1/nbre2;
                System.out.println("Le quoatient de "+nbre1+" + " +nbre2+" = "+resultat);;
            }else{
                System.out.println("impossible de diviser par 0");
            }
    
    }   
    
    
}

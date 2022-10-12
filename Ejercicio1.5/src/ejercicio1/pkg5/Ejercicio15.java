package ejercicio1.pkg5;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota1, nota2;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nota1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota2 :");
        nota2 = sc.nextInt();
        
        //calculamos la media
        double media = (nota1 + nota2) / 2.0;
        
        System.out.println("La media es: " + media);
    }
    
}

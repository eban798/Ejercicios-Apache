package ejercicio2.pkg4;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca otro numero: ");
        int n2 = sc.nextInt();
        
        if (n1 == n2) {
            System.out.println("Son iguale");
        } else {
            if (n1 > n2){
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n1 + " es mayor que " + n1);
            }
        }
    }
    
}

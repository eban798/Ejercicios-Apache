package ejercicio2.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner("System.in");
        int n1, n2;
        int mayor, menor;
        
        System.out.print("Introduzca un numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca otro: ");
        n2 = sc.nextInt();
        
        mayor = n1 > n2 ? n1 : n2;
        menor = n1 < n2 ? n1 : n2;
        System.out.println(mayor + ", " + menor);
    }
    
}

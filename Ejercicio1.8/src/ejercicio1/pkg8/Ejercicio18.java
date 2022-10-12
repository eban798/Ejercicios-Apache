
package ejercicio1.pkg8;

import java.util.Locale;
import java.util.Scanner;
/*
* Los datos de entrada que necesitamos son:
* -cantidad vendida en el trimestre 1 (de peras y manzanas)
* -cantidad vendida en el trimestre 2 (idem)
* -cantidad vendida en el trimestre 3 (idem)
* -cantidad vendida en el trimestre 4 (idem)
*/
/**
 *
 * @author PC 21
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;
        
        int vManza1t, vManza2t, vManza3t, vManza4t;
        int vPeras1t, vPeras2t, vPeras3t, vPeras4t;
        
        double impTotal;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del primer trimestre: ");
        vManza1t = sc.nextInt();
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del segundo trimestre: ");
        vManza2t = sc.nextInt();
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del tercer trimestre: ");
        vManza3t = sc.nextInt();
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del cuarto trimestre: ");
        vManza4t = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del primer trimestre: ");
        vPeras1t = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del segundo trimestre: ");
        vPeras2t = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del tercer trimestre: ");
        vPeras3t = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del cuarto trimestre: ");
        vPeras4t = sc.nextInt();
        
        impTotal = (vManza1t + vManza2t + vManza3t + vManza4t) * PRECIO_MANZANAS;
        impTotal = (vPeras1t + vPeras2t + vPeras3t + vPeras4t) * PRECIO_PERAS;
        
        System.out.println("El importe total es de: " + impTotal + " euros");
    }
    
}

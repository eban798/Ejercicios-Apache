package ejercicio1.pkg9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioMnazanas, precioPeras;
        
        int vManza1t, vManza2t, vManza3t, vManza4t;
        int vPeras1t, vPeras2t, vPeras3t, vPeras4t;
        
        double importeTotal;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        
        System.out.print("Precio del kilo de manzanas: ");
        double precioManzanas = sc.nextDouble();
        
         System.out.print("Precio del kilo de peras: ");
        precioPeras = sc.nextDouble();
        
        System.out.print("Ventas (en kilo) del primer trimestre: ");
        vManza1t = sc.nextInt();
        System.out.print("Ventas (en kilo) del primer trimestre:");
        vPeras1t = sc.nextInt();
        
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
        int PRECIO_MANZANAS;
        
     
        importeTotal = (vManza1t + vManza2t + vManza3t + vManza4t) * precioManzanas;
        importeTotal += (vPeras1t + vPeras2t + vPeras3t + vPeras4t) * precioPeras;
        
        System.out.println("El importe total es de: " + importeTotal + " euros");
        
        
        
    }
    
}

package ejercicio2.pkg8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a, b, c;
        double x1, x2, d;
        
        System.out.print("Introduzca primer coeficiente (a): ");
        a = sc.nextDouble();
        System.out.print("Introduzca primer coeficiente (b): ");
        b = sc.nextDouble();
        System.out.print("Introduzca primer coeficiente (c): ");
        c = sc.nextDouble();
        
        d = (b * b - 4 * a * c);
        if (d < 0) {
            System.out.println("No existen solucione reales");
        } else {
            if (a == 0) { 
                System.out.println("No es una ecuacion de segundo grado");
            } else {
             x1 = (-b + Math.sqrt(d)) / (2 * a);
             x2 = (-b + Math.sqrt(d)) / (2 * a);
             
             System.out.println("Solucion 1: " + x1);
             System.out.println("Solucion 1: " + x2);   
        }
    } 
}
}
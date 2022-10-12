package ejercicio1.pkg10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.14;
        double radio;
        double area, longitud;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Escriba el radio: ");
        radio = sc.nextDouble();
        
        longitud = 2 * PI * radio;
        area = PI * radio * radio;
        
        System.out.println("La longitud del circulo es: " + longitud);
        System.out.println("El area de la circunferencia es: " + area);
    }  
}

package ejercicio1.pkg7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n;
        int redondeo; 
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Escriba un numero decimal (con punto): ");
        n = sc.nextDouble();
        
        redondeo = (int) (n + 0.5);
        System.out.println(n + " redondeado es: " + redondeo);
    }
    
}

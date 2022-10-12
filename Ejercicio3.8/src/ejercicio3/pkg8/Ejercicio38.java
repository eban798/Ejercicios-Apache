package ejercicio3.pkg8;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double factorial;
        int num;
        
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        
        factorial = 1;
        for (int i = num; i > 0; i--){
            factorial = factorial *i;
            
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    
}

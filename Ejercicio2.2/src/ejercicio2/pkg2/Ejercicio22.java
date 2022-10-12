package ejercicio2.pkg2;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Introduzca un numero: ");
            int n1 = sc.nextInt();
            System.out.print("Introduzca otro numero: ");
            int n2 = sc.nextInt();
            
            if (n1 == n2) {
                System.out.println("Ambos numeros son iguales");
            }    else {
                System.out.println("Lo numeros son distintps");
            }
        }
        
        
    }
    


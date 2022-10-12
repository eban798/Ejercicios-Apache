package ejercicio3.pkg4;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    
}

package ejercicio3.pkg14;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class EJERCICIO314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir n: ");
        int n = sc.nextInt();
        
        for (int fila = 1; fila <= n; fila++){
            for (int col = fila; col <= n; col ++){
                System.out.print("* ");
            }
            System.out.println("");
    }
    
}
}

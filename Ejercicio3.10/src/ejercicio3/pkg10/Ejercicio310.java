package ejercicio3.pkg10;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
        
        System.out.println("Introduzca un numero (de 1 a 10): ");
        num = sc.nextInt();        
    } while (!(1 <= num && num <= 10));
    
    System.out.println("\n\nTabla del " + num);
    for (int i = 1; i <= 10; i++){
       System.out.println(num + " x " + i + " = " + num * i);
}
    

    }    
}
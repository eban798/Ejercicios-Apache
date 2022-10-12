package ejercicio3.pkg3;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int numSecreto = (int) (Math.random() * 100 + 1);
        
        System.out.print("Introduzca un numero entre 1 y 100: ");
        int num = sc.nextInt();
        
        while (numSecreto != num && num != -1){
            if (numSecreto < num){
                System.out.println("Menor");
            } else {
                System.out.println("Mayor");
            }
            System.out.print("Introduzca otro numero: ");
            num = sc.nextInt();
        }
        if (numSecreto == num){
            System.out.println("Enhorabuena...");
        } else {
            System.out.println("Otra vez sera...");
        }
    }
}

   

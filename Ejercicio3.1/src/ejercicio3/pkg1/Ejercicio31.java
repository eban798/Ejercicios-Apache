package ejercicio3.pkg1;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean esPar, esPositivo;
        System.out.print("Introduzca numero: ");
        int num = sc.nextInt();
        
        while (num != 0){
            esPar = num % 2 == 0 ? true : false;
            esPositivo = num >= 0 ? true : false;
            
            System.out.println("Es par?: " + esPar + "\nEs positivo?. " + esPositivo);
            System.out.println("Cuadrado: " + num * num);
            System.out.print("Introduzca otro numero: ");
            
            num = sc.nextInt();
        }
    }
}
    


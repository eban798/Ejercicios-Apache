package ejercicio1.pkg3;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int aActual; //año en curso (actual)
        int aNacimiento;  //año de nacimiento
        int edad; 
        Scanner sc = new Scanner(System.in);
        
        //leemos los datos
        System.out.print("Año de nacimieno: ");
        aNacimiento = sc.nextInt();
        System.out.print("Año actual: ");
        aActual = sc.nextInt();
        
        edad = aActual - aNacimiento;
        
        System.out.println("Su edad es: " + edad + " años.");
    }
}

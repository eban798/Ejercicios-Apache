package ejercicio3.pkg2;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0;
        int contadorAlumnos = 0, 
                contadorMayorEdad = 0;
        double media;
        
        System.out.print("Introduzca edad: ");
        int edad = sc.nextInt();
        
        while (edad >= 0){
            sumaEdades += edad;
            contadorAlumnos++;
            if (edad >= 18) {
                contadorMayorEdad++;
        }
            System.out.print("Introduzca edad: ");
            edad = sc.nextInt();
        }
        media= (double) sumaEdades / contadorAlumnos;
        
        System.out.println("Suma de todas la edades: " + sumaEdades);
        System.out.println("Media: " + media);
        
        System.out.println("Numero total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contadorMayorEdad);
    }
}
   
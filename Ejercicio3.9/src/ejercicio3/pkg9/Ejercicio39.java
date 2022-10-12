package ejercicio3.pkg9;

import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int etiquetaArbolMasAlto,
                alturaArbolMasAlto;
        
        int etiqueta = 0;
        int altura;
        
        System.out.print("Altura del arbol ( " + etiqueta + "): ");
        altura = sc.nextInt();
        alturaArbolMasAlto = altura;
        etiquetaArbolMasAlto = 0;
        while (altura != -1){
            if (altura > alturaArbolMasAlto){
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta++;
            System.out.print("Altura del Arbol (" + etiqueta + ") ");
            altura = sc.nextInt();
            
        }
        if (alturaArbolMasAlto == -1){
            System.out.println("No hay ningun arbol");
        } else {
            System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
            System.out.println("Corresponde al arbol con etiqueta:" + etiquetaArbolMasAlto);
        }
    }
    
}

package ejercicio2.pkg14;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author PC 21
 */
public class Ejercicio214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int diasDelMes=0;
        
        System.out.print("Introduzca dia: ");
        int dia = sc.nextInt();
        System.out.print("Introduzca mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduzca año: ");
        int año = sc.nextInt();
        
        if (mes == 2){
            diasDelMes = 28;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasDelMes = 30;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasDelMes = 31;
        }
        
        dia ++;
        
        if (dia > diasDelMes) {
            dia = 1;
            mes++;
            
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        
        if (año ==0) {
            año = 1;
        }
        
        System.out.println(dia + "/" + mes + "/" + año);
    
}
}

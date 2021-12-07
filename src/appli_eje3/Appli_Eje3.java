/*Ejercicio 3: Guillermo tiene N dólares. 
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero 
que tiene entre los tres.
 */
package appli_eje3;

import java.util.Scanner;

public class Appli_Eje3 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       float guillermo, luis, juan, total;
        System.out.println("Digite la cantidad de dinero que tiene Guillermo:");
        guillermo = entrada.nextFloat();
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        total = guillermo+luis+juan;
        System.out.println("\nEl total de dinero entre los tres es: "+total);
    }
    
}

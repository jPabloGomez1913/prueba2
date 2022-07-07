
package prueba2;

import java.util.Scanner;


public class Prueba2 {

  
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Scanner entrada = new Scanner(System.in);
        int suma,num,num2;
        System.out.println("Ingrese un numero");
        num=entrada.nextInt();
        System.out.println("Ingrese un numero");
        num2=entrada.nextInt();
        suma=num+num2;
        System.out.println("la suma es: "+suma);
    }
    
}

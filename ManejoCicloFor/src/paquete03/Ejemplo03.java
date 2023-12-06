/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        String cadena="";
        System.out.println("ingresar limite");
        limite=entrada.nextInt();
        for (int i = 1; i <= limite; i++) {
            entrada.nextLine();
            System.out.println("Ingrese nombre del jugador");
            String nombre=entrada.nextLine();
            System.out.println("Posicion en el campo de juego");
            String posicion=entrada.nextLine();
            System.out.println("Edad del jugador");
            int edad=entrada.nextInt();
            System.out.println("Estatura");
            double estatura=entrada.nextDouble();
            cadena=String.format("%s%d. %s-%s-,edad %d,estatura %.2f\n",cadena,i,nombre,
                    posicion,edad,estatura);
        }
        System.out.printf("Listado de jugadores\n%s",cadena);
    }
}

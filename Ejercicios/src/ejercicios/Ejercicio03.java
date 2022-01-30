/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            double calificacion;
            String nombre;
            int i = 1;
            
            while (i <= 4) {
                System.out.print("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                entrada.nextLine();
                if (calificacion < 0 || calificacion > 10) {
                    throw new Exception("Ingrese números del 0 al 10");
                }
                System.out.print("Ingrese nombre: \n");
                nombre = entrada.nextLine();
                
                if (nombre.equals("Mario") || nombre.equals("Ana")
                        || nombre.equals("Pedro") || nombre.equals("Carolina")
                        || nombre.equals("Luis")) {
                    throw new Exception("Ingrese nombres válidos");
                }

                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n\n",
                        nombre, calificacion);
                i = i + 1;
            }

            System.out.printf("%s\n", "Gracias por usar el sistema");

        } catch (InputMismatchException e) {
            System.out.printf("Existe un error de tipo %s\n",
                    e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción. %s\n",
                    e);
        }
    }
}

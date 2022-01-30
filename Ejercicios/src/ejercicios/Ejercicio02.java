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
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double calificacion;
        double promedio = 0;
        double suma = 0;
        int numeroCalificaciones = 4;
        int i = 1;
        while (i <= 4) {
            try {
                
                System.out.print("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                if (calificacion < 0 || calificacion > 10) {
                    throw new Exception("Ingrese números del 0 al 10");
                }
                suma = suma + calificacion;
                i = i + 1;
            
                promedio = suma / numeroCalificaciones;

                

            } catch (InputMismatchException e) {
                System.out.printf("Existe un error de tipo %s\n",
                        e);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción. %s\n",
                        e);
            }
        }
        
        System.out.printf("%.2f\n", promedio);
    }
}

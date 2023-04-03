/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosclase1;

/**
 *
 * @author mara
 */
public class EjerciciosClase1 {

    public static void main(String[] args) {
        // Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
        int numeroInicio = 5;
        int numeroFin = 14;
        
        int contador = numeroInicio;
        
        while (contador <= numeroFin){
            System.out.println(contador);
            contador++;
        }
        
        // A lo anterior, solo muestre los números pares
        contador = numeroInicio;
        
        while (contador <= numeroFin){
            if (contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}

package com.ashell._10_ejercicios;

import java.util.Arrays;

// 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] integerNumbers = {
            { 1, 2, 3, 4, 5 },
            { 11, 22, 33, 44, 55 }
        };

        for (int i = 0; i < integerNumbers.length; i++) {
            for (int j = 0; j < integerNumbers[i].length; j++) {
                System.out.print("(" + i + ", "+ j + "): " + String.format("%2d", integerNumbers[i][j])  );
                String sep = (j != integerNumbers[i].length - 1) ? " | ":"\n";
                System.out.print(sep);
            }
        }
    }
}

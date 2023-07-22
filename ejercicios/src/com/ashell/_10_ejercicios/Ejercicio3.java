package com.ashell._10_ejercicios;

import java.util.Vector;

// 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
public class Ejercicio3 {
    public static void main(String[] args) {
        Vector<Integer> vectorInteger = new Vector<>(5);

        for (int i = 1; i <= 5 ; i++) {
            vectorInteger.add(i);
        }

        System.out.println("initialCapacity: " + vectorInteger.capacity() + ", size: " + vectorInteger.size());

        System.out.println(vectorInteger);

        vectorInteger.remove(1); // 2do elemento
        vectorInteger.remove(1); // 3er elemento ahora es el 2do

        System.out.println("initialCapacity: " + vectorInteger.capacity() + ", size: " + vectorInteger.size());
        System.out.println(vectorInteger);

    }
}

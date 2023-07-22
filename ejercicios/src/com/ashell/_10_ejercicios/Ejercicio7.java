package com.ashell._10_ejercicios;

import java.io.IOException;

// 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
public class Ejercicio7 {
    public static void main(String[] args) {
        try {
            int res = dividePorCero(12, 0);
            System.out.println(res);
        }catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse -> " + e.getMessage());
        }finally {
            System.out.println("Demo de código.");
        }
    }

    private static int dividePorCero(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

package com.ashell._10_ejercicios;

/*
Dada la función:
    public static String reverse(String texto) { }
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */
public class Ejercicio0 {
    public static void main(String[] args) {
        String text = "Ayer comí hamburguesita!";
        System.out.println(reverse(text));
    }

    public static String reverse(String texto) {
        StringBuilder textpm = new StringBuilder(texto);

        return textpm.reverse().toString();
    }

}

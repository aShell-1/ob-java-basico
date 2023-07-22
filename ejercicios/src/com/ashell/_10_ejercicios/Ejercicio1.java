package com.ashell._10_ejercicios;

// 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
public class Ejercicio1 {
    public static void main(String[] args) {
        String[] arrayOfTexts = {"Palabras", "Poderosas", "Para", "Rellenar", "Arrays"};
        for ( String text : arrayOfTexts ) {
            System.out.println(text);
        }
    }
}

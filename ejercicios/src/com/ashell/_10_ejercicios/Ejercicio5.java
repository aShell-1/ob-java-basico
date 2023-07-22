package com.ashell._10_ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

// 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> stringsAL = new ArrayList<>();
        stringsAL.add("awa");
        stringsAL.add("ewe");
        stringsAL.add("owo");
        stringsAL.add("uwu");
        System.out.println("ArrayList: "+ stringsAL);

        for (String st : stringsAL) {
            System.out.println("-> " + st);
        }

        LinkedList<String> stringsLL = new LinkedList<>(stringsAL);
        System.out.println("LinkedList: " + stringsLL);

        for (String st2 : stringsAL) {
            System.out.println("-> " + st2);
        }
    }
}

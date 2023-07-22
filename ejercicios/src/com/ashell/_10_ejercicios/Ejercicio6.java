package com.ashell._10_ejercicios;

import java.util.ArrayList;

// 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> integerAL = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++) {
            integerAL.add(i);
        }

        for (int i = 0; i < integerAL.size() ; i++) {
            if ((integerAL.get(i) % 2) == 0) integerAL.remove(i);
        }

        for (Integer i : integerAL) {
            System.out.println(i);
        }
    }
}

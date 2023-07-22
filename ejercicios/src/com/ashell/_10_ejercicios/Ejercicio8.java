package com.ashell._10_ejercicios;

import java.io.*;

// 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
public class Ejercicio8 {
    public static void main(String[] args) {
        String pathInFile = "E:/awa.txt";
        String pathOutFile = "E:/awa_copy.txt";

        makeCopyFile(pathInFile, pathOutFile);
    }

    private static void makeCopyFile(String fileIn, String fileOut) {
        try {
            FileInputStream input = new FileInputStream(fileIn);
            byte[] dataBytes = input.readAllBytes();
            input.close();

            PrintStream output = new PrintStream(fileOut);
            output.write(dataBytes);
            output.close();

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

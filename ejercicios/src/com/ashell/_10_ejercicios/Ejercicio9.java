package com.ashell._10_ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

/*
La idea de este script es que, a partir de un archivo txt con datos separados por comas
(siendo la primera palabra un título de cabecera para el resto de las palabras de la misma línea),
se genere un archivo json manteniendo toda su estructura.

Ejemplo contenido de txt:
students, liam, olivia, noah, emma, ava, oliver, isabella, sophia, elijah, mia, james, amelia, william, harper, benjamin, evelyn, lucas, abigail, alexander, emily
courses, python programming, web development fundamentals, java for beginners, introduction to data science, javascript essentials, mobile app development
languages, python, java, javascript, c, c++, ruby, go, swift, php, kotlin

El archivo txt usado, se deja adjunto.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        String pathInFile = "E:/details.txt";
        String pathOutFile = "E:/soyunjson.json";

        try {
            String textInFile = getText(pathInFile);

            String[] lines = textInFile.split("\n");
            String[] strings;
            String keyName;

            HashMap<String, ArrayList<String>> properties = new HashMap<>();
            ArrayList<String> tmp = new ArrayList<>();

            for (String line : lines) {
                strings = line.split(",");
                keyName = strings[0].trim();

                for (int i = 1; i < strings.length; i++) {
                    tmp.add(strings[i].trim());
                }
                properties.put(keyName, new ArrayList<>(tmp));
                tmp.clear();
            }
            makeJson(pathOutFile, generateContent(properties));

        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private static String getText(String path) {
        // No funciona bien con los caracteres con tildes, se puede mejorar con FileReader y BufferReader.
        try (FileInputStream input = new FileInputStream(path)) {
            int i = input.read();
            StringBuilder text = new StringBuilder();
            while (i != -1) {
                text.append((char)i);
                i = input.read();
            }
            input.close();
            return text.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String generateContent( HashMap<String, ArrayList<String>> map ) {
        int keysSize = map.size();
        int valuesSize = 0;
        int i = 0;
        int j = 0;

        StringBuilder textContent = new StringBuilder("{\n");
        for (Map.Entry<String, ArrayList<String>> es : map.entrySet()) {
            textContent.append("\t\"" + es.getKey() + "\": [");
            valuesSize = es.getValue().size();
            for (String ek : es.getValue()) {
                textContent.append("\n\t\t\""+ek+"\"");
                if (j != valuesSize - 1) textContent.append(",");
                j++;
            }
            j = 0; // Reset iterations
            textContent.append("\n\t]");
            if (i != keysSize - 1) textContent.append(",");
            textContent.append("\n");
            i++;
        }
        textContent.append("}");

        return textContent.toString();
    }

    private static void makeJson(String path, String text) {
        try {
            PrintStream info = new PrintStream(path);
            info.write(text.getBytes());
            info.close();

            System.out.println("\nJson file created c:");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

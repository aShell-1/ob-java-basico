package com.ashell;

public class _03_estructurascontrol {
    public static void main(String[] args) {

        String[] wordsarray = {"Después", "que", "te", "fuiste", "de", "mi", "vida", "Me", "la", "paso", "jangueando", "con", "perras", "pero", "mirando", "mi", "cel"};

        //StringBuilder lyrics = new StringBuilder();
        String lyrics = "";
        for (String word: wordsarray ) {
            lyrics =  lyrics + word + " "; // StringBuilder está genial, pero por ahora lo dejo así
            if (word.equals("vida")) lyrics = lyrics + "\n";
        }

        System.out.println(lyrics);
    }
}

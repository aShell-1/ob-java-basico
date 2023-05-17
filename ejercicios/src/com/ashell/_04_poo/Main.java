package com.ashell._04_poo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Class");

        SmartPhone movil = new SmartPhone(
                "Apple",
                "z13u",
                250.60f,
                new String[]{"Wifi", "Bluetooth"},
                "IOS",
                true,
                true,
                true
        );
        System.out.println(movil);

        SmartWatch smawatch = new SmartWatch(
                "Xiaomi",
                "Poco",
                110.20f,
                new String[]{"Wifi"},
                "Wear OS",
                true,
                true
        );
        System.out.println(smawatch);
    }
}

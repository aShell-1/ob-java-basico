package com.ashell._04_poo;

import java.util.Arrays;

public class SmartPhone extends SmartDevice{
    boolean sensorGiroscopio;
    boolean microfono;
    boolean camara;

    public SmartPhone(String fabricante, String modelo, float precio, String[] conectidad, String sistemaOperativo, boolean sensorGiroscopio, boolean microfono, boolean camara) {
        super(fabricante, modelo, precio, conectidad, sistemaOperativo);
        this.sensorGiroscopio = sensorGiroscopio;
        this.microfono = microfono;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone [" +
                "\n\tFabricante: " + fabricante +
                "\n\tModelo: " + modelo +
                "\n\tPrecio: " + precio +
                "\n\tConectividad: " + Arrays.toString(conectidad) +
                "\n\tSistema Operativo: " + sistemaOperativo +
                "\n\tSensor giroscopio: " + sensorGiroscopio +
                "\n\tMicrófono: " + microfono +
                "\n\tCámara: " + camara +"\n]";
    }
}

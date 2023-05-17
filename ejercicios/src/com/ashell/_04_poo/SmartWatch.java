package com.ashell._04_poo;

import java.util.Arrays;

public class SmartWatch extends SmartDevice{
    boolean podometro;
    boolean resistenciaAcuatica;

    public SmartWatch(String fabricante, String modelo, float precio, String[] conectidad, String sistemaOperativo, boolean podometro, boolean resistenciaAcuatica) {
        super(fabricante, modelo, precio, conectidad, sistemaOperativo);
        this.podometro = podometro;
        this.resistenciaAcuatica = resistenciaAcuatica;
    }

    @Override
    public String toString() {
        return "SmartPhone [" +
                "\n\tFabricante: " + fabricante +
                "\n\tModelo: " + modelo +
                "\n\tPrecio: " + precio +
                "\n\tConectividad: " + Arrays.toString(conectidad) +
                "\n\tSistema Operativo: " + sistemaOperativo +
                "\n\tPodómetro: " + podometro +
                "\n\tResistencia Acuatica: " + resistenciaAcuatica + "\n]";
    }
}

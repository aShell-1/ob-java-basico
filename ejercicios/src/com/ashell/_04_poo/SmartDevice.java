package com.ashell._04_poo;

public abstract class SmartDevice {
    String fabricante;
    String modelo;
    float precio;

    String[] conectidad;
    String sistemaOperativo;

    public SmartDevice(String fabricante, String modelo, float precio, String[] conectidad, String sistemaOperativo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.conectidad = conectidad;
        this.sistemaOperativo = sistemaOperativo;
    }
}

package org.core;

import org.core.Colores;

public class Auto {
    private String modelo;
    private Colores color;

    public Auto(Colores color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public Colores getColor() {
        return color;
    }
}

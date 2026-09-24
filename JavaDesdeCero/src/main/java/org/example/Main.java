package org.example;

import org.core.Auto;
import org.core.Colores;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto(Colores.BLANCO, "C6");

        System.out.println("Color del auto: " + auto.getColor().toString());

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
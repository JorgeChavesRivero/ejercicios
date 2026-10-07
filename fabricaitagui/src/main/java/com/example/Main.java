package com.example;

import com.example.models.Factoria;

public class Main {
    public static void main(String[] args) {

        //Creando un objeto con el constructor vacio

        Factoria fabricaUno = new Factoria();
        System.out.println(fabricaUno.getDireccion());
        fabricaUno.registrar_turno("", "");

        //Creando un objeto con el constructor lleno

        Factoria fabricaDos = new Factoria("calle 100 sur # 40-10");
        System.out.println(fabricaDos.getDireccion());

    }
}
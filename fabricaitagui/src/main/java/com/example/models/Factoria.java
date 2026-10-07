package com.example.models;

import java.time.LocalDateTime;


public class Factoria {
    
    //atributos de la clase
    private String direccion;

    //Metodos especiales de la clase
    public Factoria() {
    }

    public Factoria(String direccion) {
        this.direccion = direccion;
    }

        public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodos ordinarios de la clase
    public String registrar_turno(String nombre, String documento){
        return "BIENVENIDO " + nombre + "Entrada con exito " + LocalDateTime.now();
    }

    public Integer calcular_nomina(Integer numeroHoras, Integer valorHora){
        return valorHora * numeroHoras;
    }


}

package com.municipalidadsanborja.clases;

public class ValidarEdad extends Exception{
    public String getMessage() {
        return "Tienes que ser mayor de edad";
    }
}

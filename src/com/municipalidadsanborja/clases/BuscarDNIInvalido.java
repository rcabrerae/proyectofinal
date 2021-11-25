package com.municipalidadsanborja.clases;

public class BuscarDNIInvalido extends Exception{
    @Override
    public String getMessage() {
        return "DNI repetido, ingresar otro";
    }
}

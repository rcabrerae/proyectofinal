package com.municipalidadsanborja.clases;

public class Asiento {
    private int numero;
    private boolean estado = false;//falso desocupado, verdadero ocupado

    public Asiento(int numero, boolean estado) {
        this.numero = numero;
        this.estado=estado;
    }
    public int getNumero() {
        return numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado=estado;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numero=" + numero +
                ",estado=" + estado +
                '}';
    }
}

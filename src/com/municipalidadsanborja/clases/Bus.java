package com.municipalidadsanborja.clases;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int numerobus;
    private List<Asiento> asientos;

    public Bus(int numerobus) {
        this.numerobus = numerobus;
        this.asientos = new ArrayList<>();
    }

    public void registrarAsiento(int numero){//1 40
       Asiento asiento1= new Asiento(numero);
       asientos.add(asiento1);
    }

    public int getNumerobus() {
        return numerobus;
    }
    public List<Asiento> getAsientos() {
        return asientos;
    }
}

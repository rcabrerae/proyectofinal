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

    public void registrarAsiento(int numero, boolean estado) throws ValidarNumeroAsiento{//1 40
        Asiento asiento1= new Asiento(numero,estado);
        if(numero>40||numero<1){
            throw new ValidarNumeroAsiento();
        }
        this.asientos.add(asiento1);
    }
    public Asiento buscarAsiento(int numeroasiento){
        for(Asiento asiento:asientos){
            if(asiento.getNumero()==numeroasiento){
                return asiento;
            }
        }
        return null;
    }

    public int getNumerobus() {
        return numerobus;
    }
    public int obtenerAsientosDisponibles(){
        int contador=0;
        for(Asiento asiento:asientos){
            if(asiento.isEstado()==false){
                contador=contador+1;
            }
        }
        return contador;
    }
    public List<Asiento> getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numerobus=" + numerobus +
                '}';
    }
}

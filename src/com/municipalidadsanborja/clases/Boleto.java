package com.municipalidadsanborja.clases;

import java.util.ArrayList;
import java.util.List;

public class Boleto {
    private int codigo;
    private Bus bus;
    private String fechareserva;
    private Pasajero pasajero;
    private Asiento asiento;

    public Boleto(int codigo,String fecha) {
        this.codigo = codigo;
        this.fechareserva=fecha;
    }
    public void asignarBoletoaPasajero(Pasajero pasajero){
        this.pasajero=pasajero;
    }
    public void asignarAsientoaBoleto(Asiento asiento){
        this.asiento=asiento;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Bus getBus() {
        return bus;
    }

    public String getFechareserva() {
        return fechareserva;
    }

    public void asignarBus(Bus bus){
        this.bus=bus;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "codigo=" + codigo +
                ", bus=" + bus +
                ", asiento=" + asiento +
                ", fechareserva='" + fechareserva + '\'' +
                ", pasajero=" + pasajero +
                '}';
    }
}

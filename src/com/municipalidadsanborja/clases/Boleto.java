package com.municipalidadsanborja.clases;

public class Boleto {
    private int codigo;
    private Bus bus;
    private String fechareserva;
    private Pasajero pasajero;

    public Boleto(int codigo,String fecha) {
        this.codigo = codigo;
        this.fechareserva=fecha;
    }
    public void asignarBusaPasajero(Pasajero pasajero){
        this.pasajero=pasajero;
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
}

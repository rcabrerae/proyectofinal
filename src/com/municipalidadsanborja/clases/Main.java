package com.municipalidadsanborja.clases;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Municipalidad mun1 = new Municipalidad();
        try {
            mun1.registrarPasajero(74835125,"442021","Soltero",18,"rcabrera@gmail.com");
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835125,"442021","Soltero",18,"rcabrera@gmail.com");
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835124,"442021","Soltero",19,"rcabrera@gmail.com");
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }

        mun1.registrarBoleto(12345,"24/11/21");
        Bus b1 = new Bus(1);
        Bus b2 = new Bus(2);
        mun1.asignarBus(12345,b1);
        //mun1.asignarBusaPasajero(12345,74835124);
        b1.registrarAsiento(1);

        System.out.println("PASAJEROS");
        List<Pasajero> pasajeros = mun1.getPasajeros();
        for(Pasajero pasajero:pasajeros){
            System.out.println(pasajero.toString());
        }
        System.out.println("BUSQUEDA POR DNI");
        System.out.println(mun1.buscarPasajeroxDNI(74835124));

        System.out.println("BUSCAR POR FECHA Y NUMERO DE BUS");
        //System.out.println(mun1.buscarxFechaxNBus("24/11/21",12345));
    }

}

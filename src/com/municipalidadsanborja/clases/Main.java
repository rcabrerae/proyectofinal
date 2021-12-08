package com.municipalidadsanborja.clases;

import com.municipalidadsanborja.menu.Menu;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Municipalidad mun1 = Municipalidad.getInstance();
        try {
            mun1.registrarPasajero(74835125,"442021","Casado",80,"rcabrera@gmail.com",false);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835125,"442021","Soltero",18,"dylanbueno@gmail.com",true);//dni repetido
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835124,"202563","Casado",76,"rogeliomendoza@gmail.com",false);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835128,"252648","Soltero",28,"cardenasmendoza@gmail.com",true);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835129,"252641","Soltero",50,"manuelpinto@gmail.com",true);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835130,"252678","Soltero",45,"manuelpinto@gmail.com",true);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(74835131,"254278","Soltero",45,"jorgepinto@gmail.com",true);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        mun1.registrarBoleto(12345,"24/11/21");
        mun1.registrarBoleto(12346,"25/11/21");
        mun1.registrarBoleto(12347,"24/11/21");
        mun1.registrarBoleto(12348,"30/11/21");
        mun1.registrarBoleto(12349,"04/12/21");
        mun1.registrarBoleto(12310,"04/12/21");
        mun1.registrarBoleto(12311,"04/12/21");
        mun1.registrarBoleto(12312,"04/12/21");
        mun1.registrarBoleto(12313,"04/12/21");

        //Creacion de bus
        mun1.agregarBus(1);
        mun1.agregarBus(2);
        mun1.agregarBus(3);
        try {
            mun1.asignarBusaAsiento(1,1,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(1,2,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(1,3,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(1,4,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(2,1,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(2,2,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(2,3,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(2,4,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(3,1,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(3,2,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(3,3,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.asignarBusaAsiento(3,4,false);
        }catch (ValidarNumeroAsiento e){
            System.out.println(e.getMessage());
        }
        //Asignar Bus al boleto
        mun1.asignarBus(12345);
        mun1.asignarBus(12346);
        mun1.asignarBus(12347);
        mun1.asignarBus(12348);
        mun1.asignarBus(12349);
        mun1.asignarBus(12310);
        mun1.asignarBus(12311);
        mun1.asignarBus(12312);
        mun1.asignarBus(12313);

        //AsignarBoletoaPasajero
        mun1.asignarBoletoaPasajero(12346,74835125);
        mun1.asignarBoletoaPasajero(12345,74835124);
        mun1.asignarBoletoaPasajero(12347,74835128);
        mun1.asignarBoletoaPasajero(12348,74835129);
        mun1.asignarBoletoaPasajero(12349,74835130);
        mun1.asignarBoletoaPasajero(12310,74835131);

        //Asignacion de Asiento a Boleto
         mun1.asignarAsientoaBoleto(12346);
         mun1.asignarAsientoaBoleto(12345);
         mun1.asignarAsientoaBoleto(12347);
         mun1.asignarAsientoaBoleto(12348);
         mun1.asignarAsientoaBoleto(12349);
         mun1.asignarAsientoaBoleto(12310);
         mun1.asignarAsientoaBoleto(12310);
         mun1.asignarAsientoaBoleto(12311);
         mun1.asignarAsientoaBoleto(12312);
         mun1.asignarAsientoaBoleto(12313);

        //

        System.out.println("PASAJEROS");
        List<Pasajero> pasajeros = mun1.getPasajeros();
        for(Pasajero pasajero:pasajeros){
            System.out.println(pasajero.toString());
        }
        System.out.println("BUSQUEDA POR DNI");
        System.out.println(mun1.buscarPasajeroxDNI(74835124));

        System.out.println("BUSCAR POR FECHA Y NUMERO DE BUS");
        System.out.println(mun1.buscarxFechaxNBus("24/11/21",1));

        System.out.println("-----------------------------------");
        System.out.println("BUSCARBOLETOXCODIGO");
        Boleto boleto1= mun1.buscarBoletoxCodigo(12347);
        System.out.println(boleto1);
        System.out.println("-------------");
        System.out.println("BUSCAR PASAJERO POR CODIGO DE BOLETO");
        System.out.println(mun1.buscarpasajeroxCodigoBoleto(12345));
        System.out.println("-----------------------------------");
        System.out.println("Promedio de edades de Adultos Mayores");
        System.out.println(mun1.obtenerPromedioEdadAdulto());

        System.out.println("--------------------------------------");
        List<Boleto> boletosregistrados= mun1.getBoletos();
        for(Boleto boleto:boletosregistrados){
            System.out.println(boleto.toString());
        }
        System.out.println("----");
        System.out.println(mun1.obtenerPasajeroconObsequios());
        System.out.println("--------------");
        System.out.println("PROMEDIO DE EDADES DE CLUB DE ECOLOGÍA SIN OBSEQUIOS");
        System.out.println(mun1.promedioEdadMiembrosinObsequio());
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------");
        System.out.println("CANTIDAD DE ASIENTO DISPONIBLES EN BUS");
        for(Bus bus: mun1.getBuses()){
            System.out.println("En el bus:"+bus.getNumerobus()+" hay: "+bus.obtenerAsientosDisponibles());
        }

        //LISTA DE BUSES CON ASIENTO
        System.out.println("LISTA DE BUSES");
        for(Bus bus:mun1.getBuses()){
            System.out.println(bus.getAsientos());
        }
        System.out.println(mun1.buscarBusconAsientoLibre());
        for(Boleto boleto:mun1.getBoletos()){
            System.out.println(boleto.getBus());
        }

    }
}
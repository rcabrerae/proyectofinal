package com.municipalidadsanborja.clases;

import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private List<Pasajero> pasajeros;
    private List<Boleto> boletos;

    public Municipalidad(){
        this.pasajeros= new ArrayList<>();
        this.boletos = new ArrayList<>();
    }

    public void registrarPasajero(int dni, String telefono, String estadocivil, int edad, String correo) throws BuscarDNIInvalido, ValidarEdad{
        Pasajero pasajero1 = buscarPasajeroxDNI(dni);
        Pasajero ps1= new Pasajero(dni, telefono, estadocivil,edad,correo);
        if(pasajero1!=null){
            throw new BuscarDNIInvalido();
        }
        if(ps1.validarEdad()==false){
            throw new ValidarEdad();
        }
        pasajeros.add(ps1);
        }
    public void registrarBoleto(int codigo, String fecha){
        Boleto b1= new Boleto(codigo,fecha);
        boletos.add(b1);
    }
    public Pasajero buscarPasajeroxDNI(int dni){
        for(Pasajero pasajero:pasajeros){
            if(pasajero.getDNI()==dni){
                return pasajero;
            }
        }
        return null;
    }
   /* public Pasajero buscarxFechaxNBus(String fecha,int codigo){
        for(Boleto b1:boletos){
            if(b1.getFechareserva().equals(fecha)&&b1.getCodigo()==codigo){
                    return b1.getPasajero() ;
                }
            }
        }*/

    public Boleto buscarBoletoxCodigo(int codigo){
        for(Boleto bolet:boletos){
            if(bolet.getCodigo()==codigo){
                return bolet;
            }
        }
        return null;
    }

    public void asignarBus(int codigo, Bus bus){
        Boleto boleto1 = buscarBoletoxCodigo(codigo);
        if(boleto1!=null){
            boleto1.asignarBus(bus);
        }
    }

   /* public void asignarBusaPasajero(int codigo, int dni ){
        Boleto boleto1= buscarBoletoxCodigo(codigo);
        Pasajero pasajero1= buscarPasajeroxDNI(dni);
        if(boleto1!=null){
            boleto1.asignarBusaPasajero(pasajero1);
        }

    }*/


    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }
}

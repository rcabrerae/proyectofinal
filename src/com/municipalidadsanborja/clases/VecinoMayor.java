package com.municipalidadsanborja.clases;

public class VecinoMayor extends Pasajero{
    public VecinoMayor(int DNI,String telefono, String estadocivil, int edad, String correo,boolean miembro) {
        super(DNI,telefono, estadocivil, edad, correo,miembro);
    }

    @Override
    public String obtenerObsequio() {
        if(super.getRegalo().equals("BEBIDA GRATIS")){
            return "B";
        }else if(super.getRegalo().equals("NO TIENE OBSEQUIO")){
            return "N";
        }
        return null;
    }
}

package com.municipalidadsanborja.clases;

public class PersonalClub extends Pasajero{
    public PersonalClub(int DNI,String telefono, String estadocivil, int edad, String correo, boolean miembro) {
        super(DNI,telefono, estadocivil, edad, correo,miembro);
    }

    @Override
    public String obtenerObsequio() {
        if(super.getRegalo().equals("CHOCOLATE SUBLIME GRATIS")){
            return "C";
        }else if(super.getRegalo().equals("NO TIENE OBSEQUIO")){
            return "N";
        }
        return null;
    }
}

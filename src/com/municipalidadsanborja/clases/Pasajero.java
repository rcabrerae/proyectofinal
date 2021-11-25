package com.municipalidadsanborja.clases;

public class Pasajero {
    private int DNI;
    private String telefono;
    private String estadocivil;
    private int edad;
    private String correo;

    public Pasajero(int DNI,String telefono, String estadocivil, int edad, String correo){
        this.DNI=DNI;
        this.telefono = telefono;
        this.estadocivil = estadocivil;
        this.edad = edad;
        this.correo = correo;
    }
    public boolean validarEdad(){
        if(this.edad>=18){
            return true;
        }else{
            return false;
        }
    }
    public String getTelefono() {
        return telefono;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "DNI=" + DNI +
                ", telefono='" + telefono + '\'' +
                ", estadocivil='" + estadocivil + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}

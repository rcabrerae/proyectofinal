package com.municipalidadsanborja.clases;

public abstract class Pasajero {
    private int DNI;
    private String telefono;
    private String estadocivil;
    private int edad;
    private String correo;
    private boolean miembro;
    private String regalo;

    public Pasajero(int DNI,String telefono, String estadocivil, int edad, String correo,boolean miembro){
        this.DNI=DNI;
        this.telefono = telefono;
        this.estadocivil = estadocivil;
        this.edad = edad;
        this.correo = correo;
        this.miembro= miembro;
    }
    public boolean validarEdad(){
        if(this.edad>=18){
            return true;
        }else{
            return false;
        }
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }

    public abstract String obtenerObsequio();

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

    public boolean isMiembro() {
        return miembro;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "DNI=" + DNI +
                ", telefono='" + telefono + '\'' +
                ", estadocivil='" + estadocivil + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", miembro='" + miembro + '\'' +
                ", regalo='" + regalo + '\'' +
                '}';
    }
}

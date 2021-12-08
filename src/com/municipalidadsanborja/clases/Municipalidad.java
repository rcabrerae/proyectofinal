package com.municipalidadsanborja.clases;

import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private static Municipalidad instancia = new Municipalidad();

    private List<Pasajero> pasajeros;
    private List<Boleto> boletos;
    private List<Bus> buses;

    private Municipalidad(){
        this.pasajeros= new ArrayList<>();
        this.boletos = new ArrayList<>();
        this.buses = new ArrayList<>();
    }
    public static Municipalidad getInstance(){
        return instancia;
    }

    public void registrarPasajero(int dni, String telefono, String estadocivil, int edad, String correo, boolean miembro) throws BuscarDNIInvalido, ValidarEdad{
        Pasajero pasajero1 = buscarPasajeroxDNI(dni);
        if(miembro==true){
            Pasajero personal= Factory.dameInstancia("PC",Integer.toString(dni),telefono,estadocivil,Integer.toString(edad),correo,Boolean.toString(miembro));
            if(pasajero1!=null){
                throw new BuscarDNIInvalido();
            }
            if(personal.validarEdad()==false){
                throw new ValidarEdad();
            }
            pasajeros.add(personal);
        }else if(miembro==false){
            Pasajero vecinoMayor = Factory.dameInstancia("VM",Integer.toString(dni),telefono,estadocivil,Integer.toString(edad),correo,Boolean.toString(miembro));
            if(pasajero1!=null){
                throw new BuscarDNIInvalido();
            }
            if(vecinoMayor.validarEdad()==false){
                throw new ValidarEdad();
            }
            pasajeros.add(vecinoMayor);
        }

        }
    public void registrarBoleto(int codigo, String fecha){
        Boleto b1= new Boleto(codigo,fecha);
        boletos.add(b1);
    }
    public void agregarBus(int numbus){//registrar bus
        Bus bus= new Bus(numbus);
        this.buses.add(bus);
    }
    public void asignarBusaAsiento(int numbus,int numasiento, boolean estado) throws ValidarNumeroAsiento{//nuevo
    Bus bus1 = buscarbusxNumero(numbus);
    if(bus1!=null){
        bus1.registrarAsiento(numasiento,estado);
    }
    }
    public String buscarBusconAsientoLibre(){
        String numbus=null;
        String numasiento=null;
        for(Bus bus1:buses){
            numbus=Integer.toString(bus1.getNumerobus());
            for(Asiento asiento:bus1.getAsientos()){
                if(asiento.isEstado()!=true) {
                    numasiento = Integer.toString(asiento.getNumero());
                    return numbus + numasiento;
                }
            }
        }

        return null;

    }

    public Pasajero buscarpasajeroxCodigoBoleto(int codigo){
        for(Boleto boleto:getBoletos()){
            if(boleto.getCodigo()==codigo){
                    return boleto.getPasajero();
                }
            }
        return null;
    }
    public Pasajero buscarPasajeroxDNI(int dni){
        for(Pasajero pasajero:pasajeros){
            if(pasajero.getDNI()==dni){
                return pasajero;
            }
        }
        return null;
    }
        public List<Pasajero> buscarxFechaxNBus(String fecha,int numbus){
        List<Pasajero> pasajero1= new ArrayList<>();
        for(Boleto b1:boletos){
            if(b1.getFechareserva().equals(fecha)&&b1.getBus().getNumerobus()==numbus){
                    pasajero1.add(b1.getPasajero());
                    }
                }
        return pasajero1;
        }

    public Boleto buscarBoletoxCodigo(int codigo){
        for(Boleto bolet:boletos){
            if(bolet.getCodigo()==codigo){
                return bolet;
            }
        }
        return null;
    }
    public Bus buscarbusxNumero(int numbus){
        for(Bus bus:buses){
            if(bus.getNumerobus()==numbus){
                return bus;
            }
        }
        return null;
    }
     public void asignarBus(int codigo){
        Boleto boleto1 = buscarBoletoxCodigo(codigo);
        int numbus= Integer.parseInt(buscarBusconAsientoLibre().substring(0,1));
        Bus busasig= buscarbusxNumero(numbus);
        if(boleto1!=null && busasig!=null){
            boleto1.asignarBus(busasig);
        }
    }
    public void asignarBoletoaPasajero(int codigo,int dni){
        Pasajero pasajero1 = buscarPasajeroxDNI(dni);
        Boleto boleto1= buscarBoletoxCodigo(codigo);
        if(pasajero1!=null && boleto1!=null){
            boleto1.asignarBoletoaPasajero(pasajero1);
        }
        String regalo = obtenerObsequio(pasajero1);
        pasajero1.setRegalo(regalo);
    }
    public void asignarAsientoaBoleto(int codigo){
        Boleto boleto1= buscarBoletoxCodigo(codigo);
        int numasiento= Integer.parseInt(buscarBusconAsientoLibre().substring(1));
        int numbus= Integer.parseInt(buscarBusconAsientoLibre().substring(0,1));
        Bus busasig= buscarbusxNumero(numbus);
        Asiento buscarasiento = busasig.buscarAsiento(numasiento);
        if(boleto1!=null&&buscarasiento!=null){
            boleto1.asignarBus(busasig);
            boleto1.asignarAsientoaBoleto(buscarasiento);
            buscarasiento.setEstado(true);
        }
    }
    public String obtenerPromedioEdadAdulto(){
        double suma=0;
        double promedio=0;
        int contador=0;
        List<String> obtener= new ArrayList<>();
        for(Pasajero pasajero:pasajeros){
            if(pasajero instanceof VecinoMayor){
                obtener.add(pasajero.toString());
                suma=suma+((VecinoMayor)pasajero).getEdad();
                contador++;
            }
        }
        promedio=suma/contador;
        return obtener+"\n"+"El promedio es: "+Double.toString(promedio);
    }
    public String promedioEdadMiembrosinObsequio(){
        double suma=0;
        double promedio=0;
        int contador=0;
        List<String> obtener= new ArrayList<>();
        for(Pasajero pasajero:pasajeros){
            if(pasajero instanceof PersonalClub && ((PersonalClub)pasajero).getRegalo()=="NO TIENE OBSEQUIO"){
                obtener.add(pasajero.toString());
                suma=suma+((PersonalClub)pasajero).getEdad();
                contador++;

            }
        }
        promedio=suma/contador;
        return obtener+"\n"+"El promedio es: "+Double.toString(promedio);
    }
    public String obtenerObsequio(Pasajero pasajero) {
        if(pasajero instanceof VecinoMayor && ((VecinoMayor)pasajero).getEdad()>75){
            return "BEBIDA GRATIS";
        }else if ( pasajero instanceof PersonalClub && ((PersonalClub)pasajero).getEstadocivil().equals("Casado")){
            return "CHOCOLATE SUBLIME GRATIS";
        }
        return "NO TIENE OBSEQUIO";
    }
    public List<String> obtenerPasajeroconObsequios(){
        List<String> pasajeros1= new ArrayList<>();
        for(Pasajero pasajero:pasajeros){
            if(pasajero.obtenerObsequio()=="B" || pasajero.obtenerObsequio()=="C"){
                pasajeros1.add(pasajero.toString());
                }
            }

        return pasajeros1;
    }
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    @Override
    public String toString() {
        return "Municipalidad{" +
                ", buses=" + buses +
                ", buses=" +  +
                '}';
    }
}

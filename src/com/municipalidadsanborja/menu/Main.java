package com.municipalidadsanborja.menu;
import java.io.IOException;

import com.municipalidadsanborja.clases.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Municipalidad mun1 = Municipalidad.getInstance();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //precarga
        Factory factory = new Factory();
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
        try {
            mun1.registrarPasajero(29575901,"245542","Casado",45,"joyesileo@gmail.com",true);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(29575902,"255447","Soltero",45,"carlapinto@gmail.com",false);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
        try {
            mun1.registrarPasajero(29575904,"25558","Soltero",65,"jorgesalinas@gmail.com",true);
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
        mun1.asignarBoletoaPasajero(12311,29575901);
        mun1.asignarBoletoaPasajero(12312,29575902);
        mun1.asignarBoletoaPasajero(12313,29575904);

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

        //precarga
        int opcion = 0;
        while (opcion != 13) {
            boolean esperar = true;
            opcion = Menu.mostrarMenu();
            switch (opcion) {
                case 1:
                    int subopcion= Menu.mostrarSubMenuRegistrar();
                    if(subopcion == 1){
                        realizarRegistroPasajero();
                        System.out.println("Pasajero Registrado");
                    }else if(subopcion==2){
                        registrarboleto();
                        System.out.println("Boleto Registrado");
                    }else if(subopcion==3){
                        System.out.println("Ingrese numero de bus");
                        int numbus=scanner.nextInt();
                        mun1.agregarBus(numbus);
                        System.out.println("Bus registrado");
                    }else if(subopcion==4){
                        System.out.println("Ingresar numero de bus");
                        int numbus=scanner.nextInt();
                        System.out.println("Ingresar numero de asiento");
                        int numasiento=scanner.nextInt();
                        boolean estado = false;
                        try {
                            mun1.asignarBusaAsiento(numbus,numasiento,estado);
                        }catch (ValidarNumeroAsiento e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("Asiento creado correctamente");
                    }else if(subopcion==5){
                        esperar=false;
                    }
                    break;
                case 2:
                    int subopcion1= Menu.mostrarSubMenuAsignar();
                    if(subopcion1==1){
                        asignarBoletoaPasajero();
                        System.out.println("Pasajero asignado a Boleto Correctamente");
                    }else if(subopcion1==2){
                        asignarBusaBoleto();
                        System.out.println("Bus asignado a Boleto Correctamente");
                    }else if(subopcion1==3){
                        asignarAsientoaBoleto();
                        System.out.println("Asiento asignado a Boleto Correctamente");
                    }else if(subopcion1==4){
                        esperar=false;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el número DNI");
                    int dni = scanner.nextInt();
                    System.out.println(mun1.buscarPasajeroxDNI(dni));
                    break;
                case 4:
                    System.out.println("Ingresa la fecha del boleto");
                    String fecha = scanner.next();
                    System.out.println("Ingrese el número de bus");
                    int numbus = scanner.nextInt();
                    System.out.println(mun1.buscarxFechaxNBus(fecha, numbus));
                    break;
                case 5:
                    System.out.println(mun1.obtenerPromedioEdadAdulto());
                    break;
                case 6:
                    System.out.println(mun1.obtenerPasajeroconObsequios());
                    break;
                case 7:
                    System.out.println(mun1.promedioEdadMiembrosinObsequio());
                    break;
                case 8:
                    for(Bus bus: mun1.getBuses()){
                        System.out.println("En el bus:"+bus.getNumerobus()+" hay: "+bus.obtenerAsientosDisponibles());
                    }
                    break;
                case 9:
                    System.out.println("BUSCARBOLETOXCODIGO");
                    System.out.println("Ingresa el codigo de boleto");
                    int codigo = scanner.nextInt();
                    Boleto boleto1= mun1.buscarBoletoxCodigo(codigo);
                    System.out.println(boleto1);
                    break;
                case 10:
                    List<Boleto> boletosregistrados= mun1.getBoletos();
                    for(Boleto boleto:boletosregistrados){
                        System.out.println(boleto.toString());
                    }
                    break;
                case 11:
                    System.out.println("LISTA DE BUSES");
                    for(Bus bus:mun1.getBuses()){
                        System.out.println("El bus "+bus.getNumerobus()+" tiene los respectivos asientos: "+bus.getAsientos());
                    }
                    break;
                case 12:
                    System.out.println("PASAJEROS");
                    List<Pasajero> pasajeros = mun1.getPasajeros();
                    for(Pasajero pasajero:pasajeros){
                        System.out.println(pasajero.toString());
                    }
                    break;
                case 13:
                    esperar = false;
                    break;

            }
            if (esperar) {
                System.out.println("Presione ENTER para continuar");
                System.in.read();
            }
        }
        System.out.println("¡VUELVE PRONTO!");
    }
    public static void realizarRegistroPasajero(){
        System.out.println("Ingrese numero de DNI");
        int dni= scanner.nextInt();
        System.out.println("Ingrese numero de telefono");
        String numtele= scanner.next();
        System.out.println("Ingrese el estado civil");
        String estado= scanner.next();
        System.out.println("Ingresar edad (MAYOR A 18 AÑOS)");
        int edad = scanner.nextInt();
        System.out.println("Ingresa correo electronico");
        String correo= scanner.next();
        System.out.println("¿Eres miembro?(false/true");
        boolean miembro = scanner.nextBoolean();
        try {
            mun1.registrarPasajero(dni,numtele,estado,edad,correo,miembro);
        }catch (BuscarDNIInvalido e){
            System.out.println(e.getMessage());
        }catch (ValidarEdad e){
            System.out.println(e.getMessage());
        }
    }
    public static void registrarboleto(){
        System.out.println("Ingrese codigo de boleto");
        int codigo=scanner.nextInt();
        System.out.println("Ingresar fecha de registro");
        String fecha= scanner.next();
        mun1.registrarBoleto(codigo,fecha);
    }

    public static void asignarBoletoaPasajero(){
        System.out.println("Ingrese codigo de boleto");
        int codigo=scanner.nextInt();
        System.out.println("Ingrese numero de DNI");
        int dni= scanner.nextInt();
        mun1.asignarBoletoaPasajero(codigo,dni);
    }
    public static void asignarBusaBoleto(){
        System.out.println("Ingrese codigo de boleto");
        int codigo=scanner.nextInt();
        mun1.asignarBus(codigo);
    }
    public static void asignarAsientoaBoleto(){
        System.out.println("Ingrese codigo de boleto");
        int codigo=scanner.nextInt();
        mun1.asignarAsientoaBoleto(codigo);
    }
}

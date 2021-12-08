package com.municipalidadsanborja.menu;

import java.util.Scanner;

public class Menu {
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenidos al programa");
            System.out.println();
            System.out.println("MI MENU");
            System.out.println("*********");
            System.out.println("1.  REGISTRAR");
            System.out.println("2.  ASIGNAR");
            System.out.println("3.  BUSCAR PASAJERO POR DNI");
            System.out.println("4.  BUSCAR POR FECHA DE BOLETO Y NÚMERO DE BUS");
            System.out.println("5.  CALCULAR PROMEDIO DE EDADES DE LOS ADULTOS MAYORES");
            System.out.println("6.  OBTENER DATOS DE SOLO VECINOS QUE OBTUVIERON OBSEQUIO");
            System.out.println("7.  CALCULAR PROMEDIO DE EDADES QUE PERTENECEN AL CLUB DE ECOLOGIA Y QUE NO TIENEN OBSEQUIO");
            System.out.println("8.  ¿CUANTOS ASIENTOS DISPONIBLE HAY? ");
            System.out.println("9.  BUSCAR BOLETO POR CODIGO");
            System.out.println("10. LISTAR BOLETOS");
            System.out.println("11. LISTAR BUSES CON ASIENTOS");
            System.out.println("12  LISTAR PASAJEROS");
            System.out.println("13. SALIR");
            System.out.println("Ingrese un valor del 1 al 13 segun la operación");
            int opcion= scanner.nextInt();
        return opcion;
    }
    public static int mostrarSubMenuRegistrar() {
        System.out.println("===========");
        System.out.println("Registrar");
        System.out.println("1.Pasajero");
        System.out.println("2.Boleto");
        System.out.println("3.Bus");
        System.out.println("4.Asiento");
        System.out.println("5.Retroceder");
        System.out.println("Ingrese una opcion:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }
    public static int mostrarSubMenuAsignar() {
        System.out.println("===========");
        System.out.println("Asignar");
        System.out.println("1.BoletoaPasajero");
        System.out.println("2.BusaBoleto");
        System.out.println("3.AsientoBoleto");
        System.out.println("4.Retroceder");
        System.out.println("Ingrese una opcion:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }

}

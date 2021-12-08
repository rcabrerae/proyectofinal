package com.municipalidadsanborja.clases;

public class Factory {
    public static Pasajero dameInstancia(String tipo, String... argumentos){
        if(tipo.equals("VM")){
            return new VecinoMayor(Integer.parseInt(argumentos[0]),argumentos[1],argumentos[2],Integer.parseInt(argumentos[3]),argumentos[4],Boolean.parseBoolean(argumentos[5]) );
        }else if(tipo.equals("PC")){
            return new PersonalClub(Integer.parseInt(argumentos[0]),argumentos[1],argumentos[2],Integer.parseInt(argumentos[3]),argumentos[4],Boolean.parseBoolean(argumentos[5]) );
        }
        return null;


        /*switch(argumentos[0]){
            case "VM":
                return new VecinoMayor(Integer.parseInt(argumentos[0]),argumentos[2],argumentos[3],Integer.parseInt(argumentos[3]),argumentos[4],Boolean.parseBoolean(argumentos[5]) );
            case "PC":
                return new PersonalClub(Integer.parseInt(argumentos[0]),argumentos[2],argumentos[3],Integer.parseInt(argumentos[3]),argumentos[4],Boolean.parseBoolean(argumentos[5]) );
            default:
                return null;*/

    }
}

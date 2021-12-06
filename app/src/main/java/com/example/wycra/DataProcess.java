package com.example.wycra;

public class DataProcess {

    public String[] filtradoBasico(String[] datos, String campoDepartamento, String campoMunicipio, String campoEstrato){

        return datos;
    }

    public int cantidadHombres(String[][] datosFiltrados){ //posición 5 para género según órden dado en la historia de usuario 06
        int contador = 0;
        for(int i=0; i<datosFiltrados[0].length; i++){
            if(datosFiltrados[5][i].equalsIgnoreCase("masculino")){
                contador = contador + 1;
            }
        }
        return contador;
    }

    public int cantidadMujeres(String[][] datosFiltrados){ //posición 5 para género según órden dado en la historia de usuario 06
        int contador = 0;
        for(int i=0; i<datosFiltrados[0].length; i++){
            if(datosFiltrados[5][i].equalsIgnoreCase("femenino")){
                contador = contador + 1;
            }
        }
        return contador;
    }

    public float promedioEdad(String[] datosFiltrados){
        return 0;
    }

    public int modaEdad(String[] datosFiltrados){
        return 0;
    }
}

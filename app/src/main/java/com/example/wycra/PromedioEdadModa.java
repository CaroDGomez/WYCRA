package com.example.wycra;

public class PromedioEdadModa {
    public float PromedioEdad(String[] datosFiltrados) {
        int suma = 0;
        for (int i = 0; i < datosFiltrados.length; i++){
            int arreglo2 = Integer.parseInt(datosFiltrados[i]); // En cada recorrido se parsea el numero actual
            suma += arreglo2;                                   // y se suman;
        }

        float promedio = suma/datosFiltrados.length;    // El promedio es la división de la suma total
        return promedio;                                // y la cantidad de numeros en el arreglo;
    }

    public int modaEdad(String[] datosFiltrados) {
        int[] datosParseados = new int[datosFiltrados.length];  // Nuevo arreglo para parsear a int;

        int maximoNumRepeticiones = 0;
        int moda=0;

        for (int i = 0; i < datosFiltrados.length; i++){
            datosParseados[i] = Integer.parseInt(datosFiltrados[i]);    // Se parsean los datos;
        }

        for (int i=0; i < datosParseados.length; i++){
            int numRepeticiones = 0;    // Cada recorrido se inicia en 0 para comparar con el maximo de repeticiones;
            for (int j=0; j < datosParseados.length; j++){
                if(datosParseados[i] == datosParseados[j]){
                    numRepeticiones++;  // Si son iguales los números el número de repeticiones aumenta;
                }
                if(numRepeticiones > maximoNumRepeticiones){    // Si el número de repeticiones actual es mayor
                    moda = datosParseados[i];                   // al maximo de repeticiones total se establece
                    maximoNumRepeticiones = numRepeticiones;    // como la moda y el maximo de repeticiones pasa
                }                                               // a ser el número de repeticiones actual
            }
        }

        return moda;
    }
}

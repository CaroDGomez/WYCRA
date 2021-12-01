package com.example.wycra;

import android.content.Context;
import android.widget.Toast;

import java.util.regex.*;

public class ValidacionFormulario {
    private Context context;

    public ValidacionFormulario(Context context){
        this.context=context;
    }

    public boolean formGeneral(String departamento, String municipio, String estrato, String edad){

        String error = "";

        if(departamento.isEmpty() && municipio.isEmpty() && estrato.isEmpty() && edad.isEmpty()){
            return true;
        }

        Pattern patLetras = Pattern.compile("[a-zA-Z ]*");
        Pattern patNumerico = Pattern.compile("[0-9]*");

        String cadenaDep = departamento;
        Matcher matDep = patLetras.matcher(cadenaDep);

        String cadenaMun = municipio;
        Matcher matMun = patLetras.matcher(cadenaMun);

        String cadenaEst = estrato;
        Matcher matEst = patNumerico.matcher(cadenaEst);

        String cadenaEdad = edad;
        Matcher matEdad = patNumerico.matcher(cadenaEdad);

        if (!(matDep.matches() || departamento.isEmpty())) {
            error+="El campo departamento no puede tener caracteres especiales ni números</br>";
        }

        if (!(matMun.matches() || municipio.isEmpty())) {
            error+="El campo municipio no puede tener caracteres especiales ni números\n";
        }

        if (!(matEst.matches() || estrato.isEmpty())) {
            error+="El campo estrato debe contener solo datos numericos\n";
        }

        if (!(matEdad.matches() || edad.isEmpty())) {
            error+="El campo edad debe contener solo datos numericos\n";
        }

        if(error.equals("")){
            return true;
        }else{
            String mensaje = "FORMULARIO NO VÁLIDO/n"+error;
            Toast.makeText(this.context, mensaje, Toast.LENGTH_LONG).show();
            return false;
        }

        /*if (matDep.matches() && matMun.matches() && matEst.matches() && matEdad.matches()) {
            return true;
        } else {
            return false;
        }*/
    }





    public boolean formGraduados(String departamento, String municipio){

        if(departamento.isEmpty()){
            return false;
        }
        if(municipio.isEmpty()){
            return false;
        }

        Pattern patLetras = Pattern.compile("[a-zA-Z ]*.{2,}");

        String cadenaDep = departamento;
        Matcher matDep = patLetras.matcher(cadenaDep);

        if(!matDep.matches()){
            return false;
        }

        String cadenaMun = municipio;
        Matcher matMun = patLetras.matcher(cadenaMun);

        if(!matMun.matches()){
            return false;
        }

        return true;
    }
}

package com.example.wycra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BusquedaCandidatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_candidatos);

        EditText departamento = (EditText) findViewById(R.id.edtDepartamento);
        EditText municipio = findViewById(R.id.edtMunicipio);
        EditText estrato = findViewById(R.id.edtEstrato);
        EditText edad = findViewById(R.id.edtEdad);
        Button btnBuscar = findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValidacionFormulario validar = new ValidacionFormulario(BusquedaCandidatos.this);

                Boolean esValido = validar.formGeneral(departamento.getText().toString(),municipio.getText().toString(),estrato.getText().toString(), edad.getText().toString());

                if (esValido) {
                    Toast.makeText(BusquedaCandidatos.this, "VALIDACION OK", Toast.LENGTH_LONG).show();
                }
            }
        });

        /*btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pattern patLetras = Pattern.compile("[a-zA-Z ]*");
                Pattern patNumerico = Pattern.compile("[0-9]*");

                String cadenaDep = departamento.getText().toString();
                Matcher matDep = patLetras.matcher(cadenaDep);

                String cadenaMun = municipio.getText().toString();
                Matcher matMun = patLetras.matcher(cadenaMun);

                String cadenaEst = estrato.getText().toString();
                Matcher matEst = patNumerico.matcher(cadenaEst);

                String cadenaEdad = edad.getText().toString();
                Matcher matEdad = patNumerico.matcher(cadenaEdad);

                if (matDep.matches() && matMun.matches() && matEst.matches() && matEdad.matches()) {
                    Toast.makeText(MainActivity.this, "COINCIDE", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "NO COINCIDE", Toast.LENGTH_LONG).show();
                }
            }

        });*/
    }
}
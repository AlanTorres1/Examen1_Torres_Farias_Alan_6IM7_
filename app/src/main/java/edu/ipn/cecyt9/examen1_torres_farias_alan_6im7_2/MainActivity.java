package edu.ipn.cecyt9.examen1_torres_farias_alan_6im7_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtNumero;
    Double resultado;
    Double txtNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero = (EditText) findViewById(R.id.txtNumero);

    }

    public void Convertir(View v){
        if(txtNumero.getText().toString().equals("")){
            Toast toast =  Toast.makeText(getApplicationContext(), "No se detecto numero", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Intent envia = new Intent(this, Main2Activity.class);
            Bundle datos = new Bundle();
            txtNumero2 = Double.parseDouble(txtNumero.getText().toString());
            resultado = (txtNumero2 / 15);
            datos.putDouble("Numero", resultado);
            envia.putExtras(datos);
            finish();
            startActivity(envia);
        }
    }
}

package edu.ipn.cecyt9.examen1_torres_farias_alan_6im7_2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends Activity {

    Double NumeroRec;
    TextView Muestrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Muestrame = (TextView) findViewById(R.id.Muestrame);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        NumeroRec = recibe.getDouble("Numero");
        Muestrame.setText("Nombre: Torres Farias Alan" + "\n" +
                "Resultado: " + NumeroRec.toString()
        );
    }

    public void Correo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Resultado del Examen");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Torres Farias Alan    Resultado: " + NumeroRec );
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }
}
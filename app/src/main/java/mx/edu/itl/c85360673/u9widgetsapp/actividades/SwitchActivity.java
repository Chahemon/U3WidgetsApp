package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {

    private Switch tipo;
    private Switch verde;
    private Switch tamaño;
    private TextView AndroidTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        tipo = findViewById ( R.id.tipo );
        verde = findViewById ( R.id.verde );
        tamaño = findViewById ( R.id.tamaño );
        AndroidTexto = findViewById ( R.id.AndroidTexto );
    }

    public void btnActivarClick ( View v ) {

        if (tipo.isChecked())
            AndroidTexto.setBackgroundColor(Color.CYAN);
        else
            AndroidTexto.setBackgroundColor(Color.WHITE);

        if (verde.isChecked())
            AndroidTexto.setTextColor(Color.GREEN);
        else
            AndroidTexto.setTextColor(Color.BLACK);

        if (tamaño.isChecked())
            AndroidTexto.setTextSize(16);
        else
            AndroidTexto.setTextSize(20);

    }

    public void btnEnviar ( View v) {

        String statusSwitch1, statusSwitch2, statusSwitch3;
        if (tipo.isChecked())
            statusSwitch1 = tipo.getTextOn().toString();
        else
            statusSwitch1 = tipo.getTextOff().toString();
        if (verde.isChecked())
            statusSwitch2 = verde.getTextOn().toString();
        else
            statusSwitch2 = verde.getTextOff().toString();
        if (tamaño.isChecked())
            statusSwitch3 = tamaño.getTextOn().toString();
        else
            statusSwitch3 = tamaño.getTextOff().toString();

        Toast.makeText(getApplicationContext(), "Estado de los switch" + "\n" + "Switch1 :" + statusSwitch1 + "\n" + "Switch2 :" + statusSwitch2 +
                "\n" + "Switch3 :" + statusSwitch3, Toast.LENGTH_LONG).show();
    }
}
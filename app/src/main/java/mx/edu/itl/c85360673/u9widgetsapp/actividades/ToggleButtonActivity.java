package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    // Definimos las variables necesarias
    ToggleButton togButn;
    ImageView imgV;

    //--------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        //Asignamos el valor de cada componente a las variables que creamos en un inicio
        togButn = (ToggleButton) findViewById(R.id.toggleButton);
        imgV = findViewById(R.id.imageView);
    }

    //--------------------------------------------------------------------

    // En el metodo onClick usaremos un 'if' para validar que tengamos un objeto
    // Si tenemos un objeto, vemos si esta 'Comprobado' para establer una imagen
    public void onclick(View view){
        if(view.getId() == R.id.toggleButton){
            if(togButn.isChecked()){
                imgV.setImageResource(R.drawable.desbloquear);
            }else{
                imgV.setImageResource(R.drawable.bloquear);
            }
        }
    }

    //--------------------------------------------------------------------

}
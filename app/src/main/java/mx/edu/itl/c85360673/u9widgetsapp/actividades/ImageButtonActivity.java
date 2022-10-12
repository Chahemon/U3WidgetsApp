package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ImageButtonActivity extends AppCompatActivity {

    ImageButton boton;
    TextView visto;
    boolean check = false;

    //-------------------------------------------------------------------------

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_image_button );

        boton = findViewById( R.id.imageButton );
        visto = findViewById( R.id.textView15 );
    }

    //-------------------------------------------------------------------------

    public void onClickRedButton( View v ){

        // Cuando el boton se presione, cambiara la imagen para dar la
        // ilusion de que fue presionado

        if( v.getId() == R.id.imageButton ) {
            if( check )
            {
                boton.setImageResource( R.drawable.redbutton );
                visto.setText( "Boton NO Presionado" );
                check = false;
            }
            else
            {
                boton.setImageResource( R.drawable.redbutton_push );
                visto.setText( "Boton Presionado" );
                check = true;
            }
        }
    }

    //-------------------------------------------------------------------------

}
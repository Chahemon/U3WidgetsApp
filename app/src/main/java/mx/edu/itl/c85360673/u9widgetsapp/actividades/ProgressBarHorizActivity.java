package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ProgressBarHorizActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView edtUsu, edtCargado;
    private EditText edtCon;
    Handler handler = new Handler();
    int progreso = 0;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_progress_bar_horiz );

        progressBar = findViewById( R.id.progressBar );
        edtUsu = findViewById( R.id.edtUsuario );
        edtCon = findViewById( R.id.edtContrasena );
        edtCargado = findViewById( R.id.edtProgreso );

    }

    public void btnAceptarClick( View v ){
        String usuario = edtUsu.getText().toString();
        String contrasena = edtCon.getText().toString();

        if( usuario.equals( "ejemplo" ) ) {
            if ( contrasena.equals( "ejemplo" ) ) {
                //Iniciamos el hilo con la accion del progress bar
                new Thread( new Runnable() {
                    @Override
                    public void run() {
                        while ( progreso < 100 ) {
                            progreso = progreso + 3;
                            handler.post( new Runnable() {
                                @Override
                                public void run () {
                                    progressBar.setProgress( progreso );
                                    if ( progreso == 100 ) {
                                        Toast.makeText(ProgressBarHorizActivity.this, "Inicio de sesion correcta", Toast.LENGTH_LONG ).show();
                                    }
                                    edtCargado.setText( progreso + " / " + progressBar.getMax() );
                                }
                            });
                            try {
                                //Duerme el hilo por 200 milisegundos
                                Thread.sleep( 200 );
                            } catch ( InterruptedException e ) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            } else {
                Toast.makeText(ProgressBarHorizActivity.this, "Credenciales Incorrectas", Toast.LENGTH_LONG ).show();
            }
        } else {
            Toast.makeText(ProgressBarHorizActivity.this, "Credenciales Incorrectas", Toast.LENGTH_LONG ).show();
        }
    }
}
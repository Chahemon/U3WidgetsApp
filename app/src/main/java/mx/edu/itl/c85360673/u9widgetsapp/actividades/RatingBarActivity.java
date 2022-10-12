package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView texto;

    //----------------------------------------------------------------------------------------------

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rating_bar );
        ratingBar =  findViewById( R.id.rBar );
        texto = findViewById( R.id.textView14 );
    }

    public void btnRatingBar ( View v ) {
        texto.setText( "Su Calificación actual es: " + ratingBar.getRating() );
    }

    //----------------------------------------------------------------------------------------------
}
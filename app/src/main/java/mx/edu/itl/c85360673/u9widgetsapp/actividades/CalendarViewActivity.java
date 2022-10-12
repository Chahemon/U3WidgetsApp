package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

public class CalendarViewActivity extends AppCompatActivity {

    // Declaramos las variables que usaremos en los Activity
    CalendarView calendarView;
    TextView myDate;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);

        // Asignamos la referencia de los componentes a las variables creadas
        calendarView = findViewById(R.id.calendarView);
        myDate  = (TextView) findViewById(R.id.txtDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            // Podemos la fecha seleccionada guardando los valores en las variables i´s
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                myDate.setText("Fecha seleccionada:" + date);
                date = (i2) + "/" + (i1 + 1) + "/" + i;
                myDate.setText("Fecha seleccionada:" + date);
            }
        });
    }

    // Boton que muestra la ultima hora seleccionada y cierra el Activity
    public void regresarClick( View v ) {
        Log.d("Hola","fecha seleccionada: " + date);
        Toast.makeText( calendarView.getContext(),"Ultima fecha seleccionada: " + date,Toast.LENGTH_LONG).show();
        finish();
    }

}
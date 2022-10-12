package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity {

    //----------------------------------------------------------------------------------------------
    // Arreglo donde ponemos los Paises que apareceran como sugerencia
    private static final String[] lista = new String[]{"Mexico","Francia","España","Inglaterra",
            "Italia","Estados Unidos","Canada","Alemania","Rusia","Brasil","Argentina","Uruguay",
            "Colombia"};

    private MultiAutoCompleteTextView edtText;

    //----------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete_text_view);

        edtText = findViewById(R.id.mactv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        edtText.setAdapter(adapter);
        edtText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    //----------------------------------------------------------------------------------------------

    public void mostrarEntradaOnClick(View v){

        String entrada = edtText.getText().toString();
        Toast.makeText(this, entrada, Toast.LENGTH_SHORT).show();

    }

    //----------------------------------------------------------------------------------------------
}
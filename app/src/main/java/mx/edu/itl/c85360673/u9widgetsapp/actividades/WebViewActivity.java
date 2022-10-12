package mx.edu.itl.c85360673.u9widgetsapp.actividades;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.u9widgetsapp.R;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_web_view );

        //--------------------------------------------------------------------
        // Agregamos la configuracion que va a tener nuestro WebView ( En mi caso, mi pagina de github )

        webView = ( WebView ) findViewById( R.id.webview );
        webView.setWebViewClient( new WebViewClient() );
        webView.loadUrl( "https://github.com/Chahemon" );

        //--------------------------------------------------------------------
    }
}
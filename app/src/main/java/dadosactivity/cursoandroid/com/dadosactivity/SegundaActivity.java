package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SegundaActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = (TextView) findViewById(R.id.textoID);

        //método que recupera o intente e o método extra
        Bundle extra = getIntent().getExtras();

        //verifica se o extra está vazio, caso contrário  apresenta o texto
        /**if ( extra != null) {
            String textoPassado = extra.getString("name");
            texto.setText(textoPassado);
        }**/
        String textoPassado = extra.getString("name");
        texto.setText(textoPassado);
    }
}

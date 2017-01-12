package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoID);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criação de uma variável do tipo Intent com o nome intent e instanciá-la com o new e passando de activity main para a outra
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                //método putExtra que altera valores na variável intent
                intent.putExtra("name", "Salatiel Android Developer");

                //método que apresenta o objeto intent
                startActivity(intent);

            }
        });
    }
}

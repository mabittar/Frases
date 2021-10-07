package br.estacio.frases;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    List<String> frases;
    TextView txtFrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frases = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            frases.add("Frase "+i);
        }

        txtFrases = (TextView) findViewById(R.id.txtFrases);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Random sorteia = new Random();
        int posicaoFrase = sorteia.nextInt(10);

        txtFrases.setText(frases.get(posicaoFrase));

    }

    @Override
    protected void onResume() {
        super.onResume();
        Random sorteia = new Random();
        int posicaoFrase = sorteia.nextInt(10);

        txtFrases.setText(frases.get(posicaoFrase));

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Random sorteia = new Random();
        int posicaoFrase = sorteia.nextInt(10);

        txtFrases.setText(frases.get(posicaoFrase));

    }
}
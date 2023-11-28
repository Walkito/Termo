package br.com.unip.termo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void jogar(View view){
        Intent telaCena= new Intent(this, Cena1.class);
        startActivity(telaCena);
        finish();
    }

    public void comoJogar(View view){
        Intent telaCena= new Intent(this, TelaComoJogar.class);
        startActivity(telaCena);
        finish();
    }

    public void easterEggLeandro(View view){
        if (cont == 19){
            Intent telaLeandro= new Intent(this, EasterEggLeandro.class);
            startActivity(telaLeandro);
            finish();
        }

        if (view.getId() == R.id.tituloTermo){
            cont+=1;
        }
    }
}
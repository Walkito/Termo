package br.com.unip.termo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaComoJogar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_como_jogar);
        getSupportActionBar().hide();
    }

    public void voltarMenu(View v){
        Intent mainMenu= new Intent(this, MainActivity.class);
        startActivity(mainMenu);
        finish();
    }
}
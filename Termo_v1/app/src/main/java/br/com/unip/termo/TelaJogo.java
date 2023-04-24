package br.com.unip.termo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TelaJogo extends AppCompatActivity {
    TextView linha1letra1;
    TextView linha1letra2;
    TextView linha1letra3;
    TextView linha1letra4;
    TextView linha1letra5;
    TextView linha2letra1;
    TextView linha2letra2;
    TextView linha2letra3;
    TextView linha2letra4;
    TextView linha2letra5;
    TextView linha3letra1;
    TextView linha3letra2;
    TextView linha3letra3;
    TextView linha3letra4;
    TextView linha3letra5;
    TextView linha4letra1;
    TextView linha4letra2;
    TextView linha4letra3;
    TextView linha4letra4;
    TextView linha4letra5;
    TextView linha5letra1;
    TextView linha5letra2;
    TextView linha5letra3;
    TextView linha5letra4;
    TextView linha5letra5;
    TextView linha6letra1;
    TextView linha6letra2;
    TextView linha6letra3;
    TextView linha6letra4;
    TextView linha6letra5;
    TextView textoInformacao;
    private int linha = 1;
    private String palavraSorteada = "";
    private List<String> silabas = new ArrayList<>();
    private List<TextView> letrasPosCerta = new ArrayList<>();
    private List<String> letrasPosCerta2 = new ArrayList<>();
    private List<TextView> letraPosErrada = new ArrayList<>();
    private List<String> letraPosErrada2 = new ArrayList<>();
    private List<String> letraNExiste = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo);
        getSupportActionBar().hide();

        silabas.clear();
        Palavras p = null;

        try {
            p = new Palavras(this);
            palavraSorteada = p.sortearPalavras();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        dividirSilabas(palavraSorteada);
    }

    void pintarTeclado(){
        Button btn;
        int cor = 0;
        cor = Color.parseColor("#FFD2AC69");
        for (String s: letraPosErrada2){
            switch (s){
                case "A":
                    btn = findViewById(R.id.btnA);
                    btn.setBackgroundColor(cor);
                    break;
                case "B":
                    btn = findViewById(R.id.btnB);
                    btn.setBackgroundColor(cor);
                    break;
                case "C":
                    btn = findViewById(R.id.btnC);
                    btn.setBackgroundColor(cor);
                    break;
                case "D":
                    btn = findViewById(R.id.btnD);
                    btn.setBackgroundColor(cor);
                    break;
                case "E":
                    btn = findViewById(R.id.btnE);
                    btn.setBackgroundColor(cor);
                    break;
                case "F":
                    btn = findViewById(R.id.btnF);
                    btn.setBackgroundColor(cor);
                    break;
                case "G":
                    btn = findViewById(R.id.btnG);
                    btn.setBackgroundColor(cor);
                    break;
                case "H":
                    btn = findViewById(R.id.btnH);
                    btn.setBackgroundColor(cor);
                    break;
                case "I":
                    btn = findViewById(R.id.btnI);
                    btn.setBackgroundColor(cor);
                    break;
                case "J":
                    btn = findViewById(R.id.btnJ);
                    btn.setBackgroundColor(cor);
                    break;
                case "K":
                    btn = findViewById(R.id.btnK);
                    btn.setBackgroundColor(cor);
                    break;
                case "L":
                    btn = findViewById(R.id.btnL);
                    btn.setBackgroundColor(cor);
                    break;
                case "M":
                    btn = findViewById(R.id.btnM);
                    btn.setBackgroundColor(cor);
                    break;
                case "N":
                    btn = findViewById(R.id.btnN);
                    btn.setBackgroundColor(cor);
                    break;
                case "O":
                    btn = findViewById(R.id.btnO);
                    btn.setBackgroundColor(cor);
                    break;
                case "P":
                    btn = findViewById(R.id.btnP);
                    btn.setBackgroundColor(cor);
                    break;
                case "Q":
                    btn = findViewById(R.id.btnQ);
                    btn.setBackgroundColor(cor);
                    break;
                case "R":
                    btn = findViewById(R.id.btnR);
                    btn.setBackgroundColor(cor);
                    break;
                case "S":
                    btn = findViewById(R.id.btnS);
                    btn.setBackgroundColor(cor);
                    break;
                case "T":
                    btn = findViewById(R.id.btnT);
                    btn.setBackgroundColor(cor);
                    break;
                case "U":
                    btn = findViewById(R.id.btnU);
                    btn.setBackgroundColor(cor);
                    break;
                case "V":
                    btn = findViewById(R.id.btnV);
                    btn.setBackgroundColor(cor);
                    break;
                case "W":
                    btn = findViewById(R.id.btnW);
                    btn.setBackgroundColor(cor);
                    break;
                case "X":
                    btn = findViewById(R.id.btnX);
                    btn.setBackgroundColor(cor);
                    break;
                case "Y":
                    btn = findViewById(R.id.btnY);
                    btn.setBackgroundColor(cor);
                    break;
                case "Z":
                    btn = findViewById(R.id.btnZ);
                    btn.setBackgroundColor(cor);
                    break;
            }
        }

        cor = Color.parseColor("#FF3AA293");
        for (String s: letrasPosCerta2){
            switch (s){
                case "A":
                    btn = findViewById(R.id.btnA);
                    btn.setBackgroundColor(cor);
                    break;
                case "B":
                    btn = findViewById(R.id.btnB);
                    btn.setBackgroundColor(cor);
                    break;
                case "C":
                    btn = findViewById(R.id.btnC);
                    btn.setBackgroundColor(cor);
                    break;
                case "D":
                    btn = findViewById(R.id.btnD);
                    btn.setBackgroundColor(cor);
                    break;
                case "E":
                    btn = findViewById(R.id.btnE);
                    btn.setBackgroundColor(cor);
                    break;
                case "F":
                    btn = findViewById(R.id.btnF);
                    btn.setBackgroundColor(cor);
                    break;
                case "G":
                    btn = findViewById(R.id.btnG);
                    btn.setBackgroundColor(cor);
                    break;
                case "H":
                    btn = findViewById(R.id.btnH);
                    btn.setBackgroundColor(cor);
                    break;
                case "I":
                    btn = findViewById(R.id.btnI);
                    btn.setBackgroundColor(cor);
                    break;
                case "J":
                    btn = findViewById(R.id.btnJ);
                    btn.setBackgroundColor(cor);
                    break;
                case "K":
                    btn = findViewById(R.id.btnK);
                    btn.setBackgroundColor(cor);
                    break;
                case "L":
                    btn = findViewById(R.id.btnL);
                    btn.setBackgroundColor(cor);
                    break;
                case "M":
                    btn = findViewById(R.id.btnM);
                    btn.setBackgroundColor(cor);
                    break;
                case "N":
                    btn = findViewById(R.id.btnN);
                    btn.setBackgroundColor(cor);
                    break;
                case "O":
                    btn = findViewById(R.id.btnO);
                    btn.setBackgroundColor(cor);
                    break;
                case "P":
                    btn = findViewById(R.id.btnP);
                    btn.setBackgroundColor(cor);
                    break;
                case "Q":
                    btn = findViewById(R.id.btnQ);
                    btn.setBackgroundColor(cor);
                    break;
                case "R":
                    btn = findViewById(R.id.btnR);
                    btn.setBackgroundColor(cor);
                    break;
                case "S":
                    btn = findViewById(R.id.btnS);
                    btn.setBackgroundColor(cor);
                    break;
                case "T":
                    btn = findViewById(R.id.btnT);
                    btn.setBackgroundColor(cor);
                    break;
                case "U":
                    btn = findViewById(R.id.btnU);
                    btn.setBackgroundColor(cor);
                    break;
                case "V":
                    btn = findViewById(R.id.btnV);
                    btn.setBackgroundColor(cor);
                    break;
                case "W":
                    btn = findViewById(R.id.btnW);
                    btn.setBackgroundColor(cor);
                    break;
                case "X":
                    btn = findViewById(R.id.btnX);
                    btn.setBackgroundColor(cor);
                    break;
                case "Y":
                    btn = findViewById(R.id.btnY);
                    btn.setBackgroundColor(cor);
                    break;
                case "Z":
                    btn = findViewById(R.id.btnZ);
                    btn.setBackgroundColor(cor);
                    break;
            }
        }

        cor = Color.parseColor("#312A2C");
        for (String s: letraNExiste){
            switch (s){
                case "A":
                    btn = findViewById(R.id.btnA);
                    btn.setBackgroundColor(cor);
                    break;
                case "B":
                    btn = findViewById(R.id.btnB);
                    btn.setBackgroundColor(cor);
                    break;
                case "C":
                    btn = findViewById(R.id.btnC);
                    btn.setBackgroundColor(cor);
                    break;
                case "D":
                    btn = findViewById(R.id.btnD);
                    btn.setBackgroundColor(cor);
                    break;
                case "E":
                    btn = findViewById(R.id.btnE);
                    btn.setBackgroundColor(cor);
                    break;
                case "F":
                    btn = findViewById(R.id.btnF);
                    btn.setBackgroundColor(cor);
                    break;
                case "G":
                    btn = findViewById(R.id.btnG);
                    btn.setBackgroundColor(cor);
                    break;
                case "H":
                    btn = findViewById(R.id.btnH);
                    btn.setBackgroundColor(cor);
                    break;
                case "I":
                    btn = findViewById(R.id.btnI);
                    btn.setBackgroundColor(cor);
                    break;
                case "J":
                    btn = findViewById(R.id.btnJ);
                    btn.setBackgroundColor(cor);
                    break;
                case "K":
                    btn = findViewById(R.id.btnK);
                    btn.setBackgroundColor(cor);
                    break;
                case "L":
                    btn = findViewById(R.id.btnL);
                    btn.setBackgroundColor(cor);
                    break;
                case "M":
                    btn = findViewById(R.id.btnM);
                    btn.setBackgroundColor(cor);
                    break;
                case "N":
                    btn = findViewById(R.id.btnN);
                    btn.setBackgroundColor(cor);
                    break;
                case "O":
                    btn = findViewById(R.id.btnO);
                    btn.setBackgroundColor(cor);
                    break;
                case "P":
                    btn = findViewById(R.id.btnP);
                    btn.setBackgroundColor(cor);
                    break;
                case "Q":
                    btn = findViewById(R.id.btnQ);
                    btn.setBackgroundColor(cor);
                    break;
                case "R":
                    btn = findViewById(R.id.btnR);
                    btn.setBackgroundColor(cor);
                    break;
                case "S":
                    btn = findViewById(R.id.btnS);
                    btn.setBackgroundColor(cor);
                    break;
                case "T":
                    btn = findViewById(R.id.btnT);
                    btn.setBackgroundColor(cor);
                    break;
                case "U":
                    btn = findViewById(R.id.btnU);
                    btn.setBackgroundColor(cor);
                    break;
                case "V":
                    btn = findViewById(R.id.btnV);
                    btn.setBackgroundColor(cor);
                    break;
                case "W":
                    btn = findViewById(R.id.btnW);
                    btn.setBackgroundColor(cor);
                    break;
                case "X":
                    btn = findViewById(R.id.btnX);
                    btn.setBackgroundColor(cor);
                    break;
                case "Y":
                    btn = findViewById(R.id.btnY);
                    btn.setBackgroundColor(cor);
                    break;
                case "Z":
                    btn = findViewById(R.id.btnZ);
                    btn.setBackgroundColor(cor);
                    break;
            }
        }
    }

    boolean verificarEspaco(String letra){
        linha1letra1 = findViewById(R.id.linha1letra1);
        linha1letra2 = findViewById(R.id.linha1letra2);
        linha1letra3 = findViewById(R.id.linha1letra3);
        linha1letra4 = findViewById(R.id.linha1letra4);
        linha1letra5 = findViewById(R.id.linha1letra5);
        linha2letra1 = findViewById(R.id.linha2letra1);
        linha2letra2 = findViewById(R.id.linha2letra2);
        linha2letra3 = findViewById(R.id.linha2letra3);
        linha2letra4 = findViewById(R.id.linha2letra4);
        linha2letra5 = findViewById(R.id.linha2letra5);
        linha3letra1 = findViewById(R.id.linha3letra1);
        linha3letra2 = findViewById(R.id.linha3letra2);
        linha3letra3 = findViewById(R.id.linha3letra3);
        linha3letra4 = findViewById(R.id.linha3letra4);
        linha3letra5 = findViewById(R.id.linha3letra5);
        linha4letra1 = findViewById(R.id.linha4letra1);
        linha4letra2 = findViewById(R.id.linha4letra2);
        linha4letra3 = findViewById(R.id.linha4letra3);
        linha4letra4 = findViewById(R.id.linha4letra4);
        linha4letra5 = findViewById(R.id.linha4letra5);
        linha5letra1 = findViewById(R.id.linha5letra1);
        linha5letra2 = findViewById(R.id.linha5letra2);
        linha5letra3 = findViewById(R.id.linha5letra3);
        linha5letra4 = findViewById(R.id.linha5letra4);
        linha5letra5 = findViewById(R.id.linha5letra5);
        linha6letra1 = findViewById(R.id.linha6letra1);
        linha6letra2 = findViewById(R.id.linha6letra2);
        linha6letra3 = findViewById(R.id.linha6letra3);
        linha6letra4 = findViewById(R.id.linha6letra4);
        linha6letra5 = findViewById(R.id.linha6letra5);

        switch (linha){
            case 1:
                if(linha1letra1.getText().equals("")){
                    linha1letra1.setText(letra);
                } else if(linha1letra2.getText().equals("")){
                    linha1letra2.setText(letra);
                } else if(linha1letra3.getText().equals("")){
                    linha1letra3.setText(letra);
                } else if(linha1letra4.getText().equals("")){
                    linha1letra4.setText(letra);
                } else if(linha1letra5.getText().equals("")){
                    linha1letra5.setText(letra);
                }
                break;
            case 2:
                if(linha2letra1.getText().equals("")){
                    linha2letra1.setText(letra);
                } else if(linha2letra2.getText().equals("")){
                    linha2letra2.setText(letra);
                } else if(linha2letra3.getText().equals("")){
                    linha2letra3.setText(letra);
                } else if(linha2letra4.getText().equals("")){
                    linha2letra4.setText(letra);
                } else if(linha2letra5.getText().equals("")){
                    linha2letra5.setText(letra);
                }
                break;
            case 3:
                if(linha3letra1.getText().equals("")){
                    linha3letra1.setText(letra);
                } else if(linha3letra2.getText().equals("")){
                    linha3letra2.setText(letra);
                } else if(linha3letra3.getText().equals("")){
                    linha3letra3.setText(letra);
                } else if(linha3letra4.getText().equals("")){
                    linha3letra4.setText(letra);
                } else if(linha3letra5.getText().equals("")){
                    linha3letra5.setText(letra);
                }
                break;
            case 4:
                if(linha4letra1.getText().equals("")){
                    linha4letra1.setText(letra);
                } else if(linha4letra2.getText().equals("")){
                    linha4letra2.setText(letra);
                } else if(linha4letra3.getText().equals("")){
                    linha4letra3.setText(letra);
                } else if(linha4letra4.getText().equals("")){
                    linha4letra4.setText(letra);
                } else if(linha4letra5.getText().equals("")){
                    linha4letra5.setText(letra);
                }
                break;
            case 5:
                if(linha5letra1.getText().equals("")){
                    linha5letra1.setText(letra);
                } else if(linha5letra2.getText().equals("")){
                    linha5letra2.setText(letra);
                } else if(linha5letra3.getText().equals("")){
                    linha5letra3.setText(letra);
                } else if(linha5letra4.getText().equals("")){
                    linha5letra4.setText(letra);
                } else if(linha5letra5.getText().equals("")){
                    linha5letra5.setText(letra);
                }
                break;
            case 6:
                if(linha6letra1.getText().equals("")){
                    linha6letra1.setText(letra);
                } else if(linha6letra2.getText().equals("")){
                    linha6letra2.setText(letra);
                } else if(linha6letra3.getText().equals("")){
                    linha6letra3.setText(letra);
                } else if(linha6letra4.getText().equals("")){
                    linha6letra4.setText(letra);
                } else if(linha6letra5.getText().equals("")){
                    linha6letra5.setText(letra);
                }
                break;
        }

        return true;
    }

    void dividirSilabas(String palavra){
        for (int i = 0; i < 5; i++){
            silabas.add(palavra.substring(i,i+1).toUpperCase());
        }

        verificarAcentuacao();
    }

    void verificarAcentuacao(){
        for (int i = 0; i < 5; i ++){
            switch (silabas.get(i)){
                case "Á":
                    silabas.set(i,"A");
                    break;
                case "Ã":
                    silabas.set(i, "A");
                    break;
                case "Â":
                    silabas.set(i, "A");
                    break;
                case "É":
                    silabas.set(i, "E");
                    break;
                case "Ê":
                    silabas.set(i, "E");
                    break;
                case "Í":
                    silabas.set(i, "I");
                    break;
                case "Î":
                    silabas.set(i, "I");
                    break;
                case "Ó":
                    silabas.set(i, "O");
                    break;
                case "Õ":
                    silabas.set(i, "O");
                    break;
                case "Ô":
                    silabas.set(i, "O");
                    break;
                case "Ú":
                    silabas.set(i, "U");
                    break;
                case "Û":
                    silabas.set(i, "U");
                    break;
                case "Ç":
                    silabas.set(i, "Ç");
                    break;
            }
        }
    }

    public void letra(View v){

        switch (v.getId()){
            case R.id.btnA:
                verificarEspaco("A");
                break;
            case R.id.btnB:
                verificarEspaco("B");
                break;
            case R.id.btnC:
                verificarEspaco("C");
                break;
            case R.id.btnD:
                verificarEspaco("D");
                break;
            case R.id.btnE:
                verificarEspaco("E");
                break;
            case R.id.btnF:
                verificarEspaco("F");
                break;
            case R.id.btnG:
                verificarEspaco("G");
                break;
            case R.id.btnH:
                verificarEspaco("H");
                break;
            case R.id.btnI:
                verificarEspaco("I");
                break;
            case R.id.btnJ:
                verificarEspaco("J");
                break;
            case R.id.btnK:
                verificarEspaco("K");
                break;
            case R.id.btnL:
                verificarEspaco("L");
                break;
            case R.id.btnM:
                verificarEspaco("M");
                break;
            case R.id.btnN:
                verificarEspaco("N");
                break;
            case R.id.btnO:
                verificarEspaco("O");
                break;
            case R.id.btnP:
                verificarEspaco("P");
                break;
            case R.id.btnQ:
                verificarEspaco("Q");
                break;
            case R.id.btnR:
                verificarEspaco("R");
                break;
            case R.id.btnS:
                verificarEspaco("S");
                break;
            case R.id.btnT:
                verificarEspaco("T");
                break;
            case R.id.btnU:
                verificarEspaco("U");
                break;
            case R.id.btnV:
                verificarEspaco("V");
                break;
            case R.id.btnW:
                verificarEspaco("W");
                break;
            case R.id.btnX:
                verificarEspaco("X");
                break;
            case R.id.btnY:
                verificarEspaco("Y");
                break;
            case R.id.btnZ:
                verificarEspaco("Z");
                break;
        }

    }

    public void enter(View v){
        String palavraFormada = "";
        if (v.getId() == R.id.btnEnter){
            switch (linha){
                case 1:
                    if (linha1letra5.getText().equals("")){
                        textoInformacao = findViewById(R.id.textoInformacao);
                        textoInformacao.setVisibility(View.VISIBLE);
                        textoInformacao.setText("palavra incompleta.");
                        textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                    } else {
                        palavraFormada = linha1letra1.getText().toString() + linha1letra2.getText().toString() +
                                linha1letra3.getText().toString() + linha1letra4.getText().toString() +
                                linha1letra5.getText().toString();
                        if (palavraFormada.equals(palavraSorteada.toUpperCase())){
                            linha1letra1.setBackgroundResource(R.drawable.letra_certa);
                            linha1letra2.setBackgroundResource(R.drawable.letra_certa);
                            linha1letra3.setBackgroundResource(R.drawable.letra_certa);
                            linha1letra4.setBackgroundResource(R.drawable.letra_certa);
                            linha1letra5.setBackgroundResource(R.drawable.letra_certa);
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("palavra certa.");
                            textoInformacao.setBackgroundResource(R.drawable.forma_certa);
                            pintarTeclado();
                        } else {
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.INVISIBLE);

                            if(linha1letra1.getText().equals(silabas.get(0))){
                                linha1letra1.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha1letra1);
                                letrasPosCerta2.add(linha1letra1.getText().toString());
                            } else if (silabas.contains(linha1letra1.getText())){
                                linha1letra1.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha1letra1);
                                letraPosErrada2.add(linha1letra1.getText().toString());
                            } else {
                                linha1letra1.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha1letra1.getText().toString());
                            }

                            if(linha1letra2.getText().equals(silabas.get(1))){
                                linha1letra2.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha1letra2);
                                letrasPosCerta2.add(linha1letra2.getText().toString());
                            } else if (silabas.contains(linha1letra2.getText())){
                                linha1letra2.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha1letra2);
                                letraPosErrada2.add(linha1letra2.getText().toString());
                            } else {
                                linha1letra2.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha1letra2.getText().toString());
                            }

                            if(linha1letra3.getText().equals(silabas.get(2))){
                                linha1letra3.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha1letra3);
                                letrasPosCerta2.add(linha1letra3.getText().toString());
                            } else if (silabas.contains(linha1letra3.getText())){
                                linha1letra3.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha1letra3);
                                letraPosErrada2.add(linha1letra3.getText().toString());
                            } else {
                                linha1letra3.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha1letra3.getText().toString());
                            }

                            if(linha1letra4.getText().equals(silabas.get(3))){
                                linha1letra4.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha1letra4);
                                letrasPosCerta2.add(linha1letra4.getText().toString());
                            } else if (silabas.contains(linha1letra4.getText())){
                                linha1letra4.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha1letra4);
                                letraPosErrada2.add(linha1letra4.getText().toString());
                            } else {
                                linha1letra4.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha1letra4.getText().toString());
                            }

                            if(linha1letra5.getText().equals(silabas.get(4))){
                                linha1letra5.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha1letra5);
                                letrasPosCerta2.add(linha1letra5.getText().toString());
                            } else if (silabas.contains(linha1letra5.getText().toString())){
                                linha1letra5.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha1letra5);
                                letraPosErrada2.add(linha1letra5.getText().toString());
                            } else {
                                linha1letra5.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha1letra5.getText().toString());
                            }

                            segundaVerificao(linha1letra1);
                            segundaVerificao(linha1letra2);
                            segundaVerificao(linha1letra3);
                            segundaVerificao(linha1letra4);
                            segundaVerificao(linha1letra5);
                            pintarTeclado();
                            letraNExiste.clear();
                            letraPosErrada.clear();
                            letrasPosCerta2.clear();
                            letrasPosCerta.clear();
                            linha +=1;
                        }
                    } break;
                case 2:
                    if (linha2letra5.getText().equals("")){
                        textoInformacao = findViewById(R.id.textoInformacao);
                        textoInformacao.setVisibility(View.VISIBLE);
                        textoInformacao.setText("palavra incompleta.");
                        textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                    } else {
                        palavraFormada = linha2letra1.getText().toString() + linha2letra2.getText().toString() +
                                linha2letra3.getText().toString() + linha2letra4.getText().toString() +
                                linha2letra5.getText().toString();
                        if (palavraFormada.equals(palavraSorteada.toUpperCase())){
                            linha2letra1.setBackgroundResource(R.drawable.letra_certa);
                            linha2letra2.setBackgroundResource(R.drawable.letra_certa);
                            linha2letra3.setBackgroundResource(R.drawable.letra_certa);
                            linha2letra4.setBackgroundResource(R.drawable.letra_certa);
                            linha2letra5.setBackgroundResource(R.drawable.letra_certa);
                            pintarTeclado();
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("palavra certa.");
                            textoInformacao.setBackgroundResource(R.drawable.forma_certa);
                        } else {
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.INVISIBLE);

                            if(linha2letra1.getText().equals(silabas.get(0))){
                                linha2letra1.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha2letra1);
                                letrasPosCerta2.add(linha2letra1.getText().toString());
                            } else if (silabas.contains(linha2letra1.getText())){
                                linha2letra1.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha2letra1);
                                letraPosErrada2.add(linha2letra1.getText().toString());
                            } else {
                                linha2letra1.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha2letra1.getText().toString());
                            }

                            if(linha2letra2.getText().equals(silabas.get(1))){
                                linha2letra2.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha2letra2);
                                letrasPosCerta2.add(linha2letra2.getText().toString());
                            } else if (silabas.contains(linha2letra2.getText())){
                                linha2letra2.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha2letra2);
                                letraPosErrada2.add(linha2letra2.getText().toString());
                            } else {
                                linha2letra2.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha2letra2.getText().toString());
                            }

                            if(linha2letra3.getText().equals(silabas.get(2))){
                                linha2letra3.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha2letra3);
                                letrasPosCerta2.add(linha2letra3.getText().toString());
                            } else if (silabas.contains(linha2letra3.getText())){
                                linha2letra3.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha2letra3);
                                letraPosErrada2.add(linha2letra3.getText().toString());
                            } else {
                                linha2letra3.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha2letra3.getText().toString());
                            }

                            if(linha2letra4.getText().equals(silabas.get(3))){
                                linha2letra4.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha2letra4);
                                letrasPosCerta2.add(linha2letra4.getText().toString());
                            } else if (silabas.contains(linha2letra4.getText())){
                                linha2letra4.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha2letra4);
                                letraPosErrada2.add(linha2letra4.getText().toString());
                            } else {
                                linha2letra4.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha2letra4.getText().toString());
                            }

                            if(linha2letra5.getText().equals(silabas.get(4))){
                                linha2letra5.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha2letra5);
                                letrasPosCerta2.add(linha2letra5.getText().toString());
                            } else if (silabas.contains(linha2letra5.getText().toString())){
                                linha2letra5.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha2letra5);
                                letraPosErrada2.add(linha2letra5.getText().toString());
                            } else {
                                linha2letra5.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha2letra5.getText().toString());
                            }

                            segundaVerificao(linha2letra1);
                            segundaVerificao(linha2letra2);
                            segundaVerificao(linha2letra3);
                            segundaVerificao(linha2letra4);
                            segundaVerificao(linha2letra5);
                            pintarTeclado();
                            letraNExiste.clear();
                            letraPosErrada.clear();
                            letrasPosCerta2.clear();
                            letrasPosCerta.clear();
                            linha +=1;
                        }
                    } break;
                case 3:
                    if (linha3letra5.getText().equals("")){
                        textoInformacao = findViewById(R.id.textoInformacao);
                        textoInformacao.setVisibility(View.VISIBLE);
                        textoInformacao.setText("palavra incompleta.");
                        textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                    } else {
                        palavraFormada = linha3letra1.getText().toString() + linha3letra2.getText().toString() +
                                linha3letra3.getText().toString() + linha3letra4.getText().toString() +
                                linha3letra5.getText().toString();
                        if (palavraFormada.equals(palavraSorteada.toUpperCase())){
                            linha3letra1.setBackgroundResource(R.drawable.letra_certa);
                            linha3letra2.setBackgroundResource(R.drawable.letra_certa);
                            linha3letra3.setBackgroundResource(R.drawable.letra_certa);
                            linha3letra4.setBackgroundResource(R.drawable.letra_certa);
                            linha3letra5.setBackgroundResource(R.drawable.letra_certa);
                            pintarTeclado();
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("palavra certa.");
                            textoInformacao.setBackgroundResource(R.drawable.forma_certa);
                        } else {
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.INVISIBLE);

                            if(linha3letra1.getText().equals(silabas.get(0))){
                                linha3letra1.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha3letra1);
                                letrasPosCerta2.add(linha3letra1.getText().toString());
                            } else if (silabas.contains(linha3letra1.getText())){
                                linha3letra1.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha3letra1);
                                letraPosErrada2.add(linha3letra1.getText().toString());
                            } else {
                                linha3letra1.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha3letra1.getText().toString());
                            }

                            if(linha3letra2.getText().equals(silabas.get(1))){
                                linha3letra2.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha3letra2);
                                letrasPosCerta2.add(linha3letra2.getText().toString());
                            } else if (silabas.contains(linha3letra2.getText())){
                                linha3letra2.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha3letra2);
                                letraPosErrada2.add(linha3letra2.getText().toString());
                            } else {
                                linha3letra2.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha3letra2.getText().toString());
                            }

                            if(linha3letra3.getText().equals(silabas.get(2))){
                                linha3letra3.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha3letra3);
                                letrasPosCerta2.add(linha3letra3.getText().toString());
                            } else if (silabas.contains(linha3letra3.getText())){
                                linha3letra3.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha3letra3);
                                letraPosErrada2.add(linha3letra3.getText().toString());
                            } else {
                                linha3letra3.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha3letra3.getText().toString());
                            }

                            if(linha3letra4.getText().equals(silabas.get(3))){
                                linha3letra4.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha3letra4);
                                letrasPosCerta2.add(linha3letra4.getText().toString());
                            } else if (silabas.contains(linha3letra4.getText())){
                                linha3letra4.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha3letra4);
                                letraPosErrada2.add(linha3letra4.getText().toString());
                            } else {
                                linha3letra4.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha3letra4.getText().toString());
                            }

                            if(linha3letra5.getText().equals(silabas.get(4))){
                                linha3letra5.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha3letra5);
                                letrasPosCerta2.add(linha3letra5.getText().toString());
                            } else if (silabas.contains(linha3letra5.getText().toString())){
                                linha3letra5.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha3letra5);
                                letraPosErrada2.add(linha3letra5.getText().toString());
                            } else {
                                linha3letra5.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha3letra5.getText().toString());
                            }

                            segundaVerificao(linha3letra1);
                            segundaVerificao(linha3letra2);
                            segundaVerificao(linha3letra3);
                            segundaVerificao(linha3letra4);
                            segundaVerificao(linha3letra5);
                            pintarTeclado();
                            letraNExiste.clear();
                            letraPosErrada.clear();
                            letrasPosCerta2.clear();
                            letrasPosCerta.clear();
                            linha +=1;
                        }
                    } break;
                case 4:
                    if (linha4letra5.getText().equals("")){
                        textoInformacao = findViewById(R.id.textoInformacao);
                        textoInformacao.setVisibility(View.VISIBLE);
                        textoInformacao.setText("palavra incompleta.");
                        textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                    } else {
                        palavraFormada = linha4letra1.getText().toString() + linha4letra2.getText().toString() +
                                linha4letra3.getText().toString() + linha4letra4.getText().toString() +
                                linha4letra5.getText().toString();
                        if (palavraFormada.equals(palavraSorteada.toUpperCase())){
                            linha4letra1.setBackgroundResource(R.drawable.letra_certa);
                            linha4letra2.setBackgroundResource(R.drawable.letra_certa);
                            linha4letra3.setBackgroundResource(R.drawable.letra_certa);
                            linha4letra4.setBackgroundResource(R.drawable.letra_certa);
                            linha4letra5.setBackgroundResource(R.drawable.letra_certa);
                            pintarTeclado();
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("palavra certa.");
                            textoInformacao.setBackgroundResource(R.drawable.forma_certa);
                        } else {
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.INVISIBLE);

                            if(linha4letra1.getText().equals(silabas.get(0))){
                                linha4letra1.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha4letra1);
                                letrasPosCerta2.add(linha4letra1.getText().toString());
                            } else if (silabas.contains(linha4letra1.getText())){
                                linha4letra1.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha4letra1);
                                letraPosErrada2.add(linha4letra1.getText().toString());
                            } else {
                                linha4letra1.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha4letra1.getText().toString());
                            }

                            if(linha4letra2.getText().equals(silabas.get(1))){
                                linha4letra2.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha4letra2);
                                letrasPosCerta2.add(linha4letra2.getText().toString());
                            } else if (silabas.contains(linha4letra2.getText())){
                                linha4letra2.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha4letra2);
                                letraPosErrada2.add(linha4letra2.getText().toString());
                            } else {
                                linha4letra2.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha4letra2.getText().toString());
                            }

                            if(linha4letra3.getText().equals(silabas.get(2))){
                                linha4letra3.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha4letra3);
                                letrasPosCerta2.add(linha4letra3.getText().toString());
                            } else if (silabas.contains(linha4letra3.getText())){
                                linha4letra3.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha4letra3);
                                letraPosErrada2.add(linha4letra3.getText().toString());
                            } else {
                                linha4letra3.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha4letra3.getText().toString());
                            }

                            if(linha4letra4.getText().equals(silabas.get(3))){
                                linha4letra4.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha4letra4);
                                letrasPosCerta2.add(linha4letra4.getText().toString());
                            } else if (silabas.contains(linha4letra4.getText())){
                                linha4letra4.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha4letra4);
                                letraPosErrada2.add(linha4letra4.getText().toString());
                            } else {
                                linha4letra4.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha4letra4.getText().toString());
                            }

                            if(linha4letra5.getText().equals(silabas.get(4))){
                                linha4letra5.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha4letra5);
                                letrasPosCerta2.add(linha4letra5.getText().toString());
                            } else if (silabas.contains(linha4letra5.getText().toString())){
                                linha4letra5.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha4letra5);
                                letraPosErrada2.add(linha4letra5.getText().toString());
                            } else {
                                linha4letra5.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha4letra5.getText().toString());
                            }

                            segundaVerificao(linha4letra1);
                            segundaVerificao(linha4letra2);
                            segundaVerificao(linha4letra3);
                            segundaVerificao(linha4letra4);
                            segundaVerificao(linha4letra5);
                            pintarTeclado();
                            letraNExiste.clear();
                            letraPosErrada.clear();
                            letrasPosCerta2.clear();
                            letrasPosCerta.clear();
                            linha +=1;
                        }
                    } break;
                case 5:
                    if (linha5letra5.getText().equals("")){
                        textoInformacao = findViewById(R.id.textoInformacao);
                        textoInformacao.setVisibility(View.VISIBLE);
                        textoInformacao.setText("palavra incompleta.");
                        textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                    } else {
                        palavraFormada = linha5letra1.getText().toString() + linha5letra2.getText().toString() +
                                linha5letra3.getText().toString() + linha5letra4.getText().toString() +
                                linha5letra5.getText().toString();
                        if (palavraFormada.equals(palavraSorteada.toUpperCase())){
                            linha5letra1.setBackgroundResource(R.drawable.letra_certa);
                            linha5letra2.setBackgroundResource(R.drawable.letra_certa);
                            linha5letra3.setBackgroundResource(R.drawable.letra_certa);
                            linha5letra4.setBackgroundResource(R.drawable.letra_certa);
                            linha5letra5.setBackgroundResource(R.drawable.letra_certa);
                            pintarTeclado();
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("palavra certa.");
                            textoInformacao.setBackgroundResource(R.drawable.forma_certa);
                        } else {
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.INVISIBLE);

                            if(linha5letra1.getText().equals(silabas.get(0))){
                                linha5letra1.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha5letra1);
                                letrasPosCerta2.add(linha5letra1.getText().toString());
                            } else if (silabas.contains(linha5letra1.getText())){
                                linha5letra1.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha5letra1);
                                letraPosErrada2.add(linha5letra1.getText().toString());
                            } else {
                                linha5letra1.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha5letra1.getText().toString());
                            }

                            if(linha5letra2.getText().equals(silabas.get(1))){
                                linha5letra2.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha5letra2);
                                letrasPosCerta2.add(linha5letra2.getText().toString());
                            } else if (silabas.contains(linha5letra2.getText())){
                                linha5letra2.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha5letra2);
                                letraPosErrada2.add(linha5letra2.getText().toString());
                            } else {
                                linha5letra2.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha5letra2.getText().toString());
                            }

                            if(linha5letra3.getText().equals(silabas.get(2))){
                                linha5letra3.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha5letra3);
                                letrasPosCerta2.add(linha5letra3.getText().toString());
                            } else if (silabas.contains(linha5letra3.getText())){
                                linha5letra3.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha5letra3);
                                letraPosErrada2.add(linha5letra3.getText().toString());
                            } else {
                                linha5letra3.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha5letra3.getText().toString());
                            }

                            if(linha5letra4.getText().equals(silabas.get(3))){
                                linha5letra4.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha5letra4);
                                letrasPosCerta2.add(linha5letra4.getText().toString());
                            } else if (silabas.contains(linha5letra4.getText())){
                                linha5letra4.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha5letra4);
                                letraPosErrada2.add(linha5letra4.getText().toString());
                            } else {
                                linha5letra4.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha5letra4.getText().toString());
                            }

                            if(linha5letra5.getText().equals(silabas.get(4))){
                                linha5letra5.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha5letra5);
                                letrasPosCerta2.add(linha5letra5.getText().toString());
                            } else if (silabas.contains(linha5letra5.getText().toString())){
                                linha5letra5.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha5letra5);
                                letraPosErrada2.add(linha5letra5.getText().toString());
                            } else {
                                linha5letra5.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha5letra5.getText().toString());
                            }

                            segundaVerificao(linha5letra1);
                            segundaVerificao(linha5letra2);
                            segundaVerificao(linha5letra3);
                            segundaVerificao(linha5letra4);
                            segundaVerificao(linha5letra5);
                            pintarTeclado();
                            letraNExiste.clear();
                            letraPosErrada.clear();
                            letrasPosCerta2.clear();
                            letrasPosCerta.clear();
                            linha +=1;
                        }
                    } break;
                case 6:
                    if (linha6letra5.getText().equals("")){
                        textoInformacao = findViewById(R.id.textoInformacao);
                        textoInformacao.setVisibility(View.VISIBLE);
                        textoInformacao.setText("palavra incompleta.");
                        textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                    } else {
                        palavraFormada = linha6letra1.getText().toString() + linha6letra2.getText().toString() +
                                linha6letra3.getText().toString() + linha6letra4.getText().toString() +
                                linha6letra5.getText().toString();
                        if (palavraFormada.equals(palavraSorteada.toUpperCase())){
                            linha6letra1.setBackgroundResource(R.drawable.letra_certa);
                            linha6letra2.setBackgroundResource(R.drawable.letra_certa);
                            linha6letra3.setBackgroundResource(R.drawable.letra_certa);
                            linha6letra4.setBackgroundResource(R.drawable.letra_certa);
                            linha6letra5.setBackgroundResource(R.drawable.letra_certa);
                            pintarTeclado();
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("palavra certa.");
                            textoInformacao.setBackgroundResource(R.drawable.forma_certa);
                        } else {
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.INVISIBLE);

                            if(linha6letra1.getText().equals(silabas.get(0))){
                                linha6letra1.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha6letra1);
                                letrasPosCerta2.add(linha6letra1.getText().toString());
                            } else if (silabas.contains(linha6letra1.getText())){
                                linha6letra1.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha6letra1);
                                letraPosErrada2.add(linha6letra1.getText().toString());
                            } else {
                                linha6letra1.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha6letra1.getText().toString());
                            }

                            if(linha6letra2.getText().equals(silabas.get(1))){
                                linha6letra2.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha6letra2);
                                letrasPosCerta2.add(linha6letra2.getText().toString());
                            } else if (silabas.contains(linha6letra2.getText())){
                                linha6letra2.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha6letra2);
                                letraPosErrada2.add(linha6letra2.getText().toString());
                            } else {
                                linha6letra2.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha6letra2.getText().toString());
                            }

                            if(linha6letra3.getText().equals(silabas.get(2))){
                                linha6letra3.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha6letra3);
                                letrasPosCerta2.add(linha6letra3.getText().toString());
                            } else if (silabas.contains(linha6letra3.getText())){
                                linha6letra3.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha6letra3);
                                letraPosErrada2.add(linha6letra3.getText().toString());
                            } else {
                                linha6letra3.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha6letra3.getText().toString());
                            }

                            if(linha6letra4.getText().equals(silabas.get(3))){
                                linha6letra4.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha6letra4);
                                letrasPosCerta2.add(linha6letra4.getText().toString());
                            } else if (silabas.contains(linha6letra4.getText())){
                                linha6letra4.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha6letra4);
                                letraPosErrada2.add(linha6letra4.getText().toString());
                            } else {
                                linha6letra4.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha6letra4.getText().toString());
                            }

                            if(linha6letra5.getText().equals(silabas.get(4))){
                                linha6letra5.setBackgroundResource(R.drawable.letra_certa);
                                letrasPosCerta.add(linha6letra5);
                                letrasPosCerta2.add(linha6letra5.getText().toString());
                            } else if (silabas.contains(linha6letra5.getText().toString())){
                                linha6letra5.setBackgroundResource(R.drawable.letra_quase);
                                letraPosErrada.add(linha6letra5);
                                letraPosErrada2.add(linha6letra5.getText().toString());
                            } else {
                                linha6letra5.setBackgroundResource(R.drawable.letra_errada);
                                letraNExiste.add(linha6letra5.getText().toString());
                            }

                            segundaVerificao(linha6letra1);
                            segundaVerificao(linha6letra2);
                            segundaVerificao(linha6letra3);
                            segundaVerificao(linha6letra4);
                            segundaVerificao(linha6letra5);
                            pintarTeclado();
                            letraNExiste.clear();
                            letraPosErrada.clear();
                            letrasPosCerta2.clear();
                            letrasPosCerta.clear();
                            linha +=1;
                            textoInformacao = findViewById(R.id.textoInformacao);
                            textoInformacao.setVisibility(View.VISIBLE);
                            textoInformacao.setText("a palavra era: " + palavraSorteada);
                            textoInformacao.setBackgroundResource(R.drawable.forma_errada);
                        }
                    } break;
            }
        }
    }

    public void apagarLetra(View v){
        if (v.getId() == R.id.btnApagar){
            switch (linha){
                case 1:
                    if (linha1letra5.getText() != "") {
                        linha1letra5.setText("");
                    } else if (linha1letra4.getText() != "") {
                        linha1letra4.setText("");
                    } else if (linha1letra3.getText() != "") {
                        linha1letra3.setText("");
                    } else if (linha1letra2.getText() != "") {
                        linha1letra2.setText("");
                    } else if (linha1letra1.getText() != "") {
                        linha1letra1.setText("");
                    }
                    break;
                case 2:
                    if (linha2letra5.getText() != "") {
                        linha2letra5.setText("");
                    } else if (linha2letra4.getText() != "") {
                        linha2letra4.setText("");
                    } else if (linha2letra3.getText() != "") {
                        linha2letra3.setText("");
                    } else if (linha2letra2.getText() != "") {
                        linha2letra2.setText("");
                    } else if (linha2letra1.getText() != "") {
                        linha2letra1.setText("");
                    }
                    break;
                case 3:
                    if (linha3letra5.getText() != "") {
                        linha3letra5.setText("");
                    } else if (linha3letra4.getText() != "") {
                        linha3letra4.setText("");
                    } else if (linha3letra3.getText() != "") {
                        linha3letra3.setText("");
                    } else if (linha3letra2.getText() != "") {
                        linha3letra2.setText("");
                    } else if (linha3letra1.getText() != "") {
                        linha3letra1.setText("");
                    }
                    break;
                case 4:
                    if (linha4letra5.getText() != "") {
                        linha4letra5.setText("");
                    } else if (linha4letra4.getText() != "") {
                        linha4letra4.setText("");
                    } else if (linha4letra3.getText() != "") {
                        linha4letra3.setText("");
                    } else if (linha4letra2.getText() != "") {
                        linha4letra2.setText("");
                    } else if (linha4letra1.getText() != "") {
                        linha4letra1.setText("");
                    }
                    break;
                case 5:
                    if (linha5letra5.getText() != "") {
                        linha5letra5.setText("");
                    } else if (linha5letra4.getText() != "") {
                        linha5letra4.setText("");
                    } else if (linha5letra3.getText() != "") {
                        linha5letra3.setText("");
                    } else if (linha5letra2.getText() != "") {
                        linha5letra2.setText("");
                    } else if (linha5letra1.getText() != "") {
                        linha5letra1.setText("");
                    }
                    break;
                case 6:
                    if (linha6letra5.getText() != "") {
                        linha6letra5.setText("");
                    } else if (linha6letra4.getText() != "") {
                        linha6letra4.setText("");
                    } else if (linha6letra3.getText() != "") {
                        linha6letra3.setText("");
                    } else if (linha6letra2.getText() != "") {
                        linha6letra2.setText("");
                    } else if (linha6letra1.getText() != "") {
                        linha6letra1.setText("");
                    }
                    break;
            }
        }
    }

    int contarLetras(CharSequence letra, List<String> lista){
        int numero = 0;
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).equals(letra)){
                numero+=1;
            }
        }
        return numero;
    }

    void segundaVerificao(TextView linhaLetra){
        int num = 0;
        if(contarLetras(linhaLetra.getText(),silabas) == 1){
            if (letraPosErrada.contains(linhaLetra) && letrasPosCerta2.contains(linhaLetra.getText().toString())) {
                linhaLetra.setBackgroundResource(R.drawable.letra_errada);
            }
            if (letraPosErrada.contains(linhaLetra)) {
                for (TextView t : letraPosErrada) {
                    if (t.getText().toString().equals(linhaLetra.getText().toString())) {
                        num+=1;
                        if (num > 1) {
                            t.setBackgroundResource(R.drawable.letra_errada);
                        }

                    }
                }
            }
        } else if (contarLetras(linhaLetra.getText(),silabas) == 2) {
            if (letraPosErrada.contains(linhaLetra)){
                for(String l: letrasPosCerta2){
                    if (l.equals(linhaLetra.getText())){
                        num+=1;
                    }
                }
                if (num == 2){
                    linhaLetra.setBackgroundResource(R.drawable.letra_errada);
                }
            }
        } else if (contarLetras(linhaLetra.getText(),silabas) == 3) {
            if (letraPosErrada.contains(linhaLetra)){
                for(String l: letrasPosCerta2){
                    if (l.equals(linhaLetra.getText())){
                        num+=1;
                    }
                }
                if (num == 3){
                    linhaLetra.setBackgroundResource(R.drawable.letra_errada);
                }
            }
        }
    }
}


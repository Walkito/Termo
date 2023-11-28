package br.com.unip.termo;

import android.content.Context;
import android.content.res.AssetManager;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Palavras  {

    private String palavraSorteada = "";
    private String caminhoTxt = "";
    private File file = new File(caminhoTxt);
    private int i = 0;
    private List<String> listaPalavras = new ArrayList<>();
    private Context mContext;

    public Palavras(Context context) throws IOException {
        mContext = context;
    }

    public String sortearPalavras() throws IOException {
        AssetManager assetManager = mContext.getAssets();
        InputStream inputStream = assetManager.open("palavrasFiltradas.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader txtPalavras  = new BufferedReader(inputStreamReader);
        String linha = "";
        Random r = new Random();

        while (true) {
            if (linha != null) {
                listaPalavras.add(linha);
            } else break;
            linha = txtPalavras.readLine();
        }

        i = r.nextInt(listaPalavras.size()-1);

        palavraSorteada = listaPalavras.get(i);

        return palavraSorteada;
    }

}

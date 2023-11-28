package br.com.unip.termo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Cena1 extends AppCompatActivity {
    // 245 caracteres no máximo

    Button btnProximo;
    TextView cxTexto;
    int cont = 0;
    List<String> listaFalas = new ArrayList<>();
    View t;
    int cena = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cena1);
        getSupportActionBar().hide();

        if (getIntent().hasExtra("cena")) {
            cena = getIntent().getIntExtra("cena", 1);
        }

        adicionarFalas();
        proximaFala(t);
    }

    public void proximaFala(View v){
        cxTexto = findViewById(R.id.cxTexto);
        for (int i = 0; i <= listaFalas.size() -1; i++) {
            if (cont == i ){
                cxTexto.setText(listaFalas.get(i));
            } else if (cena == 7 && cont > listaFalas.size() -1){
                Intent cenaFinal = new Intent(this, CenaFinal.class);
                startActivity(cenaFinal);
                finish();
            } else if (cont > listaFalas.size() -1){
                Intent telaJogo = new Intent(this, TelaJogo.class);
                telaJogo.putExtra("fase", cena);
                startActivity(telaJogo);
                finish();
            }
        }
        cont+=1;
    }

    void adicionarFalas(){
        switch (cena){
            case 1:
                listaFalas.add("Olá, muito prazer! Meu nome é Teófilis Ernesto Romanezzi Matias de Oliveira. Eu sei, eu sei, \"que nome gigante\" não é? Mas devido à minha paixão por palavras, meus familiares e amigos me apelidaram de TERMO. Legal, não é?");
                listaFalas.add("Esta é a famosa: \"Floresta das Letras\". Eu estava em uma aventura nesta floresta, para descobrir novas palavras. Eu andei e andei por horas e encontrei muitas palavras novas e legais, mas conforme vou entrando na floresta mais difícil fica.");
                listaFalas.add("Será que você pode me ajudar a descobrir as próximas palavras? Tenho certeza que vamos formar uma excelente dupla, afinal, duas cabeças pensando é melhor do que uma sozinha.");
                listaFalas.add("Vamos lá amiguinho! Vamos encontrar palavras novas. Vamos voltar ao início da floresta para você ir pegando o jeito. Descubra 5 palavras seguidas para avançarmos.");
                break;
            case 2:
                listaFalas.add("Parabéns amiguinho!! Você é muito bom nisso, estas palavras são incríveis. É tão legal descobrir novas palavras não é mesmo? Podemos adicioná-las em nosso vocabulário a partir de agora. Vem comigo, vamos agora conhecer uma árvore especial.");
                listaFalas.add("Ali na frente há uma das 3 árvores místicas do dicionário. Estas árvores contêm uma palavra sobre o nosso amado meio-ambiente. Graças a elas, que temos o nosso ar limpinho e esta mata verdejante. Vem comigo, vamos ver ela de perto.");
                listaFalas.add("Espera? O que aconteceu? A palavra dela sumiu!!! Essa não, se estas palavras sumirem, esta Floresta vai morrer! Não podemos deixar isso acontecer de jeito nenhum!");
                listaFalas.add("Precisamos descobrir a palavra que estava aqui e colocar ela de volta no lugar dela. Tenho certeza que se trabalharmos juntos, vamos devolver ela ao lugar que ela pertence. Mas precisamos ser rápidos. Vamos lá!");
                break;
            case 3:
                listaFalas.add("Águas!!! Sim, exatamente, esta era a palavra que estava faltando nesta árvore mística. Você sabia que o Brasil possui 12% das reservas de água doce do planeta? Isso constituí 53% dos recursos hídrocos da América do Sul inteirinha.");
                listaFalas.add("Mas, é algo que devemos ter atenção amiguinho! Por mais que tenhamos uma abundância de água, infelizmente não estamos preservando da forma correta. Infelizmente há muito descarte de resíduos industriais e sólidos em rios e lagos ao redor do Brasil.");
                listaFalas.add("Isso não pode acontecer!!! Com o descarte incorreto de lixo, a água potável fica poluída e inviável para consumo. Lembre-se amiguinho: Lugar de lixo é no lixo!");
                listaFalas.add("Precisamos continuar explorando esta floresta. Vamos verificar se as demais árvores místicas ainda estão com as suas palavras! Mas para isso, vamos precisar passar por mais uma zona de palavras. Mas cuidado, agora ficará um pouco mais difícil.");
                break;
            case 4:
                listaFalas.add("Muito bem amiguinho, parabéns!!! Você ficou profissional nisso. Muitas dessas palavras eu não conhecia, muito legal, estou aprendendo bastante nesta aventura com você!");
                listaFalas.add("Vamos verificar se a próxima árvore mística está com a sua palavra essencial, ou se ela sumiu também. Essas árvores são as responsáveis pelo equilibrio da natura, e o motivo dela existir!");
                listaFalas.add("Se essas palavras sumirem, se estiverem fora das árvores, todo o meio-ambiente e a natureza vai morrer. As flores vão murchar e os animais irão ser extintos. Tadinhos! A gente não pode deixar isso acontecer amiguinho. Precisamos cuidar da natureza.");
                listaFalas.add("Essa não! Mais uma vez palavra sumiu. Isso quer dizer que precisamos encontrar esta palavra importante também. Conto com você para me ajudar amiguinho, vamos colocar esta palavra de volta para onde ela pertence!");
                break;
            case 5:
                listaFalas.add("Fauna!!! Perfeito! Não existe natureza sem a sua fauna, é essencial para o mundo inteirinho. Você sabia que a fauna brasileira é provavelmente a que possui maior diversidade em espécies de animais vertebrados, anfíbios e primatas?");
                listaFalas.add("Existem três vezes mais espécies de peixes de água doce no Brasil do que em qualquer lugar no mundo. Temos também a maior variedade de espécies na América do Sul. Nós temos a maior biodiversidade do mundo, entorno de 108.200 espécies de animais.");
                listaFalas.add("Porém, nem tudo é flores amiguinho, a poluição do meio ambiente, somada ao desmatamento desenfreado das floresta, caça e o comércio ilegal de animais, tudo isto está destruindo a nossa fauna. Possuímos mais de 627 espécies de animais em extinção!");
                listaFalas.add("Isso é inaceitável. Lugar de animal é na floresta, com a sua família, não temos o direito de comercializar e caçar eles. Não concorda com isso amiguinho? Precisamos continuar achando as palavras e impedir que a natureza acaba, senão, onde os animaizinhos vão morar?");
                break;
            case 6:
                listaFalas.add("Ufa!!! Conseguimos achar todas as palavras restantes. Todas as árvores já estão preenchidas. Com excessão de uma. A árvore mística final, a palavra dela também sumiu. Precisamos devolve-la e com isso a natureza estará preservada novamente.");
                listaFalas.add("Amiguinho, muito obrigado desde já pela sua ajuda. Tudo começou com uma simples brincadeira e visita à floresta, mas no fim acabamos tendo que salvar todo o meio-ambiente. Que loucura não é mesmo?");
                listaFalas.add("Você é muito bom com as palavras muito melhor que eu. E agora só falta a palavra final. Eu tenho certeza que vamos conseguir descobrir ela e impedir que todo o meio-ambiente seja evaporado. Mas depois precisamos descobrir quem foi que roubou as palavras.");
                listaFalas.add("Independentemente, isto fica para depois. Nós agora temos uma missão mais importante amiguinho, concentração, não podemos falhar, toda a natureza e o mundo inteiro está contando conosco!!! Vamos lá!");
                break;
            case 7:
                listaFalas.add("NÓS CONSEGUIMOS!!! EBAAAAAA, PARABÉNS AMIGUINHO! NÓS SALVAMOS A NATUREZA! Ufaaaa, que sufoco foi esse dia, que susto tomamos com essas palavras perdidas. Agora que todas estão em seus respectivos lugar, tudo voltará a ser como era.");
                listaFalas.add("Você sabia que além da fauna, possuímos uma enorme variedade de plantas? São mais de 46.000 espécies conhecidas. Cada região do Brasil possuí sua vegetação típica. Além disto, muitos laboratórios de farmacêuticos utilizam matérias primas desta flora. ");
                listaFalas.add("Amiguinho, mais uma vez muito obrigado pela sua ajuda. Sem você eu não iria conseguir, você salvou a natureza muito mais do que eu. Todos estamos muito grato pela sua ajuda. Parabéns, você é fera na Língua Portuguesa.");
                listaFalas.add("Já está escurecendo amiguinho, eu vou voltar para casa, meus pais já devem estar muitissimo preocupados comigo. Você deveria voltar também, não quer deixar seus pais preocupados né?");
                listaFalas.add("Adorei fazer amizade com você. Vamos brincar mais outro dia amiguinho, tem tantas brincadeiras que podemos fazer: separar sílabas, esconde escondo com o sujeito da oração, procurar sílabadas tônicas. Vamos brincar muito no futuro!");
                break;
        }
    }
}
package com.example.aula1208;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String nome;
    private String sexo;
    private String nomePokemon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comecaJogo(View view) {
        pegaInformacaoDaTela();

        mostraInformacaoNaTela();
    }

    private void mostraInformacaoNaTela() {
        ImageView mostraFoto = findViewById(R.id.iv_mostraFotoPokemon);
        if(nomePokemon.equals("Charmander")){
            mostraFoto.setImageResource(R.drawable.charmander);
        }
        else if(nomePokemon.equals("Squirtle")){
            mostraFoto.setImageResource(R.drawable.squirtle);
        }
        else{
            mostraFoto.setImageResource(R.drawable.bulbasaur);
        }

        TextView mostraNome = findViewById(R.id.tv_mostraNome);
        mostraNome.setText(nome);

        TextView mostraSexo = findViewById(R.id.tv_mostraSexo);
        mostraSexo.setText(sexo);
    }

    private void pegaInformacaoDaTela() {
        //Cria um objeto EditText e extrai o nome digitado nele
        EditText pegaNome = findViewById(R.id.et_pegaNome);
        nome = pegaNome.getText().toString();

        //Cria um objeto RadioGroup e extrai o objeto RadioButton selecionado
        RadioGroup pegaSexo = findViewById(R.id.rg_pegaSexo);
        int idDoBotaoClicado = pegaSexo.getCheckedRadioButtonId();
        RadioButton botaoClicado = findViewById(idDoBotaoClicado);
        sexo = botaoClicado.getText().toString();

        RadioGroup pegaPokemon = findViewById(R.id.rg_pegaPokemon);
        int idPokemonSelecionado = pegaPokemon.getCheckedRadioButtonId();
        RadioButton pokemonSelecionado = findViewById(idPokemonSelecionado);
        nomePokemon = pokemonSelecionado.getText().toString();
    }
}

package com.example.rousseau.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {

    EditText txt_primeiro_valor;
    EditText txt_segundo_valor;
    EditText txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*
    public void click(View view) {
        Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_LONG).show();
    }
*/
    public void LerEditText() {
        txt_primeiro_valor = (EditText) findViewById(R.id.txt_primeiro_valor);
        txt_segundo_valor = (EditText) findViewById(R.id.txt_segundo_valor);
        txt_resultado = (EditText) findViewById(R.id.txt_resultado);
    }
    public void ClickSoma(View v) {
        LerEditText();
        String s;

        s = txt_primeiro_valor.getText().toString();
        Calculadora.setPrimeiraVariavel(Double.parseDouble(s));

        s = txt_segundo_valor.getText().toString();
        Calculadora.setSegundaVariavel(Double.parseDouble(s));

        Calculadora.soma();

        s = String.valueOf(Calculadora.resultadoOperacao);
        txt_resultado.setText(s);

    }

    public void ClickSubtracao(View v) {
        LerEditText();
        String s;

        s = txt_primeiro_valor.getText().toString();
        Calculadora.setPrimeiraVariavel(Double.parseDouble(s));

        s = txt_segundo_valor.getText().toString();
        Calculadora.setSegundaVariavel(Double.parseDouble(s));

        Calculadora.subtracao();

        s = String.valueOf(Calculadora.resultadoOperacao);
        txt_resultado.setText(s);
    }

    public void ClickMultiplicacao(View v) {
        LerEditText();
        String s;

        s = txt_primeiro_valor.getText().toString();
        Calculadora.setPrimeiraVariavel(Double.parseDouble(s));

        s = txt_segundo_valor.getText().toString();
        Calculadora.setSegundaVariavel(Double.parseDouble(s));

        Calculadora.multiplicacao();

        s = String.valueOf(Calculadora.resultadoOperacao);
        txt_resultado.setText(s);
    }

    public void ClickDivisao(View v) {
        LerEditText();
        String s;

        s = txt_primeiro_valor.getText().toString();
        Calculadora.setPrimeiraVariavel(Double.parseDouble(s));

        s = txt_segundo_valor.getText().toString();
        Calculadora.setSegundaVariavel(Double.parseDouble(s));

        Calculadora.divisao();

        s = String.valueOf(Calculadora.resultadoOperacao);
        txt_resultado.setText(s);
    }

    public void ClickLimpar(View v) {
        LerEditText();

        txt_primeiro_valor.setText("");
        txt_segundo_valor.setText("");
        txt_resultado.setText("");
    }
}

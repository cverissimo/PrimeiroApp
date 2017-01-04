package com.example.rousseau.primeiroapp;

/**
 * Created by rousseau on 1/3/17.
 */

public class Calculadora {
    public static double primeiraVariavel;
    public static double segundaVariavel;
    public static double resultadoOperacao;

    public static void soma() {
        resultadoOperacao = primeiraVariavel + segundaVariavel;
    }

    public static void subtracao() {
        resultadoOperacao = primeiraVariavel - segundaVariavel;
    }

    public static void multiplicacao() {
        resultadoOperacao = primeiraVariavel * segundaVariavel;
    }

    public static void divisao() {
        resultadoOperacao = primeiraVariavel / segundaVariavel;
    }

    public static void setPrimeiraVariavel(double primeiraVariavel) {
        Calculadora.primeiraVariavel = primeiraVariavel;
    }

    public static void setSegundaVariavel(double segundaVariavel) {
        Calculadora.segundaVariavel = segundaVariavel;
    }
}

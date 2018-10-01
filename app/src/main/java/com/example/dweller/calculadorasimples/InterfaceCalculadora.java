package com.example.dweller.calculadorasimples;

/**
 * Created by dweller on 9/30/18.
 */

public interface InterfaceCalculadora {
    double soma(Double valor1, Double valor2);

    double subtracao(Double valor1, Double valor2);

    double multiplicacao(Double valor1, Double valor2);

    double divisao(Double valor1, Double valor2);

    double porcentagem(Double valor1);

    double tratarExpressao(String param);
}

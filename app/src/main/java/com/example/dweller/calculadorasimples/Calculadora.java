package com.example.dweller.calculadorasimples;

import com.example.dweller.calculadorasimples.InterfaceCalculadora;

/**
 * Created by dweller on 9/30/18.
 */

public class Calculadora implements InterfaceCalculadora {

    Double valor1 = 0.0, valor2 = 0.0, resultado = 0.0;
    String[] sinais = {"+", "-", "/", "x", "%"};
    String operador;
    int posicao = 0;

    @Override
    public double soma(Double valor1, Double valor2) {
        Double resultado = valor1 + valor2;
        return resultado;
    }

    @Override
    public double subtracao(Double valor1, Double valor2) {
        Double resultado = valor1 - valor2;
        return resultado;
    }

    @Override
    public double multiplicacao(Double valor1, Double valor2) {
        Double resultado = valor1 * valor2;
        return resultado;
    }

    @Override
    public double divisao(Double valor1, Double valor2) {
        Double resultado = valor1 / valor2;
        return resultado;
    }

    @Override
    public double porcentagem(Double valor1) {
        return valor1 / 100;
    }

    public double tratarExpressao(String param) {
        for (int i = 0; i < sinais.length; i++)
            for (int j = 0; j < param.length(); j++)
                if (sinais[i].equals(String.valueOf(param.charAt(j))))
                    posicao = j;

        operador = String.valueOf(param.charAt(posicao));

        valor1 = Double.parseDouble(param.substring(0, posicao));

        if (operador.equals("%")) {
            resultado = porcentagem(valor1);
        } else
            valor2 = Double.parseDouble(param.substring(posicao + 1, param.length()));

        switch (operador) {
            case "+":
                resultado = soma(valor1, valor2);
                break;

            case "-":
                resultado = subtracao(valor1, valor2);
                break;

            case "x":
                resultado = multiplicacao(valor1, valor2);
                break;

            case "/":
                resultado = divisao(valor1, valor2);
                break;
        }

        return resultado;
    }
}

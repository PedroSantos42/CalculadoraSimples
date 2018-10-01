package com.example.dweller.calculadorasimples;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by dweller on 9/30/18.
 */

public class TesteCalculadora {

    InterfaceCalculadora calc = new Calculadora();

    @Test
    public void testeSoma() {
        Assert.assertEquals(4.0, calc.tratarExpressao("2+2"));
    }

    @Test
    public void testeSubtracao() {
        Assert.assertEquals(3.0, calc.tratarExpressao("6-3"));
    }

    @Test
    public void testeMultiplicacao() {
        Assert.assertEquals(9.0, calc.tratarExpressao("3x3"));
    }

    @Test
    public void testeDivisao() {
        Assert.assertEquals(2.5, calc.tratarExpressao("5/2"));
    }

    @Test
    public void testePorcentagem() {
        Assert.assertEquals(0.1, calc.tratarExpressao("10%"));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Murilo
 */
public class CalculadoraTesteTest {

    CalculadoraDIv calc3 = new CalculadoraDIv(); // Instaciando a Classe CalculadoraDIv
    CalculadoraMulti calc4 = new CalculadoraMulti();// instanciando a Classe CalcularodaMulti
    CalculadoraSub calc2 = new CalculadoraSub();// Instanciando a Classe CalculadoraSub
    CalculadoraSoma calc = new CalculadoraSoma();// Instanciando a Classe CalculadoraSoma

    //Cenário de teste 1: Soma de dois valores positivos

    /**
     *
     */
    @Test
    public void SomarDoisNumerosPositivos() {

        int soma = calc.somar(3, 7);
        assertEquals(10, soma);

    }

    /**
     *
     */
    @Test
    //Cenário de teste 2: Soma de dois valores sendo um zero
    public void SomarNumeroPositivoEUmZero() {
        int soma = calc.somar(3, 0);
        assertEquals(3, soma);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 3: Soma de dois valores sendo que ambos são zero
    public void SomarDoisZeros() {
        int soma = calc.somar(0, 0);
        assertEquals(0, soma);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 4: Soma de dois valores sendo um negativo
    public void SomaNumeroPositivoENumeroNegativo() {
        int soma = calc.somar(3, -1);
        assertEquals(2, soma);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 5: Soma de dois números grandes
    public void SomaDeDoisNumerosGrandes() {
        int soma = calc.somar(1000000, 1000000);
        assertEquals(2000000, soma);

    }

    /**
     *
     */
    @Test
    // Cenário de teste 6: Soma de dois números negativos
    public void SomaDeDoisNumerosNegativos() {
        int soma = calc.somar(-5, -3);
        assertEquals(-8, soma);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 7: Subtração de dois valores
    public void SubtracaoDeDoisValores() {
        int subtrair = calc2.subtrair(3, 1);
        assertEquals(2, subtrair);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 8: Subtração de dois números grandes
    public void SubtracaoDeDoisNumerosGrandes() {
        int subtrair = calc2.subtrair(1000000, 999999);
        assertEquals(1, subtrair);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 9: Subtração de dois números negativos
    public void SubtracaoDeDOisNumerosNegativos() {
        int subtrair = calc2.subtrair(-5, -3);
        assertEquals(-8, subtrair);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 10: Subtração de dois valores sendo um zero
    public void SubtracaoDeDoisValoresSendoUmZero() {
        int subtrair = calc2.subtrair(5, 0);
        assertEquals(5, subtrair);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 11: Subtração de dois valores que ambos são zero
    public void SubtracaoDeDoisValoresQueSaoZero() {
        int subtrair = calc2.subtrair(0, 0);
        assertEquals(0, subtrair);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 12: Subtração de dois valores sendo um negativo
    public void SubtracaoDeDoisValoresSendoUmNegativo() {
        int subtrair = calc2.subtrair(3, -2);
        assertEquals(5, subtrair);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 13: divisao de dois valores
    public void DivisaoDeDoisValores() {
        int divisao = calc3.divisao(3, 1);
        assertEquals(3, divisao);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 14: Divisão de um número grande por um número pequeno
    public void DivisaoDeUmNumeroGrandePorUmNumeroPequeno() {
        int divisao = calc3.divisao(100000, 2);
        assertEquals(50000, divisao);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 15: divisao de dois valores sendo um zero
    public void DivisaoDeUmNumeroDeDoisValoresSendoUmZero() {
        int divisao = calc3.divisao(0, 3);
        assertEquals(0, divisao);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 16: divisao de um valor por ele mesmo
    public void DivisaoDeUmValoraPorEleMesmo() {
        int divisao = calc3.divisao(10, 10);
        assertEquals(1, divisao);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 17: divisao de dois valores sendo negativos
    public void DivisaoDeDoisValoresSendoNegativos() {
        int divisao = calc3.divisao(-8, -2);
        assertEquals(4, divisao);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 18: divisao por um número grande
    public void DivisaoPorUmNumeroGrande() {
        int divisao = calc3.divisao(1000000, 10);
        assertEquals(100000, divisao);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 19: multiplicação de dois valores
    public void MultiplicacaoDeDoisValores() {
        int multi = calc4.multi(3, 1);
        assertEquals(3, multi);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 20: multiplicação de dois valores sendo um zero
    public void MultiplicacaoDeDoisValoresSendoUmZero() {
        int multi = calc4.multi(3, 0);
        assertEquals(0, multi);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 21: multiplicação de dois valores sendo um negativo
    public void MultiplicacaoDeDoisValoresSendoUmNegativo() {
        int multi = calc4.multi(-8, 2);
        assertEquals(-16, multi);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 22: multiplicação de um valor por zero
    public void MultiplicacaoDeUmValorPorZero() {
        int multi = calc4.multi(10, 0);
        assertEquals(0, multi);
    }

    /**
     *
     */
    @Test
    //Cenário de teste 23: multiplicação de um valor por um número grande
    public void MultiplicacaoDeUmValorPorUmNumeroGrande() {
        int multi = calc4.multi(1000000, 2);
        assertEquals(2000000, multi);
    }

    /**
     *
     */
    @Test
    // Cenário de teste 24: Multiplicação de um número positivo por um número negativo
    public void MultiplicacaoDeUmNumeroPositivoPorUmNegativo() {
        int multi = calc4.multi(5, -3);
        assertEquals(-15, multi);
    }

}

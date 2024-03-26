/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author Murilo
 */
public class CalculadoraTeste {

    public static void main(String[] args) {

        //Classe Soma
        CalculadoraSoma calc = new CalculadoraSoma();
        //Classe Subtração
        CalculadoraSub calc2 = new CalculadoraSub();
        //Classe Divisão
        CalculadoraDIv calc3 = new CalculadoraDIv();
        //Classe Multiplicação
        CalculadoraMulti calc4 = new CalculadoraMulti();

        //Cenário de teste 1: Soma de dois valores
        int soma = calc.somar(3, 7);
        System.out.println(soma);

        //Cenário de teste 2: Soma de dois valores sendo um zero
        soma = calc.somar(3, 0);
        System.out.println(soma);

        //Cenário de teste 3: Soma de dois valores sendo que ambos são zero
        soma = calc.somar(0, 0);
        System.out.println(soma);

        //Cenário de teste 4: Soma de dois valores sendo um negativo
        soma = calc.somar(3, -1);
        System.out.println(soma);

        // Cenário de teste 5: Soma de dois números grandes
        soma = calc.somar(1000000, 1000000);
        System.out.println(soma);

        // Cenário de teste 6: Soma de dois números negativos
        soma = calc.somar(-5, -3);
        System.out.println(soma);

        //Cenário de teste 7: Subtração de dois valores
        int subtrair = calc2.subtrair(3, 1);
        System.out.println(subtrair);

        // Cenário de teste 8: Subtração de dois números grandes
        subtrair = calc2.subtrair(1000000, 999999);
        System.out.println(subtrair);

        // Cenário de teste 9: Subtração de dois números negativos
        subtrair = calc2.subtrair(-5, -3);
        System.out.println(subtrair);

        //Cenário de teste 10: Subtração de dois valores sendo um zero
        subtrair = calc2.subtrair(5, 0);
        System.out.println(subtrair);

        //Cenário de teste 11: Subtração de dois valores que ambos são zero
        subtrair = calc2.subtrair(0, 0);
        System.out.println(subtrair);

        //Cenário de teste 12: Subtração de dois valores sendo um negativo
        subtrair = calc2.subtrair(3, -2);
        System.out.println(subtrair);

        //Cenário de teste 13: divisao de dois valores
        int divisao = calc3.divisao(3, 1);
        System.out.println(divisao);

        // Cenário de teste 14: Divisão de um número grande por um número pequeno
        divisao = calc3.divisao(100000, 2);
        System.out.println(divisao);

        //Cenário de teste 15: divisao de dois valores sendo um zero
        divisao = calc3.divisao(0, 3);
        System.out.println(divisao);

        // Cenário de teste 16: divisao de um valor por ele mesmo
        divisao = calc3.divisao(10, 10);
        System.out.println(divisao);

        //Cenário de teste 17: divisao de dois valores sendo negativos
        divisao = calc3.divisao(-8, -2);
        System.out.println(divisao);

        // Cenário de teste 18: divisao por um número grande
        divisao = calc3.divisao(1000000, 10);
        System.out.println(divisao);

        //Cenário de teste 19: multiplicação de dois valores
        int multi = calc4.multi(3, 1);
        System.out.println(multi);

        //Cenário de teste 20: multiplicação de dois valores sendo um zero
        multi = calc4.multi(3, 0);
        System.out.println(multi);

        //Cenário de teste 21: multiplicação de dois valores sendo um negativo
        multi = calc4.multi(-8, 2);
        System.out.println(multi);

        // Cenário de teste 22: multiplicação de um valor por zero
        multi = calc4.multi(10, 0);
        System.out.println(multi);

        // Cenário de teste 23: multiplicação de um valor por um número grande
        multi = calc4.multi(1000000, 2);
        System.out.println(multi);

        // Cenário de teste 24: Multiplicação de um número positivo por um número negativo
        multi = calc4.multi(5, -3);
        System.out.println(multi);

    }
}

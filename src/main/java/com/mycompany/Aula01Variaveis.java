package com.my.company;

public class Aula01Variaveis {

    public static void main(String[] args) {
        // Variavel lógica 

        //Tipo primitivo

        boolean ValorLogicoPrimitivo = true;
        //exibe o valor
        System.out.println(valorLogicoPrimitivo);

        //Tipo abstrato
        Boolean valorLogicoAbstrato = false;
        // Exibe o texto
        System.out.println("O valor da variavel valorLogicoAbstrato é: " + valorLogicoPrimitivo);
        
        // Variáveis inteiras 

        // Tipo primitivo
        int valorInteiro = 10; //32bits
        long valorInteiroLongo = 10L; // 64bits

        // Tipo abstrato 
        Integer valorInteiroAbs = 20;
        Long valorLongo = 20L; 

        System.out,println("O valor de valorInteiro é: " + valorInteiro + ", e o valor de 
        valorInteiroLongo é : " + valorInteiro);

        // Variáveis Decimais 

        // Tipo Primitivo
        float numeroFloat = 10.5f; // 32 =bits
        double numeroDoibleAbs = 10.5; //64bits

        //Tipo abstrato
        Float numeroFloat = 10.5f; 
        Double numeroDoibleAbs = 10.5;

        Sytem.out.println("O valor de numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: "
        + numeroDouble);

    }
}
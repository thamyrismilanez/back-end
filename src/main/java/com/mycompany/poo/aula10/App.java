package com.mycompany.poo.aula10;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "thamyris";
        pessoa.idade = 16
        //pessoa.salario = 1.000; atrubutos privados não são visíveis 

        // Instaciado classes que estão declaradas em outros arquivos
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "João";
        pessoa1.idade = 28;
        pessoa1.altura = 1.78;

        pessoa2.nome = "Maria";
        pessoa2.idade = 38;
        pessoa2.altura = 1.65;

        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura (m): " + pessoal.altura);

        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Altura (m): " + pessoa2.altura);

    }
}
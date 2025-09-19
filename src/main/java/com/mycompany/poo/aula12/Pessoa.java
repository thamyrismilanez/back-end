package com.mycompany.poo.aula12;

import java.util.List;

public class Pessoa {
    /**
     * Construtores
     * 
     * Utilizamos o método construtor para inicializar nossa classe,
     * funcionando com uma configuração prévia da mesma.
     * 
     * Toda classe quando é criado, possui um método construtor vazio
     * que é chamado no momento que instanciamos a mesma.
     * 
     * Uma mesma classe pode conter mais de um construtor,
     * porém cada construtor deve possuir quantidade
     * e tipos de parametros diferentes.
     */
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor padrão
    // Todo método construtor possui o mesmo nome da classe
    public Pessoa() {
        System.out.println("Chamando o construtor padrão");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Chamando o construtor 2");
    }

    public Pessoa(double altura) {
        this.altura = altura;
        System.out.println("Chamando o construtor 3");
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Chamando o construtor 4");

    }

    // Não pode ter a mesma quantidade de parametros e tipos
    //public Pessoa(double peso) {
    //    this.peso = peso;
    //}

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
        System.out.println("chamando construtor 5");
    }

    /**
     * Sobrecarga é quando possuímos vários métodos com o mesmo nome,
     * porém com diferenças quanto a quantidade, tipos de parâmetros
     * e retorno
     * 
     * O método construtor é um exemplo de sobrecarga, quando definidas
     * mais de uma implantação.
     */
    public void conversar() {
        System.out.println(this.nome + "esta conversando sozinho");
    }

    public void conversar(String frase) {
        System.out.println(this.nome + "está falando" + frase +"' !!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
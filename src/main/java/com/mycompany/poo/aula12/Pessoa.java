package com.mycompany.poo.aula12;

public class Pessoa {
    private String nome;
    private int idade;
    private double alura;
    private double peso;

    public Pessoa {
        System.out.println("chamando o construtor padrão");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.print
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAlura() {
        return alura;
    }
    public void setAlura(double alura) {
        this.alura = alura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    }
}

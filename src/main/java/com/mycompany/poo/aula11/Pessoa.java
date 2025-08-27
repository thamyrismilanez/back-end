package com.mycompany.poo.aula11;

public class Pessoa {

    /**
     * Encapsulamento ( Métodos Acessores/Modificadoras)
     * 
     * Em projetos em grande escala, paramantermos a segurança de nossas classes,
     * Utilizamos o modificador de acesso privado, com uma maior frequência.
     * 
     * Em muitas situações precisamos buscar e alterar uma ou mais informações,
       e é nesse cenário que utilizamos os metodos:
     * - Getter: Acessar/Buscar
     * - Setter: Modificar/Alteral
     */
       private String nome;
       private int idade;
       private double salario;
       private double altura;
     
       // Declaramos sempre após a declaração dos atributos

       // Método acessor, sempre começa com get
       public String getNome() {
            return nome;
       }

       // Método modificador, sempre começa com set
       public void setNome (String nome){
            this.nome = nome;
       }

       public int getIdade() {
            return idade
       }

       public void setIdade(int idade) {
        this.idade = idade;
       }

       public double getSalario() {
            return salario
       }

       public void setSalario() {
            this.salario = salario;

       }
       
       public double altura() {
            return altura
       }

       public void setAltura () {
            this.altura = altura;
       }

}
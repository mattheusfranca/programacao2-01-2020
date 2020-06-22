package br.udesc.prog2.exemplo.classeaninhada;

public class Funcionario {
    public String nome;
    public String CPF;
    public String cargo;

    public Funcionario(String nome, String CPF, String cargo) {
        this.nome = nome;
        this.CPF = CPF;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCargo() {
        return cargo;
    }
    
}

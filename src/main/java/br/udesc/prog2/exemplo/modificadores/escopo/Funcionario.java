/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.modificadores.escopo;

/**
 *
 * @author matth
 */
public class Funcionario {
    /*
    Poderá ser acessada por todas as instâncias de objetos desta classe como 
    uma variável comum, ou seja, a variável criada será a mesma em todas as 
    instâncias e quando seu conteúdo é modificado numa das instâncias, 
    a modificação ocorre em todas as demais. E nas declarações de métodos 
    ajudam no acesso direto à classe, portanto não é necessário instanciar 
    um objeto para acessar o método.
    
    */
    public static int geradorCodigo = 0; 
    private int codigo;
    private String nome;
    
    public Funcionario(String nome){
        codigo = ++geradorCodigo;
        this.nome = nome;
    }
    
    public static Funcionario copiarFuncionario(Funcionario f){
        return new Funcionario(f.getNome());
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}

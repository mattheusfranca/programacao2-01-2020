/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.modificadores.visibilidade.outropacote;

import br.udesc.prog2.exemplo.modificadores.visibilidade.Funcionario;

/**
 *
 * @author matth
 */
public class App {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(1, "Marina", "12345", "DevOps");
        
        System.out.println("Codigo: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.nome);
        //Necessidade de implementar o getCPF por conta da classe Funcionario estar em outro pacote
        System.out.println("CPF: " + funcionario.getCPF());
        //Necessidade de implementar o getCargo por conta da classe Funcionario estar em outro pacote
        System.out.println("Nome: " + funcionario.getCargo());

        FuncionarioEspecial funcionarioEspecial = new FuncionarioEspecial(1, "Lara", "12345", "DevOps");
        System.out.println("\nFucnionário Especial: "  + funcionarioEspecial);
    }
}
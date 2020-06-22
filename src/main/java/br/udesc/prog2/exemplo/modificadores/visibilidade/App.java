/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.modificadores.visibilidade;

/**
 *
 * @author matth
 */
public class App {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(1, "Marina", "12345", "DevOps");
        
        System.out.println("Codigo: " + funcionario.getCodigo());
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("CPF: " + funcionario.CPF);
        System.out.println("Nome: " + funcionario.cargo);
    }
}

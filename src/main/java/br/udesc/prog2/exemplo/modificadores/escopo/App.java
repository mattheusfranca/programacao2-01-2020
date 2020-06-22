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
public class App {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Malu");
        
        System.out.println("Código: " + funcionario1.getCodigo());
        System.out.println("Nome: " + funcionario1.getNome());
        
        Funcionario funcionario2 = new Funcionario("Lara");
        
        System.out.println("Código: " + funcionario2.getCodigo());
        System.out.println("Nome: " + funcionario2.getNome());
        
        Funcionario funcionario3 = new Funcionario("Marina");
        
        System.out.println("Código: " + funcionario3.getCodigo());
        System.out.println("Nome: " + funcionario3.getNome());
        
        funcionario3.geradorCodigo = 200;
        
        Funcionario funcionario4 = new Funcionario("Marília");
        
        System.out.println("Código: " + funcionario4.getCodigo());
        System.out.println("Nome: " + funcionario4.getNome());
        
        
        /*Cria outro funcionario com o nome do funcionario4, mas com o código diferente
            Utilizamos um método que está no escopo da classe
        */
        Funcionario funcionario5 = Funcionario.copiarFuncionario(funcionario4);
        
        System.out.println("Código: " + funcionario5.getCodigo());
        System.out.println("Nome: " + funcionario5.getNome());
        
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.collections.lista.mapa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author matth
 */
public class App {
    public static void main(String[] args){
        
        Map<String, Funcionario> funcionarios = new HashMap<>();
        
        Funcionario funcionario1 = new Funcionario("Mattheus", "123", "Engenheiro de Software");
        Funcionario funcionario2 = new Funcionario("Marília", "456", "Engenheira de Requisitos");
        
        funcionarios.put(funcionario1.getCPF(), funcionario1);
        funcionarios.put(funcionario2.getCPF(), funcionario2);
        
        System.out.println(funcionarios.get("123"));
        
        System.out.println();
        
        System.out.println(funcionarios.get("456"));
        
        System.out.println();
        
        for(String CPF : funcionarios.keySet()){
            System.out.println(funcionarios.get(CPF));
        }
        
    }
}

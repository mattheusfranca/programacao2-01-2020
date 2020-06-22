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
public class FuncionarioEspecial extends Funcionario {
    
    public FuncionarioEspecial(int codigo, String nome, String CPF, String cargo) {
        super(codigo, nome, CPF, cargo);
    }
    
    @Override
    public String toString(){
        /*Podemos utilizar o CPF por ser declardo como protected e a classe
        FuncionarioEspecial herdar de Funcionario.
        Não é possivel utilizar o cargo diretamente pois foi declarado com
        o modificador default (só é acessível no mesmo pacote).
        */
        return nome + ", " + CPF + ", " + getCargo(); 
    }
}

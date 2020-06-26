/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.collections.ordenacao.comparable;

import br.udesc.prog2.exercicio.banco.Banco;
import br.udesc.prog2.exercicio.banco.ContaCorrente;
import br.udesc.prog2.exercicio.banco.ContaPoupanca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author matth
 */
public class App {
    public static void main(String[] args) {

		Banco bradesco = new Banco("Bradesco");
		ContaCorrente contaCorrente1 = bradesco.criarContaCorrente("Cliente1");
                ContaCorrente contaCorrente2 = bradesco.criarContaCorrente("Cliente2");
                
                System.out.println(contaCorrente1.compareTo(contaCorrente2));
                
                contaCorrente1.deposito(100f);
                System.out.println(contaCorrente1.compareTo(contaCorrente2));               
                
                List<ContaCorrente> contas = bradesco.getContas();
                
                bradesco.imprimeContas();
                
                //O método sort utiliza o método compareTo (interface comparable) para realizar a ordenação
                Collections.sort(contas);
                
                bradesco.imprimeContas();                
    }
}

package br.udesc.prog2.exemplo.collections.ordenacao.comparator;

//https://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
//https://www.caelum.com.br/apostila-java-orientacao-objetos/collections-framework/#ordenao-collectionssort

import java.util.Collections;
import java.util.Comparator;

import br.udesc.prog2.exercicio.banco.Banco;
import br.udesc.prog2.exercicio.banco.ContaCorrente;
import br.udesc.prog2.exercicio.banco.ContaPoupanca;

public class Ordenacao {
	
	public static void main(String[] args) {

		Banco bradesco = new Banco("Bradesco");
		ContaCorrente contaCorrenteBradesco = bradesco.criarContaCorrente("Cliente");
		ContaPoupanca contaPopupancaBradesco = bradesco.criarContaPoupanca("Cliente");
		bradesco.criarContaCorrente("Cliente 1 ");
		bradesco.criarContaCorrente("Cliente 2");
		bradesco.criarContaCorrente("Cliente 3");
		bradesco.criarContaPoupanca("Cliente 4");

		contaCorrenteBradesco.saque(100f);
		contaPopupancaBradesco.deposito(100f);
		
		//Utiliza-se comparator para termos uma alternativa à ordenação da classe que utiliza o Comparable
		Collections.sort(bradesco.getContas(), new Comparator<ContaCorrente>() {
			@Override
			public int compare(ContaCorrente o1, ContaCorrente o2) {
					if (o1 instanceof ContaPoupanca)
						return -1;
					else
						return 1;
			}
		});
		
		bradesco.imprimeContas();
		
		
		//Utiliza-se comparator para termos ordenação em função do saldo descrescente 
		Collections.sort(bradesco.getContas(), new Comparator<ContaCorrente>() {
			@Override
			public int compare(ContaCorrente o1, ContaCorrente o2) {
					if (o2.compareTo(o1) == 1)
						return 1;
					else
						return -1;
			}
		});
		
		bradesco.imprimeContas();
		
		
	}

}

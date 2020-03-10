package br.udesc.prog2.exercicio.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static int geradorCodigo = 0;
	private int codigoAtualConta = 0;
	
	private int codigo;
	private String nome;
	private List<ContaCorrente> contas;
	
	public Banco(String nome) {
		this.codigo = ++ geradorCodigo;
		this.nome = nome;
		this.contas = new ArrayList<ContaCorrente>();
	}
	
	public ContaCorrente criarContaCorrente(String nomeCorrentista) {
		ContaCorrente conta = new ContaCorrente(++codigoAtualConta, this, nomeCorrentista);
		contas.add(conta);
		return conta;
	}

	public ContaPoupanca criarContaPoupanca(String nomeCorrentista) {
		ContaPoupanca conta = new ContaPoupanca(++codigoAtualConta, this, nomeCorrentista);
		contas.add(conta);
		return conta;
	}
	
	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public List<ContaCorrente> getContas() {
		return this.contas;
	}
	
	public ContaCorrente getContaCodigo(int codigo) {
		for(ContaCorrente conta : contas) {
			if(conta.getCodigo() == codigo)
				return conta;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return this.codigo + " - " + this.nome;
	}
	
	public void imprimeContas() {
		System.out.println("\nApresentando contas :\n");
		for(ContaCorrente conta : getContas()) {
			System.out.println(conta);
		}
	}
	
}

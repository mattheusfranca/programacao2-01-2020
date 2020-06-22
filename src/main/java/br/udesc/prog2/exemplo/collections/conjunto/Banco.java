package br.udesc.prog2.exemplo.collections.conjunto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.contas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.contas, other.contas)) {
            return false;
        }
        return true;
    }

	


	
	
}

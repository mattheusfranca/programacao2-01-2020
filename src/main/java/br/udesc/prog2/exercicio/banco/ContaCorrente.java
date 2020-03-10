package br.udesc.prog2.exercicio.banco;

public class ContaCorrente implements Comparable<ContaCorrente>{
	
	private int codigo;
	private String nomeCorrentista;
	private Banco banco;
	protected float saldo;
	
	public ContaCorrente(int codigo, Banco banco, String nomeCorrentista) {
		this.codigo = codigo;
		this.banco = banco;
		this.nomeCorrentista = nomeCorrentista;
		saldo = 0.0f;
	}
	
	public void deposito(float valor) {
		saldo += valor;
	}
	
	public boolean saque(float valor) {
		saldo -= valor;
		return true;
	}
	
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public Banco getBanco() {
		return banco;
	}
	
	public float getSaldo() {
		return saldo;
	}


	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
		.append("Código: " + codigo)
		.append(" Nome: " + nomeCorrentista)
		.append(" Banco: " + banco.getNome())
		.append(" Saldo: " + saldo).toString();
	}
	
	public String getDetalhesConta() {
		return this.toString();
	}

	@Override
	public int compareTo(ContaCorrente o) {
		if(saldo > o.getSaldo())
			return 1;
		else 
			return -1;
	}

}

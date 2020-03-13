package br.udesc.prog2.exemplo.collections.conjunto;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((nomeCorrentista == null) ? 0 : nomeCorrentista.hashCode());
		result = prime * result + Float.floatToIntBits(saldo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (codigo != other.codigo)
			return false;
		if (nomeCorrentista == null) {
			if (other.nomeCorrentista != null)
				return false;
		} else if (!nomeCorrentista.equals(other.nomeCorrentista))
			return false;
		if (Float.floatToIntBits(saldo) != Float.floatToIntBits(other.saldo))
			return false;
		return true;
	}
	
	

}

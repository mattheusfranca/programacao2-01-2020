package br.udesc.prog2.exercicio.banco;

public class ContaPoupanca extends ContaCorrente {

	public ContaPoupanca(int codigo, Banco banco, String nomeCorrentista) {
		super(codigo, banco, nomeCorrentista);
	}
	
	@Override
	public boolean saque(float valor) {
		if(saldo - valor < 0) {
			System.out.println("Não é possível realizar a retirada");
			return false;
		}
		return super.saque(valor);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tipo: Poupança";
	}
}

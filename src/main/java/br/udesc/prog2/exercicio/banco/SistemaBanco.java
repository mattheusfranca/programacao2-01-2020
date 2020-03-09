package br.udesc.prog2.exercicio.banco;

public class SistemaBanco {

	public static void main(String[] args) {
		
		Banco bb = new Banco("Banco do Brasil");
		
		ContaCorrente contaCorrenteBB = bb.criarContaCorrente("Marília Guterres");
		ContaPoupanca contaPoupancaBradesco = bb.criarContaPoupanca("Marília Guterres");
		
		contaCorrenteBB.deposito(30000f);
		contaCorrenteBB.saque(31000f);
		System.out.println(contaCorrenteBB);
		
		contaPoupancaBradesco.deposito(30000f);
		contaPoupancaBradesco.saque(31000f);
		System.out.println(contaPoupancaBradesco);
		
		Banco bradesco = new Banco("Bradesco");
		ContaCorrente contaCorrenteBradesco = bradesco.criarContaCorrente("Mattheus da Hora");
		ContaPoupanca contaPopupancaBradesco = bradesco.criarContaPoupanca("Mattheus da Hora");
		
		contaCorrenteBradesco.saque(100f);
		contaPopupancaBradesco.saque(100f);
		
		for(ContaCorrente conta : bradesco.getContas()) {
			System.out.println(conta);
		}
		
		
	}
}

package br.udesc.aula4.exerciciobanco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.udesc.aula4.exerciciobanco.Banco;
import br.udesc.aula4.exerciciobanco.ContaCorrente;

public class ContaCorrenteTeste {

	private ContaCorrente contaCorrente;
	
	@Before
	public void inicializacao() {
		String nomeCorrentista = "Marília Guterres";
		int numeroConta = 123;
		Banco banco = new Banco("Banco Teste");
		contaCorrente = new ContaCorrente(numeroConta, banco, nomeCorrentista); 
	}

	@Test
	public void deveCriarNovaContaCorrente() {
		String nomeCorrentista = "Marília Guterres";
		int numeroConta = 123;
		String nomeBanco = "Banco Teste";
		assertTrue("Conta não deve ser nula", contaCorrente != null);
		assertEquals("Número da conta", numeroConta, contaCorrente.getCodigo());
		assertEquals("Nome do correntista", nomeCorrentista, contaCorrente.getNomeCorrentista());
		assertEquals("Banco do correntista", nomeBanco, contaCorrente.getBanco().getNome());
	}
	
	@Test
	public void deveDepositarValorContaCorrente() {
		float valor1 = 100f;
		float valor2 = 100f;
		float saldoEsperado = 200f;
		contaCorrente.deposito(valor1);
		contaCorrente.deposito(valor2);
		assertEquals("Saldo da conta corrente", saldoEsperado, contaCorrente.getSaldo(), 0);
	}
	
	@Test
	public void deveSacarValorContaCorrente() {
		float valorDeposito = 100f;
		float valorSaque = 75f;
		float saldoEsperado = 25f;
		contaCorrente.deposito(valorDeposito);
		contaCorrente.saque(valorSaque);
		assertEquals("Saldo da conta corrente", saldoEsperado, contaCorrente.getSaldo(), 0);
	}
	
	@Test
	public void devePermitirSaqueMaiorSaldoContaCorrente() {
		float valorSaque = 75f;
		float saldoEsperado = -75f;
		boolean operacaoRealizadaSucesso = contaCorrente.saque(valorSaque);
		assertEquals("Operação realizada com sucesso", true, operacaoRealizadaSucesso);
		assertEquals("Saldo da conta corrente", saldoEsperado, contaCorrente.getSaldo(), 0);
	}
	
	@Test
	public void deveRetornarDetalhesContaCorrente() {
		String nomeCorrentista = "Marília Guterres";
		int numeroConta = 123;
		String nomeBanco = "Banco Teste";
		float saldoEsperado = 0;
		
		String detalhesEsperado = new StringBuilder()
			.append("Código: " + numeroConta)
			.append(" Nome: " + nomeCorrentista)
			.append(" Banco: " + nomeBanco)
			.append(" Saldo: " + saldoEsperado).toString();
		assertEquals("Banco do correntista: ",detalhesEsperado, contaCorrente.getDetalhesConta());
	}
	
}

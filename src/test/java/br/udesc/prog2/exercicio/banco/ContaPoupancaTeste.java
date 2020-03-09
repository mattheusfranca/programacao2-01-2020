package br.udesc.prog2.exercicio.banco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.udesc.prog2.exercicio.banco.Banco;
import br.udesc.prog2.exercicio.banco.ContaPoupanca;

public class ContaPoupancaTeste {
	private ContaPoupanca contaPoupanca;
	
	@Before
	public void inicializacao() {
		String nomeCorrentista = "Marília Guterres";
		int numeroConta = 456;
		Banco banco = new Banco("Banco Teste");
		contaPoupanca = new ContaPoupanca(numeroConta, banco, nomeCorrentista); 
	}

	@Test
	public void deveCriarContaPoupanca() {
		String nomeCorrentista = "Marília Guterres";
		int numeroConta = 456;
		String nomeBanco = "Banco Teste";
		assertTrue("Conta poupança não deve ser nula", contaPoupanca != null);
		assertEquals("Número da conta poupança", numeroConta, contaPoupanca.getCodigo());
		assertEquals("Nome do correntista", nomeCorrentista, contaPoupanca.getNomeCorrentista());
		assertEquals("Banco do correntista", nomeBanco, contaPoupanca.getBanco().getNome());
	}
	
	
	@Test
	public void deveSacarValorContaPoupancaQuandoSaldoPositivo() {
		float valorDeposito = 100f;
		float valorSaque = 75f;
		float saldoEsperado = 25f;
		contaPoupanca.deposito(valorDeposito);
		contaPoupanca.saque(valorSaque);
		assertEquals("Saldo da conta corrente", saldoEsperado, contaPoupanca.getSaldo(), 0);
	}
	
	@Test
	public void naoDevePermitirSaqueMaiorSaldoContaPoupanca() {
		float valorSaque = 75f;
		float saldoEsperado = 0f;
		boolean operacaoRealizadaSucesso = contaPoupanca.saque(valorSaque);
		assertEquals("Operação realizada com sucesso", false, operacaoRealizadaSucesso);
		assertEquals("Saldo da conta corrente", saldoEsperado, contaPoupanca.getSaldo(), 0);
	}
	
	@Test
	public void deveRetornarDetalhesContaPoupanca() {
		String nomeCorrentista = "Marília Guterres";
		int numeroConta = 456;
		String nomeBanco = "Banco Teste";
		float saldoEsperado = 0;
		
		String detalhesEsperado = new StringBuilder()
			.append("Código: " + numeroConta)
			.append(" Nome: " + nomeCorrentista)
			.append(" Banco: " + nomeBanco)
			.append(" Saldo: " + saldoEsperado)
			.append(" Tipo: Poupança").toString();
		assertEquals("Banco do correntista: ",detalhesEsperado, contaPoupanca.getDetalhesConta());
	}
	
}

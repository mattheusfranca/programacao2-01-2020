package br.udesc.aula4.exerciciobanco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.udesc.aula4.exerciciobanco.Banco;
import br.udesc.aula4.exerciciobanco.ContaCorrente;
import br.udesc.aula4.exerciciobanco.ContaPoupanca;

public class BancoTeste {

	@Test
	public void deveCriarNovoBanco() {
		Banco banco = new Banco("Banco Teste");
		int codigoEsperadoBanco = banco.getCodigo();
		
		assertTrue("Codigo Gerado Banco 1", codigoEsperadoBanco > 0);
		assertEquals("Nome Banco", "Banco Teste", banco.getNome());
		assertEquals("Quantidade de Contas", 0 , banco.getContas().size());
	}
	
	@Test
	public void deveGerarCodigoBancoIncrementalAutomaticamente() {
		Banco banco1 = new Banco("Banco Teste 1");
		Banco banco2 = new Banco("Banco Teste 2");
		Banco banco3 = new Banco("Banco Teste 3");
		
		int codigoEsperadoBanco1 = banco1.getCodigo();
		int codigoEsperadoBanco2 = codigoEsperadoBanco1 + 1;
		int codigoEsperadoBanco3 = codigoEsperadoBanco2 + 1;
		
		assertEquals("Codigo Gerado Banco 1", codigoEsperadoBanco1, banco1.getCodigo());
		assertEquals("Codigo Gerado Banco 2", codigoEsperadoBanco2, banco2.getCodigo());
		assertEquals("Codigo Gerado Banco 3", codigoEsperadoBanco3, banco3.getCodigo());		
	}
	
	@Test
	public void deveCriarContaCorrente() {
		
		Banco banco = new Banco("Banco Teste");
		String nomeCorrentista = "Marília Guterres";
		ContaCorrente contaCorrente = banco.criarContaCorrente(nomeCorrentista);
		int numeroContaEsperado = 1;
		
		assertTrue("Conta não deve ser nula", contaCorrente != null);
		assertEquals("Número da conta", numeroContaEsperado, contaCorrente.getCodigo());
		assertEquals("Nome do correntista", nomeCorrentista, contaCorrente.getNomeCorrentista());
		assertEquals("Banco do correntista", banco.getNome(), contaCorrente.getBanco().getNome());
	}
	
	@Test
	public void deveCriarContaPoupanca() {
		Banco banco = new Banco("Banco Teste");
		String nomeCorrentista = "Marília Guterres";
		ContaPoupanca contaPoupanca = banco.criarContaPoupanca(nomeCorrentista);
		int numeroContaEsperado = 1;
		
		assertTrue("Conta não deve ser nula", contaPoupanca != null);
		assertEquals("Número da conta poupanca", numeroContaEsperado, contaPoupanca.getCodigo());
		assertEquals("Nome do correntista", nomeCorrentista, contaPoupanca.getNomeCorrentista());
		assertEquals("Banco do correntista", banco.getNome(), contaPoupanca.getBanco().getNome());
	}
	
	@Test
	public void deveGerarCodigosContasIncrementalAutomaticamente() {
		Banco banco = new Banco("Banco Teste");
		String nomeCorrentista1 = "Marília";
		String nomeCorrentista2 = "Mattheus";
		String nomeCorrentista3 = "Geraldo";
		ContaCorrente contaCorrente1 = banco.criarContaCorrente(nomeCorrentista1);
		ContaCorrente contaCorrente2 = banco.criarContaCorrente(nomeCorrentista2);
		ContaPoupanca contaPoupanca3 = banco.criarContaPoupanca(nomeCorrentista3);
		
		assertEquals("Número da conta poupanca", 1, contaCorrente1.getCodigo());
		assertEquals("Número da conta poupanca", 2, contaCorrente2.getCodigo());
		assertEquals("Número da conta poupanca", 3, contaPoupanca3.getCodigo());
	}
	
	@Test
	public void devePermitirContasBancosDistintosComMesmoCodigo() {
		Banco banco1 = new Banco("Banco Teste 1");
		Banco banco2 = new Banco("Banco Teste 2");
		
		String nomeCorrentista1 = "Marília";
		String nomeCorrentista2 = "Mattheus";
		
		ContaCorrente contaCorrenteBanco1 = banco1.criarContaCorrente(nomeCorrentista1);
		ContaPoupanca contaPoupancaBanco1 = banco1.criarContaPoupanca(nomeCorrentista2);
		
		ContaCorrente contaCorrenteBanco2 = banco2.criarContaCorrente(nomeCorrentista1);
		ContaPoupanca contaPoupancaBanco2 = banco2.criarContaPoupanca(nomeCorrentista2);
		
		assertEquals("Número das contas são iguais para bancos distintos", contaCorrenteBanco1.getCodigo(), contaCorrenteBanco2.getCodigo());
		assertEquals("Número das contas são iguais para bancos distintos", contaPoupancaBanco1.getCodigo(), contaPoupancaBanco2.getCodigo());
		assertEquals("Conta Corrente Banco 1", 1, contaCorrenteBanco1.getCodigo());
		assertEquals("Conta Corrente Banco 2", 1, contaCorrenteBanco2.getCodigo());
		assertEquals("Conta Poupanca Banco 1", 2, contaPoupancaBanco1.getCodigo());
		assertEquals("Conta Poupanca Banco 2", 2, contaPoupancaBanco2.getCodigo());
	}
	
	@Test
	public void deveObterContaPorCodigo() {
		Banco banco = new Banco("Banco Teste");
		String nomeCorrentista1 = "Marília";
		String nomeCorrentista2 = "Mattheus";
		String nomeCorrentista3 = "Geraldo";
		banco.criarContaCorrente(nomeCorrentista1);
		banco.criarContaCorrente(nomeCorrentista2);
		banco.criarContaPoupanca(nomeCorrentista3);
		
		ContaCorrente conta1 = banco.getContaCodigo(1);
		ContaCorrente conta2 = banco.getContaCodigo(2);
		ContaCorrente conta3 = banco.getContaCodigo(3);
		
		assertEquals("Nome do correntista 1", nomeCorrentista1, conta1.getNomeCorrentista());
		assertEquals("Nome do correntista 2", nomeCorrentista2, conta2.getNomeCorrentista());
		assertEquals("Nome do correntista 3", nomeCorrentista3, conta3.getNomeCorrentista());	
	}
	
	@Test
	public void deveRetornarNuloSeNaoExistirCodigoConta() {
		Banco banco = new Banco("Banco Teste");
		ContaCorrente conta = banco.getContaCodigo(1);
		assertEquals("Conta deve ser nula", null, conta);
	}
}

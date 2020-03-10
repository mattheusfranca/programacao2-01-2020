package br.udesc.prog2.exercicio.banco.gui.tablemodel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.udesc.prog2.exercicio.banco.Banco;
import br.udesc.prog2.exercicio.banco.ContaCorrente;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaNovaConta extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textNomeCorrentista;
	private JComboBox<String> cbTipoConta;
	private JComboBox<Banco> cbBanco;
	
	public TelaNovaConta() {
		setTitle("Nova Conta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 237, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNomeCorrentista = new JTextField();
		textNomeCorrentista.setBounds(24, 137, 157, 20);
		contentPane.add(textNomeCorrentista);
		textNomeCorrentista.setColumns(10);
		
		cbBanco = new JComboBox<Banco>();
		for(Banco banco : TelaInicial.bancos) {
			cbBanco.addItem(banco);
		}
		cbBanco.setBounds(24, 41, 157, 20);
		contentPane.add(cbBanco);
		
		cbTipoConta = new JComboBox<String>();
		cbTipoConta.addItem("Conta Poupança");
		cbTipoConta.addItem("Conta Corrente");
		
		cbTipoConta.setBounds(24, 89, 157, 20);
		contentPane.add(cbTipoConta);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar.setBounds(24, 168, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblSelecioneOBanco = new JLabel("Selecione o Banco");
		lblSelecioneOBanco.setBounds(24, 28, 134, 14);
		contentPane.add(lblSelecioneOBanco);
		
		JLabel lblSelecioneOTipo = new JLabel("Selecione o tipo de conta");
		lblSelecioneOTipo.setBounds(24, 72, 179, 14);
		contentPane.add(lblSelecioneOTipo);
		
		JLabel lblNomeDoCorrentista = new JLabel("Nome do correntista");
		lblNomeDoCorrentista.setBounds(24, 120, 157, 14);
		contentPane.add(lblNomeDoCorrentista);
	}
	
	private ContaCorrente criarNovaConta(Banco banco, String nome, String tipoConta) {
		ContaCorrente conta;
		if(tipoConta.equals("Conta Corrente")) {
			conta = banco.criarContaCorrente(nome);
		}
		else {
			conta= banco.criarContaPoupanca(nome);
		}
		return conta;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		List<Banco> bancos = TelaInicial.bancos;
		String nomeCorrentista = textNomeCorrentista.getText();
		Banco banco = bancos.get(cbBanco.getSelectedIndex());
		String tipoConta = cbTipoConta.getSelectedItem().toString();
		ContaCorrente conta = criarNovaConta(banco, nomeCorrentista, tipoConta);
		JOptionPane.showMessageDialog(null, "Conta Adicionada: " + conta);
		this.dispose();
	}
}

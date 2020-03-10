package br.udesc.prog2.exercicio.banco.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import br.udesc.prog2.exercicio.banco.Banco;

public class TelaNovoBanco extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textNomeBanco;

		public TelaNovoBanco() {
		setTitle("Novo Banco");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 338, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNomeBanco = new JTextField();
		textNomeBanco.setBounds(58, 31, 198, 20);
		contentPane.add(textNomeBanco);
		textNomeBanco.setColumns(10);
		
		JLabel lblNomeDoBanco = new JLabel("Nome do Banco");
		lblNomeDoBanco.setBounds(58, 11, 146, 14);
		contentPane.add(lblNomeDoBanco);
		
		JButton btnSalvar = new JButton("Salvar");
		//Adicionando ação do botão - Utiliza o método actionPerformed da classe atual
		btnSalvar.addActionListener(this);
		
		btnSalvar.setBounds(58, 62, 89, 23);
		contentPane.add(btnSalvar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			String nomeBanco = textNomeBanco.getText();
			Banco novoBanco = new Banco(nomeBanco);
			TelaInicial.bancos.add(novoBanco);
			JOptionPane.showMessageDialog(null, "Banco adicionado com sucesso: " + novoBanco);
			this.dispose();
		}
	}
	
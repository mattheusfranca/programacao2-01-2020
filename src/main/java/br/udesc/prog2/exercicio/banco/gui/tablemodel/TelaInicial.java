package br.udesc.prog2.exercicio.banco.gui.tablemodel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.udesc.prog2.exercicio.banco.Banco;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	public static List<Banco> bancos = new ArrayList<Banco>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaInicial() {
		setTitle("Banco - Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 239, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNovoBanco = new JButton("Novo Banco");
		btnNovoBanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TelaNovoBanco().setVisible(true);
			}
		});
		
		btnNovoBanco.setBounds(40, 31, 141, 23);
		contentPane.add(btnNovoBanco);
		
		JButton btnNovaConta = new JButton("Nova Conta");
		btnNovaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaNovaConta().setVisible(true);
			}
		});
		btnNovaConta.setBounds(40, 65, 141, 23);
		contentPane.add(btnNovaConta);
		
		JButton btnListarContas = new JButton("Listar Contas");
		btnListarContas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaListarContasBanco().setVisible(true);
			}
		});
		btnListarContas.setBounds(40, 99, 141, 23);
		contentPane.add(btnListarContas);
	}

}

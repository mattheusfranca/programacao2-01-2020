package br.udesc.prog2.exemplo.aulainterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame implements ActionListener {


	private static final long serialVersionUID = -8626164914754186301L;
	private JPanel contentPane;

	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(146, 101, 89, 23);
		contentPane.add(btnEntrar);
		//Adicionando ação ao botão através de Funcional Programming
		btnEntrar.addActionListener(p -> System.out.println("Clique no botão Entrar"));
		
		
		JButton btn2 = new JButton("Botão 2");
		btn2.setBounds(146, 135, 89, 23);
		contentPane.add(btn2);
		//Adicionando ação ao botão através de classe anônima
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Clique no botão Botão 2");
				
			}
		});
		
		
		JButton btn3 = new JButton("Botão 3");
		btn3.setBounds(146, 169, 89, 23);
		contentPane.add(btn3);
		//Adicionando ação no botão através de implementação da interface ActionListener na classe atual
		btn3.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Clique no botão Botão 3");
	}

	
}

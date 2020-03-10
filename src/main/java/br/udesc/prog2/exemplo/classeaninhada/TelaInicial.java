package br.udesc.prog2.exemplo.classeaninhada;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class TelaInicial extends JFrame{
	
	private JButton btn1;
	private JPanel contentPane;
	
	//Classe aninhada privada
	//statict pode ser utlizada para classes aninhadas
	private static class AcaoBotao implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clique no botão");
		}		
	}
	
	public static void main(String[] args) {
		TelaInicial telaInicial = new TelaInicial();
		//Atribuindo acao criada para o botão
		AcaoBotao acao = new AcaoBotao();
		telaInicial.btn1.addActionListener(acao);
		telaInicial.setVisible(true);
	}

	//Incializando tela (desenhando componentes da tela)
	public TelaInicial() {
		setTitle("Tela Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 239, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btn1= new JButton("Novo Botão");
		btn1.setBounds(40, 31, 141, 23);
		contentPane.add(btn1);	
	}


}

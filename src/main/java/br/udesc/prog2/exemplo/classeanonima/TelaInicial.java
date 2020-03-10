package br.udesc.prog2.exemplo.classeanonima;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class TelaInicial extends JFrame{
	
	private JButton btn1;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		
		TelaInicial telaInicial = new TelaInicial();
		
		//Classe anonima sendo instanciada a partir da interface ActionListener e armazenada no objeto acao
		ActionListener acao = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clique no botão");
			}
		};
		
		//Atribuindo acao criada para o botão
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

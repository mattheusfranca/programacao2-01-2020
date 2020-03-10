package br.udesc.prog2.exercicio.banco.gui.tablemodel;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.udesc.prog2.exercicio.banco.Banco;
import br.udesc.prog2.exercicio.banco.ContaCorrente;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class TelaListarContasBanco extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JComboBox<Banco> cbBanco;
	
	public TelaListarContasBanco() {
		//Layout
		setTitle("Listar Contas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cbBanco = new JComboBox<Banco>(); //Uso de Generics
		cbBanco.setBounds(10, 17, 185, 20);
		contentPane.add(cbBanco);
		
		table = new JTable();
		scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane);
		scrollPane.setBounds(10, 48, 414, 202);

		//Lógica
		List<Banco> bancos = TelaInicial.bancos;
		popularComboBoxBanco(bancos);
		
		cbBanco.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					popularDataTable(bancos.get(cbBanco.getSelectedIndex()));
					System.out.println("item changed: " + bancos.get(cbBanco.getSelectedIndex()));
				}
			}
		});
		//populando primeiro banco se existir
		popularDataTable(bancos.get(0));
	}
	
	private void popularComboBoxBanco(List<Banco> bancos) {
		for(Banco banco : bancos) {
			cbBanco.addItem(banco);
		}
	}
	
	private void popularDataTable(Banco banco) {
		if(banco == null)
			return;
		ContaTableModel tableModel = new ContaTableModel(banco.getContas());
		table.setModel(tableModel);  
	}
	

}

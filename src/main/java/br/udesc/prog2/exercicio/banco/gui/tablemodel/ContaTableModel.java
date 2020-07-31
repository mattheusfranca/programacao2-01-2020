package br.udesc.prog2.exercicio.banco.gui.tablemodel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.udesc.prog2.exercicio.banco.ContaCorrente;

public class ContaTableModel extends AbstractTableModel  {

	private List<ContaCorrente> contas;
	private String[] nomeColunas = {"Código", "Banco", "Nome", "Saldo"};
	
        private final int COLUNA_CODIGO = 0;
        private final int COLUNA_BANCO = 1;      
        private final int COLUNA_NOME = 2;
        private final int COLUNA_SALDO = 3;
    
	public ContaTableModel(List<ContaCorrente> contas) {
		this.contas = contas;
	}
	
	//retorna o total de colunas da tabela
	@Override
	public int getColumnCount() {
		return nomeColunas.length;
	}

	//retorna o total de itens(que virarão linhas) da nossa lista
	@Override
	public int getRowCount() {
		return contas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ContaCorrente conta = this.contas.get(rowIndex);
		switch (columnIndex) {
        case COLUNA_CODIGO:
            return conta.getCodigo();
        case COLUNA_BANCO:
            return conta.getBanco().getNome();
        case COLUNA_NOME:
            return conta.getNomeCorrentista();
        case COLUNA_SALDO:
            return conta.getSaldo();
    }
		return null;
	}
	
	//Não é obrigatório implementar
	//retorna se a célula é editável ou não
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    //Não é obrigatório implementar
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //o argumento recebido pelo método é do tipo Object
        //mas como nossa tabela é de funcionários, é seguro(e até recomendável) fazer o cast de suas propriedades
    	ContaCorrente conta = this.contas.get(rowIndex);
        //de acordo com a coluna, ele preenche a célula com o valor
        //respectivo do objeto de mesmo indice na lista
        switch (columnIndex) {
            case COLUNA_CODIGO:
            	//Nada vai acontecer
                break;
            case COLUNA_BANCO:
            	//Nada vai acontecer
                break;
            case COLUNA_NOME:
            	conta.setNomeCorrentista((String) aValue);
                break;
            case COLUNA_SALDO:
            	//Nada vai acontecer
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
    }
}

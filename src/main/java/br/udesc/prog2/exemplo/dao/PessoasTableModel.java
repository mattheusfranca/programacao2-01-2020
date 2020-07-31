
package br.udesc.prog2.exemplo.dao;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class PessoasTableModel extends AbstractTableModel{
    
    private List<Pessoa> pessoas;
    
    private String[] nomeColunas = {"Nome", "CPF"};
	
    private final int COLUNA_NOME = 0;
    private final int COLUNA_CPF = 1;
    
    public PessoasTableModel(List<Pessoa> pessoas){
        this.pessoas = pessoas;
    }

    @Override
    public int getRowCount() {
        return pessoas.size();
        
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }
    
    @Override
    public String getColumnName(int index) {
        return nomeColunas[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pessoa pessoa = this.pessoas.get(rowIndex);
	switch (columnIndex) {
            case COLUNA_NOME:
                return pessoa.getNome();
            case COLUNA_CPF:
                return pessoa.getCpf();
            }
	return null;
    }
    
}


package br.udesc.prog2.exemplo.casting;

public class Funcionario extends Pessoa {
    
    private String cargo;
    
    public Funcionario(String nome, String CPF, String cargo) {
        super(nome, CPF);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFuncionario{" + "cargo=" + cargo + '}';
    }
    
    
}

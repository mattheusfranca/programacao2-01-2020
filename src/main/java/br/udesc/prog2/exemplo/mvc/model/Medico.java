package br.udesc.prog2.exemplo.mvc.model;


public class Medico extends Pessoa {
    private String especialidade;
    
    public Medico(String nome, String CPF, String especialidade) {
        super(nome, CPF);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + "Medico{" + "especialidade=" + especialidade + '}';
    }
    
    
    
}

package br.udesc.prog2.exemplo.mvc.model;

public class Paciente extends Pessoa {
    
    private String plano;
    private boolean possuiPlano;
    
    public Paciente(String nome, String CPF) {
        super(nome, CPF);
        plano = "Nenhum";
        possuiPlano = false;
    }
    
    public Paciente(String nome, String CPF, String plano) {
        super(nome, CPF);
        this.plano = plano;
        possuiPlano = true;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public boolean isPossuiPlano() {
        return possuiPlano;
    }

    public void setPossuiPlano(boolean possuiPlano) {
        this.possuiPlano = possuiPlano;
    }

    @Override
    public String toString() {
        return super.toString() + " Paciente{" + "plano=" + plano + ", possuiPlano=" + possuiPlano + '}';
    }
    
    
    
    
}

package br.udesc.prog2.exemplo.aulainterface;

public class Funcionario extends Pessoa {

	private String matricula;

	
	public Funcionario(String nome, String cPF, String matricula) {
		super(nome, cPF);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
		
}

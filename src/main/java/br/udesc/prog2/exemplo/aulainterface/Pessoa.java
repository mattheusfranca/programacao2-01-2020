package br.udesc.prog2.exemplo.aulainterface;

public abstract class Pessoa {
	
	private String nome;
	private String CPF;
	
	public Pessoa(String nome, String cPF) {
		this.nome = nome;
		CPF = cPF;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
}

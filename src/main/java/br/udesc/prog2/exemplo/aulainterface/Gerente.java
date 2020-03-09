package br.udesc.prog2.exemplo.aulainterface;

public class Gerente extends Funcionario implements Autenticavel{

	private String senha;
	
	public Gerente(String nome, String cPF, String matricula) {
		super(nome, cPF, matricula);
		senha = matricula + cPF;
	}

	public boolean autentica(String senha) {
		if(this.senha.equals(senha))
			return true;
		else 
			return false;
	}
}

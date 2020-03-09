package br.udesc.prog2.exemplo.aulainterface;

public class Cliente extends Pessoa implements Autenticavel {

	public Cliente(String nome, String cPF) {
		super(nome, cPF);
	}

	public boolean autentica(String senha) {
		if(senha.equals(getCPF())) 
			return true;
		else 
			return false;
	}

	
}

package br.udesc.prog2.exemplo.aulainterface;

import java.util.ArrayList;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
    	List<Pessoa> pessoas = new ArrayList<Pessoa>();
    	
    	pessoas.add(new Cliente("Cliente", "123"));
    	pessoas.add(new Funcionario("Funcionario", "123", "456"));
    	pessoas.add(new Engenheiro("Engenheiro", "789", "012"));
    	pessoas.add(new Gerente("Gerente", "345", "678"));
    	pessoas.add(new Diretor("Diretor", "901", "234"));
    	
    	for(Pessoa p : pessoas) {
    		System.out.println(p.getNome());
    	}
    	
    	Autenticavel a1 = new Cliente("Cliente2", "123");
    	Autenticavel a2 = new Gerente("Gerente2", "345", "678");
    	
    	System.out.println(a1.autentica("123"));
    	System.out.println(a2.autentica("345"));
        
        List<Autenticavel> autenticaveis = new ArrayList<>();
        autenticaveis.add(a1);
        autenticaveis.add(a2);
    	
    	
    }
}

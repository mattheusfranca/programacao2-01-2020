package br.udesc.prog2.exemplo.collections.lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import br.udesc.prog2.exercicio.banco.Banco;

public class Lista {
	
	public static void main(String[] args) {
		List<Banco> bancos = new ArrayList<>();
		
		bancos.add(new Banco("Banco do Brasil"));
		bancos.add(new Banco("Bradesco"));
		bancos.add(new Banco("Itaú"));
		
		//Forma não elgante de iterar em uma lista
		System.out.println("\nListagem utilizando for padrão");
		for(int i=0; i<bancos.size(); i++) {
			System.out.println(bancos.get(i));
		}

		
		//Iteração através do uso de Iterator, interface que define métodos para percorrer Collections 
		System.out.println("\nListagem utilizando Iterator");
		Iterator<Banco> it = bancos.iterator(); 
		while(it.hasNext()){ 
			System.out.println(it.next()); 
		}
		
		
		//Através de for para collections
		System.out.println("\nListagem utilizando for para collections");
		for(Banco b : bancos) {
			System.out.println(b);
		}
		
		
		//Iteração através do forEach (introduzido a partir do Java 8) e utilizando classe anônima 
		System.out.println("\nListagem utilizando forEach e classe anônima");
		bancos.forEach(new Consumer<Banco>(){
			@Override
			public void accept(Banco b) {
				System.out.println(b);
			} 
		});
				
		System.out.println("\nListagem utilizando forEach e functional programming");
		//Iteração através do forEach (introduzido a partir do Java 8) e utilizando functional programming 
		bancos.forEach(b -> System.out.println(b));
	}

}

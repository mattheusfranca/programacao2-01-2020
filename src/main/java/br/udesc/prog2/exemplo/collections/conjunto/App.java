package br.udesc.prog2.exemplo.collections.conjunto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/*
 * Para o Set funcionar corretamente precisamos garantir que o hashcode e o equals foram implementados de forma adequada
 */
public class App {
	public static void main(String[] args) {
		Set<Banco> bancos = new HashSet<Banco>();
		
		bancos.add(new Banco("Banco do Brasil"));
		bancos.add(new Banco("Bradesco"));
		bancos.add(new Banco("Itaú"));
		bancos.add(new Banco("Itaú"));
		
		/*For tradicional não vai funcionar por conta das posições não serem utilizadas no Set
		System.out.println("\nconjuntogem utilizando for padrão");
		for(int i=0; i<bancos.size(); i++) {
			System.out.println(bancos.get(i));
		}*/

		
		//Iteração através do uso de Iterator, interface que define métodos para percorrer Collections 
		System.out.println("\nconjuntogem utilizando Iterator");
		Iterator<Banco> it = bancos.iterator(); 
		while(it.hasNext()){ 
			System.out.println(it.next()); 
		}
		
		
		//Através de for para collections
		System.out.println("\nconjuntogem utilizando for para collections");
		for(Banco b : bancos) {
			System.out.println(b);
		}
		
		
		//Iteração através do forEach (introduzido a partir do Java 8) e utilizando classe anônima 
		System.out.println("\nconjuntogem utilizando forEach e classe anônima");
		bancos.forEach(new Consumer<Banco>(){
			@Override
			public void accept(Banco b) {
				System.out.println(b);
			} 
		});
				
		System.out.println("\nconjuntogem utilizando forEach e functional programming");
		//Iteração através do forEach (introduzido a partir do Java 8) e utilizando functional programming 
		bancos.forEach(b -> System.out.println(b));
		
		/*Não é possível ordenar um Set pois a posição não é garantida
		Collections.sort(bancos);
		*/
	}
}

package br.udesc.prog2.exemplo.heraca.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Animal cachorro = new Cachorro();
//        cachorro.fala();
     
        Animal gato = new Gato();
//        gato.fala();
        
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);
        
        for(Animal animal : animais){
            if(animal instanceof Cachorro){
                System.out.print("É um cachorro: ");
            }
            animal.fala();
        }
        
        
    }
    
}

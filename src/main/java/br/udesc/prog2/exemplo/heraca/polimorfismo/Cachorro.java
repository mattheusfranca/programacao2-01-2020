package br.udesc.prog2.exemplo.heraca.polimorfismo;

public class Cachorro extends Animal {

    /*
        Sobreescrita do método fala() declarado como abstrato na classe Animal 
    */
    @Override
    public void fala() {
        System.out.println("Au au au");
    }        
}

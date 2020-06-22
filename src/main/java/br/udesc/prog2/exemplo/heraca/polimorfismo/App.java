package br.udesc.prog2.exemplo.heraca.polimorfismo;

public class App {
    public static void main(String[] args){
        Animal cachorro = new Cachorro();
        cachorro.fala();
     
        Animal gato = new Gato();
        gato.fala();
    }
    
}

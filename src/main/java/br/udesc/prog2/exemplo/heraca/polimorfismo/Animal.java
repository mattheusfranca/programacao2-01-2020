package br.udesc.prog2.exemplo.heraca.polimorfismo;

/*
Classe abstrata não é instaciável e é utilizada como base para outras classes.
Classes abstratas podem ter métodos abstratos, que são métodos que não
possuem implementação, deixando a implementação destes métodos para as suas 
subclasses. 
*/
public abstract class Animal {
    public abstract void fala();
}

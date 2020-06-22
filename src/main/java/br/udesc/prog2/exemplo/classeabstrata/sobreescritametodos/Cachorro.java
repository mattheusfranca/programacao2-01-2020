/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.classeabstrata.sobreescritametodos;

import br.udesc.prog2.exemplo.classeabstrata.Animal;

/**
 *
 * @author matth
 */
public class Cachorro extends Animal {

    /*
        Sobreescrita do método fala() declarado como abstrato na classe Animal 
    */
    @Override
    public void fala() {
        System.out.println("Au au au");
    }        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.classeabstrata.sobreescritametodos;

/**
 *
 * @author matth
 */
public class App {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        cachorro.fala();
     
        Gato gato = new Gato();
        gato.fala();
    }
    
}

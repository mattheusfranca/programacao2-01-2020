/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.classeabstrata;

/**
 *
 * @author matth
 */

/*
Classe abstrata não é instaciável e é utilizada como base para outras classes.
Classes abstratas podem ter métodos abstratos, que são métodos que não
possuem implementação, deixando a implementação destes métodos para as suas 
subclasses. 
*/
public abstract class Animal {
    public abstract void fala();
}

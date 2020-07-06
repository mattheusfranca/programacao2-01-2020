package br.udesc.prog2.exemplo.excecao.checked.novaexcecao;

import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.soma(100);
        calc.subtrai(10);
        try {
            calc.divide(0);
        } catch (DivisaoPorZeroException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println(calc.getResultado());
        }
    }
}

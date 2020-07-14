
package br.udesc.prog2.exemplo.excecao.checked.novaexcecao;


public class App1 {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        
        try {
            calc.soma(1000);
            calc.subtrai(10);
            calc.divide(0);
        } catch (DivisaoPorZeroException | SomaException ex) {
            System.out.println(ex.getMessage());
        } 
        finally {
            System.out.println(calc.getResultado());
        }
    }
}


package br.udesc.prog2.exemplo.excecao.checked.novaexcecao;


public class SomaException extends Exception{
    public SomaException(){
        super("Soma não pode ser maior que 100");
    }
}

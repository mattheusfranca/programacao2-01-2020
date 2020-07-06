package br.udesc.prog2.exemplo.excecao.checked.novaexcecao;

public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(){
        super("Não é possivel realizar a divisao por zero");
    }
}

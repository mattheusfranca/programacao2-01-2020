package br.udesc.prog2.exemplo.excecao.unchecked.novaexcecao;

public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException(){
        super("Não é possivel realizar a divisao por zero");
    }
}

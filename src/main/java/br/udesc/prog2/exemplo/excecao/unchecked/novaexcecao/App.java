package br.udesc.prog2.exemplo.excecao.unchecked.novaexcecao;

public class App {
 
    public static void main(String[] args){
            float x = dividir(10, 0);
            System.out.println(x);
    }
    public static float dividir(float x, float y) {
        if(y==0)
            throw new DivisaoPorZeroException();
        else {
            return x / y;
        }
    }
}

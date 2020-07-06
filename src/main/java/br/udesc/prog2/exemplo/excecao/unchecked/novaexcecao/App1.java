package br.udesc.prog2.exemplo.excecao.unchecked.novaexcecao;

public class App1 {
 
    public static void main(String[] args){
        try {    
            float x = dividir(10, 0);
            System.out.println(x);
        }
        catch (DivisaoPorZeroException e){
            System.out.println("Tentativa de divisão por zero");
        }
    }
    public static float dividir(float x, float y) {
        if(y==0)
            throw new DivisaoPorZeroException();
        else {
            return x / y;
        }
    }
}
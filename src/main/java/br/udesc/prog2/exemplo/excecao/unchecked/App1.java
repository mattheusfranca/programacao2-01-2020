package br.udesc.prog2.exemplo.excecao.unchecked;

public class App1 {
    
    public static void main(String[] args){
        int resultado = 0;
        try {
            int x = 10;
            int y = 0;
            resultado = x/y;
        }
        catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("resultado: " + resultado);
    }
}
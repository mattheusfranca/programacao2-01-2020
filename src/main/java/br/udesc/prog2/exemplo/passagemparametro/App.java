package br.udesc.prog2.exemplo.passagemparametro;


public class App {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        Troca.trocaInteiro(a, b);
        System.out.println("a: " + a + ", b: " + b);
        
        Pessoa p1 = new Pessoa("Mattheus");
        Pessoa p2 = new Pessoa("Marília");
        Troca.trocaPessoa(p1, p2);
        System.out.println("p1: " + p1 + ", p2: " + p2);
        
        Troca.trocaNomePessoa(p1, p2);
        System.out.println("p1: " + p1 + ", p2: " + p2);
        
    }
    
}

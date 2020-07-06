package br.udesc.prog2.exemplo.passagemparametro;

public class Troca {
    
    public static void trocaInteiro(int x, int y) {
        int aux = x;
        x = y;
        y = aux;
    }
    
    public static void trocaPessoa(Pessoa a, Pessoa b) {
        Pessoa aux = a;
        a = b;
        b = aux;
    }
    
    public static void trocaNomePessoa(Pessoa a, Pessoa b) {
        String nomeAux = a.getNome();
        a.setNome(b.getNome());
        b.setNome(nomeAux);
    }
}

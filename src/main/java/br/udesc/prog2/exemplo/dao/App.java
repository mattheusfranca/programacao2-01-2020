package br.udesc.prog2.exemplo.dao;

public class App {
    public static void main(String[] args){
        PessoaRepositorio pessoaRepositorio = new PessoaDAO();
        
        Pessoa pessoa1 = new Pessoa("Mattheus", "123456");
        Pessoa pessoa2 = new Pessoa("Marília", "789456");
        pessoaRepositorio.gravar(pessoa1);
        pessoaRepositorio.gravar(pessoa2);
        
        Pessoa pessoaRecuperada = pessoaRepositorio.buscar("456456465465");
        
        if(pessoaRecuperada != null)
            System.out.println(pessoaRecuperada);
        else
            System.out.println("Pesssoa não encontrada");
        
    }
}

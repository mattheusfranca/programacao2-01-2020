package br.udesc.prog2.exemplo.heranca;

public class App {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Marília", "123456");
        pessoa.imprimeDados();
        
        System.out.println();
        
        Funcionario funcionario = new Funcionario("Mattheus", "4567", "Engenheiro de Software");
        funcionario.imprimeDados();
    }   
}

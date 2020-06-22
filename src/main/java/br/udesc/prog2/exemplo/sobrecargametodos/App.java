package br.udesc.prog2.exemplo.sobrecargametodos;

public class App {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Murilo", "9876");
        funcionario.imprimeDados();
        
        funcionario = new Funcionario("Murilo", "9876", 9000f, "Arquiteto de Soluções");
        funcionario.imprimeDados();
        
        funcionario.alterarCargo("DevOps");
        funcionario.imprimeDados();
        
        funcionario.alterarCargo("Engenheiro de Software", 11000f);
        funcionario.imprimeDados();
    }
    
}

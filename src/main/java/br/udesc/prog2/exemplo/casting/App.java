
package br.udesc.prog2.exemplo.casting;

public class App {
 
    public static void main(String[] args){
        
        Pessoa pessoa = new Funcionario("Mattheus", "123456", "Arquiteto de Soluções");
        
        //Não é possível utilizar o método setCargo sem realizar o casting
        //pessoa.setCargo("Engenheiro de Software");
        
        Funcionario funcionario = (Funcionario) pessoa;
        funcionario.setCargo("Engenheiro de Software");
        
        System.out.println(funcionario);
    }
}

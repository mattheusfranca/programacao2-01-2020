package br.udesc.prog2.exemplo.heranca;

public class Funcionario extends Pessoa {
   private String cargo;
   
    /*
        Necessário o construtor explicitado na superclasse (Pessoa). 
        Caso não tenha um construtor explícito não temos a necessidade 
        de implementar um construtor.
    */
    public Funcionario(String nome, String CPF, String cargo) {
        /*
            Chamada do construtor da classe Pai
        */
        super(nome, CPF);
        //Parte a adicionar no novo consrutor
        this.cargo = cargo;   
    }
    
    /*
    Sobreescrita de método existente na classe Pessoa 
    */
    @Override
    public void imprimeDados(){
        //Chamada do método imprimeDados() da classe Pessoa
        super.imprimeDados();
        //Incrimeto do novo método imprimeDados()
        System.out.println(cargo);
    }
}

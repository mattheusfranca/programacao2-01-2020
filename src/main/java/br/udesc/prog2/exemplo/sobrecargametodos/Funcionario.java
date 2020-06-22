package br.udesc.prog2.exemplo.sobrecargametodos;

public class Funcionario {
    private String nome;
    private String CPF;
    private float salario;
    private String cargo;

    public Funcionario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
        this.cargo = "Sem alocação";
    }

    //Sobrecarga de construtor
    public Funcionario(String nome, String CPF, float salario, String cargo) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println();
    }
    
    public void alterarCargo(String cargo){
        this.cargo = cargo;
    }
    /*
    Sobrecarga permite que utilizemos o mesmo nome em mais de um método 
    contanto que suas listas de argumentos sejam diferentes para que seja 
    feita a separação dos mesmos.
    */
    
    public void alterarCargo(String cargo, float salario){
        this.cargo = cargo;
        this.salario = salario;
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public float getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
    
}

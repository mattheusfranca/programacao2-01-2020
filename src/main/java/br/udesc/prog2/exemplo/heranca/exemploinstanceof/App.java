package br.udesc.prog2.exemplo.heranca.exemploinstanceof;

import br.udesc.prog2.exemplo.heranca.Funcionario;
import br.udesc.prog2.exemplo.heranca.Pessoa;
import java.util.ArrayList;
import java.util.List;
/*
instanceof é lido como é um 
*/
public class App {
     public static void main(String[] args){
        Funcionario mattheus = new Funcionario("Mattheus", "4567", "Engenheiro de Software");
    
        if(mattheus instanceof Pessoa){
            System.out.println(mattheus.getNome() + " é uma pessoa");
        }
        if (mattheus instanceof Funcionario){
            System.out.println(mattheus.getNome() + " é um Funcionario");
        }
        Pessoa marilia = new Pessoa("Marília", "123456");
     
        
        //Usando instanceof com listas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(marilia);
        pessoas.add(mattheus);
        
        //praticando o foreach com functional programming (FP)
        pessoas.forEach((pessoa) -> {
            if(pessoa instanceof Pessoa)
                System.out.println(pessoa.getNome() + " é uma pessoa");
            if(pessoa instanceof Funcionario)
                System.out.println(pessoa.getNome() + " é um Funcionario");    
        });

    }
 }

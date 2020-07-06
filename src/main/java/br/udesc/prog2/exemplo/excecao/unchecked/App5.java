package br.udesc.prog2.exemplo.excecao.unchecked;

import java.util.ArrayList;
import java.util.List;

public class App5 {
    public static void main(String[] args){
        List<String> alunos = null;
        
        try {
            alunos.add("Bruno");
            alunos.add("Gustavo");
            alunos.add("José");
        }
        catch (NullPointerException e){
            System.out.print("Lista não foi inicializada");
            //Possível tratamento: Inicialização da lista e adicionar alunos a lista
            alunos = new ArrayList<>();
            alunos.add("Bruno");
            alunos.add("Gustavo");
            alunos.add("José");
        }
        
        System.out.print(alunos);
    }
}
package br.udesc.prog2.exemplo.excecao.unchecked;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    
    public static void main(String[] args){
        List<String> alunos = new ArrayList<>();
        alunos.add("Bruno");
        alunos.add("Gustavo");
        alunos.add("José");
        
        try {
            System.out.println(alunos.get(2));
            //Posição 3 não existe
            System.out.println(alunos.get(3));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Não existe aluno nesta posição da lista de alunos");
            //e.printStackTrace();
        }

    }
}
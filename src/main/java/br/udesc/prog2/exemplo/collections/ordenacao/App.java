
package br.udesc.prog2.exemplo.collections.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
 
    public static void main(String[] args){
        
        List<String> lista = new ArrayList<>();
        lista.add("Aluno 3");
        lista.add("Aluno 1");
        lista.add("Aluno 2");
        lista.add("Aluno 0");            

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);
        
    }
}

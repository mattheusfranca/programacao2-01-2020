package br.udesc.prog2.exemplo.excecao.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class App2 {
        public static void main(String[] args){
        File file = new File("lista_alunos.txt");
        FileInputStream input = null;
        try {
            input =new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
        finally {
            System.out.println("Finalizando lista de alunos");
        }
    }
}

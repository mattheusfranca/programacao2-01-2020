package br.udesc.prog2.exemplo.excecao.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class App1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("alunos.txt");
        FileInputStream input =new FileInputStream(file);
        //Para a execução do programa
        System.out.println("Essa linha não será executada");
    }    
}

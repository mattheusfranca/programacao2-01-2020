
package br.udesc.prog2.exemplo.excecao.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args){
        File file = new File("alunos.txt");
        try {
            FileInputStream input =new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
    }
}

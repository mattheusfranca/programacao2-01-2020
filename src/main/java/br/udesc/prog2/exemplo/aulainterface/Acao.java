
package br.udesc.prog2.exemplo.aulainterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Acao implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("Exemplo de clique");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.exemplo.mvc;

import br.udesc.prog2.exemplo.mvc.controller.CadastrarMedicoController;

public class App {
    public static void main(String[] args){
        CadastrarMedicoController controller = new CadastrarMedicoController();
        controller.exibirTela();
    }
}

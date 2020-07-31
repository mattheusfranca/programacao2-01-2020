package br.udesc.prog2.exemplo.mvc.controller;

import br.udesc.prog2.exemplo.mvc.dao.MedicoDAO;
import br.udesc.prog2.exemplo.mvc.model.Medico;
import br.udesc.prog2.exemplo.mvc.view.CadastrarMedicoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastrarMedicoController {
    private Medico medicoModel;
    private CadastrarMedicoView cadastrarMedicoView;

    public CadastrarMedicoController() {
       cadastrarMedicoView = new CadastrarMedicoView();
       adicionarAcoesBotoes();
    }
    
    public void exibirTela(){
       cadastrarMedicoView.setVisible(true);
    }
    
    public void adicionarAcoesBotoes(){
            acaoSalvar();
    }
    
    public void acaoSalvar(){
           cadastrarMedicoView.addAcaoBotaoSalvar(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               medicoModel = cadastrarMedicoView.getDadosMedico();
               salvarMedico();
               cadastrarMedicoView.exibirMensagem(medicoModel.getNome() + " salvo com sucesso!");
               cadastrarMedicoView.limparDados();
           }
       });   
    }
    
        
    public void salvarMedico(){
       MedicoDAO medicoDAO = new MedicoDAO();
       medicoDAO.gravar(medicoModel);
    }
    
    
}

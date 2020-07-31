package br.udesc.prog2.exemplo.mvc.dao;


import br.udesc.prog2.exemplo.mvc.model.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO  {
    private static List<Medico> medicos;
    
    public MedicoDAO(){
       if(medicos == null)
           medicos = new ArrayList<>();
    }

    public void gravar(Medico p) {
        medicos.add(p);
    }

    public Medico buscar(String CPF) {
        for(Medico m : medicos){
            if(m.getCPF().equals(CPF))
                return m;
        }
      return null;
    }

    public List<Medico> buscarTodosMedicos() {
        return medicos;
    }
    
}

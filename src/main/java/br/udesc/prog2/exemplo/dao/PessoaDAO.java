package br.udesc.prog2.exemplo.dao;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO implements PessoaRepositorio {
    private static List<Pessoa> pessoas;
    
    public PessoaDAO(){
       if(pessoas == null)
           pessoas = new ArrayList<>();
    }

    @Override
    public void gravar(Pessoa p) {
        pessoas.add(p);
    }

    @Override
    public Pessoa buscar(String CPF) {
        for(Pessoa p : pessoas){
            if(p.getCpf().equals(CPF))
                return p;
        }
      return null;
    }

    @Override
    public List<Pessoa> buscarTodasPessoas() {
        return pessoas;
    }
    
}

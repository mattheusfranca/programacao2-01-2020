package br.udesc.prog2.exemplo.dao;

import java.util.List;


public interface PessoaRepositorio {
    public void gravar(Pessoa p);
    public Pessoa buscar(String CPF);
    public List<Pessoa> buscarTodasPessoas();
}

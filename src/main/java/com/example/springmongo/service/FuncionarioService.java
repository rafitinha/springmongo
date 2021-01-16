package com.example.springmongo.service;

import com.example.springmongo.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    public List<Funcionario> obterTodos();
    public Funcionario obterPorCodigo(String codigo);
    public Funcionario criar(Funcionario funcionario);
    public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);
    public List<Funcionario> obterFuncionariosPorNome(String nome);

}

package com.example.demo.boot.dao;

import java.util.List;

import com.example.demo.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save (Funcionario funcionario);
	void update (Funcionario funcionario);
	void delete (Long id);
	Funcionario findById(Long id);
	List <Funcionario> findAll();
	List<Funcionario> findByNome(String nome);
	List<Funcionario> findByCargo(Long id);
	
}

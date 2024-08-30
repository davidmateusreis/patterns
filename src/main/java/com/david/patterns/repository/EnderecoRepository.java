package com.david.patterns.repository;

import org.springframework.data.repository.CrudRepository;

import com.david.patterns.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}

package com.david.patterns.repository;

import org.springframework.data.repository.CrudRepository;

import com.david.patterns.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}

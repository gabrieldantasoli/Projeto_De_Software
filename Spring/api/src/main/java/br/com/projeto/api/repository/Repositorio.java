package br.com.projeto.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.models.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
    
}

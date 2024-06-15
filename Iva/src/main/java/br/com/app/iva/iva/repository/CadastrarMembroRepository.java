package br.com.app.iva.iva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.iva.iva.entity.CadastrarMembro;

@Repository
public interface CadastrarMembroRepository extends JpaRepository<CadastrarMembro, Integer>{

}

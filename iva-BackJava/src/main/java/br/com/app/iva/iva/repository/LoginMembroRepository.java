package br.com.app.iva.iva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMembroRepository extends JpaRepository<br.com.app.iva.iva.entity.LoginMembro, Integer> {

}

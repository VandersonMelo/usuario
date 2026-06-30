package com.plusultra.usuario.infraestructure.repository;

import com.plusultra.usuario.infraestructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Informar ao Spring que este é um repositório
public interface TelefoneRepository extends JpaRepository<Telefone, Long> { //Herdo os métodos da biblioteca JPA informando os tipos
}

package com.plusultra.usuario.infraestructure.repository;

import com.plusultra.usuario.infraestructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Informar ao Spring que este é um repositório
public interface EnderecoRepository extends JpaRepository<Endereco, Long> { //Herdo os métodos da biblioteca JPA informando os tipos
}

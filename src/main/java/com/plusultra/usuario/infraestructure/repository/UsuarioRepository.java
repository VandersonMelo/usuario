package com.plusultra.usuario.infraestructure.repository;

import com.plusultra.usuario.infraestructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Informar ao Spring que este é um repositório
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { //Herdo os métodos da biblioteca JPA informando os tipo

    boolean existsByEmail(String email); //Verifica se o email cadastrado já existe no meu banco de dados

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}

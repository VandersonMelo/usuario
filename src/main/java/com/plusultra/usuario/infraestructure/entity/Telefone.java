package com.plusultra.usuario.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //Informa que existem getters ocultos dos meus atributos e métodos
@Setter //Informa que existem setters ocultos dos meus atributos e métodos
@AllArgsConstructor //Informa que existem construtores ocultos dos meus atributos e métodos com todos os parâmetros
@NoArgsConstructor //Informa que existem construtores ocultos dos meus atributos e métodos sem nenhum parâmetro
@Entity //Informa ao spring que essa classe é uma tabela no banco de dados
@Table(name = "telefone") //Informa o nome da minha tabela no banco de dados
public class Telefone {

    @Id //Informa que o id é meu identificador único para quando for buscar as informações no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera automaticamente nossos IDs
    private Long id;
    @Column(name = "numero", length = 10)
    private String numero;
    @Column(name = "ddd", length = 3)
    private String ddd;
}

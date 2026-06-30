package com.plusultra.usuario.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter //Informa que existem getters ocultos dos meus atributos e métodos
@Setter //Informa que existem setters ocultos dos meus atributos e métodos
@AllArgsConstructor //Informa que existem construtores ocultos dos meus atributos e métodos com todos os parâmetros
@NoArgsConstructor //Informa que existem construtores ocultos dos meus atributos e métodos sem nenhum parâmetro
@Entity //Informa ao spring que essa classe é uma tabela no banco de dados
@Table(name = "usuario") //Informa o nome da minha tabela no banco de dados
public class Usuario implements UserDetails {

    @Id //Informa que o id é meu identificador ÚNICO para quando for buscar as informações no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera automaticamente nossos IDs
    private Long id;
    @Column(name = "nome", length = 100) //Identifica o nome da minha coluna e algumas informações adicionais como o tamanho, se é única
    private String nome;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "senha")
    private String senha;
    @OneToMany(cascade = CascadeType.ALL)  //Informa que o usuário pode ter vários endereços e telefones diferentes
    @JoinColumn(name = "usuario_id", referencedColumnName = "id") //Identifica o nome da minha coluna dentro da tabela ENDEREÇO, referenciando o ID do usuário
    private List<Endereco> enderecos; //Minha lista de endereços
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id") //Identifica o nome da minha coluna dentro da tabela ENDEREÇO, referenciando o ID do usuário
    private List<Telefone> telefones; //1minha lista de telefones

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public @Nullable String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

}

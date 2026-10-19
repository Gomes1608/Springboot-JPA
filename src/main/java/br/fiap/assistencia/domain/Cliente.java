package br.fiap.assistencia.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "JAVA_CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;
    @Column(name = "NOME",
            nullable = false, length = 120)
    private String nome;
    private String telefone;
    private String email;
    private String senha;
}
package com.example.ProjetoBiblioteca.entities;

import java.time.Instant;
import java.util.List;

public class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Instant dataCadastro;
    private List emprestimosAtivos;

}

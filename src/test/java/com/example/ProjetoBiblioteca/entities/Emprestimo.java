package com.example.ProjetoBiblioteca.entities;

import java.time.Instant;

public class Emprestimo {
    private Long id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
    private Long livro;
    private Long usuario;
}

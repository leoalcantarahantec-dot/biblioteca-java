package com.biblioteca.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Livro implements Serializable {
    private String titulo;
    private String autor;
    private String isbn;
    private LocalDate dataPublicacao;
    private boolean disponivel;
    private Cliente clienteEmprestado; 
    
    public Livro(String titulo, String autor, String isbn, LocalDate dataPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
        this.disponivel = disponivel;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }
    
    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public Cliente getClienteEmprestado() {
        return clienteEmprestado;
    }
    
    public void setClienteEmprestado(Cliente clienteEmprestado) {
        this.clienteEmprestado = clienteEmprestado;
    }
}
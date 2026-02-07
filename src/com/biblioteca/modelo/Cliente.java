package com.biblioteca.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{
    private String nome;
    private int id;
    private int limite = 3;
    private ArrayList<Livro> livrosEmprestados;
    
    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getLimite() {
        return limite;
    }
    
    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
    
    public boolean podeEmprestar(){
        return livrosEmprestados.size() < limite;
    }
    
    public void pegarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }
}
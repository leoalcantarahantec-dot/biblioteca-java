package com.biblioteca.servico;

import com.biblioteca.modelo.Cliente;
import com.biblioteca.modelo.Livro;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca implements Serializable{
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Cliente> clientes;
    
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>(); 
    }
    
    public void adicionarCliente(String nome, int id){
        Cliente novoCliente = new Cliente(nome, id);
        clientes.add(novoCliente);
    }
    
    public void adicionarLivro(String titulo, String autor, String isbn, LocalDate dataPublicacao, boolean disponivel) {
        Livro livros1 = new Livro(titulo, autor, isbn, dataPublicacao, disponivel);
        livros.add(livros1);
    }
    
    public void emprestarLivro(String titulo, int idCliente){
        Cliente clienteEncontrado = null;
        for(Cliente cliente: clientes){
            if(cliente.getId() == idCliente){
                clienteEncontrado = cliente;
                break;
            }
        }
        
        if (clienteEncontrado == null){
            System.out.println("cliente não encontrado");
            return;
        }
        
        if(clienteEncontrado.getLivrosEmprestados().size() >= clienteEncontrado.getLimite()){
            System.out.println("quantidade ultrapassada");
            return;
        }
        
        for (Livro livro: livros){
            if (livro.getTitulo().equals(titulo) && livro.isDisponivel()){
                clienteEncontrado.getLivrosEmprestados().add(livro);
                livro.setClienteEmprestado(clienteEncontrado); 
                livro.setDisponivel(false);
                System.out.println("Livro '" + titulo + "' emprestado para " + clienteEncontrado.getNome() + " com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado ou não disponível.");
    }
    
    public void devolverLivro(String titulo){
        for (Livro livro : livros){
            if(livro.getTitulo().equals(titulo) && !livro.isDisponivel()){
                Cliente cliente = livro.getClienteEmprestado();
                if (cliente != null) {
                    cliente.getLivrosEmprestados().remove(livro);
                }
                livro.setClienteEmprestado(null);
                livro.setDisponivel(true);
                System.out.println("Livro devolvido com sucesso!");
                return;
            } 
        }
        System.out.println("Livro não encontrado ou já disponível.");
    }
    
    public void listarLivrosDisponiveis(){
        boolean temDisponivel = false;
        for (Livro livros: livros){
            if (livros.isDisponivel()){
                System.out.println("Livro disponível: " + livros.getTitulo() + " por " + livros.getAutor());
                temDisponivel = true;
            }
        }
        if (!temDisponivel){
            System.out.println("Nenhum livro disponível encontrado.");
        }
    }
    
    public void listarLivrosEmprestados(){
        boolean temEmprestados = false;
        for(Livro livros: livros){
            if(!livros.isDisponivel()){
                System.out.println("Livro emprestado: " + livros.getTitulo() + " por " + livros.getAutor());
                temEmprestados = true;
            }
        }
        if (!temEmprestados){
            System.out.println("Nenhum livro emprestado encontrado.");
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Livro> getLivros() {
        return livros;
    }
    
    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
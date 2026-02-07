package com.biblioteca;

import com.biblioteca.servico.Biblioteca;
import com.biblioteca.persistencia.PersistenciaDados;
import java.time.LocalDate;

/**
 * Sistema de Gerenciamento de Biblioteca
 * Permite cadastrar livros, clientes e gerenciar empréstimos
 * 
 * @author Adriel
 * @version 1.0
 */

public class Main {
    public static void main(String[] args){
        PersistenciaDados persistenciaDados = new PersistenciaDados();
        
        // Tenta carregar do arquivo
        Biblioteca livros = persistenciaDados.carregar();
        
        
        livros.adicionarLivro("BIBLIA","JOAO","2541",
            LocalDate.of(1997,11,3), true);
        livros.adicionarCliente("ADRIEL", 1);
        livros.emprestarLivro("BIBLIA",1);
        livros.listarLivrosEmprestados();
        
        // SALVA ANTES DE ENCERRAR
        persistenciaDados.salvar(livros);
    }
}
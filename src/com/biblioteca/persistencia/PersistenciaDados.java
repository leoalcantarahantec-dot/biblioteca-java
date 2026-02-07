package com.biblioteca.persistencia;

import com.biblioteca.servico.Biblioteca;
import java.io.*;

public class PersistenciaDados {
    
    public void salvar(Biblioteca biblioteca) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dados/biblioteca.dat"))) {
            oos.writeObject(biblioteca);
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
    
    public Biblioteca carregar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dados/biblioteca.dat"))) {
            Biblioteca biblioteca = (Biblioteca) ois.readObject();
            System.out.println("Dados carregados com sucesso!");
            return biblioteca;
        } catch (Exception e) {
            System.out.println("Criando nova biblioteca...");
            return new Biblioteca("BIBLIOTECA SPURGEON");
        }
    }
}


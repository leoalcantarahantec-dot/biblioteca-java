# Sistema de Gerenciamento de Biblioteca

Projeto desenvolvido em Java para estudar e aplicar conceitos fundamentais de Programação Orientada a Objetos e persistência de dados.

## Sobre o Projeto

Este é um sistema simples de gerenciamento de biblioteca que permite o cadastro de livros e clientes, além do controle de empréstimos. O projeto foi desenvolvido com foco educacional para praticar os princípios da POO e técnicas de persistência de dados em Java.

## Objetivos de Aprendizado

- Aplicar conceitos de Programação Orientada a Objetos
- Implementar encapsulamento e relacionamentos entre classes
- Utilizar serialização de objetos para persistência
- Organizar código em pacotes seguindo convenções Java
- Manipular coleções com ArrayList

## Funcionalidades

- Cadastro de livros com informações completas (título, autor, ISBN, data de publicação)
- Cadastro de clientes
- Sistema de empréstimo e devolução de livros
- Listagem de livros disponíveis e emprestados
- Persistência automática de dados em arquivo

## Tecnologias Utilizadas

- Java 17
- Serialização de objetos (ObjectOutputStream/ObjectInputStream)
- Collections Framework (ArrayList)

## Estrutura do Projeto
```
biblioteca/
├── dados/
│   └── biblioteca.dat
└── src/com/biblioteca/
    ├── modelo/
    │   ├── Cliente.java
    │   └── Livro.java
    ├── servico/
    │   └── Biblioteca.java
    ├── persistencia/
    │   └── PersistenciaDados.java
    └── Main.java
```

## Organização por Pacotes

- **modelo**: Classes de domínio (Livro, Cliente)
- **servico**: Lógica de negócio (Biblioteca)
- **persistencia**: Gerenciamento de dados (PersistenciaDados)
- **raiz**: Ponto de entrada da aplicação (Main)

## Como Executar

### Requisitos

- Java JDK 17 ou superior
- IDE Java (VS Code, Eclipse, IntelliJ IDEA) ou terminal

### Compilação e Execução via Terminal
```bash
# Clonar o repositório
git clone https://github.com/leoalcantarahantec-dot/biblioteca-java.git
cd biblioteca-java

# Compilar
javac -d bin src/com/biblioteca/**/*.java src/com/biblioteca/*.java

# Executar
java -cp bin com.biblioteca.Main
```

### Execução via IDE

1. Importe o projeto na IDE
2. Execute a classe Main.java

## Regras de Negócio

- Limite de 3 livros por cliente
- Livros só podem ser emprestados se disponíveis
- Sistema salva dados automaticamente ao encerrar
- Dados são carregados automaticamente ao iniciar

## Conceitos de POO Aplicados

### Encapsulamento
Todos os atributos são privados com métodos getters e setters apropriados.

### Relacionamento entre Classes
- Cliente possui uma lista de Livros emprestados
- Livro mantém referência ao Cliente que o emprestou

### Separação de Responsabilidades
- Classes de modelo apenas representam dados
- Classe Biblioteca gerencia a lógica de negócio
- Classe PersistenciaDados cuida da persistência

## Persistência de Dados

O sistema utiliza serialização de objetos Java para salvar o estado completo da biblioteca em arquivo binário. Os dados são automaticamente:
- Salvos ao encerrar o programa
- Carregados ao iniciar o programa
- Criados se não existirem

## Limitações

Este projeto foi desenvolvido para fins educacionais e possui algumas limitações intencionais:

- Não possui interface gráfica
- Não utiliza banco de dados
- Não implementa controle de datas de devolução
- Não possui sistema de autenticação
- Validações são básicas

## Possíveis Melhorias Futuras

- Implementação de interface gráfica (Swing/JavaFX)
- Migração para banco de dados relacional
- Sistema de reservas de livros
- Controle de multas por atraso
- Histórico completo de empréstimos
- Relatórios e estatísticas

## Autor

Adriel

Projeto desenvolvido como exercício prático de programação em Java.

## Licença

Este projeto está disponível para uso educacional.
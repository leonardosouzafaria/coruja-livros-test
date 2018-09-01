CREATE DATABASE DBCorujaLivros;

USE DBCorujaLivros;

CREATE TABLE Temas (
    codTema INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    tema VARCHAR(50) NOT NULL
);

CREATE TABLE Autores (
    codAutor INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE Livros (
    codLivro INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    codTema INT NOT NULL,
    codAutor INT NOT NULL,
    titulo VARCHAR(80) NOT NULL,
    qtdPaginas INT NOT NULL,
    CONSTRAINT FK_codTema_Livros FOREIGN KEY (codTema)
        REFERENCES Temas (codTema),
    CONSTRAINT FK_codAutor_Livros FOREIGN KEY (codAutor)
        REFERENCES Autores (codAutor)
);

CREATE TABLE Estoque (
    codEstoque INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    codLivro INT NOT NULL UNIQUE,
    qtdLivros INT NOT NULL,
    CONSTRAINT FK_codLivro_Estantes FOREIGN KEY (codLivro)
        REFERENCES Livros (codLivro)
);
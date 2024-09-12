use icaro;

CREATE TABLE biblioteca (
    id int not null primary key auto_increment,
    nome VARCHAR(100),
    endereco VARCHAR(150),
    telefone VARCHAR(15)
);

CREATE TABLE curso (
    id int not null primary key auto_increment,
    nome VARCHAR(100),
    duracao INT, -- duração do curso em semestres
    coordenador_id INT,
    FOREIGN KEY (coordenador_id) REFERENCES professor(id)
);

CREATE TABLE aluno (
    id int not null primary key auto_increment,
    nome VARCHAR(100),
    matricula VARCHAR(20),
    curso_id INT,
    email VARCHAR(100),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);

CREATE TABLE professor (
    id int not null primary key auto_increment,
    nome VARCHAR(100),
    departamento VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE funcionario (
    id int not null primary key auto_increment,
    nome VARCHAR(100),
    cargo VARCHAR(50),
    salario DECIMAL(10, 2),
    data_contratacao DATE
);


select * from biblioteca
select * from curso
select * from aluno
select * from professor
select * from funcionario
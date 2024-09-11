use tabelas;

CREATE TABLE livros (
    id int not null primary key auto_increment,
    titulo varchar(255),
    autor varchar(255),
    editora varchar(255),
    ano_publicacao int,
    preco decimal(10, 2)
);

CREATE TABLE clientes (
    id int not null primary key auto_increment,
    nome varchar(255),
    email varchar(255),
    endereco varchar(255)
);

CREATE TABLE pedidos (
    id int not null primary key auto_increment,
    id_cliente int,
    data_pedido date,
    total decimal(10, 2),
    foreign key (id_cliente) references clientes(id)
);

select * from livros;
select * from clientes;
select * from pedidos;
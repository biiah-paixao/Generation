create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria (
	id bigint auto_increment,
	assunto varchar(100) not null,
    modelo varchar(100) not null,
    
	primary key (id)
);

insert into tb_categoria (assunto, modelo) values ("Graduação", "Presencial");
insert into tb_categoria (assunto, modelo) values ("Tecnológico", "EAD");
insert into tb_categoria (assunto, modelo) values ("Livres", "EAD");
insert into tb_categoria (assunto, modelo) values ("Complementares", "Presencial");

create table tb_curso (
	id bigint auto_increment,
    nome varchar(255) not null,
    cargaHoraria varchar(255) not null,
    instituicao varchar(255) not null,
    preco decimal(10,2) not null,
    categoria_id bigint,
    
	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Design Gráfico", "2 anos", "UNINOVE", 470, 2);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Java", "80 horas", "Alura", 430, 3);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Programador Front-End", "348 horas", "Senai", 745.98, 3);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Arquitetura e Urbanismo", "5 anos", "USJT", 1329, 1);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Inteligência artificial", "2 anos", "fiap", 1510, 2);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Medicina", "6 anos", "UNICID", 10493, 1);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Programação de Games", "42 horas", "Unisanta", 299, 4);
insert into tb_curso (nome, cargaHoraria, instituicao, preco, categoria_id) values ("Marketing de Conteúdo Digital", "20 horas", "Belas Artes", 792, 4);

select * from tb_curso where preco > 500;

select * from tb_curso where preco between 3 and 6000;

select * from tb_curso where nome like "%j%";

select * from tb_curso inner join tb_categoria
on tb_categoria.id = tb_curso.categoria_id;

select * from tb_curso inner join tb_categoria
on tb_categoria.id = tb_curso.categoria_id
where tb_categoria.id = 3;

select * from tb_curso;
select * from tb_categoria;

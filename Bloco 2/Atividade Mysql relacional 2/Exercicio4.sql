create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
	id bigint auto_increment,
    classificacao varchar(255) not null,
    tipo varchar(255) not null,
    
	primary key (id)
);

insert into tb_categoria(classificacao, tipo)  values ("frutas", "doces");
insert into tb_categoria(classificacao, tipo)  values ("frutas", "acidas");
insert into tb_categoria(classificacao, tipo)  values ("hortaliças", "verduras");
insert into tb_categoria(classificacao, tipo)  values ("legumes", "Frutos");
insert into tb_categoria(classificacao, tipo)  values ("legumes", "Raizes");

create table tb_produto(
	id bigint auto_increment,
	nome varchar(255) not null,
	quantidade int,
	preco decimal not null,
    categoria_id bigint,

	primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("maçã",20, 5.00, 2);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("laranja", 50, 10.00, 1);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("banana", 100, 12.00, 1);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("Alface", 10, 2.99, 3);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("Cebola", 40, 3.49, 5);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("Tomate", 30, 4.99, 4);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("Couve", 60, 2, 3);
insert into tb_produto(nome, quantidade, preco, categoria_id)  values ("Cenoura", 80, 2.69, 5);


select * from tb_produto where quantidade > 50;

select * from tb_produto where quantidade between 3 and 60;

select * from tb_produto where nome like "%c%";

select * from tb_produto inner join tb_categoria 
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria 
on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.id = 1;

select * from tb_produto;
select * from tb_categoria;

drop database db_cidade_das_frutas;
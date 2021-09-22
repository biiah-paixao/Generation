create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
	tipo varchar(255) not null,
    tamanho varchar(255) not null,
	primary key (id)
);

insert into tb_categoria (tipo, tamanho) values ("Pizza Salgada", "Grande");
insert into tb_categoria (tipo, tamanho) values ("Pizza Salgada", "Brotinho");
insert into tb_categoria (tipo, tamanho) values ("Pizza Doce", "Grande");
insert into tb_categoria (tipo, tamanho) values ("Pizza Doce", "Brotinho");
insert into tb_categoria (tipo, tamanho) values ("Pizza Gourmet", "Grande");
insert into tb_categoria (tipo, tamanho) values ("Pizza Gourmet", "Brotinho");

create table tb_pizza(
	id bigint auto_increment,
    nome varchar(255) not null,
    valor decimal(5,2) not null,
    borda boolean,
    categoria_id bigint,
	primary key(id),
	foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_pizza (nome, valor, borda, categoria_id) values ("Portuguesa",30, true, 1);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Beijinho",30, false, 3);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Calabresa",18.90, false, 2);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Cartola",24.50, false, 4);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Mineira",26, true, 1);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Camarão",57.49, true, 6);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Caprese",72.99, true, 5);
insert into tb_pizza (nome, valor, borda, categoria_id) values ("Sensação",42.90, false, 3);


select * from tb_pizza where valor > 45;

select * from tb_pizza where valor between 29 and 60;

select * from tb_pizza where nome like "%c%";

select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.categoria_id;

select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.categoria_id
where tb_categoria.id in (3,4);

select * from tb_pizza;
select * from tb_categoria;


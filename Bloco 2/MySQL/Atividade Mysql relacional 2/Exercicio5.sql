create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
	id bigint auto_increment,
    tipo varchar(255), -- natural, artifical
    classificacao varchar(255),  -- (produto hidrã 
    
    primary key (id)
);

insert into tb_categoria (tipo, classificacao) values ("Natural","Basico");
insert into tb_categoria (tipo, classificacao) values ("Artificial","Basico");
insert into tb_categoria (tipo, classificacao) values("Artificial","Hidraulico");
insert into tb_categoria (tipo, classificacao) values("Artificial","Elétrico");

create table tb_produto(
	id bigint auto_increment,
    nome varchar(255) not null,
    quantidade int, 
    peso  varchar(255),
    valor decimal(6,2) not null,
    fabricante varchar(255) not null,
    categoria_id bigint,

    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (nome, quantidade, valor, peso, fabricante, categoria_id) values ("Cimento", 2, 32.66, "50kg","Votoran", 2);
insert into tb_produto (nome, quantidade, valor, fabricante, categoria_id) values ("Torneira para Banheiro", 3, 165.90, "Docol", 3);
insert into tb_produto (nome, quantidade, valor, peso, fabricante, categoria_id) values ("Areia", 5, 3.89, "20kg","Pedrasil", 1);
insert into tb_produto (nome, quantidade, valor, peso, fabricante, categoria_id) values ("Tijolo Maciço Vermelho ", 200, 1.80, "2kg", "Spina Tijolos", 1);
insert into tb_produto (nome, quantidade, valor, fabricante, categoria_id) values ("Piso", 400, 10.50,"Artens", 2);
insert into tb_produto (nome, quantidade, valor, fabricante, categoria_id) values ("Fio Eletrinico", 1, 11.99, "Kit-Flex", 4);
insert into tb_produto (nome, quantidade, valor, fabricante, categoria_id) values ("Tomada", 500, 35.50, "Ilumi", 4);
insert into tb_produto (nome, quantidade, valor, fabricante, categoria_id) values ("Tubo Esgoto", 60, 85.90, "Fortlev", 3);

select * from tb_produto where valor > 50;

select * from tb_produto where valor between 3 and 60;

select * from tb_produto where nome like "%c%";

select * from tb_produto inner join tb_categoria 
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria 
on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.id = 1;

select * from tb_produto;
select * from tb_categoria;

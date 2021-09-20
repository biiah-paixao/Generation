create database db_ecommerce;

use db_ecommerce;

create table tb_produtos (
	id bigint auto_increment,
    categoria varchar(255) not null,
    nome varchar(255) not null,
    preco decimal(10,2) not null,
    quantidade int not null,
    
    primary key(id)
);

insert into tb_produtos (categoria, nome, preco, quantidade) values ("Eletronicos", "Echo Dot", 208.05, 200);
insert into tb_produtos (categoria, nome, preco, quantidade) values ("Eletrodomesticos", "Geladeira", 12399, 150);
insert into tb_produtos (categoria, nome, preco, quantidade) values ("Cosméticos", "Hidratante Facial", 339, 50);
insert into tb_produtos (categoria, nome, preco, quantidade) values ("Alimentação ", "Caviar", 849.90, 80);
insert into tb_produtos (categoria, nome, preco, quantidade) values ("Vestuario", "Joyfunear", 79.95, 45);

select * from tb_produtos;

select * from tb_produtos where preco > 500;

select * from tb_produtoss where preco < 500;

update tb_produtos set nome = "Pizza" where id = 4;


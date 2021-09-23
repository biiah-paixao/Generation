create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id bigint auto_increment,
    nome  varchar(100) not null,
    formato varchar(100) not null,
    uso varchar(50) not null,
    
    primary key (id)
);

insert into tb_categoria (nome, uso, formato) values ("Genéricos","Liquido","Oral");
insert into tb_categoria (nome, uso, formato) values ("Vitaminas ","Comprimido","Oral");
insert into tb_categoria (nome, uso, formato) values ("Suplimento Alimentar","Capsulas","Oral");
insert into tb_categoria (nome, uso, formato) values ("Manipulado","Pomada","Uso Tópico");

create table tb_produto(
	id bigint auto_increment,
    nome varchar(255) not null,
    valor decimal(10,2) not null,
    funcao varchar(255) not null,
    efeito varchar(100) not null,
    categoria_id bigint,
    
    primary key (id),
	foreign key (categoria_id) references tb_categoria (id)
);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Dipirona", "2.99", "Aliviar dores e Febres", "30 minutos", 1);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Pomada de Calêndula", "42.75", "Cicatrizante Natural", "3 horas", 4);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Dprev", "19.90", "Vitamila D", 30, 2);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Amora", "37", "Diminuição dos sintomas da menopausa", "90 dias", 3);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Prednisona", "10.99", "Corticoide, tratamento de alergias", "2 horas", 1);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Vitamina B12", "49.90", "Manter o metabolismo em funcionamento", "1 semana", 2);
insert into tb_produto (nome, valor, funcao, efeito, categoria_id) values ("Ácido Glicólico", "54", "Clareador de manchas", "6 semanas", 4);


select * from tb_produto where valor > 50;

select * from tb_produto where valor between 3 and 60;

select * from tb_produto where nome like "%b%";

select * from tb_produto inner join tb_categoria 
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria 
on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.id = 1;

select * from tb_produto;
select * from tb_categoria;

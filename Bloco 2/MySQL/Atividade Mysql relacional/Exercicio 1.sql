create database db_servicoRH;

use db_servicoRH;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(255) not null,
    idade int (2) not null,
    cargo varchar(255) not null,
	salario decimal(10,2) not null,
    
    primary key (id)
);

insert into tb_funcionarios (nome, idade, cargo, salario) values ("Joaquim",45,"Agente de Transito",3500);
insert into tb_funcionarios (nome, idade, cargo, salario) values ("Ana",29,"Design Gráfico",4500);
insert into tb_funcionarios (nome, idade, cargo, salario) values ("Carol",35,"Professora",2000);

select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 2500 where id = 3;
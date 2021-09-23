create database db_escola;

use db_escola;

create table tb_estudantes(
	id bigint auto_increment,
    nome varchar(255) not null,
    ano varchar(255) not null,
    matricula int not null,
    nota decimal(4,2) not null,
    
    primary key (id)
    
);

insert into tb_estudantes (nome, ano, matricula, nota) values ("Maria","2º ano", 123456, 7.9);
insert into tb_estudantes (nome, ano, matricula, nota) values ("João","6º ano", 157896, 9);
insert into tb_estudantes (nome, ano, matricula, nota) values ("Clara","7º ano", 357894, 5.5);
insert into tb_estudantes (nome, ano, matricula, nota) values ("Hugo","9º ano", 1475823, 6.7);
insert into tb_estudantes (nome, ano, matricula, nota) values ("Marcio","3º ano", 685492, 8.9);

select * from tb_estudantes;

select * from tb_estudantes where nota > 7;

select * from tb_estudantes where nota < 7;

update tb_estudantes set nota = 10 where id = 2;

update tb_estudantes set matricula = 147583 where id = 4;


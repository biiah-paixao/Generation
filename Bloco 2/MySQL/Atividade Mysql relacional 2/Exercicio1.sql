create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
    nome varchar(255) not null,
    nivel int not null,
    habilidades varchar(50) null,
    arma varchar(20) not null,
    
	primary key(id)
);

insert into tb_classe (nome, nivel, habilidades, arma) values ("Guerreito",20,"Força","Espada");
insert into tb_classe (nome, nivel, habilidades, arma) values ("Mago",10,"Inteligência","Cajado");
insert into tb_classe (nome, nivel, habilidades, arma) values ("Arqueiro",35,"Destreza","Arco e Flecha");
insert into tb_classe (nome, nivel, habilidades, arma) values ("Guardião",40,"Sabedoria","Adaga");


create table tb_personagem (
	id bigint auto_increment,
    nome varchar(100) not null,
    sexo varchar(50) not null,
    raca varchar(100) not null,
    ataque int not null,
    defesa int not null,
    classe_id bigint ,
    
    primary key (id),
	foreign key (classe_id) references tb_classe (id)
);

insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Voegea", "Feminino", "Humano", 1000, 500, 2);
insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Ushan", "Masculino", "Elfo", 2000, 1100, 4);
insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Mokona", "Feminino", "Humano" ,"2300" ,3000 ,1);
insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Yasuo", "Masculino", "Anão", "1500", 900, 3);
insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Estrea", "Feminino", "Elfo", "700", 1400, 1);
insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Ataz", "Masculino", "Anão", "1800", 2800, 2);
insert into tb_personagem (nome, sexo, raca, ataque, defesa, classe_id) values ("Carolz", "Feminino", "Humano", "800", 200, 4);


select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nome like "C%";



select * from tb_personagem inner join tb_classe
on tb_classe.id = tb_personagem.classe_id;

select * from tb_personagem inner join tb_classe
on tb_classe.id = tb_personagem.classe_id 
where tb_classe.id = 2;

select * from tb_personagem;
select * from tb_classe;



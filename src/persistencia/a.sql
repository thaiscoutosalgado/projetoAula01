use avfinal;


create or replace table avfinal.usuario (
	id bigint primary key auto_increment,
	matricula int not null,
	nome varchar(150) not null,
	cargo varchar(150) not null,
	senha varchar(255) not null
	);
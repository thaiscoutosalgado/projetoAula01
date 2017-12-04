create schema if not exists aula10;

use aula10;
create or replace table aluno(
	id bigint primary key auto_increment,
	matricula int not null,
	nome varchar(150) not null,
	email varchar(200) not null,
	nota01 float8,
	nota02 float8
	
);


desc aluno;
insert into aluno values(null, 1234, "thais", "salgadothais@gmail.com", 8.5, 10.0);

select * from aluno;
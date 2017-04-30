/*
 * mysql --user=root --password
 * drop database ontology;
 * create database ontology;
 * use ontology;
 * exit;
 * 
 * CREATE USER 'ontology'@'localhost' IDENTIFIED BY 'Ontology123_';
 * GRANT ALL PRIVILEGES ON *.* TO 'ontology'@'localhost' WITH GRANT OPTION;
 * CREATE USER 'ontology'@'%' IDENTIFIED BY 'Ontology123_';
 * GRANT ALL PRIVILEGES ON *.* TO 'ontology'@'%' WITH GRANT OPTION;

 */

create table user
(
	user_id int not null primary key,
	name varchar(250),
	org_id int not null
);


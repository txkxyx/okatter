drop database okatter;
create database okatter;
use okatter;

drop table users;
create table users(
id int primary key auto_increment,
name varchar(30) not null,
address varchar(64) not null unique,
password varchar(255) not null
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;

drop table contents;
create table contents(
id int primary key auto_increment,
name varchar(64) not null,
text varchar(300) not null,
address varchar(20) not null,
insert_time datetime not null
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
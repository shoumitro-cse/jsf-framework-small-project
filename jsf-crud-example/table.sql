create database std;
use std;

create table users (

    id int not null primary key auto_increment,
    name varchar(100),
    email varchar(50),
    password varchar(20),
    gender varchar(1),
    address text
);

create table laptops(
	id int primary key not null auto_increment,
    company varchar(255) not null,
    product varchar(255) not null,
    typename varchar(255) not null,
    inches double not null,
    screen_resolution varchar(255) not null,
    cpu varchar(255) not null,
    ram varchar(255) not null,
    memory varchar(255) not null,
    gpu varchar(255) not null,
    opsys varchar(255) not null,
    weight varchar(255) not null,
    price double not null
);
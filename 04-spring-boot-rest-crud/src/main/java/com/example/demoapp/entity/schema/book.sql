create table `book` (
	id int primary key auto_increment not null,
	title varchar(50) not null,
	year bigint not null,
	author varchar(50) not null
);

insert into `book` (title, year, author) values
("Book title 1", 2000, "Calvin The Author"),
("Book title 2", 2010, "Dany The Author"),
("Book title 3", 2020, "Nunaa The Author");
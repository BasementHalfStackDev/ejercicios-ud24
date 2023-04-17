DROP table IF EXISTS employee;

create table employee(
	id int auto_increment primary key,
	name varchar(250),
	work varchar(250),
	salary decimal(10,2)
);

insert into employee (name, work, salary)values('Josep','PROGRAMMER', 2500.00);
insert into employee (name, work, salary)values('Rose','TESTER', 1500.00);
insert into employee (name, work, salary)values('Marta','ADMINISTRATOR', 1800.00);
insert into employee (name, work, salary)values('Marc','PROGRAMMER', 2500.00);
insert into employee (name, work, salary)values('Filip','TESTER', 1500.00);
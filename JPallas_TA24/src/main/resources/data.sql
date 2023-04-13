DROP table IF EXISTS employee;

create table employee(
	id int auto_increment,
	name varchar(250),
	work varchar(250),
	salary int
);

insert into employee (name, work,salary)values('Josep','Programmer', 2500);
insert into employee (name, work,salary)values('Rose','Tester', 1500);
insert into employee (name, work,salary)values('Marta','Administrator', 1800);
insert into employee (name, work,salary)values('Marc','Programmer', 2500);
insert into employee (name, work,salary)values('Filip','Tester', 1500);
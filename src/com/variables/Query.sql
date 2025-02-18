create database interview;
create table  interview.employee(eid int(10), ename varchar(20), esalary int(20), depart varchar(10));

\\INSERT INTO statement is used to insert new records in a table.
insert into interview.employee(eid , ename, esalary, depart) values(1 ,"sai", 20000,"IT"),(2,"bhanu",30000,"JAVA"),(3,"chinni",40000,"JAVA"),(4,"chodisetti",50000,"IT"),(5,"jagannadha",45000,"JAVA");

select* from interview.employee;
select ename from interview.employee;
select eid,ename from interview.employee;

\\aggregate functions
select count(*) from interview.employee;
select avg(esalary) from interview.employee;
select sum(esalary) from interview.employee;
select min(esalary) from interview.employee;
select max(esalary) from interview.employee;

\\ where-WHERE clause is used to filter records.	
 select * from interview.employee where eid=2;
 select * from interview.employee where esalary<50000;
 select * from interview.employee where esalary between 20000 and 50000;
 select * from interview.employee where ename like s%;
 
 \\order by - sort the result-set in ascending or descending order.
 select * from interview.employee order by esalary desc;
 select * from interview.employee order by esalary asc; 
 
 \\And-AND operator is used to filter records based on more than one condition
 select * from interview.employee where esalary>20000 And ename like 's%';
 
 
\\OR-if any one condition is true 
select * from interview.employee where depart='IT' or ename like 's%';

\\NOT operator is used in combination with other operators to give the opposite result
select * from interview.employee where not depart='IT';


\\UPDATE statement is used to modify the existing records in a table.
update interview.employee set ename='sai' where depart ='IT';

\\delete all rows in a table without deleting the table
delete from interview.employee;

\\ALTER TABLE statement is used to add, delete, or modify columns in an existing table.
ALTER table interview.employee add address varchar(20);
ALTER TABLE table_name
ADD column_name datatype;
alter table interview.employee rename esalary to salary;
ALTER TABLE table_name
RENAME COLUMN old_name to new_name;











 
 
 
 
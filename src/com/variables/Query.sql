create database interview;
create table  interview.employee(eid int(10), ename varchar(20), esalary int(20), depart varchar(10));
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
 \\ where
 select * from interview.employee where eid=2;
 select * from interview.employee where esalary<50000;
 select * from interview.employee where esalary between 20000 and 50000;
 select * from interview.employee1 where ename like s%;
 \\order by means sort the order
 select * from interview.employee order by esalary desc;
 select * from interview.employee order by esalary asc; 
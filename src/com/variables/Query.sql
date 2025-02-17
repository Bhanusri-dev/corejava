create database interview;
create table  interview.employee(eid int(10), ename varchar(20), esalary int(20), depart varchar(10));
insert into interview.employee(eid , ename, esalary, depart) values(1 ,"sai", 20000,"IT"),(2,"bhanu",30000,"JAVA"),(3,"chinni",40000,"JAVA"),(4,"chodisetti",50000,"IT"),(5,"jagannadha",45000,"JAVA");
select* from interview.employee;
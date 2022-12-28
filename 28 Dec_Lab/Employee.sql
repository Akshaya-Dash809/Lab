use akshaya_lab;
create table Department(
Department_id numeric primary key,Department_Name varchar(20) unique,Department_Head varchar(30) unique,
Department_Description varchar(100) unique);
create table Employee(Employee_Id numeric primary key,Employee_Name varchar(30),Employee_Salary double,
Employee_Contact_No bigint(13) unique ,Employee_Address varchar(50),Department_Id numeric,
foreign key(Department_Id) references Department(Department_Id),check(Employee_Salary between 1000 and 1000000));

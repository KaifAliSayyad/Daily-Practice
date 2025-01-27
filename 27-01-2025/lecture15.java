Date : 27-01-2025

_________________________________________________________________________________________________________________________________
* Types of Languages
	a. Programming Language : OOP (C++, Java, .NET, etc), POP(C, ....), ....
	b. Scripting Language 	: JS, Shell, VBS, etc...
	c. Markup Language	: HTML, SGML, XML, XHML, etc...
	d. Query Language	: SQL, PL-SQL, No-SQL, XQuery, etc, ...
_________________________________________________________________________________________________________________________________
Databases

_________________________________________________________________________________________________________________________________
Their are many limitations to writing to a file. Two of the biggest are no Relationship between data and no Transaction control.

_________________________________________________________________________________________________________________________________
I. Types of Databases
	a. Flat File
	b. Network Database
	c. Heirarchical Database
	d. DBMS
	e. RDBMS
	f. ORDBMS
		
	a. SQL
	b. No-SQL

_________________________________________________________________________________________________________________________________
(** JOSN is semi-structured **)
II. 	Structured			vs			Unstructured	
     a. With labels						Without Labels
_________________________________________________________________________________________________________________________________
III.	SQL			vs			No-SQL
     a. Schema based					Schema less

_________________________________________________________________________________________________________________________________
IV. SQL Databases
a. DDL (Data Defination Language)		-	CREATE, ALTER, RENAME, DROP, TRUNCATE

b. DML (Data Manipulation Language)		-	INSERT, DELETE, UPDATE
	
c. DCL (Data Control Language)			-	GRANT, REVOKE

d. TCL (Trasaction Control Language)		-	COMMIT, ROLLBACK, SAVEPOINT
		
e. DQL/ DRL (Data Query/ Retrival Language)	-	SELECT

_________________________________________________________________________________________________________________________________
V. Using Postgres
a. \l - To list the databases
b. CREATE DATABASE '$table_name' - To create a database
c. Naming convention - snake_case
d. To create a database we have 3 methods : 
	i.	Using pgAdmin 4 console
	ii. 	Using psql shell
	iii. 	Using windows shell.
e. drop table '$table_name'
f. insert into '$table_name' values('', ...)
g. SELECT * from '$table_name'
h. Keys	-
	i. Primary Key	- A column in which all the values are unique and not null.
	ii. Foreign Key	- It is a reference to primary key.
	iii. Unique Key	- It allows null values.
	iv. Candidate Keys	- All keys which are eligible to be primary key.
	v. Alternate Key	-
	vi. Composite Key	- Combination of columns to use a key.
	vii. Surrogate Key	- Extra column generate to indentify the rows uniquely.
i. At the time of creating table, while declaring a column which needs to hold decimal values, we use 
	(SALARY decimal(8, 2)), where (8,2) indicates that it should allow total 8 digits, out of which 2 are		after decimal points.
j. Every time we commit or rollback, the transaction ends.

_________________________________________________________________________________________________________________________________
Assignment
1. create database empdb
2. create table EMPLOYEE
3. create fields
	a. EID
	b. NAME
	c. AGE (21 to 60)
	d. GENDER (MALE or FEMALE)
	e. SALARY (8, 2)
	f. DESIGNATION (PROGRAMMER, TESTER, ADMIN, MANAGER)
	g. MGR_ID (Manager id Pointing to EID)
	h. EMAIL_ID (name@company.com)
	i. MARRIED (true/ false)
	j. JOINING_DATE (current date as default)_
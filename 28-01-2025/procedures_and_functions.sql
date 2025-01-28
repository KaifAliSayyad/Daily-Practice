create or replace procedure insert_emp_record(
	e_name varchar,
	e_age smallint,
	e_salary numeric(8, 2),
	e_design designations,
	e_email_id varchar(20)
)
language plpgsql
as $$
begin
	insert into employees(name, age, salary, designation, email_id) values(e_name, e_age, e_salary, e_design, e_email_id);
end;
$$

create or replace procedure appraisal(
	id int,
	amount int
)
language plpgsql
as $$
begin
	update employees set salary = salary + amount where eid = id;
end;
$$


create or replace function max_salary(design designations)
returns table(eid int, name varchar, salary numeric(8, 2))
as $$
begin
	return query
	select e.eid, e.name, e.salary from employees e
	where e.salary = (select max(e2.salary) from employees e2 where e2.designation = design);
end;
$$ language plpgsql




	
call insert_emp_record('sam altman'::varchar, 33::smallint, 60000.00::numeric, 'TESTER'::designations, 'sam@gmail.com'::varchar);

call appraisal(121, 1200);

select * from max_salary('PROGRAMMER');

select name, salary from employees where email_id = 'sam@gmail.com';

select name, salary, rk from (select name, salary, rank() over(order by salary desc) as rk from employees) where rk = 3;

select name, salary, rk from (select name, salary, dense_rank() over(order by salary desc) as rk from employees) where rk = 5;


select name, salary, lag(salary) over() from employees;

select name, salary, lead(salary) over() from employees;


--Find all the employees having their salary greater than the average salary of their respective designation
select e1.eid, e1.name, e1.designation, e1.salary, e2.average
from employees e1
inner join 
(select designation, ROUND(avg(salary), 3) as average from employees group by designation) as e2
on e1.designation = e2.designation and e1.salary > e2.average
order by designation, (e1.salary - e2.average) desc;

--we also have another way of doing this by using CTE's (common table expressions)
with avg_sal as(
select designation, ROUND(avg(salary), 2) as avg_salary from employees group by designation
)
select e.eid, e.name, e.designation, e.salary, a.avg_salary
from employees e
join avg_sal a on 
e.designation = a.designation and e.salary > a.avg_salary
order by designation, (e.salary - a.avg_salary) desc
;



--Triggers
create or replace function validate_salary()
returns trigger as $$
begin
	if new.salary < 12000 then
		new.salary = 12000;
	end if;
	return new;
end;
$$ language plpgsql;

create trigger before_updating_salary
before update on employees
for each row
EXECUTE function validate_salary();


update employees set salary = 5000 where eid = 2;

select * from employees where eid = 2;



--Practicing trigger
create or replace function fire_employees()
returns trigger
as $$
begin
	delete from employees e where e.mgr_id = old.eid;
	return new;
end;
$$ language plpgsql;

create or replace trigger remove_employees
before delete on employees
for each row
execute function fire_employees();

select * from employees;

delete from employees where eid = 3;
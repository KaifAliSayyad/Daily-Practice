create table prodcut(
	product_id serial primary key,
	product_name varchar(100) not null,
	date date not null,
	quantity int not null
);

INSERT INTO product (product_name, date, quantity) VALUES
('p1', '2022-02-01', 100),
('p2', '2023-02-01', 150),
('p3', '2024-02-01', 200),
('p1', '2025-02-01', 120),
('p2', '2022-02-01', 130),
('p3', '2023-02-01', 80),
('p1', '2024-02-01', 90),
('p2', '2025-02-01', 110),
('p3', '2022-02-01', 140),
('p1', '2023-02-01', 75),
('p2', '2024-02-01', 160),
('p3', '2025-02-01', 180),
('p1', '2022-02-01', 200),
('p2', '2023-02-01', 50),
('p3', '2024-02-01', 70),
('p1', '2025-02-01', 220),
('p2', '2022-02-01', 250),
('p3', '2023-02-01', 160),
('p1', '2024-02-01', 130),
('p2', '2025-02-01', 90);

delete from product;


select * from product;

select EXTRACT(year from date) as year, product_name, sum(quantity)
from product 
group by year, product_name 
order by year, product_name;


select * from
  crosstab('select EXTRACT(year from date) as year, product_name, sum(quantity) 
  			from product 
			group by year, product_name 
 			order by year, product_name')
  as product(year numeric, p1 bigint, p2 bigint, p3 bigint);



select product_name, EXTRACT(year from date) as year, sum(quantity) 
		from product 
		group by product_name, year 
		order by product_name, year;


select * from
	crosstab('select product_name, (EXTRACT(year from date)::varchar) as year, sum(quantity) 
		from product 
		group by product_name, year 
		order by product_name , year ')
	as product(product_name varchar, "2022" bigint, "2023" bigint, "2024" bigint, "2025" bigint);


CREATE VIEW product_pvt AS 
select * from
	crosstab('select product_name, EXTRACT(year from date) as year, sum(quantity) 
		from product 
		group by product_name, year 
		order by year ,product_name ')
	as ct(product_name varchar, "2022" bigint, "2023" bigint, "2024" bigint, "2025" bigint)	
;

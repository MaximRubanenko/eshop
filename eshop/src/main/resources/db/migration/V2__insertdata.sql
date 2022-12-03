--insert into order_status (title) values
--('Created'),
--('Booked'),
--('Paid'),
--('Delivered'),
--('Canceled');

insert into categories (title) values
('Food'),
('Furniture'),
('Tools'),
('Music'),
('Electronics');


insert into products (title,price,category_id,enabled) values
('Bread',54.12,1,true),
('Butter',32.10,1,true),
('Milk',65.00,1,true),
('Table',700.0,2,true),
('Chair',230.0,2,true),
('Cupboard',530.50,2,true),
('Hammer',30.50,3,true),
('Piano',2300.50,4,true),
('Guitar',1700.50,4,true);



--insert into products (title,price,category_id) values
--('Bread',54.12,1),
--('Butter',32.10,1),
--('Milk',65.00,1),
--('Table',700.0,2),
--('Chair',230.0,2),
--('Cupboard',530.50,2),
--('Hammer',30.50,3),
--('Piano',2300.50,4),
--('Guitar',1700.50,4);
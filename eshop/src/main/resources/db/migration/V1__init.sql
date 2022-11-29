Create table users (
    id  bigserial primary key,
    firstname   varchar(255),
    surname     varchar(255),
    email       varchar(255),
    phone       varchar(255),
    enabled     boolean
    );

--Create table order_status(
--    id bigserial primary key,
--    title varchar(255)
--);
--
--Create table orders (
--    id bigserial primary key,
--    id_order bigint,
--    created_at timestamp default current_timestamp,
--    status_id bigint references order_status(id),
--    user_id bigint references   users(id),
--    cost    numeric(8,2)
--);


Create table address (
        id bigserial primary key,
        town    varchar(255),
        street  varchar(255),
        house   int,
        bld     int,
        flat    int
);

--create table categories (
--    id  bigserial primary key,
--    title varchar(255),
--    created_at timestamp default current_timestamp,
--    updated_at timestamp default current_timestamp,
--    enabled boolean
--);

create table products (
    id      bigserial primary key,
    title   varchar(255),
    price numeric(8,2),
--    category_id bigint references categories (id),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    enabled boolean
);

--create table products (
--    id      bigserial primary key,
--    title   varchar(255),
--    price numeric(8,2),
--    category_id bigint references categories (id),
--    created_at timestamp default current_timestamp,
--    updated_at timestamp default current_timestamp,
--    enabled boolean
--);


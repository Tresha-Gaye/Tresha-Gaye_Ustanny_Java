create schema if not exists game_store_invoicing;
use game_store_invoicing;

create table if not exists sales_tax_rate (
    state char(2) not null,
    rate decimal(3,2) not null
);

create unique index ix_state_rate on sales_tax_rate (state);

create table if not exists processing_fee (
    product_type varchar(20) not null,
    fee decimal (4,2)
);

create unique index ix_product_type_fee on processing_fee (product_type);

create table if not exists invoice (
    invoice_id int not null auto_increment primary key,
    name varchar(80) not null,
    street varchar(30) not null,
    city varchar(30) not null,
    state char(2) not null,
    zipcode varchar(5) not null,
    item_type varchar(20) not null,
    item_id int not null,
    unit_price decimal(5,2) not null,
    quantity int not null,
    subtotal decimal(5,2) not null,
    tax decimal(5,2) not null,
    processing_fee decimal (5,2) not null,
    total decimal(5,2) not null
);
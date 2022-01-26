CREATE SCHEMA shop_storage;

SET SEARCH_PATH = shop_storage;

SET CLIENT_ENCODING = 'UTF8';

CREATE TABLE shop_storage.address
(
    address_id SERIAL PRIMARY KEY,
    post       INTEGER,
    address    TEXT
);

CREATE TABLE shop_storage.user
(
    user_id          SERIAL PRIMARY KEY,
    role             VARCHAR(50)         NOT NULL,
    first_name       VARCHAR(100)        NOT NULL,
    second_name      VARCHAR(100)        NOT NULL,
    login            VARCHAR(100) UNIQUE NOT NULL,
    password         VARCHAR(100)        NOT NULL,
    email            VARCHAR(100)        NOT NULL,
    phone            VARCHAR(50),
    number_card      VARCHAR(20),
    delivery_address INTEGER REFERENCES shop_storage.address (address_id),
    black_list       INTEGER DEFAULT 0 CHECK (black_list = 0 OR black_list = 1)
);

CREATE TABLE shop_storage.category
(
    category_id SERIAL PRIMARY KEY,
    name        VARCHAR(100) UNIQUE NOT NULL,
    image       TEXT
);

CREATE TABLE shop_storage.brand
(
    brand_id SERIAL PRIMARY KEY,
    name     VARCHAR(32) UNIQUE NOT NULL
);

CREATE TABLE shop_storage.product
(
    product_id    SERIAL PRIMARY KEY,
    category_id   INTEGER REFERENCES shop_storage.category (category_id),
    brand_id      INTEGER REFERENCES shop_storage.brand (brand_id),
    product_name  VARCHAR(100) NOT NULL,
    description   TEXT,
    price         DECIMAL(8, 2),
    image_product VARCHAR(100)
);

CREATE TABLE shop_storage.order
(
    order_id         SERIAL PRIMARY KEY,
    customer_id      INTEGER REFERENCES shop_storage.user (user_id),
    delivery_address INTEGER REFERENCES shop_storage.user (user_id),
    quantity         INTEGER,
    product_id       INTEGER REFERENCES shop_storage.product (product_id),
    order_price      DECIMAL(9, 2),
    date             DATE,
    time             TIME
);

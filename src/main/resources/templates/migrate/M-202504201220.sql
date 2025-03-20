-- Create category table
--changeset rimamoktryyanto@gmail.com
CREATE TABLE category (
      id BIGSERIAL PRIMARY KEY,
      name VARCHAR(255) NOT NULL
);

-- Create product table
CREATE TABLE product (
     id BIGSERIAL PRIMARY KEY,
     code VARCHAR(50) NOT NULL UNIQUE,
     name VARCHAR(255) NOT NULL,
     price DOUBLE PRECISION NOT NULL,
     category_id BIGINT,
     FOREIGN KEY (category_id) REFERENCES category(id) ON DELETE SET NULL
);

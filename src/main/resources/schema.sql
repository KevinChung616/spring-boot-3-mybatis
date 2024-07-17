DROP TABLE IF EXISTS products;

CREATE TABLE products (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          quantity INT NOT NULL
);

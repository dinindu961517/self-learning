SHOW DATABASES ;
CREATE DATABASE din_relationships_1;

USE din_relationships_1;

CREATE TABLE customers
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name  VARCHAR(100),
    email      VARCHAR(100)
);

CREATE TABLE orders
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    order_date  DATE,
    amount      DECIMAL(8, 2),
    customer_id INT,
    FOREIGN KEY (customer_id) REFERENCES customers (id)
);


INSERT INTO customers(first_name, last_name, email)
VALUES ('Joe', 'Clark', 'clark@gmail.com'),
       ('David', 'Willey', 'DavWil@gmail.com'),
       ('Mitchel', 'Ponting', 'pont85@gmail.com'),
       ('Peter', 'Watson', 'watPe90@gmail.com'),
       ('Luke', 'George', 'geluke@gmail.com'),
       ('Will', 'Macintosh', 'mack9114@gmail.com');

INSERT INTO orders(order_date, amount, customer_id)
VALUES ('2023/08/10', 120.00, 1),
       ('2023/08/11', 220.00, 3),
       ('2023/08/11', 88.00, 2),
       ('2023/08/11', 89.00, 1),
       ('2023/08/12', 95.00, 5),
       ('2023/08/12', 110.00, 3),
       ('2023/08/12', 120.00, 2),
       ('2023/08/13', 80.00, 5);

SELECT * FROM orders;
SELECT *FROM customers;

INSERT INTO orders(order_date, amount, customer_id)
VALUES ('2023/08/10', 120.00, 10);

DROP TABLE orders;





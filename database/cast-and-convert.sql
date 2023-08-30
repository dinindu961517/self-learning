USE din_test1;

# Cast

SELECT CAST(45.36 as SIGNED);
SELECT CAST('22,09,24' as DATE) as date;


CREATE TABLE restaurant_orders
(
    order_id    INT AUTO_INCREMENT PRIMARY KEY,
    item_name   VARCHAR(45)   NOT NULL,
    quantity    VARCHAR(45)   NOT NULL,
    unit_price  DECIMAL(5, 2) NOT NULL,
    total_price DECIMAL(5, 2)
);

# DROP TABLE restuarant_orders;
ALTER TABLE restaurant_orders MODIFY quantity INT NOT NULL ;
DESC restaurant_orders;

INSERT INTO restaurant_orders(item_name, quantity, unit_price, total_price)
VALUES ('Fried Rice', 2, 1.88, unit_price * quantity),
       ('Chapatis', 5, 0.45, unit_price * quantity),
       ('Chicken Kottu', 1, 2.10, unit_price * quantity),
       ('Chicken Biriyani', 2, 1.95, unit_price * quantity),
       ('Fried Rice', 1, 1.88, unit_price * quantity),
       ('Egg Noodles', 3, 1.45, unit_price * quantity),
       ('Steam Hoppers', 30, 0.05, unit_price * quantity),
       ('Fish Rotty', 4, 0.68, unit_price * quantity),
       ('Chicken Kottu', 2, 2.10, unit_price * quantity),
       ('Fried Rice', 1, 1.88, unit_price * quantity),
       ('Chicken Noodles', 2, 1.65, unit_price * quantity),
       ('Fried Rice', 2, 1.88, unit_price * quantity);

SELECT * FROM restaurant_orders;

SELECT item_name,quantity,unit_price, CAST(total_price as decimal ) as new_price FROM restaurant_orders;
SELECT item_name,quantity,unit_price, CAST(total_price as signed ) as new_price FROM restaurant_orders;

# Convert

SELECT CONVERT(21.2456, decimal(7, 2));

SELECT CONVERT('11,10,23',datetime) as `date`;

SELECT CONVERT('23',year);
SELECT CONVERT('111445',time);


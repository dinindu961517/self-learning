SHOW DATABASES ;
CREATE DATABASE din_join_querires;
Use din_join_querires;

CREATE TABLE customers (customer_id INT AUTO_INCREMENT PRIMARY KEY ,
first_name VARCHAR(45) NOT NULL ,
last_name VARCHAR(45) NOT NULL ,
email VARCHAR(45) NULL);

CREATE TABLE orders (order_id INT AUTO_INCREMENT PRIMARY KEY ,
order_date DATE NOT NULL ,
amount DOUBLE(8,2) NOT NULL ,
customer_id INT,
FOREIGN KEY (customer_id) REFERENCES customers(customer_id));


INSERT INTO customers(first_name, last_name, email) VALUES
                                                        ('Boy','George','georgr@gmail.com'),
                                                        ('George','Michael','gm@gmail.com'),
                                                        ('David','Bowie','david@gmail.com'),
                                                        ('Blue','Steele','blue@gmail.com'),
                                                        ('Bette','Davies','bette@aol.com');


INSERT INTO orders(order_date, amount, customer_id) VALUES
                                                        ('2016-02-10',99.99,1),
                                                        ('2017-11-11',35.50,1),
                                                        ('2014-12-12',800.67,2),
                                                        ('2015-01-03',12.50,2),
                                                        ('1999-04-11',450.25,5);

SELECT * FROM customers;
SELECT * FROM orders;


#
SELECT * FROM orders WHERE customer_id=1;
SELECT * FROM customers WHERE last_name='George';


SELECT * FROM orders
WHERE customer_id= (SELECT customer_id FROM customers WHERE last_name = 'George');

#Impicit CROSS JOIN
SELECT * FROM customers,orders;
SELECT * FROM orders,customers;

# Explicit Inner Join
SELECT * FROM customers CROSS JOIN orders;
SELECT * FROM orders CROSS JOIN customers;

#Implicit Inner Join
SELECT * FROM customers,orders WHERE orders.customer_id=customers.customer_id;
SELECT first_name,last_name,order_date, amount FROM customers,orders WHERE orders.customer_id=customers.customer_id;

# Explicit Inner Join
SELECT * FROM customers INNER JOIN orders o on customers.customer_id = o.customer_id;

# Arbitrary Join - No use
SELECT  * FROM customers JOIN orders ON customers.customer_id=order_id;




DROP TABLE customers;
TRUNCATE  TABLE orders;

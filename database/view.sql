USE din_test1;
SHOW TABLES ;
SELECT * FROM customer_new;
SELECT * FROM customer;
SELECT  * FROM employee_new;
SELECT  * FROM item;
SHOW DATABASES ;
USe din_relationships_1;
SHOW TABLES ;
SELECT * FROM customers;
SELECT * FROM orders;


CREATE VIEW my_view As
SELECT customers.first_name, customers.email email, orders.id
FROM customers,
     orders
WHERE customers.id=orders.customer_id;

SELECT * FROM my_view;

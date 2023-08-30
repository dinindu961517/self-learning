USE project;

DROP DATABASE project;

SHOW DATABASES ;

# Create Table
CREATE TABLE new_test
(
    id      INT         NOT NULL,
    name    VARCHAR(25) NOT NULL,
    address VARCHAR(25) NOT NULL,
    primary key (id)
);

# Delete a Table
DROP TABLE new_test;
TRUNCATE TABLE new_test;


# Insert values
INSERT INTO new_test (id, name, address)
VALUES (1, 'Nimal', 'Panadura'),
       (2, 'Kumara', 'Galle');

SELECT * FROM new_test;

SHOW DATABASES;

USE din_test1;

# To delete recodes from tables
DELETE FROM new_test WHERE id=2;

SELECT * FROM new_test;

DELETE FROM new_test;

# To change the Table Structure

ALter TABLE new_test
    Add COLUMN (dob DATE NOT NULL);

SELECT * FROM new_test;

# TO change the name of the table
ALTER TABLE new_test RENAME TO customer;
SELECT * from customer;

# To copy a table
CREATE TABLE customer_new SELECT * FROM customer;
DESCRIBE TABLE customer_new;

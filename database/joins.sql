# SQL JOIN

# Inner Join
CREATE TABLE student_new
(
    id             INT AUTO_INCREMENT PRIMARY KEY,
    name           VARCHAR(45) NOT NULL,
    contact_number VARCHAR(15) NOT NULL,
    address        VARCHAR(45) NOT NULL,
    class VARCHAR(5) NOT NULL
);
ALTER TABLE student_new CHANGE name stu_name VARCHAR(50) NOT NULL ;
DESCRIBE student_new;

INSERT INTO student_new(name, contact_number, address, class)
VALUES ('Dinindu', '071-1528456', 'Gampaha', '6-A'),
       ('Kamindu', '074-5568954', 'Mathara', '6-B'),
       ('Pasindu', '077-1456987', 'Colombo', '7-A'),
       ('Nimal', '072-5698745', 'Gampaha', '6-A'),
       ('Kamal', '071-1554689', 'Mathara', '7-B'),
       ('Kasun', '077-789563', 'Colombo', '8-A'),
       ('Tharuka', '071-2569874', 'Gampaha', '6-A'),
       ('Dika', '077-4562879', 'Galle', '6-A'),
       ('Kamesh', '077-5698147', 'Colombo', '6-A'),
       ('Aruna', '077-7415896', 'Gampaha', '8-A'),
       ('Sunil', '077-8523691', 'Mathara', '7-A'),
       ('Pubudu', '071-5698254', 'Gampaha', '7-B'),
       ('Aruna', '071-1528457', 'Colombo', '8-A');


DELETE student;


CREATE TABLE class
(
    class_id INT PRIMARY KEY,
    name     VARCHAR(10) NOT NULL
);
INSERT INTO class(class_id, name)
VALUES (11, '6-A'),
       (12, '6-B'),
       (13, '7-A'),
       (14, '6-B'),
       (15, '8-A'),
       (16, '6-B');

SELECT * FROM student_new;
SELECT * FROM class;

SELECT id, student_new.stu_name, address, contact_number,class
FROM student_new
         INNER JOIN class ON class = class.name;

CREATE TABLE A
(
    id      INT PRIMARY KEY NOT NULL,
    name    VARCHAR(45)     NOT NULL,
    address VARCHAR(45)     NULL
);
ALTER TABLE A CHANGE  a_id a_id INT;
 ALTER TABLE B CHANGE id b_id INT;
DESCRIBE A;

CREATE TABLE B
(
    id      INT PRIMARY KEY,
    city    VARCHAR(45) NOT NULL,
    country VARCHAR(45) NOT NULL
);
SELECT * FROM A;




INSERT INTO A(id, name, address)
VALUES (1, 'nimal', 'Nittambuwa'),
       (2, 'Kamla', 'Galle'),
       (3, 'Kasun', 'Gampaha');
INSERT INTO B(id, city, country)
VALUES (1, 'London', 'England'),
       (2, 'Mumbai', 'India'),
       (3, 'Berlin', 'Germany');

SELECT a_id,name,city,country FROM A INNER  JOIN  B ON A.a_id=B.b_id;

CREATE TABLE item
(
    i_code     VARCHAR(45),
    item_name  VARCHAR(45) NOT NULL,
    item_count INT         NOT NULL,
    price      DOUBLE      NOT NULL,
    PRIMARY KEY (i_code)
);



CREATE TABLE order
(
    order_id  VARCHAR(10),
    item_code VARCHAR(45) NOT NULL,
    'quantity ' INT         NOT NULL,
    total     DOUBLE      NOT NULL,
    PRIMARY KEY (order_id)
);


DESCRIBE order;
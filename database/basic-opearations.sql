CREATE TABLE employee
(
    id     INT         NOT NULL,
    name   VARCHAR(45) NULL,
    age    VARCHAR(45) NULL,
    city   VARCHAR(45) NULL,
    salary VARCHAR(45) NULL,
    PRIMARY KEY (id)
);

INSERT INTO employee(id, name, age, city, salary)
VALUES (101, 'John', '25', 'Hydrabad', '300000'),
       (102, 'Hiran', '26', 'Chennai', '250000'),
       (103, 'Neha', '26', 'Hydrabad', '25000'),
       (104, 'Prem', '32', 'Banglore', '28000'),
       (105, 'Rohit', '27', 'Mumbai', '30000');

UPDATE employee SET salary=30000 WHERE id=101;
UPDATE employee SET salary=25000 WHERE id =102;

SELECT id,name from employee;

# addtion

SELECT id,name,salary, salary + 100000 as emp_new_salary from employee;

#substraction

SELECT id,name,salary,salary-2000 as emp_new_salary FROM employee;

# multiplication
SELECT id,name,salary,salary*09 as emp_new_salary FROM employee;
# divide
SELECT id,name,salary, salary / 2 as emp_new_salary FROM employee;

# equal to
SELECT * FROM employee WHERE salary =30000;

# not equal to
SELECT * FROM employee WHERE salary!=25000;

# greater than
SELECT * FROM employee WHERE id>102;

# less than
SELECT * FROM employee WHERE id<103;

# greater than or equal to
SELECT * FROM employee WHERE salary>=25000;

# less than or equal to
SELECT * from employee WHERE salary<=29000;

# AND
SELECT *
from employee
WHERE salary >= 28000
  AND city = 'Hydrabad';

# OR
SELECT * from employee WHERE city='Hydrabad' OR city='Banglore';

# between
SELECT *FROM employee WHERE salary BETWEEN 28000 AND 32000;

# NOT
SELECT * FROM employee WHERE NOT salary=30000;


# 2.1 Expressions

CREATE TABLE student
(
    roll_no INT AUTO_INCREMENT,
    name            VARCHAR(45) NULL,
    age             VARCHAR(45) NULL,
    city            VARCHAR(45) NULL,
    date_of_birth DATE        NULL,
    stream          VARCHAR(45) NULL,
    total_marks   VARCHAR(45) NULL,
    PRIMARY KEY (roll_no)
);

INSERT INTO student (name, age, city, date_of_birth, stream, total_marks)
VALUES ('rohan', '21', 'banglore', '1996-06-26','cse', '977'),
       ('aman', '22', 'pune', '1995-05-14', 'eee', '922'),
       ('divya', '21', 'kochi', '1996-01-20', 'cse', '955'),
       ('prateek', '20', 'chennai', '1997-02-11', 'cse', '942'),
       ('nitya', '23', 'chennai', '1994-10-12', 'it', '942'),
       ('suhan', '24', 'mumbai', '1993-08-13', 'mech', '931');

SELECT * FROM student;
TRUNCATE TABLE student;


# 2.1.1 Boolean

SELECT *FROM student WHERE true;

SELECT * FROM student WHERE total_marks=977;

# 2.1.2 numeric
SELECT * FROM student WHERE total_marks/2>480;

# Average
SELECT AVG(total_marks) FROM student;
# Sum
SELECT SUM(total_marks)/COUNT(name) FROM student;

# Date
SELECT * FROM student WHERE date_of_birth > '1996-01-01';
SELECT CURRENT_TIMESTAMP;


CREATE DATABASE project;

CREATE TABLE employee_new
(
    emp_id      INT         NOT NULL,
    epm_name    VARCHAR(45) NOT NULL,
    age         VARCHAR(45) NOT NULL,
    designation VARCHAR(45) NOT NULL,
    dob         DATE        NOT NULL,
    city        VARCHAR(45) NOT NULL,
    salary      VARCHAR(45) NOT NULL,
    PRIMARY KEY (emp_id)
);
DESCRIBE employee_new;

INSERT INTO employee_new(emp_id, epm_name, age, designation, dob, city, salary)
VALUES (101, 'rohan', '28', 'business analyst', '1995-05-20', 'mumbai', '45000'),
       (102, 'rohot', '25', 'hr manager', '1998-03-22', 'banglore', '80000'),
       (103, 'virat', '29', 'project manager', '1994-05-25', 'kolkata', '90000'),
       (104, 'amit', '27', 'qa executive', '1996-07-20', 'indore', '25000'),
       (105, 'irfan', '28', 'software engineer', '1995-06-10', 'mumbai', '30000'),
       (106, 'sharukh', '28', 'data analyst', '1995-01-10', 'pune', '45000'),
       (107, 'kumar', '30', 'hr executive', '1993-10-25', 'hudrabad', '50000'),
       (108, 'shewag', '27', 'accountant', '1996-10-20', 'chennai', '25000'),
       (109, 'prathap', '29', 'finance manger', '1994-05-20', 'chennai', '30000'),
       (110, 'kawya', '28', 'safety officer', '1995-05-20', 'ahamadabadh', '45000'),
       (111, 'mandana', '31', 'tech lead', '1992-05-20', 'delhi', '75000'),
       (112, 'megha', '28', 'software engineers', '1995-05-20', 'mumbai', '45000');


SELECT * FROM employee_new;
TRUNCATE employee_new;

# select distinct
SELECT DISTINCT designation FROM employee_new;
SELECT DISTINCT city FROM employee_new;

# count
SELECT COUNT(*) FROM employee_new;
SELECT COUNT(*) FROM employee_new where salary>45000;
SELECT COUNT(DISTINCT city) FROM employee_new;


# top/limit
SELECT * FROM employee_new LIMIT 3;
# MySQL only works limit keyword, some other DBMS works top keyword. This is show first selected records.

# order
SELECT * FROM employee_new ORDER BY salary  LIMIT 3;

# Random
SELECT * FROM employee_new ORDER BY RAND();

# IN
SELECT * FROM employee_new WHERE emp_id IN (102,105,107,119);

# date
SELECT * FROM employee_new WHERE dob < '1995-01-01';
SELECT * FROM employee_new WHERE dob BETWEEN '1994-01-01' AND '1996-01-01';

# sum
SELECT SUM(salary) FROM employee_new WHERE city='mumbai';
ALTER TABLE employee_new MODIFY salary VARCHAR(45) NULL;

INSERT INTO employee_new(emp_id, epm_name, age, designation, dob, city, salary)
VALUES (113, 'rohan', '28', 'business analyst', '1995-05-20', 'mumbai',NULL),
       (114, 'rohot', '25', 'hr manager', '1998-03-22', 'banglore',NULL);

# NULL
SELECT * FROM employee_new WHERE salary IS NULL;
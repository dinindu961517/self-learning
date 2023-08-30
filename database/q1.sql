CREATE DATABASE din_questions;
SHOW DATABASES ;

USE din_questions;

CREATE TABLE employee (Emp_Id INT PRIMARY KEY ,
Emp_Name VARCHAR(45) NOT NULL ,
Dob DATE NOT NULL ,
Age INT  NOT NULL ,
Gender ENUM('M','F') NOT NULL ,
Dep ENUM('Sales','Marketing','Tech','Production','IT','Finance','HR')NOT NULL ,
City VARCHAR(45) NOT NULL,
 Salary INT );

DROP TABLE employee;
INSERT INTO employee(Emp_Id, Emp_Name, Dob, Age, Gender, Dep, City, Salary)
VALUES (101, 'Jimmy', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'HR',
        'NY', 50000),
       (102, 'Georgia', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'IT',
        'Austin', 60000),
       (103, 'Show', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'Marketing',
        'Boston', 85000),
       (104, 'Marie', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'Finance',
        'Miami', 90000),
       (105, 'Warne', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'HR',
        'Houstan', 95000),
       (106, 'Marry', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'IT',
        'LA', 45000),
       (107, 'Angela', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'Production',
        'Seattle', 50000),
       (108, 'Jack', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'Marketing',
        'Houston', 60000),
       (109, 'Sara', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'HR',
        'Canberra', 85000),
       (110, 'Kane', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'IT',
        'Boston', 95000),
       (111, 'Amy', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'Finance',
        'Canberra', 50000),
       (112, 'Jimmy', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'Tech',
        'NY', 45000),
       (113, 'Glene', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'IT',
        'LA', 60000),
       (114, 'Jimmy', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'HR',
        'Seattle', 80000),
       (115, 'Sarah', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'F', 'Tech',
        'Austin', 85000),
       (116, 'Antonio', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'HR',
        'Boston', 65000),
       (117, 'Marcus', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'Tech',
        'LA', 60000),
       (118, 'Josh', '1996-10-30', (SELECT CONVERT(CURDATE(), YEAR)) - (SELECT CONVERT(Dob, YEAR)), 'M', 'Production',
        'Ny', 90000);


SELECT * FROM employee;

# Find The lowest salary from each department
SELECT Dep,MIN(Salary) AS Lowest_Salary FROM employee GROUP BY Dep;

# Fetch unique departments from the table
SELECT DISTINCT Dep FROM employee;

# Fetch the unique values from the departments and print their length
SELECT DISTINCT Dep as Depatments, LENGTH(Dep) as Length FROM employee;

SELECT COUNT(*) FROM employee;

# Select the departments that have more than 3 employees
SELECT Dep, COUNT(*) FROM employee GROUP BY Dep HAVING COUNT(*)>2;

# Select the employees of all the departments except the marketing
SELECT * FROM employee WHERE NOT Dep='Marketing';
SELECT * FROM employee WHERE Dep != 'Marketing';

# Select details of the employees who have born before 2005 and after 1996
SELECT * FROM employee WHERE Dob BETWEEN '1996-01-01' AND '2005-12-31';
SELECT * FROM employee WHERE Dep='HR';

# Find the third highest salary of the table
SELECT * FROM employee ORDER BY Salary DESC LIMIT 2,1;
SELECT * ,DENSE_RANK() over (ORDER BY Salary DESC ) FROM employee LIMIT 2,1;

# Print all the even numbers emp_id records in the table
SELECT * FROM employee WHERE (Emp_Id%2=1);

# Fetch number of employees per each departmnets;
SELECT Dep, COUNT(*) as No_of_employees FROM employee GROUP BY Dep;

# Fetch the employees who has two 'A' in their names
SELECT * FROM employee WHERE Emp_Name LIKE '%a%a%';

# Self Joins
CREATE Table employee2
(
    emp_id     INT PRIMARY KEY,
    emp_name   VARCHAR(45),
    salary     INT,
    manager_id INT
);

INSERT INTO employee2(emp_id, emp_name, salary, manager_id) VALUES
                                        (1,'Joe',45000,4),
                                        (2,'Smith',55000,3),
                                        (3,'Sam',65000,4),
                                        (4,'Wade',50000,3),
                                        (5,'Joerge',45000,4);

SELECT * FROM employee2;

SELECT e.emp_id, e.emp_name,e.manager_id, m.emp_name AS manager_name FROM employee2 AS e JOIN employee2 as m ON e.manager_id=m.emp_id;

SELECT e.emp_id, e.emp_name,e.manager_id, m.emp_name AS manager_name FROM employee2 AS  e JOIN employee2 AS m ON e.manager_id=m.emp_id;


# Select the employees with a same salary
SELECT salary,count(*) as no FrOM employee GROUP BY salary;
SELECT * FROM employee ORDER BY Salary;

SELECT e.Emp_Id, e.Emp_Name, e.Salary FROM employee e, employee e1 WHERE e.Salary=e1.Salary AND e.Emp_Id!= e1.Salary;

# To print twice HR department employees
SELECT emp_name, Dep FROM employee as e WHERE Dep='HR'
UNION ALL SELECT Emp_Name,Dep FROM employee as e1 WHERE e1.Dep='HR';
SELECT Emp_Name,Dep FROM employee WHERE Dep='HR'
UNION ALL
SELECT Emp_Name,Dep FROM employee WHERE Dep='HR';




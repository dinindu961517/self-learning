USE  din_test1;
SHOW TABLES;

SELECT * FROM emp_details;
SELECT  * FROM employee_new;

SELECT * FROM employee_new WHERE epm_name LIKE 'r%n';
SELECT  * FROM employee_new WHERE city LIKE '%a%';
SELECT  * FROM employee_new WHERE city LIKE 'm%i;'
# Clauses

# Where
SELECT * FROM employee_new WHERE city='mumbai';
SELECT * FROM employee_new WHERE salary<35000;
SELECT * FROM employee_new WHERE  salary BETWEEN 25000 AND 35000;

UPDATE employee_new SET salary=salary+5000 WHERE salary<35000;
SELECT * FROM employee_new;

# AND
SELECT * FROM employee_new WHERE designation='business analyst' AND salary>25000;

# as - to given alias (temporary names)
SELECT salary as new_salary FROM employee_new;

# like
SELECT * FROM employee_new WHERE epm_name LIKE 'r___n%';
SELECT * FROM employee_new WHERE epm_name LIKE '%a';


# order by
SELECT * FROM employee_new WHERE salary>30000 ORDER BY salary ASC;
SELECT * FROM employee_new ORDER BY salary DESC ;

# order by multiple
SELECT * FROM employee_new  ORDER BY  designation ASC, salary DESC ;


# update
UPDATE employee_new SET salary =45000 WHERE emp_id=105;

# delete
SELECT * FROM employee_new;
DELETE FROM employee_new where emp_id=114;


SELECT COUNT(*) FROM employee_new;
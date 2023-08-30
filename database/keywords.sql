USE din_test1;
SHOW TABLES ;

SELECT * FROM employee_new;

# ALL
SELECT * FROM employee_new
WHERE salary >ALL(SELECT salary FROM employee_new WHERE salary>78000);

# AND
SELECT * FROM employee_new WHERE salary>45000 AND epm_name LIKE 'r%';

# ANY
SELECT * FROM employee_new
WHERE salary >ALL(SELECT salary FROM employee_new WHERE salary>78000);

# BETWEEN
SELECT * FROM employee_new WHERE salary BETWEEN 45000 AND 75000;
SELECT * FROM employee_new WHERE salary>=45000 AND salary<=75000; /*This is same to the above one*/

# CASE
SELECT epm_name,CASE salary WHEN 90000 THEN 'MANAGER'
WHEN 45000 THEN 'EXECUTIVE'
ELSE 'OTHER' END AS job_role FROM employee_new;

SELECT * FROM employee_new;

# CHECK
ALTER TABLE employee_new ADD CHECK (age >=25);
INSERT INTO employee_new(emp_id, epm_name, age, designation, dob, city, salary) VALUES
                            (114, 'Kiran',24,'business analyst','1999-01-22','delhi',60000);


# EXISTS
SELECT * FROM employee_new WHERE EXISTS(SELECT salary FROM employee_new WHERE salary>80000);

# ROWNUM
SELECT *, ROW_NUMBER() over (ORDER BY salary) AS rownum FROM employee_new;



# LIMIT
SELECT * FROM employee_new LIMIT 3, 3;

# UNION
SELECT epm_name FROM employee_new  UNION  SELECT item_name FROM item;
SELECT * FROM employee WHERE id=104 UNION  SELECT * FROM employee_new WHERE emp_id=104;
SELECT * FROM A;
SELECT * FROM B;
SELECT * FROM A UNION  SELECT * FROM B;

# DateDiff
SELECT DATEDIFF(NOW(),'1996-10-30');


# With
WITH clasue1 AS ( SELECT * FROM employee WHERE City='Boston')

SELECT * FROM clasue1 WHERE Salary>85000;


DESC item;
ALTER TABLE item MODIFY i_code VARCHAR(50);
ALTER TABLE item DROP CONSTRAINT `PRIMARY`;

SELECT * FROM item;

INSERT INTO item(i_code, item_name, item_count, price) VALUES
    ('101','pencil', 50,10.00),
    ('102','pen', 60,20.00),
    ('103','eraser', 100,15.00),
    ('101','pencil', 50,10.00);

# To find the duplicates
SELECT i_code,COUNT(*) as occurences FROM item GROUP BY i_code HAVING occurences>1;

SELECT *
FROM item
WHERE i_code= (SELECT i_code
                 FROM item
                 GROUP BY i_code
                 HAVING COUNT(*) > 1);

SELECT i_code,item_name, price, COUNT(*) AS number_of_records FROM item GROUP BY i_code, item_name, price;

# SUBSTR
SELECT SUBSTR('Michale Balack',2,4);
SELECT  SUBSTRING('Dinindu',2,4);




















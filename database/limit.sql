USE din_test1;
SELECT  DISTINCT  salary from employee_new ORDER BY salary DESC limit 4,1 ;

SELECT * FROM employee_new WHERE salary = (SELECT salary FROM employee_new ORDER BY salary DESC LIMIT 0,1);

# DENSE RANK()

SELECT emp_id,epm_name,salary, DENSE_RANK() over (ORDER BY salary DESC ) as salary_rank FROM employee_new;


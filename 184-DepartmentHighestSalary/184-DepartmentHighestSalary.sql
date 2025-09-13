-- Last updated: 13/09/2025, 10:35:55
WITH cte AS
(SELECT
d.name AS "Department",e.name AS "Employee",e.salary,
MAX(salary) OVER(PARTITION BY d.name) AS "max_salary"
FROM Employee e
LEFT JOIN Department d
ON e.departmentId=d.id)

SELECT Department,Employee,salary AS "Salary"
FROM cte
WHERE max_salary = salary
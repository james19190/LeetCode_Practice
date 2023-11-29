# Write your MySQL query statement below

SELECT two.name as Employee 
FROM employee one INNER JOIN employee two ON one.id = two.managerID
WHERE one.salary < two.salary

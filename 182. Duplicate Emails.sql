# Write your MySQL query statement below

SELECT DISTINCT A.email 
FROM Person A,Person B 
WHERE A.email = B.email and A.id > B.id;

# Write your MySQL query statement below

SELECT DISTINCT d1.id
FROM Weather d1, Weather d2
WHERE DATEDIFF(d1.recordDate, d2.recordDate) = 1 AND d1.temperature > d2.temperature

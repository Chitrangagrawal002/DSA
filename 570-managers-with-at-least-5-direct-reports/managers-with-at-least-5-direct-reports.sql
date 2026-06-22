# Write your MySQL query statement below
SELECT 
    e.name
FROM Employee e 
LEFT JOIN Employee s
ON e.id = s.managerId
GROUP BY s.managerId
HAVING COUNT(s.managerId) >= 5;
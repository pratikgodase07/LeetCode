# Write your MySQL query statement below
-- Select employee name and bonus for employees with bonus < 1000 or no bonus
SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b
  ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;
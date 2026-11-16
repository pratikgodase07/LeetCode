# Write your MySQL query statement below
-- Find the largest number that appears exactly once in MyNumbers
SELECT MAX(num) AS num
FROM (
    -- Group identical numbers together and keep only those with a count of 1
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS SingleNumbers;
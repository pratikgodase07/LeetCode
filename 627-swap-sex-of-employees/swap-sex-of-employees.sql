# Write your MySQL query statement below
-- Update the sex column in-place by swapping 'm' and 'f'
UPDATE Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;
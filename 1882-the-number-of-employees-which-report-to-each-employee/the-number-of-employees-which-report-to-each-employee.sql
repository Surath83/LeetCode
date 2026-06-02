# Write your MySQL query statement below
SELECT
a.employee_id,
a.name,
COUNT(a.employee_id) AS reports_count,
ROUND(AVG(e.age), 0) AS average_age
FROM Employees e
JOIN Employees a
ON e.reports_to IS NOT NULL 
AND e.reports_to = a.employee_id
GROUP BY e.reports_to
ORDER BY employee_id ASC;
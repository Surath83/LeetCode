# Write your MySQL query statement below
SELECT 
u.name,
IFNULL(
    SUM(r.distance),
    0
) AS travelled_distance
FROM Rides r
RIGHT JOIN Users u
ON r.user_id = u.id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name ASC;
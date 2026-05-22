# Write your MySQL query statement below
SELECT x, y, z, IF(x<y+z AND y<x+z AND z<x+y, 'Yes', 'No') AS triangle
FROM Triangle;
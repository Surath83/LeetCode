# Write your MySQL query statement below
SELECT *
FROM Users
WHERE email REGEXP '^[a-zA-z0-9%+-]+@[A-Za-z]+\\.com$'
ORDER BY user_id;
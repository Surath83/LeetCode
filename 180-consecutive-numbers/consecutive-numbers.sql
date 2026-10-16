# Write your MySQL query statement below
WITH r AS (
    SELECT NUM,
           LAG(NUM, 1) OVER(ORDER BY id) AS pre_N,
           LEAD(NUM, 1) OVER(ORDER BY id) AS post_N
    FROM Logs
)
SELECT DISTINCT NUM AS ConsecutiveNums
FROM r
WHERE NUM = pre_N AND NUM = post_N;
# Write your MySQL query statement below
SELECT 
u.name AS NAME,
SUM(t.amount) AS BALANCE
FROM Transactions t
JOIN Users u
ON u.account = t.account
GROUP BY t.account, u.name
HAVING BALANCE>10000;    
# Write your MySQL query statement below
WITH user AS (
    SELECT 
    user_id,
    COUNT(*) AS prompt_count,
    AVG(tokens) AS avg_tokens
    FROM prompts
    GROUP BY user_id
    HAVING COUNT(*) >= 3
)
SELECT 
u.user_id,
u.prompt_count,
ROUND(u.avg_tokens, 2) AS avg_tokens
FROM user u
WHERE EXISTS (
    SELECT 1
    FROM prompts p
    WHERE p.user_id = u.user_id
    AND p.tokens > u.avg_tokens
)
ORDER BY avg_tokens DESC, user_id ASC;
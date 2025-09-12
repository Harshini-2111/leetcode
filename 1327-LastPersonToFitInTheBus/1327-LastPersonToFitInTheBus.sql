-- Last updated: 12/09/2025, 19:22:35
# Write your MySQL query statement below
SELECT q1.person_name
FROM Queue q1 INNER JOIN Queue q2
ON q1.turn >= q2.turn
GROUP BY q1.turn
HAVING SUM(q2.weight) <= 1000
Order by SUM(q2.weight) desc
limit 1
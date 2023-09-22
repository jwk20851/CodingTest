-- https://school.programmers.co.kr/learn/courses/30/lessons/59041

-- Oracle, MySQL 
SELECT NAME, COUNT(NAME) AS COUNT
FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME) >= 2
ORDER BY NAME;
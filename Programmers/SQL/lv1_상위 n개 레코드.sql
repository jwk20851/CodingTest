-- https://programmers.co.kr/learn/courses/30/lessons/59405

-- Oracle
SELECT NAME
FROM (
SELECT *
FROM ANIMAL_INS
ORDER BY DATETIME
)
WHERE ROWNUM = 1;

-- MySQL
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1;
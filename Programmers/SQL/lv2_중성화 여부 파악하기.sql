-- https://school.programmers.co.kr/learn/courses/30/lessons/59409

-- Oracle	CASE 문
SELECT ANIMAL_ID, NAME,
CASE WHEN 
SEX_UPON_INTAKE LIKE 'Neutered%' OR
SEX_UPON_INTAKE LIKE 'Spayed%'
THEN 'O'
ELSE 'X' END 
AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
/* 도 가능
SELECT ANIMAL_ID, NAME,
CASE WHEN SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O'
WHEN SEX_UPON_INTAKE LIKE 'Neutered%' THEN 'O'
ELSE 'X' END
AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
*/

-- MySQL	IF 문
SELECT ANIMAL_ID, NAME, IF(
SEX_UPON_INTAKE LIKE 'NEUTERED%' OR 
SEX_UPON_INTAKE LIKE 'SPAYED%','O','X'
) AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
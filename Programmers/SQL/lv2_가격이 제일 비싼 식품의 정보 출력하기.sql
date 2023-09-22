-- https://school.programmers.co.kr/learn/courses/30/lessons/131115

-- Oracle, MySQL
SELECT *
FROM FOOD_PRODUCT
WHERE PRICE = (
	SELECT MAX(PRICE)
	FROM FOOD_PRODUCT
);

-- 아래 코드들은 MAX값이 여러 개일 경우 결과가 달라짐
/*
-- Oracle 
SELECT *
FROM (
SELECT *
FROM FOOD_PRODUCT 
ORDER BY PRICE DESC
)
WHERE ROWNUM = 1;

-- MySQL
SELECT *
FROM FOOD_PRODUCT
ORDER BY PRICE DESC 
LIMIT 1;
*/ 
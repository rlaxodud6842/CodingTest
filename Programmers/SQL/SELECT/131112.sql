-- 강원도에 위치한 생산공장 목록 출력하기
SELECT FACTORY_ID,FACTORY_NAME,ADDRESS
from FOOD_FACTORY
where ADDRESS LIKE '강원도%';
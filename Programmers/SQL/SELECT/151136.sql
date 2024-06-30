-- 평균 일일 대여 요금 구하기
select round(AVG(DAILY_FEE),0)
from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV';
-- 코드를 작성해주세요
select sum(PRICE) as 'TOTAL_PRICE'
from ITEM_INFO
where RARITY like 'LEGEND'
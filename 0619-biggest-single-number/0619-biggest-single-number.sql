# Write your MySQL query statement below
select max(result.num) as num
from 
(select * , count(num) as rep
from MyNumbers
group by num) as result
where result.rep=1
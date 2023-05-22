# Write your MySQL query statement below
select l1.num as 'consecutiveNums'
from Logs l1 
join Logs l2
join logs l3
on l1.id = (l2.id -1) and l2.id = (l3.id -1)
where l1.num = l2.num and l2.num = l3.num
group by consecutiveNums
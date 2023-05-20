# Write your MySQL query statement below
select idTable.user_id, COALESCE(resultTable.confirmation_rate, 0) AS 'confirmation_rate'
from Signups as idTable
left join
(select t1.user_id, (Round((t2.confirmedCount/t1.totalCount),2)) as 'confirmation_rate'
from 
(select user_id, count(user_id) as totalCount
from Confirmations
group by user_id) as t1
join 
(select user_id, count(user_id) as confirmedCount
from Confirmations
where action='confirmed'
group by user_id) as t2
on t1.user_id=t2.user_id) as resultTable
on idTable.user_id=resultTable.user_id


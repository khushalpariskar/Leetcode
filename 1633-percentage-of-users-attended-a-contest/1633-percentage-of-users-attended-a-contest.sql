select r.contest_id, round((count(distinct r.user_id)/(select count(*) from Users))*100,2) as 'percentage'
from Register as r
group by r.contest_id
order by percentage desc, r.contest_id
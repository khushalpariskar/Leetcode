# Write your MySQL query statement below
select name from Employee e1 join
(select managerid, count(managerid) as count
from Employee 
where managerid is not null
group by managerid) as e2
on e1.id=e2.managerid
where e2.count>=5
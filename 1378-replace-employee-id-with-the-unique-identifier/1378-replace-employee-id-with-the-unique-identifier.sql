# Write your MySQL query statement below
select t2.unique_id, t1.name from employees as t1 left join employeeUNI as t2 on t1.id=t2.id;
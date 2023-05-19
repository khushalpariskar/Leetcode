# Write your MySQL query statement below
# select V1.author_id as id from Views as V1 join Views as V2 on V1.author_id=V1.viewer_id;
select distinct author_id as id from Views as v1 where v1.author_id=v1.viewer_id order by id asc;

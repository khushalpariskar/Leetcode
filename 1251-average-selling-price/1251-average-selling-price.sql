select final.product_id, round((final.sum/final.totalUnits),2) as 'average_price'
from 
(select p.product_id, sum(P.PRICE*U.UNITS) as sum, sum(u.units) as totalUnits
from prices as p
join UnitsSold as u
on p.product_id=u.product_id
WHERE p.product_id=u.product_id and DATE(u.purchase_date) BETWEEN DATE(p.start_date) AND DATE(p.end_date)
group by u.product_id) as final 
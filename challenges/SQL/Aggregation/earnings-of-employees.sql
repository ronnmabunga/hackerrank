select
    (salary * months) as earnings,
    count(*)
from
    employee
group by
    (salary * months)
order by
    earnings desc
limit
    1 offset 0;
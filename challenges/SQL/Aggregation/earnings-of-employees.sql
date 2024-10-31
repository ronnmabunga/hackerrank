-- select
--     (salary * months) as earnings,
--     count(*)
-- from
--     employee
-- group by
--     (salary * months)
-- order by
--     earnings desc
-- limit
--     1 offset 0;
-- select
--     concat(max(salary * months), " ", count(*))
select
    max(salary * months),
    count(*)
from
    employee
where
    salary * months = (
        select
            max(salary * months)
        from
            employee
    )
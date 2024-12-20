-- select
--     round(sqrt((a - c) *(a - c) + (b - d) *(b - d)), 4)
-- from
--     (
--         select
--             min(lat_n) as a,
--             min(long_w) as b,
--             max(lat_n) as c,
--             max(long_w) as d
--         from
--             station
--     );
select
    round(sqrt(power(a - b, 2) + power(c - d, 2)), 4)
from
    (
        select
            min(lat_n) as a,
            max(lat_n) as b,
            min(long_w) as c,
            max(long_w) as d
        from
            station
    ) as points
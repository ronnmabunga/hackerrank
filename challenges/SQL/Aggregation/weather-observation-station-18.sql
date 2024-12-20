-- select
--     round((abs(a - c) + abs(b - d)), 4)
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
    round(abs(a - c) + abs(b - d), 4)
from
    (
        select
            min(lat_n) as a,
            min(long_w) as b,
            max(lat_n) as c,
            max(long_w) as d
        from
            station
    ) as points
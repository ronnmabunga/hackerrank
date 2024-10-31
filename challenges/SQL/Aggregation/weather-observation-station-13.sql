-- select
--     sum(lat_n)
-- from
--     (
--         select
--             lat_n
--         from
--             station
--         where
--             lat_n > 38.7880
--             and lat_n < 137.2345
--     );
select
    truncate(sum(lat_n), 4)
from
    station
where
    lat_n > 38.788
    and lat_n < 137.2345
-- select
--     round(max(lat_n), 4)
-- from
--     (
--         select
--             lat_n
--         from
--             station
--         where
--             lat_n < 137.2345
--     );
select
    truncate(max(lat_n), 4)
from
    station
where
    lat_n < 137.2345
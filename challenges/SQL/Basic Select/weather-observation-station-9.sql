-- select
--     distinct city
-- from
--     station
-- where
--     substr(city, 1, 1) != 'A'
--     AND substr(city, 1, 1) != 'E'
--     AND substr(city, 1, 1) != 'I'
--     AND substr(city, 1, 1) != 'O'
--     AND substr(city, 1, 1) != 'U';
select
    distinct city
from
    station
where
    substring(city, 1, 1) not in ("A", "E", "I", "O", "U")
select
    distinct city
from
    station
where
    (
        substr(city, length(city), 1) != 'a'
        AND substr(city, length(city), 1) != 'e'
        AND substr(city, length(city), 1) != 'i'
        AND substr(city, length(city), 1) != 'o'
        AND substr(city, length(city), 1) != 'u'
    );
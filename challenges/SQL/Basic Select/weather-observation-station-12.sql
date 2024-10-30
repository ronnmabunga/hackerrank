select
    distinct city
from
    station
where
    (
        substr(city, 1, 1) != 'A'
        AND substr(city, 1, 1) != 'E'
        AND substr(city, 1, 1) != 'I'
        AND substr(city, 1, 1) != 'O'
        AND substr(city, 1, 1) != 'U'
    )
    AND (
        substr(city, length(city), 1) != 'a'
        AND substr(city, length(city), 1) != 'e'
        AND substr(city, length(city), 1) != 'i'
        AND substr(city, length(city), 1) != 'o'
        AND substr(city, length(city), 1) != 'u'
    );
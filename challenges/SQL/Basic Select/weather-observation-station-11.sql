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
    OR (
        substr(city, length(city), 1) != 'a'
        AND substr(city, length(city), 1) != 'e'
        AND substr(city, length(city), 1) != 'i'
        AND substr(city, length(city), 1) != 'o'
        AND substr(city, length(city), 1) != 'u'
    );

-- substring(city, length(city), 1) not in ("a", "e", "i", "o", "u")
-- or substring(city, 1, 1) not in ("A", "E", "I", "O", "U")
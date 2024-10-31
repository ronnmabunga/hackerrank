/*
 Enter your query here.
 Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
 */
select
    distinct city
from
    station
where
    substr(city, 1, 1) = 'A'
    OR substr(city, 1, 1) = 'E'
    OR substr(city, 1, 1) = 'I'
    OR substr(city, 1, 1) = 'O'
    OR substr(city, 1, 1) = 'U';

-- substring(city, 1, 1) in ("A", "E", "I", "O", "U")
/*
 Enter your query here.
 Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
 */
/* Oracle */
select
    distinct city
from
    station
where
    mod(id, 2) = 0;

-- id % 2 = 0;
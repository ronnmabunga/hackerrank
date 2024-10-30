select
    distinct city
from
    station
where
    substr(city, length(city), 1) = 'a'
    or substr(city, length(city), 1) = 'e'
    or substr(city, length(city), 1) = 'i'
    or substr(city, length(city), 1) = 'o'
    or substr(city, length(city), 1) = 'u';
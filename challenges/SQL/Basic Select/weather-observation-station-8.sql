-- select
--     distinct city
-- from
--     station
-- where
--     (
--         substr(city, 1, 1) = 'A'
--         OR substr(city, 1, 1) = 'E'
--         OR substr(city, 1, 1) = 'I'
--         OR substr(city, 1, 1) = 'O'
--         OR substr(city, 1, 1) = 'U'
--     )
--     AND (
--         substr(city, length(city), 1) = 'a'
--         OR substr(city, length(city), 1) = 'e'
--         OR substr(city, length(city), 1) = 'i'
--         OR substr(city, length(city), 1) = 'o'
--         OR substr(city, length(city), 1) = 'u'
--     );
select
    distinct city
from
    station
where
    substring(city, length(city), 1) in ("a", "e", "i", "o", "u")
    and substring(city, 1, 1) in ("A", "E", "I", "O", "U")
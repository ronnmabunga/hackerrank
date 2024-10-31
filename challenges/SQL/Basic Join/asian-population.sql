-- select
--     sum(city.population)
-- from
--     city,
--     country
-- where
--     country.continent = 'Asia'
--     and country.code = city.countrycode;
SELECT
    SUM(CITY.Population)
FROM
    CITY
    JOIN COUNTRY ON CITY.CountryCode = COUNTRY.Code
WHERE
    COUNTRY.Continent = 'Asia';

-- SELECT
--     SUM(Population)
-- FROM
--     CITY
-- WHERE
--     CountryCode IN (
--         SELECT
--             Code
--         FROM
--             COUNTRY
--         WHERE
--             Continent = 'Asia'
--     );
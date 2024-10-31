-- select
--     CC,
--     floor(avg(CP))
-- from
--     (
--         select
--             country.continent CC,
--             city.population CP
--         from
--             city,
--             country
--         where
--             city.countrycode = country.code
--     )
-- group by
--     CC;
SELECT
    DISTINCT COUNTRY.CONTINENT,
    FLOOR(AVG(CITY.POPULATION))
FROM
    CITY,
    COUNTRY
WHERE
    CITY.COUNTRYCODE = COUNTRY.CODE
GROUP BY
    COUNTRY.CONTINENT
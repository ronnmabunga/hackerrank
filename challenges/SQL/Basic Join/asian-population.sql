select
    sum(city.population)
from
    city,
    country
where
    country.continent = 'Asia'
    and country.code = city.countrycode;
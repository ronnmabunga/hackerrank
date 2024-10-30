select
    CC,
    floor(avg(CP))
from
    (
        select
            country.continent CC,
            city.population CP
        from
            city,
            country
        where
            city.countrycode = country.code
    )
group by
    CC;
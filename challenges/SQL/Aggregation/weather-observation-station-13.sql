select
    sum(lat_n)
from
    (
        select
            lat_n
        from
            station
        where
            lat_n > 38.7880
            and lat_n < 137.2345
    );
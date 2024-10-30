select
    round(min(lat_n), 4)
from
    (
        select
            lat_n
        from
            station
        where
            lat_n > 38.7780
    );
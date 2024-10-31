-- select
--     (
--         CASE
--             WHEN (
--                 (
--                     A + B + C - (
--                         CASE
--                             WHEN (
--                                 C > (
--                                     CASE
--                                         WHEN (A > B) THEN A
--                                         ELSE B
--                                     END
--                                 )
--                             ) THEN C
--                             ELSE (
--                                 CASE
--                                     WHEN (A > B) THEN A
--                                     ELSE B
--                                 END
--                             )
--                         END
--                     )
--                 ) <= (
--                     CASE
--                         WHEN (
--                             C > (
--                                 CASE
--                                     WHEN (A > B) THEN A
--                                     ELSE B
--                                 END
--                             )
--                         ) THEN C
--                         ELSE (
--                             CASE
--                                 WHEN (A > B) THEN A
--                                 ELSE B
--                             END
--                         )
--                     END
--                 )
--             ) THEN 'Not A Triangle'
--             ELSE (
--                 CASE
--                     WHEN (
--                         (A = B)
--                         AND (B = C)
--                     ) THEN 'Equilateral'
--                     ELSE (
--                         CASE
--                             WHEN (
--                                 (A = B)
--                                 OR (B = C)
--                                 OR (A = C)
--                             ) THEN 'Isosceles'
--                             ELSE 'Scalene'
--                         END
--                     )
--                 END
--             )
--         end
--     )
-- from
--     triangles;
select
    case
        when a + b <= c
        or a + c <= b
        or b + c <= a then "Not A Triangle"
        when a = b
        and b = c then "Equilateral"
        when a = b
        or a = c
        or b = c then "Isosceles"
        else "Scalene"
    end as type
from
    triangles
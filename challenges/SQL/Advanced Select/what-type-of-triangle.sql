select
    (
        CASE
            WHEN (
                (
                    A + B + C - (
                        CASE
                            WHEN (
                                C > (
                                    CASE
                                        WHEN (A > B) THEN A
                                        ELSE B
                                    END
                                )
                            ) THEN C
                            ELSE (
                                CASE
                                    WHEN (A > B) THEN A
                                    ELSE B
                                END
                            )
                        END
                    )
                ) <= (
                    CASE
                        WHEN (
                            C > (
                                CASE
                                    WHEN (A > B) THEN A
                                    ELSE B
                                END
                            )
                        ) THEN C
                        ELSE (
                            CASE
                                WHEN (A > B) THEN A
                                ELSE B
                            END
                        )
                    END
                )
            ) THEN 'Not A Triangle'
            ELSE (
                CASE
                    WHEN (
                        (A = B)
                        AND (B = C)
                    ) THEN 'Equilateral'
                    ELSE (
                        CASE
                            WHEN (
                                (A = B)
                                OR (B = C)
                                OR (A = C)
                            ) THEN 'Isosceles'
                            ELSE 'Scalene'
                        END
                    )
                END
            )
        end
    )
from
    triangles;
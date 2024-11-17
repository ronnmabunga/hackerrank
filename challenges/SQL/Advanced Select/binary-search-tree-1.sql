SELECT
    AUB.N,
    (
        CASE
            WHEN AUB.PARENTS = 0 THEN "Root"
            WHEN AUB.CHILDREN > 0
            AND AUB.PARENTS > 0 THEN "Inner"
            ELSE "Leaf"
        END
    )
FROM
    (
        SELECT
            A.N,
            COUNT(B.P) AS CHILDREN,
            COUNT(C.N) AS PARENTS
        FROM
            BST AS A
            LEFT JOIN BST AS B ON A.N = B.P
            LEFT JOIN BST AS C ON C.N = A.P
        GROUP BY
            A.N
    ) AS AUB
ORDER BY
    AUB.N
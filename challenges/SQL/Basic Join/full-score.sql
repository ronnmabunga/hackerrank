SELECT
    H.hacker_id,
    H.name
FROM
    (
        SELECT
            S.hacker_id as id,
            COUNT(S.submission_id) as rank
        FROM
            submissions S,
            challenges C,
            difficulty D
        WHERE
            S.challenge_id = C.challenge_id
            AND C.difficulty_level = D.difficulty_level
            AND D.score = S.score
        GROUP BY
            S.hacker_id
    ) F,
    hackers H
WHERE
    F.id = H.hacker_id
    AND F.rank > 1
ORDER BY
    F.rank desc,
    H.hacker_id asc;
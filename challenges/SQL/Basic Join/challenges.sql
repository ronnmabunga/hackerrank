/* primary table */
WITH TEMP AS(
    select
        oh.hacker_id as ID,
        oh.name as NAME,
        cnt.chcnt AS CHCNT
    from
        hackers oh,
        (
            select
                h.hacker_id as hid,
                count(c.challenge_id) as chcnt
            from
                hackers h,
                challenges c
            where
                h.hacker_id = c.hacker_id
            group by
                h.hacker_id
        ) cnt
    where
        oh.hacker_id = cnt.hid
)
SELECT
    TEMP.ID,
    TEMP.NAME,
    TEMP.CHCNT
FROM
    TEMP
WHERE
    TEMP.CHCNT NOT IN (
        SELECT
            TEMP.CHCNT
        FROM
            TEMP
        GROUP BY
            TEMP.CHCNT
        HAVING
            COUNT(*) > 1
            AND TEMP.CHCNT != (
                select
                    max(chcnt)
                from
                    (
                        select
                            h.hacker_id as hid,
                            count(c.challenge_id) as chcnt
                        from
                            hackers h,
                            challenges c
                        where
                            h.hacker_id = c.hacker_id
                        group by
                            h.hacker_id
                    )
            )
    )
Order by
    TEMP.CHCNT desc,
    TEMP.ID asc;
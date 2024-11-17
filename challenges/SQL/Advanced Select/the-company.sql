SELECT
    C.COMPANY_CODE,
    C.FOUNDER,
    (
        SELECT
            COUNT(DISTINCT LM.LEAD_MANAGER_CODE)
        FROM
            LEAD_MANAGER AS LM
        WHERE
            LM.COMPANY_CODE = C.COMPANY_CODE
    ) AS LMC,
    (
        SELECT
            COUNT(DISTINCT SM.SENIOR_MANAGER_CODE)
        FROM
            SENIOR_MANAGER AS SM
        WHERE
            SM.COMPANY_CODE = C.COMPANY_CODE
    ) AS SMC,
    (
        SELECT
            COUNT(DISTINCT M.MANAGER_CODE)
        FROM
            MANAGER AS M
        WHERE
            M.COMPANY_CODE = C.COMPANY_CODE
    ) AS MC,
    (
        SELECT
            COUNT(DISTINCT E.EMPLOYEE_CODE)
        FROM
            EMPLOYEE AS E
        WHERE
            E.COMPANY_CODE = C.COMPANY_CODE
    ) AS EC
FROM
    COMPANY AS C
ORDER BY
    C.COMPANY_CODE ASC;
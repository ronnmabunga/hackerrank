/*
 Enter your query here.
 Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
 */
select
    ceil(avg(salary - replace(salary, '0', '')))
from
    employees;
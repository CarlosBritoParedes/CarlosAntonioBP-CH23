USE business;


-- Revisar employee
SELECT * FROM employee;

-- ALIAS
SELECT last_name AS 'Apellido' FROM employee;

-- ALIAS ++
SELECT 
    employee_id AS 'ID',
    first_name AS 'Nombre',
    last_name AS 'Apellido',
    department AS 'Departamento'
FROM employee;

-- Filtrar por nombre
-- BUSCAR a Monika
SELECT * FROM employee
WHERE first_name = 'Monika';

-- Filtrar doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble negacion
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name;


-- Ordenamiento
-- ORDER BY
-- (embeces) Default es un orden Ascendente
SELECT * FROM employee
ORDER BY department ASC;

-- DESC
SELECT * FROM employee
ORDER BY department DESC;
-- Double Order by
SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT ¨employee
GROUP BY salary;

-- IN
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- BETWEEN
SELECT * FROM employee
WHERE salaray BETWEEN 200000 AND 500000;

-- BETWEEN
SELECT * FROM employee
WHERE salaray NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE 'B%';

SELECT * FROM employee
WHERE last_name LIKE '%A';

-- Case Sensitive
SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '%02%';
-- UPDATE INFO
UPDATE employee
	SET salary = 300000
WHERE employee_id = 5;
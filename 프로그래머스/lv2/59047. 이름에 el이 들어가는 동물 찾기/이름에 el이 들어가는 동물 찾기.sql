SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE lower(NAME) LIKE '%el%' and ANIMAL_TYPE = 'Dog'
ORDER BY NAME asc
#lab 1

SELECT film.film_id,film.title,fc.category_id,c.name
from film
JOIN film_category as fc
ON fc.film_id = film.film_id
JOIN category AS c 
ON c.category_id = fc.category_id;







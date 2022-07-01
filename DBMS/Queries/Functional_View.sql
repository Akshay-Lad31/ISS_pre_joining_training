USE classicmodels;
-- SELECT statement to get all data from customers table. 
SELECT * FROM employees;

-- DISTINCT statement to get unique country name and states.
SELECT DISTINCT country, postalCode FROM customers;

-- WHERE, AND/OR, ORDER BY, INSERT UPDATE, DELETE, INJECTION, SELECT TOP, WILDCARDS, LIKE, IN , BETWEEN, ALIASES
SELECT employeeNumber, lastName, firstName FROM employees 
WHERE reportsTo IN (SELECT employeeNumber FROM employees WHERE jobTitle = "President");

SELECT * FROM products;

-- Finding all cars made by Porsche
SELECT * FROM products
WHERE productName Like "%Porsche%"
ORDER BY buyPrice DESC;

SELECT customerNumber, COUNT(orderNumber) as Total_Orders FROM orders
WHERE orders.status = "Shipped" 
GROUP BY customerNumber;


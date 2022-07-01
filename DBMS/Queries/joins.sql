-- Type of JOIN Statements
 use classicmodels;
 
 -- INNER JOIN (get customer , their oder number and status)
 SELECT customers.customerName, orders.orderNumber, orders.status
 FROM orders
 INNER JOIN customers ON orders.customerNumber = customers.customerNumber;
 
 -- LEFT JOIN (get all orders and their status with corresponding ordered product code)
 SELECT orders.orderNumber, orders.status, orderdetails.productCode
 FROM orders
 LEFT JOIN orderdetails ON orders.orderNumber = orderdetails.orderNumber;
 
 -- RIGHT JOIN (get all customers who have placed order, null for customer who have not placed an order)
 SELECT customers.customerName, orders.orderNumber, orders.status
 FROM orders
 RIGHT JOIN customers ON orders.customerNumber = customers.customerNumber;
 
 
use classicmodels;

-- Procedure to get all product details and find the top'N' products sold.
DELIMITER &&  
CREATE PROCEDURE get_top_product_sales (IN var1 INT)  
BEGIN  
    SELECT * FROM products LIMIT var1;  
    SELECT COUNT(orderNumber) AS Quantity_Sold 
    FROM orders
    GROUP BY productCode
    ORDER BY Quantity_Sold DESC
    LIMIT var1;    
END &&  
DELIMITER ;  

-- Run the store procedure
CALL get_top_product_sales(5);
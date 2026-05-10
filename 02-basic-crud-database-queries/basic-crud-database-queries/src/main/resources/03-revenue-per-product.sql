SELECT
    Products.ProductID,
    Products.ProductName,
    SUM(OrderItems.Price * OrderItems.Quantity) AS TotalRevenue
FROM Products
INNER JOIN OrderItems ON Products.ProductID = OrderItems.ProductID
GROUP BY Products.ProductID, Products.ProductName
ORDER BY Products.ProductID ASC;

SELECT
    ProductID,
    SUM(Quantity) AS TotalQuantityOrdered
FROM OrderItems
GROUP BY ProductID
HAVING SUM(Quantity) > 1
ORDER BY ProductID ASC;

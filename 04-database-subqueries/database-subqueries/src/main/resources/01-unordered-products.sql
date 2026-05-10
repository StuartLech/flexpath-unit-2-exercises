SELECT
    ProductID,
    ProductName
FROM Products
WHERE ProductID NOT IN (
    SELECT ProductID
    FROM OrderItems
)
ORDER BY ProductID ASC;

SELECT
    Products.ProductID,
    Products.ProductName,
    Categories.CategoryName
FROM Products
LEFT JOIN Categories ON Products.CategoryID = Categories.CategoryID
ORDER BY Products.ProductID ASC;

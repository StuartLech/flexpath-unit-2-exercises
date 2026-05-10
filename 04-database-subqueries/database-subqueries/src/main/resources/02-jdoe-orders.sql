SELECT
    OrderID,
    ShippingAddress
FROM Orders
WHERE UserID = (
    SELECT UserID
    FROM Users
    WHERE UserName = 'johndoe'
)
ORDER BY OrderID DESC;

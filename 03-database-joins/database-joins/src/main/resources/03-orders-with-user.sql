SELECT
    Orders.OrderID,
    Orders.ShippingAddress,
    Users.UserName
FROM Orders
RIGHT JOIN Users ON Orders.UserID = Users.UserID
ORDER BY Orders.OrderID ASC;

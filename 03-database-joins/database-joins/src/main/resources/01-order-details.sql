SELECT
    Orders.OrderID,
    Users.FirstName,
    Users.LastName
FROM Orders
INNER JOIN Users ON Orders.UserID = Users.UserID
ORDER BY Orders.OrderID ASC;

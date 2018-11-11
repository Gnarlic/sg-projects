USE HotelReservations;

-- display reservation and customer info 
SELECT r.ReservationID, p.FirstName, p.LastName, c.PhoneNumber, c.Email, b.Total, b.Tax
From Reservation r
INNER JOIN customer c ON r.customerid = c.customerid
INNER JOIN person p ON c.personid = p.personid
INNER JOIN Bill b ON r.reservationid = b.reservationid;

-- display list of guest names
SELECT PersonID, FirstName, LastName
FROM Person;

-- display list of addons available
SELECT addonname, addonprice
FROM addons;

-- display list of rooms, their type, and rate
SELECT RoomID, t.Description, r.rateprice as RoomPrice
FROM room
INNER JOIN roomtype t ON room.typeid = t.typeid
INNER JOIN rate r ON t.typeid = r.typeid
ORDER BY roomid;

-- list of promotions
SELECT * FROM Promotion;

-- display max occupancy of each room
SELECT roomid, t.maxoccupancy
FROM room
INNER JOIN roomtype t ON room.typeid = t.typeid
ORDER BY roomid;

-- display rooms on reservation
SELECT r.reservationid, t.roomid
FROM reservation r
INNER JOIN roomreservation t ON r.reservationid = t.reservationid
ORDER BY reservationid;

-- display all amenities
SELECT * FROM amenities;
DROP DATABASE IF EXISTS HotelReservations;
CREATE DATABASE IF NOT EXISTS HotelReservations;
USE HotelReservations;

CREATE TABLE IF NOT EXISTS Reservation
	(	
		ReservationID INT NOT NULL auto_increment,
        CustomerID INT NOT NULL,
        CheckIn DATE NOT NULL,
        CheckOut DATE NOT NULL,
        PromotionID INT NULL,
        PRIMARY KEY (ReservationID)
	);
    
CREATE TABLE IF NOT EXISTS Customer
	(
		CustomerID INT NOT NULL auto_increment,
        PersonID INT NOT NULL,
        PhoneNumber VARCHAR(10) NOT NULL,
        Email VARCHAR(80) NULL,
        PRIMARY KEY (CustomerID)
	);
    
CREATE TABLE IF NOT EXISTS Room
	(
		RoomID INT NOT NULL,
        TypeID INT NOT NULL,
        RoomFloor INT NOT NULL,
        PRIMARY KEY (RoomID)
	);
    
CREATE TABLE IF NOT EXISTS RoomReservation
	(
		RoomID INT NOT NULL,
        ReservationID INT NOT NULL,
        PRIMARY KEY(RoomID, ReservationID)
	);
    
CREATE TABLE IF NOT EXISTS Guests
	(
		GuestID INT NOT NULL auto_increment,
        PersonID INT NOT NULL,
        PRIMARY KEY (GuestID)
	);
    
CREATE TABLE IF NOT EXISTS Person
	(
		PersonID INT NOT NULL auto_increment,
        FirstName VARCHAR(30) NOT NULL,
        LastNAme VARCHAR(30) NOT NULL,
        Age VARCHAR(3) NOT NULL,
        PRIMARY KEY (PersonID)
	);
    
CREATE TABLE IF NOT EXISTS GuestReservation
	(
		GuestID INT NOT NULL,
        ReservationID INT NOT NULL,
        PRIMARY KEY (GuestId, ReservationID)
	);
    
CREATE TABLE IF NOT EXISTS Amenities
	(
		AmenityID INT NOT NULL,
        AmenityDescription VARCHAR(20) NOT NULL,
        PRIMARY KEY (AmenityID)
	);
    
CREATE TABLE IF NOT EXISTS Rate
	(
		TypeID INT NOT NULL,
        RatePrice DECIMAL (10,2) NOT NULL,
        PRIMARY KEY(TypeID)
	);
    
CREATE TABLE IF NOT EXISTS RoomAmenities
	(
		RoomID INT NOT NULL,
        AmenityID INT NOT NULL,
        PRIMARY KEY (RoomID, AmenityID)
	);
    
CREATE TABLE IF NOT EXISTS Promotion
	(
		PromotionID INT NOT NULL auto_increment,
        Discount DECIMAL(10,2) NOT NULL,
        PromotionCode VARCHAR(20) NOT NULL,
        PerDayUse TINYINT(1) NOT NULL,
        PercentOff TINYINT(1) NOT NULL,
        StartDate DATE NOT NULL,
        EndDate DATE NOT NULL,
        PRIMARY KEY(PromotionID)
	);
    
CREATE TABLE IF NOT EXISTS Bill
	(
		BillID INT NOT NULL auto_increment,
        Total DECIMAL(10,2) NOT NULL,
        Tax DECIMAL(10,2) NOT NULL,
        ReservationID INT NOT NULL,
        PRIMARY KEY(BillID)
	);
    
CREATE TABLE IF NOT EXISTS AddOns
	(
		AddOnID INT NOT NULL,
        AddOnName VARCHAR(30) NOT NULL,
        AddOnPrice DECIMAL(10,2),
        PRIMARY KEY(AddOnID)
	);
    
CREATE TABLE IF NOT EXISTS BillAddOns
	(
		BillID INT NOT NULL,
        AddOnID INT NOT NULL
	);
    
CREATE TABLE IF NOT EXISTS RoomType
	(
		TypeID INT NOT NULL,
        Description VARCHAR(15) NOT NULL,
        MaxOccupancy INT NOT NULL,
        PRIMARY KEY(TypeID)
	);

ALTER TABLE customer
ADD CONSTRAINT fk_customer_guestid
FOREIGN KEY (PersonID) REFERENCES Person (PersonID);

ALTER TABLE Guests
ADD CONSTRAINT fk_Guests_PersonID
FOREIGN KEY (PersonID) REFERENCES Person (PersonID);

ALTER TABLE Reservation
ADD CONSTRAINT fk_Reservation_guestid
FOREIGN KEY (CustomerID) REFERENCES Customer (CustomerID),
ADD CONSTRAINT fk_Reservation_Promotion
FOREIGN KEY (PromotionID) REFERENCES Promotion (PromotionID);

ALTER TABLE Bill
ADD CONSTRAINT fk_Bill_Reservation
FOREIGN KEY (ReservationID) REFERENCES Reservation (ReservationID);

ALTER TABLE Room
ADD CONSTRAINT fk_Room_Type
FOREIGN KEY (TypeID) REFERENCES RoomType (TypeID);

ALTER TABLE RoomAmenities
ADD CONSTRAINT fk_RoomAmenities_Room
FOREIGN KEY (RoomID) REFERENCES Room (RoomID),
ADD CONSTRAINT fk_RoomAmenities_Amenity
FOREIGN KEY (AmenityID) REFERENCES Amenities (AmenityID);

ALTER TABLE BillAddOns
ADD CONSTRAINT fk_BillAddOns_Bill
FOREIGN KEY (BillID) REFERENCES Bill (BillID),
ADD CONSTRAINT fk_BillAddOns_AddOns
FOREIGN KEY (AddOnID) REFERENCES AddOns (AddOnID);

ALTER TABLE RoomReservation
ADD CONSTRAINT fk_RoomReservation_Room
FOREIGN KEY (RoomID) REFERENCES Room (RoomID),
ADD CONSTRAINT fk_RoomReservation_Reservation
FOREIGN KEY (ReservationID) REFERENCES Reservation (ReservationID);

INSERT INTO Person (FirstName, LastName, Age) VALUES ('Nicholas', 'Thompson', 29);
INSERT INTO Person (FirstName, LastName, Age) VALUES ('Megan', 'Thompson', 25);
INSERT INTO Person (FirstName, LastName, Age) VALUES ('Tommy', 'Heath', 71);
INSERT INTO Person (FirstName, LastName, Age) VALUES ('Rivers', 'Cuomo', 48);
INSERT INTO Person (FirstName, LastName, Age) VALUES ('David', 'Byrne', 66);
INSERT INTO Person (FirstName, LastName, Age) VALUES ('David', 'Bowie', 71);
INSERT INTO Person (FirstName, LastName, Age) VALUES ('Christopher', 'Walken', 75);

INSERT INTO Customer (PersonID, PhoneNumber, Email) VALUES (1, '5413904185', 'Gnarlitronic@gmail.com');
INSERT INTO Customer (PersonID, PhoneNumber, Email) VALUES (3, '5558675309', 'JennyIGotYourNumber@gonnamakeyoumine.com');
INSERT INTO Customer (PersonID, PhoneNumber, Email) VALUES (4, '1239874561', 'Feelslikesummer@weezer.com');
INSERT INTO Customer (PersonID, PhoneNumber, Email) VALUES (5,'2095733940', 'Onceinalifetime@talkingheads.org');
INSERT INTO Customer (PersonID, PhoneNumber, Email) VALUES (6, '4902341874', NULL);

INSERT INTO Guests (PersonID) VALUES (1);
INSERT INTO Guests (PersonID) VALUES (2);
INSERT INTO Guests (PersonID) VALUES (3);
INSERT INTO Guests (PersonID) VALUES (4);
INSERT INTO Guests (PersonID) VALUES (5);
INSERT INTO Guests (PersonID) VALUES (6);

INSERT INTO Promotion (Discount, PromotionCode, PerDayUse, PercentOff, StartDate, EndDate) VALUES (50.00, 'SWGuild50Off', 0, 0, '2018/07/01', '2018/07/31');
INSERT INTO Promotion (Discount, PromotionCode, PerDayUse, PercentOff, StartDate, EndDate) VALUES (40.00, '40Offthe4th', 0, 0, '2018/07/04', '2018/07/05');
INSERT INTO Promotion (Discount, PromotionCode, PerDayUse, PercentOff, StartDate, EndDate) VALUES (5.00, 'FrequentVisit', 0, 1, '2018/01/01', '2018/12/31');

INSERT INTO Reservation (CustomerID, CheckIn, CheckOut, PromotionID) VALUES (1, '2018/07/12', '2018/07/14', NULL);
Insert Into Reservation (CustomerID, CheckIn, CheckOut, PromotionID) VALUES (2, '2018/07/04', '2018/07/05', 2);
INSERT INTO Reservation (CustomerID, CheckIn, CheckOut, PromotionID) Values (1, '2018/08/22', '2018/08/25', NULL);

INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (1, 'Single', 1);
INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (2, 'Double', 2);
INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (3, 'Queen', 2);
INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (4, 'Double Double', 4);
INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (5, 'Double Queen', 4);
INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (6, 'King', 3);
INSERT INTO RoomType (TypeID, Description, MaxOccupancy) VALUES (7, 'Suite', 6);

INSERT INTO Rate (TypeID, RatePrice) VALUES (1, 65.00);
INSERT INTO Rate (TypeID, RatePrice) VALUES (2, 75.00);
INSERT INTO Rate (TypeID, RatePrice) VALUES (3, 80.00);
INSERT INTO Rate (TypeID, RatePrice) VALUES (4, 100.00);
INSERT INTO Rate (TypeID, RatePrice) VALUES (5, 130.00);
INSERT INTO Rate (TypeID, RatePrice) VALUES (6, 160.00);
INSERT INTO Rate (TypeID, RatePrice) VALUES (7, 220.00);

INSERT INTO AddOns (AddOnId, AddOnName, AddOnPrice) VALUES (1, 'Meal', 25.30);
INSERT INTO AddOns (AddOnId, AddOnName, AddOnPrice) VALUES (2, 'Movie', 10.00);
INSERT INTO AddOns (AddOnId, AddOnName, AddOnPrice) VALUES (3, 'Alcoholic Beverage', 5.00);
INSERT INTO AddOns (AddOnId, AddOnName, AddOnPrice) VALUES (4, 'Masseuse', 75.00);
INSERT INTO AddOns (AddOnId, AddOnName, AddOnPrice) VALUES (5, 'Personal DJ', 200.00);

INSERT INTO Bill (Total, Tax, ReservationID) VALUES (1231.20, 91.20, 1);
INSERT INTO Bill (Total, Tax, ReservationID) VALUES (151.20, 11.20, 2);
INSERT INTO BILL (Total, Tax, ReservationID) VALUES (362.12, 26.82, 3);

INSERT INTO BillAddOns (BillId, AddOnID) VALUES (2, 2);
INSERT INTO BillAddOns (BillId, AddOnID) VALUES (3, 2);
INSERT INTO BillAddOns (BillID, AddOnID) VALUES (3, 1);

INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (1, 1, 1);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (2, 1, 2);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (3, 1, 3);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (4, 1, 4);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (5, 1, 5);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (6, 1, 6);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (7, 1, 7);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (8, 2, 1);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (9, 2, 1);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (10, 2, 2);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (11, 2, 2);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (12, 2, 3);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (13, 2, 4);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (14, 2, 4);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (15, 2, 5);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (16, 2, 6);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (17, 2, 6);
INSERT INTO Room (RoomID, RoomFloor, TypeID) VALUES (18, 2, 7);

INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (1, 'Coffee');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (2, 'Cable');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (3, 'Big Screen');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (4, 'Fire Pole');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (5, 'Minibar');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (6, 'Secret Entrance');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (7, 'Kitchenette');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (8, 'Jacuzzi Tub');
INSERT INTO Amenities (AmenityID, AmenityDescription) VALUES (9, 'Dedicated Butler');

INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (1, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (1, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (1, 3);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (2, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (2, 3);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (2, 4);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (3, 5);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (3, 6);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (3, 7);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (3, 3);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (4, 9);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (5, 7);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (5, 8);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (6, 4);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (6, 9);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (7, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (7, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (7, 3);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (8, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (8, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (8, 3);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (8, 4);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (9, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (9, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (10, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (11, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (12, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (13, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (14, 4);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (14, 9);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (15, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (15, 7);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (16, 8);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (16, 7);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (16, 6);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (17, 6);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 1);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 2);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 3);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 4);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 5);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 6);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 7);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 8);
INSERT INTO RoomAmenities (RoomID, AmenityID) VALUES (18, 9);

INSERT INTO RoomReservation (RoomID, ReservationID) VALUES (18, 1);
INSERT INTO RoomReservation (RoomID, ReservationID) VALUES (17, 1);
INSERT INTO RoomReservation (RoomID, ReservationID) VALUES (1, 2);
INSERT INTO RoomReservation (RoomID, ReservationID) VALUES (2, 3);

INSERT INTO GuestReservation (GuestID, ReservationID) VALUES (1, 1);
INSERT INTO GuestReservation (GuestID, ReservationID) VALUES (2, 1);
INSERT INTO GuestReservation (GuestID, ReservationID) VALUES (3, 2);
INSERT INTO GuestReservation (GuestID, ReservationID) VALUES (1, 3);
DROP DATABASE IF EXISTS dvdlibrary;

CREATE DATABASE IF NOT EXISTS dvdlibrary;

USE dvdlibrary;

CREATE TABLE IF NOT EXISTS dvd
	(
     DvdId INT(11) NOT NULL auto_increment,
     DvdTitle VARCHAR(60) NOT NULL,
     DvdReleaseYear VARCHAR(4) NOT NULL,
     DirectorName VARCHAR(40) NOT NULL,
     StudioName VARCHAR(40),
     UserRating VARCHAR(40),
     MpaaRating VARCHAR(5),
     PRIMARY KEY (DvdId)
    )
    Engine = InnoDB;

ALTER TABLE dvd
	Modify COLUMN DvdTitle VARCHAR(60) CHARACTER SET UTF8 COLLATE utf8_general_ci,
    Modify COLUMN DirectorName VARCHAR(40) CHARACTER SET UTF8 COLLATE utf8_general_ci,
    Modify column MpaaRating VARCHAR(5) CHARACTER SET UTF8 COLLATE utf8_general_ci;
-- Create a database
CREATE DATABASE mywebapp;

-- Selecting which database to use
USE mywebapp;

-- show tables present inside the database
SHOW tables;

-- Create a table
CREATE TABLE users(
	userName VARCHAR(255) NOT NULL,
    userEmail VARCHAR(255) PRIMARY KEY ,
    userPassword VARCHAR(255) NOT NULL);

-- describe a table
DESCRIBE users;

-- Delete/Drop a table
DROP TABLE users;

-- Insert values into the table
INSERT INTO users VALUES("Harry Potter", "test@gmail.com", MD5("test123@") ),
	("Tony Stark","test2@gmail.com", MD5("test")),
    ("Sherlock Holmes","test3@gmail.com", MD5("test123"));

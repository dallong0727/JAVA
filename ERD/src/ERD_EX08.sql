
/* Drop Tables */

DROP TABLE Rend CASCADE CONSTRAINTS;
DROP TABLE Book CASCADE CONSTRAINTS;
DROP TABLE Client CASCADE CONSTRAINTS;
DROP TABLE Employee CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Book
(
	Book_Num number(10) NOT NULL,
	Book_Name varchar2(30),
	Book_Genre varchar2(30),
	Book_Price number(10),
	Book_Count number(10),
	Book_Remainder number(10),
	Book_Management_Position varchar2(30),
	Book_Management_Status varchar2(30),
	PRIMARY KEY (Book_Num)
);


CREATE TABLE Client
(
	Client_Num number(10) NOT NULL,
	Client_Name varchar2(30),
	Client_Phone_Num number(10),
	Client_Address varchar2(30),
	PRIMARY KEY (Client_Num)
);


CREATE TABLE Employee
(
	Employee_Num number(10) NOT NULL,
	Employee_Pw number(10),
	Employee_Name varchar2(30),
	PRIMARY KEY (Employee_Num)
);


CREATE TABLE Rend
(
	Rend_Num number(10) NOT NULL,
	Rend_Start_Date date DEFAULT SYSDATE,
	Rend_End_Date date DEFAULT SYSDATE,
	Rend_Rental_Fee number(10),
	Rend_Late_Fee number(10),
	Client_Num number(10) NOT NULL,
	Book_Num number(10) NOT NULL,
	PRIMARY KEY (Rend_Num)
);



/* Create Foreign Keys */

ALTER TABLE Rend
	ADD FOREIGN KEY (Book_Num)
	REFERENCES Book (Book_Num)
;


ALTER TABLE Rend
	ADD FOREIGN KEY (Client_Num)
	REFERENCES Client (Client_Num)
;




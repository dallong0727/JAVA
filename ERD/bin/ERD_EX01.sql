
/* Drop Triggers */

DROP TRIGGER TRI_board_bno;
DROP TRIGGER TRI_reply_rno;



/* Drop Tables */

DROP TABLE admins CASCADE CONSTRAINTS;
DROP TABLE reply CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE lec_order CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE members CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_board_bno;
DROP SEQUENCE SEQ_reply_rno;




/* Create Sequences */

CREATE SEQUENCE SEQ_board_bno INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_reply_rno INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE admins
(
	id varchar2(30) NOT NULL,
	updatedate date DEFAULT SYSDATE NOT NULL,
	PRIMARY KEY (id)
);


CREATE TABLE board
(
	bno number(10) NOT NULL,
	writer varchar2(30) NOT NULL,
	title varchar2(30),
	content varchar2(2000),
	regdate date DEFAULT SYSDATE,
	PRIMARY KEY (bno)
);


CREATE TABLE lecture
(
	lec_no number(10) NOT NULL,
	teacher varchar2(30),
	lec_list varchar2(30),
	PRIMARY KEY (lec_no)
);


CREATE TABLE lec_order
(
	id varchar2(30) NOT NULL,
	lec_no number(10) NOT NULL,
	orderdate date DEFAULT SYSDATE,
	PRIMARY KEY (id, lec_no)
);


CREATE TABLE members
(
	id varchar2(30) NOT NULL,
	name varchar2(30) NOT NULL,
	regdate date DEFAULT SYSDATE,
	PRIMARY KEY (id)
);


CREATE TABLE reply
(
	rno number(10) NOT NULL,
	writer varchar2(30) NOT NULL,
	bno number(10) NOT NULL,
	content varchar2(30),
	regdate date DEFAULT SYSDATE,
	PRIMARY KEY (rno)
);



/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bno)
	REFERENCES board (bno)
;


ALTER TABLE lec_order
	ADD FOREIGN KEY (lec_no)
	REFERENCES lecture (lec_no)
;


ALTER TABLE admins
	ADD FOREIGN KEY (id)
	REFERENCES members (id)
;


ALTER TABLE board
	ADD FOREIGN KEY (writer)
	REFERENCES members (id)
;


ALTER TABLE lec_order
	ADD FOREIGN KEY (id)
	REFERENCES members (id)
;


ALTER TABLE reply
	ADD FOREIGN KEY (writer)
	REFERENCES members (id)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_board_bno BEFORE INSERT ON board
FOR EACH ROW
BEGIN
	SELECT SEQ_board_bno.nextval
	INTO :new.bno
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_reply_rno BEFORE INSERT ON reply
FOR EACH ROW
BEGIN
	SELECT SEQ_reply_rno.nextval
	INTO :new.rno
	FROM dual;
END;

/





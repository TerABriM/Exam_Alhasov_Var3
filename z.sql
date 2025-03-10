CREATE TABLE Sadik_db
(code int PRIMARY KEY,
familia varchar(50),
ima varchar(50),
email varchar(50),
dolgnost varchar(50),
telefon varchar(50),
adress varchar(100));


CREATE TABLE portner_db
(code int PRIMARY KEY,
orgName varchar(50));

INSERT INTO Sadik_db (familia, ima, email, dolgnost, telefon, adress) VALUES 
('Ivanov','Ivan','ivanov@gmail.com','sadovnic','79556779934','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Ivan','ivanov@gmail.com','sadovnic','79556779934','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
('Ivanov','Rivan','rivanov@gmail.com','santehnic','79556669924','ul.Pushkina, dome Kalatushkina' ),
CREATE TABLE profeseonal
(id_bd int primary key,
FIO text,
profile varchar (30),
money_pr integer ,
age integer ,
date_work integer);

INSERT INTO profeseonal VALUES
(1,'Pipin Pipiskin','direktor',250000,46,12.3.2004),
(2,'Krokus Zlokrul','menedger',87000,43,23,23.3.2009),
(3,'Bambi Bimbambi','menedger',54000,34,2.2.2001),
(4,'Bambi Zlokrul','menedger',24000,21,23.3.2009),
(5,'Zlokrul Pipin','programist',77000,45,23.3.2009),
(6,'Zlokrul Pipin','programist',23000,22,23.3.2009),
(7,'Zlokrul Pipiskin','programist',68000,45,23.3.2009),
(8,'Pipin Bambi','programist',99000,54,23.3.2009),
(9,'Bambi Pipiskin','programist',54000,33,23.3.2009),
(10,'Krokus Pipin','testirovshik',68000,43,23.3.2009),
(11,'Krokus Pipiskin','testirovshik',78000,44,23.3.2009),
(12,'Pipin Krokus','testirovshik',130000,33,23.3.2009),
(13,'Bambi Krokus','web-programist',76000,31,23.3.2009),
(14,'Krokus Zlokrul','web-programist',56000,33,23.3.2009),
(15,'Bambi Bimbambi','web-programist',70000,43,23.3.2009),
(16,'Bambi Zlokrul','web-programist',100000,230,23.3.2009),
(17,'Zlokrul Pipin','disainer', 50000,44,23.3.2009),
(18,'Bambi Zlokrul','disainer',45000,32,23.3.2009),

SELECT * FROM profeseonal
WHERE 

CREATE DATABASE ORG;
USE ORG;
CREATE TABLE Worker(
   WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   FIRST_NAME CHAR(25),
   LAST_NAME CHAR(25),
   SALARY INT(15),
   JOINING_DATE DATETIME,
   DEPARTMENT CHAR(25)
);

INSERT INTO Worker(WORKER_ID,FIRST_NAME,LAST_NAME,SALARY,JOINING_DATE,DEPARTMENT) VALUES 
(001,'MANTU KUMAR','MORYA',100000,'2025-04-05 11:18:00','SOFTWARE DEVLOPER'),
(002,'ROHIT','KUMAR',150000,'2025-04-05 11:18:00','SOFTWARE TESTER'),
(003,'SAHIL KUMAR','CHAURASIYA',10000,'2025-04-05 11:18:00','UI/UX DEVLOPER'),
(004,'ARSHAD','ALI',120000,'2025-04-05 11:18:00','BACKEND DEVLOPER'),
(005,'ANKUR','KUMAR',60000,'2025-04-05 11:18:00','FRONTEND DEVLOPER'),
(006,'RISHABH KUMAR','MISHRA',90000,'2025-04-05 11:18:00','DATABASE ENGINEER'),
(007,'HARISHANKAR','KUMAR',80000,'2025-04-05 11:18:00','DEVOPS ENGINEER');


SELECT * FROM Worker; 
SELECT * FROM Worker WHERE SALARY >= 100000;
SELECT * FROM Worker WHERE SALARY >= 100000;

CREATE TABLE Bonus(
   WORKER_REF_ID INT,
   BONOUS_AMOUNT INT(10),
   BONOUS_DATE DATETIME,
   FOREIGN KEY (WORKER_REF_ID)
    REFERENCES Worker(WORKER_ID)
    ON DELETE CASCADE
);


INSERT INTO Bonus (WORKER_REF_ID,BONOUS_AMOUNT,BONOUS_DATE) VALUES
(001,10000,'2025-04-03 12:21:00'),
(002,20000,'2025-04-02 12:22:00'),
(003,40000,'2025-04-05 12:25:00'),
(004,60000,'2025-04-01 12:27:00'),
(005,70000,'2025-04-02 12:21:00');

SELECT * FROM Bonus;
SELECT * FROM Bonus WHERE WORKER_REF_ID=1;
TRUNCATE Bonus;        -- USE FOR REMOVE ALL ROW FROM TABLE 



CREATE TABLE Title(
  WORKER_REF_ID INT,
  WORKER_TITLE CHAR(25),
  AFFECTED_FROM DATETIME,
  FOREIGN KEY (WORKER_REF_ID)
  REFERENCES Worker(WORKER_ID)
  ON DELETE CASCADE
);

INSERT INTO Title (WORKER_REF_ID,WORKER_TITLE,AFFECTED_FROM) VALUES 
(001,'MANAGER','2025-04-05 12:34:00'),
(002,'EXECUTIVE','2025-04-03 12:34:00'),
(003,'SR.MANAGER','2025-04-04 12:34:00'),
(004,'JR.MANAGER','2025-04-01 12:34:00'),
(005,'ASST.MANAGER','2025-04-02 12:34:00');


TRUNCATE Title;

SELECT * FROM Title;




-- VARIOUS DQL



-- 1. SELECT QUARY 

SELECT * FROM Worker;
SELECT FIRST_NAME,SALARY FROM Worker;

-- 2. WHERE 

SELECT FIRST_NAME,SALARY FROM Worker WHERE WORKER_ID=1;
SELECT FIRST_NAME,SALARY FROM Worker WHERE SALARY>=100000;

-- 4. BETWEEN 

SELECT * FROM Worker WHERE SALARY BETWEEN 80000 AND 100000;

-- 4. IN   

SELECT * FROM Worker WHERE DEPARTMENT IN('DATABASE ENGINEER','DEVOPS ENGINEER','UI/UX DEVLOPER');

  --  5. AND | OR | NOT 
  
SELECT * FROM Worker WHERE SALARY > 100000 AND DEPARTMENT ='DATABASE ENGINEER';
SELECT * FROM Worker WHERE SALARY > 100000 OR DEPARTMENT ='DATABASE ENGINEER';
SELECT * FROM Worker WHERE SALARY NOT IN(100000,120000);
  

  -- 6.Patern Searching / Wildcard (‘%’, ‘_’)
  
SELECT * FROM Worker WHERE FIRST_NAME LIKE '%MA%';
SELECT * FROM Worker WHERE FIRST_NAME LIKE '_A%';

--   7.ORDER BY

-- ASSENDING ORDER

SELECT * FROM Worker ORDER BY SALARY;

-- DESSENDING ORDER

SELECT * FROM Worker ORDER BY  SALARY DESC;



-- DISTINCT

SELECT DISTINCT DEPARTMENT FROM Worker;









SELECT * FROM Worker;
 







DELETE FROM Worker WHERE WORKER_ID=001;
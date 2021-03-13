USE Javaee;

DROP TABLE IF EXISTS emp;

CREATE TABLE emp (
    empno    INT(4) PRIMARY KEY,
    ename    VARCHAR(20),
    job VARCHAR (20),
    hiredate DATE,
    sal      FLOAT(7, 2)
);

USE Javaee;

INSERT INTO emp
VALUES (6060, 'lixinghua', 'manager', '2001-09-16', 2000.30);
    INSERT
INTO emp
VALUES (7369, 'dongmingnan', 'salesperson', '2003-10-09', 1500.90);
INSERT INTO emp
VALUES (7698, 'zhanghui', 'salesperson', '2005-03-12', 800);
INSERT INTO emp
VALUES (7762, 'liuming', 'salesperson', '2005-03-09', 1000);
INSERT INTO emp
VALUES (7782, 'yangjun', 'assayer', '2006-09-01', 2500);
INSERT INTO emp
VALUES (7839, 'lixinghua', 'manager', '2006-09-01', 2500);
INSERT INTO emp
VALUES (8964, 'liqi', 'assayer', '2003-10-01', 3000);

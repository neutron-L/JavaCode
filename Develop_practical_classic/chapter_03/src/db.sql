
DROP SCHEMA IF EXISTS JavaEE;
CREATE SCHEMA JavaEE;

USE JavaEE;

DROP TABLE IF EXISTS Dept;
CREATE TABLE Dept
(
    deptno INT (2) not null,
    dname  VARCHAR(16) not null,
    loc    VARCHAR(32) not null,
    PRIMARY KEY (deptno)
);

DROP TABLE IF EXISTS emp;
CREATE TABLE emp
(
    empno    INT (4),
    ename    VARCHAR(10),
    job      VARCHAR(9),
    hiredate DATE,
    sal      float (7, 2),
    comm     float (7,2),
    primary key (empno)
);

INSERT INTO Dept VALUES (1, 'finance', 'finance`s duty');
INSERT INTO Dept VALUES (2, 'administration', 'administration`s duty');
INSERT INTO Dept VALUES (3, 'personnel', 'personnel`s duty');



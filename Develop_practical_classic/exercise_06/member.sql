USE javaee;
DROP TABLE IF EXISTS member;
PURGE RECYCLEBIN;
CREATE TABLE member(
	mid VARCHAR(50) PRIMARY KEY,
	password VARCHAR(32) NOT NULL,
	name VARCHAR(30) NOT NULL
);

INSERT INTO member(mid, password, name) VALUES("001", "110", "police man");
INSERT INTO member(mid, password, name) VALUES("002", "119", "fireman");
INSERT INTO member(mid, password, name) VALUES("003", "120", "nurse");

COMMIT;
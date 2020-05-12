DROP TABLE IF EXISTS persons;
CREATE TABLE persons (
  id         SERIAL PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30),
  address    VARCHAR(255),
  city       VARCHAR(80),
  telephone  VARCHAR(20)
);

INSERT INTO persons VALUES (1, 'Little', 'Red', '104,The Beresford Road.', 'New York', '0182951023');
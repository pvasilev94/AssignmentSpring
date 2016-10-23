CREATE TABLE citizen (
  name varchar(100) NOT NULL,
  salary INTEGER (100) NOT NULL,
  PRIMARY KEY (NAME)
);
CREATE TABLE tax (
  taxID varchar(1) NOT NULL,
  taxCategory INT (1) NOT NULL,
  taxName varchar(100) NOT NULL,
  taxRangeStart INTEGER (100) NOT NULL,
  taxRangeFinish INTEGER (100) NOT NULL,
  taxRate INTEGER (100) NOT NULL
);


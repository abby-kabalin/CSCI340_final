CREATE TABLE AK171762.COURT
(
    Number int NOT NULL
);
GO

ALTER TABLE AK171762.COURT
    ADD CONSTRAINT PK_NUMBER
        PRIMARY KEY (Number);

-- DROP TABLE AK171762.COURT;
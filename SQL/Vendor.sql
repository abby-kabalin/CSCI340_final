CREATE TABLE AK171762.VENDOR
(
    name VARCHAR(50) NOT NULL,
    type VARCHAR(50) NULL,
);
GO

ALTER TABLE AK171762.VENDOR
    ADD CONSTRAINT PK_NAME_TYPE
        PRIMARY KEY (name;

-- DROP TABLE AK171762.VENDOR;
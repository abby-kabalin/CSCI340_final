CREATE TABLE AK171762.REGION
(
    Id nchar(250) NOT NULL
);
GO

ALTER TABLE AK171762.REGION
    ADD CONSTRAINT PK_ID
        PRIMARY KEY (Id);

-- DROP TABLE AK171762.REGION;
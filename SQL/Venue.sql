CREATE TABLE AK171762.VENUE
(
    Address VARCHAR(50) NOT NULL,
    Capacity int NOT NULL,
);
GO

ALTER TABLE AK171762.VENUE
    ADD CONSTRAINT PK_ADDRESS_CAPACITY
        PRIMARY KEY (Address);

-- DROP TABLE AK171762.VENUE;
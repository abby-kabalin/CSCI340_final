CREATE TABLE AK171762.TEAM
(
    name VARCHAR(100) NOT NULL,
    Club VARCHAR(100) NOT NULL,
    Standing int NOT NULL
    );
GO

ALTER TABLE AK171762.TEAM
    ADD CONSTRAINT PK_NAME_CLUB_STANDING
        PRIMARY KEY (name);

-- DROP TABLE AK171762.TEAM;
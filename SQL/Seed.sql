-- Inserting values into the BRACKET table
INSERT INTO AK171762.BRACKET ([Level], Seeds)
VALUES
    ('Diamond', 10),
    ('Platinum', 10),
    ('Gold', 10),
    ('Silver', 10),
    ('Bronze', 10);

GO

-- Inserting data into the COURT table
INSERT INTO AK171762.COURT (Number)
VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);

GO

-- Inserting records into DIVISION table
INSERT INTO AK171762.DIVISION(type, rank)
VALUES
    ('Open','u12'),
    ('Open','u14'),
    ('Open','u16'),
    ('Open','u18'),
    ('Club', 'u12'),
    ('Club', 'u14'),
    ('Club', 'u16'),
    ('Club', 'u18');

GO

-- Inserting records into PRIZE table
INSERT INTO AK171762.PRIZE(Medal)
VALUES
    ('Diamond'),
    ('Platinum'),
    ('Gold'),
    ('Silver'),
    ('Bronze');


GO

-- Inserting records into RECRUITER table
INSERT INTO AK171762.RECRUITER(Name, Affiliate, Rank)
VALUES
    ('Allison Lawrence', 'UM', 'DI'),
    ('Dana Hallisey', 'UM', 'DI'),
    ('Tim Houk', 'MSU', 'DI'),
    ('Jerritt Elliot', 'UT Austin', 'DI'),
    ('Dani B. Kelly', 'Louisville', 'DI');

GO

-- Inserting records into REFEREE table
INSERT INTO AK171762.REFEREE(Name)
VALUES
    ('Michelle Mayo'),
    ('Kevin Hanson'),
    ('Mr. Dumb'),
    ('Mr. Blind'),
    ('Mrs. Deaf');

GO

-- Inserting records into REGION table
INSERT INTO AK171762.REGION(Id)
VALUES
    ('Mississipi'),
    ('Hawaii'),
    ('New York State'),
    ('Florida'),
    ('Washington');

GO

-- Inserting records into SPONSOR table
INSERT INTO AK171762.SPONSOR(Name, Donation)
VALUES
    ('Nike', 10000),
    ('Scheels', 100000),
    ('SportCourt LLC', 20000),
    ('VolleyballNetsRus', 50000),
    ('MHSA', 300);

GO

-- Inserting records into TEAM table
INSERT INTO AK171762.TEAM(name, Club, Standing)
VALUES
    ('Panthers', 'CVVC', 12),
    ('Tigers', 'HHCVC', 5),
    ('Hawks', 'Big Sky Volleyball CLub', 2),
    ('Wolves', 'Mountain 1', 3),
    ('Grizzlies', 'Zootown Volleyball Club', 1);

GO

-- Inserting records into TOURNAMENT table
INSERT INTO AK171762.TOURNAMENT(id)
VALUES
    ('Capital City Classic'),
    ('Northwest Invitational'),
    ('Best of the West'),
    ('Big Sky Volleyfest'),
    ('Big Thaw Invitational');

GO

-- Inserting records into VENDOR table
INSERT INTO AK171762.VENDOR(name, type)
VALUES
    ('Taste of Asia', 'Food'),
    ('RipIt', 'Apparel'),
    ('Universal Athletics', 'Apparel'),
    ('KT Tape', 'Training'),
    ('HUDL', 'Services');

GO

-- Inserting records into VENUE table
INSERT INTO AK171762.VENUE(Address, Capacity)
VALUES
    ('222 West Avenue', 600),
    ('111 East Boul.', 800),
    ('333 South Street', 1000),
    ('444 North Drive', 1300),
    ('West HS', 400);

GO

--Inserting records into WORKTEAM table
INSERT INTO AK171762.WORKTEAM(name, Club)
VALUES
    ('Eagles', 'MVA'),
    ('Hedgehogs', 'Black Hills VC'),
    ('Raptors', 'Empire VBC'),
    ('Squirrels', 'Capitol City VB'),
    ('BullDogs', 'Townsend VBC');

GO

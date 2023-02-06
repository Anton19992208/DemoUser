CREATE TABLE IF NOT EXISTS users
(
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(128) NOT NULL,
    lastname VARCHAR(128) NOT NULL,
    birthdate INT,
    role VARCHAR(32),
    email  VARCHAR(256) NOT NULL UNIQUE,
    password VARCHAR NOT NULL UNIQUE

);
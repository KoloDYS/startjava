DROP TABLE IF EXISTS Jaegers;

DROP DATABASE IF EXISTS robots;

CREATE DATABASE robots;

\c robots;

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark INTEGER,
    height INTEGER,
    weight DOUBLE PRECISION,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);

\ir init_db.sql;
\ir queries.sql;
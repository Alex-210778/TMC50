CREATE SCHEMA country_storage;

SET SEARCH_PATH = country_storage;

CREATE TABLE country_storage.language
(
    id   SERIAL PRIMARY KEY,
    name CHARACTER VARYING(20) UNIQUE NOT NULL
);

CREATE TABLE country_storage.country
(
    id          SERIAL PRIMARY KEY,
    name        CHARACTER VARYING(64) UNIQUE NOT NULL,
    population  INTEGER                      NOT NULL,
    area        INTEGER                      NOT NULL,
    language_id INTEGER REFERENCES language (id)
);

INSERT INTO language (name)
VALUES ('English'),
       ('Spanish'),
       ('Chinese'),
       ('Russian'),
       ('Arabic'),
       ('Portuguese'),
       ('French'),
       ('German'),
       ('Italian');

INSERT INTO country (name, population, area, language_id)
VALUES ('Australia', 25200000, 7686000, (SELECT id FROM language WHERE language.name = 'English')),
       ('Argentina', 43432000, 2780400, (SELECT id FROM language WHERE language.name = 'Spanish')),
       ('Belarus', 9600000, 207600, (SELECT id FROM language WHERE language.name = 'Russian')),
       ('Brazil', 204260000, 8459400, (SELECT id FROM language WHERE language.name = 'Portuguese')),
       ('Great Britain', 63047000, 243600, (SELECT id FROM language WHERE language.name = 'English')),
       ('Venezuela', 28048000, 912000, (SELECT id FROM language WHERE language.name = 'Spanish')),
       ('Russia', 142500, 17098000, (SELECT id FROM language WHERE language.name = 'Russian')),
       ('China', 1336718000, 9597000, (SELECT id FROM language WHERE language.name = 'Chinese')),
       ('USA', 316669000, 9826700, (SELECT id FROM language WHERE language.name = 'English')),
       ('Italy', 61126000, 301340, (SELECT id FROM language WHERE language.name = 'Italian')),
       ('Spain', 47043000, 505370, (SELECT id FROM language WHERE language.name = 'Spanish')),
       ('Germany', 81305900, 357020, (SELECT id FROM language WHERE language.name = 'German')),
       ('France', 65951600, 643800, (SELECT id FROM language WHERE language.name = 'French')),
       ('Portugal', 10781500, 92090, (SELECT id FROM language WHERE language.name = 'Portuguese')),
       ('Egypt', 83688200, 1001450, (SELECT id FROM language WHERE language.name = 'Arabic')),
       ('Iraq', 31129200, 438320, (SELECT id FROM language WHERE language.name = 'Arabic')),
       ('Austria', 8753400, 83870, (SELECT id FROM language WHERE language.name = 'German')),
       ('Monaco', 30500, 2, (SELECT id FROM language WHERE language.name = 'French')),
       ('Congo', 4366270, 342000, (SELECT id FROM language WHERE language.name = 'French')),
       ('Qatar', 1951600, 11590, (SELECT id FROM language WHERE language.name = 'Arabic'));

SELECT c.name, c.population
FROM country c
WHERE population > 50000000;

SELECT c.name, c.area
FROM country c
ORDER BY area;

UPDATE country
SET language_id = (SELECT id FROM language WHERE language.name = 'English')
WHERE name = 'Monaco';

DELETE
FROM country
WHERE population = (SELECT MAX(population) FROM country);

SELECT SUM(population) AS sum_min_population
FROM (SELECT population
      FROM country
      ORDER BY population
      LIMIT 5) AS sum;

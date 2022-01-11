CREATE SCHEMA book_storage;

SET SEARCH_PATH = book_storage;

CREATE TABLE genre
(
    id         SERIAL PRIMARY KEY,
    name_genre CHARACTER VARYING(64) UNIQUE NOT NULL
);

CREATE TABLE book
(
    id           SERIAL PRIMARY KEY,
    name_book    CHARACTER VARYING(256) UNIQUE    NOT NULL,
    number_pages INTEGER CHECK (number_pages > 0) NOT NULL,
    genre_id     INTEGER REFERENCES book_storage.genre (id)
);

CREATE TABLE nationality
(
    id               SERIAL PRIMARY KEY,
    name_nationality CHARACTER VARYING(64) UNIQUE NOT NULL
);

CREATE TABLE author
(
    id             SERIAL PRIMARY KEY,
    name_author    CHARACTER VARYING(256) UNIQUE NOT NULL,
    date_of_birth  DATE                          NOT NULL,
    nationality_id INTEGER REFERENCES book_storage.nationality (id)
);

CREATE TABLE author_book
(
    author_id INTEGER REFERENCES book_storage.author (id),
    book_id   INTEGER REFERENCES book_storage.book (id),
    PRIMARY KEY (author_id, book_id)
);

INSERT INTO genre (name_genre)
VALUES ('Novel'),
       ('Piece'),
       ('Mystery'),
       ('Prose'),
       ('Story');

INSERT INTO nationality (name_nationality)
VALUES ('Russian'),
       ('English'),
       ('Belarus'),
       ('French');

INSERT INTO book (name_book, number_pages, genre_id)
VALUES ('The Twelve Chairs', 273, (SELECT id FROM genre WHERE name_genre = 'Novel')),
       ('Island of peace', 51, (SELECT id FROM genre WHERE name_genre = 'Piece')),
       ('The Floating Admiral', 225, (SELECT id FROM genre WHERE name_genre = 'Mystery')),
       ('Murder on the Orient Express', 220, (SELECT id FROM genre WHERE name_genre = 'Mystery')),
       ('Ten Little Niggers', 253, (SELECT id FROM genre WHERE name_genre = 'Mystery')),
       ('The Napoleon of Notting Hill', 140, (SELECT id FROM genre WHERE name_genre = 'Prose')),
       ('Alpine Ballad', 21, (SELECT id FROM genre WHERE name_genre = 'Story')),
       ('Trouble sign', 239, (SELECT id FROM genre WHERE name_genre = 'Story')),
       ('The Three Musketeers', 385, (SELECT id FROM genre WHERE name_genre = 'Novel')),
       ('The Count of Monte Cristo', 692, (SELECT id FROM genre WHERE name_genre = 'Novel'));

INSERT INTO author (name_author, date_of_birth, nationality_id)
VALUES ('Ilya Ilf', '1897-12-03', (SELECT id FROM nationality WHERE name_nationality = 'Russian')),
       ('Evgeny Petrov', '1902-11-30', (SELECT id FROM nationality WHERE name_nationality = 'Russian')),
       ('Agatha Christie', '1890-09-15', (SELECT id FROM nationality WHERE name_nationality = 'English')),
       ('Gilbert Keith Chesterton', '1874-05-29', (SELECT id FROM nationality WHERE name_nationality = 'English')),
       ('Dorothy Leigh Sayers', '1893-06-13', (SELECT id FROM nationality WHERE name_nationality = 'English')),
       ('Ronald Arbuthnott Knox', '1888-02-17', (SELECT id FROM nationality WHERE name_nationality = 'English')),
       ('Vasil Bykov', '1924-06-19', (SELECT id FROM nationality WHERE name_nationality = 'Belarus')),
       ('Alexandr Duma', '1802-07-24', (SELECT id FROM nationality WHERE name_nationality = 'French'));

INSERT INTO author_book (author_id, book_id)
VALUES ((SELECT id FROM author WHERE name_author = 'Ilya Ilf'),
        (SELECT id FROM book WHERE name_book = 'The Twelve Chairs')),
       ((SELECT id FROM author WHERE name_author = 'Evgeny Petrov'),
        (SELECT id FROM book WHERE name_book = 'The Twelve Chairs')),
       ((SELECT id FROM author WHERE name_author = 'Evgeny Petrov'),
        (SELECT id FROM book WHERE name_book = 'Island of peace')),
       ((SELECT id FROM author WHERE name_author = 'Agatha Christie'),
        (SELECT id FROM book WHERE name_book = 'The Floating Admiral')),
       ((SELECT id FROM author WHERE name_author = 'Gilbert Keith Chesterton'),
        (SELECT id FROM book WHERE name_book = 'The Floating Admiral')),
       ((SELECT id FROM author WHERE name_author = 'Dorothy Leigh Sayers'),
        (SELECT id FROM book WHERE name_book = 'The Floating Admiral')),
       ((SELECT id FROM author WHERE name_author = 'Ronald Arbuthnott Knox'),
        (SELECT id FROM book WHERE name_book = 'The Floating Admiral')),
       ((SELECT id FROM author WHERE name_author = 'Agatha Christie'),
        (SELECT id FROM book WHERE name_book = 'Murder on the Orient Express')),
       ((SELECT id FROM author WHERE name_author = 'Agatha Christie'),
        (SELECT id FROM book WHERE name_book = 'Ten Little Niggers')),
       ((SELECT id FROM author WHERE name_author = 'Gilbert Keith Chesterton'),
        (SELECT id FROM book WHERE name_book = 'The Napoleon of Notting Hill')),
       ((SELECT id FROM author WHERE name_author = 'Vasil Bykov'),
        (SELECT id FROM book WHERE name_book = 'Alpine Ballad')),
       ((SELECT id FROM author WHERE name_author = 'Vasil Bykov'),
        (SELECT id FROM book WHERE name_book = 'Trouble sign')),
       ((SELECT id FROM author WHERE name_author = 'Alexandr Duma'),
        (SELECT id FROM book WHERE name_book = 'The Three Musketeers')),
       ((SELECT id FROM author WHERE name_author = 'Alexandr Duma'),
        (SELECT id FROM book WHERE name_book = 'The Count of Monte Cristo'));

SELECT a.name_author AS book_author, b.name_book AS book_name
FROM author_book ab
         JOIN author a ON a.id = ab.author_id
         JOIN book b ON b.id = ab.book_id;

SELECT a.name_author AS book_author, b.name_book AS book_name, n.name_nationality AS nationality
FROM author_book ab
         JOIN author a ON a.id = ab.author_id
         JOIN nationality n on n.id = a.nationality_id
         JOIN book b ON b.id = ab.book_id
WHERE n.name_nationality LIKE 'English'
GROUP BY n.name_nationality, book_author, book_name;

SELECT b.name_book AS book_name, a.name_author AS book_author, a.date_of_birth AS author_birthday
FROM author_book ab
         JOIN book b ON b.id = ab.book_id
         JOIN author a ON a.id = ab.author_id
WHERE EXTRACT(YEAR FROM a.date_of_birth) > 1900;

DELETE
FROM author_book ab
WHERE ab.book_id IN (SELECT b.id FROM book b WHERE name_book LIKE 'Trouble sign');

SELECT a.name_author       AS book_author,
       a.date_of_birth     AS author_birthday,
       n.name_nationality  AS nationality,
       AVG(b.number_pages) AS avg_pages
FROM author_book ab
         JOIN author a ON a.id = ab.author_id
         JOIN nationality n on n.id = a.nationality_id
         JOIN book b ON b.id = ab.book_id
GROUP BY book_author, nationality, author_birthday
ORDER BY author_birthday;

SELECT a.name_author AS book_author, n.name_nationality AS nationality, AVG(b.number_pages) AS avg_pages
FROM author_book ab
         JOIN author a ON a.id = ab.author_id
         JOIN nationality n ON n.id = a.nationality_id
         JOIN book b on b.id = ab.book_id
GROUP BY book_author, nationality
HAVING AVG(b.number_pages) > 300;

SELECT a.name_author                        AS book_author,
       AVG(b.number_pages)                  AS avg_pages,
       (SELECT AVG(number_pages) FROM book) AS avg_all_pages
FROM author_book ab
         JOIN author a ON a.id = ab.author_id
         JOIN book b ON b.id = ab.book_id
GROUP BY book_author
HAVING AVG(b.number_pages) > (SELECT AVG(number_pages) FROM book)
ORDER BY avg_pages;
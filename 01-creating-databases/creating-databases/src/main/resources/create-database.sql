CREATE TABLE books (
    book_id int,
    title Varchar(255),
    author_id int,
    genre_id int,
    publication_year int
);

INSERT INTO books (book_id, title, author_id, genre_id, publication_year)
VALUES(1, 'The Great Gatsby',1, 1, 1925),
      (2, 'To Kill a Mockingbird', 2, 2, 1960),
      (3, '1984', 3, 3, 1949),
      (4, 'Pride and Prejudice', 4, 4, 1813),
      (5, 'The Catcher in the Rye', 5, 5, 1951);

CREATE TABLE authors (
    author_id int,
    name Varchar(255),
    birth_year int,
    country Varchar(255)
);

insert into authors(author_id, name, birth_year, country)
values(1, 'F. Scott Fitzgerald', 1896, 'USA'),
(2, 'Harper Lee', 1926, 'USA'),
(3, 'George Orwell', 1903, 'UK'),
(4, 'Jane Austen', 1775, 'UK'),
(5, 'J.D. Salinger', 1919, 'USA');

CREATE TABLE members (
    member_id int,
    name varchar(255),
    join_date DATE
);

insert into members (member_id, name, join_date)
values(1, 'Alice Smith', '2020-01-01'),
      (2, 'Bob Johnson', '2020-01-15'),
      (3, 'Charlie Brown', '2020-02-01');

CREATE TABLE loans (
    loan_id int,
    book_id int,
    member_id int,
    loan_date DATE,
    return_date DATE
);

insert into loans(loan_id, book_id, member_id, loan_date, return_date)
values (1, 1, 1, '2020-01-01', '2020-01-15'),
       (2, 2, 2, '2020-01-15', '2020-02-01'),
       (3, 3, 3, '2020-02-01', null);

CREATE TABLE genres(
    genre_id int,
    name Varchar(255)
);

insert into genres (genre_id, name)
values(1, 'Fiction'),
(2, 'Mystery'),
(3, 'Dystopian'),
(4, 'Romance'),
(5, 'Coming of Age');

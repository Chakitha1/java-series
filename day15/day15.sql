-- Display title after replacing all spaces with (dots) and (hypens) with (stars). 
select * from authors
select * from titles
select * from publishers
select * from titleauthor
select title, replace(replace(title, ' ', '.'), '-', '*') as modified_title from titles;
-- Display title by Removing all spaces. 
select title, replace(title, ' ', '') as no_spaced_title from titles
-- Display first word in the title. 
select title, left(title, charindex(' ', title)-1 ) as first_word from titles 
-- Display month and no of books published.
select month(pubdate) as month, count(title_id) as no_of_books from titles group by month(pubdate) 
-- Display title publisher name for titles where the publisher is in USA.
select title, pub_name, country from titles inner join publishers on titles.pub_id = publishers.pub_id where country = 'USA'
-- Display publisher name and average price of books. 
select pub_name, avg(price) as avg_price_of_books from titles inner join publishers on titles.pub_id = publishers.pub_id group by pub_name 
-- Display City of author and then no of books written by authors in the City. 
select city , count(title_id) as no_of_books from titleauthor inner join authors on titleauthor.au_id = authors.au_id group by city 
-- Display author name, title for all authors including the once without a title. 
select au_fname as author_name, title from titleauthor inner join authors on titleauthor.au_id = authors.au_id inner join titles on titleauthor.title_id = titles.title_id
-- Display title publisher name and author name of the primary author. 
-- select title, pub_name, au_fname as author_name from 
-- Display City of publisher and maximum price & all titles.
select city, max(price) as max_price, title from titles right join publishers on titles.pub_id = publishers.pub_id group by title, city 
-- Display titles written by any author in City (menlo park). 
select title, au_fname as author_name, city from titleauthor inner join titles on titleauthor.title_id = titles.title_id inner join authors on titleauthor.au_id = authors.au_id where city='Menlo Park'
-- Display publishers who published titles in 1991. 
select pub_name, year(pubdate) as year from titles inner join publishers on titles.pub_id = publishers.pub_id where year(pubdate) = 1991 
-- Display titles not published in USA. 
select title, country from titles right join publishers on titles.pub_id = publishers.pub_id where country != 'USA' 
-- Display titles either published in USA (or) having price <5.
select title, country, price from titles join publishers on titles.pub_id = publishers.pub_id where country = 'USA' or price < 5 
-- create a view to contain title, publisher, year of publishing, price and type. Make sure when price is null display zero and type is null display Zero.
-- create view ImaginaryTable(title, publisher, year_of_publishing, price, type) as
select
    title,
    isnull(pub_name, 'Zero') as publisher,
    year(pubdate) as year_of_publishing,
    isnull(convert(varchar, price), 'Zero') as price,
    isnull(type, 'Zero') as type
from
    titles left join publishers ON titles.pub_id = publishers.pub_id;
-- Display publishers who published books by author who wrote more than 2 titles.
-- select pub_name, as publisher from publishers inner join titles on 
-- 17. Delete rows from titleauthor for author with first_name as dean.
delete from titleauthor where au_id IN (select au_id from authors where au_fname = 'Dean');
-- 18. Update the price of the book BU1111 with the Price of book MC2222.
update titles
set price = (select price from titles where title_id = 'MC2222')
where title_id = 'BU1111';
-- 19. Display titles published in last 25 years.
select title, pubdate from titles where pubdate >= DATEADD(year, -25, GETDATE());
-- 20. Display titles published by any publisher who published a title in 2021.
select title from titles where year(pubdate) = 2021
-- 21. Create a view to display publisher name, city, and no of books published.
create view anotherview as 
select pub_name, city, count(title_id) as no_of_books_published
from titles inner join publishers ON titles.pub_id = publishers.pub_id group by title_id 
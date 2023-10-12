-- Add new column to products table that stores tax rate for the products update tax rate to 12% to all products.
ALTER TABLE products
ADD tax_rate int
UPDATE products
SET tax_rate = 12;
select * from authors
-- Display tiles that End with 's'/'t'.
select title from titles where title like '%s' or title like '%t'
-- Display books of type business, psychology & undecided.
select * from titles where type in ('business', 'psychology', 'UNDECIDED')
-- Display titles where the sales>5,000 & royality<20.
select title, royalty, ytd_sales from titles where royalty < 20 and ytd_sales > 5000
-- Display titles in the ascending of sales for publisher 0736.
select pub_id, title, ytd_sales from titles where pub_id = 0736 order by ytd_sales
-- Display the difference between maximum & minimum royality of books published day publisher 0877.
select (max(royalty)-min(royalty)) as royalty_difference from titles where pub_id = 0877
-- Display author_id & no of books written by Author. 
select au_id, count(title_id) as no_of_books from titleauthor group by au_id
-- Display how many authors are there for each title.
select title_id, count(au_id) as no_of_authors from titleauthor group by title_id
-- Display average royality % for authors with order 1.
select au_id, avg(royaltyper) as avg_royalty from titleauthor where au_ord = 1 group by au_id
-- Display titles in the order of price if sales are in the range 10k to 20k. 
select title, price from titles where 10000<=ytd_sales and ytd_sales<= 20000 order by price
-- Display how many authors are in the city Menlo park. 
select city, count(au_id) as no_of_authors from authors where city = 'Menlo Park' group by city
-- Display state and no of authors we have in the state in the order of state.
select state, count(au_id) as no_of_authors from authors group by state order by state
-- Display States in which we have more than 2 authors, with 1st name starting with 's'.
select state from authors where au_fname like 's%' group by state having count(au_id)>2
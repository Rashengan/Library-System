create table Category(CategoryID identity primary key, CategoryName VARCHAR(50));

create table Authors(AuthorsID identity primary key, AuthorsName VARCHAR(50));

create table Book(BookID identity primary key, BookName VARCHAR(50),ReleaseDate integer, Publisher VARCHAR(50), Page integer, Summary VARCHAR(800));

create table User(UserID identity primary key, FirstName VARCHAR(50), LastName VARCHAR(50),UserName VARCHAR(50), Email VARCHAR(50), Password integer, Phone integer);

create table Book_Auth(aid BIGINT, 
				       bid BIGINT,
				       foreign key(aid) references Authors(AuthorsID),
				       foreign key(bid) references Book(BookID));
-- Select the 'college' database for subsequent operations. 
-- This assumes:
-- A database named 'college' exists within your database system.
-- The 'college' database contains tables relevant to your tasks.
use college;
create table student (
  id int primary key,
  name varchar (50),
  age int not null
);
create database if not exists quiz;
 
use quiz;
 
drop table if exists responses;
create table responses (
  studentId      int,
  questionNo     int,
  choice  varchar(1),
  ans     boolean,
  primary key (studentId));

drop table if exists questions;
create table questions (
  questionId     int,
  category  varchar(50),
  question varchar(200),
  chioce1   varchar(50),
  chioce2   varchar(50),
  chioce3   varchar(50),
  chioce4   varchar(50),
  answer  varchar(50),
  primary key (questionId));

insert into questions values (01, 'Math', 'Question 1. The average of first 50 natural numbers is: ', 'A. 25.30 ', 'B. 25.50', 'C. 25.00', 'D. 12.25', 'B. 25.50');
insert into questions values (02, 'Math', 'Question 2. What is 1004 divided by 2? ', 'A. 522 ', 'B. 502', 'C. 520', 'D. 5002', 'B. 502');
insert into questions values (03, 'Math', 'Question 3. A clock strikes once at 1 o’clock, twice at 2 o’clock, thrice at 3 o’clock and so on. How many times will it strike in 24 hours? ', 'A. 78 ', 'B. 136', 'C. 156', 'D. 5196', 'C. 156');
insert into questions values (04, 'Math', 'Question 4. 106 × 106 – 94 × 94 = ? ', 'A. 2004 ', 'B. 2400', 'C. 1904', 'D. 1906', 'B. 2004');
insert into questions values (05, 'Math', 'Question 5. Which of the following numbers gives 240 when added to its own square? ', 'A. 15 ', 'B. 16', 'C. 18', 'D. 20', 'A. 15');

insert into questions values (06, 'Science', 'Question 1. Among Ferns, Mosses, Algae & Fungi , cholorophyll is found in?', 'A. Algae & Ferns ', 'B. Algae & Mosses', 'C. Algae, Ferns & Mosses', 'D. None of the above', 'C. Algae, Ferns & Mosses');
insert into questions values (07, 'Science', 'Question 2. Which of the following is a micronutrient that helps in nitrogen metabolism of plants? ', 'A. Zinc ', 'B. Copper', 'C. Molybdenum', 'D. Sulphur', 'C. Molybdenum');
insert into questions values (08, 'Science', 'Question 3. Which of the following is not a variety of mango? ', 'A. Banganapalle', 'B. Alphonso', 'C. Sindhoora', 'D. Red Dacca', 'D. Red Dacca');
insert into questions values (09, 'Science', 'Question 4. Memory loss would most likely be due to a malfunction of which part of the brain?', 'A. Medulla', 'B. Cerebellum', 'C. Cerebrum', 'D. Pons', 'C. Cerebrum');
insert into questions values (10, 'Science', 'Question 5. Which of the following diseases is spread by mosquitoes but is not a viral disease?', 'A. Meningitis', 'B. Dengue fever', 'C. Yellow fever', 'D. Filariasis', 'D. Filariasis');


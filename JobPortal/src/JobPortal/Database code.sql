#Author UP834069#
CREATE DATABASE JobPortal;

CREATE TABLE JobSearch (
JobID int AUTO_INCREMENT not null,
JobTitle (100) not null,
JobType varchar (250) not null,
Location varchar (50) not null,
JobDescription (250) not null,
Sector (60) not null,
CompName (150) not null,
Salary DEC(8,2) not null DEFAULT 0,
ApplyByDate date not null,
PRIMARY KEY (JobID)
);

CREATE TABLE ApplyForJob (
JobID int,
JobApplied ENUM ('Yes' , 'No'),
FOREIGN KEY (JobID) REFERENCES JobSearch(JobID)
);


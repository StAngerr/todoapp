CREATE TABLE Tasks (
    ID int auto_increment not null,
    NAME varchar(100),
    primary key (id));

CREATE TABLE Labels (
    ID int not null auto_increment,
    NAME varchar(100),
    primary key (id));
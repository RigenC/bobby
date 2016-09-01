create table member(
id int primary key auto_increment,
username varchar(20) not null,
password varchar(20) not null,
nickyname varchar(20),
m_type int default 0,
m_state int default 0
);
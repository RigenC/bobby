create table blog(
id int primary key not null auto_increment,
title varchar(40) not null,
content text not null,
create_time datetime not null,
read_number int default 0
)
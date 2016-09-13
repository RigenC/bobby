create table comment(
id int primary key auto_increment,
blog_id int,
member_id int,
create_time datetime,
comment_id int,
constraint comment2blog foreign key(blog_id) references blog(id),
constraint comment2member foreign key(member_id) references member(id),
constraint comment2comment foreign key(comment_id) references comment(id)
)
# --- !Ups
create table User (
  id int(10) not null auto_increment, 
  name varchar(100),
  email varchar(100),
  password varchar(100), 
  createDate timestamp default current_timestamp(),
primary key(id));
# --- !Downs
drop table User;
## --- !Ups
#create table foo (
#  id int(10) not null auto_increment, 
#  name varchar(100),
#primary key(id));
##alter table bar add newColumn varchar(10);
# 
## --- !Downs
##drop table foo;
##alter table bar drop newColumn;

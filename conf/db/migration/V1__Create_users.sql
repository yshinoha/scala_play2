create table User (
  id int(10) not null auto_increment primary key,  
  name varchar(100),
  email varchar(100),
  password varchar(100), 
  created_at timestamp default current_timestamp(),
  updated_at timestamp,
  deleted_at timestamp
);


create table Company (
  id int(11) not null auto_increment primary key,  
  name varchar(64) not null,
  url varchar(128),
  created_at timestamp not null,
  updated_at timestamp,
  deleted_at timestamp
);

drop table if exists user;
drop table if exists topic;
drop table if exists reply;
drop table if exists favourites;

create table user(
     id int not null,
     uid int primary key auto_increment,
     account varchar(12) not null,
     username varchar(128),
     nickname varchar(128),
     password varchar(128),
     professional varchar(128),
     college varchar(128),
     department varchar(128),
     wechat varchar(12),
     uuid varchar(128),
     timeTag timestamp not null,
     online varchar(128) not null,
     ip varchar(128) not null
)engine=innodb default charset=utf8;

create table topic(
      id int not null,
      tid int primary key auto_increment,
      title varchar(128) not null,
      description text not null,
      content text not null,
      uid int not null,
      username varchar(128) not null,
      ip varchar(128) not null,
      partitions varchar(128) not null,
      timeTag timestamp not null,
      foreign key(uid) references user(uid)
)engine=innodb default charset=utf8;

create table reply(
      id int not null,
      rid int primary key auto_increment,
      content text not null,
      tid int not null,
      uid int not null,
      username varchar(128) not null,
      ip varchar(128) not null,
      timeTag timestamp not null,
      foreign key(uid) references user(uid),
      foreign key(tid) references topic(tid)
)engine=innodb default charset=utf8;

insert into user(id,uid,account,username,nickname,password,professional,college,department,wechat,uuid,timetag,online,ip)
values (10000,10000,'public','public','public','public','北京航空航天大学','北京航空航天大学','北京航空航天大学','public','10000000-0000-0000-0000-000000000000',now(),'Online','192.168.0.1');

insert into topic(id,tid,title,description,content,uid,username,ip,partitions,timetag) values (0,0,'public','public','public',10000,'public','127.0.0.1','collegeNews',now());
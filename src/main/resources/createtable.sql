drop table  if exists tb_class_room;
drop table if exists tb_student;
drop table  if exists tb_teacher;
create table tb_class_room (id bigint AUTO_INCREMENT, name varchar(255), room_size integer, primary key (id));
create table tb_student (id bigint AUTO_INCREMENT, age integer not null, name varchar(255), class_room_id bigint, teacher_id bigint, primary key (id));
create table tb_teacher (id bigint AUTO_INCREMENT, job varchar(255), name varchar(255), primary key (id));

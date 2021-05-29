insert into course(id, name, created_date, last_updated_date) values(10001,'Physics', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10002,'Chemistry', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date) values(10003,'Maths', sysdate(), sysdate());

insert into passport(id,number) values(40001,'E123456');
insert into passport(id,number) values(40002,'N123457');
insert into passport(id,number) values(40003,'L123890');

insert into student(id,name,passport_id) values(20001,'Kushal',40001);
insert into student(id,name,passport_id) values(20002,'Sumit',40002);
insert into student(id,name,passport_id) values(20003,'Amit',40003);

insert into review(id,rating,description) values(50001,'5', 'Great Course');
insert into review(id,rating,description) values(50002,'4', 'Wonderful Course');
insert into review(id,rating,description) values(50003,'5', 'Awesome Course');
create table if not exists persons (
                                       id int primary key,
                                       name varchar,
                                       male boolean,
                                       birthdate date
);
insert into persons (id, name, male, birthdate) values (1, 'person1', true, '1980-01-02'),
                                                       (2, 'person2', false, '1985-02-04'),
                                                       (3, 'person3', true, '1990-03-04'),
                                                       (4, 'person4', false, '1995-04-05'),
                                                       (5, 'person5', true, '2000-05-06'),
                                                       (6, 'person6', false, '1995-06-07'),
                                                       (7, 'person7', true, '1990-07-08'),
                                                       (8, 'person8', false, '1985-08-09'),
                                                       (9, 'person9', true, '1980-09-10'),
                                                       (10, 'person10', false, '1985-10-11');

create table if not exists hobbys (
                                      hobby_id int primary key,
                                      hobby varchar,
                                      hobby_type varchar constraint fk_hobby_type references hobby_type(hobby_type_name)
    );
insert into hobbys (hobby_id, hobby, hobby_type) VALUES (1, 'football', 'active'),
                                                        (2, 'chess', 'inactive'),
                                                        (3, 'hockey', 'active'),
                                                        (4, 'book-reading', 'inactive'),
                                                        (5, 'fishing', 'active'),
                                                        (6, 'cooking', 'inactive'),
                                                        (7, 'litterball', 'active'),
                                                        (8, 'gaming', 'inactive'),
                                                        (9, 'hiking', 'active'),
                                                        (10, 'knitting', 'inactive');
create table if not exists hobby_type (
    hobby_type_name varchar primary key
);
insert  into hobby_type (hobby_type_name) values ('active'),
                                                 ('inactive');
create table if not exists persons_hobbys (
    person_id int constraint fk_person_id references persons(id),
    hobby_id int constraint  fk_hobby_id references hobbys(hobby_id)
    );
insert into persons_hobbys (person_id, hobby_id) VALUES (1, 10),
                                                        (2, 9), (3, 8),(4, 7),(5, 6),(6, 5),(7, 4),(8, 3),
                                                        (9, 2),(10, 1),(1, 2),(3, 5),(5, 8),(7, 3),(9, 5);
drop table if exists persons;
drop table if exists hobbys;
drop table if exists hobby_type;
drop table if exists persons_hobbys;

select * from persons where birthdate < '1993-01-01'; --Вывести всех людей старше какого-либо возраста

select male, count(*) from persons  group by male; --Вывести сколько людей каждого пола есть в бд

select * from persons join persons_hobbys on persons.id = persons_hobbys.person_id --Вывести информацию о людях и их хобби
                      join hobbys on persons_hobbys.hobby_id = hobbys.hobby_id;

select hobby_type, count(*) from hobbys group by hobby_type;--Вывести какое количество активных хобби и пассивных хобби есть в бд

select name, count(persons_hobbys.hobby_id) from persons join persons_hobbys on persons.id = persons_hobbys.person_id
                                                         join hobbys on persons_hobbys.hobby_id = hobbys.hobby_id --Вывести список людей у которых более одного хобби
group by name having count(persons_hobbys.hobby_id) > 1;

select hobby, hobby_type from hobbys; --Вывести информацию какое хобби активное а какое пассивное

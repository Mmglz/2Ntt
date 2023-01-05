/* Inserciones de plantas. */
insert into FLOOR (number) values (1);
insert into FLOOR (number) values (2);

/* Inserciones de apartamentos. */
insert into APARTMENT (letter, id_floor) values ('A', 1);
insert into APARTMENT (letter, id_floor) values ('B', 1);
insert into APARTMENT (letter, id_floor) values ('C', 2);
insert into APARTMENT (letter, id_floor) values ('D', 2);

/* Inserciones de personas. */
insert into PERSON (name, surnames, dni, id_apartment) values ('Maria', 'Garcia Perez', '29514736L', 1);
insert into PERSON (name, surnames, dni, id_apartment) values ('Pablo', 'Camacho Delgado', '29514736L', 1);
insert into PERSON (name, surnames, dni, id_apartment) values ('Laura', 'Medero Rodriguez', '29514736L', 2);
insert into PERSON (name, surnames, dni, id_apartment) values ('Jose', 'Mejias Roldan ', '29514736L', 3);


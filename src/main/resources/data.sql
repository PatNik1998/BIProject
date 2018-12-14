INSERT INTO Organisation (id, name, full_name, inn, kpp, address, phone, is_active) VALUES (1, 'НСК', 'Национальная строительная компания', '6449013711', '6448013710', '2 Садовая, 65', 89276542438, 1 );
INSERT INTO Organisation (id, name, full_name, inn, kpp, address, phone, is_active) VALUES (2, 'СТК', 'Санкт-Петербургская транспортная компания', '6539013711', '6468013710', 'Чернышевского, 60', 89376582938, 1 );
INSERT INTO Organisation (id, name, full_name, inn, kpp, address, phone, is_active) VALUES (3, 'НОТЗ', 'Невский опытный тракторный завод', '6299013811', '6247013760', '50 лет октября, 30', 89656572448, 1 );
INSERT INTO Organisation (id, name, full_name, inn, kpp, address, phone, is_active) VALUES (4, 'ПА', 'Павловский автобус', '6847013711', '621801710', 'Политехническая, 80', 89406946438, 1 );


INSERT INTO Office (id, org_id, name, address, phone, is_active) VALUES (1, 1, 'Навигатор', 'Астраханская, 62', 89378522938, 1 );
INSERT INTO Office (id, org_id, name, address, phone, is_active) VALUES (2, 2, 'Орион', 'Комсосольская, 8', 89878326998, 1 );
INSERT INTO Office (id, org_id, name, address, phone, is_active) VALUES (3, 3, 'Взлет', 'Ленина, 20', 89878529768, 1 );
INSERT INTO Office (id, org_id, name, address, phone, is_active) VALUES (4, 4, 'Большой', 'Чапаева, 15', 89678242837, 1 );

INSERT INTO Doc_Type (id, name, code)  VALUES (1, 'Паспорт гражданина Российской Федерации', '21');
INSERT INTO Doc_Type (id, name, code)  VALUES (2, 'Военный билет', '07');
INSERT INTO Doc_Type (id, name, code)  VALUES (3, 'Свидетельство о рождении', '03');

INSERT INTO Country  (id, name, code)  VALUES  (1, 'Российская Федерация', '643');
INSERT INTO Country (id, name, code)  VALUES (2, 'Австралия', '036');
INSERT INTO Country (id, name, code)  VALUES (3, 'Греция', '300');
INSERT INTO Country (id, name, code)  VALUES (4, 'Испания', '724');
INSERT INTO Country (id, name, code)  VALUES (5, 'Украина', '804');

INSERT INTO Employee_Doc (id, doc_number, doc_date, id_type) VALUES (1, 6402765345, 2005-05-12, 1);
INSERT INTO Employee_Doc (id, doc_number, doc_date, id_type) VALUES (2, 6302728345, 2007-07-10, 1);
INSERT INTO Employee_Doc (id, doc_number, doc_date, id_type) VALUES (3, 6202795345, 2008-08-09, 1);
INSERT INTO Employee_Doc (id, doc_number, doc_date, id_type) VALUES (4, 6502735395, 2012-09-02, 1);
INSERT INTO Employee_Doc (id, doc_number, doc_date, id_type) VALUES (5, 6402765345, 2004-08-12, 1);

INSERT INTO Employee (id, office_id, first_name, second_name, middle_name, last_name, doc_id, position, phone, country_id, is_indentified) VALUES(1, 1, 'Иван', 'Петров', 'Семенович', null, 1, 'Бухгалтер',89378765432, '1', 1 );
INSERT INTO Employee (id, office_id, first_name, second_name, middle_name, last_name, doc_id, position, phone, country_id, is_indentified) VALUES(2, 2, 'Алексей', 'Андреев', 'Александрович', null, 1, 'Начальник отдела',89276543212, '1', 1 );
INSERT INTO Employee (id, office_id, first_name, second_name, middle_name, last_name, doc_id, position, phone, country_id, is_indentified) VALUES(3, 3, 'Иван', 'Алексеев', 'Васильевич', null, 1, 'Администратор', 89376543423, '1', 1 );
INSERT INTO Employee (id, office_id, first_name, second_name, middle_name, last_name, doc_id, position, phone, country_id, is_indentified) VALUES(4, 4, 'Олег', 'Волков', 'Андреевич', null, 1, 'Охранник', 89276543412, '1', 1 );

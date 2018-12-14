#mysql 5.6.41
CREATE TABLE IF NOT EXISTS Organisation (


  id         INTEGER                          COMMENT 'Уникальный идентификатор организации' PRIMARY KEY AUTO_INCREMENT,
  name       VARCHAR(20) NOT NULL             COMMENT 'Название',
  full_name  VARCHAR(50) NOT NULL             COMMENT 'Полное название',
  inn        VARCHAR(20) NOT NULL             COMMENT 'Идивидуальный налоговый номер',
  kpp        VARCHAR(20) NOT NULL             COMMENT  'Код причины постановки на учет',
  address    VARCHAR(50) NOT NULL             COMMENT 'Адрес',
  phone      VARCHAR(20) NOT NULL             COMMENT 'Телефон',
  is_active  BOOLEAN                          COMMENT 'Активна ли'

)COMMENT = 'Организация';



CREATE TABLE IF NOT EXISTS Office(

   id         INTEGER                         COMMENT 'Уникальный идентификатор офиса'       PRIMARY KEY AUTO_INCREMENT,
   org_id     INTEGER                         COMMENT 'УНикальный идентификатор организации',
   name       VARCHAR(20) NOT NULL            COMMENT 'Название офиса',
   address    VARCHAR(50) NOT NULL            COMMENT 'Адрес',
   phone      VARCHAR(20) NOT NULL            COMMENT 'Телефон',
   is_active  BOOLEAN                         COMMENT 'Работает ли'
)COMMENT = 'ОФис';


CREATE TABLE IF NOT EXISTS Country(

  id         INTEGER                          COMMENT 'Уникальный идентификатор страны'        PRIMARY KEY AUTO_INCREMENT,
  name       VARCHAR(20)  NOT NULL            COMMENT 'Название страны',
  code       VARCHAR(5)   NOT NULL            COMMENT 'Код'
)COMMENT = 'Страна';



CREATE TABLE IF NOT EXISTS Doc_Type(

  id        INTEGER                           COMMENT 'Уникальный идентификатор типа документа' PRIMARY KEY AUTO_INCREMENT,
  name      VARCHAR(20)   NOT NULL            COMMENT 'Имя документа',
  code      VARCHAR(5)    NOT NULL            COMMENT 'Код документа'

)COMMENT = 'Тип документа';



CREATE TABLE IF NOT EXISTS Employee_Doc(

  id         INTEGER                           COMMENT 'Уникальный идентификатор документа'  PRIMARY KEY AUTO_INCREMENT,
  doc_number VARCHAR(20)  NOT NULL             COMMENT 'Номер документа',
  doc_date   DATE         NOT NULL             COMMENT 'Дата выдачи',
  id_type    INTEGER                           COMMENT 'Уникальный идентификатор типа документа'
)COMMENT = 'Документ сотрудника';


CREATE TABLE IF NOT EXISTS Employee(

  id             INTEGER                           COMMENT 'Уникальный идентификатор сотрудника' PRIMARY KEY AUTO_INCREMENT,
  office_id      INTEGER                           COMMENT 'Уникальный идентификатор офиса',
  first_name     VARCHAR(20)  NOT NULL             COMMENT 'Имя',
  second_name    VARCHAR(20)  NOT NULL             COMMENT 'Фамилия',
  middle_name    VARCHAR(20)                       COMMENT 'Отчество',
  last_name      VARCHAR(20)                       COMMENT 'Вторая фамилия',
  doc_id         INTEGER                           COMMENT'Уникальынй идентификатор документа',
  position       VARCHAR(20)  NOT NULL             COMMENT 'Длжность',
  phone          VARCHAR(20)  NOt NULL             COMMENT 'Телефон',
  country_id     INTEGER                           COMMENT 'Уникальный идентификатор страны',
  is_indentified BOOLEAN                           COMMENT 'Определен ли'
) COMMENT = 'Сотрудник';



CREATE UNIQUE INDEX UX_Organisation_Full_Name ON Organisation (full_name);
CREATE UNIQUE INDEX UX_Organisation_Inn ON Organisation (inn);
CREATE INDEX IX_Organisation_Is_Active ON Organisation (is_active);

CREATE INDEX IX_Office_Org_Id ON Office (org_id);
ALTER TABLE Office ADD FOREIGN KEY (org_id) REFERENCES Organisation(id);
CREATE UNIQUE INDEX UX_Office_Name ON Office (name);
CREATE UNIQUE INDEX UX_Office_Phone ON Office (phone);
CREATE INDEX IX_Office_Is_Active ON Office (is_active);

CREATE UNIQUE INDEX UX_COUNTRY_CODE ON Country (code);

CREATE UNIQUE INDEX UX_Doc_Type_Code ON Doc_Type (code);

CREATE INDEX IX_Employee_Doc_Id_Type ON Employee_Doc  (id_type);
ALTER TABLE Employee_Doc ADD FOREIGN KEY (id_type) REFERENCES Doc_Type(id);

CREATE INDEX IX_Employee_Oficce_Id ON Employee (office_id);
ALTER TABLE Employee ADD FOREIGN KEY (office_id) REFERENCES Office(id);
CREATE INDEX IX_Employee_First_Name ON Employee (first_name);
CREATE INDEX IX_Employee_Middle_Name ON Employee (middle_name);
CREATE INDEX IX_Employee_Last_Name ON Employee (last_name);
CREATE INDEX IX_Employee_Position ON Employee (position);
CREATE INDEX IX_Employee_Doc_Id ON Employee (doc_id);
ALTER TABLE Employee ADD FOREIGN KEY (doc_id) REFERENCES Employee_Doc(id);
CREATE INDEX IX_Employee_Country_Id ON Employee (country_id);
ALTER TABLE Employee ADD FOREIGN KEY (country_id) REFERENCES Country(id);
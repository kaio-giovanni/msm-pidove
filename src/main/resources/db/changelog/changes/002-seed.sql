--liquibase formatted sql
--changeset kaio-giovanni:seed-msm-tables context:seed splitStatements:true endDelimiter:;

INSERT INTO user(name, email, phone) VALUES("Kaio Giovanni", "kaio.giovanni@gmail.com", "+5583996024109");


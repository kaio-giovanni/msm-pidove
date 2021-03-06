--liquibase formatted sql
--changeset kaio-giovanni:add-timestamp-columns context:new splitStatements:true endDelimiter:;

ALTER TABLE user ADD COLUMN created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                 ADD COLUMN updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;

--rollback ALTER TABLE user DROP COLUMN created_at
--rollback ALTER TABLE user DROP COLUMN updated_at
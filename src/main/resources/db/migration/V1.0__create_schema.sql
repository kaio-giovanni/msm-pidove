CREATE TABLE user
(
    id    INTEGER      NOT NULL AUTO_INCREMENT,
    name  VARCHAR(100) NOT NULL,
    email VARCHAR(80)  NOT NULL,
    phone VARCHAR(15)  NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id),
    CONSTRAINT user_email_ukey UNIQUE (email),
    CONSTRAINT user_phone_ukey UNIQUE (phone)
);

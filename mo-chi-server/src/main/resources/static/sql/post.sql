drop table if exists `post`;

create table `post`
(
    `pid`              INT                                 NOT NULL auto_increment,
    `title`            VARCHAR(50)                         NOT NULL,
    `current_url`      VARCHAR(100)                        NOT NULL,
    `created_datetime` DATETIME                            NOT NULL,
    `updated_time`     DATETIME DEFAULT `created_datetime` not null,
    `visited_count`    INT      DEFAULT 0                  NOT NULL,
    `type`             ENUM ('article','inquiry')          NOT NULL,
    primary key (`pid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
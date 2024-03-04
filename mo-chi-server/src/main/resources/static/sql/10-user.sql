use `mo_chi`;

drop table if exists `user`;

create table `user`
(
    `uid`              INT         NOT NULL AUTO_INCREMENT,
    `user_name`        VARCHAR(20) NOT NULL,
    `password`         VARCHAR(20) NOT NULL,
    `sex`              ENUM('male','female') DEFAULT 'male',
    `email`            VARCHAR(20) NOT NULL,
    `created_datetime` DATETIME    NOT NULL,
    `motto`            VARCHAR(150)         DEFAULT NULL,
    `point`            INT         NOT NULL DEFAULT 0,
    primary key (`uid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
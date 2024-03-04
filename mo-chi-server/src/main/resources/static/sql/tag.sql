drop table if exists `tag`;

create table `tag`
(
    `tid`         INT         NOT NULL AUTO_INCREMENT,
    `content_url` VARCHAR(50) NOT NULL,
    primary key (`tid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
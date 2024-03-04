drop table if exists `reply`;

create table `reply`
(
    `rid`              INT          NOT NULL AUTO_INCREMENT,
    `content_url`      VARCHAR(100) NOT NULL,
    `created_datetime` DATETIME     NOT NULL,
    primary key (`rid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
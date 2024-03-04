drop table if exists `comment`;

create table `comment`
(
    `cid`              INT          NOT NULL AUTO_INCREMENT,
    `content_url`      VARCHAR(100) NOT NULL,
    `created_datetime` DATETIME     NOT NULL,
    primary key (`cid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
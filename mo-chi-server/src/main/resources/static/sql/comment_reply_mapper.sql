drop table if exists `comment_reply_mapper`;

create table `comment_reply_mapper`
(
    `cid` INT NOT NULL AUTO_INCREMENT,
    `rid` INT NOT NULL,
    primary key (`cid`),
    INDEX (`rid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
use `mo_chi`;

drop table if exists `comment_reply_mapper`;

create table `comment_reply_mapper`
(
    `rid` INT NOT NULL AUTO_INCREMENT,
    `cid` INT NOT NULL,
    primary key (`rid`),
    INDEX (`cid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
use `mo_chi`;

drop table if exists `user_comment_mapper`;

create table `user_comment_mapper`
(
    `cid` INT NOT NULL AUTO_INCREMENT,
    `uid` INT NOT NULL,
    primary key (`cid`),
    INDEX (`uid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
use `mo_chi`;

drop table if exists `user_comment_mapper`;

create table `user_comment_mapper`
(
    `uid` INT NOT NULL AUTO_INCREMENT,
    `cid` INT NOT NULL,
    primary key (`uid`),
    INDEX (`cid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
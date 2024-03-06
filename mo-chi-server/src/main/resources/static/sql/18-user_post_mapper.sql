use `mo_chi`;

drop table if exists `user_post_mapper`;

create table `user_post_mapper`
(
    `pid` INT NOT NULL AUTO_INCREMENT,
    `uid` INT NOT NULL,
    primary key (`pid`),
    INDEX (`uid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
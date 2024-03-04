use `mo_chi`;

drop table if exists `user_post_mapper`;

create table `user_post_mapper`
(
    `uid` INT NOT NULL AUTO_INCREMENT,
    `pid` INT NOT NULL,
    primary key (`uid`),
    INDEX (`pid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
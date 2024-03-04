use `mo_chi`;

drop table if exists `post_comment_mapper`;

create table `post_comment_mapper`
(
    `pid` INT NOT NULL AUTO_INCREMENT,
    `cid` INT NOT NULL,
    primary key (`pid`),
    INDEX (`cid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
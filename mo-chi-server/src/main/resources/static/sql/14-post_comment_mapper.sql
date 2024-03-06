use `mo_chi`;

drop table if exists `post_comment_mapper`;

create table `post_comment_mapper`
(
    `cid` INT NOT NULL AUTO_INCREMENT,
    `pid` INT NOT NULL,
    primary key (`cid`),
    INDEX (`pid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
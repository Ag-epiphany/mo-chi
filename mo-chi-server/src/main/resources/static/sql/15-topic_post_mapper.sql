use `mo_chi`;

drop table if exists `topic_post_mapper`;

create table `topic_post_mapper`
(
    `pid` INT NOT NULL AUTO_INCREMENT,
    `tid` INT NOT NULL,
    primary key (`pid`),
    INDEX (`tid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
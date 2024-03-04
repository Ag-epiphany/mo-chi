use `mo_chi`;

drop table if exists `topic_post_mapper`;

create table `topic_post_mapper`
(
    `tid` INT NOT NULL AUTO_INCREMENT,
    `pid` INT NOT NULL,
    primary key (`tid`),
    INDEX (`pid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
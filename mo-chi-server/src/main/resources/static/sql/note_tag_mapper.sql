drop table if exists `note_tag_mapper`;

create table `note_tag_mapper`
(
    `nid` INT NOT NULL AUTO_INCREMENT,
    `tid` INT NOT NULL,
    primary key (`nid`),
    INDEX (`tid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
use `mo_chi`;

drop table if exists `note_tag_mapper`;

create table `note_tag_mapper`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `nid` INT NOT NULL,
    `tid` INT NOT NULL,
    primary key (`id`),
    INDEX (`tid`),
    INDEX (`nid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
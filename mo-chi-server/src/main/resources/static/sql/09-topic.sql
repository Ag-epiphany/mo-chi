use `mo_chi`;

drop table if exists `topic`;

create table `topic`
(
    `tid`           INT                                     NOT NULL AUTO_INCREMENT,
    `description`   VARCHAR(200) DEFAULT '一个有意思的地方' NOT NULL,
    `name`          VARCHAR(20)                             NOT NULL,
    `article_count` INT          DEFAULT 0                  NOT NULL,
    `inquiry_count` INT          DEFAULT 0                  NOT NULL,
    primary key (`tid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
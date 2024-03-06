use `mo_chi`;

drop table if exists `admin`;

create table `admin`
(
    `aid`              INT      NOT NULL auto_increment,
    `created_datetime` DATETIME NOT NULL,
    `valid_until`      DATETIME not null,
    `granted_by`       INT      NOT NULL,
    `revoked_by`       INT      NOT NULL,
    primary key (`aid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
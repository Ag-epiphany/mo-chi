use `mo_chi`;

drop table if exists `admin_role_mapper`;

create table `admin_role_mapper`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `aid` INT NOT NULL,
    `rid` INT NOT NULL,
    primary key (`id`),
    INDEX (`rid`),
    INDEX (`aid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
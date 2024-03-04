drop table if exists `admin_role_mapper`;

create table `admin_role_mapper`
(
    `aid` INT NOT NULL AUTO_INCREMENT,
    `rid` INT NOT NULL,
    primary key (`aid`),
    INDEX (`rid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
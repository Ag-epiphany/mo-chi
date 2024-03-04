drop table if exists `user_admin_mapper`;

create table `user_admin_mapper`
(
    `uid` INT NOT NULL AUTO_INCREMENT,
    `aid` INT NOT NULL,
    primary key (`uid`),
    INDEX (`aid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
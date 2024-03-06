use `mo_chi`;

drop table if exists `role`;

create table `role`
(
    `rid`            INT           NOT NULL auto_increment,
    `name`           ENUM ('users','posts','notes','comments','replies','tags','topics','roles','admins'),
    `assigned_count` INT DEFAULT 0 NOT NULL,
    primary key (`rid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
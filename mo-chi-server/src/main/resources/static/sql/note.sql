drop table if exists `note`;

create table `note`
(
    `nid`              INT                                     NOT NULL AUTO_INCREMENT,
    `title`            VARCHAR(50)                             NOT NULL,
    `content_url`      VARCHAR(100)                            NOT NULL,
    `created_datetime` DATETIME                                NOT NULL,
    `updated_datetime` DATETIME     DEFAULT `created_datetime` NOT NULL,
    `is_public`        BOOLEAN      DEFAULT TRUE               NOT NULL,
    `self_tags`        VARCHAR(100) DEFAULT NULL,
    primary key (`nid`)
) ENGINE = InnoDB
  CHARSET = utf8mb4
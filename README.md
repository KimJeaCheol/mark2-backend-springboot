# mark2-springboot-rest-jpa-marria

CREATE TABLE `user` (
`msrl` BIGINT(20) NOT NULL AUTO_INCREMENT,
`uuid` VARCHAR(30) NOT NULL COLLATE 'utf8_general_ci',
`username` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci',
`password` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci',
`name` VARCHAR(20) NOT NULL COLLATE 'utf8_general_ci',
`email` VARCHAR(30) NOT NULL COLLATE 'utf8_general_ci',
`isAccountNonExpired` TINYINT(1) NULL DEFAULT NULL,
`isAccountNonLocked` TINYINT(1) NULL DEFAULT NULL,
`isCredentialsNonExpired` TINYINT(1) NULL DEFAULT NULL,
`isEnabled` TINYINT(1) NULL DEFAULT NULL,
PRIMARY KEY (`msrl`) USING BTREE,
UNIQUE INDEX `uuid` (`uuid`) USING BTREE
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;

CREATE DATABASE IF NOT EXISTS `user` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

use user;
CREATE TABLE IF NOT EXISTS `user`(
	id int(11) not null auto_increment,
	nickname varchar(20) not null unique,
	gender char(1) not null,
	age tinyint(3) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

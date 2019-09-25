CREATE DATABASE IF NOT EXISTS `account` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

use account;
CREATE TABLE IF NOT EXISTS `account`(
	id int(11) not null auto_increment,
	username varchar(20) not null unique,
	password varchar(20) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

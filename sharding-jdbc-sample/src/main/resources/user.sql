CREATE DATABASE IF NOT EXISTS `ds_0` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE IF NOT EXISTS `ds_1` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';
CREATE DATABASE IF NOT EXISTS `ds_2` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

use ds_0;
CREATE TABLE IF NOT EXISTS `user`(
	id int(11) not null auto_increment,
	nickname varchar(20) not null,
	gender char(1) not null,
	age tinyint(3) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

use ds_1;
CREATE TABLE IF NOT EXISTS `user`(
	id int(11) not null auto_increment,
	nickname varchar(20) not null,
	gender char(1) not null,
	age tinyint(3) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

use ds_2;
CREATE TABLE IF NOT EXISTS `user`(
	id int(11) not null auto_increment,
	nickname varchar(20) not null,
	gender char(1) not null,
	age tinyint(3) not null,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#!/usr/bin/env bash

docker pull mysql:5.7.27

docker build -t mysql-master etc/master
docker build -t mysql-slave1 etc/slave1
docker build -t mysql-slave2 etc/slave2

docker create --name mysql-master -e MYSQL_ROOT_PASSWORD=root -p3306:3306 mysql-master
docker create --name mysql-slave1 -e MYSQL_ROOT_PASSWORD=root -p3307:3306 mysql-slave1
docker create --name mysql-slave2 -e MYSQL_ROOT_PASSWORD=root -p3308:3306 mysql-slave2

docker start mysql-master
docker start mysql-slave1
docker start mysql-slave2

# master
GRANT REPLICATION SLAVE ON *.* to 'user'@'%' identified by 'mysql';
show master status;

# slave
change master to
master_host='192.168.99.100',
master_user='user',
master_log_file='mysql-bin.000003',
master_log_pos=725,
master_port=3306,
master_password='mysql';
start slave;
show slave status;

mysql -uroot -proot -h192.168.99.100 -P3306
mysql -uroot -proot -h192.168.99.100 -P3307
mysql -uroot -proot -h192.168.99.100 -P3308

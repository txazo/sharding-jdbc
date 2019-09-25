#!/usr/bin/env bash

docker pull mysql:5.7.27

docker create --name mysql-1 -v /c/Users/s3680/docker/etc/mysql-1:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=root -p3306:3306 mysql:5.7.27
docker create --name mysql-2 -v /c/Users/s3680/docker/etc/mysql-2:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=root -p3307:3306 mysql:5.7.27
docker create --name mysql-3 -v /c/Users/s3680/docker/etc/mysql-3:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=root -p3308:3306 mysql:5.7.27

docker run -d --name mysql-1 -v /c/Users/s3680/docker/etc/mysql-1:/etc/mysql/conf.d -e MYSQL_ROOT_PASSWORD=root -p3306:3306 mysql:5.7.27

mysql -uroot -proot -h192.168.99.100 -P3306

docker exec -it mysql-1 bash

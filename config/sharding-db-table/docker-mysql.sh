#!/usr/bin/env bash

docker pull mysql:5.7.27

docker run -d --name mysql-1 -e MYSQL_ROOT_PASSWORD=root -p3306:3306 mysql:5.7.27
docker run -d --name mysql-2 -e MYSQL_ROOT_PASSWORD=root -p3307:3306 mysql:5.7.27

docker exec -it mysql-1 bash
docker exec -it mysql-2 bash

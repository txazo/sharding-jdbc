#!/usr/bin/env bash

docker pull mysql:5.7.27

docker run -d --name mysql -e MYSQL_ROOT_PASSWORD=root -p3306:3306 mysql:5.7.27

docker exec -it mysql bash

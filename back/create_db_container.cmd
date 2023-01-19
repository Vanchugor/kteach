docker run -p 127.0.0.1:3306:3306  --name dev-mariadb -e MARIADB_ROOT_PASSWORD=rootroot -d mariadb:latest
docker run --name dev-phpmyadmin -d --link dev-mariadb:db -p 7098:80 phpmyadmin/phpmyadmin
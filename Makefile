clean-build:
	docker-compose down -v
	mvn clean package
	docker build -t jvidalc/aos_subsistema4_notificaciones .

run:
	docker-compose up

build-db:
	docker rm -f aos_subsistema42_mysqldb_1
	docker rmi -f aos_subsistema42_mysqldb
	docker build -t aos_subsistema42_mysqldb -f ./mysql_service/Dockerfile .

build-app:
	mvn clean package
	docker build -t jvidalc/aos_subsistema4_notificaciones .

run-db:
	docker run --name aos_subsistema42_mysqldb_1 -p 3306:3306 aos_subsistema42_mysqldb

run-app:
	docker run --name aos_subsistema4_notificaciones -p 8080:8080 jvidalc/aos_subsistema4_notificaciones


FROM mysql:8
COPY ./dbdump/ /docker-entrypoint-initdb.d/
EXPOSE 3306
ENV MYSQL_ROOT_PASSWORD=qwerty
ENV MYSQL_DATABASE=aos4
ENV MYSQL_USER=qwerty
ENV MYSQL_PASSWORD=qwerty
CMD ["mysqld", "--default-authentication-plugin=mysql_native_password"]
Mehrzeilige Befehle:
docker run -d \

Volumes:
host:container
docker -v /var/lib/mysql/data (anonymous Volumes)
docker -v /home/mount/data:/var/lib/mysql/data -> (named Volumes)

Konsole: 
(it -> interactive console oder sh für andere Konsole)
docker exec -it /bin/bash {containerId}
darin "env" Befehl für Umgebungsvariablen
docker logs {containerId} | tai oder head

DOCKERFILE (Blueprint Image Enviroment)
FROM node:13-apline       | install node.js
ENV MONGO_DB_PWD=Password | set enviroment (besser in Docker Compose File)
RUN mkdir -p/home/app     | container shell
COPY                      | host machine
CMD["node", "home/app/server.js"]

weitere Befehle: CMD; COP; ENV, ENTRYPOINT, EXPOSE, FROM HEALTHCHECK, MAINTAINER, LABEL, ONBUILD, RUN, SHELL, STOPSIGNAL,
USER, VOLUME, WORKDIR

Build tag:
docker build -t my-app:1.0 . (Punkt wo die dockerfile liegt)
docker rmi {dockerIdImage}

Network:
docker network create {name}
docker network ls

Ports verbinden:
host:container
docker run -d -p 8000:8000


#1 create Network
docker network create mongo-network

#2 Start Mongodb
docker run -d \
-p 27017:27017 \
-e MONGO_INIT = admin \
-e ... = pw \
-net mongo-network \
-name mongodb \
mongo <--für image name-->

#3 Start MongoExpress
docker run -d \
-p 8081:8081 \
-e ME_CONFIG=user \ 
-e ... = admin \
-e ... SERVER=mongo \
-net mongo-network \
-name mongo-express \
mongoexpress <-- iamge name-->
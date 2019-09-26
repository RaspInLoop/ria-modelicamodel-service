#!/bin/sh
export project_version=$(mvn help:evaluate -N -Dexpression=project.version | grep -v '\[')
docker login -u $DOCKER_USER -p $DOCKER_PASS
docker build --build-arg jar_revision=${project_version} --tag raspinloop/modelicamodel-service .
docker tag raspinloop/modelicamodel-service:latest raspinloop/modelicamodel-service:${project_version}
docker push raspinloop/modelicamodel-service:${project_version}
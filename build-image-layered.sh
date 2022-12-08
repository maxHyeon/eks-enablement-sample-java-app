#!/bin/bash
set -x
./mvnw clean package -DskipTests
#docker build . -f Dockerfile-layered -t boot-layered:1
docker build . --platform linux/x86_64 -f Dockerfile-layered -t eks-cicd-workshop:latest
docker images boot-*
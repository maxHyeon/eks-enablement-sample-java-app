#!/bin/bash
set -x
./mvnw clean package -DskipTests
docker build . -f Dockerfile-fatjar -t boot-fatjar:1
docker images boot-*

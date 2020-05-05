#!/bin/bash
docker build -t convenios-service-rest:1.0 .
docker run -d -p 8085:8085 --name convenios-service convenios-service-rest:1.0
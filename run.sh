#!/bin/sh
#newthings
docker run --name newway_1 -v database:/var/lib/postgresql/data -p 5432:5432 -e POSTGRES_PASSWORD=1234 -e POSTGRES_DB=newway -d postgres

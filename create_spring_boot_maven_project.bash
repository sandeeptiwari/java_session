#!/usr/bin/env bash

cd socitigo

spring init \
--boot-version=2.7.1 \
--build=gradle \
--java-version=11 \
--packaging=jar \
--name=authservice \
--package-name=com.cloud4u.socitigo \
--groupId=com.cloud4u.socitigo \
--dependencies=actuator,web \
--version=1.0.0-SNAPSHOT \
 authservice
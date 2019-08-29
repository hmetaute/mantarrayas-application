#!/bin/sh

psql -h localhost -U postgres -p 5432 << EOF
CREATE DATABASE mantarrayas;
CREATE USER schema_user WITH PASSWORD 'devpwd';
GRANT ALL PRIVILEGES ON DATABASE "mantarrayas" to schema_user; \
GRANT ALL ON SCHEMA public TO schema_user; \
GRANT ALL ON ALL TABLES IN SCHEMA public TO schema_user;
create extension "uuid-ossp";
EOF

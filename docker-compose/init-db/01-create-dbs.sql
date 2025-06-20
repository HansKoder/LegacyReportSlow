-- Create DBS needs

CREATE USER montecello_user WITH PASSWORD 'montecello_pass';
CREATE DATABASE montecello OWNER montecello_user;

CREATE USER azurry_user WITH PASSWORD 'azurry_pass';
CREATE DATABASE azurry OWNER azurry_user;

CREATE USER castle_user WITH PASSWORD 'castle_pass';
CREATE DATABASE castle OWNER castle_user;

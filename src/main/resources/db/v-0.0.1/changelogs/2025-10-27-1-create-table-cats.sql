--liquibase formatted sql

--changeset nkokunin:2025102770-create-table-cats

CREATE TABLE IF NOT EXISTS cats
(
    id UUID PRIMARY KEY,
    name VARCHAR(32) NOT NULL UNIQUE,
    created_at TIMESTAMP WITH TIME ZONE
);


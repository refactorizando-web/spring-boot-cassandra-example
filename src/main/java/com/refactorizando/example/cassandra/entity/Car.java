package com.refactorizando.example.cassandra.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Getter
@Setter
public class Car {
    @PrimaryKey
    private UUID id;

    private String model;

    private String description;

    private String color;

}
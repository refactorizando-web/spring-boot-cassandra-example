package com.refactorizando.example.cassandra.repository;

import com.refactorizando.example.cassandra.entity.Car;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends CassandraRepository<Car, UUID> {
    List<Car> findByModel(String model);
}
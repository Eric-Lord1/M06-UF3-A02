package com.example.act2.Repositoris;

import org.springframework.stereotype.Repository;

import com.example.act2.Model.Coches;

import reactor.core.publisher.Flux;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Repository
@EnableReactiveMongoRepositories
public interface CochesRepo extends ReactiveMongoRepository<Coches, String> {

    @Query("{ 'marca': { $regex: ?0, $options: 'i' } }")
    Flux<Coches> findByMarcaRegex(String regex);

}

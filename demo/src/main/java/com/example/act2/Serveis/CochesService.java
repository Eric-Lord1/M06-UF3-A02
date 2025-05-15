package com.example.act2.Serveis;

import reactor.core.publisher.Mono;

import com.example.act2.DTO.CochesDTO;
import com.example.act2.Model.Coches;

import reactor.core.publisher.Flux;

public interface CochesService {

    Mono<Coches> save(CochesDTO cochesDTO);

    Mono<Coches> findById(String id);

    Flux<Coches> findAll();

    Mono<Coches> update(CochesDTO cochesDTO);

    Mono<Void> delete(String id);

    Flux<Coches> findByMarca(String regex);
}


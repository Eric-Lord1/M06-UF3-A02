package com.example.act2.Serveis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.act2.DTO.CochesDTO;
import com.example.act2.Mapper.CochesMapper;
import com.example.act2.Model.Coches;
import com.example.act2.Repositoris.CochesRepo;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class CochesServiceImpl implements CochesService {

    private final CochesRepo cochesRepo;
    private final CochesMapper cochesMapper;

    @Autowired
    public CochesServiceImpl(CochesRepo cochesRepo, CochesMapper cochesMapper) {
        this.cochesRepo = cochesRepo;
        this.cochesMapper = cochesMapper;
    }

    @Override
    public Mono<Coches> save(CochesDTO cochesDTO) {
        Coches coches = cochesMapper.toCoches(cochesDTO);
        return cochesRepo.save(coches);
    }

    @Override
    public Mono<Coches> findById(String id) {
        return cochesRepo.findById(id);
    }

    @Override
    public Flux<Coches> findAll() {
        return cochesRepo.findAll();
    }

    @Override
    public Mono<Coches> update(CochesDTO cochesDTO) {
        return cochesRepo.findById(cochesDTO.matricula()) // Usamos 'matricula' como clave única alternativa
            .map(existing -> cochesMapper.toCoches(cochesDTO))
            .flatMap(cochesRepo::save);
    }

    @Override
    public Mono<Void> delete(String id) {
        return cochesRepo.deleteById(id);
    }

}


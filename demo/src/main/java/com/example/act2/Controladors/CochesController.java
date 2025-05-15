package com.example.act2.Controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.act2.DTO.CochesDTO;
import com.example.act2.Model.Coches;
import com.example.act2.Serveis.CochesService;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api/v1/coches")
public class CochesController {

    private final CochesService cochesService;

    @Autowired
    public CochesController(CochesService cochesService) {
        this.cochesService = cochesService;
    }

    @PostMapping("/save")
    public Mono<Coches> save(@RequestBody CochesDTO cochesDTO) {
        return cochesService.save(cochesDTO);
    }

    @GetMapping("/{id}")
    public Mono<Coches> findById(@PathVariable String id) {
        return cochesService.findById(id);
    }

    @GetMapping("/all")
    public Flux<Coches> findAll() {
        return cochesService.findAll();
    }

    @PutMapping("/update")
    public Mono<Coches> update(@RequestBody CochesDTO cochesDTO) {
        return cochesService.update(cochesDTO);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return cochesService.delete(id);
    }
}


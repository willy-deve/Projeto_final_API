package com.projetofinalapi.controller;

import com.projetofinalapi.entities.Recados;
import com.projetofinalapi.services.RecadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recados")
@CrossOrigin("*")
public class RecadosController {

    @Autowired
    private RecadosService service;



    @GetMapping("/all")
    public ResponseEntity<List<Recados>> findAll(){
        List<Recados> recados = service.findAll();
        return ResponseEntity.ok().body(recados);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Recados> findById(@PathVariable("id") Integer id){
        Recados recados = service.findById(id);
        return ResponseEntity.ok(recados);

    }

    @PostMapping
    public String save(@RequestBody Recados recados){
        service.save(recados);
        return "Recado salvo com sucesso";
    }

    @PutMapping("/{id}")
    public String uptdade(@PathVariable("id") Integer id, @RequestBody Recados recados){
        service.update(id, recados);
        return "Atualizado com sucesso";

    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id){
        service.delete(id);
        return "Apagado com sucesso";
    }


}

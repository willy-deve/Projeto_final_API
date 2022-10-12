package com.projetofinalapi.controller;

import com.projetofinalapi.entities.Recados;
import com.projetofinalapi.services.RecadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recados")
//@CrossOrigin("*")
@CrossOrigin()
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
    public ResponseEntity<Recados> save(@RequestBody Recados recados) {
        Recados r = service.save(recados);
        return ResponseEntity.ok().body(r);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Recados> uptdade(@PathVariable("id") Integer id, @RequestBody Recados recados){
       Recados r = service.update(id, recados);
        return ResponseEntity.ok().body(r);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id){
        service.delete(id);
        return "Apagado com sucesso";
    }


}

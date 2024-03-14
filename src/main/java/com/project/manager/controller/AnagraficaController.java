package com.project.manager.controller;

import com.project.manager.dto.AnagraficaDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.service.AnagraficaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/anagrafica", produces = {MediaType.APPLICATION_JSON_VALUE, "application/hal+json"})
public class AnagraficaController {

    private AnagraficaService anagraficaService;

    private final static Logger logger = LoggerFactory.getLogger("AnagraficaController");

    public AnagraficaController(AnagraficaService anagraficaService) {
        this.anagraficaService = anagraficaService;
    }

    @GetMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Anagrafica> getAnagricaById(@PathVariable(value = "id") @NotNull Long id){
        Anagrafica anag = null;
        try {
            anag = anagraficaService.getAnagraficaById(id);
            return new ResponseEntity<>(anag, HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping(
            path = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Anagrafica> createAnagrafica(@RequestBody(required = true) AnagraficaDto anagrafica ){
        Anagrafica anag = null;
        try {
            anag = anagraficaService.createAnagrafica(anagrafica);
            return new ResponseEntity<>(anag, HttpStatus.CREATED);
        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(
            path = "/update",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Anagrafica> updateAnagrafica(@RequestBody(required = true) AnagraficaDto anagrafica ){
        Anagrafica anag = null;
        try {
            anag = anagraficaService.updateAnagrafica(anagrafica);
            return new ResponseEntity<>(anag, HttpStatus.CREATED);
        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Anagrafica>> getAll(){
        return ResponseEntity.ok(anagraficaService.getAll());
    }
    @DeleteMapping(
            path = "/delete/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> deleteAnagrafica(@PathVariable(name = "id") @NotNull Long id){
        try {
            anagraficaService.deleteAnagraficaByid(id);
        } catch (Exception ex){
            logger.error(ex.getMessage());
        }
        return null;
    }

}

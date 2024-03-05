package com.project.manager.controller;

import com.project.manager.entity.*;
import com.project.manager.repository.OffertaLiquidoRepository;
import com.project.manager.service.OffertaAnalisiService;
import com.project.manager.service.OffertaLiquidoService;
import com.project.manager.service.OffertaSmaltimentoService;
import com.project.manager.service.OffertaSolidaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/offerta", produces = {MediaType.APPLICATION_JSON_VALUE, "application/hal+json"})
public class OffertaController {

    private static final Logger logger = LoggerFactory.getLogger("OffertaController");
    private OffertaAnalisiService offertaAnalisiService;
    private OffertaSmaltimentoService offertaSmaltimentoService;
    private OffertaSolidaService offertaSolidaService;
    private OffertaLiquidoService offertaLiquidoService;

    public OffertaController(OffertaAnalisiService offertaAnalisiService, OffertaSmaltimentoService offertaSmaltimentoService, OffertaSolidaService offertaSolidaService, OffertaLiquidoService offertaLiquidoService) {
        this.offertaAnalisiService = offertaAnalisiService;
        this.offertaSmaltimentoService = offertaSmaltimentoService;
        this.offertaSolidaService = offertaSolidaService;
        this.offertaLiquidoService = offertaLiquidoService;
    }

    @GetMapping(
            path = "/analisi",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaAnalisi>> getOffertaAnalisi(){
        return new ResponseEntity<>(offertaAnalisiService.getAll(), HttpStatus.OK);
    }
    @GetMapping(
            path = "/smaltimento",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaSmaltimento>> getOffertaSmaltimento(){
        return new ResponseEntity<>(offertaSmaltimentoService.getAll(), HttpStatus.OK);
    }
    @GetMapping(
            path = "/solido",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaSolido>> getOffertaSolido(){
        return new ResponseEntity<>(offertaSolidaService.getAll(), HttpStatus.OK);
    }
    @GetMapping(
            path = "/liquido",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaLiquido>> getOffertaLiquido(){
        return new ResponseEntity<>(offertaLiquidoService.getAll(), HttpStatus.OK);
    }

    @GetMapping(
        path = "/analisi/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaAnalisi> getOffertaAnalisiById(@PathVariable(name = "id")Long id){
        try{
            return new ResponseEntity<>(offertaAnalisiService.getOffertaAnalisiById(id), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }         
    }

    @GetMapping(
        path = "/analisi/anag",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaAnalisi>> getOffertaAnalisiByAnagId(@RequestBody Anagrafica anagrafica){
        try{
            return new ResponseEntity<>(offertaAnalisiService.getOffertaAnalisiByAnagId(anagrafica), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }         
    }

    @GetMapping(
        path = "/analisi/{cf}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaAnalisi>> getOffertaAnalisiByCF(@PathVariable(name = "cf") String cf){
        try{
            return new ResponseEntity<>(offertaAnalisiService.getOffertaAnalisiByCF(cf), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }         
    }

    @DeleteMapping(
        path = "/analisi/{id}",
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> deleteOffertaAnalisibyId(@PathVariable(name = "id") Long id){
        try{
            offertaAnalisiService.deleteOffertaAnalisiById(id);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
        }
        return null;         
    }

    @PostMapping(
        path = "/analisi",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaAnalisi> createOffertaAnalisi(@RequestBody @NonNull OffertaAnalisi offertaAnalisi){
        try{
            return new ResponseEntity<>(offertaAnalisiService.createOffertaAnalisi(offertaAnalisi), HttpStatus.CREATED);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }         
    }

    @PutMapping(
        path = "/analisi",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaAnalisi> updateOffertaAnalisi(@RequestBody @NonNull OffertaAnalisi offertaAnalisi){
        try{
            return new ResponseEntity<>(offertaAnalisiService.updateOffreAnalisi(offertaAnalisi), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }         
    }


    //------------------------Liquido

    @GetMapping(
            path = "/liquido/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaLiquido> getOffertaLiquidoById(@PathVariable(name = "id")Long id){
        try{
            return new ResponseEntity<>(offertaLiquidoService.getOffertaLiquidoById(id), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(
            path = "/liquido/anag",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaLiquido>> getOffertaLiquidoByAnagId(@RequestBody Anagrafica anagrafica){
        try{
            return new ResponseEntity<>(offertaLiquidoService.getOffertaLiquidoByAnagId(anagrafica), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(
            path = "/liquido/{cf}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaLiquido>> getOffertaLiquidoByCF(@PathVariable(name = "cf") String cf){
        try{
            return new ResponseEntity<>(offertaLiquidoService.getOffertaLiquidoByCF(cf), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(
            path = "/liquido/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> deleteOffertaLiquidobyId(@PathVariable(name = "id") Long id){
        try{
            offertaLiquidoService.deleteOffertaLiquidoById(id);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
        }
        return null;
    }

    @PostMapping(
            path = "/liquido",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaLiquido> createOffertaLiquido(@RequestBody @NonNull OffertaLiquido offertaLiquido){
        try{
            return new ResponseEntity<>(offertaLiquidoService.createOffertaLiquido(offertaLiquido), HttpStatus.CREATED);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(
            path = "/liquido",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaLiquido> updateOffertaLiquido(@RequestBody @NonNull OffertaLiquido offertaLiquido){
        try{
            return new ResponseEntity<>(offertaLiquidoService.updateOffertaLiquido(offertaLiquido), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //------------------------Smaltimento

    @GetMapping(
            path = "/smaltimento/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaSmaltimento> getOffertaSmaltimentoById(@PathVariable(name = "id")Long id){
        try{
            return new ResponseEntity<>(offertaSmaltimentoService.getOffertaSmaltimentoById(id), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(
            path = "/smaltimento/anag",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaSmaltimento>> getOffertaSmaltimentoByAnagId(@RequestBody @NonNull Anagrafica anagrafica){
        try{
            return new ResponseEntity<>(offertaSmaltimentoService.getOffertaSmaltimentoByAnagId(anagrafica), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(
            path = "/smaltimento/{cf}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaSmaltimento>> getOffertaSmaltimentoByCF(@PathVariable(name = "cf") String cf){
        try{
            return new ResponseEntity<>(offertaSmaltimentoService.getOffertaSmaltimentoByCF(cf), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(
            path = "/smaltimento/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> deleteOffertaSmaltimentoById(@PathVariable(name = "id") Long id){
        try{
            offertaSmaltimentoService.deleteOffertaSmaltimentoById(id);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
        }
        return null;
    }

    @PostMapping(
            path = "/smaltimento",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaSmaltimento> createOffertaSmaltimento(@RequestBody @NonNull OffertaSmaltimento offertaSmaltimento){
        try{
            return new ResponseEntity<>(offertaSmaltimentoService.createOffertaSmaltimentoo(offertaSmaltimento), HttpStatus.CREATED);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(
            path = "/smaltimento",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaSmaltimento> updateOffertaSmaltimento(@RequestBody @NonNull OffertaSmaltimento offertaSmaltimento){
        try{
            return new ResponseEntity<>(offertaSmaltimentoService.updateOffertaSmaltimento(offertaSmaltimento), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //------------------------Solido

    @GetMapping(
            path = "/solido/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaSolido> getOffertaSolidoById(@PathVariable(name = "id")Long id){
        try{
            return new ResponseEntity<>(offertaSolidaService.getOffertaSolidoById(id), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(
            path = "/solido/anag",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaSolido>> getOffertaSolidoByAnagId(@RequestBody @NonNull Anagrafica anagrafica){
        try{
            return new ResponseEntity<>(offertaSolidaService.getOffertaSolidoByAnagId(anagrafica), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(
            path = "/solido/{cf}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<OffertaSolido>> getOffertaSolidoByCF(@PathVariable(name = "cf") String cf){
        try{
            return new ResponseEntity<>(offertaSolidaService.getOffertaSolidoByCF(cf), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(
            path = "/solido/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Void> deleteOffertaSolidoById(@PathVariable(name = "id") Long id){
        try{
            offertaSolidaService.deleteOffertaSolidoById(id);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
        }
        return null;
    }

    @PostMapping(
            path = "/solido",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaSolido> createOffertaSmaltimento(@RequestBody @NonNull OffertaSolido offertaSolido){
        try{
            return new ResponseEntity<>(offertaSolidaService.createOffertaSolido(offertaSolido), HttpStatus.CREATED);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(
            path = "/solido",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<OffertaSolido> updateOffertaSolido(@RequestBody @NonNull OffertaSolido offertaSolido){
        try{
            return new ResponseEntity<>(offertaSolidaService.updateOffertaSolido(offertaSolido), HttpStatus.OK);
        } catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}  

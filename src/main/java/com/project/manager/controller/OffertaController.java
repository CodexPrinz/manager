package com.project.manager.controller;

import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.entity.OffertaSolido;
import com.project.manager.service.OffertaAnalisiService;
import com.project.manager.service.OffertaLiquidoService;
import com.project.manager.service.OffertaSmaltimentoService;
import com.project.manager.service.OffertaSolidaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/offerta", produces = {MediaType.APPLICATION_JSON_VALUE, "application/hal+json"})
public class OffertaController {

    private final static Logger logger = LoggerFactory.getLogger("OffertaController");
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
}

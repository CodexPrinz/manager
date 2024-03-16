package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.repository.AnagraficaRepository;
import com.project.manager.resource.AnagraficaResponse;
import com.project.manager.service.AnagraficaService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnagraficaServiceImpl implements AnagraficaService {

    private final static Logger logger =  LoggerFactory.getLogger(AnagraficaService.class);
    private ModelMapper mapper;

    private AnagraficaRepository anagraficaRepository;

    public AnagraficaServiceImpl(AnagraficaRepository anagraficaRepository) {
        this.anagraficaRepository = anagraficaRepository;
        this.mapper = new ModelMapper();
    }

    @Override
    public AnagraficaResponse getAnagraficaById(Long id) {
        Anagrafica anag = anagraficaRepository.findById(id).orElseThrow(() -> new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
        return mapper.map(anag, AnagraficaResponse.class);
    }

    @Override
    public List<AnagraficaResponse> getAnagraficabyCF(String cf) {
        List<Anagrafica> al = anagraficaRepository.findByCF(cf);
        List<AnagraficaResponse> ar = al.stream().map(a -> mapper.map(a, AnagraficaResponse.class)).toList();
        return ar;
    }


    @Override
    public List<AnagraficaResponse> getAnagraficaPIva(String pIva) {
        List<Anagrafica> al = anagraficaRepository.findByPIva(pIva);
        List<AnagraficaResponse> ar = al.stream().map(a -> mapper.map(a, AnagraficaResponse.class)).toList();
        return ar;
    }

    @Override
    public AnagraficaResponse createAnagrafica(AnagraficaDto anagrafica){
        mapper = new ModelMapper();
        Anagrafica anag = mapper.map(anagrafica, Anagrafica.class);
        Anagrafica a = anagraficaRepository.save(anag);
        return mapper.map(a, AnagraficaResponse.class);
    }

    @Override
    public AnagraficaResponse updateAnagrafica(AnagraficaDto anagrafica) {

        Optional<Anagrafica> optionalAnagrafica = anagraficaRepository.findById(anagrafica.getId());
        if (optionalAnagrafica.isPresent()){
            Anagrafica anagrafica1 =optionalAnagrafica.get();
            try {
                anagraficaRepository.save(anagrafica1);
                return mapper.map(anagrafica1, AnagraficaResponse.class);
            } catch (Exception ex){
                logger.error(ex.getMessage());
            }
        }
        return null;
    }

    @Override
    public void deleteAnagraficaByid(Long id) {
        Optional<Anagrafica> optionalAnagrafica = anagraficaRepository.findById(id);
        if (optionalAnagrafica.isPresent()){
            logger.info(optionalAnagrafica.get().toString());
            anagraficaRepository.deleteById(id);
        } else {
            logger.info(MessageConst.RECORD_DOES_NOT_EXIST+id);
        }
    }

    @Override
    public List<AnagraficaResponse> getAll() {
        List<Anagrafica> al = anagraficaRepository.findAll();
        List<AnagraficaResponse> ar = al.stream().map(a -> mapper.map(a, AnagraficaResponse.class)).toList();
        return ar;
    }
}

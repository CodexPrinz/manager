package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.Anagrafica;
import com.project.manager.repository.AnagraficaRepository;
import com.project.manager.service.AnagraficaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnagraficaServiceImpl implements AnagraficaService {

    private final static Logger logger =  LoggerFactory.getLogger(AnagraficaService.class);

    private AnagraficaRepository anagraficaRepository;

    public AnagraficaServiceImpl(AnagraficaRepository anagraficaRepository) {
        this.anagraficaRepository = anagraficaRepository;
    }

    @Override
    public Anagrafica getAnagraficaById(Long id) {
        return anagraficaRepository.findById(id).orElseThrow(() -> new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
    }

    @Override
    public List<Anagrafica> getAnagraficabyCF(String cf) {
        return anagraficaRepository.findByCF(cf);
    }


    @Override
    public List<Anagrafica> getAnagraficaPIva(String pIva) {
        return anagraficaRepository.findByPIva(pIva);
    }

    @Override
    public Anagrafica createAnagrafica(Anagrafica anagrafica){
        return anagraficaRepository.save(anagrafica);
    }

    @Override
    public Anagrafica updateAnagrafica(Anagrafica anagrafica) {
        Optional<Anagrafica> optionalAnagrafica = anagraficaRepository.findById(anagrafica.getId());
        if (optionalAnagrafica.isPresent()){
            Anagrafica anagrafica1 = optionalAnagrafica.get();
            anagrafica1.setAbi(optionalAnagrafica.get().getAbi());
            anagrafica1.setCab(optionalAnagrafica.get().getCab());
            anagrafica1.setBanca(optionalAnagrafica.get().getBanca());
            anagrafica1.setEmail(optionalAnagrafica.get().getEmail());
            anagrafica1.setCodiceAteco(optionalAnagrafica.get().getCodiceAteco());
            anagrafica1.setCodiceFiscale(optionalAnagrafica.get().getCodiceFiscale());
            // TODO: find out the modifiable fields
            try {
                anagraficaRepository.save(anagrafica1);
                return anagrafica1;
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
    public List<Anagrafica> getAll() {
        return anagraficaRepository.findAll();
    }
}

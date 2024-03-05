package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.repository.OffertaAnalisiRepository;
import com.project.manager.service.OffertaAnalisiService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OffertaAnalisiServiceImpl implements OffertaAnalisiService {

    private final static Logger logger = LoggerFactory.getLogger(OffertaAnalisiServiceImpl.class);

    private OffertaAnalisiRepository offertaAnalisiRepository;

    public OffertaAnalisiServiceImpl(OffertaAnalisiRepository offertaAnalisiRepository) {
        this.offertaAnalisiRepository = offertaAnalisiRepository;
    }

    @Override
    public OffertaAnalisi getOffertaAnalisiById(Long id) {
        return offertaAnalisiRepository.findById(id).orElseThrow(()-> new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
    }

    @Override
    public List<OffertaAnalisi> getOffertaAnalisiByAnagId(Anagrafica anagId) {
        return offertaAnalisiRepository.getOffertaAnalisiByAnagId(anagId.getId());
    }

    @Override
    public List<OffertaAnalisi> getOffertaAnalisiByCF(String cf) {
        return offertaAnalisiRepository.getOffertaAnalisiByCf(cf);
    }

    @Override
    public List<OffertaAnalisi> getOffertaAnalisiByPIva(String pIva) {
        return offertaAnalisiRepository.getOffertaAnalisiByPIva(pIva);
    }

    @Override
    public List<OffertaAnalisi> getAll() {
        return offertaAnalisiRepository.findAll();
    }

    @Override
    public OffertaAnalisi createOffertaAnalisi(OffertaAnalisi offertaAnalisi) {
        if (offertaAnalisi != null)
            offertaAnalisiRepository.save(offertaAnalisi);

        return offertaAnalisi;
    }

    @Override
    public void deleteOffertaAnalisiById(Long id) {
        Optional<OffertaAnalisi> oAnalisi = offertaAnalisiRepository.findById(id);
        if (oAnalisi.isPresent()){
            offertaAnalisiRepository.deleteById(id); // TODO: check out deleteAllById
        } else 
            logger.info("L'offerta con {} non esiste", id);
        
    }

    @Override
    public OffertaAnalisi updateOffreAnalisi(OffertaAnalisi newOffertaAnalisi) {
        Optional<OffertaAnalisi> oAnalisi = offertaAnalisiRepository.findById(newOffertaAnalisi.getId());
        if (oAnalisi.isPresent()){
            OffertaAnalisi offertaAnalisi = oAnalisi.get();
            //TODO: set new fields
            offertaAnalisiRepository.save(offertaAnalisi);
            return offertaAnalisi;
        }

        return null;
    }
    
}

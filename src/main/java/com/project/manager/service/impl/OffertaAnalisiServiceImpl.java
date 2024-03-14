package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaAnalisiDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.repository.OffertaAnalisiRepository;
import com.project.manager.resource.OffertaAnalisiResponse;
import com.project.manager.service.OffertaAnalisiService;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OffertaAnalisiServiceImpl implements OffertaAnalisiService {

    private final static Logger logger = LoggerFactory.getLogger(OffertaAnalisiServiceImpl.class);
    private ModelMapper mapper;
    private OffertaAnalisiRepository offertaAnalisiRepository;

    public OffertaAnalisiServiceImpl(OffertaAnalisiRepository offertaAnalisiRepository) {
        this.offertaAnalisiRepository = offertaAnalisiRepository;
    }

    @Override
    public OffertaAnalisiResponse getOffertaAnalisiById(Long id) {
        mapper = new ModelMapper();
        OffertaAnalisi o = offertaAnalisiRepository.findById(id).orElseThrow(()-> new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
        return mapper.map(o, OffertaAnalisiResponse.class);
    }

    @Override
    public List<OffertaAnalisiResponse> getOffertaAnalisiByAnagId(AnagraficaDto idAnag) {
        mapper = new ModelMapper();
        List<OffertaAnalisi> offertaAnalisiList = offertaAnalisiRepository.getOffertaAnalisiByAnagId(idAnag.getId());
        List<OffertaAnalisiResponse> list = offertaAnalisiList
                .stream()
                .map(o -> mapper.map(o, OffertaAnalisiResponse.class))
                .toList();
        return list;
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
    public OffertaAnalisiDto createOffertaAnalisi(OffertaAnalisiDto offertaAnalisi) {
        mapper = new ModelMapper();
        OffertaAnalisi offertaAnalisi1 = mapper.map(offertaAnalisi, OffertaAnalisi.class);
        if (offertaAnalisi != null)
            offertaAnalisiRepository.save(offertaAnalisi1);

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
    public OffertaAnalisiResponse updateOffreAnalisi(OffertaAnalisiDto newOffertaAnalisi) {
        mapper = new ModelMapper();
        OffertaAnalisi offertaAnalisi = mapper.map(newOffertaAnalisi, OffertaAnalisi.class);
        Optional<OffertaAnalisi> oAnalisi = offertaAnalisiRepository.findById(offertaAnalisi.getId());
        if (oAnalisi.isPresent()){
            OffertaAnalisi response = mapper.map(oAnalisi.get(), OffertaAnalisi.class);
            //TODO: set new fields
            offertaAnalisiRepository.save(offertaAnalisi);
            return mapper.map(oAnalisi.get(), OffertaAnalisiResponse.class);
        }

        return null;
    }
    
}

package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.repository.OffertaAnalisiRepository;
import com.project.manager.service.OffertaAnalisiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffertaAnalisiServiceImpl implements OffertaAnalisiService {

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
}

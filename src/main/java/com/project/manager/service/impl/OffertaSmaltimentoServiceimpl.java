package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.repository.OffertaSmaltimentoRepository;
import com.project.manager.service.OffertaSmaltimentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffertaSmaltimentoServiceimpl implements OffertaSmaltimentoService {

    private OffertaSmaltimentoRepository offertaSmaltimentoRepository;

    public OffertaSmaltimentoServiceimpl(OffertaSmaltimentoRepository offertaSmaltimentoRepository) {
        this.offertaSmaltimentoRepository = offertaSmaltimentoRepository;
    }

    @Override
    public OffertaSmaltimento getOffertaSmaltimentoById(Long id) {
        return offertaSmaltimentoRepository.findById(id).orElseThrow(()->new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
    }

    @Override
    public List<OffertaSmaltimento> getOffertaSmaltimentoByAnagId(Long anagId) {
        return offertaSmaltimentoRepository.getOffertaSmaltimentoByAnagId(anagId);
    }

    @Override
    public List<OffertaSmaltimento> getOffertaSmaltimentoByCF(String cf) {
        return offertaSmaltimentoRepository.getOffertaSmaltimentoByCf(cf);
    }

    @Override
    public List<OffertaSmaltimento> getOffertaSmaltimentoByPIva(String pIva) {
        return offertaSmaltimentoRepository.getOffertaSmaltimentoByPIva(pIva);
    }

    @Override
    public List<OffertaSmaltimento> getAll() {
        return offertaSmaltimentoRepository.findAll();
    }
}

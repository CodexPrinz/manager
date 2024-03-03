package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.OffertaSolido;
import com.project.manager.repository.OffertaSolidoRepository;
import com.project.manager.service.OffertaSolidaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffertaSolidaServiceImpl implements OffertaSolidaService {

    private OffertaSolidoRepository offertaSolidoRepository;

    public OffertaSolidaServiceImpl(OffertaSolidoRepository offertaSolidoRepository) {
        this.offertaSolidoRepository = offertaSolidoRepository;
    }

    @Override
    public OffertaSolido getOffertaSolidoById(Long id) {
        return offertaSolidoRepository.findById(id).orElseThrow(()->new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
    }

    @Override
    public List<OffertaSolido> getOffertaSolidoByPIva(String pIva) {
        return offertaSolidoRepository.getOffertaAnalisiByPIva(pIva);
    }

    @Override
    public List<OffertaSolido> getOffertaSolidoByCF(String cf) {
        return offertaSolidoRepository.getOffertaAnalisiByCf(cf);
    }

    @Override
    public List<OffertaSolido> getOffertaSolidoByAnagId(Long anagId) {
        return offertaSolidoRepository.getOffertaAnalisiByAnagId(anagId);
    }

    @Override
    public List<OffertaSolido> getAll() {
        return offertaSolidoRepository.findAll();
    }
}

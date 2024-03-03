package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.repository.OffertaLiquidoRepository;
import com.project.manager.service.OffertaLiquidoService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OffertaLiquidoServiceImpl implements OffertaLiquidoService {

    private OffertaLiquidoRepository offertaLiquidoRepository;

    public OffertaLiquidoServiceImpl(OffertaLiquidoRepository offertaLiquidoRepository) {
        this.offertaLiquidoRepository = offertaLiquidoRepository;
    }

    @Override
    public OffertaLiquido getOffertaLiquidoById(Long id) {
        return offertaLiquidoRepository.findById(id).orElseThrow(() -> new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
    }

    @Override
    public List<OffertaLiquido> getOffertaLiquidoByAnagId(Long anagId) {
        return offertaLiquidoRepository.getOffertaAnalisiByAnagId(anagId);
    }

    @Override
    public List<OffertaLiquido> getOffertaLiquidoByCF(String cf) {
        return offertaLiquidoRepository.getOffertaAnalisiByCf(cf);
    }

    @Override
    public List<OffertaLiquido> getOffertaAnalisiByPIva(String pIva) {
        return offertaLiquidoRepository.getOffertaAnalisiByPIva(pIva);
    }

    @Override
    public List<OffertaLiquido> getAll() {
        return offertaLiquidoRepository.findAll();
    }
}

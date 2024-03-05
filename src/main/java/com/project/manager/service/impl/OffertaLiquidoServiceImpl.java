package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.repository.OffertaLiquidoRepository;
import com.project.manager.service.OffertaLiquidoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<OffertaLiquido> getOffertaLiquidoByAnagId(Anagrafica anag) {
        return offertaLiquidoRepository.getOffertaLiquidoByAnagId(anag.getId());
    }

    @Override
    public List<OffertaLiquido> getOffertaLiquidoByCF(String cf) {
        return offertaLiquidoRepository.getOffertaLiquidoByCf(cf);
    }

    @Override
    public List<OffertaLiquido> getOffertaLiquidoByPIva(String pIva) {
        return offertaLiquidoRepository.getOffertaLiquidoByPIva(pIva);
    }

    @Override
    public List<OffertaLiquido> getAll() {
        return offertaLiquidoRepository.findAll();
    }

    @Override
    public void deleteOffertaLiquidoById(Long id) {
        offertaLiquidoRepository.deleteById(id);
    }

    @Override
    public OffertaLiquido createOffertaLiquido(OffertaLiquido offertaLiquido) {
        if (offertaLiquido != null)
            offertaLiquidoRepository.save(offertaLiquido);

        return offertaLiquido;
    }

    @Override
    public OffertaLiquido updateOffertaLiquido(OffertaLiquido newOffertaLiquido) {
        Optional<OffertaLiquido> oAnalisi = offertaLiquidoRepository.findById(newOffertaLiquido.getId());
        if (oAnalisi.isPresent()){
            OffertaLiquido offertaLiquido = oAnalisi.get();
            //TODO: set new fields
            offertaLiquidoRepository.save(offertaLiquido);
            return offertaLiquido;
        }
        return null;
    }
}

package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.entity.OffertaSolido;
import com.project.manager.repository.OffertaSolidoRepository;
import com.project.manager.service.OffertaSolidaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<OffertaSolido> getOffertaSolidoByAnagId(Anagrafica anag) {
        return offertaSolidoRepository.getOffertaAnalisiByAnagId(anag.getId());
    }

    @Override
    public List<OffertaSolido> getAll() {
        return offertaSolidoRepository.findAll();
    }

    @Override
    public void deleteOffertaSolidoById(Long id) {
        offertaSolidoRepository.deleteById(id);
    }

    @Override
    public OffertaSolido createOffertaSolido(OffertaSolido offertaSolido) {
        if (offertaSolido != null)
            offertaSolidoRepository.save(offertaSolido);

        return offertaSolido;
    }

    @Override
    public OffertaSolido updateOffertaSolido(OffertaSolido newOffertaSolido) {
        Optional<OffertaSolido> oAnalisi = offertaSolidoRepository.findById(newOffertaSolido.getId());
        if (oAnalisi.isPresent()){
            OffertaSolido offertaSolido = oAnalisi.get();
            //TODO: set new fields
            offertaSolidoRepository.save(offertaSolido);
            return offertaSolido;
        }
        return null;
    }
}

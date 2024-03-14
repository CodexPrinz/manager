package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaSolidoDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.entity.OffertaSolido;
import com.project.manager.repository.OffertaSolidoRepository;
import com.project.manager.resource.OffertaSolidoResponse;
import com.project.manager.service.OffertaSolidaService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OffertaSolidaServiceImpl implements OffertaSolidaService {

    private OffertaSolidoRepository offertaSolidoRepository;
    private ModelMapper mapper;

    public OffertaSolidaServiceImpl(OffertaSolidoRepository offertaSolidoRepository) {
        this.offertaSolidoRepository = offertaSolidoRepository;
        mapper = new ModelMapper();
    }

    @Override
    public OffertaSolidoResponse getOffertaSolidoById(Long id) {
        OffertaSolido o = offertaSolidoRepository.findById(id).orElseThrow(()->new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
        return mapper.map(o, OffertaSolidoResponse.class);
    }

    @Override
    public List<OffertaSolidoResponse> getOffertaSolidoByPIva(String pIva) {
        List ol = offertaSolidoRepository.getOffertaAnalisiByPIva(pIva);
        List rl = ol.stream().map(o->mapper.map(o, OffertaSolidoResponse.class)).toList();
        return rl;
    }

    @Override
    public List<OffertaSolidoResponse> getOffertaSolidoByCF(String cf) {
        List ol = offertaSolidoRepository.getOffertaAnalisiByCf(cf);
        List rl = ol.stream().map(o->mapper.map(o, OffertaSolidoResponse.class)).toList();
        return rl;
    }

    @Override
    public List<OffertaSolidoResponse> getOffertaSolidoByAnagId(AnagraficaDto anag) {
        List ol = offertaSolidoRepository.getOffertaAnalisiByAnagId(anag.getId());
        List rl = ol.stream().map(o->mapper.map(o, OffertaSolidoResponse.class)).toList();
        return rl;
    }

    @Override
    public List<OffertaSolidoResponse> getAll() {
        List ol = offertaSolidoRepository.findAll();
        List rl = ol.stream().map(o->mapper.map(o, OffertaSolidoResponse.class)).toList();
        return rl;
    }

    @Override
    public void deleteOffertaSolidoById(Long id) {
        offertaSolidoRepository.deleteById(id);
    }

    @Override
    public OffertaSolidoResponse createOffertaSolido(OffertaSolidoDto offertaSolido) {
        if (offertaSolido != null){
            OffertaSolido o = mapper.map(offertaSolido, OffertaSolido.class);
            offertaSolidoRepository.save(o);
        }
        return mapper.map(offertaSolido, OffertaSolidoResponse.class);
    }

    @Override
    public OffertaSolidoResponse updateOffertaSolido(OffertaSolidoDto newOffertaSolido) {
        Optional<OffertaSolido> oAnalisi = offertaSolidoRepository.findById(newOffertaSolido.getId());
        if (oAnalisi.isPresent()){
            OffertaSolido offertaSolido = mapper.map(oAnalisi.get(), OffertaSolido.class);
            //TODO: set new fields
            offertaSolidoRepository.save(offertaSolido);
            return mapper.map(offertaSolido, OffertaSolidoResponse.class);
        }
        return null;
    }
}

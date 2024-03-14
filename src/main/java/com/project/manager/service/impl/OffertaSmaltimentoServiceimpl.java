package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaSmaltimentoDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.repository.OffertaSmaltimentoRepository;
import com.project.manager.resource.OffertaSmaltimentoResponse;
import com.project.manager.service.OffertaSmaltimentoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OffertaSmaltimentoServiceimpl implements OffertaSmaltimentoService {

    private OffertaSmaltimentoRepository offertaSmaltimentoRepository;
    private ModelMapper mapper;

    public OffertaSmaltimentoServiceimpl(OffertaSmaltimentoRepository offertaSmaltimentoRepository) {
        this.offertaSmaltimentoRepository = offertaSmaltimentoRepository;
    }

    @Override
    public OffertaSmaltimentoResponse getOffertaSmaltimentoById(Long id) {
        OffertaSmaltimento o = offertaSmaltimentoRepository.findById(id).orElseThrow(()->new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
        mapper = new ModelMapper();
        return mapper.map(o, OffertaSmaltimentoResponse.class);
    }

    @Override
    public List<OffertaSmaltimentoResponse> getOffertaSmaltimentoByAnagId(AnagraficaDto anag) {
        mapper = new ModelMapper();
        List ol = offertaSmaltimentoRepository.getOffertaSmaltimentoByAnagId(anag.getId());
        List rl = ol.stream().map(o -> mapper.map(o, OffertaSmaltimentoResponse.class)).toList();
        return rl;
    }

    @Override
    public List<OffertaSmaltimentoResponse> getOffertaSmaltimentoByCF(String cf) {
        mapper = new ModelMapper();
        List ol = offertaSmaltimentoRepository.getOffertaSmaltimentoByCf(cf);
        List rl = ol.stream().map(o->mapper.map(o, OffertaSmaltimentoResponse.class)).toList();
        return rl;

    }

    @Override
    public List<OffertaSmaltimentoResponse> getOffertaSmaltimentoByPIva(String pIva) {
        mapper = new ModelMapper();
        List ol =  offertaSmaltimentoRepository.getOffertaSmaltimentoByPIva(pIva);
        List rl = ol.stream().map(o->mapper.map(o, OffertaSmaltimentoResponse.class)).toList();
        return rl;
    }

    @Override
    public List<OffertaSmaltimentoResponse> getAll() {
        mapper = new ModelMapper();
        List ol =   offertaSmaltimentoRepository.findAll();
        List rl = ol.stream().map(o->mapper.map(o, OffertaSmaltimentoResponse.class)).toList();
        return rl;
    }

    @Override
    public void deleteOffertaSmaltimentoById(Long id) {
        offertaSmaltimentoRepository.deleteById(id);
    }

    @Override
    public OffertaSmaltimentoResponse createOffertaSmaltimentoo(OffertaSmaltimentoDto offertaSmaltimento) {
        mapper = new ModelMapper();
        if (offertaSmaltimento != null) {
            OffertaSmaltimento o = mapper.map(offertaSmaltimento, OffertaSmaltimento.class);
            offertaSmaltimentoRepository.save(o);
        }
        return mapper.map(offertaSmaltimento, OffertaSmaltimentoResponse.class);
    }

    @Override
    public OffertaSmaltimentoResponse updateOffertaSmaltimento(OffertaSmaltimentoDto newOffertaSmaltimento) {
        mapper = new ModelMapper();
        Optional<OffertaSmaltimento> oAnalisi = offertaSmaltimentoRepository.findById(newOffertaSmaltimento.getId());
        if (oAnalisi.isPresent()){
            OffertaSmaltimento offertaSmaltimento = mapper.map(oAnalisi.get(), OffertaSmaltimento.class);

            offertaSmaltimentoRepository.save(offertaSmaltimento);
            return mapper.map(newOffertaSmaltimento, OffertaSmaltimentoResponse.class);
        }
        return null;
    }
}

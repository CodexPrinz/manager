package com.project.manager.service.impl;

import com.project.manager.constants.MessageConst;
import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaLiquidoDto;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.repository.OffertaLiquidoRepository;
import com.project.manager.resource.OffertaLiquidoResponse;
import com.project.manager.service.OffertaLiquidoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OffertaLiquidoServiceImpl implements OffertaLiquidoService {

    private OffertaLiquidoRepository offertaLiquidoRepository;
    private ModelMapper mapper;

    public OffertaLiquidoServiceImpl(OffertaLiquidoRepository offertaLiquidoRepository) {
        this.offertaLiquidoRepository = offertaLiquidoRepository;
    }

    @Override
    public OffertaLiquidoResponse getOffertaLiquidoById(Long id) {
        mapper = new ModelMapper();
        OffertaLiquido of = offertaLiquidoRepository.findById(id).orElseThrow(() -> new RuntimeException(MessageConst.RECORD_DOES_NOT_EXIST+id));
        return mapper.map(of, OffertaLiquidoResponse.class);
    }

    @Override
    public List<OffertaLiquidoResponse> getOffertaLiquidoByAnagId(AnagraficaDto anag) {
        List<OffertaLiquido> oList = offertaLiquidoRepository.getOffertaLiquidoByAnagId(anag.getId());
        mapper = new ModelMapper();
        List rList = oList.stream().map(o -> mapper.map(o, OffertaLiquidoResponse.class)).toList();
        return rList;
    }

    @Override
    public List<OffertaLiquidoResponse> getOffertaLiquidoByCF(String cf) {
        List offList = offertaLiquidoRepository.getOffertaLiquidoByCf(cf);
        List rList = offList.stream().map(o -> mapper.map(o, OffertaLiquidoResponse.class)).toList();
        return rList;
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
    public OffertaLiquidoResponse createOffertaLiquido(OffertaLiquidoDto offertaLiquido) {
        mapper = new ModelMapper();
        if (offertaLiquido != null){
            OffertaLiquido o =mapper.map(offertaLiquido, OffertaLiquido.class);
            offertaLiquidoRepository.save(o);
        }

        return mapper.map(offertaLiquido, OffertaLiquidoResponse.class);
    }

    @Override
    public OffertaLiquidoResponse updateOffertaLiquido(OffertaLiquidoDto newOffertaLiquido) {
        mapper = new ModelMapper();
        Optional<OffertaLiquido> oAnalisi = offertaLiquidoRepository.findById(newOffertaLiquido.getId());
        if (oAnalisi.isPresent()){
            OffertaLiquido o = mapper.map(oAnalisi.get(), OffertaLiquido.class);
            offertaLiquidoRepository.save(o);
            return mapper.map(newOffertaLiquido, OffertaLiquidoResponse.class);
        }
        return null;
    }
}

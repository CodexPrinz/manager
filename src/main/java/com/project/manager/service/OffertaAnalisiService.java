package com.project.manager.service;

import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaAnalisiDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.resource.OffertaAnalisiResponse;

import java.util.List;

public interface OffertaAnalisiService {

    OffertaAnalisiResponse getOffertaAnalisiById(Long id);
    List<OffertaAnalisiResponse> getOffertaAnalisiByAnagId(AnagraficaDto anagId);

    List<OffertaAnalisi> getOffertaAnalisiByCF(String cf);

    List<OffertaAnalisi> getOffertaAnalisiByPIva(String pIva);

    List<OffertaAnalisi> getAll();

    void deleteOffertaAnalisiById(Long id);
    OffertaAnalisiDto createOffertaAnalisi(OffertaAnalisiDto offertaAnalisi);
    OffertaAnalisiResponse updateOffreAnalisi(OffertaAnalisiDto offertaAnalisi);
}

package com.project.manager.service;

import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaAnalisi;

import java.util.List;

public interface OffertaAnalisiService {

    OffertaAnalisi getOffertaAnalisiById(Long id);
    List<OffertaAnalisi> getOffertaAnalisiByAnagId(Anagrafica anagId);

    List<OffertaAnalisi> getOffertaAnalisiByCF(String cf);

    List<OffertaAnalisi> getOffertaAnalisiByPIva(String pIva);

    List<OffertaAnalisi> getAll();

    void deleteoffertaAnalisiById(Long id);
    OffertaAnalisi createOffertaAnalisi(OffertaAnalisi offertaAnalisi);
    OffertaAnalisi updateOffreAnalisi(OffertaAnalisi offertaAnalisi);
}

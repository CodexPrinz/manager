package com.project.manager.service;

import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaAnalisi;
import com.project.manager.entity.OffertaLiquido;

import java.util.List;

public interface OffertaLiquidoService {

    OffertaLiquido getOffertaLiquidoById(Long id);
    List<OffertaLiquido> getOffertaLiquidoByAnagId(Anagrafica anag);

    List<OffertaLiquido> getOffertaLiquidoByCF(String cf);

    List<OffertaLiquido> getOffertaLiquidoByPIva(String pIva);
    List<OffertaLiquido> getAll();
    void deleteOffertaLiquidoById(Long id);
    OffertaLiquido createOffertaLiquido(OffertaLiquido offertaLiquido);
    OffertaLiquido updateOffertaLiquido(OffertaLiquido offertaLiquido);
}

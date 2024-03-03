package com.project.manager.service;

import com.project.manager.entity.OffertaLiquido;

import java.util.List;

public interface OffertaLiquidoService {

    OffertaLiquido getOffertaLiquidoById(Long id);
    List<OffertaLiquido> getOffertaLiquidoByAnagId(Long anagId);

    List<OffertaLiquido> getOffertaLiquidoByCF(String cf);

    List<OffertaLiquido> getOffertaAnalisiByPIva(String pIva);
    List<OffertaLiquido> getAll();
}

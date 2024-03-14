package com.project.manager.service;

import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaLiquidoDto;
import com.project.manager.entity.OffertaLiquido;
import com.project.manager.resource.OffertaLiquidoResponse;

import java.util.List;

public interface OffertaLiquidoService {

    OffertaLiquidoResponse getOffertaLiquidoById(Long id);
    List<OffertaLiquidoResponse> getOffertaLiquidoByAnagId(AnagraficaDto anag);

    List<OffertaLiquidoResponse> getOffertaLiquidoByCF(String cf);

    List<OffertaLiquido> getOffertaLiquidoByPIva(String pIva);
    List<OffertaLiquido> getAll();
    void deleteOffertaLiquidoById(Long id);
    OffertaLiquidoResponse createOffertaLiquido(OffertaLiquidoDto offertaLiquido);
    OffertaLiquidoResponse updateOffertaLiquido(OffertaLiquidoDto offertaLiquido);
}

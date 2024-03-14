package com.project.manager.service;

import com.project.manager.dto.AnagraficaDto;
import com.project.manager.dto.OffertaSolidoDto;
import com.project.manager.entity.Anagrafica;
import com.project.manager.entity.OffertaSmaltimento;
import com.project.manager.entity.OffertaSolido;
import com.project.manager.resource.OffertaSolidoResponse;

import java.util.List;

public interface OffertaSolidaService {
    OffertaSolidoResponse getOffertaSolidoById(Long id);
    List<OffertaSolidoResponse> getOffertaSolidoByPIva(String pIva);
    List<OffertaSolidoResponse> getOffertaSolidoByCF(String cf);
    List<OffertaSolidoResponse> getOffertaSolidoByAnagId(AnagraficaDto anag);
    List<OffertaSolidoResponse> getAll();
    void deleteOffertaSolidoById(Long id);
    OffertaSolidoResponse createOffertaSolido(OffertaSolidoDto offertaSolido);
    OffertaSolidoResponse updateOffertaSolido(OffertaSolidoDto offertaSolido);

}
